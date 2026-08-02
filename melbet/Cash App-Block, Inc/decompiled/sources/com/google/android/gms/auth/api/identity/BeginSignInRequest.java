package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appset.zzd;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class BeginSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new zzd(6);
    public final PasswordRequestOptions zba;
    public final GoogleIdTokenRequestOptions zbb;
    public final String zbc;
    public final boolean zbd;
    public final int zbe;
    public final PasskeysRequestOptions zbf;
    public final PasskeyJsonRequestOptions zbg;
    public final boolean zbh;

    public final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new zzd(8);
        public final boolean zba;
        public final String zbb;
        public final String zbc;
        public final boolean zbd;
        public final String zbe;
        public final ArrayList zbf;
        public final boolean zbg;

        public GoogleIdTokenRequestOptions(boolean z, String str, String str2, boolean z2, String str3, ArrayList arrayList, boolean z3) {
            boolean z4 = true;
            if (z2 && z3) {
                z4 = false;
            }
            zzae.checkArgument("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z4);
            this.zba = z;
            if (z) {
                zzae.checkNotNull(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.zbb = str;
            this.zbc = str2;
            this.zbd = z2;
            ArrayList arrayList2 = null;
            if (arrayList != null && !arrayList.isEmpty()) {
                arrayList2 = new ArrayList(arrayList);
                Collections.sort(arrayList2);
            }
            this.zbf = arrayList2;
            this.zbe = str3;
            this.zbg = z3;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            return this.zba == googleIdTokenRequestOptions.zba && zzae.equal(this.zbb, googleIdTokenRequestOptions.zbb) && zzae.equal(this.zbc, googleIdTokenRequestOptions.zbc) && this.zbd == googleIdTokenRequestOptions.zbd && zzae.equal(this.zbe, googleIdTokenRequestOptions.zbe) && zzae.equal(this.zbf, googleIdTokenRequestOptions.zbf) && this.zbg == googleIdTokenRequestOptions.zbg;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zba), this.zbb, this.zbc, Boolean.valueOf(this.zbd), this.zbe, this.zbf, Boolean.valueOf(this.zbg)});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
            MooncakeHeaderViewKt.zza(parcel, 1, 4);
            parcel.writeInt(this.zba ? 1 : 0);
            MooncakeHeaderViewKt.writeString(parcel, 2, this.zbb);
            MooncakeHeaderViewKt.writeString(parcel, 3, this.zbc);
            MooncakeHeaderViewKt.zza(parcel, 4, 4);
            parcel.writeInt(this.zbd ? 1 : 0);
            MooncakeHeaderViewKt.writeString(parcel, 5, this.zbe);
            MooncakeHeaderViewKt.writeStringList(parcel, 6, this.zbf);
            MooncakeHeaderViewKt.zza(parcel, 7, 4);
            parcel.writeInt(this.zbg ? 1 : 0);
            MooncakeHeaderViewKt.zzc(parcel, zzb);
        }
    }

    public final class PasskeyJsonRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasskeyJsonRequestOptions> CREATOR = new zzd(9);
        public final boolean zba;
        public final String zbb;

        public PasskeyJsonRequestOptions(boolean z, String str) {
            if (z) {
                zzae.checkNotNull(str);
            }
            this.zba = z;
            this.zbb = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeyJsonRequestOptions)) {
                return false;
            }
            PasskeyJsonRequestOptions passkeyJsonRequestOptions = (PasskeyJsonRequestOptions) obj;
            return this.zba == passkeyJsonRequestOptions.zba && zzae.equal(this.zbb, passkeyJsonRequestOptions.zbb);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zba), this.zbb});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
            MooncakeHeaderViewKt.zza(parcel, 1, 4);
            parcel.writeInt(this.zba ? 1 : 0);
            MooncakeHeaderViewKt.writeString(parcel, 2, this.zbb);
            MooncakeHeaderViewKt.zzc(parcel, zzb);
        }
    }

    public final class PasskeysRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasskeysRequestOptions> CREATOR = new zzd(10);
        public final boolean zba;
        public final byte[] zbb;
        public final String zbc;

        public PasskeysRequestOptions(String str, boolean z, byte[] bArr) {
            if (z) {
                zzae.checkNotNull(bArr);
                zzae.checkNotNull(str);
            }
            this.zba = z;
            this.zbb = bArr;
            this.zbc = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeysRequestOptions)) {
                return false;
            }
            PasskeysRequestOptions passkeysRequestOptions = (PasskeysRequestOptions) obj;
            return this.zba == passkeysRequestOptions.zba && Arrays.equals(this.zbb, passkeysRequestOptions.zbb) && Objects.equals(this.zbc, passkeysRequestOptions.zbc);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.zbb) + (Objects.hash(Boolean.valueOf(this.zba), this.zbc) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
            MooncakeHeaderViewKt.zza(parcel, 1, 4);
            parcel.writeInt(this.zba ? 1 : 0);
            MooncakeHeaderViewKt.writeByteArray(parcel, 2, this.zbb);
            MooncakeHeaderViewKt.writeString(parcel, 3, this.zbc);
            MooncakeHeaderViewKt.zzc(parcel, zzb);
        }
    }

    public final class PasswordRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new zzd(11);
        public final boolean zba;

        public PasswordRequestOptions(boolean z) {
            this.zba = z;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof PasswordRequestOptions) && this.zba == ((PasswordRequestOptions) obj).zba;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zba)});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
            MooncakeHeaderViewKt.zza(parcel, 1, 4);
            parcel.writeInt(this.zba ? 1 : 0);
            MooncakeHeaderViewKt.zzc(parcel, zzb);
        }
    }

    public BeginSignInRequest(PasswordRequestOptions passwordRequestOptions, GoogleIdTokenRequestOptions googleIdTokenRequestOptions, String str, boolean z, int i, PasskeysRequestOptions passkeysRequestOptions, PasskeyJsonRequestOptions passkeyJsonRequestOptions, boolean z2) {
        zzae.checkNotNull(passwordRequestOptions);
        this.zba = passwordRequestOptions;
        zzae.checkNotNull(googleIdTokenRequestOptions);
        this.zbb = googleIdTokenRequestOptions;
        this.zbc = str;
        this.zbd = z;
        this.zbe = i;
        this.zbf = passkeysRequestOptions == null ? new PasskeysRequestOptions(null, false, null) : passkeysRequestOptions;
        this.zbg = passkeyJsonRequestOptions == null ? new PasskeyJsonRequestOptions(false, null) : passkeyJsonRequestOptions;
        this.zbh = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        return zzae.equal(this.zba, beginSignInRequest.zba) && zzae.equal(this.zbb, beginSignInRequest.zbb) && zzae.equal(this.zbf, beginSignInRequest.zbf) && zzae.equal(this.zbg, beginSignInRequest.zbg) && zzae.equal(this.zbc, beginSignInRequest.zbc) && this.zbd == beginSignInRequest.zbd && this.zbe == beginSignInRequest.zbe && this.zbh == beginSignInRequest.zbh;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zba, this.zbb, this.zbf, this.zbg, this.zbc, Boolean.valueOf(this.zbd), Integer.valueOf(this.zbe), Boolean.valueOf(this.zbh)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeParcelable(parcel, 1, this.zba, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 2, this.zbb, i);
        MooncakeHeaderViewKt.writeString(parcel, 3, this.zbc);
        MooncakeHeaderViewKt.zza(parcel, 4, 4);
        parcel.writeInt(this.zbd ? 1 : 0);
        MooncakeHeaderViewKt.zza(parcel, 5, 4);
        parcel.writeInt(this.zbe);
        MooncakeHeaderViewKt.writeParcelable(parcel, 6, this.zbf, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 7, this.zbg, i);
        MooncakeHeaderViewKt.zza(parcel, 8, 4);
        parcel.writeInt(this.zbh ? 1 : 0);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
