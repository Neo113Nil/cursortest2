package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class a3o {
    public static final ThreadLocal a = new ThreadLocal();

    public static final tqc a(int i) {
        if (i >= 0 && i < 150) {
            tqc tqcVar = tqc.b;
            return tqc.b;
        }
        if (150 <= i && i < 250) {
            tqc tqcVar2 = tqc.b;
            return tqc.c;
        }
        if (250 <= i && i < 350) {
            tqc tqcVar3 = tqc.b;
            return tqc.d;
        }
        if (350 <= i && i < 450) {
            tqc tqcVar4 = tqc.b;
            return tqc.e;
        }
        if (450 <= i && i < 550) {
            tqc tqcVar5 = tqc.b;
            return tqc.f;
        }
        if (550 <= i && i < 650) {
            tqc tqcVar6 = tqc.b;
            return tqc.g;
        }
        if (650 <= i && i < 750) {
            tqc tqcVar7 = tqc.b;
            return tqc.h;
        }
        if (750 <= i && i < 850) {
            tqc tqcVar8 = tqc.b;
            return tqc.i;
        }
        if (850 > i || i >= 1000) {
            tqc tqcVar9 = tqc.b;
            return tqc.e;
        }
        tqc tqcVar10 = tqc.b;
        return tqc.j;
    }

    public static long b(TypedArray typedArray, int i) {
        long j = d85.n;
        if (!typedArray.hasValue(i)) {
            return j;
        }
        ocg.s(typedArray, i);
        return c3x.f(typedArray.getColor(i, 0));
    }

    public static final tpc c(TypedArray typedArray, int i) {
        vpc vpcVar;
        typedArray.getClass();
        ThreadLocal threadLocal = a;
        Object obj = threadLocal.get();
        Object obj2 = obj;
        if (obj == null) {
            TypedValue typedValue = new TypedValue();
            threadLocal.set(typedValue);
            obj2 = typedValue;
        }
        TypedValue typedValue2 = (TypedValue) obj2;
        if (typedArray.getValue(i, typedValue2) && typedValue2.type == 3) {
            CharSequence charSequence = typedValue2.string;
            boolean d = Intrinsics.d(charSequence, "sans-serif");
            l5d l5dVar = qpc.b;
            if (d) {
                return new tpc(l5dVar);
            }
            if (Intrinsics.d(charSequence, "sans-serif-thin")) {
                return new tpc(l5dVar, tqc.k);
            }
            if (Intrinsics.d(charSequence, "sans-serif-light")) {
                return new tpc(l5dVar, tqc.l);
            }
            if (Intrinsics.d(charSequence, "sans-serif-medium")) {
                return new tpc(l5dVar, tqc.n);
            }
            if (Intrinsics.d(charSequence, "sans-serif-black")) {
                return new tpc(l5dVar, tqc.q);
            }
            if (Intrinsics.d(charSequence, "serif")) {
                return new tpc(qpc.c);
            }
            if (Intrinsics.d(charSequence, "cursive")) {
                return new tpc(qpc.e);
            }
            if (Intrinsics.d(charSequence, "monospace")) {
                return new tpc(qpc.d);
            }
            if (typedValue2.resourceId != 0) {
                CharSequence charSequence2 = typedValue2.string;
                charSequence2.getClass();
                if (StringsKt.h0(charSequence2, "res/")) {
                    CharSequence charSequence3 = typedValue2.string;
                    charSequence3.getClass();
                    if (!StringsKt.P(charSequence3, ".xml")) {
                        return new tpc(vwb.s(gld.q(typedValue2.resourceId, null, 0, 14)));
                    }
                    Resources resources = typedArray.getResources();
                    resources.getClass();
                    XmlResourceParser xml = resources.getXml(typedValue2.resourceId);
                    xml.getClass();
                    try {
                        hqc E = hld.E(xml, resources);
                        if (E instanceof iqc) {
                            jqc[] jqcVarArr = ((iqc) E).a;
                            jqcVarArr.getClass();
                            ArrayList arrayList = new ArrayList(jqcVarArr.length);
                            for (jqc jqcVar : jqcVarArr) {
                                arrayList.add(gld.q(jqcVar.f, a(jqcVar.b), jqcVar.c ? 1 : 0, 8));
                            }
                            vpcVar = new vpc(arrayList);
                            xml.close();
                        } else {
                            xml.close();
                            vpcVar = null;
                        }
                        if (vpcVar != null) {
                            return new tpc(vpcVar);
                        }
                    } catch (Throwable th) {
                        xml.close();
                        throw th;
                    }
                }
            }
        }
        return null;
    }

    public static final long d(TypedArray typedArray, int i, lx7 lx7Var, long j) {
        ThreadLocal threadLocal = a;
        Object obj = threadLocal.get();
        if (obj == null) {
            obj = new TypedValue();
            threadLocal.set(obj);
        }
        TypedValue typedValue = (TypedValue) obj;
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 5) {
            return j;
        }
        int complexUnit = typedValue.getComplexUnit();
        return complexUnit != 1 ? complexUnit != 2 ? lx7Var.w(typedArray.getDimension(i, 0.0f)) : v7g.D(TypedValue.complexToFloat(typedValue.data), 4294967296L) : v7g.D(TypedValue.complexToFloat(typedValue.data), 8589934592L);
    }
}
