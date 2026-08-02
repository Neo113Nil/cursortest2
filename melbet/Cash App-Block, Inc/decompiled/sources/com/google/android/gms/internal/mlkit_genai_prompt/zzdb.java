package com.google.android.gms.internal.mlkit_genai_prompt;

import android.os.ParcelFileDescriptor;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public final class zzdb {
    public final ParcelFileDescriptor zza;
    public final zzeo zzh;

    public zzdb(ParcelFileDescriptor parcelFileDescriptor, zzeo zzeoVar) {
        this.zza = parcelFileDescriptor;
        this.zzh = zzeoVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdb)) {
            return false;
        }
        zzdb zzdbVar = (zzdb) obj;
        return this.zza.equals(zzdbVar.zza) && Float.floatToIntBits(RecyclerView.DECELERATION_RATE) == Float.floatToIntBits(RecyclerView.DECELERATION_RATE) && this.zzh == zzdbVar.zzh;
    }

    public final int hashCode() {
        return this.zzh.hashCode() ^ ((((((((((((((this.zza.hashCode() ^ (-721379959)) * (-721379959)) ^ Float.floatToIntBits(RecyclerView.DECELERATION_RATE)) * 1000003) ^ 1) * 1000003) ^ 500) * 1000003) ^ 1) * (-429739981)) ^ 2) * 583896283) ^ (-1)) * 1000003);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("CortanaRequest{messages=null, cortanaStateFileDescriptorToWrite=", this.zza.toString(), ", cortanaStateFileDescriptorsToRead=null, temperature=0.0, topK=1, targetReplyLengthMax=500, numSamples=1, streamingCallback=null, preferredImageWidth=0, preferredImageHeight=0, numSoftTokens=0, cortanaType=PREFIX_CACHING, systemPrompt=null, textToMemory=null, tokenOffset=-1, inferenceStateCachingCallback=", String.valueOf(this.zzh), "}");
    }
}
