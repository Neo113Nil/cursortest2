package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class TokenBinding extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TokenBinding> CREATOR = new com.google.android.gms.common.zzs(19);
    public final TokenBindingStatus zza;
    public final String zzb;

    public enum TokenBindingStatus implements Parcelable {
        /* JADX INFO: Fake field, exist only in values array */
        PRESENT("present"),
        /* JADX INFO: Fake field, exist only in values array */
        SUPPORTED("supported"),
        /* JADX INFO: Fake field, exist only in values array */
        NOT_SUPPORTED("not-supported");

        public static final Parcelable.Creator<TokenBindingStatus> CREATOR = new com.google.android.gms.common.zzs(18);
        public final String zzb;

        TokenBindingStatus(String str) {
            this.zzb = str;
        }

        public static TokenBindingStatus fromString(String str) {
            for (TokenBindingStatus tokenBindingStatus : values()) {
                if (str.equals(tokenBindingStatus.zzb)) {
                    return tokenBindingStatus;
                }
            }
            throw new UnsupportedTokenBindingStatusException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TokenBindingStatus ", str, " not supported"));
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.zzb;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.zzb);
        }
    }

    public final class UnsupportedTokenBindingStatusException extends Exception {
    }

    static {
        new TokenBinding("supported", null);
        new TokenBinding("not-supported", null);
    }

    public TokenBinding(String str, String str2) {
        zzae.checkNotNull(str);
        try {
            this.zza = TokenBindingStatus.fromString(str);
            this.zzb = str2;
        } catch (UnsupportedTokenBindingStatusException e) {
            Path$$ExternalSyntheticBUOutline0.m((Throwable) e);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenBinding)) {
            return false;
        }
        TokenBinding tokenBinding = (TokenBinding) obj;
        return com.google.android.gms.internal.fido.zzh.m2007zza((Object) this.zza, (Object) tokenBinding.zza) && com.google.android.gms.internal.fido.zzh.m2007zza((Object) this.zzb, (Object) tokenBinding.zzb);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zza.zzb);
        MooncakeHeaderViewKt.writeString(parcel, 3, this.zzb);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
