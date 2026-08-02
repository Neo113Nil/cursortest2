package com.squareup.cash.activity.views;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.squareup.cash.activity.viewmodels.ItemAccessory;
import com.squareup.cash.activity.views.compact.CompactActivityAccessoryScope$AccessoryButtonScope$AccessoryButton;
import com.squareup.cash.activity.views.compact.RealCompactActivityAccessoryButtonScope;
import com.squareup.cash.arcade.components.cell.CellActivityAccessoryScope$AccessoryButtonScope$AccessoryButton;
import com.squareup.cash.arcade.components.cell.RealCellActivityAccessoryButtonScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class ActivityItemViewKt$$ExternalSyntheticLambda28 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ItemAccessory.PortraitImage f$0;

    public /* synthetic */ ActivityItemViewKt$$ExternalSyntheticLambda28(ItemAccessory.PortraitImage portraitImage, int i) {
        this.$r8$classId = i;
        this.f$0 = portraitImage;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((RealCellActivityAccessoryButtonScope) obj).getClass();
                return new CellActivityAccessoryScope$AccessoryButtonScope$AccessoryButton(new ComposableLambdaImpl(new ActivityItemViewKt$$ExternalSyntheticLambda30(this.f$0, 0), true, -1407184456));
            case 1:
                ((SemanticsPropertyReceiver) obj).getClass();
                this.f$0.getClass();
                return Unit.INSTANCE;
            default:
                ((RealCompactActivityAccessoryButtonScope) obj).getClass();
                return new CompactActivityAccessoryScope$AccessoryButtonScope$AccessoryButton(new ComposableLambdaImpl(new ActivityItemViewKt$$ExternalSyntheticLambda30(this.f$0, 2), true, -1062042751));
        }
    }
}
