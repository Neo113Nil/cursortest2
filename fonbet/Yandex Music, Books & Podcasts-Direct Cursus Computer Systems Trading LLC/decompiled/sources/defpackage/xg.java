package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.yandex.music.databases.main.MainDatabase;
import com.yandex.music.shared.glagol.api.domain.GlagolTargetException;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.passport.api.x1;
import com.yandex.passport.api.y1;
import com.yandex.passport.common.analytics.k;
import com.yandex.passport.common.core.b;
import com.yandex.passport.common.core.f;
import com.yandex.passport.common.network.n;
import com.yandex.passport.internal.account.d;
import com.yandex.passport.internal.analytics.a;
import com.yandex.passport.internal.core.accounts.h;
import com.yandex.passport.internal.l;
import com.yandex.passport.internal.network.client.g;
import com.yandex.passport.internal.report.reporters.f0;
import com.yandex.passport.internal.ui.bouncer.model.b2;
import com.yandex.passport.internal.ui.bouncer.s;
import com.yandex.passport.internal.ui.challenge.c0;
import com.yandex.passport.internal.usecase.r;
import com.yandex.passport.sloth.a0;
import com.yandex.passport.sloth.a1;
import com.yandex.passport.sloth.data.i;
import com.yandex.passport.sloth.data.j;
import com.yandex.passport.sloth.j0;
import com.yandex.passport.sloth.m0;
import com.yandex.passport.sloth.n0;
import com.yandex.passport.sloth.r0;
import com.yandex.passport.sloth.v;
import com.yandex.plus.bdui.flex.factory.e;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xg extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public Object m;
    public Object n;
    public Object o;
    public /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public xg(ryn rynVar, Function1 function1, Function1 function12, Function2 function2, Function2 function22, Function2 function23, Continuation continuation) {
        super(2, continuation);
        this.j = 18;
        this.l = rynVar;
        this.m = (aur) function1;
        this.n = function12;
        this.o = function2;
        this.p = (aur) function22;
        this.q = function23;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0060, code lost:
    
        if (r3.emit(r5, r7) == r0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object A(Object obj) {
        f fVar;
        x0q x0qVar;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            x0q x0qVar2 = ((s) this.n).a;
            fVar = (f) this.o;
            gm5 gm5Var = ((c0) this.p).b;
            this.l = x0qVar2;
            this.m = fVar;
            this.k = 1;
            Object s = gm5Var.s(this);
            if (s != nm6Var) {
                x0qVar = x0qVar2;
                obj = s;
            }
            return nm6Var;
        }
        if (i != 1) {
            if (i == 2) {
                qgg.h0(obj);
                return Unit.a;
            }
            xq0.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        fVar = (f) this.m;
        x0qVar = (x0q) this.l;
        qgg.h0(obj);
        b2 b2Var = new b2(fVar, ((Boolean) obj).booleanValue(), (y1) this.q);
        this.l = null;
        this.m = null;
        this.k = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00fe, code lost:
    
        if (r12.T(r13, r8, r2) != r3) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object B(j7i j7iVar, pjc pjcVar, a0p a0pVar, xqn xqnVar, Continuation continuation) {
        h7i h7iVar;
        int i;
        n1p n1pVar;
        a0p a0pVar2;
        xqn xqnVar2;
        j7i j7iVar2;
        boolean z;
        pjc pjcVar2;
        n1p n1pVar2;
        j7i j7iVar3 = j7iVar;
        if (continuation instanceof h7i) {
            h7iVar = (h7i) continuation;
            int i2 = h7iVar.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h7iVar.s = i2 - Integer.MIN_VALUE;
                Object obj = h7iVar.r;
                nm6 nm6Var = nm6.a;
                i = h7iVar.s;
                if (i != 0) {
                    qgg.h0(obj);
                    boolean booleanValue = ((Boolean) j7iVar3.D.getValue()).booleanValue();
                    n1pVar = (n1p) j7iVar3.C.getValue();
                    h7iVar.j = j7iVar3;
                    h7iVar.k = pjcVar;
                    a0pVar2 = a0pVar;
                    h7iVar.l = a0pVar2;
                    xqnVar2 = xqnVar;
                    h7iVar.m = xqnVar2;
                    h7iVar.n = n1pVar;
                    h7iVar.o = j7iVar3;
                    h7iVar.p = n1pVar;
                    h7iVar.q = booleanValue;
                    h7iVar.s = 1;
                    Object a = j7i.a(j7iVar3, h7iVar);
                    if (a != nm6Var) {
                        j7iVar2 = j7iVar3;
                        z = booleanValue;
                        pjcVar2 = pjcVar;
                        obj = a;
                        n1pVar2 = n1pVar;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    return Unit.a;
                }
                boolean z2 = h7iVar.q;
                n1pVar = h7iVar.p;
                j7i j7iVar4 = h7iVar.o;
                n1p n1pVar3 = h7iVar.n;
                xqnVar2 = h7iVar.m;
                a0p a0pVar3 = h7iVar.l;
                pjcVar2 = h7iVar.k;
                j7iVar2 = h7iVar.j;
                qgg.h0(obj);
                z = z2;
                j7iVar3 = j7iVar4;
                n1pVar2 = n1pVar3;
                a0pVar2 = a0pVar3;
                pjc S = j7iVar3.S(n1pVar, ((Boolean) obj).booleanValue());
                pjc r6iVar = new r6i(pjcVar2, j7iVar2, 2);
                Pair pair = new Pair(a0pVar2.a.a, n1pVar2 == null ? n1pVar2.a : null);
                List list = (List) xqnVar2.a;
                j7iVar2.getClass();
                k6p k6pVar = new k6p(pair, new gcc(j7i.K(list)), n1pVar2, z, j7iVar2.P(), j7iVar2.J, a0pVar2.d == b0p.b, !z ? S : r6iVar);
                h7iVar.j = null;
                h7iVar.k = null;
                h7iVar.l = null;
                h7iVar.m = null;
                h7iVar.n = null;
                h7iVar.o = null;
                h7iVar.p = null;
                h7iVar.q = z;
                h7iVar.s = 2;
            }
        }
        h7iVar = new h7i(continuation);
        Object obj2 = h7iVar.r;
        nm6 nm6Var2 = nm6.a;
        i = h7iVar.s;
        if (i != 0) {
        }
        pjc S2 = j7iVar3.S(n1pVar, ((Boolean) obj2).booleanValue());
        pjc r6iVar2 = new r6i(pjcVar2, j7iVar2, 2);
        Pair pair2 = new Pair(a0pVar2.a.a, n1pVar2 == null ? n1pVar2.a : null);
        List list2 = (List) xqnVar2.a;
        j7iVar2.getClass();
        k6p k6pVar2 = new k6p(pair2, new gcc(j7i.K(list2)), n1pVar2, z, j7iVar2.P(), j7iVar2.J, a0pVar2.d == b0p.b, !z ? S2 : r6iVar2);
        h7iVar.j = null;
        h7iVar.k = null;
        h7iVar.l = null;
        h7iVar.m = null;
        h7iVar.n = null;
        h7iVar.o = null;
        h7iVar.p = null;
        h7iVar.q = z;
        h7iVar.s = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object k(Object obj) {
        mu7 p;
        ou7 ou7Var;
        Bitmap bitmap;
        mu7 mu7Var;
        Object H;
        Bitmap bitmap2;
        Bitmap bitmap3;
        dch dchVar = (dch) this.q;
        x6k x6kVar = dchVar.f;
        mm6 mm6Var = (mm6) this.p;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        Continuation continuation = null;
        if (i == 0) {
            qgg.h0(obj);
            ou7 p2 = x97.p(mm6Var, null, null, new bch(dchVar, continuation, 1), 3);
            ou7 p3 = x97.p(mm6Var, null, null, new bch(dchVar, continuation, 0), 3);
            p = x97.p(mm6Var, null, null, new bch(dchVar, continuation, 2), 3);
            this.p = null;
            this.l = p3;
            this.m = p;
            this.k = 1;
            obj = p2.s(this);
            if (obj != nm6Var) {
                ou7Var = p3;
            }
            return nm6Var;
        }
        if (i != 1) {
            if (i == 2) {
                bitmap = (Bitmap) this.n;
                mu7Var = (mu7) this.m;
                qgg.h0(obj);
                Bitmap bitmap4 = (Bitmap) obj;
                this.p = null;
                this.l = null;
                this.m = null;
                this.n = bitmap;
                this.o = bitmap4;
                this.k = 3;
                H = mu7Var.H(this);
                if (H != nm6Var) {
                    Bitmap bitmap5 = bitmap;
                    bitmap2 = bitmap4;
                    obj = H;
                    bitmap3 = bitmap5;
                    Bitmap bitmap6 = (Bitmap) obj;
                    if (bitmap3 != null) {
                    }
                    x6kVar.setValue(xbh.a);
                    return Unit.a;
                }
                return nm6Var;
            }
            if (i != 3) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bitmap2 = (Bitmap) this.o;
            bitmap3 = (Bitmap) this.n;
            qgg.h0(obj);
            Bitmap bitmap62 = (Bitmap) obj;
            if (bitmap3 != null || bitmap2 == null || bitmap62 == null) {
                x6kVar.setValue(xbh.a);
            } else {
                int width = bitmap62.getWidth();
                int height = bitmap2.getHeight();
                if (width <= 0 || height <= 0 || bitmap3.getWidth() <= 0 || bitmap3.getHeight() <= 0) {
                    StringBuilder l = dfi.l("Invalid dimensions: imageBitmap(", bitmap3.getWidth(), bitmap3.getHeight(), "x", "); target(");
                    l.append(width);
                    l.append("x");
                    l.append(height);
                    l.append(")");
                    Assertions.fail(l.toString());
                } else if (bitmap3.getWidth() != width || bitmap3.getHeight() != height) {
                    float max = Math.max(width / bitmap3.getWidth(), height / bitmap3.getHeight());
                    int width2 = (int) (bitmap3.getWidth() * max);
                    int height2 = (int) (bitmap3.getHeight() * max);
                    bitmap3 = Bitmap.createScaledBitmap(bitmap3, width2, height2, true);
                    bitmap3.getClass();
                    if (width2 > width || height2 > height) {
                        int i2 = (width2 - width) / 2;
                        if (i2 < 0) {
                            i2 = 0;
                        }
                        int i3 = (height2 - height) / 2;
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap3, i2, i3 >= 0 ? i3 : 0, width, height);
                        createBitmap.getClass();
                        bitmap3.recycle();
                        bitmap3 = createBitmap;
                    }
                }
                int width3 = bitmap3.getWidth();
                int height3 = bitmap3.getHeight();
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap createBitmap2 = Bitmap.createBitmap(width3, height3, config);
                createBitmap2.getClass();
                Canvas canvas = new Canvas(createBitmap2);
                Paint paint = new Paint(1);
                canvas.drawBitmap(bitmap3, 0.0f, 0.0f, paint);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                canvas.drawBitmap(bitmap62, 0.0f, 0.0f, paint);
                int width4 = createBitmap2.getWidth();
                int i4 = (int) (width4 * 1.12f);
                int height4 = (int) (createBitmap2.getHeight() * 1.12f);
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, i4, height4, true);
                createScaledBitmap.getClass();
                float f = (i4 - width4) / 2.0f;
                float f2 = (height4 - r2) / 2.0f;
                Bitmap createBitmap3 = Bitmap.createBitmap(i4, height4, config);
                createBitmap3.getClass();
                Canvas canvas2 = new Canvas(createBitmap3);
                Paint paint2 = new Paint(1);
                canvas2.drawBitmap(createScaledBitmap, 0.0f, 0.0f, paint2);
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
                canvas2.drawBitmap(createBitmap2, f, f2, paint2);
                createScaledBitmap.recycle();
                x6kVar.setValue(new ybh(new q33(new yg0(createBitmap3))));
            }
            return Unit.a;
        }
        p = (mu7) this.m;
        ou7Var = (ou7) this.l;
        qgg.h0(obj);
        Bitmap bitmap7 = (Bitmap) obj;
        this.p = null;
        this.l = null;
        this.m = p;
        this.n = bitmap7;
        this.k = 2;
        Object H2 = ou7Var.H(this);
        if (H2 != nm6Var) {
            mu7 mu7Var2 = p;
            bitmap = bitmap7;
            obj = H2;
            mu7Var = mu7Var2;
            Bitmap bitmap42 = (Bitmap) obj;
            this.p = null;
            this.l = null;
            this.m = null;
            this.n = bitmap;
            this.o = bitmap42;
            this.k = 3;
            H = mu7Var.H(this);
            if (H != nm6Var) {
            }
        }
        return nm6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, nm6, oqi] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r4v3, types: [oqi] */
    private final Object l(Object obj) {
        qqi qqiVar;
        lqi lqiVar;
        ?? r2;
        Throwable th;
        lqi lqiVar2;
        oqi oqiVar;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        nqi nqiVar = (nqi) this.p;
        ?? r1 = nm6.a;
        int i = this.k;
        try {
            try {
                if (i == 0) {
                    qgg.h0(obj);
                    mm6 mm6Var = (mm6) this.o;
                    iqi iqiVar = iqi.a;
                    CoroutineContext.Element element = mm6Var.getCoroutineContext().get(o6c.l);
                    element.getClass();
                    lqi lqiVar3 = new lqi((r2f) element);
                    AtomicReference atomicReference3 = nqiVar.a;
                    while (true) {
                        lqi lqiVar4 = (lqi) atomicReference3.get();
                        if (lqiVar4 != null) {
                            iqi iqiVar2 = iqi.a;
                            if (iqiVar2.compareTo(iqiVar2) < 0) {
                                throw new CancellationException("Current mutation had a higher priority");
                            }
                        }
                        while (!atomicReference3.compareAndSet(lqiVar4, lqiVar3)) {
                            if (atomicReference3.get() != lqiVar4) {
                                break;
                            }
                        }
                        if (lqiVar4 != null) {
                            lqiVar4.a.g(new oic("Mutation interrupted", 3));
                        }
                        qqiVar = nqiVar.b;
                        aur aurVar = (aur) this.q;
                        this.o = lqiVar3;
                        this.l = qqiVar;
                        this.m = aurVar;
                        this.n = nqiVar;
                        this.k = 1;
                        if (qqiVar.a(this) != r1) {
                            lqiVar = lqiVar3;
                            r2 = aurVar;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        nqiVar = (nqi) this.m;
                        oqiVar = (oqi) this.l;
                        lqiVar2 = (lqi) this.o;
                        try {
                            qgg.h0(obj);
                            atomicReference2 = nqiVar.a;
                            while (!atomicReference2.compareAndSet(lqiVar2, null) && atomicReference2.get() == lqiVar2) {
                            }
                            oqiVar.b(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = nqiVar.a;
                            while (!atomicReference.compareAndSet(lqiVar2, null)) {
                            }
                            throw th;
                        }
                    }
                    nqiVar = (nqi) this.n;
                    Function1 function1 = (Function1) this.m;
                    ?? r4 = (oqi) this.l;
                    lqiVar = (lqi) this.o;
                    qgg.h0(obj);
                    qqiVar = r4;
                    r2 = function1;
                }
                this.o = lqiVar;
                this.l = qqiVar;
                this.m = nqiVar;
                this.n = null;
                this.k = 2;
                Object invoke = r2.invoke(this);
                if (invoke != r1) {
                    oqiVar = qqiVar;
                    obj = invoke;
                    lqiVar2 = lqiVar;
                    atomicReference2 = nqiVar.a;
                    while (!atomicReference2.compareAndSet(lqiVar2, null)) {
                    }
                    oqiVar.b(null);
                    return obj;
                }
                return r1;
            } catch (Throwable th3) {
                th = th3;
                lqiVar2 = lqiVar;
                atomicReference = nqiVar.a;
                while (!atomicReference.compareAndSet(lqiVar2, null) && atomicReference.get() == lqiVar2) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            r1.b(null);
            throw th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0073, code lost:
    
        if (defpackage.zsd.e0(r0, (defpackage.pjc) r10, r9) != r1) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.functions.Function2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object n(Object obj) {
        ?? r0;
        rjc rjcVar;
        rjc rjcVar2;
        rjc rjcVar3 = (rjc) this.n;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            aur aurVar = (aur) this.o;
            ekk ekkVar = (ekk) this.p;
            String str = (String) this.q;
            this.n = null;
            this.l = rjcVar3;
            this.m = aurVar;
            this.k = 1;
            Object b = ekkVar.b(str, this);
            if (b != nm6Var) {
                r0 = aurVar;
                obj = b;
                rjcVar = rjcVar3;
            }
            return nm6Var;
        }
        if (i == 1) {
            Function2 function2 = (Function2) ((aur) this.m);
            rjcVar = (rjc) this.l;
            qgg.h0(obj);
            r0 = function2;
        } else {
            if (i != 2) {
                if (i == 3) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rjcVar2 = (rjc) this.l;
            qgg.h0(obj);
            this.n = null;
            this.l = null;
            this.k = 3;
        }
        this.n = null;
        this.l = rjcVar;
        this.m = null;
        this.k = 2;
        obj = r0.invoke(obj, this);
        if (obj != nm6Var) {
            rjcVar2 = rjcVar;
            this.n = null;
            this.l = null;
            this.k = 3;
        }
        return nm6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009b  */
    /* JADX WARN: Type inference failed for: r11v1, types: [aur, kotlin.jvm.functions.Function2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object o(Object obj) {
        xqn xqnVar;
        Throwable th;
        xqn xqnVar2;
        kyf kyfVar;
        kyf kyfVar2;
        r2f r2fVar;
        uyf uyfVar;
        nyf nyfVar = (nyf) this.n;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            if (nyfVar.b() == lyf.a) {
                return Unit.a;
            }
            xqn xqnVar3 = new xqn();
            xqnVar = new xqn();
            try {
                lyf lyfVar = (lyf) this.o;
                mm6 mm6Var = (mm6) this.p;
                ?? r11 = (aur) this.q;
                this.l = xqnVar3;
                this.m = xqnVar;
                this.k = 1;
                zt3 zt3Var = new zt3(1, qxe.b(this));
                zt3Var.s();
                kyf.Companion.getClass();
                lyfVar.getClass();
                int ordinal = lyfVar.ordinal();
                if (ordinal == 2) {
                    kyfVar = kyf.ON_CREATE;
                } else if (ordinal == 3) {
                    kyfVar = kyf.ON_START;
                } else if (ordinal != 4) {
                    kyfVar2 = null;
                    oyn oynVar = new oyn(kyfVar2, xqnVar3, mm6Var, iyf.a(lyfVar), zt3Var, rqi.a(), r11);
                    xqnVar.a = oynVar;
                    nyfVar.a(oynVar);
                    if (zt3Var.q() != nm6Var) {
                        return nm6Var;
                    }
                    xqnVar2 = xqnVar3;
                } else {
                    kyfVar = kyf.ON_RESUME;
                }
                kyfVar2 = kyfVar;
                oyn oynVar2 = new oyn(kyfVar2, xqnVar3, mm6Var, iyf.a(lyfVar), zt3Var, rqi.a(), r11);
                xqnVar.a = oynVar2;
                nyfVar.a(oynVar2);
                if (zt3Var.q() != nm6Var) {
                }
            } catch (Throwable th2) {
                th = th2;
                xqnVar2 = xqnVar3;
                r2fVar = (r2f) xqnVar2.a;
                if (r2fVar != null) {
                    r2fVar.g(null);
                }
                uyfVar = (uyf) xqnVar.a;
                if (uyfVar != null) {
                    throw th;
                }
                nyfVar.d(uyfVar);
                throw th;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xqnVar = (xqn) this.m;
            xqnVar2 = (xqn) this.l;
            try {
                qgg.h0(obj);
            } catch (Throwable th3) {
                th = th3;
                r2fVar = (r2f) xqnVar2.a;
                if (r2fVar != null) {
                }
                uyfVar = (uyf) xqnVar.a;
                if (uyfVar != null) {
                }
            }
        }
        r2f r2fVar2 = (r2f) xqnVar2.a;
        if (r2fVar2 != null) {
            r2fVar2.g(null);
        }
        uyf uyfVar2 = (uyf) xqnVar.a;
        if (uyfVar2 != null) {
            nyfVar.d(uyfVar2);
        }
        return Unit.a;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [aur, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v1, types: [aur, kotlin.jvm.functions.Function2] */
    private final Object p(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            ryn rynVar = (ryn) this.l;
            ?? r4 = (aur) this.m;
            Function1 function1 = (Function1) this.n;
            Function2 function2 = (Function2) this.o;
            ?? r7 = (aur) this.p;
            Function2 function22 = (Function2) this.q;
            this.k = 1;
            if (ryn.a(rynVar, r4, function1, function2, r7, function22, this) == nm6Var) {
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

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        if (r9.H(r8) == r2) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object q(Object obj) {
        Throwable th;
        Context context = (Context) this.o;
        aw0 aw0Var = (aw0) this.n;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        try {
        } catch (CancellationException unused) {
        } catch (Throwable th2) {
            this.l = th2;
            this.k = 2;
            aw0Var.a(context, th2);
            if (Unit.a != nm6Var) {
                th = th2;
            }
            return nm6Var;
        }
        if (i == 0) {
            qgg.h0(obj);
            wr5 wr5Var = (wr5) this.m;
            aw0Var.getClass();
            wr5Var.n(new wn5(new yv0(context, aw0Var), -1784282257, true));
            cnn cnnVar = (cnn) this.p;
            this.k = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = (Throwable) this.l;
                qgg.h0(obj);
                gld.K((gjs) this.q, "Error in recomposition coroutine", th);
                return Unit.a;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }

    private final Object s(Object obj) {
        pfm pfmVar = (pfm) this.m;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            d6s d6sVar = new d6s((mm6) this.l, (pyc) this.n, (Function1) this.o, (Function1) this.p, (Function1) this.q, new pqm(pfmVar), null);
            this.k = 1;
            if (xee.v(pfmVar, d6sVar, this) == nm6Var) {
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

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0097, code lost:
    
        if (r14 == r8) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0099, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        if (r14 == r8) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object t(Object obj) {
        xg xgVar;
        qzs qzsVar = (qzs) this.m;
        zvs zvsVar = (zvs) this.n;
        bjm bjmVar = (bjm) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            ssg.a(3, "TrackPreFetchControl", "init() - start prefetching " + zvsVar, null);
            zvs zvsVar2 = (zvs) this.n;
            mqs mqsVar = (mqs) this.o;
            gy1 gy1Var = (gy1) this.p;
            boolean d = Intrinsics.d(mqsVar, ((mwk) ((Pair) this.q).a).a());
            this.l = null;
            this.k = 1;
            xgVar = this;
            obj = qzs.a(qzsVar, bjmVar, zvsVar2, mqsVar, gy1Var, d, xgVar);
        } else {
            if (i != 1) {
                if (i == 2) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
            xgVar = this;
        }
        if (((Boolean) obj).booleanValue()) {
            ssg.a(3, "TrackPreFetchControl", "track prefetch success " + zvsVar, null);
        }
        xgVar.l = null;
        xgVar.k = 2;
        Object y = qzsVar.d.y(10, this);
        if (y != nm6Var) {
            y = Unit.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object u(Object obj) {
        r2f r2fVar;
        rar rarVar;
        drv drvVar = (drv) this.p;
        dzf dzfVar = (dzf) this.o;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        Continuation continuation = null;
        if (i == 0) {
            qgg.h0(obj);
            mm6 mm6Var = (mm6) this.l;
            try {
                iei ieiVar = (iei) ((xqn) this.m).a;
                if (ieiVar != null) {
                    vdr a = erv.a(((View) this.q).getContext().getApplicationContext());
                    ieiVar.a.h(((Number) a.getValue()).floatValue());
                    rarVar = x97.y(mm6Var, null, null, new y6v(a, ieiVar, continuation, 8), 3);
                } else {
                    rarVar = null;
                }
            } catch (Throwable th) {
                th = th;
                r2fVar = null;
            }
            try {
                cnn cnnVar = (cnn) this.n;
                this.l = rarVar;
                this.k = 1;
                if (cnnVar.H(this) == nm6Var) {
                    return nm6Var;
                }
                r2fVar = rarVar;
            } catch (Throwable th2) {
                r2fVar = rarVar;
                th = th2;
                if (r2fVar != null) {
                    r2fVar.g(null);
                }
                dzfVar.getLifecycle().d(drvVar);
                throw th;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r2fVar = (r2f) this.l;
            try {
                qgg.h0(obj);
            } catch (Throwable th3) {
                th = th3;
                if (r2fVar != null) {
                }
                dzfVar.getLifecycle().d(drvVar);
                throw th;
            }
        }
        if (r2fVar != null) {
            r2fVar.g(null);
        }
        dzfVar.getLifecycle().d(drvVar);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0067, code lost:
    
        if (defpackage.fk0.c(r0, r1, r2, null, r16, 12) != r9) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a0, code lost:
    
        if (r1.j0(r16) != r9) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00be, code lost:
    
        if (r1.f(r2, r16) == r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d1, code lost:
    
        if (r7.f(r1, r16) == r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e1, code lost:
    
        if (r6.f(r1, r16) == r9) goto L32;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00e1 -> B:7:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object v(Object obj) {
        mm6 mm6Var;
        fk0 fk0Var = (fk0) this.p;
        fk0 fk0Var2 = (fk0) this.n;
        aqi aqiVar = (aqi) this.q;
        mm6 mm6Var2 = (mm6) this.l;
        nm6 nm6Var = nm6.a;
        Continuation continuation = null;
        switch (this.k) {
            case 0:
                qgg.h0(obj);
                mm6Var = mm6Var2;
                fk0 fk0Var3 = (fk0) this.m;
                Float f = new Float(4.0f);
                act S = weo.S(200, 0, null, 6);
                this.l = mm6Var;
                this.k = 1;
                break;
            case 1:
                qgg.h0(obj);
                mm6Var = mm6Var2;
                aqiVar.setValue(Boolean.TRUE);
                fk0 fk0Var4 = (fk0) this.n;
                Float f2 = new Float(0.8f);
                act S2 = weo.S(200, 0, null, 6);
                this.l = mm6Var;
                this.k = 2;
                if (fk0.c(fk0Var4, f2, S2, null, this, 12) != nm6Var) {
                    mm6Var2 = mm6Var;
                    rar y = x97.y(mm6Var2, null, null, new l1p(fk0Var2, fk0Var, continuation, 7), 3);
                    this.l = mm6Var2;
                    this.k = 3;
                    break;
                }
                return nm6Var;
            case 2:
                qgg.h0(obj);
                rar y2 = x97.y(mm6Var2, null, null, new l1p(fk0Var2, fk0Var, continuation, 7), 3);
                this.l = mm6Var2;
                this.k = 3;
                break;
            case 3:
                qgg.h0(obj);
                ((Function0) this.o).invoke();
                fk0 fk0Var5 = (fk0) this.m;
                Float f3 = new Float(2.0f);
                this.l = mm6Var2;
                this.k = 4;
                break;
            case 4:
                qgg.h0(obj);
                Float f4 = new Float(1.0f);
                this.l = mm6Var2;
                this.k = 5;
                break;
            case 5:
                qgg.h0(obj);
                Float f5 = new Float(0.8f);
                this.l = mm6Var2;
                this.k = 6;
                break;
            case 6:
                qgg.h0(obj);
                mm6Var = mm6Var2;
                aqiVar.setValue(Boolean.FALSE);
                fk0 fk0Var32 = (fk0) this.m;
                Float f6 = new Float(4.0f);
                act S3 = weo.S(200, 0, null, 6);
                this.l = mm6Var;
                this.k = 1;
                break;
            default:
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    private final Object w(Object obj) {
        qdc qdcVar;
        zvs zvsVar;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            qdcVar = ((fys) this.n).b;
            zvs zvsVar2 = (zvs) this.o;
            this.l = qdcVar;
            this.m = zvsVar2;
            this.k = 1;
            if (qdcVar.I(zvsVar2, this) == nm6Var) {
                return nm6Var;
            }
            zvsVar = zvsVar2;
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zvsVar = (zvs) this.m;
            qdcVar = (qdc) this.l;
            qgg.h0(obj);
        }
        try {
            pv9 pv9Var = (pv9) ((eps) this.p).f;
            if (pv9Var != null) {
                pv9Var.t((hka) this.q);
                return Unit.a;
            }
            Intrinsics.j("delegate");
            throw null;
        } finally {
            qdcVar.O(zvsVar);
        }
    }

    private final Object x(Object obj) {
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
        d dVar = (d) this.l;
        r rVar = dVar.j;
        com.yandex.passport.internal.usecase.s sVar = new com.yandex.passport.internal.usecase.s((b) this.m, 0L, dVar.a.a((b) this.m).g((String) this.n, (String) this.o), (x1) this.p, (a) this.q);
        this.k = 1;
        Object g = rVar.g(sVar, this);
        return g == nm6Var ? nm6Var : g;
    }

    private final Object y(Object obj) {
        x1 x1Var = (x1) this.p;
        b bVar = (b) this.m;
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
        d dVar = (d) this.l;
        r rVar = dVar.j;
        a aVar = a.o;
        g a = dVar.a.a(bVar);
        String str = (String) this.n;
        String str2 = (String) this.o;
        String str3 = x1Var.a;
        String str4 = (String) this.q;
        n nVar = a.b;
        com.yandex.passport.internal.credentials.f fVar = a.c;
        String str5 = fVar.c;
        String str6 = fVar.d;
        k kVar = a.f;
        com.yandex.passport.internal.common.d dVar2 = (com.yandex.passport.internal.common.d) a.h;
        Map c = kVar.c(dVar2.a(), dVar2.b());
        str5.getClass();
        str6.getClass();
        c.getClass();
        Object c2 = a.c(nVar.N(new ofr(str5, str6, str, str3, str2, str4, c)), com.yandex.passport.internal.network.client.d.a);
        c2.getClass();
        com.yandex.passport.internal.usecase.s sVar = new com.yandex.passport.internal.usecase.s(bVar, 0L, (com.yandex.passport.common.account.a) c2, x1Var, aVar);
        this.k = 1;
        Object g = rVar.g(sVar, this);
        return g == nm6Var ? nm6Var : g;
    }

    private final Object z(Object obj) {
        l lVar = (l) this.n;
        l lVar2 = (l) this.m;
        com.yandex.passport.internal.links.g gVar = (com.yandex.passport.internal.links.g) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            l lVar3 = lVar2 == null ? lVar : lVar2;
            com.yandex.passport.internal.properties.l lVar4 = (com.yandex.passport.internal.properties.l) this.o;
            this.k = 1;
            obj = com.yandex.passport.internal.links.g.M(gVar, lVar3, lVar4, this);
            if (obj == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        l lVar5 = (l) obj;
        gVar.z.m(new com.yandex.passport.internal.links.d((Uri) this.p, lVar5, (String) this.q, lVar2 != null ? f0.ACCOUNT_WITH_MACHINE_READABLE_LOGIN : lVar != null ? f0.CURRENT_ACCOUNT : lVar5 != null ? f0.AUTOLOGIN : f0.EMPTY));
        return Unit.a;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [aur, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r0v9, types: [aur, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r1v5, types: [aur, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r5v27, types: [aur, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v17, types: [aur, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v25, types: [aur, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r8v12, types: [aur, pyc] */
    /* JADX WARN: Type inference failed for: r8v21, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.j;
        Object obj2 = this.q;
        switch (i) {
            case 0:
                return new xg((q2a) this.o, (yg) this.n, (pg) this.p, (Map) obj2, continuation);
            case 1:
                xg xgVar = new xg((lc4) this.n, (fk0) this.o, (aqi) this.p, (aqi) obj2, continuation, 1);
                xgVar.m = obj;
                return xgVar;
            case 2:
                return new xg((sdr) this.l, (ges) this.m, (fk0) this.n, (b9r) this.o, (aqi) this.p, (aqi) obj2, continuation, 2);
            case 3:
                xg xgVar2 = new xg((mc4) this.m, (k3i) this.n, (ks3) this.o, (s2i) this.p, (lg3) obj2, continuation, 3);
                xgVar2.l = obj;
                return xgVar2;
            case 4:
                return new xg((String) this.n, (e15) this.o, (Integer) this.p, (String) obj2, continuation, 4);
            case 5:
                xg xgVar3 = new xg((ucg) this.o, (kpm) this.p, (t4w) obj2, continuation);
                xgVar3.n = obj;
                return xgVar3;
            case 6:
                xg xgVar4 = new xg((Function1) this.m, (aqi) this.n, (aqi) this.o, (uoi) this.p, (aqi) obj2, continuation, 6);
                xgVar4.l = obj;
                return xgVar4;
            case 7:
                return new xg((xqn) this.m, (ru.yandex.video.m3.player.impl.tracking.a) this.n, (bjb) this.o, (cjb) this.p, (d1) obj2, continuation, 7);
            case 8:
                xg xgVar5 = new xg((Function1) this.p, (String) obj2, continuation);
                xgVar5.o = obj;
                return xgVar5;
            case 9:
                xg xgVar6 = new xg((Context) this.m, (rv0) this.n, (pv0) this.o, (Bundle) this.p, (pyc) obj2, continuation);
                xgVar6.l = obj;
                return xgVar6;
            case 10:
                xg xgVar7 = new xg((i5h) this.n, (String) this.o, (String[]) this.p, (Function1) obj2, continuation);
                xgVar7.m = obj;
                return xgVar7;
            case 11:
                xg xgVar8 = new xg((dch) obj2, continuation);
                xgVar8.p = obj;
                return xgVar8;
            case 12:
                return new xg((j7i) this.m, (ve5) this.n, (pjc) this.o, (a0p) this.p, (xqn) obj2, continuation, 12);
            case 13:
                return new xg((xqn) this.m, (ve5) this.n, (j7i) this.o, (pjc) this.p, (a0p) obj2, continuation, 13);
            case 14:
                xg xgVar9 = new xg((j7i) this.n, (pjc) this.o, (a0p) this.p, (ve5) obj2, continuation, 14);
                xgVar9.m = obj;
                return xgVar9;
            case 15:
                iqi iqiVar = iqi.a;
                xg xgVar10 = new xg((nqi) this.p, (Function1) obj2, continuation);
                xgVar10.o = obj;
                return xgVar10;
            case 16:
                xg xgVar11 = new xg((Function2) this.o, (ekk) this.p, (String) obj2, continuation);
                xgVar11.n = obj;
                return xgVar11;
            case 17:
                return new xg((nyf) this.n, (lyf) this.o, (mm6) this.p, (Function2) obj2, continuation);
            case 18:
                return new xg((ryn) this.l, (Function1) this.m, (Function1) this.n, (Function2) this.o, (Function2) this.p, (Function2) obj2, continuation);
            case 19:
                return new xg((wr5) this.m, (aw0) this.n, (Context) this.o, (cnn) this.p, (gjs) obj2, continuation, 19);
            case 20:
                xg xgVar12 = new xg((pfm) this.m, (pyc) this.n, (Function1) this.o, (Function1) this.p, (Function1) obj2, continuation, 20);
                xgVar12.l = obj;
                return xgVar12;
            case 21:
                xg xgVar13 = new xg((qzs) this.m, (zvs) this.n, (mqs) this.o, (gy1) this.p, (Pair) obj2, continuation, 21);
                xgVar13.l = obj;
                return xgVar13;
            case 22:
                xg xgVar14 = new xg((xqn) this.m, (cnn) this.n, (dzf) this.o, (drv) this.p, (View) obj2, continuation, 22);
                xgVar14.l = obj;
                return xgVar14;
            case 23:
                xg xgVar15 = new xg((fk0) this.m, (fk0) this.n, (Function0) this.o, (fk0) this.p, (aqi) obj2, continuation, 23);
                xgVar15.l = obj;
                return xgVar15;
            case 24:
                return new xg((fys) this.n, (zvs) this.o, continuation, (eps) this.p, (hka) obj2);
            case 25:
                return new xg((d) this.l, (b) this.m, (String) this.n, (String) this.o, (x1) this.p, (a) obj2, continuation, 25);
            case 26:
                return new xg((d) this.l, (b) this.m, (String) this.n, (String) this.o, (x1) this.p, (String) obj2, continuation, 26);
            case 27:
                return new xg((com.yandex.passport.internal.links.g) this.l, (l) this.m, (l) this.n, (com.yandex.passport.internal.properties.l) this.o, (Uri) this.p, (String) obj2, continuation, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new xg((s) this.n, (f) this.o, (c0) this.p, (y1) obj2, continuation, 28);
            default:
                return new xg((j0) this.m, (i) this.n, (String) this.o, (Long) this.p, (String) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 23:
                ((xg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((xg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(10:22|(1:24)|25|(1:27)(1:67)|(6:29|30|34|35|36|37)|66|34|35|36|37) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:3|(1:(1:(1:(1:(5:9|10|(1:12)|13|14)(2:16|17))(3:18|13|14))(5:19|20|(10:22|(1:24)|25|(1:27)(1:67)|(6:29|30|34|35|36|37)|66|34|35|36|37)(6:68|(1:70)|71|(1:73)|74|(5:76|10|(0)|13|14))|39|40))(1:77))(1:85)|78|79|80|81) */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x031c, code lost:
    
        if (B(r2, (defpackage.pjc) r23.p, (defpackage.a0p) r8, r0, r23) == r1) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x036f, code lost:
    
        if (B(r0, (defpackage.pjc) r23.o, (defpackage.a0p) r23.p, (defpackage.xqn) r8, r23) == r1) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03d0, code lost:
    
        if (defpackage.zsd.e0(r0, r2, r23) == r1) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03b0, code lost:
    
        if (r2 == r1) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x045c, code lost:
    
        if (((defpackage.aur) r8).invoke(r7, r0, r23) != r3) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x041c, code lost:
    
        if (r9 == r3) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x049f, code lost:
    
        if (r2 == r1) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x07dc, code lost:
    
        if (r0 != r13) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0741, code lost:
    
        if (r0 != r13) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ca, code lost:
    
        if (r6.equals("magic_link_reg") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ff, code lost:
    
        r6 = com.yandex.passport.sloth.data.j.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x08a4, code lost:
    
        if (defpackage.fk0.c(r0, r1, r2, null, r23, 12) == r11) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:?, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x088d, code lost:
    
        if (r0.f(r1, r23) == r11) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x014b, code lost:
    
        if (r12.d(r1, r23) != r13) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x013f, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d4, code lost:
    
        if (r6.equals("external_action_webview") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x012f, code lost:
    
        r6 = com.yandex.passport.sloth.data.j.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00de, code lost:
    
        if (r6.equals("captcha") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e7, code lost:
    
        if (r6.equals(com.yandex.auth.LegacyAccountType.STRING_LOGIN) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fc, code lost:
    
        if (r6.equals("magic_link_auth") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012c, code lost:
    
        if (r6.equals("smartlock") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0082, code lost:
    
        if (r3 == r13) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0077, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0062, code lost:
    
        if (r12.b(r7, r23) == r13) goto L92;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x08ef  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x08e5  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x091a  */
    /* JADX WARN: Type inference failed for: r2v108 */
    /* JADX WARN: Type inference failed for: r2v109 */
    /* JADX WARN: Type inference failed for: r2v34, types: [int] */
    /* JADX WARN: Type inference failed for: r2v35, types: [r2f] */
    /* JADX WARN: Type inference failed for: r2v39, types: [r2f] */
    /* JADX WARN: Type inference failed for: r2v52, types: [aur, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v68, types: [com.yandex.music.databases.main.MainDatabase] */
    /* JADX WARN: Type inference failed for: r5v11, types: [lcg] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r8v6, types: [aur, pyc] */
    /* JADX WARN: Type inference failed for: r8v7, types: [aur, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:356:0x08e3 -> B:349:0x08e7). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        xgb xgbVar;
        StackTraceElement stackTraceElement;
        String str2;
        Object n;
        yg ygVar;
        yg ygVar2;
        bsj bsjVar;
        mm6 mm6Var;
        si3 it;
        Object c;
        Continuation continuation;
        String e;
        Object b;
        um4 um4Var;
        String e2;
        Object b2;
        um4 um4Var2;
        Object N;
        Object N2;
        AtomicInteger atomicInteger;
        ys3 ys3Var;
        Object r;
        AtomicInteger atomicInteger2;
        ?? r5;
        CancellationException e3;
        Object L;
        xqn xqnVar;
        Object invoke;
        ygd ygdVar;
        Object invoke2;
        String str3;
        kfd kfdVar;
        omp ompVar;
        Object a;
        omp ompVar2;
        Object b3;
        Object s;
        j7i j7iVar;
        Object s2;
        xqn xqnVar2;
        xqn xqnVar3;
        Object a2;
        Throwable th;
        String str4;
        j jVar;
        int i = this.j;
        str = "";
        Object obj2 = this.q;
        int i2 = 1;
        boolean z = false;
        switch (i) {
            case 0:
                Map map = (Map) obj2;
                pg pgVar = (pg) this.p;
                yg ygVar3 = (yg) this.n;
                e eVar = ygVar3.d;
                g06 g06Var = ygVar3.e;
                nm6 nm6Var = nm6.a;
                int i3 = this.k;
                try {
                    if (i3 == 0) {
                        qgg.h0(obj);
                        q2a q2aVar = (q2a) this.o;
                        Object obj3 = (q2aVar == null || (bsjVar = q2aVar.e) == null) ? null : bsjVar.a;
                        try {
                            lah b4 = yg.b(ygVar3, pgVar, map, obj3 instanceof q5f ? (q5f) obj3 : null);
                            r0o r0oVar = new r0o(b4);
                            le3 le3Var = ygVar3.b;
                            pg pgVar2 = (pg) this.p;
                            q2a q2aVar2 = (q2a) this.o;
                            String str5 = (String) g06Var.d;
                            String str6 = str5 == null ? null : str5;
                            v5f v5fVar = (v5f) ((jyr) le3Var.b).getValue();
                            i5f r2 = quj.r(v5fVar.a, new vg(v5fVar, r3));
                            uvg uvgVar = new uvg(b4, new xiu(le3Var, new iwe(i2, r2, swf.X(r2.b, ern.a(t7c.class))), q2aVar2, pgVar2, str6), r0oVar, false);
                            g06Var.s();
                            h hVar = ygVar3.a;
                            this.l = ygVar3;
                            this.m = ygVar3;
                            this.k = 1;
                            hVar.getClass();
                            n = hVar.n(b4, uvgVar, this);
                            if (n == nm6Var) {
                                return nm6Var;
                            }
                            ygVar = ygVar3;
                            ygVar2 = ygVar;
                        } catch (IllegalArgumentException e4) {
                            String str7 = "Failed to create request by query " + pgVar + " (error = " + e4.getMessage() + ")";
                            jyr b5 = btf.b(wg.b);
                            c5b c5bVar = c5b.a;
                            htb htbVar = ((thc) g06Var.c).a;
                            boolean booleanValue = Boolean.FALSE.booleanValue();
                            vhc vhcVar = vhc.d;
                            if (booleanValue && (stackTraceElement = (StackTraceElement) hrg.k(0)) != null) {
                                String fileName = stackTraceElement.getFileName();
                                if (fileName == null) {
                                    fileName = "No file info";
                                }
                                String methodName = stackTraceElement.getMethodName();
                                Integer num = new Integer(stackTraceElement.getLineNumber());
                                Integer num2 = num.intValue() > 0 ? num : null;
                                if (num2 == null || (str2 = num2.toString()) == null) {
                                    str2 = "No line info";
                                }
                                vhcVar = new vhc(fileName, methodName, str2);
                            }
                            g06Var.N(yhc.DEBUG, str7, b5, c5bVar, vhcVar.a, vhcVar.b, vhcVar.c);
                            return new s3o(e4);
                        }
                    } else {
                        if (i3 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        yg ygVar4 = (yg) this.m;
                        yg ygVar5 = (yg) this.l;
                        qgg.h0(obj);
                        ygVar2 = ygVar5;
                        ygVar = ygVar4;
                        n = obj;
                    }
                    nah nahVar = (nah) n;
                    ygVar.getClass();
                    ygVar.d(nahVar.b);
                    oun ounVar = (oun) nahVar.a;
                    xye xyeVar = xye.a;
                    yg.c(ygVar2, ounVar, pgVar, map, xgb.ACTION_SERVICE_PARSE_ERROR);
                    return ounVar;
                } catch (kah e5) {
                    String str8 = e5.a.e;
                    int ordinal = e5.b.ordinal();
                    if (ordinal == 0) {
                        eVar.g(pgVar, str8, e5, e5.a.c);
                    } else {
                        if (ordinal != 1) {
                            throw new x7j();
                        }
                        eVar.f(pgVar, str8, e5);
                    }
                    ygVar3.d(e5.a);
                    s3o s3oVar = new s3o(e5);
                    pg pgVar3 = (pg) this.p;
                    Map map2 = (Map) obj2;
                    int ordinal2 = e5.b.ordinal();
                    if (ordinal2 == 0) {
                        xgbVar = xgb.ACTION_SERVICE_REQUEST_ERROR;
                    } else {
                        if (ordinal2 != 1) {
                            throw new x7j();
                        }
                        xgbVar = xgb.ACTION_SERVICE_PARSE_ERROR;
                    }
                    ygVar3.e(s3oVar, pgVar3, map2, xgbVar, e5);
                    return s3oVar;
                } finally {
                    g06Var.r();
                }
            case 1:
                lc4 lc4Var = (lc4) this.n;
                nm6 nm6Var2 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    mm6Var = (mm6) this.m;
                    it = lc4Var.iterator();
                    this.m = mm6Var;
                    this.l = it;
                    this.k = 1;
                    c = it.c(this);
                    if (c == nm6Var2) {
                    }
                    if (((Boolean) c).booleanValue()) {
                    }
                } else {
                    if (i4 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (si3) this.l;
                    mm6Var = (mm6) this.m;
                    qgg.h0(obj);
                    c = obj;
                    if (((Boolean) c).booleanValue()) {
                        Object d = it.d();
                        Object b6 = gd4.b(lc4Var.k());
                        x97.y(mm6Var, null, null, new v3(b6 == null ? d : b6, (fk0) this.o, (aqi) this.p, (aqi) obj2, (Continuation) null, 6), 3);
                        this.m = mm6Var;
                        this.l = it;
                        this.k = 1;
                        c = it.c(this);
                        if (c == nm6Var2) {
                            return nm6Var2;
                        }
                        if (((Boolean) c).booleanValue()) {
                            return Unit.a;
                        }
                    }
                }
            case 2:
                fk0 fk0Var = (fk0) this.n;
                nm6 nm6Var3 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    ((aqi) this.p).setValue((ges) ((sdr) this.l).getValue());
                    ((aqi) obj2).setValue((ges) this.m);
                    Float f = new Float(0.0f);
                    this.k = 1;
                    break;
                } else {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Float f2 = new Float(1.0f);
                b9r b9rVar = (b9r) this.o;
                this.k = 2;
                break;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    ga3 ga3Var = new ga3((mc4) this.m, (k3i) this.n, (ks3) this.o, (s2i) this.p, (rjc) this.l, (lg3) obj2, (Continuation) null);
                    this.k = 1;
                    if (gld.Q(ga3Var, this) == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 4:
                String str9 = (String) obj2;
                Integer num3 = (Integer) this.p;
                e15 e15Var = (e15) this.o;
                String str10 = (String) this.n;
                nm6 nm6Var5 = nm6.a;
                int i7 = this.k;
                Continuation continuation2 = null;
                if (i7 == 0) {
                    qgg.h0(obj);
                    if (str10.length() == 0) {
                        return new ArrayList();
                    }
                    if (((Boolean) e15Var.a.invoke()).booleanValue()) {
                        um4 um4Var3 = new um4(pgp.a);
                        um4Var3.g("track_type", gys.MyMusicWithKids.a);
                        um4Var3.c("liked", true);
                        um4Var3.c("track_for_kids", false);
                        if (num3 != null) {
                            str = "LIMIT " + num3;
                        }
                        StringBuilder m = f1d.m("\n                |SELECT\n                |   *\n                |FROM track_mview\n                |JOIN\n                    |(SELECT\n                    |playlist_track.position as column_position, playlist_track.track_id as column_track_id, playlist_track.timestamp as playlistTrackTimestamp\n                    |FROM playlist_track\n                    |JOIN\n                    |   playlist ON playlist._id=playlist_track.playlist_id\n                    |WHERE\n                    |   original_id=3 AND uid=", str10, "\n                    |) as playlist\n                |ON\n                |   playlist.column_track_id=track_mview.real_id\n                |WHERE\n                |   ", um4Var3.l(), "\n                |ORDER BY\n                |   playlistTrackTimestamp DESC,\n                |   playlist.column_position\n                |");
                        m.append(str);
                        m.append("\n                ");
                        e2 = hlr.e(m.toString());
                        i5h g = e15Var.g();
                        this.l = um4Var3;
                        this.m = e2;
                        this.k = 1;
                        b2 = g.b(str9, this);
                        if (b2 != nm6Var5) {
                            um4Var2 = um4Var3;
                            ueo ueoVar = (ueo) b2;
                            p05 p05Var = new p05(ueoVar, continuation2, e2, um4Var2, 0);
                            this.l = null;
                            this.m = null;
                            this.k = 2;
                            N = tyf.N(ueoVar, p05Var, this);
                        }
                    } else {
                        continuation = null;
                        um4 um4Var4 = new um4(pgp.a);
                        um4Var4.g("track_type", gys.MyMusicWithKids.a);
                        um4Var4.c("track_for_kids", false);
                        if (num3 != null) {
                            str = "LIMIT " + num3;
                        }
                        StringBuilder m2 = f1d.m("\n            |SELECT\n            |   *\n            |FROM track_mview\n            |JOIN\n                |(SELECT\n                |playlist_track.position as column_position, playlist_track.track_id as column_track_id, playlist_track.timestamp as playlistTrackTimestamp\n                |FROM playlist_track\n                |JOIN\n                |   playlist ON playlist._id=playlist_track.playlist_id\n                |WHERE\n                |   original_id=3 AND uid=", str10, "\n                |) as playlist\n            |ON\n            |   playlist.column_track_id=track_mview.original_id\n            |WHERE\n            |   ", um4Var4.l(), "\n            |ORDER BY\n            |   playlist.playlistTrackTimestamp DESC,\n            |   playlist.column_position\n            |");
                        m2.append(str);
                        m2.append("\n            ");
                        e = hlr.e(m2.toString());
                        i5h g2 = e15Var.g();
                        this.l = um4Var4;
                        this.m = e;
                        this.k = 3;
                        b = g2.b(str9, this);
                        if (b != nm6Var5) {
                            um4Var = um4Var4;
                            ueo ueoVar2 = (ueo) b;
                            p05 p05Var2 = new p05(ueoVar2, continuation, e, um4Var, 1);
                            this.l = continuation;
                            this.m = continuation;
                            this.k = 4;
                            N2 = tyf.N(ueoVar2, p05Var2, this);
                        }
                    }
                    return nm6Var5;
                }
                if (i7 == 1) {
                    e2 = (String) this.m;
                    um4 um4Var5 = (um4) this.l;
                    qgg.h0(obj);
                    um4Var2 = um4Var5;
                    b2 = obj;
                    ueo ueoVar3 = (ueo) b2;
                    p05 p05Var3 = new p05(ueoVar3, continuation2, e2, um4Var2, 0);
                    this.l = null;
                    this.m = null;
                    this.k = 2;
                    N = tyf.N(ueoVar3, p05Var3, this);
                    break;
                } else {
                    if (i7 == 2) {
                        qgg.h0(obj);
                        N = obj;
                        List list = (List) N;
                        ArrayList arrayList = new ArrayList(v75.o(list, 10));
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(ngg.M((rxs) it2.next()));
                        }
                        return arrayList;
                    }
                    if (i7 == 3) {
                        e = (String) this.m;
                        um4 um4Var6 = (um4) this.l;
                        qgg.h0(obj);
                        b = obj;
                        um4Var = um4Var6;
                        continuation = null;
                        ueo ueoVar22 = (ueo) b;
                        p05 p05Var22 = new p05(ueoVar22, continuation, e, um4Var, 1);
                        this.l = continuation;
                        this.m = continuation;
                        this.k = 4;
                        N2 = tyf.N(ueoVar22, p05Var22, this);
                        break;
                    } else {
                        if (i7 != 4) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        N2 = obj;
                        List list2 = (List) N2;
                        ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(ngg.M((rxs) it3.next()));
                        }
                        return arrayList2;
                    }
                }
            case 5:
                ucg ucgVar = (ucg) this.o;
                nm6 nm6Var6 = nm6.a;
                ?? r22 = this.k;
                try {
                    try {
                        if (r22 == 0) {
                            qgg.h0(obj);
                            mm6 mm6Var2 = (mm6) this.n;
                            atomicInteger = new AtomicInteger(-256);
                            ys3 b7 = ucgVar.b();
                            ys3Var = b7;
                            rar y = x97.y(mm6Var2, null, null, new v3((kpm) this.p, (t4w) obj2, atomicInteger, b7, (Continuation) null, 24), 3);
                            try {
                                this.n = atomicInteger;
                                this.l = ys3Var;
                                this.m = y;
                                this.k = 1;
                                r = pcg.r(ys3Var, this);
                                r22 = y;
                                if (r == nm6Var6) {
                                    return nm6Var6;
                                }
                            } catch (CancellationException e6) {
                                e3 = e6;
                                r5 = ys3Var;
                                atomicInteger2 = atomicInteger;
                                String str11 = y96.a;
                                jsg.j().f(str11, "Delegated worker " + ucgVar.getClass() + " was cancelled", e3);
                                r3 = atomicInteger2.get() != -256 ? 1 : 0;
                                if (r5.isCancelled() || r3 == 0) {
                                    throw e3;
                                }
                                throw new t96(atomicInteger2.get());
                            }
                        } else {
                            if (r22 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            rar rarVar = (rar) this.m;
                            r5 = (lcg) this.l;
                            atomicInteger2 = (AtomicInteger) this.n;
                            try {
                                qgg.h0(obj);
                                atomicInteger = atomicInteger2;
                                ys3Var = r5;
                                r = obj;
                                r22 = rarVar;
                            } catch (CancellationException e7) {
                                e3 = e7;
                                String str112 = y96.a;
                                jsg.j().f(str112, "Delegated worker " + ucgVar.getClass() + " was cancelled", e3);
                                if (atomicInteger2.get() != -256) {
                                }
                                if (r5.isCancelled()) {
                                }
                                throw e3;
                            }
                        }
                        tcg tcgVar = (tcg) r;
                        r22.g(null);
                        return tcgVar;
                    } catch (Throwable th2) {
                        String str12 = y96.a;
                        jsg.j().f(str12, "Delegated worker " + ucgVar.getClass() + " threw exception in startWork.", th2);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    r22.g(null);
                    throw th3;
                }
            case 6:
                aqi aqiVar = (aqi) this.n;
                pfm pfmVar = (pfm) this.l;
                nm6 nm6Var7 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    Function1 function1 = (Function1) this.m;
                    aqi aqiVar2 = (aqi) this.o;
                    ti6 ti6Var = new ti6(function1, aqiVar, aqiVar2, i2);
                    vi6 vi6Var = new vi6((uoi) this.p, function1, aqiVar, aqiVar2, null, 1);
                    ui6 ui6Var = new ui6(aqiVar, (aqi) obj2, i2);
                    this.l = null;
                    this.k = 1;
                    if (g6s.e(pfmVar, ti6Var, vi6Var, ui6Var, this, 1) == nm6Var7) {
                        return nm6Var7;
                    }
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 7:
                ru.yandex.video.m3.player.impl.tracking.a aVar = (ru.yandex.video.m3.player.impl.tracking.a) this.n;
                xqn xqnVar4 = (xqn) this.m;
                nm6 nm6Var8 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    g68 g68Var = new g68(aVar, z ? 1 : 0, 11);
                    this.l = xqnVar4;
                    this.k = 1;
                    L = tyf.L(1000L, g68Var, this);
                    if (L == nm6Var8) {
                        return nm6Var8;
                    }
                    xqnVar = xqnVar4;
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xqnVar = (xqn) this.l;
                    qgg.h0(obj);
                    L = obj;
                }
                xqnVar.a = L;
                List list3 = ru.yandex.video.m3.player.impl.tracking.a.q;
                aVar.l((bjb) this.o, (Map) xqnVar4.a, (cjb) this.p, (d1) obj2);
                return Unit.a;
            case 8:
                Function2 function2 = (Function2) this.o;
                nm6 nm6Var9 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    ?? r23 = (aur) this.p;
                    this.o = function2;
                    this.k = 1;
                    invoke = r23.invoke(this);
                    break;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kfd kfdVar2 = (kfd) this.n;
                        String str13 = (String) this.m;
                        ygdVar = (ygd) this.l;
                        qgg.h0(obj);
                        kfdVar = kfdVar2;
                        str3 = str13;
                        invoke2 = obj;
                        return new lfd(kfdVar, str3, ygdVar, new Double(((Number) invoke2).doubleValue()), (String) obj2);
                    }
                    qgg.h0(obj);
                    invoke = obj;
                }
                ygdVar = ((mgd) invoke).a;
                if (ygdVar == null) {
                    throw new GlagolTargetException("Track descriptor is null");
                }
                String str14 = ygdVar.a;
                kfd kfdVar3 = kfd.TRACK;
                this.o = null;
                this.l = ygdVar;
                this.m = str14;
                this.n = kfdVar3;
                this.k = 2;
                invoke2 = function2.invoke(ygdVar, this);
                if (invoke2 != nm6Var9) {
                    str3 = str14;
                    kfdVar = kfdVar3;
                    return new lfd(kfdVar, str3, ygdVar, new Double(((Number) invoke2).doubleValue()), (String) obj2);
                }
                return nm6Var9;
            case 9:
                rv0 rv0Var = (rv0) this.n;
                int i11 = rv0Var.a;
                Context context = (Context) this.m;
                nm6 nm6Var10 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    ompVar = (omp) this.l;
                    String x = ot0.x(i11);
                    this.l = ompVar;
                    this.k = 1;
                    a = ompVar.a(context, x, this);
                    break;
                } else if (i12 == 1) {
                    ompVar = (omp) this.l;
                    qgg.h0(obj);
                    a = obj;
                } else if (i12 == 2) {
                    ompVar2 = (omp) this.l;
                    qgg.h0(obj);
                    ompVar = ompVar2;
                    aw0 aw0Var = (aw0) ompVar.a.get(ot0.x(i11));
                    aw0Var.getClass();
                    this.l = null;
                    this.k = 3;
                    break;
                } else {
                    if (i12 == 3) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!((Boolean) a).booleanValue()) {
                    aw0 aw0Var2 = new aw0((pv0) this.o, rv0Var, (Bundle) this.p, 248);
                    this.l = ompVar;
                    this.k = 2;
                    if (ompVar.b(context, aw0Var2, this) != nm6Var10) {
                        ompVar2 = ompVar;
                        ompVar = ompVar2;
                    }
                    return nm6Var10;
                }
                aw0 aw0Var3 = (aw0) ompVar.a.get(ot0.x(i11));
                aw0Var3.getClass();
                this.l = null;
                this.k = 3;
            case 10:
                rjc rjcVar = (rjc) this.m;
                nm6 nm6Var11 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    i5h i5hVar = (i5h) this.n;
                    String str15 = (String) this.o;
                    this.m = null;
                    this.l = rjcVar;
                    this.k = 1;
                    b3 = i5hVar.b(str15, this);
                    break;
                } else {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rjcVar = (rjc) this.l;
                    qgg.h0(obj);
                    b3 = obj;
                }
                String[] strArr = (String[]) this.p;
                clc G = ((MainDatabase) b3).G((String[]) Arrays.copyOf(strArr, strArr.length), (aur) obj2);
                this.m = null;
                this.l = null;
                this.k = 2;
                break;
            case 11:
                return k(obj);
            case 12:
                j7i j7iVar2 = (j7i) this.m;
                nm6 nm6Var12 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    gm5 gm5Var = ((ve5) this.n).b;
                    this.l = j7iVar2;
                    this.k = 1;
                    s = gm5Var.s(this);
                    if (s != nm6Var12) {
                        j7iVar = j7iVar2;
                    }
                    return nm6Var12;
                }
                if (i14 != 1) {
                    if (i14 == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j7i j7iVar3 = (j7i) this.l;
                qgg.h0(obj);
                j7iVar = j7iVar3;
                s = obj;
                j7iVar.J = (zrj) s;
                this.l = null;
                this.k = 2;
                break;
            case 13:
                xqn xqnVar5 = (xqn) this.m;
                nm6 nm6Var13 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    gm5 gm5Var2 = ((ve5) this.n).c;
                    this.l = xqnVar5;
                    this.k = 1;
                    s2 = gm5Var2.s(this);
                    if (s2 != nm6Var13) {
                        xqnVar2 = xqnVar5;
                    }
                    return nm6Var13;
                }
                if (i15 != 1) {
                    if (i15 == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xqn xqnVar6 = (xqn) this.l;
                qgg.h0(obj);
                xqnVar2 = xqnVar6;
                s2 = obj;
                xqnVar2.a = s2;
                j7i j7iVar4 = (j7i) this.o;
                j7iVar4.F.a = (List) xqnVar5.a;
                this.l = null;
                this.k = 2;
                break;
            case 14:
                j7i j7iVar5 = (j7i) this.n;
                mm6 mm6Var3 = (mm6) this.m;
                nm6 nm6Var14 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    xqn i17 = hrg.i(obj);
                    Object obj4 = j7iVar5.F.a;
                    if (obj4 == null) {
                        obj4 = c5b.a;
                    }
                    i17.a = obj4;
                    pjc pjcVar = (pjc) this.o;
                    a0p a0pVar = (a0p) this.p;
                    this.m = mm6Var3;
                    this.l = i17;
                    this.k = 1;
                    if (B(j7iVar5, pjcVar, a0pVar, i17, this) == nm6Var14) {
                        return nm6Var14;
                    }
                    xqnVar3 = i17;
                } else {
                    if (i16 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xqn xqnVar7 = (xqn) this.l;
                    qgg.h0(obj);
                    xqnVar3 = xqnVar7;
                }
                Continuation continuation3 = null;
                xqn xqnVar8 = xqnVar3;
                x97.y(mm6Var3, null, null, new xg(j7iVar5, (ve5) obj2, (pjc) this.o, (a0p) this.p, xqnVar8, continuation3, 12), 3);
                x97.y(mm6Var3, null, null, new xg(xqnVar8, (ve5) obj2, j7iVar5, (pjc) this.o, (a0p) this.p, continuation3, 13), 3);
                Continuation continuation4 = null;
                x97.y(mm6Var3, null, null, new f7i(j7iVar5, (pjc) this.o, (a0p) this.p, xqnVar8, continuation4, 0), 3);
                x97.y(mm6Var3, null, null, new f7i(j7iVar5, (pjc) this.o, (a0p) this.p, xqnVar8, continuation4, 1), 3);
                if (j7iVar5.X > 0) {
                    x97.y(mm6Var3, null, null, new hkc(2000 - (j7iVar5.N().a() - j7iVar5.X), j7iVar5, (pjc) this.o, (a0p) this.p, xqnVar8, (Continuation) null), 3);
                }
                return Unit.a;
            case 15:
                return l(obj);
            case 16:
                return n(obj);
            case 17:
                return o(obj);
            case 18:
                return p(obj);
            case 19:
                return q(obj);
            case 20:
                return s(obj);
            case 21:
                return t(obj);
            case 22:
                return u(obj);
            case 23:
                return v(obj);
            case 24:
                return w(obj);
            case 25:
                return x(obj);
            case 26:
                return y(obj);
            case 27:
                return z(obj);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return A(obj);
            default:
                String str16 = (String) this.o;
                j0 j0Var = (j0) this.m;
                a1 a1Var = j0Var.d;
                v vVar = j0Var.e;
                nm6 nm6Var15 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.sloth.n nVar = new com.yandex.passport.sloth.n(true);
                    this.k = 1;
                    break;
                } else {
                    if (i18 != 1) {
                        if (i18 != 2) {
                            if (i18 == 3) {
                                qgg.h0(obj);
                                return Unit.a;
                            }
                            if (i18 != 4) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            th = (Throwable) this.l;
                            qgg.h0(obj);
                            com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "authByCookie failed", th);
                            }
                            return Unit.a;
                        }
                        qgg.h0(obj);
                        a2 = ((z7o) obj).a;
                        String str17 = (String) obj2;
                        Throwable a3 = z7o.a(a2);
                        int i19 = 16;
                        if (a3 == null) {
                            l lVar = (l) a2;
                            a1Var.a(new n0(i19, r0.SUCCESS, dfi.n("analytics_from", str17 != null ? str17 : "")));
                            f fVar = lVar.b;
                            j.a.getClass();
                            if (str17 != null) {
                                Locale locale = Locale.US;
                                str4 = ouj.s(locale, str17, locale);
                            } else {
                                str4 = null;
                            }
                            if (str4 != null) {
                                switch (str4.hashCode()) {
                                    case -1443344780:
                                        break;
                                    case -1350309703:
                                        if (str4.equals("registration")) {
                                            jVar = j.d;
                                            break;
                                        }
                                        break;
                                    case -1339101303:
                                        if (str4.equals("auth_neo_phonish")) {
                                            jVar = j.g;
                                            break;
                                        }
                                        break;
                                    case -1036654616:
                                        if (str4.equals("auth_by_sms")) {
                                            jVar = j.f;
                                            break;
                                        }
                                        break;
                                    case -790428997:
                                        break;
                                    case -2766731:
                                        if (str4.equals("reg_neo_phonish")) {
                                            jVar = j.h;
                                            break;
                                        }
                                        break;
                                    case 103149417:
                                        break;
                                    case 552567418:
                                        break;
                                    case 1645700580:
                                        break;
                                    case 2052728097:
                                        break;
                                }
                                String str18 = Uri.parse(str16).getQueryParameter("additional_action_result");
                                m0 m0Var = new m0(lVar, fVar, jVar, str18);
                                this.l = null;
                                this.k = 3;
                                break;
                            }
                            jVar = j.b;
                            String str182 = Uri.parse(str16).getQueryParameter("additional_action_result");
                            m0 m0Var2 = new m0(lVar, fVar, jVar, str182);
                            this.l = null;
                            this.k = 3;
                        } else {
                            r0 r0Var = r0.FAILURE;
                            if (str17 == null) {
                                str17 = "";
                            }
                            Pair pair = new Pair("analytics_from", str17);
                            String message = a3.getMessage();
                            a1Var.a(new n0(i19, r0Var, uah.e(pair, new Pair(Constants.KEY_MESSAGE, message != null ? message : ""), new Pair("throwable", fob.b(a3)))));
                            a0 a0Var = new a0(a3, "authorizeByCookie");
                            this.l = a3;
                            this.k = 4;
                            if (vVar.c(a0Var, this) != nm6Var15) {
                                th = a3;
                                com.yandex.passport.common.logger.d dVar2 = com.yandex.passport.common.logger.a.a;
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                }
                                return Unit.a;
                            }
                        }
                        return nm6Var15;
                    }
                    qgg.h0(obj);
                }
                com.yandex.passport.internal.sloth.i iVar = j0Var.b;
                i iVar2 = (i) this.n;
                String str19 = Uri.parse(str16).getQueryParameter("track_id");
                Long l = (Long) this.p;
                this.k = 2;
                a2 = iVar.a(iVar2, str19, l, this);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public xg(nyf nyfVar, lyf lyfVar, mm6 mm6Var, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.j = 17;
        this.n = nyfVar;
        this.o = lyfVar;
        this.p = mm6Var;
        this.q = (aur) function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg(ucg ucgVar, kpm kpmVar, t4w t4wVar, Continuation continuation) {
        super(2, continuation);
        this.j = 5;
        this.o = ucgVar;
        this.p = kpmVar;
        this.q = t4wVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public xg(i5h i5hVar, String str, String[] strArr, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.j = 10;
        this.n = i5hVar;
        this.o = str;
        this.p = strArr;
        this.q = (aur) function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg(dch dchVar, Continuation continuation) {
        super(2, continuation);
        this.j = 11;
        this.q = dchVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public xg(nqi nqiVar, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.j = 15;
        iqi iqiVar = iqi.a;
        this.p = nqiVar;
        this.q = (aur) function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg(q2a q2aVar, yg ygVar, pg pgVar, Map map, Continuation continuation) {
        super(2, continuation);
        this.j = 0;
        this.o = q2aVar;
        this.n = ygVar;
        this.p = pgVar;
        this.q = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg(fys fysVar, zvs zvsVar, Continuation continuation, eps epsVar, hka hkaVar) {
        super(2, continuation);
        this.j = 24;
        this.n = fysVar;
        this.o = zvsVar;
        this.p = epsVar;
        this.q = hkaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public xg(Context context, rv0 rv0Var, pv0 pv0Var, Bundle bundle, pyc pycVar, Continuation continuation) {
        super(2, continuation);
        this.j = 9;
        this.m = context;
        this.n = rv0Var;
        this.o = pv0Var;
        this.p = bundle;
        this.q = (aur) pycVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xg(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
        this.o = obj4;
        this.p = obj5;
        this.q = obj6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xg(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.n = obj2;
        this.o = obj3;
        this.p = obj4;
        this.q = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xg(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.n = obj;
        this.o = obj2;
        this.p = obj3;
        this.q = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public xg(Function1 function1, String str, Continuation continuation) {
        super(2, continuation);
        this.j = 8;
        this.p = (aur) function1;
        this.q = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public xg(Function2 function2, ekk ekkVar, String str, Continuation continuation) {
        super(2, continuation);
        this.j = 16;
        this.o = (aur) function2;
        this.p = ekkVar;
        this.q = str;
    }
}
