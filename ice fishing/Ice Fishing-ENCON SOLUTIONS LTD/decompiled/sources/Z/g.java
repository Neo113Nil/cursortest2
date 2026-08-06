package Z;

import a0.InterfaceC0084a;
import android.content.Context;
import h1.C0237g;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.q;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ g f1939a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final C0237g f1940b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f1941c;

    static {
        q.a(h.class).b();
        f1940b = R1.d.y(f.f1938e);
        f1941c = a.f1920a;
    }

    public static b a(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        InterfaceC0084a interfaceC0084a = (InterfaceC0084a) f1940b.a();
        if (interfaceC0084a == null) {
            c0.k kVar = c0.k.f2654c;
            if (c0.k.f2654c == null) {
                ReentrantLock reentrantLock = c0.k.f2655d;
                reentrantLock.lock();
                try {
                    if (c0.k.f2654c == null) {
                        c0.i iVar = null;
                        try {
                            W.i c2 = c0.g.c();
                            if (c2 != null) {
                                W.i other = W.i.f1849f;
                                kotlin.jvm.internal.i.e(other, "other");
                                Object a2 = c2.f1854e.a();
                                kotlin.jvm.internal.i.d(a2, "<get-bigInteger>(...)");
                                Object a3 = other.f1854e.a();
                                kotlin.jvm.internal.i.d(a3, "<get-bigInteger>(...)");
                                if (((BigInteger) a2).compareTo((BigInteger) a3) >= 0) {
                                    c0.i iVar2 = new c0.i(context);
                                    if (iVar2.i()) {
                                        iVar = iVar2;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        c0.k.f2654c = new c0.k(iVar);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            interfaceC0084a = c0.k.f2654c;
            kotlin.jvm.internal.i.b(interfaceC0084a);
        }
        int i2 = m.f1951b;
        b bVar = new b(interfaceC0084a);
        f1941c.getClass();
        return bVar;
    }
}
