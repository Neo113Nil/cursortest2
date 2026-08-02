package defpackage;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Set;

/* loaded from: classes3.dex */
public final class e8g extends AbstractMap implements Serializable {
    public static final ehf i = new ehf(6);
    public c8g g;
    public c8g h;
    public int d = 0;
    public int e = 0;
    public final Comparator a = i;
    public final d8g c = new d8g();
    public d8g[] b = new d8g[16];
    public int f = 12;

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public final d8g a(Object obj, boolean z) {
        int i2;
        d8g d8gVar;
        boolean z2;
        d8g d8gVar2;
        d8g d8gVar3;
        d8g d8gVar4;
        d8g d8gVar5;
        d8g d8gVar6;
        d8g[] d8gVarArr = this.b;
        int hashCode = obj.hashCode();
        int i3 = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
        int i4 = ((i3 >>> 7) ^ i3) ^ (i3 >>> 4);
        boolean z3 = true;
        int length = i4 & (d8gVarArr.length - 1);
        d8g d8gVar7 = d8gVarArr[length];
        ehf ehfVar = i;
        d8g d8gVar8 = null;
        Comparator comparator = this.a;
        if (d8gVar7 != null) {
            Comparable comparable = comparator == ehfVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = d8gVar7.f;
                i2 = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (i2 == 0) {
                    return d8gVar7;
                }
                d8g d8gVar9 = i2 < 0 ? d8gVar7.b : d8gVar7.c;
                if (d8gVar9 == null) {
                    break;
                }
                d8gVar7 = d8gVar9;
            }
        } else {
            i2 = 0;
        }
        if (!z) {
            return null;
        }
        d8g d8gVar10 = this.c;
        if (d8gVar7 != null) {
            d8g d8gVar11 = d8gVar7;
            d8gVar = new d8g(d8gVar11, obj, i4, d8gVar10, d8gVar10.e);
            if (i2 < 0) {
                d8gVar11.b = d8gVar;
            } else {
                d8gVar11.c = d8gVar;
            }
            b(d8gVar11, true);
        } else {
            if (comparator == ehfVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            d8gVar = new d8g(d8gVar7, obj, i4, d8gVar10, d8gVar10.e);
            d8gVarArr[length] = d8gVar;
        }
        int i5 = this.d;
        this.d = i5 + 1;
        if (i5 > this.f) {
            d8g[] d8gVarArr2 = this.b;
            int length2 = d8gVarArr2.length;
            int i6 = length2 * 2;
            d8g[] d8gVarArr3 = new d8g[i6];
            n8n n8nVar = new n8n(6, (byte) 0);
            n8n n8nVar2 = new n8n(6, (byte) 0);
            int i7 = 0;
            while (i7 < length2) {
                d8g d8gVar12 = d8gVarArr2[i7];
                if (d8gVar12 == null) {
                    z2 = z3;
                    d8gVar3 = d8gVar8;
                } else {
                    d8g d8gVar13 = d8gVar8;
                    for (d8g d8gVar14 = d8gVar12; d8gVar14 != null; d8gVar14 = d8gVar14.b) {
                        d8gVar14.a = d8gVar13;
                        d8gVar13 = d8gVar14;
                    }
                    int i8 = 0;
                    int i9 = 0;
                    while (true) {
                        if (d8gVar13 != null) {
                            z2 = z3;
                            d8g d8gVar15 = d8gVar13.a;
                            d8gVar13.a = d8gVar8;
                            d8g d8gVar16 = d8gVar13.c;
                            while (true) {
                                d8g d8gVar17 = d8gVar16;
                                d8gVar2 = d8gVar15;
                                d8gVar15 = d8gVar17;
                                if (d8gVar15 == null) {
                                    break;
                                }
                                d8gVar15.a = d8gVar2;
                                d8gVar16 = d8gVar15.b;
                            }
                        } else {
                            d8g d8gVar18 = d8gVar13;
                            d8gVar13 = d8gVar8;
                            d8gVar2 = d8gVar18;
                            z2 = z3;
                        }
                        if (d8gVar13 == null) {
                            break;
                        }
                        if ((d8gVar13.g & length2) == 0) {
                            i8++;
                        } else {
                            i9++;
                        }
                        d8gVar13 = d8gVar2;
                        z3 = z2;
                        d8gVar8 = null;
                    }
                    n8nVar.b = ((Integer.highestOneBit(i8) * 2) - 1) - i8;
                    n8nVar.d = 0;
                    n8nVar.c = 0;
                    d8gVar3 = null;
                    n8nVar.e = null;
                    n8nVar2.b = ((Integer.highestOneBit(i9) * 2) - 1) - i9;
                    n8nVar2.d = 0;
                    n8nVar2.c = 0;
                    n8nVar2.e = null;
                    d8g d8gVar19 = null;
                    while (d8gVar12 != null) {
                        d8gVar12.a = d8gVar19;
                        d8g d8gVar20 = d8gVar12;
                        d8gVar12 = d8gVar12.b;
                        d8gVar19 = d8gVar20;
                    }
                    while (true) {
                        if (d8gVar19 != null) {
                            d8g d8gVar21 = d8gVar19.a;
                            d8gVar19.a = null;
                            d8g d8gVar22 = d8gVar19.c;
                            while (true) {
                                d8g d8gVar23 = d8gVar22;
                                d8gVar4 = d8gVar21;
                                d8gVar21 = d8gVar23;
                                if (d8gVar21 == null) {
                                    break;
                                }
                                d8gVar21.a = d8gVar4;
                                d8gVar22 = d8gVar21.b;
                            }
                        } else {
                            d8gVar4 = d8gVar19;
                            d8gVar19 = null;
                        }
                        if (d8gVar19 == null) {
                            break;
                        }
                        if ((d8gVar19.g & length2) == 0) {
                            n8nVar.b(d8gVar19);
                        } else {
                            n8nVar2.b(d8gVar19);
                        }
                        d8gVar19 = d8gVar4;
                    }
                    if (i8 > 0) {
                        d8gVar5 = (d8g) n8nVar.e;
                        if (d8gVar5.a != null) {
                            e7o.n();
                            return null;
                        }
                    } else {
                        d8gVar5 = null;
                    }
                    d8gVarArr3[i7] = d8gVar5;
                    int i10 = i7 + length2;
                    if (i9 > 0) {
                        d8gVar6 = (d8g) n8nVar2.e;
                        if (d8gVar6.a != null) {
                            e7o.n();
                            return null;
                        }
                    } else {
                        d8gVar6 = null;
                    }
                    d8gVarArr3[i10] = d8gVar6;
                }
                i7++;
                d8gVar8 = d8gVar3;
                z3 = z2;
            }
            this.b = d8gVarArr3;
            this.f = (i6 / 4) + (i6 / 2);
        }
        this.e++;
        return d8gVar;
    }

    public final void b(d8g d8gVar, boolean z) {
        while (d8gVar != null) {
            d8g d8gVar2 = d8gVar.b;
            d8g d8gVar3 = d8gVar.c;
            int i2 = d8gVar2 != null ? d8gVar2.i : 0;
            int i3 = d8gVar3 != null ? d8gVar3.i : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                d8g d8gVar4 = d8gVar3.b;
                d8g d8gVar5 = d8gVar3.c;
                int i5 = (d8gVar4 != null ? d8gVar4.i : 0) - (d8gVar5 != null ? d8gVar5.i : 0);
                if (i5 != -1 && (i5 != 0 || z)) {
                    f(d8gVar3);
                }
                e(d8gVar);
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                d8g d8gVar6 = d8gVar2.b;
                d8g d8gVar7 = d8gVar2.c;
                int i6 = (d8gVar6 != null ? d8gVar6.i : 0) - (d8gVar7 != null ? d8gVar7.i : 0);
                if (i6 != 1 && (i6 != 0 || z)) {
                    e(d8gVar2);
                }
                f(d8gVar);
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                d8gVar.i = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                d8gVar.i = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            d8gVar = d8gVar.a;
        }
    }

    public final void c(d8g d8gVar, boolean z) {
        d8g d8gVar2;
        d8g d8gVar3;
        int i2;
        if (z) {
            d8g d8gVar4 = d8gVar.e;
            d8gVar4.d = d8gVar.d;
            d8gVar.d.e = d8gVar4;
            d8gVar.e = null;
            d8gVar.d = null;
        }
        d8g d8gVar5 = d8gVar.b;
        d8g d8gVar6 = d8gVar.c;
        d8g d8gVar7 = d8gVar.a;
        int i3 = 0;
        if (d8gVar5 == null || d8gVar6 == null) {
            if (d8gVar5 != null) {
                d(d8gVar, d8gVar5);
                d8gVar.b = null;
            } else if (d8gVar6 != null) {
                d(d8gVar, d8gVar6);
                d8gVar.c = null;
            } else {
                d(d8gVar, null);
            }
            b(d8gVar7, false);
            this.d--;
            this.e++;
            return;
        }
        if (d8gVar5.i > d8gVar6.i) {
            d8g d8gVar8 = d8gVar5.c;
            while (true) {
                d8g d8gVar9 = d8gVar8;
                d8gVar3 = d8gVar5;
                d8gVar5 = d8gVar9;
                if (d8gVar5 == null) {
                    break;
                } else {
                    d8gVar8 = d8gVar5.c;
                }
            }
        } else {
            d8g d8gVar10 = d8gVar6.b;
            while (true) {
                d8gVar2 = d8gVar6;
                d8gVar6 = d8gVar10;
                if (d8gVar6 == null) {
                    break;
                } else {
                    d8gVar10 = d8gVar6.b;
                }
            }
            d8gVar3 = d8gVar2;
        }
        c(d8gVar3, false);
        d8g d8gVar11 = d8gVar.b;
        if (d8gVar11 != null) {
            i2 = d8gVar11.i;
            d8gVar3.b = d8gVar11;
            d8gVar11.a = d8gVar3;
            d8gVar.b = null;
        } else {
            i2 = 0;
        }
        d8g d8gVar12 = d8gVar.c;
        if (d8gVar12 != null) {
            i3 = d8gVar12.i;
            d8gVar3.c = d8gVar12;
            d8gVar12.a = d8gVar3;
            d8gVar.c = null;
        }
        d8gVar3.i = Math.max(i2, i3) + 1;
        d(d8gVar, d8gVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.b, (Object) null);
        this.d = 0;
        this.e++;
        d8g d8gVar = this.c;
        d8g d8gVar2 = d8gVar.d;
        while (d8gVar2 != d8gVar) {
            d8g d8gVar3 = d8gVar2.d;
            d8gVar2.e = null;
            d8gVar2.d = null;
            d8gVar2 = d8gVar3;
        }
        d8gVar.e = d8gVar;
        d8gVar.d = d8gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        d8g d8gVar = null;
        if (obj != null) {
            try {
                d8gVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return d8gVar != null;
    }

    public final void d(d8g d8gVar, d8g d8gVar2) {
        d8g d8gVar3 = d8gVar.a;
        d8gVar.a = null;
        if (d8gVar2 != null) {
            d8gVar2.a = d8gVar3;
        }
        if (d8gVar3 == null) {
            int i2 = d8gVar.g;
            this.b[i2 & (r0.length - 1)] = d8gVar2;
        } else if (d8gVar3.b == d8gVar) {
            d8gVar3.b = d8gVar2;
        } else {
            d8gVar3.c = d8gVar2;
        }
    }

    public final void e(d8g d8gVar) {
        d8g d8gVar2 = d8gVar.b;
        d8g d8gVar3 = d8gVar.c;
        d8g d8gVar4 = d8gVar3.b;
        d8g d8gVar5 = d8gVar3.c;
        d8gVar.c = d8gVar4;
        if (d8gVar4 != null) {
            d8gVar4.a = d8gVar;
        }
        d(d8gVar, d8gVar3);
        d8gVar3.b = d8gVar;
        d8gVar.a = d8gVar3;
        int max = Math.max(d8gVar2 != null ? d8gVar2.i : 0, d8gVar4 != null ? d8gVar4.i : 0) + 1;
        d8gVar.i = max;
        d8gVar3.i = Math.max(max, d8gVar5 != null ? d8gVar5.i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        c8g c8gVar = this.g;
        if (c8gVar != null) {
            return c8gVar;
        }
        c8g c8gVar2 = new c8g(this, 0);
        this.g = c8gVar2;
        return c8gVar2;
    }

    public final void f(d8g d8gVar) {
        d8g d8gVar2 = d8gVar.b;
        d8g d8gVar3 = d8gVar.c;
        d8g d8gVar4 = d8gVar2.b;
        d8g d8gVar5 = d8gVar2.c;
        d8gVar.b = d8gVar5;
        if (d8gVar5 != null) {
            d8gVar5.a = d8gVar;
        }
        d(d8gVar, d8gVar2);
        d8gVar2.c = d8gVar;
        d8gVar.a = d8gVar2;
        int max = Math.max(d8gVar3 != null ? d8gVar3.i : 0, d8gVar5 != null ? d8gVar5.i : 0) + 1;
        d8gVar.i = max;
        d8gVar2.i = Math.max(max, d8gVar4 != null ? d8gVar4.i : 0) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        d8g d8gVar;
        if (obj != null) {
            try {
                d8gVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (d8gVar == null) {
                return d8gVar.h;
            }
            return null;
        }
        d8gVar = null;
        if (d8gVar == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        c8g c8gVar = this.h;
        if (c8gVar != null) {
            return c8gVar;
        }
        c8g c8gVar2 = new c8g(this, 1);
        this.h = c8gVar2;
        return c8gVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            jj4.j("key == null");
            return null;
        }
        d8g a = a(obj, true);
        Object obj3 = a.h;
        a.h = obj2;
        return obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object remove(Object obj) {
        d8g d8gVar;
        if (obj != null) {
            try {
                d8gVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (d8gVar != null) {
                c(d8gVar, true);
            }
            if (d8gVar == null) {
                return d8gVar.h;
            }
            return null;
        }
        d8gVar = null;
        if (d8gVar != null) {
        }
        if (d8gVar == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.d;
    }
}
