package com.google.android.gms.internal.mlkit_vision_text_common;

/* loaded from: classes4.dex */
public enum zzsb implements zzcv {
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_UNKNOWN(0),
    LATIN(1),
    /* JADX INFO: Fake field, exist only in values array */
    LATIN_AND_CHINESE(2),
    /* JADX INFO: Fake field, exist only in values array */
    LATIN_AND_DEVANAGARI(3),
    /* JADX INFO: Fake field, exist only in values array */
    LATIN_AND_JAPANESE(4),
    /* JADX INFO: Fake field, exist only in values array */
    LATIN_AND_KOREAN(5),
    /* JADX INFO: Fake field, exist only in values array */
    CREDIT_CARD(6),
    /* JADX INFO: Fake field, exist only in values array */
    DOCUMENT(7),
    /* JADX INFO: Fake field, exist only in values array */
    PIXEL_AI(8);

    public final int zzk;

    zzsb(int i) {
        this.zzk = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzcv
    public final int zza() {
        return this.zzk;
    }
}
