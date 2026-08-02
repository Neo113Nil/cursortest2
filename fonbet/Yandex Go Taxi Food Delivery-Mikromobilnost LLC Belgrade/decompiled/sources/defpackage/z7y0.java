package defpackage;

import androidx.fragment.app.FragmentActivity;
import com.yandex.go.taxi.order.chat.web_preloading.b;
import com.yandex.messaging.domain.statuses.j;
import com.yandex.messenger.websdk.api.WebMessenger;
import ru.yandex.taxi.messenger.domain.a;
import ru.yandex.taxi.preorder.source.data.c;
import ru.yandex.taxi.preorder.source.domain.r;

/* loaded from: classes14.dex */
public final class z7y0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;

    public /* synthetic */ z7y0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.g;
        xvf0 xvf0Var2 = this.f;
        xvf0 xvf0Var3 = this.e;
        xvf0 xvf0Var4 = this.d;
        xvf0 xvf0Var5 = this.c;
        xvf0 xvf0Var6 = this.b;
        switch (i) {
            case 0:
                return new b((tt2) xvf0Var6.get(), (WebMessenger) xvf0Var5.get(), (FragmentActivity) xvf0Var4.get(), (n20) xvf0Var3.get(), (a) xvf0Var2.get(), (com.yandex.go.taxi.order.chat.experiments.b) xvf0Var.get());
            case 1:
                return new uio0((ysg) xvf0Var6.get(), (p2y0) xvf0Var5.get(), (rgz0) xvf0Var4.get(), (com.yandex.go.taxi.order.tipssuggest.domain.a) xvf0Var3.get(), (tgz0) xvf0Var2.get(), (dm21) xvf0Var.get());
            case 2:
                return new j((au21) xvf0Var6.get(), (yt21) xvf0Var5.get(), (kse) xvf0Var4.get(), (ut21) xvf0Var3.get(), i5m.a(xvf0Var2), i5m.a(xvf0Var));
            case 3:
                return new uy41((c) xvf0Var6.get(), (com.yandex.go.address.position_confirmation.j) xvf0Var5.get(), (tft0) xvf0Var4.get(), (ah00) xvf0Var3.get(), (r) xvf0Var2.get(), i5m.a(xvf0Var));
            default:
                return new pd61((rjt0) xvf0Var6.get(), (od61) xvf0Var5.get(), (pte0) xvf0Var4.get(), (srj0) xvf0Var3.get(), (fif) xvf0Var2.get(), (fy01) xvf0Var.get());
        }
    }
}
