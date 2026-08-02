package ru.kinopoisk.sdk.easylogin.internal;

import android.app.Dialog;
import android.view.Window;
import android.widget.FrameLayout;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.af3;
import defpackage.ze3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.R;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/o2;", "Laf3;", "a", "android_ui_uishared_coreuimobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.o2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1159o2 extends af3 {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/o2$a;", "", "", "DIALOG_HALF_EXPANDED_RATIO", "F", "android_ui_uishared_coreuimobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.o2$a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
    }

    public C1159o2(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        super((i2 & 1) != 0 ? 0 : i);
    }

    public final void a() {
        b().setFitToContents(true);
        b().setPeekHeight(getResources().getDisplayMetrics().heightPixels / 2);
        b().setExpandedOffset(getResources().getDisplayMetrics().heightPixels / 2);
        b().setHalfExpandedRatio(0.7f);
        b().setState(3);
    }

    @NotNull
    public final BottomSheetBehavior<FrameLayout> b() {
        Dialog requireDialog = requireDialog();
        requireDialog.getClass();
        ze3 ze3Var = (ze3) requireDialog;
        if (ze3Var.f == null) {
            ze3Var.e();
        }
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = ze3Var.f;
        bottomSheetBehavior.getClass();
        return bottomSheetBehavior;
    }

    public final void c() {
        Window window;
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || window.getAttributes().windowAnimations == R.style.BottomSheetEmptyEnterAnimationStyle) {
            return;
        }
        requireView().post(new androidx.core.app.a(18, window));
    }

    @Override // androidx.fragment.app.o
    public final void onPictureInPictureModeChanged(boolean z) {
        super.onPictureInPictureModeChanged(z);
        if (z) {
            dismiss();
        }
    }

    @Override // androidx.fragment.app.o
    public final void onResume() {
        super.onResume();
        c();
    }

    public C1159o2(int i) {
        super(i);
    }

    public C1159o2() {
        this(0, 1, null);
    }

    public static final void a(Window window) {
        window.setWindowAnimations(R.style.BottomSheetEmptyEnterAnimationStyle);
    }
}
