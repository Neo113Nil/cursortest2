package defpackage;

import android.content.SharedPreferences;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld0g;", "Lx7f;", "<init>", "()V", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class d0g extends x7f {
    public final jyr l = l18.b.b(hag.I(vzf.class), true);

    @Override // defpackage.x7f
    public final void A(BottomSheetBehavior bottomSheetBehavior) {
        bottomSheetBehavior.getClass();
        vzf vzfVar = (vzf) this.l.getValue();
        vzfVar.b = true;
        SharedPreferences.Editor edit = vzfVar.a.edit();
        edit.putBoolean("like_dialog_showed", true);
        edit.apply();
        bottomSheetBehavior.setSkipCollapsed(true);
        bottomSheetBehavior.setFitToContents(true);
        bottomSheetBehavior.setState(3);
    }

    @Override // defpackage.x7f, androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        if (((vzf) this.l.getValue()).a() == uzf.c) {
            dismissAllowingStateLoss();
        }
        LayoutInflater layoutInflater = getLayoutInflater();
        View findViewById = requireView().findViewById(R.id.dialog_juicy_catalog_menu_container);
        findViewById.getClass();
        layoutInflater.inflate(R.layout.bottom_sheet_like_info, (ViewGroup) findViewById, true);
        View findViewById2 = requireView().findViewById(R.id.dialog_juicy_catalog_menu_container);
        findViewById2.getClass();
        ((Button) ((JuicyBottomSheetFrameLayout) findViewById2).findViewById(R.id.likeInfoNextButton)).setOnClickListener(new ol(22, this));
    }
}
