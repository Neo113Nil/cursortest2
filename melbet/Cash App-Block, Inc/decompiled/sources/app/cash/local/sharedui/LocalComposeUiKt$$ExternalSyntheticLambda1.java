package app.cash.local.sharedui;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import bo.app.u4$$ExternalSyntheticLambda1;
import coil3.compose.internal.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.CashInsetsKt;
import com.squareup.cash.payments.views.composer.ErrorKt;
import java.util.WeakHashMap;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalComposeUiKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Function f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ boolean f$3;
    public final /* synthetic */ boolean f$4;

    public /* synthetic */ LocalComposeUiKt$$ExternalSyntheticLambda1(Object obj, ComposableLambdaImpl composableLambdaImpl, boolean z, boolean z2, boolean z3) {
        this.f$0 = obj;
        this.f$1 = composableLambdaImpl;
        this.f$2 = z;
        this.f$3 = z2;
        this.f$4 = z3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i;
        Object imePadding;
        Modifier navigationBarsWithBottomNavigationPadding;
        int i2 = this.$r8$classId;
        Function function = this.f$1;
        Object obj3 = this.f$0;
        boolean z2 = this.f$4;
        boolean z3 = this.f$3;
        Modifier modifier = Modifier.Companion.$$INSTANCE;
        switch (i2) {
            case 0:
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) function;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new LocalLoadingOverlay(context);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    LocalLoadingOverlay localLoadingOverlay = (LocalLoadingOverlay) rememberedValue;
                    boolean changed = gapComposer.changed(obj3);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = Updater.derivedStateOf(new u4$$ExternalSyntheticLambda1(z2, 1));
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    State state = (State) rememberedValue2;
                    Boolean bool = (Boolean) state.getValue();
                    bool.booleanValue();
                    boolean changed2 = gapComposer.changed(state) | gapComposer.changedInstance(context);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue3 == neverEqualPolicy) {
                        z = true;
                        rememberedValue3 = new UtilsKt$$ExternalSyntheticLambda0(1, context, localLoadingOverlay, state);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    } else {
                        z = true;
                    }
                    Updater.DisposableEffect(bool, (Function1) rememberedValue3, gapComposer);
                    WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                    boolean z4 = Arrangement$End$1.current(gapComposer).tappableElement.getInsets$foundation_layout().bottom == 0 ? z : false;
                    RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                    if (this.f$2) {
                        gapComposer.startReplaceGroup(-431317882);
                        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(modifier, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                        if (z4) {
                            gapComposer.startReplaceGroup(-431198966);
                            navigationBarsWithBottomNavigationPadding = CashInsetsKt.inlineBottomNavigationPadding(gapComposer, modifier);
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(-431123202);
                            navigationBarsWithBottomNavigationPadding = CashInsetsKt.navigationBarsWithBottomNavigationPadding(gapComposer);
                            gapComposer.end(false);
                        }
                        imePadding = SpacerKt.imePadding(m177backgroundbw27NRU.then(navigationBarsWithBottomNavigationPadding));
                        gapComposer.end(false);
                        i = 0;
                    } else {
                        gapComposer.startReplaceGroup(-430983392);
                        if (z3) {
                            modifier = ImageKt.m177backgroundbw27NRU(modifier, ColorsDarkKt.colorsDark.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                        }
                        Modifier clip = ClipKt.clip(SpacerKt.statusBarsPadding(modifier), RoundedCornerShapeKt.m342RoundedCornerShapea9UjIt4$default(32.0f, 32.0f, 12));
                        Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        i = 0;
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        imePadding = SpacerKt.imePadding(SpacerKt.navigationBarsPadding(ImageKt.m177backgroundbw27NRU(clip, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1)));
                        gapComposer.end(false);
                    }
                    composableLambdaImpl.invoke(imePadding, gapComposer, Integer.valueOf(i));
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Function0 function0 = (Function0) obj3;
                Function0 function02 = (Function0) function;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                boolean shouldExecute = gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2);
                Applier applier = gapComposer2.applier;
                if (shouldExecute) {
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.BottomCenter, false);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, modifier);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
                    if (z3) {
                        gapComposer2.startReplaceGroup(684443958);
                        ErrorKt.ButtonCtaGroupWithProminentAddRecipient(z2, function0, function02, gapComposer2, 0);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(684686905);
                        ErrorKt.ButtonCtaGroupWithProminentShareLink(z2, function0, function02, gapComposer2, 0);
                        gapComposer2.end(false);
                    }
                    gapComposer2.end(true);
                    AnimatedContentKt.AnimatedVisibility(this.f$2, SpacerKt.imePadding(SizeKt.fillMaxWidth(modifier, 1.0f)), EnterExitTransitionKt.fadeIn$default(null, 3).plus(EnterExitTransitionKt.slideInVertically$default(3, null)).plus(EnterExitTransitionKt.expandVertically$default(null, 13)), EnterExitTransitionKt.fadeOut$default(null, 3).plus(EnterExitTransitionKt.slideOutVertically$default(3, null)).plus(EnterExitTransitionKt.shrinkVertically$default(null, Alignment.Companion.Top, 13)), (String) null, (Function3) ErrorKt.lambda$229401499, (Composer) gapComposer2, 200064, 16);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ LocalComposeUiKt$$ExternalSyntheticLambda1(Function0 function0, boolean z, boolean z2, boolean z3, Function0 function02) {
        this.f$2 = z;
        this.f$3 = z2;
        this.f$4 = z3;
        this.f$0 = function0;
        this.f$1 = function02;
    }
}
