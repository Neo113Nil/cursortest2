package com.squareup.cash.money.viewmodels.api;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.DoNotDisturbException;
import androidx.camera.camera2.pipe.compat.Camera2CameraMetadata;
import androidx.camera.camera2.pipe.internal.CameraDevicesImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.afterpayapplet.views.floatingtiles.FloatingTileRowKt$FloatingTileRow$3$1;
import com.squareup.cash.afterpayapplet.views.floatingtiles.FloatingTileRowKt$FloatingTileRow$4$1;
import com.squareup.cash.aiedge.MLKitTitleGenerator$1;
import com.squareup.cash.arcade.components.ToastKt$Toast$9$1;
import com.squareup.cash.money.core.ids.SectionId;
import com.squareup.cash.money.viewmodels.api.Section;
import com.squareup.cash.money.views.MoneyTabUIKt$MoneyTabUI$1$1$1$2$5$1;
import com.squareup.cash.nearby.views.PulsingState$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import utils.StringUtilsKt;

/* loaded from: classes6.dex */
public interface Section {

    /* loaded from: classes5.dex */
    public abstract class Header {

        /* loaded from: classes6.dex */
        public final class DividerWithText extends Header {
            public final PaddingValues dividerMargin;
            public final PaddingValues padding;
            public final String title;
            public final PaddingValues titleMargin;

            public DividerWithText(String str, PaddingValuesImpl paddingValuesImpl, int i) {
                PaddingValuesImpl paddingValuesImpl2 = new PaddingValuesImpl(16.0f, 40.0f, 16.0f, 20.0f);
                paddingValuesImpl = (i & 8) != 0 ? SpacerKt.m297PaddingValuesa9UjIt4$default(RecyclerView.DECELERATION_RATE, 20.0f, RecyclerView.DECELERATION_RATE, 16.0f, 5) : paddingValuesImpl;
                PaddingValuesImpl m297PaddingValuesa9UjIt4$default = SpacerKt.m297PaddingValuesa9UjIt4$default(16.0f, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 10);
                str.getClass();
                this.title = str;
                this.dividerMargin = paddingValuesImpl2;
                this.titleMargin = paddingValuesImpl;
                this.padding = m297PaddingValuesa9UjIt4$default;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DividerWithText)) {
                    return false;
                }
                DividerWithText dividerWithText = (DividerWithText) obj;
                return Intrinsics.areEqual(this.title, dividerWithText.title) && Intrinsics.areEqual(this.dividerMargin, dividerWithText.dividerMargin) && Intrinsics.areEqual(this.titleMargin, dividerWithText.titleMargin) && Intrinsics.areEqual(this.padding, dividerWithText.padding);
            }

            public final int hashCode() {
                return this.padding.hashCode() + ((this.titleMargin.hashCode() + ((this.dividerMargin.hashCode() + (this.title.hashCode() * 961)) * 31)) * 31);
            }

            public final String toString() {
                return "DividerWithText(title=" + this.title + ", headerBackgroundColor=null, dividerMargin=" + this.dividerMargin + ", titleMargin=" + this.titleMargin + ", padding=" + this.padding + ")";
            }
        }

        /* loaded from: classes6.dex */
        public final class Spacer extends Header {
            public final float height;

            public Spacer(float f) {
                this.height = f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Spacer) && Dp.m1037equalsimpl0(this.height, ((Spacer) obj).height);
            }

            public final int hashCode() {
                return Float.hashCode(this.height);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Spacer(height=", Dp.m1038toStringimpl(this.height), ")");
            }
        }

        /* renamed from: FloatingTileRow-9QcgTRs, reason: not valid java name */
        public static final void m3609FloatingTileRow9QcgTRs(final ArrayList arrayList, float f, float f2, final float f3, long j, double d, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
            GapComposer gapComposer;
            final float f4;
            final float f5;
            final long j2;
            final double d2;
            float f6;
            double size;
            long j3;
            float f7;
            float f8;
            MutableState mutableState;
            Long l;
            double d3;
            long j4;
            final float f9;
            LazyListState lazyListState;
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startRestartGroup(720843379);
            int i2 = i | (gapComposer2.changedInstance(arrayList) ? 4 : 2) | 90544;
            if (gapComposer2.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
                gapComposer2.startDefaults();
                if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                    f6 = 6.0f;
                    size = arrayList.size() * 3.141592653589793d;
                    j3 = 80000;
                    f7 = 30.0f;
                } else {
                    gapComposer2.skipToGroupEnd();
                    f6 = f;
                    f7 = f2;
                    j3 = j;
                    size = d;
                }
                gapComposer2.endDefaults();
                final double size2 = size / arrayList.size();
                float mo236toPx0680j_4 = ((Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(f3);
                LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(1073741823 - (1073741823 % arrayList.size()), 2, gapComposer2);
                Object rememberedValue = gapComposer2.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                MutableState mutableState2 = (MutableState) rememberedValue;
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                MutableState mutableState3 = (MutableState) rememberedValue2;
                float f10 = f6;
                Unit unit = Unit.INSTANCE;
                boolean changed = gapComposer2.changed(rememberLazyListState);
                long j5 = j3;
                Object rememberedValue3 = gapComposer2.rememberedValue();
                Continuation continuation = null;
                if (changed || rememberedValue3 == neverEqualPolicy) {
                    f8 = mo236toPx0680j_4;
                    rememberedValue3 = new MLKitTitleGenerator$1(rememberLazyListState, continuation, 8);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                } else {
                    f8 = mo236toPx0680j_4;
                }
                Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue3);
                Object rememberedValue4 = gapComposer2.rememberedValue();
                if (rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new MoneyTabUIKt$MoneyTabUI$1$1$1$2$5$1(2, mutableState2);
                    gapComposer2.updateRememberedValue(rememberedValue4);
                }
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion.$$INSTANCE, unit, (PointerInputEventHandler) rememberedValue4);
                Boolean bool = (Boolean) mutableState2.getValue();
                bool.getClass();
                boolean changed2 = gapComposer2.changed(rememberLazyListState);
                Object rememberedValue5 = gapComposer2.rememberedValue();
                if (changed2 || rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = new ToastKt$Toast$9$1(mutableState2, mutableState3, rememberLazyListState, (Continuation) null);
                    gapComposer2.updateRememberedValue(rememberedValue5);
                }
                Updater.LaunchedEffect(gapComposer2, bool, (Function2) rememberedValue5);
                Boolean bool2 = (Boolean) mutableState3.getValue();
                bool2.getClass();
                Float valueOf = Float.valueOf(f7);
                boolean changed3 = gapComposer2.changed(rememberLazyListState);
                Object rememberedValue6 = gapComposer2.rememberedValue();
                if (changed3 || rememberedValue6 == neverEqualPolicy) {
                    rememberedValue6 = new FloatingTileRowKt$FloatingTileRow$3$1(f7, rememberLazyListState, mutableState3, null);
                    gapComposer2.updateRememberedValue(rememberedValue6);
                }
                Updater.LaunchedEffect(bool2, valueOf, (Function2) rememberedValue6, gapComposer2);
                Object rememberedValue7 = gapComposer2.rememberedValue();
                if (rememberedValue7 == neverEqualPolicy) {
                    rememberedValue7 = Updater.mutableStateOf$default(Double.valueOf(0.0d));
                    gapComposer2.updateRememberedValue(rememberedValue7);
                }
                MutableState mutableState4 = (MutableState) rememberedValue7;
                Boolean bool3 = (Boolean) mutableState3.getValue();
                bool3.getClass();
                Long valueOf2 = Long.valueOf(j5);
                boolean changed4 = gapComposer2.changed(size);
                Object rememberedValue8 = gapComposer2.rememberedValue();
                if (changed4 || rememberedValue8 == neverEqualPolicy) {
                    mutableState = mutableState4;
                    l = valueOf2;
                    FloatingTileRowKt$FloatingTileRow$4$1 floatingTileRowKt$FloatingTileRow$4$1 = new FloatingTileRowKt$FloatingTileRow$4$1(size, j5, mutableState, null);
                    d3 = size;
                    j4 = j5;
                    gapComposer2.updateRememberedValue(floatingTileRowKt$FloatingTileRow$4$1);
                    rememberedValue8 = floatingTileRowKt$FloatingTileRow$4$1;
                } else {
                    j4 = j5;
                    mutableState = mutableState4;
                    l = valueOf2;
                    d3 = size;
                }
                Updater.LaunchedEffect(bool3, l, (Function2) rememberedValue8, gapComposer2);
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(pointerInput, 1.0f), RecyclerView.DECELERATION_RATE, f3, 1);
                BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
                final float f11 = f8;
                boolean changedInstance = gapComposer2.changedInstance(arrayList) | gapComposer2.changed(size2) | gapComposer2.changed(f11);
                Object rememberedValue9 = gapComposer2.rememberedValue();
                if (changedInstance || rememberedValue9 == neverEqualPolicy) {
                    f9 = f10;
                    lazyListState = rememberLazyListState;
                    final MutableState mutableState5 = mutableState;
                    Function1 function1 = new Function1() { // from class: com.squareup.cash.afterpayapplet.views.floatingtiles.FloatingTileRowKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            LazyListScope lazyListScope = (LazyListScope) obj;
                            lazyListScope.getClass();
                            final ArrayList arrayList2 = arrayList;
                            final double d4 = size2;
                            final float f12 = f11;
                            final float f13 = f9;
                            final MutableState mutableState6 = mutableState5;
                            final ComposableLambdaImpl composableLambdaImpl2 = composableLambdaImpl;
                            LazyListScope.items$default(lazyListScope, Integer.MAX_VALUE, null, new ComposableLambdaImpl(new Function4() { // from class: com.squareup.cash.afterpayapplet.views.floatingtiles.FloatingTileRowKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function4
                                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                    int intValue = ((Integer) obj3).intValue();
                                    Composer composer2 = (Composer) obj4;
                                    int intValue2 = ((Integer) obj5).intValue();
                                    ((LazyItemScopeImpl) obj2).getClass();
                                    if ((intValue2 & 48) == 0) {
                                        intValue2 |= ((GapComposer) composer2).changed(intValue) ? 32 : 16;
                                    }
                                    GapComposer gapComposer3 = (GapComposer) composer2;
                                    if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                                        ArrayList arrayList3 = arrayList2;
                                        int size3 = intValue % arrayList3.size();
                                        Object obj6 = arrayList3.get(size3);
                                        float sin = ((float) Math.sin((size3 * d4) + ((Number) mutableState6.getValue()).doubleValue())) * f12;
                                        Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, f13, RecyclerView.DECELERATION_RATE, 2);
                                        boolean changed5 = gapComposer3.changed(sin);
                                        Object rememberedValue10 = gapComposer3.rememberedValue();
                                        if (changed5 || rememberedValue10 == Composer.Companion.Empty) {
                                            rememberedValue10 = new PulsingState$$ExternalSyntheticLambda0(sin, 3);
                                            gapComposer3.updateRememberedValue(rememberedValue10);
                                        }
                                        Modifier graphicsLayer = ColorKt.graphicsLayer(m300paddingVpY3zN4$default2, (Function1) rememberedValue10);
                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                                        int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, graphicsLayer);
                                        ComposeUiNode.Companion.getClass();
                                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                        if (gapComposer3.applier == null) {
                                            Updater.invalidApplier();
                                            throw null;
                                        }
                                        gapComposer3.startReusableNode();
                                        if (gapComposer3.inserting) {
                                            gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                                        } else {
                                            gapComposer3.useNode();
                                        }
                                        Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                        Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                        Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                        Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                        composableLambdaImpl2.invoke(obj6, (Object) Integer.valueOf(size3), (Object) gapComposer3, (Object) 0);
                                        gapComposer3.end(true);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, true, 1859505183), 6);
                            return Unit.INSTANCE;
                        }
                    };
                    gapComposer2.updateRememberedValue(function1);
                    rememberedValue9 = function1;
                } else {
                    f9 = f10;
                    lazyListState = rememberLazyListState;
                }
                gapComposer = gapComposer2;
                LazyDslKt.LazyRow(m300paddingVpY3zN4$default, lazyListState, null, null, vertical, null, false, null, (Function1) rememberedValue9, gapComposer, 196608, 476);
                f4 = f9;
                f5 = f7;
                d2 = d3;
                j2 = j4;
            } else {
                gapComposer = gapComposer2;
                gapComposer.skipToGroupEnd();
                f4 = f;
                f5 = f2;
                j2 = j;
                d2 = d;
            }
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new Function2(arrayList, f4, f5, f3, j2, d2, composableLambdaImpl, i) { // from class: com.squareup.cash.afterpayapplet.views.floatingtiles.FloatingTileRowKt$$ExternalSyntheticLambda1
                    public final /* synthetic */ ArrayList f$0;
                    public final /* synthetic */ float f$1;
                    public final /* synthetic */ float f$2;
                    public final /* synthetic */ float f$3;
                    public final /* synthetic */ long f$4;
                    public final /* synthetic */ double f$5;
                    public final /* synthetic */ ComposableLambdaImpl f$6;

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int updateChangedFlags = Updater.updateChangedFlags(1575937);
                        Section.Header.m3609FloatingTileRow9QcgTRs(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, (Composer) obj, updateChangedFlags);
                        return Unit.INSTANCE;
                    }
                };
            }
        }

        public static String decideSkippedCameraIdByHeuristic(CameraDevicesImpl cameraDevicesImpl, Integer num) {
            if (num == null) {
                return null;
            }
            try {
                if (num.intValue() == 1) {
                    CameraId.m45constructorimpl("0");
                    CameraMetadata m93awaitCameraMetadataFpsL5FU$default = CameraDevicesImpl.m93awaitCameraMetadataFpsL5FU$default(cameraDevicesImpl, "0");
                    CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
                    key.getClass();
                    Integer num2 = (Integer) ((Camera2CameraMetadata) m93awaitCameraMetadataFpsL5FU$default).get(key);
                    if (num2 != null && num2.intValue() == 1) {
                        return "1";
                    }
                } else if (num.intValue() == 0) {
                    CameraId.m45constructorimpl("1");
                    CameraMetadata m93awaitCameraMetadataFpsL5FU$default2 = CameraDevicesImpl.m93awaitCameraMetadataFpsL5FU$default(cameraDevicesImpl, "1");
                    CameraCharacteristics.Key key2 = CameraCharacteristics.LENS_FACING;
                    key2.getClass();
                    Integer num3 = (Integer) ((Camera2CameraMetadata) m93awaitCameraMetadataFpsL5FU$default2).get(key2);
                    if (num3 != null && num3.intValue() == 0) {
                        return "0";
                    }
                }
                return null;
            } catch (DoNotDisturbException unused) {
                if (!StringUtilsKt.isLogLevelEnabled(6, "CXCP")) {
                    return null;
                }
                Log.e("CXCP", "Received Do Not Disturb exception while deciding camera id to skip. Please turn off Do Not Disturb mode");
                return null;
            }
        }
    }

    public interface Layout {

        public final class CardStack implements Layout {
            public static final CardStack INSTANCE = new CardStack();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CardStack);
            }

            public final int hashCode() {
                return 714635472;
            }

            public final String toString() {
                return "CardStack";
            }
        }

        public final class GroupedVerticalStack implements Layout {
            public final boolean hasCard;

            public GroupedVerticalStack(boolean z) {
                this.hasCard = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GroupedVerticalStack) && this.hasCard == ((GroupedVerticalStack) obj).hasCard;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.hasCard);
            }

            public final String toString() {
                return Fragment$5$$ExternalSyntheticOutline0.m("GroupedVerticalStack(hasCard=", ")", this.hasCard);
            }
        }

        public final class VerticalStack implements Layout {
            public final Dp interItemSpacing;
            public final Dp overrideHorizontalMargin;

            public VerticalStack(Dp dp, Dp dp2, int i) {
                dp = (i & 2) != 0 ? null : dp;
                dp2 = (i & 4) != 0 ? null : dp2;
                this.overrideHorizontalMargin = dp;
                this.interItemSpacing = dp2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof VerticalStack)) {
                    return false;
                }
                VerticalStack verticalStack = (VerticalStack) obj;
                return Intrinsics.areEqual(this.overrideHorizontalMargin, verticalStack.overrideHorizontalMargin) && Intrinsics.areEqual(this.interItemSpacing, verticalStack.interItemSpacing);
            }

            public final int hashCode() {
                Dp dp = this.overrideHorizontalMargin;
                int hashCode = (dp == null ? 0 : Float.hashCode(dp.value)) * 31;
                Dp dp2 = this.interItemSpacing;
                return hashCode + (dp2 != null ? Float.hashCode(dp2.value) : 0);
            }

            public final String toString() {
                return "VerticalStack(overrideTopMargin=null, overrideHorizontalMargin=" + this.overrideHorizontalMargin + ", interItemSpacing=" + this.interItemSpacing + ")";
            }
        }
    }

    SectionId getId();

    Layout getLayout();

    default Header header() {
        return null;
    }

    List items();
}
