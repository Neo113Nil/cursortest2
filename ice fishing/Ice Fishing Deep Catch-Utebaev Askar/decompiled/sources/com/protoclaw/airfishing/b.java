package com.protoclaw.airfishing;

import android.util.TypedValue;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class b extends m.d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f108a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(MainActivity mainActivity) {
        super(1);
        this.f108a = mainActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Integer.valueOf((int) TypedValue.applyDimension(1, ((Number) obj).intValue(), this.f108a.getResources().getDisplayMetrics()));
    }
}
