package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes4.dex */
public final class ku extends aur implements Function2 {
    public final /* synthetic */ int j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;
    public int o;
    public int p;
    public int q;
    public final /* synthetic */ Object r;
    public Object s;
    public Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ku(rjc rjcVar, pyc pycVar, Continuation continuation, Function0 function0, pjc[] pjcVarArr) {
        super(2, continuation);
        this.j = 3;
        this.l = pjcVarArr;
        this.m = function0;
        this.n = (aur) pycVar;
        this.r = rjcVar;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [aur, pyc] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new ku((mu) this.t, (LinkedHashMap) this.r, continuation, 0);
            case 1:
                return new ku((mc1) this.t, (LinkedHashMap) this.r, continuation, 1);
            case 2:
                ku kuVar = new ku((ld1) this.r, continuation, 2);
                kuVar.n = obj;
                return kuVar;
            case 3:
                pjc[] pjcVarArr = (pjc[]) this.l;
                Function0 function0 = (Function0) this.m;
                ku kuVar2 = new ku((rjc) this.r, (aur) this.n, continuation, function0, pjcVarArr);
                kuVar2.t = obj;
                return kuVar2;
            case 4:
                ku kuVar3 = new ku((c7a) this.r, continuation, 4);
                kuVar3.n = obj;
                return kuVar3;
            case 5:
                return new ku((bwl) this.t, (LinkedHashMap) this.r, continuation, 5);
            case 6:
                return new ku((kxs) this.t, (LinkedHashMap) this.r, continuation, 6);
            default:
                return new ku((c5u) this.t, (LinkedHashMap) this.r, continuation, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
        }
        return ((ku) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x042d, code lost:
    
        if (r1.emit((java.util.List) r6, r25) == r10) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x043f, code lost:
    
        if (r1.emit(r2, r25) == r10) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0299, code lost:
    
        if (r5 == r10) goto L153;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x052d A[LOOP:3: B:190:0x052d->B:208:?, LOOP_START, PHI: r4 r10
      0x052d: PHI (r4v24 int) = (r4v23 int), (r4v25 int) binds: [B:187:0x0528, B:208:?] A[DONT_GENERATE, DONT_INLINE]
      0x052d: PHI (r10v18 kotlin.collections.IndexedValue) = (r10v17 kotlin.collections.IndexedValue), (r10v31 kotlin.collections.IndexedValue) binds: [B:187:0x0528, B:208:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0321  */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v44, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v56 */
    /* JADX WARN: Type inference failed for: r15v57 */
    /* JADX WARN: Type inference failed for: r15v58 */
    /* JADX WARN: Type inference failed for: r15v59 */
    /* JADX WARN: Type inference failed for: r15v60 */
    /* JADX WARN: Type inference failed for: r15v61 */
    /* JADX WARN: Type inference failed for: r15v62 */
    /* JADX WARN: Type inference failed for: r15v63 */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.io.Serializable, pjc[]] */
    /* JADX WARN: Type inference failed for: r2v48, types: [int] */
    /* JADX WARN: Type inference failed for: r2v50, types: [int] */
    /* JADX WARN: Type inference failed for: r2v52, types: [int] */
    /* JADX WARN: Type inference failed for: r3v22, types: [aur, pyc] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v66, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v73, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v80, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34, types: [kotlin.coroutines.CoroutineContext, pm6] */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:180:0x056e -> B:159:0x0595). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:183:0x0590 -> B:159:0x0595). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:184:0x0593 -> B:159:0x0595). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:211:0x06a6 -> B:201:0x06aa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x03d5 -> B:67:0x03d8). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        xdr xdrVar;
        HashMap hashMap;
        int i;
        Object f;
        HashMap hashMap2;
        int i2;
        bqi bqiVar;
        Map map;
        xdr xdrVar2;
        HashMap hashMap3;
        Object f2;
        HashMap hashMap4;
        int i3;
        int i4;
        bqi bqiVar2;
        Map map2;
        Collection arrayList;
        Iterator it;
        ld1 ld1Var;
        int i5;
        int i6;
        bs1 yr1Var;
        int length;
        Object[] objArr;
        byte[] bArr;
        lc4 lc4Var;
        int i7;
        byte b;
        Object obj2;
        Object[] objArr2;
        byte b2;
        IndexedValue indexedValue;
        Object e;
        Object a;
        Collection arrayList2;
        Iterator it2;
        int i8;
        int i9;
        ?? r15;
        qo6 qo6Var;
        CoverPath coverPath;
        xdr xdrVar3;
        HashMap hashMap5;
        Object f3;
        int i10;
        int i11;
        HashMap hashMap6;
        bqi bqiVar3;
        Map map3;
        xdr xdrVar4;
        HashMap hashMap7;
        Object f4;
        int i12;
        int i13;
        HashMap hashMap8;
        bqi bqiVar4;
        Map map4;
        xdr xdrVar5;
        HashMap hashMap9;
        Object f5;
        int i14;
        int i15;
        HashMap hashMap10;
        bqi bqiVar5;
        Map map5;
        int i16 = this.j;
        Object obj3 = this.r;
        int i17 = 2;
        CoverPath coverPath2 = null;
        switch (i16) {
            case 0:
                mu muVar = (mu) this.t;
                nm6 nm6Var = nm6.a;
                int i18 = this.q;
                if (i18 != 0) {
                    if (i18 != 1) {
                        if (i18 == 2) {
                            bqiVar = (bqi) this.n;
                            map = (Map) this.k;
                            qgg.h0(obj);
                            ((xdr) bqiVar).l(map);
                            break;
                        } else {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        int i19 = this.p;
                        int i20 = this.o;
                        xdrVar = (xdr) this.m;
                        HashMap hashMap11 = (HashMap) this.l;
                        mu muVar2 = (mu) this.s;
                        Map map6 = (Map) this.k;
                        qgg.h0(obj);
                        i = i20;
                        muVar = muVar2;
                        hashMap = map6;
                        i2 = i19;
                        hashMap2 = hashMap11;
                        f = obj;
                    }
                } else {
                    qgg.h0(obj);
                    xdrVar = muVar.g;
                    hashMap = new HashMap();
                    hashMap.putAll((LinkedHashMap) obj3);
                    frt frtVar = muVar.b;
                    this.k = hashMap;
                    this.s = muVar;
                    this.l = hashMap;
                    this.m = xdrVar;
                    i = 0;
                    this.o = 0;
                    this.p = 0;
                    this.q = 1;
                    f = frtVar.f(this);
                    if (f != nm6Var) {
                        hashMap2 = hashMap;
                        i2 = 0;
                    }
                    break;
                }
                String str = ((xxq) f).a;
                str.getClass();
                this.k = hashMap;
                this.s = null;
                this.l = null;
                this.m = null;
                this.n = xdrVar;
                this.o = i;
                this.p = i2;
                this.q = 2;
                s9f[] s9fVarArr = mu.i;
                if (muVar.h(str, hashMap2, this) != nm6Var) {
                    bqiVar = xdrVar;
                    map = hashMap;
                    ((xdr) bqiVar).l(map);
                }
            case 1:
                mc1 mc1Var = (mc1) this.t;
                nm6 nm6Var2 = nm6.a;
                int i21 = this.q;
                if (i21 != 0) {
                    if (i21 != 1) {
                        if (i21 == 2) {
                            bqiVar2 = (bqi) this.n;
                            map2 = (Map) this.k;
                            qgg.h0(obj);
                            ((xdr) bqiVar2).l(map2);
                            break;
                        } else {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        int i22 = this.p;
                        int i23 = this.o;
                        xdrVar2 = (xdr) this.m;
                        HashMap hashMap12 = (HashMap) this.l;
                        mc1 mc1Var2 = (mc1) this.s;
                        Map map7 = (Map) this.k;
                        qgg.h0(obj);
                        i3 = i23;
                        mc1Var = mc1Var2;
                        hashMap3 = map7;
                        i4 = i22;
                        hashMap4 = hashMap12;
                        f2 = obj;
                    }
                } else {
                    qgg.h0(obj);
                    xdrVar2 = mc1Var.g;
                    hashMap3 = new HashMap();
                    hashMap3.putAll((LinkedHashMap) obj3);
                    frt frtVar2 = mc1Var.b;
                    this.k = hashMap3;
                    this.s = mc1Var;
                    this.l = hashMap3;
                    this.m = xdrVar2;
                    this.o = 0;
                    this.p = 0;
                    this.q = 1;
                    f2 = frtVar2.f(this);
                    if (f2 != nm6Var2) {
                        hashMap4 = hashMap3;
                        i3 = 0;
                        i4 = 0;
                    }
                    break;
                }
                String str2 = ((xxq) f2).a;
                str2.getClass();
                this.k = hashMap3;
                this.s = null;
                this.l = null;
                this.m = null;
                this.n = xdrVar2;
                this.o = i3;
                this.p = i4;
                this.q = 2;
                s9f[] s9fVarArr2 = mc1.i;
                if (mc1Var.j(str2, hashMap4, this) != nm6Var2) {
                    bqiVar2 = xdrVar2;
                    map2 = hashMap3;
                    ((xdr) bqiVar2).l(map2);
                }
            case 2:
                ld1 ld1Var2 = (ld1) obj3;
                List list = ld1Var2.a;
                mm6 mm6Var = (mm6) this.n;
                nm6 nm6Var3 = nm6.a;
                int i24 = this.q;
                if (i24 == 0) {
                    qgg.h0(obj);
                    if (list != null) {
                        List q0 = CollectionsKt.q0(list, 2);
                        if (!(q0 instanceof Collection) || !q0.isEmpty()) {
                            Iterator it3 = q0.iterator();
                            while (it3.hasNext()) {
                                if (((String) it3.next()).length() == 0) {
                                }
                            }
                        }
                        List<String> q02 = CollectionsKt.q0(list, 2);
                        ArrayList arrayList3 = new ArrayList(v75.o(q02, 10));
                        for (String str3 : q02) {
                            pce pceVar = new pce(ld1Var2.b);
                            pceVar.c = str3;
                            arrayList3.add(pceVar.a());
                        }
                        ArrayList arrayList4 = new ArrayList(v75.o(arrayList3, 10));
                        Iterator it4 = arrayList3.iterator();
                        while (it4.hasNext()) {
                            arrayList4.add(x97.p(mm6Var, null, null, new l5(ld1Var2, (rce) it4.next(), null, 26), 3));
                        }
                        arrayList = new ArrayList(v75.o(arrayList4, 10));
                        it = arrayList4.iterator();
                        ld1Var = ld1Var2;
                        i5 = 0;
                        i6 = 0;
                        if (it.hasNext()) {
                        }
                    }
                    break;
                } else if (i24 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    int i25 = this.p;
                    int i26 = this.o;
                    arrayList = (Collection) this.m;
                    ld1 ld1Var3 = (ld1) this.l;
                    Iterator it5 = (Iterator) this.t;
                    Collection collection = (Collection) this.s;
                    ld1 ld1Var4 = (ld1) this.k;
                    qgg.h0(obj);
                    i6 = i25;
                    i5 = i26;
                    Iterator it6 = it5;
                    ld1 ld1Var5 = ld1Var3;
                    Collection collection2 = collection;
                    Object H = obj;
                    sce sceVar = (sce) H;
                    ld1Var5.getClass();
                    if (sceVar instanceof bqr) {
                        bqr bqrVar = (bqr) sceVar;
                        yr1Var = new as1(ld1.a(bqrVar.a), bqrVar);
                    } else if (!(sceVar instanceof pgb)) {
                        b6e.s();
                        break;
                    } else {
                        pgb pgbVar = (pgb) sceVar;
                        Drawable drawable = pgbVar.a;
                        yr1Var = new yr1(drawable != null ? ld1.a(drawable) : null, pgbVar);
                    }
                    arrayList.add(yr1Var);
                    arrayList = collection2;
                    ld1Var = ld1Var4;
                    it = it6;
                    if (it.hasNext()) {
                        mu7 mu7Var = (mu7) it.next();
                        this.n = null;
                        this.k = ld1Var;
                        Collection collection3 = arrayList;
                        this.s = collection3;
                        this.t = it;
                        this.l = ld1Var;
                        this.m = collection3;
                        this.o = i5;
                        this.p = i6;
                        this.q = 1;
                        H = mu7Var.H(this);
                        if (H == nm6Var3) {
                            break;
                        } else {
                            ld1Var4 = ld1Var;
                            it6 = it;
                            collection2 = arrayList;
                            ld1Var5 = ld1Var4;
                            sce sceVar2 = (sce) H;
                            ld1Var5.getClass();
                            if (sceVar2 instanceof bqr) {
                            }
                            arrayList.add(yr1Var);
                            arrayList = collection2;
                            ld1Var = ld1Var4;
                            it = it6;
                            if (it.hasNext()) {
                                List list2 = (List) arrayList;
                                bs1 bs1Var = (bs1) CollectionsKt.S(list2, 0);
                                bs1 bs1Var2 = xr1.a;
                                if (bs1Var == null) {
                                    bs1Var = bs1Var2;
                                }
                                ld1Var2.d.setValue(bs1Var);
                                bs1 bs1Var3 = (bs1) CollectionsKt.S(list2, 1);
                                if (bs1Var3 != null) {
                                    bs1Var2 = bs1Var3;
                                }
                                ld1Var2.e.setValue(bs1Var2);
                                break;
                            }
                        }
                    }
                }
                break;
            case 3:
                rjc rjcVar = (rjc) obj3;
                ?? r3 = (aur) this.n;
                nm6 nm6Var4 = nm6.a;
                int i27 = this.q;
                js3 js3Var = ugj.b;
                if (i27 == 0) {
                    qgg.h0(obj);
                    mm6 mm6Var2 = (mm6) this.t;
                    length = ((pjc[]) this.l).length;
                    if (length == 0) {
                        break;
                    } else {
                        objArr = new Object[length];
                        uz0.l(0, length, js3Var, objArr);
                        ?? r9 = 0;
                        zi3 g = men.g(length, 6, null);
                        AtomicInteger atomicInteger = new AtomicInteger(length);
                        int i28 = 0;
                        while (i28 < length) {
                            AtomicInteger atomicInteger2 = atomicInteger;
                            int i29 = i28;
                            x97.y(mm6Var2, r9, r9, new fr4((Serializable) this.l, i29, (Object) atomicInteger2, (Object) g, (Continuation) null, 1), 3);
                            i28 = i29 + 1;
                            atomicInteger = atomicInteger2;
                            r9 = 0;
                        }
                        bArr = new byte[length];
                        lc4Var = g;
                        i7 = 1;
                        b = 0;
                        byte b3 = (byte) (b + 1);
                        this.t = objArr;
                        this.k = lc4Var;
                        this.s = bArr;
                        this.o = length;
                        this.p = b3;
                        this.q = i7;
                        e = lc4Var.e(this);
                        if (e != nm6Var4) {
                        }
                    }
                } else if (i27 != 1) {
                    if (i27 == 2) {
                        ?? r2 = this.p;
                        length = this.o;
                        byte[] bArr2 = (byte[]) this.s;
                        lc4Var = (lc4) this.k;
                        objArr2 = (Object[]) this.t;
                        qgg.h0(obj);
                        b = r2;
                        bArr = bArr2;
                    } else if (i27 != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        ?? r22 = this.p;
                        length = this.o;
                        byte[] bArr3 = (byte[]) this.s;
                        lc4Var = (lc4) this.k;
                        objArr2 = (Object[]) this.t;
                        qgg.h0(obj);
                        b = r22;
                        bArr = bArr3;
                    }
                    objArr = objArr2;
                    i7 = 1;
                    byte b32 = (byte) (b + 1);
                    this.t = objArr;
                    this.k = lc4Var;
                    this.s = bArr;
                    this.o = length;
                    this.p = b32;
                    this.q = i7;
                    e = lc4Var.e(this);
                    if (e != nm6Var4) {
                        objArr2 = objArr;
                        b2 = b32;
                        obj2 = e;
                        indexedValue = (IndexedValue) gd4.b(obj2);
                        if (indexedValue != null) {
                            break;
                        } else {
                            do {
                                int i30 = indexedValue.a;
                                Object obj4 = objArr2[i30];
                                objArr2[i30] = indexedValue.b;
                                if (obj4 == js3Var) {
                                    length--;
                                }
                                if (bArr[i30] != b2) {
                                    bArr[i30] = b2;
                                    indexedValue = (IndexedValue) gd4.b(lc4Var.k());
                                }
                                if (length != 0) {
                                    b = b2;
                                } else {
                                    Object[] objArr3 = (Object[]) ((Function0) this.m).invoke();
                                    if (objArr3 == null) {
                                        this.t = objArr2;
                                        this.k = lc4Var;
                                        this.s = bArr;
                                        this.o = length;
                                        this.p = b2;
                                        this.q = 2;
                                        if (r3.invoke(rjcVar, objArr2, this) != nm6Var4) {
                                            b = b2;
                                        }
                                    } else {
                                        uz0.i(objArr2, objArr3, 0, 0, 0, 14);
                                        this.t = objArr2;
                                        this.k = lc4Var;
                                        this.s = bArr;
                                        this.o = length;
                                        this.p = b2;
                                        this.q = 3;
                                        if (r3.invoke(rjcVar, objArr3, this) != nm6Var4) {
                                            b = b2;
                                        }
                                    }
                                    byte b322 = (byte) (b + 1);
                                    this.t = objArr;
                                    this.k = lc4Var;
                                    this.s = bArr;
                                    this.o = length;
                                    this.p = b322;
                                    this.q = i7;
                                    e = lc4Var.e(this);
                                    if (e != nm6Var4) {
                                    }
                                }
                                objArr = objArr2;
                                i7 = 1;
                                byte b3222 = (byte) (b + 1);
                                this.t = objArr;
                                this.k = lc4Var;
                                this.s = bArr;
                                this.o = length;
                                this.p = b3222;
                                this.q = i7;
                                e = lc4Var.e(this);
                                if (e != nm6Var4) {
                                }
                            } while (indexedValue != null);
                            if (length != 0) {
                            }
                            objArr = objArr2;
                            i7 = 1;
                            byte b32222 = (byte) (b + 1);
                            this.t = objArr;
                            this.k = lc4Var;
                            this.s = bArr;
                            this.o = length;
                            this.p = b32222;
                            this.q = i7;
                            e = lc4Var.e(this);
                            if (e != nm6Var4) {
                            }
                        }
                    }
                    break;
                } else {
                    ?? r23 = this.p;
                    length = this.o;
                    byte[] bArr4 = (byte[]) this.s;
                    lc4Var = (lc4) this.k;
                    objArr2 = (Object[]) this.t;
                    qgg.h0(obj);
                    obj2 = ((gd4) obj).a;
                    b2 = r23;
                    bArr = bArr4;
                    indexedValue = (IndexedValue) gd4.b(obj2);
                    if (indexedValue != null) {
                    }
                }
            case 4:
                c7a c7aVar = (c7a) obj3;
                rjc rjcVar2 = (rjc) this.n;
                nm6 nm6Var5 = nm6.a;
                int i31 = this.q;
                if (i31 != 0) {
                    if (i31 != 1) {
                        if (i31 != 2) {
                            if (i31 != 3 && i31 != 4) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                qgg.h0(obj);
                                break;
                            }
                        } else {
                            i8 = this.p;
                            int i32 = this.o;
                            Collection collection4 = (Collection) this.m;
                            aab a2 = (aab) this.l;
                            it2 = (Iterator) this.t;
                            Collection collection5 = (Collection) this.s;
                            c7a c7aVar2 = (c7a) this.k;
                            qgg.h0(obj);
                            int i33 = i32;
                            c7aVar = c7aVar2;
                            Object r = obj;
                            Bitmap bitmap = (Bitmap) r;
                            ssg.a(4, "WidgetRecentlyManagerImpl", "[DomainEntitiesLoader] bitmap was loaded success = " + (bitmap == null), null);
                            collection4.add(new wnv(bitmap, new nnv(a2)));
                            i9 = i33;
                            arrayList2 = collection5;
                            i17 = 2;
                            coverPath2 = null;
                            if (it2.hasNext()) {
                                c24 c24Var = (c24) it2.next();
                                c24Var.getClass();
                                if (c24Var instanceof t14) {
                                    r15 = ((t14) c24Var).a.d;
                                } else if (c24Var instanceof u14) {
                                    r15 = ((u14) c24Var).a.b;
                                } else if (c24Var instanceof x14) {
                                    r15 = ((x14) c24Var).a.b;
                                } else if (c24Var instanceof z14) {
                                    r15 = ((z14) c24Var).a.c;
                                } else if (c24Var instanceof a24) {
                                    r15 = ((a24) c24Var).a.d;
                                } else if (c24Var instanceof v14) {
                                    r15 = ((v14) c24Var).a.a.b;
                                } else if (c24Var instanceof w14) {
                                    r15 = ((w14) c24Var).a.b;
                                } else if (c24Var instanceof y14) {
                                    r15 = ((y14) c24Var).a.a.b;
                                } else if (!(c24Var instanceof b24)) {
                                    b6e.s();
                                    break;
                                } else {
                                    r15 = coverPath2;
                                }
                                a2 = c24Var.a();
                                if (a2 instanceof lt) {
                                    qo6Var = qo6.b;
                                } else if (a2 instanceof u51) {
                                    qo6Var = qo6.d;
                                } else if (a2 instanceof eul) {
                                    qo6Var = qo6.e;
                                } else if (a2 == null) {
                                    xq0.q("case of nullable domain item, must be filtered before");
                                    break;
                                } else {
                                    b6e.s();
                                    break;
                                }
                                if (r15 != 0) {
                                    WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS;
                                    webPath$Storage.getClass();
                                    coverPath = etn.B(r15, webPath$Storage);
                                } else {
                                    coverPath = coverPath2;
                                }
                                this.n = rjcVar2;
                                this.k = c7aVar;
                                Collection collection6 = arrayList2;
                                this.s = collection6;
                                this.t = it2;
                                this.l = a2;
                                this.m = collection6;
                                this.o = i9;
                                this.p = i8;
                                this.q = i17;
                                r = c7aVar.r(coverPath, qo6Var, this);
                                if (r != nm6Var5) {
                                    collection5 = arrayList2;
                                    i33 = i9;
                                    collection4 = collection5;
                                    Bitmap bitmap2 = (Bitmap) r;
                                    if (bitmap2 == null) {
                                    }
                                    ssg.a(4, "WidgetRecentlyManagerImpl", "[DomainEntitiesLoader] bitmap was loaded success = " + (bitmap2 == null), null);
                                    collection4.add(new wnv(bitmap2, new nnv(a2)));
                                    i9 = i33;
                                    arrayList2 = collection5;
                                    i17 = 2;
                                    coverPath2 = null;
                                    if (it2.hasNext()) {
                                        this.n = null;
                                        this.k = null;
                                        this.s = null;
                                        this.t = null;
                                        this.l = null;
                                        this.m = null;
                                        this.q = 3;
                                        break;
                                    }
                                }
                            }
                            break;
                        }
                    } else {
                        qgg.h0(obj);
                        a = obj;
                    }
                } else {
                    qgg.h0(obj);
                    j14 j14Var = c7aVar.b;
                    run runVar = c7a.d;
                    this.n = rjcVar2;
                    this.q = 1;
                    a = j14Var.a(runVar, true, this);
                    break;
                }
                rj6 rj6Var = (rj6) a;
                if (rj6Var instanceof qj6) {
                    r14 r14Var = (r14) ((qj6) rj6Var).a;
                    ssg.a(4, "WidgetRecentlyManagerImpl", "[DomainEntitiesLoader] items are collected ".concat(lag.b(r14Var.a, null, null, 63)), null);
                    ArrayList<yit> arrayList5 = r14Var.a;
                    ArrayList arrayList6 = new ArrayList();
                    for (yit yitVar : arrayList5) {
                        c7aVar.c.getClass();
                        c24 a3 = s14.a(yitVar);
                        if (a3 != null) {
                            arrayList6.add(a3);
                        }
                    }
                    ArrayList arrayList7 = new ArrayList();
                    Iterator it7 = arrayList6.iterator();
                    while (it7.hasNext()) {
                        Object next = it7.next();
                        aab a4 = ((c24) next).a();
                        if (!(a4 instanceof eul) || !((eul) a4).g) {
                            if (a4 != null) {
                                arrayList7.add(next);
                            }
                        }
                    }
                    arrayList2 = new ArrayList(v75.o(arrayList7, 10));
                    it2 = arrayList7.iterator();
                    i8 = 0;
                    i9 = 0;
                    if (it2.hasNext()) {
                    }
                } else if (rj6Var instanceof pj6) {
                    c5b c5bVar = c5b.a;
                    this.n = null;
                    this.q = 4;
                    break;
                } else {
                    b6e.s();
                    break;
                }
                break;
            case 5:
                bwl bwlVar = (bwl) this.t;
                nm6 nm6Var6 = nm6.a;
                int i34 = this.q;
                if (i34 != 0) {
                    if (i34 != 1) {
                        if (i34 == 2) {
                            bqiVar3 = (bqi) this.n;
                            map3 = (Map) this.k;
                            qgg.h0(obj);
                            ((xdr) bqiVar3).l(map3);
                            break;
                        } else {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        int i35 = this.p;
                        int i36 = this.o;
                        xdrVar3 = (xdr) this.m;
                        HashMap hashMap13 = (HashMap) this.l;
                        bwl bwlVar2 = (bwl) this.s;
                        Map map8 = (Map) this.k;
                        qgg.h0(obj);
                        i10 = i36;
                        bwlVar = bwlVar2;
                        hashMap5 = map8;
                        i11 = i35;
                        hashMap6 = hashMap13;
                        f3 = obj;
                    }
                } else {
                    qgg.h0(obj);
                    xdrVar3 = bwlVar.g;
                    hashMap5 = new HashMap();
                    hashMap5.putAll((LinkedHashMap) obj3);
                    frt frtVar3 = bwlVar.b;
                    this.k = hashMap5;
                    this.s = bwlVar;
                    this.l = hashMap5;
                    this.m = xdrVar3;
                    this.o = 0;
                    this.p = 0;
                    this.q = 1;
                    f3 = frtVar3.f(this);
                    if (f3 != nm6Var6) {
                        i10 = 0;
                        i11 = 0;
                        hashMap6 = hashMap5;
                    }
                    break;
                }
                String str4 = ((xxq) f3).a;
                str4.getClass();
                this.k = hashMap5;
                this.s = null;
                this.l = null;
                this.m = null;
                this.n = xdrVar3;
                this.o = i10;
                this.p = i11;
                this.q = 2;
                s9f[] s9fVarArr3 = bwl.i;
                if (bwlVar.h(str4, hashMap6, this) != nm6Var6) {
                    bqiVar3 = xdrVar3;
                    map3 = hashMap5;
                    ((xdr) bqiVar3).l(map3);
                }
            case 6:
                kxs kxsVar = (kxs) this.t;
                nm6 nm6Var7 = nm6.a;
                int i37 = this.q;
                if (i37 != 0) {
                    if (i37 != 1) {
                        if (i37 == 2) {
                            bqiVar4 = (bqi) this.n;
                            map4 = (Map) this.k;
                            qgg.h0(obj);
                            ((xdr) bqiVar4).l(map4);
                            break;
                        } else {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        int i38 = this.p;
                        int i39 = this.o;
                        xdrVar4 = (xdr) this.m;
                        HashMap hashMap14 = (HashMap) this.l;
                        kxs kxsVar2 = (kxs) this.s;
                        Map map9 = (Map) this.k;
                        qgg.h0(obj);
                        i12 = i39;
                        kxsVar = kxsVar2;
                        hashMap7 = map9;
                        i13 = i38;
                        hashMap8 = hashMap14;
                        f4 = obj;
                    }
                } else {
                    qgg.h0(obj);
                    xdrVar4 = kxsVar.i;
                    hashMap7 = new HashMap();
                    for (Map.Entry entry : ((LinkedHashMap) obj3).entrySet()) {
                        hashMap7.put(((rr5) entry.getKey()).a, entry.getValue());
                    }
                    frt frtVar4 = kxsVar.b;
                    this.k = hashMap7;
                    this.s = kxsVar;
                    this.l = hashMap7;
                    this.m = xdrVar4;
                    this.o = 0;
                    this.p = 0;
                    this.q = 1;
                    f4 = frtVar4.f(this);
                    if (f4 != nm6Var7) {
                        i12 = 0;
                        i13 = 0;
                        hashMap8 = hashMap7;
                    }
                    break;
                }
                String str5 = ((xxq) f4).a;
                str5.getClass();
                this.k = hashMap7;
                this.s = null;
                this.l = null;
                this.m = null;
                this.n = xdrVar4;
                this.o = i12;
                this.p = i13;
                this.q = 2;
                s9f[] s9fVarArr4 = kxs.m;
                if (kxsVar.k(str5, hashMap8, this) != nm6Var7) {
                    bqiVar4 = xdrVar4;
                    map4 = hashMap7;
                    ((xdr) bqiVar4).l(map4);
                }
            default:
                c5u c5uVar = (c5u) this.t;
                nm6 nm6Var8 = nm6.a;
                int i40 = this.q;
                if (i40 != 0) {
                    if (i40 != 1) {
                        if (i40 == 2) {
                            bqiVar5 = (bqi) this.n;
                            map5 = (Map) this.k;
                            qgg.h0(obj);
                            ((xdr) bqiVar5).l(map5);
                            break;
                        } else {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        int i41 = this.p;
                        int i42 = this.o;
                        xdrVar5 = (xdr) this.m;
                        HashMap hashMap15 = (HashMap) this.l;
                        c5u c5uVar2 = (c5u) this.s;
                        Map map10 = (Map) this.k;
                        qgg.h0(obj);
                        i14 = i42;
                        c5uVar = c5uVar2;
                        hashMap9 = map10;
                        i15 = i41;
                        hashMap10 = hashMap15;
                        f5 = obj;
                    }
                } else {
                    qgg.h0(obj);
                    xdrVar5 = c5uVar.g;
                    hashMap9 = new HashMap();
                    hashMap9.putAll((LinkedHashMap) obj3);
                    frt frtVar5 = c5uVar.b;
                    this.k = hashMap9;
                    this.s = c5uVar;
                    this.l = hashMap9;
                    this.m = xdrVar5;
                    this.o = 0;
                    this.p = 0;
                    this.q = 1;
                    f5 = frtVar5.f(this);
                    if (f5 != nm6Var8) {
                        i14 = 0;
                        i15 = 0;
                        hashMap10 = hashMap9;
                    }
                    break;
                }
                String str6 = ((xxq) f5).a;
                str6.getClass();
                this.k = hashMap9;
                this.s = null;
                this.l = null;
                this.m = null;
                this.n = xdrVar5;
                this.o = i14;
                this.p = i15;
                this.q = 2;
                s9f[] s9fVarArr5 = c5u.i;
                if (c5uVar.g(str6, hashMap10, this) != nm6Var8) {
                    bqiVar5 = xdrVar5;
                    map5 = hashMap9;
                    ((xdr) bqiVar5).l(map5);
                }
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ku(Object obj, LinkedHashMap linkedHashMap, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.t = obj;
        this.r = linkedHashMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ku(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.r = obj;
    }
}
