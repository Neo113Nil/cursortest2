package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Spanned;
import android.text.SpannedString;
import com.yandex.music.shared.utils.ThrowablesKt;
import com.yandex.passport.internal.t;
import com.yandex.passport.sloth.ui.q;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.a;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.d;
import com.yandex.plus.acquisition.sdk.pay.common.api.j;
import com.yandex.plus.acquisition.sdk.pay.common.api.k;
import com.yandex.plus.core.activity.result.internal.PlusProxyActivity;
import com.yandex.plus.core.activity.result.internal.h;
import com.yandex.plus.core.activity.result.internal.m;
import com.yandex.plus.home.dailyquests.feature.internal.model.e;
import com.yandex.plus.home.dailyquests.feature.internal.model.f;
import com.yandex.plus.home.dailyquests.repository.api.dailyquests.i;
import com.yandex.plus.home.plaque.feature.internal.presentation.b;
import com.yandex.plus.metrica.utils.n;
import com.yandex.plus.pay.ui.core.debug.internal.domain.form.c;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class wwd extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public int l;
    public Object m;
    public Object n;
    public Object o;
    public Object p;
    public Object q;
    public /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwd(int i, xwd xwdVar, gm5 gm5Var, AtomicInteger atomicInteger, List list, Uri uri, nb7 nb7Var, Continuation continuation) {
        super(2, continuation);
        this.j = 0;
        this.l = i;
        this.n = xwdVar;
        this.o = gm5Var;
        this.p = atomicInteger;
        this.q = list;
        this.r = uri;
        this.s = nb7Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new wwd(this.l, (xwd) this.n, (gm5) this.o, (AtomicInteger) this.p, (List) this.q, (Uri) this.r, (nb7) this.s, continuation);
            case 1:
                wwd wwdVar = new wwd((xh1) this.s, continuation, 1);
                wwdVar.r = obj;
                return wwdVar;
            case 2:
                return new wwd((auv) this.q, (String) this.r, (ps) this.s, continuation, 2);
            case 3:
                wwd wwdVar2 = new wwd((d) this.r, (k) this.s, continuation, 3);
                wwdVar2.q = obj;
                return wwdVar2;
            case 4:
                wwd wwdVar3 = new wwd((h) this.q, (uh) this.r, this.s, continuation, 4);
                wwdVar3.p = obj;
                return wwdVar3;
            case 5:
                wwd wwdVar4 = new wwd((com.yandex.plus.home.dailyquests.repository.api.dailyquests.k) this.r, (com.yandex.passport.internal.core.accounts.h) this.s, continuation, 5);
                wwdVar4.q = obj;
                return wwdVar4;
            default:
                wwd wwdVar5 = new wwd((b) this.s, continuation, 6);
                wwdVar5.r = obj;
                return wwdVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((wwd) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:243|244|(1:(1:(10:248|249|250|251|252|253|254|255|256|(2:258|259)(5:260|261|262|263|264))(2:301|302))(4:303|304|305|306))(4:339|340|341|(3:343|319|320))|307|(1:335)(2:310|311)|312|313|314|315|316|317|(7:321|252|253|254|255|256|(0)(0))|319|320) */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x04c7, code lost:
    
        if (r1 == r2) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x04a7, code lost:
    
        if (r0 != r2) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0485, code lost:
    
        if (r3 == r2) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x04ee, code lost:
    
        if (r1 == r2) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0631, code lost:
    
        if (r3.k(r1, (defpackage.s2w) r0) != false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0628, code lost:
    
        if (r0 == r7) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0645, code lost:
    
        if (r0.emit(r1, r28) == r7) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x05f7, code lost:
    
        if (r0 == r7) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bc, code lost:
    
        if (com.yandex.plus.home.common.utils.a.i(r17) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0862, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0863, code lost:
    
        r1 = r16;
        r8 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0869, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x086a, code lost:
    
        r8 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x07b4, code lost:
    
        r7 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x083b A[Catch: CancellationException -> 0x079b, IOException -> 0x0850, TryCatch #2 {CancellationException -> 0x079b, blocks: (B:250:0x078e, B:253:0x0831, B:256:0x0835, B:258:0x083b, B:260:0x0852), top: B:249:0x078e }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0852 A[Catch: CancellationException -> 0x079b, IOException -> 0x0850, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x079b, blocks: (B:250:0x078e, B:253:0x0831, B:256:0x0835, B:258:0x083b, B:260:0x0852), top: B:249:0x078e }] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x08a6  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0874 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x08d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02ed  */
    /* JADX WARN: Type inference failed for: r0v136 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v78 */
    /* JADX WARN: Type inference failed for: r3v57, types: [boolean, tqn] */
    /* JADX WARN: Type inference failed for: r4v24, types: [int] */
    /* JADX WARN: Type inference failed for: r4v26, types: [android.text.Spanned] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v78 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v55 */
    /* JADX WARN: Type inference failed for: r6v57 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, xqn] */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, xqn] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:196:0x0628 -> B:193:0x062b). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        xqn xqnVar;
        gm5 gm5Var;
        xqn xqnVar2;
        gm5 gm5Var2;
        IOException e;
        Object S;
        db7 db7Var;
        Object s;
        vjg vjgVar;
        int i;
        mu7 mu7Var;
        ou7 ou7Var;
        ?? r0;
        drf[] drfVarArr;
        Object obj2;
        Object H;
        drf[] drfVarArr2;
        vjg vjgVar2;
        ?? r6;
        Object H2;
        drf[] drfVarArr3;
        ?? r2;
        Object b;
        rj6 rj6Var;
        xdr xdrVar;
        int i2;
        Object value;
        Object a;
        Continuation continuation;
        ou7 p;
        Object s2;
        SpannedString spannedString;
        k kVar;
        ?? r4;
        Drawable drawable;
        Object H3;
        Spanned spanned;
        Object V;
        tqn tqnVar;
        Object obj3;
        m mVar;
        Object g0;
        h hVar;
        int i3;
        Object g02;
        tqn tqnVar2;
        Object a2;
        ?? r3;
        Object V2;
        Object s3;
        mu7 mu7Var2;
        int i4;
        ou7 ou7Var2;
        i iVar;
        i iVar2;
        Drawable drawable2;
        SpannedString spannedString2;
        Object H4;
        mu7 mu7Var3;
        Drawable drawable3;
        SpannedString spannedString3;
        Object H5;
        Drawable drawable4;
        Integer num;
        f eVar;
        String str;
        nm6 nm6Var;
        Continuation continuation2;
        ou7 p2;
        String str2;
        Object s4;
        c[] cVarArr;
        int i5;
        String str3;
        c[] cVarArr2;
        Object H6;
        c[] cVarArr3;
        ?? r62;
        int i6 = this.j;
        int i7 = 10;
        int i8 = 9;
        ?? r8 = "call to 'resume' before 'invoke' with coroutine";
        Object obj4 = this.s;
        int i9 = 2;
        int i10 = 1;
        switch (i6) {
            case 0:
                gm5 gm5Var3 = (gm5) this.o;
                Uri uri = (Uri) this.r;
                int i11 = this.l;
                xwd xwdVar = (xwd) this.n;
                nm6 nm6Var2 = nm6.a;
                int i12 = this.k;
                try {
                    if (i12 == 0) {
                        r8 = hrg.i(obj);
                        gm5Var = gm5Var3;
                        try {
                            long j = i11 * xwdVar.a.b;
                            this.m = r8;
                            this.k = 1;
                            r8 = r8;
                            if (y2x.o(j, this) == nm6Var2) {
                                return nm6Var2;
                            }
                        } catch (IOException e2) {
                            e = e2;
                            gm5Var2 = gm5Var;
                            xqnVar2 = r8;
                            xqnVar = xqnVar2;
                            db7Var = (db7) xqnVar.a;
                            if (db7Var != null) {
                            }
                            if (((AtomicInteger) this.p).incrementAndGet() == ((List) this.q).size()) {
                            }
                            return Unit.a;
                        }
                    } else {
                        if (i12 != 1) {
                            if (i12 != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            xqnVar = (xqn) this.m;
                            try {
                                try {
                                    qgg.h0(obj);
                                    S = obj;
                                    gm5Var = gm5Var3;
                                } catch (IOException e3) {
                                    e = e3;
                                    gm5Var2 = gm5Var3;
                                    db7Var = (db7) xqnVar.a;
                                    if (db7Var != null) {
                                        try {
                                            db7Var.close();
                                        } catch (Exception unused) {
                                        }
                                    }
                                    if (((AtomicInteger) this.p).incrementAndGet() == ((List) this.q).size()) {
                                        ssg.a(3, "HedgedDataSourceHelper", "hedged attempt " + i11 + ": FAILED with URI " + uri, null);
                                        gm5Var2.m0(e);
                                    } else {
                                        Iterator it = jhp.j(ThrowablesKt.meAndCauses(e), 10).iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                if (((Throwable) it.next()) instanceof SocketTimeoutException) {
                                                    ssg.a(3, "HedgedDataSourceHelper", "hedging take to much time, rethrow error", null);
                                                    gm5Var2.m0(e);
                                                }
                                            }
                                        }
                                    }
                                    return Unit.a;
                                }
                                try {
                                    gm5Var2 = gm5Var;
                                    try {
                                    } catch (IOException e4) {
                                        e = e4;
                                        db7Var = (db7) xqnVar.a;
                                        if (db7Var != null) {
                                        }
                                        if (((AtomicInteger) this.p).incrementAndGet() == ((List) this.q).size()) {
                                        }
                                        return Unit.a;
                                    }
                                } catch (IOException e5) {
                                    e = e5;
                                    gm5Var2 = gm5Var;
                                    db7Var = (db7) xqnVar.a;
                                    if (db7Var != null) {
                                    }
                                    if (((AtomicInteger) this.p).incrementAndGet() == ((List) this.q).size()) {
                                    }
                                    return Unit.a;
                                }
                                if (gm5Var2.U((zsj) S)) {
                                    try {
                                        ((db7) xqnVar.a).close();
                                    } catch (Exception unused2) {
                                    }
                                    return Unit.a;
                                }
                                ssg.a(3, "HedgedDataSourceHelper", "hedged race won by URI " + uri, null);
                                return Unit.a;
                            } catch (CancellationException e6) {
                                e = e6;
                                db7 db7Var2 = (db7) xqnVar.a;
                                if (db7Var2 != null) {
                                    try {
                                        db7Var2.close();
                                    } catch (Exception unused3) {
                                    }
                                }
                                throw e;
                            }
                        }
                        xqn xqnVar3 = (xqn) this.m;
                        try {
                            qgg.h0(obj);
                            gm5Var = gm5Var3;
                            r8 = xqnVar3;
                        } catch (IOException e7) {
                            e = e7;
                            gm5Var2 = gm5Var3;
                            xqnVar2 = xqnVar3;
                            xqnVar = xqnVar2;
                            db7Var = (db7) xqnVar.a;
                            if (db7Var != null) {
                            }
                            if (((AtomicInteger) this.p).incrementAndGet() == ((List) this.q).size()) {
                            }
                            return Unit.a;
                        }
                    }
                    ssg.a(3, "HedgedDataSourceHelper", "hedged attempt " + i11 + ": trying URI " + uri, null);
                    db7 db7Var3 = xwdVar.d;
                    tqn tqnVar3 = new tqn();
                    if (db7Var3 == null || i11 != 0) {
                        db7Var3 = xwdVar.b.a();
                        db7Var3.getClass();
                    } else {
                        try {
                            tqnVar3.a = true;
                        } catch (IOException e8) {
                            e = e8;
                            xqnVar = r8;
                            gm5Var2 = gm5Var;
                            db7Var = (db7) xqnVar.a;
                            if (db7Var != null) {
                            }
                            if (((AtomicInteger) this.p).incrementAndGet() == ((List) this.q).size()) {
                            }
                            return Unit.a;
                        }
                    }
                    r8.a = db7Var3;
                    xqn xqnVar4 = r8;
                    rh1 rh1Var = new rh1(xwdVar, xqnVar4, (Uri) this.r, (nb7) obj4, tqnVar3, 6);
                    this.m = r8;
                    this.k = 2;
                    S = sk3.S(g.a, rh1Var, this);
                    if (S != nm6Var2) {
                        xqnVar = r8;
                        gm5Var2 = gm5Var;
                        if (gm5Var2.U((zsj) S)) {
                        }
                    }
                    return nm6Var2;
                } catch (CancellationException e9) {
                    e = e9;
                    break;
                }
            case 1:
                xh1 xh1Var = (xh1) obj4;
                mm6 mm6Var = (mm6) this.r;
                nm6 nm6Var3 = nm6.a;
                int i13 = this.l;
                if (i13 == 0) {
                    qgg.h0(obj);
                    Continuation continuation3 = null;
                    ou7 p3 = x97.p(mm6Var, null, null, new ptd(xh1Var, continuation3, 29), 3);
                    ou7 p4 = x97.p(mm6Var, null, null, new ptd(xh1Var, continuation3, 28), 3);
                    y35 y35Var = y35.CONNECTIVITY_INFO_OFFLINE;
                    vjg vjgVar3 = new vjg(new nrf(y35Var.a, y35Var.b), null, null, null, null);
                    ou7 p5 = x97.p(mm6Var, null, null, new akc(xh1Var, (Continuation) null, 27), 3);
                    drf[] drfVarArr4 = new drf[4];
                    this.r = null;
                    this.m = p4;
                    this.n = vjgVar3;
                    this.o = p5;
                    this.p = drfVarArr4;
                    this.q = drfVarArr4;
                    this.k = 0;
                    this.l = 1;
                    s = p3.s(this);
                    if (s != nm6Var3) {
                        vjgVar = vjgVar3;
                        i = 0;
                        mu7Var = p4;
                        ou7Var = p5;
                        r0 = drfVarArr4;
                        drfVarArr = drfVarArr4;
                    }
                    return nm6Var3;
                }
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i9 = this.k;
                        drf[] drfVarArr5 = (drf[]) ((Object[]) this.q);
                        drfVarArr3 = (drf[]) ((Object[]) this.p);
                        vjg vjgVar4 = (vjg) this.n;
                        qgg.h0(obj);
                        vjgVar2 = vjgVar4;
                        r2 = drfVarArr5;
                        H2 = obj;
                        r2[i9] = H2;
                        drfVarArr3[3] = vjgVar2;
                        return u75.h(drfVarArr3);
                    }
                    i10 = this.k;
                    drf[] drfVarArr6 = (drf[]) ((Object[]) this.q);
                    drf[] drfVarArr7 = (drf[]) ((Object[]) this.p);
                    vjgVar2 = (vjg) this.n;
                    mu7Var = (mu7) this.m;
                    qgg.h0(obj);
                    r6 = drfVarArr6;
                    obj2 = null;
                    H = obj;
                    drfVarArr2 = drfVarArr7;
                    r6[i10] = H;
                    this.r = obj2;
                    this.m = obj2;
                    this.n = vjgVar2;
                    this.o = obj2;
                    this.p = drfVarArr2;
                    this.q = drfVarArr2;
                    this.k = 2;
                    this.l = 3;
                    H2 = mu7Var.H(this);
                    if (H2 != nm6Var3) {
                        drfVarArr3 = drfVarArr2;
                        r2 = drfVarArr2;
                        r2[i9] = H2;
                        drfVarArr3[3] = vjgVar2;
                        return u75.h(drfVarArr3);
                    }
                    return nm6Var3;
                }
                i = this.k;
                drf[] drfVarArr8 = (drf[]) ((Object[]) this.q);
                drf[] drfVarArr9 = (drf[]) ((Object[]) this.p);
                ou7Var = (ou7) this.o;
                vjg vjgVar5 = (vjg) this.n;
                mu7 mu7Var4 = (mu7) this.m;
                qgg.h0(obj);
                vjgVar = vjgVar5;
                mu7Var = mu7Var4;
                drfVarArr = drfVarArr9;
                s = obj;
                r0 = drfVarArr8;
                r0[i] = s;
                obj2 = null;
                this.r = null;
                this.m = mu7Var;
                this.n = vjgVar;
                this.o = null;
                this.p = drfVarArr;
                this.q = drfVarArr;
                this.k = 1;
                this.l = 2;
                H = ou7Var.H(this);
                if (H != nm6Var3) {
                    drfVarArr2 = drfVarArr;
                    vjgVar2 = vjgVar;
                    r6 = drfVarArr;
                    r6[i10] = H;
                    this.r = obj2;
                    this.m = obj2;
                    this.n = vjgVar2;
                    this.o = obj2;
                    this.p = drfVarArr2;
                    this.q = drfVarArr2;
                    this.k = 2;
                    this.l = 3;
                    H2 = mu7Var.H(this);
                    if (H2 != nm6Var3) {
                    }
                }
                return nm6Var3;
            case 2:
                auv auvVar = (auv) this.q;
                nm6 nm6Var4 = nm6.a;
                int i14 = this.l;
                if (i14 == 0) {
                    qgg.h0(obj);
                    n0w n0wVar = auvVar.a;
                    String str4 = (String) this.r;
                    b3w b3wVar = b3w.BOTH_DIMENSIONS;
                    this.l = 1;
                    b = n0wVar.b(str4, 13, 13, b3wVar, this);
                    break;
                } else if (i14 == 1) {
                    qgg.h0(obj);
                    b = obj;
                } else if (i14 == 2) {
                    int i15 = this.k;
                    value = this.p;
                    auv auvVar2 = (auv) this.o;
                    xdrVar = (xdr) this.n;
                    rj6Var = (rj6) this.m;
                    qgg.h0(obj);
                    i2 = i15;
                    auvVar = auvVar2;
                    a = obj;
                    break;
                } else {
                    if (i14 == 3) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rj6 rj6Var2 = (rj6) b;
                ((ps) obj4).invoke();
                if (rj6Var2 instanceof qj6) {
                    rj6Var = rj6Var2;
                    xdrVar = auvVar.d;
                    i2 = 0;
                    value = xdrVar.getValue();
                    uwv uwvVar = (uwv) ((qj6) rj6Var).a;
                    this.m = rj6Var;
                    this.n = xdrVar;
                    this.o = auvVar;
                    this.p = value;
                    this.k = i2;
                    this.l = 2;
                    a = auv.a(auvVar, (s2w) value, uwvVar, this);
                    break;
                } else {
                    if (!(rj6Var2 instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    x0q x0qVar = auvVar.f;
                    Unit unit = Unit.a;
                    this.m = null;
                    this.l = 3;
                    break;
                }
            case 3:
                k kVar2 = (k) obj4;
                d dVar = (d) this.r;
                mm6 mm6Var2 = (mm6) this.q;
                nm6 nm6Var5 = nm6.a;
                int i16 = this.l;
                if (i16 == 0) {
                    qgg.h0(obj);
                    SpannedString A = dVar.b.A(kVar2);
                    boolean z = A != null && kVar2.f;
                    k a3 = k.a(kVar2, z);
                    j jVar = a3.g;
                    continuation = null;
                    ou7 p6 = x97.p(mm6Var2, null, null, new a(dVar, jVar, continuation, i10), 3);
                    p = x97.p(mm6Var2, null, null, new a(dVar, jVar, continuation, 0), 3);
                    this.q = null;
                    this.m = A;
                    this.n = a3;
                    this.o = p;
                    this.k = z ? 1 : 0;
                    this.l = 1;
                    s2 = p6.s(this);
                    if (s2 != nm6Var5) {
                        spannedString = A;
                        kVar = a3;
                        r4 = z;
                    }
                    return nm6Var5;
                }
                if (i16 != 1) {
                    if (i16 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    drawable = (Drawable) this.p;
                    k kVar3 = (k) this.n;
                    spanned = (Spanned) this.m;
                    qgg.h0(obj);
                    kVar = kVar3;
                    H3 = obj;
                    return new com.yandex.plus.acquisition.sdk.button.section.ui.api.a(kVar, spanned, drawable, (Drawable) H3);
                }
                int i17 = this.k;
                p = (ou7) this.o;
                kVar = (k) this.n;
                ?? r42 = (Spanned) this.m;
                qgg.h0(obj);
                spannedString = r42;
                continuation = null;
                r4 = i17;
                s2 = obj;
                drawable = (Drawable) s2;
                this.q = continuation;
                this.m = spannedString;
                this.n = kVar;
                this.o = continuation;
                this.p = drawable;
                this.k = r4;
                this.l = 2;
                H3 = p.H(this);
                if (H3 != nm6Var5) {
                    spanned = spannedString;
                    return new com.yandex.plus.acquisition.sdk.button.section.ui.api.a(kVar, spanned, drawable, (Drawable) H3);
                }
                return nm6Var5;
            case 4:
                int i18 = 7;
                h hVar2 = (h) this.q;
                nm6 nm6Var6 = nm6.a;
                int i19 = this.l;
                try {
                } catch (Throwable th) {
                    th = th;
                    if (r3.a) {
                        l8j l8jVar = l8j.c;
                        com.yandex.passport.internal.ui.social.i iVar3 = new com.yandex.passport.internal.ui.social.i(hVar2, null, 7);
                        this.p = null;
                        this.m = null;
                        this.n = null;
                        this.o = th;
                        this.l = 5;
                        V = x97.V(l8jVar, iVar3, this);
                        break;
                    }
                }
                if (i19 == 0) {
                    qgg.h0(obj);
                    if (hVar2.a == null) {
                        h.L(hVar2);
                        throw null;
                    }
                    tqnVar = new tqn();
                    Iterator it2 = hVar2.b.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj3 = it2.next();
                            if (((m) obj3).k.compareTo(lyf.e) >= 0) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    mVar = (m) obj3;
                    if (mVar == null) {
                        this.p = null;
                        this.m = tqnVar;
                        this.n = hVar2;
                        this.o = null;
                        this.k = 0;
                        this.l = 1;
                        g0 = zsd.g0(new t(hVar2.c, 23), this);
                        if (g0 != nm6Var6) {
                            hVar = hVar2;
                            i3 = 0;
                        }
                        return nm6Var6;
                    }
                    tqnVar2 = tqnVar;
                    uh uhVar = (uh) this.r;
                    this.p = null;
                    this.m = tqnVar2;
                    this.n = null;
                    this.o = null;
                    this.l = 3;
                    a2 = mVar.a(uhVar, obj4, this);
                } else if (i19 == 1) {
                    i3 = this.k;
                    h hVar3 = (h) this.n;
                    tqn tqnVar4 = (tqn) this.m;
                    qgg.h0(obj);
                    hVar = hVar3;
                    tqnVar = tqnVar4;
                    g0 = obj;
                } else if (i19 == 2) {
                    tqnVar = (tqn) this.m;
                    qgg.h0(obj);
                    g02 = obj;
                    mVar = (m) ((PlusProxyActivity) g02).a.getValue();
                    tqnVar2 = tqnVar;
                    uh uhVar2 = (uh) this.r;
                    this.p = null;
                    this.m = tqnVar2;
                    this.n = null;
                    this.o = null;
                    this.l = 3;
                    a2 = mVar.a(uhVar2, obj4, this);
                    break;
                } else {
                    if (i19 != 3) {
                        if (i19 == 4) {
                            a2 = this.o;
                            qgg.h0(obj);
                            V2 = obj;
                            Object obj5 = a2;
                            ((PlusProxyActivity) V2).finish();
                            return obj5;
                        }
                        if (i19 != 5) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = (Throwable) this.o;
                        qgg.h0(obj);
                        V = obj;
                        ((PlusProxyActivity) V).finish();
                        throw th;
                    }
                    tqnVar2 = (tqn) this.m;
                    qgg.h0(obj);
                    a2 = obj;
                    r3 = tqnVar2.a;
                    if (r3 == 0) {
                        return a2;
                    }
                    l8j l8jVar2 = l8j.c;
                    com.yandex.passport.internal.ui.social.i iVar4 = new com.yandex.passport.internal.ui.social.i(hVar2, null, i18);
                    this.p = null;
                    this.m = null;
                    this.n = null;
                    this.o = a2;
                    this.l = 4;
                    V2 = x97.V(l8jVar2, iVar4, this);
                    break;
                }
                Activity activity = (Activity) g0;
                activity.startActivity(new Intent(activity, (Class<?>) PlusProxyActivity.class));
                tqnVar.a = true;
                this.p = null;
                this.m = tqnVar;
                this.n = null;
                this.o = null;
                this.k = i3;
                this.l = 2;
                g02 = zsd.g0(new t(hVar.c, 24), this);
                break;
            case 5:
                int i20 = 8;
                com.yandex.passport.internal.core.accounts.h hVar4 = (com.yandex.passport.internal.core.accounts.h) obj4;
                com.yandex.plus.home.dailyquests.repository.api.dailyquests.k kVar4 = (com.yandex.plus.home.dailyquests.repository.api.dailyquests.k) this.r;
                mm6 mm6Var3 = (mm6) this.q;
                nm6 nm6Var7 = nm6.a;
                int i21 = this.l;
                String str5 = null;
                boolean z2 = false;
                boolean z3 = false;
                boolean z4 = false;
                if (i21 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.dailyquests.repository.api.dailyquests.j jVar2 = kVar4.d;
                    com.yandex.plus.home.dailyquests.repository.api.dailyquests.j jVar3 = kVar4.d;
                    int i22 = (jVar2 != null ? jVar2.a : null) != null ? 1 : 0;
                    ou7 p7 = x97.p(mm6Var3, null, null, new com.yandex.plus.bdui.ui.b(hVar4, kVar4, z4 ? 1 : 0, i20), 3);
                    ou7 p8 = (jVar3 == null || (iVar2 = jVar3.b) == null) ? null : x97.p(mm6Var3, null, null, new com.yandex.plus.bdui.ui.b(hVar4, iVar2, z3 ? 1 : 0, i8), 3);
                    ou7 p9 = (jVar3 == null || (iVar = jVar3.b) == null) ? null : x97.p(mm6Var3, null, null, new q(hVar4, iVar, false, z2 ? 1 : 0, 7), 3);
                    this.q = null;
                    this.m = p8;
                    this.n = p9;
                    this.k = i22;
                    this.l = 1;
                    s3 = p7.s(this);
                    if (s3 != nm6Var7) {
                        ou7 ou7Var3 = p8;
                        mu7Var2 = p9;
                        i4 = i22;
                        ou7Var2 = ou7Var3;
                    }
                    return nm6Var7;
                }
                if (i21 != 1) {
                    if (i21 != 2) {
                        if (i21 != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i4 = this.k;
                        SpannedString spannedString4 = (SpannedString) this.p;
                        drawable4 = (Drawable) this.o;
                        qgg.h0(obj);
                        spannedString2 = spannedString4;
                        H5 = obj;
                        spannedString3 = (SpannedString) H5;
                        drawable2 = drawable4;
                        com.yandex.plus.home.dailyquests.repository.api.dailyquests.j jVar4 = kVar4.d;
                        com.yandex.plus.home.dailyquests.repository.api.dailyquests.h hVar5 = kVar4.e;
                        String str6 = jVar4 != null ? jVar4.a : null;
                        num = hVar5.f;
                        if (num != null) {
                            int intValue = num.intValue();
                            str5 = ((Context) hVar4.b).getResources().getQuantityString(i4 != 0 ? R.plurals.plus_sdk_daily_quests_days_until_chain_deadline : R.plurals.plus_sdk_daily_quests_days_until_mission_deadline, intValue, new Integer(intValue));
                        }
                        eVar = hVar5.g ? new e(hVar5.c, hVar5.d) : new com.yandex.plus.home.dailyquests.feature.internal.model.d(hVar5.e);
                        String str7 = hVar5.b;
                        if (eVar instanceof e) {
                            str = ((e) eVar).b;
                        } else {
                            if (!(eVar instanceof com.yandex.plus.home.dailyquests.feature.internal.model.d)) {
                                b6e.s();
                                return null;
                            }
                            str = ((com.yandex.plus.home.dailyquests.feature.internal.model.d) eVar).a;
                        }
                        return new com.yandex.plus.home.dailyquests.feature.internal.model.h(kVar4.c, new com.yandex.plus.home.dailyquests.feature.internal.model.g(str6, spannedString2), new com.yandex.plus.home.dailyquests.feature.internal.model.c(drawable2, hVar5.b, eVar, str5), CollectionsKt.X(xz0.w(new CharSequence[]{str6, spannedString3, str7, str, str5}), null, null, null, null, 63));
                    }
                    i4 = this.k;
                    drawable3 = (Drawable) this.o;
                    mu7 mu7Var5 = (mu7) this.n;
                    qgg.h0(obj);
                    mu7Var3 = mu7Var5;
                    H4 = obj;
                    spannedString2 = (SpannedString) H4;
                    mu7 mu7Var6 = mu7Var3;
                    drawable2 = drawable3;
                    mu7Var2 = mu7Var6;
                    if (mu7Var2 == null) {
                        spannedString3 = null;
                        com.yandex.plus.home.dailyquests.repository.api.dailyquests.j jVar42 = kVar4.d;
                        com.yandex.plus.home.dailyquests.repository.api.dailyquests.h hVar52 = kVar4.e;
                        if (jVar42 != null) {
                        }
                        num = hVar52.f;
                        if (num != null) {
                        }
                        if (hVar52.g) {
                        }
                        String str72 = hVar52.b;
                        if (eVar instanceof e) {
                        }
                        return new com.yandex.plus.home.dailyquests.feature.internal.model.h(kVar4.c, new com.yandex.plus.home.dailyquests.feature.internal.model.g(str6, spannedString2), new com.yandex.plus.home.dailyquests.feature.internal.model.c(drawable2, hVar52.b, eVar, str5), CollectionsKt.X(xz0.w(new CharSequence[]{str6, spannedString3, str72, str, str5}), null, null, null, null, 63));
                    }
                    this.q = null;
                    this.m = null;
                    this.n = null;
                    this.o = drawable2;
                    this.p = spannedString2;
                    this.k = i4;
                    this.l = 3;
                    H5 = mu7Var2.H(this);
                    if (H5 != nm6Var7) {
                        drawable4 = drawable2;
                        spannedString3 = (SpannedString) H5;
                        drawable2 = drawable4;
                        com.yandex.plus.home.dailyquests.repository.api.dailyquests.j jVar422 = kVar4.d;
                        com.yandex.plus.home.dailyquests.repository.api.dailyquests.h hVar522 = kVar4.e;
                        if (jVar422 != null) {
                        }
                        num = hVar522.f;
                        if (num != null) {
                        }
                        if (hVar522.g) {
                        }
                        String str722 = hVar522.b;
                        if (eVar instanceof e) {
                        }
                        return new com.yandex.plus.home.dailyquests.feature.internal.model.h(kVar4.c, new com.yandex.plus.home.dailyquests.feature.internal.model.g(str6, spannedString2), new com.yandex.plus.home.dailyquests.feature.internal.model.c(drawable2, hVar522.b, eVar, str5), CollectionsKt.X(xz0.w(new CharSequence[]{str6, spannedString3, str722, str, str5}), null, null, null, null, 63));
                    }
                    return nm6Var7;
                }
                i4 = this.k;
                mu7Var2 = (mu7) this.n;
                ou7Var2 = (ou7) this.m;
                qgg.h0(obj);
                s3 = obj;
                drawable2 = (Drawable) s3;
                if (ou7Var2 != null) {
                    this.q = null;
                    this.m = null;
                    this.n = mu7Var2;
                    this.o = drawable2;
                    this.k = i4;
                    this.l = 2;
                    H4 = ou7Var2.H(this);
                    if (H4 != nm6Var7) {
                        mu7Var3 = mu7Var2;
                        drawable3 = drawable2;
                        spannedString2 = (SpannedString) H4;
                        mu7 mu7Var62 = mu7Var3;
                        drawable2 = drawable3;
                        mu7Var2 = mu7Var62;
                        if (mu7Var2 == null) {
                        }
                    }
                    return nm6Var7;
                }
                spannedString2 = null;
                if (mu7Var2 == null) {
                }
                break;
            default:
                b bVar = (b) obj4;
                mm6 mm6Var4 = (mm6) this.r;
                nm6 nm6Var8 = nm6.a;
                int i23 = this.l;
                Continuation continuation4 = null;
                if (i23 != 0) {
                    if (i23 != 1) {
                        if (i23 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i7 = this.k;
                        c[] cVarArr4 = (c[]) ((Object[]) this.p);
                        str3 = (String) this.o;
                        cVarArr3 = (c[]) ((Object[]) this.n);
                        qgg.h0(obj);
                        r62 = cVarArr4;
                        continuation2 = null;
                        H6 = obj;
                        String str8 = (String) H6;
                        r62[i7] = str8 == null ? new com.yandex.plus.pay.ui.core.debug.internal.domain.form.a("files", str8, "screenshot.png") : continuation2;
                        cVarArr3.getClass();
                        return new com.yandex.plus.pay.ui.core.debug.internal.domain.form.d(str3, xz0.w(cVarArr3));
                    }
                    int i24 = this.k;
                    String str9 = (String) this.q;
                    c[] cVarArr5 = (c[]) ((Object[]) this.p);
                    String str10 = (String) this.o;
                    c[] cVarArr6 = (c[]) ((Object[]) this.n);
                    ou7 ou7Var4 = (ou7) this.m;
                    qgg.h0(obj);
                    cVarArr = cVarArr5;
                    p2 = ou7Var4;
                    continuation2 = null;
                    str2 = str9;
                    i5 = i24;
                    str3 = str10;
                    nm6Var = nm6Var8;
                    s4 = obj;
                    cVarArr2 = cVarArr6;
                    cVarArr[i5] = new com.yandex.plus.pay.ui.core.debug.internal.domain.form.a(str2, (String) s4, "logs.txt");
                    this.r = continuation2;
                    this.m = continuation2;
                    this.n = cVarArr2;
                    this.o = str3;
                    this.p = cVarArr2;
                    this.q = continuation2;
                    this.k = 10;
                    this.l = 2;
                    H6 = p2.H(this);
                    if (H6 != nm6Var) {
                        cVarArr3 = cVarArr2;
                        r62 = cVarArr2;
                        String str82 = (String) H6;
                        r62[i7] = str82 == null ? new com.yandex.plus.pay.ui.core.debug.internal.domain.form.a("files", str82, "screenshot.png") : continuation2;
                        cVarArr3.getClass();
                        return new com.yandex.plus.pay.ui.core.debug.internal.domain.form.d(str3, xz0.w(cVarArr3));
                    }
                    return nm6Var;
                }
                qgg.h0(obj);
                com.yandex.plus.pay.ui.common.api.a aVar = (com.yandex.plus.pay.ui.common.api.a) bVar.e;
                com.yandex.plus.pay.ui.core.debug.api.a aVar2 = (com.yandex.plus.pay.ui.core.debug.api.a) bVar.a;
                Context a4 = aVar.a();
                nm6Var = nm6Var8;
                q qVar = new q(bVar, a4, false, continuation4, 15);
                continuation2 = null;
                p2 = x97.p(mm6Var4, null, null, qVar, 3);
                ou7 p10 = x97.p(mm6Var4, null, null, new com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.d(bVar, continuation2, i10), 3);
                int ordinal = ((com.yandex.plus.ui.core.theme.a) ((n) bVar.f).invoke()).ordinal();
                String str11 = "dark";
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            b6e.s();
                            return null;
                        }
                        break;
                    }
                    str11 = "light";
                }
                String uri2 = Uri.parse("https://forms.yandex-team.ru/ext/surveys/13754011/?iframe=1").buildUpon().appendQueryParameter("platform", ConstantDeviceInfo.APP_PLATFORM).appendQueryParameter("theme", str11).build().toString();
                uri2.getClass();
                c[] cVarArr7 = new c[11];
                cVarArr7[0] = new com.yandex.plus.pay.ui.core.debug.internal.domain.form.b("puid", String.valueOf(aVar2.a));
                cVarArr7[1] = new com.yandex.plus.pay.ui.core.debug.internal.domain.form.b("device_id", String.valueOf(aVar2.b));
                cVarArr7[2] = new com.yandex.plus.pay.ui.core.debug.internal.domain.form.b("app_version", aVar2.c);
                aVar2.getClass();
                cVarArr7[3] = new com.yandex.plus.pay.ui.core.debug.internal.domain.form.b("sdk_version", "110.0.0");
                String str12 = Build.VERSION.RELEASE;
                str12.getClass();
                cVarArr7[4] = new com.yandex.plus.pay.ui.core.debug.internal.domain.form.b(CommonUrlParts.OS_VERSION, str12);
                cVarArr7[5] = new com.yandex.plus.pay.ui.core.debug.internal.domain.form.b("service", aVar2.d);
                String lowerCase = aVar2.f.name().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                cVarArr7[6] = new com.yandex.plus.pay.ui.core.debug.internal.domain.form.b("environment", lowerCase);
                String str13 = a4.getApplicationInfo().packageName;
                str13.getClass();
                cVarArr7[7] = new com.yandex.plus.pay.ui.core.debug.internal.domain.form.b(CommonUrlParts.APP_ID, str13);
                cVarArr7[8] = new com.yandex.plus.pay.ui.core.debug.internal.domain.form.b("active_flags", CollectionsKt.X(aVar2.g, ", ", null, null, null, 62));
                this.r = null;
                this.m = p2;
                this.n = cVarArr7;
                this.o = uri2;
                this.p = cVarArr7;
                str2 = "logs";
                this.q = "logs";
                this.k = 9;
                this.l = 1;
                s4 = p10.s(this);
                if (s4 != nm6Var) {
                    cVarArr = cVarArr7;
                    i5 = 9;
                    str3 = uri2;
                    cVarArr2 = cVarArr;
                    cVarArr[i5] = new com.yandex.plus.pay.ui.core.debug.internal.domain.form.a(str2, (String) s4, "logs.txt");
                    this.r = continuation2;
                    this.m = continuation2;
                    this.n = cVarArr2;
                    this.o = str3;
                    this.p = cVarArr2;
                    this.q = continuation2;
                    this.k = 10;
                    this.l = 2;
                    H6 = p2.H(this);
                    if (H6 != nm6Var) {
                    }
                }
                return nm6Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wwd(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.q = obj;
        this.r = obj2;
        this.s = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wwd(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.r = obj;
        this.s = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wwd(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.s = obj;
    }
}
