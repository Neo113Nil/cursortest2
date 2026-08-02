package defpackage;

import androidx.compose.ui.platform.actionmodecallback.MenuItemOption;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class yl10 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MenuItemOption.values().length];
        try {
            iArr[MenuItemOption.Copy.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MenuItemOption.Paste.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MenuItemOption.Cut.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MenuItemOption.SelectAll.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[MenuItemOption.Autofill.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
