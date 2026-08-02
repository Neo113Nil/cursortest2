package com.yandex.pulse.mvi;

import androidx.annotation.Keep;
import defpackage.e4i;
import defpackage.l30;
import defpackage.tzb;
import defpackage.ups;
import defpackage.yav;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
class TotalScoreCalculator implements e4i {
    public final tzb a;
    public final ups b;
    public final HashMap c;
    public final HashSet d;
    public final HashSet e;
    public final HashSet f;
    public final HashSet g;
    public final HashMap h;
    public final l30 i;
    public final double j;
    public boolean k;

    @Keep
    private final yav mHandlerCallback;

    public TotalScoreCalculator(tzb tzbVar, ups upsVar, Map map, Set set, long j) {
        yav yavVar = new yav() { // from class: com.yandex.pulse.mvi.b
            @Override // defpackage.yav
            public final void a() {
                TotalScoreCalculator totalScoreCalculator = TotalScoreCalculator.this;
                totalScoreCalculator.g.clear();
                totalScoreCalculator.a();
            }
        };
        this.mHandlerCallback = yavVar;
        this.i = new l30(yavVar);
        this.a = tzbVar;
        this.j = 1.0d;
        this.b = upsVar;
        this.c = new HashMap(map.size());
        this.d = new HashSet(map.size());
        this.e = new HashSet(set.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Double d = (Double) entry.getValue();
            if (d.doubleValue() > 0.0d) {
                this.c.put(str, d);
                this.d.add(str);
                if (set.contains(str)) {
                    this.e.add(str);
                }
            }
        }
        this.d.removeAll(set);
        this.h = new HashMap(this.c.size());
        this.f = new HashSet(this.d);
        this.g = new HashSet(this.e);
        this.i.sendEmptyMessageDelayed(0, j);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a() {
        char c;
        char c2;
        if (!this.k && this.f.size() <= 0) {
            boolean isEmpty = this.g.isEmpty();
            HashMap hashMap = this.c;
            HashMap hashMap2 = this.h;
            if (isEmpty || hashMap2.size() >= hashMap.size()) {
                double d = 0.0d;
                double d2 = 0.0d;
                for (Map.Entry entry : hashMap2.entrySet()) {
                    double doubleValue = ((Double) hashMap.get(entry.getKey())).doubleValue();
                    if (doubleValue > 0.0d) {
                        d += ((Double) entry.getValue()).doubleValue() * doubleValue;
                        d2 += doubleValue;
                    }
                }
                tzb tzbVar = this.a;
                ups upsVar = this.b;
                if (d2 <= 0.0d) {
                    Map map = Collections.EMPTY_MAP;
                    upsVar.f(-1.0d, map);
                    String str = tzbVar.a;
                    switch (str.hashCode()) {
                        case 103501:
                            if (str.equals("hot")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3059428:
                            if (str.equals("cold")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3641989:
                            if (str.equals("warm")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                            upsVar.h(-1.0d, map);
                            break;
                        case 1:
                            upsVar.l(-1.0d, map);
                            break;
                        case 2:
                            upsVar.g(-1.0d, map);
                            break;
                    }
                } else {
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap2);
                    double d3 = d / d2;
                    String str2 = tzbVar.a;
                    switch (str2.hashCode()) {
                        case 103501:
                            if (str2.equals("hot")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3059428:
                            if (str2.equals("cold")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3641989:
                            if (str2.equals("warm")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            upsVar.h(d3, unmodifiableMap);
                            break;
                        case 1:
                            upsVar.l(d3, unmodifiableMap);
                            upsVar.f(d3, unmodifiableMap);
                            break;
                        case 2:
                            upsVar.g(d3, unmodifiableMap);
                            double d4 = this.j;
                            if (d4 > 0.0d) {
                                upsVar.f(Math.min(Math.max(0.0d, (d3 * d4) + 0.0d), 100.0d), unmodifiableMap);
                                break;
                            }
                            break;
                    }
                }
                this.k = true;
                this.i.removeMessages(0);
            }
        }
    }

    @Override // defpackage.e4i
    public final void e(double d, String str) {
        if (this.k || !this.c.containsKey(str) || d < 0.0d) {
            return;
        }
        this.h.put(str, Double.valueOf(d));
        this.f.remove(str);
        this.g.remove(str);
        a();
    }

    @Override // defpackage.e4i
    public final void i() {
        this.g.clear();
        a();
    }

    @Override // defpackage.e4i
    public final void reset() {
        this.h.clear();
        HashSet hashSet = this.f;
        hashSet.clear();
        hashSet.addAll(this.d);
        HashSet hashSet2 = this.g;
        hashSet2.clear();
        hashSet2.addAll(this.e);
        this.k = false;
    }
}
