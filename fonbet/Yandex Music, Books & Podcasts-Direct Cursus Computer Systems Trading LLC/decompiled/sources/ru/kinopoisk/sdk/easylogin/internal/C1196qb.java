package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.hq5;
import defpackage.rvf;
import defpackage.uif;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.qb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1196qb extends uif implements Function2<hq5, Integer, Unit> {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ Function1<H3, Unit> b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1196qb(ArrayList arrayList, Function1 function1, int i) {
        super(2);
        this.a = arrayList;
        this.b = function1;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1209rb.a(this.a, this.b, (hq5) obj, rvf.R(this.c | 1));
        return Unit.a;
    }
}
