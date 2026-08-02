package com.squareup.cash.arcade.components.cell;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class RealCellSearchResultAccessoryScope {
    public final ParcelableSnapshotMutableState content$delegate = Updater.mutableStateOf$default(null);

    public static void buttonCompact$default(RealCellSearchResultAccessoryScope realCellSearchResultAccessoryScope, Function0 function0, boolean z, ComposableLambdaImpl composableLambdaImpl, int i) {
        ButtonProminence buttonProminence = ButtonProminence.STANDARD;
        boolean z2 = (i & 4) != 0 ? true : z;
        realCellSearchResultAccessoryScope.getClass();
        function0.getClass();
        realCellSearchResultAccessoryScope.setContent(new ComposableLambdaImpl(new LocalHomeViewKt$$ExternalSyntheticLambda0(function0, buttonProminence, z2, composableLambdaImpl, 12), true, -1874509834));
    }

    public final void setContent(ComposableLambdaImpl composableLambdaImpl) {
        this.content$delegate.setValue(composableLambdaImpl);
    }
}
