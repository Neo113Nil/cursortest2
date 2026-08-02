package defpackage;

import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import com.yandex.pulse.metrics.o;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.c;
import ru.yandex.music.common.media.context.e;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes4.dex */
public final class y6v extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y6v(apo apoVar, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.j = 18;
        this.l = apoVar;
        this.m = (aur) function2;
    }

    private final Object k(Object obj) {
        hcw hcwVar = (hcw) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            int K = euk.K(((pqw) this.m).b);
            ldw ldwVar = hcwVar.c;
            this.k = 1;
            if (ldwVar.b(K, this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }

    private final Object l(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            ldw ldwVar = ((hcw) this.l).c;
            int r = ((rqw) this.m).d().r();
            this.k = 1;
            if (ldwVar.b(r, this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }

    private final Object n(Object obj) {
        afw afwVar = (afw) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i != 0) {
            if (i == 1) {
                qgg.h0(obj);
                return obj;
            }
            xq0.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qgg.h0(obj);
        l8v l8vVar = new l8v(new em(new u21(10, afwVar.e(), afwVar.d(), pew.a), 9), (String) this.m, 9);
        this.k = 1;
        Object g0 = zsd.g0(l8vVar, this);
        return g0 == nm6Var ? nm6Var : g0;
    }

    private final Object o(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i != 0) {
            if (i == 1) {
                qgg.h0(obj);
                return obj;
            }
            xq0.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qgg.h0(obj);
        yc4 e = ((afw) this.l).e();
        w4i w4iVar = new w4i(2, (g4d) this.m, lxe.class, "suspendConversion0", "invokeSuspend$suspendConversion0(Lkotlin/jvm/functions/Function1;Lcom/yandex/music/shared/ynison/api/YnisonClient$Mode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 23);
        this.k = 1;
        Object j0 = zsd.j0(e, w4iVar, this);
        return j0 == nm6Var ? nm6Var : j0;
    }

    /* JADX WARN: Type inference failed for: r1v34, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new y6v((z6v) this.l, (k7v) this.m, continuation, 0);
            case 1:
                y6v y6vVar = new y6v((tyi) this.m, continuation, 1);
                y6vVar.l = obj;
                return y6vVar;
            case 2:
                return new y6v((rev) this.l, (WebView) this.m, continuation, 2);
            case 3:
                return new y6v((wfv) this.l, (String) this.m, continuation, 3);
            case 4:
                return new y6v((pjc) this.l, continuation, (thv) this.m, 4);
            case 5:
                return new y6v((eps) this.l, (rkd) this.m, continuation, 5);
            case 6:
                return new y6v((gnv) this.m, continuation, 6);
            case 7:
                return new y6v((cnn) this.l, (View) this.m, continuation, 7);
            case 8:
                return new y6v((vdr) this.l, (iei) this.m, continuation, 8);
            case 9:
                return new y6v((auv) this.m, continuation, 9);
            case 10:
                return new y6v((z50) this.l, continuation, (lyv) this.m, 10);
            case 11:
                return new y6v((lyv) this.l, (bzv) this.m, continuation, 11);
            case 12:
                return new y6v((List) this.l, (Function0) this.m, continuation, 12);
            case 13:
                return new y6v((t1w) this.l, (q0w) this.m, continuation, 13);
            case 14:
                return new y6v((String) this.l, (y1w) this.m, continuation, 14);
            case 15:
                return new y6v((x2w) this.m, continuation, 15);
            case 16:
                return new y6v((pjc) this.l, continuation, (a3w) this.m, 16);
            case 17:
                return new y6v((a3w) this.l, (String) this.m, continuation, 17);
            case 18:
                return new y6v((apo) this.l, (Function2) this.m, continuation);
            case 19:
                return new y6v((sdr) this.l, (nbg) this.m, continuation, 19);
            case 20:
                return new y6v((kaw) this.l, (eps) this.m, continuation, 20);
            case 21:
                return new y6v((iaw) this.m, continuation, 21);
            case 22:
                return new y6v((eno) this.l, (rdk) this.m, continuation, 22);
            case 23:
                return new y6v((hgl) this.l, (rdk) this.m, continuation, 23);
            case 24:
                return new y6v((ccw) this.m, continuation, 24);
            case 25:
                return new y6v((hcw) this.l, (pqw) this.m, continuation, 25);
            case 26:
                return new y6v((hcw) this.l, (rqw) this.m, continuation, 26);
            case 27:
                return new y6v((afw) this.l, (String) this.m, continuation, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new y6v((afw) this.l, (g4d) this.m, continuation, 28);
            default:
                y6v y6vVar2 = new y6v((Pair) this.m, continuation, 29);
                y6vVar2.l = obj;
                return y6vVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((y6v) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((y6v) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                ((y6v) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                return nm6.a;
            case 3:
                return ((y6v) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((y6v) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((y6v) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((y6v) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((y6v) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 8:
                ((y6v) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                return nm6.a;
            case 9:
                return ((y6v) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((y6v) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 11:
                return ((y6v) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 12:
                return ((y6v) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 13:
                return ((y6v) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 14:
                return ((y6v) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 15:
                return ((y6v) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 16:
                return ((y6v) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 17:
                return ((y6v) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 18:
                return ((y6v) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 19:
                return ((y6v) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 20:
                return ((y6v) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 21:
                return ((y6v) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 22:
                return ((y6v) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 23:
                return ((y6v) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 24:
                return ((y6v) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 25:
                return ((y6v) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 26:
                return ((y6v) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 27:
                return ((y6v) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return ((y6v) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((y6v) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0203, code lost:
    
        if (r2 == r9) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01a3, code lost:
    
        if (r7 == r9) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02ea, code lost:
    
        if (r0 == r1) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x031b, code lost:
    
        if (r0 == r1) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0584, code lost:
    
        if (r1 == r0) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0573, code lost:
    
        if (r1.c((defpackage.xxq) r6, r26) == r0) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0566, code lost:
    
        if (r6 == r0) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0794, code lost:
    
        if (r1 == r0) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x07b3, code lost:
    
        if (defpackage.auv.c(r5, (defpackage.mtv) r1, r26) == r0) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x07c4, code lost:
    
        if (defpackage.auv.d(r5, (defpackage.ntv) r1, r26) == r0) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x07d5, code lost:
    
        if (defpackage.auv.b(r5, (defpackage.ltv) r1, r26) == r0) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0096, code lost:
    
        if (r1 == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0078, code lost:
    
        if (r5 == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0894, code lost:
    
        if (r6 == r2) goto L394;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0674 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x062b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x07dd  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0a19  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0a1c  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0a0e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020e A[Catch: IOException -> 0x0119, TryCatch #0 {IOException -> 0x0119, blocks: (B:73:0x0111, B:75:0x0208, B:76:0x020a, B:78:0x020e, B:79:0x0224, B:81:0x0231, B:83:0x0237, B:84:0x0284, B:86:0x0240, B:87:0x0247, B:88:0x0248, B:90:0x024e, B:91:0x026b, B:93:0x026f, B:94:0x0278, B:96:0x027c, B:97:0x028c, B:98:0x0291, B:102:0x0125, B:104:0x01d5, B:106:0x01a6, B:109:0x01b2, B:114:0x01d8), top: B:67:0x0105 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0231 A[Catch: IOException -> 0x0119, TryCatch #0 {IOException -> 0x0119, blocks: (B:73:0x0111, B:75:0x0208, B:76:0x020a, B:78:0x020e, B:79:0x0224, B:81:0x0231, B:83:0x0237, B:84:0x0284, B:86:0x0240, B:87:0x0247, B:88:0x0248, B:90:0x024e, B:91:0x026b, B:93:0x026f, B:94:0x0278, B:96:0x027c, B:97:0x028c, B:98:0x0291, B:102:0x0125, B:104:0x01d5, B:106:0x01a6, B:109:0x01b2, B:114:0x01d8), top: B:67:0x0105 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0248 A[Catch: IOException -> 0x0119, TryCatch #0 {IOException -> 0x0119, blocks: (B:73:0x0111, B:75:0x0208, B:76:0x020a, B:78:0x020e, B:79:0x0224, B:81:0x0231, B:83:0x0237, B:84:0x0284, B:86:0x0240, B:87:0x0247, B:88:0x0248, B:90:0x024e, B:91:0x026b, B:93:0x026f, B:94:0x0278, B:96:0x027c, B:97:0x028c, B:98:0x0291, B:102:0x0125, B:104:0x01d5, B:106:0x01a6, B:109:0x01b2, B:114:0x01d8), top: B:67:0x0105 }] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v82, types: [c5b] */
    /* JADX WARN: Type inference failed for: r1v83, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v84, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v24, types: [aur, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v71 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:317:0x07b3 -> B:310:0x078c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:321:0x07c4 -> B:310:0x078c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:325:0x07d5 -> B:310:0x078c). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        dq4 dq4Var;
        dq4 dq4Var2;
        Object a;
        Object value;
        Object a2;
        Object L;
        cvl cvlVar;
        List list;
        si3 si3Var;
        Object obj2;
        Object c;
        Collection collection;
        u1w u1wVar;
        wst wstVar;
        Object g0;
        Object a3;
        Object b;
        Object V;
        Object V2;
        Uri uri;
        kaw W;
        Object obj3;
        Object V3;
        Object V4;
        fts ftsVar;
        String str;
        js2 A;
        ccw ccwVar;
        Object Q;
        int i = this.j;
        int i2 = 0;
        int i3 = 3;
        int i4 = 2;
        Object obj4 = this.m;
        ?? r8 = 0;
        r8 = 0;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (((z6v) this.l).c.c((k7v) obj4, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i5 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    mm6 mm6Var = (mm6) this.l;
                    tyi tyiVar = (tyi) obj4;
                    dq4Var = (dq4) tyiVar.h;
                    try {
                        this.l = dq4Var;
                        this.k = 1;
                        if (tyi.c(tyiVar, mm6Var, this) == nm6Var2) {
                            return nm6Var2;
                        }
                        dq4Var2 = dq4Var;
                    } catch (Throwable th) {
                        th = th;
                        Throwable th2 = th;
                        if (dq4Var != null) {
                            try {
                                dq4Var.close();
                            } catch (Throwable th3) {
                                fob.a(th2, th3);
                            }
                        }
                        r8 = th2;
                        if (r8 == 0) {
                        }
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r1 = (Closeable) this.l;
                    try {
                        qgg.h0(obj);
                        dq4Var2 = r1;
                    } catch (Throwable th4) {
                        th = th4;
                        dq4Var = r1;
                        Throwable th22 = th;
                        if (dq4Var != null) {
                        }
                        r8 = th22;
                        if (r8 == 0) {
                        }
                    }
                }
                if (dq4Var2 != null) {
                    try {
                        dq4Var2.close();
                    } catch (Throwable th5) {
                        r8 = th5;
                    }
                }
                if (r8 == 0) {
                    return Unit.a;
                }
                throw r8;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i7 = this.k;
                if (i7 != 0) {
                    if (i7 == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                x0q x0qVar = ((rev) this.l).a;
                o7b o7bVar = new o7b(13);
                this.k = 1;
                x0qVar.collect(o7bVar, this);
                return nm6Var3;
            case 3:
                String str2 = (String) obj4;
                wfv wfvVar = (wfv) this.l;
                nm6 nm6Var4 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    igv igvVar = (igv) wfvVar.k.getValue();
                    this.k = 1;
                    a = uz1.a((uz1) igvVar.a.getValue(), str2, this);
                    if (a == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a = obj;
                }
                String str3 = (String) a;
                xdr xdrVar = wfvVar.n;
                do {
                    value = xdrVar.getValue();
                } while (!xdrVar.k(value, new hfv(str2, str3)));
                return Unit.a;
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar = (pjc) this.l;
                    mhv mhvVar = new mhv((Continuation) null, (thv) obj4);
                    this.k = 1;
                    if (zsd.O(pjcVar, mhvVar, this) == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (((j0q) ((eps) this.l).e).emit((rkd) obj4, this) == nm6Var6) {
                        return nm6Var6;
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 6:
                gnv gnvVar = (gnv) obj4;
                k81 k81Var = gnvVar.a;
                nm6 nm6Var7 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    s5c s5cVar = ((t35) gnvVar.h.getValue()).d.a;
                    this.k = 1;
                    a2 = s5cVar.a(this);
                    break;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        cvl cvlVar2 = (cvl) this.l;
                        qgg.h0(obj);
                        L = obj;
                        cvlVar = cvlVar2;
                        List list2 = (List) L;
                        list = list2;
                        if (list != null || list.isEmpty()) {
                            hag.x(k81Var.a, R.string.context_search_empty_my_music, 0);
                            return Unit.a;
                        }
                        g0l.l(gnvVar.d, cvlVar, hcr.a, list2, gnvVar.b, new w5l(new cvo(wjb.Widget, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60), new jab(qkb.Actions, 1, 1, 0), t7g.n(cvlVar), null), "mobile-widget-playlist-default");
                        return Unit.a;
                    }
                    qgg.h0(obj);
                    a2 = obj;
                }
                cvl cvlVar3 = (cvl) a2;
                if (cvlVar3 == null) {
                    hag.x(k81Var.a, R.string.error_sync_failed, 0);
                    return Unit.a;
                }
                fnv fnvVar = new fnv(gnvVar, r8, i2);
                this.l = cvlVar3;
                this.k = 2;
                L = tyf.L(5000L, fnvVar, this);
                if (L != nm6Var7) {
                    cvlVar = cvlVar3;
                    List list22 = (List) L;
                    list = list22;
                    if (list != null) {
                    }
                    hag.x(k81Var.a, R.string.context_search_empty_my_music, 0);
                    return Unit.a;
                }
                return nm6Var7;
            case 7:
                cnn cnnVar = (cnn) this.l;
                ?? r5 = (View) obj4;
                Object obj5 = nm6.a;
                int i12 = this.k;
                try {
                    if (i12 == 0) {
                        qgg.h0(obj);
                        this.k = 1;
                        Object h0 = zsd.h0(cnnVar.u, new z0i(i4, 15, r8), this);
                        if ((h0 == obj5 ? h0 : Unit.a) == obj5) {
                            return obj5;
                        }
                    } else {
                        if (i12 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    return Unit.a;
                } finally {
                    if (erv.b(r5) == cnnVar) {
                        r5.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                    }
                }
            case 8:
                nm6 nm6Var8 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    vdr vdrVar = (vdr) this.l;
                    lot lotVar = new lot(19, (iei) obj4);
                    this.k = 1;
                    if (vdrVar.collect(lotVar, this) == nm6Var8) {
                        return nm6Var8;
                    }
                } else {
                    if (i13 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj7.f();
                return null;
            case 9:
                auv auvVar = (auv) obj4;
                nm6 nm6Var9 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    zi3 zi3Var = auvVar.g;
                    zi3Var.getClass();
                    si3Var = new si3(zi3Var);
                } else if (i14 == 1) {
                    si3 si3Var2 = (si3) this.l;
                    qgg.h0(obj);
                    si3Var = si3Var2;
                    obj2 = obj;
                    if (!((Boolean) obj2).booleanValue()) {
                        otv otvVar = (otv) si3Var.d();
                        if (otvVar instanceof mtv) {
                            this.l = si3Var;
                            this.k = 2;
                            break;
                        } else if (!(otvVar instanceof ntv)) {
                            if (!(otvVar instanceof ltv)) {
                                b6e.s();
                                return null;
                            }
                            this.l = si3Var;
                            this.k = 4;
                            break;
                        } else {
                            this.l = si3Var;
                            this.k = 3;
                            break;
                        }
                        if (!((Boolean) obj2).booleanValue()) {
                            return Unit.a;
                        }
                    }
                } else {
                    if (i14 != 2 && i14 != 3 && i14 != 4) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    si3 si3Var3 = (si3) this.l;
                    qgg.h0(obj);
                    si3Var = si3Var3;
                }
                this.l = si3Var;
                this.k = 1;
                obj2 = si3Var.c(this);
                break;
            case 10:
                nm6 nm6Var10 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    z50 z50Var = (z50) this.l;
                    fyv fyvVar = new fyv((Continuation) null, (lyv) obj4);
                    this.k = 1;
                    if (zsd.O(z50Var, fyvVar, this) == nm6Var10) {
                        return nm6Var10;
                    }
                } else {
                    if (i15 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 11:
                nm6 nm6Var11 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    rxv rxvVar = ((lyv) this.l).a;
                    jeh jehVar = jeh.b;
                    geh G = hag.G(((azv) ((bzv) obj4)).f);
                    act actVar = myv.a;
                    this.k = 1;
                    if (rxvVar.s(jehVar, G, actVar, this) == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i16 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 12:
                nm6 nm6Var12 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    long g = (u75.g((List) this.l) * 100) + 3600;
                    this.k = 1;
                    if (y2x.o(g, this) == nm6Var12) {
                        return nm6Var12;
                    }
                } else {
                    if (i17 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                ((Function0) obj4).invoke();
                return Unit.a;
            case 13:
                nm6 nm6Var13 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (((t1w) this.l).y.emit((q0w) obj4, this) == nm6Var13) {
                        return nm6Var13;
                    }
                } else {
                    if (i18 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 14:
                String str4 = (String) this.l;
                y1w y1wVar = (y1w) obj4;
                xdr xdrVar2 = y1wVar.f;
                nm6 nm6Var14 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    if (str4.length() == 0 || StringsKt.U(str4)) {
                        xdrVar2.l(null);
                        return Unit.a;
                    }
                    if (!y1wVar.b.g()) {
                        xdrVar2.getClass();
                        xdrVar2.m(null, i2w.a);
                        return Unit.a;
                    }
                    xdrVar2.getClass();
                    xdrVar2.m(null, h2w.a);
                    vzo vzoVar = y1wVar.a;
                    i8q i8qVar = new i8q((String) this.l, false, c0p.d, null, null);
                    rzo rzoVar = rzo.a;
                    this.k = 1;
                    c = vzo.c(vzoVar, i8qVar, 0, false, this, 16);
                    if (c == nm6Var14) {
                        return nm6Var14;
                    }
                } else {
                    if (i19 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    c = obj;
                }
                k8q k8qVar = (k8q) c;
                if (k8qVar != null) {
                    ArrayList<i4p> arrayList = k8qVar.f;
                    collection = new ArrayList();
                    for (i4p i4pVar : arrayList) {
                        if (i4pVar instanceof g3p) {
                            c01 c01Var = ((g3p) i4pVar).b;
                            if (c01Var.e) {
                                String str5 = c01Var.a;
                                String str6 = c01Var.b;
                                co6 co6Var = c01Var.q;
                                CoverPath coverPath = co6Var.a;
                                coverPath.getClass();
                                String pathForSize = coverPath.getPathForSize(wct.s());
                                pathForSize.getClass();
                                u1wVar = new u1w(new x1w(str5, str6, pathForSize, new bsv(c01Var.a, c01Var.b, co6Var.a), false));
                                if (u1wVar == null) {
                                    collection.add(u1wVar);
                                }
                            }
                        }
                        u1wVar = null;
                        if (u1wVar == null) {
                        }
                    }
                } else {
                    collection = c5b.a;
                }
                if (collection.isEmpty()) {
                    xdrVar2.getClass();
                    xdrVar2.m(null, f2w.a);
                } else {
                    g2w g2wVar = new g2w(collection);
                    xdrVar2.getClass();
                    xdrVar2.m(null, g2wVar);
                }
                return Unit.a;
            case 15:
                x2w x2wVar = (x2w) obj4;
                nm6 nm6Var15 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    wstVar = (wst) x2wVar.b.getValue();
                    pjc g2 = ((frt) x2wVar.a.getValue()).g();
                    this.l = wstVar;
                    this.k = 1;
                    g0 = zsd.g0(g2, this);
                    break;
                } else if (i20 == 1) {
                    wstVar = (wst) this.l;
                    qgg.h0(obj);
                    g0 = obj;
                } else {
                    if (i20 != 2) {
                        if (i20 != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        a3 = obj;
                        txr txrVar = (txr) a3;
                        if (Intrinsics.d(txrVar, rxr.a)) {
                            ssg.a(6, "WizardSyncInteractorImpl", "sync failed", null);
                        } else if (!Intrinsics.d(txrVar, sxr.a)) {
                            b6e.s();
                            return null;
                        }
                        return Unit.a;
                    }
                    qgg.h0(obj);
                    vxr vxrVar = (vxr) x2wVar.c.getValue();
                    this.k = 3;
                    a3 = vxrVar.a(this);
                    break;
                }
                this.l = null;
                this.k = 2;
                break;
            case 16:
                nm6 nm6Var16 = nm6.a;
                int i21 = this.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar2 = (pjc) this.l;
                    n6p n6pVar = new n6p(null, (a3w) obj4);
                    this.k = 1;
                    if (zsd.O(pjcVar2, n6pVar, this) == nm6Var16) {
                        return nm6Var16;
                    }
                } else {
                    if (i21 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 17:
                String str7 = (String) obj4;
                a3w a3wVar = (a3w) this.l;
                nm6 nm6Var17 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    k6t k6tVar = a3wVar.a;
                    this.k = 1;
                    b = k6tVar.b(str7, true, this);
                    if (b == nm6Var17) {
                        return nm6Var17;
                    }
                } else {
                    if (i22 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    b = obj;
                }
                rj6 rj6Var = (rj6) b;
                if (rj6Var instanceof pj6) {
                    a3wVar.c.b();
                } else {
                    if (!(rj6Var instanceof qj6)) {
                        b6e.s();
                        return null;
                    }
                    fm1 fm1Var = (fm1) ((qj6) rj6Var).a;
                    if (fm1Var.b().isEmpty()) {
                        return Unit.a;
                    }
                    xdr xdrVar3 = a3wVar.k;
                    xdrVar3.getClass();
                    xdrVar3.m(null, str7);
                    String t = weo.t();
                    boolean c2 = ((zzv) a3wVar.j.getValue()).c();
                    if (((Boolean) a3wVar.g.invoke()).booleanValue()) {
                        g0l g0lVar = a3wVar.e;
                        ArrayList b2 = fm1Var.b();
                        u51 u51Var = fm1Var.b;
                        String str8 = u51Var.a;
                        kxi kxiVar = a3wVar.f;
                        w5l w5lVar = new w5l(new cvo(wjb.WizardScreen, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60), new jab(qkb.Actions, 1, 1, 0), new thj(pkb.Trailer, f1d.g("artist:", str8), 1, 1, ""), null);
                        l3q l3qVar = new l3q(new yc5(str8), new n3q(u51Var.b), k3q.a);
                        nyn nynVar = nyn.a;
                        g0l.p(g0lVar, hcr.a, b2, l3qVar, kxiVar, w5lVar, "mobile-wizard-artist-default", c2 ? s5t.a : r5t.a, null, 768);
                    } else {
                        z6u z6uVar = a3wVar.d;
                        fm1Var.getClass();
                        t.getClass();
                        ((e) ((jyr) z6uVar.c).getValue()).getClass();
                        c j = e.j(fm1Var);
                        z5l z5lVar = (z5l) ((jyr) z6uVar.d).getValue();
                        qe5 h = l3l.h(j, fm1Var.b(), ((kxi) z6uVar.b).a(t));
                        h.d(2);
                        h.i = hyn.e;
                        h.k = true;
                        z5lVar.f(h.b(), c2 ? uyk.b : uyk.a).k(new tot(8, fm1Var));
                        p0w p0wVar = a3wVar.i;
                        nmb.z(p0wVar.a(), p0wVar.b(), wjb.WizardScreen, null, pkb.Trailer, "artist:".concat(str7), null, 0, false, "trailer", "trailer", 0, "trailer", "artist:".concat(str7), 0, t, 52452);
                    }
                }
                return Unit.a;
            case 18:
                nm6 nm6Var18 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    uob uobVar = (uob) ((apo) this.l).b;
                    w77 w77Var = new w77((Function2) obj4, (Continuation) null, 2);
                    this.k = 1;
                    if (x97.V(uobVar, w77Var, this) == nm6Var18) {
                        return nm6Var18;
                    }
                } else {
                    if (i23 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 19:
                nm6 nm6Var19 = nm6.a;
                int i24 = this.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    eno s0 = szf.s0(new nzv((sdr) this.l, 1));
                    lot lotVar2 = new lot(22, (nbg) obj4);
                    this.k = 1;
                    if (s0.collect(lotVar2, this) == nm6Var19) {
                        return nm6Var19;
                    }
                } else {
                    if (i24 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 20:
                eps epsVar = (eps) obj4;
                kaw kawVar = (kaw) this.l;
                gy1 gy1Var = kawVar.b;
                nm6 nm6Var20 = nm6.a;
                int i25 = this.k;
                if (i25 != 0) {
                    if (i25 == 1) {
                        qgg.h0(obj);
                        V2 = obj;
                        return (fts) V2;
                    }
                    if (i25 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    V = obj;
                    return (fts) V;
                }
                qgg.h0(obj);
                boolean a4 = gy1Var.a();
                jyr jyrVar = (jyr) epsVar.e;
                if (a4) {
                    vts vtsVar = (vts) jyrVar.getValue();
                    zvs zvsVar = kawVar.a;
                    vzg vzgVar = kawVar.f;
                    this.k = 1;
                    vtsVar.getClass();
                    V2 = x97.V(dm6.b, new lco(vtsVar, zvsVar, vzgVar, gy1Var, (Continuation) null, 21), this);
                    break;
                } else {
                    vts vtsVar2 = (vts) jyrVar.getValue();
                    zvs zvsVar2 = kawVar.a;
                    be6 be6Var = kawVar.h;
                    maa maaVar = (maa) epsVar.b;
                    vzg vzgVar2 = kawVar.f;
                    String str9 = kawVar.g;
                    this.k = 2;
                    vtsVar2.getClass();
                    V = x97.V(dm6.b, new y7b(vtsVar2, maaVar, zvsVar2, be6Var, vzgVar2, str9, gy1Var, null, 11), this);
                    break;
                }
                return nm6Var20;
            case 21:
                iaw iawVar = (iaw) obj4;
                g7q g7qVar = iawVar.l;
                b7q b7qVar = iawVar.k;
                nm6 nm6Var21 = nm6.a;
                int i26 = this.k;
                try {
                    if (i26 == 0) {
                        qgg.h0(obj);
                        gnh gnhVar = iawVar.n.b;
                        if (gnhVar != null && (uri = gnhVar.a) != null) {
                            W = v3g.W(uri);
                            zss zssVar = iawVar.o;
                            zvs zvsVar3 = W.a;
                            String str10 = W.g;
                            this.l = W;
                            this.k = 1;
                            zssVar.getClass();
                            ssg.a(3, "TrackContentLocker", "lockTrack: " + zvsVar3 + ", playableId: " + str10, null);
                            if (zssVar.b.add(new yss(zvsVar3, str10))) {
                                obj3 = zssVar.a.b.I(zvsVar3, this);
                                if (obj3 != nm6Var21) {
                                    obj3 = Unit.a;
                                }
                                if (obj3 != nm6Var21) {
                                    obj3 = Unit.a;
                                    break;
                                }
                            } else {
                                ssg.a(5, "TrackContentLocker", "already locked: " + zvsVar3, null);
                                obj3 = Unit.a;
                                break;
                            }
                        } else {
                            xq0.x("Uri must be provided for YandexMusicTrackMediaSource");
                            return null;
                        }
                    } else {
                        if (i26 != 1) {
                            if (i26 == 2) {
                                kaw kawVar2 = (kaw) this.l;
                                qgg.h0(obj);
                                W = kawVar2;
                                V4 = obj;
                                ftsVar = (fts) V4;
                                str = W.g;
                                if (str != null) {
                                }
                                iawVar.v.U(ftsVar);
                                if (!W.b.a()) {
                                }
                                iawVar.r = A;
                                Unit unit = Unit.a;
                                iawVar.E(unit, A);
                                return unit;
                            }
                            if (i26 != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kaw kawVar3 = (kaw) this.l;
                            qgg.h0(obj);
                            W = kawVar3;
                            V3 = obj;
                            ftsVar = (fts) V3;
                            str = W.g;
                            if (str != null) {
                                ((xol) iawVar.q.getValue()).d(new vgl(str, ftsVar.a.a, W.h));
                            }
                            iawVar.v.U(ftsVar);
                            if (!W.b.a()) {
                                p9 p9Var = ftsVar.d;
                                if (p9Var instanceof cts) {
                                    onh D = o2g.D(ftsVar);
                                    HlsMediaSource$Factory hlsMediaSource$Factory = new HlsMediaSource$Factory(kg5.y(b7qVar, ftsVar, maa.a));
                                    hlsMediaSource$Factory.i = new l48(28);
                                    A = hlsMediaSource$Factory.d(D);
                                } else if (p9Var instanceof dts) {
                                    A = o2g.C(b7qVar, ftsVar, o2g.D(ftsVar));
                                } else {
                                    if (!(p9Var instanceof bts)) {
                                        throw new x7j();
                                    }
                                    A = o2g.A(b7qVar, ftsVar, o2g.D(ftsVar), g7qVar);
                                }
                            } else {
                                if (!(ftsVar.d instanceof bts)) {
                                    throw new IllegalArgumentException("Failed requirement.");
                                }
                                A = o2g.B(b7qVar, ftsVar, o2g.D(ftsVar), g7qVar);
                            }
                            iawVar.r = A;
                            Unit unit2 = Unit.a;
                            iawVar.E(unit2, A);
                            return unit2;
                        }
                        W = (kaw) this.l;
                        qgg.h0(obj);
                    }
                    gy1 gy1Var2 = W.b;
                    gy1 gy1Var3 = W.b;
                    boolean a5 = gy1Var2.a();
                    jyr jyrVar2 = iawVar.p;
                    if (a5) {
                        vts vtsVar3 = (vts) jyrVar2.getValue();
                        zvs zvsVar4 = W.a;
                        vzg vzgVar3 = W.f;
                        this.l = W;
                        this.k = 2;
                        vtsVar3.getClass();
                        V4 = x97.V(dm6.b, new lco(vtsVar3, zvsVar4, vzgVar3, gy1Var3, (Continuation) null, 21), this);
                        if (V4 == nm6Var21) {
                        }
                        ftsVar = (fts) V4;
                        str = W.g;
                        if (str != null) {
                        }
                        iawVar.v.U(ftsVar);
                        if (!W.b.a()) {
                        }
                        iawVar.r = A;
                        Unit unit22 = Unit.a;
                        iawVar.E(unit22, A);
                        return unit22;
                    }
                    vts vtsVar4 = (vts) jyrVar2.getValue();
                    zvs zvsVar5 = W.a;
                    be6 be6Var2 = W.h;
                    maa maaVar2 = maa.a;
                    vzg vzgVar4 = W.f;
                    String str11 = W.g;
                    this.l = W;
                    this.k = 3;
                    vtsVar4.getClass();
                    V3 = x97.V(dm6.b, new y7b(vtsVar4, maaVar2, zvsVar5, be6Var2, vzgVar4, str11, gy1Var3, null, 11), this);
                    break;
                    return nm6Var21;
                } catch (IOException e) {
                    iawVar.u = e;
                    return Unit.a;
                }
            case 22:
                nm6 nm6Var22 = nm6.a;
                int i27 = this.k;
                if (i27 == 0) {
                    qgg.h0(obj);
                    h7a H0 = zsd.H0((eno) this.l, 1);
                    j9w j9wVar = new j9w((rdk) obj4, r8, i4);
                    this.k = 1;
                    if (zsd.O(H0, j9wVar, this) == nm6Var22) {
                        return nm6Var22;
                    }
                } else {
                    if (i27 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 23:
                nm6 nm6Var23 = nm6.a;
                int i28 = this.k;
                if (i28 == 0) {
                    qgg.h0(obj);
                    fkn fknVar = ((hgl) this.l).b;
                    pjt pjtVar = new pjt((rdk) obj4, r8, 9);
                    this.k = 1;
                    if (zsd.O(fknVar, pjtVar, this) == nm6Var23) {
                        return nm6Var23;
                    }
                } else {
                    if (i28 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 24:
                nm6 nm6Var24 = nm6.a;
                int i29 = this.k;
                if (i29 == 0) {
                    qgg.h0(obj);
                    ccwVar = (ccw) obj4;
                    rn5 rn5Var = ccwVar.c;
                    this.l = ccwVar;
                    this.k = 1;
                    Q = rn5Var.Q(this);
                    break;
                } else {
                    if (i29 != 1) {
                        if (i29 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ccwVar = (ccw) this.l;
                    qgg.h0(obj);
                    Q = obj;
                }
                this.l = null;
                this.k = 2;
                String str12 = ccw.l;
                ccwVar.getClass();
                Object V5 = x97.V(dm6.b, new wa2(ccwVar, (rbw) Q, (Continuation) r8, i3), this);
                if (V5 != nm6Var24) {
                    V5 = Unit.a;
                    break;
                }
                break;
            case 25:
                return k(obj);
            case 26:
                return l(obj);
            case 27:
                return n(obj);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return o(obj);
            default:
                rjc rjcVar = (rjc) this.l;
                nm6 nm6Var25 = nm6.a;
                int i30 = this.k;
                if (i30 == 0) {
                    qgg.h0(obj);
                    this.l = null;
                    this.k = 1;
                    if (rjcVar.emit((Pair) obj4, this) == nm6Var25) {
                        return nm6Var25;
                    }
                } else {
                    if (i30 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y6v(pjc pjcVar, Continuation continuation, Object obj, int i) {
        super(2, continuation);
        this.j = i;
        this.l = pjcVar;
        this.m = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y6v(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y6v(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
    }
}
