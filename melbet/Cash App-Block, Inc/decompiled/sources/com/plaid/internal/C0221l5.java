package com.plaid.internal;

import android.content.SharedPreferences;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.plaid.internal.l5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0221l5 extends Lambda implements Function0<SharedPreferences> {
    public final /* synthetic */ C0230m5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0221l5(C0230m5 c0230m5) {
        super(0);
        this.a = c0230m5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.a.a.getApplicationContext().getSharedPreferences("plaid_environment_values", 0);
    }
}
