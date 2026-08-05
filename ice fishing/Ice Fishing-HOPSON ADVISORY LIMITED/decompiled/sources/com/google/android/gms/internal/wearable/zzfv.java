package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public enum zzfv {
    DOUBLE(zzfw.DOUBLE, 1),
    FLOAT(zzfw.FLOAT, 5),
    INT64(zzfw.LONG, 0),
    UINT64(zzfw.LONG, 0),
    INT32(zzfw.INT, 0),
    FIXED64(zzfw.LONG, 1),
    FIXED32(zzfw.INT, 5),
    BOOL(zzfw.BOOLEAN, 0),
    STRING(zzfw.STRING, 2),
    GROUP(zzfw.MESSAGE, 3),
    MESSAGE(zzfw.MESSAGE, 2),
    BYTES(zzfw.BYTE_STRING, 2),
    UINT32(zzfw.INT, 0),
    ENUM(zzfw.ENUM, 0),
    SFIXED32(zzfw.INT, 5),
    SFIXED64(zzfw.LONG, 1),
    SINT32(zzfw.INT, 0),
    SINT64(zzfw.LONG, 0);

    private final zzfw zzs;

    zzfv(zzfw zzfwVar, int i) {
        this.zzs = zzfwVar;
    }

    public final zzfw zza() {
        return this.zzs;
    }
}
