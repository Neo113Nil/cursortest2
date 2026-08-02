package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class gzf extends nyf {
    public final boolean b;
    public l5c c;
    public lyf d;
    public final WeakReference e;
    public int f;
    public boolean g;
    public boolean h;
    public final ArrayList i;
    public final xdr j;

    public gzf(dzf dzfVar) {
        dzfVar.getClass();
        this.b = true;
        this.c = new l5c();
        lyf lyfVar = lyf.b;
        this.d = lyfVar;
        this.i = new ArrayList();
        this.e = new WeakReference(dzfVar);
        this.j = ydr.a(lyfVar);
    }

    @Override // defpackage.nyf
    public final void a(czf czfVar) {
        uyf ao7Var;
        Object obj;
        dzf dzfVar;
        czfVar.getClass();
        f("addObserver");
        lyf lyfVar = this.d;
        lyf lyfVar2 = lyf.a;
        if (lyfVar != lyfVar2) {
            lyfVar2 = lyf.b;
        }
        fzf fzfVar = new fzf();
        HashMap hashMap = kzf.a;
        boolean z = czfVar instanceof uyf;
        boolean z2 = czfVar instanceof yn7;
        int i = 2;
        if (z && z2) {
            ao7Var = new ao7((yn7) czfVar, (uyf) czfVar);
        } else if (z2) {
            ao7Var = new ao7((yn7) czfVar, null);
        } else if (z) {
            ao7Var = (uyf) czfVar;
        } else {
            Class<?> cls = czfVar.getClass();
            if (kzf.b(cls) == 2) {
                Object obj2 = kzf.b.get(cls);
                obj2.getClass();
                List list = (List) obj2;
                if (list.size() == 1) {
                    kzf.a((Constructor) list.get(0), czfVar);
                    throw null;
                }
                int size = list.size();
                z2d[] z2dVarArr = new z2d[size];
                if (size > 0) {
                    kzf.a((Constructor) list.get(0), czfVar);
                    throw null;
                }
                ao7Var = new xnn(i, z2dVarArr);
            } else {
                ao7Var = new ao7(czfVar);
            }
        }
        fzfVar.b = ao7Var;
        fzfVar.a = lyfVar2;
        l5c l5cVar = this.c;
        gno a = l5cVar.a(czfVar);
        if (a != null) {
            obj = a.b;
        } else {
            HashMap hashMap2 = l5cVar.e;
            gno gnoVar = new gno(czfVar, fzfVar);
            l5cVar.d++;
            gno gnoVar2 = l5cVar.b;
            if (gnoVar2 == null) {
                l5cVar.a = gnoVar;
                l5cVar.b = gnoVar;
            } else {
                gnoVar2.c = gnoVar;
                gnoVar.d = gnoVar2;
                l5cVar.b = gnoVar;
            }
            hashMap2.put(czfVar, gnoVar);
            obj = null;
        }
        if (((fzf) obj) == null && (dzfVar = (dzf) this.e.get()) != null) {
            boolean z3 = this.f != 0 || this.g;
            lyf e = e(czfVar);
            this.f++;
            while (fzfVar.a.compareTo(e) < 0 && this.c.e.containsKey(czfVar)) {
                lyf lyfVar3 = fzfVar.a;
                ArrayList arrayList = this.i;
                arrayList.add(lyfVar3);
                iyf iyfVar = kyf.Companion;
                lyf lyfVar4 = fzfVar.a;
                iyfVar.getClass();
                lyfVar4.getClass();
                int ordinal = lyfVar4.ordinal();
                kyf kyfVar = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : kyf.ON_RESUME : kyf.ON_START : kyf.ON_CREATE;
                if (kyfVar == null) {
                    b6e.w(fzfVar.a, "no event up from ");
                    return;
                } else {
                    fzfVar.a(dzfVar, kyfVar);
                    arrayList.remove(arrayList.size() - 1);
                    e = e(czfVar);
                }
            }
            if (!z3) {
                j();
            }
            this.f--;
        }
    }

    @Override // defpackage.nyf
    public final lyf b() {
        return this.d;
    }

    @Override // defpackage.nyf
    public final fkn c() {
        return new fkn(this.j);
    }

    @Override // defpackage.nyf
    public final void d(czf czfVar) {
        czfVar.getClass();
        f("removeObserver");
        this.c.g(czfVar);
    }

    public final lyf e(czf czfVar) {
        HashMap hashMap = this.c.e;
        gno gnoVar = hashMap.containsKey(czfVar) ? ((gno) hashMap.get(czfVar)).d : null;
        lyf lyfVar = gnoVar != null ? ((fzf) gnoVar.b).a : null;
        ArrayList arrayList = this.i;
        lyf lyfVar2 = arrayList.isEmpty() ? null : (lyf) vz1.m(arrayList, 1);
        lyf lyfVar3 = this.d;
        lyfVar3.getClass();
        if (lyfVar == null || lyfVar.compareTo(lyfVar3) >= 0) {
            lyfVar = lyfVar3;
        }
        return (lyfVar2 == null || lyfVar2.compareTo(lyfVar) >= 0) ? lyfVar : lyfVar2;
    }

    public final void f(String str) {
        if (this.b) {
            hx0.Z().a.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            wb8.h(hrg.q("Method ", str, " must be called on the main thread"));
        }
    }

    public void g(kyf kyfVar) {
        kyfVar.getClass();
        f("handleLifecycleEvent");
        h(kyfVar.a());
    }

    public final void h(lyf lyfVar) {
        if (this.d == lyfVar) {
            return;
        }
        dzf dzfVar = (dzf) this.e.get();
        lyf lyfVar2 = this.d;
        lyfVar2.getClass();
        lyfVar.getClass();
        if (lyfVar2 == lyf.b && lyfVar == lyf.a) {
            throw new IllegalStateException(("State must be at least '" + lyf.c + "' to be moved to '" + lyfVar + "' in component " + dzfVar).toString());
        }
        lyf lyfVar3 = lyf.a;
        if (lyfVar2 == lyfVar3 && lyfVar2 != lyfVar) {
            throw new IllegalStateException(("State is '" + lyfVar3 + "' and cannot be moved to `" + lyfVar + "` in component " + dzfVar).toString());
        }
        this.d = lyfVar;
        if (this.g || this.f != 0) {
            this.h = true;
            return;
        }
        this.g = true;
        j();
        this.g = false;
        if (this.d == lyfVar3) {
            this.c = new l5c();
        }
    }

    public final void i(lyf lyfVar) {
        lyfVar.getClass();
        f("setCurrentState");
        h(lyfVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r8.h = false;
        r8.j.l(r8.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        dzf dzfVar = (dzf) this.e.get();
        if (dzfVar == null) {
            xq0.q("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            l5c l5cVar = this.c;
            if (l5cVar.d != 0) {
                gno gnoVar = l5cVar.a;
                gnoVar.getClass();
                lyf lyfVar = ((fzf) gnoVar.b).a;
                gno gnoVar2 = this.c.b;
                gnoVar2.getClass();
                lyf lyfVar2 = ((fzf) gnoVar2.b).a;
                if (lyfVar == lyfVar2 && this.d == lyfVar2) {
                    break;
                }
                this.h = false;
                lyf lyfVar3 = this.d;
                gno gnoVar3 = this.c.a;
                gnoVar3.getClass();
                int compareTo = lyfVar3.compareTo(((fzf) gnoVar3.b).a);
                ArrayList arrayList = this.i;
                if (compareTo < 0) {
                    l5c l5cVar2 = this.c;
                    fno fnoVar = new fno(l5cVar2.b, l5cVar2.a, 1);
                    l5cVar2.c.put(fnoVar, Boolean.FALSE);
                    while (fnoVar.hasNext() && !this.h) {
                        Map.Entry entry = (Map.Entry) fnoVar.next();
                        entry.getClass();
                        czf czfVar = (czf) entry.getKey();
                        fzf fzfVar = (fzf) entry.getValue();
                        while (fzfVar.a.compareTo(this.d) > 0 && !this.h && this.c.e.containsKey(czfVar)) {
                            iyf iyfVar = kyf.Companion;
                            lyf lyfVar4 = fzfVar.a;
                            iyfVar.getClass();
                            kyf a = iyf.a(lyfVar4);
                            if (a == null) {
                                b6e.w(fzfVar.a, "no event down from ");
                                return;
                            } else {
                                arrayList.add(a.a());
                                fzfVar.a(dzfVar, a);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
                gno gnoVar4 = this.c.b;
                if (!this.h && gnoVar4 != null && this.d.compareTo(((fzf) gnoVar4.b).a) > 0) {
                    l5c l5cVar3 = this.c;
                    l5cVar3.getClass();
                    hno hnoVar = new hno(l5cVar3);
                    l5cVar3.c.put(hnoVar, Boolean.FALSE);
                    while (hnoVar.hasNext() && !this.h) {
                        Map.Entry entry2 = (Map.Entry) hnoVar.next();
                        czf czfVar2 = (czf) entry2.getKey();
                        fzf fzfVar2 = (fzf) entry2.getValue();
                        while (fzfVar2.a.compareTo(this.d) < 0 && !this.h && this.c.e.containsKey(czfVar2)) {
                            arrayList.add(fzfVar2.a);
                            iyf iyfVar2 = kyf.Companion;
                            lyf lyfVar5 = fzfVar2.a;
                            iyfVar2.getClass();
                            lyfVar5.getClass();
                            int ordinal = lyfVar5.ordinal();
                            kyf kyfVar = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : kyf.ON_RESUME : kyf.ON_START : kyf.ON_CREATE;
                            if (kyfVar == null) {
                                b6e.w(fzfVar2.a, "no event up from ");
                                return;
                            } else {
                                fzfVar2.a(dzfVar, kyfVar);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
