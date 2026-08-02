package app.cash.local.views.cart;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.ui.Modifier;
import app.cash.local.viewmodels.LocalBrandLocationOpenTabViewModel;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda28;
import coil3.size.SizeKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalBrandLocationOpenTabViewKt$$ExternalSyntheticLambda2 implements Function3 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ LocalBrandLocationOpenTabViewModel f$1;

    public /* synthetic */ LocalBrandLocationOpenTabViewKt$$ExternalSyntheticLambda2(LocalBrandLocationOpenTabViewModel localBrandLocationOpenTabViewModel, Function1 function1) {
        this.f$1 = localBrandLocationOpenTabViewModel;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        LocalBrandLocationOpenTabViewModel localBrandLocationOpenTabViewModel = this.f$1;
        switch (i) {
            case 0:
                AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                adaptiveStackScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(adaptiveStackScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier horizontalWeight = adaptiveStackScope.horizontalWeight(companion, 1.0f);
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new LocalHomeGeoViewKt$$ExternalSyntheticLambda28(1, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue, horizontalWeight, null, false, false, null, CartBannerViewKt.f39lambda$1169712896, gapComposer, 1572864, 60);
                    Modifier horizontalWeight2 = adaptiveStackScope.horizontalWeight(companion, 1.0f);
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    boolean z = localBrandLocationOpenTabViewModel.isFinishAndPayEnabled;
                    boolean changed2 = gapComposer.changed(function1);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new LocalHomeGeoViewKt$$ExternalSyntheticLambda28(2, function1);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue2, horizontalWeight2, buttonProminence, false, z, null, CartBannerViewKt.f43lambda$863789513, gapComposer, 1573248, 40);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Modifier modifier = (Modifier) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                modifier.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(modifier) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    CartBannerViewKt.LocalBrandLocationOpenTabView(modifier, localBrandLocationOpenTabViewModel, function1, gapComposer2, intValue2 & 14);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ LocalBrandLocationOpenTabViewKt$$ExternalSyntheticLambda2(Function1 function1, LocalBrandLocationOpenTabViewModel localBrandLocationOpenTabViewModel) {
        this.f$0 = function1;
        this.f$1 = localBrandLocationOpenTabViewModel;
    }
}
