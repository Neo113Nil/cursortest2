package defpackage;

import com.yandex.go.user_profile.main_menu.profile.repository.logout.presentation.MainMenuLogOutUiState;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class tar0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MainMenuLogOutUiState.values().length];
        try {
            iArr[MainMenuLogOutUiState.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MainMenuLogOutUiState.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MainMenuLogOutUiState.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
