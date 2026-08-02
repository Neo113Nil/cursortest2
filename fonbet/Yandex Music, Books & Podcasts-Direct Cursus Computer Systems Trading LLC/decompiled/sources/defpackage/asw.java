package defpackage;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class asw {
    public final Map a;
    public final Map b;
    public final jyr c;
    public final jyr d;
    public final jyr e;
    public final jyr f;

    public asw(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        this.a = map;
        this.b = map2;
        final int i = 0;
        this.c = btf.b(new Function0(this) { // from class: urw
            public final /* synthetic */ asw b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        asw aswVar = this.b;
                        return uah.i(aswVar.a, aswVar.b);
                    case 1:
                        Map map3 = this.b.b;
                        HashMap I = gdg.I(map3.size());
                        for (Map.Entry entry : map3.entrySet()) {
                            int intValue = ((Number) entry.getKey()).intValue();
                            b6v b6vVar = (b6v) entry.getValue();
                            Integer num = (Integer) I.get(b6vVar);
                            if (num == null) {
                                I.put(b6vVar, Integer.valueOf(intValue));
                            } else if (intValue < num.intValue()) {
                                I.put(b6vVar, Integer.valueOf(intValue));
                            }
                        }
                        return I;
                    case 2:
                        EnumMap enumMap = new EnumMap(c6v.class);
                        for (Map.Entry entry2 : this.b.a.entrySet()) {
                            int intValue2 = ((Number) entry2.getKey()).intValue();
                            c6v c6vVar = ((d6v) entry2.getValue()).b;
                            Integer num2 = (Integer) enumMap.get(c6vVar);
                            if (num2 == null) {
                                enumMap.put((EnumMap) c6vVar, (c6v) Integer.valueOf(intValue2));
                            } else if (intValue2 < num2.intValue()) {
                                enumMap.put((EnumMap) c6vVar, (c6v) Integer.valueOf(intValue2));
                            }
                        }
                        return enumMap;
                    default:
                        asw aswVar2 = this.b;
                        Map a = aswVar2.a();
                        HashMap I2 = gdg.I(aswVar2.b.size());
                        for (Map.Entry entry3 : a.entrySet()) {
                            I2.put(asw.c(((b6v) entry3.getKey()).a), entry3.getValue());
                        }
                        return I2;
                }
            }
        });
        final int i2 = 1;
        this.d = btf.b(new Function0(this) { // from class: urw
            public final /* synthetic */ asw b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        asw aswVar = this.b;
                        return uah.i(aswVar.a, aswVar.b);
                    case 1:
                        Map map3 = this.b.b;
                        HashMap I = gdg.I(map3.size());
                        for (Map.Entry entry : map3.entrySet()) {
                            int intValue = ((Number) entry.getKey()).intValue();
                            b6v b6vVar = (b6v) entry.getValue();
                            Integer num = (Integer) I.get(b6vVar);
                            if (num == null) {
                                I.put(b6vVar, Integer.valueOf(intValue));
                            } else if (intValue < num.intValue()) {
                                I.put(b6vVar, Integer.valueOf(intValue));
                            }
                        }
                        return I;
                    case 2:
                        EnumMap enumMap = new EnumMap(c6v.class);
                        for (Map.Entry entry2 : this.b.a.entrySet()) {
                            int intValue2 = ((Number) entry2.getKey()).intValue();
                            c6v c6vVar = ((d6v) entry2.getValue()).b;
                            Integer num2 = (Integer) enumMap.get(c6vVar);
                            if (num2 == null) {
                                enumMap.put((EnumMap) c6vVar, (c6v) Integer.valueOf(intValue2));
                            } else if (intValue2 < num2.intValue()) {
                                enumMap.put((EnumMap) c6vVar, (c6v) Integer.valueOf(intValue2));
                            }
                        }
                        return enumMap;
                    default:
                        asw aswVar2 = this.b;
                        Map a = aswVar2.a();
                        HashMap I2 = gdg.I(aswVar2.b.size());
                        for (Map.Entry entry3 : a.entrySet()) {
                            I2.put(asw.c(((b6v) entry3.getKey()).a), entry3.getValue());
                        }
                        return I2;
                }
            }
        });
        final int i3 = 2;
        this.e = btf.b(new Function0(this) { // from class: urw
            public final /* synthetic */ asw b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        asw aswVar = this.b;
                        return uah.i(aswVar.a, aswVar.b);
                    case 1:
                        Map map3 = this.b.b;
                        HashMap I = gdg.I(map3.size());
                        for (Map.Entry entry : map3.entrySet()) {
                            int intValue = ((Number) entry.getKey()).intValue();
                            b6v b6vVar = (b6v) entry.getValue();
                            Integer num = (Integer) I.get(b6vVar);
                            if (num == null) {
                                I.put(b6vVar, Integer.valueOf(intValue));
                            } else if (intValue < num.intValue()) {
                                I.put(b6vVar, Integer.valueOf(intValue));
                            }
                        }
                        return I;
                    case 2:
                        EnumMap enumMap = new EnumMap(c6v.class);
                        for (Map.Entry entry2 : this.b.a.entrySet()) {
                            int intValue2 = ((Number) entry2.getKey()).intValue();
                            c6v c6vVar = ((d6v) entry2.getValue()).b;
                            Integer num2 = (Integer) enumMap.get(c6vVar);
                            if (num2 == null) {
                                enumMap.put((EnumMap) c6vVar, (c6v) Integer.valueOf(intValue2));
                            } else if (intValue2 < num2.intValue()) {
                                enumMap.put((EnumMap) c6vVar, (c6v) Integer.valueOf(intValue2));
                            }
                        }
                        return enumMap;
                    default:
                        asw aswVar2 = this.b;
                        Map a = aswVar2.a();
                        HashMap I2 = gdg.I(aswVar2.b.size());
                        for (Map.Entry entry3 : a.entrySet()) {
                            I2.put(asw.c(((b6v) entry3.getKey()).a), entry3.getValue());
                        }
                        return I2;
                }
            }
        });
        final int i4 = 3;
        this.f = btf.b(new Function0(this) { // from class: urw
            public final /* synthetic */ asw b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        asw aswVar = this.b;
                        return uah.i(aswVar.a, aswVar.b);
                    case 1:
                        Map map3 = this.b.b;
                        HashMap I = gdg.I(map3.size());
                        for (Map.Entry entry : map3.entrySet()) {
                            int intValue = ((Number) entry.getKey()).intValue();
                            b6v b6vVar = (b6v) entry.getValue();
                            Integer num = (Integer) I.get(b6vVar);
                            if (num == null) {
                                I.put(b6vVar, Integer.valueOf(intValue));
                            } else if (intValue < num.intValue()) {
                                I.put(b6vVar, Integer.valueOf(intValue));
                            }
                        }
                        return I;
                    case 2:
                        EnumMap enumMap = new EnumMap(c6v.class);
                        for (Map.Entry entry2 : this.b.a.entrySet()) {
                            int intValue2 = ((Number) entry2.getKey()).intValue();
                            c6v c6vVar = ((d6v) entry2.getValue()).b;
                            Integer num2 = (Integer) enumMap.get(c6vVar);
                            if (num2 == null) {
                                enumMap.put((EnumMap) c6vVar, (c6v) Integer.valueOf(intValue2));
                            } else if (intValue2 < num2.intValue()) {
                                enumMap.put((EnumMap) c6vVar, (c6v) Integer.valueOf(intValue2));
                            }
                        }
                        return enumMap;
                    default:
                        asw aswVar2 = this.b;
                        Map a = aswVar2.a();
                        HashMap I2 = gdg.I(aswVar2.b.size());
                        for (Map.Entry entry3 : a.entrySet()) {
                            I2.put(asw.c(((b6v) entry3.getKey()).a), entry3.getValue());
                        }
                        return I2;
                }
            }
        });
    }

    public static zrw c(r3q r3qVar) {
        if (r3qVar instanceof j3q) {
            j3q j3qVar = (j3q) r3qVar;
            return new vrw(j3qVar.a, j3qVar.c);
        }
        if (r3qVar instanceof l3q) {
            l3q l3qVar = (l3q) r3qVar;
            return new wrw(l3qVar.a, l3qVar.c);
        }
        if (r3qVar instanceof p3q) {
            p3q p3qVar = (p3q) r3qVar;
            return new xrw(p3qVar.a, p3qVar.b);
        }
        if (r3qVar instanceof m3q) {
            m3q m3qVar = (m3q) r3qVar;
            return new yrw(m3qVar.a, m3qVar.b);
        }
        b6e.s();
        return null;
    }

    public final Map a() {
        Object value = this.d.getValue();
        value.getClass();
        return (Map) value;
    }

    public final int b(izs izsVar) {
        izsVar.getClass();
        if (!(izsVar instanceof e6v)) {
            if (izsVar.equals(hzs.a)) {
                dfi.r("This should not happen. Track source should be always filled in wave queue", "YnisonSourcesContainer");
                return 0;
            }
            b6e.s();
            return 0;
        }
        e6v e6vVar = (e6v) izsVar;
        if (!(e6vVar instanceof b6v)) {
            if (!(e6vVar instanceof d6v)) {
                b6e.s();
                return 0;
            }
            Integer num = (Integer) ((Map) this.e.getValue()).get(((d6v) e6vVar).b);
            if (num != null) {
                return num.intValue();
            }
            dfi.r("WaveSource key is not found for " + izsVar, "YnisonSourcesContainer");
            return 0;
        }
        Integer num2 = (Integer) a().get(e6vVar);
        if (num2 != null) {
            return num2.intValue();
        }
        Object value = this.f.getValue();
        value.getClass();
        Integer num3 = (Integer) ((Map) value).get(c(((b6v) e6vVar).a));
        if (num3 != null) {
            return num3.intValue();
        }
        dfi.r("Source key is not found for " + izsVar, "YnisonSourcesContainer");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asw)) {
            return false;
        }
        asw aswVar = (asw) obj;
        return Intrinsics.d(this.a, aswVar.a) && Intrinsics.d(this.b, aswVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "YnisonSourcesContainer(waveSources=" + this.a + ", sources=" + this.b + ")";
    }
}
