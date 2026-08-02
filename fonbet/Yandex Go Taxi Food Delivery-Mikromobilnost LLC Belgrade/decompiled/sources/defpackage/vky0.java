package defpackage;

import androidx.compose.foundation.text.selection.SelectedTextType;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class vky0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SelectedTextType.values().length];
        try {
            iArr[SelectedTextType.EditableText.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SelectedTextType.StaticText.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
