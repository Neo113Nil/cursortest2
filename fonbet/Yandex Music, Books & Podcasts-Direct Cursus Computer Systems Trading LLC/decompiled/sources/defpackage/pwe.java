package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes6.dex */
public final class pwe implements pve, irl, czo, azo, bzo {
    public final Object a;

    public pwe(irl irlVar) {
        irlVar.getClass();
        this.a = irlVar;
    }

    @Override // defpackage.irl
    public void a(Set set) {
        set.getClass();
        ((irl) this.a).a(set);
    }

    @Override // defpackage.irl
    public void b(hrl hrlVar) {
        hrlVar.getClass();
        ((irl) this.a).b(hrlVar);
    }

    @Override // defpackage.irl
    public void e(Set set) {
        set.getClass();
        ((irl) this.a).e(set);
    }

    @Override // defpackage.irl
    public void f(Set set) {
        set.getClass();
        ((irl) this.a).f(set);
    }

    @Override // defpackage.azo
    public void onFound(vjp vjpVar) {
        dzo dzoVar = (dzo) this.a;
        if (vjpVar == null) {
            return;
        }
        synchronized (dzoVar.i) {
            try {
                Boolean bool = Boolean.FALSE;
                int i = 0;
                while (true) {
                    if (i >= dzoVar.i.size()) {
                        break;
                    }
                    if (((vjp) dzoVar.i.get(i)).f(vjpVar).booleanValue()) {
                        bool = Boolean.TRUE;
                        break;
                    }
                    i++;
                }
                if (bool.booleanValue()) {
                    return;
                }
                dzoVar.i.add(vjpVar);
                jjo.b(new e8h(16, this, vjpVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.bzo
    public void onLost(vjp vjpVar) {
        dzo dzoVar = (dzo) this.a;
        if (vjpVar != null) {
            synchronized (dzoVar.i) {
                int i = 0;
                while (true) {
                    if (i >= dzoVar.i.size()) {
                        break;
                    }
                    if (((vjp) dzoVar.i.get(i)).f(vjpVar).booleanValue()) {
                        dzoVar.i.remove(i);
                        if (dzoVar.l != null) {
                            jjo.b(new e8h(17, dzoVar, vjpVar));
                        }
                    } else {
                        i++;
                    }
                }
            }
        }
        if (dzoVar.f == null || vjpVar.g.booleanValue()) {
            return;
        }
        Iterator it = dzoVar.b.iterator();
        while (it.hasNext()) {
            e5p e5pVar = (e5p) it.next();
            synchronized (e5pVar.b) {
                e5pVar.b.remove(vjpVar);
            }
        }
    }

    @Override // defpackage.czo
    public void onStop() {
        dzo dzoVar = (dzo) this.a;
        int i = dzoVar.e - 1;
        dzoVar.e = i;
        if (i <= 0) {
            if (dzoVar.h) {
                synchronized (dzoVar) {
                    boolean z = false;
                    try {
                        dzoVar.h = false;
                        Iterator it = dzoVar.b.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            } else if (((e5p) it.next()).a) {
                                z = true;
                                break;
                            }
                        }
                        if (z) {
                            dzoVar.h = true;
                        } else {
                            dzoVar.b.clear();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                synchronized (dzoVar) {
                    if (!dzoVar.c.isEmpty()) {
                        Iterator it2 = new ArrayList(dzoVar.c).iterator();
                        while (it2.hasNext()) {
                            e5p e5pVar = (e5p) it2.next();
                            if (!e5pVar.a && dzoVar.b.remove(e5pVar)) {
                                dzoVar.c.remove(e5pVar);
                            }
                        }
                    }
                }
            }
            if (((dzo) this.a).j != null) {
                jjo.b(new yyo(0, this));
            }
        }
    }

    public pwe(dzo dzoVar) {
        this.a = dzoVar;
    }

    @Override // defpackage.pve
    public void c() {
    }

    @Override // defpackage.pve
    public void onResume() {
    }

    @Override // defpackage.pve
    public void d(boolean z) {
    }
}
