package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class pnu implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ qnu b;

    public /* synthetic */ pnu(qnu qnuVar, int i) {
        this.a = i;
        this.b = qnuVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                xxq xxqVar = (xxq) obj;
                qnu qnuVar = this.b;
                rar rarVar = qnuVar.c;
                Continuation continuation2 = null;
                if (rarVar != null) {
                    rarVar.g(null);
                }
                dtt a = qnuVar.a.a(xxqVar);
                qnuVar.c = ox6.B(zsd.b0(new clc(zsd.b0(a.g(jy4.e)), new ld0(a, continuation2, 1))), qnuVar.b, new pnu(qnuVar, 1));
                break;
            default:
                float floatValue = ((Number) obj).floatValue();
                if (floatValue >= 0.0f) {
                    float f = (floatValue + 280) % 360;
                    if (f >= 0.0f) {
                        f1d.s(f, this.b.d, null);
                    } else {
                        ssg.a(4, "WaveColorsCenterImpl", "not correct colorHue", null);
                    }
                } else {
                    ssg.a(4, "WaveColorsCenterImpl", "not correct colorHue", null);
                }
                break;
        }
        return Unit.a;
    }
}
