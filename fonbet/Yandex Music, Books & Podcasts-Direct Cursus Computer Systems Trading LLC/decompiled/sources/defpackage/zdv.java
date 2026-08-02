package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.o;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lzdv;", "Landroidx/fragment/app/o;", "<init>", "()V", "zwf", "paymentsdk_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public class zdv extends o {
    public xdh h;
    public boolean j;
    public volatile fv3 k;
    public final hgv g = hgv.FORM_3DS;
    public final ybf i = new ybf(ern.a(u8q.class), new ydv(this, 1), new ydv(this, 3), new ydv(this, 2));
    public hv3 l = new sml(this);
    public final jyr m = btf.b(new ydv(this, 0));

    public void A(fv3 fv3Var) {
        fv3Var.getClass();
        fv3Var.setWebViewClient(new uiq(11, this));
        Bundle arguments = getArguments();
        fv3Var.setDebug(arguments != null ? arguments.getBoolean("is_debug") : false);
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        this.j = bundle != null;
        View inflate = layoutInflater.inflate(R.layout.paymentsdk_fragment_webview, viewGroup, false);
        int i = R.id.close_button;
        if (((FrameLayout) dag.v(R.id.close_button, inflate)) != null) {
            i = R.id.close_button_icon;
            ImageView imageView = (ImageView) dag.v(R.id.close_button_icon, inflate);
            if (imageView != null) {
                i = R.id.navigation_bar;
                ConstraintLayout constraintLayout = (ConstraintLayout) dag.v(R.id.navigation_bar, inflate);
                if (constraintLayout != null) {
                    i = R.id.navigation_bar_title;
                    if (((TextView) dag.v(R.id.navigation_bar_title, inflate)) != null) {
                        LinearLayout linearLayout = (LinearLayout) inflate;
                        FrameLayout frameLayout = (FrameLayout) dag.v(R.id.webview_container, inflate);
                        if (frameLayout != null) {
                            this.h = new xdh(linearLayout, imageView, constraintLayout, frameLayout);
                            hv3 hv3Var = this.l;
                            Context requireContext = requireContext();
                            requireContext.getClass();
                            hv3Var.d(requireContext, new hxo(24, this));
                            return (LinearLayout) x().a;
                        }
                        i = R.id.webview_container;
                    }
                }
            }
        }
        jj4.j("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.o
    public final void onDestroy() {
        super.onDestroy();
        if (this.k != null) {
            fv3 fv3Var = this.k;
            fv3Var.getClass();
            fv3Var.b();
        }
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        List list;
        fv3 fv3Var;
        view.getClass();
        Bundle arguments = getArguments();
        if (arguments == null || arguments.getBoolean("show_navigation_bar")) {
            ((ImageView) x().b).setOnClickListener(new xal(14, this));
            ((ConstraintLayout) x().c).setVisibility(0);
        } else {
            ((ConstraintLayout) x().c).setVisibility(8);
        }
        g0c y = y();
        qne m1 = gut.m1(d0n.WEBVIEW);
        x60 x60Var = (x60) y;
        x60Var.getClass();
        x60Var.a(m1);
        Bundle arguments2 = getArguments();
        String string = arguments2 != null ? arguments2.getString("url") : null;
        Bundle arguments3 = getArguments();
        Parcelable[] parcelableArray = arguments3 != null ? arguments3.getParcelableArray("trusted_urls") : null;
        cbt[] cbtVarArr = parcelableArray instanceof cbt[] ? (cbt[]) parcelableArray : null;
        if (cbtVarArr == null || (list = xz0.X(cbtVarArr)) == null) {
            list = c5b.a;
        }
        if (string == null || (fv3Var = this.k) == null) {
            return;
        }
        fv3Var.c(string, list, this.j);
    }

    public final xdh x() {
        xdh xdhVar = this.h;
        if (xdhVar != null) {
            return xdhVar;
        }
        xq0.q("Binding is not initialized");
        return null;
    }

    public final g0c y() {
        return (g0c) this.m.getValue();
    }

    /* renamed from: z, reason: from getter */
    public hgv getG() {
        return this.g;
    }
}
