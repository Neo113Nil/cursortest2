package com.squareup.cash.limits.views.arcade;

import androidx.appcompat.widget.AppCompatHintHelper;
import androidx.biometric.AuthenticatorUtils;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.svg.internal.ParseSvg_androidKt;
import com.google.android.gms.dynamite.zzb;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.invitations.InviteErrorDialogKt$$ExternalSyntheticLambda0;
import com.squareup.cash.limits.viewmodels.LimitViewModel;
import com.squareup.cash.limits.viewmodels.LimitsMessageViewModel;
import com.squareup.cash.limits.viewmodels.LimitsViewModel;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.moneybot.widgets.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.util.cash.Countries;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class FlatLimitsViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ LimitsViewModel f$2;

    public /* synthetic */ FlatLimitsViewKt$$ExternalSyntheticLambda0(Function1 function1, LimitsViewModel limitsViewModel, int i) {
        this.$r8$classId = i;
        this.f$1 = function1;
        this.f$2 = limitsViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v31, types: [int] */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Modifier.Companion companion;
        boolean z;
        Modifier modifier;
        Modifier modifier2;
        int i;
        ?? r5;
        Modifier.Companion companion2;
        boolean z2;
        Modifier modifier3;
        Modifier modifier4;
        int i2;
        ?? r13;
        int i3 = this.$r8$classId;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        LimitsViewModel limitsViewModel = this.f$2;
        Function1 function1 = this.f$1;
        switch (i3) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2);
                Applier applier = gapComposer.applier;
                if (shouldExecute) {
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Modifier m = BalanceFeedKt$$ExternalSyntheticOutline0.m(companion3, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1, 1.0f);
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    NavigationType navigationType = NavigationType.BACK;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    Object obj3 = rememberedValue;
                    if (changed || rememberedValue == neverEqualPolicy) {
                        InviteErrorDialogKt$$ExternalSyntheticLambda0 inviteErrorDialogKt$$ExternalSyntheticLambda0 = new InviteErrorDialogKt$$ExternalSyntheticLambda0(27, function1);
                        gapComposer.updateRememberedValue(inviteErrorDialogKt$$ExternalSyntheticLambda0);
                        obj3 = inviteErrorDialogKt$$ExternalSyntheticLambda0;
                    }
                    DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) obj3, (Modifier) null, (Function3) null, gapComposer, 54, 108);
                    if (1.0f <= 0.0d) {
                        InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                    }
                    Modifier verticalScroll$default = ImageKt.verticalScroll$default(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), ImageKt.rememberScrollState(gapComposer), false, 14);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    Countries.PageHeader(Room.stringResource(gapComposer, R.string.limits_title), (Modifier) null, (Function2) null, (String) null, gapComposer, 0, 14);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                    LimitsMessageViewModel limitsMessageViewModel = limitsViewModel.pageletInlineMessageViewModel;
                    List list = limitsViewModel.limits;
                    if (limitsMessageViewModel == null || (!(limitsMessageViewModel instanceof LimitsMessageViewModel.InlineMessage) && !(limitsMessageViewModel instanceof LimitsMessageViewModel.CardUpsell))) {
                        limitsMessageViewModel = null;
                    }
                    if (limitsMessageViewModel == null) {
                        gapComposer.startReplaceGroup(-597743304);
                        gapComposer.end(false);
                        r5 = 0;
                        companion = companion3;
                        modifier2 = null;
                        i = 1;
                    } else {
                        gapComposer.startReplaceGroup(-597743303);
                        boolean changed2 = gapComposer.changed(function1);
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        Object obj4 = rememberedValue2;
                        if (changed2 || rememberedValue2 == neverEqualPolicy) {
                            UtilsKt$$ExternalSyntheticLambda0 utilsKt$$ExternalSyntheticLambda0 = new UtilsKt$$ExternalSyntheticLambda0(1, function1);
                            gapComposer.updateRememberedValue(utilsKt$$ExternalSyntheticLambda0);
                            obj4 = utilsKt$$ExternalSyntheticLambda0;
                        }
                        Function1 function12 = (Function1) obj4;
                        if (limitsMessageViewModel instanceof LimitsMessageViewModel.CardUpsell) {
                            gapComposer.startReplaceGroup(1931662544);
                            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                            DefaultSizes.spacing.getClass();
                            companion = companion3;
                            modifier = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                            z = false;
                            gapComposer.end(false);
                        } else {
                            companion = companion3;
                            z = false;
                            gapComposer.startReplaceGroup(1931766983);
                            gapComposer.end(false);
                            modifier = companion;
                        }
                        AuthenticatorUtils.LimitsInlineMessage(limitsMessageViewModel, function12, modifier, gapComposer, z ? 1 : 0);
                        modifier2 = null;
                        i = 1;
                        DBUtil.SpacerBetweenSectionLarge(z ? 1 : 0, 1, gapComposer, null);
                        gapComposer.end(z);
                        r5 = z;
                    }
                    if (limitsViewModel.loading) {
                        gapComposer.startReplaceGroup(-597214598);
                        DBUtil.SpacerBetweenSectionLarge(r5, i, gapComposer, modifier2);
                        Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                        if (1.0f <= 0.0d) {
                            InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                        }
                        Modifier then = fillMaxSize.then(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                        int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, then);
                        gapComposer.startReusableNode();
                        if (gapComposer.inserting) {
                            gapComposer.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer.useNode();
                        }
                        Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                        ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
                        gapComposer.end(true);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-597017407);
                        int i4 = 0;
                        for (Object obj5 : list) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                                throw null;
                            }
                            ParseSvg_androidKt.FlatLimitSection((LimitViewModel) obj5, i4 == CollectionsKt__CollectionsKt.getLastIndex(list), null, gapComposer, 0);
                            i4 = i5;
                        }
                        gapComposer.end(false);
                    }
                    gapComposer.end(true);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                boolean shouldExecute2 = gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2);
                Applier applier2 = gapComposer2.applier;
                if (shouldExecute2) {
                    Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Modifier m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(companion3, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1, 1.0f);
                    Arrangement$Top$1 arrangement$Top$12 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal2, gapComposer2, 0);
                    int hashCode4 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer2, m2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier2 == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer2.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$15);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$16);
                    Integer valueOf2 = Integer.valueOf(hashCode4);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer2, valueOf2, composeUiNode$Companion$SetModifier$17);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer2, materializeModifier4, composeUiNode$Companion$SetModifier$18);
                    NavigationType navigationType2 = NavigationType.BACK;
                    boolean changed3 = gapComposer2.changed(function1);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    Object obj6 = rememberedValue3;
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        CashMapViewKt$$ExternalSyntheticLambda4 cashMapViewKt$$ExternalSyntheticLambda4 = new CashMapViewKt$$ExternalSyntheticLambda4(1, function1);
                        gapComposer2.updateRememberedValue(cashMapViewKt$$ExternalSyntheticLambda4);
                        obj6 = cashMapViewKt$$ExternalSyntheticLambda4;
                    }
                    DBUtil.TitleBarSub((String) null, navigationType2, (Modifier) null, (DynamicColorConfiguration) null, (Function0) obj6, (Modifier) null, (Function3) null, gapComposer2, 54, 108);
                    if (1.0f <= 0.0d) {
                        InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                    }
                    Modifier verticalScroll$default2 = ImageKt.verticalScroll$default(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), ImageKt.rememberScrollState(gapComposer2), false, 14);
                    ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal2, gapComposer2, 0);
                    int hashCode5 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer2, verticalScroll$default2);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy4, composeUiNode$Companion$SetModifier$15);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$16);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode5, gapComposer2, composeUiNode$Companion$SetModifier$17, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    Updater.m576setimpl(gapComposer2, materializeModifier5, composeUiNode$Companion$SetModifier$18);
                    Countries.PageHeader(Room.stringResource(gapComposer2, R.string.limits_title), (Modifier) null, (Function2) null, (String) null, gapComposer2, 0, 14);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
                    LimitsMessageViewModel limitsMessageViewModel2 = limitsViewModel.pageletInlineMessageViewModel;
                    if (limitsMessageViewModel2 == null || (!(limitsMessageViewModel2 instanceof LimitsMessageViewModel.InlineMessage) && !(limitsMessageViewModel2 instanceof LimitsMessageViewModel.CardUpsell))) {
                        limitsMessageViewModel2 = null;
                    }
                    if (limitsMessageViewModel2 == null) {
                        gapComposer2.startReplaceGroup(-842713840);
                        r13 = 0;
                        gapComposer2.end(false);
                        companion2 = companion3;
                        modifier4 = null;
                        i2 = 1;
                    } else {
                        gapComposer2.startReplaceGroup(-842713839);
                        boolean changed4 = gapComposer2.changed(function1);
                        Object rememberedValue4 = gapComposer2.rememberedValue();
                        Object obj7 = rememberedValue4;
                        if (changed4 || rememberedValue4 == neverEqualPolicy) {
                            UtilsKt$$ExternalSyntheticLambda0 utilsKt$$ExternalSyntheticLambda02 = new UtilsKt$$ExternalSyntheticLambda0(2, function1);
                            gapComposer2.updateRememberedValue(utilsKt$$ExternalSyntheticLambda02);
                            obj7 = utilsKt$$ExternalSyntheticLambda02;
                        }
                        Function1 function13 = (Function1) obj7;
                        if (limitsMessageViewModel2 instanceof LimitsMessageViewModel.CardUpsell) {
                            gapComposer2.startReplaceGroup(-1841695448);
                            ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                            DefaultSizes.spacing.getClass();
                            companion2 = companion3;
                            modifier3 = SpacerKt.m300paddingVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                            z2 = false;
                            gapComposer2.end(false);
                        } else {
                            companion2 = companion3;
                            z2 = false;
                            gapComposer2.startReplaceGroup(-1841591009);
                            gapComposer2.end(false);
                            modifier3 = companion2;
                        }
                        AuthenticatorUtils.LimitsInlineMessage(limitsMessageViewModel2, function13, modifier3, gapComposer2, z2 ? 1 : 0);
                        modifier4 = null;
                        i2 = 1;
                        DBUtil.SpacerBetweenSectionLarge(z2 ? 1 : 0, 1, gapComposer2, null);
                        gapComposer2.end(z2);
                        r13 = z2;
                    }
                    if (limitsViewModel.loading) {
                        gapComposer2.startReplaceGroup(-842185134);
                        DBUtil.SpacerBetweenSectionLarge(r13, i2, gapComposer2, modifier4);
                        Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion2, 1.0f);
                        if (1.0f <= 0.0d) {
                            InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                        }
                        Modifier then2 = fillMaxSize2.then(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                        int hashCode6 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer2, then2);
                        gapComposer2.startReusableNode();
                        if (gapComposer2.inserting) {
                            gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                        } else {
                            gapComposer2.useNode();
                        }
                        Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$15);
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope6, composeUiNode$Companion$SetModifier$16);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode6, gapComposer2, composeUiNode$Companion$SetModifier$17, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$12);
                        Updater.m576setimpl(gapComposer2, materializeModifier6, composeUiNode$Companion$SetModifier$18);
                        ProgressCircularKt.ProgressCircular(0, 1, gapComposer2, null);
                        gapComposer2.end(true);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-841986827);
                        List list2 = limitsViewModel.limits;
                        boolean changed5 = gapComposer2.changed(function1);
                        Object rememberedValue5 = gapComposer2.rememberedValue();
                        Object obj8 = rememberedValue5;
                        if (changed5 || rememberedValue5 == neverEqualPolicy) {
                            UtilsKt$$ExternalSyntheticLambda0 utilsKt$$ExternalSyntheticLambda03 = new UtilsKt$$ExternalSyntheticLambda0(3, function1);
                            gapComposer2.updateRememberedValue(utilsKt$$ExternalSyntheticLambda03);
                            obj8 = utilsKt$$ExternalSyntheticLambda03;
                        }
                        zzb.DynamicGroupingLimitList(0, gapComposer2, null, list2, (Function1) obj8);
                        gapComposer2.end(false);
                    }
                    gapComposer2.end(true);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    boolean changed6 = gapComposer3.changed(function1);
                    Object rememberedValue6 = gapComposer3.rememberedValue();
                    if (changed6 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new CashMapViewKt$$ExternalSyntheticLambda4(5, function1);
                        gapComposer3.updateRememberedValue(rememberedValue6);
                    }
                    DBUtil.BackHandler(false, (Function0) rememberedValue6, gapComposer3, 0, 1);
                    int ordinal = limitsViewModel.limitsType.ordinal();
                    if (ordinal == 0) {
                        gapComposer3.startReplaceGroup(-1988924859);
                        ParseSvg_androidKt.FlatLimitsContent(limitsViewModel, function1, null, gapComposer3, 0);
                        gapComposer3.end(false);
                    } else {
                        if (ordinal != 1) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, -1988926427, false);
                        }
                        gapComposer3.startReplaceGroup(-1988922808);
                        AppCompatHintHelper.GroupedLimitsContent(limitsViewModel, function1, null, gapComposer3, 0);
                        gapComposer3.end(false);
                    }
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
