package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aij;
import defpackage.bm5;
import defpackage.dm5;
import defpackage.hjj;
import defpackage.jij;
import defpackage.oij;
import defpackage.tot;
import defpackage.uif;
import defpackage.up6;
import java.util.List;
import kotlin.jvm.functions.Function1;
import ru.kinopoisk.sdk.easylogin.internal.A0;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0;
import ru.kinopoisk.sdk.easylogin.internal.T0;

/* loaded from: classes5.dex */
public final class X0 extends uif implements Function1<A0, hjj> {
    public final /* synthetic */ T0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X0(T0 t0) {
        super(1);
        this.a = t0;
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aij invoke(A0 a0) {
        bm5 a;
        aij a2;
        a0.getClass();
        F8.a(this.a.c, "CombinedCastPlayer", (String) null, new Object[]{"castDevicesState = " + a0}, 2);
        if (a0 instanceof A0.b) {
            this.a.e = null;
            a2 = this.a.a(((A0.b) a0).a().a());
            tot totVar = new tot(11, new W0(a0));
            a2.getClass();
            return new jij(a2, totVar, 1);
        }
        if (!(a0 instanceof A0.a)) {
            T0.b.C0037b c0037b = T0.b.C0037b.a;
            up6.L(c0037b, "item is null");
            return new oij(c0037b);
        }
        a = this.a.a((List<InterfaceC1305z0.a>) ((A0.a) a0).a());
        T0.b.C0037b c0037b2 = T0.b.C0037b.a;
        up6.L(c0037b2, "item is null");
        oij oijVar = new oij(c0037b2);
        a.getClass();
        return new dm5(0, a, oijVar);
    }

    public static final T0.b.a a(Function1 function1, Object obj) {
        obj.getClass();
        return (T0.b.a) function1.invoke(obj);
    }
}
