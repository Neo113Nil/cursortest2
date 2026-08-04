package com.gamericefishpro.space.e1;

import com.gamericefishpro.space.ph.m0;
import com.gamericefishpro.space.ph.x;
import com.gamericefishpro.space.t.h0;
import com.gamericefishpro.space.t.p0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements f {
    public final Function1 d;
    public final h0 e;
    public h0 i;

    public g(Map from, Function1 function1) {
        h0 h0Var;
        this.d = function1;
        if (from == null || from.isEmpty()) {
            h0Var = null;
        } else {
            h0Var = new h0(from.size());
            Intrinsics.checkNotNullParameter(from, "from");
            for (Map.Entry entry : from.entrySet()) {
                h0Var.m(entry.getKey(), entry.getValue());
            }
        }
        this.e = h0Var;
    }

    @Override // com.gamericefishpro.space.e1.f
    public final boolean c(Object obj) {
        return ((Boolean) this.d.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0090  */
    @Override // com.gamericefishpro.space.e1.f
    public final Map d() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        h0 h0Var = this.e;
        if (h0Var == null && this.i == null) {
            return m0.c();
        }
        int i3 = 0;
        int i4 = h0Var != null ? h0Var.e : 0;
        h0 h0Var2 = this.i;
        HashMap map = new HashMap(i4 + (h0Var2 != null ? h0Var2.e : 0));
        char c2 = 7;
        long j4 = -9187201950435737472L;
        int i5 = 8;
        if (h0Var != null) {
            Object[] objArr = h0Var.b;
            Object[] objArr2 = h0Var.c;
            long[] jArr3 = h0Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j2 = 128;
                while (true) {
                    long j5 = jArr3[i6];
                    j3 = 255;
                    if ((((~j5) << c2) & j5 & j4) != j4) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j5 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                map.put((String) objArr[i9], (List) objArr2[i9]);
                            }
                            j5 >>= 8;
                            i8++;
                            c2 = c2;
                            j4 = j4;
                        }
                        c = c2;
                        j = j4;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        c = c2;
                        j = j4;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c2 = c;
                    j4 = j;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 128;
                j3 = 255;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
        }
        h0 h0Var3 = this.i;
        if (h0Var3 != null) {
            Object[] objArr3 = h0Var3.b;
            Object[] objArr4 = h0Var3.c;
            long[] jArr4 = h0Var3.a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i10 = 0;
                while (true) {
                    long j6 = jArr4[i10];
                    if ((((~j6) << c) & j6 & j) != j) {
                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                        int i12 = i3;
                        while (i12 < i11) {
                            if ((j6 & j3) < j2) {
                                int i13 = (i10 << 3) + i12;
                                Object obj = objArr3[i13];
                                List list = (List) objArr4[i13];
                                String str = (String) obj;
                                i2 = i5;
                                if (list.size() == 1) {
                                    Object objInvoke = ((Function0) list.get(i3)).invoke();
                                    if (objInvoke != null) {
                                        if (!c(objInvoke)) {
                                            throw new IllegalStateException(k.a(objInvoke).toString());
                                        }
                                        map.put(str, x.d(objInvoke));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i3 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objInvoke2 = ((Function0) list.get(i3)).invoke();
                                        if (objInvoke2 != null && !c(objInvoke2)) {
                                            throw new IllegalStateException(k.a(objInvoke2).toString());
                                        }
                                        arrayList.add(objInvoke2);
                                        i3++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                i2 = i5;
                            }
                            j6 >>= i2;
                            i12++;
                            i5 = i2;
                            jArr4 = jArr2;
                            i3 = 0;
                        }
                        jArr = jArr4;
                        i = i5;
                        if (i11 != i) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i = i5;
                    }
                    if (i10 == length2) {
                        break;
                    }
                    i10++;
                    i5 = i;
                    jArr4 = jArr;
                    i3 = 0;
                }
            }
        }
        return map;
    }

    @Override // com.gamericefishpro.space.e1.f
    public final Object e(String str) {
        h0 h0Var = this.e;
        List list = h0Var != null ? (List) h0Var.k(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && h0Var != null) {
            List listSubList = list.subList(1, list.size());
            int iF = h0Var.f(str);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = h0Var.c;
            Object obj = objArr[iF];
            h0Var.b[iF] = str;
            objArr[iF] = listSubList;
        }
        return list.get(0);
    }

    @Override // com.gamericefishpro.space.e1.f
    public final e f(String str, Function0 function0) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!CharsKt.a(str.charAt(i))) {
                h0 h0Var = this.i;
                if (h0Var == null) {
                    long[] jArr = p0.a;
                    h0Var = new h0();
                    this.i = h0Var;
                }
                Object objG = h0Var.g(str);
                if (objG == null) {
                    objG = new ArrayList();
                    h0Var.m(str, objG);
                }
                ((List) objG).add(function0);
                return new com.gamericefishpro.space.a8.c((Object) h0Var, str, (Object) function0, 6);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
