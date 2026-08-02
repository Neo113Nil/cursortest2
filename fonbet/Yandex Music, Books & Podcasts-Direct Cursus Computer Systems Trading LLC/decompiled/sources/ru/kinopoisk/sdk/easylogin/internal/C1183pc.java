package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.hq5;
import defpackage.rvf;
import defpackage.sn5;
import defpackage.uif;
import defpackage.yci;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.pc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1183pc extends uif implements Function2<hq5, Integer, Unit> {
    public final /* synthetic */ uif a;
    public final /* synthetic */ yci b;
    public final /* synthetic */ InterfaceC1129m0 c;
    public final /* synthetic */ EnumC1087j0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ EnumC1073i0 f;
    public final /* synthetic */ sn5 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1183pc(Function0 function0, yci yciVar, InterfaceC1129m0 interfaceC1129m0, EnumC1087j0 enumC1087j0, boolean z, EnumC1073i0 enumC1073i0, sn5 sn5Var, int i, int i2) {
        super(2);
        this.a = (uif) function0;
        this.b = yciVar;
        this.c = interfaceC1129m0;
        this.d = enumC1087j0;
        this.e = z;
        this.f = enumC1073i0;
        this.g = sn5Var;
        this.h = i;
        this.i = i2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0, uif] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1197qc.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (hq5) obj, rvf.R(this.h | 1), this.i);
        return Unit.a;
    }
}
