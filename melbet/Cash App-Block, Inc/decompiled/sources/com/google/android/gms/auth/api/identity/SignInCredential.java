package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appset.zzd;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class SignInCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInCredential> CREATOR = new zzd(12);
    public final String zba;
    public final String zbb;
    public final String zbc;
    public final String zbd;
    public final Uri zbe;
    public final String zbf;
    public final String zbg;
    public final String zbh;
    public final PublicKeyCredential zbi;

    public SignInCredential(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, PublicKeyCredential publicKeyCredential) {
        zzae.checkNotNull(str);
        this.zba = str;
        this.zbb = str2;
        this.zbc = str3;
        this.zbd = str4;
        this.zbe = uri;
        this.zbf = str5;
        this.zbg = str6;
        this.zbh = str7;
        this.zbi = publicKeyCredential;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        return zzae.equal(this.zba, signInCredential.zba) && zzae.equal(this.zbb, signInCredential.zbb) && zzae.equal(this.zbc, signInCredential.zbc) && zzae.equal(this.zbd, signInCredential.zbd) && zzae.equal(this.zbe, signInCredential.zbe) && zzae.equal(this.zbf, signInCredential.zbf) && zzae.equal(this.zbg, signInCredential.zbg) && zzae.equal(this.zbh, signInCredential.zbh) && zzae.equal(this.zbi, signInCredential.zbi);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zba, this.zbb, this.zbc, this.zbd, this.zbe, this.zbf, this.zbg, this.zbh, this.zbi});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 1, this.zba);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zbb);
        MooncakeHeaderViewKt.writeString(parcel, 3, this.zbc);
        MooncakeHeaderViewKt.writeString(parcel, 4, this.zbd);
        MooncakeHeaderViewKt.writeParcelable(parcel, 5, this.zbe, i);
        MooncakeHeaderViewKt.writeString(parcel, 6, this.zbf);
        MooncakeHeaderViewKt.writeString(parcel, 7, this.zbg);
        MooncakeHeaderViewKt.writeString(parcel, 8, this.zbh);
        MooncakeHeaderViewKt.writeParcelable(parcel, 9, this.zbi, i);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
