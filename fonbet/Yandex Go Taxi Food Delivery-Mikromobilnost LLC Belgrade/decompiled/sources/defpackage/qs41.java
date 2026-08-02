package defpackage;

import com.yandex.quark.js.serializer.JsDataSerializationStrategy;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class qs41 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[JsDataSerializationStrategy.values().length];
        try {
            iArr[JsDataSerializationStrategy.JSON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[JsDataSerializationStrategy.PROTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
