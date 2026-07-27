package D;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import c.C0532a;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class M implements Handler.Callback, ServiceConnection {

    /* renamed from: n, reason: collision with root package name */
    public final Context f451n;

    /* renamed from: u, reason: collision with root package name */
    public final Handler f452u;

    /* renamed from: v, reason: collision with root package name */
    public final HashMap f453v = new HashMap();

    /* renamed from: w, reason: collision with root package name */
    public HashSet f454w = new HashSet();

    public M(Context context) {
        this.f451n = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f452u = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(L l9) {
        boolean z3;
        ArrayDeque arrayDeque;
        boolean isLoggable = Log.isLoggable("NotifManCompat", 3);
        ComponentName componentName = l9.f446a;
        if (isLoggable) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + l9.f449d.size() + " queued tasks");
        }
        if (l9.f449d.isEmpty()) {
            return;
        }
        if (l9.f447b) {
            z3 = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f451n;
            boolean bindService = context.bindService(component, this, 33);
            l9.f447b = bindService;
            if (bindService) {
                l9.f450e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z3 = l9.f447b;
        }
        if (!z3 || l9.f448c == null) {
            b(l9);
            return;
        }
        while (true) {
            arrayDeque = l9.f449d;
            J j6 = (J) arrayDeque.peek();
            if (j6 == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Sending task " + j6);
                }
                j6.a(l9.f448c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Remote service has died: " + componentName);
                }
            } catch (RemoteException e9) {
                Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e9);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(l9);
    }

    public final void b(L l9) {
        Handler handler = this.f452u;
        ComponentName componentName = l9.f446a;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = l9.f450e;
        int i6 = i + 1;
        l9.f450e = i6;
        if (i6 <= 6) {
            int i9 = (1 << i) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i9 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i9);
            return;
        }
        StringBuilder sb = new StringBuilder("Giving up on delivering ");
        ArrayDeque arrayDeque = l9.f449d;
        sb.append(arrayDeque.size());
        sb.append(" tasks to ");
        sb.append(componentName);
        sb.append(" after ");
        sb.append(l9.f450e);
        sb.append(" retries");
        Log.w("NotifManCompat", sb.toString());
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        c.c cVar = null;
        if (i == 0) {
            J j6 = (J) message.obj;
            String string = Settings.Secure.getString(this.f451n.getContentResolver(), "enabled_notification_listeners");
            synchronized (N.f455c) {
                if (string != null) {
                    try {
                        if (!string.equals(N.f456d)) {
                            String[] split = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String str : split) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                                if (unflattenFromString != null) {
                                    hashSet2.add(unflattenFromString.getPackageName());
                                }
                            }
                            N.f457e = hashSet2;
                            N.f456d = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = N.f457e;
            }
            if (!hashSet.equals(this.f454w)) {
                this.f454w = hashSet;
                List<ResolveInfo> queryIntentServices = this.f451n.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    ComponentName componentName2 = (ComponentName) it.next();
                    if (!this.f453v.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f453v.put(componentName2, new L(componentName2));
                    }
                }
                Iterator it2 = this.f453v.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        L l9 = (L) entry.getValue();
                        if (l9.f447b) {
                            this.f451n.unbindService(this);
                            l9.f447b = false;
                        }
                        l9.f448c = null;
                        it2.remove();
                    }
                }
            }
            for (L l10 : this.f453v.values()) {
                l10.f449d.add(j6);
                a(l10);
            }
        } else if (i == 1) {
            K k9 = (K) message.obj;
            ComponentName componentName3 = k9.f444a;
            IBinder iBinder = k9.f445b;
            L l11 = (L) this.f453v.get(componentName3);
            if (l11 != null) {
                int i6 = c.b.f5472n;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(c.c.f5473k0);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof c.c)) {
                        C0532a c0532a = new C0532a();
                        c0532a.f5471n = iBinder;
                        cVar = c0532a;
                    } else {
                        cVar = (c.c) queryLocalInterface;
                    }
                }
                l11.f448c = cVar;
                l11.f450e = 0;
                a(l11);
                return true;
            }
        } else if (i == 2) {
            L l12 = (L) this.f453v.get((ComponentName) message.obj);
            if (l12 != null) {
                if (l12.f447b) {
                    this.f451n.unbindService(this);
                    l12.f447b = false;
                }
                l12.f448c = null;
                return true;
            }
        } else {
            if (i != 3) {
                return false;
            }
            L l13 = (L) this.f453v.get((ComponentName) message.obj);
            if (l13 != null) {
                a(l13);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f452u.obtainMessage(1, new K(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f452u.obtainMessage(2, componentName).sendToTarget();
    }
}
