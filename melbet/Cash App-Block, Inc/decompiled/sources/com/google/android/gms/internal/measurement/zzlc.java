package com.google.android.gms.internal.measurement;

import android.content.Context;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.common.base.Supplier;

/* loaded from: classes.dex */
public final class zzlc {
    public final Context zza;
    public final Supplier zzb;

    public zzlc(Context context, Supplier supplier) {
        this.zza = context;
        this.zzb = supplier;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzlc)) {
            return false;
        }
        zzlc zzlcVar = (zzlc) obj;
        if (!this.zza.equals(zzlcVar.zza)) {
            return false;
        }
        Supplier supplier = zzlcVar.zzb;
        Supplier supplier2 = this.zzb;
        return supplier2 == null ? supplier == null : supplier2.equals(supplier);
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        Supplier supplier = this.zzb;
        return (supplier == null ? 0 : supplier.hashCode()) ^ (hashCode * 1000003);
    }

    public final String toString() {
        String obj = this.zza.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder(length + 45 + valueOf.length() + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "FlagsContext{context=", obj, ", hermeticFileOverrides=", valueOf);
        sb.append("}");
        return sb.toString();
    }
}
