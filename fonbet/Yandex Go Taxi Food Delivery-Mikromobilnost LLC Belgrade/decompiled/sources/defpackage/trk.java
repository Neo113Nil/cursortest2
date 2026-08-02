package defpackage;

import com.yandex.div.core.view2.divs.gallery.ScrollPosition;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class trk {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScrollPosition.values().length];
        try {
            iArr[ScrollPosition.CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScrollPosition.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
