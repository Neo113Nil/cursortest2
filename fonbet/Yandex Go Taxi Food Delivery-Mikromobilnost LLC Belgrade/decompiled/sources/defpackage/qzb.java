package defpackage;

import android.content.Context;
import com.yandex.go.clarify_address.e;
import com.yandex.go.support.web.CommonSupportJsNativeApi;
import ru.yandex.taxi.banners.c;
import ru.yandex.taxi.communications.b;
import ru.yandex.taxi.communications.data.a;
import ru.yandex.taxi.preorder.repositories.g;

/* loaded from: classes.dex */
public final class qzb implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ qzb(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new pzb((e) xvf0Var.get());
            case 1:
                return new z0c((a1c) xvf0Var.get());
            case 2:
                return new h2c((dne0) xvf0Var.get());
            case 3:
                return new k3c((Context) xvf0Var.get());
            case 4:
                return new ru.yandex.taxi.linked_order.provider.e((u5c) xvf0Var.get());
            case 5:
                return new u5c((eex) xvf0Var.get());
            case 6:
                return new z5c((eex) xvf0Var.get());
            case 7:
                return new c29(25, (kf00) xvf0Var.get());
            case 8:
                return new d1s0((pwy0) xvf0Var.get());
            case 9:
                return new spc((as21) xvf0Var.get());
            case 10:
                return new vpc((CommonSupportJsNativeApi) xvf0Var.get());
            case 11:
                return new ctc((pho) xvf0Var.get());
            case 12:
                c cVar = (c) ((qu4) xvf0Var.get()).q.getValue();
                q5z.i(cVar);
                return cVar;
            case 13:
                final c cVar2 = (c) xvf0Var.get();
                return new Runnable() { // from class: ftc
                    @Override // java.lang.Runnable
                    public final void run() {
                        c cVar3 = c.this;
                        cVar3.v = true;
                        cVar3.a.a.postDelayed(cVar3.w, 100L);
                    }
                };
            case 14:
                zpf0 zpf0Var = (zpf0) xvf0Var.get();
                q5z.i(zpf0Var);
                return zpf0Var;
            case 15:
                return ktc.a((erc) xvf0Var.get());
            case 16:
                return new duc((bae0) xvf0Var.get());
            case 17:
                return new s66((rqo) xvf0Var.get(), 1);
            case 18:
                return new b((a) xvf0Var.get());
            case 19:
                return new dwc((ah00) xvf0Var.get());
            case 20:
                return new cxc(xvf0Var);
            case 21:
                return new d3a((rqo) xvf0Var.get(), 1);
            case 22:
                return new vit(12, (k7x0) xvf0Var.get());
            case 23:
                return new kyc((pho) xvf0Var.get());
            case 24:
                return new ugd((rqo) xvf0Var.get());
            case 25:
                return new ehd((e2x0) xvf0Var.get());
            case 26:
                return new erd((fga0) xvf0Var.get());
            case 27:
                return new jrd((drd) xvf0Var.get());
            case 28:
                return new nrd((g) xvf0Var.get());
            default:
                return new dsd((i6r) xvf0Var.get());
        }
    }
}
