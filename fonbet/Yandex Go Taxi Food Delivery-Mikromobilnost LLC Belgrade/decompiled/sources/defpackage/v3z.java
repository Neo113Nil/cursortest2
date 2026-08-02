package defpackage;

import com.squareup.moshi.JsonReader;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class v3z {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[JsonReader.Token.values().length];
        try {
            iArr[JsonReader.Token.STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[JsonReader.Token.NUMBER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
