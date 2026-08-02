package defpackage;

import com.yandex.xplat.common.RequestEncodingKind;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class z5j0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RequestEncodingKind.values().length];
        try {
            iArr[RequestEncodingKind.url.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RequestEncodingKind.f101json.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
