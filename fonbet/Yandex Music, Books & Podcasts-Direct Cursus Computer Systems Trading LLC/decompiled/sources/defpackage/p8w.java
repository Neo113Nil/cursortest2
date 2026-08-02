package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yandex.music.design.components.button.YandexBooksGradientViewButton;
import kotlin.Metadata;
import ru.yandex.music.R;
import ru.yandex.music.catalog.juicybottommenu.JuicyBottomSheetFrameLayout;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp8w;", "Lx7f;", "<init>", "()V", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class p8w extends x7f {
    @Override // defpackage.x7f
    public final void A(BottomSheetBehavior bottomSheetBehavior) {
        bottomSheetBehavior.getClass();
        bottomSheetBehavior.setSkipCollapsed(true);
        bottomSheetBehavior.setFitToContents(true);
        bottomSheetBehavior.setState(3);
    }

    @Override // defpackage.ue3, androidx.fragment.app.i, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            dismissAllowingStateLoss();
        }
    }

    @Override // defpackage.x7f, androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        LayoutInflater layoutInflater = getLayoutInflater();
        View findViewById = requireView().findViewById(R.id.dialog_juicy_catalog_menu_container);
        findViewById.getClass();
        layoutInflater.inflate(R.layout.bottom_sheet_yandex_books_unavailable, (ViewGroup) findViewById, true);
        View findViewById2 = requireView().findViewById(R.id.dialog_juicy_catalog_menu_container);
        findViewById2.getClass();
        View findViewById3 = ((JuicyBottomSheetFrameLayout) findViewById2).findViewById(R.id.yandex_books_unavailable_bottom_sheet_button);
        findViewById3.getClass();
        ((YandexBooksGradientViewButton) findViewById3).setOnClickListener(new dxv(12, this));
    }
}
