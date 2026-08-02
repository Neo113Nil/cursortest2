package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement;
import com.google.android.gms.fido.fido2.api.common.UvmEntries;
import com.google.android.gms.fido.fido2.api.common.UvmEntry;
import com.google.android.gms.fido.fido2.api.common.zzab;
import com.google.android.gms.fido.fido2.api.common.zzad;
import com.google.android.gms.fido.fido2.api.common.zzag;
import com.google.android.gms.fido.fido2.api.common.zzai;
import com.google.android.gms.fido.fido2.api.common.zzak;
import com.google.android.gms.fido.fido2.api.common.zzaw;
import com.google.android.gms.fido.fido2.api.common.zzbc;
import com.google.android.gms.fido.fido2.api.common.zzf;
import com.google.android.gms.fido.fido2.api.common.zzh;
import com.google.android.gms.fido.fido2.api.common.zzu;
import com.google.android.gms.internal.fido.zzgu;
import com.squareup.cash.directory_ui.views.ComposeUtilsKt;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzs implements Parcelable.Creator {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zzs(int i) {
        this.$r8$classId = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        boolean z4 = false;
        int i2 = 0;
        boolean z5 = false;
        boolean z6 = false;
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
        String str3 = null;
        byte[] bArr = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        byte[][] bArr2 = null;
        switch (this.$r8$classId) {
            case 0:
                int validateObjectHeader = ComposeUtilsKt.validateObjectHeader(parcel);
                int i3 = 0;
                int i4 = 0;
                boolean z7 = false;
                String str7 = null;
                long j = -1;
                while (parcel.dataPosition() < validateObjectHeader) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c == 1) {
                        z7 = ComposeUtilsKt.readBoolean(parcel, readInt);
                    } else if (c == 2) {
                        str7 = ComposeUtilsKt.createString(parcel, readInt);
                    } else if (c == 3) {
                        i3 = ComposeUtilsKt.readInt(parcel, readInt);
                    } else if (c == 4) {
                        i4 = ComposeUtilsKt.readInt(parcel, readInt);
                    } else if (c != 5) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt);
                    } else {
                        j = ComposeUtilsKt.readLong(parcel, readInt);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader);
                return new zzr(i3, i4, j, str7, z7);
            case 1:
                try {
                    return Attachment.fromString(parcel.readString());
                } catch (Attachment.UnsupportedAttachmentException e) {
                    a$$ExternalSyntheticBUOutline0.m((Throwable) e);
                    return null;
                }
            case 2:
                int validateObjectHeader2 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader2) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt2);
                    } else {
                        z = ComposeUtilsKt.readBoolean(parcel, readInt2);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader2);
                return new com.google.android.gms.fido.fido2.api.common.zzz(z);
            case 3:
                int validateObjectHeader3 = ComposeUtilsKt.validateObjectHeader(parcel);
                long j2 = 0;
                while (parcel.dataPosition() < validateObjectHeader3) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt3);
                    } else {
                        j2 = ComposeUtilsKt.readLong(parcel, readInt3);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader3);
                return new zzab(j2);
            case 4:
                int validateObjectHeader4 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader4) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt4);
                    } else {
                        z6 = ComposeUtilsKt.readBoolean(parcel, readInt4);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader4);
                return new zzad(z6);
            case 5:
                int validateObjectHeader5 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader5) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt5);
                    } else {
                        z5 = ComposeUtilsKt.readBoolean(parcel, readInt5);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader5);
                return new GoogleThirdPartyPaymentExtension(z5);
            case 6:
                int validateObjectHeader6 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader6) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt6);
                    } else {
                        str = ComposeUtilsKt.createString(parcel, readInt6);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader6);
                return new zzag(str);
            case 7:
                int validateObjectHeader7 = ComposeUtilsKt.validateObjectHeader(parcel);
                byte[] bArr3 = null;
                byte[] bArr4 = null;
                byte[] bArr5 = null;
                while (parcel.dataPosition() < validateObjectHeader7) {
                    int readInt7 = parcel.readInt();
                    char c2 = (char) readInt7;
                    if (c2 == 1) {
                        bArr3 = ComposeUtilsKt.createByteArray(parcel, readInt7);
                    } else if (c2 == 2) {
                        bArr4 = ComposeUtilsKt.createByteArray(parcel, readInt7);
                    } else if (c2 == 3) {
                        bArr5 = ComposeUtilsKt.createByteArray(parcel, readInt7);
                    } else if (c2 != 4) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt7);
                    } else {
                        i2 = ComposeUtilsKt.readInt(parcel, readInt7);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader7);
                return new zzai(bArr3 == null ? null : zzgu.zzl(bArr3.length, bArr3), bArr4 == null ? null : zzgu.zzl(bArr4.length, bArr4), bArr5 != null ? zzgu.zzl(bArr5.length, bArr5) : null, i2);
            case 8:
                int validateObjectHeader8 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader8) {
                    int readInt8 = parcel.readInt();
                    if (((char) readInt8) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt8);
                    } else {
                        bArr2 = ComposeUtilsKt.createByteArrayArray(parcel, readInt8);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader8);
                return new zzak(bArr2);
            case 9:
                int validateObjectHeader9 = ComposeUtilsKt.validateObjectHeader(parcel);
                PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = null;
                PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = null;
                byte[] bArr6 = null;
                ArrayList arrayList2 = null;
                Double d = null;
                ArrayList arrayList3 = null;
                AuthenticatorSelectionCriteria authenticatorSelectionCriteria = null;
                Integer num = null;
                TokenBinding tokenBinding = null;
                String str8 = null;
                AuthenticationExtensions authenticationExtensions = null;
                String str9 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < validateObjectHeader9) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 2:
                            publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) ComposeUtilsKt.createParcelable(parcel, readInt9, PublicKeyCredentialRpEntity.CREATOR);
                            break;
                        case 3:
                            publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) ComposeUtilsKt.createParcelable(parcel, readInt9, PublicKeyCredentialUserEntity.CREATOR);
                            break;
                        case 4:
                            bArr6 = ComposeUtilsKt.createByteArray(parcel, readInt9);
                            break;
                        case 5:
                            arrayList2 = ComposeUtilsKt.createTypedList(parcel, readInt9, PublicKeyCredentialParameters.CREATOR);
                            break;
                        case 6:
                            int readSize = ComposeUtilsKt.readSize(parcel, readInt9);
                            if (readSize != 0) {
                                ComposeUtilsKt.zzb(parcel, readSize, 8);
                                d = Double.valueOf(parcel.readDouble());
                                break;
                            } else {
                                d = null;
                                break;
                            }
                        case 7:
                            arrayList3 = ComposeUtilsKt.createTypedList(parcel, readInt9, PublicKeyCredentialDescriptor.CREATOR);
                            break;
                        case '\b':
                            authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) ComposeUtilsKt.createParcelable(parcel, readInt9, AuthenticatorSelectionCriteria.CREATOR);
                            break;
                        case '\t':
                            num = ComposeUtilsKt.readIntegerObject(parcel, readInt9);
                            break;
                        case '\n':
                            tokenBinding = (TokenBinding) ComposeUtilsKt.createParcelable(parcel, readInt9, TokenBinding.CREATOR);
                            break;
                        case 11:
                            str8 = ComposeUtilsKt.createString(parcel, readInt9);
                            break;
                        case '\f':
                            authenticationExtensions = (AuthenticationExtensions) ComposeUtilsKt.createParcelable(parcel, readInt9, AuthenticationExtensions.CREATOR);
                            break;
                        case '\r':
                            str9 = ComposeUtilsKt.createString(parcel, readInt9);
                            break;
                        case 14:
                            resultReceiver = (ResultReceiver) ComposeUtilsKt.createParcelable(parcel, readInt9, ResultReceiver.CREATOR);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt9);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader9);
                return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArr6, arrayList2, d, arrayList3, authenticatorSelectionCriteria, num, tokenBinding, str8, authenticationExtensions, str9, resultReceiver);
            case 10:
                int validateObjectHeader10 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str10 = null;
                String str11 = null;
                byte[] bArr7 = null;
                AuthenticatorAttestationResponse authenticatorAttestationResponse = null;
                AuthenticatorAssertionResponse authenticatorAssertionResponse = null;
                AuthenticatorErrorResponse authenticatorErrorResponse = null;
                AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = null;
                String str12 = null;
                while (parcel.dataPosition() < validateObjectHeader10) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 1:
                            str10 = ComposeUtilsKt.createString(parcel, readInt10);
                            break;
                        case 2:
                            str11 = ComposeUtilsKt.createString(parcel, readInt10);
                            break;
                        case 3:
                            bArr7 = ComposeUtilsKt.createByteArray(parcel, readInt10);
                            break;
                        case 4:
                            authenticatorAttestationResponse = (AuthenticatorAttestationResponse) ComposeUtilsKt.createParcelable(parcel, readInt10, AuthenticatorAttestationResponse.CREATOR);
                            break;
                        case 5:
                            authenticatorAssertionResponse = (AuthenticatorAssertionResponse) ComposeUtilsKt.createParcelable(parcel, readInt10, AuthenticatorAssertionResponse.CREATOR);
                            break;
                        case 6:
                            authenticatorErrorResponse = (AuthenticatorErrorResponse) ComposeUtilsKt.createParcelable(parcel, readInt10, AuthenticatorErrorResponse.CREATOR);
                            break;
                        case 7:
                            authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) ComposeUtilsKt.createParcelable(parcel, readInt10, AuthenticationExtensionsClientOutputs.CREATOR);
                            break;
                        case '\b':
                            str12 = ComposeUtilsKt.createString(parcel, readInt10);
                            break;
                        case '\t':
                            ComposeUtilsKt.createString(parcel, readInt10);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt10);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader10);
                return new PublicKeyCredential(str10, str11, bArr7, authenticatorAttestationResponse, authenticatorAssertionResponse, authenticatorErrorResponse, authenticationExtensionsClientOutputs, str12);
            case 11:
                int validateObjectHeader11 = ComposeUtilsKt.validateObjectHeader(parcel);
                byte[] bArr8 = null;
                ArrayList arrayList4 = null;
                while (parcel.dataPosition() < validateObjectHeader11) {
                    int readInt11 = parcel.readInt();
                    char c3 = (char) readInt11;
                    if (c3 == 2) {
                        str6 = ComposeUtilsKt.createString(parcel, readInt11);
                    } else if (c3 == 3) {
                        bArr8 = ComposeUtilsKt.createByteArray(parcel, readInt11);
                    } else if (c3 != 4) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt11);
                    } else {
                        arrayList4 = ComposeUtilsKt.createTypedList(parcel, readInt11, Transport.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader11);
                return new PublicKeyCredentialDescriptor(str6, bArr8, arrayList4);
            case 12:
                int validateObjectHeader12 = ComposeUtilsKt.validateObjectHeader(parcel);
                Integer num2 = null;
                while (parcel.dataPosition() < validateObjectHeader12) {
                    int readInt12 = parcel.readInt();
                    char c4 = (char) readInt12;
                    if (c4 == 2) {
                        str5 = ComposeUtilsKt.createString(parcel, readInt12);
                    } else if (c4 != 3) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt12);
                    } else {
                        num2 = ComposeUtilsKt.readIntegerObject(parcel, readInt12);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader12);
                return new PublicKeyCredentialParameters(str5, num2.intValue());
            case 13:
                int validateObjectHeader13 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str13 = null;
                String str14 = null;
                while (parcel.dataPosition() < validateObjectHeader13) {
                    int readInt13 = parcel.readInt();
                    char c5 = (char) readInt13;
                    if (c5 == 2) {
                        str4 = ComposeUtilsKt.createString(parcel, readInt13);
                    } else if (c5 == 3) {
                        str13 = ComposeUtilsKt.createString(parcel, readInt13);
                    } else if (c5 != 4) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt13);
                    } else {
                        str14 = ComposeUtilsKt.createString(parcel, readInt13);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader13);
                return new PublicKeyCredentialRpEntity(str4, str13, str14);
            case 14:
                try {
                    return PublicKeyCredentialType.fromString(parcel.readString());
                } catch (PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException e2) {
                    a$$ExternalSyntheticBUOutline0.m((Throwable) e2);
                    return null;
                }
            case 15:
                int validateObjectHeader14 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str15 = null;
                String str16 = null;
                String str17 = null;
                while (parcel.dataPosition() < validateObjectHeader14) {
                    int readInt14 = parcel.readInt();
                    char c6 = (char) readInt14;
                    if (c6 == 2) {
                        bArr = ComposeUtilsKt.createByteArray(parcel, readInt14);
                    } else if (c6 == 3) {
                        str15 = ComposeUtilsKt.createString(parcel, readInt14);
                    } else if (c6 == 4) {
                        str16 = ComposeUtilsKt.createString(parcel, readInt14);
                    } else if (c6 != 5) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt14);
                    } else {
                        str17 = ComposeUtilsKt.createString(parcel, readInt14);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader14);
                return new PublicKeyCredentialUserEntity(str15, str16, str17, bArr);
            case 16:
                String readString = parcel.readString();
                if (readString == null) {
                    readString = "";
                }
                try {
                    return ResidentKeyRequirement.fromString(readString);
                } catch (ResidentKeyRequirement.UnsupportedResidentKeyRequirementException e3) {
                    a$$ExternalSyntheticBUOutline0.m((Throwable) e3);
                    return null;
                }
            case 17:
                int validateObjectHeader15 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader15) {
                    int readInt15 = parcel.readInt();
                    if (((char) readInt15) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt15);
                    } else {
                        str3 = ComposeUtilsKt.createString(parcel, readInt15);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader15);
                return new zzaw(str3);
            case 18:
                try {
                    return TokenBinding.TokenBindingStatus.fromString(parcel.readString());
                } catch (TokenBinding.UnsupportedTokenBindingStatusException e4) {
                    a$$ExternalSyntheticBUOutline0.m((Throwable) e4);
                    return null;
                }
            case 19:
                int validateObjectHeader16 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str18 = null;
                while (parcel.dataPosition() < validateObjectHeader16) {
                    int readInt16 = parcel.readInt();
                    char c7 = (char) readInt16;
                    if (c7 == 2) {
                        str2 = ComposeUtilsKt.createString(parcel, readInt16);
                    } else if (c7 != 3) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt16);
                    } else {
                        str18 = ComposeUtilsKt.createString(parcel, readInt16);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader16);
                return new TokenBinding(str2, str18);
            case 20:
                try {
                    return AttestationConveyancePreference.fromString(parcel.readString());
                } catch (AttestationConveyancePreference.UnsupportedAttestationConveyancePreferenceException e5) {
                    a$$ExternalSyntheticBUOutline0.m((Throwable) e5);
                    return null;
                }
            case 21:
                int validateObjectHeader17 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader17) {
                    int readInt17 = parcel.readInt();
                    if (((char) readInt17) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt17);
                    } else {
                        z4 = ComposeUtilsKt.readBoolean(parcel, readInt17);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader17);
                return new UserVerificationMethodExtension(z4);
            case 22:
                try {
                    return UserVerificationRequirement.fromString(parcel.readString());
                } catch (zzbc e6) {
                    a$$ExternalSyntheticBUOutline0.m((Throwable) e6);
                    return null;
                }
            case 23:
                int validateObjectHeader18 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader18) {
                    int readInt18 = parcel.readInt();
                    if (((char) readInt18) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt18);
                    } else {
                        arrayList = ComposeUtilsKt.createTypedList(parcel, readInt18, UvmEntry.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader18);
                return new UvmEntries(arrayList);
            case 24:
                int validateObjectHeader19 = ComposeUtilsKt.validateObjectHeader(parcel);
                short s = 0;
                short s2 = 0;
                while (parcel.dataPosition() < validateObjectHeader19) {
                    int readInt19 = parcel.readInt();
                    char c8 = (char) readInt19;
                    if (c8 == 1) {
                        i = ComposeUtilsKt.readInt(parcel, readInt19);
                    } else if (c8 == 2) {
                        ComposeUtilsKt.zza(parcel, readInt19, 4);
                        s = (short) parcel.readInt();
                    } else if (c8 != 3) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt19);
                    } else {
                        ComposeUtilsKt.zza(parcel, readInt19, 4);
                        s2 = (short) parcel.readInt();
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader19);
                return new UvmEntry(s, s2, i);
            case 25:
                int validateObjectHeader20 = ComposeUtilsKt.validateObjectHeader(parcel);
                UvmEntries uvmEntries = null;
                zzf zzfVar = null;
                AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = null;
                zzh zzhVar = null;
                String str19 = null;
                while (parcel.dataPosition() < validateObjectHeader20) {
                    int readInt20 = parcel.readInt();
                    char c9 = (char) readInt20;
                    if (c9 == 1) {
                        uvmEntries = (UvmEntries) ComposeUtilsKt.createParcelable(parcel, readInt20, UvmEntries.CREATOR);
                    } else if (c9 == 2) {
                        zzfVar = (zzf) ComposeUtilsKt.createParcelable(parcel, readInt20, zzf.CREATOR);
                    } else if (c9 == 3) {
                        authenticationExtensionsCredPropsOutputs = (AuthenticationExtensionsCredPropsOutputs) ComposeUtilsKt.createParcelable(parcel, readInt20, AuthenticationExtensionsCredPropsOutputs.CREATOR);
                    } else if (c9 == 4) {
                        zzhVar = (zzh) ComposeUtilsKt.createParcelable(parcel, readInt20, zzh.CREATOR);
                    } else if (c9 != 5) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt20);
                    } else {
                        str19 = ComposeUtilsKt.createString(parcel, readInt20);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader20);
                return new AuthenticationExtensionsClientOutputs(uvmEntries, zzfVar, authenticationExtensionsCredPropsOutputs, zzhVar, str19);
            case 26:
                int validateObjectHeader21 = ComposeUtilsKt.validateObjectHeader(parcel);
                FidoAppIdExtension fidoAppIdExtension = null;
                com.google.android.gms.fido.fido2.api.common.zzs zzsVar = null;
                UserVerificationMethodExtension userVerificationMethodExtension = null;
                com.google.android.gms.fido.fido2.api.common.zzz zzzVar = null;
                zzab zzabVar = null;
                zzad zzadVar = null;
                zzu zzuVar = null;
                zzag zzagVar = null;
                GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = null;
                zzak zzakVar = null;
                zzaw zzawVar = null;
                zzai zzaiVar = null;
                while (parcel.dataPosition() < validateObjectHeader21) {
                    int readInt21 = parcel.readInt();
                    switch ((char) readInt21) {
                        case 2:
                            fidoAppIdExtension = (FidoAppIdExtension) ComposeUtilsKt.createParcelable(parcel, readInt21, FidoAppIdExtension.CREATOR);
                            break;
                        case 3:
                            zzsVar = (com.google.android.gms.fido.fido2.api.common.zzs) ComposeUtilsKt.createParcelable(parcel, readInt21, com.google.android.gms.fido.fido2.api.common.zzs.CREATOR);
                            break;
                        case 4:
                            userVerificationMethodExtension = (UserVerificationMethodExtension) ComposeUtilsKt.createParcelable(parcel, readInt21, UserVerificationMethodExtension.CREATOR);
                            break;
                        case 5:
                            zzzVar = (com.google.android.gms.fido.fido2.api.common.zzz) ComposeUtilsKt.createParcelable(parcel, readInt21, com.google.android.gms.fido.fido2.api.common.zzz.CREATOR);
                            break;
                        case 6:
                            zzabVar = (zzab) ComposeUtilsKt.createParcelable(parcel, readInt21, zzab.CREATOR);
                            break;
                        case 7:
                            zzadVar = (zzad) ComposeUtilsKt.createParcelable(parcel, readInt21, zzad.CREATOR);
                            break;
                        case '\b':
                            zzuVar = (zzu) ComposeUtilsKt.createParcelable(parcel, readInt21, zzu.CREATOR);
                            break;
                        case '\t':
                            zzagVar = (zzag) ComposeUtilsKt.createParcelable(parcel, readInt21, zzag.CREATOR);
                            break;
                        case '\n':
                            googleThirdPartyPaymentExtension = (GoogleThirdPartyPaymentExtension) ComposeUtilsKt.createParcelable(parcel, readInt21, GoogleThirdPartyPaymentExtension.CREATOR);
                            break;
                        case 11:
                            zzakVar = (zzak) ComposeUtilsKt.createParcelable(parcel, readInt21, zzak.CREATOR);
                            break;
                        case '\f':
                            zzawVar = (zzaw) ComposeUtilsKt.createParcelable(parcel, readInt21, zzaw.CREATOR);
                            break;
                        case '\r':
                            zzaiVar = (zzai) ComposeUtilsKt.createParcelable(parcel, readInt21, zzai.CREATOR);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt21);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader21);
                return new AuthenticationExtensions(fidoAppIdExtension, zzsVar, userVerificationMethodExtension, zzzVar, zzabVar, zzadVar, zzuVar, zzagVar, googleThirdPartyPaymentExtension, zzakVar, zzawVar, zzaiVar);
            case 27:
                int validateObjectHeader22 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader22) {
                    int readInt22 = parcel.readInt();
                    if (((char) readInt22) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt22);
                    } else {
                        z3 = ComposeUtilsKt.readBoolean(parcel, readInt22);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader22);
                return new AuthenticationExtensionsCredPropsOutputs(z3);
            case 28:
                int validateObjectHeader23 = ComposeUtilsKt.validateObjectHeader(parcel);
                byte[] bArr9 = null;
                byte[] bArr10 = null;
                while (parcel.dataPosition() < validateObjectHeader23) {
                    int readInt23 = parcel.readInt();
                    char c10 = (char) readInt23;
                    if (c10 == 1) {
                        bArr9 = ComposeUtilsKt.createByteArray(parcel, readInt23);
                    } else if (c10 != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt23);
                    } else {
                        bArr10 = ComposeUtilsKt.createByteArray(parcel, readInt23);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader23);
                return new zzf(bArr9 == null ? null : zzgu.zzl(bArr9.length, bArr9), bArr10 != null ? zzgu.zzl(bArr10.length, bArr10) : null);
            default:
                int validateObjectHeader24 = ComposeUtilsKt.validateObjectHeader(parcel);
                byte[] bArr11 = null;
                while (parcel.dataPosition() < validateObjectHeader24) {
                    int readInt24 = parcel.readInt();
                    char c11 = (char) readInt24;
                    if (c11 == 1) {
                        z2 = ComposeUtilsKt.readBoolean(parcel, readInt24);
                    } else if (c11 != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt24);
                    } else {
                        bArr11 = ComposeUtilsKt.createByteArray(parcel, readInt24);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader24);
                return new zzh(z2, bArr11 != null ? zzgu.zzl(bArr11.length, bArr11) : null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.$r8$classId) {
            case 0:
                return new zzr[i];
            case 1:
                return new Attachment[i];
            case 2:
                return new com.google.android.gms.fido.fido2.api.common.zzz[i];
            case 3:
                return new zzab[i];
            case 4:
                return new zzad[i];
            case 5:
                return new GoogleThirdPartyPaymentExtension[i];
            case 6:
                return new zzag[i];
            case 7:
                return new zzai[i];
            case 8:
                return new zzak[i];
            case 9:
                return new PublicKeyCredentialCreationOptions[i];
            case 10:
                return new PublicKeyCredential[i];
            case 11:
                return new PublicKeyCredentialDescriptor[i];
            case 12:
                return new PublicKeyCredentialParameters[i];
            case 13:
                return new PublicKeyCredentialRpEntity[i];
            case 14:
                return new PublicKeyCredentialType[i];
            case 15:
                return new PublicKeyCredentialUserEntity[i];
            case 16:
                return new ResidentKeyRequirement[i];
            case 17:
                return new zzaw[i];
            case 18:
                return new TokenBinding.TokenBindingStatus[i];
            case 19:
                return new TokenBinding[i];
            case 20:
                return new AttestationConveyancePreference[i];
            case 21:
                return new UserVerificationMethodExtension[i];
            case 22:
                return new UserVerificationRequirement[i];
            case 23:
                return new UvmEntries[i];
            case 24:
                return new UvmEntry[i];
            case 25:
                return new AuthenticationExtensionsClientOutputs[i];
            case 26:
                return new AuthenticationExtensions[i];
            case 27:
                return new AuthenticationExtensionsCredPropsOutputs[i];
            case 28:
                return new zzf[i];
            default:
                return new zzh[i];
        }
    }
}
