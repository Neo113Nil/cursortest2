package ae;

import ac.o;
import androidx.lifecycle.n0;
import bc.a0;
import bc.m;
import bc.n;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import m0.d2;
import m0.f2;
import m0.j;
import m0.r;
import m0.x1;
import m0.z;
import m0.z1;
import o0.h;
import pc.k;
import s.h0;
import s.p0;
import w0.t;
import w0.w;
import x4.q;
import yc.g;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f339g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f340h;

    public /* synthetic */ b(int i10, int i11, Object obj) {
        this.f339g = i11;
        this.f340h = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [oc.c, pc.k] */
    /* JADX WARN: Type inference failed for: r2v13, types: [oc.e, pc.k] */
    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        int i10;
        char c3;
        char c7;
        v0.e eVar;
        Collection a02;
        yc.f fVar = null;
        char c10 = 7;
        int i11 = 8;
        switch (this.f339g) {
            case 0:
                ((Integer) obj2).getClass();
                a0.b((String) this.f340h, (r) obj, z.y(1));
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                ((Integer) obj2).getClass();
                ee.b.a((u0.d) this.f340h, (r) obj, z.y(7));
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                q qVar = (q) this.f340h;
                ((Integer) obj).getClass();
                if (obj2 instanceof j) {
                    j jVar = (j) obj2;
                    h0 h0Var = (h0) qVar.f8349h;
                    if (h0Var == null) {
                        int i12 = p0.f6316a;
                        h0Var = new h0();
                        qVar.f8349h = h0Var;
                    }
                    h0Var.i(jVar);
                    ((o0.e) qVar.f8347f).b(jVar);
                }
                if (obj2 instanceof f2) {
                    qVar.d((f2) obj2);
                }
                if (obj2 instanceof x1) {
                    ((x1) obj2).d();
                }
                return o.f277a;
            case 3:
                d2 d2Var = (d2) this.f340h;
                Set set = (Set) obj;
                synchronized (d2Var.f4550b) {
                    try {
                        if (((z1) d2Var.f4568t.getValue()).compareTo(z1.f4850k) >= 0) {
                            h0 h0Var2 = d2Var.f4555g;
                            if (set instanceof h) {
                                h0 h0Var3 = ((h) set).f5148g;
                                Object[] objArr = h0Var3.f6275b;
                                long[] jArr = h0Var3.f6274a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i13 = 0;
                                    while (true) {
                                        long j3 = jArr[i13];
                                        int i14 = i11;
                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i15 = 8 - ((~(i13 - length)) >>> 31);
                                            int i16 = 0;
                                            while (i16 < i15) {
                                                if ((j3 & 255) < 128) {
                                                    Object obj3 = objArr[(i13 << 3) + i16];
                                                    i10 = i14;
                                                    if (!(obj3 instanceof w) || ((w) obj3).e(1)) {
                                                        h0Var2.a(obj3);
                                                    }
                                                } else {
                                                    i10 = i14;
                                                }
                                                j3 >>= i10;
                                                i16++;
                                                i14 = i10;
                                            }
                                            if (i15 != i14) {
                                            }
                                        }
                                        if (i13 != length) {
                                            i13++;
                                            i11 = i14;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj4 : set) {
                                    if (!(obj4 instanceof w) || ((w) obj4).e(1)) {
                                        h0Var2.a(obj4);
                                    }
                                }
                            }
                            fVar = d2Var.t();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (fVar != null) {
                    ((g) fVar).resumeWith(o.f277a);
                }
                return o.f277a;
            case 4:
                ad.e eVar2 = (ad.e) this.f340h;
                Set set2 = (Set) obj;
                if (!(set2 instanceof h)) {
                    Set set3 = set2;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        for (Object obj5 : set3) {
                            if ((obj5 instanceof w) && !((w) obj5).e(4)) {
                            }
                            eVar2.s(set2);
                        }
                    }
                    return o.f277a;
                }
                h0 h0Var4 = ((h) set2).f5148g;
                Object[] objArr2 = h0Var4.f6275b;
                long[] jArr2 = h0Var4.f6274a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j6 = jArr2[i17];
                        if ((((~j6) << c10) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i18 = 8 - ((~(i17 - length2)) >>> 31);
                            int i19 = 0;
                            while (i19 < i18) {
                                if ((j6 & 255) < 128) {
                                    Object obj6 = objArr2[(i17 << 3) + i19];
                                    c7 = c10;
                                    if ((obj6 instanceof w) && !((w) obj6).e(4)) {
                                    }
                                } else {
                                    c7 = c10;
                                }
                                j6 >>= 8;
                                i19++;
                                c10 = c7;
                            }
                            c3 = c10;
                            if (i18 != 8) {
                            }
                        } else {
                            c3 = c10;
                        }
                        if (i17 != length2) {
                            i17++;
                            c10 = c3;
                        }
                    }
                    eVar2.s(set2);
                }
                return o.f277a;
            case 5:
                v0.b bVar = (v0.b) obj;
                List list = (List) ((k) this.f340h).invoke(bVar, obj2);
                int size = list.size();
                for (int i20 = 0; i20 < size; i20++) {
                    Object obj7 = list.get(i20);
                    if (obj7 != null && (eVar = bVar.f7029h) != null && !eVar.c(obj7)) {
                        throw new IllegalArgumentException(("item at index " + i20 + " can't be saved: " + obj7).toString());
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            default:
                t tVar = (t) this.f340h;
                Collection collection = (Set) obj;
                AtomicReference atomicReference = tVar.f7607b;
                while (true) {
                    Object obj8 = atomicReference.get();
                    if (obj8 == null) {
                        a02 = collection;
                    } else if (obj8 instanceof Set) {
                        a02 = n.L(obj8, collection);
                    } else {
                        if (!(obj8 instanceof List)) {
                            m0.t.d("Unexpected notification");
                            throw new ac.d();
                        }
                        a02 = m.a0((Collection) obj8, i7.b.z(collection));
                    }
                    while (!atomicReference.compareAndSet(obj8, a02)) {
                        if (atomicReference.get() != obj8) {
                            break;
                        }
                    }
                    if (tVar.a()) {
                        tVar.f7606a.invoke(new n0(i11, tVar));
                    }
                    return o.f277a;
                    break;
                }
        }
        return o.f277a;
    }

    public /* synthetic */ b(int i10, Object obj) {
        this.f339g = i10;
        this.f340h = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ b(oc.e eVar) {
        this.f339g = 5;
        this.f340h = (k) eVar;
    }
}
