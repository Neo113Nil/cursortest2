package defpackage;

import androidx.compose.runtime.internal.a;
import com.yandex.go.mainscreen.superapp.impl.foundation.data.factory.q;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class wy2 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wy2(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        boolean z = true;
        int i2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                rzo.a((a) obj3, (fid) obj, vng.O(i2 | 1));
                return zy11.a;
            default:
                q qVar = (q) obj3;
                waw0 waw0Var = (waw0) obj;
                waw0 waw0Var2 = (waw0) obj2;
                qVar.getClass();
                if ((waw0Var instanceof vaw0) && (waw0Var2 instanceof vaw0)) {
                    vaw0 vaw0Var = (vaw0) waw0Var;
                    zzs zzsVar = vaw0Var.a;
                    vaw0 vaw0Var2 = (vaw0) waw0Var2;
                    if (jl40.l(vaw0Var.e, vaw0Var2.e)) {
                        if (!waw0Var.equals(waw0Var2)) {
                            if (i2 > 0 && ru.yandex.taxi.map.utils.a.j(zzsVar, vaw0Var2.a) < i2) {
                                hst hstVar = jst.e;
                                Objects.toString(zzsVar);
                                hstVar.getClass();
                                qVar.e.a.l(zzsVar);
                            }
                        }
                    }
                    z = false;
                } else {
                    z = jl40.l(waw0Var, waw0Var2);
                }
                return Boolean.valueOf(z);
        }
    }
}
