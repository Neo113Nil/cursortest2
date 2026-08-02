package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader$Token;

/* loaded from: classes.dex */
public abstract /* synthetic */ class vex {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[JsonReader$Token.values().length];
        a = iArr;
        try {
            iArr[JsonReader$Token.NUMBER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[JsonReader$Token.BEGIN_ARRAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[JsonReader$Token.BEGIN_OBJECT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
