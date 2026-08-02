package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class r79 implements rzm {
    public final /* synthetic */ int a = 0;
    public final szm b;
    public final Object c;
    public final szm d;

    public r79(rzm rzmVar, rzm rzmVar2, rzm rzmVar3) {
        this.b = rzmVar;
        this.c = rzmVar2;
        this.d = rzmVar3;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                br1 br1Var = (br1) this.b.get();
                sfg sfgVar = (sfg) ((ccp) this.d).get();
                qc9 qc9Var = (qc9) ((szm) this.c).get();
                br1Var.getClass();
                qc9Var.getClass();
                return new k8c(br1Var, sfgVar, qc9Var);
            case 1:
                xpi xpiVar = (xpi) this.b.get();
                xpi xpiVar2 = (xpi) ((szm) this.c).get();
                mm6 mm6Var = (mm6) this.d.get();
                xpiVar.getClass();
                xpiVar2.getClass();
                mm6Var.getClass();
                return new i5l();
            default:
                z6u z6uVar = (z6u) this.c;
                pq7 pq7Var = (pq7) this.b.get();
                Map map = (Map) ((rzm) this.d).get();
                pq7Var.getClass();
                map.getClass();
                knn knnVar = new knn(21, z6uVar);
                n7b n7bVar = new n7b(new ozw(25, (byte) 0));
                hxo hxoVar = pq7Var.a;
                ix6 ix6Var = new ix6(23, new sk2((SharedPreferences) hxoVar.invoke("xmail_exposed_flag_logs"), 2));
                LinkedHashMap linkedHashMap = fhc.b.a;
                linkedHashMap.getClass();
                ArrayList x0 = CollectionsKt.x0(CollectionsKt.z0(linkedHashMap.values()));
                ArrayList arrayList = new ArrayList();
                Iterator it = x0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((zn0) it.next()).b);
                }
                g06 g06Var = new g06(new s7w(arrayList), ix6Var, knnVar, n7bVar);
                jzi jziVar = new jzi(map);
                sk2 sk2Var = new sk2((SharedPreferences) hxoVar.invoke("xmail_flags_dev_settings"), 2);
                es6 es6Var = new es6();
                es6Var.a = sk2Var;
                es6Var.b = n7bVar;
                es6Var.c = new LinkedHashMap();
                return new mm7(g06Var, jziVar, es6Var);
        }
    }

    public r79(z6u z6uVar, szm szmVar, rzm rzmVar) {
        this.c = z6uVar;
        this.b = szmVar;
        this.d = rzmVar;
    }

    public r79(klx klxVar, qp2 qp2Var, ccp ccpVar, rzm rzmVar) {
        this.b = qp2Var;
        this.d = ccpVar;
        this.c = rzmVar;
    }
}
