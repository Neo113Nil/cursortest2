package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.model.ModalState;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class tc31 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ModalState.values().length];
        try {
            iArr[ModalState.Anchored.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ModalState.Expanded.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ModalState.Other.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
