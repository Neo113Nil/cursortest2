package defpackage;

import com.yandex.music.shared.wave.shader.api.component.WaveGlShaderView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class lsu implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ g1v b;

    public /* synthetic */ lsu(g1v g1vVar) {
        this.b = g1vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        g1v g1vVar = this.b;
        hq5 hq5Var = (hq5) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                int i2 = WaveGlShaderView.m;
                if ((intValue & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                g1vVar.j(0, hq5Var);
            default:
                num.getClass();
                g1vVar.j(rvf.R(1), hq5Var);
                break;
        }
        return Unit.a;
    }
}
