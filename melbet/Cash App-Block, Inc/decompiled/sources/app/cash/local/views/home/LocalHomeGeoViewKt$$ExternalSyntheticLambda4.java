package app.cash.local.views.home;

import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.paging.CachedPageEventFlow$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.local.primitives.LocationMenu$$ExternalSyntheticLambda6;
import app.cash.local.viewmodels.home.LocalHomeGeoViewModel;
import app.cash.local.viewmodels.home.TabSheetUpperContent;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda10;
import com.squareup.cash.maps.viewmodels.CashMapViewModel;
import com.squareup.cash.maps.views.CashMapViewKt;
import com.squareup.cash.maps.views.SelectedLocationCameraReframe;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentStickersViewModel;
import com.squareup.cash.payments.views.PaymentConfigurationViewKt$$ExternalSyntheticLambda3;
import java.util.List;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt___ComparisonsJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalHomeGeoViewKt$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ float f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Function1 f$4;
    public final /* synthetic */ Object f$5;

    public /* synthetic */ LocalHomeGeoViewKt$$ExternalSyntheticLambda4(float f, LocalHomeGeoViewModel localHomeGeoViewModel, float f2, List list, Function1 function1, MutableState mutableState) {
        this.f$0 = f;
        this.f$1 = localHomeGeoViewModel;
        this.f$2 = f2;
        this.f$3 = list;
        this.f$4 = function1;
        this.f$5 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$5;
        Object obj4 = this.f$3;
        Object obj5 = this.f$1;
        int i2 = 1;
        switch (i) {
            case 0:
                LocalHomeGeoViewModel localHomeGeoViewModel = (LocalHomeGeoViewModel) obj5;
                List list = (List) obj4;
                MutableState mutableState = (MutableState) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
                    float f = this.f$0;
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(fillMaxSize, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f, 7);
                    CashMapViewModel cashMapViewModel = (CashMapViewModel) localHomeGeoViewModel.cashMapUiCallbackModel.model;
                    SelectedLocationCameraReframe selectedLocationCameraReframe = ((UiCallbackModel) mutableState.getValue()) != null ? new SelectedLocationCameraReframe(((Dp) ComparisonsKt___ComparisonsJvmKt.maxOf(new Dp(this.f$2 - f), new Dp(RecyclerView.DECELERATION_RATE))).value) : null;
                    TabSheetUpperContent tabSheetUpperContent = localHomeGeoViewModel.tabSheetUpperContent;
                    if (tabSheetUpperContent != null) {
                        TabSheetUpperContent.Pill.LocalCashAmount localCashAmount = tabSheetUpperContent.left;
                        TabSheetUpperContent.Pill.QrScanIcon qrScanIcon = TabSheetUpperContent.Pill.QrScanIcon.INSTANCE;
                        if (localCashAmount.equals(qrScanIcon) || qrScanIcon.equals(qrScanIcon)) {
                            r2 = true;
                        }
                    }
                    boolean z = !r2;
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = LocalHomeGeoViewKt$LocalHomeGeoView$2$1$1$1.INSTANCE;
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Function3 function3 = (Function3) rememberedValue;
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new LocationMenu$$ExternalSyntheticLambda6(24);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Function1 function1 = (Function1) rememberedValue2;
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new MarkerKt$$ExternalSyntheticLambda10(i2);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    Function2 function2 = (Function2) rememberedValue3;
                    boolean changedInstance = gapComposer.changedInstance(localHomeGeoViewModel);
                    Object rememberedValue4 = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new CachedPageEventFlow$$ExternalSyntheticLambda0(localHomeGeoViewModel, 26);
                        gapComposer.updateRememberedValue(rememberedValue4);
                    }
                    CashMapViewKt.CashMapView(m302paddingqDBjuR0$default, list, cashMapViewModel, function3, ComposableSingletons$LocalHomeGeoViewKt.f47lambda$1073129217, function1, function2, selectedLocationCameraReframe, null, null, (Function1) rememberedValue4, true, z, this.f$4, gapComposer, 14376960, MLKEMEngine.KyberPolyBytes, 1544);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                RealImageLoader realImageLoader = (RealImageLoader) obj5;
                PersonalizePaymentStickersViewModel personalizePaymentStickersViewModel = (PersonalizePaymentStickersViewModel) obj4;
                Context context = (Context) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-1365308862, new PaymentConfigurationViewKt$$ExternalSyntheticLambda3(this.f$0, this.f$4, personalizePaymentStickersViewModel, context, this.f$2, 2), gapComposer2), gapComposer2, 56);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ LocalHomeGeoViewKt$$ExternalSyntheticLambda4(RealImageLoader realImageLoader, float f, Function1 function1, PersonalizePaymentStickersViewModel personalizePaymentStickersViewModel, Context context, float f2) {
        this.f$1 = realImageLoader;
        this.f$0 = f;
        this.f$4 = function1;
        this.f$3 = personalizePaymentStickersViewModel;
        this.f$5 = context;
        this.f$2 = f2;
    }
}
