package com.google.android.material.math;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.play.core.splitinstall.internal.zzai;
import com.google.android.play.core.splitinstall.internal.zzbk;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.family.safetyhub.views.SafetyHubViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.genericelements.viewmodels.GenericComponentViewModel;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewEvent;
import com.squareup.cash.money.booklet.MoneyTabBookletKt$$ExternalSyntheticLambda4;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public abstract class MathUtils {
    public static final void DetailedCardWidget(final GenericComponentViewModel.DetailedCardViewModel detailedCardViewModel, final Function1 function1, Composer composer, int i) {
        int i2;
        String clickableLabel;
        detailedCardViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1870095187);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(detailedCardViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        final int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier modifier = Modifier.Companion.$$INSTANCE;
            SizeKt.fillMaxWidth(modifier, 1.0f);
            if (detailedCardViewModel.showDropShadow) {
                modifier = KeypadKt.m3658mooncakeShadowWMci_g0$default(modifier, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f), 23);
            }
            int i4 = i2 & 112;
            boolean changedInstance = gapComposer.changedInstance(detailedCardViewModel) | (i4 == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new Function0() { // from class: com.squareup.cash.genericelements.components.components.DetailedCardWidgetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i5 = r3;
                        Function1 function12 = function1;
                        GenericComponentViewModel.DetailedCardViewModel detailedCardViewModel2 = detailedCardViewModel;
                        switch (i5) {
                            case 0:
                                GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent = detailedCardViewModel2.viewAnalyticsEvent;
                                if (viewAnalyticsEvent != null) {
                                    function12.invoke(viewAnalyticsEvent);
                                }
                                break;
                            default:
                                GenericTreeElementsViewEvent genericTreeElementsViewEvent = detailedCardViewModel2.event;
                                if (genericTreeElementsViewEvent != null) {
                                    function12.invoke(genericTreeElementsViewEvent);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier onVisible$default = VisibleKt.onVisible$default(modifier, (Function0) rememberedValue);
            GenericTreeElementsViewEvent genericTreeElementsViewEvent = detailedCardViewModel.event;
            if (genericTreeElementsViewEvent == null) {
                gapComposer.startReplaceGroup(1985369436);
                gapComposer.end(false);
                clickableLabel = null;
            } else {
                gapComposer.startReplaceGroup(1865159493);
                clickableLabel = zzbk.toClickableLabel(genericTreeElementsViewEvent, gapComposer);
                gapComposer.end(false);
            }
            long backgroundColor = zzai.getBackgroundColor(detailedCardViewModel.backgroundColor, gapComposer);
            int i5 = (gapComposer.changedInstance(detailedCardViewModel) ? 1 : 0) | (i4 == 32 ? 1 : 0);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (i5 != 0 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new Function0() { // from class: com.squareup.cash.genericelements.components.components.DetailedCardWidgetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i52 = i3;
                        Function1 function12 = function1;
                        GenericComponentViewModel.DetailedCardViewModel detailedCardViewModel2 = detailedCardViewModel;
                        switch (i52) {
                            case 0:
                                GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent = detailedCardViewModel2.viewAnalyticsEvent;
                                if (viewAnalyticsEvent != null) {
                                    function12.invoke(viewAnalyticsEvent);
                                }
                                break;
                            default:
                                GenericTreeElementsViewEvent genericTreeElementsViewEvent2 = detailedCardViewModel2.event;
                                if (genericTreeElementsViewEvent2 != null) {
                                    function12.invoke(genericTreeElementsViewEvent2);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            KeypadKt.m3641CardIkByU14(onVisible$default, null, backgroundColor, false, (Function0) rememberedValue2, clickableLabel, null, Expect_jvmKt.rememberComposableLambda(-1465065833, new MoneyTabBookletKt$$ExternalSyntheticLambda4(3, (Object) detailedCardViewModel, function1), gapComposer), gapComposer, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SafetyHubViewKt$$ExternalSyntheticLambda0(detailedCardViewModel, function1, i, 27);
        }
    }

    public static float dist(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f3 - f, f4 - f2);
    }

    public static float distanceToFurthestCorner(float f, float f2, float f3, float f4) {
        float dist = dist(f, f2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
        float dist2 = dist(f, f2, f3, RecyclerView.DECELERATION_RATE);
        float dist3 = dist(f, f2, f3, f4);
        float dist4 = dist(f, f2, RecyclerView.DECELERATION_RATE, f4);
        return (dist <= dist2 || dist <= dist3 || dist <= dist4) ? (dist2 <= dist3 || dist2 <= dist4) ? dist3 > dist4 ? dist3 : dist4 : dist2 : dist;
    }

    public static float lerp(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public abstract SelfieWorkflow.Screen.OldCameraScreen.Overlay getOverlay();
}
