package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.t;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lytm;", "Lbf6;", "Lduc;", "<init>", "()V", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class ytm extends bf6 implements duc {
    public cum k;
    public final jyr l = l18.b.b(hag.I(p8q.class), true);
    public final cvo m = new cvo(wjb.ProfileScreen, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60);

    @Override // defpackage.duc
    public final int f() {
        return R.string.profile_title;
    }

    @Override // defpackage.duc
    public final boolean h() {
        return true;
    }

    @Override // defpackage.bf6, defpackage.jnb, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fnb fnbVar = d().a;
        t l = l();
        l.getClass();
        jfu viewModelStore = getViewModelStore();
        viewModelStore.getClass();
        cum cumVar = new cum(fnbVar, (hq0) l, viewModelStore);
        this.k = cumVar;
        cumVar.q = new awc(this);
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.profile_layout_plus_pult, viewGroup, false);
    }

    @Override // androidx.fragment.app.o
    public final void onDestroy() {
        super.onDestroy();
        cum cumVar = this.k;
        if (cumVar != null) {
            cumVar.o.V();
        }
        this.k = null;
    }

    @Override // androidx.fragment.app.o
    public final void onDestroyView() {
        super.onDestroyView();
        cum cumVar = this.k;
        if (cumVar != null) {
            cumVar.k = null;
        }
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        t l = l();
        l.getClass();
        xos xosVar = new xos(view, (hq0) l, new n7b(this));
        cum cumVar = this.k;
        byte b = 0;
        int i = 1;
        char c = 1;
        char c2 = 1;
        char c3 = 1;
        if (cumVar != null) {
            gum gumVar = new gum(view);
            cumVar.k = gumVar;
            gumVar.i.v(cumVar.a());
            vdr vdrVar = (vdr) cumVar.r.getValue();
            mm6 mm6Var = cumVar.p;
            ox6.B(vdrVar, mm6Var, new aum(cumVar, i));
            q13 q13Var = gumVar.b;
            s9f[] s9fVarArr = gum.n;
            ComposeView composeView = (ComposeView) q13Var.a(s9fVarArr[0]);
            mg2 a = ((eg2) cumVar.g.getValue()).a(cumVar.c);
            l18 l18Var = l18.b;
            bdt I = hag.I(cce.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            cce cceVar = (cce) qdcVar.C(I);
            bdt I2 = hag.I(q8r.class);
            qdc qdcVar2 = l18Var.a;
            qdcVar2.getClass();
            y2x.B(composeView, a, pd.O(), cceVar, (q8r) qdcVar2.C(I2), 2.5f, Boolean.TRUE, 1.25f);
            String str = cumVar.d.a.c;
            str.getClass();
            ((TextView) gumVar.e.a(s9fVarArr[1])).setText(str);
            ((TextView) gumVar.f.a(s9fVarArr[2])).setText(cumVar.n);
            gumVar.a(cumVar.e.g());
            ox6.B(((g5k) cumVar.m.getValue()).g, mm6Var, new gfl(17, gumVar));
            bdt I3 = hag.I(byb.class);
            qdc qdcVar3 = l18Var.a;
            qdcVar3.getClass();
            if (!((h9m) ((byb) qdcVar3.C(I3)).b(h9m.class)).h()) {
                g5k g5kVar = (g5k) cumVar.m.getValue();
                g5kVar.getClass();
                ComposeView composeView2 = (ComposeView) gumVar.l.a(s9fVarArr[9]);
                composeView2.getClass();
                composeView2.setContent(new wn5(new e5k(g5kVar, c3 == true ? 1 : 0, c2 == true ? 1 : 0, b), 1254225532, true));
            }
            ebm ebmVar = new ebm(0, cumVar, cum.class, "onEasyLoginConnectClicked", "onEasyLoginConnectClicked()V", 0, 19);
            if (((Boolean) gumVar.d.getValue()).booleanValue()) {
                ComposeView composeView3 = (ComposeView) gumVar.m.a(s9fVarArr[10]);
                composeView3.getClass();
                composeView3.setContent(new wn5(new xya(ebmVar, b, b), 1705689820, true));
            }
        }
        by7 by7Var = ((p8q) this.l.getValue()).d;
        dzf viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        ox6.B(by7Var, wyf.F(viewLifecycleOwner.getLifecycle()), new gfl(16, xosVar));
        View findViewById = view.findViewById(R.id.no_connection_slot);
        findViewById.getClass();
        ((ComposeView) findViewById).setContent(new wn5(new fmj(new mjm(c == true ? 1 : 0, this), hmj.d, b), 1441306406, true));
    }

    @Override // defpackage.jnb
    /* renamed from: z, reason: from getter */
    public final cvo getK() {
        return this.m;
    }
}
