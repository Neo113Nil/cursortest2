package com.squareup.cash.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.BottomSheetScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.BrowserOrigin;
import com.squareup.cash.cdf.browser.InfoContext;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.savings.backend.api.model.TransferConfig;
import com.squareup.cash.savings.screens.SavingsRouteInterstitialScreen;
import com.squareup.cash.savings.screens.SavingsScreen;
import com.squareup.cash.savings.screens.TransferInScreen;
import com.squareup.cash.savings.screens.TransferOutScreen$Full;
import com.squareup.cash.savings.screens.TransferProcessingScreen;
import com.squareup.cash.score.screens.ScoreHomeScreen;
import com.squareup.cash.screens.blockers.AmountSheetSavedState;
import com.squareup.cash.security.screens.PasswordDialogScreen;
import com.squareup.cash.security.screens.PasswordScreenData;
import com.squareup.cash.security.screens.SetPasswordScreen;
import com.squareup.cash.security.screens.VerifyPasswordScreen;
import com.squareup.cash.securityhub.screens.BookletId;
import com.squareup.cash.securityhub.screens.BookletScreen;
import com.squareup.cash.securityhub.screens.RecoveryGuideId;
import com.squareup.cash.securityhub.screens.RecoveryGuideScreen;
import com.squareup.cash.securityhub.screens.SecurityHubScreen;
import com.squareup.cash.shopping.autofill.screens.AutofillAnalyticsParam;
import com.squareup.cash.shopping.autofill.screens.AutofillData;
import com.squareup.cash.shopping.autofill.screens.AutofillScreen;
import com.squareup.cash.webview.android.WebViewUseCase;
import com.squareup.protos.cash.balancemover.api.v1.SavingsTransferContext;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.BlockerAction;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BoostDetailsScreen implements BottomSheetScreen, Screen {
    public static final Parcelable.Creator<BoostDetailsScreen> CREATOR = new Creator(0);
    public final PresentationContext presentationContext;
    public final BoostScreenContext$WebBrowserScreenContext screenContext;
    public final String token;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            BlockerAction blockerAction;
            Boolean valueOf;
            int i = 0;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new BoostDetailsScreen(parcel.readString(), PresentationContext.valueOf(parcel.readString()), (BoostScreenContext$WebBrowserScreenContext) parcel.readParcelable(BoostDetailsScreen.class.getClassLoader()));
                case 1:
                    parcel.getClass();
                    return new SavingsRouteInterstitialScreen((RoutingParams) parcel.readParcelable(SavingsRouteInterstitialScreen.class.getClassLoader()));
                case 2:
                    parcel.getClass();
                    return new TransferInScreen.Condensed((TransferConfig.TransferInConfig) parcel.readParcelable(TransferInScreen.Condensed.class.getClassLoader()), parcel.readString(), (SavingsScreen) parcel.readParcelable(TransferInScreen.Condensed.class.getClassLoader()), (SavingsTransferContext) parcel.readParcelable(TransferInScreen.Condensed.class.getClassLoader()));
                case 3:
                    parcel.getClass();
                    return new TransferInScreen.Full((TransferConfig.TransferInConfig) parcel.readParcelable(TransferInScreen.Full.class.getClassLoader()), parcel.readString(), (SavingsScreen) parcel.readParcelable(TransferInScreen.Full.class.getClassLoader()), (SavingsTransferContext) parcel.readParcelable(TransferInScreen.Full.class.getClassLoader()));
                case 4:
                    parcel.getClass();
                    return new TransferOutScreen$Full((Money) parcel.readParcelable(TransferOutScreen$Full.class.getClassLoader()), (Money) parcel.readParcelable(TransferOutScreen$Full.class.getClassLoader()), parcel.readString(), (TransferConfig.TransferOutConfig) parcel.readParcelable(TransferOutScreen$Full.class.getClassLoader()), (SavingsScreen) parcel.readParcelable(TransferOutScreen$Full.class.getClassLoader()), (SavingsTransferContext) parcel.readParcelable(TransferOutScreen$Full.class.getClassLoader()));
                case 5:
                    parcel.getClass();
                    return new TransferProcessingScreen(TransferProcessingScreen.Direction.valueOf(parcel.readString()), (Money) parcel.readParcelable(TransferProcessingScreen.class.getClassLoader()), parcel.readString(), (SavingsScreen) parcel.readParcelable(TransferProcessingScreen.class.getClassLoader()), (SavingsTransferContext) parcel.readParcelable(TransferProcessingScreen.class.getClassLoader()));
                case 6:
                    parcel.getClass();
                    parcel.readInt();
                    return ScoreHomeScreen.INSTANCE;
                case 7:
                    parcel.getClass();
                    return new BoostScreenContext$WebBrowserScreenContext(parcel.readInt() == 0 ? null : BrowserOrigin.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : InfoContext.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
                case 8:
                    parcel.getClass();
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    while (i != readInt) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(RedactedParcelableList.class, parcel, arrayList, i, 1);
                    }
                    return new RedactedParcelableList(arrayList);
                case 9:
                    parcel.getClass();
                    int readInt2 = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(readInt2);
                    for (int i2 = 0; i2 != readInt2; i2++) {
                        linkedHashMap.put(parcel.readString(), parcel.readString());
                    }
                    return new RedactedParcelableStringMap(linkedHashMap);
                case 10:
                    parcel.getClass();
                    return new RedactedStringList(parcel.createStringArrayList());
                case 11:
                    parcel.getClass();
                    return new AmountSheetSavedState.AmountKeypadState(parcel.readString());
                case 12:
                    parcel.getClass();
                    return new AmountSheetSavedState.AmountSelectorState(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
                case 13:
                    parcel.getClass();
                    return new PasswordDialogScreen(PasswordDialogScreen.PasswordDialog.CREATOR.createFromParcel(parcel));
                case 14:
                    parcel.getClass();
                    return PasswordDialogScreen.PasswordDialog.Action.valueOf(parcel.readString());
                case 15:
                    parcel.getClass();
                    return new PasswordDialogScreen.PasswordDialog.Button(parcel.readString(), parcel.readString(), PasswordDialogScreen.PasswordDialog.Style.valueOf(parcel.readString()), PasswordDialogScreen.PasswordDialog.Action.CREATOR.createFromParcel(parcel));
                case 16:
                    parcel.getClass();
                    return new PasswordDialogScreen.PasswordDialog(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PasswordDialogScreen.PasswordDialog.Button.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PasswordDialogScreen.PasswordDialog.Button.CREATOR.createFromParcel(parcel));
                case 17:
                    parcel.getClass();
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    BlockerAction blockerAction2 = (BlockerAction) parcel.readParcelable(PasswordScreenData.class.getClassLoader());
                    if (parcel.readInt() == 0) {
                        valueOf = null;
                        blockerAction = blockerAction2;
                    } else {
                        blockerAction = blockerAction2;
                        valueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new PasswordScreenData(readString, readString2, readString3, blockerAction, valueOf);
                case 18:
                    parcel.getClass();
                    return new SetPasswordScreen((BlockersData) parcel.readParcelable(SetPasswordScreen.class.getClassLoader()), PasswordScreenData.CREATOR.createFromParcel(parcel));
                case 19:
                    parcel.getClass();
                    return new VerifyPasswordScreen((BlockersData) parcel.readParcelable(VerifyPasswordScreen.class.getClassLoader()), PasswordScreenData.CREATOR.createFromParcel(parcel));
                case 20:
                    parcel.getClass();
                    return BookletId.valueOf(parcel.readString());
                case 21:
                    parcel.getClass();
                    return new BookletScreen(BookletId.CREATOR.createFromParcel(parcel));
                case 22:
                    parcel.getClass();
                    return RecoveryGuideId.valueOf(parcel.readString());
                case 23:
                    parcel.getClass();
                    return new RecoveryGuideScreen(RecoveryGuideId.CREATOR.createFromParcel(parcel));
                case 24:
                    parcel.getClass();
                    return new SecurityHubScreen(parcel.readInt() != 0 ? SecurityHubScreen.Source.CREATOR.createFromParcel(parcel) : null);
                case 25:
                    parcel.getClass();
                    return SecurityHubScreen.Source.valueOf(parcel.readString());
                case 26:
                    parcel.getClass();
                    return new AutofillAnalyticsParam(parcel.readInt() != 0 ? BrowserOrigin.valueOf(parcel.readString()) : null, InfoContext.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
                case 27:
                    parcel.getClass();
                    return new AutofillData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 28:
                    parcel.getClass();
                    return new AutofillScreen.OfferAutofillScreen(WebViewUseCase.valueOf(parcel.readString()), parcel.readString(), (Redacted) parcel.readParcelable(AutofillScreen.OfferAutofillScreen.class.getClassLoader()), (Redacted) parcel.readParcelable(AutofillScreen.OfferAutofillScreen.class.getClassLoader()), parcel.readInt() != 0 ? AutofillAnalyticsParam.CREATOR.createFromParcel(parcel) : null, (AskedQuestion) parcel.readParcelable(AutofillScreen.OfferAutofillScreen.class.getClassLoader()));
                default:
                    parcel.getClass();
                    return new AutofillScreen.SaveAutofillScreen((Redacted) parcel.readParcelable(AutofillScreen.SaveAutofillScreen.class.getClassLoader()), parcel.readInt() != 0 ? AutofillAnalyticsParam.CREATOR.createFromParcel(parcel) : null, (AskedQuestion) parcel.readParcelable(AutofillScreen.SaveAutofillScreen.class.getClassLoader()));
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new BoostDetailsScreen[i];
                case 1:
                    return new SavingsRouteInterstitialScreen[i];
                case 2:
                    return new TransferInScreen.Condensed[i];
                case 3:
                    return new TransferInScreen.Full[i];
                case 4:
                    return new TransferOutScreen$Full[i];
                case 5:
                    return new TransferProcessingScreen[i];
                case 6:
                    return new ScoreHomeScreen[i];
                case 7:
                    return new BoostScreenContext$WebBrowserScreenContext[i];
                case 8:
                    return new RedactedParcelableList[i];
                case 9:
                    return new RedactedParcelableStringMap[i];
                case 10:
                    return new RedactedStringList[i];
                case 11:
                    return new AmountSheetSavedState.AmountKeypadState[i];
                case 12:
                    return new AmountSheetSavedState.AmountSelectorState[i];
                case 13:
                    return new PasswordDialogScreen[i];
                case 14:
                    return new PasswordDialogScreen.PasswordDialog.Action[i];
                case 15:
                    return new PasswordDialogScreen.PasswordDialog.Button[i];
                case 16:
                    return new PasswordDialogScreen.PasswordDialog[i];
                case 17:
                    return new PasswordScreenData[i];
                case 18:
                    return new SetPasswordScreen[i];
                case 19:
                    return new VerifyPasswordScreen[i];
                case 20:
                    return new BookletId[i];
                case 21:
                    return new BookletScreen[i];
                case 22:
                    return new RecoveryGuideId[i];
                case 23:
                    return new RecoveryGuideScreen[i];
                case 24:
                    return new SecurityHubScreen[i];
                case 25:
                    return new SecurityHubScreen.Source[i];
                case 26:
                    return new AutofillAnalyticsParam[i];
                case 27:
                    return new AutofillData[i];
                case 28:
                    return new AutofillScreen.OfferAutofillScreen[i];
                default:
                    return new AutofillScreen.SaveAutofillScreen[i];
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class PresentationContext {
        public static final /* synthetic */ PresentationContext[] $VALUES;
        public static final PresentationContext BOOST_PICKER;

        static {
            PresentationContext presentationContext = new PresentationContext("BOOST_PICKER", 0);
            BOOST_PICKER = presentationContext;
            $VALUES = new PresentationContext[]{presentationContext, new PresentationContext("UPSELL", 1)};
        }

        public static PresentationContext valueOf(String str) {
            return (PresentationContext) Enum.valueOf(PresentationContext.class, str);
        }

        public static PresentationContext[] values() {
            return (PresentationContext[]) $VALUES.clone();
        }
    }

    public BoostDetailsScreen(String str, PresentationContext presentationContext, BoostScreenContext$WebBrowserScreenContext boostScreenContext$WebBrowserScreenContext) {
        str.getClass();
        presentationContext.getClass();
        this.token = str;
        this.presentationContext = presentationContext;
        this.screenContext = boostScreenContext$WebBrowserScreenContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoostDetailsScreen)) {
            return false;
        }
        BoostDetailsScreen boostDetailsScreen = (BoostDetailsScreen) obj;
        return Intrinsics.areEqual(this.token, boostDetailsScreen.token) && this.presentationContext == boostDetailsScreen.presentationContext && Intrinsics.areEqual(this.screenContext, boostDetailsScreen.screenContext);
    }

    public final int hashCode() {
        int hashCode = (this.presentationContext.hashCode() + (this.token.hashCode() * 31)) * 31;
        BoostScreenContext$WebBrowserScreenContext boostScreenContext$WebBrowserScreenContext = this.screenContext;
        return hashCode + (boostScreenContext$WebBrowserScreenContext == null ? 0 : boostScreenContext$WebBrowserScreenContext.hashCode());
    }

    public final String toString() {
        return "BoostDetailsScreen(token=" + this.token + ", presentationContext=" + this.presentationContext + ", screenContext=" + this.screenContext + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.token);
        parcel.writeString(this.presentationContext.name());
        parcel.writeParcelable(this.screenContext, i);
    }
}
