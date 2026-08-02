package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class was extends uif implements Function1 {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ float s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public was(float f, aqi aqiVar) {
        super(1);
        this.s = f;
        this.t = aqiVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                long j = ((nmq) obj).a;
                float d = nmq.d(j);
                float f = this.s;
                float f2 = d * f;
                float b = nmq.b(j) * f;
                aqi aqiVar = (aqi) this.t;
                if (nmq.d(((nmq) aqiVar.getValue()).a) != f2 || nmq.b(((nmq) aqiVar.getValue()).a) != b) {
                    aqiVar.setValue(new nmq(a4g.i(f2, b)));
                }
                break;
            default:
                long longValue = ((Number) obj).longValue();
                d8t d8tVar = (d8t) this.t;
                boolean g = d8tVar.g();
                v6k v6kVar = d8tVar.g;
                if (!g) {
                    if (v6kVar.h() == Long.MIN_VALUE) {
                        v6kVar.i(longValue);
                        d8tVar.a.a.setValue(Boolean.TRUE);
                    }
                    long h = longValue - v6kVar.h();
                    float f3 = this.s;
                    if (f3 != 0.0f) {
                        h = eeh.c(h / f3);
                    }
                    if (d8tVar.b == null) {
                        d8tVar.f.i(h);
                    }
                    d8tVar.h(h, f3 == 0.0f);
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public was(d8t d8tVar, float f) {
        super(1);
        this.t = d8tVar;
        this.s = f;
    }
}
