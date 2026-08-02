package defpackage;

import com.google.gson.stream.JsonToken;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class qex {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[JsonToken.values().length];
        a = iArr;
        try {
            iArr[JsonToken.NAME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[JsonToken.END_ARRAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[JsonToken.END_OBJECT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[JsonToken.END_DOCUMENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
