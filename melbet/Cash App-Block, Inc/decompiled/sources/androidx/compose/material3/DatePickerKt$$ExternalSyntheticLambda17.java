package androidx.compose.material3;

import android.graphics.Bitmap;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.view.ViewKt;
import app.cash.arcade.values.ButtonProminence;
import app.cash.local.views.fulfillment.FulfillmentRadioCellKt;
import app.cash.local.views.internal.ExpandableSectionHeaderData;
import app.cash.local.views.internal.ExpandableSectionStyle;
import app.cash.local.views.internal.LocalMapKt;
import coil3.size.SizeKt;
import com.google.android.gms.internal.mlkit_vision_common.zzb;
import com.squareup.cash.account.components.AccountToDoKt;
import com.squareup.cash.account.settings.viewmodels.AccountAvatarViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.views.homesection.v3.AfterpayCardKt;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.InlineMessageButtonScope;
import com.squareup.cash.bitcoin.viewmodels.MoveBitcoinModel;
import com.squareup.cash.bitcoin.views.keypad.BitcoinKeypadAmountPickerKt;
import com.squareup.cash.bitcoin.views.keypad.BitcoinKeypadAmountPickerModel;
import com.squareup.cash.bitcoin.views.send.MoveBitcoinViewKt;
import com.squareup.cash.data.profile.ProfilesKt;
import com.squareup.cash.fidesmo.views.FidesmoProvisioningViewKt;
import com.squareup.cash.moneybot.widgets.ComposerKt;
import com.squareup.cash.moneybot.widgets.ComposerSharedElementKeys;
import com.squareup.cash.moneybot.widgets.ComposerSharedTransitionScope;
import com.squareup.cash.offers.views.UtilsKt;
import com.squareup.cash.pools.views.PoolToastKt;
import com.squareup.cash.score.views.CalloutKt;
import com.squareup.cash.support.chat.views.transcript.message.compose.MessageFileKt;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.wallet.views.CardNuxState;
import com.squareup.cash.wallet.views.RevolvingInteractiveCardsKt;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.lending.sync_values.ToggleEntryPointData;
import com.squareup.protos.cash.ui.Icon;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.uicore.elements.FieldValidationMessage$Error;
import com.stripe.android.uicore.elements.PhoneNumberController;
import com.stripe.android.uicore.elements.SectionUIKt;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class DatePickerKt$$ExternalSyntheticLambda17 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ boolean f$4;
    public final /* synthetic */ int f$6;

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda17(int i, Modifier modifier, String str, String str2, Function0 function0, boolean z) {
        this.$r8$classId = 9;
        this.f$2 = str;
        this.f$1 = str2;
        this.f$4 = z;
        this.f$0 = function0;
        this.f$3 = modifier;
        this.f$6 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$6;
        Object obj3 = this.f$2;
        Object obj4 = this.f$3;
        Object obj5 = this.f$1;
        Object obj6 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(1);
                DatePickerKt.IconButtonWithTooltip((Function0) obj6, (ImageVector) obj5, (String) obj3, (Modifier) obj4, this.f$4, (Composer) obj, updateChangedFlags, this.f$6);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                FulfillmentRadioCellKt.FulfillmentCtaGroup((ArrayList) obj5, (String) obj3, this.f$4, (Function0) obj6, (Function1) obj4, (Composer) obj, updateChangedFlags2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i2 | 1);
                LocalMapKt.LocalExpandableSection((Modifier) obj4, (ExpandableSectionHeaderData) obj6, (ComposableLambdaImpl) obj5, (ExpandableSectionStyle) obj3, this.f$4, (Composer) obj, updateChangedFlags3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int updateChangedFlags4 = Updater.updateChangedFlags(i2 | 1);
                LocalMapKt.LocalExpandableSection((Modifier) obj4, (ComposableLambdaImpl) obj6, (ComposableLambdaImpl) obj5, (ExpandableSectionStyle) obj3, this.f$4, (Composer) obj, updateChangedFlags4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int updateChangedFlags5 = Updater.updateChangedFlags(i2 | 1);
                AccountToDoKt.QrCode((Bitmap) obj6, (AccountAvatarViewModel) obj5, this.f$4, (Function1) obj3, (Modifier) obj4, (Composer) obj, updateChangedFlags5);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int updateChangedFlags6 = Updater.updateChangedFlags(i2 | 1);
                AfterpayCardKt.DateRow((Modifier) obj4, (List) obj6, (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate) obj5, (Function1) obj3, this.f$4, (Composer) obj, updateChangedFlags6);
                break;
            case 6:
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj3;
                Composer composer = (Composer) obj;
                ((Integer) obj2).getClass();
                int updateChangedFlags7 = Updater.updateChangedFlags(i2 | 1);
                ((InlineMessageButtonScope) obj5).SecondaryButton(updateChangedFlags7, composer, composableLambdaImpl, (Modifier) obj4, (Function0) obj6, this.f$4);
                break;
            case 7:
                ((Integer) obj2).getClass();
                int updateChangedFlags8 = Updater.updateChangedFlags(i2 | 1);
                SizeKt.PrimaryModalButtonDestructive((Function0) obj6, (Modifier) obj4, this.f$4, (MutableInteractionSourceImpl) obj5, (ComposableLambdaImpl) obj3, (Composer) obj, updateChangedFlags8);
                break;
            case 8:
                ((Integer) obj2).getClass();
                int updateChangedFlags9 = Updater.updateChangedFlags(i2 | 1);
                BitcoinKeypadAmountPickerKt.KeypadHeader((BitcoinKeypadAmountPickerModel) obj5, (Function0) obj6, this.f$4, (Function0) obj3, (Modifier) obj4, (Composer) obj, updateChangedFlags9);
                break;
            case 9:
                Composer composer2 = (Composer) obj;
                ((Integer) obj2).getClass();
                int updateChangedFlags10 = Updater.updateChangedFlags(i2 | 1);
                BitcoinKeypadAmountPickerKt.SubtitleOrError(updateChangedFlags10, composer2, (Modifier) obj4, (String) obj3, (String) obj5, (Function0) obj6, this.f$4);
                break;
            case 10:
                ((Integer) obj2).getClass();
                int updateChangedFlags11 = Updater.updateChangedFlags(i2 | 1);
                MoveBitcoinViewKt.MoveBitcoinView((MoveBitcoinModel) obj6, this.f$4, (Function1) obj5, (RealCashVibrator) obj3, (Modifier) obj4, (Composer) obj, updateChangedFlags11);
                break;
            case 11:
                ((Integer) obj2).getClass();
                int updateChangedFlags12 = Updater.updateChangedFlags(i2 | 1);
                FidesmoProvisioningViewKt.ScanningInstructionBlock((String) obj3, (Integer) obj6, this.f$4, (String) obj5, (Modifier) obj4, (Composer) obj, updateChangedFlags12);
                break;
            case 12:
                ((Integer) obj2).getClass();
                int updateChangedFlags13 = Updater.updateChangedFlags(i2 | 1);
                ViewfinderDefaults.RotatingInChatPromptStack((Modifier) obj4, (List) obj6, this.f$4, (Function1) obj5, (Function1) obj3, (Composer) obj, updateChangedFlags13);
                break;
            case 13:
                ((Integer) obj2).getClass();
                int updateChangedFlags14 = Updater.updateChangedFlags(i2 | 1);
                ComposerKt.ComposerCollapsed((Modifier) obj4, (String) obj3, (ComposerSharedTransitionScope) obj6, (ComposerSharedElementKeys) obj5, this.f$4, (Composer) obj, updateChangedFlags14);
                break;
            case 14:
                ((Integer) obj2).getClass();
                int updateChangedFlags15 = Updater.updateChangedFlags(i2 | 1);
                UtilsKt.OffersPullToRefresh((Modifier) obj4, (Function0) obj6, this.f$4, (String) obj3, (ComposableLambdaImpl) obj5, (Composer) obj, updateChangedFlags15);
                break;
            case 15:
                ((Integer) obj2).getClass();
                int updateChangedFlags16 = Updater.updateChangedFlags(1);
                PoolToastKt.PoolToast((Modifier) obj4, this.f$4, (String) obj3, (String) obj6, (Icons) obj5, (Composer) obj, updateChangedFlags16, this.f$6);
                break;
            case 16:
                ((Integer) obj2).getClass();
                int updateChangedFlags17 = Updater.updateChangedFlags(24625);
                ViewKt.ArcadeButtonDefault((ButtonProminence.Id) obj5, (Modifier) obj4, this.f$4, (Function0) obj6, (ComposableLambdaImpl) obj3, (Composer) obj, updateChangedFlags17, this.f$6);
                break;
            case 17:
                ((Integer) obj2).getClass();
                int updateChangedFlags18 = Updater.updateChangedFlags(i2 | 1);
                CalloutKt.CollapsingItem((CashCreditScoreHomeData.InfoSection.CollapsingItem) obj5, this.f$4, (Function0) obj6, (Function1) obj3, (Modifier) obj4, (Composer) obj, updateChangedFlags18);
                break;
            case 18:
                ((Integer) obj2).intValue();
                int updateChangedFlags19 = Updater.updateChangedFlags(i2 | 1);
                MessageFileKt.MessageFailedRetryDropdownUI((String) obj3, this.f$4, (Function1) obj6, (Function1) obj5, (Function1) obj4, (Composer) obj, updateChangedFlags19);
                break;
            case 19:
                ((Integer) obj2).getClass();
                int updateChangedFlags20 = Updater.updateChangedFlags(i2 | 1);
                com.squareup.cash.wallet.views.UtilsKt.PrepurchaseCacToggle((Modifier) obj4, (ToggleEntryPointData.ToggleState) obj5, (Function0) obj6, (Icon) obj3, this.f$4, (Composer) obj, updateChangedFlags20);
                break;
            case 20:
                ((Integer) obj2).getClass();
                int updateChangedFlags21 = Updater.updateChangedFlags(i2 | 1);
                com.squareup.cash.wallet.views.UtilsKt.CircleButton((Modifier) obj4, this.f$4, (Icons) obj5, (Function0) obj6, (String) obj3, (Composer) obj, updateChangedFlags21);
                break;
            case 21:
                ((Integer) obj2).getClass();
                int updateChangedFlags22 = Updater.updateChangedFlags(i2 | 1);
                RevolvingInteractiveCardsKt.SwampGLCardContent((CardNuxState) obj5, (Function0) obj6, (FiniteAnimationSpec) obj3, this.f$4, (Function0) obj4, (Composer) obj, updateChangedFlags22);
                break;
            case 22:
                ((Integer) obj2).intValue();
                int updateChangedFlags23 = Updater.updateChangedFlags(i2 | 1);
                ProfilesKt.ErrorContent((Throwable) obj5, this.f$4, (Function0) obj6, (Function0) obj3, (Function1) obj4, (Composer) obj, updateChangedFlags23);
                break;
            case 23:
                ((Integer) obj2).getClass();
                int updateChangedFlags24 = Updater.updateChangedFlags(805309511);
                zzb.m2024PhoneNumberCollectionSectionfhH9uAM((PhoneNumberController) obj6, (Modifier) obj4, (ComposableLambdaImpl) obj5, this.f$4, (FocusRequester) obj3, this.f$6, (Composer) obj, updateChangedFlags24);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags25 = Updater.updateChangedFlags(i2 | 1);
                SectionUIKt.Section((ResolvableString) obj6, (FieldValidationMessage$Error) obj5, (Modifier) obj4, this.f$4, (ComposableLambdaImpl) obj3, (Composer) obj, updateChangedFlags25);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda17(Bitmap bitmap, AccountAvatarViewModel accountAvatarViewModel, boolean z, Function1 function1, Modifier modifier, int i) {
        this.$r8$classId = 4;
        this.f$0 = bitmap;
        this.f$1 = accountAvatarViewModel;
        this.f$4 = z;
        this.f$2 = function1;
        this.f$3 = modifier;
        this.f$6 = i;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda17(Modifier modifier, ToggleEntryPointData.ToggleState toggleState, Function0 function0, Icon icon, boolean z, int i) {
        this.$r8$classId = 19;
        this.f$3 = modifier;
        this.f$1 = toggleState;
        this.f$0 = function0;
        this.f$2 = icon;
        this.f$4 = z;
        this.f$6 = i;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda17(Modifier modifier, Object obj, Object obj2, Object obj3, boolean z, int i, int i2) {
        this.$r8$classId = i2;
        this.f$3 = modifier;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$4 = z;
        this.f$6 = i;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda17(Modifier modifier, String str, ComposerSharedTransitionScope composerSharedTransitionScope, ComposerSharedElementKeys composerSharedElementKeys, boolean z, int i) {
        this.$r8$classId = 13;
        this.f$3 = modifier;
        this.f$2 = str;
        this.f$0 = composerSharedTransitionScope;
        this.f$1 = composerSharedElementKeys;
        this.f$4 = z;
        this.f$6 = i;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda17(Modifier modifier, List list, boolean z, Function1 function1, Function1 function12, int i) {
        this.$r8$classId = 12;
        this.f$3 = modifier;
        this.f$0 = list;
        this.f$4 = z;
        this.f$1 = function1;
        this.f$2 = function12;
        this.f$6 = i;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda17(Modifier modifier, Function0 function0, boolean z, String str, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.$r8$classId = 14;
        this.f$3 = modifier;
        this.f$0 = function0;
        this.f$4 = z;
        this.f$2 = str;
        this.f$1 = composableLambdaImpl;
        this.f$6 = i;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda17(Modifier modifier, boolean z, Icons icons, Function0 function0, String str, int i) {
        this.$r8$classId = 20;
        this.f$3 = modifier;
        this.f$4 = z;
        this.f$1 = icons;
        this.f$0 = function0;
        this.f$2 = str;
        this.f$6 = i;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda17(Modifier modifier, boolean z, String str, String str2, Icons icons, int i, int i2) {
        this.$r8$classId = 15;
        this.f$3 = modifier;
        this.f$4 = z;
        this.f$2 = str;
        this.f$0 = str2;
        this.f$1 = icons;
        this.f$6 = i2;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda17(ButtonProminence.Id id, Modifier modifier, boolean z, Function0 function0, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.$r8$classId = 16;
        this.f$1 = id;
        this.f$3 = modifier;
        this.f$4 = z;
        this.f$0 = function0;
        this.f$2 = composableLambdaImpl;
        this.f$6 = i2;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda17(InlineMessageButtonScope inlineMessageButtonScope, Function0 function0, Modifier modifier, boolean z, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.$r8$classId = 6;
        this.f$1 = inlineMessageButtonScope;
        this.f$0 = function0;
        this.f$3 = modifier;
        this.f$4 = z;
        this.f$2 = composableLambdaImpl;
        this.f$6 = i;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda17(MoveBitcoinModel moveBitcoinModel, boolean z, Function1 function1, RealCashVibrator realCashVibrator, Modifier modifier, int i) {
        this.$r8$classId = 10;
        this.f$0 = moveBitcoinModel;
        this.f$4 = z;
        this.f$1 = function1;
        this.f$2 = realCashVibrator;
        this.f$3 = modifier;
        this.f$6 = i;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda17(BitcoinKeypadAmountPickerModel bitcoinKeypadAmountPickerModel, Function0 function0, boolean z, Function0 function02, Modifier modifier, int i) {
        this.$r8$classId = 8;
        this.f$1 = bitcoinKeypadAmountPickerModel;
        this.f$0 = function0;
        this.f$4 = z;
        this.f$2 = function02;
        this.f$3 = modifier;
        this.f$6 = i;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda17(CardNuxState cardNuxState, Function0 function0, FiniteAnimationSpec finiteAnimationSpec, boolean z, Function0 function02, int i) {
        this.$r8$classId = 21;
        this.f$1 = cardNuxState;
        this.f$0 = function0;
        this.f$2 = finiteAnimationSpec;
        this.f$4 = z;
        this.f$3 = function02;
        this.f$6 = i;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda17(ResolvableString resolvableString, FieldValidationMessage$Error fieldValidationMessage$Error, Modifier modifier, boolean z, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.$r8$classId = 24;
        this.f$0 = resolvableString;
        this.f$1 = fieldValidationMessage$Error;
        this.f$3 = modifier;
        this.f$4 = z;
        this.f$2 = composableLambdaImpl;
        this.f$6 = i;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda17(PhoneNumberController phoneNumberController, Modifier modifier, ComposableLambdaImpl composableLambdaImpl, boolean z, FocusRequester focusRequester, int i, int i2) {
        this.$r8$classId = 23;
        this.f$0 = phoneNumberController;
        this.f$3 = modifier;
        this.f$1 = composableLambdaImpl;
        this.f$4 = z;
        this.f$2 = focusRequester;
        this.f$6 = i;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda17(Serializable serializable, boolean z, Function0 function0, Function function, Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = serializable;
        this.f$4 = z;
        this.f$0 = function0;
        this.f$2 = function;
        this.f$3 = obj;
        this.f$6 = i;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda17(String str, Integer num, boolean z, String str2, Modifier modifier, int i) {
        this.$r8$classId = 11;
        this.f$2 = str;
        this.f$0 = num;
        this.f$4 = z;
        this.f$1 = str2;
        this.f$3 = modifier;
        this.f$6 = i;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda17(String str, boolean z, Function1 function1, Function1 function12, Function1 function13, int i) {
        this.$r8$classId = 18;
        this.f$2 = str;
        this.f$4 = z;
        this.f$0 = function1;
        this.f$1 = function12;
        this.f$3 = function13;
        this.f$6 = i;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda17(ArrayList arrayList, String str, boolean z, Function0 function0, Function1 function1, int i) {
        this.$r8$classId = 1;
        this.f$1 = arrayList;
        this.f$2 = str;
        this.f$4 = z;
        this.f$0 = function0;
        this.f$3 = function1;
        this.f$6 = i;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda17(Function0 function0, Modifier modifier, boolean z, MutableInteractionSourceImpl mutableInteractionSourceImpl, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.$r8$classId = 7;
        this.f$0 = function0;
        this.f$3 = modifier;
        this.f$4 = z;
        this.f$1 = mutableInteractionSourceImpl;
        this.f$2 = composableLambdaImpl;
        this.f$6 = i;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda17(Function0 function0, ImageVector imageVector, String str, Modifier modifier, boolean z, int i, int i2) {
        this.$r8$classId = 0;
        this.f$0 = function0;
        this.f$1 = imageVector;
        this.f$2 = str;
        this.f$3 = modifier;
        this.f$4 = z;
        this.f$6 = i2;
    }
}
