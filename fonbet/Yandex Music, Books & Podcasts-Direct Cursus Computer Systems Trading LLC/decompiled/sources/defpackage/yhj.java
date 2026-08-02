package defpackage;

import com.google.gson.stream.JsonToken;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class yhj {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[JsonToken.values().length];
        try {
            iArr[JsonToken.NUMBER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
