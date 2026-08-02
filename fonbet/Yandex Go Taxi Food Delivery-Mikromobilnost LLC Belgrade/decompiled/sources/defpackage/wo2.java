package defpackage;

import com.apollographql.apollo3.api.json.JsonReader$Token;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class wo2 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[JsonReader$Token.values().length];
        try {
            iArr[JsonReader$Token.NULL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[JsonReader$Token.BOOLEAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[JsonReader$Token.LONG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[JsonReader$Token.NUMBER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[JsonReader$Token.STRING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[JsonReader$Token.BEGIN_OBJECT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[JsonReader$Token.BEGIN_ARRAY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
