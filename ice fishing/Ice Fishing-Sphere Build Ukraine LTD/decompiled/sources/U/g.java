package U;

import E0.q;
import android.content.Context;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;
import t0.C0250e;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ g f1032a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final C0250e f1033b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f1034c;

    static {
        q.a(h.class).b();
        f1033b = new C0250e(f.f1031f);
        f1034c = a.f1013a;
    }

    public static b a(Context context) {
        E0.i.e(context, "context");
        V.a aVar = (V.a) f1033b.a();
        if (aVar == null) {
            X.k kVar = X.k.f1076c;
            if (X.k.f1076c == null) {
                ReentrantLock reentrantLock = X.k.f1077d;
                reentrantLock.lock();
                try {
                    if (X.k.f1076c == null) {
                        X.i iVar = null;
                        try {
                            R.i c2 = X.g.c();
                            if (c2 != null) {
                                R.i iVar2 = R.i.f939j;
                                E0.i.e(iVar2, "other");
                                Object a2 = c2.f944i.a();
                                E0.i.d(a2, "<get-bigInteger>(...)");
                                Object a3 = iVar2.f944i.a();
                                E0.i.d(a3, "<get-bigInteger>(...)");
                                if (((BigInteger) a2).compareTo((BigInteger) a3) >= 0) {
                                    X.i iVar3 = new X.i(context);
                                    if (iVar3.i()) {
                                        iVar = iVar3;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        X.k.f1076c = new X.k(iVar);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            aVar = X.k.f1076c;
            E0.i.b(aVar);
        }
        int i2 = n.f1046b;
        b bVar = new b(aVar);
        f1034c.getClass();
        return bVar;
    }
}
