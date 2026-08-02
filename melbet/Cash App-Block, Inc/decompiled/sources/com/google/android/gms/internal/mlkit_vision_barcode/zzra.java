package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes4.dex */
public enum zzra implements zzfc {
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_UNKNOWN(0),
    TYPE_THIN(1),
    TYPE_THICK(2),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_GMV(3);

    public final int zzf;

    zzra(int i) {
        this.zzf = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzfc
    public final int zza() {
        return this.zzf;
    }
}
