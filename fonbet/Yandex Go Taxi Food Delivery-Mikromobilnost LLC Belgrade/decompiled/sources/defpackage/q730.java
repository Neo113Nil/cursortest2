package defpackage;

import com.yandex.go.morphlex.api.MorphlexScreenPayload$PresentType;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class q730 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MorphlexScreenPayload$PresentType.values().length];
        try {
            iArr[MorphlexScreenPayload$PresentType.FULLSCREEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MorphlexScreenPayload$PresentType.CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MorphlexScreenPayload$PresentType.POPUP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
