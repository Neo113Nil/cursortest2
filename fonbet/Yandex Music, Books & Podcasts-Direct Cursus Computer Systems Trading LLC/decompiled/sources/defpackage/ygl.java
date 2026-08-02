package defpackage;

import com.yandex.music.shared.player.download2.DoNotRetryException;
import com.yandex.music.shared.player.download2.InternalDownloadException;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ygl extends aur implements Function2 {
    public final /* synthetic */ int j = 1;
    public int k;
    public zvs l;
    public int m;
    public int n;
    public int o;
    public Object p;
    public Object q;
    public final /* synthetic */ Object r;
    public Object s;
    public Object t;
    public Object u;
    public Serializable v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ygl(rn5 rn5Var, zvs zvsVar, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.r = rn5Var;
        this.l = zvsVar;
        this.v = arrayList;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new ygl((rn5) this.r, this.l, (ArrayList) this.v, continuation);
            default:
                ygl yglVar = new ygl(continuation, (qzs) this.q, (tf6) this.r);
                yglVar.p = obj;
                return yglVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((ygl) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((ygl) create(obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x02d1, code lost:
    
        if (r0.invoke(r27) == r3) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01d5, code lost:
    
        if (r0 == r7) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0295 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02ef A[Catch: IOException -> 0x0372, TryCatch #6 {IOException -> 0x0372, blocks: (B:95:0x020d, B:97:0x0350, B:122:0x02eb, B:124:0x02ef, B:125:0x02f5, B:128:0x02fc, B:130:0x0300, B:132:0x0304, B:133:0x032d, B:134:0x032e, B:99:0x0361, B:100:0x0371, B:157:0x035c, B:158:0x035e, B:160:0x035f, B:162:0x0360, B:164:0x0264, B:102:0x0295, B:106:0x02a8, B:109:0x02ac, B:111:0x02cb, B:119:0x02e4, B:142:0x02a4, B:152:0x0244), top: B:89:0x01eb, inners: #10, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0300 A[Catch: IOException -> 0x0372, TryCatch #6 {IOException -> 0x0372, blocks: (B:95:0x020d, B:97:0x0350, B:122:0x02eb, B:124:0x02ef, B:125:0x02f5, B:128:0x02fc, B:130:0x0300, B:132:0x0304, B:133:0x032d, B:134:0x032e, B:99:0x0361, B:100:0x0371, B:157:0x035c, B:158:0x035e, B:160:0x035f, B:162:0x0360, B:164:0x0264, B:102:0x0295, B:106:0x02a8, B:109:0x02ac, B:111:0x02cb, B:119:0x02e4, B:142:0x02a4, B:152:0x0244), top: B:89:0x01eb, inners: #10, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x032e A[Catch: IOException -> 0x0372, TryCatch #6 {IOException -> 0x0372, blocks: (B:95:0x020d, B:97:0x0350, B:122:0x02eb, B:124:0x02ef, B:125:0x02f5, B:128:0x02fc, B:130:0x0300, B:132:0x0304, B:133:0x032d, B:134:0x032e, B:99:0x0361, B:100:0x0371, B:157:0x035c, B:158:0x035e, B:160:0x035f, B:162:0x0360, B:164:0x0264, B:102:0x0295, B:106:0x02a8, B:109:0x02ac, B:111:0x02cb, B:119:0x02e4, B:142:0x02a4, B:152:0x0244), top: B:89:0x01eb, inners: #10, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0361 A[Catch: IOException -> 0x0372, TryCatch #6 {IOException -> 0x0372, blocks: (B:95:0x020d, B:97:0x0350, B:122:0x02eb, B:124:0x02ef, B:125:0x02f5, B:128:0x02fc, B:130:0x0300, B:132:0x0304, B:133:0x032d, B:134:0x032e, B:99:0x0361, B:100:0x0371, B:157:0x035c, B:158:0x035e, B:160:0x035f, B:162:0x0360, B:164:0x0264, B:102:0x0295, B:106:0x02a8, B:109:0x02ac, B:111:0x02cb, B:119:0x02e4, B:142:0x02a4, B:152:0x0244), top: B:89:0x01eb, inners: #10, #11 }] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v5, types: [boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:133:0x034b -> B:95:0x0350). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0196 -> B:14:0x019b). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        d9f d9fVar;
        int i;
        int i2;
        int i3;
        ArrayList arrayList;
        mbo mboVar;
        tao taoVar;
        rn5 rn5Var;
        int i4;
        rn5 rn5Var2;
        int i5;
        int i6;
        Exception e;
        InternalDownloadException internalDownloadException;
        Object remove;
        int i7;
        List list;
        Iterator it;
        Pair pair;
        int i8;
        gy1 gy1Var;
        int i9;
        x3n x3nVar;
        rar rarVar;
        Object obj2;
        int i10;
        int i11;
        mqs mqsVar;
        zvs zvsVar;
        int i12;
        int i13;
        int i14;
        x3n x3nVar2;
        rar rarVar2;
        int i15 = 3;
        int i16 = 1;
        int i17 = 0;
        ?? r5 = 0;
        Object obj3 = null;
        switch (this.j) {
            case 0:
                int i18 = 0;
                rn5 rn5Var3 = (rn5) this.r;
                nm6 nm6Var = nm6.a;
                int i19 = this.o;
                try {
                    if (i19 == 0) {
                        qgg.h0(obj);
                        oco ocoVar = (oco) rn5Var3.c;
                        pbo a = ((nbo) rn5Var3.d).a(maa.a);
                        zvs zvsVar2 = this.l;
                        ArrayList arrayList2 = (ArrayList) this.v;
                        d9f a2 = ern.a(InternalDownloadException.class);
                        tao taoVar2 = new tao(a, new mx7(ocoVar.a, zvsVar2, null));
                        d9fVar = a2;
                        i = 0;
                        i2 = 0;
                        i3 = 1;
                        arrayList = arrayList2;
                        mboVar = a;
                        taoVar = taoVar2;
                        rn5Var = rn5Var3;
                        if (i3 == 0) {
                        }
                    } else {
                        if (i19 == 1) {
                            int i20 = this.n;
                            int i21 = this.m;
                            int i22 = this.k;
                            tao taoVar3 = (tao) this.u;
                            d9f d9fVar2 = (f9f) this.t;
                            mbo mboVar2 = (mbo) this.s;
                            rn5Var2 = (rn5) this.q;
                            List list2 = (List) this.p;
                            try {
                                try {
                                    try {
                                        qgg.h0(obj);
                                    } catch (Exception e2) {
                                        e = e2;
                                        i5 = i20;
                                        i6 = i22;
                                        i2 = i21;
                                        taoVar = taoVar3;
                                        mboVar = mboVar2;
                                        d9fVar = d9fVar2;
                                        arrayList = list2;
                                        i4 = 0;
                                        if (e instanceof IOException) {
                                        }
                                        internalDownloadException = (InternalDownloadException) (e instanceof InternalDownloadException ? obj3 : e);
                                        if (internalDownloadException != null) {
                                        }
                                    }
                                    return Boolean.TRUE;
                                } catch (DoNotRetryException e3) {
                                    throw e3.a;
                                }
                            } catch (InterruptedException e4) {
                                throw e4;
                            } catch (RuntimeException e5) {
                                throw e5;
                            }
                        }
                        if (i19 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i23 = this.m;
                        int i24 = this.k;
                        taoVar = (tao) this.u;
                        d9f d9fVar3 = (f9f) this.t;
                        mboVar = (mbo) this.s;
                        rn5 rn5Var4 = (rn5) this.q;
                        List list3 = (List) this.p;
                        qgg.h0(obj);
                        i2 = i23;
                        i = i24;
                        rn5Var = rn5Var4;
                        arrayList = list3;
                        i4 = 0;
                        Object m = obj;
                        d9fVar = d9fVar3;
                        i18 = i4;
                        i15 = 3;
                        r5 = 0;
                        i3 = ((Boolean) m).booleanValue();
                        if (i3 == 0) {
                            ((Function1) mboVar.d).invoke((ArrayList) taoVar.e);
                            throw new fif();
                        }
                        try {
                        } catch (Exception e6) {
                            e = e6;
                            i4 = i18;
                        }
                        arrayList.getClass();
                        if (arrayList.isEmpty()) {
                            remove = r5;
                            i4 = i18;
                        } else {
                            i4 = i18;
                            try {
                            } catch (Exception e7) {
                                e = e7;
                                int i25 = i;
                                rn5Var2 = rn5Var;
                                i6 = i25;
                                obj3 = r5;
                                i5 = i3;
                                if (e instanceof IOException) {
                                }
                                internalDownloadException = (InternalDownloadException) (e instanceof InternalDownloadException ? obj3 : e);
                                if (internalDownloadException != null) {
                                }
                            }
                            remove = arrayList.remove(i4);
                        }
                        try {
                        } catch (Exception e8) {
                            e = e8;
                            int i252 = i;
                            rn5Var2 = rn5Var;
                            i6 = i252;
                            obj3 = r5;
                            i5 = i3;
                            if (e instanceof IOException) {
                                j66.h0((IOException) e);
                            }
                            internalDownloadException = (InternalDownloadException) (e instanceof InternalDownloadException ? obj3 : e);
                            if (internalDownloadException != null) {
                                if (mboVar.a) {
                                    Assertions.throwOrSkip("RetryCheckFail", new FailedAssertionException("Unexpected checked " + e + " caught, expected " + ((lm4) d9fVar).f(), e));
                                }
                                throw e;
                            }
                            this.p = arrayList;
                            this.q = rn5Var2;
                            this.s = mboVar;
                            this.t = d9fVar;
                            this.u = taoVar;
                            this.k = i6;
                            this.m = i2;
                            this.n = i5;
                            this.o = 2;
                            m = taoVar.m(internalDownloadException, e, this);
                            if (m != nm6Var) {
                                rn5 rn5Var5 = rn5Var2;
                                i = i6;
                                rn5Var = rn5Var5;
                                i18 = i4;
                                i15 = 3;
                                r5 = 0;
                                i3 = ((Boolean) m).booleanValue();
                                if (i3 == 0) {
                                }
                            }
                            return nm6Var;
                        }
                        InternalDownloadException internalDownloadException2 = (InternalDownloadException) remove;
                        try {
                        } catch (Exception e9) {
                            e = e9;
                            int i2522 = i;
                            rn5Var2 = rn5Var;
                            i6 = i2522;
                            obj3 = r5;
                            i5 = i3;
                            if (e instanceof IOException) {
                            }
                            internalDownloadException = (InternalDownloadException) (e instanceof InternalDownloadException ? obj3 : e);
                            if (internalDownloadException != null) {
                            }
                        }
                        if (internalDownloadException2 != null) {
                            throw internalDownloadException2;
                        }
                        ssg.a(i15, "PlayerPreErrorActionImpl", "call rePrepareTrack()", r5);
                        hv0 hv0Var = (hv0) rn5Var.e;
                        this.p = arrayList;
                        this.q = rn5Var;
                        this.s = mboVar;
                        this.t = d9fVar;
                        this.u = taoVar;
                        this.k = i;
                        this.m = i2;
                        this.n = i3 == true ? 1 : 0;
                        this.o = 1;
                        break;
                    }
                } catch (IOException unused) {
                    return Boolean.FALSE;
                }
            default:
                Object obj4 = this.p;
                Object obj5 = nm6.a;
                int i26 = this.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    Pair pair2 = (Pair) obj4;
                    mwk mwkVar = pair2 != null ? (mwk) pair2.a : null;
                    jzs jzsVar = mwkVar instanceof jzs ? (jzs) mwkVar : null;
                    gy1 gy1Var2 = (jzsVar == null || !jzsVar.h) ? gy1.c : gy1.e;
                    ouj.B("init() - going to prefetch ", pair2 != null ? (List) pair2.b : null, 3, "TrackPreFetchControl", null);
                    if (pair2 == null || (list = (List) pair2.b) == null) {
                        i7 = 0;
                        x3nVar = ((qzs) this.q).f;
                        this.p = null;
                        this.s = null;
                        this.t = null;
                        this.u = null;
                        this.v = null;
                        this.l = null;
                        this.m = i7;
                        this.k = 3;
                        synchronized (x3nVar) {
                        }
                    } else {
                        it = list.iterator();
                        pair = pair2;
                        i8 = 0;
                        gy1Var = gy1Var2;
                        i9 = 0;
                        if (it.hasNext()) {
                        }
                    }
                } else if (i26 == 1) {
                    int i27 = this.o;
                    int i28 = this.n;
                    int i29 = this.m;
                    zvsVar = this.l;
                    mqsVar = (mqs) this.v;
                    Iterator it2 = (Iterator) this.u;
                    gy1Var = (gy1) this.t;
                    pair = (Pair) this.s;
                    qgg.h0(obj);
                    i10 = 1;
                    i11 = 0;
                    i13 = i27;
                    i14 = i28;
                    i12 = i29;
                    it = it2;
                    zvs zvsVar3 = zvsVar;
                    mqs mqsVar2 = mqsVar;
                    gy1 gy1Var3 = gy1Var;
                    Pair pair3 = pair;
                    qzs qzsVar = (qzs) this.q;
                    x3nVar2 = qzsVar.f;
                    tf6 tf6Var = (tf6) this.r;
                    xg xgVar = new xg(qzsVar, zvsVar3, mqsVar2, gy1Var3, pair3, (Continuation) null, 21);
                    gy1Var = gy1Var3;
                    pair = pair3;
                    this.p = null;
                    this.s = pair;
                    this.t = gy1Var;
                    this.u = it;
                    this.v = null;
                    this.l = null;
                    this.m = i12;
                    this.n = i14;
                    this.o = i13;
                    this.k = 2;
                    synchronized (x3nVar2) {
                    }
                } else {
                    if (i26 != 2) {
                        if (i26 == 3) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i30 = this.n;
                    int i31 = this.m;
                    it = (Iterator) this.u;
                    gy1 gy1Var4 = (gy1) this.t;
                    Pair pair4 = (Pair) this.s;
                    qgg.h0(obj);
                    i9 = i30;
                    i8 = i31;
                    i10 = 1;
                    i11 = 0;
                    gy1Var = gy1Var4;
                    pair = pair4;
                    i17 = i11;
                    i16 = i10;
                    if (it.hasNext()) {
                        mqsVar = (mqs) it.next();
                        zvsVar = new zvs(mqsVar.a);
                        ((qzs) this.q).e.getClass();
                        xdr xdrVar = saa.a;
                        qzs qzsVar2 = (qzs) this.q;
                        mwk mwkVar2 = (mwk) pair.a;
                        this.p = null;
                        this.s = pair;
                        this.t = gy1Var;
                        this.u = it;
                        this.v = mqsVar;
                        this.l = zvsVar;
                        this.m = i8;
                        this.n = i9;
                        this.o = i17;
                        this.k = i16;
                        f7l f7lVar = qzsVar2.a;
                        i11 = i17;
                        xdr xdrVar2 = f7lVar.c;
                        xdr xdrVar3 = f7lVar.d;
                        i10 = i16;
                        pjc[] pjcVarArr = new pjc[2];
                        pjcVarArr[i11] = xdrVar2;
                        pjcVarArr[i10] = xdrVar3;
                        Object j0 = zsd.j0(new id0(zsd.u0(pjcVarArr), 2), new n6p(mwkVar2, (Continuation) r5, 14), this);
                        Object obj6 = j0;
                        if (j0 != nm6.a) {
                            obj6 = Unit.a;
                        }
                        if (obj6 != obj5) {
                            int i32 = i9;
                            i12 = i8;
                            i14 = i32;
                            i13 = i11;
                            zvs zvsVar32 = zvsVar;
                            mqs mqsVar22 = mqsVar;
                            gy1 gy1Var32 = gy1Var;
                            Pair pair32 = pair;
                            qzs qzsVar3 = (qzs) this.q;
                            x3nVar2 = qzsVar3.f;
                            tf6 tf6Var2 = (tf6) this.r;
                            xg xgVar2 = new xg(qzsVar3, zvsVar32, mqsVar22, gy1Var32, pair32, (Continuation) null, 21);
                            gy1Var = gy1Var32;
                            pair = pair32;
                            this.p = null;
                            this.s = pair;
                            this.t = gy1Var;
                            this.u = it;
                            this.v = null;
                            this.l = null;
                            this.m = i12;
                            this.n = i14;
                            this.o = i13;
                            this.k = 2;
                            synchronized (x3nVar2) {
                                try {
                                    if (((rar) x3nVar2.c) != null) {
                                        if (!Intrinsics.d((zvs) x3nVar2.b, zvsVar32)) {
                                        }
                                        rarVar2 = (rar) x3nVar2.c;
                                        rarVar2.getClass();
                                    }
                                    rar rarVar3 = (rar) x3nVar2.c;
                                    if (rarVar3 != null) {
                                        rarVar3.g(null);
                                    }
                                    x3nVar2.b = zvsVar32;
                                    x3nVar2.c = x97.y(tf6Var2, null, null, new fpq(x3nVar2, xgVar2, (Continuation) null, 26), 3);
                                    rarVar2 = (rar) x3nVar2.c;
                                    rarVar2.getClass();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            Object j02 = rarVar2.j0(this);
                            if (j02 != nm6.a) {
                                j02 = Unit.a;
                            }
                            if (j02 != obj5) {
                                int i33 = i12;
                                i9 = i14;
                                i8 = i33;
                                i17 = i11;
                                i16 = i10;
                                if (it.hasNext()) {
                                    i7 = i8;
                                    x3nVar = ((qzs) this.q).f;
                                    this.p = null;
                                    this.s = null;
                                    this.t = null;
                                    this.u = null;
                                    this.v = null;
                                    this.l = null;
                                    this.m = i7;
                                    this.k = 3;
                                    synchronized (x3nVar) {
                                        rarVar = (rar) x3nVar.c;
                                    }
                                    if (rarVar == null) {
                                        obj2 = Unit.a;
                                        break;
                                    } else {
                                        Object C = saf.C(rarVar, this);
                                        obj2 = C;
                                        if (C != nm6.a) {
                                            obj2 = Unit.a;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        return obj5;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ygl(Continuation continuation, qzs qzsVar, tf6 tf6Var) {
        super(2, continuation);
        this.q = qzsVar;
        this.r = tf6Var;
    }
}
