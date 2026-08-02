package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class wia {
    public final jyr a = l18.b.b(hag.I(yx4.class), true);

    public static final List a(wia wiaVar, List[] listArr) {
        wiaVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (List list : listArr) {
            if (list == null) {
                list = c5b.a;
            }
            z75.t(arrayList, list);
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            hia hiaVar = (hia) next;
            if (hashSet.add(hiaVar.a + hiaVar.b.a.getUri())) {
                arrayList2.add(next);
            }
        }
        return CollectionsKt.q0(CollectionsKt.o0(arrayList2, new zda(5)), 20);
    }

    public static final hia b(wia wiaVar, kca kcaVar) {
        wiaVar.getClass();
        oq oqVar = kcaVar.a;
        return new hia(oqVar.b, oqVar.D, qo6.b, null, kcaVar.b);
    }

    public static final hia c(wia wiaVar, jja jjaVar) {
        wiaVar.getClass();
        mqs mqsVar = jjaVar.a;
        return new hia(mqsVar.c, mqsVar.x0, qo6.a, pd.R(mqsVar.f().a), jjaVar.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0141, code lost:
    
        if (r14 != r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int i, cg6 cg6Var) {
        pia piaVar;
        int i2;
        Object[] objArr;
        Object[] objArr2;
        int i3;
        int i4;
        Object[] objArr3;
        int i5;
        Object[] objArr4;
        Object[] objArr5;
        int i6;
        int i7;
        Object[] objArr6;
        Object[] objArr7;
        int i8;
        int i9;
        int i10;
        int i11;
        Object[] objArr8;
        Object[] objArr9;
        int i12;
        int i13;
        int i14;
        Object[] objArr10;
        Object[] objArr11;
        Object[] objArr12;
        int i15;
        Object[] objArr13;
        if (cg6Var instanceof pia) {
            piaVar = (pia) cg6Var;
            int i16 = piaVar.p;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                piaVar.p = i16 - Integer.MIN_VALUE;
                Object obj = piaVar.n;
                Object obj2 = nm6.a;
                int i17 = 4;
                Continuation continuation = null;
                switch (piaVar.p) {
                    case 0:
                        qgg.h0(obj);
                        Object[] objArr14 = new List[5];
                        piaVar.l = objArr14;
                        piaVar.m = objArr14;
                        piaVar.j = i;
                        i2 = 0;
                        piaVar.k = 0;
                        piaVar.p = 1;
                        Object Q = gld.Q(new mia(this, i, continuation, 3), piaVar);
                        if (Q != obj2) {
                            objArr = objArr14;
                            obj = Q;
                            objArr2 = objArr;
                            piaVar.l = objArr;
                            piaVar.m = objArr2;
                            piaVar.j = i;
                            piaVar.k = i2;
                            piaVar.p = 2;
                            obj = ((mu7) obj).H(piaVar);
                            if (obj != obj2) {
                                int i18 = i2;
                                i3 = i;
                                i4 = i18;
                                objArr3 = objArr2;
                                objArr3[i4] = obj;
                                piaVar.l = objArr;
                                piaVar.m = objArr;
                                piaVar.j = i3;
                                piaVar.k = 1;
                                piaVar.p = 3;
                                obj = gld.Q(new mia(this, i3, continuation, 0), piaVar);
                                if (obj != obj2) {
                                    i5 = 1;
                                    objArr4 = objArr;
                                    piaVar.l = objArr;
                                    piaVar.m = objArr4;
                                    piaVar.j = i3;
                                    piaVar.k = i5;
                                    piaVar.p = 4;
                                    obj = ((mu7) obj).H(piaVar);
                                    objArr5 = objArr4;
                                    break;
                                }
                            }
                        }
                        return obj2;
                    case 1:
                        int i19 = piaVar.k;
                        int i20 = piaVar.j;
                        Object[] objArr15 = (List[]) piaVar.m;
                        objArr = (List[]) piaVar.l;
                        qgg.h0(obj);
                        i2 = i19;
                        i = i20;
                        objArr2 = objArr15;
                        piaVar.l = objArr;
                        piaVar.m = objArr2;
                        piaVar.j = i;
                        piaVar.k = i2;
                        piaVar.p = 2;
                        obj = ((mu7) obj).H(piaVar);
                        if (obj != obj2) {
                        }
                        return obj2;
                    case 2:
                        i4 = piaVar.k;
                        i3 = piaVar.j;
                        Object[] objArr16 = (List[]) piaVar.m;
                        objArr = (List[]) piaVar.l;
                        qgg.h0(obj);
                        objArr3 = objArr16;
                        objArr3[i4] = obj;
                        piaVar.l = objArr;
                        piaVar.m = objArr;
                        piaVar.j = i3;
                        piaVar.k = 1;
                        piaVar.p = 3;
                        obj = gld.Q(new mia(this, i3, continuation, 0), piaVar);
                        if (obj != obj2) {
                        }
                        return obj2;
                    case 3:
                        i5 = piaVar.k;
                        i3 = piaVar.j;
                        Object[] objArr17 = (List[]) piaVar.m;
                        objArr = (List[]) piaVar.l;
                        qgg.h0(obj);
                        objArr4 = objArr17;
                        piaVar.l = objArr;
                        piaVar.m = objArr4;
                        piaVar.j = i3;
                        piaVar.k = i5;
                        piaVar.p = 4;
                        obj = ((mu7) obj).H(piaVar);
                        objArr5 = objArr4;
                        break;
                    case 4:
                        i5 = piaVar.k;
                        i3 = piaVar.j;
                        Object[] objArr18 = (List[]) piaVar.m;
                        objArr = (List[]) piaVar.l;
                        qgg.h0(obj);
                        objArr5 = objArr18;
                        objArr5[i5] = obj;
                        piaVar.l = objArr;
                        piaVar.m = objArr;
                        piaVar.j = i3;
                        piaVar.k = 2;
                        piaVar.p = 5;
                        obj = gld.Q(new mia(this, i3, continuation, 1), piaVar);
                        if (obj != obj2) {
                            i6 = i3;
                            i7 = 2;
                            objArr6 = objArr;
                            objArr7 = objArr6;
                            piaVar.l = objArr7;
                            piaVar.m = objArr6;
                            piaVar.j = i6;
                            piaVar.k = i7;
                            piaVar.p = 6;
                            obj = ((mu7) obj).H(piaVar);
                            if (obj != obj2) {
                                int i21 = i7;
                                i8 = i6;
                                i9 = i21;
                                objArr6[i9] = obj;
                                piaVar.l = objArr7;
                                piaVar.m = objArr7;
                                piaVar.j = i8;
                                piaVar.k = 3;
                                piaVar.p = 7;
                                obj = gld.Q(new mia(this, i8, continuation, 4), piaVar);
                                if (obj != obj2) {
                                    i10 = i8;
                                    i11 = 3;
                                    objArr8 = objArr7;
                                    objArr9 = objArr8;
                                    piaVar.l = objArr9;
                                    piaVar.m = objArr8;
                                    piaVar.j = i10;
                                    piaVar.k = i11;
                                    piaVar.p = 8;
                                    obj = ((mu7) obj).H(piaVar);
                                    if (obj != obj2) {
                                        int i22 = i11;
                                        i12 = i10;
                                        i13 = i22;
                                        objArr8[i13] = obj;
                                        piaVar.l = objArr9;
                                        piaVar.m = objArr9;
                                        piaVar.j = i12;
                                        piaVar.k = 4;
                                        piaVar.p = 9;
                                        obj = gld.Q(new mia(this, i12, continuation, 2), piaVar);
                                        if (obj != obj2) {
                                            i14 = i12;
                                            objArr10 = objArr9;
                                            objArr11 = objArr10;
                                            piaVar.l = objArr11;
                                            piaVar.m = objArr10;
                                            piaVar.j = i14;
                                            piaVar.k = i17;
                                            piaVar.p = 10;
                                            obj = ((mu7) obj).H(piaVar);
                                            if (obj != obj2) {
                                                objArr12 = objArr10;
                                                i15 = i17;
                                                objArr13 = objArr11;
                                                objArr12[i15] = obj;
                                                List h = u75.h(objArr13);
                                                ArrayList arrayList = new ArrayList();
                                                for (Object obj3 : h) {
                                                    if (!((List) obj3).isEmpty()) {
                                                        arrayList.add(obj3);
                                                    }
                                                }
                                                return new Integer(arrayList.size() + 1);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return obj2;
                    case 5:
                        int i23 = piaVar.k;
                        i6 = piaVar.j;
                        Object[] objArr19 = (List[]) piaVar.m;
                        objArr7 = (List[]) piaVar.l;
                        qgg.h0(obj);
                        objArr6 = objArr19;
                        i7 = i23;
                        piaVar.l = objArr7;
                        piaVar.m = objArr6;
                        piaVar.j = i6;
                        piaVar.k = i7;
                        piaVar.p = 6;
                        obj = ((mu7) obj).H(piaVar);
                        if (obj != obj2) {
                        }
                        return obj2;
                    case 6:
                        i9 = piaVar.k;
                        i8 = piaVar.j;
                        objArr6 = (List[]) piaVar.m;
                        objArr7 = (List[]) piaVar.l;
                        qgg.h0(obj);
                        objArr6[i9] = obj;
                        piaVar.l = objArr7;
                        piaVar.m = objArr7;
                        piaVar.j = i8;
                        piaVar.k = 3;
                        piaVar.p = 7;
                        obj = gld.Q(new mia(this, i8, continuation, 4), piaVar);
                        if (obj != obj2) {
                        }
                        return obj2;
                    case 7:
                        int i24 = piaVar.k;
                        i10 = piaVar.j;
                        Object[] objArr20 = (List[]) piaVar.m;
                        objArr9 = (List[]) piaVar.l;
                        qgg.h0(obj);
                        objArr8 = objArr20;
                        i11 = i24;
                        piaVar.l = objArr9;
                        piaVar.m = objArr8;
                        piaVar.j = i10;
                        piaVar.k = i11;
                        piaVar.p = 8;
                        obj = ((mu7) obj).H(piaVar);
                        if (obj != obj2) {
                        }
                        return obj2;
                    case 8:
                        i13 = piaVar.k;
                        i12 = piaVar.j;
                        objArr8 = (List[]) piaVar.m;
                        objArr9 = (List[]) piaVar.l;
                        qgg.h0(obj);
                        objArr8[i13] = obj;
                        piaVar.l = objArr9;
                        piaVar.m = objArr9;
                        piaVar.j = i12;
                        piaVar.k = 4;
                        piaVar.p = 9;
                        obj = gld.Q(new mia(this, i12, continuation, 2), piaVar);
                        if (obj != obj2) {
                        }
                        return obj2;
                    case 9:
                        i17 = piaVar.k;
                        i14 = piaVar.j;
                        objArr10 = (List[]) piaVar.m;
                        objArr11 = (List[]) piaVar.l;
                        qgg.h0(obj);
                        piaVar.l = objArr11;
                        piaVar.m = objArr10;
                        piaVar.j = i14;
                        piaVar.k = i17;
                        piaVar.p = 10;
                        obj = ((mu7) obj).H(piaVar);
                        if (obj != obj2) {
                        }
                        return obj2;
                    case 10:
                        i15 = piaVar.k;
                        objArr12 = (List[]) piaVar.m;
                        objArr13 = (List[]) piaVar.l;
                        qgg.h0(obj);
                        objArr12[i15] = obj;
                        List h2 = u75.h(objArr13);
                        ArrayList arrayList2 = new ArrayList();
                        while (r13.hasNext()) {
                        }
                        return new Integer(arrayList2.size() + 1);
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        piaVar = new pia(this, cg6Var);
        Object obj4 = piaVar.n;
        Object obj22 = nm6.a;
        int i172 = 4;
        Continuation continuation2 = null;
        switch (piaVar.p) {
        }
    }

    public final yx4 e() {
        return (yx4) this.a.getValue();
    }
}
