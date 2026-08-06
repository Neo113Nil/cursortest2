package defpackage;

import com.combinations.level.experts.core.domain.model.GameProgress;
import com.combinations.level.experts.core.domain.model.LevelResult;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class gj extends d71 implements lv {
    public final /* synthetic */ int E7jCp8Ls;
    public final /* synthetic */ lj JFJ3QoxA;
    public final /* synthetic */ int XnEVoBF0td1l;
    public /* synthetic */ Object mOu10nynGul;
    public final /* synthetic */ int rQPn8YBR;
    public final /* synthetic */ long uFEq9NpZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj(lj ljVar, int i, int i2, int i3, long j, vg vgVar) {
        super(2, vgVar);
        this.JFJ3QoxA = ljVar;
        this.rQPn8YBR = i;
        this.E7jCp8Ls = i2;
        this.XnEVoBF0td1l = i3;
        this.uFEq9NpZ = j;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        gj gjVar = (gj) uFEq9NpZ((vg) obj2, (eg0) obj);
        kc1 kc1Var = kc1.GWasM1elztuh;
        gjVar.WIEu4Ya2g8(kc1Var);
        return kc1Var;
    }

    @Override // defpackage.h6
    public final Object WIEu4Ya2g8(Object obj) {
        Map map;
        eg0 eg0Var = (eg0) this.mOu10nynGul;
        o50.A1EKNP6CxJ(obj);
        GameProgress GWasM1elztuh = lj.GWasM1elztuh(this.JFJ3QoxA, eg0Var);
        Map<Integer, LevelResult> results = GWasM1elztuh.getResults();
        int i = this.rQPn8YBR;
        LevelResult levelResult = results.get(new Integer(i));
        int stars = levelResult != null ? levelResult.getStars() : 0;
        int i2 = this.E7jCp8Ls;
        LevelResult levelResult2 = new LevelResult(Math.max(i2, stars), Math.min(this.XnEVoBF0td1l, levelResult != null ? levelResult.getBestMoves() : Integer.MAX_VALUE), Math.min(this.uFEq9NpZ, levelResult != null ? levelResult.getBestTimeMs() : Long.MAX_VALUE));
        Map<Integer, LevelResult> results2 = GWasM1elztuh.getResults();
        Integer num = new Integer(i);
        results2.getClass();
        if (results2.isEmpty()) {
            map = Collections.singletonMap(num, levelResult2);
            map.getClass();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap(results2);
            linkedHashMap.put(num, levelResult2);
            map = linkedHashMap;
        }
        eg0Var.xqGvceK5x(lj.X1lG3V04pd, rb.WkXHDbKiD(map.entrySet(), "|", null, null, new bCsSzSHkbaQ(18), 30));
        if (i2 >= 3) {
            if ((levelResult != null ? levelResult.getStars() : 0) < 3) {
                eg0Var.xqGvceK5x(lj.xqGvceK5x, new Integer(GWasM1elztuh.getHints() + 1));
            }
        }
        return kc1.GWasM1elztuh;
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        gj gjVar = new gj(this.JFJ3QoxA, this.rQPn8YBR, this.E7jCp8Ls, this.XnEVoBF0td1l, this.uFEq9NpZ, vgVar);
        gjVar.mOu10nynGul = obj;
        return gjVar;
    }
}
