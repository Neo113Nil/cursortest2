package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import ru.yandex.music.R;
import ru.yandex.music.catalog.juicybottommenu.JuicyBottomSheetFrameLayout;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lizb;", "Lx7f;", "<init>", "()V", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class izb extends x7f {
    @Override // defpackage.x7f
    public final void A(BottomSheetBehavior bottomSheetBehavior) {
        bottomSheetBehavior.getClass();
        View findViewById = requireView().findViewById(R.id.dialog_juicy_catalog_menu_container);
        findViewById.getClass();
        bottomSheetBehavior.setPeekHeight(((JuicyBottomSheetFrameLayout) findViewById).getMeasuredHeight());
    }

    @Override // defpackage.ue3, androidx.fragment.app.i, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || ((mqs) arguments.getParcelable("ARG_TRACK")) == null) {
            su4.s(2, null, "ARG_TRACK or arguments bundle is missing", null);
        } else if (bundle != null) {
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
        layoutInflater.inflate(R.layout.bottom_sheet_track_explicit_kids, (ViewGroup) findViewById, true);
        View findViewById2 = requireView().findViewById(R.id.dialog_juicy_catalog_menu_container);
        findViewById2.getClass();
        ((Button) ((JuicyBottomSheetFrameLayout) findViewById2).findViewById(R.id.close_button)).setOnClickListener(new ol(17, this));
    }
}
