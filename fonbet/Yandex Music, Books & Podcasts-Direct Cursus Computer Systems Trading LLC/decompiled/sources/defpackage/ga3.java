package defpackage;

import android.net.Uri;
import com.connectsdk.device.ConnectableDevice;
import com.yandex.music.databases.main.MainDatabase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.a;

/* loaded from: classes3.dex */
public final class ga3 extends aur implements Function2 {
    public final /* synthetic */ int j = 4;
    public int k;
    public final /* synthetic */ Object l;
    public Object m;
    public Object n;
    public Object o;
    public Object p;
    public Object q;
    public Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga3(zbm zbmVar, fvf fvfVar, rbm rbmVar, jic jicVar, jx7 jx7Var, aqi aqiVar, eoe eoeVar, Continuation continuation) {
        super(2, continuation);
        float f = edo.a;
        this.o = zbmVar;
        this.p = fvfVar;
        this.q = rbmVar;
        this.r = jicVar;
        this.s = jx7Var;
        this.l = aqiVar;
        this.t = eoeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, nm6, oqi] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r6v5, types: [oqi] */
    private final Object k(Object obj) {
        qqi qqiVar;
        kqi kqiVar;
        Object obj2;
        ?? r4;
        Throwable th;
        kqi kqiVar2;
        oqi oqiVar;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        mqi mqiVar = (mqi) this.s;
        ?? r1 = nm6.a;
        int i = this.k;
        try {
            try {
                if (i == 0) {
                    qgg.h0(obj);
                    mm6 mm6Var = (mm6) this.q;
                    hqi hqiVar = (hqi) this.r;
                    CoroutineContext.Element element = mm6Var.getCoroutineContext().get(o6c.l);
                    element.getClass();
                    kqi kqiVar3 = new kqi(hqiVar, (r2f) element);
                    mqi.a(mqiVar, kqiVar3);
                    qqiVar = mqiVar.b;
                    aur aurVar = (aur) this.l;
                    this.q = kqiVar3;
                    this.m = qqiVar;
                    this.n = aurVar;
                    Object obj3 = this.t;
                    this.o = obj3;
                    this.p = mqiVar;
                    this.k = 1;
                    if (qqiVar.a(this) != r1) {
                        kqiVar = kqiVar3;
                        obj2 = obj3;
                        r4 = aurVar;
                    }
                    return r1;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mqiVar = (mqi) this.n;
                    oqiVar = (oqi) this.m;
                    kqiVar2 = (kqi) this.q;
                    try {
                        qgg.h0(obj);
                        atomicReference2 = mqiVar.a;
                        while (!atomicReference2.compareAndSet(kqiVar2, null) && atomicReference2.get() == kqiVar2) {
                        }
                        oqiVar.b(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        atomicReference = mqiVar.a;
                        while (!atomicReference.compareAndSet(kqiVar2, null) && atomicReference.get() == kqiVar2) {
                        }
                        throw th;
                    }
                }
                mqiVar = (mqi) this.p;
                obj2 = this.o;
                Function2 function2 = (Function2) this.n;
                ?? r6 = (oqi) this.m;
                kqiVar = (kqi) this.q;
                qgg.h0(obj);
                qqiVar = r6;
                r4 = function2;
                this.q = kqiVar;
                this.m = qqiVar;
                this.n = mqiVar;
                this.o = null;
                this.p = null;
                this.k = 2;
                Object invoke = r4.invoke(obj2, this);
                if (invoke != r1) {
                    oqiVar = qqiVar;
                    obj = invoke;
                    kqiVar2 = kqiVar;
                    atomicReference2 = mqiVar.a;
                    while (!atomicReference2.compareAndSet(kqiVar2, null)) {
                    }
                    oqiVar.b(null);
                    return obj;
                }
                return r1;
            } catch (Throwable th3) {
                th = th3;
                kqiVar2 = kqiVar;
                atomicReference = mqiVar.a;
                while (!atomicReference.compareAndSet(kqiVar2, null)) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            r1.b(null);
            throw th4;
        }
    }

    public static final Object l(fk0 fk0Var, ga3 ga3Var) {
        if (((Number) fk0Var.e()).floatValue() == 0.0f) {
            return Unit.a;
        }
        Object c = fk0.c(fk0Var, new Float(0.0f), null, null, ga3Var, 14);
        return c == nm6.a ? c : Unit.a;
    }

    public static final Object n(fk0 fk0Var, ga3 ga3Var) {
        if (((Number) fk0Var.e()).floatValue() == 0.0f) {
            return Unit.a;
        }
        Object c = fk0.c(fk0Var, new Float(0.0f), null, null, ga3Var, 14);
        return c == nm6.a ? c : Unit.a;
    }

    /* JADX WARN: Type inference failed for: r10v12, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.j;
        Object obj2 = this.t;
        Object obj3 = this.l;
        Object obj4 = this.s;
        switch (i) {
            case 0:
                float f = edo.a;
                return new ga3((gb3) this.o, (fvf) this.p, (va3) this.q, (jic) this.r, (jx7) obj4, (aqi) obj3, (eoe) obj2, continuation);
            case 1:
                ga3 ga3Var = new ga3((xqn) this.p, (wn5) this.q, (tqn) this.r, (b9r) obj4, (Function1) obj2, (aqi) obj3, continuation);
                ga3Var.o = obj;
                return ga3Var;
            case 2:
                ga3 ga3Var2 = new ga3((xqn) this.q, (wn5) this.r, (tqn) obj4, (Function0) obj2, (aqi) obj3, continuation);
                ga3Var2.p = obj;
                return ga3Var2;
            case 3:
                ga3 ga3Var3 = new ga3((mc4) this.p, (k3i) this.q, (ks3) this.r, (s2i) obj4, (rjc) obj3, (lg3) obj2, continuation);
                ga3Var3.o = obj;
                return ga3Var3;
            case 4:
                return new ga3((fkg) obj4, (String) obj3, (String) obj2, continuation);
            case 5:
                return new ga3((xlg) this.p, (ykf) this.q, continuation, (xlg) this.r, (String) obj4, (String) obj3, (String) obj2);
            case 6:
                return new ga3((xlg) this.p, continuation, (xlg) this.r, (String) this.q, (String) obj4, (String) obj3, (xlg) obj2);
            case 7:
                ga3 ga3Var4 = new ga3((hqi) this.r, (mqi) obj4, (Function2) obj3, this.t, continuation);
                ga3Var4.q = obj;
                return ga3Var4;
            case 8:
                float f2 = edo.a;
                return new ga3((zbm) this.o, (fvf) this.p, (rbm) this.q, (jic) this.r, (jx7) obj4, (aqi) obj3, (eoe) obj2, continuation);
            default:
                return new ga3((n3m) this.r, (String) obj4, (f7u) obj3, (c0t) obj2, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
        }
        return ((ga3) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0206, code lost:
    
        if (r2 == r5) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x033a, code lost:
    
        if (r2 == r5) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0503, code lost:
    
        if (r5 == r0) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x04eb, code lost:
    
        if (r3 == r0) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x04cf, code lost:
    
        if (r2 == r0) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x04b7, code lost:
    
        if (r2 == r0) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x08a0, code lost:
    
        if (n(r0, r25) != r5) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x07dc, code lost:
    
        if (r4.e(r0, r25) == r5) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x07e0, code lost:
    
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0808, code lost:
    
        if (r4.e(r0, r25) == r5) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
    
        if (r2 == r5) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0b80, code lost:
    
        if (r9.collect(r2, r25) == r0) goto L470;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0193, code lost:
    
        if (r2.collect(r16, r25) == r5) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x029c A[LOOP:3: B:110:0x0296->B:112:0x029c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a9 A[Catch: all -> 0x00b1, TryCatch #0 {all -> 0x00b1, blocks: (B:9:0x009f, B:11:0x00a9, B:12:0x00b3, B:14:0x00c9, B:18:0x00e3, B:19:0x00ea), top: B:8:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0384 A[LOOP:4: B:145:0x037e->B:147:0x0384, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c9 A[Catch: all -> 0x00b1, TRY_LEAVE, TryCatch #0 {all -> 0x00b1, blocks: (B:9:0x009f, B:11:0x00a9, B:12:0x00b3, B:14:0x00c9, B:18:0x00e3, B:19:0x00ea), top: B:8:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03cb A[LOOP:6: B:161:0x03c5->B:163:0x03cb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e3 A[Catch: all -> 0x00b1, TRY_ENTER, TryCatch #0 {all -> 0x00b1, blocks: (B:9:0x009f, B:11:0x00a9, B:12:0x00b3, B:14:0x00c9, B:18:0x00e3, B:19:0x00ea), top: B:8:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x064c A[Catch: Exception -> 0x0666, TryCatch #2 {Exception -> 0x0666, blocks: (B:247:0x0662, B:236:0x0635, B:241:0x0644, B:243:0x064c), top: B:246:0x0662 }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x07ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:388:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0a30  */
    /* JADX WARN: Removed duplicated region for block: B:400:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0a50  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0948  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0958  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x09bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0985  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x094d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x024b A[LOOP:1: B:90:0x0245->B:92:0x024b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0268  */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r20v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r6v35, types: [int] */
    /* JADX WARN: Type inference failed for: r6v75, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:205:0x0662 -> B:194:0x0635). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        l93 l93Var;
        List list;
        l93 l93Var2;
        Object obj2;
        yur yurVar;
        int i;
        aqi aqiVar;
        pe6 pe6Var;
        ?? r10;
        whm whmVar;
        pe6 pe6Var2;
        yur yurVar2;
        fk0 a;
        fk0 a2;
        fk0 fk0Var;
        Object obj3;
        fk0 fk0Var2;
        xur xurVar;
        int i2;
        oe6 oe6Var;
        int ordinal;
        ?? r102;
        d44 d44Var;
        fk0 a3;
        fk0 a4;
        Object obj4;
        fk0 fk0Var3;
        Exception exc;
        r2f r2fVar;
        vn4 vn4Var;
        Throwable th;
        si3 si3Var;
        r2f r2fVar2;
        vn4 vn4Var2;
        Object obj5;
        Object b;
        Object b2;
        Uri parse;
        Object b3;
        String str;
        Object b4;
        Object b5;
        Uri uri;
        String str2;
        String str3;
        Object b6;
        String str4;
        String str5;
        Uri uri2;
        String str6;
        Object b7;
        String str7;
        String str8;
        Uri uri3;
        String str9;
        Serializable d;
        cvl cvlVar;
        Object b8;
        ykf ykfVar;
        cvl cvlVar2;
        Iterator it;
        Iterator it2;
        Iterator it3;
        rrl rrlVar;
        Object c;
        rrl rrlVar2;
        Serializable d2;
        cvl cvlVar3;
        Object b9;
        cvl cvlVar4;
        Iterator it4;
        Iterator it5;
        Iterator it6;
        rrl rrlVar3;
        Object c2;
        rrl rrlVar4;
        List a5;
        vam vamVar;
        vam vamVar2;
        f7u f7uVar;
        String str10;
        qqi qqiVar;
        c0t c0tVar;
        cr crVar;
        bjt bjtVar;
        int i3 = this.j;
        int i4 = 3;
        Object obj6 = this.t;
        Object obj7 = this.l;
        Object obj8 = this.s;
        Continuation continuation = null;
        switch (i3) {
            case 0:
                fvf fvfVar = (fvf) this.p;
                nm6 nm6Var = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    List a6 = ((gb3) this.o).a(j0s.b);
                    Iterator it7 = a6.iterator();
                    while (true) {
                        if (it7.hasNext()) {
                            q93 q93Var = (q93) it7.next();
                            l93Var = q93Var instanceof l93 ? (l93) q93Var : null;
                            if (l93Var != null) {
                            }
                        } else {
                            l93Var = null;
                        }
                    }
                    if (l93Var == null) {
                        return Unit.a;
                    }
                    da3 da3Var = new da3((jic) this.r, null, 0);
                    this.m = a6;
                    this.n = l93Var;
                    this.k = 1;
                    if (fvfVar.a(hqi.a, da3Var, this) != nm6Var) {
                        l93 l93Var3 = l93Var;
                        list = a6;
                        l93Var2 = l93Var3;
                    }
                    return nm6Var;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    obj2 = null;
                    rj7.f();
                    return obj2;
                }
                l93 l93Var4 = (l93) this.n;
                List list2 = (List) this.m;
                qgg.h0(obj);
                list = list2;
                l93Var2 = l93Var4;
                dib dibVar = (dib) ((va3) this.q).a.m;
                float f = edo.a;
                fa3 fa3Var = new fa3(l93Var2, list, (jx7) obj8, fvfVar, (aqi) obj7, (eoe) obj6);
                obj2 = null;
                this.m = null;
                this.n = null;
                this.k = 2;
                break;
            case 1:
                Function1 function1 = (Function1) obj6;
                tqn tqnVar = (tqn) this.r;
                xqn xqnVar = (xqn) this.p;
                aqi aqiVar2 = (aqi) obj7;
                p14 p14Var = (p14) this.o;
                nm6 nm6Var2 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    pe6 pe6Var3 = (pe6) xqnVar.a;
                    wn5 wn5Var = (wn5) this.q;
                    p14Var.getClass();
                    Object obj9 = p14Var.c;
                    pe6Var3.getClass();
                    nnk nnkVar = pe6Var3.b;
                    nnk nnkVar2 = pe6Var3.c;
                    nnk nnkVar3 = pe6Var3.a;
                    Object obj10 = nnkVar.a;
                    Object obj11 = p14Var.a;
                    Object obj12 = p14Var.b;
                    if (Intrinsics.d(obj10, obj9)) {
                        if (Intrinsics.d(nnkVar3 != null ? nnkVar3.a : null, obj12)) {
                            yurVar = yur.b;
                            i = yurVar == null ? -1 : ne6.a[yurVar.ordinal()];
                            aqiVar = aqiVar2;
                            if (i != 1) {
                                int i7 = 2;
                                if (i != 2) {
                                    pe6Var = quj.M(wn5Var, p14Var);
                                } else {
                                    nnk nnkVar4 = obj11 != null ? new nnk(obj11, a0g.C(new wn5(new le6(wn5Var, obj11, i7), 1523166863, true))) : null;
                                    nnkVar3.getClass();
                                    pe6Var = new pe6(nnkVar4, nnkVar3, nnkVar);
                                }
                            } else {
                                nnkVar2.getClass();
                                pe6Var = new pe6(nnkVar, nnkVar2, obj9 != null ? new nnk(obj9, a0g.C(new wn5(new le6(wn5Var, obj9, 1), 309043624, true))) : null);
                            }
                            xqnVar.a = pe6Var;
                            if (((m54) aqiVar.getValue()).a.c.getValue() == whm.b || yurVar == null) {
                                aqiVar2 = aqiVar;
                                if (yurVar != null) {
                                }
                                whm whmVar2 = whm.a;
                                aqiVar2.setValue(new m54(new nvr(hvr.a, function1), pe6Var, a, a2));
                                fk0Var = ((m54) aqiVar2.getValue()).c;
                                obj3 = null;
                                this.o = null;
                                this.m = null;
                                this.n = null;
                                this.k = 3;
                                if (l(fk0Var, this) == nm6Var2) {
                                }
                                fk0Var2 = ((m54) aqiVar2.getValue()).d;
                                this.o = obj3;
                                this.m = obj3;
                                this.n = obj3;
                                this.k = 4;
                                if (l(fk0Var2, this) == nm6Var2) {
                                }
                            } else {
                                int ordinal2 = yurVar.ordinal();
                                if (ordinal2 != 0) {
                                    r10 = 1;
                                    if (ordinal2 != 1) {
                                        b6e.s();
                                        return null;
                                    }
                                    whmVar = whm.a;
                                } else {
                                    r10 = 1;
                                    whmVar = whm.c;
                                }
                                if (tqnVar.a) {
                                    aqiVar2 = aqiVar;
                                    aqiVar2.setValue(new m54(new nvr((b9r) obj8, function1), pe6Var3));
                                    nvr nvrVar = ((m54) aqiVar2.getValue()).a;
                                    this.o = null;
                                    this.m = yurVar;
                                    this.n = pe6Var;
                                    this.k = 2;
                                    if (nvr.b(nvrVar, whmVar, this) == nm6Var2) {
                                        return nm6Var2;
                                    }
                                    pe6Var2 = pe6Var;
                                    yurVar2 = yurVar;
                                    pe6Var = pe6Var2;
                                    yurVar = yurVar2;
                                    tqnVar.a = false;
                                    if (yurVar != null) {
                                    }
                                    whm whmVar22 = whm.a;
                                    aqiVar2.setValue(new m54(new nvr(hvr.a, function1), pe6Var, a, a2));
                                    fk0Var = ((m54) aqiVar2.getValue()).c;
                                    obj3 = null;
                                    this.o = null;
                                    this.m = null;
                                    this.n = null;
                                    this.k = 3;
                                    if (l(fk0Var, this) == nm6Var2) {
                                    }
                                    fk0Var2 = ((m54) aqiVar2.getValue()).d;
                                    this.o = obj3;
                                    this.m = obj3;
                                    this.n = obj3;
                                    this.k = 4;
                                    if (l(fk0Var2, this) == nm6Var2) {
                                    }
                                } else {
                                    tqnVar.a = r10;
                                    nvr nvrVar2 = ((m54) aqiVar.getValue()).a;
                                    this.o = null;
                                    this.m = yurVar;
                                    this.n = pe6Var;
                                    this.k = r10;
                                    if (nvr.b(nvrVar2, whmVar, this) == nm6Var2) {
                                        return nm6Var2;
                                    }
                                    pe6Var2 = pe6Var;
                                    yurVar2 = yurVar;
                                    aqiVar2 = aqiVar;
                                    pe6Var = pe6Var2;
                                    yurVar = yurVar2;
                                    tqnVar.a = false;
                                    if (yurVar != null) {
                                    }
                                    whm whmVar222 = whm.a;
                                    aqiVar2.setValue(new m54(new nvr(hvr.a, function1), pe6Var, a, a2));
                                    fk0Var = ((m54) aqiVar2.getValue()).c;
                                    obj3 = null;
                                    this.o = null;
                                    this.m = null;
                                    this.n = null;
                                    this.k = 3;
                                    if (l(fk0Var, this) == nm6Var2) {
                                    }
                                    fk0Var2 = ((m54) aqiVar2.getValue()).d;
                                    this.o = obj3;
                                    this.m = obj3;
                                    this.n = obj3;
                                    this.k = 4;
                                    if (l(fk0Var2, this) == nm6Var2) {
                                    }
                                }
                            }
                        }
                    }
                    if (Intrinsics.d(nnkVar.a, obj11)) {
                        if (Intrinsics.d(nnkVar2 != null ? nnkVar2.a : null, obj12)) {
                            yurVar = yur.a;
                            if (yurVar == null) {
                            }
                            aqiVar = aqiVar2;
                            if (i != 1) {
                            }
                            xqnVar.a = pe6Var;
                            if (((m54) aqiVar.getValue()).a.c.getValue() == whm.b) {
                            }
                            aqiVar2 = aqiVar;
                            if (yurVar != null) {
                            }
                            whm whmVar2222 = whm.a;
                            aqiVar2.setValue(new m54(new nvr(hvr.a, function1), pe6Var, a, a2));
                            fk0Var = ((m54) aqiVar2.getValue()).c;
                            obj3 = null;
                            this.o = null;
                            this.m = null;
                            this.n = null;
                            this.k = 3;
                            if (l(fk0Var, this) == nm6Var2) {
                            }
                            fk0Var2 = ((m54) aqiVar2.getValue()).d;
                            this.o = obj3;
                            this.m = obj3;
                            this.n = obj3;
                            this.k = 4;
                            if (l(fk0Var2, this) == nm6Var2) {
                            }
                        }
                    }
                    yurVar = null;
                    if (yurVar == null) {
                    }
                    aqiVar = aqiVar2;
                    if (i != 1) {
                    }
                    xqnVar.a = pe6Var;
                    if (((m54) aqiVar.getValue()).a.c.getValue() == whm.b) {
                    }
                    aqiVar2 = aqiVar;
                    if (yurVar != null) {
                    }
                    whm whmVar22222 = whm.a;
                    aqiVar2.setValue(new m54(new nvr(hvr.a, function1), pe6Var, a, a2));
                    fk0Var = ((m54) aqiVar2.getValue()).c;
                    obj3 = null;
                    this.o = null;
                    this.m = null;
                    this.n = null;
                    this.k = 3;
                    if (l(fk0Var, this) == nm6Var2) {
                    }
                    fk0Var2 = ((m54) aqiVar2.getValue()).d;
                    this.o = obj3;
                    this.m = obj3;
                    this.n = obj3;
                    this.k = 4;
                    if (l(fk0Var2, this) == nm6Var2) {
                    }
                } else if (i6 == 1) {
                    pe6Var2 = (pe6) this.n;
                    yurVar2 = (yur) this.m;
                    qgg.h0(obj);
                    aqiVar = aqiVar2;
                    aqiVar2 = aqiVar;
                    pe6Var = pe6Var2;
                    yurVar = yurVar2;
                    tqnVar.a = false;
                    if (yurVar != null) {
                    }
                    whm whmVar222222 = whm.a;
                    aqiVar2.setValue(new m54(new nvr(hvr.a, function1), pe6Var, a, a2));
                    fk0Var = ((m54) aqiVar2.getValue()).c;
                    obj3 = null;
                    this.o = null;
                    this.m = null;
                    this.n = null;
                    this.k = 3;
                    if (l(fk0Var, this) == nm6Var2) {
                    }
                    fk0Var2 = ((m54) aqiVar2.getValue()).d;
                    this.o = obj3;
                    this.m = obj3;
                    this.n = obj3;
                    this.k = 4;
                    if (l(fk0Var2, this) == nm6Var2) {
                    }
                } else if (i6 == 2) {
                    pe6Var2 = (pe6) this.n;
                    yurVar2 = (yur) this.m;
                    qgg.h0(obj);
                    pe6Var = pe6Var2;
                    yurVar = yurVar2;
                    tqnVar.a = false;
                    if (yurVar != null) {
                        int ordinal3 = yurVar.ordinal();
                        if (ordinal3 == 0) {
                            a = vq2.a(0.0f);
                            a2 = vq2.a(100.0f);
                        } else {
                            if (ordinal3 != 1) {
                                b6e.s();
                                return null;
                            }
                            a = vq2.a(-100.0f);
                            a2 = vq2.a(0.0f);
                        }
                    } else if (((m54) aqiVar2.getValue()).b.a == null && pe6Var.a != null) {
                        a = vq2.a(-100.0f);
                        a2 = vq2.a(0.0f);
                    } else if (((m54) aqiVar2.getValue()).b.c != null || pe6Var.c == null) {
                        a = vq2.a(0.0f);
                        a2 = vq2.a(0.0f);
                    } else {
                        a2 = vq2.a(100.0f);
                        a = vq2.a(0.0f);
                    }
                    whm whmVar2222222 = whm.a;
                    aqiVar2.setValue(new m54(new nvr(hvr.a, function1), pe6Var, a, a2));
                    fk0Var = ((m54) aqiVar2.getValue()).c;
                    obj3 = null;
                    this.o = null;
                    this.m = null;
                    this.n = null;
                    this.k = 3;
                    if (l(fk0Var, this) == nm6Var2) {
                        return nm6Var2;
                    }
                    fk0Var2 = ((m54) aqiVar2.getValue()).d;
                    this.o = obj3;
                    this.m = obj3;
                    this.n = obj3;
                    this.k = 4;
                    if (l(fk0Var2, this) == nm6Var2) {
                    }
                } else if (i6 == 3) {
                    qgg.h0(obj);
                    obj3 = null;
                    fk0Var2 = ((m54) aqiVar2.getValue()).d;
                    this.o = obj3;
                    this.m = obj3;
                    this.n = obj3;
                    this.k = 4;
                    if (l(fk0Var2, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i6 != 4) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 2:
                Function0 function0 = (Function0) obj6;
                tqn tqnVar2 = (tqn) obj8;
                xqn xqnVar2 = (xqn) this.q;
                aqi aqiVar3 = (aqi) obj7;
                o14 o14Var = (o14) this.p;
                nm6 nm6Var3 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    oe6 oe6Var2 = (oe6) xqnVar2.a;
                    wn5 wn5Var2 = (wn5) this.r;
                    o14Var.getClass();
                    Object obj13 = o14Var.c;
                    oe6Var2.getClass();
                    qne qneVar = oe6Var2.b;
                    qne qneVar2 = oe6Var2.c;
                    qne qneVar3 = oe6Var2.a;
                    Object obj14 = qneVar.b;
                    Object obj15 = o14Var.a;
                    Object obj16 = o14Var.b;
                    if (Intrinsics.d(obj14, obj13)) {
                        if (Intrinsics.d(qneVar3 != null ? qneVar3.b : null, obj16)) {
                            xurVar = xur.b;
                            i2 = xurVar == null ? -1 : me6.a[xurVar.ordinal()];
                            if (i2 == 1) {
                                qneVar2.getClass();
                                oe6Var = new oe6(qneVar, qneVar2, obj13 != null ? new qne(obj13, a0g.C(new wn5(new le6(wn5Var2, obj13, 5), -515505296, true)), false) : null);
                            } else if (i2 != 2) {
                                oe6Var = h4a.s(wn5Var2, o14Var);
                            } else {
                                qne qneVar4 = obj15 != null ? new qne(obj15, a0g.C(new wn5(new le6(wn5Var2, obj15, 6), -555590761, true)), false) : null;
                                qneVar3.getClass();
                                oe6Var = new oe6(qneVar4, qneVar3, qneVar);
                            }
                            xqnVar2.a = oe6Var;
                            if (((l54) aqiVar3.getValue()).a.a() == d44.b && xurVar != null) {
                                ordinal = xurVar.ordinal();
                                if (ordinal == 0) {
                                    r102 = 1;
                                    if (ordinal != 1) {
                                        b6e.s();
                                        return null;
                                    }
                                    d44Var = d44.a;
                                } else {
                                    r102 = 1;
                                    d44Var = d44.c;
                                }
                                if (!tqnVar2.a) {
                                    aqiVar3.setValue(new l54((ya0) function0.invoke(), oe6Var));
                                    ya0 ya0Var = ((l54) aqiVar3.getValue()).a;
                                    this.p = null;
                                    this.m = xurVar;
                                    this.n = oe6Var;
                                    this.k = 2;
                                    break;
                                } else {
                                    tqnVar2.a = r102;
                                    ya0 ya0Var2 = ((l54) aqiVar3.getValue()).a;
                                    this.p = null;
                                    this.m = xurVar;
                                    this.n = oe6Var;
                                    this.k = r102;
                                    break;
                                }
                                oe6Var = r0;
                                tqnVar2.a = false;
                            }
                        }
                    }
                    if (Intrinsics.d(qneVar.b, obj15)) {
                        if (Intrinsics.d(qneVar2 != null ? qneVar2.b : null, obj16)) {
                            xurVar = xur.a;
                            if (xurVar == null) {
                            }
                            if (i2 == 1) {
                            }
                            xqnVar2.a = oe6Var;
                            if (((l54) aqiVar3.getValue()).a.a() == d44.b) {
                                ordinal = xurVar.ordinal();
                                if (ordinal == 0) {
                                }
                                if (!tqnVar2.a) {
                                }
                                oe6Var = r0;
                                tqnVar2.a = false;
                            }
                        }
                    }
                    xurVar = null;
                    if (xurVar == null) {
                    }
                    if (i2 == 1) {
                    }
                    xqnVar2.a = oe6Var;
                    if (((l54) aqiVar3.getValue()).a.a() == d44.b) {
                    }
                } else if (i8 != 1 && i8 != 2) {
                    if (i8 == 3) {
                        fk0Var3 = (fk0) this.o;
                        qgg.h0(obj);
                        obj4 = null;
                        this.p = obj4;
                        this.m = obj4;
                        this.n = obj4;
                        this.o = obj4;
                        this.k = 4;
                        break;
                    } else {
                        if (i8 == 4) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oe6 oe6Var3 = (oe6) this.n;
                    xurVar = (xur) this.m;
                    qgg.h0(obj);
                    oe6Var = oe6Var3;
                    tqnVar2.a = false;
                }
                if (xurVar != null) {
                    int ordinal4 = xurVar.ordinal();
                    if (ordinal4 == 0) {
                        a3 = vq2.a(0.0f);
                        a4 = vq2.a(100.0f);
                    } else {
                        if (ordinal4 != 1) {
                            b6e.s();
                            return null;
                        }
                        a3 = vq2.a(-100.0f);
                        a4 = vq2.a(0.0f);
                    }
                } else if (((l54) aqiVar3.getValue()).b.a == null && oe6Var.a != null) {
                    a3 = vq2.a(-100.0f);
                    a4 = vq2.a(0.0f);
                } else if (((l54) aqiVar3.getValue()).b.c != null || oe6Var.c == null) {
                    a3 = vq2.a(0.0f);
                    a4 = vq2.a(0.0f);
                } else {
                    a4 = vq2.a(100.0f);
                    a3 = vq2.a(0.0f);
                }
                aqiVar3.setValue(new l54((ya0) function0.invoke(), oe6Var, a3, a4));
                obj4 = null;
                this.p = null;
                this.m = null;
                this.n = null;
                this.o = a4;
                this.k = 3;
                if (n(a3, this) != nm6Var3) {
                    fk0Var3 = a4;
                    this.p = obj4;
                    this.m = obj4;
                    this.n = obj4;
                    this.o = obj4;
                    this.k = 4;
                }
                return nm6Var3;
            case 3:
                k3i k3iVar = (k3i) this.q;
                nm6 nm6Var4 = nm6.a;
                ?? r6 = this.k;
                Continuation continuation2 = null;
                if (r6 != 0) {
                    try {
                    } catch (Exception e) {
                        exc = e;
                        r2fVar = null;
                        vn4Var = r6;
                        th = null;
                    }
                    if (r6 == 1) {
                        si3Var = (si3) this.n;
                        r2fVar2 = (r2f) this.m;
                        vn4 vn4Var3 = (vn4) this.o;
                        qgg.h0(obj);
                        vn4Var2 = vn4Var3;
                        th = null;
                        obj5 = obj;
                        if (!((Boolean) obj5).booleanValue()) {
                        }
                    } else {
                        if (r6 != 2) {
                            if (r6 != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Exception exc2 = (Exception) this.o;
                            qgg.h0(obj);
                            throw exc2;
                        }
                        si3Var = (si3) this.n;
                        r2fVar2 = (r2f) this.m;
                        vn4 vn4Var4 = (vn4) this.o;
                        qgg.h0(obj);
                        vn4Var2 = vn4Var4;
                        th = null;
                        try {
                            vn4Var2.d();
                            this.o = vn4Var2;
                            this.m = r2fVar2;
                            this.n = si3Var;
                            this.k = 1;
                            obj5 = si3Var.c(this);
                        } catch (Exception e2) {
                            exc = e2;
                            r2fVar = r2fVar2;
                            vn4Var = vn4Var2;
                        }
                        if (obj5 == nm6Var4) {
                            return nm6Var4;
                        }
                        if (!((Boolean) obj5).booleanValue()) {
                            Object d3 = si3Var.d();
                            this.o = vn4Var2;
                            this.m = r2fVar2;
                            this.n = si3Var;
                            this.k = 2;
                            if (((rjc) obj7).emit(d3, this) == nm6Var4) {
                                return nm6Var4;
                            }
                            vn4Var2.d();
                            this.o = vn4Var2;
                            this.m = r2fVar2;
                            this.n = si3Var;
                            this.k = 1;
                            obj5 = si3Var.c(this);
                            if (obj5 == nm6Var4) {
                            }
                            if (!((Boolean) obj5).booleanValue()) {
                                if (!r2fVar2.X()) {
                                    r2fVar2.g(n7w.c("Collection of responses completed before collection of requests", th));
                                }
                                return Unit.a;
                            }
                        }
                    }
                } else {
                    qgg.h0(obj);
                    mm6 mm6Var = (mm6) this.o;
                    vn4 g = ((mc4) this.p).g(k3iVar, (ks3) this.r);
                    g.getClass();
                    zi3 g2 = men.g(1, 6, null);
                    jtc jtcVar = new jtc(new k5(18, g));
                    co4 co4Var = new co4(g2, jtcVar);
                    s2i s2iVar = new s2i();
                    s2iVar.e((s2i) obj8);
                    g.f(co4Var, s2iVar);
                    im6 im6Var = new im6("SendMessage worker for " + k3iVar.b);
                    rc4 rc4Var = new rc4((lg3) obj6, g, jtcVar, continuation2, 3);
                    th = null;
                    r2fVar2 = x97.y(mm6Var, im6Var, null, rc4Var, 2);
                    try {
                        g.d();
                        si3Var = new si3(g2);
                        vn4Var2 = g;
                        this.o = vn4Var2;
                        this.m = r2fVar2;
                        this.n = si3Var;
                        this.k = 1;
                        obj5 = si3Var.c(this);
                        if (obj5 == nm6Var4) {
                        }
                        if (!((Boolean) obj5).booleanValue()) {
                        }
                    } catch (Exception e3) {
                        r2fVar = r2fVar2;
                        vn4Var = g;
                        exc = e3;
                    }
                }
                l8j l8jVar = l8j.c;
                rc4 rc4Var2 = new rc4(r2fVar, exc, vn4Var, th, 2);
                Exception exc3 = exc;
                this.o = exc3;
                this.m = th;
                this.n = th;
                this.k = 3;
                if (x97.V(l8jVar, rc4Var2, this) != nm6Var4) {
                    throw exc3;
                }
                return nm6Var4;
            case 4:
                String str11 = (String) obj6;
                String str12 = (String) obj7;
                fkg fkgVar = (fkg) obj8;
                nm6 nm6Var5 = nm6.a;
                switch (this.k) {
                    case 0:
                        qgg.h0(obj);
                        this.k = 1;
                        b = fkg.b(fkgVar, str12, ConnectableDevice.KEY_ID, this);
                        break;
                    case 1:
                        qgg.h0(obj);
                        b = obj;
                        if (!Intrinsics.d((String) b, str11)) {
                            return null;
                        }
                        this.m = str11;
                        this.k = 2;
                        b2 = fkg.b(fkgVar, str12, "url", this);
                        break;
                    case 2:
                        str11 = (String) this.m;
                        qgg.h0(obj);
                        b2 = obj;
                        String str13 = (String) b2;
                        if (str13 != null && (parse = Uri.parse(str13)) != null) {
                            this.m = str11;
                            this.n = parse;
                            this.k = 3;
                            b3 = fkg.b(fkgVar, str12, "title", this);
                            break;
                        } else {
                            return null;
                        }
                        break;
                    case 3:
                        parse = (Uri) this.n;
                        String str14 = (String) this.m;
                        qgg.h0(obj);
                        str11 = str14;
                        b3 = obj;
                        str = (String) b3;
                        if (str != null) {
                            this.m = str11;
                            this.n = parse;
                            this.o = str;
                            this.k = 4;
                            b4 = fkg.b(fkgVar, str12, "subtitle", this);
                            break;
                        } else {
                            return null;
                        }
                    case 4:
                        String str15 = (String) this.o;
                        Uri uri4 = (Uri) this.n;
                        String str16 = (String) this.m;
                        qgg.h0(obj);
                        str = str15;
                        parse = uri4;
                        str11 = str16;
                        b4 = obj;
                        String str17 = (String) b4;
                        if (str17 == null) {
                            return null;
                        }
                        this.m = str11;
                        this.n = parse;
                        this.o = str;
                        this.p = str17;
                        this.k = 5;
                        b5 = fkg.b(fkgVar, str12, "imageUrl", this);
                        if (b5 != nm6Var5) {
                            uri = parse;
                            str2 = str17;
                            str3 = (String) b5;
                            if (str3 != null) {
                                return null;
                            }
                            this.m = str11;
                            this.n = uri;
                            this.o = str;
                            this.p = str2;
                            this.q = str3;
                            this.k = 6;
                            b6 = fkg.b(fkgVar, str12, "videoUrl", this);
                            if (b6 != nm6Var5) {
                                String str18 = str;
                                str4 = str2;
                                str5 = str3;
                                uri2 = uri;
                                str6 = str18;
                                String str19 = (String) b6;
                                this.m = str11;
                                this.n = uri2;
                                this.o = str6;
                                this.p = str4;
                                this.q = str5;
                                this.r = str19;
                                this.k = 7;
                                b7 = fkg.b(fkgVar, str12, "backgroundColor", this);
                                if (b7 != nm6Var5) {
                                    str7 = str19;
                                    str8 = str6;
                                    uri3 = uri2;
                                    str9 = str11;
                                    return new e5d(str9, uri3, str8, str4, str5, str7, (String) b7);
                                }
                            }
                        }
                        return nm6Var5;
                    case 5:
                        str2 = (String) this.p;
                        str = (String) this.o;
                        uri = (Uri) this.n;
                        String str20 = (String) this.m;
                        qgg.h0(obj);
                        str11 = str20;
                        b5 = obj;
                        str3 = (String) b5;
                        if (str3 != null) {
                        }
                        break;
                    case 6:
                        str5 = (String) this.q;
                        str4 = (String) this.p;
                        String str21 = (String) this.o;
                        Uri uri5 = (Uri) this.n;
                        String str22 = (String) this.m;
                        qgg.h0(obj);
                        str11 = str22;
                        uri2 = uri5;
                        str6 = str21;
                        b6 = obj;
                        String str192 = (String) b6;
                        this.m = str11;
                        this.n = uri2;
                        this.o = str6;
                        this.p = str4;
                        this.q = str5;
                        this.r = str192;
                        this.k = 7;
                        b7 = fkg.b(fkgVar, str12, "backgroundColor", this);
                        if (b7 != nm6Var5) {
                        }
                        return nm6Var5;
                    case 7:
                        String str23 = (String) this.r;
                        str5 = (String) this.q;
                        str4 = (String) this.p;
                        String str24 = (String) this.o;
                        Uri uri6 = (Uri) this.n;
                        String str25 = (String) this.m;
                        qgg.h0(obj);
                        b7 = obj;
                        str7 = str23;
                        str8 = str24;
                        uri3 = uri6;
                        str9 = str25;
                        return new e5d(str9, uri3, str8, str4, str5, str7, (String) b7);
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            case 5:
                xlg xlgVar = (xlg) this.p;
                nm6 nm6Var6 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    nvl nvlVar = new nvl((String) obj7, (String) obj6);
                    this.m = null;
                    this.k = 1;
                    d = ((xlg) this.r).a.d((String) obj8, nvlVar, true, this);
                    break;
                } else {
                    if (i9 != 1) {
                        if (i9 != 2) {
                            if (i9 != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            rrl rrlVar5 = (rrl) this.n;
                            rrlVar2 = (rrl) this.m;
                            qgg.h0(obj);
                            rrlVar = rrlVar5;
                            c = obj;
                            if (((Boolean) c).booleanValue() && rrlVar.b.isEmpty()) {
                                return null;
                            }
                            return rrlVar2;
                        }
                        cvlVar = (cvl) this.o;
                        cvl cvlVar5 = (cvl) this.n;
                        ?? r62 = (Function2) this.m;
                        qgg.h0(obj);
                        ykfVar = r62;
                        cvlVar2 = cvlVar5;
                        b8 = obj;
                        List y = ((MainDatabase) b8).M().y(cvlVar, null);
                        ArrayList arrayList = new ArrayList(v75.o(y, 10));
                        it = y.iterator();
                        while (it.hasNext()) {
                            arrayList.add(q7g.T((h4m) it.next()));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            if (((Boolean) ykfVar.invoke(cvlVar, (mqs) next)).booleanValue()) {
                                arrayList2.add(next);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
                        it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(new t2m(((mqs) it3.next()).d(), null));
                        }
                        rrlVar = new rrl(cvlVar2, arrayList3, arrayList2);
                        this.m = rrlVar;
                        this.n = rrlVar;
                        this.o = null;
                        this.k = 3;
                        c = xlg.c(xlgVar, cvlVar2, this);
                        if (c != nm6Var6) {
                            rrlVar2 = rrlVar;
                            if (((Boolean) c).booleanValue()) {
                            }
                            return rrlVar2;
                        }
                        return nm6Var6;
                    }
                    qgg.h0(obj);
                    d = obj;
                }
                cvlVar = (cvl) d;
                if (cvlVar == null) {
                    return null;
                }
                ykf ykfVar2 = (ykf) this.q;
                String str26 = xlgVar.e.c().a;
                str26.getClass();
                i5h i5hVar = xlgVar.f;
                this.m = ykfVar2;
                this.n = cvlVar;
                this.o = cvlVar;
                this.k = 2;
                b8 = i5hVar.b(str26, this);
                if (b8 != nm6Var6) {
                    ykfVar = ykfVar2;
                    cvlVar2 = cvlVar;
                    List y2 = ((MainDatabase) b8).M().y(cvlVar, null);
                    ArrayList arrayList4 = new ArrayList(v75.o(y2, 10));
                    it = y2.iterator();
                    while (it.hasNext()) {
                    }
                    ArrayList arrayList22 = new ArrayList();
                    it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                    }
                    ArrayList arrayList32 = new ArrayList(v75.o(arrayList22, 10));
                    it3 = arrayList22.iterator();
                    while (it3.hasNext()) {
                    }
                    rrlVar = new rrl(cvlVar2, arrayList32, arrayList22);
                    this.m = rrlVar;
                    this.n = rrlVar;
                    this.o = null;
                    this.k = 3;
                    c = xlg.c(xlgVar, cvlVar2, this);
                    if (c != nm6Var6) {
                    }
                }
                return nm6Var6;
            case 6:
                xlg xlgVar2 = (xlg) obj6;
                xlg xlgVar3 = (xlg) this.p;
                nm6 nm6Var7 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    rtl rtlVar = ((xlg) this.r).a;
                    String str27 = (String) this.q;
                    nvl nvlVar2 = new nvl((String) obj8, (String) obj7);
                    this.m = null;
                    this.k = 1;
                    d2 = rtlVar.d(str27, nvlVar2, true, this);
                    break;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            rrl rrlVar6 = (rrl) this.n;
                            rrlVar4 = (rrl) this.m;
                            qgg.h0(obj);
                            rrlVar3 = rrlVar6;
                            c2 = obj;
                            if (((Boolean) c2).booleanValue() && rrlVar3.b.isEmpty()) {
                                return null;
                            }
                            return rrlVar4;
                        }
                        cvlVar3 = (cvl) this.o;
                        cvl cvlVar6 = (cvl) this.m;
                        qgg.h0(obj);
                        cvlVar4 = cvlVar6;
                        b9 = obj;
                        List y3 = ((MainDatabase) b9).M().y(cvlVar3, null);
                        ArrayList arrayList5 = new ArrayList(v75.o(y3, 10));
                        it4 = y3.iterator();
                        while (it4.hasNext()) {
                            arrayList5.add(q7g.T((h4m) it4.next()));
                        }
                        ArrayList arrayList6 = new ArrayList();
                        it5 = arrayList5.iterator();
                        while (it5.hasNext()) {
                            Object next2 = it5.next();
                            mqs mqsVar = (mqs) next2;
                            if (((Boolean) xlgVar2.h.invoke(cvlVar3, mqsVar)).booleanValue() && xlgVar2.g.j(mqsVar)) {
                                arrayList6.add(next2);
                            }
                        }
                        ArrayList arrayList7 = new ArrayList(v75.o(arrayList6, 10));
                        it6 = arrayList6.iterator();
                        while (it6.hasNext()) {
                            arrayList7.add(new t2m(((mqs) it6.next()).d(), null));
                        }
                        rrlVar3 = new rrl(cvlVar4, arrayList7, arrayList6);
                        this.m = rrlVar3;
                        this.n = rrlVar3;
                        this.o = null;
                        this.k = 3;
                        c2 = xlg.c(xlgVar3, cvlVar4, this);
                        if (c2 != nm6Var7) {
                            rrlVar4 = rrlVar3;
                            if (((Boolean) c2).booleanValue()) {
                            }
                            return rrlVar4;
                        }
                        return nm6Var7;
                    }
                    qgg.h0(obj);
                    d2 = obj;
                }
                cvlVar3 = (cvl) d2;
                if (cvlVar3 == null) {
                    return null;
                }
                String str28 = xlgVar3.e.c().a;
                str28.getClass();
                i5h i5hVar2 = xlgVar3.f;
                this.m = cvlVar3;
                this.n = null;
                this.o = cvlVar3;
                this.k = 2;
                b9 = i5hVar2.b(str28, this);
                if (b9 != nm6Var7) {
                    cvlVar4 = cvlVar3;
                    List y32 = ((MainDatabase) b9).M().y(cvlVar3, null);
                    ArrayList arrayList52 = new ArrayList(v75.o(y32, 10));
                    it4 = y32.iterator();
                    while (it4.hasNext()) {
                    }
                    ArrayList arrayList62 = new ArrayList();
                    it5 = arrayList52.iterator();
                    while (it5.hasNext()) {
                    }
                    ArrayList arrayList72 = new ArrayList(v75.o(arrayList62, 10));
                    it6 = arrayList62.iterator();
                    while (it6.hasNext()) {
                    }
                    rrlVar3 = new rrl(cvlVar4, arrayList72, arrayList62);
                    this.m = rrlVar3;
                    this.n = rrlVar3;
                    this.o = null;
                    this.k = 3;
                    c2 = xlg.c(xlgVar3, cvlVar4, this);
                    if (c2 != nm6Var7) {
                    }
                }
                return nm6Var7;
            case 7:
                return k(obj);
            case 8:
                fvf fvfVar2 = (fvf) this.p;
                nm6 nm6Var8 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    a5 = ((zbm) this.o).a(j0s.b);
                    Iterator it8 = a5.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            cbm cbmVar = (cbm) it8.next();
                            vamVar = cbmVar instanceof vam ? (vam) cbmVar : null;
                            if (vamVar != null) {
                            }
                        } else {
                            vamVar = null;
                        }
                    }
                    if (vamVar == null) {
                        return Unit.a;
                    }
                    da3 da3Var2 = new da3((jic) this.r, continuation, i4);
                    this.m = a5;
                    this.n = vamVar;
                    this.k = 1;
                    if (fvfVar2.a(hqi.a, da3Var2, this) != nm6Var8) {
                        vamVar2 = vamVar;
                    }
                    return nm6Var8;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    rj7.f();
                    return null;
                }
                vam vamVar3 = (vam) this.n;
                a5 = (List) this.m;
                qgg.h0(obj);
                vamVar2 = vamVar3;
                List list3 = a5;
                dib dibVar2 = (dib) ((rbm) this.q).a.m;
                float f2 = edo.a;
                fa3 fa3Var2 = new fa3(vamVar2, list3, (jx7) obj8, fvfVar2, (aqi) obj7, (eoe) obj6);
                this.m = null;
                this.n = null;
                this.k = 2;
                break;
            default:
                n3m n3mVar = (n3m) this.r;
                Object obj17 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    yks yksVar = (yks) n3mVar.c;
                    this.k = 1;
                    mu7[] mu7VarArr = (mu7[]) ((ConcurrentLinkedQueue) yksVar.d).toArray(new mu7[0]);
                    Object w = ox6.w((mu7[]) Arrays.copyOf(mu7VarArr, mu7VarArr.length), this);
                    if (w != obj17) {
                        w = Unit.a;
                        break;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        c0t c0tVar2 = (c0t) this.q;
                        f7u f7uVar2 = (f7u) this.p;
                        String str29 = (String) this.o;
                        n3m n3mVar2 = (n3m) this.n;
                        qqi qqiVar2 = (qqi) this.m;
                        qgg.h0(obj);
                        c0tVar = c0tVar2;
                        f7uVar = f7uVar2;
                        n3mVar = n3mVar2;
                        qqiVar = qqiVar2;
                        str10 = str29;
                        try {
                            bjt bjtVar2 = (bjt) n3mVar.b;
                            crVar = (cr) bjtVar2.d;
                            if (crVar != null) {
                                gld.L((tf6) crVar.f, null);
                            }
                            bjtVar2.d = null;
                            bjtVar = (bjt) n3mVar.b;
                            str10.getClass();
                            f7uVar.getClass();
                            c0tVar.getClass();
                            if (((cr) bjtVar.d) == null) {
                                throw new IllegalStateException("Previous prolongation operation is not consumed or cancelled. Consume or cancel it first");
                            }
                            xdr xdrVar = (xdr) bjtVar.b;
                            a aVar = (a) bjtVar.c;
                            aVar.getClass();
                            bjtVar.d = new cr(str10, f7uVar, xdrVar, c0tVar, bjtVar, aVar);
                            qqiVar.b(null);
                            return Unit.a;
                        } catch (Throwable th2) {
                            qqiVar.b(null);
                            throw th2;
                        }
                    }
                    qgg.h0(obj);
                }
                qqi qqiVar3 = (qqi) n3mVar.e;
                String str30 = (String) obj8;
                f7uVar = (f7u) obj7;
                c0t c0tVar3 = (c0t) obj6;
                this.m = qqiVar3;
                this.n = n3mVar;
                this.o = str30;
                this.p = f7uVar;
                this.q = c0tVar3;
                this.k = 2;
                if (qqiVar3.a(this) != obj17) {
                    str10 = str30;
                    qqiVar = qqiVar3;
                    c0tVar = c0tVar3;
                    bjt bjtVar22 = (bjt) n3mVar.b;
                    crVar = (cr) bjtVar22.d;
                    if (crVar != null) {
                    }
                    bjtVar22.d = null;
                    bjtVar = (bjt) n3mVar.b;
                    str10.getClass();
                    f7uVar.getClass();
                    c0tVar.getClass();
                    if (((cr) bjtVar.d) == null) {
                    }
                }
                return obj17;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga3(mc4 mc4Var, k3i k3iVar, ks3 ks3Var, s2i s2iVar, rjc rjcVar, lg3 lg3Var, Continuation continuation) {
        super(2, continuation);
        this.p = mc4Var;
        this.q = k3iVar;
        this.r = ks3Var;
        this.s = s2iVar;
        this.l = rjcVar;
        this.t = lg3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga3(fkg fkgVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.s = fkgVar;
        this.l = str;
        this.t = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga3(xlg xlgVar, ykf ykfVar, Continuation continuation, xlg xlgVar2, String str, String str2, String str3) {
        super(2, continuation);
        this.p = xlgVar;
        this.q = ykfVar;
        this.r = xlgVar2;
        this.s = str;
        this.l = str2;
        this.t = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga3(xlg xlgVar, Continuation continuation, xlg xlgVar2, String str, String str2, String str3, xlg xlgVar3) {
        super(2, continuation);
        this.r = xlgVar2;
        this.s = str2;
        this.l = str3;
        this.t = xlgVar3;
        this.p = xlgVar;
        this.q = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ga3(hqi hqiVar, mqi mqiVar, Function2 function2, Object obj, Continuation continuation) {
        super(2, continuation);
        this.r = hqiVar;
        this.s = mqiVar;
        this.l = (aur) function2;
        this.t = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga3(n3m n3mVar, String str, f7u f7uVar, c0t c0tVar, Continuation continuation) {
        super(2, continuation);
        this.r = n3mVar;
        this.s = str;
        this.l = f7uVar;
        this.t = c0tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga3(gb3 gb3Var, fvf fvfVar, va3 va3Var, jic jicVar, jx7 jx7Var, aqi aqiVar, eoe eoeVar, Continuation continuation) {
        super(2, continuation);
        float f = edo.a;
        this.o = gb3Var;
        this.p = fvfVar;
        this.q = va3Var;
        this.r = jicVar;
        this.s = jx7Var;
        this.l = aqiVar;
        this.t = eoeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga3(xqn xqnVar, wn5 wn5Var, tqn tqnVar, b9r b9rVar, Function1 function1, aqi aqiVar, Continuation continuation) {
        super(2, continuation);
        this.p = xqnVar;
        this.q = wn5Var;
        this.r = tqnVar;
        this.s = b9rVar;
        this.t = function1;
        this.l = aqiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga3(xqn xqnVar, wn5 wn5Var, tqn tqnVar, Function0 function0, aqi aqiVar, Continuation continuation) {
        super(2, continuation);
        this.q = xqnVar;
        this.r = wn5Var;
        this.s = tqnVar;
        this.t = function0;
        this.l = aqiVar;
    }
}
