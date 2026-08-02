package defpackage;

import android.appwidget.AppWidgetManager;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpmv;", "Ljnb;", "", "<init>", "()V", "widget-install-screen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class pmv extends jnb {
    public final jyr k;
    public final jyr n;
    public final jyr j = l18.b.b(hag.I(tmv.class), true);
    public final jyr l = btf.b(new h8v(18));
    public final jyr m = btf.b(new h8v(19));

    public pmv() {
        final int i = 0;
        this.k = btf.b(new Function0(this) { // from class: omv
            public final /* synthetic */ pmv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        vmv vmvVar = (vmv) ((tmv) this.b.j.getValue());
                        vmvVar.getClass();
                        return new umv(vmvVar);
                    default:
                        return Boolean.valueOf(pmv.A(this.b));
                }
            }
        });
        final int i2 = 1;
        this.n = btf.b(new Function0(this) { // from class: omv
            public final /* synthetic */ pmv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        vmv vmvVar = (vmv) ((tmv) this.b.j.getValue());
                        vmvVar.getClass();
                        return new umv(vmvVar);
                    default:
                        return Boolean.valueOf(pmv.A(this.b));
                }
            }
        });
    }

    public static boolean A(pmv pmvVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            return AppWidgetManager.getInstance(pmvVar.getContext()).isRequestPinAppWidgetSupported();
        }
        return false;
    }

    public final void B() {
        ((sai) this.m.getValue()).a();
        y supportFragmentManager = requireActivity().getSupportFragmentManager();
        supportFragmentManager.getClass();
        a aVar = new a(supportFragmentManager);
        aVar.m(this);
        aVar.k(true, true);
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        super.onCreateView(layoutInflater, viewGroup, bundle);
        if (bundle == null) {
            qmv qmvVar = (qmv) this.l.getValue();
            sai saiVar = (sai) this.m.getValue();
            boolean booleanValue = ((Boolean) this.n.getValue()).booleanValue();
            q0v q0vVar = new q0v(9, this);
            qmvVar.getClass();
            saiVar.getClass();
            cvo cvoVar = cvo.i;
            fxf.O(this, o6m.b(wjb.WidgetInstallScreen, null, 6), saiVar, pd.t(new qzm[0]), null, new wn5(new w04(qmvVar, booleanValue, q0vVar), 1211372938, true), 20);
        } else {
            B();
        }
        return null;
    }
}
