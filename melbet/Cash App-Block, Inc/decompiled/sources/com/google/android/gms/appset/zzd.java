package com.google.android.gms.appset;

import android.accounts.Account;
import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.fillr.core.model.FillrAddressComponent;
import com.fillr.core.model.FillrAddressComponentList;
import com.fillr.core.model.FillrAddressParseComponent;
import com.fillr.core.model.FillrAddressParseComponentList;
import com.fillr.core.model.FillrAddressQueryResult;
import com.fillr.core.model.FillrAddressQueryResultList;
import com.fillr.core.model.FillrApiResult;
import com.fillr.core.model.FillrPerformanceStatsResponse;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zab;
import com.google.android.gms.common.internal.zaw;
import com.google.android.gms.common.internal.zay;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.squareup.cash.directory_ui.views.ComposeUtilsKt;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzd implements Parcelable.Creator {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zzd(int i) {
        this.$r8$classId = i;
    }

    public static void zza(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        int i2 = getServiceRequest.zzc;
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = getServiceRequest.zzd;
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = getServiceRequest.zze;
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeInt(i4);
        MooncakeHeaderViewKt.writeString(parcel, 4, getServiceRequest.zzf);
        MooncakeHeaderViewKt.writeIBinder(parcel, 5, getServiceRequest.zzg);
        MooncakeHeaderViewKt.writeTypedArray(parcel, 6, getServiceRequest.zzh, i);
        MooncakeHeaderViewKt.writeBundle(parcel, 7, getServiceRequest.zzi);
        MooncakeHeaderViewKt.writeParcelable(parcel, 8, getServiceRequest.zzj, i);
        MooncakeHeaderViewKt.writeTypedArray(parcel, 10, getServiceRequest.zzk, i);
        MooncakeHeaderViewKt.writeTypedArray(parcel, 11, getServiceRequest.zzl, i);
        boolean z = getServiceRequest.zzm;
        MooncakeHeaderViewKt.zza(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = getServiceRequest.zzn;
        MooncakeHeaderViewKt.zza(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = getServiceRequest.zzo;
        MooncakeHeaderViewKt.zza(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        MooncakeHeaderViewKt.writeString(parcel, 15, getServiceRequest.zzp);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        String str = "";
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        String str2 = null;
        PendingIntent pendingIntent = null;
        ArrayList arrayList = null;
        Bundle bundle = null;
        Account account = null;
        String str3 = null;
        GoogleSignInAccount googleSignInAccount = null;
        ArrayList arrayList2 = null;
        String str4 = null;
        Bundle bundle2 = null;
        byte[] bArr = null;
        String str5 = null;
        PendingIntent pendingIntent2 = null;
        switch (this.$r8$classId) {
            case 0:
                int validateObjectHeader = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c == 1) {
                        str2 = ComposeUtilsKt.createString(parcel, readInt);
                    } else if (c != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt);
                    } else {
                        i = ComposeUtilsKt.readInt(parcel, readInt);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader);
                return new zzc(str2, i);
            case 1:
                FillrAddressComponentList fillrAddressComponentList = new FillrAddressComponentList();
                fillrAddressComponentList.mComponentList = new ArrayList();
                fillrAddressComponentList.mSelectedAddress = null;
                ArrayList arrayList3 = new ArrayList();
                fillrAddressComponentList.mComponentList = arrayList3;
                parcel.readList(arrayList3, FillrAddressComponent.class.getClassLoader());
                return fillrAddressComponentList;
            case 2:
                FillrAddressParseComponentList fillrAddressParseComponentList = new FillrAddressParseComponentList();
                fillrAddressParseComponentList.mComponentList = new ArrayList();
                fillrAddressParseComponentList.mSelectedAddress = null;
                fillrAddressParseComponentList.mDomain = null;
                ArrayList arrayList4 = new ArrayList();
                fillrAddressParseComponentList.mComponentList = arrayList4;
                parcel.readList(arrayList4, FillrAddressParseComponent.class.getClassLoader());
                return fillrAddressParseComponentList;
            case 3:
                FillrAddressQueryResultList fillrAddressQueryResultList = new FillrAddressQueryResultList();
                fillrAddressQueryResultList.mComponentList = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                fillrAddressQueryResultList.mComponentList = arrayList5;
                parcel.readList(arrayList5, FillrAddressQueryResult.class.getClassLoader());
                return fillrAddressQueryResultList;
            case 4:
                FillrApiResult fillrApiResult = new FillrApiResult();
                fillrApiResult.response = parcel.readString();
                return fillrApiResult;
            case 5:
                FillrPerformanceStatsResponse fillrPerformanceStatsResponse = new FillrPerformanceStatsResponse();
                fillrPerformanceStatsResponse.result = "";
                fillrPerformanceStatsResponse.result = parcel.readString();
                return fillrPerformanceStatsResponse;
            case 6:
                int validateObjectHeader2 = ComposeUtilsKt.validateObjectHeader(parcel);
                boolean z6 = false;
                int i7 = 0;
                boolean z7 = false;
                BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = null;
                BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = null;
                String str6 = null;
                BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions = null;
                BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions = null;
                while (parcel.dataPosition() < validateObjectHeader2) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            passwordRequestOptions = (BeginSignInRequest.PasswordRequestOptions) ComposeUtilsKt.createParcelable(parcel, readInt2, BeginSignInRequest.PasswordRequestOptions.CREATOR);
                            break;
                        case 2:
                            googleIdTokenRequestOptions = (BeginSignInRequest.GoogleIdTokenRequestOptions) ComposeUtilsKt.createParcelable(parcel, readInt2, BeginSignInRequest.GoogleIdTokenRequestOptions.CREATOR);
                            break;
                        case 3:
                            str6 = ComposeUtilsKt.createString(parcel, readInt2);
                            break;
                        case 4:
                            z6 = ComposeUtilsKt.readBoolean(parcel, readInt2);
                            break;
                        case 5:
                            i7 = ComposeUtilsKt.readInt(parcel, readInt2);
                            break;
                        case 6:
                            passkeysRequestOptions = (BeginSignInRequest.PasskeysRequestOptions) ComposeUtilsKt.createParcelable(parcel, readInt2, BeginSignInRequest.PasskeysRequestOptions.CREATOR);
                            break;
                        case 7:
                            passkeyJsonRequestOptions = (BeginSignInRequest.PasskeyJsonRequestOptions) ComposeUtilsKt.createParcelable(parcel, readInt2, BeginSignInRequest.PasskeyJsonRequestOptions.CREATOR);
                            break;
                        case '\b':
                            z7 = ComposeUtilsKt.readBoolean(parcel, readInt2);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt2);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader2);
                return new BeginSignInRequest(passwordRequestOptions, googleIdTokenRequestOptions, str6, z6, i7, passkeysRequestOptions, passkeyJsonRequestOptions, z7);
            case 7:
                int validateObjectHeader3 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader3) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt3);
                    } else {
                        pendingIntent2 = (PendingIntent) ComposeUtilsKt.createParcelable(parcel, readInt3, PendingIntent.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader3);
                return new BeginSignInResult(pendingIntent2);
            case 8:
                int validateObjectHeader4 = ComposeUtilsKt.validateObjectHeader(parcel);
                boolean z8 = false;
                boolean z9 = false;
                boolean z10 = false;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                ArrayList arrayList6 = null;
                while (parcel.dataPosition() < validateObjectHeader4) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 1:
                            z8 = ComposeUtilsKt.readBoolean(parcel, readInt4);
                            break;
                        case 2:
                            str7 = ComposeUtilsKt.createString(parcel, readInt4);
                            break;
                        case 3:
                            str8 = ComposeUtilsKt.createString(parcel, readInt4);
                            break;
                        case 4:
                            z9 = ComposeUtilsKt.readBoolean(parcel, readInt4);
                            break;
                        case 5:
                            str9 = ComposeUtilsKt.createString(parcel, readInt4);
                            break;
                        case 6:
                            arrayList6 = ComposeUtilsKt.createStringList(parcel, readInt4);
                            break;
                        case 7:
                            z10 = ComposeUtilsKt.readBoolean(parcel, readInt4);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt4);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader4);
                return new BeginSignInRequest.GoogleIdTokenRequestOptions(z8, str7, str8, z9, str9, arrayList6, z10);
            case 9:
                int validateObjectHeader5 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader5) {
                    int readInt5 = parcel.readInt();
                    char c2 = (char) readInt5;
                    if (c2 == 1) {
                        z5 = ComposeUtilsKt.readBoolean(parcel, readInt5);
                    } else if (c2 != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt5);
                    } else {
                        str5 = ComposeUtilsKt.createString(parcel, readInt5);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader5);
                return new BeginSignInRequest.PasskeyJsonRequestOptions(z5, str5);
            case 10:
                int validateObjectHeader6 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str10 = null;
                while (parcel.dataPosition() < validateObjectHeader6) {
                    int readInt6 = parcel.readInt();
                    char c3 = (char) readInt6;
                    if (c3 == 1) {
                        z4 = ComposeUtilsKt.readBoolean(parcel, readInt6);
                    } else if (c3 == 2) {
                        bArr = ComposeUtilsKt.createByteArray(parcel, readInt6);
                    } else if (c3 != 3) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt6);
                    } else {
                        str10 = ComposeUtilsKt.createString(parcel, readInt6);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader6);
                return new BeginSignInRequest.PasskeysRequestOptions(str10, z4, bArr);
            case 11:
                int validateObjectHeader7 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader7) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt7);
                    } else {
                        z3 = ComposeUtilsKt.readBoolean(parcel, readInt7);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader7);
                return new BeginSignInRequest.PasswordRequestOptions(z3);
            case 12:
                int validateObjectHeader8 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str11 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                Uri uri = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                PublicKeyCredential publicKeyCredential = null;
                while (parcel.dataPosition() < validateObjectHeader8) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            str11 = ComposeUtilsKt.createString(parcel, readInt8);
                            break;
                        case 2:
                            str12 = ComposeUtilsKt.createString(parcel, readInt8);
                            break;
                        case 3:
                            str13 = ComposeUtilsKt.createString(parcel, readInt8);
                            break;
                        case 4:
                            str14 = ComposeUtilsKt.createString(parcel, readInt8);
                            break;
                        case 5:
                            uri = (Uri) ComposeUtilsKt.createParcelable(parcel, readInt8, Uri.CREATOR);
                            break;
                        case 6:
                            str15 = ComposeUtilsKt.createString(parcel, readInt8);
                            break;
                        case 7:
                            str16 = ComposeUtilsKt.createString(parcel, readInt8);
                            break;
                        case '\b':
                            str17 = ComposeUtilsKt.createString(parcel, readInt8);
                            break;
                        case '\t':
                            publicKeyCredential = (PublicKeyCredential) ComposeUtilsKt.createParcelable(parcel, readInt8, PublicKeyCredential.CREATOR);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt8);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader8);
                return new SignInCredential(str11, str12, str13, str14, uri, str15, str16, str17, publicKeyCredential);
            case 13:
                int validateObjectHeader9 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i8 = 0;
                while (parcel.dataPosition() < validateObjectHeader9) {
                    int readInt9 = parcel.readInt();
                    char c4 = (char) readInt9;
                    if (c4 == 1) {
                        i6 = ComposeUtilsKt.readInt(parcel, readInt9);
                    } else if (c4 == 2) {
                        i8 = ComposeUtilsKt.readInt(parcel, readInt9);
                    } else if (c4 != 3) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt9);
                    } else {
                        bundle2 = ComposeUtilsKt.createBundle(parcel, readInt9);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader9);
                return new GoogleSignInOptionsExtensionParcelable(i6, i8, bundle2);
            case 14:
                int validateObjectHeader10 = ComposeUtilsKt.validateObjectHeader(parcel);
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < validateObjectHeader10) {
                    int readInt10 = parcel.readInt();
                    char c5 = (char) readInt10;
                    if (c5 == 2) {
                        str4 = ComposeUtilsKt.createString(parcel, readInt10);
                    } else if (c5 != 5) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt10);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) ComposeUtilsKt.createParcelable(parcel, readInt10, GoogleSignInOptions.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader10);
                return new SignInConfiguration(str4, googleSignInOptions);
            case 15:
                int validateObjectHeader11 = ComposeUtilsKt.validateObjectHeader(parcel);
                long j = 0;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                String str21 = null;
                Uri uri2 = null;
                String str22 = null;
                String str23 = null;
                ArrayList arrayList7 = null;
                String str24 = null;
                String str25 = null;
                while (parcel.dataPosition() < validateObjectHeader11) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 2:
                            str18 = ComposeUtilsKt.createString(parcel, readInt11);
                            break;
                        case 3:
                            str19 = ComposeUtilsKt.createString(parcel, readInt11);
                            break;
                        case 4:
                            str20 = ComposeUtilsKt.createString(parcel, readInt11);
                            break;
                        case 5:
                            str21 = ComposeUtilsKt.createString(parcel, readInt11);
                            break;
                        case 6:
                            uri2 = (Uri) ComposeUtilsKt.createParcelable(parcel, readInt11, Uri.CREATOR);
                            break;
                        case 7:
                            str22 = ComposeUtilsKt.createString(parcel, readInt11);
                            break;
                        case '\b':
                            j = ComposeUtilsKt.readLong(parcel, readInt11);
                            break;
                        case '\t':
                            str23 = ComposeUtilsKt.createString(parcel, readInt11);
                            break;
                        case '\n':
                            arrayList7 = ComposeUtilsKt.createTypedList(parcel, readInt11, Scope.CREATOR);
                            break;
                        case 11:
                            str24 = ComposeUtilsKt.createString(parcel, readInt11);
                            break;
                        case '\f':
                            str25 = ComposeUtilsKt.createString(parcel, readInt11);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt11);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader11);
                return new GoogleSignInAccount(str18, str19, str20, str21, uri2, str22, j, str23, arrayList7, str24, str25);
            case 16:
                int validateObjectHeader12 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i9 = 0;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                ArrayList arrayList8 = null;
                Account account2 = null;
                String str26 = null;
                String str27 = null;
                String str28 = null;
                while (parcel.dataPosition() < validateObjectHeader12) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 1:
                            i9 = ComposeUtilsKt.readInt(parcel, readInt12);
                            break;
                        case 2:
                            arrayList8 = ComposeUtilsKt.createTypedList(parcel, readInt12, Scope.CREATOR);
                            break;
                        case 3:
                            account2 = (Account) ComposeUtilsKt.createParcelable(parcel, readInt12, Account.CREATOR);
                            break;
                        case 4:
                            z11 = ComposeUtilsKt.readBoolean(parcel, readInt12);
                            break;
                        case 5:
                            z12 = ComposeUtilsKt.readBoolean(parcel, readInt12);
                            break;
                        case 6:
                            z13 = ComposeUtilsKt.readBoolean(parcel, readInt12);
                            break;
                        case 7:
                            str26 = ComposeUtilsKt.createString(parcel, readInt12);
                            break;
                        case '\b':
                            str27 = ComposeUtilsKt.createString(parcel, readInt12);
                            break;
                        case '\t':
                            arrayList2 = ComposeUtilsKt.createTypedList(parcel, readInt12, GoogleSignInOptionsExtensionParcelable.CREATOR);
                            break;
                        case '\n':
                            str28 = ComposeUtilsKt.createString(parcel, readInt12);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt12);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader12);
                return new GoogleSignInOptions(i9, arrayList8, account2, z11, z12, z13, str26, str27, GoogleSignInOptions.zam(arrayList2), str28);
            case 17:
                int validateObjectHeader13 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str29 = "";
                while (parcel.dataPosition() < validateObjectHeader13) {
                    int readInt13 = parcel.readInt();
                    char c6 = (char) readInt13;
                    if (c6 == 4) {
                        str = ComposeUtilsKt.createString(parcel, readInt13);
                    } else if (c6 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) ComposeUtilsKt.createParcelable(parcel, readInt13, GoogleSignInAccount.CREATOR);
                    } else if (c6 != '\b') {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt13);
                    } else {
                        str29 = ComposeUtilsKt.createString(parcel, readInt13);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader13);
                return new SignInAccount(str, googleSignInAccount, str29);
            case 18:
                int validateObjectHeader14 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader14) {
                    int readInt14 = parcel.readInt();
                    char c7 = (char) readInt14;
                    if (c7 == 1) {
                        i5 = ComposeUtilsKt.readInt(parcel, readInt14);
                    } else if (c7 != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt14);
                    } else {
                        str3 = ComposeUtilsKt.createString(parcel, readInt14);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader14);
                return new ClientIdentity(i5, str3);
            case 19:
                int validateObjectHeader15 = ComposeUtilsKt.validateObjectHeader(parcel);
                long j2 = 0;
                int i10 = 0;
                int i11 = 0;
                boolean z14 = false;
                String str30 = null;
                while (parcel.dataPosition() < validateObjectHeader15) {
                    int readInt15 = parcel.readInt();
                    char c8 = (char) readInt15;
                    if (c8 == 1) {
                        i10 = ComposeUtilsKt.readInt(parcel, readInt15);
                    } else if (c8 == 2) {
                        str30 = ComposeUtilsKt.createString(parcel, readInt15);
                    } else if (c8 == 3) {
                        j2 = ComposeUtilsKt.readLong(parcel, readInt15);
                    } else if (c8 == 4) {
                        i11 = ComposeUtilsKt.readInt(parcel, readInt15);
                    } else if (c8 != 5) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt15);
                    } else {
                        z14 = ComposeUtilsKt.readBoolean(parcel, readInt15);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader15);
                return new zab(i10, i11, j2, str30, z14);
            case 20:
                int validateObjectHeader16 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i12 = 0;
                GoogleSignInAccount googleSignInAccount2 = null;
                while (parcel.dataPosition() < validateObjectHeader16) {
                    int readInt16 = parcel.readInt();
                    char c9 = (char) readInt16;
                    if (c9 == 1) {
                        i4 = ComposeUtilsKt.readInt(parcel, readInt16);
                    } else if (c9 == 2) {
                        account = (Account) ComposeUtilsKt.createParcelable(parcel, readInt16, Account.CREATOR);
                    } else if (c9 == 3) {
                        i12 = ComposeUtilsKt.readInt(parcel, readInt16);
                    } else if (c9 != 4) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt16);
                    } else {
                        googleSignInAccount2 = (GoogleSignInAccount) ComposeUtilsKt.createParcelable(parcel, readInt16, GoogleSignInAccount.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader16);
                return new zaw(i4, account, i12, googleSignInAccount2);
            case 21:
                int validateObjectHeader17 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i13 = 0;
                boolean z15 = false;
                boolean z16 = false;
                IBinder iBinder = null;
                ConnectionResult connectionResult = null;
                while (parcel.dataPosition() < validateObjectHeader17) {
                    int readInt17 = parcel.readInt();
                    char c10 = (char) readInt17;
                    if (c10 == 1) {
                        i13 = ComposeUtilsKt.readInt(parcel, readInt17);
                    } else if (c10 == 2) {
                        iBinder = ComposeUtilsKt.readIBinder(parcel, readInt17);
                    } else if (c10 == 3) {
                        connectionResult = (ConnectionResult) ComposeUtilsKt.createParcelable(parcel, readInt17, ConnectionResult.CREATOR);
                    } else if (c10 == 4) {
                        z15 = ComposeUtilsKt.readBoolean(parcel, readInt17);
                    } else if (c10 != 5) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt17);
                    } else {
                        z16 = ComposeUtilsKt.readBoolean(parcel, readInt17);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader17);
                return new zay(i13, iBinder, connectionResult, z15, z16);
            case 22:
                int validateObjectHeader18 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                boolean z17 = false;
                boolean z18 = false;
                while (parcel.dataPosition() < validateObjectHeader18) {
                    int readInt18 = parcel.readInt();
                    char c11 = (char) readInt18;
                    if (c11 == 1) {
                        i14 = ComposeUtilsKt.readInt(parcel, readInt18);
                    } else if (c11 == 2) {
                        z17 = ComposeUtilsKt.readBoolean(parcel, readInt18);
                    } else if (c11 == 3) {
                        z18 = ComposeUtilsKt.readBoolean(parcel, readInt18);
                    } else if (c11 == 4) {
                        i15 = ComposeUtilsKt.readInt(parcel, readInt18);
                    } else if (c11 != 5) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt18);
                    } else {
                        i16 = ComposeUtilsKt.readInt(parcel, readInt18);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader18);
                return new RootTelemetryConfiguration(i14, i15, i16, z17, z18);
            case 23:
                int validateObjectHeader19 = ComposeUtilsKt.validateObjectHeader(parcel);
                Feature[] featureArr = null;
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
                while (parcel.dataPosition() < validateObjectHeader19) {
                    int readInt19 = parcel.readInt();
                    char c12 = (char) readInt19;
                    if (c12 == 1) {
                        bundle = ComposeUtilsKt.createBundle(parcel, readInt19);
                    } else if (c12 == 2) {
                        featureArr = (Feature[]) ComposeUtilsKt.createTypedArray(parcel, readInt19, Feature.CREATOR);
                    } else if (c12 == 3) {
                        i3 = ComposeUtilsKt.readInt(parcel, readInt19);
                    } else if (c12 != 4) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt19);
                    } else {
                        connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) ComposeUtilsKt.createParcelable(parcel, readInt19, ConnectionTelemetryConfiguration.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader19);
                zzj zzjVar = new zzj();
                zzjVar.zza = bundle;
                zzjVar.zzb = featureArr;
                zzjVar.zzc = i3;
                zzjVar.zzd = connectionTelemetryConfiguration;
                return zzjVar;
            case 24:
                int validateObjectHeader20 = ComposeUtilsKt.validateObjectHeader(parcel);
                boolean z19 = false;
                boolean z20 = false;
                int i17 = 0;
                RootTelemetryConfiguration rootTelemetryConfiguration = null;
                int[] iArr = null;
                int[] iArr2 = null;
                while (parcel.dataPosition() < validateObjectHeader20) {
                    int readInt20 = parcel.readInt();
                    switch ((char) readInt20) {
                        case 1:
                            rootTelemetryConfiguration = (RootTelemetryConfiguration) ComposeUtilsKt.createParcelable(parcel, readInt20, RootTelemetryConfiguration.CREATOR);
                            break;
                        case 2:
                            z19 = ComposeUtilsKt.readBoolean(parcel, readInt20);
                            break;
                        case 3:
                            z20 = ComposeUtilsKt.readBoolean(parcel, readInt20);
                            break;
                        case 4:
                            iArr = ComposeUtilsKt.createIntArray(parcel, readInt20);
                            break;
                        case 5:
                            i17 = ComposeUtilsKt.readInt(parcel, readInt20);
                            break;
                        case 6:
                            iArr2 = ComposeUtilsKt.createIntArray(parcel, readInt20);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt20);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader20);
                return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, z19, z20, iArr, i17, iArr2);
            case 25:
                int validateObjectHeader21 = ComposeUtilsKt.validateObjectHeader(parcel);
                Bundle bundle3 = new Bundle();
                Scope[] scopeArr = GetServiceRequest.zza;
                Feature[] featureArr2 = GetServiceRequest.zzb;
                Feature[] featureArr3 = featureArr2;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                boolean z21 = false;
                int i21 = 0;
                boolean z22 = false;
                String str31 = null;
                IBinder iBinder2 = null;
                Account account3 = null;
                String str32 = null;
                while (parcel.dataPosition() < validateObjectHeader21) {
                    int readInt21 = parcel.readInt();
                    switch ((char) readInt21) {
                        case 1:
                            i18 = ComposeUtilsKt.readInt(parcel, readInt21);
                            break;
                        case 2:
                            i19 = ComposeUtilsKt.readInt(parcel, readInt21);
                            break;
                        case 3:
                            i20 = ComposeUtilsKt.readInt(parcel, readInt21);
                            break;
                        case 4:
                            str31 = ComposeUtilsKt.createString(parcel, readInt21);
                            break;
                        case 5:
                            iBinder2 = ComposeUtilsKt.readIBinder(parcel, readInt21);
                            break;
                        case 6:
                            scopeArr = (Scope[]) ComposeUtilsKt.createTypedArray(parcel, readInt21, Scope.CREATOR);
                            break;
                        case 7:
                            bundle3 = ComposeUtilsKt.createBundle(parcel, readInt21);
                            break;
                        case '\b':
                            account3 = (Account) ComposeUtilsKt.createParcelable(parcel, readInt21, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readInt21);
                            break;
                        case '\n':
                            featureArr2 = (Feature[]) ComposeUtilsKt.createTypedArray(parcel, readInt21, Feature.CREATOR);
                            break;
                        case 11:
                            featureArr3 = (Feature[]) ComposeUtilsKt.createTypedArray(parcel, readInt21, Feature.CREATOR);
                            break;
                        case '\f':
                            z21 = ComposeUtilsKt.readBoolean(parcel, readInt21);
                            break;
                        case '\r':
                            i21 = ComposeUtilsKt.readInt(parcel, readInt21);
                            break;
                        case 14:
                            z22 = ComposeUtilsKt.readBoolean(parcel, readInt21);
                            break;
                        case 15:
                            str32 = ComposeUtilsKt.createString(parcel, readInt21);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader21);
                return new GetServiceRequest(i18, i19, i20, str31, iBinder2, scopeArr, bundle3, account3, featureArr2, featureArr3, z21, i21, z22, str32);
            case 26:
                int validateObjectHeader22 = ComposeUtilsKt.validateObjectHeader(parcel);
                String str33 = null;
                String str34 = null;
                while (parcel.dataPosition() < validateObjectHeader22) {
                    int readInt22 = parcel.readInt();
                    char c13 = (char) readInt22;
                    if (c13 == 1) {
                        arrayList = ComposeUtilsKt.createTypedList(parcel, readInt22, Feature.CREATOR);
                    } else if (c13 == 2) {
                        z2 = ComposeUtilsKt.readBoolean(parcel, readInt22);
                    } else if (c13 == 3) {
                        str33 = ComposeUtilsKt.createString(parcel, readInt22);
                    } else if (c13 != 4) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt22);
                    } else {
                        str34 = ComposeUtilsKt.createString(parcel, readInt22);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader22);
                return new ApiFeatureRequest(str33, str34, arrayList, z2);
            case 27:
                int validateObjectHeader23 = ComposeUtilsKt.validateObjectHeader(parcel);
                int i22 = 0;
                while (parcel.dataPosition() < validateObjectHeader23) {
                    int readInt23 = parcel.readInt();
                    char c14 = (char) readInt23;
                    if (c14 == 1) {
                        z = ComposeUtilsKt.readBoolean(parcel, readInt23);
                    } else if (c14 != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt23);
                    } else {
                        i22 = ComposeUtilsKt.readInt(parcel, readInt23);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader23);
                return new ModuleAvailabilityResponse(z, i22);
            case 28:
                int validateObjectHeader24 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader24) {
                    int readInt24 = parcel.readInt();
                    if (((char) readInt24) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt24);
                    } else {
                        pendingIntent = (PendingIntent) ComposeUtilsKt.createParcelable(parcel, readInt24, PendingIntent.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader24);
                return new ModuleInstallIntentResponse(pendingIntent);
            default:
                int validateObjectHeader25 = ComposeUtilsKt.validateObjectHeader(parcel);
                boolean z23 = false;
                while (parcel.dataPosition() < validateObjectHeader25) {
                    int readInt25 = parcel.readInt();
                    char c15 = (char) readInt25;
                    if (c15 == 1) {
                        i2 = ComposeUtilsKt.readInt(parcel, readInt25);
                    } else if (c15 != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt25);
                    } else {
                        z23 = ComposeUtilsKt.readBoolean(parcel, readInt25);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader25);
                return new ModuleInstallResponse(i2, z23);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.$r8$classId) {
            case 0:
                return new zzc[i];
            case 1:
                return new FillrAddressComponentList[i];
            case 2:
                return new FillrAddressParseComponentList[i];
            case 3:
                return new FillrAddressQueryResultList[i];
            case 4:
                return new FillrApiResult[i];
            case 5:
                return new FillrPerformanceStatsResponse[i];
            case 6:
                return new BeginSignInRequest[i];
            case 7:
                return new BeginSignInResult[i];
            case 8:
                return new BeginSignInRequest.GoogleIdTokenRequestOptions[i];
            case 9:
                return new BeginSignInRequest.PasskeyJsonRequestOptions[i];
            case 10:
                return new BeginSignInRequest.PasskeysRequestOptions[i];
            case 11:
                return new BeginSignInRequest.PasswordRequestOptions[i];
            case 12:
                return new SignInCredential[i];
            case 13:
                return new GoogleSignInOptionsExtensionParcelable[i];
            case 14:
                return new SignInConfiguration[i];
            case 15:
                return new GoogleSignInAccount[i];
            case 16:
                return new GoogleSignInOptions[i];
            case 17:
                return new SignInAccount[i];
            case 18:
                return new ClientIdentity[i];
            case 19:
                return new zab[i];
            case 20:
                return new zaw[i];
            case 21:
                return new zay[i];
            case 22:
                return new RootTelemetryConfiguration[i];
            case 23:
                return new zzj[i];
            case 24:
                return new ConnectionTelemetryConfiguration[i];
            case 25:
                return new GetServiceRequest[i];
            case 26:
                return new ApiFeatureRequest[i];
            case 27:
                return new ModuleAvailabilityResponse[i];
            case 28:
                return new ModuleInstallIntentResponse[i];
            default:
                return new ModuleInstallResponse[i];
        }
    }
}
