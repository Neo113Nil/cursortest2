package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class vk8 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk8(int i, gc8 gc8Var, String str) {
        super(1);
        this.r = 0;
        this.s = i;
        this.t = gc8Var;
        this.u = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        sr5 sr5Var;
        long[] jArr;
        sr5 sr5Var2;
        long[] jArr2;
        int i;
        switch (this.r) {
            case 0:
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                int i2 = this.s;
                if (i2 >= 0 && i2 < length) {
                    break;
                } else {
                    gc8 gc8Var = (gc8) this.t;
                    StringBuilder q = k5r.q(i2, "Index out of bound (", ") for mutation ");
                    q.append((String) this.u);
                    q.append(" (");
                    q.append(length);
                    q.append(')');
                    gc8Var.I(new IndexOutOfBoundsException(q.toString()));
                    break;
                }
            case 1:
                ArrayList arrayList = (ArrayList) this.t;
                arrayList.set(this.s, (String) obj);
                ((oi9) this.u).setItems(arrayList);
                break;
            case 2:
                sr5 sr5Var3 = (sr5) obj;
                cpi cpiVar = (cpi) this.u;
                xmn xmnVar = (xmn) this.t;
                int i3 = xmnVar.e;
                int i4 = this.s;
                if (i3 == i4 && Intrinsics.d(cpiVar, xmnVar.f) && (sr5Var3 instanceof wr5)) {
                    long[] jArr3 = cpiVar.a;
                    int length2 = jArr3.length - 2;
                    if (length2 >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr3[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length2)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((255 & j) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        Object obj2 = cpiVar.b[i9];
                                        boolean z = cpiVar.c[i9] != i4;
                                        if (z) {
                                            i = i6;
                                            wr5 wr5Var = (wr5) sr5Var3;
                                            sr5Var2 = sr5Var3;
                                            tpi tpiVar = wr5Var.g;
                                            ldg.D(tpiVar, obj2, xmnVar);
                                            jArr2 = jArr3;
                                            if (obj2 instanceof zx7) {
                                                zx7 zx7Var = (zx7) obj2;
                                                if (!tpiVar.c(zx7Var)) {
                                                    ldg.E(wr5Var.j, zx7Var);
                                                }
                                                tpi tpiVar2 = xmnVar.g;
                                                if (tpiVar2 != null) {
                                                    tpiVar2.k(obj2);
                                                }
                                            }
                                        } else {
                                            sr5Var2 = sr5Var3;
                                            jArr2 = jArr3;
                                            i = i6;
                                        }
                                        if (z) {
                                            cpiVar.h(i9);
                                        }
                                    } else {
                                        sr5Var2 = sr5Var3;
                                        jArr2 = jArr3;
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                    sr5Var3 = sr5Var2;
                                    jArr3 = jArr2;
                                }
                                sr5Var = sr5Var3;
                                jArr = jArr3;
                                if (i7 != i6) {
                                }
                            } else {
                                sr5Var = sr5Var3;
                                jArr = jArr3;
                            }
                            if (i5 != length2) {
                                i5++;
                                sr5Var3 = sr5Var;
                                jArr3 = jArr;
                            }
                        }
                    }
                }
                break;
            default:
                jsk jskVar = (jsk) obj;
                pwo pwoVar = (pwo) this.t;
                int h = pwoVar.o.a.h();
                if (h < 0) {
                    h = 0;
                }
                int i10 = this.s;
                if (h > i10) {
                    h = i10;
                }
                int i11 = -h;
                boolean z2 = pwoVar.p;
                int i12 = z2 ? 0 : i11;
                if (!z2) {
                    i11 = 0;
                }
                coe coeVar = new coe((ksk) this.u, i12, i11, 4);
                jskVar.a = true;
                coeVar.invoke(jskVar);
                jskVar.a = false;
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vk8(Object obj, int i, Object obj2, int i2) {
        super(1);
        this.r = i2;
        this.t = obj;
        this.s = i;
        this.u = obj2;
    }
}
