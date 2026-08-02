package defpackage;

import android.view.Window;
import androidx.fragment.app.t;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class qjf implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjf b;

    public /* synthetic */ qjf(rjf rjfVar, int i) {
        this.a = i;
        this.b = rjfVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        t l;
        Window window;
        switch (this.a) {
            case 0:
                Float f = (Float) obj;
                if (f != null) {
                    float floatValue = f.floatValue();
                    qnu qnuVar = ((snu) ((jyr) this.b.j).getValue()).a;
                    if (floatValue >= 0.0f) {
                        float f2 = (floatValue + 280) % 360;
                        if (f2 >= 0.0f) {
                            f1d.s(f2, qnuVar.d, null);
                        } else {
                            ssg.a(4, "WaveColorsCenterImpl", "not correct colorHue", null);
                        }
                    } else {
                        ssg.a(4, "WaveColorsCenterImpl", "not correct colorHue", null);
                    }
                }
                break;
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                rjf rjfVar = this.b;
                if (booleanValue) {
                    rjfVar.g();
                } else {
                    rjfVar.h();
                }
                break;
            case 2:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                rjf rjfVar2 = this.b;
                l5v l5vVar = (l5v) rjfVar2.f;
                if (booleanValue2) {
                    if (l5vVar != null) {
                        l5vVar.onResume();
                    }
                    f1e f1eVar = (f1e) rjfVar2.p;
                    if (f1eVar != null && (l = f1eVar.a.l()) != null && (window = l.getWindow()) != null) {
                        window.addFlags(128);
                    }
                } else {
                    if (l5vVar != null) {
                        l5vVar.a();
                    }
                    f1e f1eVar2 = (f1e) rjfVar2.p;
                    if (f1eVar2 != null) {
                        f1eVar2.a();
                    }
                }
                break;
            case 3:
                ((Boolean) obj).booleanValue();
                this.b.d();
                break;
            default:
                yy1 yy1Var = (yy1) obj;
                l5v l5vVar2 = (l5v) this.b.f;
                if (l5vVar2 != null) {
                    l5vVar2.b(yy1Var);
                }
                break;
        }
        return Unit.a;
    }
}
