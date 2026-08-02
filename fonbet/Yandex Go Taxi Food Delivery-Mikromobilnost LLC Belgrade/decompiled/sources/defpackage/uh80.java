package defpackage;

import com.yandex.go.places.models.data.entities.network.actions.ChangeModalStateAction;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class uh80 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChangeModalStateAction.ModalState.values().length];
        try {
            iArr[ChangeModalStateAction.ModalState.Expanded.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChangeModalStateAction.ModalState.Anchored.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ChangeModalStateAction.ModalState.Collapsed.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
