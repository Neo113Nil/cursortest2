package com.squareup.cash.card.onboarding;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda6;
import com.squareup.cash.cashapppay.views.GrantSheetKt$$ExternalSyntheticLambda4;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class StampSheetV2Kt$$ExternalSyntheticLambda1 implements Function3 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ StampSheetViewModel f$1;

    public /* synthetic */ StampSheetV2Kt$$ExternalSyntheticLambda1(StampSheetViewModel stampSheetViewModel, Function1 function1) {
        this.f$1 = stampSheetViewModel;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        long j2;
        switch (this.$r8$classId) {
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
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier padding = SpacerKt.padding(companion, paddingValues);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, padding);
                    ComposeUiNode.Companion.getClass();
                    Function0 function0 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(function0);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    ProvidableCompositionLocal providableCompositionLocal = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer.consume(providableCompositionLocal)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
                    NavigationType navigationType = NavigationType.CLOSE;
                    StampSheetViewModel stampSheetViewModel = this.f$1;
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1711907661, new BulletinTileKt$$ExternalSyntheticLambda6(stampSheetViewModel, 14), gapComposer);
                    Function1 function1 = this.f$0;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    Object obj4 = Composer.Companion.Empty;
                    if (changed || rememberedValue == obj4) {
                        rememberedValue = new GrantSheetKt$$ExternalSyntheticLambda4(3, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    DBUtil.TitleBarSub(rememberComposableLambda, navigationType, m302paddingqDBjuR0$default, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, Expect_jvmKt.rememberComposableLambda(1259049934, new StampSheetV2Kt$$ExternalSyntheticLambda1(stampSheetViewModel, function1), gapComposer), gapComposer, 1572918, 40);
                    ((DefaultSizes) gapComposer.consume(providableCompositionLocal)).getClass();
                    Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    ((DefaultSizes) gapComposer.consume(providableCompositionLocal)).getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(m302paddingqDBjuR0$default2, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    GridCells.Fixed fixed = new GridCells.Fixed(4);
                    ((DefaultSizes) gapComposer.consume(providableCompositionLocal)).getClass();
                    Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                    ((DefaultSizes) gapComposer.consume(providableCompositionLocal)).getClass();
                    Arrangement$SpacedAligned arrangement$SpacedAligned2 = new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                    boolean changedInstance = gapComposer.changedInstance(stampSheetViewModel) | gapComposer.changed(function1);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue2 == obj4) {
                        rememberedValue2 = new StampSheetV2Kt$$ExternalSyntheticLambda6(0, stampSheetViewModel, function1);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    LazyGridDslKt.LazyVerticalGrid(fixed, m300paddingVpY3zN4$default, null, null, arrangement$SpacedAligned2, arrangement$SpacedAligned, null, false, null, (Function1) rememberedValue2, gapComposer, 0, 924);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((TitleBarActionScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 17) != 16)) {
                    StampSheetViewModel stampSheetViewModel2 = this.f$1;
                    boolean isEmpty = stampSheetViewModel2.selectedStamps.isEmpty();
                    boolean z = !isEmpty;
                    if (isEmpty) {
                        gapComposer2.startReplaceGroup(-1233782890);
                        Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        j = colors.component.button.prominent.icon.disabled;
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-1233785323);
                        Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        j = colors2.component.button.prominent.icon.f161default;
                        gapComposer2.end(false);
                    }
                    if (isEmpty) {
                        gapComposer2.startReplaceGroup(-1233776234);
                        Colors colors3 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors3 == null) {
                            colors3 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        j2 = colors3.component.button.prominent.background.disabled;
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-1233778859);
                        Colors colors4 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors4 == null) {
                            colors4 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        j2 = colors4.component.button.prominent.background.f160default;
                        gapComposer2.end(false);
                    }
                    Updater.CompositionLocalProvider(Recorder$$ExternalSyntheticOutline2.m(j, ArcadeThemeKt.LocalIconColor), Expect_jvmKt.rememberComposableLambda(715372686, new StampSheetV2Kt$$ExternalSyntheticLambda11(j2, this.f$0, stampSheetViewModel2, z), gapComposer2), gapComposer2, 56);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ StampSheetV2Kt$$ExternalSyntheticLambda1(Function1 function1, StampSheetViewModel stampSheetViewModel) {
        this.f$0 = function1;
        this.f$1 = stampSheetViewModel;
    }
}
