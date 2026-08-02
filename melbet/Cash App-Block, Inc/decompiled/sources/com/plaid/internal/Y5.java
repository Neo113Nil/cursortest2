package com.plaid.internal;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObjectBuilder;

/* loaded from: classes5.dex */
public final class Y5 extends Lambda implements Function1<JsonObjectBuilder, Unit> {
    public final /* synthetic */ Map<String, String> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y5(Map<String, String> map) {
        super(1);
        this.a = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        jsonObjectBuilder.getClass();
        Map<String, String> map = this.a;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                JsonElementBuildersKt.put(jsonObjectBuilder, entry.getKey(), entry.getValue());
            }
        }
        return Unit.INSTANCE;
    }
}
