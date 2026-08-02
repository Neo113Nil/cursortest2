package defpackage;

import com.yandex.go.tariffcard.ui.HeaderType;
import com.yandex.go.tariffcard.ui.model.SectionSeparatorMarginType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class s3q0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[HeaderType.values().length];
        try {
            iArr[HeaderType.ULTIMA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[HeaderType.STANDARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[HeaderType.MULTICLASS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[SectionSeparatorMarginType.values().length];
        try {
            iArr2[SectionSeparatorMarginType.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[SectionSeparatorMarginType.TOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[SectionSeparatorMarginType.BOTTOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[SectionSeparatorMarginType.VERTICAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
