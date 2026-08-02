package com.squareup.cash.banking.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.arcade.bindings.component.ArcadeComponentProtoBindingKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import squareup.cash.ui.arcade.elements.ListOrdered;

/* loaded from: classes5.dex */
public final /* synthetic */ class BenefitsLeafletViewKt$$ExternalSyntheticLambda20 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ListOrdered f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ BenefitsLeafletViewKt$$ExternalSyntheticLambda20(ListOrdered listOrdered, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = listOrdered;
        this.f$1 = function1;
        this.f$2 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$2;
        Function1 function1 = this.f$1;
        ListOrdered listOrdered = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                BenefitsLeafletViewKt.ListOrderedVariant(listOrdered, function1, composer, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ArcadeComponentProtoBindingKt.RenderListOrdered(listOrdered, function1, composer, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
