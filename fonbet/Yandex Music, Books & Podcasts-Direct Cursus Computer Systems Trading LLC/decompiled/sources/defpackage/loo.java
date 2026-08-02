package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.CharsKt;

/* loaded from: classes.dex */
public final class loo implements koo {
    public final Function1 a;
    public final tpi b;
    public tpi c;

    public loo(Map map, Function1 function1) {
        tpi tpiVar;
        this.a = function1;
        if (map == null || map.isEmpty()) {
            tpiVar = null;
        } else {
            tpiVar = new tpi(map.size());
            for (Map.Entry entry : map.entrySet()) {
                tpiVar.m(entry.getKey(), entry.getValue());
            }
        }
        this.b = tpiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.koo
    public final joo a(String str, Function0 function0) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!CharsKt.d(str.charAt(i))) {
                tpi tpiVar = this.c;
                if (tpiVar == null) {
                    long[] jArr = vso.a;
                    tpiVar = new tpi();
                    this.c = tpiVar;
                }
                Object g = tpiVar.g(str);
                if (g == null) {
                    g = new ArrayList();
                    tpiVar.m(str, g);
                }
                ((List) g).add(function0);
                lum lumVar = new lum();
                lumVar.a = tpiVar;
                lumVar.b = str;
                lumVar.c = (uif) function0;
                return lumVar;
            }
        }
        xq0.x("Registered key is empty or blank");
        return null;
    }

    @Override // defpackage.koo
    public final boolean c(Object obj) {
        return ((Boolean) this.a.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    @Override // defpackage.koo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map d() {
        char c;
        long j;
        long j2;
        long j3;
        tpi tpiVar;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        char c2;
        long j4;
        tpi tpiVar2 = this.b;
        if (tpiVar2 == null && this.c == null) {
            e5b e5bVar = e5b.a;
            e5bVar.getClass();
            return e5bVar;
        }
        int i3 = 0;
        int i4 = tpiVar2 != null ? tpiVar2.e : 0;
        tpi tpiVar3 = this.c;
        HashMap hashMap = new HashMap(i4 + (tpiVar3 != null ? tpiVar3.e : 0));
        char c3 = 7;
        long j5 = -9187201950435737472L;
        int i5 = 8;
        if (tpiVar2 != null) {
            Object[] objArr = tpiVar2.b;
            Object[] objArr2 = tpiVar2.c;
            long[] jArr3 = tpiVar2.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j2 = 128;
                while (true) {
                    long j6 = jArr3[i6];
                    j3 = 255;
                    if ((((~j6) << c3) & j6 & j5) != j5) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j6 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                c2 = c3;
                                j4 = j5;
                                hashMap.put((String) objArr[i9], (List) objArr2[i9]);
                            } else {
                                c2 = c3;
                                j4 = j5;
                            }
                            j6 >>= 8;
                            i8++;
                            c3 = c2;
                            j5 = j4;
                        }
                        c = c3;
                        j = j5;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        c = c3;
                        j = j5;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j5 = j;
                }
                tpiVar = this.c;
                if (tpiVar != null) {
                    Object[] objArr3 = tpiVar.b;
                    Object[] objArr4 = tpiVar.c;
                    long[] jArr4 = tpiVar.a;
                    int length2 = jArr4.length - 2;
                    if (length2 >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j7 = jArr4[i10];
                            if ((((~j7) << c) & j7 & j) != j) {
                                int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                int i12 = i3;
                                while (i12 < i11) {
                                    if ((j7 & j3) < j2) {
                                        int i13 = (i10 << 3) + i12;
                                        Object obj = objArr3[i13];
                                        List list = (List) objArr4[i13];
                                        String str = (String) obj;
                                        i2 = i5;
                                        if (list.size() == 1) {
                                            Object invoke = ((Function0) list.get(i3)).invoke();
                                            if (invoke != null) {
                                                if (!c(invoke)) {
                                                    wb8.h(o2g.Z(invoke));
                                                    return null;
                                                }
                                                hashMap.put(str, u75.d(invoke));
                                            }
                                            jArr2 = jArr4;
                                        } else {
                                            int size = list.size();
                                            ArrayList arrayList = new ArrayList(size);
                                            while (i3 < size) {
                                                long[] jArr5 = jArr4;
                                                Object invoke2 = ((Function0) list.get(i3)).invoke();
                                                if (invoke2 != null && !c(invoke2)) {
                                                    wb8.h(o2g.Z(invoke2));
                                                    return null;
                                                }
                                                arrayList.add(invoke2);
                                                i3++;
                                                jArr4 = jArr5;
                                            }
                                            jArr2 = jArr4;
                                            hashMap.put(str, arrayList);
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                        i2 = i5;
                                    }
                                    j7 >>= i2;
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
                return hashMap;
            }
        }
        c = 7;
        j = -9187201950435737472L;
        j2 = 128;
        j3 = 255;
        tpiVar = this.c;
        if (tpiVar != null) {
        }
        return hashMap;
    }

    @Override // defpackage.koo
    public final Object e(String str) {
        tpi tpiVar = this.b;
        List list = tpiVar != null ? (List) tpiVar.k(str) : null;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && tpiVar != null) {
        }
        return list.get(0);
    }
}
