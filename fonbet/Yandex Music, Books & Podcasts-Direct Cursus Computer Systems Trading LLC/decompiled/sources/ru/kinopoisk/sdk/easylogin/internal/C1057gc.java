package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.hq5;
import defpackage.rvf;
import defpackage.uif;
import defpackage.yci;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.gc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1057gc extends uif implements Function2<hq5, Integer, Unit> {
    public final /* synthetic */ yci a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1057gc(yci yciVar, long j, int i) {
        super(2);
        this.a = yciVar;
        this.b = j;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1071hc.a(this.a, this.b, (hq5) obj, rvf.R(this.c | 1));
        return Unit.a;
    }
}
