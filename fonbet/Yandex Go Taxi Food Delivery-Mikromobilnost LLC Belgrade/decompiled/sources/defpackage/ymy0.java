package defpackage;

import androidx.compose.material.TextFieldType;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class ymy0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TextFieldType.values().length];
        try {
            iArr[TextFieldType.Filled.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TextFieldType.Outlined.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
