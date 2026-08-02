package defpackage;

import androidx.emoji2.emojipicker.ItemType;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class ttn {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ItemType.values().length];
        try {
            iArr[ItemType.CATEGORY_TITLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ItemType.PLACEHOLDER_TEXT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ItemType.EMOJI.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
