package defpackage;

import com.apollographql.apollo3.api.http.HttpMethod;

/* loaded from: classes.dex */
public abstract /* synthetic */ class wch {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[HttpMethod.values().length];
        try {
            iArr[HttpMethod.Get.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[HttpMethod.Post.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
