package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.impl.a;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class l2f extends Thread {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2f(riq riqVar) {
        super("ExoPlayer:SimpleDecoder");
        this.b = riqVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p2f p2fVar = (p2f) this.b;
                a4e a4eVar = p2fVar.i;
                String str = p2fVar.q;
                Logger logger = p2f.s;
                Level level = Level.FINER;
                if (logger.isLoggable(level)) {
                    logger.finer(str + "recover() Cleanning up");
                }
                logger.warning("RECOVERING");
                p2fVar.H();
                ArrayList arrayList = new ArrayList(p2fVar.g.values());
                p2fVar.V0();
                p2fVar.F0();
                a4e a4eVar2 = p2fVar.i;
                if (a4eVar2.b != null) {
                    a4eVar2.d.h();
                }
                p2fVar.R();
                p2fVar.l0();
                p2fVar.f.clear();
                if (logger.isLoggable(level)) {
                    logger.finer(str + "recover() All is clean");
                }
                if (!p2fVar.K0()) {
                    logger.log(Level.WARNING, str + "recover() Could not recover we are Down!");
                    return;
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    z67 z67Var = z67.c;
                    if (!hasNext) {
                        z3e z3eVar = a4eVar.d;
                        z3eVar.lock();
                        try {
                            z3eVar.e(z67Var);
                            z3eVar.f(null);
                            try {
                                p2fVar.N0(a4eVar);
                                p2fVar.T0(arrayList);
                            } catch (Exception e) {
                                logger.log(Level.WARNING, str + "recover() Start services exception ", (Throwable) e);
                            }
                            logger.log(Level.WARNING, str + "recover() We are back!");
                            return;
                        } finally {
                            z3eVar.unlock();
                        }
                    }
                    gkp gkpVar = ((a) ((fkp) it.next())).q;
                    gkpVar.lock();
                    try {
                        gkpVar.e(z67Var);
                        gkpVar.f(null);
                    } finally {
                        gkpVar.unlock();
                    }
                }
            case 1:
                do {
                    try {
                    } catch (InterruptedException e2) {
                        wvs.m(e2);
                        return;
                    }
                } while (((riq) this.b).k());
                return;
            default:
                ((Function0) this.b).invoke();
                return;
        }
    }

    public l2f(Function0 function0) {
        this.b = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2f(p2f p2fVar, String str) {
        super(str);
        this.b = p2fVar;
    }
}
