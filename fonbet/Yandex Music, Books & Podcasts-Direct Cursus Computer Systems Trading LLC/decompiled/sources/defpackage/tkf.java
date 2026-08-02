package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.yandex.music.R;
import ru.yandex.music.catalog.juicybottommenu.JuicyBottomSheetFrameLayout;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltkf;", "Lx7f;", "<init>", "()V", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class tkf extends x7f {
    public final ybf l = new ybf(ern.a(elf.class), new skf(0, this), new skf(1, new v1e(22, this)));

    @Override // defpackage.x7f
    public final void A(BottomSheetBehavior bottomSheetBehavior) {
        bottomSheetBehavior.getClass();
        super.A(bottomSheetBehavior);
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
        View findViewById = requireView().findViewById(R.id.dialog_juicy_catalog_menu_container);
        findViewById.getClass();
        LayoutInflater layoutInflater = getLayoutInflater();
        layoutInflater.getClass();
        zkf zkfVar = new zkf((JuicyBottomSheetFrameLayout) findViewById, layoutInflater);
        elf elfVar = (elf) this.l.getValue();
        Continuation continuation = null;
        x97.y(wyf.F(getLifecycle()), null, null, new rkf(elfVar.t, continuation, zkfVar, 0), 3);
        x97.y(wyf.F(getLifecycle()), null, null, new rkf(elfVar.x, continuation, zkfVar, 1), 3);
        x97.y(wyf.F(getLifecycle()), null, null, new ptd(elfVar.u, (Continuation) null, this), 3);
        zkfVar.m = new h4b(elfVar);
    }

    @Override // defpackage.ue3
    public final int z() {
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean("force_dark_theme", false)) {
            return super.z();
        }
        return yu0.a[ou0.c.ordinal()] == 1 ? R.style.AppTheme_EdgeToEdge_TransparentStatusBar : R.style.AppTheme_Dark_EdgeToEdge_TransparentStatusBar;
    }
}
