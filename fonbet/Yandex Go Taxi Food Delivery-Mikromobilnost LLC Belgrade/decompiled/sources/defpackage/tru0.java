package defpackage;

import kotlinx.serialization.json.internal.WriteMode;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class tru0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WriteMode.values().length];
        try {
            iArr[WriteMode.LIST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WriteMode.MAP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WriteMode.POLY_OBJ.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[WriteMode.OBJ.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
