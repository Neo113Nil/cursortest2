package defpackage;

import android.support.v4.media.MediaBrowserCompat$MediaItem;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.a;

/* loaded from: classes3.dex */
public final class ya2 extends aur implements Function2 {
    public final /* synthetic */ int j = 2;
    public int k;
    public int l;
    public int m;
    public int n;
    public Object o;
    public Object p;
    public Object q;
    public Object r;
    public Object s;
    public Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya2(sjj[] sjjVarArr, mat matVar, r6t r6tVar, Continuation continuation) {
        super(2, continuation);
        this.r = sjjVarArr;
        this.s = matVar;
        this.t = r6tVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new ya2((za2) this.p, (String) this.t, continuation);
            case 1:
                ya2 ya2Var = new ya2((xdh) this.s, (wgk) this.t, continuation);
                ya2Var.r = obj;
                return ya2Var;
            case 2:
                return new ya2((ce5) this.r, continuation);
            default:
                return new ya2((sjj[]) this.r, (mat) this.s, (r6t) this.t, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((ya2) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((ya2) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((ya2) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((ya2) create((t9k) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
    
        if (defpackage.mat.c(r9, r8, r4, r19) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        r4 = r6;
        r6 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01ea, code lost:
    
        if (r12 != r8) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b7  */
    /* JADX WARN: Type inference failed for: r2v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v35, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x0373 -> B:99:0x0375). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x008f -> B:12:0x0090). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0134 -> B:32:0x0139). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x024e -> B:51:0x024f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x0275 -> B:60:0x0279). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x027c -> B:61:0x0280). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Collection arrayList;
        int i;
        int i2;
        Iterator it;
        int i3;
        wgk wgkVar;
        xdh xdhVar;
        tqn tqnVar;
        Object obj3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        BigDecimal bigDecimal;
        Object V;
        String str;
        int a;
        LinkedHashMap linkedHashMap;
        Iterator it2;
        int i10;
        r6t r6tVar;
        sjj[] sjjVarArr;
        int length;
        mat matVar;
        int i11;
        int i12 = 10;
        int i13 = 2;
        int i14 = 1;
        int i15 = 0;
        switch (this.j) {
            case 0:
                za2 za2Var = (za2) this.p;
                nm6 nm6Var = nm6.a;
                int i16 = this.n;
                if (i16 == 0) {
                    qgg.h0(obj);
                    ee2 ee2Var = (ee2) za2Var.i.getValue();
                    String str2 = (String) this.t;
                    ee2Var.getClass();
                    str2.getClass();
                    String Y = StringsKt.Y(str2, "wave_entity_prefix_");
                    if (Y.equals(str2) || Y.length() == 0) {
                        su4.s(2, null, "wave entity media id is corrupted", null);
                        Y = null;
                    }
                    Set set = za2Var.a.b;
                    set.getClass();
                    Iterator it3 = set.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj2 = it3.next();
                            if (Intrinsics.d(((hou) obj2).a, Y)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    hou houVar = (hou) obj2;
                    if (houVar == null) {
                        return null;
                    }
                    ArrayList arrayList2 = houVar.c;
                    arrayList = new ArrayList(v75.o(arrayList2, 10));
                    Iterator it4 = arrayList2.iterator();
                    i = 0;
                    i2 = 0;
                    it = it4;
                    i3 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i16 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i17 = this.m;
                    int i18 = this.l;
                    int i19 = this.k;
                    arrayList = (Collection) this.r;
                    it = (Iterator) this.s;
                    Collection collection = (Collection) this.q;
                    za2 za2Var2 = (za2) this.o;
                    qgg.h0(obj);
                    i = i18;
                    i3 = i19;
                    int i20 = i17;
                    za2Var = za2Var2;
                    Object c = obj;
                    arrayList.add((MediaBrowserCompat$MediaItem) c);
                    arrayList = collection;
                    i2 = i20;
                    if (it.hasNext()) {
                        zsu zsuVar = (zsu) it.next();
                        m82 e = za2Var.e();
                        this.o = za2Var;
                        Collection collection2 = arrayList;
                        this.q = collection2;
                        this.s = it;
                        this.r = collection2;
                        this.k = i3;
                        this.l = i;
                        this.m = i2;
                        this.n = 1;
                        c = e.c(null, null, zsuVar, this);
                        if (c == nm6Var) {
                            return nm6Var;
                        }
                        i20 = i2;
                        collection = arrayList;
                        arrayList.add((MediaBrowserCompat$MediaItem) c);
                        arrayList = collection;
                        i2 = i20;
                        if (it.hasNext()) {
                            return (List) arrayList;
                        }
                    }
                }
                break;
            case 1:
                xdh xdhVar2 = (xdh) this.s;
                nm6 nm6Var2 = nm6.a;
                int i21 = this.n;
                Continuation continuation = null;
                int i22 = 3;
                if (i21 == 0) {
                    qgg.h0(obj);
                    tqn tqnVar2 = new tqn();
                    wgkVar = (wgk) this.t;
                    xdhVar = xdhVar2;
                    tqnVar = tqnVar2;
                    if (i15 < i12) {
                    }
                    if (!tqnVar.a) {
                    }
                    return Boolean.valueOf(tqnVar.a);
                }
                if (i21 != 1) {
                    if (i21 != 2) {
                        if (i21 != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i6 = this.m;
                        i5 = this.l;
                        i4 = this.k;
                        wgkVar = (wgk) this.p;
                        xdhVar = (xdh) this.o;
                        tqnVar = (tqn) this.r;
                        qgg.h0(obj);
                        V = obj;
                        i9 = 1;
                        i8 = 3;
                        if (!Intrinsics.d(((sqr) V).a, BigDecimal.ZERO)) {
                            g0c g0cVar = (g0c) xdhVar.b;
                            qne E0 = gut.E0(i6 + 1);
                            x60 x60Var = (x60) g0cVar;
                            x60Var.getClass();
                            x60Var.a(E0);
                            tqnVar.a = i9;
                            if (!tqnVar.a) {
                                g0c g0cVar2 = (g0c) xdhVar2.b;
                                qne D0 = gut.D0();
                                x60 x60Var2 = (x60) g0cVar2;
                                x60Var2.getClass();
                                x60Var2.a(D0);
                            }
                            return Boolean.valueOf(tqnVar.a);
                        }
                        i7 = i9;
                        r7o r7oVar = z7o.b;
                        i14 = i7;
                        i12 = i4;
                        i22 = i8;
                        i15 = i5 + 1;
                        i13 = 2;
                        if (i15 < i12) {
                            this.r = tqnVar;
                            this.o = xdhVar;
                            this.p = wgkVar;
                            this.q = continuation;
                            this.k = i12;
                            this.l = i15;
                            this.m = i15;
                            this.n = i14;
                            if (y2x.o(1000L, this) != nm6Var2) {
                                i5 = i15;
                                i4 = i12;
                                i6 = i5;
                                Function1 function1 = (Function1) xdhVar.d;
                                this.r = tqnVar;
                                this.o = xdhVar;
                                this.p = wgkVar;
                                this.k = i4;
                                this.l = i5;
                                this.m = i6;
                                this.n = i13;
                                obj3 = function1.invoke(this);
                                break;
                            }
                            return nm6Var2;
                        }
                        if (!tqnVar.a) {
                        }
                        return Boolean.valueOf(tqnVar.a);
                    }
                    i6 = this.m;
                    i5 = this.l;
                    i4 = this.k;
                    wgkVar = (wgk) this.p;
                    xdhVar = (xdh) this.o;
                    tqnVar = (tqn) this.r;
                    qgg.h0(obj);
                    obj3 = obj;
                    z7o z7oVar = (z7o) obj3;
                    if (z7oVar == null) {
                        i7 = i14;
                        i8 = i22;
                        i14 = i7;
                        i12 = i4;
                        i22 = i8;
                        i15 = i5 + 1;
                        i13 = 2;
                        if (i15 < i12) {
                        }
                        if (!tqnVar.a) {
                        }
                        return Boolean.valueOf(tqnVar.a);
                    }
                    Object obj4 = z7oVar.a;
                    if (obj4 instanceof t7o) {
                        i7 = i14;
                        i8 = i22;
                        r7o r7oVar2 = z7o.b;
                        i14 = i7;
                        i12 = i4;
                        i22 = i8;
                        i15 = i5 + 1;
                        i13 = 2;
                        if (i15 < i12) {
                        }
                        if (!tqnVar.a) {
                        }
                        return Boolean.valueOf(tqnVar.a);
                    }
                    bm2 bm2Var = (bm2) obj4;
                    qdc qdcVar = (qdc) xdhVar.a;
                    if (wgkVar == null || (str = wgkVar.a) == null) {
                        i9 = i14;
                        bigDecimal = BigDecimal.ZERO;
                    } else {
                        i9 = i14;
                        bigDecimal = new BigDecimal(str);
                    }
                    bigDecimal.getClass();
                    String str3 = wgkVar != null ? wgkVar.b : null;
                    if (str3 == null) {
                        str3 = "";
                    }
                    bm2 bm2Var2 = new bm2(bigDecimal, str3);
                    this.r = tqnVar;
                    this.o = xdhVar;
                    this.p = wgkVar;
                    this.q = obj4;
                    this.k = i4;
                    this.l = i5;
                    this.m = i6;
                    this.n = i22;
                    i8 = i22;
                    tqn tqnVar3 = tqnVar;
                    continuation = null;
                    V = x97.V((a) qdcVar.c, new n71(bm2Var, bm2Var2, qdcVar, continuation, 13), this);
                    if (V != nm6Var2) {
                        tqnVar = tqnVar3;
                        if (!Intrinsics.d(((sqr) V).a, BigDecimal.ZERO)) {
                        }
                    }
                    return nm6Var2;
                }
                i6 = this.m;
                i5 = this.l;
                i4 = this.k;
                wgkVar = (wgk) this.p;
                xdhVar = (xdh) this.o;
                tqnVar = (tqn) this.r;
                qgg.h0(obj);
                Function1 function12 = (Function1) xdhVar.d;
                this.r = tqnVar;
                this.o = xdhVar;
                this.p = wgkVar;
                this.k = i4;
                this.l = i5;
                this.m = i6;
                this.n = i13;
                obj3 = function12.invoke(this);
                break;
            case 2:
                ce5 ce5Var = (ce5) this.r;
                nm6 nm6Var3 = nm6.a;
                int i23 = this.n;
                if (i23 == 0) {
                    ArrayList q = su4.q(obj);
                    lum lumVar = (lum) ce5Var.m;
                    w71 w71Var = new w71(q, 4);
                    lumVar.getClass();
                    lum.I((List) lumVar.b, w71Var);
                    a = tah.a(v75.o(q, 10));
                    if (a < 16) {
                        a = 16;
                    }
                    linkedHashMap = new LinkedHashMap(a);
                    it2 = q.iterator();
                    i10 = 0;
                    if (it2.hasNext()) {
                    }
                } else {
                    if (i23 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i24 = this.m;
                    a = this.l;
                    int i25 = this.k;
                    String str4 = (String) this.t;
                    Map map = (Map) this.q;
                    Iterator it5 = (Iterator) this.s;
                    Map map2 = (Map) this.p;
                    ce5 ce5Var2 = (ce5) this.o;
                    qgg.h0(obj);
                    Iterator it6 = it5;
                    LinkedHashMap linkedHashMap2 = map;
                    int i26 = i25;
                    i10 = i24;
                    ce5Var = ce5Var2;
                    LinkedHashMap linkedHashMap3 = map2;
                    Object b = obj;
                    linkedHashMap2.put(str4, b);
                    i15 = i26;
                    linkedHashMap = linkedHashMap3;
                    it2 = it6;
                    if (it2.hasNext()) {
                        wfm wfmVar = (wfm) it2.next();
                        String str5 = wfmVar.a().a;
                        l63 l63Var = (l63) ce5Var.d;
                        this.o = ce5Var;
                        LinkedHashMap linkedHashMap4 = linkedHashMap;
                        this.p = linkedHashMap4;
                        this.s = it2;
                        this.q = linkedHashMap4;
                        this.t = str5;
                        this.k = i15;
                        this.l = a;
                        this.m = i10;
                        this.n = 1;
                        b = l63Var.b(wfmVar, this);
                        if (b == nm6Var3) {
                            return nm6Var3;
                        }
                        it6 = it2;
                        linkedHashMap2 = linkedHashMap;
                        i26 = i15;
                        str4 = str5;
                        linkedHashMap3 = linkedHashMap2;
                        linkedHashMap2.put(str4, b);
                        i15 = i26;
                        linkedHashMap = linkedHashMap3;
                        it2 = it6;
                        if (it2.hasNext()) {
                            return linkedHashMap;
                        }
                    }
                }
            default:
                nm6 nm6Var4 = nm6.a;
                int i27 = this.n;
                if (i27 == 0) {
                    qgg.h0(obj);
                    sjj[] sjjVarArr2 = (sjj[]) this.r;
                    mat matVar2 = (mat) this.s;
                    r6tVar = (r6t) this.t;
                    sjjVarArr = sjjVarArr2;
                    length = sjjVarArr2.length;
                    matVar = matVar2;
                    i11 = 0;
                    if (i15 >= length) {
                    }
                } else {
                    if (i27 != 1 && i27 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    length = this.m;
                    int i28 = this.l;
                    int i29 = this.k;
                    r6tVar = (r6t) this.q;
                    matVar = (mat) this.p;
                    sjjVarArr = (sjj[]) this.o;
                    qgg.h0(obj);
                    int i30 = i29;
                    i15 = i28;
                    i11 = i30;
                    i15++;
                    if (i15 >= length) {
                        int i31 = i11 + 1;
                        int ordinal = sjjVarArr[i15].ordinal();
                        if (ordinal == 0) {
                            i11 = i31;
                            i15++;
                            if (i15 >= length) {
                                return Unit.a;
                            }
                        } else {
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    b6e.s();
                                    return null;
                                }
                                this.o = sjjVarArr;
                                this.p = matVar;
                                this.q = r6tVar;
                                this.k = i31;
                                this.l = i15;
                                this.m = length;
                                this.n = 2;
                                if (mat.d(matVar, r6tVar, i11, this) != nm6Var4) {
                                    i28 = i15;
                                    i29 = i31;
                                    int i302 = i29;
                                    i15 = i28;
                                    i11 = i302;
                                }
                                return nm6Var4;
                            }
                            this.o = sjjVarArr;
                            this.p = matVar;
                            this.q = r6tVar;
                            this.k = i31;
                            this.l = i15;
                            this.m = length;
                            this.n = 1;
                            break;
                            i15++;
                            if (i15 >= length) {
                            }
                        }
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya2(ce5 ce5Var, Continuation continuation) {
        super(2, continuation);
        this.r = ce5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya2(xdh xdhVar, wgk wgkVar, Continuation continuation) {
        super(2, continuation);
        this.s = xdhVar;
        this.t = wgkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya2(za2 za2Var, String str, Continuation continuation) {
        super(2, continuation);
        this.p = za2Var;
        this.t = str;
    }
}
