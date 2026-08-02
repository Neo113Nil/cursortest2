package com.squareup.cash.shopping.views.search;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.protos.cash.discover.api.app.v1.model.Button;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class ShopMessageKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ Button f$1;

    public /* synthetic */ ShopMessageKt$$ExternalSyntheticLambda0(Function1 function1, Button button, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = button;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Button button = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                if (function1 != null) {
                    String str = button.action_url;
                    if (str == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        break;
                    } else {
                        function1.invoke(str);
                    }
                }
                break;
            case 1:
                String str2 = button.action_url;
                if (str2 == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                    break;
                } else {
                    function1.invoke(str2);
                    break;
                }
            default:
                String str3 = button.action_url;
                if (str3 == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                    break;
                } else {
                    function1.invoke(str3);
                    break;
                }
        }
        return null;
    }
}
