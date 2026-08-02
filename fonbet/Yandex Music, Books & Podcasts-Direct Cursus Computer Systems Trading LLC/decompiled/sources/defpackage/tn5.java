package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class tn5 extends oj implements Function2 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tn5(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((wn5) this.receiver).a(((Number) obj2).intValue(), (hq5) obj);
                return Unit.a;
            case 1:
                float floatValue = ((Number) obj).floatValue();
                d1n d1nVar = (d1n) this.receiver;
                boolean b = d1nVar.b();
                t6k t6kVar = d1nVar.f;
                float f = 0.0f;
                if (!b) {
                    if (d1nVar.a() > d1nVar.g.e()) {
                        ((Function0) d1nVar.b.getValue()).invoke();
                    }
                    x97.y(d1nVar.a, null, null, new c90(d1nVar, f, null, 3), 3);
                    if (t6kVar.e() == 0.0f || floatValue < 0.0f) {
                        floatValue = 0.0f;
                    }
                    t6kVar.h(0.0f);
                    f = floatValue;
                }
                return new Float(f);
            default:
                long j = ((yzt) obj).a;
                lxo lxoVar = (lxo) this.receiver;
                x97.y(lxoVar.A.c(), null, null, new ixo(lxoVar, j, null, 2), 3);
                return Unit.a;
        }
    }
}
