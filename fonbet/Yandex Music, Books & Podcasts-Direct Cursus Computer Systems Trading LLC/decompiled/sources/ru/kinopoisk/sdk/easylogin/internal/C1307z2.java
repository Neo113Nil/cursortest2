package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.l1j;
import defpackage.r7o;
import defpackage.swf;
import defpackage.t7o;
import defpackage.u9f;
import defpackage.w4f;
import defpackage.x3f;
import defpackage.z7o;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.M1;
import timber.log.Timber;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.z2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1307z2 implements InterfaceC1294y2 {

    @NotNull
    public final G3 a;

    @NotNull
    public final List<InterfaceC1281x2> b;

    @NotNull
    public final E1 c;
    public final N7 d;

    @NotNull
    public final ConcurrentHashMap<String, K1<?>> e;

    /* JADX WARN: Multi-variable type inference failed */
    public C1307z2(@NotNull G3 g3, @NotNull J1 j1, @NotNull List<? extends InterfaceC1281x2> list, @NotNull E1 e1, N7 n7) {
        g3.getClass();
        j1.getClass();
        list.getClass();
        e1.getClass();
        this.a = g3;
        this.b = list;
        this.c = e1;
        this.d = n7;
        this.e = new ConcurrentHashMap<>();
        l1j l1jVar = new l1j(7);
        j1.getClass();
        j1.a.add(l1jVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [t7o] */
    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1294y2
    @NotNull
    public final K1 a(@NotNull C3 c3) {
        K1 k1;
        K7 k7;
        K1 t7oVar;
        N7 n7;
        c3.getClass();
        if (!this.c.getConfigDescriptors().contains(c3) && (n7 = this.d) != null) {
            n7.a();
        }
        K1 k12 = this.a.get(c3);
        if (k12 != null) {
            return k12;
        }
        String key = c3.getKey();
        Iterator<InterfaceC1281x2> it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                k7 = null;
                break;
            }
            k7 = it.next().a(key);
            if (k7 != null) {
                break;
            }
        }
        if (k7 != null) {
            x3f x3fVar = L1.a;
            try {
                r7o r7oVar = z7o.b;
                u9f a = c3.a();
                w4f w4fVar = k7.a;
                x3fVar.getClass();
                a.getClass();
                w4fVar.getClass();
                t7oVar = x3fVar.a(swf.g0(x3fVar.b, a), w4fVar);
            } catch (Throwable th) {
                r7o r7oVar2 = z7o.b;
                t7oVar = new t7o(th);
            }
            Throwable a2 = z7o.a(t7oVar);
            if (a2 != null) {
                Timber.INSTANCE.tag("ConfigValueDecoder").e(a2, "Failed to parse config for key: %s, meta: %s", c3.getKey(), k7.b);
            }
            boolean z = t7oVar instanceof t7o;
            K1 k13 = t7oVar;
            if (!z) {
                k13 = new K1(t7oVar, k7.b);
            }
            k1 = k13 instanceof t7o ? null : k13;
        }
        if (k1 != null) {
            return k1;
        }
        Boolean b = c3.b();
        M1.a.getClass();
        return new K1(b, M1.a.b);
    }

    public static final void a(C1307z2 c1307z2) {
        c1307z2.e.clear();
    }
}
