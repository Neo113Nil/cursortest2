package defpackage;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.yandex.passport.common.logger.a;
import com.yandex.passport.internal.provider.communication.b;
import com.yandex.passport.internal.provider.communication.r;
import com.yandex.passport.internal.ui.sloth.authsdk.h0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class j5 implements nw0 {
    public final Object a;
    public Object b;
    public Object c;

    public j5(Class cls, fo... foVarArr) {
        this.a = cls;
        HashMap hashMap = new HashMap();
        for (fo foVar : foVarArr) {
            boolean containsKey = hashMap.containsKey(foVar.a);
            Class cls2 = foVar.a;
            if (containsKey) {
                xq0.x(tlm.i(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                throw null;
            }
            hashMap.put(cls2, foVar);
        }
        if (foVarArr.length > 0) {
            this.c = foVarArr[0].a;
        } else {
            this.c = Void.class;
        }
        this.b = Collections.unmodifiableMap(hashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005a, code lost:
    
        if (r10 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object u(j5 j5Var, Message message, cg6 cg6Var) {
        b bVar;
        int i;
        Messenger messenger;
        if (cg6Var instanceof b) {
            bVar = (b) cg6Var;
            int i2 = bVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.n = i2 - Integer.MIN_VALUE;
                Object obj = bVar.l;
                nm6 nm6Var = nm6.a;
                i = bVar.n;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    j5Var.a();
                    msa msaVar = nsa.b;
                    long M = yd5.M(20, ssa.SECONDS);
                    r1w r1wVar = new r1w(j5Var, continuation, 14);
                    bVar.j = j5Var;
                    bVar.k = message;
                    bVar.n = 1;
                    obj = tyf.M(M, r1wVar, bVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    message = bVar.k;
                    j5Var = bVar.j;
                    qgg.h0(obj);
                }
                messenger = (Messenger) obj;
                if (a.a.isEnabled()) {
                    a.c(com.yandex.passport.common.logger.b.b, null, "messenger: " + messenger, 8);
                }
                bVar.j = j5Var;
                bVar.k = message;
                bVar.n = 2;
                zt3 zt3Var = new zt3(1, qxe.b(bVar));
                zt3Var.s();
                if (messenger != null) {
                    try {
                        j5Var.getClass();
                        message.replyTo = new Messenger(new ahh(zt3Var, j5Var, Looper.getMainLooper()));
                        messenger.send(message);
                    } catch (CancellationException e) {
                        zt3Var.h(e);
                    } catch (Throwable th) {
                        r7o r7oVar = z7o.b;
                        zt3Var.resumeWith(new t7o(new IllegalStateException("Service binding failed cause: " + th)));
                    }
                }
                Object q = zt3Var.q();
                nm6 nm6Var2 = nm6.a;
                return q != nm6Var ? nm6Var : q;
            }
        }
        bVar = new b(j5Var, cg6Var);
        Object obj2 = bVar.l;
        nm6 nm6Var3 = nm6.a;
        i = bVar.n;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        messenger = (Messenger) obj2;
        if (a.a.isEnabled()) {
        }
        bVar.j = j5Var;
        bVar.k = message;
        bVar.n = 2;
        zt3 zt3Var2 = new zt3(1, qxe.b(bVar));
        zt3Var2.s();
        if (messenger != null) {
        }
        Object q2 = zt3Var2.q();
        nm6 nm6Var22 = nm6.a;
        if (q2 != nm6Var3) {
        }
    }

    public abstract boolean a();

    @Override // defpackage.nw0
    public Object b() {
        return this.b;
    }

    public void g() {
        ((ArrayList) this.c).clear();
        this.b = this.a;
        r();
    }

    @Override // defpackage.nw0
    public void i(Object obj) {
        ((ArrayList) this.c).add(this.b);
        this.b = obj;
    }

    public abstract Collection k();

    @Override // defpackage.nw0
    public void l() {
        this.b = ((ArrayList) this.c).remove(r0.size() - 1);
    }

    public fnb m() {
        fnb fnbVar = (fnb) this.b;
        if (fnbVar != null) {
            return fnbVar;
        }
        Intrinsics.j("evgenMeta");
        throw null;
    }

    public abstract String n();

    public qzm o(int i, hq5 hq5Var) {
        agr agrVar = (agr) this.c;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(-1774679491);
        if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
            qzm a = agrVar.a(this.a);
            oq5Var.p(false);
            return a;
        }
        Object[] objArr = new Object[0];
        boolean z = ((i & 14) ^ 6) > 4 && oq5Var.h(this);
        Object K = oq5Var.K();
        if (z || K == gq5.a) {
            K = new ixb(this, 0);
            oq5Var.k0(K);
        }
        qzm a2 = agrVar.a(o2g.g0(objArr, null, (Function0) K, oq5Var, 0, 6));
        oq5Var.p(false);
        return a2;
    }

    public abstract b1 p();

    public abstract naf q();

    public abstract void r();

    public abstract d8 s(mn3 mn3Var);

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, lnb] */
    public void t(Intent intent) {
        intent.getClass();
        gnb gnbVar = (gnb) this.c;
        if (gnbVar != null && sj2.C(gnbVar, intent)) {
            intent.putExtra("global.key.evgen.meta", this.a.g());
        }
    }

    public abstract void v(d8 d8Var);

    public j5(r rVar) {
        rVar.getClass();
        this.a = rVar;
        this.c = new com.yandex.passport.internal.provider.communication.a(this);
    }

    public j5(jd6 jd6Var, Integer num) {
        iz2 iz2Var = b2c.f;
        this.a = jd6Var;
        this.b = iz2Var;
        this.c = num;
    }

    public /* synthetic */ j5() {
        this(hd6.a, (Integer) null);
    }

    public j5(Object obj, Function0 function0) {
        this.a = obj;
        this.b = function0;
        this.c = new agr(new ixb(this, 1));
    }

    public j5(lnb lnbVar) {
        this.a = lnbVar;
    }

    public j5(com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.accordion.a aVar) {
        this.a = new ValueAnimator();
        this.b = com.yandex.plus.pay.ui.core.b.j(aVar.getExpandedView());
        this.c = com.yandex.plus.pay.ui.core.b.j(aVar.getCollapsedView());
        btf.b(new h0(22, this));
    }

    public j5(Object obj) {
        this.a = obj;
        this.c = new ArrayList();
        this.b = obj;
    }
}
