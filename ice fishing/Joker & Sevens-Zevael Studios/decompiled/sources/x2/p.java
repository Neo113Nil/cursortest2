package x2;

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
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class p implements Handler.Callback, ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8273a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f8274b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f8275c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public HashSet f8276d = new HashSet();

    public p(Context context) {
        this.f8273a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f8274b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(o oVar) {
        boolean z10;
        ArrayDeque arrayDeque = oVar.f8271d;
        ComponentName componentName = oVar.f8268a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (oVar.f8269b) {
            z10 = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f8273a;
            boolean bindService = context.bindService(component, this, 33);
            oVar.f8269b = bindService;
            if (bindService) {
                oVar.f8272e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z10 = oVar.f8269b;
        }
        if (!z10 || oVar.f8270c == null) {
            b(oVar);
            return;
        }
        while (true) {
            m mVar = (m) arrayDeque.peek();
            if (mVar == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Sending task " + mVar);
                }
                mVar.a(oVar.f8270c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Remote service has died: " + componentName);
                }
            } catch (RemoteException e10) {
                Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e10);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(oVar);
    }

    public final void b(o oVar) {
        ComponentName componentName = oVar.f8268a;
        ArrayDeque arrayDeque = oVar.f8271d;
        Handler handler = this.f8274b;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i10 = oVar.f8272e;
        int i11 = i10 + 1;
        oVar.f8272e = i11;
        if (i11 <= 6) {
            int i12 = (1 << i10) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i12 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i12);
            return;
        }
        Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + oVar.f8272e + " retries");
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i10 = message.what;
        c.c cVar = null;
        if (i10 == 0) {
            m mVar = (m) message.obj;
            String string = Settings.Secure.getString(this.f8273a.getContentResolver(), "enabled_notification_listeners");
            synchronized (q.f8277c) {
                if (string != null) {
                    try {
                        if (!string.equals(q.f8278d)) {
                            String[] split = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String str : split) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                                if (unflattenFromString != null) {
                                    hashSet2.add(unflattenFromString.getPackageName());
                                }
                            }
                            q.f8279e = hashSet2;
                            q.f8278d = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = q.f8279e;
            }
            if (!hashSet.equals(this.f8276d)) {
                this.f8276d = hashSet;
                List<ResolveInfo> queryIntentServices = this.f8273a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
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
                    if (!this.f8275c.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f8275c.put(componentName2, new o(componentName2));
                    }
                }
                Iterator it2 = this.f8275c.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        o oVar = (o) entry.getValue();
                        if (oVar.f8269b) {
                            this.f8273a.unbindService(this);
                            oVar.f8269b = false;
                        }
                        oVar.f8270c = null;
                        it2.remove();
                    }
                }
            }
            for (o oVar2 : this.f8275c.values()) {
                oVar2.f8271d.add(mVar);
                a(oVar2);
            }
        } else if (i10 == 1) {
            n nVar = (n) message.obj;
            ComponentName componentName3 = nVar.f8266a;
            IBinder iBinder = nVar.f8267b;
            o oVar3 = (o) this.f8275c.get(componentName3);
            if (oVar3 != null) {
                int i11 = c.b.f1172d;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(c.c.f1173c);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof c.c)) {
                        c.a aVar = new c.a();
                        aVar.f1171d = iBinder;
                        cVar = aVar;
                    } else {
                        cVar = (c.c) queryLocalInterface;
                    }
                }
                oVar3.f8270c = cVar;
                oVar3.f8272e = 0;
                a(oVar3);
                return true;
            }
        } else if (i10 == 2) {
            o oVar4 = (o) this.f8275c.get((ComponentName) message.obj);
            if (oVar4 != null) {
                if (oVar4.f8269b) {
                    this.f8273a.unbindService(this);
                    oVar4.f8269b = false;
                }
                oVar4.f8270c = null;
                return true;
            }
        } else {
            if (i10 != 3) {
                return false;
            }
            o oVar5 = (o) this.f8275c.get((ComponentName) message.obj);
            if (oVar5 != null) {
                a(oVar5);
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
        this.f8274b.obtainMessage(1, new n(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f8274b.obtainMessage(2, componentName).sendToTarget();
    }
}
