package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.hq5;
import defpackage.rvf;
import defpackage.sn5;
import defpackage.uif;
import defpackage.yci;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.mc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1141mc extends uif implements Function2<hq5, Integer, Unit> {
    public final /* synthetic */ Function0<Unit> a;
    public final /* synthetic */ yci b;
    public final /* synthetic */ InterfaceC1129m0 c;
    public final /* synthetic */ EnumC1087j0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ sn5 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1141mc(Function0 function0, yci yciVar, InterfaceC1129m0 interfaceC1129m0, EnumC1087j0 enumC1087j0, boolean z, sn5 sn5Var, int i, int i2) {
        super(2);
        this.a = function0;
        this.b = yciVar;
        this.c = interfaceC1129m0;
        this.d = enumC1087j0;
        this.e = z;
        this.f = sn5Var;
        this.g = i;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1155nc.a(this.a, this.b, this.c, this.d, this.e, this.f, (hq5) obj, rvf.R(this.g | 1), this.h);
        return Unit.a;
    }
}
