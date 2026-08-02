package defpackage;

import kotlinx.serialization.json.ClassDiscriminatorMode;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class t5e0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ClassDiscriminatorMode.values().length];
        try {
            iArr[ClassDiscriminatorMode.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ClassDiscriminatorMode.POLYMORPHIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ClassDiscriminatorMode.ALL_JSON_OBJECTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
