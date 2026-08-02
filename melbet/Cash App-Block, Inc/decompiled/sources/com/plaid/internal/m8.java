package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class m8 extends Lambda implements Function0<Configuration$SDKMetadata> {
    public final /* synthetic */ n8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8(n8 n8Var) {
        super(0);
        this.a = n8Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Configuration$SDKMetadata.a newBuilder = Configuration$SDKMetadata.newBuilder();
        n8 n8Var = this.a;
        newBuilder.a(com.plaid.internal.core.protos.link.workflow.primitives.g.CLIENT_TYPE_ANDROID);
        newBuilder.c(n8Var.a);
        newBuilder.a();
        newBuilder.b(n8Var.e);
        newBuilder.a(n8Var.g);
        String str = n8Var.b;
        if (str != null) {
            if (StringsKt.isBlank(str)) {
                str = null;
            }
            if (str != null) {
                newBuilder.a(Configuration$SDKMetadata.WrappingSDK.newBuilder().a(com.plaid.internal.core.protos.link.workflow.primitives.g.CLIENT_TYPE_REACTNATIVEANDROID).a(n8Var.b).build());
            }
        }
        String str2 = n8Var.c;
        if (str2 != null) {
            if ((StringsKt.isBlank(str2) ? null : str2) != null) {
                newBuilder.a(Configuration$SDKMetadata.WrappingSDK.newBuilder().a(com.plaid.internal.core.protos.link.workflow.primitives.g.CLIENT_TYPE_FLUTTERANDROID).a(n8Var.c).build());
            }
        }
        return newBuilder.build();
    }
}
