package defpackage;

import android.os.SystemClock;
import com.yandex.media.ynison.service.a;
import com.yandex.media.ynison.service.a0;
import com.yandex.media.ynison.service.c0;
import com.yandex.media.ynison.service.d;
import com.yandex.media.ynison.service.e0;
import com.yandex.media.ynison.service.s0;
import com.yandex.media.ynison.service.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class azu implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ azu(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj2;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0176 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object b(Object obj, Continuation continuation) {
        String str;
        String sb;
        String str2;
        x j;
        a0 n;
        c0 k;
        a0 n2;
        String str3;
        Object obj2;
        String str4;
        String str5;
        orw orwVar = (orw) obj;
        e0 e0Var = orwVar.a;
        nrw nrwVar = orwVar.b;
        xhw xhwVar = (xhw) this.b;
        ReentrantLock reentrantLock = xhwVar.p;
        xqn xqnVar = (xqn) this.c;
        reentrantLock.lock();
        try {
            e0Var.getClass();
            dlr j2 = e0Var.q() ? e0Var.j() : null;
            if (j2 == null || (str = j2.g()) == null || str.length() <= 0) {
                str = null;
            }
            xhwVar.v = str;
            Object obj3 = xqnVar.a;
            xqnVar.a = e0Var;
            e0 e0Var2 = (e0) obj3;
            reentrantLock.unlock();
            uiw uiwVar = xhwVar.q;
            uiwVar.getClass();
            ReentrantLock reentrantLock2 = uiwVar.a;
            reentrantLock2.lock();
            try {
                uiwVar.f = e0Var;
                uiwVar.g = SystemClock.elapsedRealtime();
                uiwVar.c = null;
                uiwVar.d = null;
                uiwVar.e = 0L;
                uiwVar.b.clear();
                reentrantLock2.unlock();
                if (((Boolean) ((dfw) xhwVar.b.b).invoke()).booleanValue()) {
                    StringBuilder sb2 = new StringBuilder();
                    rse<a> m = e0Var.m();
                    if (m != null) {
                        rse m2 = e0Var2 != null ? e0Var2.m() : null;
                        if (m2 == null) {
                            str3 = "brand new";
                        } else if (m.size() > m2.size()) {
                            str3 = "device connected";
                        } else if (m.size() < m2.size()) {
                            str3 = "device disconnected";
                        } else {
                            if (!m.equals(m2)) {
                                ArrayList arrayList = new ArrayList();
                                for (a aVar : m) {
                                    Iterator<E> it = m2.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            obj2 = null;
                                            break;
                                        }
                                        obj2 = it.next();
                                        if (Intrinsics.d(((a) obj2).k().m(), aVar.k().m())) {
                                            break;
                                        }
                                    }
                                    a aVar2 = (a) obj2;
                                    if (aVar2 != null) {
                                        d m3 = aVar2.m();
                                        s0 i = m3 != null ? m3.i() : null;
                                        d m4 = aVar.m();
                                        if (!Intrinsics.d(i, m4 != null ? m4.i() : null)) {
                                            String m5 = aVar.k().m();
                                            d m6 = aVar2.m();
                                            Double valueOf = m6 != null ? Double.valueOf(m6.j()) : null;
                                            d m7 = aVar.m();
                                            str4 = "Device(id=" + m5 + ", volume=" + valueOf + "-->" + (m7 != null ? Double.valueOf(m7.j()) : null) + ")";
                                            if (str4 == null) {
                                                arrayList.add(str4);
                                            }
                                        }
                                    }
                                    str4 = null;
                                    if (str4 == null) {
                                    }
                                }
                                if (arrayList.isEmpty()) {
                                    arrayList = null;
                                }
                                if (arrayList != null) {
                                    str3 = arrayList.toString();
                                }
                            }
                            str3 = null;
                        }
                        if (str3 != null) {
                            sb2.append("Devices(" + str3 + "); ");
                        }
                    }
                    a0 n3 = e0Var.n();
                    if (n3 != null && (k = n3.k()) != null) {
                        c0 k2 = (e0Var2 == null || (n2 = e0Var2.n()) == null) ? null : n2.k();
                        String g = k2 == null ? "brand new" : k.p().l() != k2.p().l() ? f1d.g("changed by ", k.p().j()) : null;
                        if (g != null) {
                            sb2.append("Status(" + g + "); ");
                        }
                    }
                    a0 n4 = e0Var.n();
                    if (n4 != null && (j = n4.j()) != null) {
                        x j3 = (e0Var2 == null || (n = e0Var2.n()) == null) ? null : n.j();
                        String g2 = j3 != null ? j.E().l() != j3.E().l() ? f1d.g("changed by ", j.E().j()) : null : "brand new";
                        if (g2 != null) {
                            sb2.append("Queue(" + g2 + "); ");
                        }
                    }
                    dlr j4 = e0Var.j();
                    if (j4 != null) {
                        dlr j5 = e0Var2 != null ? e0Var2.j() : null;
                        String g3 = j4.g();
                        if (g3 == null || g3.length() <= 0) {
                            g3 = null;
                        }
                        if (j5 == null || (str2 = j5.g()) == null || str2.length() <= 0) {
                            str2 = null;
                        }
                        String g4 = Intrinsics.d(g3, str2) ? null : f1d.g("changed to ", g3);
                        if (g4 != null) {
                            sb2.append("ActiveDeviceId(" + g4 + "); ");
                        }
                    }
                    sb = sb2.toString();
                } else {
                    sb = null;
                }
                dcw.a.getClass();
                String str6 = qbw.b;
                if (sb != null) {
                    if (StringsKt.U(sb)) {
                        sb = null;
                    }
                    if (sb != null) {
                        str5 = ": ".concat(sb);
                        ssg.a(3, str6, "<-- receive " + nrwVar + " state" + str5, null);
                        xhw.d(xhwVar, e0Var, new der(orwVar));
                        return Unit.a;
                    }
                }
                str5 = "";
                ssg.a(3, str6, "<-- receive " + nrwVar + " state" + str5, null);
                xhw.d(xhwVar, e0Var, new der(orwVar));
                return Unit.a;
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
    
        if (r4.emit(r5, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object c(Object obj, Continuation continuation) {
        dnw dnwVar;
        int i;
        jcw jcwVar;
        rjc rjcVar;
        int i2;
        if (continuation instanceof dnw) {
            dnwVar = (dnw) continuation;
            int i3 = dnwVar.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dnwVar.k = i3 - Integer.MIN_VALUE;
                Object obj2 = dnwVar.j;
                nm6 nm6Var = nm6.a;
                i = dnwVar.k;
                if (i != 0) {
                    qgg.h0(obj2);
                    rjc rjcVar2 = (rjc) this.b;
                    jcwVar = (jcw) obj;
                    gsw gswVar = ((hnw) this.c).b;
                    dnwVar.m = rjcVar2;
                    dnwVar.n = jcwVar;
                    dnwVar.o = 0;
                    dnwVar.k = 1;
                    Object c = gsw.c(gswVar, dnwVar);
                    if (c != nm6Var) {
                        rjcVar = rjcVar2;
                        obj2 = c;
                        i2 = 0;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj2);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = dnwVar.o;
                jcwVar = dnwVar.n;
                rjcVar = dnwVar.m;
                qgg.h0(obj2);
                Pair pair = new Pair(obj2, jcwVar);
                dnwVar.m = null;
                dnwVar.n = null;
                dnwVar.o = i2;
                dnwVar.k = 2;
            }
        }
        dnwVar = new dnw(this, continuation);
        Object obj22 = dnwVar.j;
        nm6 nm6Var2 = nm6.a;
        i = dnwVar.k;
        if (i != 0) {
        }
        Pair pair2 = new Pair(obj22, jcwVar);
        dnwVar.m = null;
        dnwVar.n = null;
        dnwVar.o = i2;
        dnwVar.k = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object d(Object obj, Continuation continuation) {
        tpw tpwVar;
        int i;
        Object bqwVar;
        if (continuation instanceof tpw) {
            tpwVar = (tpw) continuation;
            int i2 = tpwVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tpwVar.k = i2 - Integer.MIN_VALUE;
                Object obj2 = tpwVar.j;
                nm6 nm6Var = nm6.a;
                i = tpwVar.k;
                if (i != 0) {
                    qgg.h0(obj2);
                    rjc rjcVar = (rjc) this.b;
                    pqw pqwVar = (pqw) obj;
                    diw diwVar = ((wpw) this.c).e;
                    pqwVar.getClass();
                    bdt I = hag.I(zzp.class);
                    qdc qdcVar = diwVar.a;
                    qdcVar.getClass();
                    fpw c = pqwVar.c((zzp) qdcVar.C(I));
                    maq maqVar = pqwVar.b;
                    if (maqVar instanceof jbq) {
                        bqwVar = new gqw(diwVar, c, (jbq) maqVar);
                    } else if (maqVar instanceof vaq) {
                        bqwVar = new cqw(diwVar, c, (vaq) maqVar);
                    } else if (maqVar instanceof eaq) {
                        bqwVar = new aqw(diwVar, c, (eaq) maqVar);
                    } else {
                        if (!(maqVar instanceof raq)) {
                            b6e.s();
                            return null;
                        }
                        bqwVar = new bqw(diwVar, (raq) maqVar);
                    }
                    tpwVar.k = 1;
                    if (rjcVar.emit(bqwVar, tpwVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                return Unit.a;
            }
        }
        tpwVar = new tpw(this, continuation);
        Object obj22 = tpwVar.j;
        nm6 nm6Var2 = nm6.a;
        i = tpwVar.k;
        if (i != 0) {
        }
        return Unit.a;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    @Override // defpackage.rjc
    public final java.lang.Object emit(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r27v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    public /* synthetic */ azu(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj3;
    }
}
