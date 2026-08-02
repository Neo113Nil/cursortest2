package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.connectsdk.service.DeviceService;
import com.yandex.media.ynison.service.d0;
import com.yandex.media.ynison.service.l0;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b51 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public Object o;
    public Object p;
    public Object q;
    public Object r;
    public Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b51(au7 au7Var, Continuation continuation, au7 au7Var2, List list, int i, int i2) {
        super(2, continuation);
        this.j = 1;
        this.p = au7Var;
        this.q = au7Var2;
        this.r = list;
        this.m = i;
        this.n = i2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                b51 b51Var = new b51((c51) this.s, continuation, 0);
                b51Var.r = obj;
                return b51Var;
            case 1:
                return new b51((au7) this.p, continuation, (au7) this.q, (List) this.r, this.m, this.n);
            case 2:
                return new b51((au7) this.p, continuation, (au7) this.q);
            case 3:
                b51 b51Var2 = new b51((t1f) this.s, continuation, 3);
                b51Var2.r = obj;
                return b51Var2;
            case 4:
                b51 b51Var3 = new b51((cr) this.s, continuation, 4);
                b51Var3.r = obj;
                return b51Var3;
            default:
                return new b51((ccw) this.r, (String) this.s, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((b51) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((b51) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((b51) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((b51) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((b51) create((oi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((b51) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:125|(2:127|(5:129|(2:131|(12:133|134|135|136|137|(1:139)(2:148|(1:150)(2:151|152))|140|(1:142)(1:147)|143|144|145|146)(2:157|158))(6:159|160|161|162|163|(4:165|(10:169|136|137|(0)(0)|140|(0)(0)|143|144|145|146)|167|168)(9:170|137|(0)(0)|140|(0)(0)|143|144|145|146))|154|155|156)(1:174))(4:212|(1:214)|167|168)|175|176|(1:178)(1:209)|(1:180)(3:181|182|(4:184|(3:186|(1:188)|189)|190|(1:192)(2:193|(1:195)(3:196|197|(3:199|167|168)(3:200|163|(0)(0)))))(2:201|(2:203|(1:205)(3:206|197|(0)(0)))(2:207|208)))|144|145|146) */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x04a0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x04a1, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01cf, code lost:
    
        if (r6 == r3) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x05c2 A[Catch: all -> 0x0438, TryCatch #3 {all -> 0x0438, blocks: (B:135:0x0433, B:137:0x058d, B:140:0x05b2, B:142:0x05c2, B:147:0x05c5, B:148:0x05a2, B:150:0x05a6, B:151:0x05cf, B:152:0x05d4), top: B:134:0x0433 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x05c5 A[Catch: all -> 0x0438, TRY_LEAVE, TryCatch #3 {all -> 0x0438, blocks: (B:135:0x0433, B:137:0x058d, B:140:0x05b2, B:142:0x05c2, B:147:0x05c5, B:148:0x05a2, B:150:0x05a6, B:151:0x05cf, B:152:0x05d4), top: B:134:0x0433 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x05a2 A[Catch: all -> 0x0438, TryCatch #3 {all -> 0x0438, blocks: (B:135:0x0433, B:137:0x058d, B:140:0x05b2, B:142:0x05c2, B:147:0x05c5, B:148:0x05a2, B:150:0x05a6, B:151:0x05cf, B:152:0x05d4), top: B:134:0x0433 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x056d A[Catch: all -> 0x04a0, TRY_LEAVE, TryCatch #1 {all -> 0x04a0, blocks: (B:163:0x0562, B:165:0x056d, B:176:0x048e, B:178:0x049d, B:180:0x04a6, B:181:0x04ab, B:184:0x04b1, B:186:0x04cd, B:189:0x04d2, B:190:0x04dd, B:192:0x04e4, B:193:0x04e7, B:195:0x0507, B:196:0x050a, B:197:0x0547, B:201:0x051d, B:203:0x0522, B:205:0x0532, B:206:0x0536, B:207:0x05d5, B:208:0x05da), top: B:175:0x048e }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0899  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0864  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x08f5  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x08db  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x025a  */
    /* JADX WARN: Type inference failed for: r10v15, types: [oqi] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v21, types: [oqi] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v26, types: [oqi] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v29, types: [oqi] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v34, types: [oqi] */
    /* JADX WARN: Type inference failed for: r5v11, types: [oqi] */
    /* JADX WARN: Type inference failed for: r5v4, types: [xdr] */
    /* JADX WARN: Type inference failed for: r9v59, types: [oqi] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x031c -> B:86:0x031e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:301:0x088c -> B:286:0x088e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x01f8 -> B:48:0x0200). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x025a -> B:47:0x028c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0286 -> B:47:0x028c). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        Collection collection;
        int i;
        int i2;
        ace xbeVar;
        w4k opaVar;
        qqi qqiVar;
        boolean z;
        int i3;
        nm6 nm6Var;
        ?? r2;
        o4q W;
        xvu f;
        qqi qqiVar2;
        Iterator it2;
        nm6 nm6Var2;
        int i4;
        Boolean bool;
        qqi qqiVar3;
        int i5;
        ?? r3;
        xvu xvuVar;
        fwu f2;
        ovu ovuVar;
        Object a;
        int i6;
        int i7;
        boolean booleanValue;
        qqi qqiVar4;
        qqi qqiVar5;
        fwu fwuVar;
        jzs jzsVar;
        t1f t1fVar;
        xqn xqnVar;
        vqn vqnVar;
        tqn tqnVar;
        int i8;
        int i9;
        Integer num;
        char c;
        si3 si3Var;
        si3 si3Var2;
        cr crVar;
        Object obj2;
        ki3[] ki3VarArr;
        int i10;
        int i11;
        int i12;
        Object emit;
        int i13;
        Object obj3;
        si3 si3Var3;
        ccw ccwVar;
        String str;
        int i14;
        ccw ccwVar2;
        String str2;
        int i15;
        int i16;
        int i17;
        d0 d0Var;
        x0q x0qVar;
        String str3;
        int i18 = 2;
        int i19 = 3;
        int i20 = 0;
        int i21 = 1;
        Continuation continuation = null;
        switch (this.j) {
            case 0:
                int i22 = 0;
                c51 c51Var = (c51) this.s;
                List list = c51Var.c;
                mm6 mm6Var = (mm6) this.r;
                nm6 nm6Var3 = nm6.a;
                int i23 = this.n;
                if (i23 == 0) {
                    qgg.h0(obj);
                    if (list.isEmpty()) {
                        return Unit.a;
                    }
                    List<String> list2 = list;
                    ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                    for (String str4 : list2) {
                        pce pceVar = new pce(c51Var.a);
                        pceVar.c = str4;
                        arrayList.add(pceVar.a());
                    }
                    ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(x97.p(mm6Var, null, null, new l5(c51Var, (rce) it3.next(), null, 23), 3));
                    }
                    ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
                    it = arrayList2.iterator();
                    collection = arrayList3;
                    i = 0;
                    i2 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i23 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i24 = this.m;
                    i2 = this.l;
                    int i25 = this.k;
                    collection = (Collection) this.p;
                    it = (Iterator) this.q;
                    Collection collection2 = (Collection) this.o;
                    qgg.h0(obj);
                    i22 = i24;
                    i = i25;
                    Object H = obj;
                    sce sceVar = (sce) H;
                    qo6 qo6Var = qo6.a;
                    sceVar.getClass();
                    if (sceVar instanceof bqr) {
                        Drawable drawable = ((bqr) sceVar).a;
                        if (drawable instanceof BitmapDrawable) {
                            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                            bitmap.getClass();
                            opaVar = new q33(new yg0(bitmap));
                        } else if (drawable instanceof ColorDrawable) {
                            opaVar = new w85(c3x.f(((ColorDrawable) drawable).getColor()));
                        } else {
                            Drawable mutate = drawable.mutate();
                            mutate.getClass();
                            opaVar = new opa(mutate);
                        }
                        xbeVar = new zbe(opaVar);
                    } else {
                        if (!(sceVar instanceof pgb)) {
                            b6e.s();
                            return null;
                        }
                        xbeVar = new xbe();
                    }
                    collection.add(xbeVar);
                    collection = collection2;
                    if (it.hasNext()) {
                        Object next = it.next();
                        int i26 = i22 + 1;
                        if (i22 < 0) {
                            u75.n();
                            throw null;
                        }
                        this.r = null;
                        Collection collection3 = collection;
                        this.o = collection3;
                        this.q = it;
                        this.p = collection3;
                        this.k = i;
                        this.l = i2;
                        this.m = i26;
                        this.n = 1;
                        H = ((mu7) next).H(this);
                        if (H == nm6Var3) {
                            return nm6Var3;
                        }
                        i22 = i26;
                        collection2 = collection;
                        sce sceVar2 = (sce) H;
                        qo6 qo6Var2 = qo6.a;
                        sceVar2.getClass();
                        if (sceVar2 instanceof bqr) {
                        }
                        collection.add(xbeVar);
                        collection = collection2;
                        if (it.hasNext()) {
                            c51Var.e.setValue(new z41((List) collection, c51Var.d));
                            return Unit.a;
                        }
                    }
                }
            case 1:
                int i27 = this.m;
                List list3 = (List) this.r;
                au7 au7Var = (au7) this.q;
                ?? r5 = (xdr) au7Var.o;
                int i28 = this.n;
                nm6 nm6Var4 = nm6.a;
                int i29 = this.l;
                try {
                    if (i29 == 0) {
                        qgg.h0(obj);
                        qqiVar = (qqi) ((au7) this.p).m;
                        this.o = qqiVar;
                        z = false;
                        this.k = 0;
                        this.l = 1;
                        if (qqiVar.a(this) == nm6Var4) {
                            nm6Var = nm6Var4;
                            return nm6Var;
                        }
                        i3 = 0;
                    } else {
                        if (i29 != 1) {
                            if (i29 != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            f = (fwu) this.s;
                            r2 = (oqi) this.o;
                            try {
                                qgg.h0(obj);
                                qqiVar2 = r2;
                                qqiVar = qqiVar2;
                                r2 = qqiVar;
                                r5.l(f);
                                bool = Boolean.TRUE;
                                qqiVar = r2;
                                qqiVar.b(null);
                                return bool;
                            } catch (Throwable th) {
                                th = th;
                                r2.b(null);
                                throw th;
                            }
                        }
                        int i30 = this.k;
                        ?? r10 = (oqi) this.o;
                        qgg.h0(obj);
                        i3 = i30;
                        qqiVar = r10;
                        z = false;
                    }
                    ssg.a(3, "DefaultWavePlayback", "addPlayablesToPosition(queuePosition=" + ran.a(i28) + ", playables.size=" + list3.size() + ")", null);
                    Object value = r5.getValue();
                    xvu xvuVar2 = value instanceof xvu ? (xvu) value : null;
                    if (xvuVar2 == null) {
                        bool = Boolean.FALSE;
                        qqiVar.b(null);
                        return bool;
                    }
                    if (xvuVar2 instanceof fwu) {
                        W = hdg.W(((fwu) xvuVar2).b);
                    } else {
                        if (!(xvuVar2 instanceof bwu)) {
                            throw new x7j();
                        }
                        W = hdg.W(((bwu) xvuVar2).b);
                    }
                    int ordinal = W.ordinal();
                    if (ordinal == 0) {
                        z = true;
                    } else if (ordinal != 1) {
                        throw new x7j();
                    }
                    if (z) {
                        List list4 = list3;
                        ArrayList arrayList4 = new ArrayList(v75.o(list4, 10));
                        Iterator it4 = list4.iterator();
                        while (it4.hasNext()) {
                            jzs jzsVar2 = (jzs) it4.next();
                            if (jzsVar2.d == null) {
                                mqs mqsVar = jzsVar2.a;
                                mqsVar.getClass();
                                nm6Var2 = nm6Var4;
                                i4 = i3;
                                it2 = it4;
                                jzsVar2 = jzs.d(jzsVar2, "user-queue-" + mqsVar.d().e() + "-" + new Date(System.currentTimeMillis()).getTime(), null, 503);
                            } else {
                                it2 = it4;
                                nm6Var2 = nm6Var4;
                                i4 = i3;
                            }
                            arrayList4.add(jzsVar2);
                            it4 = it2;
                            nm6Var4 = nm6Var2;
                            i3 = i4;
                        }
                        list3 = arrayList4;
                    }
                    nm6Var = nm6Var4;
                    int i31 = i3;
                    if (xvuVar2 instanceof bwu) {
                        eu7 d0 = leu.d0(((bwu) xvuVar2).a.a, list3, i27, i28, z);
                        if (d0.f()) {
                            f = au7Var.f(d0, ((bwu) xvuVar2).a.b, ((bwu) xvuVar2).b, false, ((bwu) xvuVar2).d);
                            v5j v5jVar = v5j.d;
                            this.o = qqiVar;
                            this.s = f;
                            this.k = i31;
                            this.l = 2;
                            if (au7.a(au7Var, xvuVar2, f, v5jVar, this) != nm6Var) {
                                qqiVar2 = qqiVar;
                                qqiVar = qqiVar2;
                            }
                            return nm6Var;
                        }
                        f = au7Var.e(d0, ((bwu) xvuVar2).a.b, ((bwu) xvuVar2).b, ((bwu) xvuVar2).d, null);
                    } else {
                        if (!(xvuVar2 instanceof fwu)) {
                            throw new x7j();
                        }
                        f = au7Var.f(leu.d0(((fwu) xvuVar2).a.a, list3, i27, i28, z), ((fwu) xvuVar2).a.b, ((fwu) xvuVar2).b, false, a3l.a);
                    }
                    r2 = qqiVar;
                    r5.l(f);
                    bool = Boolean.TRUE;
                    qqiVar = r2;
                    qqiVar.b(null);
                    return bool;
                } catch (Throwable th2) {
                    th = th2;
                    r2 = qqiVar;
                    r2.b(null);
                    throw th;
                }
            case 2:
                au7 au7Var2 = (au7) this.q;
                xdr xdrVar = (xdr) au7Var2.o;
                nm6 nm6Var5 = nm6.a;
                int i32 = this.m;
                if (i32 == 0) {
                    qgg.h0(obj);
                    qqiVar3 = (qqi) ((au7) this.p).m;
                    this.o = qqiVar3;
                    this.k = 0;
                    this.m = 1;
                    if (qqiVar3.a(this) != nm6Var5) {
                        i5 = 0;
                    }
                    return nm6Var5;
                }
                if (i32 != 1) {
                    if (i32 == 2) {
                        int i33 = this.n;
                        int i34 = this.l;
                        i5 = this.k;
                        f2 = (fwu) this.s;
                        xvu xvuVar3 = (xvu) this.r;
                        ?? r9 = (oqi) this.o;
                        try {
                            qgg.h0(obj);
                            i6 = i34;
                            qqiVar3 = r9;
                            i7 = i33;
                            xvuVar = xvuVar3;
                            a = obj;
                            booleanValue = ((Boolean) a).booleanValue();
                            xdrVar.l(f2);
                            if (booleanValue) {
                                qqiVar4 = qqiVar3;
                                au7.g(au7Var2, f2.a.a, f2.b, false, null, null, null, 124);
                                if (xvuVar instanceof bwu) {
                                }
                                if (Intrinsics.d((jzs) f2.a.a.b(), jzsVar)) {
                                }
                                qqiVar3 = qqiVar4;
                                qqiVar3.b(null);
                                return ovuVar;
                            }
                            jac jacVar = (jac) au7Var2.b;
                            this.o = qqiVar3;
                            this.r = xvuVar;
                            this.s = f2;
                            this.k = i5;
                            this.l = i6;
                            this.n = i7;
                            this.m = 3;
                            if (jacVar.c(this) != nm6Var5) {
                                qqiVar5 = qqiVar3;
                                fwuVar = f2;
                                f2 = fwuVar;
                                qqiVar4 = qqiVar5;
                                au7.g(au7Var2, f2.a.a, f2.b, false, null, null, null, 124);
                                if (xvuVar instanceof bwu) {
                                }
                                if (Intrinsics.d((jzs) f2.a.a.b(), jzsVar)) {
                                }
                                qqiVar3 = qqiVar4;
                                qqiVar3.b(null);
                                return ovuVar;
                            }
                            return nm6Var5;
                        } catch (Throwable th3) {
                            th = th3;
                            r3 = r9;
                        }
                    } else {
                        if (i32 != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fwuVar = (fwu) this.s;
                        xvuVar = (xvu) this.r;
                        r3 = (oqi) this.o;
                        try {
                            qgg.h0(obj);
                            qqiVar5 = r3;
                            f2 = fwuVar;
                            qqiVar4 = qqiVar5;
                            au7.g(au7Var2, f2.a.a, f2.b, false, null, null, null, 124);
                            if (xvuVar instanceof bwu) {
                                jzsVar = null;
                            } else {
                                if (!(xvuVar instanceof fwu)) {
                                    throw new x7j();
                                }
                                jzsVar = (jzs) ((fwu) xvuVar).a.a.b();
                            }
                            ovuVar = Intrinsics.d((jzs) f2.a.a.b(), jzsVar) ? ovu.b : ovu.a;
                            qqiVar3 = qqiVar4;
                            qqiVar3.b(null);
                            return ovuVar;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                    r3.b(null);
                    throw th;
                }
                int i35 = this.k;
                ?? r52 = (oqi) this.o;
                qgg.h0(obj);
                i5 = i35;
                qqiVar3 = r52;
                ssg.a(3, "DefaultWavePlayback", "prev", null);
                Object value2 = xdrVar.getValue();
                xvuVar = value2 instanceof xvu ? (xvu) value2 : null;
                if (xvuVar == null) {
                    ovuVar = ovu.c;
                } else {
                    boolean z2 = xvuVar instanceof bwu;
                    r2l r2lVar = r2l.a;
                    if (z2) {
                        eu7 eu7Var = ((bwu) xvuVar).a.a;
                        eu7Var.getClass();
                        du7 du7Var = eu7Var.b;
                        int g = u75.g(eu7Var.a.a.getElements());
                        if (du7Var.b > g) {
                            int i36 = du7Var.a;
                            if (i36 > g) {
                                i36 = g;
                            }
                            eu7Var = eu7.a(eu7Var, null, new du7(i36, g), 1);
                        }
                        eu7 eu7Var2 = eu7Var;
                        if (eu7Var2.f()) {
                            eu7 eu7Var3 = (eu7) au7Var2.f(eu7Var2, ((bwu) xvuVar).a.b, ((bwu) xvuVar).b, true, a3l.a).a.h.getValue();
                            if (eu7Var3 == null) {
                                ovuVar = ovu.c;
                            } else {
                                f2 = au7Var2.f(eu7Var3, ((bwu) xvuVar).a.b, ((bwu) xvuVar).b, true, r2lVar);
                                v5j v5jVar2 = v5j.d;
                                this.o = qqiVar3;
                                this.r = xvuVar;
                                this.s = f2;
                                this.k = i5;
                                this.l = 0;
                                this.n = 0;
                                this.m = 2;
                                a = au7.a(au7Var2, xvuVar, f2, v5jVar2, this);
                                if (a != nm6Var5) {
                                    return nm6Var5;
                                }
                                i6 = 0;
                                i7 = 0;
                                booleanValue = ((Boolean) a).booleanValue();
                                xdrVar.l(f2);
                                if (booleanValue) {
                                }
                            }
                        } else {
                            ovuVar = ovu.c;
                        }
                    } else {
                        if (!(xvuVar instanceof fwu)) {
                            throw new x7j();
                        }
                        eu7 eu7Var4 = (eu7) ((fwu) xvuVar).a.h.getValue();
                        if (eu7Var4 == null) {
                            ovuVar = ovu.c;
                        } else {
                            f2 = au7Var2.f(eu7Var4, ((fwu) xvuVar).a.b, ((fwu) xvuVar).b, true, r2lVar);
                            v5j v5jVar22 = v5j.d;
                            this.o = qqiVar3;
                            this.r = xvuVar;
                            this.s = f2;
                            this.k = i5;
                            this.l = 0;
                            this.n = 0;
                            this.m = 2;
                            a = au7.a(au7Var2, xvuVar, f2, v5jVar22, this);
                            if (a != nm6Var5) {
                            }
                        }
                    }
                }
                qqiVar3.b(null);
                return ovuVar;
            case 3:
                t1f t1fVar2 = (t1f) this.s;
                Integer num2 = 1;
                nm6 nm6Var6 = nm6.a;
                int i37 = this.n;
                if (i37 == 0) {
                    qgg.h0(obj);
                    tqn tqnVar2 = new tqn();
                    xqn xqnVar2 = new xqn();
                    xqnVar2.a = c5b.a;
                    vqn vqnVar2 = new vqn();
                    vqnVar2.a = -1;
                    t1fVar = t1fVar2;
                    xqnVar = xqnVar2;
                    vqnVar = vqnVar2;
                    tqnVar = tqnVar2;
                    i8 = 10;
                    i9 = 0;
                    if (i9 < i8) {
                    }
                } else {
                    if (i37 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i9 = this.m;
                    int i38 = this.l;
                    int i39 = this.k;
                    t1fVar = (t1f) this.q;
                    vqnVar = (vqn) this.p;
                    xqnVar = (xqn) this.o;
                    tqnVar = (tqn) this.r;
                    qgg.h0(obj);
                    int i40 = i38;
                    i8 = i39;
                    w7o e = ((tdk) ((sdk) t1fVar.b)).e();
                    if ((e instanceof s7o) && (e instanceof u7o)) {
                        Object obj4 = ((u7o) e).a;
                        xqnVar.a = obj4;
                        Iterator it5 = ((List) obj4).iterator();
                        int i41 = 0;
                        while (true) {
                            if (it5.hasNext()) {
                                num = num2;
                                if (!(((rfk) it5.next()) instanceof pfk)) {
                                    i41++;
                                    num2 = num;
                                }
                            } else {
                                num = num2;
                                i41 = -1;
                            }
                        }
                        vqnVar.a = i41;
                        c = 65535;
                        if (i41 != -1) {
                            tqnVar.a = true;
                            g0c g0cVar = (g0c) t1fVar.c;
                            int i42 = i9 + 1;
                            String i43 = k5r.i(i42, "Открытие Карты Пэй завершилось успешно, количество попыток: ");
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            r1f r1fVar = r1f.a;
                            linkedHashMap.put("attempts", new oqe(i42, false));
                            linkedHashMap.put(DeviceService.KEY_DESC, new jkr(i43));
                            vtm vtmVar = new vtm((Map) linkedHashMap);
                            ci0 ci0Var = qjb.a;
                            ci0Var.a = up6.z(num) + ci0Var.a;
                            vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
                            qne j = su4.j(vtmVar, "event_name", "plus_card_open_success", "plus_card_open_success", vtmVar);
                            x60 x60Var = (x60) g0cVar;
                            x60Var.getClass();
                            x60Var.a(j);
                            if (!tqnVar.a) {
                                return new p5m((List) xqnVar.a, vqnVar.a);
                            }
                            g0c g0cVar2 = (g0c) t1fVar2.c;
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            r1f r1fVar2 = r1f.a;
                            vtm k = su4.k("Открытие Карты Пэй завершилось с ошибкой", linkedHashMap2, DeviceService.KEY_DESC, linkedHashMap2);
                            ci0 ci0Var2 = qjb.a;
                            ci0Var2.a = up6.z(num) + ci0Var2.a;
                            k.u(qee.n() + ci0Var2.a, "eventus_id");
                            qne j2 = su4.j(k, "event_name", "plus_card_open_error_shown", "plus_card_open_error_shown", k);
                            x60 x60Var2 = (x60) g0cVar2;
                            x60Var2.getClass();
                            x60Var2.a(j2);
                            e8w e8wVar = e8w.a;
                            e8w.c();
                            return null;
                        }
                    } else {
                        num = num2;
                        c = 65535;
                    }
                    i9 = i40 + 1;
                    num2 = num;
                    i21 = 1;
                    if (i9 < i8) {
                        this.r = tqnVar;
                        this.o = xqnVar;
                        this.p = vqnVar;
                        this.q = t1fVar;
                        this.k = i8;
                        this.l = i9;
                        this.m = i9;
                        this.n = i21;
                        xqn xqnVar3 = xqnVar;
                        if (y2x.o(1000L, this) == nm6Var6) {
                            return nm6Var6;
                        }
                        xqnVar = xqnVar3;
                        i40 = i9;
                        w7o e2 = ((tdk) ((sdk) t1fVar.b)).e();
                        if (e2 instanceof s7o) {
                        }
                        num = num2;
                        c = 65535;
                        i9 = i40 + 1;
                        num2 = num;
                        i21 = 1;
                        if (i9 < i8) {
                            num = num2;
                            if (!tqnVar.a) {
                            }
                        }
                    }
                }
            case 4:
                cr crVar2 = (cr) this.s;
                oi oiVar = (oi) this.r;
                nm6 nm6Var7 = nm6.a;
                int i44 = this.n;
                if (i44 != 0) {
                    if (i44 != 1) {
                        if (i44 == 2) {
                            i12 = this.m;
                            i11 = this.l;
                            i10 = this.k;
                            cr crVar3 = (cr) this.q;
                            ki3[] ki3VarArr2 = (ki3[]) ((Object[]) this.p);
                            si3 si3Var4 = (si3) this.o;
                            qgg.h0(obj);
                            si3Var2 = si3Var4;
                            crVar = crVar3;
                            ki3VarArr = ki3VarArr2;
                            obj2 = obj;
                            boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                            this.r = oiVar;
                            this.o = si3Var2;
                            this.p = ki3VarArr;
                            this.q = null;
                            this.k = i10;
                            this.l = i11;
                            this.n = i19;
                            emit = ((x0q) crVar.f).emit(new v1o(i12, booleanValue2), this);
                            if (emit != nm6.a) {
                            }
                            if (emit != nm6Var7) {
                            }
                            return nm6Var7;
                        }
                        if (i44 != 3 && i44 != 4) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i13 = this.l;
                        int i45 = this.k;
                        ki3[] ki3VarArr3 = (ki3[]) ((Object[]) this.p);
                        si3 si3Var5 = (si3) this.o;
                        qgg.h0(obj);
                        int i46 = i45 + 1;
                        si3Var = si3Var5;
                        ki3VarArr = ki3VarArr3;
                        i10 = i46;
                        i19 = 3;
                        if (i10 < i13) {
                            ki3 ki3Var = ki3VarArr[i10];
                            saf.K(oiVar.getCoroutineContext());
                            if (ki3Var instanceof ii3) {
                                ii3 ii3Var = (ii3) ki3Var;
                                int i47 = ii3Var.b;
                                this.r = oiVar;
                                this.o = si3Var;
                                this.p = ki3VarArr;
                                this.q = crVar2;
                                this.k = i10;
                                this.l = i13;
                                this.m = i47;
                                this.n = 2;
                                obj2 = cr.j(crVar2, ii3Var, this);
                                if (obj2 != nm6Var7) {
                                    si3Var2 = si3Var;
                                    i11 = i13;
                                    i12 = i47;
                                    crVar = crVar2;
                                    boolean booleanValue22 = ((Boolean) obj2).booleanValue();
                                    this.r = oiVar;
                                    this.o = si3Var2;
                                    this.p = ki3VarArr;
                                    this.q = null;
                                    this.k = i10;
                                    this.l = i11;
                                    this.n = i19;
                                    emit = ((x0q) crVar.f).emit(new v1o(i12, booleanValue22), this);
                                    if (emit != nm6.a) {
                                        emit = Unit.a;
                                    }
                                    if (emit != nm6Var7) {
                                        i13 = i11;
                                        i45 = i10;
                                        ki3VarArr3 = ki3VarArr;
                                        si3Var5 = si3Var2;
                                        int i462 = i45 + 1;
                                        si3Var = si3Var5;
                                        ki3VarArr = ki3VarArr3;
                                        i10 = i462;
                                        i19 = 3;
                                        if (i10 < i13) {
                                        }
                                    }
                                }
                            } else {
                                if (!(ki3Var instanceof ji3)) {
                                    b6e.s();
                                    return null;
                                }
                                bsn bsnVar = (bsn) crVar2.b;
                                PlaybackCommand$QueueBound playbackCommand$QueueBound = ((ji3) ki3Var).a;
                                this.r = oiVar;
                                this.o = si3Var;
                                this.p = ki3VarArr;
                                this.k = i10;
                                this.l = i13;
                                this.n = 4;
                                if (a4g.O(new rfg(playbackCommand$QueueBound, bsnVar, continuation, 25), this) != nm6Var7) {
                                    ki3[] ki3VarArr4 = ki3VarArr;
                                    si3Var5 = si3Var;
                                    i45 = i10;
                                    ki3VarArr3 = ki3VarArr4;
                                    int i4622 = i45 + 1;
                                    si3Var = si3Var5;
                                    ki3VarArr = ki3VarArr3;
                                    i10 = i4622;
                                    i19 = 3;
                                    if (i10 < i13) {
                                    }
                                }
                            }
                            return nm6Var7;
                        }
                        si3Var3 = si3Var;
                        this.r = oiVar;
                        this.o = si3Var3;
                        this.p = null;
                        this.n = 1;
                        obj3 = si3Var3.c(this);
                        break;
                    } else {
                        si3Var3 = (si3) this.o;
                        qgg.h0(obj);
                        obj3 = obj;
                        if (!((Boolean) obj3).booleanValue()) {
                            return Unit.a;
                        }
                        si3Var3.d();
                        j6e j6eVar = (j6e) crVar2.c;
                        zx0 zx0Var = (zx0) j6eVar.a;
                        ReentrantLock reentrantLock = (ReentrantLock) j6eVar.b;
                        reentrantLock.lock();
                        try {
                            ki3VarArr = (ki3[]) zx0Var.toArray(new ki3[0]);
                            zx0Var.clear();
                            reentrantLock.unlock();
                            si3Var = si3Var3;
                            i13 = ki3VarArr.length;
                            i10 = 0;
                            if (i10 < i13) {
                            }
                            si3Var3 = si3Var;
                            this.r = oiVar;
                            this.o = si3Var3;
                            this.p = null;
                            this.n = 1;
                            obj3 = si3Var3.c(this);
                        } catch (Throwable th5) {
                            reentrantLock.unlock();
                            throw th5;
                        }
                    }
                } else {
                    qgg.h0(obj);
                    oiVar.getClass();
                    zi3 zi3Var = oiVar.d;
                    zi3Var.getClass();
                    si3Var = new si3(zi3Var);
                    si3Var3 = si3Var;
                    this.r = oiVar;
                    this.o = si3Var3;
                    this.p = null;
                    this.n = 1;
                    obj3 = si3Var3.c(this);
                }
            default:
                nm6 nm6Var8 = nm6.a;
                int i48 = this.n;
                if (i48 == 0) {
                    qgg.h0(obj);
                    ccwVar = (ccw) this.r;
                    str = (String) this.s;
                    AtomicBoolean atomicBoolean = ccwVar.e;
                    xdr xdrVar2 = ccwVar.i;
                    if (!atomicBoolean.get()) {
                        ssg.a(6, ccw.l, "skip sending changeActiveDevice, cause Ynison instance was closed", null);
                        return Unit.a;
                    }
                    if (!((Boolean) xdrVar2.getValue()).booleanValue()) {
                        ssg.a(3, ccw.l, "--> suspend changeActiveDevice", null);
                        lf2 lf2Var = new lf2(i18, 16, continuation);
                        this.o = ccwVar;
                        this.p = "changeActiveDevice";
                        this.q = str;
                        this.k = 0;
                        this.l = 0;
                        this.m = 0;
                        this.n = 1;
                        if (zsd.h0(xdrVar2, lf2Var, this) != nm6Var8) {
                            i16 = 0;
                            i17 = 0;
                            str2 = "changeActiveDevice";
                        }
                        return nm6Var8;
                    }
                    i14 = 0;
                    ccwVar2 = ccwVar;
                    str2 = "changeActiveDevice";
                    i15 = 0;
                    a5n I = d0.I();
                    I.i(String.valueOf(UUID.randomUUID()));
                    I.h(ccw.b(ccwVar2).a);
                    xmt i49 = l0.i();
                    if (str != null) {
                        dlr h = dlr.h(str);
                        i49.d();
                        l0.f((l0) i49.b, h);
                    }
                    l0 l0Var = (l0) i49.b();
                    I.d();
                    d0.i((d0) I.b, l0Var);
                    d0Var = (d0) I.b();
                    if (((Boolean) ((dfw) ccwVar2.a.c).invoke()).booleanValue()) {
                        qee.q(d0Var);
                    }
                    String str5 = ccw.l;
                    String p = d0Var.p();
                    njs b = ccw.b(ccwVar2);
                    StringBuilder m = f1d.m("--> ", str2, " with id=", p, " at timestamp=");
                    m.append(b);
                    ssg.a(3, str5, m.toString(), null);
                    if (i20 != 0) {
                        ccwVar2.h.add(d0Var.p());
                    }
                    x0qVar = ccwVar2.g;
                    this.o = ccwVar2;
                    this.p = str2;
                    this.q = null;
                    this.k = i20;
                    this.l = i14;
                    this.m = i15;
                    this.n = 2;
                    if (x0qVar.emit(d0Var, this) != nm6Var8) {
                        str3 = str2;
                        String str6 = ccw.l;
                        ccwVar2.d().getClass();
                        str3.getClass();
                        return Unit.a;
                    }
                    return nm6Var8;
                }
                if (i48 != 1) {
                    if (i48 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str3 = (String) this.p;
                    ccwVar2 = (ccw) this.o;
                    qgg.h0(obj);
                    String str62 = ccw.l;
                    ccwVar2.d().getClass();
                    str3.getClass();
                    return Unit.a;
                }
                int i50 = this.m;
                i16 = this.l;
                int i51 = this.k;
                str = (String) this.q;
                str2 = (String) this.p;
                ccwVar = (ccw) this.o;
                qgg.h0(obj);
                i20 = i51;
                i17 = i50;
                int i52 = i17;
                i14 = i16;
                ccwVar2 = ccwVar;
                i15 = i52;
                a5n I2 = d0.I();
                I2.i(String.valueOf(UUID.randomUUID()));
                I2.h(ccw.b(ccwVar2).a);
                xmt i492 = l0.i();
                if (str != null) {
                }
                l0 l0Var2 = (l0) i492.b();
                I2.d();
                d0.i((d0) I2.b, l0Var2);
                d0Var = (d0) I2.b();
                if (((Boolean) ((dfw) ccwVar2.a.c).invoke()).booleanValue()) {
                }
                String str52 = ccw.l;
                String p2 = d0Var.p();
                njs b2 = ccw.b(ccwVar2);
                StringBuilder m2 = f1d.m("--> ", str2, " with id=", p2, " at timestamp=");
                m2.append(b2);
                ssg.a(3, str52, m2.toString(), null);
                if (i20 != 0) {
                }
                x0qVar = ccwVar2.g;
                this.o = ccwVar2;
                this.p = str2;
                this.q = null;
                this.k = i20;
                this.l = i14;
                this.m = i15;
                this.n = 2;
                if (x0qVar.emit(d0Var, this) != nm6Var8) {
                }
                return nm6Var8;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b51(au7 au7Var, Continuation continuation, au7 au7Var2) {
        super(2, continuation);
        this.j = 2;
        this.p = au7Var;
        this.q = au7Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b51(ccw ccwVar, String str, Continuation continuation) {
        super(2, continuation);
        this.j = 5;
        this.r = ccwVar;
        this.s = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b51(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.s = obj;
    }
}
