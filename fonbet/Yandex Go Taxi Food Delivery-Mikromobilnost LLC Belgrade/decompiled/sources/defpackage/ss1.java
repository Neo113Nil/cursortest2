package defpackage;

import com.yandex.quark.capability.CapabilityListener;
import com.yandex.quark.lite.js.a;
import com.yandex.quark.utils.Disposable;

/* loaded from: classes2.dex */
public final /* synthetic */ class ss1 implements Disposable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ss1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.yandex.quark.utils.Disposable
    public final void dispose() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ts1 ts1Var = (ts1) obj2;
                ts1Var.b.remove((CapabilityListener) obj);
                ts1Var.a.getClass();
                break;
            default:
                ((a) obj2).x.remove((ifo) obj);
                break;
        }
    }
}
