package defpackage;

import com.squareup.moshi.JsonDataException;
import com.ybsdk.feature.pfm.internal.data.local.PfmLocalFilter$Settings;
import com.ybsdk.feature.pfm.internal.ui.PfmTransactionsDataSkeletonType;
import com.ybsdk.feature.pfm.internal.ui.b;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.collections.a;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final /* synthetic */ class qdb0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ qdb0(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        r0 r0Var;
        Object value;
        ybb0[] ybb0VarArr;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                pz40 Y = bVar.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, wcb0.a((wcb0) value, null, null, PfmTransactionsDataSkeletonType.IDLE, null, null, null, null, null, 503)));
                return zy11Var;
            case 1:
                lrp0 lrp0Var = lrp0.u;
                wcb0 wcb0Var = (wcb0) obj;
                ebb0 ebb0Var = bVar.J;
                ebb0Var.getClass();
                xiu0 xiu0Var = ebb0Var.a;
                Set set = EmptySet.a;
                try {
                    String a = ebb0Var.a();
                    if (a != null && (ybb0VarArr = (ybb0[]) ebb0Var.b.fromJson(a)) != null) {
                        ArrayList arrayList = new ArrayList();
                        for (ybb0 ybb0Var : ybb0VarArr) {
                            if (ybb0Var instanceof PfmLocalFilter$Settings) {
                                arrayList.add(ybb0Var);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(ni91.l((PfmLocalFilter$Settings) it.next()));
                        }
                        set = a.N0(arrayList2);
                    }
                } catch (JsonDataException e) {
                    x4c.g("Pfm filters local loading error", e, null, Collections.singletonList(lrp0Var), 4);
                    kgx kgxVar = ebb0.c[0];
                    xiu0Var.a(null);
                } catch (EOFException e2) {
                    x4c.g("Pfm filters local loading error", e2, null, Collections.singletonList(lrp0Var), 4);
                    kgx kgxVar2 = ebb0.c[0];
                    xiu0Var.a(null);
                } catch (IllegalStateException e3) {
                    x4c.g("Pfm filters local loading error", e3, null, Collections.singletonList(lrp0Var), 4);
                    kgx kgxVar3 = ebb0.c[0];
                    xiu0Var.a(null);
                } catch (Exception e4) {
                    x4c.g("Pfm filters local loading error", e4, null, Collections.singletonList(lrp0Var), 4);
                }
                return wcb0.a(wcb0Var, null, null, null, null, null, set, null, null, 447);
            default:
                bVar.A0(false);
                bVar.Z(new sdb0());
                return zy11Var;
        }
    }
}
