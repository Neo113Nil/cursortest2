package io.appmetrica.analytics.blecollecting.impl;

import defpackage.gw00;
import defpackage.tcc;
import io.appmetrica.analytics.blewrapper.internal.config.ScanSettingsConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* loaded from: classes9.dex */
public abstract class Q {
    public static final Map a;
    public static final LinkedHashMap b;
    public static final Map c;
    public static final LinkedHashMap d;
    public static final Map e;
    public static final LinkedHashMap f;
    public static final Map g;
    public static final LinkedHashMap h;

    static {
        Map i = kotlin.collections.b.i(new Pair(1, ScanSettingsConfig.CallbackType.ALL_MATCHES), new Pair(2, ScanSettingsConfig.CallbackType.FIRST_MATCH), new Pair(3, ScanSettingsConfig.CallbackType.MATCH_LOST));
        a = i;
        Set<Map.Entry> entrySet = i.entrySet();
        int d2 = gw00.d(tcc.n(entrySet, 10));
        if (d2 < 16) {
            d2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d2);
        for (Map.Entry entry : entrySet) {
            Pair pair = new Pair((ScanSettingsConfig.CallbackType) entry.getValue(), Integer.valueOf(((Number) entry.getKey()).intValue()));
            linkedHashMap.put(pair.c(), pair.f());
        }
        b = linkedHashMap;
        Map i2 = kotlin.collections.b.i(new Pair(1, ScanSettingsConfig.MatchMode.AGGRESSIVE), new Pair(2, ScanSettingsConfig.MatchMode.STICKY));
        c = i2;
        Set<Map.Entry> entrySet2 = i2.entrySet();
        int d3 = gw00.d(tcc.n(entrySet2, 10));
        if (d3 < 16) {
            d3 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(d3);
        for (Map.Entry entry2 : entrySet2) {
            Pair pair2 = new Pair((ScanSettingsConfig.MatchMode) entry2.getValue(), Integer.valueOf(((Number) entry2.getKey()).intValue()));
            linkedHashMap2.put(pair2.c(), pair2.f());
        }
        d = linkedHashMap2;
        Map i3 = kotlin.collections.b.i(new Pair(1, ScanSettingsConfig.NumOfMatches.ONE_AD), new Pair(2, ScanSettingsConfig.NumOfMatches.FEW_AD), new Pair(3, ScanSettingsConfig.NumOfMatches.MAX_AD));
        e = i3;
        Set<Map.Entry> entrySet3 = i3.entrySet();
        int d4 = gw00.d(tcc.n(entrySet3, 10));
        if (d4 < 16) {
            d4 = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(d4);
        for (Map.Entry entry3 : entrySet3) {
            Pair pair3 = new Pair((ScanSettingsConfig.NumOfMatches) entry3.getValue(), Integer.valueOf(((Number) entry3.getKey()).intValue()));
            linkedHashMap3.put(pair3.c(), pair3.f());
        }
        f = linkedHashMap3;
        Map i4 = kotlin.collections.b.i(new Pair(1, ScanSettingsConfig.ScanMode.LOW_POWER), new Pair(2, ScanSettingsConfig.ScanMode.BALANCED), new Pair(3, ScanSettingsConfig.ScanMode.LOW_LATENCY));
        g = i4;
        Set<Map.Entry> entrySet4 = i4.entrySet();
        int d5 = gw00.d(tcc.n(entrySet4, 10));
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(d5 >= 16 ? d5 : 16);
        for (Map.Entry entry4 : entrySet4) {
            Pair pair4 = new Pair((ScanSettingsConfig.ScanMode) entry4.getValue(), Integer.valueOf(((Number) entry4.getKey()).intValue()));
            linkedHashMap4.put(pair4.c(), pair4.f());
        }
        h = linkedHashMap4;
    }
}
