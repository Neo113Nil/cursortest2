package com.squareup.cash.limits.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.common.viewmodels.CashTagSymbol;
import com.squareup.cash.instruments.screens.TransferOptionPickerSelectedOption;
import com.squareup.cash.localization.screens.LanguageDisclosureScreen;
import com.squareup.cash.marketcapabilities.screens.MarketCapabilitiesErrorScreen;
import com.squareup.cash.merchant.screens.BackNavigationAction;
import com.squareup.cash.merchant.screens.MerchantScreen$MerchantAnalytics;
import com.squareup.cash.merchant.screens.MerchantScreen$MerchantBlockingScreen;
import com.squareup.cash.merchant.screens.MerchantScreen$MerchantInfoFeedbackBottomSheetScreen;
import com.squareup.cash.merchant.screens.MerchantScreen$MerchantProfileScreen;
import com.squareup.cash.merchant.screens.SquareLoyaltyDetailsScreen;
import com.squareup.cash.merchant.screens.SquareLoyaltySheetScreen;
import com.squareup.cash.money.analytics.MoneyAnalyticsService$Companion$Source;
import com.squareup.cash.money.booklet.MoneyTabBookletScreen;
import com.squareup.cash.money.screens.HypeWelcomeScreen;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.moneybot.backend.api.model.chat.ChatKickoffParams;
import com.squareup.cash.moneybot.backend.api.model.chat.Message;
import com.squareup.cash.moneybot.backend.api.model.chat.WidgetConfig$PromptMessageConfig;
import com.squareup.cash.moneybot.presenters.plugins.SavedSelectedInlineContentValue;
import com.squareup.cash.moneybot.presenters.plugins.SelectedInlineContentValue;
import com.squareup.cash.moneybot.screens.ChatSourceContext;
import com.squareup.cash.moneybot.screens.HomeItemType;
import com.squareup.cash.moneybot.screens.HomeSourceContext;
import com.squareup.cash.moneybot.screens.MoneybotAmountInputAnswer;
import com.squareup.cash.moneybot.screens.MoneybotStaticPickerOption;
import com.squareup.cash.screens.Redacted;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsContext;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.MoneyTabBookletBlocker;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class LimitsScreen implements Screen {
    public static final LimitsScreen INSTANCE = new LimitsScreen();
    public static final Parcelable.Creator<LimitsScreen> CREATOR = new Creator(0);

    /* loaded from: classes6.dex */
    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            boolean z;
            Long l;
            Message.Role role;
            boolean z2;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    parcel.readInt();
                    return LimitsScreen.INSTANCE;
                case 1:
                    int i = 0;
                    parcel.getClass();
                    String readString = parcel.readString();
                    LimitsSectionIconData createFromParcel = LimitsSectionIconData.CREATOR.createFromParcel(parcel);
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    while (i != readInt) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(LimitsCategoryData.CREATOR, parcel, arrayList, i, 1);
                    }
                    return new LimitsSectionData(readString, createFromParcel, arrayList, parcel.readString(), parcel.readString());
                case 2:
                    parcel.getClass();
                    return LimitsSectionIconData.valueOf(parcel.readString());
                case 3:
                    parcel.getClass();
                    return new LimitsSectionScreen(LimitsSectionData.CREATOR.createFromParcel(parcel));
                case 4:
                    parcel.getClass();
                    return new ProgressBarData(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), ProgressType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
                case 5:
                    parcel.getClass();
                    return ProgressType.valueOf(parcel.readString());
                case 6:
                    parcel.getClass();
                    parcel.readInt();
                    return LanguageDisclosureScreen.INSTANCE;
                case 7:
                    parcel.getClass();
                    parcel.readInt();
                    return MarketCapabilitiesErrorScreen.INSTANCE;
                case 8:
                    parcel.getClass();
                    String readString2 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        linkedHashMap = null;
                    } else {
                        int readInt2 = parcel.readInt();
                        linkedHashMap = new LinkedHashMap(readInt2);
                        for (int i2 = 0; i2 != readInt2; i2++) {
                            linkedHashMap.put(parcel.readString(), parcel.readString());
                        }
                    }
                    return new MerchantScreen$MerchantAnalytics(readString2, linkedHashMap);
                case 9:
                    parcel.getClass();
                    return new MerchantScreen$MerchantBlockingScreen(parcel.readInt() != 0);
                case 10:
                    parcel.getClass();
                    return new MerchantScreen$MerchantInfoFeedbackBottomSheetScreen(parcel.readString(), parcel.readString(), parcel.readString());
                case 11:
                    parcel.getClass();
                    return new MerchantScreen$MerchantProfileScreen((Redacted) parcel.readParcelable(MerchantScreen$MerchantProfileScreen.class.getClassLoader()), GetProfileDetailsContext.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : MerchantScreen$MerchantAnalytics.CREATOR.createFromParcel(parcel), BackNavigationAction.valueOf(parcel.readString()), parcel.readString());
                case 12:
                    parcel.getClass();
                    return new SquareLoyaltyDetailsScreen(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                case 13:
                    parcel.getClass();
                    return new SquareLoyaltySheetScreen(parcel.readString(), parcel.readString(), parcel.readString());
                case 14:
                    parcel.getClass();
                    return new MoneyTabBookletScreen((BlockersData) parcel.readParcelable(MoneyTabBookletScreen.class.getClassLoader()), (MoneyTabBookletBlocker) parcel.readParcelable(MoneyTabBookletScreen.class.getClassLoader()));
                case 15:
                    parcel.getClass();
                    return new HypeWelcomeScreen(parcel.readString(), CashTagSymbol.valueOf(parcel.readString()), parcel.readString());
                case 16:
                    parcel.getClass();
                    return new MoneyTabScreen(parcel.readInt() == 0 ? null : MoneyAnalyticsService$Companion$Source.valueOf(parcel.readString()));
                case 17:
                    parcel.getClass();
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt3);
                    int i3 = 0;
                    while (i3 != readInt3) {
                        i3 = CameraState$Type$EnumUnboxingLocalUtility.m(Message.TextMessage.CREATOR, parcel, arrayList2, i3, 1);
                    }
                    return new ChatKickoffParams(arrayList2, parcel.readInt() != 0, parcel.readString(), parcel.createByteArray());
                case 18:
                    parcel.getClass();
                    return new Message.ImageMessage(parcel.readString(), Message.Role.valueOf(parcel.readString()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
                case 19:
                    parcel.getClass();
                    String readString3 = parcel.readString();
                    Message.Role valueOf = Message.Role.valueOf(parcel.readString());
                    Long valueOf2 = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
                    String readString4 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z = false;
                        l = valueOf2;
                        role = valueOf;
                        z2 = true;
                    } else {
                        z = false;
                        l = valueOf2;
                        role = valueOf;
                        z2 = false;
                    }
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    return new Message.TextMessage(readString3, role, l, readString4, z2, z);
                case 20:
                    parcel.getClass();
                    return new WidgetConfig$PromptMessageConfig(parcel.readString());
                case 21:
                    parcel.getClass();
                    return new SavedSelectedInlineContentValue(parcel.readString(), (SelectedInlineContentValue) parcel.readParcelable(SavedSelectedInlineContentValue.class.getClassLoader()));
                case 22:
                    parcel.getClass();
                    return new SelectedInlineContentValue.Amount((Money) parcel.readParcelable(SelectedInlineContentValue.Amount.class.getClassLoader()));
                case 23:
                    parcel.getClass();
                    return new SelectedInlineContentValue.Picker(parcel.readString(), parcel.readString(), (MoneybotStaticPickerOption.Icon) parcel.readParcelable(SelectedInlineContentValue.Picker.class.getClassLoader()));
                case 24:
                    parcel.getClass();
                    return new SelectedInlineContentValue.Text(parcel.readString());
                case 25:
                    parcel.getClass();
                    return new SelectedInlineContentValue.TransferOption((TransferOptionPickerSelectedOption) parcel.readParcelable(SelectedInlineContentValue.TransferOption.class.getClassLoader()));
                case 26:
                    parcel.getClass();
                    return new ChatSourceContext(parcel.readString());
                case 27:
                    parcel.getClass();
                    return new HomeSourceContext(parcel.readString(), parcel.readInt() != 0 ? HomeItemType.valueOf(parcel.readString()) : null, parcel.readString());
                case 28:
                    parcel.getClass();
                    parcel.readInt();
                    return MoneybotAmountInputAnswer.Dismissed.INSTANCE;
                default:
                    parcel.getClass();
                    return new MoneybotAmountInputAnswer.Selected((Money) parcel.readParcelable(MoneybotAmountInputAnswer.Selected.class.getClassLoader()));
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new LimitsScreen[i];
                case 1:
                    return new LimitsSectionData[i];
                case 2:
                    return new LimitsSectionIconData[i];
                case 3:
                    return new LimitsSectionScreen[i];
                case 4:
                    return new ProgressBarData[i];
                case 5:
                    return new ProgressType[i];
                case 6:
                    return new LanguageDisclosureScreen[i];
                case 7:
                    return new MarketCapabilitiesErrorScreen[i];
                case 8:
                    return new MerchantScreen$MerchantAnalytics[i];
                case 9:
                    return new MerchantScreen$MerchantBlockingScreen[i];
                case 10:
                    return new MerchantScreen$MerchantInfoFeedbackBottomSheetScreen[i];
                case 11:
                    return new MerchantScreen$MerchantProfileScreen[i];
                case 12:
                    return new SquareLoyaltyDetailsScreen[i];
                case 13:
                    return new SquareLoyaltySheetScreen[i];
                case 14:
                    return new MoneyTabBookletScreen[i];
                case 15:
                    return new HypeWelcomeScreen[i];
                case 16:
                    return new MoneyTabScreen[i];
                case 17:
                    return new ChatKickoffParams[i];
                case 18:
                    return new Message.ImageMessage[i];
                case 19:
                    return new Message.TextMessage[i];
                case 20:
                    return new WidgetConfig$PromptMessageConfig[i];
                case 21:
                    return new SavedSelectedInlineContentValue[i];
                case 22:
                    return new SelectedInlineContentValue.Amount[i];
                case 23:
                    return new SelectedInlineContentValue.Picker[i];
                case 24:
                    return new SelectedInlineContentValue.Text[i];
                case 25:
                    return new SelectedInlineContentValue.TransferOption[i];
                case 26:
                    return new ChatSourceContext[i];
                case 27:
                    return new HomeSourceContext[i];
                case 28:
                    return new MoneybotAmountInputAnswer.Dismissed[i];
                default:
                    return new MoneybotAmountInputAnswer.Selected[i];
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
