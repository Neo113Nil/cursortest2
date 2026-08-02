package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.zzs;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.identitycredentials.ClearCreationOptionsResponse;
import com.google.android.gms.identitycredentials.ClearCredentialStateResponse;
import com.google.android.gms.identitycredentials.ClearExportResponse;
import com.google.android.gms.identitycredentials.ClearRegistryResponse;
import com.google.android.gms.identitycredentials.CreateCredentialHandle;
import com.google.android.gms.identitycredentials.CreateCredentialRequest;
import com.google.android.gms.identitycredentials.CreateCredentialResponse;
import com.google.android.gms.identitycredentials.CredentialOption;
import com.google.android.gms.identitycredentials.CredentialTransferCapabilities;
import com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupResponse;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.identitycredentials.ImportCredentialsForDeviceSetupResponse;
import com.google.android.gms.identitycredentials.PendingGetCredentialHandle;
import com.google.android.gms.identitycredentials.PendingImportCredentialsHandle;
import com.google.android.gms.identitycredentials.RegisterCreationOptionsResponse;
import com.google.android.gms.identitycredentials.RegisterExportResponse;
import com.google.android.gms.identitycredentials.RegistrationResponse;
import com.google.android.gms.identitycredentials.SignalCredentialStateResponse;
import com.squareup.cash.directory_ui.views.ComposeUtilsKt;
import java.util.ArrayList;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzef implements Parcelable.Creator {
    public final /* synthetic */ int $r8$classId;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        byte[] bArr = null;
        PendingIntent pendingIntent = null;
        PendingIntent pendingIntent2 = null;
        Bundle bundle = null;
        ArrayList arrayList = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        String str = null;
        PendingIntent pendingIntent3 = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList2 = null;
        String str4 = null;
        switch (this.$r8$classId) {
            case 0:
                int validateObjectHeader = ComposeUtilsKt.validateObjectHeader(parcel);
                int i2 = 0;
                IBinder iBinder = null;
                IBinder iBinder2 = null;
                PendingIntent pendingIntent4 = null;
                String str5 = null;
                while (parcel.dataPosition() < validateObjectHeader) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c == 1) {
                        i2 = ComposeUtilsKt.readInt(parcel, readInt);
                    } else if (c == 2) {
                        iBinder = ComposeUtilsKt.readIBinder(parcel, readInt);
                    } else if (c == 3) {
                        iBinder2 = ComposeUtilsKt.readIBinder(parcel, readInt);
                    } else if (c == 4) {
                        pendingIntent4 = (PendingIntent) ComposeUtilsKt.createParcelable(parcel, readInt, PendingIntent.CREATOR);
                    } else if (c != 6) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt);
                    } else {
                        str5 = ComposeUtilsKt.createString(parcel, readInt);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader);
                return new zzee(i2, iBinder, iBinder2, pendingIntent4, str5);
            case 1:
                int validateObjectHeader2 = ComposeUtilsKt.validateObjectHeader(parcel);
                byte[] bArr2 = null;
                byte[] bArr3 = null;
                byte[] bArr4 = null;
                byte[] bArr5 = null;
                byte[] bArr6 = null;
                while (parcel.dataPosition() < validateObjectHeader2) {
                    int readInt2 = parcel.readInt();
                    char c2 = (char) readInt2;
                    if (c2 == 2) {
                        bArr2 = ComposeUtilsKt.createByteArray(parcel, readInt2);
                    } else if (c2 == 3) {
                        bArr3 = ComposeUtilsKt.createByteArray(parcel, readInt2);
                    } else if (c2 == 4) {
                        bArr4 = ComposeUtilsKt.createByteArray(parcel, readInt2);
                    } else if (c2 == 5) {
                        bArr5 = ComposeUtilsKt.createByteArray(parcel, readInt2);
                    } else if (c2 != 6) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt2);
                    } else {
                        bArr6 = ComposeUtilsKt.createByteArray(parcel, readInt2);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader2);
                return new AuthenticatorAssertionResponse(bArr2, bArr3, bArr4, bArr5, bArr6);
            case 2:
                int validateObjectHeader3 = ComposeUtilsKt.validateObjectHeader(parcel);
                byte[] bArr7 = null;
                byte[] bArr8 = null;
                String[] strArr = null;
                while (parcel.dataPosition() < validateObjectHeader3) {
                    int readInt3 = parcel.readInt();
                    char c3 = (char) readInt3;
                    if (c3 == 2) {
                        bArr = ComposeUtilsKt.createByteArray(parcel, readInt3);
                    } else if (c3 == 3) {
                        bArr7 = ComposeUtilsKt.createByteArray(parcel, readInt3);
                    } else if (c3 == 4) {
                        bArr8 = ComposeUtilsKt.createByteArray(parcel, readInt3);
                    } else if (c3 != 5) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt3);
                    } else {
                        strArr = ComposeUtilsKt.createStringArray(parcel, readInt3);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader3);
                return new AuthenticatorAttestationResponse(bArr, bArr7, bArr8, strArr);
            case 3:
                int validateObjectHeader4 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i3 = 0;
                while (parcel.dataPosition() < validateObjectHeader4) {
                    int readInt4 = parcel.readInt();
                    char c4 = (char) readInt4;
                    if (c4 == 2) {
                        i = ComposeUtilsKt.readInt(parcel, readInt4);
                    } else if (c4 == 3) {
                        str4 = ComposeUtilsKt.createString(parcel, readInt4);
                    } else if (c4 != 4) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt4);
                    } else {
                        i3 = ComposeUtilsKt.readInt(parcel, readInt4);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader4);
                return new AuthenticatorErrorResponse(i, str4, i3);
            case 4:
                int validateObjectHeader5 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str6 = null;
                Boolean bool = null;
                String str7 = null;
                String str8 = null;
                while (parcel.dataPosition() < validateObjectHeader5) {
                    int readInt5 = parcel.readInt();
                    char c5 = (char) readInt5;
                    if (c5 == 2) {
                        str6 = ComposeUtilsKt.createString(parcel, readInt5);
                    } else if (c5 == 3) {
                        int readSize = ComposeUtilsKt.readSize(parcel, readInt5);
                        if (readSize == 0) {
                            bool = null;
                        } else {
                            ComposeUtilsKt.zzb(parcel, readSize, 4);
                            bool = Boolean.valueOf(parcel.readInt() != 0);
                        }
                    } else if (c5 == 4) {
                        str7 = ComposeUtilsKt.createString(parcel, readInt5);
                    } else if (c5 != 5) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt5);
                    } else {
                        str8 = ComposeUtilsKt.createString(parcel, readInt5);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader5);
                return new AuthenticatorSelectionCriteria(bool, str6, str7, str8);
            case 5:
                try {
                    return COSEAlgorithmIdentifier.fromCoseValue(parcel.readInt());
                } catch (COSEAlgorithmIdentifier.UnsupportedAlgorithmIdentifierException e) {
                    a$$ExternalSyntheticBUOutline0.m((Throwable) e);
                    return null;
                }
            case 6:
                int validateObjectHeader6 = ComposeUtilsKt.validateObjectHeader(parcel);
                long j = 0;
                byte[] bArr9 = null;
                byte[] bArr10 = null;
                byte[] bArr11 = null;
                while (parcel.dataPosition() < validateObjectHeader6) {
                    int readInt6 = parcel.readInt();
                    char c6 = (char) readInt6;
                    if (c6 == 1) {
                        j = ComposeUtilsKt.readLong(parcel, readInt6);
                    } else if (c6 == 2) {
                        bArr9 = ComposeUtilsKt.createByteArray(parcel, readInt6);
                    } else if (c6 == 3) {
                        bArr10 = ComposeUtilsKt.createByteArray(parcel, readInt6);
                    } else if (c6 != 4) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt6);
                    } else {
                        bArr11 = ComposeUtilsKt.createByteArray(parcel, readInt6);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader6);
                return new com.google.android.gms.fido.fido2.api.common.zzq(j, bArr9, bArr10, bArr11);
            case 7:
                int validateObjectHeader7 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader7) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt7);
                    } else {
                        arrayList2 = ComposeUtilsKt.createTypedList(parcel, readInt7, com.google.android.gms.fido.fido2.api.common.zzq.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader7);
                return new zzs(arrayList2);
            case 8:
                int validateObjectHeader8 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader8) {
                    int readInt8 = parcel.readInt();
                    if (((char) readInt8) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt8);
                    } else {
                        ComposeUtilsKt.readBoolean(parcel, readInt8);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader8);
                return new com.google.android.gms.fido.fido2.api.common.zzu();
            case 9:
                try {
                    return ErrorCode.toErrorCode(parcel.readInt());
                } catch (ErrorCode.UnsupportedErrorCodeException e2) {
                    Path$$ExternalSyntheticBUOutline0.m((Throwable) e2);
                    return null;
                }
            case 10:
                int validateObjectHeader9 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader9) {
                    int readInt9 = parcel.readInt();
                    if (((char) readInt9) != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt9);
                    } else {
                        str3 = ComposeUtilsKt.createString(parcel, readInt9);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader9);
                return new FidoAppIdExtension(str3);
            case 11:
                int validateObjectHeader10 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str9 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                String str21 = null;
                while (parcel.dataPosition() < validateObjectHeader10) {
                    int readInt10 = parcel.readInt();
                    boolean z5 = z4;
                    switch ((char) readInt10) {
                        case 2:
                            str2 = ComposeUtilsKt.createString(parcel, readInt10);
                            break;
                        case 3:
                            str9 = ComposeUtilsKt.createString(parcel, readInt10);
                            break;
                        case 4:
                            str10 = ComposeUtilsKt.createString(parcel, readInt10);
                            break;
                        case 5:
                            str11 = ComposeUtilsKt.createString(parcel, readInt10);
                            break;
                        case 6:
                            str12 = ComposeUtilsKt.createString(parcel, readInt10);
                            break;
                        case 7:
                            str13 = ComposeUtilsKt.createString(parcel, readInt10);
                            break;
                        case '\b':
                            str14 = ComposeUtilsKt.createString(parcel, readInt10);
                            break;
                        case '\t':
                            str15 = ComposeUtilsKt.createString(parcel, readInt10);
                            break;
                        case '\n':
                            str16 = ComposeUtilsKt.createString(parcel, readInt10);
                            break;
                        case 11:
                            str17 = ComposeUtilsKt.createString(parcel, readInt10);
                            break;
                        case '\f':
                            str18 = ComposeUtilsKt.createString(parcel, readInt10);
                            break;
                        case '\r':
                            str19 = ComposeUtilsKt.createString(parcel, readInt10);
                            break;
                        case 14:
                            z4 = ComposeUtilsKt.readBoolean(parcel, readInt10);
                            continue;
                        case 15:
                            str20 = ComposeUtilsKt.createString(parcel, readInt10);
                            break;
                        case 16:
                            str21 = ComposeUtilsKt.createString(parcel, readInt10);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt10);
                            break;
                    }
                    z4 = z5;
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader10);
                UserAddress userAddress = new UserAddress();
                userAddress.zza = str2;
                userAddress.zzb = str9;
                userAddress.zzc = str10;
                userAddress.zzd = str11;
                userAddress.zze = str12;
                userAddress.zzf = str13;
                userAddress.zzg = str14;
                userAddress.zzh = str15;
                userAddress.zzi = str16;
                userAddress.zzj = str17;
                userAddress.zzk = str18;
                userAddress.zzl = str19;
                userAddress.zzm = z4;
                userAddress.zzn = str20;
                userAddress.zzo = str21;
                return userAddress;
            case 12:
                int validateObjectHeader11 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader11) {
                    int readInt11 = parcel.readInt();
                    if (((char) readInt11) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt11);
                    } else {
                        z3 = ComposeUtilsKt.readBoolean(parcel, readInt11);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader11);
                return new ClearCreationOptionsResponse(z3);
            case 13:
                int validateObjectHeader12 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader12) {
                    ComposeUtilsKt.skipUnknownField(parcel, parcel.readInt());
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader12);
                return new ClearCredentialStateResponse();
            case 14:
                int validateObjectHeader13 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader13) {
                    int readInt12 = parcel.readInt();
                    if (((char) readInt12) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt12);
                    } else {
                        z2 = ComposeUtilsKt.readBoolean(parcel, readInt12);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader13);
                return new ClearExportResponse(z2);
            case 15:
                int validateObjectHeader14 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader14) {
                    int readInt13 = parcel.readInt();
                    if (((char) readInt13) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt13);
                    } else {
                        z = ComposeUtilsKt.readBoolean(parcel, readInt13);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader14);
                return new ClearRegistryResponse(z);
            case 16:
                int validateObjectHeader15 = ComposeUtilsKt.validateObjectHeader(parcel);
                CreateCredentialResponse createCredentialResponse = null;
                while (parcel.dataPosition() < validateObjectHeader15) {
                    int readInt14 = parcel.readInt();
                    char c7 = (char) readInt14;
                    if (c7 == 1) {
                        pendingIntent3 = (PendingIntent) ComposeUtilsKt.createParcelable(parcel, readInt14, PendingIntent.CREATOR);
                    } else if (c7 != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt14);
                    } else {
                        createCredentialResponse = (CreateCredentialResponse) ComposeUtilsKt.createParcelable(parcel, readInt14, CreateCredentialResponse.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader15);
                return new CreateCredentialHandle(pendingIntent3, createCredentialResponse);
            case 17:
                int validateObjectHeader16 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str22 = null;
                Bundle bundle4 = null;
                Bundle bundle5 = null;
                String str23 = null;
                String str24 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < validateObjectHeader16) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 1:
                            str22 = ComposeUtilsKt.createString(parcel, readInt15);
                            break;
                        case 2:
                            bundle4 = ComposeUtilsKt.createBundle(parcel, readInt15);
                            break;
                        case 3:
                            bundle5 = ComposeUtilsKt.createBundle(parcel, readInt15);
                            break;
                        case 4:
                            str23 = ComposeUtilsKt.createString(parcel, readInt15);
                            break;
                        case 5:
                            str24 = ComposeUtilsKt.createString(parcel, readInt15);
                            break;
                        case 6:
                            resultReceiver = (ResultReceiver) ComposeUtilsKt.createParcelable(parcel, readInt15, ResultReceiver.CREATOR);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt15);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader16);
                return new CreateCredentialRequest(str22, bundle4, bundle5, str23, str24, resultReceiver);
            case 18:
                int validateObjectHeader17 = ComposeUtilsKt.validateObjectHeader(parcel);
                Bundle bundle6 = null;
                while (parcel.dataPosition() < validateObjectHeader17) {
                    int readInt16 = parcel.readInt();
                    char c8 = (char) readInt16;
                    if (c8 == 1) {
                        str = ComposeUtilsKt.createString(parcel, readInt16);
                    } else if (c8 != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt16);
                    } else {
                        bundle6 = ComposeUtilsKt.createBundle(parcel, readInt16);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader17);
                return new CreateCredentialResponse(bundle6, str);
            case 19:
                int validateObjectHeader18 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str25 = "";
                String str26 = str25;
                String str27 = str26;
                Bundle bundle7 = null;
                Bundle bundle8 = null;
                String str28 = null;
                while (parcel.dataPosition() < validateObjectHeader18) {
                    int readInt17 = parcel.readInt();
                    switch ((char) readInt17) {
                        case 1:
                            str25 = ComposeUtilsKt.createString(parcel, readInt17);
                            break;
                        case 2:
                            bundle7 = ComposeUtilsKt.createBundle(parcel, readInt17);
                            break;
                        case 3:
                            bundle8 = ComposeUtilsKt.createBundle(parcel, readInt17);
                            break;
                        case 4:
                            str28 = ComposeUtilsKt.createString(parcel, readInt17);
                            break;
                        case 5:
                            str26 = ComposeUtilsKt.createString(parcel, readInt17);
                            break;
                        case 6:
                            str27 = ComposeUtilsKt.createString(parcel, readInt17);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt17);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader18);
                return new CredentialOption(str25, bundle7, bundle8, str28, str26, str27);
            case 20:
                int validateObjectHeader19 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader19) {
                    int readInt18 = parcel.readInt();
                    if (((char) readInt18) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt18);
                    } else {
                        bundle3 = ComposeUtilsKt.createBundle(parcel, readInt18);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader19);
                return new CredentialTransferCapabilities(bundle3);
            case 21:
                int validateObjectHeader20 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader20) {
                    int readInt19 = parcel.readInt();
                    if (((char) readInt19) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt19);
                    } else {
                        bundle2 = ComposeUtilsKt.createBundle(parcel, readInt19);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader20);
                return new ExportCredentialsToDeviceSetupResponse(bundle2);
            case 22:
                int validateObjectHeader21 = ComposeUtilsKt.validateObjectHeader(parcel);
                Bundle bundle9 = null;
                String str29 = null;
                ResultReceiver resultReceiver2 = null;
                while (parcel.dataPosition() < validateObjectHeader21) {
                    int readInt20 = parcel.readInt();
                    char c9 = (char) readInt20;
                    if (c9 == 1) {
                        arrayList = ComposeUtilsKt.createTypedList(parcel, readInt20, CredentialOption.CREATOR);
                    } else if (c9 == 2) {
                        bundle9 = ComposeUtilsKt.createBundle(parcel, readInt20);
                    } else if (c9 == 3) {
                        str29 = ComposeUtilsKt.createString(parcel, readInt20);
                    } else if (c9 != 4) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt20);
                    } else {
                        resultReceiver2 = (ResultReceiver) ComposeUtilsKt.createParcelable(parcel, readInt20, ResultReceiver.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader21);
                return new GetCredentialRequest(arrayList, bundle9, str29, resultReceiver2);
            case 23:
                int validateObjectHeader22 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader22) {
                    int readInt21 = parcel.readInt();
                    if (((char) readInt21) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt21);
                    } else {
                        bundle = ComposeUtilsKt.createBundle(parcel, readInt21);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader22);
                return new ImportCredentialsForDeviceSetupResponse(bundle);
            case 24:
                int validateObjectHeader23 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader23) {
                    int readInt22 = parcel.readInt();
                    if (((char) readInt22) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt22);
                    } else {
                        pendingIntent2 = (PendingIntent) ComposeUtilsKt.createParcelable(parcel, readInt22, PendingIntent.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader23);
                return new PendingGetCredentialHandle(pendingIntent2);
            case 25:
                int validateObjectHeader24 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader24) {
                    int readInt23 = parcel.readInt();
                    if (((char) readInt23) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt23);
                    } else {
                        pendingIntent = (PendingIntent) ComposeUtilsKt.createParcelable(parcel, readInt23, PendingIntent.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader24);
                return new PendingImportCredentialsHandle(pendingIntent);
            case 26:
                int validateObjectHeader25 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader25) {
                    ComposeUtilsKt.skipUnknownField(parcel, parcel.readInt());
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader25);
                return new RegisterCreationOptionsResponse();
            case 27:
                int validateObjectHeader26 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader26) {
                    ComposeUtilsKt.skipUnknownField(parcel, parcel.readInt());
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader26);
                return new RegisterExportResponse();
            case 28:
                int validateObjectHeader27 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader27) {
                    ComposeUtilsKt.skipUnknownField(parcel, parcel.readInt());
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader27);
                return new RegistrationResponse();
            default:
                int validateObjectHeader28 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader28) {
                    ComposeUtilsKt.skipUnknownField(parcel, parcel.readInt());
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader28);
                return new SignalCredentialStateResponse();
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.$r8$classId) {
            case 0:
                return new zzee[i];
            case 1:
                return new AuthenticatorAssertionResponse[i];
            case 2:
                return new AuthenticatorAttestationResponse[i];
            case 3:
                return new AuthenticatorErrorResponse[i];
            case 4:
                return new AuthenticatorSelectionCriteria[i];
            case 5:
                return new COSEAlgorithmIdentifier[i];
            case 6:
                return new com.google.android.gms.fido.fido2.api.common.zzq[i];
            case 7:
                return new zzs[i];
            case 8:
                return new com.google.android.gms.fido.fido2.api.common.zzu[i];
            case 9:
                return new ErrorCode[i];
            case 10:
                return new FidoAppIdExtension[i];
            case 11:
                return new UserAddress[i];
            case 12:
                return new ClearCreationOptionsResponse[i];
            case 13:
                return new ClearCredentialStateResponse[i];
            case 14:
                return new ClearExportResponse[i];
            case 15:
                return new ClearRegistryResponse[i];
            case 16:
                return new CreateCredentialHandle[i];
            case 17:
                return new CreateCredentialRequest[i];
            case 18:
                return new CreateCredentialResponse[i];
            case 19:
                return new CredentialOption[i];
            case 20:
                return new CredentialTransferCapabilities[i];
            case 21:
                return new ExportCredentialsToDeviceSetupResponse[i];
            case 22:
                return new GetCredentialRequest[i];
            case 23:
                return new ImportCredentialsForDeviceSetupResponse[i];
            case 24:
                return new PendingGetCredentialHandle[i];
            case 25:
                return new PendingImportCredentialsHandle[i];
            case 26:
                return new RegisterCreationOptionsResponse[i];
            case 27:
                return new RegisterExportResponse[i];
            case 28:
                return new RegistrationResponse[i];
            default:
                return new SignalCredentialStateResponse[i];
        }
    }
}
