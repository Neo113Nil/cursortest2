package com.gamericefishpro.space.z4;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class w {
    public final boolean a;
    public com.gamericefishpro.space.p.a b;
    public p c;
    public final WeakReference d;
    public int e;
    public boolean f;
    public boolean g;
    public final ArrayList h;
    public final com.gamericefishpro.space.si.n0 i;

    public w(u uVar, boolean z) {
        new AtomicReference(null);
        this.a = z;
        this.b = new com.gamericefishpro.space.p.a();
        p pVar = p.e;
        this.c = pVar;
        this.h = new ArrayList();
        this.d = new WeakReference(uVar);
        this.i = com.gamericefishpro.space.si.e0.b(pVar);
    }

    public final void a(t object) {
        s hVar;
        Object obj;
        u uVar;
        o oVar;
        Intrinsics.checkNotNullParameter(object, "observer");
        c("addObserver");
        p pVar = this.c;
        p initialState = p.d;
        if (pVar != initialState) {
            initialState = p.e;
        }
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        v vVar = new v();
        Intrinsics.b(object);
        HashMap map = y.a;
        Intrinsics.checkNotNullParameter(object, "object");
        boolean z = object instanceof s;
        boolean z2 = object instanceof f;
        if (z && z2) {
            hVar = new h((f) object, (s) object);
        } else if (z2) {
            hVar = new h((f) object, (s) null);
        } else if (z) {
            hVar = (s) object;
        } else {
            Class<?> cls = object.getClass();
            if (y.c(cls) == 2) {
                Object obj2 = y.b.get(cls);
                Intrinsics.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    y.a((Constructor) list.get(0), object);
                    throw null;
                }
                int size = list.size();
                j[] jVarArr = new j[size];
                if (size > 0) {
                    y.a((Constructor) list.get(0), object);
                    throw null;
                }
                hVar = new e(jVarArr);
            } else {
                hVar = new h(object);
            }
        }
        vVar.b = hVar;
        vVar.a = initialState;
        com.gamericefishpro.space.p.a aVar = this.b;
        com.gamericefishpro.space.p.c cVarB = aVar.b(object);
        if (cVarB != null) {
            obj = cVarB.e;
        } else {
            HashMap map2 = aVar.w;
            com.gamericefishpro.space.p.c cVar = new com.gamericefishpro.space.p.c(object, vVar);
            aVar.v++;
            com.gamericefishpro.space.p.c cVar2 = aVar.e;
            if (cVar2 == null) {
                aVar.d = cVar;
                aVar.e = cVar;
            } else {
                cVar2.i = cVar;
                cVar.v = cVar2;
                aVar.e = cVar;
            }
            map2.put(object, cVar);
            obj = null;
        }
        if (((v) obj) == null && (uVar = (u) this.d.get()) != null) {
            boolean z3 = this.e != 0 || this.f;
            p pVarB = b(object);
            this.e++;
            while (vVar.a.compareTo(pVarB) < 0 && this.b.w.containsKey(object)) {
                p pVar2 = vVar.a;
                ArrayList arrayList = this.h;
                arrayList.add(pVar2);
                m mVar = o.Companion;
                p state = vVar.a;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(state, "state");
                int iOrdinal = state.ordinal();
                if (iOrdinal == 1) {
                    oVar = o.ON_CREATE;
                } else if (iOrdinal != 2) {
                    oVar = iOrdinal != 3 ? null : o.ON_RESUME;
                } else {
                    oVar = o.ON_START;
                }
                if (oVar == null) {
                    throw new IllegalStateException("no event up from " + vVar.a);
                }
                vVar.a(uVar, oVar);
                arrayList.remove(arrayList.size() - 1);
                pVarB = b(object);
            }
            if (!z3) {
                h();
            }
            this.e--;
        }
    }

    public final p b(t tVar) {
        HashMap map = this.b.w;
        com.gamericefishpro.space.p.c cVar = map.containsKey(tVar) ? ((com.gamericefishpro.space.p.c) map.get(tVar)).v : null;
        p state1 = cVar != null ? ((v) cVar.e).a : null;
        ArrayList arrayList = this.h;
        p pVar = arrayList.isEmpty() ? null : (p) arrayList.get(arrayList.size() - 1);
        p state2 = this.c;
        Intrinsics.checkNotNullParameter(state2, "state1");
        if (state1 == null || state1.compareTo(state2) >= 0) {
            state1 = state2;
        }
        Intrinsics.checkNotNullParameter(state1, "state1");
        return (pVar == null || pVar.compareTo(state1) >= 0) ? state1 : pVar;
    }

    public final void c(String str) {
        if (this.a) {
            com.gamericefishpro.space.o.b.M().c.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(com.gamericefishpro.space.t0.y0.g("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(o event) {
        Intrinsics.checkNotNullParameter(event, "event");
        c("handleLifecycleEvent");
        e(event.a());
    }

    public final void e(p next) {
        if (this.c == next) {
            return;
        }
        u uVar = (u) this.d.get();
        p current = this.c;
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(next, "next");
        if (current == p.e && next == p.d) {
            throw new IllegalStateException(("State must be at least '" + p.i + "' to be moved to '" + next + "' in component " + uVar).toString());
        }
        p pVar = p.d;
        if (current == pVar && current != next) {
            throw new IllegalStateException(("State is '" + pVar + "' and cannot be moved to `" + next + "` in component " + uVar).toString());
        }
        this.c = next;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        h();
        this.f = false;
        if (this.c == pVar) {
            this.b = new com.gamericefishpro.space.p.a();
        }
    }

    public final void f(t observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        c("removeObserver");
        this.b.c(observer);
    }

    public final void g(p state) {
        Intrinsics.checkNotNullParameter(state, "state");
        c("setCurrentState");
        e(state);
    }

    public final void h() {
        o oVar;
        o oVar2;
        u uVar = (u) this.d.get();
        if (uVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            com.gamericefishpro.space.p.a aVar = this.b;
            if (aVar.v != 0) {
                com.gamericefishpro.space.p.c cVar = aVar.d;
                Intrinsics.b(cVar);
                p pVar = ((v) cVar.e).a;
                com.gamericefishpro.space.p.c cVar2 = this.b.e;
                Intrinsics.b(cVar2);
                p pVar2 = ((v) cVar2.e).a;
                if (pVar == pVar2 && this.c == pVar2) {
                    break;
                }
                this.g = false;
                p pVar3 = this.c;
                com.gamericefishpro.space.p.c cVar3 = this.b.d;
                Intrinsics.b(cVar3);
                int iCompareTo = pVar3.compareTo(((v) cVar3.e).a);
                ArrayList arrayList = this.h;
                if (iCompareTo < 0) {
                    com.gamericefishpro.space.p.a aVar2 = this.b;
                    com.gamericefishpro.space.p.b bVar = new com.gamericefishpro.space.p.b(aVar2.e, aVar2.d, 1);
                    aVar2.i.put(bVar, Boolean.FALSE);
                    Intrinsics.checkNotNullExpressionValue(bVar, "descendingIterator(...)");
                    while (bVar.hasNext() && !this.g) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        Intrinsics.b(entry);
                        t tVar = (t) entry.getKey();
                        v vVar = (v) entry.getValue();
                        while (vVar.a.compareTo(this.c) > 0 && !this.g && this.b.w.containsKey(tVar)) {
                            m mVar = o.Companion;
                            p state = vVar.a;
                            mVar.getClass();
                            Intrinsics.checkNotNullParameter(state, "state");
                            int iOrdinal = state.ordinal();
                            if (iOrdinal == 2) {
                                oVar2 = o.ON_DESTROY;
                            } else if (iOrdinal != 3) {
                                oVar2 = iOrdinal != 4 ? null : o.ON_PAUSE;
                            } else {
                                oVar2 = o.ON_STOP;
                            }
                            if (oVar2 == null) {
                                throw new IllegalStateException("no event down from " + vVar.a);
                            }
                            arrayList.add(oVar2.a());
                            vVar.a(uVar, oVar2);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                com.gamericefishpro.space.p.c cVar4 = this.b.e;
                if (!this.g && cVar4 != null && this.c.compareTo(((v) cVar4.e).a) > 0) {
                    com.gamericefishpro.space.p.a aVar3 = this.b;
                    aVar3.getClass();
                    com.gamericefishpro.space.p.d dVar = new com.gamericefishpro.space.p.d(aVar3);
                    aVar3.i.put(dVar, Boolean.FALSE);
                    Intrinsics.checkNotNullExpressionValue(dVar, "iteratorWithAdditions(...)");
                    while (dVar.hasNext() && !this.g) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        t tVar2 = (t) entry2.getKey();
                        v vVar2 = (v) entry2.getValue();
                        while (vVar2.a.compareTo(this.c) < 0 && !this.g && this.b.w.containsKey(tVar2)) {
                            arrayList.add(vVar2.a);
                            m mVar2 = o.Companion;
                            p state2 = vVar2.a;
                            mVar2.getClass();
                            Intrinsics.checkNotNullParameter(state2, "state");
                            int iOrdinal2 = state2.ordinal();
                            if (iOrdinal2 == 1) {
                                oVar = o.ON_CREATE;
                            } else if (iOrdinal2 != 2) {
                                oVar = iOrdinal2 != 3 ? null : o.ON_RESUME;
                            } else {
                                oVar = o.ON_START;
                            }
                            if (oVar == null) {
                                throw new IllegalStateException("no event up from " + vVar2.a);
                            }
                            vVar2.a(uVar, oVar);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.g = false;
        this.i.i(this.c);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w(u provider) {
        this(provider, true);
        Intrinsics.checkNotNullParameter(provider, "provider");
    }
}
