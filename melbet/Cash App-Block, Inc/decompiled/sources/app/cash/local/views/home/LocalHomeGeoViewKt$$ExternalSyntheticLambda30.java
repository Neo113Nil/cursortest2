package app.cash.local.views.home;

import android.graphics.Bitmap;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.SelectionAdjustment$Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import app.cash.local.viewmodels.home.TabSheetUpperContent;
import app.cash.local.views.brand.checkout.CheckoutTipSectionKt;
import coil3.size.DimensionKt;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.bitcoin.views.deposits.BitcoinDepositsViewKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormEmojiPicker;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewModel;
import com.squareup.cash.money.applets.common.views.InstalledServiceAppletTileLayoutConfig;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda8;
import com.squareup.cash.offers.viewmodels.OffersHomeListingViewModel;
import com.squareup.cash.offers.views.home.OfferTileKt;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AccountViewModel;
import com.squareup.cash.onboarding.accountpicker.views.AliasPickerViewKt;
import com.squareup.cash.payments.views.GetPaidPayerOverlayKt;
import com.squareup.cash.payments.views.personalization.AlphaKt;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel;
import com.squareup.cash.support.chat.views.transcript.message.ActionBodyViewKt;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda10;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.CardAppletTile$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.views.CardAppletTileKt$$ExternalSyntheticLambda9;
import com.squareup.cash.wallet.views.CoreInteractiveCardKt;
import com.squareup.cash.wallet.views.InteractiveCardState;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewModel;
import com.squareup.cash.work.views.clockin.DisclaimerTextKt;
import com.squareup.protos.cash.cashbusinessaccounts.KybEligibilityWarning;
import com.squareup.protos.franklin.api.FormBlocker;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.uicore.elements.OTPElement;
import com.withpersona.sdk2.camera.ContextUtilsKt;
import java.io.Serializable;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$LongRef;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalHomeGeoViewKt$$ExternalSyntheticLambda30 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;

    public /* synthetic */ LocalHomeGeoViewKt$$ExternalSyntheticLambda30(Icons icons, Icons icons2, boolean z, String str, Function0 function0, int i) {
        this.$r8$classId = 8;
        this.f$0 = icons;
        this.f$3 = icons2;
        this.f$1 = z;
        this.f$4 = str;
        this.f$2 = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int m966getOffsetForPositionk4lQ0M;
        int i2 = this.$r8$classId;
        Object[] objArr = 0;
        Object obj3 = this.f$4;
        Object obj4 = this.f$3;
        Object obj5 = this.f$2;
        Object obj6 = this.f$0;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                LocalHomeGeoViewKt.LocalHomeGeoSheetUpperContent((TabSheetUpperContent) obj6, this.f$1, (Function0) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 1:
                Ref$LongRef ref$LongRef = (Ref$LongRef) obj6;
                TextFieldSelectionState textFieldSelectionState = (TextFieldSelectionState) obj5;
                Handle handle = (Handle) obj4;
                Ref$LongRef ref$LongRef2 = (Ref$LongRef) obj3;
                ref$LongRef.element = Offset.m626plusMKHz9U(ref$LongRef.element, ((Offset) obj2).packedValue);
                TextLayoutState textLayoutState = textFieldSelectionState.textLayoutState;
                TransformedTextFieldState transformedTextFieldState = textFieldSelectionState.textFieldState;
                TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
                if (layoutResult != null) {
                    MultiParagraph multiParagraph = layoutResult.multiParagraph;
                    textFieldSelectionState.m422updateHandleDraggingUv8p0NA(handle, Offset.m626plusMKHz9U(ref$LongRef2.element, ref$LongRef.element));
                    boolean z = this.f$1;
                    if (z) {
                        i = multiParagraph.m966getOffsetForPositionk4lQ0M(textFieldSelectionState.m419getHandleDragPositionF1C5BW0());
                    } else {
                        long j = transformedTextFieldState.getVisualText().selection;
                        int i3 = TextRange.$r8$clinit;
                        i = (int) (j >> 32);
                    }
                    int i4 = i;
                    if (z) {
                        long j2 = transformedTextFieldState.getVisualText().selection;
                        int i5 = TextRange.$r8$clinit;
                        m966getOffsetForPositionk4lQ0M = (int) (j2 & BodyPartID.bodyIdMax);
                    } else {
                        m966getOffsetForPositionk4lQ0M = multiParagraph.m966getOffsetForPositionk4lQ0M(textFieldSelectionState.m419getHandleDragPositionF1C5BW0());
                    }
                    int i6 = m966getOffsetForPositionk4lQ0M;
                    long j3 = transformedTextFieldState.getVisualText().selection;
                    long m423updateSelectionQkiN0lo$foundation = textFieldSelectionState.m423updateSelectionQkiN0lo$foundation(transformedTextFieldState.getVisualText(), i4, i6, z, SelectionAdjustment$Companion.CharacterWithWordAccelerate, false, false, new HapticFeedbackType(9));
                    if (TextRange.m987getCollapsedimpl(j3) || !TextRange.m987getCollapsedimpl(m423updateSelectionQkiN0lo$foundation)) {
                        transformedTextFieldState.m416selectCharsIn5zctL8(m423updateSelectionQkiN0lo$foundation);
                    }
                    break;
                } else {
                    break;
                }
            case 2:
                ((Integer) obj2).getClass();
                CheckoutTipSectionKt.TipOptionsGroup((Modifier) obj3, (List) obj6, this.f$1, (Function1) obj4, (Function0) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                BitcoinDepositsViewKt.QrCodeOrError((Bitmap) obj6, this.f$1, (Function0) obj5, (PaddingValues) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(24577));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ColorResources_androidKt.FeatureRestrictionBanner((KybEligibilityWarning.BannerDetail) obj6, (Function1) obj4, (Function2) obj5, (Modifier) obj3, this.f$1, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((ArcadeFormEmojiPicker) obj6).EmojiOptionItem((FormBlocker.Element.EmojiPickerElement.EmojiCategory.EmojiOption) obj4, this.f$1, (Function0) obj5, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ContextUtilsKt.GenericTreeElementsLoaded((GenericTreeElementsViewModel.Loaded) obj6, (Modifier) obj3, this.f$1, (Function3) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(385));
                break;
            case 7:
                ((Integer) obj2).getClass();
                SharedUIKt.InstalledServiceAppletTileContent((List) obj6, (Function2) obj5, this.f$1, (InstalledServiceAppletTileLayoutConfig) obj4, (Function2) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                LazyDslKt.QuickActionThumbButton((Icons) obj6, (Icons) obj4, this.f$1, (String) obj3, (Function0) obj5, (Composer) obj, Updater.updateChangedFlags(55));
                break;
            case 9:
                ((Integer) obj2).getClass();
                OfferTileKt.OffersHomeListing((Modifier) obj3, (OffersHomeListingViewModel) obj6, this.f$1, (ScrollState) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                AliasPickerViewKt.ArcadeAccountRowItem((Function0) obj5, (Function0) obj6, (AccountViewModel) obj4, this.f$1, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                GetPaidPayerOverlayKt.GetPaidPayerOverlay((List) obj6, (String) obj4, this.f$1, (Function0) obj5, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                AlphaKt.Tooltip((Modifier) obj3, (ComposableLambdaImpl) obj6, this.f$1, (Function0) obj5, (ComposableLambdaImpl) obj4, (Composer) obj, Updater.updateChangedFlags(24625));
                break;
            case 13:
                ((Integer) obj2).getClass();
                ActionBodyViewKt.MessageContent((String) obj6, (ChatContentViewModel.EntryViewModel.Sender) obj3, this.f$1, (Function1) obj4, (Function0) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 14:
                InteractiveCardState interactiveCardState = (InteractiveCardState) obj6;
                CardSchemeViewModel.Module.HeroCardDetails heroCardDetails = (CardSchemeViewModel.Module.HeroCardDetails) obj5;
                MutableState mutableState = (MutableState) obj4;
                MutableState mutableState2 = (MutableState) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new CardAppletTile$$ExternalSyntheticLambda0(12);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue);
                    gapComposer.startReplaceGroup(-319807014);
                    gapComposer.end(false);
                    Modifier then = clearAndSetSemantics.then(companion);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new TabToolbarsKt$$ExternalSyntheticLambda10(21, mutableState);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Function1 function1 = (Function1) rememberedValue2;
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new TabToolbarsKt$$ExternalSyntheticLambda10(22, mutableState);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    Function1 function12 = (Function1) rememberedValue3;
                    Object rememberedValue4 = gapComposer.rememberedValue();
                    if (rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new CardAppletTileKt$$ExternalSyntheticLambda9(objArr == true ? 1 : 0, mutableState2);
                        gapComposer.updateRememberedValue(rememberedValue4);
                    }
                    CoreInteractiveCardKt.AdaptiveInteractiveCard(then, interactiveCardState, heroCardDetails, this.f$1, function1, function12, null, null, (Function0) rememberedValue4, false, false, gapComposer, 100884480, 0, 1728);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 15:
                ClockInOverlayViewModel.PickerItem pickerItem = (ClockInOverlayViewModel.PickerItem) obj6;
                MutableState mutableState3 = (MutableState) obj5;
                Function1 function13 = (Function1) obj4;
                String str = (String) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(96768589, new MoneyTabUIKt$$ExternalSyntheticLambda8(this.f$1, pickerItem, mutableState3, function13, str, 3), gapComposer2), gapComposer2, 24576, 15);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 16:
                ((Integer) obj2).getClass();
                DisclaimerTextKt.DeclareCashTipContent((String) obj6, (String) obj3, (Function0) obj5, (Function1) obj4, this.f$1, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ListItemKt.VerificationSection((FocusRequester) obj6, (OTPElement) obj5, this.f$1, (Throwable) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(71));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ LocalHomeGeoViewKt$$ExternalSyntheticLambda30(Handle handle, TextFieldSelectionState textFieldSelectionState, Ref$LongRef ref$LongRef, Ref$LongRef ref$LongRef2, boolean z) {
        this.$r8$classId = 1;
        this.f$0 = ref$LongRef;
        this.f$2 = textFieldSelectionState;
        this.f$3 = handle;
        this.f$4 = ref$LongRef2;
        this.f$1 = z;
    }

    public /* synthetic */ LocalHomeGeoViewKt$$ExternalSyntheticLambda30(Modifier modifier, Object obj, boolean z, Object obj2, Function function, int i, int i2) {
        this.$r8$classId = i2;
        this.f$4 = modifier;
        this.f$0 = obj;
        this.f$1 = z;
        this.f$2 = obj2;
        this.f$3 = function;
    }

    public /* synthetic */ LocalHomeGeoViewKt$$ExternalSyntheticLambda30(Modifier modifier, List list, boolean z, Function1 function1, Function0 function0, int i) {
        this.$r8$classId = 2;
        this.f$4 = modifier;
        this.f$0 = list;
        this.f$1 = z;
        this.f$3 = function1;
        this.f$2 = function0;
    }

    public /* synthetic */ LocalHomeGeoViewKt$$ExternalSyntheticLambda30(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = z;
        this.f$3 = obj3;
        this.f$4 = obj4;
    }

    public /* synthetic */ LocalHomeGeoViewKt$$ExternalSyntheticLambda30(GenericTreeElementsViewModel.Loaded loaded, Modifier modifier, boolean z, Function3 function3, Function1 function1, int i) {
        this.$r8$classId = 6;
        this.f$0 = loaded;
        this.f$4 = modifier;
        this.f$1 = z;
        this.f$2 = function3;
        this.f$3 = function1;
    }

    public /* synthetic */ LocalHomeGeoViewKt$$ExternalSyntheticLambda30(InteractiveCardState interactiveCardState, CardSchemeViewModel.Module.HeroCardDetails heroCardDetails, boolean z, MutableState mutableState, MutableState mutableState2) {
        this.$r8$classId = 14;
        this.f$0 = interactiveCardState;
        this.f$2 = heroCardDetails;
        this.f$1 = z;
        this.f$3 = mutableState;
        this.f$4 = mutableState2;
    }

    public /* synthetic */ LocalHomeGeoViewKt$$ExternalSyntheticLambda30(KybEligibilityWarning.BannerDetail bannerDetail, Function1 function1, Function2 function2, Modifier modifier, boolean z, int i) {
        this.$r8$classId = 4;
        this.f$0 = bannerDetail;
        this.f$3 = function1;
        this.f$2 = function2;
        this.f$4 = modifier;
        this.f$1 = z;
    }

    public /* synthetic */ LocalHomeGeoViewKt$$ExternalSyntheticLambda30(Object obj, Serializable serializable, boolean z, Function0 function0, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$3 = serializable;
        this.f$1 = z;
        this.f$2 = function0;
        this.f$4 = modifier;
    }

    public /* synthetic */ LocalHomeGeoViewKt$$ExternalSyntheticLambda30(Object obj, boolean z, Function0 function0, Object obj2, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = z;
        this.f$2 = function0;
        this.f$3 = obj2;
        this.f$4 = modifier;
    }

    public /* synthetic */ LocalHomeGeoViewKt$$ExternalSyntheticLambda30(String str, ChatContentViewModel.EntryViewModel.Sender sender, boolean z, Function1 function1, Function0 function0, int i) {
        this.$r8$classId = 13;
        this.f$0 = str;
        this.f$4 = sender;
        this.f$1 = z;
        this.f$3 = function1;
        this.f$2 = function0;
    }

    public /* synthetic */ LocalHomeGeoViewKt$$ExternalSyntheticLambda30(String str, String str2, Function0 function0, Function1 function1, boolean z, int i) {
        this.$r8$classId = 16;
        this.f$0 = str;
        this.f$4 = str2;
        this.f$2 = function0;
        this.f$3 = function1;
        this.f$1 = z;
    }

    public /* synthetic */ LocalHomeGeoViewKt$$ExternalSyntheticLambda30(Function0 function0, Function0 function02, AccountViewModel accountViewModel, boolean z, Modifier modifier, int i) {
        this.$r8$classId = 10;
        this.f$2 = function0;
        this.f$0 = function02;
        this.f$3 = accountViewModel;
        this.f$1 = z;
        this.f$4 = modifier;
    }

    public /* synthetic */ LocalHomeGeoViewKt$$ExternalSyntheticLambda30(boolean z, ClockInOverlayViewModel.PickerItem pickerItem, MutableState mutableState, Function1 function1, String str) {
        this.$r8$classId = 15;
        this.f$1 = z;
        this.f$0 = pickerItem;
        this.f$2 = mutableState;
        this.f$3 = function1;
        this.f$4 = str;
    }
}
