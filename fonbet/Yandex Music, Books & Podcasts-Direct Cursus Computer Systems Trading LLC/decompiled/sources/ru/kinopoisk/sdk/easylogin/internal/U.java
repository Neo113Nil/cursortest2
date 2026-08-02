package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.hq5;
import defpackage.o0k;
import defpackage.rvf;
import defpackage.sn5;
import defpackage.uif;
import defpackage.yci;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class U extends uif implements Function2<hq5, Integer, Unit> {
    public final /* synthetic */ Function0<Unit> a;
    public final /* synthetic */ InterfaceC1129m0 b;
    public final /* synthetic */ EnumC1087j0 c;
    public final /* synthetic */ yci d;
    public final /* synthetic */ o0k e;
    public final /* synthetic */ sn5 f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(Function0 function0, InterfaceC1129m0 interfaceC1129m0, EnumC1087j0 enumC1087j0, yci yciVar, o0k o0kVar, sn5 sn5Var, int i) {
        super(2);
        this.a = function0;
        this.b = interfaceC1129m0;
        this.c = enumC1087j0;
        this.d = yciVar;
        this.e = o0kVar;
        this.f = sn5Var;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C0989c0.a(this.a, this.b, this.c, this.d, this.e, this.f, (hq5) obj, rvf.R(this.g | 1));
        return Unit.a;
    }
}
