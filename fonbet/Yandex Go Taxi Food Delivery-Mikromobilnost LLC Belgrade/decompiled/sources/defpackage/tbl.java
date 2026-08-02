package defpackage;

import com.yandex.feedsdk.di.Yatagan$FeedSdkComponent;
import com.yandex.go.taxi.order.map.overlay.c0;
import com.yandex.payment.sdk.flex.impl.b;
import flex.engine.a;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final /* synthetic */ class tbl implements yvf0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tbl(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (v2l) obj;
            case 1:
                b bVar = (b) obj;
                a w = ((Yatagan$FeedSdkComponent) ((com.yandex.payment.sdk.flex.impl.a) bVar.a.getValue()).a()).w();
                bVar.e.add(new WeakReference(w));
                return w;
            case 2:
                c0 c0Var = (c0) obj;
                o2y0 o2y0Var = c0Var.A;
                return c0Var.Tg(o2y0Var.b(), o2y0Var.c());
            default:
                return (a) ((sf21) obj).a.invoke();
        }
    }
}
