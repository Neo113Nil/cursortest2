package defpackage;

import java.util.List;
import kotlin.ranges.IntRange;

/* loaded from: classes.dex */
public final class bl0 implements kfh {
    public final hl0 a;

    public bl0(hl0 hl0Var) {
        this.a = hl0Var;
    }

    @Override // defpackage.kfh
    public final int a(fxe fxeVar, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((ffh) list.get(0)).J(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((ffh) list.get(i2)).J(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.kfh
    public final lfh b(mfh mfhVar, List list, long j) {
        ksk kskVar;
        ksk kskVar2;
        int i;
        int i2;
        int size = list.size();
        ksk[] kskVarArr = new ksk[size];
        List list2 = list;
        int size2 = list2.size();
        long j2 = 0;
        int i3 = 0;
        while (true) {
            kskVar = null;
            if (i3 >= size2) {
                break;
            }
            ffh ffhVar = (ffh) list.get(i3);
            Object n = ffhVar.n();
            dl0 dl0Var = n instanceof dl0 ? (dl0) n : null;
            if (dl0Var != null && ((Boolean) dl0Var.a.getValue()).booleanValue()) {
                kskVarArr[i3] = ffhVar.M(j);
                j2 = (r8.b & 4294967295L) | (r8.a << 32);
            }
            i3++;
        }
        int size3 = list2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            ffh ffhVar2 = (ffh) list.get(i4);
            if (kskVarArr[i4] == null) {
                kskVarArr[i4] = ffhVar2.M(j);
            }
        }
        if (mfhVar.F()) {
            i = (int) (j2 >> 32);
        } else {
            if (size == 0) {
                kskVar2 = null;
            } else {
                kskVar2 = kskVarArr[0];
                int i5 = size - 1;
                if (i5 != 0) {
                    int i6 = kskVar2 != null ? kskVar2.a : 0;
                    ype it = new IntRange(1, i5, 1).iterator();
                    while (it.c) {
                        ksk kskVar3 = kskVarArr[it.nextInt()];
                        int i7 = kskVar3 != null ? kskVar3.a : 0;
                        if (i6 < i7) {
                            kskVar2 = kskVar3;
                            i6 = i7;
                        }
                    }
                }
            }
            i = kskVar2 != null ? kskVar2.a : 0;
        }
        if (mfhVar.F()) {
            i2 = (int) (j2 & 4294967295L);
        } else {
            if (size != 0) {
                kskVar = kskVarArr[0];
                int i8 = size - 1;
                if (i8 != 0) {
                    int i9 = kskVar != null ? kskVar.b : 0;
                    ype it2 = new IntRange(1, i8, 1).iterator();
                    while (it2.c) {
                        ksk kskVar4 = kskVarArr[it2.nextInt()];
                        int i10 = kskVar4 != null ? kskVar4.b : 0;
                        if (i9 < i10) {
                            kskVar = kskVar4;
                            i9 = i10;
                        }
                    }
                }
            }
            i2 = kskVar != null ? kskVar.b : 0;
        }
        if (!mfhVar.F()) {
            this.a.c.setValue(new hqe((i << 32) | (i2 & 4294967295L)));
        }
        return mfh.m0(mfhVar, i, i2, new q30(kskVarArr, this, i, i2));
    }

    @Override // defpackage.kfh
    public final int c(fxe fxeVar, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((ffh) list.get(0)).G(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((ffh) list.get(i2)).G(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.kfh
    public final int d(fxe fxeVar, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((ffh) list.get(0)).a(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((ffh) list.get(i2)).a(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.kfh
    public final int e(fxe fxeVar, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((ffh) list.get(0)).z(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((ffh) list.get(i2)).z(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }
}
