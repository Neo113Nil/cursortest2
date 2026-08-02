package com.plaid.link;

import com.plaid.link.configuration.LinkTokenConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/Function1;", "Lcom/plaid/link/configuration/LinkTokenConfiguration$Builder;", "", "initializer", "Lcom/plaid/link/configuration/LinkTokenConfiguration;", "linkTokenConfiguration", "(Lkotlin/jvm/functions/Function1;)Lcom/plaid/link/configuration/LinkTokenConfiguration;", "link-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PlaidKotlinFunctionsKt {
    public static final /* synthetic */ LinkTokenConfiguration linkTokenConfiguration(Function1 function1) {
        function1.getClass();
        LinkTokenConfiguration.Builder builder = new LinkTokenConfiguration.Builder();
        function1.invoke(builder);
        return builder.build();
    }
}
