package com.squareup.cash.payments.views.composer;

import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import coil3.RealImageLoader;
import com.squareup.cash.instruments.viewmodels.InstrumentAvatarViewModel;
import com.squareup.cash.instruments.views.InstrumentAvatarView;
import com.squareup.cash.stablecoin.views.StablecoinHomeViewKt$$ExternalSyntheticLambda10;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class ReviewPaymentKt$$ExternalSyntheticLambda11 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealImageLoader f$0;
    public final /* synthetic */ InstrumentAvatarViewModel f$1;

    public /* synthetic */ ReviewPaymentKt$$ExternalSyntheticLambda11(RealImageLoader realImageLoader, InstrumentAvatarViewModel instrumentAvatarViewModel, int i) {
        this.$r8$classId = i;
        this.f$0 = realImageLoader;
        this.f$1 = instrumentAvatarViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        final InstrumentAvatarViewModel instrumentAvatarViewModel = this.f$1;
        RealImageLoader realImageLoader = this.f$0;
        final int i2 = 2;
        final int i3 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    Modifier clip = ClipKt.clip(SpacerKt.m298padding3ABfNKs(Modifier.Companion.$$INSTANCE, 4.0f), RoundedCornerShapeKt.CircleShape);
                    boolean changedInstance = gapComposer.changedInstance(realImageLoader);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new StablecoinHomeViewKt$$ExternalSyntheticLambda10(realImageLoader, 6);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Function1 function1 = (Function1) rememberedValue;
                    boolean changed = gapComposer.changed(instrumentAvatarViewModel);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed || rememberedValue2 == neverEqualPolicy) {
                        final int i4 = r4 ? 1 : 0;
                        rememberedValue2 = new Function1() { // from class: com.squareup.cash.payments.views.composer.ReviewPaymentKt$$ExternalSyntheticLambda18
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                int i5 = i4;
                                InstrumentAvatarViewModel instrumentAvatarViewModel2 = instrumentAvatarViewModel;
                                InstrumentAvatarView instrumentAvatarView = (InstrumentAvatarView) obj3;
                                switch (i5) {
                                    case 0:
                                        instrumentAvatarView.getClass();
                                        instrumentAvatarView.setModel(instrumentAvatarViewModel2);
                                        break;
                                    case 1:
                                        instrumentAvatarView.getClass();
                                        instrumentAvatarView.setModel(instrumentAvatarViewModel2);
                                        break;
                                    default:
                                        instrumentAvatarView.getClass();
                                        instrumentAvatarView.setModel(instrumentAvatarViewModel2);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    AndroidView_androidKt.AndroidView(function1, clip, (Function1) rememberedValue2, gapComposer, 0, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, 12.0f, RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, 10);
                    boolean changedInstance2 = gapComposer2.changedInstance(realImageLoader);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new StablecoinHomeViewKt$$ExternalSyntheticLambda10(realImageLoader, 3);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    Function1 function12 = (Function1) rememberedValue3;
                    boolean changed2 = gapComposer2.changed(instrumentAvatarViewModel);
                    Object rememberedValue4 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new Function1() { // from class: com.squareup.cash.payments.views.composer.ReviewPaymentKt$$ExternalSyntheticLambda18
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                int i5 = i3;
                                InstrumentAvatarViewModel instrumentAvatarViewModel2 = instrumentAvatarViewModel;
                                InstrumentAvatarView instrumentAvatarView = (InstrumentAvatarView) obj3;
                                switch (i5) {
                                    case 0:
                                        instrumentAvatarView.getClass();
                                        instrumentAvatarView.setModel(instrumentAvatarViewModel2);
                                        break;
                                    case 1:
                                        instrumentAvatarView.getClass();
                                        instrumentAvatarView.setModel(instrumentAvatarViewModel2);
                                        break;
                                    default:
                                        instrumentAvatarView.getClass();
                                        instrumentAvatarView.setModel(instrumentAvatarViewModel2);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer2.updateRememberedValue(rememberedValue4);
                    }
                    AndroidView_androidKt.AndroidView(function12, m302paddingqDBjuR0$default, (Function1) rememberedValue4, gapComposer2, 48, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                    boolean changedInstance3 = gapComposer3.changedInstance(realImageLoader);
                    Object rememberedValue5 = gapComposer3.rememberedValue();
                    if (changedInstance3 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new StablecoinHomeViewKt$$ExternalSyntheticLambda10(realImageLoader, 7);
                        gapComposer3.updateRememberedValue(rememberedValue5);
                    }
                    Function1 function13 = (Function1) rememberedValue5;
                    boolean changed3 = gapComposer3.changed(instrumentAvatarViewModel);
                    Object rememberedValue6 = gapComposer3.rememberedValue();
                    if (changed3 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new Function1() { // from class: com.squareup.cash.payments.views.composer.ReviewPaymentKt$$ExternalSyntheticLambda18
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                int i5 = i2;
                                InstrumentAvatarViewModel instrumentAvatarViewModel2 = instrumentAvatarViewModel;
                                InstrumentAvatarView instrumentAvatarView = (InstrumentAvatarView) obj3;
                                switch (i5) {
                                    case 0:
                                        instrumentAvatarView.getClass();
                                        instrumentAvatarView.setModel(instrumentAvatarViewModel2);
                                        break;
                                    case 1:
                                        instrumentAvatarView.getClass();
                                        instrumentAvatarView.setModel(instrumentAvatarViewModel2);
                                        break;
                                    default:
                                        instrumentAvatarView.getClass();
                                        instrumentAvatarView.setModel(instrumentAvatarViewModel2);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer3.updateRememberedValue(rememberedValue6);
                    }
                    AndroidView_androidKt.AndroidView(function13, null, (Function1) rememberedValue6, gapComposer3, 0, 2);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
