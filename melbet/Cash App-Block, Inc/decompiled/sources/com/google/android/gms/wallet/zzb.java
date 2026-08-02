package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import com.google.android.libraries.places.api.model.EVConnectorType;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.zzcq;
import com.google.android.libraries.places.api.model.zzcs;
import com.google.android.libraries.places.api.model.zzcu;
import com.google.android.libraries.places.api.model.zzcw;
import com.google.android.libraries.places.api.model.zzcy;
import com.google.android.libraries.places.api.model.zzda;
import com.google.android.libraries.places.api.model.zzdc;
import com.google.android.libraries.places.api.model.zzde;
import com.google.android.libraries.places.api.model.zzdg;
import com.google.android.libraries.places.api.model.zzdi;
import com.google.android.libraries.places.api.model.zzdm;
import com.google.android.libraries.places.api.model.zzdo;
import com.google.android.libraries.places.api.model.zzdq;
import com.squareup.cash.directory_ui.views.ComposeUtilsKt;
import java.time.Instant;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzb implements Parcelable.Creator {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zzb(int i) {
        this.$r8$classId = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2 = 4;
        boolean z = true;
        boolean z2 = false;
        int i3 = 0;
        boolean z3 = false;
        int i4 = 0;
        boolean z4 = false;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        boolean z5 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList = null;
        String str4 = null;
        String str5 = null;
        ArrayList arrayList2 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        ArrayList arrayList3 = null;
        String str9 = null;
        Bundle bundle = null;
        String str10 = null;
        String str11 = null;
        CardRequirements cardRequirements = null;
        String str12 = null;
        switch (this.$r8$classId) {
            case 0:
                int validateObjectHeader = ComposeUtilsKt.validateObjectHeader(parcel);
                String str13 = null;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                String str21 = null;
                while (parcel.dataPosition() < validateObjectHeader) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 2:
                            str = ComposeUtilsKt.createString(parcel, readInt);
                            break;
                        case 3:
                            str13 = ComposeUtilsKt.createString(parcel, readInt);
                            break;
                        case 4:
                            str14 = ComposeUtilsKt.createString(parcel, readInt);
                            break;
                        case 5:
                            str15 = ComposeUtilsKt.createString(parcel, readInt);
                            break;
                        case 6:
                            str16 = ComposeUtilsKt.createString(parcel, readInt);
                            break;
                        case 7:
                            str17 = ComposeUtilsKt.createString(parcel, readInt);
                            break;
                        case '\b':
                            str18 = ComposeUtilsKt.createString(parcel, readInt);
                            break;
                        case '\t':
                            str19 = ComposeUtilsKt.createString(parcel, readInt);
                            break;
                        case '\n':
                            str20 = ComposeUtilsKt.createString(parcel, readInt);
                            break;
                        case 11:
                            z2 = ComposeUtilsKt.readBoolean(parcel, readInt);
                            break;
                        case '\f':
                            str21 = ComposeUtilsKt.createString(parcel, readInt);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader);
                zza zzaVar = new zza();
                zzaVar.zza = str;
                zzaVar.zzb = str13;
                zzaVar.zzc = str14;
                zzaVar.zzd = str15;
                zzaVar.zze = str16;
                zzaVar.zzf = str17;
                zzaVar.zzg = str18;
                zzaVar.zzh = str19;
                zzaVar.zzi = str20;
                zzaVar.zzj = z2;
                zzaVar.zzk = str21;
                return zzaVar;
            case 1:
                int validateObjectHeader2 = ComposeUtilsKt.validateObjectHeader(parcel);
                CardInfo cardInfo = null;
                UserAddress userAddress = null;
                PaymentMethodToken paymentMethodToken = null;
                String str22 = null;
                Bundle bundle2 = null;
                String str23 = null;
                Bundle bundle3 = null;
                while (parcel.dataPosition() < validateObjectHeader2) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            str12 = ComposeUtilsKt.createString(parcel, readInt2);
                            break;
                        case 2:
                            cardInfo = (CardInfo) ComposeUtilsKt.createParcelable(parcel, readInt2, CardInfo.CREATOR);
                            break;
                        case 3:
                            userAddress = (UserAddress) ComposeUtilsKt.createParcelable(parcel, readInt2, UserAddress.CREATOR);
                            break;
                        case 4:
                            paymentMethodToken = (PaymentMethodToken) ComposeUtilsKt.createParcelable(parcel, readInt2, PaymentMethodToken.CREATOR);
                            break;
                        case 5:
                            str22 = ComposeUtilsKt.createString(parcel, readInt2);
                            break;
                        case 6:
                            bundle2 = ComposeUtilsKt.createBundle(parcel, readInt2);
                            break;
                        case 7:
                            str23 = ComposeUtilsKt.createString(parcel, readInt2);
                            break;
                        case '\b':
                            bundle3 = ComposeUtilsKt.createBundle(parcel, readInt2);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt2);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader2);
                PaymentData paymentData = new PaymentData();
                paymentData.zza = str12;
                paymentData.zzb = cardInfo;
                paymentData.zzc = userAddress;
                paymentData.zzd = paymentMethodToken;
                paymentData.zze = str22;
                paymentData.zzf = bundle2;
                paymentData.zzg = str23;
                paymentData.zzh = bundle3;
                return paymentData;
            case 2:
                int validateObjectHeader3 = ComposeUtilsKt.validateObjectHeader(parcel);
                boolean z6 = false;
                boolean z7 = false;
                ShippingAddressRequirements shippingAddressRequirements = null;
                ArrayList arrayList4 = null;
                PaymentMethodTokenizationParameters paymentMethodTokenizationParameters = null;
                TransactionInfo transactionInfo = null;
                String str24 = null;
                byte[] bArr = null;
                Bundle bundle4 = null;
                while (parcel.dataPosition() < validateObjectHeader3) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            z5 = ComposeUtilsKt.readBoolean(parcel, readInt3);
                            break;
                        case 2:
                            z6 = ComposeUtilsKt.readBoolean(parcel, readInt3);
                            break;
                        case 3:
                            cardRequirements = (CardRequirements) ComposeUtilsKt.createParcelable(parcel, readInt3, CardRequirements.CREATOR);
                            break;
                        case 4:
                            z7 = ComposeUtilsKt.readBoolean(parcel, readInt3);
                            break;
                        case 5:
                            shippingAddressRequirements = (ShippingAddressRequirements) ComposeUtilsKt.createParcelable(parcel, readInt3, ShippingAddressRequirements.CREATOR);
                            break;
                        case 6:
                            arrayList4 = ComposeUtilsKt.createIntegerList(parcel, readInt3);
                            break;
                        case 7:
                            paymentMethodTokenizationParameters = (PaymentMethodTokenizationParameters) ComposeUtilsKt.createParcelable(parcel, readInt3, PaymentMethodTokenizationParameters.CREATOR);
                            break;
                        case '\b':
                            transactionInfo = (TransactionInfo) ComposeUtilsKt.createParcelable(parcel, readInt3, TransactionInfo.CREATOR);
                            break;
                        case '\t':
                            z = ComposeUtilsKt.readBoolean(parcel, readInt3);
                            break;
                        case '\n':
                            str24 = ComposeUtilsKt.createString(parcel, readInt3);
                            break;
                        case 11:
                            bundle4 = ComposeUtilsKt.createBundle(parcel, readInt3);
                            break;
                        case '\f':
                            bArr = ComposeUtilsKt.createByteArray(parcel, readInt3);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt3);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader3);
                PaymentDataRequest paymentDataRequest = new PaymentDataRequest();
                paymentDataRequest.zza = z5;
                paymentDataRequest.zzb = z6;
                paymentDataRequest.zzc = cardRequirements;
                paymentDataRequest.zzd = z7;
                paymentDataRequest.zze = shippingAddressRequirements;
                paymentDataRequest.zzf = arrayList4;
                paymentDataRequest.zzg = paymentMethodTokenizationParameters;
                paymentDataRequest.zzh = transactionInfo;
                paymentDataRequest.zzi = z;
                paymentDataRequest.zzj = str24;
                paymentDataRequest.zzk = bArr;
                paymentDataRequest.zzl = bundle4;
                return paymentDataRequest;
            case 3:
                int validateObjectHeader4 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader4) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt4);
                    } else {
                        str11 = ComposeUtilsKt.createString(parcel, readInt4);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader4);
                return new PaymentMetadata(str11);
            case 4:
                int validateObjectHeader5 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader5) {
                    int readInt5 = parcel.readInt();
                    char c = (char) readInt5;
                    if (c == 2) {
                        i9 = ComposeUtilsKt.readInt(parcel, readInt5);
                    } else if (c != 3) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt5);
                    } else {
                        str10 = ComposeUtilsKt.createString(parcel, readInt5);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader5);
                PaymentMethodToken paymentMethodToken2 = new PaymentMethodToken();
                paymentMethodToken2.zza = i9;
                paymentMethodToken2.zzb = str10;
                return paymentMethodToken2;
            case 5:
                int validateObjectHeader6 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader6) {
                    int readInt6 = parcel.readInt();
                    char c2 = (char) readInt6;
                    if (c2 == 2) {
                        i8 = ComposeUtilsKt.readInt(parcel, readInt6);
                    } else if (c2 != 3) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt6);
                    } else {
                        bundle = ComposeUtilsKt.createBundle(parcel, readInt6);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader6);
                return new PaymentMethodTokenizationParameters(i8, bundle);
            case 6:
                int validateObjectHeader7 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i10 = 0;
                String str25 = null;
                while (parcel.dataPosition() < validateObjectHeader7) {
                    int readInt7 = parcel.readInt();
                    char c3 = (char) readInt7;
                    if (c3 == 2) {
                        str9 = ComposeUtilsKt.createString(parcel, readInt7);
                    } else if (c3 == 3) {
                        str25 = ComposeUtilsKt.createString(parcel, readInt7);
                    } else if (c3 == 4) {
                        i7 = ComposeUtilsKt.readInt(parcel, readInt7);
                    } else if (c3 != 5) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt7);
                    } else {
                        i10 = ComposeUtilsKt.readInt(parcel, readInt7);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader7);
                return new ProxyCard(str9, i7, i10, str25);
            case 7:
                int validateObjectHeader8 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader8) {
                    int readInt8 = parcel.readInt();
                    if (((char) readInt8) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt8);
                    } else {
                        arrayList3 = ComposeUtilsKt.createStringList(parcel, readInt8);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader8);
                ShippingAddressRequirements shippingAddressRequirements2 = new ShippingAddressRequirements();
                shippingAddressRequirements2.zza = arrayList3;
                return shippingAddressRequirements2;
            case 8:
                int validateObjectHeader9 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str26 = null;
                while (parcel.dataPosition() < validateObjectHeader9) {
                    int readInt9 = parcel.readInt();
                    char c4 = (char) readInt9;
                    if (c4 == 1) {
                        i6 = ComposeUtilsKt.readInt(parcel, readInt9);
                    } else if (c4 == 2) {
                        str8 = ComposeUtilsKt.createString(parcel, readInt9);
                    } else if (c4 != 3) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt9);
                    } else {
                        str26 = ComposeUtilsKt.createString(parcel, readInt9);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader9);
                TransactionInfo transactionInfo2 = new TransactionInfo();
                transactionInfo2.zza = i6;
                transactionInfo2.zzb = str8;
                transactionInfo2.zzc = str26;
                return transactionInfo2;
            case 9:
                int validateObjectHeader10 = ComposeUtilsKt.validateObjectHeader(parcel);
                Bundle bundle5 = null;
                while (parcel.dataPosition() < validateObjectHeader10) {
                    int readInt10 = parcel.readInt();
                    char c5 = (char) readInt10;
                    if (c5 == 2) {
                        str7 = ComposeUtilsKt.createString(parcel, readInt10);
                    } else if (c5 != 3) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt10);
                    } else {
                        bundle5 = ComposeUtilsKt.createBundle(parcel, readInt10);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader10);
                WebPaymentData webPaymentData = new WebPaymentData();
                webPaymentData.zza = str7;
                webPaymentData.zzb = bundle5;
                return webPaymentData;
            case 10:
                int validateObjectHeader11 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str27 = null;
                String str28 = null;
                UserAddress userAddress2 = null;
                while (parcel.dataPosition() < validateObjectHeader11) {
                    int readInt11 = parcel.readInt();
                    char c6 = (char) readInt11;
                    if (c6 == 1) {
                        str6 = ComposeUtilsKt.createString(parcel, readInt11);
                    } else if (c6 == 2) {
                        str27 = ComposeUtilsKt.createString(parcel, readInt11);
                    } else if (c6 == 3) {
                        str28 = ComposeUtilsKt.createString(parcel, readInt11);
                    } else if (c6 == 4) {
                        i5 = ComposeUtilsKt.readInt(parcel, readInt11);
                    } else if (c6 != 5) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt11);
                    } else {
                        userAddress2 = (UserAddress) ComposeUtilsKt.createParcelable(parcel, readInt11, UserAddress.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader11);
                CardInfo cardInfo2 = new CardInfo();
                cardInfo2.zza = str6;
                cardInfo2.zzb = str27;
                cardInfo2.zzc = str28;
                cardInfo2.zzd = i5;
                cardInfo2.zze = userAddress2;
                return cardInfo2;
            case 11:
                int validateObjectHeader12 = ComposeUtilsKt.validateObjectHeader(parcel);
                boolean z8 = true;
                int i11 = 0;
                while (parcel.dataPosition() < validateObjectHeader12) {
                    int readInt12 = parcel.readInt();
                    char c7 = (char) readInt12;
                    if (c7 == 1) {
                        arrayList2 = ComposeUtilsKt.createIntegerList(parcel, readInt12);
                    } else if (c7 == 2) {
                        z8 = ComposeUtilsKt.readBoolean(parcel, readInt12);
                    } else if (c7 == 3) {
                        z4 = ComposeUtilsKt.readBoolean(parcel, readInt12);
                    } else if (c7 != 4) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt12);
                    } else {
                        i11 = ComposeUtilsKt.readInt(parcel, readInt12);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader12);
                CardRequirements cardRequirements2 = new CardRequirements();
                cardRequirements2.zza = arrayList2;
                cardRequirements2.zzb = z8;
                cardRequirements2.zzc = z4;
                cardRequirements2.zzd = i11;
                return cardRequirements2;
            case 12:
                int validateObjectHeader13 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str29 = null;
                ProxyCard proxyCard = null;
                String str30 = null;
                zza zzaVar2 = null;
                zza zzaVar3 = null;
                String[] strArr = null;
                UserAddress userAddress3 = null;
                UserAddress userAddress4 = null;
                InstrumentInfo[] instrumentInfoArr = null;
                PaymentMethodToken paymentMethodToken3 = null;
                while (parcel.dataPosition() < validateObjectHeader13) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 2:
                            str5 = ComposeUtilsKt.createString(parcel, readInt13);
                            break;
                        case 3:
                            str29 = ComposeUtilsKt.createString(parcel, readInt13);
                            break;
                        case 4:
                            proxyCard = (ProxyCard) ComposeUtilsKt.createParcelable(parcel, readInt13, ProxyCard.CREATOR);
                            break;
                        case 5:
                            str30 = ComposeUtilsKt.createString(parcel, readInt13);
                            break;
                        case 6:
                            zzaVar2 = (zza) ComposeUtilsKt.createParcelable(parcel, readInt13, zza.CREATOR);
                            break;
                        case 7:
                            zzaVar3 = (zza) ComposeUtilsKt.createParcelable(parcel, readInt13, zza.CREATOR);
                            break;
                        case '\b':
                            strArr = ComposeUtilsKt.createStringArray(parcel, readInt13);
                            break;
                        case '\t':
                            userAddress3 = (UserAddress) ComposeUtilsKt.createParcelable(parcel, readInt13, UserAddress.CREATOR);
                            break;
                        case '\n':
                            userAddress4 = (UserAddress) ComposeUtilsKt.createParcelable(parcel, readInt13, UserAddress.CREATOR);
                            break;
                        case 11:
                            instrumentInfoArr = (InstrumentInfo[]) ComposeUtilsKt.createTypedArray(parcel, readInt13, InstrumentInfo.CREATOR);
                            break;
                        case '\f':
                            paymentMethodToken3 = (PaymentMethodToken) ComposeUtilsKt.createParcelable(parcel, readInt13, PaymentMethodToken.CREATOR);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt13);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader13);
                FullWallet fullWallet = new FullWallet();
                fullWallet.zza = str5;
                fullWallet.zzb = str29;
                fullWallet.zzc = proxyCard;
                fullWallet.zzd = str30;
                fullWallet.zze = zzaVar2;
                fullWallet.zzf = zzaVar3;
                fullWallet.zzg = strArr;
                fullWallet.zzh = userAddress3;
                fullWallet.zzi = userAddress4;
                fullWallet.zzj = instrumentInfoArr;
                fullWallet.zzk = paymentMethodToken3;
                return fullWallet;
            case 13:
                int validateObjectHeader14 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str31 = null;
                while (parcel.dataPosition() < validateObjectHeader14) {
                    int readInt14 = parcel.readInt();
                    char c8 = (char) readInt14;
                    if (c8 == 2) {
                        str4 = ComposeUtilsKt.createString(parcel, readInt14);
                    } else if (c8 == 3) {
                        str31 = ComposeUtilsKt.createString(parcel, readInt14);
                    } else if (c8 != 4) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt14);
                    } else {
                        i4 = ComposeUtilsKt.readInt(parcel, readInt14);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader14);
                InstrumentInfo instrumentInfo = new InstrumentInfo();
                instrumentInfo.zza = str4;
                instrumentInfo.zzb = str31;
                instrumentInfo.zzc = i4;
                return instrumentInfo;
            case 14:
                int validateObjectHeader15 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str32 = null;
                String str33 = null;
                ArrayList arrayList5 = null;
                String str34 = null;
                while (parcel.dataPosition() < validateObjectHeader15) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 2:
                            arrayList = ComposeUtilsKt.createIntegerList(parcel, readInt15);
                            break;
                        case 3:
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt15);
                            break;
                        case 4:
                            str32 = ComposeUtilsKt.createString(parcel, readInt15);
                            break;
                        case 5:
                            str33 = ComposeUtilsKt.createString(parcel, readInt15);
                            break;
                        case 6:
                            arrayList5 = ComposeUtilsKt.createIntegerList(parcel, readInt15);
                            break;
                        case 7:
                            z3 = ComposeUtilsKt.readBoolean(parcel, readInt15);
                            break;
                        case '\b':
                            str34 = ComposeUtilsKt.createString(parcel, readInt15);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader15);
                IsReadyToPayRequest isReadyToPayRequest = new IsReadyToPayRequest();
                isReadyToPayRequest.zza = arrayList;
                isReadyToPayRequest.zzb = str32;
                isReadyToPayRequest.zzc = str33;
                isReadyToPayRequest.zzd = arrayList5;
                isReadyToPayRequest.zze = z3;
                isReadyToPayRequest.zzf = str34;
                return isReadyToPayRequest;
            case 15:
                int validateObjectHeader16 = ComposeUtilsKt.validateObjectHeader(parcel);
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = new ArrayList();
                int i12 = 0;
                boolean z9 = false;
                String str35 = null;
                String str36 = null;
                String str37 = null;
                String str38 = null;
                String str39 = null;
                String str40 = null;
                String str41 = null;
                String str42 = null;
                String str43 = null;
                String str44 = null;
                TimeInterval timeInterval = null;
                String str45 = null;
                String str46 = null;
                LoyaltyPoints loyaltyPoints = null;
                ArrayList arrayList11 = new ArrayList();
                while (parcel.dataPosition() < validateObjectHeader16) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 2:
                            str35 = ComposeUtilsKt.createString(parcel, readInt16);
                            break;
                        case 3:
                            str36 = ComposeUtilsKt.createString(parcel, readInt16);
                            break;
                        case 4:
                            str37 = ComposeUtilsKt.createString(parcel, readInt16);
                            break;
                        case 5:
                            str38 = ComposeUtilsKt.createString(parcel, readInt16);
                            break;
                        case 6:
                            str39 = ComposeUtilsKt.createString(parcel, readInt16);
                            break;
                        case 7:
                            str40 = ComposeUtilsKt.createString(parcel, readInt16);
                            break;
                        case '\b':
                            str41 = ComposeUtilsKt.createString(parcel, readInt16);
                            break;
                        case '\t':
                            str42 = ComposeUtilsKt.createString(parcel, readInt16);
                            break;
                        case '\n':
                            str43 = ComposeUtilsKt.createString(parcel, readInt16);
                            break;
                        case 11:
                            str44 = ComposeUtilsKt.createString(parcel, readInt16);
                            break;
                        case '\f':
                            i12 = ComposeUtilsKt.readInt(parcel, readInt16);
                            break;
                        case '\r':
                            arrayList6 = ComposeUtilsKt.createTypedList(parcel, readInt16, WalletObjectMessage.CREATOR);
                            break;
                        case 14:
                            timeInterval = (TimeInterval) ComposeUtilsKt.createParcelable(parcel, readInt16, TimeInterval.CREATOR);
                            break;
                        case 15:
                            arrayList7 = ComposeUtilsKt.createTypedList(parcel, readInt16, LatLng.CREATOR);
                            break;
                        case 16:
                            str45 = ComposeUtilsKt.createString(parcel, readInt16);
                            break;
                        case 17:
                            str46 = ComposeUtilsKt.createString(parcel, readInt16);
                            break;
                        case 18:
                            arrayList8 = ComposeUtilsKt.createTypedList(parcel, readInt16, LabelValueRow.CREATOR);
                            break;
                        case 19:
                            z9 = ComposeUtilsKt.readBoolean(parcel, readInt16);
                            break;
                        case 20:
                            arrayList9 = ComposeUtilsKt.createTypedList(parcel, readInt16, UriData.CREATOR);
                            break;
                        case 21:
                            arrayList10 = ComposeUtilsKt.createTypedList(parcel, readInt16, TextModuleData.CREATOR);
                            break;
                        case 22:
                            arrayList11 = ComposeUtilsKt.createTypedList(parcel, readInt16, UriData.CREATOR);
                            break;
                        case 23:
                            loyaltyPoints = (LoyaltyPoints) ComposeUtilsKt.createParcelable(parcel, readInt16, LoyaltyPoints.CREATOR);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt16);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader16);
                return new LoyaltyWalletObject(str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, i12, arrayList6, timeInterval, arrayList7, str45, str46, arrayList8, z9, arrayList9, arrayList10, arrayList11, loyaltyPoints);
            case 16:
                int validateObjectHeader17 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str47 = null;
                String[] strArr2 = null;
                String str48 = null;
                zza zzaVar4 = null;
                zza zzaVar5 = null;
                LoyaltyWalletObject[] loyaltyWalletObjectArr = null;
                OfferWalletObject[] offerWalletObjectArr = null;
                UserAddress userAddress5 = null;
                UserAddress userAddress6 = null;
                InstrumentInfo[] instrumentInfoArr2 = null;
                while (parcel.dataPosition() < validateObjectHeader17) {
                    int readInt17 = parcel.readInt();
                    switch ((char) readInt17) {
                        case 2:
                            str3 = ComposeUtilsKt.createString(parcel, readInt17);
                            break;
                        case 3:
                            str47 = ComposeUtilsKt.createString(parcel, readInt17);
                            break;
                        case 4:
                            strArr2 = ComposeUtilsKt.createStringArray(parcel, readInt17);
                            break;
                        case 5:
                            str48 = ComposeUtilsKt.createString(parcel, readInt17);
                            break;
                        case 6:
                            zzaVar4 = (zza) ComposeUtilsKt.createParcelable(parcel, readInt17, zza.CREATOR);
                            break;
                        case 7:
                            zzaVar5 = (zza) ComposeUtilsKt.createParcelable(parcel, readInt17, zza.CREATOR);
                            break;
                        case '\b':
                            loyaltyWalletObjectArr = (LoyaltyWalletObject[]) ComposeUtilsKt.createTypedArray(parcel, readInt17, LoyaltyWalletObject.CREATOR);
                            break;
                        case '\t':
                            offerWalletObjectArr = (OfferWalletObject[]) ComposeUtilsKt.createTypedArray(parcel, readInt17, OfferWalletObject.CREATOR);
                            break;
                        case '\n':
                            userAddress5 = (UserAddress) ComposeUtilsKt.createParcelable(parcel, readInt17, UserAddress.CREATOR);
                            break;
                        case 11:
                            userAddress6 = (UserAddress) ComposeUtilsKt.createParcelable(parcel, readInt17, UserAddress.CREATOR);
                            break;
                        case '\f':
                            instrumentInfoArr2 = (InstrumentInfo[]) ComposeUtilsKt.createTypedArray(parcel, readInt17, InstrumentInfo.CREATOR);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt17);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader17);
                MaskedWallet maskedWallet = new MaskedWallet();
                maskedWallet.zza = str3;
                maskedWallet.zzb = str47;
                maskedWallet.zzc = strArr2;
                maskedWallet.zzd = str48;
                maskedWallet.zze = zzaVar4;
                maskedWallet.zzf = zzaVar5;
                maskedWallet.zzg = loyaltyWalletObjectArr;
                maskedWallet.zzh = offerWalletObjectArr;
                maskedWallet.zzi = userAddress5;
                maskedWallet.zzj = userAddress6;
                maskedWallet.zzk = instrumentInfoArr2;
                return maskedWallet;
            case 17:
                int validateObjectHeader18 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str49 = null;
                CommonWalletObject commonWalletObject = null;
                while (parcel.dataPosition() < validateObjectHeader18) {
                    int readInt18 = parcel.readInt();
                    char c9 = (char) readInt18;
                    if (c9 == 1) {
                        i3 = ComposeUtilsKt.readInt(parcel, readInt18);
                    } else if (c9 == 2) {
                        str2 = ComposeUtilsKt.createString(parcel, readInt18);
                    } else if (c9 == 3) {
                        str49 = ComposeUtilsKt.createString(parcel, readInt18);
                    } else if (c9 != 4) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt18);
                    } else {
                        commonWalletObject = (CommonWalletObject) ComposeUtilsKt.createParcelable(parcel, readInt18, CommonWalletObject.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader18);
                return new OfferWalletObject(i3, str2, str49, commonWalletObject);
            case 18:
                return new zzcq((Place.BooleanPlaceAttributeValue) parcel.readParcelable(zzcq.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(zzcq.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(zzcq.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(zzcq.class.getClassLoader()));
            case 19:
                return new zzcs(parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readArrayList(zzcs.class.getClassLoader()));
            case 20:
                return new zzcu(parcel.readArrayList(zzcu.class.getClassLoader()));
            case 21:
                return new zzcw(parcel.readArrayList(zzcw.class.getClassLoader()), parcel.readArrayList(zzcw.class.getClassLoader()));
            case 22:
                String readString = parcel.readInt() == 0 ? parcel.readString() : null;
                String readString2 = parcel.readInt() == 0 ? parcel.readString() : null;
                String readString3 = parcel.readInt() == 0 ? parcel.readString() : null;
                String readString4 = parcel.readInt() == 0 ? parcel.readString() : null;
                if (parcel.readInt() == 0) {
                    String readString5 = parcel.readString();
                    if (readString5 != null) {
                        if (readString5.equals("CONTAINMENT_UNSPECIFIED")) {
                            i2 = 1;
                        } else if (readString5.equals("WITHIN")) {
                            i2 = 2;
                        } else if (readString5.equals("OUTSKIRTS")) {
                            i2 = 3;
                        } else if (!readString5.equals("NEAR")) {
                            a$$ExternalSyntheticBUOutline0.m$3("No enum constant com.google.android.libraries.places.api.model.Area.Containment.".concat(readString5));
                        }
                        i = i2;
                    } else {
                        a$$ExternalSyntheticBUOutline0.m$2("Name is null");
                    }
                    i2 = 0;
                    i = i2;
                } else {
                    i = 0;
                }
                return new zzcy(readString, i, readString2, readString3, readString4);
            case 23:
                return new zzda(parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
            case 24:
                return new zzdc(parcel.readArrayList(zzdc.class.getClassLoader()));
            case 25:
                return new zzde(parcel.readString(), parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readArrayList(zzde.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readArrayList(zzde.class.getClassLoader()), parcel.readArrayList(zzde.class.getClassLoader()), parcel.readArrayList(zzde.class.getClassLoader()));
            case 26:
                return new zzdg(parcel.readInt(), parcel.readInt());
            case 27:
                return new zzdi((ParcelUuid) parcel.readParcelable(zzdi.class.getClassLoader()));
            case 28:
                return new zzdm((EVConnectorType) parcel.readParcelable(zzdm.class.getClassLoader()), Double.valueOf(parcel.readDouble()), Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() == 0 ? (Instant) parcel.readSerializable() : null);
            default:
                return new zzdo(parcel.readInt() == 0 ? parcel.readString() : null, (zzdq) parcel.readParcelable(zzdo.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.$r8$classId) {
            case 0:
                return new zza[i];
            case 1:
                return new PaymentData[i];
            case 2:
                return new PaymentDataRequest[i];
            case 3:
                return new PaymentMetadata[i];
            case 4:
                return new PaymentMethodToken[i];
            case 5:
                return new PaymentMethodTokenizationParameters[i];
            case 6:
                return new ProxyCard[i];
            case 7:
                return new ShippingAddressRequirements[i];
            case 8:
                return new TransactionInfo[i];
            case 9:
                return new WebPaymentData[i];
            case 10:
                return new CardInfo[i];
            case 11:
                return new CardRequirements[i];
            case 12:
                return new FullWallet[i];
            case 13:
                return new InstrumentInfo[i];
            case 14:
                return new IsReadyToPayRequest[i];
            case 15:
                return new LoyaltyWalletObject[i];
            case 16:
                return new MaskedWallet[i];
            case 17:
                return new OfferWalletObject[i];
            case 18:
                return new zzcq[i];
            case 19:
                return new zzcs[i];
            case 20:
                return new zzcu[i];
            case 21:
                return new zzcw[i];
            case 22:
                return new zzcy[i];
            case 23:
                return new zzda[i];
            case 24:
                return new zzdc[i];
            case 25:
                return new zzde[i];
            case 26:
                return new zzdg[i];
            case 27:
                return new zzdi[i];
            case 28:
                return new zzdm[i];
            default:
                return new zzdo[i];
        }
    }
}
