package defpackage;

import com.yandex.music.shared.wave.shader.api.component.WaveGlShaderView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class ksu implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ n5v b;

    public /* synthetic */ ksu(n5v n5vVar) {
        this.b = n5vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        n5v n5vVar = this.b;
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
                n5vVar.j(0, hq5Var);
            default:
                num.getClass();
                n5vVar.j(rvf.R(1), hq5Var);
                break;
        }
        return Unit.a;
    }
}
