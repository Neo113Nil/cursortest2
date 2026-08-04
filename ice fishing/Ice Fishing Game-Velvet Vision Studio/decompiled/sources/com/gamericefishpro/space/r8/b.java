package com.gamericefishpro.space.r8;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.gamericefishpro.space.r9.o;
import com.gamericefishpro.space.t.r0;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static int h;
    public static PendingIntent i;
    public static final Pattern j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context b;
    public final com.gamericefishpro.space.n3.g c;
    public final ScheduledThreadPoolExecutor d;
    public Messenger f;
    public g g;
    public final r0 a = new r0(0);
    public final Messenger e = new Messenger(new e(this, Looper.getMainLooper()));

    public b(Context context) {
        this.b = context;
        this.c = new com.gamericefishpro.space.n3.g(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ce  */
    public final o a(Bundle bundle) {
        String string;
        synchronized (b.class) {
            int i2 = h;
            h = i2 + 1;
            string = Integer.toString(i2);
        }
        com.gamericefishpro.space.r9.h hVar = new com.gamericefishpro.space.r9.h();
        synchronized (this.a) {
            this.a.put(string, hVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.c.q() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.b;
        synchronized (b.class) {
            try {
                if (i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    i = PendingIntent.getBroadcast(context, 0, intent2, com.gamericefishpro.space.g9.a.a);
                }
                intent.putExtra("app", i);
            } catch (Throwable th) {
                throw th;
            }
        }
        intent.putExtra("kid", "|ID|" + string + "|");
        if (Log.isLoggable("Rpc", 3)) {
            "Sending ".concat(String.valueOf(intent.getExtras()));
        }
        intent.putExtra("google.messenger", this.e);
        if (this.f != null || this.g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    Messenger messenger2 = this.g.d;
                    messenger2.getClass();
                    messenger2.send(messageObtain);
                }
            } catch (RemoteException unused) {
                Log.isLoggable("Rpc", 3);
                if (this.c.q() == 2) {
                    this.b.sendBroadcast(intent);
                } else {
                    this.b.startService(intent);
                }
            }
        } else if (this.c.q() == 2) {
            this.b.sendBroadcast(intent);
        } else {
            this.b.startService(intent);
        }
        hVar.a.b(h.i, new com.gamericefishpro.space.r5.b(this, string, this.d.schedule(new com.gamericefishpro.space.h4.b(19, hVar), 30L, TimeUnit.SECONDS), 1));
        return hVar.a;
    }

    public final void b(String str, Bundle bundle) {
        synchronized (this.a) {
            try {
                com.gamericefishpro.space.r9.h hVar = (com.gamericefishpro.space.r9.h) this.a.remove(str);
                if (hVar != null) {
                    hVar.a(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
