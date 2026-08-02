package defpackage;

import com.yandex.go.scooters.insurance.f;
import com.yandex.go.scooters.passes.g;
import com.yandex.go.scooters.passes.h;

/* loaded from: classes13.dex */
public final class utn0 implements ujn0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ utn0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.sy60
    public final void a() {
        switch (this.a) {
            case 0:
                ((f) this.b).r(new qu(9));
                break;
            default:
                ((h) this.c).r(new qu(9));
                break;
        }
    }

    @Override // defpackage.ujn0
    public final void c() {
        switch (this.a) {
            case 0:
                ((sls) this.c).invoke();
                break;
            default:
                ((g) this.b).invoke();
                break;
        }
    }
}
