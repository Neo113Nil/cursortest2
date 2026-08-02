package com.squareup.cash.shopping.views;

import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.squareup.cash.mooncake.components.MooncakeEmptyView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;

/* loaded from: classes6.dex */
public final /* synthetic */ class ShopEmptyViewKt$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ ShopEmptyViewKt$$ExternalSyntheticLambda1(String str, String str2, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        String str = this.f$1;
        String str2 = this.f$0;
        switch (i) {
            case 0:
                MooncakeEmptyView mooncakeEmptyView = (MooncakeEmptyView) obj;
                mooncakeEmptyView.getClass();
                mooncakeEmptyView.setTitle(str2);
                mooncakeEmptyView.setMessage(str);
                break;
            default:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                if (str2 != null) {
                    str = str2;
                }
                KProperty[] kPropertyArr = SemanticsPropertiesKt.$$delegatedProperties;
                semanticsPropertyReceiver.set(SemanticsProperties.Error, str);
                break;
        }
        return Unit.INSTANCE;
    }
}
