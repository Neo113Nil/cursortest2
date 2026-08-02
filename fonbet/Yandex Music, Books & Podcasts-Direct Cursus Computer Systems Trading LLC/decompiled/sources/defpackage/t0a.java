package defpackage;

import com.yandex.plus.bdui.a;
import com.yandex.plus.bdui.query.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class t0a implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xqn b;

    public /* synthetic */ t0a(xqn xqnVar, int i) {
        this.a = i;
        this.b = xqnVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                r2f r2fVar = (r2f) this.b.a;
                if (r2fVar != null) {
                    r2fVar.g(null);
                }
                return Unit.a;
            case 1:
                Object obj = this.b.a;
                obj.getClass();
                return (t4a) obj;
            case 2:
                Object obj2 = this.b.a;
                obj2.getClass();
                return (ri7) obj2;
            case 3:
                Object obj3 = this.b.a;
                obj3.getClass();
                return (a) obj3;
            case 4:
                Object obj4 = this.b.a;
                obj4.getClass();
                return (o3a) obj4;
            default:
                return (f) this.b.a;
        }
    }
}
