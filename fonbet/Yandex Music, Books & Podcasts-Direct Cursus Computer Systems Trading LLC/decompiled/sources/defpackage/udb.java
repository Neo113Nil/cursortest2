package defpackage;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public final class udb implements t9f {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public Object c;
    public final Object d;

    public udb(Object obj, String str) {
        obj.getClass();
        this.b = obj;
        this.c = c5b.a;
        this.d = btf.a(bwf.b, new y6g(26, str, this));
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int w;
        switch (this.a) {
            case 0:
                Enum[] enumArr = (Enum[]) this.b;
                eg7Var.getClass();
                int B = eg7Var.B(getDescriptor());
                if (B >= 0 && B < enumArr.length) {
                    return enumArr[B];
                }
                throw new zhp(B + " is not among valid " + getDescriptor().i() + " enum values, values size is " + enumArr.length);
            case 1:
                eg7Var.getClass();
                mhp descriptor = getDescriptor();
                tq5 c = eg7Var.c(descriptor);
                if (!c.m() && (w = c.w(getDescriptor())) != -1) {
                    throw new zhp(k5r.i(w, "Unexpected index "));
                }
                c.b(descriptor);
                return this.b;
            default:
                t9f t9fVar = (t9f) this.c;
                t9f t9fVar2 = (t9f) this.b;
                eg7Var.getClass();
                vsd vsdVar = (vsd) this.d;
                tq5 c2 = eg7Var.c(vsdVar);
                boolean m = c2.m();
                int s = m ? c2.s(vsdVar) : -1;
                tpi tpiVar = s >= 0 ? new tpi(s) : new tpi();
                if (!m || s == -1) {
                    while (true) {
                        Object obj = null;
                        boolean z = false;
                        while (true) {
                            int w2 = c2.w(vsdVar);
                            if (w2 != -1) {
                                if (w2 % 2 == 0) {
                                    obj = c2.z(vsdVar, w2, t9fVar2, null);
                                    z = true;
                                } else {
                                    if (!z) {
                                        throw new zhp(k5r.i(w2, "Value decoded before key at index "));
                                    }
                                    tpiVar.m(obj, c2.z(vsdVar, w2, t9fVar, null));
                                }
                            }
                        }
                    }
                } else {
                    for (int i = 0; i < s; i++) {
                        int i2 = i * 2;
                        tpiVar.m(c2.z(vsdVar, i2, t9fVar2, null), c2.z(vsdVar, i2 + 1, t9fVar, null));
                    }
                }
                c2.b(vsdVar);
                return tpiVar;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [arf, java.lang.Object] */
    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        switch (this.a) {
            case 0:
                return (mhp) ((jyr) this.d).getValue();
            case 1:
                return (mhp) this.d.getValue();
            default:
                return (vsd) this.d;
        }
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        long[] jArr;
        long[] jArr2;
        int i;
        switch (this.a) {
            case 0:
                Enum r2 = (Enum) obj;
                l6bVar.getClass();
                r2.getClass();
                Enum[] enumArr = (Enum[]) this.b;
                int G = xz0.G(enumArr, r2);
                if (G != -1) {
                    l6bVar.n(getDescriptor(), G);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(r2);
                String i2 = getDescriptor().i();
                String arrays = Arrays.toString(enumArr);
                arrays.getClass();
                sb.append(" is not a valid enum ");
                sb.append(i2);
                sb.append(", must be one of ");
                sb.append(arrays);
                throw new zhp(sb.toString());
            case 1:
                l6bVar.getClass();
                obj.getClass();
                l6bVar.c(getDescriptor()).b(getDescriptor());
                return;
            default:
                tpi tpiVar = (tpi) obj;
                l6bVar.getClass();
                tpiVar.getClass();
                vsd vsdVar = (vsd) this.d;
                wq5 t = l6bVar.t(vsdVar, tpiVar.e);
                Object[] objArr = tpiVar.b;
                Object[] objArr2 = tpiVar.c;
                long[] jArr3 = tpiVar.a;
                int length = jArr3.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        long j = jArr3[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8;
                            int i6 = 8 - ((~(i3 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((255 & j) < 128) {
                                    int i8 = (i3 << 3) + i7;
                                    Object obj2 = objArr[i8];
                                    Object obj3 = objArr2[i8];
                                    i = i5;
                                    int i9 = i4 + 1;
                                    jArr2 = jArr3;
                                    t.k(vsdVar, i4, (t9f) this.b, obj2);
                                    i4 += 2;
                                    t.k(vsdVar, i9, (t9f) this.c, obj3);
                                } else {
                                    jArr2 = jArr3;
                                    i = i5;
                                }
                                j >>= i;
                                i7++;
                                i5 = i;
                                jArr3 = jArr2;
                            }
                            jArr = jArr3;
                            if (i6 != i5) {
                            }
                        } else {
                            jArr = jArr3;
                        }
                        if (i3 != length) {
                            i3++;
                            jArr3 = jArr;
                        }
                    }
                }
                t.b(vsdVar);
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().i() + '>';
            default:
                return super.toString();
        }
    }

    public udb(t9f t9fVar, t9f t9fVar2) {
        this.b = t9fVar;
        this.c = t9fVar2;
        this.d = ff7.o(t9fVar, t9fVar2).e;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public udb(String str, Object obj, Annotation[] annotationArr) {
        this(obj, str);
        obj.getClass();
        List asList = Arrays.asList(annotationArr);
        asList.getClass();
        this.c = asList;
    }

    public udb(String str, Enum[] enumArr) {
        str.getClass();
        enumArr.getClass();
        this.b = enumArr;
        this.d = btf.b(new zya(2, this, str));
    }
}
