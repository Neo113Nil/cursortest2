package com.squareup.cash.db.contacts;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.screen.AskedQuestion;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.address.typeahead.backend.api.LocationSearchClient$SessionId$GoogleSessionId;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.crypto.address.StablecoinWithdrawalOption;
import com.squareup.cash.crypto.navigation.BitcoinExchangeType;
import com.squareup.cash.crypto.navigation.CryptoPayment;
import com.squareup.cash.crypto.navigation.StablecoinExchangeType$ConvertBitcoinToStablecoin$ConvertAll;
import com.squareup.cash.crypto.primitives.BitcoinFeature;
import com.squareup.cash.crypto.scenarioplans.models.CryptoOnboardingScenarioPlanInput;
import com.squareup.cash.crypto.scenarioplans.models.InitiateBitcoinExchangeScenarioPlanInput;
import com.squareup.cash.crypto.scenarioplans.models.InitiateBitcoinWithdrawalScenarioPlanInput;
import com.squareup.cash.crypto.scenarioplans.models.InitiateStablecoinExchangeScenarioPlanInput;
import com.squareup.cash.crypto.scenarioplans.models.InitiateStablecoinWithdrawalScenarioPlanInput;
import com.squareup.cash.crypto.scenarioplans.models.RefreshLightningInvoiceScenarioPlanInput;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import com.squareup.cash.deposits.physical.screens.AddressSearchQuestion;
import com.squareup.cash.deposits.physical.screens.AtmExplainerScreen;
import com.squareup.cash.deposits.physical.screens.AtmLocationDetailsScreen;
import com.squareup.cash.deposits.physical.screens.AtmPmdExplainerScreen;
import com.squareup.cash.deposits.physical.screens.AtmRetailerMapScreen;
import com.squareup.cash.deposits.physical.screens.LocationDeniedScreen;
import com.squareup.cash.deposits.physical.screens.NoAddressResult;
import com.squareup.cash.deposits.physical.screens.PaperMoneyDepositBarcodeFailedScreen;
import com.squareup.cash.deposits.physical.screens.PaperMoneyDepositBarcodeScreen;
import com.squareup.cash.deposits.physical.screens.PaperMoneyDepositMapScreen;
import com.squareup.cash.deposits.physical.screens.PaperMoneyDepositMerchantDetailsScreen;
import com.squareup.cash.deposits.physical.screens.PaperMoneyDepositOnboardingScreen;
import com.squareup.cash.deposits.physical.screens.PhysicalCashDepositAddressEntryScreen;
import com.squareup.cash.deposits.physical.screens.PhysicalDepositErrorScreen;
import com.squareup.cash.deposits.physical.screens.SelectedRecentAddressResult;
import com.squareup.cash.deposits.physical.screens.SelectedSearchAddressResult;
import com.squareup.cash.deposits.physical.screens.SwipeToLoadOnboardingScreen;
import com.squareup.cash.deposits.physical.viewmodels.map.AtmExplainerViewModel;
import com.squareup.cash.deposits.physical.viewmodels.map.Benefit;
import com.squareup.cash.deposits.physical.viewmodels.map.HeaderIcon;
import com.squareup.cash.deposits.physical.viewmodels.map.Limit;
import com.squareup.cash.multiplatform.bitcoin.parsers.solana.SolanaAddress;
import com.squareup.cash.payments.screens.InstrumentSelectionData;
import com.squareup.protos.cash.cashcustomergateway.api.v1.LocalBrand;
import com.squareup.protos.cash.cryptoinvestflow.service.ExchangeRequest;
import com.squareup.protos.cash.discover.api.app.v1.model.Button;
import com.squareup.protos.cash.moneymap.app.GetRetailerLocationsResponse;
import com.squareup.protos.cash.papermate.app.GetRetailerLocationsResponse;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.api.PaperCashDepositBlocker;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.api.RetailerMapBlocker;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.protos.franklin.ui.ContactsStatus;
import com.squareup.protos.franklin.ui.MerchantData;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.util.cash.Cashtags;
import com.squareup.util.cash.ColorsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import squareup.cash.bankingbenefits.ui.BenefitExplainerScreen;

/* loaded from: classes6.dex */
public final class Recipient implements Comparable, Parcelable {
    public static final Parcelable.Creator<Recipient> CREATOR;
    public static final Lazy pendingCashtagResult$delegate;
    public final Button actionButton;
    public final String actionUrl;
    public final boolean alreadyInvited;
    public final BlockState blockState;
    public final boolean canAcceptPayments;
    public final String cashtag;
    public final String category;
    public final Lazy comparator$delegate;
    public final String contactName;
    public final ContactsStatus contactsStatus;
    public final long creditCardFee;
    public final String customerId;
    public final String displayName;
    public final String email;
    public final String emailAddresses;
    public final Lazy firstName$delegate;
    public final String fullName;
    public final boolean hasMultipleCustomers;
    public final boolean hasValidAlias;
    public final String investmentEntityToken;
    public final boolean isBusiness;
    public final boolean isCashCustomer;
    public final boolean isFavorite;
    public final boolean isInContacts;
    public final boolean isRecent;
    public final boolean isSponsorAllowlisted;
    public final boolean isVerified;
    public final Long joined_on;
    public final LocalBrand localBrand;
    public final String lookupKey;
    public final MerchantData merchantData;
    public final String offerToken;
    public final Image photo;
    public final String rawAccentColor;
    public final Region region;
    public final String renderData;
    public final String rewardToken;
    public final String sms;
    public final String smsNumbers;
    public final String subtext;
    public final Color themedAccentColor;
    public final String threadedCustomerId;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            Class cls;
            boolean z6;
            ContactsStatus contactsStatus;
            boolean z7;
            Class cls2;
            boolean z8;
            Class cls3;
            boolean z9;
            int i = 0;
            int i2 = 0;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    boolean z10 = true;
                    String readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = true;
                        z10 = false;
                    }
                    if (parcel.readInt() != 0) {
                        z2 = z;
                    } else {
                        z2 = z;
                        z = false;
                    }
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    boolean z11 = z2;
                    String readString4 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z3 = z11;
                    } else {
                        z3 = z11;
                        z11 = false;
                    }
                    if (parcel.readInt() != 0) {
                        z4 = z3;
                    } else {
                        z4 = z3;
                        z3 = false;
                    }
                    if (parcel.readInt() != 0) {
                        z5 = z4;
                    } else {
                        z5 = z4;
                        z4 = false;
                    }
                    String readString5 = parcel.readString();
                    boolean z12 = z5;
                    String readString6 = parcel.readString();
                    Image image = (Image) parcel.readParcelable(Recipient.class.getClassLoader());
                    String readString7 = parcel.readString();
                    String readString8 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        cls = Recipient.class;
                        z6 = z12;
                    } else {
                        cls = Recipient.class;
                        z6 = false;
                    }
                    long readLong = parcel.readLong();
                    BlockState valueOf = parcel.readInt() == 0 ? null : BlockState.valueOf(parcel.readString());
                    MerchantData merchantData = (MerchantData) parcel.readParcelable(cls.getClassLoader());
                    if (parcel.readInt() != 0) {
                        contactsStatus = null;
                        z7 = true;
                    } else {
                        contactsStatus = null;
                        z7 = false;
                    }
                    String readString9 = parcel.readString();
                    Color color = (Color) parcel.readParcelable(cls.getClassLoader());
                    Enum valueOf2 = parcel.readInt() == 0 ? contactsStatus : Region.valueOf(parcel.readString());
                    Class cls4 = cls;
                    BlockState blockState = valueOf;
                    String readString10 = parcel.readString();
                    Comparable valueOf3 = parcel.readInt() == 0 ? contactsStatus : Long.valueOf(parcel.readLong());
                    String readString11 = parcel.readString();
                    Region region = valueOf2;
                    Long l = valueOf3;
                    String readString12 = parcel.readString();
                    String readString13 = parcel.readString();
                    boolean z13 = true;
                    String readString14 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        cls2 = cls4;
                        z8 = true;
                    } else {
                        cls2 = cls4;
                        z8 = false;
                    }
                    if (parcel.readInt() != 0) {
                        contactsStatus = ContactsStatus.valueOf(parcel.readString());
                    }
                    if (parcel.readInt() != 0) {
                        cls3 = cls2;
                        z9 = true;
                    } else {
                        cls3 = cls2;
                        z9 = false;
                    }
                    if (parcel.readInt() == 0) {
                        z13 = false;
                    }
                    return new Recipient(readString, z10, z, readString2, readString3, readString4, z11, z3, z4, readString5, readString6, image, readString7, readString8, z6, readLong, blockState, merchantData, z7, readString9, color, region, readString10, l, readString11, readString12, readString13, readString14, z8, contactsStatus, z9, z13, parcel.readString(), parcel.readString(), (Button) parcel.readParcelable(cls3.getClassLoader()), parcel.readString(), parcel.readString(), (LocalBrand) parcel.readParcelable(cls3.getClassLoader()));
                case 1:
                    parcel.getClass();
                    return new CryptoOnboardingScenarioPlanInput(BitcoinFeature.valueOf(parcel.readString()));
                case 2:
                    parcel.getClass();
                    return new InitiateBitcoinExchangeScenarioPlanInput((ExchangeRequest) parcel.readParcelable(InitiateBitcoinExchangeScenarioPlanInput.class.getClassLoader()), (BitcoinExchangeType) parcel.readParcelable(InitiateBitcoinExchangeScenarioPlanInput.class.getClassLoader()));
                case 3:
                    parcel.getClass();
                    return new InitiateBitcoinWithdrawalScenarioPlanInput((CryptoPayment) parcel.readParcelable(InitiateBitcoinWithdrawalScenarioPlanInput.class.getClassLoader()));
                case 4:
                    parcel.getClass();
                    return new InitiateStablecoinExchangeScenarioPlanInput((StablecoinExchangeType$ConvertBitcoinToStablecoin$ConvertAll) parcel.readParcelable(InitiateStablecoinExchangeScenarioPlanInput.class.getClassLoader()));
                case 5:
                    parcel.getClass();
                    return new InitiateStablecoinWithdrawalScenarioPlanInput((SolanaAddress) parcel.readParcelable(InitiateStablecoinWithdrawalScenarioPlanInput.class.getClassLoader()), (StablecoinWithdrawalOption) parcel.readParcelable(InitiateStablecoinWithdrawalScenarioPlanInput.class.getClassLoader()), parcel.readString(), parcel.readString(), (Money) parcel.readParcelable(InitiateStablecoinWithdrawalScenarioPlanInput.class.getClassLoader()), (InstrumentSelectionData) parcel.readParcelable(InitiateStablecoinWithdrawalScenarioPlanInput.class.getClassLoader()));
                case 6:
                    parcel.getClass();
                    return new RefreshLightningInvoiceScenarioPlanInput(parcel.readString());
                case 7:
                    parcel.getClass();
                    parcel.readInt();
                    return DateFilter.AllTime.INSTANCE;
                case 8:
                    parcel.getClass();
                    return new DateFilter.Monthly(parcel.readInt(), parcel.readInt());
                case 9:
                    parcel.getClass();
                    return new DateFilter.Yearly(parcel.readInt());
                case 10:
                    parcel.getClass();
                    return new RecipientPaymentInfo(parcel.readLong(), parcel.readInt() != 0);
                case 11:
                    parcel.getClass();
                    return new WithContactAliasId(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 12:
                    parcel.getClass();
                    parcel.readInt();
                    return new AddressSearchQuestion();
                case 13:
                    parcel.getClass();
                    return new AtmLocationDetailsScreen((GetRetailerLocationsResponse.RetailerLocation) parcel.readParcelable(AtmLocationDetailsScreen.class.getClassLoader()), (AtmExplainerScreen) parcel.readParcelable(AtmLocationDetailsScreen.class.getClassLoader()));
                case 14:
                    parcel.getClass();
                    AtmPmdExplainerScreen.AtmPmdExplainerOrigin valueOf4 = AtmPmdExplainerScreen.AtmPmdExplainerOrigin.valueOf(parcel.readString());
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    int i3 = 0;
                    while (i3 != readInt) {
                        i3 = CameraState$Type$EnumUnboxingLocalUtility.m(AtmPmdExplainerScreen.class, parcel, arrayList, i3, 1);
                    }
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt2);
                    while (i2 != readInt2) {
                        i2 = CameraState$Type$EnumUnboxingLocalUtility.m(AtmPmdExplainerScreen.class, parcel, arrayList2, i2, 1);
                    }
                    return new AtmPmdExplainerScreen(valueOf4, arrayList, arrayList2, (BlockersData) parcel.readParcelable(AtmPmdExplainerScreen.class.getClassLoader()));
                case 15:
                    parcel.getClass();
                    return new AtmRetailerMapScreen((RetailerMapBlocker) parcel.readParcelable(AtmRetailerMapScreen.class.getClassLoader()), (BlockersData) parcel.readParcelable(AtmRetailerMapScreen.class.getClassLoader()));
                case 16:
                    parcel.getClass();
                    return new LocationDeniedScreen(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 17:
                    parcel.getClass();
                    parcel.readInt();
                    return NoAddressResult.INSTANCE;
                case 18:
                    parcel.getClass();
                    return new PaperMoneyDepositBarcodeFailedScreen(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (PaperCashDepositBlocker) parcel.readParcelable(PaperMoneyDepositBarcodeFailedScreen.class.getClassLoader()), (BlockersData) parcel.readParcelable(PaperMoneyDepositBarcodeFailedScreen.class.getClassLoader()));
                case 19:
                    parcel.getClass();
                    return new PaperMoneyDepositBarcodeScreen((PaperCashDepositBlocker) parcel.readParcelable(PaperMoneyDepositBarcodeScreen.class.getClassLoader()), PaperMoneyDepositBarcodeScreen.Origin.valueOf(parcel.readString()), (BlockersData) parcel.readParcelable(PaperMoneyDepositBarcodeScreen.class.getClassLoader()));
                case 20:
                    parcel.getClass();
                    return new PaperMoneyDepositMapScreen((PaperCashDepositBlocker) parcel.readParcelable(PaperMoneyDepositMapScreen.class.getClassLoader()), (BlockersData) parcel.readParcelable(PaperMoneyDepositMapScreen.class.getClassLoader()));
                case 21:
                    parcel.getClass();
                    return new PaperMoneyDepositMerchantDetailsScreen((PaperCashDepositBlocker) parcel.readParcelable(PaperMoneyDepositMerchantDetailsScreen.class.getClassLoader()), (GetRetailerLocationsResponse.RetailerLocation) parcel.readParcelable(PaperMoneyDepositMerchantDetailsScreen.class.getClassLoader()), (BenefitExplainerScreen) parcel.readParcelable(PaperMoneyDepositMerchantDetailsScreen.class.getClassLoader()), (BlockersData) parcel.readParcelable(PaperMoneyDepositMerchantDetailsScreen.class.getClassLoader()));
                case 22:
                    parcel.getClass();
                    return new PaperMoneyDepositOnboardingScreen((PaperCashDepositBlocker) parcel.readParcelable(PaperMoneyDepositOnboardingScreen.class.getClassLoader()), (BlockersData) parcel.readParcelable(PaperMoneyDepositOnboardingScreen.class.getClassLoader()));
                case 23:
                    parcel.getClass();
                    return new PhysicalCashDepositAddressEntryScreen(PhysicalCashDepositAddressEntryScreen.SearchScreen.CREATOR.createFromParcel(parcel), PhysicalCashDepositAddressEntryScreen.AddressSearchType.valueOf(parcel.readString()), (BlockersData) parcel.readParcelable(PhysicalCashDepositAddressEntryScreen.class.getClassLoader()), (AskedQuestion) parcel.readParcelable(PhysicalCashDepositAddressEntryScreen.class.getClassLoader()));
                case 24:
                    parcel.getClass();
                    return new PhysicalCashDepositAddressEntryScreen.SearchScreen(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 25:
                    parcel.getClass();
                    return new PhysicalDepositErrorScreen(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readParcelable(PhysicalDepositErrorScreen.class.getClassLoader()));
                case 26:
                    parcel.getClass();
                    Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
                    return new SelectedRecentAddressResult((CharSequence) creator.createFromParcel(parcel), (CharSequence) creator.createFromParcel(parcel), (CharSequence) creator.createFromParcel(parcel), parcel.readDouble(), parcel.readDouble());
                case 27:
                    parcel.getClass();
                    String readString15 = parcel.readString();
                    Parcelable.Creator creator2 = TextUtils.CHAR_SEQUENCE_CREATOR;
                    return new SelectedSearchAddressResult(readString15, (CharSequence) creator2.createFromParcel(parcel), (CharSequence) creator2.createFromParcel(parcel), (CharSequence) creator2.createFromParcel(parcel), (LocationSearchClient$SessionId$GoogleSessionId) parcel.readParcelable(SelectedSearchAddressResult.class.getClassLoader()));
                case 28:
                    parcel.getClass();
                    return new SwipeToLoadOnboardingScreen((FormBlocker) parcel.readParcelable(SwipeToLoadOnboardingScreen.class.getClassLoader()), (BlockersData) parcel.readParcelable(SwipeToLoadOnboardingScreen.class.getClassLoader()));
                default:
                    parcel.getClass();
                    String readString16 = parcel.readString();
                    String readString17 = parcel.readString();
                    String readString18 = parcel.readString();
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt3);
                    int i4 = 0;
                    while (i4 != readInt3) {
                        i4 = CameraState$Type$EnumUnboxingLocalUtility.m(Benefit.CREATOR, parcel, arrayList3, i4, 1);
                    }
                    int readInt4 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(readInt4);
                    while (i != readInt4) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(Limit.CREATOR, parcel, arrayList4, i, 1);
                    }
                    return new AtmExplainerViewModel(readString16, readString17, readString18, arrayList3, arrayList4, HeaderIcon.valueOf(parcel.readString()));
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new Recipient[i];
                case 1:
                    return new CryptoOnboardingScenarioPlanInput[i];
                case 2:
                    return new InitiateBitcoinExchangeScenarioPlanInput[i];
                case 3:
                    return new InitiateBitcoinWithdrawalScenarioPlanInput[i];
                case 4:
                    return new InitiateStablecoinExchangeScenarioPlanInput[i];
                case 5:
                    return new InitiateStablecoinWithdrawalScenarioPlanInput[i];
                case 6:
                    return new RefreshLightningInvoiceScenarioPlanInput[i];
                case 7:
                    return new DateFilter.AllTime[i];
                case 8:
                    return new DateFilter.Monthly[i];
                case 9:
                    return new DateFilter.Yearly[i];
                case 10:
                    return new RecipientPaymentInfo[i];
                case 11:
                    return new WithContactAliasId[i];
                case 12:
                    return new AddressSearchQuestion[i];
                case 13:
                    return new AtmLocationDetailsScreen[i];
                case 14:
                    return new AtmPmdExplainerScreen[i];
                case 15:
                    return new AtmRetailerMapScreen[i];
                case 16:
                    return new LocationDeniedScreen[i];
                case 17:
                    return new NoAddressResult[i];
                case 18:
                    return new PaperMoneyDepositBarcodeFailedScreen[i];
                case 19:
                    return new PaperMoneyDepositBarcodeScreen[i];
                case 20:
                    return new PaperMoneyDepositMapScreen[i];
                case 21:
                    return new PaperMoneyDepositMerchantDetailsScreen[i];
                case 22:
                    return new PaperMoneyDepositOnboardingScreen[i];
                case 23:
                    return new PhysicalCashDepositAddressEntryScreen[i];
                case 24:
                    return new PhysicalCashDepositAddressEntryScreen.SearchScreen[i];
                case 25:
                    return new PhysicalDepositErrorScreen[i];
                case 26:
                    return new SelectedRecentAddressResult[i];
                case 27:
                    return new SelectedSearchAddressResult[i];
                case 28:
                    return new SwipeToLoadOnboardingScreen[i];
                default:
                    return new AtmExplainerViewModel[i];
            }
        }
    }

    static {
        int i = 0;
        CREATOR = new Creator(i);
        pendingCashtagResult$delegate = LazyKt.lazy(new Recipient$$ExternalSyntheticLambda2(i));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Recipient(String str, boolean z, boolean z2, String str2, String str3, String str4, boolean z3, boolean z4, boolean z5, String str5, String str6, Image image, String str7, String str8, boolean z6, long j, BlockState blockState, MerchantData merchantData, boolean z7, String str9, Color color, Region region, String str10, Long l, String str11, String str12, String str13, String str14, boolean z8, ContactsStatus contactsStatus, boolean z9, boolean z10, String str15, LocalBrand localBrand, int i, int i2) {
        this(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r22, r23, r24, r25, (2097152 & i) != 0 ? null : region, (4194304 & i) != 0 ? null : str10, (8388608 & i) != 0 ? null : l, (16777216 & i) != 0 ? null : str11, (33554432 & i) != 0 ? null : str12, (67108864 & i) != 0 ? null : str13, (134217728 & i) != 0 ? null : str14, (268435456 & i) != 0 ? false : z8, (536870912 & i) != 0 ? null : contactsStatus, (1073741824 & i) != 0 ? false : z9, (i & PKIFailureInfo.systemUnavail) != 0 ? false : z10, null, null, null, (i2 & 8) != 0 ? null : str15, null, (i2 & 32) != 0 ? null : localBrand);
        Color color2;
        String str16 = (i & 1) != 0 ? null : str;
        boolean z11 = (i & 2) != 0 ? false : z;
        boolean z12 = (i & 4) != 0 ? false : z2;
        String str17 = (i & 8) != 0 ? null : str2;
        String str18 = (i & 16) != 0 ? null : str3;
        String str19 = (i & 32) != 0 ? null : str4;
        boolean z13 = (i & 64) != 0 ? false : z3;
        boolean z14 = (i & 128) != 0 ? false : z4;
        boolean z15 = (i & 256) != 0 ? false : z5;
        String str20 = (i & 512) != 0 ? null : str5;
        String str21 = (i & 1024) != 0 ? null : str6;
        Image image2 = (i & 2048) != 0 ? null : image;
        String str22 = (i & 4096) != 0 ? null : str7;
        String str23 = (i & PKIFailureInfo.certRevoked) != 0 ? null : str8;
        boolean z16 = (i & 16384) != 0 ? false : z6;
        long j2 = (32768 & i) != 0 ? 0L : j;
        BlockState blockState2 = (65536 & i) != 0 ? BlockState.NOT_BLOCKED : blockState;
        MerchantData merchantData2 = (131072 & i) != 0 ? null : merchantData;
        boolean z17 = (262144 & i) != 0 ? false : z7;
        String str24 = (524288 & i) != 0 ? null : str9;
        if ((1048576 & i) != 0) {
            color2 = str24 != null ? ColorsKt.toColor(str24) : null;
        } else {
            color2 = color;
        }
    }

    public static Recipient copy$default(Recipient recipient) {
        String str = recipient.lookupKey;
        boolean z = recipient.alreadyInvited;
        boolean z2 = recipient.hasMultipleCustomers;
        String str2 = recipient.customerId;
        String str3 = recipient.threadedCustomerId;
        String str4 = recipient.cashtag;
        boolean z3 = recipient.isCashCustomer;
        boolean z4 = recipient.isVerified;
        boolean z5 = recipient.isBusiness;
        String str5 = recipient.email;
        String str6 = recipient.sms;
        Image image = recipient.photo;
        String str7 = recipient.emailAddresses;
        String str8 = recipient.smsNumbers;
        boolean z6 = recipient.canAcceptPayments;
        long j = recipient.creditCardFee;
        BlockState blockState = recipient.blockState;
        MerchantData merchantData = recipient.merchantData;
        boolean z7 = recipient.isRecent;
        String str9 = recipient.rawAccentColor;
        Color color = recipient.themedAccentColor;
        Region region = recipient.region;
        String str10 = recipient.category;
        String str11 = recipient.fullName;
        String str12 = recipient.contactName;
        String str13 = recipient.investmentEntityToken;
        String str14 = recipient.rewardToken;
        boolean z8 = recipient.isInContacts;
        ContactsStatus contactsStatus = recipient.contactsStatus;
        boolean z9 = recipient.isFavorite;
        boolean z10 = recipient.isSponsorAllowlisted;
        String str15 = recipient.actionUrl;
        String str16 = recipient.subtext;
        Button button = recipient.actionButton;
        String str17 = recipient.renderData;
        String str18 = recipient.offerToken;
        LocalBrand localBrand = recipient.localBrand;
        recipient.getClass();
        return new Recipient(str, z, z2, str2, str3, str4, z3, z4, z5, str5, str6, image, str7, str8, z6, j, blockState, merchantData, z7, str9, color, region, str10, null, str11, str12, str13, str14, z8, contactsStatus, z9, z10, str15, str16, button, str17, str18, localBrand);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Recipient recipient = (Recipient) obj;
        recipient.getClass();
        return ((RecipientComparator) this.comparator$delegate.getValue()).compareTo(recipient);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Recipient)) {
            return false;
        }
        Recipient recipient = (Recipient) obj;
        String str = recipient.customerId;
        String str2 = recipient.lookupKey;
        String str3 = this.lookupKey;
        return str != null ? Intrinsics.areEqual(str2, str3) && Intrinsics.areEqual(str, this.customerId) : Intrinsics.areEqual(str2, str3) && Intrinsics.areEqual(recipient.email, this.email) && Intrinsics.areEqual(recipient.sms, this.sms);
    }

    public final String getCashtag() {
        return this.cashtag;
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFirstName() {
        return (String) this.firstName$delegate.getValue();
    }

    public final String getLookupKey() {
        return this.lookupKey;
    }

    public final Image getPhoto() {
        return this.photo;
    }

    public final String getSms() {
        return this.sms;
    }

    public final int hashCode() {
        String str = this.lookupKey;
        String str2 = this.customerId;
        if (str2 != null) {
            return (str2 + str).hashCode();
        }
        return (this.email + this.sms + str).hashCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        r4 = r4 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean matchesFilter(String[] strArr) {
        strArr.getClass();
        RecipientComparator recipientComparator = (RecipientComparator) this.comparator$delegate.getValue();
        recipientComparator.getClass();
        String[] strArr2 = recipientComparator.fullNameTokens;
        if (strArr2 != null) {
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str = strArr[i];
                for (String str2 : strArr2) {
                    if (StringsKt__StringsJVMKt.startsWith(str2, str, false)) {
                        break;
                    }
                }
            }
            return true;
        }
        if (strArr.length == 1) {
            List<String> list = recipientComparator.emailAddresses;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (String str3 : list) {
                    String str4 = strArr[0];
                    if (!StringsKt.isBlank(str3) && StringsKt__StringsJVMKt.startsWith(str3, str4, false)) {
                        break;
                    }
                }
            }
            List<String> list2 = recipientComparator.smsNumbers;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (String str5 : list2) {
                    String str6 = strArr[0];
                    if (!StringsKt.isBlank(str5) && !StringsKt.isBlank(str6) && StringsKt__StringsJVMKt.startsWith(str5, str6, false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final UiCustomer toSendableUiCustomer() {
        return SendableUiCustomerFactory.create(this.fullName, this.region, this.photo, this.email, this.sms, this.cashtag, this.customerId, this.investmentEntityToken, this.merchantData, Boolean.valueOf(this.isCashCustomer), this.renderData, this.contactsStatus);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("Recipient(customerId=", this.customerId, ", lookupKey=", this.lookupKey, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.lookupKey);
        parcel.writeInt(this.alreadyInvited ? 1 : 0);
        parcel.writeInt(this.hasMultipleCustomers ? 1 : 0);
        parcel.writeString(this.customerId);
        parcel.writeString(this.threadedCustomerId);
        parcel.writeString(this.cashtag);
        parcel.writeInt(this.isCashCustomer ? 1 : 0);
        parcel.writeInt(this.isVerified ? 1 : 0);
        parcel.writeInt(this.isBusiness ? 1 : 0);
        parcel.writeString(this.email);
        parcel.writeString(this.sms);
        parcel.writeParcelable(this.photo, i);
        parcel.writeString(this.emailAddresses);
        parcel.writeString(this.smsNumbers);
        parcel.writeInt(this.canAcceptPayments ? 1 : 0);
        parcel.writeLong(this.creditCardFee);
        BlockState blockState = this.blockState;
        if (blockState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(blockState.name());
        }
        parcel.writeParcelable(this.merchantData, i);
        parcel.writeInt(this.isRecent ? 1 : 0);
        parcel.writeString(this.rawAccentColor);
        parcel.writeParcelable(this.themedAccentColor, i);
        Region region = this.region;
        if (region == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(region.name());
        }
        parcel.writeString(this.category);
        Long l = this.joined_on;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            Request$Priority$EnumUnboxingLocalUtility.m(parcel, 1, l);
        }
        parcel.writeString(this.fullName);
        parcel.writeString(this.contactName);
        parcel.writeString(this.investmentEntityToken);
        parcel.writeString(this.rewardToken);
        parcel.writeInt(this.isInContacts ? 1 : 0);
        ContactsStatus contactsStatus = this.contactsStatus;
        if (contactsStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(contactsStatus.name());
        }
        parcel.writeInt(this.isFavorite ? 1 : 0);
        parcel.writeInt(this.isSponsorAllowlisted ? 1 : 0);
        parcel.writeString(this.actionUrl);
        parcel.writeString(this.subtext);
        parcel.writeParcelable(this.actionButton, i);
        parcel.writeString(this.renderData);
        parcel.writeString(this.offerToken);
        parcel.writeParcelable(this.localBrand, i);
    }

    public Recipient(String str, boolean z, boolean z2, String str2, String str3, String str4, boolean z3, boolean z4, boolean z5, String str5, String str6, Image image, String str7, String str8, boolean z6, long j, BlockState blockState, MerchantData merchantData, boolean z7, String str9, Color color, Region region, String str10, Long l, String str11, String str12, String str13, String str14, boolean z8, ContactsStatus contactsStatus, boolean z9, boolean z10, String str15, String str16, Button button, String str17, String str18, LocalBrand localBrand) {
        String str19 = str11;
        this.lookupKey = str;
        this.alreadyInvited = z;
        this.hasMultipleCustomers = z2;
        this.customerId = str2;
        this.threadedCustomerId = str3;
        this.cashtag = str4;
        this.isCashCustomer = z3;
        this.isVerified = z4;
        this.isBusiness = z5;
        this.email = str5;
        this.sms = str6;
        this.photo = image;
        this.emailAddresses = str7;
        this.smsNumbers = str8;
        this.canAcceptPayments = z6;
        this.creditCardFee = j;
        this.blockState = blockState;
        this.merchantData = merchantData;
        this.isRecent = z7;
        this.rawAccentColor = str9;
        this.themedAccentColor = color;
        this.region = region;
        this.category = str10;
        this.joined_on = l;
        this.fullName = str19;
        this.contactName = str12;
        this.investmentEntityToken = str13;
        this.rewardToken = str14;
        this.isInContacts = z8;
        this.contactsStatus = contactsStatus;
        this.isFavorite = z9;
        this.isSponsorAllowlisted = z10;
        this.actionUrl = str15;
        this.subtext = str16;
        this.actionButton = button;
        this.renderData = str17;
        this.offerToken = str18;
        this.localBrand = localBrand;
        boolean z11 = false;
        z11 = false;
        final int i = z11 ? 1 : 0;
        this.firstName$delegate = LazyKt.lazy(new Function0(this) { // from class: com.squareup.cash.db.contacts.Recipient$$ExternalSyntheticLambda0
            public final /* synthetic */ Recipient f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List split$default;
                String str20;
                int i2 = i;
                Recipient recipient = this.f$0;
                switch (i2) {
                    case 0:
                        String str21 = recipient.fullName;
                        return (str21 == null || (split$default = StringsKt.split$default(str21, new char[]{' '}, 6)) == null || (str20 = (String) CollectionsKt.firstOrNull(split$default)) == null) ? "" : str20;
                    default:
                        return new RecipientComparator(recipient);
                }
            }
        });
        final int i2 = 1;
        if ((str5 != null && !StringsKt.isBlank(str5)) || ((str6 != null && !StringsKt.isBlank(str6)) || ((str4 != null && !StringsKt.isBlank(str4)) || (str2 != null && !StringsKt.isBlank(str2))))) {
            z11 = true;
        }
        this.hasValidAlias = z11;
        String str20 = null;
        if (str19 != null) {
            str19 = StringsKt.isBlank(str19) ? null : str19;
            if (str19 != null) {
                str20 = str19;
                this.displayName = str20;
                this.comparator$delegate = LazyKt.lazy(new Function0(this) { // from class: com.squareup.cash.db.contacts.Recipient$$ExternalSyntheticLambda0
                    public final /* synthetic */ Recipient f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        List split$default;
                        String str202;
                        int i22 = i2;
                        Recipient recipient = this.f$0;
                        switch (i22) {
                            case 0:
                                String str21 = recipient.fullName;
                                return (str21 == null || (split$default = StringsKt.split$default(str21, new char[]{' '}, 6)) == null || (str202 = (String) CollectionsKt.firstOrNull(split$default)) == null) ? "" : str202;
                            default:
                                return new RecipientComparator(recipient);
                        }
                    }
                });
            }
        }
        String fromString = Cashtags.fromString(str4, region);
        fromString = (fromString == null || StringsKt.isBlank(fromString)) ? null : fromString;
        if (fromString == null) {
            String str21 = (str5 == null || StringsKt.isBlank(str5)) ? null : str5;
            if (str21 != null) {
                str20 = str21;
            } else if (str6 != null && !StringsKt.isBlank(str6)) {
                str20 = str6;
            }
        } else {
            str20 = fromString;
        }
        this.displayName = str20;
        this.comparator$delegate = LazyKt.lazy(new Function0(this) { // from class: com.squareup.cash.db.contacts.Recipient$$ExternalSyntheticLambda0
            public final /* synthetic */ Recipient f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List split$default;
                String str202;
                int i22 = i2;
                Recipient recipient = this.f$0;
                switch (i22) {
                    case 0:
                        String str212 = recipient.fullName;
                        return (str212 == null || (split$default = StringsKt.split$default(str212, new char[]{' '}, 6)) == null || (str202 = (String) CollectionsKt.firstOrNull(split$default)) == null) ? "" : str202;
                    default:
                        return new RecipientComparator(recipient);
                }
            }
        });
    }
}
