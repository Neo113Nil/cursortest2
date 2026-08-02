package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class zzim {
    public final Object zza;
    public final Object zzb;
    public final Object zzc;

    public zzim(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        Object obj = this.zza;
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(this.zzb);
        return new IllegalArgumentException(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Multiple entries with same key: ", valueOf, "=", valueOf2, " and "), String.valueOf(obj), "=", String.valueOf(this.zzc)));
    }
}
