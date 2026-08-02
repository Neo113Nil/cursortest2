package com.google.android.gms.internal.mlkit_genai_prompt;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class zzfz {
    public final String zza;
    public final int zzc;

    public zzfz(String str, int i) {
        this.zza = str;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfz)) {
            return false;
        }
        zzfz zzfzVar = (zzfz) obj;
        String str = zzfzVar.zza;
        String str2 = this.zza;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return this.zzc == zzfzVar.zzc;
    }

    public final int hashCode() {
        String str = this.zza;
        return this.zzc ^ (((str == null ? 0 : str.hashCode()) ^ (-721379959)) * (-429739981));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LlmMessage{role=0, message=");
        sb.append(this.zza);
        sb.append(", bitmap=null, imageEmbedding=null, uriToWrite=null, audio=null, type=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.zzc, "}", sb);
    }
}
