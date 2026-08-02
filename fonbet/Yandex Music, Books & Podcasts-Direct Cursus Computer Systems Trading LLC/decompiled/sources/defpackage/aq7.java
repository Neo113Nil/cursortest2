package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class aq7 implements yn7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aq7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yn7
    public final void onCreate(dzf dzfVar) {
        switch (this.a) {
            case 0:
                dzfVar.getClass();
                break;
            default:
                dzfVar.getClass();
                break;
        }
    }

    @Override // defpackage.yn7
    public final void onDestroy(dzf dzfVar) {
        switch (this.a) {
            case 0:
                ((aw5) this.b).invoke();
                dzfVar.getLifecycle().d(this);
                break;
            default:
                ((o3a) this.b).f();
                break;
        }
    }

    @Override // defpackage.yn7
    public final void onPause(dzf dzfVar) {
        switch (this.a) {
            case 0:
                break;
            default:
                o3a o3aVar = (o3a) this.b;
                apo apoVar = o3aVar.a;
                r7b r7bVar = o3aVar.s;
                ano anoVar = o3aVar.x;
                o3aVar.h().g(kyf.ON_PAUSE);
                m6a m6aVar = (m6a) o3aVar.A.a;
                if (!(m6aVar instanceof i6a)) {
                    if (!(m6aVar instanceof h6a)) {
                        if (!(m6aVar instanceof l6a)) {
                            if (!(m6aVar instanceof j6a)) {
                                if (!(m6aVar instanceof k6a)) {
                                    b6e.s();
                                    break;
                                } else {
                                    t5a t5aVar = ((k6a) m6aVar).c;
                                    ArrayList m = apoVar.m();
                                    Iterator it = anoVar.a.iterator();
                                    while (it.hasNext()) {
                                        try {
                                            ((ano) ((o6a) it.next())).g(r7bVar, t5aVar, m);
                                        } catch (Throwable th) {
                                            Timber.INSTANCE.e(th);
                                        }
                                    }
                                    break;
                                }
                            } else {
                                t5a t5aVar2 = ((j6a) m6aVar).c;
                                ArrayList m2 = apoVar.m();
                                Iterator it2 = anoVar.a.iterator();
                                while (it2.hasNext()) {
                                    try {
                                        ((ano) ((o6a) it2.next())).g(r7bVar, t5aVar2, m2);
                                    } catch (Throwable th2) {
                                        Timber.INSTANCE.e(th2);
                                    }
                                }
                                break;
                            }
                        } else {
                            t5a t5aVar3 = ((l6a) m6aVar).c;
                            ArrayList m3 = apoVar.m();
                            Iterator it3 = anoVar.a.iterator();
                            while (it3.hasNext()) {
                                try {
                                    ((ano) ((o6a) it3.next())).g(r7bVar, t5aVar3, m3);
                                } catch (Throwable th3) {
                                    Timber.INSTANCE.e(th3);
                                }
                            }
                            break;
                        }
                    } else {
                        t5a t5aVar4 = ((h6a) m6aVar).c;
                        ArrayList m4 = apoVar.m();
                        Iterator it4 = anoVar.a.iterator();
                        while (it4.hasNext()) {
                            try {
                                ((ano) ((o6a) it4.next())).g(r7bVar, t5aVar4, m4);
                            } catch (Throwable th4) {
                                Timber.INSTANCE.e(th4);
                            }
                        }
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.yn7
    public final void onResume(dzf dzfVar) {
        switch (this.a) {
            case 0:
                dzfVar.getClass();
                break;
            default:
                o3a o3aVar = (o3a) this.b;
                apo apoVar = o3aVar.a;
                r7b r7bVar = o3aVar.s;
                ano anoVar = o3aVar.x;
                o3aVar.h().g(kyf.ON_RESUME);
                m6a m6aVar = (m6a) o3aVar.A.a;
                if (!(m6aVar instanceof i6a)) {
                    if (!(m6aVar instanceof h6a)) {
                        if (!(m6aVar instanceof l6a)) {
                            if (!(m6aVar instanceof j6a)) {
                                if (!(m6aVar instanceof k6a)) {
                                    b6e.s();
                                    break;
                                } else {
                                    t5a t5aVar = ((k6a) m6aVar).c;
                                    ArrayList m = apoVar.m();
                                    Iterator it = anoVar.a.iterator();
                                    while (it.hasNext()) {
                                        try {
                                            ((ano) ((o6a) it.next())).h(r7bVar, t5aVar, m);
                                        } catch (Throwable th) {
                                            Timber.INSTANCE.e(th);
                                        }
                                    }
                                    break;
                                }
                            } else {
                                t5a t5aVar2 = ((j6a) m6aVar).c;
                                ArrayList m2 = apoVar.m();
                                Iterator it2 = anoVar.a.iterator();
                                while (it2.hasNext()) {
                                    try {
                                        ((ano) ((o6a) it2.next())).h(r7bVar, t5aVar2, m2);
                                    } catch (Throwable th2) {
                                        Timber.INSTANCE.e(th2);
                                    }
                                }
                                break;
                            }
                        } else {
                            t5a t5aVar3 = ((l6a) m6aVar).c;
                            ArrayList m3 = apoVar.m();
                            Iterator it3 = anoVar.a.iterator();
                            while (it3.hasNext()) {
                                try {
                                    ((ano) ((o6a) it3.next())).h(r7bVar, t5aVar3, m3);
                                } catch (Throwable th3) {
                                    Timber.INSTANCE.e(th3);
                                }
                            }
                            break;
                        }
                    } else {
                        t5a t5aVar4 = ((h6a) m6aVar).c;
                        ArrayList m4 = apoVar.m();
                        Iterator it4 = anoVar.a.iterator();
                        while (it4.hasNext()) {
                            try {
                                ((ano) ((o6a) it4.next())).h(r7bVar, t5aVar4, m4);
                            } catch (Throwable th4) {
                                Timber.INSTANCE.e(th4);
                            }
                        }
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.yn7
    public final void onStart(dzf dzfVar) {
        switch (this.a) {
            case 0:
                dzfVar.getClass();
                break;
            default:
                o3a o3aVar = (o3a) this.b;
                o3aVar.y.D(y3a.n);
                o3aVar.h().g(kyf.ON_START);
                break;
        }
    }

    @Override // defpackage.yn7
    public final void onStop(dzf dzfVar) {
        switch (this.a) {
            case 0:
                break;
            default:
                o3a o3aVar = (o3a) this.b;
                o3aVar.y.D(a4a.n);
                o3aVar.h().g(kyf.ON_STOP);
                break;
        }
    }

    private final void a(dzf dzfVar) {
    }

    private final void b(dzf dzfVar) {
    }
}
