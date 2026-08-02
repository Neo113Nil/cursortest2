package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.gms.measurement.internal.g;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.divs.e;
import com.yandex.go.superapp.discovery.map.api.SuperAppDiscoveryMapLayer;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes9.dex */
public abstract class r8 implements ie2, tha1 {
    public final /* synthetic */ int a;
    public final Object b;

    public r8(Object obj) {
        this.a = 8;
        this.b = bvf0.c(obj);
    }

    @Override // defpackage.tha1
    public y1a1 B0() {
        throw null;
    }

    @Override // defpackage.ie2
    public boolean Bc() {
        List list = (List) this.b;
        return list.isEmpty() || (list.size() == 1 && ((rkx) list.get(0)).c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Bg(aw5 aw5Var, View view, m3k m3kVar, b bVar) {
        r8 r8Var;
        aw5 aw5Var2;
        View view2;
        zy11 zy11Var;
        egk egkVar;
        b bVar2;
        m3k div = ((msk) view).getDiv();
        if (m3kVar == div) {
            return;
        }
        ((e) this.b).d(aw5Var, view, m3kVar, div);
        if (bVar != null) {
            egk d = m3kVar.d();
            if (div != null) {
                egkVar = div.d();
                aw5Var2 = aw5Var;
                view2 = view;
                bVar2 = bVar;
                r8Var = this;
            } else {
                egkVar = null;
                r8Var = this;
                aw5Var2 = aw5Var;
                view2 = view;
                bVar2 = bVar;
            }
            r8Var.ae(view2, aw5Var2, d, egkVar, bVar2);
            zy11Var = zy11.a;
        } else {
            r8Var = this;
            aw5Var2 = aw5Var;
            view2 = view;
            zy11Var = null;
        }
        if (zy11Var == null) {
            r8Var.Hc(view2, aw5Var2, m3kVar.d(), div != null ? div.d() : null);
        }
    }

    public void Cg(Object obj, ContinuationImpl continuationImpl) {
        ((r0) this.b).emit(obj, continuationImpl);
    }

    public void Dg(SuperAppDiscoveryMapLayer superAppDiscoveryMapLayer, v7p v7pVar) {
        Eg(superAppDiscoveryMapLayer, v7pVar);
    }

    public void Eg(Object obj, xvf0 xvf0Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        q5z.g(obj, "key");
        q5z.g(xvf0Var, "provider");
        linkedHashMap.put(obj, xvf0Var);
    }

    public void Fg(Object obj) {
        ((r0) this.b).l(obj);
    }

    public void Gg() {
        aaa1 aaa1Var = ((g) this.b).z;
        g.g(aaa1Var);
        aaa1Var.Gg();
    }

    public void Hc(View view, aw5 aw5Var, egk egkVar, egk egkVar2) {
    }

    @Override // defpackage.tha1
    public aaa1 M1() {
        throw null;
    }

    @Override // defpackage.tha1
    public Context N3() {
        throw null;
    }

    @Override // defpackage.ie2
    public List Nb() {
        return (List) this.b;
    }

    @Override // defpackage.tha1
    public rms Q2() {
        throw null;
    }

    public void ae(View view, aw5 aw5Var, egk egkVar, egk egkVar2, b bVar) {
        Hc(view, aw5Var, egkVar, egkVar2);
    }

    @Override // defpackage.tha1
    public t3c q4() {
        throw null;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb = new StringBuilder();
                List list = (List) this.b;
                if (!list.isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(list.toArray()));
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public r8(g gVar) {
        this.a = 10;
        cvw.l(gVar);
        this.b = gVar;
    }

    public /* synthetic */ r8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public r8(int i) {
        this.a = 0;
        this.b = gtq0.A(i);
    }
}
