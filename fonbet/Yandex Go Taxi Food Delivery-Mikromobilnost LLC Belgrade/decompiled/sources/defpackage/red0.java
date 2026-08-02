package defpackage;

import com.yandex.plus.pay.data.mb.dto.RichTextDto$Item$Type;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class red0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RichTextDto$Item$Type.values().length];
        try {
            iArr[RichTextDto$Item$Type.LINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RichTextDto$Item$Type.HIGHLIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RichTextDto$Item$Type.STRIKE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
