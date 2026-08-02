package ru.kinopoisk.sdk.easylogin.internal;

import android.content.Context;
import defpackage.hq5;
import defpackage.rvf;
import defpackage.sn5;
import defpackage.uif;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class vc extends uif implements Function2<hq5, Integer, Unit> {
    public final /* synthetic */ Context a;
    public final /* synthetic */ sn5 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc(Context context, sn5 sn5Var, int i) {
        super(2);
        this.a = context;
        this.b = sn5Var;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1224sc.a(this.a, this.b, (hq5) obj, rvf.R(this.c | 1));
        return Unit.a;
    }
}
