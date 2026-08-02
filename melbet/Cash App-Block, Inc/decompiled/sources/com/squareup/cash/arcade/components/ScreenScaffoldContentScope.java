package com.squareup.cash.arcade.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.layout.ValueInsets;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import coil3.compose.internal.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public interface ScreenScaffoldContentScope {
    static Modifier markAsScaffoldTitle(Composer composer, Modifier modifier) {
        modifier.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1423658254);
        ScaffoldState scaffoldState = (ScaffoldState) gapComposer.consume(ScreenScaffoldKt.LocalScaffoldState);
        if (scaffoldState == null) {
            gapComposer.end(false);
            return modifier;
        }
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer);
        }
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer);
        }
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new BankingDialogKt$$ExternalSyntheticLambda2(2, parcelableSnapshotMutableIntState, parcelableSnapshotMutableIntState2);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Modifier layout = ValueInsets.layout(modifier, (Function3) rememberedValue3);
        boolean changed = gapComposer.changed(scaffoldState);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changed || rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = new UtilsKt$$ExternalSyntheticLambda0(23, scaffoldState, parcelableSnapshotMutableIntState, parcelableSnapshotMutableIntState2);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        Modifier onLayoutRectChanged = RulerKt.onLayoutRectChanged(layout, (Function1) rememberedValue4);
        gapComposer.end(false);
        return onLayoutRectChanged;
    }
}
