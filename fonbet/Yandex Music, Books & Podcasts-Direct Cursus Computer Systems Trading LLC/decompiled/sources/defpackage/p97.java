package defpackage;

import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class p97 {
    public final LinkedHashMap a;

    public p97(int i) {
        switch (i) {
            case 1:
                this.a = new LinkedHashMap();
                break;
            case 2:
                this.a = new LinkedHashMap();
                break;
            default:
                this.a = new LinkedHashMap();
                break;
        }
    }

    public void a(lm4 lm4Var, Function1 function1) {
        function1.getClass();
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap.containsKey(lm4Var)) {
            b6e.j(46, "A `initializer` with the same `clazz` has already been added: ", lm4Var.f());
        } else {
            linkedHashMap.put(lm4Var, new dfu(lm4Var, function1));
        }
    }

    public void b(i5i i5iVar) {
        i5iVar.getClass();
        int i = i5iVar.a;
        int i2 = i5iVar.b;
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.a;
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = new TreeMap();
            linkedHashMap.put(valueOf, obj);
        }
        TreeMap treeMap = (TreeMap) obj;
        if (treeMap.containsKey(Integer.valueOf(i2))) {
            Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i2)) + " with " + i5iVar);
        }
        treeMap.put(Integer.valueOf(i2), i5iVar);
    }

    public q97 c() {
        q97 q97Var = new q97(this.a);
        cxb.l0(q97Var);
        return q97Var;
    }

    public nme d() {
        Collection values = this.a.values();
        values.getClass();
        dfu[] dfuVarArr = (dfu[]) values.toArray(new dfu[0]);
        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
    }

    public void e(Object obj, String str) {
        Object[] objArr;
        str.getClass();
        if (obj == null) {
            obj = null;
        } else {
            lm4 a = ern.a(obj.getClass());
            if (!a.equals(ern.a(Boolean.TYPE)) && !a.equals(ern.a(Byte.TYPE)) && !a.equals(ern.a(Integer.TYPE)) && !a.equals(ern.a(Long.TYPE)) && !a.equals(ern.a(Float.TYPE)) && !a.equals(ern.a(Double.TYPE)) && !a.equals(ern.a(String.class)) && !a.equals(ern.a(Boolean[].class)) && !a.equals(ern.a(Byte[].class)) && !a.equals(ern.a(Integer[].class)) && !a.equals(ern.a(Long[].class)) && !a.equals(ern.a(Float[].class)) && !a.equals(ern.a(Double[].class)) && !a.equals(ern.a(String[].class))) {
                int i = 0;
                if (a.equals(ern.a(boolean[].class))) {
                    boolean[] zArr = (boolean[]) obj;
                    String str2 = ic7.a;
                    int length = zArr.length;
                    objArr = new Boolean[length];
                    while (i < length) {
                        objArr[i] = Boolean.valueOf(zArr[i]);
                        i++;
                    }
                } else if (a.equals(ern.a(byte[].class))) {
                    byte[] bArr = (byte[]) obj;
                    String str3 = ic7.a;
                    int length2 = bArr.length;
                    objArr = new Byte[length2];
                    while (i < length2) {
                        objArr[i] = Byte.valueOf(bArr[i]);
                        i++;
                    }
                } else if (a.equals(ern.a(int[].class))) {
                    int[] iArr = (int[]) obj;
                    String str4 = ic7.a;
                    int length3 = iArr.length;
                    objArr = new Integer[length3];
                    while (i < length3) {
                        objArr[i] = Integer.valueOf(iArr[i]);
                        i++;
                    }
                } else if (a.equals(ern.a(long[].class))) {
                    long[] jArr = (long[]) obj;
                    String str5 = ic7.a;
                    int length4 = jArr.length;
                    objArr = new Long[length4];
                    while (i < length4) {
                        objArr[i] = Long.valueOf(jArr[i]);
                        i++;
                    }
                } else if (a.equals(ern.a(float[].class))) {
                    float[] fArr = (float[]) obj;
                    String str6 = ic7.a;
                    int length5 = fArr.length;
                    objArr = new Float[length5];
                    while (i < length5) {
                        objArr[i] = Float.valueOf(fArr[i]);
                        i++;
                    }
                } else {
                    if (!a.equals(ern.a(double[].class))) {
                        wvs.i("Key ", str, " has invalid type ", a);
                        return;
                    }
                    double[] dArr = (double[]) obj;
                    String str7 = ic7.a;
                    int length6 = dArr.length;
                    objArr = new Double[length6];
                    while (i < length6) {
                        objArr[i] = Double.valueOf(dArr[i]);
                        i++;
                    }
                }
                obj = objArr;
            }
        }
        this.a.put(str, obj);
    }

    public void f(HashMap hashMap) {
        hashMap.getClass();
        for (Map.Entry entry : hashMap.entrySet()) {
            e(entry.getValue(), (String) entry.getKey());
        }
    }
}
