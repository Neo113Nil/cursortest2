package com.plaid.internal.core.networking.models;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.ResponseBody;

/* loaded from: classes4.dex */
public final class a extends Lambda implements Function0<String> {
    public final /* synthetic */ ResponseBody a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ResponseBody responseBody) {
        super(0);
        this.a = responseBody;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String string2;
        try {
            ResponseBody responseBody = this.a;
            return (responseBody == null || (string2 = responseBody.string()) == null) ? "unknown" : StringsKt__StringsJVMKt.replace$default(string2, "\n", " ");
        } catch (Throwable unused) {
            return "unknown";
        }
    }
}
