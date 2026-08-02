package com.plaid.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.JsonBuilder;

/* renamed from: com.plaid.internal.r5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0274r5 extends Lambda implements Function1<JsonBuilder, Unit> {
    public static final C0274r5 a = new C0274r5();

    public C0274r5() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JsonBuilder jsonBuilder = (JsonBuilder) obj;
        jsonBuilder.getClass();
        jsonBuilder.ignoreUnknownKeys = true;
        return Unit.INSTANCE;
    }
}
