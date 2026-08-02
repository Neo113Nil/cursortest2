package com.plaid.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.JsonBuilder;

/* renamed from: com.plaid.internal.n2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0236n2 extends Lambda implements Function1<JsonBuilder, Unit> {
    public static final C0236n2 a = new C0236n2();

    public C0236n2() {
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
