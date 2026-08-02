package defpackage;

import com.yandex.plus.home.feature.webviews.internal.stories.b;
import com.yandex.plus.home.feature.webviews.internal.stories.e;

/* loaded from: classes2.dex */
public final /* synthetic */ class zk41 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ zk41(e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        e eVar = this.b;
        switch (i) {
            case 0:
                return new b(eVar);
            default:
                ((xk41) eVar.b).hideNativePayButton();
                eVar.C.invoke();
                return zy11.a;
        }
    }
}
