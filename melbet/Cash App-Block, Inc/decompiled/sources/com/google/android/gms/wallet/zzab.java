package com.google.android.gms.wallet;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.widget.RemoteViews;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.ContactlessSetupItem;
import com.google.android.gms.tapandpay.firstparty.zzau;
import com.google.android.gms.tapandpay.firstparty.zzn;
import com.google.android.gms.tapandpay.firstparty.zzp;
import com.google.android.gms.tapandpay.firstparty.zzr;
import com.google.android.gms.tapandpay.firstparty.zzt;
import com.google.android.gms.tapandpay.firstparty.zzv;
import com.google.android.gms.tapandpay.firstparty.zzx;
import com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsResponse;
import com.google.android.gms.tapandpay.globalactions.GlobalActionCard;
import com.google.android.gms.tapandpay.issuer.PushProvisionSessionContext;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.issuer.TokenInfo;
import com.google.android.gms.tapandpay.issuer.TokenStatus;
import com.google.android.gms.tapandpay.issuer.UserAddress;
import com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletConfig;
import com.google.android.gms.wallet.button.GetInstrumentAvailabilityResponse;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenResponse;
import com.google.android.gms.wallet.firstparty.GetClientTokenResponse;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysResponse;
import com.google.android.gms.wallet.firstparty.WarmUpUiProcessResponse;
import com.google.android.gms.wallet.firstparty.saveinstrument.GetSaveInstrumentDetailsResponse;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wallet.wobs.LabelValue;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.LoyaltyPointsBalance;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import com.squareup.cash.directory_ui.views.ComposeUtilsKt;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzab implements Parcelable.Creator {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zzab(int i) {
        this.$r8$classId = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        long j = 0;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        PendingIntent pendingIntent = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        PendingIntent pendingIntent2 = null;
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        String[] strArr = null;
        String str8 = null;
        String[] strArr2 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        GlobalActionCard[] globalActionCardArr = null;
        ContactlessSetupItem[] contactlessSetupItemArr = null;
        int[] iArr = null;
        zzau[] zzauVarArr = null;
        switch (this.$r8$classId) {
            case 0:
                int validateObjectHeader = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt);
                    } else {
                        pendingIntent = (PendingIntent) ComposeUtilsKt.createParcelable(parcel, readInt, PendingIntent.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader);
                PaymentCardRecognitionIntentResponse paymentCardRecognitionIntentResponse = new PaymentCardRecognitionIntentResponse();
                paymentCardRecognitionIntentResponse.zza = pendingIntent;
                return paymentCardRecognitionIntentResponse;
            case 1:
                int validateObjectHeader2 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader2) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt2);
                    } else {
                        zzauVarArr = (zzau[]) ComposeUtilsKt.createTypedArray(parcel, readInt2, zzau.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader2);
                return new zzn(zzauVarArr);
            case 2:
                int validateObjectHeader3 = ComposeUtilsKt.validateObjectHeader(parcel);
                com.google.android.gms.tapandpay.firstparty.CardInfo[] cardInfoArr = null;
                AccountInfo accountInfo = null;
                String str13 = null;
                String str14 = null;
                SparseArray sparseArray = null;
                byte[] bArr4 = null;
                while (parcel.dataPosition() < validateObjectHeader3) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 2:
                            cardInfoArr = (com.google.android.gms.tapandpay.firstparty.CardInfo[]) ComposeUtilsKt.createTypedArray(parcel, readInt3, com.google.android.gms.tapandpay.firstparty.CardInfo.CREATOR);
                            break;
                        case 3:
                            accountInfo = (AccountInfo) ComposeUtilsKt.createParcelable(parcel, readInt3, AccountInfo.CREATOR);
                            break;
                        case 4:
                            str13 = ComposeUtilsKt.createString(parcel, readInt3);
                            break;
                        case 5:
                            str14 = ComposeUtilsKt.createString(parcel, readInt3);
                            break;
                        case 6:
                            int readSize = ComposeUtilsKt.readSize(parcel, readInt3);
                            int dataPosition = parcel.dataPosition();
                            if (readSize == 0) {
                                sparseArray = null;
                                break;
                            } else {
                                SparseArray sparseArray2 = new SparseArray();
                                int readInt4 = parcel.readInt();
                                for (int i8 = 0; i8 < readInt4; i8++) {
                                    sparseArray2.append(parcel.readInt(), parcel.readString());
                                }
                                parcel.setDataPosition(dataPosition + readSize);
                                sparseArray = sparseArray2;
                                break;
                            }
                        case 7:
                            bArr4 = ComposeUtilsKt.createByteArray(parcel, readInt3);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt3);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader3);
                return new zzp(cardInfoArr, accountInfo, str13, str14, sparseArray, bArr4);
            case 3:
                int validateObjectHeader4 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader4) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt5);
                    } else {
                        iArr = ComposeUtilsKt.createIntArray(parcel, readInt5);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader4);
                return new zzr(iArr);
            case 4:
                int validateObjectHeader5 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader5) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt6);
                    } else {
                        contactlessSetupItemArr = (ContactlessSetupItem[]) ComposeUtilsKt.createTypedArray(parcel, readInt6, ContactlessSetupItem.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader5);
                return new zzt(contactlessSetupItemArr);
            case 5:
                int validateObjectHeader6 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader6) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt7);
                    } else {
                        z = ComposeUtilsKt.readBoolean(parcel, readInt7);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader6);
                zzv zzvVar = new zzv();
                zzvVar.zza = z;
                return zzvVar;
            case 6:
                int validateObjectHeader7 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader7) {
                    int readInt8 = parcel.readInt();
                    char c = (char) readInt8;
                    if (c == 1) {
                        i7 = ComposeUtilsKt.readInt(parcel, readInt8);
                    } else if (c != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt8);
                    } else {
                        j = ComposeUtilsKt.readLong(parcel, readInt8);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader7);
                return new zzx(i7, j);
            case 7:
                int validateObjectHeader8 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader8) {
                    int readInt9 = parcel.readInt();
                    char c2 = (char) readInt9;
                    if (c2 == 1) {
                        globalActionCardArr = (GlobalActionCard[]) ComposeUtilsKt.createTypedArray(parcel, readInt9, GlobalActionCard.CREATOR);
                    } else if (c2 != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt9);
                    } else {
                        i6 = ComposeUtilsKt.readInt(parcel, readInt9);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader8);
                GetGlobalActionCardsResponse getGlobalActionCardsResponse = new GetGlobalActionCardsResponse();
                getGlobalActionCardsResponse.zza = globalActionCardArr;
                getGlobalActionCardsResponse.zzb = i6;
                return getGlobalActionCardsResponse;
            case 8:
                int validateObjectHeader9 = ComposeUtilsKt.validateObjectHeader(parcel);
                Bitmap bitmap = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                Bitmap bitmap2 = null;
                PendingIntent pendingIntent3 = null;
                while (parcel.dataPosition() < validateObjectHeader9) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 1:
                            i5 = ComposeUtilsKt.readInt(parcel, readInt10);
                            break;
                        case 2:
                            str12 = ComposeUtilsKt.createString(parcel, readInt10);
                            break;
                        case 3:
                            bitmap = (Bitmap) ComposeUtilsKt.createParcelable(parcel, readInt10, Bitmap.CREATOR);
                            break;
                        case 4:
                            str15 = ComposeUtilsKt.createString(parcel, readInt10);
                            break;
                        case 5:
                            str16 = ComposeUtilsKt.createString(parcel, readInt10);
                            break;
                        case 6:
                            bitmap2 = (Bitmap) ComposeUtilsKt.createParcelable(parcel, readInt10, Bitmap.CREATOR);
                            break;
                        case 7:
                            pendingIntent3 = (PendingIntent) ComposeUtilsKt.createParcelable(parcel, readInt10, PendingIntent.CREATOR);
                            break;
                        case '\b':
                            str17 = ComposeUtilsKt.createString(parcel, readInt10);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt10);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader9);
                GlobalActionCard globalActionCard = new GlobalActionCard();
                globalActionCard.zza = i5;
                globalActionCard.zzb = str12;
                globalActionCard.zzc = bitmap;
                globalActionCard.zzd = str15;
                globalActionCard.zze = str16;
                globalActionCard.zzf = str17;
                globalActionCard.zzg = bitmap2;
                globalActionCard.zzh = pendingIntent3;
                return globalActionCard;
            case 9:
                int validateObjectHeader10 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str18 = null;
                String str19 = null;
                while (parcel.dataPosition() < validateObjectHeader10) {
                    int readInt11 = parcel.readInt();
                    char c3 = (char) readInt11;
                    if (c3 == 1) {
                        str11 = ComposeUtilsKt.createString(parcel, readInt11);
                    } else if (c3 == 2) {
                        str18 = ComposeUtilsKt.createString(parcel, readInt11);
                    } else if (c3 != 3) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt11);
                    } else {
                        str19 = ComposeUtilsKt.createString(parcel, readInt11);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader10);
                return new PushProvisionSessionContext(str11, str18, str19);
            case 10:
                int validateObjectHeader11 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i9 = 0;
                int i10 = 0;
                boolean z3 = false;
                byte[] bArr5 = null;
                String str20 = null;
                String str21 = null;
                UserAddress userAddress = null;
                int[] iArr2 = null;
                IBinder iBinder = null;
                while (parcel.dataPosition() < validateObjectHeader11) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 2:
                            i9 = ComposeUtilsKt.readInt(parcel, readInt12);
                            break;
                        case 3:
                            i10 = ComposeUtilsKt.readInt(parcel, readInt12);
                            break;
                        case 4:
                            bArr5 = ComposeUtilsKt.createByteArray(parcel, readInt12);
                            break;
                        case 5:
                            str20 = ComposeUtilsKt.createString(parcel, readInt12);
                            break;
                        case 6:
                            str21 = ComposeUtilsKt.createString(parcel, readInt12);
                            break;
                        case 7:
                            userAddress = (UserAddress) ComposeUtilsKt.createParcelable(parcel, readInt12, UserAddress.CREATOR);
                            break;
                        case '\b':
                            z3 = ComposeUtilsKt.readBoolean(parcel, readInt12);
                            break;
                        case '\t':
                            iArr2 = ComposeUtilsKt.createIntArray(parcel, readInt12);
                            break;
                        case '\n':
                            iBinder = ComposeUtilsKt.readIBinder(parcel, readInt12);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt12);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader11);
                return new PushTokenizeRequest(i9, i10, bArr5, str20, str21, userAddress, z3, iArr2, iBinder);
            case 11:
                int validateObjectHeader12 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                boolean z4 = false;
                String str22 = null;
                String str23 = null;
                String str24 = null;
                String str25 = null;
                String str26 = null;
                while (parcel.dataPosition() < validateObjectHeader12) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 1:
                            str22 = ComposeUtilsKt.createString(parcel, readInt13);
                            break;
                        case 2:
                            str23 = ComposeUtilsKt.createString(parcel, readInt13);
                            break;
                        case 3:
                            str24 = ComposeUtilsKt.createString(parcel, readInt13);
                            break;
                        case 4:
                            str25 = ComposeUtilsKt.createString(parcel, readInt13);
                            break;
                        case 5:
                            i11 = ComposeUtilsKt.readInt(parcel, readInt13);
                            break;
                        case 6:
                            i12 = ComposeUtilsKt.readInt(parcel, readInt13);
                            break;
                        case 7:
                            i13 = ComposeUtilsKt.readInt(parcel, readInt13);
                            break;
                        case '\b':
                            z4 = ComposeUtilsKt.readBoolean(parcel, readInt13);
                            break;
                        case '\t':
                            str26 = ComposeUtilsKt.createString(parcel, readInt13);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt13);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader12);
                return new TokenInfo(str22, str23, str24, str25, i11, i12, i13, z4, str26);
            case 12:
                int validateObjectHeader13 = ComposeUtilsKt.validateObjectHeader(parcel);
                boolean z5 = false;
                while (parcel.dataPosition() < validateObjectHeader13) {
                    int readInt14 = parcel.readInt();
                    char c4 = (char) readInt14;
                    if (c4 == 2) {
                        str10 = ComposeUtilsKt.createString(parcel, readInt14);
                    } else if (c4 == 3) {
                        i4 = ComposeUtilsKt.readInt(parcel, readInt14);
                    } else if (c4 != 4) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt14);
                    } else {
                        z5 = ComposeUtilsKt.readBoolean(parcel, readInt14);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader13);
                return new TokenStatus(str10, i4, z5);
            case 13:
                int validateObjectHeader14 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str27 = null;
                String str28 = null;
                String str29 = null;
                String str30 = null;
                String str31 = null;
                String str32 = null;
                String str33 = null;
                String str34 = null;
                String str35 = null;
                String str36 = null;
                String str37 = null;
                String str38 = null;
                String str39 = null;
                while (parcel.dataPosition() < validateObjectHeader14) {
                    int readInt15 = parcel.readInt();
                    boolean z6 = z2;
                    switch ((char) readInt15) {
                        case 2:
                            str9 = ComposeUtilsKt.createString(parcel, readInt15);
                            break;
                        case 3:
                            str27 = ComposeUtilsKt.createString(parcel, readInt15);
                            break;
                        case 4:
                            str28 = ComposeUtilsKt.createString(parcel, readInt15);
                            break;
                        case 5:
                            str29 = ComposeUtilsKt.createString(parcel, readInt15);
                            break;
                        case 6:
                            str30 = ComposeUtilsKt.createString(parcel, readInt15);
                            break;
                        case 7:
                            str31 = ComposeUtilsKt.createString(parcel, readInt15);
                            break;
                        case '\b':
                            str32 = ComposeUtilsKt.createString(parcel, readInt15);
                            break;
                        case '\t':
                            str33 = ComposeUtilsKt.createString(parcel, readInt15);
                            break;
                        case '\n':
                            str34 = ComposeUtilsKt.createString(parcel, readInt15);
                            break;
                        case 11:
                            str35 = ComposeUtilsKt.createString(parcel, readInt15);
                            break;
                        case '\f':
                            str36 = ComposeUtilsKt.createString(parcel, readInt15);
                            break;
                        case '\r':
                            str37 = ComposeUtilsKt.createString(parcel, readInt15);
                            break;
                        case 14:
                            z2 = ComposeUtilsKt.readBoolean(parcel, readInt15);
                            continue;
                        case 15:
                            str38 = ComposeUtilsKt.createString(parcel, readInt15);
                            break;
                        case 16:
                            str39 = ComposeUtilsKt.createString(parcel, readInt15);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt15);
                            break;
                    }
                    z2 = z6;
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader14);
                UserAddress userAddress2 = new UserAddress();
                userAddress2.zza = str9;
                userAddress2.zzb = str27;
                userAddress2.zzc = str28;
                userAddress2.zzd = str29;
                userAddress2.zze = str30;
                userAddress2.zzf = str31;
                userAddress2.zzg = str32;
                userAddress2.zzh = str33;
                userAddress2.zzi = str34;
                userAddress2.zzj = str35;
                userAddress2.zzk = str36;
                userAddress2.zzl = str37;
                userAddress2.zzm = z2;
                userAddress2.zzn = str38;
                userAddress2.zzo = str39;
                return userAddress2;
            case 14:
                int validateObjectHeader15 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i14 = 0;
                int i15 = 0;
                while (parcel.dataPosition() < validateObjectHeader15) {
                    int readInt16 = parcel.readInt();
                    char c5 = (char) readInt16;
                    if (c5 == 1) {
                        i3 = ComposeUtilsKt.readInt(parcel, readInt16);
                    } else if (c5 == 2) {
                        i14 = ComposeUtilsKt.readInt(parcel, readInt16);
                    } else if (c5 == 3) {
                        i15 = ComposeUtilsKt.readInt(parcel, readInt16);
                    } else if (c5 != 5) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt16);
                    } else {
                        strArr2 = ComposeUtilsKt.createStringArray(parcel, readInt16);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader15);
                QuickAccessWalletConfig quickAccessWalletConfig = new QuickAccessWalletConfig();
                quickAccessWalletConfig.zza = i3;
                quickAccessWalletConfig.zzb = i14;
                quickAccessWalletConfig.zzc = i15;
                quickAccessWalletConfig.zzd = strArr2;
                return quickAccessWalletConfig;
            case 15:
                int validateObjectHeader16 = ComposeUtilsKt.validateObjectHeader(parcel);
                boolean z7 = false;
                String str40 = null;
                String str41 = null;
                String str42 = null;
                String str43 = null;
                String str44 = null;
                String str45 = null;
                while (parcel.dataPosition() < validateObjectHeader16) {
                    int readInt17 = parcel.readInt();
                    switch ((char) readInt17) {
                        case 1:
                            str8 = ComposeUtilsKt.createString(parcel, readInt17);
                            break;
                        case 2:
                            i2 = ComposeUtilsKt.readInt(parcel, readInt17);
                            break;
                        case 3:
                            z7 = ComposeUtilsKt.readBoolean(parcel, readInt17);
                            break;
                        case 4:
                            str40 = ComposeUtilsKt.createString(parcel, readInt17);
                            break;
                        case 5:
                            str41 = ComposeUtilsKt.createString(parcel, readInt17);
                            break;
                        case 6:
                            str42 = ComposeUtilsKt.createString(parcel, readInt17);
                            break;
                        case 7:
                            str43 = ComposeUtilsKt.createString(parcel, readInt17);
                            break;
                        case '\b':
                            str44 = ComposeUtilsKt.createString(parcel, readInt17);
                            break;
                        case '\t':
                            str45 = ComposeUtilsKt.createString(parcel, readInt17);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt17);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader16);
                GetInstrumentAvailabilityResponse getInstrumentAvailabilityResponse = new GetInstrumentAvailabilityResponse();
                getInstrumentAvailabilityResponse.zza = str8;
                getInstrumentAvailabilityResponse.zzb = i2;
                getInstrumentAvailabilityResponse.zzc = z7;
                getInstrumentAvailabilityResponse.zzd = str40;
                getInstrumentAvailabilityResponse.zze = str41;
                getInstrumentAvailabilityResponse.zzf = str42;
                getInstrumentAvailabilityResponse.zzg = str43;
                getInstrumentAvailabilityResponse.zzh = str44;
                getInstrumentAvailabilityResponse.zzi = str45;
                return getInstrumentAvailabilityResponse;
            case 16:
                int validateObjectHeader17 = ComposeUtilsKt.validateObjectHeader(parcel);
                int[] iArr3 = null;
                RemoteViews remoteViews = null;
                byte[] bArr6 = null;
                while (parcel.dataPosition() < validateObjectHeader17) {
                    int readInt18 = parcel.readInt();
                    char c6 = (char) readInt18;
                    if (c6 == 1) {
                        strArr = ComposeUtilsKt.createStringArray(parcel, readInt18);
                    } else if (c6 == 2) {
                        iArr3 = ComposeUtilsKt.createIntArray(parcel, readInt18);
                    } else if (c6 == 3) {
                        remoteViews = (RemoteViews) ComposeUtilsKt.createParcelable(parcel, readInt18, RemoteViews.CREATOR);
                    } else if (c6 != 4) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt18);
                    } else {
                        bArr6 = ComposeUtilsKt.createByteArray(parcel, readInt18);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader17);
                GetSaveInstrumentDetailsResponse getSaveInstrumentDetailsResponse = new GetSaveInstrumentDetailsResponse();
                getSaveInstrumentDetailsResponse.zza = strArr;
                getSaveInstrumentDetailsResponse.zzb = iArr3;
                getSaveInstrumentDetailsResponse.zzc = remoteViews;
                getSaveInstrumentDetailsResponse.zzd = bArr6;
                return getSaveInstrumentDetailsResponse;
            case 17:
                int validateObjectHeader18 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader18) {
                    int readInt19 = parcel.readInt();
                    if (((char) readInt19) != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt19);
                    } else {
                        bArr3 = ComposeUtilsKt.createByteArray(parcel, readInt19);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader18);
                GetBuyFlowInitializationTokenResponse getBuyFlowInitializationTokenResponse = new GetBuyFlowInitializationTokenResponse();
                getBuyFlowInitializationTokenResponse.zza = bArr3;
                return getBuyFlowInitializationTokenResponse;
            case 18:
                int validateObjectHeader19 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader19) {
                    int readInt20 = parcel.readInt();
                    if (((char) readInt20) != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt20);
                    } else {
                        bArr2 = ComposeUtilsKt.createByteArray(parcel, readInt20);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader19);
                GetClientTokenResponse getClientTokenResponse = new GetClientTokenResponse();
                getClientTokenResponse.zza = bArr2;
                return getClientTokenResponse;
            case 19:
                int validateObjectHeader20 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader20) {
                    int readInt21 = parcel.readInt();
                    if (((char) readInt21) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt21);
                    } else {
                        bArr = ComposeUtilsKt.createByteArray(parcel, readInt21);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader20);
                return new SetUpBiometricAuthenticationKeysResponse(bArr);
            case 20:
                int validateObjectHeader21 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader21) {
                    int readInt22 = parcel.readInt();
                    if (((char) readInt22) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt22);
                    } else {
                        pendingIntent2 = (PendingIntent) ComposeUtilsKt.createParcelable(parcel, readInt22, PendingIntent.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader21);
                return new WarmUpUiProcessResponse(pendingIntent2);
            case 21:
                int validateObjectHeader22 = ComposeUtilsKt.validateObjectHeader(parcel);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = arrayList;
                ArrayList arrayList5 = arrayList2;
                ArrayList arrayList6 = arrayList3;
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                int i16 = 0;
                boolean z8 = false;
                String str46 = null;
                String str47 = null;
                String str48 = null;
                String str49 = null;
                String str50 = null;
                String str51 = null;
                String str52 = null;
                String str53 = null;
                TimeInterval timeInterval = null;
                String str54 = null;
                String str55 = null;
                while (parcel.dataPosition() < validateObjectHeader22) {
                    int readInt23 = parcel.readInt();
                    switch ((char) readInt23) {
                        case 2:
                            str46 = ComposeUtilsKt.createString(parcel, readInt23);
                            break;
                        case 3:
                            str47 = ComposeUtilsKt.createString(parcel, readInt23);
                            break;
                        case 4:
                            str48 = ComposeUtilsKt.createString(parcel, readInt23);
                            break;
                        case 5:
                            str49 = ComposeUtilsKt.createString(parcel, readInt23);
                            break;
                        case 6:
                            str50 = ComposeUtilsKt.createString(parcel, readInt23);
                            break;
                        case 7:
                            str51 = ComposeUtilsKt.createString(parcel, readInt23);
                            break;
                        case '\b':
                            str52 = ComposeUtilsKt.createString(parcel, readInt23);
                            break;
                        case '\t':
                            str53 = ComposeUtilsKt.createString(parcel, readInt23);
                            break;
                        case '\n':
                            i16 = ComposeUtilsKt.readInt(parcel, readInt23);
                            break;
                        case 11:
                            arrayList4 = ComposeUtilsKt.createTypedList(parcel, readInt23, WalletObjectMessage.CREATOR);
                            break;
                        case '\f':
                            timeInterval = (TimeInterval) ComposeUtilsKt.createParcelable(parcel, readInt23, TimeInterval.CREATOR);
                            break;
                        case '\r':
                            arrayList5 = ComposeUtilsKt.createTypedList(parcel, readInt23, LatLng.CREATOR);
                            break;
                        case 14:
                            str54 = ComposeUtilsKt.createString(parcel, readInt23);
                            break;
                        case 15:
                            str55 = ComposeUtilsKt.createString(parcel, readInt23);
                            break;
                        case 16:
                            arrayList6 = ComposeUtilsKt.createTypedList(parcel, readInt23, LabelValueRow.CREATOR);
                            break;
                        case 17:
                            z8 = ComposeUtilsKt.readBoolean(parcel, readInt23);
                            break;
                        case 18:
                            arrayList7 = ComposeUtilsKt.createTypedList(parcel, readInt23, UriData.CREATOR);
                            break;
                        case 19:
                            arrayList8 = ComposeUtilsKt.createTypedList(parcel, readInt23, TextModuleData.CREATOR);
                            break;
                        case 20:
                            arrayList9 = ComposeUtilsKt.createTypedList(parcel, readInt23, UriData.CREATOR);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt23);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader22);
                return new CommonWalletObject(str46, str47, str48, str49, str50, str51, str52, str53, i16, arrayList4, timeInterval, arrayList5, str54, str55, arrayList6, z8, arrayList7, arrayList8, arrayList9);
            case 22:
                int validateObjectHeader23 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str56 = null;
                while (parcel.dataPosition() < validateObjectHeader23) {
                    int readInt24 = parcel.readInt();
                    char c7 = (char) readInt24;
                    if (c7 == 2) {
                        str7 = ComposeUtilsKt.createString(parcel, readInt24);
                    } else if (c7 != 3) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt24);
                    } else {
                        str56 = ComposeUtilsKt.createString(parcel, readInt24);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader23);
                LabelValue labelValue = new LabelValue();
                labelValue.zza = str7;
                labelValue.zzb = str56;
                return labelValue;
            case 23:
                int validateObjectHeader24 = ComposeUtilsKt.validateObjectHeader(parcel);
                ArrayList arrayList10 = new ArrayList();
                String str57 = null;
                while (parcel.dataPosition() < validateObjectHeader24) {
                    int readInt25 = parcel.readInt();
                    char c8 = (char) readInt25;
                    if (c8 == 2) {
                        str6 = ComposeUtilsKt.createString(parcel, readInt25);
                    } else if (c8 == 3) {
                        str57 = ComposeUtilsKt.createString(parcel, readInt25);
                    } else if (c8 != 4) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt25);
                    } else {
                        arrayList10 = ComposeUtilsKt.createTypedList(parcel, readInt25, LabelValue.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader24);
                return new LabelValueRow(str6, str57, arrayList10);
            case 24:
                int validateObjectHeader25 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i17 = -1;
                double d = 0.0d;
                String str58 = null;
                while (parcel.dataPosition() < validateObjectHeader25) {
                    int readInt26 = parcel.readInt();
                    switch ((char) readInt26) {
                        case 2:
                            i = ComposeUtilsKt.readInt(parcel, readInt26);
                            break;
                        case 3:
                            str5 = ComposeUtilsKt.createString(parcel, readInt26);
                            break;
                        case 4:
                            d = ComposeUtilsKt.readDouble(parcel, readInt26);
                            break;
                        case 5:
                            str58 = ComposeUtilsKt.createString(parcel, readInt26);
                            break;
                        case 6:
                            j = ComposeUtilsKt.readLong(parcel, readInt26);
                            break;
                        case 7:
                            i17 = ComposeUtilsKt.readInt(parcel, readInt26);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt26);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader25);
                LoyaltyPointsBalance loyaltyPointsBalance = new LoyaltyPointsBalance();
                loyaltyPointsBalance.zza = i;
                loyaltyPointsBalance.zzb = str5;
                loyaltyPointsBalance.zzc = d;
                loyaltyPointsBalance.zzd = str58;
                loyaltyPointsBalance.zze = j;
                loyaltyPointsBalance.zzf = i17;
                return loyaltyPointsBalance;
            case 25:
                int validateObjectHeader26 = ComposeUtilsKt.validateObjectHeader(parcel);
                LoyaltyPointsBalance loyaltyPointsBalance2 = null;
                TimeInterval timeInterval2 = null;
                while (parcel.dataPosition() < validateObjectHeader26) {
                    int readInt27 = parcel.readInt();
                    char c9 = (char) readInt27;
                    if (c9 == 2) {
                        str4 = ComposeUtilsKt.createString(parcel, readInt27);
                    } else if (c9 == 3) {
                        loyaltyPointsBalance2 = (LoyaltyPointsBalance) ComposeUtilsKt.createParcelable(parcel, readInt27, LoyaltyPointsBalance.CREATOR);
                    } else if (c9 != 5) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt27);
                    } else {
                        timeInterval2 = (TimeInterval) ComposeUtilsKt.createParcelable(parcel, readInt27, TimeInterval.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader26);
                LoyaltyPoints loyaltyPoints = new LoyaltyPoints();
                loyaltyPoints.zza = str4;
                loyaltyPoints.zzb = loyaltyPointsBalance2;
                loyaltyPoints.zzc = timeInterval2;
                return loyaltyPoints;
            case 26:
                int validateObjectHeader27 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str59 = null;
                while (parcel.dataPosition() < validateObjectHeader27) {
                    int readInt28 = parcel.readInt();
                    char c10 = (char) readInt28;
                    if (c10 == 2) {
                        str3 = ComposeUtilsKt.createString(parcel, readInt28);
                    } else if (c10 != 3) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt28);
                    } else {
                        str59 = ComposeUtilsKt.createString(parcel, readInt28);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader27);
                TextModuleData textModuleData = new TextModuleData();
                textModuleData.zza = str3;
                textModuleData.zzb = str59;
                return textModuleData;
            case 27:
                int validateObjectHeader28 = ComposeUtilsKt.validateObjectHeader(parcel);
                long j2 = 0;
                while (parcel.dataPosition() < validateObjectHeader28) {
                    int readInt29 = parcel.readInt();
                    char c11 = (char) readInt29;
                    if (c11 == 2) {
                        j = ComposeUtilsKt.readLong(parcel, readInt29);
                    } else if (c11 != 3) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt29);
                    } else {
                        j2 = ComposeUtilsKt.readLong(parcel, readInt29);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader28);
                TimeInterval timeInterval3 = new TimeInterval();
                timeInterval3.zza = j;
                timeInterval3.zzb = j2;
                return timeInterval3;
            case 28:
                int validateObjectHeader29 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str60 = null;
                while (parcel.dataPosition() < validateObjectHeader29) {
                    int readInt30 = parcel.readInt();
                    char c12 = (char) readInt30;
                    if (c12 == 2) {
                        str2 = ComposeUtilsKt.createString(parcel, readInt30);
                    } else if (c12 != 3) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt30);
                    } else {
                        str60 = ComposeUtilsKt.createString(parcel, readInt30);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader29);
                UriData uriData = new UriData();
                uriData.zza = str2;
                uriData.zzb = str60;
                return uriData;
            default:
                int validateObjectHeader30 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str61 = null;
                TimeInterval timeInterval4 = null;
                UriData uriData2 = null;
                UriData uriData3 = null;
                while (parcel.dataPosition() < validateObjectHeader30) {
                    int readInt31 = parcel.readInt();
                    char c13 = (char) readInt31;
                    if (c13 == 2) {
                        str = ComposeUtilsKt.createString(parcel, readInt31);
                    } else if (c13 == 3) {
                        str61 = ComposeUtilsKt.createString(parcel, readInt31);
                    } else if (c13 == 4) {
                        timeInterval4 = (TimeInterval) ComposeUtilsKt.createParcelable(parcel, readInt31, TimeInterval.CREATOR);
                    } else if (c13 == 5) {
                        uriData2 = (UriData) ComposeUtilsKt.createParcelable(parcel, readInt31, UriData.CREATOR);
                    } else if (c13 != 6) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt31);
                    } else {
                        uriData3 = (UriData) ComposeUtilsKt.createParcelable(parcel, readInt31, UriData.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader30);
                WalletObjectMessage walletObjectMessage = new WalletObjectMessage();
                walletObjectMessage.zza = str;
                walletObjectMessage.zzb = str61;
                walletObjectMessage.zzc = timeInterval4;
                walletObjectMessage.zzd = uriData2;
                walletObjectMessage.zze = uriData3;
                return walletObjectMessage;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.$r8$classId) {
            case 0:
                return new PaymentCardRecognitionIntentResponse[i];
            case 1:
                return new zzn[i];
            case 2:
                return new zzp[i];
            case 3:
                return new zzr[i];
            case 4:
                return new zzt[i];
            case 5:
                return new zzv[i];
            case 6:
                return new zzx[i];
            case 7:
                return new GetGlobalActionCardsResponse[i];
            case 8:
                return new GlobalActionCard[i];
            case 9:
                return new PushProvisionSessionContext[i];
            case 10:
                return new PushTokenizeRequest[i];
            case 11:
                return new TokenInfo[i];
            case 12:
                return new TokenStatus[i];
            case 13:
                return new UserAddress[i];
            case 14:
                return new QuickAccessWalletConfig[i];
            case 15:
                return new GetInstrumentAvailabilityResponse[i];
            case 16:
                return new GetSaveInstrumentDetailsResponse[i];
            case 17:
                return new GetBuyFlowInitializationTokenResponse[i];
            case 18:
                return new GetClientTokenResponse[i];
            case 19:
                return new SetUpBiometricAuthenticationKeysResponse[i];
            case 20:
                return new WarmUpUiProcessResponse[i];
            case 21:
                return new CommonWalletObject[i];
            case 22:
                return new LabelValue[i];
            case 23:
                return new LabelValueRow[i];
            case 24:
                return new LoyaltyPointsBalance[i];
            case 25:
                return new LoyaltyPoints[i];
            case 26:
                return new TextModuleData[i];
            case 27:
                return new TimeInterval[i];
            case 28:
                return new UriData[i];
            default:
                return new WalletObjectMessage[i];
        }
    }
}
