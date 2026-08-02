package androidx.compose.material;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.broadway.ui.compose.UiScopeKt;
import app.cash.local.viewmodels.LocalBrandProfileViewModel;
import app.cash.local.views.composeuiview.LocalAddBrandsViewKt;
import app.cash.local.views.home.LocalGeoSellerSheetStateKt;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda3;
import app.cash.molecule.PlatformKt;
import coil3.compose.internal.UtilsKt$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.sheet.SheetPeekPosition$FixedHeight;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public final /* synthetic */ class SurfaceKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ float f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ float f$5;
    public final /* synthetic */ Object f$6;

    public /* synthetic */ SurfaceKt$$ExternalSyntheticLambda3(float f, RealSheetState realSheetState, MutableState mutableState, long j, float f2, UiCallbackModel uiCallbackModel, CoroutineScope coroutineScope) {
        this.f$3 = f;
        this.f$0 = realSheetState;
        this.f$1 = mutableState;
        this.f$2 = j;
        this.f$5 = f2;
        this.f$4 = uiCallbackModel;
        this.f$6 = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        float f = this.f$3;
        Object obj3 = this.f$6;
        Object obj4 = this.f$4;
        Object obj5 = this.f$1;
        Object obj6 = this.f$0;
        switch (i) {
            case 0:
                Modifier modifier = (Modifier) obj6;
                Shape shape = (Shape) obj5;
                BorderStroke borderStroke = (BorderStroke) obj4;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier m479surface8ww4TTg = CardKt.m479surface8ww4TTg(modifier, shape, CardKt.m480surfaceColorAtElevationcq6XJ1M(this.f$2, (DefaultElevationOverlay) gapComposer.consume(ElevationOverlayKt.LocalElevationOverlay), f, gapComposer), borderStroke, this.f$5);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new ButtonKt$$ExternalSyntheticLambda2(13);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Modifier semantics = SemanticsModifierKt.semantics(m479surface8ww4TTg, false, (Function1) rememberedValue);
                    Unit unit = Unit.INSTANCE;
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = SurfaceKt$Surface$1$2$1.INSTANCE;
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(semantics, unit, (PointerInputEventHandler) rememberedValue2);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, true);
                    int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, pointerInput);
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
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$1);
                    }
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Recorder$$ExternalSyntheticOutline2.m(0, composableLambdaImpl, gapComposer, true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                final RealSheetState realSheetState = (RealSheetState) obj6;
                MutableState mutableState = (MutableState) obj5;
                final UiCallbackModel uiCallbackModel = (UiCallbackModel) obj4;
                final CoroutineScope coroutineScope = (CoroutineScope) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Modifier alpha = AlphaKt.alpha(Modifier.Companion.$$INSTANCE, ((Boolean) mutableState.getValue()).booleanValue() ? 1.0f : RecyclerView.DECELERATION_RATE);
                    SheetPeekPosition$FixedHeight sheetPeekPosition$FixedHeight = new SheetPeekPosition$FixedHeight(2, f, false);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new LocalMapKt$$ExternalSyntheticLambda3(25);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    final long j = this.f$2;
                    final float f2 = this.f$5;
                    SheetKt.Sheet((Function0) rememberedValue3, alpha, realSheetState, sheetPeekPosition$FixedHeight, null, false, null, Expect_jvmKt.rememberComposableLambda(609154150, new Function3() { // from class: app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda21
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj7, Object obj8, Object obj9) {
                            Composer composer3 = (Composer) obj8;
                            int intValue3 = ((Integer) obj9).intValue();
                            ((PaddingValues) obj7).getClass();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxHeight(SizeKt.fillMaxWidth(companion, 1.0f), 1.0f), j, ColorKt.RectangleShape), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f2, 7);
                                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                                int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, m302paddingqDBjuR0$default);
                                ComposeUiNode.Companion.getClass();
                                Function0 function0 = ComposeUiNode.Companion.Constructor;
                                if (gapComposer3.applier == null) {
                                    Updater.invalidApplier();
                                    throw null;
                                }
                                gapComposer3.startReusableNode();
                                if (gapComposer3.inserting) {
                                    gapComposer3.createNode(function0);
                                } else {
                                    gapComposer3.useNode();
                                }
                                Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                                Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                Updater.m576setimpl(gapComposer3, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                                Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                                UiCallbackModel uiCallbackModel2 = uiCallbackModel;
                                LocalBrandProfileViewModel localBrandProfileViewModel = (LocalBrandProfileViewModel) uiCallbackModel2.model;
                                Object obj10 = coroutineScope;
                                boolean changedInstance = gapComposer3.changedInstance(obj10);
                                Object obj11 = realSheetState;
                                boolean changed = changedInstance | gapComposer3.changed(obj11) | gapComposer3.changedInstance(uiCallbackModel2);
                                Object rememberedValue4 = gapComposer3.rememberedValue();
                                if (changed || rememberedValue4 == Composer.Companion.Empty) {
                                    rememberedValue4 = new UtilsKt$$ExternalSyntheticLambda0(3, obj10, uiCallbackModel2, obj11);
                                    gapComposer3.updateRememberedValue(rememberedValue4);
                                }
                                LocalAddBrandsViewKt.LocalBrandProfileComposeUi(fillMaxSize, localBrandProfileViewModel, true, (Function1) rememberedValue4, gapComposer3, 390, 0);
                                gapComposer3.end(true);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer2), gapComposer2, 102236166, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                RealSheetState realSheetState2 = (RealSheetState) obj6;
                MutableState mutableState2 = (MutableState) obj5;
                UiCallbackModel uiCallbackModel2 = (UiCallbackModel) obj4;
                CoroutineScope coroutineScope2 = (CoroutineScope) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = SheetKt.LocalSheetInOverlayLayer;
                    Boolean bool = Boolean.FALSE;
                    Updater.CompositionLocalProvider(new ProvidedValue[]{staticProvidableCompositionLocal.defaultProvidedValue$runtime(bool), SheetKt.LocalSheetContainerAnimationEnabled.defaultProvidedValue$runtime(bool), UiScopeKt.LocalContainerSharedTransitionScope.defaultProvidedValue$runtime(null), LocalGeoSellerSheetStateKt.LocalGeoSellerSheetState.defaultProvidedValue$runtime(realSheetState2)}, Expect_jvmKt.rememberComposableLambda(-863691569, new SurfaceKt$$ExternalSyntheticLambda3(this.f$3, realSheetState2, mutableState2, this.f$2, this.f$5, uiCallbackModel2, coroutineScope2), gapComposer3), gapComposer3, 56);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SurfaceKt$$ExternalSyntheticLambda3(Modifier modifier, Shape shape, long j, float f, BorderStroke borderStroke, float f2, ComposableLambdaImpl composableLambdaImpl) {
        this.f$0 = modifier;
        this.f$1 = shape;
        this.f$2 = j;
        this.f$3 = f;
        this.f$4 = borderStroke;
        this.f$5 = f2;
        this.f$6 = composableLambdaImpl;
    }

    public /* synthetic */ SurfaceKt$$ExternalSyntheticLambda3(RealSheetState realSheetState, float f, MutableState mutableState, long j, float f2, UiCallbackModel uiCallbackModel, CoroutineScope coroutineScope) {
        this.f$0 = realSheetState;
        this.f$3 = f;
        this.f$1 = mutableState;
        this.f$2 = j;
        this.f$5 = f2;
        this.f$4 = uiCallbackModel;
        this.f$6 = coroutineScope;
    }
}
