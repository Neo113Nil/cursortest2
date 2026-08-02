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
import c.C0540a;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class L implements Handler.Callback, ServiceConnection {

    /* renamed from: n, reason: collision with root package name */
    public final Context f348n;

    /* renamed from: u, reason: collision with root package name */
    public final Handler f349u;

    /* renamed from: v, reason: collision with root package name */
    public final HashMap f350v = new HashMap();

    /* renamed from: w, reason: collision with root package name */
    public HashSet f351w = new HashSet();

    public L(Context context) {
        this.f348n = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f349u = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(K k9) {
        boolean z6;
        ArrayDeque arrayDeque;
        boolean isLoggable = Log.isLoggable("NotifManCompat", 3);
        ComponentName componentName = k9.f343a;
        if (isLoggable) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + k9.f346d.size() + " queued tasks");
        }
        if (k9.f346d.isEmpty()) {
            return;
        }
        if (k9.f344b) {
            z6 = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f348n;
            boolean bindService = context.bindService(component, this, 33);
            k9.f344b = bindService;
            if (bindService) {
                k9.f347e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z6 = k9.f344b;
        }
        if (!z6 || k9.f345c == null) {
            b(k9);
            return;
        }
        while (true) {
            arrayDeque = k9.f346d;
            I i = (I) arrayDeque.peek();
            if (i == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Sending task " + i);
                }
                i.a(k9.f345c);
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
        b(k9);
    }

    public final void b(K k9) {
        Handler handler = this.f349u;
        ComponentName componentName = k9.f343a;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = k9.f347e;
        int i4 = i + 1;
        k9.f347e = i4;
        if (i4 <= 6) {
            int i6 = (1 << i) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i6 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i6);
            return;
        }
        StringBuilder sb = new StringBuilder("Giving up on delivering ");
        ArrayDeque arrayDeque = k9.f346d;
        sb.append(arrayDeque.size());
        sb.append(" tasks to ");
        sb.append(componentName);
        sb.append(" after ");
        sb.append(k9.f347e);
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
            I i4 = (I) message.obj;
            String string = Settings.Secure.getString(this.f348n.getContentResolver(), "enabled_notification_listeners");
            synchronized (M.f352c) {
                if (string != null) {
                    try {
                        if (!string.equals(M.f353d)) {
                            String[] split = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String str : split) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                                if (unflattenFromString != null) {
                                    hashSet2.add(unflattenFromString.getPackageName());
                                }
                            }
                            M.f354e = hashSet2;
                            M.f353d = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = M.f354e;
            }
            if (!hashSet.equals(this.f351w)) {
                this.f351w = hashSet;
                List<ResolveInfo> queryIntentServices = this.f348n.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
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
                    if (!this.f350v.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f350v.put(componentName2, new K(componentName2));
                    }
                }
                Iterator it2 = this.f350v.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        K k9 = (K) entry.getValue();
                        if (k9.f344b) {
                            this.f348n.unbindService(this);
                            k9.f344b = false;
                        }
                        k9.f345c = null;
                        it2.remove();
                    }
                }
            }
            for (K k10 : this.f350v.values()) {
                k10.f346d.add(i4);
                a(k10);
            }
        } else if (i == 1) {
            J j6 = (J) message.obj;
            ComponentName componentName3 = j6.f341a;
            IBinder iBinder = j6.f342b;
            K k11 = (K) this.f350v.get(componentName3);
            if (k11 != null) {
                int i6 = c.b.f5620n;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(c.c.f5621f0);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof c.c)) {
                        C0540a c0540a = new C0540a();
                        c0540a.f5619n = iBinder;
                        cVar = c0540a;
                    } else {
                        cVar = (c.c) queryLocalInterface;
                    }
                }
                k11.f345c = cVar;
                k11.f347e = 0;
                a(k11);
                return true;
            }
        } else if (i == 2) {
            K k12 = (K) this.f350v.get((ComponentName) message.obj);
            if (k12 != null) {
                if (k12.f344b) {
                    this.f348n.unbindService(this);
                    k12.f344b = false;
                }
                k12.f345c = null;
                return true;
            }
        } else {
            if (i != 3) {
                return false;
            }
            K k13 = (K) this.f350v.get((ComponentName) message.obj);
            if (k13 != null) {
                a(k13);
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
        this.f349u.obtainMessage(1, new J(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f349u.obtainMessage(2, componentName).sendToTarget();
    }
}
