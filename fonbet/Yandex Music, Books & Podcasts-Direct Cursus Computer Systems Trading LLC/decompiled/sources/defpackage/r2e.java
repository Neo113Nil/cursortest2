package defpackage;

import android.util.Log;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import java.util.LinkedHashMap;
import java.util.List;
import ru.yandex.video.m3.player.provider.model.SurfaceSize;

/* loaded from: classes3.dex */
public final class r2e extends sij {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r2e(tjf tjfVar) {
        super(r0);
        this.b = 1;
        Float valueOf = Float.valueOf(1.0f);
        this.c = tjfVar;
    }

    @Override // defpackage.sij
    public final void afterChange(s9f s9fVar, Object obj, Object obj2) {
        int i;
        vlb vlbVar;
        int i2 = this.b;
        Object obj3 = this.c;
        switch (i2) {
            case 0:
                s2e s2eVar = (s2e) obj3;
                s9fVar.getClass();
                int intValue = ((Number) obj2).intValue();
                ((Number) obj).intValue();
                if (intValue == 1 || intValue == 2) {
                    i = 4;
                } else {
                    jyr jyrVar = t5j.e;
                    i = wyf.M() ? 3 : intValue;
                }
                s2eVar.p.setState(i);
                s2eVar.b(intValue);
                break;
            case 1:
                s9fVar.getClass();
                float floatValue = ((Number) obj2).floatValue();
                float floatValue2 = ((Number) obj).floatValue();
                tjf tjfVar = (tjf) obj3;
                rjf rjfVar = tjfVar.f;
                jkf jkfVar = tjfVar.g;
                if (jkfVar != null) {
                    f1d.s(floatValue, jkfVar.a.n, null);
                }
                if (floatValue == 0.0f && floatValue2 > 0.0f) {
                    rjfVar.g();
                    break;
                } else if (floatValue2 == 0.0f && floatValue > 0.0f) {
                    rjfVar.h();
                    break;
                }
                break;
            case 2:
                j2n j2nVar = (j2n) obj3;
                jyr jyrVar2 = j2nVar.t;
                s9fVar.getClass();
                n74 n74Var = (n74) obj2;
                n74 n74Var2 = (n74) obj;
                if (n74Var2 != null) {
                    nmb nmbVar = ((y74) jyrVar2.getValue()).c;
                    nmbVar.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("_meta", nmb.u(1));
                    nmbVar.C("Pult.Picker.Closed", linkedHashMap);
                }
                if (n74Var2 != null) {
                    n74Var2.a();
                }
                if (n74Var != null) {
                    l74 l74Var = new l74(j2nVar.C, n74Var);
                    t tVar = n74Var.a;
                    m74 m74Var = n74Var.d;
                    s9f[] s9fVarArr = n74.f;
                    b84 b84Var = new b84(tVar, l74Var, (List) m74Var.getValue(n74Var, s9fVarArr[1]), (m84) n74Var.c.getValue(n74Var, s9fVarArr[0]), (z64) n74Var.e.getValue(n74Var, s9fVarArr[2]));
                    n74Var.b = b84Var;
                    cvo cvoVar = cvo.i;
                    cvo b = o6m.b(wjb.PultPickerScreen, null, 6);
                    pu0 t = pd.t(new qzm[0]);
                    t93 t93Var = new t93(0, l74Var, l74.class, "onClose", "onClose()V", 0, 26);
                    wn5 wn5Var = new wn5(new t31(5, b84Var), -289408711, true);
                    sai saiVar = b84Var.g;
                    saiVar.getClass();
                    y supportFragmentManager = tVar.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    fxf.N(supportFragmentManager, b, saiVar, "CastPicker", t, t93Var, wn5Var);
                }
                if (n74Var != null) {
                    y74 y74Var = (y74) jyrVar2.getValue();
                    r1n r1nVar = j2nVar.c;
                    y74Var.getClass();
                    nmb nmbVar2 = y74Var.c;
                    int ordinal = r1nVar.ordinal();
                    if (ordinal == 0) {
                        vlbVar = vlb.Player;
                    } else if (ordinal != 1) {
                        b6e.s();
                        break;
                    } else {
                        vlbVar = vlb.Menu;
                    }
                    nmbVar2.getClass();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    dfi.p(1, "from", vlbVar.a, "_meta", linkedHashMap2);
                    nmbVar2.C("Pult.Picker.Opened", linkedHashMap2);
                    break;
                }
                break;
            case 3:
                s9fVar.getClass();
                ((Boolean) obj2).getClass();
                ((Boolean) obj).getClass();
                g7q g7qVar = (g7q) obj3;
                g7q.a(g7qVar, g7qVar.a.c());
                break;
            case 4:
                s9fVar.getClass();
                SurfaceSize surfaceSize = (SurfaceSize) obj2;
                Log.i("YP:Capping", "Capping adjusted: " + ((SurfaceSize) obj) + " -> " + surfaceSize);
                hjp hjpVar = ((str) obj3).g;
                if (hjpVar != null) {
                    hjpVar.accept(surfaceSize);
                    break;
                }
                break;
            default:
                s9fVar.getClass();
                hqw hqwVar = (hqw) obj2;
                if (hqwVar != null) {
                    maq maqVar = hqwVar.a;
                    xdr xdrVar = ((wpw) obj3).i;
                    q7q q7qVar = new q7q(maqVar);
                    xdrVar.getClass();
                    xdrVar.m(null, q7qVar);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2e(s2e s2eVar) {
        super(4);
        this.b = 0;
        this.c = s2eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r2e(int i, Object obj) {
        super(null);
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r2e(g7q g7qVar) {
        super(r0);
        this.b = 3;
        Boolean bool = Boolean.FALSE;
        this.c = g7qVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2e(SurfaceSize surfaceSize, str strVar) {
        super(surfaceSize);
        this.b = 4;
        this.c = strVar;
    }
}
