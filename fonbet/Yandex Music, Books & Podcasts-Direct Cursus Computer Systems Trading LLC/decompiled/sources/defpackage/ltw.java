package defpackage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ltw implements svh {
    public final String a;
    public final vdr b;
    public final vlv c;
    public volatile boolean d;
    public volatile wqw e;
    public final ReentrantLock f;
    public final LinkedList g;
    public final x0q h;
    public final bhd i;

    public ltw(String str, mm6 mm6Var, vdr vdrVar, vlv vlvVar) {
        mm6Var.getClass();
        vdrVar.getClass();
        this.a = str;
        this.b = vdrVar;
        this.c = vlvVar;
        this.f = new ReentrantLock();
        this.g = new LinkedList();
        x0q b = y0q.b(0, 1, oi3.b, 1);
        this.h = b;
        this.i = new bhd(this, b().b.a, b().a);
        ox6.B(new l8v(vdrVar, this, 22), mm6Var, new jtw(this, 1));
        ox6.B(ox6.L(b, 1000L), mm6Var, new jtw(this, 0));
    }

    public static final void a(ltw ltwVar, itw itwVar) {
        ReentrantLock reentrantLock = ltwVar.f;
        reentrantLock.lock();
        try {
            ltwVar.g.add(itwVar);
            reentrantLock.unlock();
            ltwVar.h.a(Unit.a);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final wqw b() {
        how a;
        List list;
        sqw sqwVar = (sqw) this.b.getValue();
        gow gowVar = null;
        if (sqwVar != null && (a = sqwVar.a()) != null && (list = a.a) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((gow) next).a.equals(this.a)) {
                    gowVar = next;
                    break;
                }
            }
            gowVar = gowVar;
        }
        return gowVar != null ? gowVar.f : vqw.d.a(0);
    }

    @Override // defpackage.svh
    public final void c() {
        this.d = true;
    }

    @Override // defpackage.svh
    public final void d() {
        this.d = false;
    }

    @Override // defpackage.svh
    public final mch e() {
        return this.i;
    }
}
