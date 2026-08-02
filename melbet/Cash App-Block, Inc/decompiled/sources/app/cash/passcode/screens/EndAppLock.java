package app.cash.passcode.screens;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.LocationToken;
import app.cash.local.primitives.OrderToken;
import app.cash.local.primitives.ShortlinkKey;
import app.cash.local.screens.app.LocalOrderStatusScreen;
import app.cash.local.screens.app.LocalOrdersScreen;
import app.cash.local.screens.app.LocalPosBrandOnboardingScreen;
import app.cash.local.screens.app.LocalPosCheckInScreen;
import app.cash.local.screens.app.LocalPosLocalCashRedemptionScreen;
import app.cash.local.screens.app.LocalSchedulingDayTimePickerScreen;
import app.cash.local.screens.app.LocalShortlinkSheet;
import app.cash.local.screens.app.LocalTabScreen;
import app.cash.local.screens.app.LoyaltyRewardToApplyQuestion;
import app.cash.local.screens.app.MenuItemDetailsQuestion;
import app.cash.local.screens.app.MenuPickerQuestion;
import app.cash.local.screens.app.SchedulingDayTimeQuestion;
import app.cash.local.screens.app.TableQrCodeScannerScreen;
import app.cash.local.screens.app.VehicleDescription;
import app.cash.local.screens.app.VehicleDescriptionQuestion;
import app.cash.local.viewmodels.LocalMenuComboDetailsViewModel;
import app.cash.local.viewmodels.toasts.ToastData;
import app.cash.payment.asset.PaymentData;
import app.cash.redwood.treehouse.TreehouseLayout;
import com.caverock.androidsvg.SVG;
import com.fillr.browsersdk.Fillr;
import com.fillr.browsersdk.model.FillrMappedField;
import com.fillr.browsersdk.model.FillrMappedFields;
import com.fillr.browsersdk.model.FillrMappingsHelper;
import com.fillr.core.apiclientv2.APIEndpoint;
import com.fillr.core.apiclientv2.ConsumerAPIClientParams;
import com.squareup.protos.cash.local.client.v1.LocalLoyaltyAccount;
import com.squareup.protos.cash.local.client.v1.LocalLoyaltyProgram;
import com.squareup.protos.cash.local.client.v1.LocalOrder;
import com.squareup.protos.cash.local.client.v1.POSBrandOnboarding;
import com.squareup.protos.cash.local.client.v1.POSLocalCashRedemption;
import com.squareup.protos.franklin.investing.resources.InvestPaymentData;
import com.squareup.protos.giftly.GiftCardPaymentData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class EndAppLock implements Screen {
    public static final EndAppLock INSTANCE = new EndAppLock();
    public static final Parcelable.Creator<EndAppLock> CREATOR = new Creator(0);

    /* loaded from: classes3.dex */
    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            APIEndpoint aPIEndpoint = null;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    parcel.readInt();
                    return EndAppLock.INSTANCE;
                case 1:
                    parcel.getClass();
                    return new LocalOrderStatusScreen((LocalOrderStatusScreen.Type) parcel.readParcelable(LocalOrderStatusScreen.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
                case 2:
                    parcel.getClass();
                    return new LocalOrderStatusScreen.Type.Preloaded((LocalOrder) parcel.readParcelable(LocalOrderStatusScreen.Type.Preloaded.class.getClassLoader()));
                case 3:
                    parcel.getClass();
                    return new LocalOrderStatusScreen.Type.Standalone(((OrderToken) parcel.readParcelable(LocalOrderStatusScreen.Type.Standalone.class.getClassLoader())).value);
                case 4:
                    parcel.getClass();
                    parcel.readInt();
                    return LocalOrdersScreen.INSTANCE;
                case 5:
                    parcel.getClass();
                    return new LocalPosBrandOnboardingScreen((POSBrandOnboarding) parcel.readParcelable(LocalPosBrandOnboardingScreen.class.getClassLoader()));
                case 6:
                    parcel.getClass();
                    parcel.readInt();
                    return LocalPosCheckInScreen.INSTANCE;
                case 7:
                    parcel.getClass();
                    return new LocalPosLocalCashRedemptionScreen((POSLocalCashRedemption) parcel.readParcelable(LocalPosLocalCashRedemptionScreen.class.getClassLoader()));
                case 8:
                    BrandSpot brandSpot = (BrandSpot) NavAction$$ExternalSyntheticOutline0.m(parcel, LocalSchedulingDayTimePickerScreen.class);
                    String str = ((LocationToken) parcel.readParcelable(LocalSchedulingDayTimePickerScreen.class.getClassLoader())).value;
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    while (r2 != readInt) {
                        r2 = CameraState$Type$EnumUnboxingLocalUtility.m(LocalSchedulingDayTimePickerScreen.class, parcel, arrayList, r2, 1);
                    }
                    return new LocalSchedulingDayTimePickerScreen(brandSpot, str, readString, readString2, arrayList, (FulfillmentConfiguration) parcel.readParcelable(LocalSchedulingDayTimePickerScreen.class.getClassLoader()), (AskedQuestion) parcel.readParcelable(LocalSchedulingDayTimePickerScreen.class.getClassLoader()));
                case 9:
                    parcel.getClass();
                    return new LocalShortlinkSheet(((ShortlinkKey) parcel.readParcelable(LocalShortlinkSheet.class.getClassLoader())).value, parcel.readString());
                case 10:
                    parcel.getClass();
                    parcel.readInt();
                    return LocalTabScreen.INSTANCE;
                case 11:
                    parcel.getClass();
                    return new LoyaltyRewardToApplyQuestion((LocalLoyaltyProgram) parcel.readParcelable(LoyaltyRewardToApplyQuestion.class.getClassLoader()), (LocalLoyaltyAccount) parcel.readParcelable(LoyaltyRewardToApplyQuestion.class.getClassLoader()));
                case 12:
                    parcel.getClass();
                    parcel.readInt();
                    return new MenuItemDetailsQuestion();
                case 13:
                    parcel.getClass();
                    parcel.readInt();
                    return new MenuPickerQuestion();
                case 14:
                    parcel.getClass();
                    parcel.readInt();
                    return new SchedulingDayTimeQuestion();
                case 15:
                    parcel.getClass();
                    parcel.readInt();
                    return TableQrCodeScannerScreen.INSTANCE;
                case 16:
                    parcel.getClass();
                    return new VehicleDescription(parcel.readString(), parcel.readString(), parcel.readString());
                case 17:
                    parcel.getClass();
                    parcel.readInt();
                    return new VehicleDescriptionQuestion();
                case 18:
                    parcel.getClass();
                    return new LocalMenuComboDetailsViewModel.SectionIndex(parcel.readInt());
                case 19:
                    parcel.getClass();
                    return new ToastData(parcel.readString(), parcel.readString());
                case 20:
                    parcel.getClass();
                    return new PaymentData.GiftCardPaymentDataWrapper((GiftCardPaymentData) parcel.readParcelable(PaymentData.GiftCardPaymentDataWrapper.class.getClassLoader()), (PaymentData.GiftCardPaymentDataWrapper.SourceContext) parcel.readParcelable(PaymentData.GiftCardPaymentDataWrapper.class.getClassLoader()));
                case 21:
                    parcel.getClass();
                    parcel.readInt();
                    return PaymentData.GiftCardPaymentDataWrapper.SourceContext.DeepLink.INSTANCE;
                case 22:
                    parcel.getClass();
                    return new PaymentData.GiftCardPaymentDataWrapper.SourceContext.Discover(parcel.readString());
                case 23:
                    parcel.getClass();
                    parcel.readInt();
                    return PaymentData.GiftCardPaymentDataWrapper.SourceContext.PaymentPad.INSTANCE;
                case 24:
                    parcel.getClass();
                    return new PaymentData.InvestPaymentDataWrapper((InvestPaymentData) parcel.readParcelable(PaymentData.InvestPaymentDataWrapper.class.getClassLoader()));
                case 25:
                    parcel.getClass();
                    return new TreehouseLayout.SavedState(parcel);
                case 26:
                    FillrMappedField fillrMappedField = new FillrMappedField();
                    fillrMappedField.popId = parcel.readInt();
                    fillrMappedField.name = parcel.readString();
                    fillrMappedField.placeholder = parcel.readString();
                    fillrMappedField.f986type = parcel.readString();
                    fillrMappedField.param = parcel.readString();
                    fillrMappedField.params = parcel.createStringArrayList();
                    return fillrMappedField;
                case 27:
                    FillrMappedFields fillrMappedFields = new FillrMappedFields();
                    fillrMappedFields.rawResponse = null;
                    try {
                        fillrMappedFields.setRawResponse(new JSONObject(parcel.readString()));
                    } catch (JSONException e) {
                        Log.e(FillrMappedFields.class.getName(), "could not parse " + e.getMessage());
                    }
                    fillrMappedFields.mFillId = parcel.readString();
                    int readInt2 = parcel.readInt();
                    fillrMappedFields.basicFieldPopIdMapping = new HashMap(readInt2);
                    for (int i = 0; i < readInt2; i++) {
                        fillrMappedFields.basicFieldPopIdMapping.put(parcel.readString(), (FillrMappedField) parcel.readValue(FillrMappedField.class.getClassLoader()));
                    }
                    fillrMappedFields.mappingErrors = parcel.createStringArrayList();
                    fillrMappedFields.domain = parcel.readString();
                    fillrMappedFields.path = parcel.readString();
                    try {
                        fillrMappedFields.location = new JSONObject(parcel.readString());
                    } catch (JSONException e2) {
                        e2.getMessage();
                        SVG svg = Fillr.getInstance().fillrConfig;
                    }
                    int readInt3 = parcel.readInt();
                    fillrMappedFields.mappingsFlow = readInt3 != -1 ? CameraSelector$$ExternalSyntheticOutline0.values(3)[readInt3] : 0;
                    return fillrMappedFields;
                case 28:
                    FillrMappingsHelper fillrMappingsHelper = new FillrMappingsHelper();
                    fillrMappingsHelper.mappings = null;
                    fillrMappingsHelper.mappings = (Map) parcel.createStringArrayList();
                    return fillrMappingsHelper;
                default:
                    ConsumerAPIClientParams consumerAPIClientParams = new ConsumerAPIClientParams();
                    consumerAPIClientParams.mApiHost = null;
                    consumerAPIClientParams.mEndpoint = null;
                    consumerAPIClientParams.mQueryParams = null;
                    consumerAPIClientParams.mSpecialParams = null;
                    consumerAPIClientParams.endpointData = null;
                    consumerAPIClientParams.mAccessToken = null;
                    consumerAPIClientParams.cacheIdentifier = null;
                    consumerAPIClientParams.endpointDataExtras = null;
                    consumerAPIClientParams.mApiHost = parcel.readString();
                    consumerAPIClientParams.endpointData = parcel.readString();
                    int readInt4 = parcel.readInt();
                    APIEndpoint[] values = APIEndpoint.values();
                    int length = values.length;
                    while (true) {
                        if (r2 < length) {
                            APIEndpoint aPIEndpoint2 = values[r2];
                            if (aPIEndpoint2.mCode == readInt4) {
                                aPIEndpoint = aPIEndpoint2;
                            } else {
                                r2++;
                            }
                        }
                    }
                    consumerAPIClientParams.mEndpoint = aPIEndpoint;
                    consumerAPIClientParams.mQueryParams = parcel.readBundle(ConsumerAPIClientParams.class.getClassLoader());
                    consumerAPIClientParams.mSpecialParams = parcel.readBundle(ConsumerAPIClientParams.class.getClassLoader());
                    consumerAPIClientParams.mAccessToken = parcel.readString();
                    consumerAPIClientParams.cacheIdentifier = parcel.readString();
                    consumerAPIClientParams.endpointDataExtras = parcel.readBundle(ConsumerAPIClientParams.class.getClassLoader());
                    return consumerAPIClientParams;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new EndAppLock[i];
                case 1:
                    return new LocalOrderStatusScreen[i];
                case 2:
                    return new LocalOrderStatusScreen.Type.Preloaded[i];
                case 3:
                    return new LocalOrderStatusScreen.Type.Standalone[i];
                case 4:
                    return new LocalOrdersScreen[i];
                case 5:
                    return new LocalPosBrandOnboardingScreen[i];
                case 6:
                    return new LocalPosCheckInScreen[i];
                case 7:
                    return new LocalPosLocalCashRedemptionScreen[i];
                case 8:
                    return new LocalSchedulingDayTimePickerScreen[i];
                case 9:
                    return new LocalShortlinkSheet[i];
                case 10:
                    return new LocalTabScreen[i];
                case 11:
                    return new LoyaltyRewardToApplyQuestion[i];
                case 12:
                    return new MenuItemDetailsQuestion[i];
                case 13:
                    return new MenuPickerQuestion[i];
                case 14:
                    return new SchedulingDayTimeQuestion[i];
                case 15:
                    return new TableQrCodeScannerScreen[i];
                case 16:
                    return new VehicleDescription[i];
                case 17:
                    return new VehicleDescriptionQuestion[i];
                case 18:
                    return new LocalMenuComboDetailsViewModel.SectionIndex[i];
                case 19:
                    return new ToastData[i];
                case 20:
                    return new PaymentData.GiftCardPaymentDataWrapper[i];
                case 21:
                    return new PaymentData.GiftCardPaymentDataWrapper.SourceContext.DeepLink[i];
                case 22:
                    return new PaymentData.GiftCardPaymentDataWrapper.SourceContext.Discover[i];
                case 23:
                    return new PaymentData.GiftCardPaymentDataWrapper.SourceContext.PaymentPad[i];
                case 24:
                    return new PaymentData.InvestPaymentDataWrapper[i];
                case 25:
                    return new TreehouseLayout.SavedState[i];
                case 26:
                    return new FillrMappedField[i];
                case 27:
                    return new FillrMappedFields[i];
                case 28:
                    return new FillrMappingsHelper[i];
                default:
                    return new ConsumerAPIClientParams[i];
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
