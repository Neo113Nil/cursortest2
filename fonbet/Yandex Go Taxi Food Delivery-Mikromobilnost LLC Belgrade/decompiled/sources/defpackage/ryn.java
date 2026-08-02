package defpackage;

import com.google.zxing.qrcode.decoder.Mode;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class ryn {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Mode.values().length];
        a = iArr;
        try {
            iArr[Mode.NUMERIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[Mode.ALPHANUMERIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[Mode.BYTE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[Mode.KANJI.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
