package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aij;
import defpackage.jij;
import defpackage.uif;
import defpackage.wvs;
import defpackage.xh2;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.A0;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0;

/* loaded from: classes5.dex */
public final class B0 {

    public static final class a extends uif implements Function1<List<? extends InterfaceC1305z0.a>, A0> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            List<InterfaceC1305z0.a> list = (List) obj;
            list.getClass();
            boolean z = list instanceof Collection;
            if (!z || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC1305z0.a) it.next()).e == InterfaceC1305z0.d.Connected) {
                        for (InterfaceC1305z0.a aVar : list) {
                            if (aVar.e == InterfaceC1305z0.d.Connected) {
                                return new A0.b(aVar);
                            }
                        }
                        wvs.h("Collection contains no element matching the predicate.");
                        return null;
                    }
                }
            }
            if (!z || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((InterfaceC1305z0.a) it2.next()).e == InterfaceC1305z0.d.Connecting) {
                        for (InterfaceC1305z0.a aVar2 : list) {
                            if (aVar2.e == InterfaceC1305z0.d.Connecting) {
                                return new A0.c(aVar2);
                            }
                        }
                        wvs.h("Collection contains no element matching the predicate.");
                        return null;
                    }
                }
            }
            return !list.isEmpty() ? new A0.a(list) : A0.d.a;
        }
    }

    @NotNull
    public static final aij a(@NotNull InterfaceC1305z0 interfaceC1305z0) {
        interfaceC1305z0.getClass();
        aij b = interfaceC1305z0.b();
        xh2 xh2Var = new xh2(a.a, 0);
        b.getClass();
        return new jij(b, xh2Var, 1);
    }

    public static final A0 a(Function1 function1, Object obj) {
        obj.getClass();
        return (A0) function1.invoke(obj);
    }
}
