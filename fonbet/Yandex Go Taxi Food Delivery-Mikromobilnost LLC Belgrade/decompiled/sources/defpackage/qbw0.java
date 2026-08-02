package defpackage;

import com.yandex.go.mainscreen.superapp.impl.header.presentation.header.delegates.HeaderTranslationDelegate$State;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class qbw0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[HeaderTranslationDelegate$State.values().length];
        try {
            iArr[HeaderTranslationDelegate$State.TranslatedToZero.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[HeaderTranslationDelegate$State.TranslatedToMinimum.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[HeaderTranslationDelegate$State.Translating.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
