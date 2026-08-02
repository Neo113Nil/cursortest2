package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import androidx.fragment.app.o;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lg5t;", "Landroidx/fragment/app/o;", "<init>", "()V", "e5t", "trailer-screen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class g5t extends o {
    public final jyr g = btf.b(new c5t(this, 0));
    public final ybf h = new ybf(ern.a(e6t.class), new xpp(20, this), new xpp(21, new c5t(this, 1)));
    public final sai i = new sai(false);
    public final jyr j = l18.b.b(hag.I(b5t.class), true);
    public final jyr k = btf.b(new c5t(this, 2));
    public final jyr l = btf.b(new c5t(this, 3));
    public final suc m = new suc(this, new ruc("TrailerBottomSheetFragment", false));

    @Override // androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (((e5t) this.g.getValue()) != null) {
            ((e6t) this.h.getValue()).H(new ln6(0, this.m, suc.class, "reportDataLoaded", "reportDataLoaded(Z)V", 0, 3));
            return;
        }
        Assertions.throwOrSkip("TrailerBottomSheetDialogWrapper", new FailedAssertionException("TrailerBottomSheetDialogWrapper: required arguments are null, closing screen"));
        y supportFragmentManager = requireActivity().getSupportFragmentManager();
        supportFragmentManager.getClass();
        a aVar = new a(supportFragmentManager);
        aVar.m(this);
        aVar.k(true, true);
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        if (((e5t) this.g.getValue()) == null) {
            return null;
        }
        y childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        sk3.V(childFragmentManager, (cvo) this.l.getValue(), this.i, "TRAILER_BOTTOM_SHEET_DIALOG_TAG", pd.t(new qzm[0]), new zhs(0, this, g5t.class, "onDismiss", "onDismiss()V", 0, 15), new wn5(new jv(22, this, this), 2013620467, true));
        this.m.b();
        return null;
    }

    @Override // androidx.fragment.app.o
    public final void onPause() {
        super.onPause();
        requireActivity().getWindow().clearFlags(128);
    }

    @Override // androidx.fragment.app.o
    public final void onResume() {
        super.onResume();
        requireActivity().getWindow().addFlags(128);
    }

    @Override // androidx.fragment.app.o
    public final void onStop() {
        super.onStop();
        if (requireActivity().isChangingConfigurations()) {
            return;
        }
        ((q7l) ((b5t) this.j.getValue()).b.f.getValue()).b();
        this.i.a();
    }

    public final void x(y yVar, sai saiVar, e6t e6tVar, tmb tmbVar, fvf fvfVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-396612394);
        int i2 = i | (oq5Var.h(yVar) ? 4 : 2) | (oq5Var.f(saiVar) ? 32 : 16) | (oq5Var.h(e6tVar) ? 256 : 128) | (oq5Var.h(tmbVar) ? 2048 : 1024) | (oq5Var.f(fvfVar) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.h(this) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        if (oq5Var.P(i2 & 1, (74899 & i2) != 74898)) {
            pm0.a(null, ild.C(-1636997523, new d5t(e6tVar, this, tmbVar, fvfVar, yVar, saiVar), oq5Var), oq5Var, 48, 1);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new d5t(this, yVar, saiVar, e6tVar, tmbVar, fvfVar, i);
        }
    }

    public final e5t y() {
        e5t e5tVar = (e5t) this.g.getValue();
        if (e5tVar != null) {
            return e5tVar;
        }
        xq0.q("Required value was null.");
        return null;
    }
}
