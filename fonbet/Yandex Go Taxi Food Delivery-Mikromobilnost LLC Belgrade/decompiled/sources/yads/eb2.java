package yads;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import defpackage.a081;
import defpackage.c071;
import defpackage.cp61;
import defpackage.gg81;
import defpackage.jl40;
import defpackage.jy31;
import defpackage.lh61;
import defpackage.tl61;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public final class eb2 extends BroadcastReceiver {
    public static final cp61 h = new cp61();
    public static volatile eb2 i;
    public final Context a;
    public final a081 b;
    public final tl61 c;
    public final lh61 d;
    public final WeakHashMap e;
    public final Object f;
    public za2 g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public eb2(Context context, Executor executor) {
        this(context, executor, r0, new tl61(context), new lh61());
        a081 a081Var = a081.g;
        if (a081Var == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
        }
    }

    public static final void a(eb2 eb2Var) {
        za2 za2Var;
        Context context = eb2Var.c.a;
        Object systemService = context.getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        Boolean valueOf = powerManager != null ? Boolean.valueOf(powerManager.isInteractive()) : null;
        if (valueOf != null ? valueOf.booleanValue() : true) {
            Object systemService2 = context.getSystemService("keyguard");
            KeyguardManager keyguardManager = systemService2 instanceof KeyguardManager ? (KeyguardManager) systemService2 : null;
            za2Var = keyguardManager != null ? keyguardManager.isKeyguardLocked() : false ? za2.b : za2.d;
        } else {
            za2Var = za2.c;
        }
        eb2Var.g = za2Var;
        Objects.toString(za2Var);
        try {
            eb2Var.d.getClass();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            int i2 = Build.VERSION.SDK_INT;
            Context context2 = eb2Var.a;
            if (i2 >= 33) {
                context2.registerReceiver(eb2Var, intentFilter, 2);
            } else {
                context2.registerReceiver(eb2Var, intentFilter);
            }
        } catch (Exception unused) {
        }
    }

    public final void b(c071 c071Var) {
        synchronized (this.f) {
            this.e.remove(c071Var);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        za2 za2Var;
        HashSet hashSet;
        synchronized (this.f) {
            try {
                za2 za2Var2 = this.g;
                String action = intent.getAction();
                za2 za2Var3 = jl40.l(action, "android.intent.action.SCREEN_OFF") ? za2.c : jl40.l(action, "android.intent.action.USER_PRESENT") ? za2.d : (this.g == za2.d || !jl40.l(action, "android.intent.action.SCREEN_ON")) ? this.g : za2.b;
                this.g = za2Var3;
                if (za2Var2 != za2Var3) {
                    Objects.toString(za2Var3);
                }
                za2Var = this.g;
                hashSet = new HashSet(this.e.keySet());
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((c071) it.next()).a(za2Var);
        }
    }

    public eb2(Context context, Executor executor, a081 a081Var, tl61 tl61Var, lh61 lh61Var) {
        this.a = context;
        this.b = a081Var;
        this.c = tl61Var;
        this.d = lh61Var;
        this.e = new WeakHashMap();
        this.f = new Object();
        this.g = za2.d;
        executor.execute(new jy31(21, this));
    }

    public final void a(c071 c071Var) {
        synchronized (this.f) {
            this.e.put(c071Var, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r3.g == yads.za2.d) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        boolean z;
        gg81 a = this.b.a(this.a);
        synchronized (this.f) {
            z = true;
            if (a != null) {
                try {
                    if (a.h) {
                        za2 za2Var = this.g;
                        if (za2Var != za2.b) {
                            if (za2Var == za2.d) {
                            }
                            z = false;
                        }
                    }
                } finally {
                }
            }
        }
        return z;
    }
}
