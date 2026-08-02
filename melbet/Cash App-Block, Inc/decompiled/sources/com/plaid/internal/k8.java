package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class k8 extends Lambda implements Function0<Configuration$DeviceMetadata> {
    public final /* synthetic */ n8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(n8 n8Var) {
        super(0);
        O4 o4 = O4.a;
        this.a = n8Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Configuration$DeviceMetadata.a newBuilder = Configuration$DeviceMetadata.newBuilder();
        O4 o4 = O4.a;
        n8 n8Var = this.a;
        newBuilder.d(O4.c);
        newBuilder.e(O4.d);
        newBuilder.f(O4.h);
        newBuilder.g(O4.g);
        newBuilder.c(((Locale) n8Var.i.getValue()).toLanguageTag());
        newBuilder.a(((Locale) n8Var.i.getValue()).getCountry());
        newBuilder.b(((Locale) n8Var.i.getValue()).getLanguage());
        newBuilder.b(O4.k);
        newBuilder.a(O4.j);
        return newBuilder.build();
    }
}
