package com.squareup.cash.card.onboarding;

import androidx.camera.video.internal.utils.StorageUtil;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Absolute$Left$1;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.unit.DpSize;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class StampSheetV2Kt$$ExternalSyntheticLambda11 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ long f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ boolean f$3;

    public /* synthetic */ StampSheetV2Kt$$ExternalSyntheticLambda11(long j, Function1 function1, StampSheetViewModel stampSheetViewModel, boolean z) {
        this.f$0 = j;
        this.f$1 = function1;
        this.f$2 = stampSheetViewModel;
        this.f$3 = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Modifier then;
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj3 = this.f$2;
        Object obj4 = this.f$1;
        long j = this.f$0;
        final int i2 = 1;
        final int i3 = 0;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj4;
                StampSheetViewModel stampSheetViewModel = (StampSheetViewModel) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 11), 44.0f), RoundedCornerShapeKt.CircleShape), j, ColorKt.RectangleShape);
                    Icons icons = Icons.Next24;
                    String stringResource = Room.stringResource(gapComposer, R.string.accessibility_continue);
                    boolean changed = gapComposer.changed(function1) | gapComposer.changedInstance(stampSheetViewModel);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new StampSheetV2Kt$$ExternalSyntheticLambda12(0, stampSheetViewModel, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    StorageUtil.ButtonIcon(icons, stringResource, (Function0) rememberedValue, m177backgroundbw27NRU, this.f$3, null, gapComposer, 6, 32);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Modifier modifier = (Modifier) obj4;
                final OffsetProvider offsetProvider = (OffsetProvider) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean z = this.f$3;
                    if (j != 9205357640488583168L) {
                        gapComposer2.startReplaceGroup(3458246);
                        Arrangement$Absolute$Left$1 arrangement$Absolute$Left$1 = z ? OffsetKt.f5Right : OffsetKt.f4Left;
                        then = modifier.then(new SizeElement((r13 & 1) != 0 ? Float.NaN : DpSize.m1044getWidthD9Ej5fM(j), (r13 & 2) != 0 ? Float.NaN : DpSize.m1043getHeightD9Ej5fM(j), (r13 & 4) != 0 ? Float.NaN : RecyclerView.DECELERATION_RATE, (r13 & 8) != 0 ? Float.NaN : RecyclerView.DECELERATION_RATE, false));
                        RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$Absolute$Left$1, Alignment.Companion.Top, gapComposer2, 0);
                        int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, then);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                        if (gapComposer2.applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer2.startReusableNode();
                        if (gapComposer2.inserting) {
                            gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer2.useNode();
                        }
                        Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                        boolean changedInstance = gapComposer2.changedInstance(offsetProvider);
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new Function0() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i4 = i3;
                                    OffsetProvider offsetProvider2 = offsetProvider;
                                    switch (i4) {
                                        case 0:
                                            return Boolean.valueOf((9223372034707292159L & offsetProvider2.mo345provideF1C5BW0()) != 9205357640488583168L);
                                        default:
                                            return Boolean.valueOf((9223372034707292159L & offsetProvider2.mo345provideF1C5BW0()) != 9205357640488583168L);
                                    }
                                }
                            };
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        }
                        SimpleLayoutKt.SelectionHandleIcon(6, gapComposer2, Modifier.Companion.$$INSTANCE, (Function0) rememberedValue2, z);
                        gapComposer2.end(true);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(4389176);
                        boolean changedInstance2 = gapComposer2.changedInstance(offsetProvider);
                        Object rememberedValue3 = gapComposer2.rememberedValue();
                        if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                            rememberedValue3 = new Function0() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i4 = i2;
                                    OffsetProvider offsetProvider2 = offsetProvider;
                                    switch (i4) {
                                        case 0:
                                            return Boolean.valueOf((9223372034707292159L & offsetProvider2.mo345provideF1C5BW0()) != 9205357640488583168L);
                                        default:
                                            return Boolean.valueOf((9223372034707292159L & offsetProvider2.mo345provideF1C5BW0()) != 9205357640488583168L);
                                    }
                                }
                            };
                            gapComposer2.updateRememberedValue(rememberedValue3);
                        }
                        SimpleLayoutKt.SelectionHandleIcon(0, gapComposer2, modifier, (Function0) rememberedValue3, z);
                        gapComposer2.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ StampSheetV2Kt$$ExternalSyntheticLambda11(long j, boolean z, Modifier modifier, OffsetProvider offsetProvider) {
        this.f$0 = j;
        this.f$3 = z;
        this.f$1 = modifier;
        this.f$2 = offsetProvider;
    }
}
