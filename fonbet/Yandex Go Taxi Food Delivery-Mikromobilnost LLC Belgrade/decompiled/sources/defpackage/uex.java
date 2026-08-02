package defpackage;

import com.yandex.xplat.common.JSONItemKind;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class uex {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[JSONItemKind.values().length];
        try {
            iArr[JSONItemKind.integer.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[JSONItemKind.f22double.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[JSONItemKind.string.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[JSONItemKind.f21boolean.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[JSONItemKind.nullItem.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[JSONItemKind.map.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[JSONItemKind.array.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
