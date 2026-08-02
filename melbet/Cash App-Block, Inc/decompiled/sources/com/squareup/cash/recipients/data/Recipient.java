package com.squareup.cash.recipients.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.crypto.address.StablecoinWithdrawalOption;
import com.squareup.cash.data.contacts.ContactsStatus;
import com.squareup.cash.multiplatform.accentcolors.AccentColorsKt;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayments;
import com.squareup.cash.multiplatform.bitcoin.parsers.solana.SolanaAddress;
import com.squareup.cash.qrcodes.screens.CashtagQrScanResult;
import com.squareup.cash.qrcodes.screens.CashtagQrScanScreen;
import com.squareup.cash.qrcodes.screens.QrCodeScreen;
import com.squareup.cash.qrcodes.screens.TeenQrCodeScreen;
import com.squareup.cash.recipients.backend.api.Bucket;
import com.squareup.cash.recipients.backend.api.GenerationStrategy;
import com.squareup.cash.recipients.backend.api.SuggestionStrategy;
import com.squareup.cash.recipients.viewmodels.RecipientViewModel;
import com.squareup.cash.recurring.ConfirmFirstScheduledReloadNoticeResult$Positive;
import com.squareup.cash.savings.backend.api.model.SavingsAction;
import com.squareup.cash.savings.backend.api.model.SavingsCard;
import com.squareup.cash.savings.backend.api.model.SavingsScreen;
import com.squareup.cash.savings.backend.api.model.TransferConfig;
import com.squareup.cash.savings.screens.GeneralSavingsScreen;
import com.squareup.cash.savings.screens.SavingsCardSheet;
import com.squareup.cash.savings.screens.SavingsFullActivityScreen;
import com.squareup.protos.cash.p2p.profile_directory.ui.Avatar;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.protos.franklin.ui.MerchantData;
import com.squareup.util.android.PhoneNumbers;
import com.squareup.util.cash.Cashtags;
import com.squareup.util.cash.ColorsKt;
import com.squareup.util.cash.Regions;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt___StringsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class Recipient implements Parcelable {
    public static final Parcelable.Creator<Recipient> CREATOR = new Creator(0);
    public final Lazy abbreviatedName$delegate;
    public final boolean alreadyInvited;
    public final Analytics analytics;
    public final Avatar avatar;
    public final BlockState blockState;
    public final boolean canAcceptPayments;
    public final String cashtag;
    public final String category;
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
    public final String investmentEntityToken;
    public final CryptoRecipientPayment invoice;
    public final boolean isBusiness;
    public final boolean isCashCustomer;
    public final boolean isFavorited;
    public final boolean isInContacts;
    public final boolean isRecent;
    public final boolean isSponsorAllowlisted;
    public final boolean isVerified;
    public final Long joined_on;
    public final String lookupKey;
    public final MerchantData merchantData;
    public final Image photo;
    public final String rawAccentColor;
    public final Region region;
    public final String sms;
    public final String smsNumbers;
    public final Color themedAccentColor;
    public final String threadedCustomerId;

    /* loaded from: classes7.dex */
    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException
            */
        @Override // android.os.Parcelable.Creator
        public final java.lang.Object createFromParcel(
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r39v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException
            */

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new Recipient[i];
                case 1:
                    return new CashtagQrScanResult[i];
                case 2:
                    return new CashtagQrScanScreen[i];
                case 3:
                    return new QrCodeScreen[i];
                case 4:
                    return new TeenQrCodeScreen[i];
                case 5:
                    return new Analytics[i];
                case 6:
                    return new CryptoRecipientPayment.Bitcoin[i];
                case 7:
                    return new CryptoRecipientPayment.Solana[i];
                case 8:
                    return new CryptoRecipientPayment.Stablecoin[i];
                case 9:
                    return new RecipientViewModel.Avatar.BitcoinAddressAvatar[i];
                case 10:
                    return new RecipientViewModel.Avatar.PhotoImageAvatar[i];
                case 11:
                    return new RecipientViewModel.Avatar.PlaceholderAvatar[i];
                case 12:
                    return new RecipientViewModel.Avatar.StablecoinAvatar[i];
                case 13:
                    return new RecipientViewModel[i];
                case 14:
                    return new ConfirmFirstScheduledReloadNoticeResult$Positive[i];
                case 15:
                    return new SavingsAction.ClientRoute[i];
                case 16:
                    return new SavingsAction.PresentCard[i];
                case 17:
                    return new SavingsCard.Button[i];
                case 18:
                    return new SavingsCard[i];
                case 19:
                    return new SavingsCard.Image.LocalImage[i];
                case 20:
                    return new SavingsCard.Image.RemoteImage[i];
                case 21:
                    return new SavingsScreen.ScreenType.GeneralSavings[i];
                case 22:
                    return new SavingsScreen.ScreenType.GoalDetail[i];
                case 23:
                    return new SavingsScreen.ScreenType.Home[i];
                case 24:
                    return new TransferConfig.ClientRouteTemplate[i];
                case 25:
                    return new TransferConfig.TransferInConfig[i];
                case 26:
                    return new TransferConfig.TransferOutConfig[i];
                case 27:
                    return new GeneralSavingsScreen[i];
                case 28:
                    return new SavingsCardSheet[i];
                default:
                    return new SavingsFullActivityScreen[i];
            }
        }
    }

    /* loaded from: classes7.dex */
    public interface CryptoRecipientPayment extends Parcelable {

        /* loaded from: classes6.dex */
        public final class Bitcoin implements CryptoRecipientPayment {
            public static final Parcelable.Creator<Bitcoin> CREATOR = new Creator(6);
            public final BitcoinPayments payment;

            public Bitcoin(BitcoinPayments bitcoinPayments) {
                bitcoinPayments.getClass();
                this.payment = bitcoinPayments;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Bitcoin) && Intrinsics.areEqual(this.payment, ((Bitcoin) obj).payment);
            }

            public final int hashCode() {
                return this.payment.hashCode();
            }

            public final String toString() {
                return "Bitcoin(payment=" + this.payment + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.payment, i);
            }
        }

        /* loaded from: classes6.dex */
        public final class Solana implements CryptoRecipientPayment {
            public static final Parcelable.Creator<Solana> CREATOR = new Creator(7);
            public final SolanaAddress address;

            public Solana(SolanaAddress solanaAddress) {
                solanaAddress.getClass();
                this.address = solanaAddress;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Solana) && Intrinsics.areEqual(this.address, ((Solana) obj).address);
            }

            public final int hashCode() {
                return this.address.hashCode();
            }

            public final String toString() {
                return "Solana(address=" + this.address + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.address, i);
            }
        }

        /* loaded from: classes6.dex */
        public final class Stablecoin implements CryptoRecipientPayment {
            public static final Parcelable.Creator<Stablecoin> CREATOR = new Creator(8);
            public final String address;
            public final StablecoinWithdrawalOption option;

            public Stablecoin(String str, StablecoinWithdrawalOption stablecoinWithdrawalOption) {
                str.getClass();
                stablecoinWithdrawalOption.getClass();
                this.address = str;
                this.option = stablecoinWithdrawalOption;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Stablecoin)) {
                    return false;
                }
                Stablecoin stablecoin = (Stablecoin) obj;
                return Intrinsics.areEqual(this.address, stablecoin.address) && Intrinsics.areEqual(this.option, stablecoin.option);
            }

            public final int hashCode() {
                return this.option.hashCode() + (this.address.hashCode() * 31);
            }

            public final String toString() {
                return "Stablecoin(address=" + this.address + ", option=" + this.option + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.address);
                parcel.writeParcelable(this.option, i);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Recipient(String str, boolean z, boolean z2, String str2, String str3, String str4, boolean z3, boolean z4, boolean z5, String str5, String str6, Avatar avatar, Image image, String str7, String str8, boolean z6, long j, BlockState blockState, MerchantData merchantData, boolean z7, String str9, Color color, Region region, String str10, Long l, String str11, String str12, String str13, boolean z8, ContactsStatus contactsStatus, Analytics analytics, boolean z9, boolean z10, CryptoRecipientPayment cryptoRecipientPayment, int i, int i2) {
        this(r1, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r4, r16, r17, r19, r20, r21, r22, (i & PKIFailureInfo.badSenderNonce) != 0 ? r22 != null ? ColorsKt.toColor(r22) : null : color, (i & 4194304) != 0 ? null : region, (i & 8388608) != 0 ? null : str10, (i & 16777216) != 0 ? null : l, (i & 33554432) != 0 ? null : str11, (i & 67108864) != 0 ? null : str12, (i & 134217728) != 0 ? null : str13, (i & 268435456) != 0 ? false : z8, (i & PKIFailureInfo.duplicateCertReq) != 0 ? null : contactsStatus, (i & 1073741824) != 0 ? null : analytics, (i & PKIFailureInfo.systemUnavail) != 0 ? false : z9, (i2 & 1) != 0 ? false : z10, (i2 & 2) != 0 ? null : cryptoRecipientPayment);
        String str14 = (i & 1) != 0 ? null : str;
        boolean z11 = (i & 2) != 0 ? false : z;
        boolean z12 = (i & 4) != 0 ? false : z2;
        String str15 = (i & 8) != 0 ? null : str2;
        String str16 = (i & 16) != 0 ? null : str3;
        String str17 = (i & 32) != 0 ? null : str4;
        boolean z13 = (i & 64) != 0 ? false : z3;
        boolean z14 = (i & 128) != 0 ? false : z4;
        boolean z15 = (i & 256) != 0 ? false : z5;
        String str18 = (i & 512) != 0 ? null : str5;
        String str19 = (i & 1024) != 0 ? null : str6;
        Avatar avatar2 = (i & 2048) != 0 ? null : avatar;
        Image image2 = (i & 4096) != 0 ? avatar2 != null ? avatar2.picture : null : image;
        String str20 = (i & PKIFailureInfo.certRevoked) != 0 ? null : str7;
        String str21 = (i & 16384) != 0 ? null : str8;
        boolean z16 = (i & 32768) != 0 ? false : z6;
        long j2 = (i & 65536) != 0 ? 0L : j;
        BlockState blockState2 = (i & PKIFailureInfo.unsupportedVersion) != 0 ? BlockState.NOT_BLOCKED : blockState;
        MerchantData merchantData2 = (i & PKIFailureInfo.transactionIdInUse) != 0 ? null : merchantData;
        boolean z17 = (i & PKIFailureInfo.signerNotTrusted) != 0 ? false : z7;
        String str22 = (i & PKIFailureInfo.badCertTemplate) != 0 ? null : str9;
    }

    public static Recipient copy$default(Recipient recipient, String str, String str2, String str3, String str4, String str5, ContactsStatus contactsStatus, Analytics analytics, boolean z, boolean z2, int i, int i2) {
        Long l;
        String str6;
        boolean z3;
        ContactsStatus contactsStatus2;
        String str7 = recipient.lookupKey;
        boolean z4 = recipient.alreadyInvited;
        boolean z5 = recipient.hasMultipleCustomers;
        String str8 = recipient.customerId;
        String str9 = recipient.threadedCustomerId;
        String str10 = recipient.cashtag;
        boolean z6 = recipient.isCashCustomer;
        boolean z7 = recipient.isVerified;
        boolean z8 = recipient.isBusiness;
        String str11 = (i & 512) != 0 ? recipient.email : str;
        String str12 = (i & 1024) != 0 ? recipient.sms : str2;
        Avatar avatar = recipient.avatar;
        String str13 = str11;
        String str14 = str12;
        Image image = recipient.photo;
        String str15 = (i & PKIFailureInfo.certRevoked) != 0 ? recipient.emailAddresses : str3;
        String str16 = (i & 16384) != 0 ? recipient.smsNumbers : str4;
        boolean z9 = recipient.canAcceptPayments;
        String str17 = str16;
        long j = recipient.creditCardFee;
        BlockState blockState = recipient.blockState;
        MerchantData merchantData = recipient.merchantData;
        boolean z10 = recipient.isRecent;
        String str18 = recipient.rawAccentColor;
        Color color = recipient.themedAccentColor;
        Region region = recipient.region;
        String str19 = recipient.category;
        Long l2 = recipient.joined_on;
        if ((i & 33554432) != 0) {
            l = l2;
            str6 = recipient.fullName;
        } else {
            l = l2;
            str6 = str5;
        }
        String str20 = (i & 67108864) != 0 ? recipient.contactName : null;
        String str21 = recipient.investmentEntityToken;
        boolean z11 = recipient.isInContacts;
        if ((i & PKIFailureInfo.duplicateCertReq) != 0) {
            z3 = z11;
            contactsStatus2 = recipient.contactsStatus;
        } else {
            z3 = z11;
            contactsStatus2 = contactsStatus;
        }
        Analytics analytics2 = (i & 1073741824) != 0 ? recipient.analytics : analytics;
        boolean z12 = (i & PKIFailureInfo.systemUnavail) != 0 ? recipient.isFavorited : z;
        boolean z13 = (i2 & 1) != 0 ? recipient.isSponsorAllowlisted : z2;
        CryptoRecipientPayment cryptoRecipientPayment = recipient.invoice;
        recipient.getClass();
        return new Recipient(str7, z4, z5, str8, str9, str10, z6, z7, z8, str13, str14, avatar, image, str15, str17, z9, j, blockState, merchantData, z10, str18, color, region, str19, l, str6, str20, str21, z3, contactsStatus2, analytics2, z12, z13, cryptoRecipientPayment);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Recipient)) {
            return false;
        }
        Recipient recipient = (Recipient) obj;
        return Intrinsics.areEqual(this.lookupKey, recipient.lookupKey) && this.alreadyInvited == recipient.alreadyInvited && this.hasMultipleCustomers == recipient.hasMultipleCustomers && Intrinsics.areEqual(this.customerId, recipient.customerId) && Intrinsics.areEqual(this.threadedCustomerId, recipient.threadedCustomerId) && Intrinsics.areEqual(this.cashtag, recipient.cashtag) && this.isCashCustomer == recipient.isCashCustomer && this.isVerified == recipient.isVerified && this.isBusiness == recipient.isBusiness && Intrinsics.areEqual(this.email, recipient.email) && Intrinsics.areEqual(this.sms, recipient.sms) && Intrinsics.areEqual(this.avatar, recipient.avatar) && Intrinsics.areEqual(this.photo, recipient.photo) && Intrinsics.areEqual(this.emailAddresses, recipient.emailAddresses) && Intrinsics.areEqual(this.smsNumbers, recipient.smsNumbers) && this.canAcceptPayments == recipient.canAcceptPayments && this.creditCardFee == recipient.creditCardFee && this.blockState == recipient.blockState && Intrinsics.areEqual(this.merchantData, recipient.merchantData) && this.isRecent == recipient.isRecent && Intrinsics.areEqual(this.rawAccentColor, recipient.rawAccentColor) && Intrinsics.areEqual(this.themedAccentColor, recipient.themedAccentColor) && this.region == recipient.region && Intrinsics.areEqual(this.category, recipient.category) && Intrinsics.areEqual(this.joined_on, recipient.joined_on) && Intrinsics.areEqual(this.fullName, recipient.fullName) && Intrinsics.areEqual(this.contactName, recipient.contactName) && Intrinsics.areEqual(this.investmentEntityToken, recipient.investmentEntityToken) && this.isInContacts == recipient.isInContacts && this.contactsStatus == recipient.contactsStatus && Intrinsics.areEqual(this.analytics, recipient.analytics) && this.isFavorited == recipient.isFavorited && this.isSponsorAllowlisted == recipient.isSponsorAllowlisted && Intrinsics.areEqual(this.invoice, recipient.invoice);
    }

    public final Color getAccentColor() {
        Color validate;
        Color color = this.themedAccentColor;
        if (color != null && (validate = ColorsKt.validate(color)) != null) {
            return validate;
        }
        String str = this.rawAccentColor;
        Color validate2 = str != null ? ColorsKt.validate(ColorsKt.toColor(str)) : null;
        return validate2 == null ? ColorsKt.toUiColor(AccentColorsKt.getAccentColor(this.threadedCustomerId, this.customerId, this.fullName, this.sms, this.email)) : validate2;
    }

    public final int hashCode() {
        String str = this.lookupKey;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.alreadyInvited), 31, this.hasMultipleCustomers);
        String str2 = this.customerId;
        int hashCode = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.threadedCustomerId;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cashtag;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.isCashCustomer), 31, this.isVerified), 31, this.isBusiness);
        String str5 = this.email;
        int hashCode3 = (m2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.sms;
        int hashCode4 = (hashCode3 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Avatar avatar = this.avatar;
        int hashCode5 = (hashCode4 + (avatar == null ? 0 : avatar.hashCode())) * 31;
        Image image = this.photo;
        int hashCode6 = (hashCode5 + (image == null ? 0 : image.hashCode())) * 31;
        String str7 = this.emailAddresses;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.smsNumbers;
        int m3 = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31, 31, this.canAcceptPayments), 31, this.creditCardFee);
        BlockState blockState = this.blockState;
        int hashCode8 = (m3 + (blockState == null ? 0 : blockState.hashCode())) * 31;
        MerchantData merchantData = this.merchantData;
        int m4 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode8 + (merchantData == null ? 0 : merchantData.hashCode())) * 31, 31, this.isRecent);
        String str9 = this.rawAccentColor;
        int hashCode9 = (m4 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Color color = this.themedAccentColor;
        int hashCode10 = (hashCode9 + (color == null ? 0 : color.hashCode())) * 31;
        Region region = this.region;
        int hashCode11 = (hashCode10 + (region == null ? 0 : region.hashCode())) * 31;
        String str10 = this.category;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Long l = this.joined_on;
        int hashCode13 = (hashCode12 + (l == null ? 0 : l.hashCode())) * 31;
        String str11 = this.fullName;
        int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.contactName;
        int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.investmentEntityToken;
        int m5 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31, 31, this.isInContacts);
        ContactsStatus contactsStatus = this.contactsStatus;
        int hashCode16 = (m5 + (contactsStatus == null ? 0 : contactsStatus.hashCode())) * 31;
        Analytics analytics = this.analytics;
        int m6 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode16 + (analytics == null ? 0 : analytics.hashCode())) * 31, 31, this.isFavorited), 31, this.isSponsorAllowlisted);
        CryptoRecipientPayment cryptoRecipientPayment = this.invoice;
        return m6 + (cryptoRecipientPayment != null ? cryptoRecipientPayment.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("Recipient(lookupKey=", this.lookupKey, ", alreadyInvited=", ", hasMultipleCustomers=", this.alreadyInvited);
        NavAction$$ExternalSyntheticOutline0.m(m1540m, this.hasMultipleCustomers, ", customerId=", this.customerId, ", threadedCustomerId=");
        Boxes$$ExternalSyntheticOutline1.m(m1540m, this.threadedCustomerId, ", cashtag=", this.cashtag, ", isCashCustomer=");
        re$$ExternalSyntheticOutline0.m(m1540m, this.isCashCustomer, ", isVerified=", this.isVerified, ", isBusiness=");
        NavAction$$ExternalSyntheticOutline0.m(m1540m, this.isBusiness, ", email=", this.email, ", sms=");
        m1540m.append(this.sms);
        m1540m.append(", avatar=");
        m1540m.append(this.avatar);
        m1540m.append(", photo=");
        m1540m.append(this.photo);
        m1540m.append(", emailAddresses=");
        m1540m.append(this.emailAddresses);
        m1540m.append(", smsNumbers=");
        NavAction$$ExternalSyntheticOutline0.m(m1540m, this.smsNumbers, ", canAcceptPayments=", this.canAcceptPayments, ", creditCardFee=");
        m1540m.append(this.creditCardFee);
        m1540m.append(", blockState=");
        m1540m.append(this.blockState);
        m1540m.append(", merchantData=");
        m1540m.append(this.merchantData);
        m1540m.append(", isRecent=");
        m1540m.append(this.isRecent);
        m1540m.append(", rawAccentColor=");
        m1540m.append(this.rawAccentColor);
        m1540m.append(", themedAccentColor=");
        m1540m.append(this.themedAccentColor);
        m1540m.append(", region=");
        m1540m.append(this.region);
        m1540m.append(", category=");
        m1540m.append(this.category);
        m1540m.append(", joined_on=");
        m1540m.append(this.joined_on);
        m1540m.append(", fullName=");
        m1540m.append(this.fullName);
        Boxes$$ExternalSyntheticOutline1.m(m1540m, ", contactName=", this.contactName, ", investmentEntityToken=", this.investmentEntityToken);
        m1540m.append(", isInContacts=");
        m1540m.append(this.isInContacts);
        m1540m.append(", contactsStatus=");
        m1540m.append(this.contactsStatus);
        m1540m.append(", analytics=");
        m1540m.append(this.analytics);
        m1540m.append(", isFavorited=");
        m1540m.append(this.isFavorited);
        m1540m.append(", isSponsorAllowlisted=");
        m1540m.append(this.isSponsorAllowlisted);
        m1540m.append(", invoice=");
        m1540m.append(this.invoice);
        m1540m.append(")");
        return m1540m.toString();
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
        parcel.writeParcelable(this.avatar, i);
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
        parcel.writeInt(this.isInContacts ? 1 : 0);
        ContactsStatus contactsStatus = this.contactsStatus;
        if (contactsStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(contactsStatus.name());
        }
        Analytics analytics = this.analytics;
        if (analytics == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            analytics.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isFavorited ? 1 : 0);
        parcel.writeInt(this.isSponsorAllowlisted ? 1 : 0);
        parcel.writeParcelable(this.invoice, i);
    }

    public final class Analytics implements Parcelable {
        public static final Parcelable.Creator<Analytics> CREATOR = new Creator(5);
        public final Integer absoluteIndex;
        public final String accountHolderToken;
        public final Bucket bucket;
        public final String entityToken;
        public final GenerationStrategy generationStrategy;
        public boolean isAssetSendViewEventTracked;
        public final Boolean isC4bBusiness;
        public final Boolean isFirstLinkedAccount;
        public final Boolean isLinkedAccount;
        public final Boolean isMultipleAccountHolder;
        public boolean isRecipientSearchEventTracked;
        public final Integer matchedAliasLength;
        public final String matchedFields;
        public final Boolean mlSearchEnabled;
        public final String queryToken;
        public final String remoteSuggestionType;
        public final Integer searchTextLength;
        public final String searchType;
        public final String section;
        public final Integer sectionIndex;
        public final Integer sectionTotal;
        public final SuggestionStrategy suggestionStrategy;
        public final Integer total;
        public final Boolean useCashCustomerSearchServiceEnabled;

        public /* synthetic */ Analytics(Bucket bucket, GenerationStrategy generationStrategy, Integer num, Integer num2, Boolean bool, Boolean bool2, String str, Integer num3, Integer num4, Integer num5, Integer num6, SuggestionStrategy suggestionStrategy, String str2, String str3, String str4, String str5, Boolean bool3, Boolean bool4, Boolean bool5, String str6, Boolean bool6, int i) {
            this((i & 1) != 0 ? null : bucket, (i & 2) != 0 ? null : generationStrategy, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : bool2, str, num3, num4, num5, (i & 1024) != 0 ? null : num6, suggestionStrategy, null, (i & PKIFailureInfo.certRevoked) != 0 ? null : str2, (i & 16384) != 0 ? null : str3, (32768 & i) != 0 ? null : str4, (65536 & i) != 0 ? null : str5, false, false, (524288 & i) != 0 ? null : bool3, (1048576 & i) != 0 ? null : bool4, (2097152 & i) != 0 ? null : bool5, (4194304 & i) != 0 ? null : str6, (i & 8388608) != 0 ? null : bool6);
        }

        public static Analytics copy$default(Analytics analytics, Integer num, String str, Integer num2, Integer num3, int i) {
            GenerationStrategy generationStrategy = GenerationStrategy.FAVORITE;
            SuggestionStrategy suggestionStrategy = SuggestionStrategy.FAVORITE;
            Bucket bucket = analytics.bucket;
            if ((i & 2) != 0) {
                generationStrategy = analytics.generationStrategy;
            }
            GenerationStrategy generationStrategy2 = generationStrategy;
            Integer num4 = (i & 4) != 0 ? analytics.absoluteIndex : num;
            Integer num5 = analytics.total;
            Boolean bool = analytics.useCashCustomerSearchServiceEnabled;
            Boolean bool2 = analytics.mlSearchEnabled;
            String str2 = (i & 64) != 0 ? analytics.section : str;
            Integer num6 = (i & 128) != 0 ? analytics.sectionIndex : num2;
            Integer num7 = (i & 256) != 0 ? analytics.sectionTotal : num3;
            Integer num8 = analytics.searchTextLength;
            Integer num9 = analytics.matchedAliasLength;
            if ((i & 2048) != 0) {
                suggestionStrategy = analytics.suggestionStrategy;
            }
            SuggestionStrategy suggestionStrategy2 = suggestionStrategy;
            String str3 = analytics.remoteSuggestionType;
            String str4 = analytics.searchType;
            String str5 = analytics.entityToken;
            String str6 = analytics.matchedFields;
            String str7 = analytics.queryToken;
            boolean z = analytics.isAssetSendViewEventTracked;
            boolean z2 = analytics.isRecipientSearchEventTracked;
            Boolean bool3 = analytics.isC4bBusiness;
            Boolean bool4 = analytics.isMultipleAccountHolder;
            Boolean bool5 = analytics.isFirstLinkedAccount;
            String str8 = analytics.accountHolderToken;
            Boolean bool6 = analytics.isLinkedAccount;
            analytics.getClass();
            return new Analytics(bucket, generationStrategy2, num4, num5, bool, bool2, str2, num6, num7, num8, num9, suggestionStrategy2, str3, str4, str5, str6, str7, z, z2, bool3, bool4, bool5, str8, bool6);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics)) {
                return false;
            }
            Analytics analytics = (Analytics) obj;
            return this.bucket == analytics.bucket && this.generationStrategy == analytics.generationStrategy && Intrinsics.areEqual(this.absoluteIndex, analytics.absoluteIndex) && Intrinsics.areEqual(this.total, analytics.total) && Intrinsics.areEqual(this.useCashCustomerSearchServiceEnabled, analytics.useCashCustomerSearchServiceEnabled) && Intrinsics.areEqual(this.mlSearchEnabled, analytics.mlSearchEnabled) && Intrinsics.areEqual(this.section, analytics.section) && Intrinsics.areEqual(this.sectionIndex, analytics.sectionIndex) && Intrinsics.areEqual(this.sectionTotal, analytics.sectionTotal) && Intrinsics.areEqual(this.searchTextLength, analytics.searchTextLength) && Intrinsics.areEqual(this.matchedAliasLength, analytics.matchedAliasLength) && this.suggestionStrategy == analytics.suggestionStrategy && Intrinsics.areEqual(this.remoteSuggestionType, analytics.remoteSuggestionType) && Intrinsics.areEqual(this.searchType, analytics.searchType) && Intrinsics.areEqual(this.entityToken, analytics.entityToken) && Intrinsics.areEqual(this.matchedFields, analytics.matchedFields) && Intrinsics.areEqual(this.queryToken, analytics.queryToken) && this.isAssetSendViewEventTracked == analytics.isAssetSendViewEventTracked && this.isRecipientSearchEventTracked == analytics.isRecipientSearchEventTracked && Intrinsics.areEqual(this.isC4bBusiness, analytics.isC4bBusiness) && Intrinsics.areEqual(this.isMultipleAccountHolder, analytics.isMultipleAccountHolder) && Intrinsics.areEqual(this.isFirstLinkedAccount, analytics.isFirstLinkedAccount) && Intrinsics.areEqual(this.accountHolderToken, analytics.accountHolderToken) && Intrinsics.areEqual(this.isLinkedAccount, analytics.isLinkedAccount);
        }

        public final int hashCode() {
            Bucket bucket = this.bucket;
            int hashCode = (bucket == null ? 0 : bucket.hashCode()) * 31;
            GenerationStrategy generationStrategy = this.generationStrategy;
            int hashCode2 = (hashCode + (generationStrategy == null ? 0 : generationStrategy.hashCode())) * 31;
            Integer num = this.absoluteIndex;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.total;
            int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Boolean bool = this.useCashCustomerSearchServiceEnabled;
            int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.mlSearchEnabled;
            int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str = this.section;
            int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num3 = this.sectionIndex;
            int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.sectionTotal;
            int hashCode9 = (hashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.searchTextLength;
            int hashCode10 = (hashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.matchedAliasLength;
            int hashCode11 = (hashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31;
            SuggestionStrategy suggestionStrategy = this.suggestionStrategy;
            int hashCode12 = (hashCode11 + (suggestionStrategy == null ? 0 : suggestionStrategy.hashCode())) * 31;
            String str2 = this.remoteSuggestionType;
            int hashCode13 = (hashCode12 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.searchType;
            int hashCode14 = (hashCode13 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.entityToken;
            int hashCode15 = (hashCode14 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.matchedFields;
            int hashCode16 = (hashCode15 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.queryToken;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode16 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.isAssetSendViewEventTracked), 31, this.isRecipientSearchEventTracked);
            Boolean bool3 = this.isC4bBusiness;
            int hashCode17 = (m + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.isMultipleAccountHolder;
            int hashCode18 = (hashCode17 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.isFirstLinkedAccount;
            int hashCode19 = (hashCode18 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            String str7 = this.accountHolderToken;
            int hashCode20 = (hashCode19 + (str7 == null ? 0 : str7.hashCode())) * 31;
            Boolean bool6 = this.isLinkedAccount;
            return hashCode20 + (bool6 != null ? bool6.hashCode() : 0);
        }

        public final String toString() {
            boolean z = this.isAssetSendViewEventTracked;
            boolean z2 = this.isRecipientSearchEventTracked;
            StringBuilder sb = new StringBuilder("Analytics(bucket=");
            sb.append(this.bucket);
            sb.append(", generationStrategy=");
            sb.append(this.generationStrategy);
            sb.append(", absoluteIndex=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.absoluteIndex, ", total=", this.total, ", useCashCustomerSearchServiceEnabled=");
            Thread$State$EnumUnboxingLocalUtility.m(sb, this.useCashCustomerSearchServiceEnabled, ", mlSearchEnabled=", this.mlSearchEnabled, ", section=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.section, ", sectionIndex=", this.sectionIndex, ", sectionTotal=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.sectionTotal, ", searchTextLength=", this.searchTextLength, ", matchedAliasLength=");
            sb.append(this.matchedAliasLength);
            sb.append(", suggestionStrategy=");
            sb.append(this.suggestionStrategy);
            sb.append(", remoteSuggestionType=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.remoteSuggestionType, ", searchType=", this.searchType, ", entityToken=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.entityToken, ", matchedFields=", this.matchedFields, ", queryToken=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.queryToken, ", isAssetSendViewEventTracked=", z, ", isRecipientSearchEventTracked=");
            sb.append(z2);
            sb.append(", isC4bBusiness=");
            sb.append(this.isC4bBusiness);
            sb.append(", isMultipleAccountHolder=");
            Thread$State$EnumUnboxingLocalUtility.m(sb, this.isMultipleAccountHolder, ", isFirstLinkedAccount=", this.isFirstLinkedAccount, ", accountHolderToken=");
            sb.append(this.accountHolderToken);
            sb.append(", isLinkedAccount=");
            sb.append(this.isLinkedAccount);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Bucket bucket = this.bucket;
            if (bucket == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(bucket.name());
            }
            GenerationStrategy generationStrategy = this.generationStrategy;
            if (generationStrategy == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(generationStrategy.name());
            }
            Integer num = this.absoluteIndex;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
            }
            Integer num2 = this.total;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num2);
            }
            Boolean bool = this.useCashCustomerSearchServiceEnabled;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool);
            }
            Boolean bool2 = this.mlSearchEnabled;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool2);
            }
            parcel.writeString(this.section);
            Integer num3 = this.sectionIndex;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num3);
            }
            Integer num4 = this.sectionTotal;
            if (num4 == null) {
                parcel.writeInt(0);
            } else {
                NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num4);
            }
            Integer num5 = this.searchTextLength;
            if (num5 == null) {
                parcel.writeInt(0);
            } else {
                NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num5);
            }
            Integer num6 = this.matchedAliasLength;
            if (num6 == null) {
                parcel.writeInt(0);
            } else {
                NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num6);
            }
            SuggestionStrategy suggestionStrategy = this.suggestionStrategy;
            if (suggestionStrategy == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(suggestionStrategy.name());
            }
            parcel.writeString(this.remoteSuggestionType);
            parcel.writeString(this.searchType);
            parcel.writeString(this.entityToken);
            parcel.writeString(this.matchedFields);
            parcel.writeString(this.queryToken);
            parcel.writeInt(this.isAssetSendViewEventTracked ? 1 : 0);
            parcel.writeInt(this.isRecipientSearchEventTracked ? 1 : 0);
            Boolean bool3 = this.isC4bBusiness;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool3);
            }
            Boolean bool4 = this.isMultipleAccountHolder;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool4);
            }
            Boolean bool5 = this.isFirstLinkedAccount;
            if (bool5 == null) {
                parcel.writeInt(0);
            } else {
                CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool5);
            }
            parcel.writeString(this.accountHolderToken);
            Boolean bool6 = this.isLinkedAccount;
            if (bool6 == null) {
                parcel.writeInt(0);
            } else {
                CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool6);
            }
        }

        public Analytics(Bucket bucket, GenerationStrategy generationStrategy, Integer num, Integer num2, Boolean bool, Boolean bool2, String str, Integer num3, Integer num4, Integer num5, Integer num6, SuggestionStrategy suggestionStrategy, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, Boolean bool3, Boolean bool4, Boolean bool5, String str7, Boolean bool6) {
            this.bucket = bucket;
            this.generationStrategy = generationStrategy;
            this.absoluteIndex = num;
            this.total = num2;
            this.useCashCustomerSearchServiceEnabled = bool;
            this.mlSearchEnabled = bool2;
            this.section = str;
            this.sectionIndex = num3;
            this.sectionTotal = num4;
            this.searchTextLength = num5;
            this.matchedAliasLength = num6;
            this.suggestionStrategy = suggestionStrategy;
            this.remoteSuggestionType = str2;
            this.searchType = str3;
            this.entityToken = str4;
            this.matchedFields = str5;
            this.queryToken = str6;
            this.isAssetSendViewEventTracked = z;
            this.isRecipientSearchEventTracked = z2;
            this.isC4bBusiness = bool3;
            this.isMultipleAccountHolder = bool4;
            this.isFirstLinkedAccount = bool5;
            this.accountHolderToken = str7;
            this.isLinkedAccount = bool6;
        }
    }

    public Recipient(String str, boolean z, boolean z2, String str2, String str3, String str4, boolean z3, boolean z4, boolean z5, String str5, String str6, Avatar avatar, Image image, String str7, String str8, boolean z6, long j, BlockState blockState, MerchantData merchantData, boolean z7, String str9, Color color, Region region, String str10, Long l, String str11, String str12, String str13, boolean z8, ContactsStatus contactsStatus, Analytics analytics, boolean z9, boolean z10, CryptoRecipientPayment cryptoRecipientPayment) {
        String str14 = str11;
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
        this.avatar = avatar;
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
        this.fullName = str14;
        this.contactName = str12;
        this.investmentEntityToken = str13;
        this.isInContacts = z8;
        this.contactsStatus = contactsStatus;
        this.analytics = analytics;
        this.isFavorited = z9;
        this.isSponsorAllowlisted = z10;
        this.invoice = cryptoRecipientPayment;
        final int i = 0;
        this.firstName$delegate = LazyKt.lazy(new Function0(this) { // from class: com.squareup.cash.recipients.data.Recipient$$ExternalSyntheticLambda0
            public final /* synthetic */ Recipient f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List split$default;
                String str15;
                String str16;
                String str17;
                Character firstOrNull;
                String str18;
                int i2 = i;
                Recipient recipient = this.f$0;
                switch (i2) {
                    case 0:
                        String str19 = recipient.fullName;
                        return (str19 == null || (split$default = StringsKt.split$default(str19, new char[]{' '}, 6)) == null || (str15 = (String) CollectionsKt.firstOrNull(split$default)) == null) ? "" : str15;
                    default:
                        String str20 = recipient.fullName;
                        String str21 = recipient.email;
                        String str22 = recipient.displayName;
                        if (str20 == null || StringsKt.isBlank(str20)) {
                            String str23 = recipient.sms;
                            if (str23 == null) {
                                str23 = "";
                            }
                            Region region2 = recipient.region;
                            if (region2 == null || (str16 = Regions.toCountry(region2).name()) == null) {
                                str16 = "US";
                            }
                            if (PhoneNumbers.isValid(str23, str16)) {
                                String format2 = PhoneNumbers.format(str23, str16, null);
                                if (format2 != null) {
                                    return format2;
                                }
                                if (str22 == null) {
                                    return "";
                                }
                            } else {
                                if (str21 != null && (!StringsKt.isBlank(str21))) {
                                    return str21;
                                }
                                if (str22 == null) {
                                    return "";
                                }
                            }
                            return str22;
                        }
                        List split$default2 = StringsKt.split$default(str20, new char[]{' '}, 6);
                        String str24 = (String) CollectionsKt.firstOrNull(split$default2);
                        if (str24 == null) {
                            str24 = "";
                        }
                        StringBuilder sb = new StringBuilder();
                        if (split$default2.size() > 1) {
                            int size = split$default2.size();
                            for (int i3 = 1; i3 < size; i3++) {
                                String str25 = (String) CollectionsKt.getOrNull(i3, split$default2);
                                if (str25 != null && StringsKt.contains((CharSequence) str25, '-', false)) {
                                    List split$default3 = StringsKt.split$default(str25, new char[]{'-'}, 6);
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it = split$default3.iterator();
                                    while (it.hasNext()) {
                                        Character firstOrNull2 = StringsKt___StringsKt.firstOrNull((String) it.next());
                                        if (firstOrNull2 != null) {
                                            String valueOf = String.valueOf(firstOrNull2.charValue());
                                            valueOf.getClass();
                                            str18 = valueOf.toUpperCase(Locale.ROOT);
                                            str18.getClass();
                                        } else {
                                            str18 = null;
                                        }
                                        if (str18 != null) {
                                            arrayList.add(str18);
                                        }
                                    }
                                    str17 = CollectionsKt.joinToString$default(arrayList, ".", null, null, 0, null, null, 62).concat(".");
                                } else if (str25 == null || (firstOrNull = StringsKt___StringsKt.firstOrNull(str25)) == null) {
                                    str17 = "";
                                } else {
                                    String valueOf2 = String.valueOf(firstOrNull.charValue());
                                    valueOf2.getClass();
                                    String upperCase = valueOf2.toUpperCase(Locale.ROOT);
                                    upperCase.getClass();
                                    str17 = upperCase.concat(".");
                                }
                                sb.append(str17);
                            }
                        } else {
                            sb.append("");
                        }
                        String sb2 = sb.toString();
                        StringBuilder m = Boxes$$ExternalSyntheticOutline1.m(str24);
                        if (!StringsKt.isBlank(sb2)) {
                            m.append(" ");
                            m.append(sb2);
                        }
                        return m.toString();
                }
            }
        });
        final int i2 = 1;
        this.abbreviatedName$delegate = LazyKt.lazy(new Function0(this) { // from class: com.squareup.cash.recipients.data.Recipient$$ExternalSyntheticLambda0
            public final /* synthetic */ Recipient f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List split$default;
                String str15;
                String str16;
                String str17;
                Character firstOrNull;
                String str18;
                int i22 = i2;
                Recipient recipient = this.f$0;
                switch (i22) {
                    case 0:
                        String str19 = recipient.fullName;
                        return (str19 == null || (split$default = StringsKt.split$default(str19, new char[]{' '}, 6)) == null || (str15 = (String) CollectionsKt.firstOrNull(split$default)) == null) ? "" : str15;
                    default:
                        String str20 = recipient.fullName;
                        String str21 = recipient.email;
                        String str22 = recipient.displayName;
                        if (str20 == null || StringsKt.isBlank(str20)) {
                            String str23 = recipient.sms;
                            if (str23 == null) {
                                str23 = "";
                            }
                            Region region2 = recipient.region;
                            if (region2 == null || (str16 = Regions.toCountry(region2).name()) == null) {
                                str16 = "US";
                            }
                            if (PhoneNumbers.isValid(str23, str16)) {
                                String format2 = PhoneNumbers.format(str23, str16, null);
                                if (format2 != null) {
                                    return format2;
                                }
                                if (str22 == null) {
                                    return "";
                                }
                            } else {
                                if (str21 != null && (!StringsKt.isBlank(str21))) {
                                    return str21;
                                }
                                if (str22 == null) {
                                    return "";
                                }
                            }
                            return str22;
                        }
                        List split$default2 = StringsKt.split$default(str20, new char[]{' '}, 6);
                        String str24 = (String) CollectionsKt.firstOrNull(split$default2);
                        if (str24 == null) {
                            str24 = "";
                        }
                        StringBuilder sb = new StringBuilder();
                        if (split$default2.size() > 1) {
                            int size = split$default2.size();
                            for (int i3 = 1; i3 < size; i3++) {
                                String str25 = (String) CollectionsKt.getOrNull(i3, split$default2);
                                if (str25 != null && StringsKt.contains((CharSequence) str25, '-', false)) {
                                    List split$default3 = StringsKt.split$default(str25, new char[]{'-'}, 6);
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it = split$default3.iterator();
                                    while (it.hasNext()) {
                                        Character firstOrNull2 = StringsKt___StringsKt.firstOrNull((String) it.next());
                                        if (firstOrNull2 != null) {
                                            String valueOf = String.valueOf(firstOrNull2.charValue());
                                            valueOf.getClass();
                                            str18 = valueOf.toUpperCase(Locale.ROOT);
                                            str18.getClass();
                                        } else {
                                            str18 = null;
                                        }
                                        if (str18 != null) {
                                            arrayList.add(str18);
                                        }
                                    }
                                    str17 = CollectionsKt.joinToString$default(arrayList, ".", null, null, 0, null, null, 62).concat(".");
                                } else if (str25 == null || (firstOrNull = StringsKt___StringsKt.firstOrNull(str25)) == null) {
                                    str17 = "";
                                } else {
                                    String valueOf2 = String.valueOf(firstOrNull.charValue());
                                    valueOf2.getClass();
                                    String upperCase = valueOf2.toUpperCase(Locale.ROOT);
                                    upperCase.getClass();
                                    str17 = upperCase.concat(".");
                                }
                                sb.append(str17);
                            }
                        } else {
                            sb.append("");
                        }
                        String sb2 = sb.toString();
                        StringBuilder m = Boxes$$ExternalSyntheticOutline1.m(str24);
                        if (!StringsKt.isBlank(sb2)) {
                            m.append(" ");
                            m.append(sb2);
                        }
                        return m.toString();
                }
            }
        });
        String str15 = null;
        if (str14 != null) {
            str14 = StringsKt.isBlank(str14) ? null : str14;
            if (str14 != null) {
                str15 = str14;
                this.displayName = str15;
            }
        }
        String fromString = Cashtags.fromString(str4, region);
        fromString = (fromString == null || StringsKt.isBlank(fromString)) ? null : fromString;
        if (fromString == null) {
            String str16 = (str5 == null || StringsKt.isBlank(str5)) ? null : str5;
            if (str16 != null) {
                str15 = str16;
            } else if (str6 != null && !StringsKt.isBlank(str6)) {
                str15 = str6;
            }
        } else {
            str15 = fromString;
        }
        this.displayName = str15;
    }
}
