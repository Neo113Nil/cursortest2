package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.yandex.payment.sdk.ui.view.HeaderView;

/* loaded from: classes2.dex */
public final class tgm0 implements zo31 {
    public final /* synthetic */ int a = 0;
    public final zo31 b;
    public final Object c;
    public final zo31 d;
    public final zo31 e;
    public final zo31 f;
    public final Object g;

    public tgm0(rm rmVar, byte b) {
        this.b = rmVar;
        this.c = new mgm0((rm) rmVar.f, (byte) 0);
        this.d = new chm0((rm) rmVar.g, (byte) 0);
        this.e = new ggm0((dna) rmVar.c);
        this.f = new lgm0((px6) rmVar.e, 1);
        this.g = (ImageView) rmVar.d;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        int i = this.a;
        zo31 zo31Var = this.b;
        switch (i) {
        }
        return (LinearLayout) ((rm) zo31Var).b;
    }

    public final hgm0 o() {
        switch (this.a) {
            case 0:
                return (fgm0) this.f;
            default:
                return (ggm0) this.e;
        }
    }

    public final ngm0 p() {
        switch (this.a) {
            case 0:
                return (mgm0) this.d;
            default:
                return (mgm0) this.c;
        }
    }

    public final dhm0 q() {
        switch (this.a) {
            case 0:
                return (chm0) this.e;
            default:
                return (chm0) this.d;
        }
    }

    public tgm0(rm rmVar) {
        this.b = rmVar;
        this.c = (HeaderView) rmVar.f;
        this.d = new mgm0((rm) rmVar.e);
        this.e = new chm0((rm) rmVar.g);
        this.f = new fgm0((rm) rmVar.c);
        this.g = new lgm0((px6) rmVar.d, 0);
    }
}
