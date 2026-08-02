package defpackage;

import com.yandex.go.flex.main_screen.api.domain.SuperappTopPlaqueType;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class rtc0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SuperappTopPlaqueType.values().length];
        try {
            iArr[SuperappTopPlaqueType.HEADER_BOTTOM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SuperappTopPlaqueType.HEADER_COMPACT_TOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SuperappTopPlaqueType.DOCUMENT_SECTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
