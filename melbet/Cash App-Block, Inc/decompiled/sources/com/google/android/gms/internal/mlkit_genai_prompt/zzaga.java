package com.google.android.gms.internal.mlkit_genai_prompt;

/* loaded from: classes4.dex */
public enum zzaga implements zzlk {
    /* JADX INFO: Fake field, exist only in values array */
    GENERATION_MODE_UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    GENERATION_MODE_GENERATIVE(1),
    GENERATION_MODE_REGENERATIVE(2);

    public final int zze;

    zzaga(int i) {
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzlk
    public final int zza() {
        return this.zze;
    }
}
