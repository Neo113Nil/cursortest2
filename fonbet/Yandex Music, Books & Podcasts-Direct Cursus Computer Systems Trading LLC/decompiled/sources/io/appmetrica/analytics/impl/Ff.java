package io.appmetrica.analytics.impl;

import defpackage.gvo;
import defpackage.o4i;
import defpackage.q5b;
import defpackage.uah;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Ff implements o4i, Gf {
    public final o4i a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();

    public Ff(@NotNull o4i o4iVar) {
        this.a = o4iVar;
    }

    public final void a(@NotNull gvo gvoVar, @NotNull Set<String> set) {
        if (this.b.containsKey(gvoVar)) {
            return;
        }
        this.b.put(gvoVar, set);
        Af af = (Af) this.c.get(gvoVar);
        if (af != null) {
            o4i o4iVar = this.a;
            Iterator it = af.a.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(o4iVar);
            }
            af.a.clear();
        }
    }

    @NotNull
    public final Set<String> b(@NotNull gvo gvoVar) {
        Set<String> set = (Set) this.b.get(gvoVar);
        return set == null ? q5b.a : set;
    }

    @Override // defpackage.o4i
    public final void reportAdditionalMetric(@NotNull gvo gvoVar, @NotNull String str, long j, @NotNull String str2, @NotNull String str3) {
        if (this.b.containsKey(gvoVar)) {
            this.a.reportAdditionalMetric(gvoVar, str, j, str2, str3);
            return;
        }
        LinkedHashMap linkedHashMap = this.c;
        Object obj = linkedHashMap.get(gvoVar);
        if (obj == null) {
            obj = new Af();
            linkedHashMap.put(gvoVar, obj);
        }
        ((Af) obj).a.add(new Bf(this, gvoVar, str, j, str2, str3));
    }

    @Override // defpackage.o4i
    public final void reportKeyMetric(@NotNull gvo gvoVar, @NotNull String str, long j, double d, @NotNull String str2, @NotNull String str3) {
        if (this.b.containsKey(gvoVar)) {
            this.a.reportKeyMetric(gvoVar, str, j, d, str2, str3);
            return;
        }
        LinkedHashMap linkedHashMap = this.c;
        Object obj = linkedHashMap.get(gvoVar);
        if (obj == null) {
            obj = new Af();
            linkedHashMap.put(gvoVar, obj);
        }
        ((Af) obj).a.add(new Cf(this, gvoVar, str, j, d, str2, str3));
    }

    @Override // defpackage.o4i
    public final void reportTotalScore(@NotNull gvo gvoVar, @NotNull String str, double d, @NotNull Map<String, Double> map) {
        if (this.b.containsKey(gvoVar)) {
            this.a.reportTotalScore(gvoVar, str, d, map);
            return;
        }
        LinkedHashMap linkedHashMap = this.c;
        Object obj = linkedHashMap.get(gvoVar);
        if (obj == null) {
            obj = new Af();
            linkedHashMap.put(gvoVar, obj);
        }
        ((Af) obj).a.add(new Df(this, gvoVar, str, d, uah.o(map)));
    }

    @Override // defpackage.o4i
    public final void reportTotalScoreStartupSpecific(@NotNull gvo gvoVar, @NotNull String str, double d, @NotNull Map<String, Double> map, @NotNull String str2) {
        if (this.b.containsKey(gvoVar)) {
            this.a.reportTotalScoreStartupSpecific(gvoVar, str, d, map, str2);
            return;
        }
        LinkedHashMap linkedHashMap = this.c;
        Object obj = linkedHashMap.get(gvoVar);
        if (obj == null) {
            obj = new Af();
            linkedHashMap.put(gvoVar, obj);
        }
        ((Af) obj).a.add(new Ef(this, gvoVar, str, d, uah.o(map), str2));
    }

    public final void a(@NotNull gvo gvoVar) {
        this.b.remove(gvoVar);
        this.c.remove(gvoVar);
    }

    @Deprecated
    public /* bridge */ /* synthetic */ void reportAdditionalMetric(gvo gvoVar, String str, long j, String str2) {
    }

    @Deprecated
    public /* bridge */ /* synthetic */ void reportTotalScoreStartupSpecific(gvo gvoVar, double d, Map map, String str) {
    }

    @Deprecated
    public /* bridge */ /* synthetic */ void reportTotalScore(gvo gvoVar, double d, Map map) {
    }
}
