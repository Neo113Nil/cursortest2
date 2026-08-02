package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.hq5;
import defpackage.rvf;
import defpackage.uif;
import defpackage.vci;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.m3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1132m3 extends uif implements Function2<hq5, Integer, Unit> {
    public final /* synthetic */ char a;
    public final /* synthetic */ vci b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1132m3(char c, vci vciVar, boolean z, int i) {
        super(2);
        this.a = c;
        this.b = vciVar;
        this.c = z;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1160o3.a(this.a, this.b, this.c, (hq5) obj, rvf.R(this.d | 1));
        return Unit.a;
    }
}
