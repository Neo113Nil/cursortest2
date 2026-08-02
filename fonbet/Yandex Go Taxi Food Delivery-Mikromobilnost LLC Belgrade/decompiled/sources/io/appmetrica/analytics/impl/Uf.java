package io.appmetrica.analytics.impl;

import defpackage.bd20;
import defpackage.ffp0;
import defpackage.tls;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;

/* loaded from: classes9.dex */
public final class Uf implements bd20, Vf {
    public final bd20 a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();

    public Uf(bd20 bd20Var) {
        this.a = bd20Var;
    }

    public final void a(ffp0 ffp0Var, Set<String> set) {
        if (this.b.containsKey(ffp0Var)) {
            return;
        }
        this.b.put(ffp0Var, set);
        Pf pf = (Pf) this.c.get(ffp0Var);
        if (pf != null) {
            bd20 bd20Var = this.a;
            Iterator it = pf.a.iterator();
            while (it.hasNext()) {
                ((tls) it.next()).invoke(bd20Var);
            }
            pf.a.clear();
        }
    }

    public final Set<String> b(ffp0 ffp0Var) {
        Set<String> set = (Set) this.b.get(ffp0Var);
        return set == null ? EmptySet.a : set;
    }

    @Override // defpackage.bd20
    public final void reportAdditionalMetric(ffp0 ffp0Var, String str, long j, String str2, String str3) {
        if (this.b.containsKey(ffp0Var)) {
            this.a.reportAdditionalMetric(ffp0Var, str, j, str2, str3);
            return;
        }
        LinkedHashMap linkedHashMap = this.c;
        Object obj = linkedHashMap.get(ffp0Var);
        if (obj == null) {
            obj = new Pf();
            linkedHashMap.put(ffp0Var, obj);
        }
        ((Pf) obj).a.add(new Qf(this, ffp0Var, str, j, str2, str3));
    }

    @Override // defpackage.bd20
    public final void reportKeyMetric(ffp0 ffp0Var, String str, long j, double d, String str2, String str3) {
        if (this.b.containsKey(ffp0Var)) {
            this.a.reportKeyMetric(ffp0Var, str, j, d, str2, str3);
            return;
        }
        LinkedHashMap linkedHashMap = this.c;
        Object obj = linkedHashMap.get(ffp0Var);
        if (obj == null) {
            obj = new Pf();
            linkedHashMap.put(ffp0Var, obj);
        }
        ((Pf) obj).a.add(new Rf(this, ffp0Var, str, j, d, str2, str3));
    }

    @Override // defpackage.bd20
    public final void reportTotalScore(ffp0 ffp0Var, String str, double d, Map<String, Double> map) {
        if (this.b.containsKey(ffp0Var)) {
            this.a.reportTotalScore(ffp0Var, str, d, map);
            return;
        }
        LinkedHashMap linkedHashMap = this.c;
        Object obj = linkedHashMap.get(ffp0Var);
        if (obj == null) {
            obj = new Pf();
            linkedHashMap.put(ffp0Var, obj);
        }
        ((Pf) obj).a.add(new Sf(this, ffp0Var, str, d, kotlin.collections.b.t(map)));
    }

    @Override // defpackage.bd20
    public final void reportTotalScoreStartupSpecific(ffp0 ffp0Var, String str, double d, Map<String, Double> map, String str2) {
        if (this.b.containsKey(ffp0Var)) {
            this.a.reportTotalScoreStartupSpecific(ffp0Var, str, d, map, str2);
            return;
        }
        LinkedHashMap linkedHashMap = this.c;
        Object obj = linkedHashMap.get(ffp0Var);
        if (obj == null) {
            obj = new Pf();
            linkedHashMap.put(ffp0Var, obj);
        }
        ((Pf) obj).a.add(new Tf(this, ffp0Var, str, d, kotlin.collections.b.t(map), str2));
    }

    @Deprecated
    public /* bridge */ /* synthetic */ void reportAdditionalMetric(ffp0 ffp0Var, String str, long j, String str2) {
    }

    @Deprecated
    public /* bridge */ /* synthetic */ void reportTotalScore(ffp0 ffp0Var, double d, Map map) {
    }

    @Deprecated
    public /* bridge */ /* synthetic */ void reportTotalScoreStartupSpecific(ffp0 ffp0Var, double d, Map map, String str) {
    }

    public final void a(ffp0 ffp0Var) {
        this.b.remove(ffp0Var);
        this.c.remove(ffp0Var);
    }
}
