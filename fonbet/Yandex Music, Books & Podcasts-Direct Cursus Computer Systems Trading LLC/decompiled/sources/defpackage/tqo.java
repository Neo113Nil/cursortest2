package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.yandex.payment.sdk.ui.view.HeaderView;

/* loaded from: classes4.dex */
public final class tqo implements adu {
    public final /* synthetic */ int a = 1;
    public final adu b;
    public final Object c;
    public final adu d;
    public final adu e;
    public final adu f;
    public final Object g;

    public tqo(mmo mmoVar) {
        this.b = mmoVar;
        this.c = new rdk((rdk) mmoVar.f);
        this.d = new rdk((rdk) mmoVar.g, (byte) 0);
        this.e = new n3m((dn9) mmoVar.c);
        this.f = new qzc(29, (pv9) mmoVar.e);
        this.g = (ImageView) mmoVar.d;
    }

    public final kqo a() {
        switch (this.a) {
            case 0:
                return (mmo) this.f;
            default:
                return (n3m) this.e;
        }
    }

    public final nqo b() {
        switch (this.a) {
            case 0:
                return (mmo) this.d;
            default:
                return (rdk) this.c;
        }
    }

    public final wqo c() {
        switch (this.a) {
            case 0:
                return (mmo) this.e;
            default:
                return (rdk) this.d;
        }
    }

    @Override // defpackage.adu
    public final View getRoot() {
        switch (this.a) {
            case 0:
                LinearLayout linearLayout = (LinearLayout) ((rdk) this.b).b;
                linearLayout.getClass();
                return linearLayout;
            default:
                LinearLayout linearLayout2 = (LinearLayout) ((mmo) this.b).b;
                linearLayout2.getClass();
                return linearLayout2;
        }
    }

    public tqo(rdk rdkVar) {
        this.b = rdkVar;
        this.c = (HeaderView) rdkVar.f;
        this.d = new mmo((mmo) rdkVar.e, (byte) 0);
        this.e = new mmo((mmo) rdkVar.g, (char) 0);
        this.f = new mmo((mmo) rdkVar.c);
        this.g = new g8c((g8c) rdkVar.d);
    }
}
