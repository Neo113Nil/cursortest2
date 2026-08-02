package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import ru.yandex.music.R;
import ru.yandex.music.catalog.juicybottommenu.JuicyBottomSheetFrameLayout;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrwp;", "Lx7f;", "<init>", "()V", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class rwp extends x7f {
    public final jyr l;
    public final jyr m;
    public final jyr n;

    public rwp() {
        bdt I = hag.I(swp.class);
        l18 l18Var = l18.b;
        this.l = l18Var.b(I, true);
        this.m = l18Var.b(hag.I(x7m.class), true);
        this.n = l18Var.b(hag.I(z66.class), true);
    }

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
        t l = l();
        if (l == null) {
            dismissAllowingStateLoss();
            return;
        }
        LayoutInflater layoutInflater = getLayoutInflater();
        View findViewById = requireView().findViewById(R.id.dialog_juicy_catalog_menu_container);
        findViewById.getClass();
        layoutInflater.inflate(R.layout.bottom_sheet_share_invite_details_compat, (ViewGroup) findViewById, true);
        Context context = view.getContext();
        context.getClass();
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        ((x7m) this.m.getValue()).getClass();
        g5k g5kVar = new g5k(l, "share_details");
        composeView.setContent(new wn5(new e5k(g5kVar, false, 1, (byte) 0), 1254225532, true));
        pu0 t = pd.t(new qzm[0]);
        View findViewById2 = requireView().findViewById(R.id.dialog_juicy_catalog_menu_container);
        findViewById2.getClass();
        View findViewById3 = ((JuicyBottomSheetFrameLayout) findViewById2).findViewById(R.id.root_layout);
        findViewById3.getClass();
        ComposeView composeView2 = (ComposeView) findViewById3;
        swp swpVar = (swp) this.l.getValue();
        swpVar.getClass();
        twp twpVar = swpVar.b;
        y supportFragmentManager = l.getSupportFragmentManager();
        supportFragmentManager.getClass();
        twpVar.getClass();
        qf1 qf1Var = new qf1(l, supportFragmentManager, 2);
        Resources resources = l.getApplicationContext().getResources();
        resources.getClass();
        composeView2.setContent(new wn5(new gvl(t, new uwp(resources, qf1Var), new qbp(0, this, rwp.class, "dismissDialog", "dismissDialog()V", 0, 16), composeView, 21), -630821328, true));
        if (((z66) this.n.getValue()).g()) {
            g5kVar.a();
        }
    }
}
