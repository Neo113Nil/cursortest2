package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.hq5;
import defpackage.rvf;
import defpackage.uif;
import defpackage.vci;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.jc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1099jc extends uif implements Function2<hq5, Integer, Unit> {
    public final /* synthetic */ vci a;
    public final /* synthetic */ T8 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1099jc(vci vciVar, T8 t8, int i) {
        super(2);
        U8 u8 = U8.Themed;
        this.a = vciVar;
        this.b = t8;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        vci vciVar = this.a;
        T8 t8 = this.b;
        U8 u8 = U8.Themed;
        C1113kc.a(vciVar, t8, (hq5) obj, rvf.R(this.c | 1));
        return Unit.a;
    }
}
