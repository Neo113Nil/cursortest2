package app.cash.local.views.home;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.broadway.ui.compose.UiScopeKt;
import app.cash.local.viewmodels.home.LocalHomeGeoViewModel;
import app.cash.local.viewmodels.home.TabSheetUpperContent;
import app.cash.local.viewmodels.wallet.LocalHomeViewModel;
import app.cash.local.views.wallet.LocalHomeViewKt;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.maps.viewmodels.CashMapViewModel;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda14;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.sheet.RealSheetStateKt;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda7;
import com.squareup.cash.sheet.SheetPeekPosition$FixedHeight;
import com.squareup.cash.sheet.SheetTopCornerBehavior;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.math.MathKt__MathJVMKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalHomeGeoViewKt$$ExternalSyntheticLambda12 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ float f$0;
    public final /* synthetic */ CoroutineScope f$1;
    public final /* synthetic */ RealSheetState f$2;
    public final /* synthetic */ LocalHomeGeoViewModel f$3;
    public final /* synthetic */ ParcelableSnapshotMutableIntState f$4;
    public final /* synthetic */ long f$5;
    public final /* synthetic */ Function1 f$6;
    public final /* synthetic */ boolean f$7;
    public final /* synthetic */ BoxWithConstraintsScopeImpl f$8;
    public final /* synthetic */ Function1 f$9;

    public /* synthetic */ LocalHomeGeoViewKt$$ExternalSyntheticLambda12(float f, CoroutineScope coroutineScope, RealSheetState realSheetState, LocalHomeGeoViewModel localHomeGeoViewModel, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, long j, Function1 function1, boolean z, BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl, Function1 function12, int i) {
        this.$r8$classId = i;
        this.f$0 = f;
        this.f$1 = coroutineScope;
        this.f$2 = realSheetState;
        this.f$3 = localHomeGeoViewModel;
        this.f$4 = parcelableSnapshotMutableIntState;
        this.f$5 = j;
        this.f$6 = function1;
        this.f$7 = z;
        this.f$8 = boxWithConstraintsScopeImpl;
        this.f$9 = function12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = SheetKt.LocalSheetInOverlayLayer;
                    Boolean bool = Boolean.FALSE;
                    Updater.CompositionLocalProvider(new ProvidedValue[]{staticProvidableCompositionLocal.defaultProvidedValue$runtime(bool), UiScopeKt.LocalContainerSharedTransitionScope.defaultProvidedValue$runtime(null), SheetKt.LocalSheetContainerAnimationEnabled.defaultProvidedValue$runtime(bool)}, Expect_jvmKt.rememberComposableLambda(1104984850, new LocalHomeGeoViewKt$$ExternalSyntheticLambda12(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, 1), gapComposer), gapComposer, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    SheetPeekPosition$FixedHeight sheetPeekPosition$FixedHeight = new SheetPeekPosition$FixedHeight(2, this.f$0, false);
                    final ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.f$4;
                    String stringResource = Room.stringResource(gapComposer2, parcelableSnapshotMutableIntState.getIntValue());
                    SheetTopCornerBehavior sheetTopCornerBehavior = SheetTopCornerBehavior.AlwaysRounded;
                    CoroutineScope coroutineScope = this.f$1;
                    boolean changedInstance = gapComposer2.changedInstance(coroutineScope);
                    final RealSheetState realSheetState = this.f$2;
                    boolean changed = changedInstance | gapComposer2.changed(realSheetState);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    Object obj3 = Composer.Companion.Empty;
                    if (changed || rememberedValue == obj3) {
                        rememberedValue = new SheetKt$$ExternalSyntheticLambda7(coroutineScope, realSheetState, 1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    final long j = this.f$5;
                    final LocalHomeGeoViewModel localHomeGeoViewModel = this.f$3;
                    final Function1 function1 = this.f$6;
                    final boolean z = this.f$7;
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(2069781161, new Function3() { // from class: app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda25
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            PaddingValues paddingValues = (PaddingValues) obj4;
                            Composer composer3 = (Composer) obj5;
                            int intValue3 = ((Integer) obj6).intValue();
                            paddingValues.getClass();
                            if ((intValue3 & 6) == 0) {
                                intValue3 |= ((GapComposer) composer3).changed(paddingValues) ? 4 : 2;
                            }
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxHeight(SizeKt.fillMaxWidth(companion, 1.0f), 1.0f), j, ColorKt.RectangleShape), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 64.0f, 7);
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                                int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, m302paddingqDBjuR0$default);
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
                                Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                                LocalHomeViewModel.TabContent tabContent = localHomeGeoViewModel.tabContent;
                                float mo267calculateTopPaddingD9Ej5fM = paddingValues.mo267calculateTopPaddingD9Ej5fM();
                                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = parcelableSnapshotMutableIntState;
                                boolean changed2 = gapComposer3.changed(parcelableSnapshotMutableIntState2);
                                Object rememberedValue2 = gapComposer3.rememberedValue();
                                if (changed2 || rememberedValue2 == Composer.Companion.Empty) {
                                    rememberedValue2 = new MoneyTabUIKt$$ExternalSyntheticLambda14(2, parcelableSnapshotMutableIntState2);
                                    gapComposer3.updateRememberedValue(rememberedValue2);
                                }
                                LocalHomeViewKt.m1336TabContentViewgMrHQkA(fillMaxSize, tabContent, function1, false, z, true, false, mo267calculateTopPaddingD9Ej5fM, (Function1) rememberedValue2, gapComposer3, 1772550, 0);
                                gapComposer3.end(true);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer2);
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    SheetKt.Sheet((Function0) rememberedValue, companion, realSheetState, sheetPeekPosition$FixedHeight, stringResource, false, sheetTopCornerBehavior, rememberComposableLambda, gapComposer2, 114819120, 32);
                    TabSheetUpperContent tabSheetUpperContent = localHomeGeoViewModel.tabSheetUpperContent;
                    if (tabSheetUpperContent == null) {
                        gapComposer2.startReplaceGroup(1975717920);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(1975717921);
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (rememberedValue2 == obj3) {
                            rememberedValue2 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer2);
                        }
                        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) rememberedValue2;
                        Density density = (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity);
                        final float mo236toPx0680j_4 = density.mo236toPx0680j_4(10.0f);
                        TabSheetUpperContent.Pill.LocalCashAmount localCashAmount = tabSheetUpperContent.left;
                        TabSheetUpperContent.Pill.QrScanIcon qrScanIcon = TabSheetUpperContent.Pill.QrScanIcon.INSTANCE;
                        float f = (localCashAmount.equals(qrScanIcon) || qrScanIcon.equals(qrScanIcon)) ? 104.0f : 52.0f;
                        int intValue3 = parcelableSnapshotMutableIntState2.getIntValue();
                        Integer valueOf = Integer.valueOf(intValue3);
                        if (intValue3 <= 0) {
                            valueOf = null;
                        }
                        final int intValue4 = valueOf != null ? valueOf.intValue() : MathKt__MathJVMKt.roundToInt(density.mo236toPx0680j_4(f));
                        final float mo236toPx0680j_42 = density.mo236toPx0680j_4(this.f$8.m258getMaxHeightD9Ej5fM());
                        Modifier align = BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.TopCenter);
                        boolean changed2 = gapComposer2.changed(realSheetState) | gapComposer2.changed(mo236toPx0680j_42) | gapComposer2.changed(intValue4) | gapComposer2.changed(mo236toPx0680j_4);
                        Object rememberedValue3 = gapComposer2.rememberedValue();
                        if (changed2 || rememberedValue3 == obj3) {
                            rememberedValue3 = new Function1() { // from class: app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda26
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    ((Density) obj4).getClass();
                                    return new IntOffset(MathKt__MathJVMKt.roundToInt(((RealSheetStateKt.getOffsetOrNull(RealSheetState.this.draggableState) != null ? r3.floatValue() : mo236toPx0680j_42) - intValue4) - mo236toPx0680j_4) & BodyPartID.bodyIdMax);
                                }
                            };
                            gapComposer2.updateRememberedValue(rememberedValue3);
                        }
                        Modifier alpha = AlphaKt.alpha(OffsetKt.offset(align, (Function1) rememberedValue3), 1.0f - realSheetState.getExpandProgress());
                        Object rememberedValue4 = gapComposer2.rememberedValue();
                        if (rememberedValue4 == obj3) {
                            rememberedValue4 = new MoneyTabUIKt$$ExternalSyntheticLambda14(1, parcelableSnapshotMutableIntState2);
                            gapComposer2.updateRememberedValue(rememberedValue4);
                        }
                        Modifier onSizeChanged = RulerKt.onSizeChanged(alpha, (Function1) rememberedValue4);
                        boolean z2 = ((CashMapViewModel) localHomeGeoViewModel.cashMapUiCallbackModel.model).userLocationInBoundary;
                        Function1 function12 = this.f$9;
                        boolean changed3 = gapComposer2.changed(function12);
                        Object rememberedValue5 = gapComposer2.rememberedValue();
                        if (changed3 || rememberedValue5 == obj3) {
                            rememberedValue5 = new LocalHomeGeoViewKt$$ExternalSyntheticLambda28(0, function12);
                            gapComposer2.updateRememberedValue(rememberedValue5);
                        }
                        LocalHomeGeoViewKt.LocalHomeGeoSheetUpperContent(tabSheetUpperContent, z2, (Function0) rememberedValue5, function1, onSizeChanged, gapComposer2, 0);
                        gapComposer2.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
