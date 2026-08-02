package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import defpackage.a581;
import defpackage.bl61;
import defpackage.f881;
import defpackage.g181;
import defpackage.kf71;
import defpackage.ot81;
import defpackage.pb81;
import defpackage.tcc;
import defpackage.te81;
import defpackage.va81;
import defpackage.w511;
import defpackage.yx71;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import kotlin.collections.a;
import kotlin.collections.b;

/* loaded from: classes7.dex */
public final class q53 extends Handler {
    public final yx71 a;

    public q53(yx71 yx71Var) {
        super(Looper.getMainLooper());
        this.a = yx71Var;
    }

    public final void a(kf71 kf71Var, ot81 ot81Var, f881 f881Var) {
        long elapsedRealtime;
        Long l = kf71Var.e;
        if (l != null) {
            elapsedRealtime = l.longValue();
        } else {
            elapsedRealtime = SystemClock.elapsedRealtime();
            kf71Var.e = Long.valueOf(elapsedRealtime);
        }
        if (SystemClock.elapsedRealtime() - elapsedRealtime >= kf71Var.b) {
            sendMessage(Message.obtain(this, 1, new g181(new WeakReference(ot81Var), kf71Var, f881Var)));
        }
        if (!ot81Var.j) {
            ot81Var.j = true;
            bl61 bl61Var = ot81Var.i;
            if (bl61Var != null) {
                bl61Var.c();
            }
        }
        this.a.b(kf71Var.d, f881Var);
    }

    public final void b() {
        removeMessages(2);
        removeMessages(1);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        q63 q63Var;
        ot81 ot81Var;
        int i = message.what;
        if (i != 1) {
            if (i == 2 && (ot81Var = (ot81) ((WeakReference) message.obj).get()) != null) {
                List<kf71> J0 = a.J0(ot81Var.l);
                J0.size();
                int i2 = Integer.MIN_VALUE;
                for (kf71 kf71Var : J0) {
                    int i3 = kf71Var.c;
                    if (i3 > i2) {
                        va81 va81Var = (va81) ot81Var.c.b;
                        te81 e = va81Var.d.e(va81Var.a, i3, false);
                        Objects.toString(e);
                        if (e instanceof f881) {
                            i2 = kf71Var.c;
                            a(kf71Var, ot81Var, (f881) e);
                        } else if (e instanceof a581) {
                            kf71Var.e = null;
                            this.a.a(kf71Var.d, (a581) e);
                        }
                    } else {
                        a(kf71Var, ot81Var, new f881());
                    }
                }
                if (J0.isEmpty()) {
                    return;
                }
                sendMessageDelayed(Message.obtain(this, 2, new WeakReference(ot81Var)), 200L);
                return;
            }
            return;
        }
        g181 g181Var = (g181) message.obj;
        kf71 kf71Var2 = g181Var.b;
        yw2 yw2Var = kf71Var2.d;
        ot81 ot81Var2 = (ot81) g181Var.a.get();
        if (ot81Var2 != null) {
            ArrayList arrayList = ot81Var2.l;
            int ordinal = yw2Var.ordinal();
            if (ordinal == 0) {
                q63Var = q63.e;
            } else if (ordinal == 1) {
                q63Var = q63.f;
            } else {
                if (ordinal != 2) {
                    w511.b();
                    return;
                }
                q63Var = q63.k;
            }
            pb81 pb81Var = ot81Var2.e;
            String str = kf71Var2.a;
            ExecutorService executorService = pb81.d;
            pb81Var.a(str, q63Var, b.f());
            arrayList.remove(kf71Var2);
            if (!ot81Var2.k && arrayList.isEmpty()) {
                ot81Var2.k = true;
                bl61 bl61Var = ot81Var2.i;
                if (bl61Var != null) {
                    bl61Var.g();
                }
            }
            yx71 yx71Var = this.a;
            List J02 = a.J0(arrayList);
            ArrayList arrayList2 = new ArrayList(tcc.n(J02, 10));
            Iterator it = J02.iterator();
            while (it.hasNext()) {
                arrayList2.add(((kf71) it.next()).d);
            }
            yx71Var.d(yw2Var, arrayList2, g181Var.c);
        }
    }

    public final boolean a() {
        return hasMessages(2);
    }

    public final void a(ot81 ot81Var) {
        sendMessage(Message.obtain(this, 2, new WeakReference(ot81Var)));
    }
}
