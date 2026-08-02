package defpackage;

import com.yandex.delivery.utils.push.impl.a;

/* loaded from: classes9.dex */
public final /* synthetic */ class t7i implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ t7i(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                return new syc(aVar.y, 8);
            default:
                return aVar.w.adapter(u2g0.class);
        }
    }
}
