package defpackage;

import com.yandex.music.shared.wave.shader.api.component.WaveGlShaderView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class isu implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jsu b;

    public /* synthetic */ isu(jsu jsuVar, int i) {
        this.a = 0;
        this.b = jsuVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        jsu jsuVar = this.b;
        hq5 hq5Var = (hq5) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                jsuVar.j(rvf.R(1), hq5Var);
                break;
            case 1:
                int intValue = num.intValue();
                int i2 = WaveGlShaderView.m;
                if ((intValue & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                jsuVar.j(0, hq5Var);
            default:
                int intValue2 = num.intValue();
                int i3 = WaveGlShaderView.m;
                if ((intValue2 & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                jsuVar.j(0, hq5Var);
        }
        return Unit.a;
    }

    public /* synthetic */ isu(jsu jsuVar, int i, byte b) {
        this.a = i;
        this.b = jsuVar;
    }
}
