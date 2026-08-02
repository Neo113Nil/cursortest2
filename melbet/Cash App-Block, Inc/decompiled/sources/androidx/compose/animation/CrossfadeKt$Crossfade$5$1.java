package androidx.compose.animation;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverterImpl;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.views.map.LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$1;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import com.bugsnag.android.TombstoneEventEnhancer$invoke$2;
import com.google.android.gms.dynamite.zzg;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.common.composeui.widgets.LoadableContentKt$LoadableFullScreenContent$3$1$1$1;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$1$1$1$4$1;
import com.squareup.cash.threedsdataonly.viewmodels.ThreeDsViewModel;
import com.squareup.cash.threedsdataonly.views.ThreeDsViewKt$ThreeDsProgress$1$1$1;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import papa.InteractionResult;

/* loaded from: classes3.dex */
public final class CrossfadeKt$Crossfade$5$1 extends Lambda implements Function2 {
    public final /* synthetic */ Object $animationSpec;
    public final /* synthetic */ Object $content;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $stateForContent;
    public final /* synthetic */ Object $this_Crossfade;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CrossfadeKt$Crossfade$5$1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(2);
        this.$r8$classId = i;
        this.$this_Crossfade = obj;
        this.$animationSpec = obj2;
        this.$stateForContent = obj3;
        this.$content = obj4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Throwable th;
        Object currentState;
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj3 = this.$this_Crossfade;
        Object obj4 = this.$animationSpec;
        int i2 = 3;
        Object obj5 = this.$content;
        int i3 = 2;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Number) obj2).intValue();
                int i4 = 1;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Transition transition = (Transition) obj3;
                    TombstoneEventEnhancer$invoke$2 tombstoneEventEnhancer$invoke$2 = new TombstoneEventEnhancer$invoke$2((FiniteAnimationSpec) obj4, i4);
                    TwoWayConverterImpl twoWayConverterImpl = AnimatableKt.FloatToVector;
                    boolean isSeeking = transition.isSeeking();
                    InteractionResult interactionResult = transition.transitionState;
                    if (isSeeking) {
                        th = null;
                        gapComposer.startReplaceGroup(1666827533);
                        gapComposer.end(false);
                        currentState = interactionResult.getCurrentState();
                    } else {
                        gapComposer.startReplaceGroup(1666573488);
                        boolean changed = gapComposer.changed(transition);
                        currentState = gapComposer.rememberedValue();
                        if (changed || currentState == neverEqualPolicy) {
                            Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                            Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                            th = null;
                            Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                            try {
                                Object currentState2 = interactionResult.getCurrentState();
                                zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                gapComposer.updateRememberedValue(currentState2);
                                currentState = currentState2;
                            } catch (Throwable th2) {
                                zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                throw th2;
                            }
                        } else {
                            th = null;
                        }
                        gapComposer.end(false);
                    }
                    gapComposer.startReplaceGroup(1378811975);
                    Object obj6 = this.$stateForContent;
                    float f = Intrinsics.areEqual(currentState, obj6) ? 1.0f : RecyclerView.DECELERATION_RATE;
                    gapComposer.end(false);
                    Float valueOf = Float.valueOf(f);
                    boolean changed2 = gapComposer.changed(transition);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue == neverEqualPolicy) {
                        rememberedValue = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$1(transition, 1));
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Object value = ((State) rememberedValue).getValue();
                    gapComposer.startReplaceGroup(1378811975);
                    float f2 = Intrinsics.areEqual(value, obj6) ? 1.0f : RecyclerView.DECELERATION_RATE;
                    gapComposer.end(false);
                    Float valueOf2 = Float.valueOf(f2);
                    boolean changed3 = gapComposer.changed(transition);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed3 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$1(transition, 2));
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Transition.TransitionAnimationState createTransitionAnimation = AnimatableKt.createTransitionAnimation(transition, valueOf, valueOf2, (FiniteAnimationSpec) tombstoneEventEnhancer$invoke$2.invoke(((State) rememberedValue2).getValue(), gapComposer, 0), twoWayConverterImpl, gapComposer, 0);
                    boolean changed4 = gapComposer.changed(createTransitionAnimation);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changed4 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new BoundsAnimation$animate$1(createTransitionAnimation, i2);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    Modifier graphicsLayer = ColorKt.graphicsLayer(companion, (Function1) rememberedValue3);
                    ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj5;
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, graphicsLayer);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer.applier == null) {
                        Updater.invalidApplier();
                        throw th;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    composableLambdaImpl.invoke(obj6, (Object) gapComposer, (Object) 0);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Composer composer2 = (Composer) obj;
                ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) obj4;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    if (gapComposer2.getSkipping()) {
                        gapComposer2.skipToGroupEnd();
                        return Unit.INSTANCE;
                    }
                }
                ((MutableState) obj3).setValue(Unit.INSTANCE);
                constraintLayoutScope.getClass();
                constraintLayoutScope.reset();
                GapComposer gapComposer3 = (GapComposer) composer2;
                gapComposer3.startReplaceGroup(589925498);
                ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) constraintLayoutScope.createRefs().mClientFragmentManager;
                ConstrainedLayoutReference createRef = constraintLayoutScope2.createRef();
                ConstrainedLayoutReference createRef2 = constraintLayoutScope2.createRef();
                Object rememberedValue4 = gapComposer3.rememberedValue();
                if (rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = LoadableContentKt$LoadableFullScreenContent$3$1$1$1.INSTANCE;
                    gapComposer3.updateRememberedValue(rememberedValue4);
                }
                ProgressCircularKt.ProgressCircular(0, 0, gapComposer3, ConstraintLayoutScope.constrainAs(companion, createRef, (Function1) rememberedValue4));
                if (((String) obj5) == null) {
                    gapComposer3.startReplaceGroup(590073490);
                    gapComposer3.end(false);
                } else {
                    gapComposer3.startReplaceGroup(590073491);
                    String str = (String) obj5;
                    boolean changed5 = gapComposer3.changed(createRef);
                    Object rememberedValue5 = gapComposer3.rememberedValue();
                    if (changed5 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new QuickPayViewKt$QuickPay$1$1$1$4$1(createRef, i3);
                        gapComposer3.updateRememberedValue(rememberedValue5);
                    }
                    Modifier constrainAs = ConstraintLayoutScope.constrainAs(companion, createRef2, (Function1) rememberedValue5);
                    ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(constrainAs, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    TextStyle textStyle = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                    Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, colors.semantic.text.subtle, (Composer) gapComposer3, m302paddingqDBjuR0$default, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    gapComposer3.end(false);
                }
                gapComposer3.end(false);
                return Unit.INSTANCE;
            default:
                Composer composer3 = (Composer) obj;
                ThreeDsViewModel threeDsViewModel = (ThreeDsViewModel) obj5;
                ConstraintLayoutScope constraintLayoutScope3 = (ConstraintLayoutScope) obj4;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    GapComposer gapComposer4 = (GapComposer) composer3;
                    if (gapComposer4.getSkipping()) {
                        gapComposer4.skipToGroupEnd();
                        return Unit.INSTANCE;
                    }
                }
                ((MutableState) obj3).setValue(Unit.INSTANCE);
                constraintLayoutScope3.getClass();
                constraintLayoutScope3.reset();
                GapComposer gapComposer5 = (GapComposer) composer3;
                gapComposer5.startReplaceGroup(-1506493045);
                ConstraintLayoutScope constraintLayoutScope4 = (ConstraintLayoutScope) constraintLayoutScope3.createRefs().mClientFragmentManager;
                ConstrainedLayoutReference createRef3 = constraintLayoutScope4.createRef();
                ConstrainedLayoutReference createRef4 = constraintLayoutScope4.createRef();
                ConstrainedLayoutReference createRef5 = constraintLayoutScope4.createRef();
                Object rememberedValue6 = gapComposer5.rememberedValue();
                if (rememberedValue6 == neverEqualPolicy) {
                    rememberedValue6 = ThreeDsViewKt$ThreeDsProgress$1$1$1.INSTANCE;
                    gapComposer5.updateRememberedValue(rememberedValue6);
                }
                Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                ProgressCircularKt.ProgressCircular(0, 0, gapComposer5, ConstraintLayoutScope.constrainAs(companion2, createRef3, (Function1) rememberedValue6));
                String progressMessage = threeDsViewModel.getProgressMessage();
                if (progressMessage == null) {
                    gapComposer5.startReplaceGroup(-1506357267);
                    gapComposer5.end(false);
                } else {
                    gapComposer5.startReplaceGroup(-1506357266);
                    boolean changed6 = gapComposer5.changed(createRef3);
                    Object rememberedValue7 = gapComposer5.rememberedValue();
                    if (changed6 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new QuickPayViewKt$QuickPay$1$1$1$4$1(createRef3, 15);
                        gapComposer5.updateRememberedValue(rememberedValue7);
                    }
                    Modifier constrainAs2 = ConstraintLayoutScope.constrainAs(companion2, createRef4, (Function1) rememberedValue7);
                    ((DefaultSizes) gapComposer5.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(constrainAs2, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    TextStyle textStyle2 = ((Typography) gapComposer5.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                    Colors colors2 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                    } else {
                        gapComposer5.startReplaceGroup(-1762997739);
                        gapComposer5.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, colors2.semantic.text.subtle, (Composer) gapComposer5, m302paddingqDBjuR0$default2, textStyle2, (TextLineBalancing) null, progressMessage, (Map) null, (Function1) null, false);
                    gapComposer5.end(false);
                }
                ((DefaultSizes) gapComposer5.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m302paddingqDBjuR0$default3 = SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7);
                Object rememberedValue8 = gapComposer5.rememberedValue();
                if (rememberedValue8 == neverEqualPolicy) {
                    rememberedValue8 = ThreeDsViewKt$ThreeDsProgress$1$1$1.INSTANCE$1;
                    gapComposer5.updateRememberedValue(rememberedValue8);
                }
                Modifier constrainAs3 = ConstraintLayoutScope.constrainAs(m302paddingqDBjuR0$default3, createRef5, (Function1) rememberedValue8);
                if (threeDsViewModel instanceof ThreeDsViewModel.DefaultLoading) {
                    gapComposer5.startReplaceGroup(-1505738041);
                    gapComposer5.end(false);
                } else {
                    if (!(threeDsViewModel instanceof ThreeDsViewModel.IssuerLoading)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer5, 2029636248, false);
                    }
                    gapComposer5.startReplaceGroup(-1505676382);
                    ImageKt.Image(AsyncImageKt.m1446rememberAsyncImagePainter19ie5dc(0, 30, gapComposer5, ThemablesKt.urlForTheme(((ThreeDsViewModel.IssuerLoading) threeDsViewModel).issuerLogo, gapComposer5)), null, SizeKt.m277height3ABfNKs(constrainAs3, 48.0f), null, ContentScale.Companion.FillHeight, RecyclerView.DECELERATION_RATE, null, gapComposer5, 24624, 104);
                    gapComposer5.end(false);
                }
                gapComposer5.end(false);
                return Unit.INSTANCE;
        }
    }
}
