package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import kotlin.collections.b;

/* loaded from: classes8.dex */
public final class srx0 extends iq60 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public srx0(c151 c151Var) {
        super("");
        this.b = c151Var;
    }

    @Override // defpackage.iq60
    public final void afterChange(kgx kgxVar, Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((k) this.b).a.a.V = (String) obj2;
                break;
            default:
                if (!jl40.l((String) obj, (String) obj2)) {
                    ((c151) this.b).e.b = b.f();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public srx0(Object obj, k kVar) {
        super(obj);
        this.b = kVar;
    }
}
