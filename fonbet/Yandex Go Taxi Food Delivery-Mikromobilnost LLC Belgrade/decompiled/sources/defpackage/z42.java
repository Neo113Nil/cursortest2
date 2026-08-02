package defpackage;

import com.ybsdk.core.analytics.DeeplinkParamsFilter;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class z42 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DeeplinkParamsFilter.values().length];
        try {
            iArr[DeeplinkParamsFilter.REMOVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeeplinkParamsFilter.FORMAT_URL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DeeplinkParamsFilter.MAP_URL_RECURSIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DeeplinkParamsFilter.MASK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DeeplinkParamsFilter.MAP_RECURSIVE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[DeeplinkParamsFilter.UNKNOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[DeeplinkParamsFilter.KEEP.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
