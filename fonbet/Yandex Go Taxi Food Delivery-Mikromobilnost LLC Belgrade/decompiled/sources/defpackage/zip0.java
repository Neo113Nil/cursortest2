package defpackage;

import flex.feature.sections.action.ScrollPositionSurrogate;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class zip0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScrollPositionSurrogate.values().length];
        try {
            iArr[ScrollPositionSurrogate.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScrollPositionSurrogate.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScrollPositionSurrogate.BOTTOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
