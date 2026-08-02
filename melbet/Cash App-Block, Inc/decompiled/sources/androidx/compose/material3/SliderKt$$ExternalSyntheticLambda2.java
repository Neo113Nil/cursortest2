package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import app.cash.local.views.fulfillment.FulfillmentRadioCellKt;
import coil3.RealImageLoader;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.views.homesection.v3.AfterpayCardKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.formview.components.FormViewCtaButtons;
import com.squareup.cash.paymentpad.viewmodels.HomeViewModel;
import com.squareup.cash.paymentpad.views.HomeViewKt;
import com.squareup.cash.pools.views.PoolToastKt;
import com.squareup.cash.ui.SplashScreenAnimationObserver;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.wallet.views.UtilsKt;
import com.squareup.protos.cash.local.client.v1.LocalText;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.features.partnerauth.SharedPartnerAuthState;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class SliderKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ int f$7;

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda2(SliderState sliderState, Modifier modifier, boolean z, SliderColors sliderColors, MutableInteractionSourceImpl mutableInteractionSourceImpl, ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, int i) {
        this.$r8$classId = 0;
        this.f$0 = sliderState;
        this.f$1 = modifier;
        this.f$2 = z;
        this.f$3 = sliderColors;
        this.f$4 = mutableInteractionSourceImpl;
        this.f$5 = composableLambdaImpl;
        this.f$6 = composableLambdaImpl2;
        this.f$7 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$7;
        Object obj3 = this.f$6;
        Object obj4 = this.f$5;
        Object obj5 = this.f$4;
        Object obj6 = this.f$3;
        Object obj7 = this.f$1;
        Object obj8 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                SliderKt.Slider((SliderState) obj8, (Modifier) obj7, this.f$2, (SliderColors) obj6, (MutableInteractionSourceImpl) obj5, (ComposableLambdaImpl) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, updateChangedFlags);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(7);
                FulfillmentRadioCellKt.FulfillmentRadioCell((Modifier) obj7, (String) obj8, (LocalText) obj6, (String) obj4, this.f$2, (MutableInteractionSourceImpl) obj5, (Function0) obj3, (Composer) obj, updateChangedFlags2, this.f$7);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i2 | 1);
                AfterpayCardKt.AfterpayAppletCalendarRow((List) obj8, (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate) obj7, this.f$2, (Function1) obj6, (Function1) obj5, (Function1) obj4, (Function1) obj3, (Composer) obj, updateChangedFlags3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int updateChangedFlags4 = Updater.updateChangedFlags(i2 | 1);
                VisibleKt.BannerCard((String) obj8, (String) obj6, (Function0) obj5, (Modifier) obj7, (String) obj4, (Function2) obj3, this.f$2, (Composer) obj, updateChangedFlags4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int i3 = FormViewCtaButtons.$r8$clinit;
                int updateChangedFlags5 = Updater.updateChangedFlags(i2 | 1);
                ((FormViewCtaButtons) obj8).CtaButton((FormViewCtaButtons.ButtonStyle) obj6, (FormViewCtaButtons.ButtonType) obj5, this.f$2, (Function0) obj3, (Modifier) obj7, (ComposableLambdaImpl) obj4, (Composer) obj, updateChangedFlags5);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int updateChangedFlags6 = Updater.updateChangedFlags(i2 | 1);
                HomeViewKt.HomeView((HomeViewModel) obj8, (Function1) obj7, (RealImageLoader) obj6, (RealCashVibrator) obj5, (ElementBoundsRegistry) obj4, (SplashScreenAnimationObserver) obj3, this.f$2, (Composer) obj, updateChangedFlags6);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int updateChangedFlags7 = Updater.updateChangedFlags(i2 | 1);
                PoolToastKt.PoolContributeAmountAtm((String) obj8, (List) obj6, (String) obj5, this.f$2, (Function1) obj4, (Function0) obj3, (Modifier) obj7, (Composer) obj, updateChangedFlags7);
                break;
            case 7:
                ((Integer) obj2).getClass();
                int updateChangedFlags8 = Updater.updateChangedFlags(i2 | 1);
                UtilsKt.NextUpCardContent((String) obj8, (String) obj6, (String) obj5, this.f$2, (Function0) obj3, (ComposableLambdaImpl) obj4, (Modifier) obj7, (Composer) obj, updateChangedFlags8);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags9 = Updater.updateChangedFlags(i2 | 1);
                ListItemKt.SharedPartnerAuth((SharedPartnerAuthState) obj8, (Function0) obj7, (Function0) obj6, (Function1) obj5, (Function1) obj4, (Function0) obj3, this.f$2, (Composer) obj, updateChangedFlags9);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda2(Modifier modifier, String str, LocalText localText, String str2, boolean z, MutableInteractionSourceImpl mutableInteractionSourceImpl, Function0 function0, int i, int i2) {
        this.$r8$classId = 1;
        this.f$1 = modifier;
        this.f$0 = str;
        this.f$3 = localText;
        this.f$5 = str2;
        this.f$2 = z;
        this.f$4 = mutableInteractionSourceImpl;
        this.f$6 = function0;
        this.f$7 = i2;
    }

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda2(FormViewCtaButtons formViewCtaButtons, FormViewCtaButtons.ButtonStyle buttonStyle, FormViewCtaButtons.ButtonType buttonType, boolean z, Function0 function0, Modifier modifier, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.$r8$classId = 4;
        this.f$0 = formViewCtaButtons;
        this.f$3 = buttonStyle;
        this.f$4 = buttonType;
        this.f$2 = z;
        this.f$6 = function0;
        this.f$1 = modifier;
        this.f$5 = composableLambdaImpl;
        this.f$7 = i;
    }

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda2(Object obj, Function function, Object obj2, Object obj3, Object obj4, Object obj5, boolean z, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = function;
        this.f$3 = obj2;
        this.f$4 = obj3;
        this.f$5 = obj4;
        this.f$6 = obj5;
        this.f$2 = z;
        this.f$7 = i;
    }

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda2(String str, String str2, String str3, boolean z, Function0 function0, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, int i) {
        this.$r8$classId = 7;
        this.f$0 = str;
        this.f$3 = str2;
        this.f$4 = str3;
        this.f$2 = z;
        this.f$6 = function0;
        this.f$5 = composableLambdaImpl;
        this.f$1 = modifier;
        this.f$7 = i;
    }

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda2(String str, String str2, Function0 function0, Modifier modifier, String str3, Function2 function2, boolean z, int i) {
        this.$r8$classId = 3;
        this.f$0 = str;
        this.f$3 = str2;
        this.f$4 = function0;
        this.f$1 = modifier;
        this.f$5 = str3;
        this.f$6 = function2;
        this.f$2 = z;
        this.f$7 = i;
    }

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda2(String str, List list, String str2, boolean z, Function1 function1, Function0 function0, Modifier modifier, int i) {
        this.$r8$classId = 6;
        this.f$0 = str;
        this.f$3 = list;
        this.f$4 = str2;
        this.f$2 = z;
        this.f$5 = function1;
        this.f$6 = function0;
        this.f$1 = modifier;
        this.f$7 = i;
    }

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda2(List list, AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate calendarDate, boolean z, Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i) {
        this.$r8$classId = 2;
        this.f$0 = list;
        this.f$1 = calendarDate;
        this.f$2 = z;
        this.f$3 = function1;
        this.f$4 = function12;
        this.f$5 = function13;
        this.f$6 = function14;
        this.f$7 = i;
    }
}
