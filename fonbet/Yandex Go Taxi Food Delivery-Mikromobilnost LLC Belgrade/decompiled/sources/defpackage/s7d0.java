package defpackage;

import com.yandex.plus.home.repository.api.model.panel.Section;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class s7d0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Section.Type.values().length];
        try {
            iArr[Section.Type.PLUS_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Section.Type.DAILY_FULL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Section.Type.DAILY_MINI.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
