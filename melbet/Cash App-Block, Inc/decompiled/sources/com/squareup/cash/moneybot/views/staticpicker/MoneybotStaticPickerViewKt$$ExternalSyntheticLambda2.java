package com.squareup.cash.moneybot.views.staticpicker;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.avatar.components.BadgedAvatarKt;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.moneybot.viewmodels.staticpicker.MoneybotStaticPickerViewModel;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda12;
import com.squareup.util.cash.Countries;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneybotStaticPickerViewKt$$ExternalSyntheticLambda2 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MoneybotStaticPickerViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ MoneybotStaticPickerViewKt$$ExternalSyntheticLambda2(MoneybotStaticPickerViewModel moneybotStaticPickerViewModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = moneybotStaticPickerViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean changed;
        Object rememberedValue;
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Function1 function1 = this.f$1;
        MoneybotStaticPickerViewModel moneybotStaticPickerViewModel = this.f$0;
        int i2 = 1;
        switch (i) {
            case 0:
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.padding(companion, paddingValues), 1.0f);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxWidth, colors.semantic.background.f1047app, ColorKt.RectangleShape);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Countries.PageHeader(moneybotStaticPickerViewModel.title, (Modifier) null, (Function2) null, (String) null, gapComposer, 0, 14);
                    DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
                    gapComposer.startReplaceGroup(209884229);
                    Iterator it = moneybotStaticPickerViewModel.options.iterator();
                    while (it.hasNext()) {
                        BadgedAvatarKt.PickerOptionRow((MoneybotStaticPickerViewModel.Option) it.next(), function1, gapComposer, 0);
                    }
                    gapComposer.end(false);
                    DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
                    DimensionKt.ButtonCtaGroup(SizeKt.fillMaxWidth(companion, 1.0f), false, null, null, Expect_jvmKt.rememberComposableLambda(-1124219174, new MoneybotStaticPickerViewKt$$ExternalSyntheticLambda2(moneybotStaticPickerViewModel, function1, i2), gapComposer), gapComposer, 24582, 14);
                    DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    ArrayList<MoneybotStaticPickerViewModel.Option> arrayList = moneybotStaticPickerViewModel.options;
                    if (!arrayList.isEmpty()) {
                        for (MoneybotStaticPickerViewModel.Option option : arrayList) {
                            if (option.selected && option.enabled) {
                                z = true;
                                changed = gapComposer2.changed(function1);
                                rememberedValue = gapComposer2.rememberedValue();
                                if (!changed || rememberedValue == Composer.Companion.Empty) {
                                    rememberedValue = new MusicViewKt$$ExternalSyntheticLambda0(11, function1);
                                    gapComposer2.updateRememberedValue(rememberedValue);
                                }
                                coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth2, buttonProminence, false, z, null, Expect_jvmKt.rememberComposableLambda(1600023999, new P2PListViewKt$$ExternalSyntheticLambda12(moneybotStaticPickerViewModel, 8), gapComposer2), gapComposer2, 1573296, 40);
                            }
                        }
                    }
                    z = false;
                    changed = gapComposer2.changed(function1);
                    rememberedValue = gapComposer2.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = new MusicViewKt$$ExternalSyntheticLambda0(11, function1);
                    gapComposer2.updateRememberedValue(rememberedValue);
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth2, buttonProminence, false, z, null, Expect_jvmKt.rememberComposableLambda(1600023999, new P2PListViewKt$$ExternalSyntheticLambda12(moneybotStaticPickerViewModel, 8), gapComposer2), gapComposer2, 1573296, 40);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
