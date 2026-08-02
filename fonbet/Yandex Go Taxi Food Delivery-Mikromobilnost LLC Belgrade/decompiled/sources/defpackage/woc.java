package defpackage;

import com.squareup.moshi.JsonReader;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class woc {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[JsonReader.Token.values().length];
        try {
            iArr[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
