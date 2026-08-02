package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.reuse.RebindTask$UnsupportedElementException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import kotlin.collections.a;

/* loaded from: classes11.dex */
public final class qfi0 implements pfi0 {
    public boolean D;
    public final Div2View a;
    public final hgk b;
    public final rvo c;
    public final rvo w;
    public final d0d x;
    public final LinkedHashSet y = new LinkedHashSet();
    public final ArrayList z = new ArrayList();
    public final ArrayList A = new ArrayList();
    public final ArrayList B = new ArrayList();
    public final LinkedHashMap C = new LinkedHashMap();
    public final n2k0 E = new n2k0();

    public qfi0(Div2View div2View, hgk hgkVar, rvo rvoVar, rvo rvoVar2, d0d d0dVar) {
        this.a = div2View;
        this.b = hgkVar;
        this.c = rvoVar;
        this.w = rvoVar2;
        this.x = d0dVar;
    }

    public final boolean a(omk omkVar, omk omkVar2, ViewGroup viewGroup) {
        m3k m3kVar;
        m3k m3kVar2;
        Object obj;
        Div2View div2View = this.a;
        mmk stateToBind = div2View.stateToBind(omkVar);
        d0d d0dVar = this.x;
        if (stateToBind == null || (m3kVar = stateToBind.a) == null) {
            d0dVar.getClass();
            return false;
        }
        kmo kmoVar = new kmo(new cxk(m3kVar, this.c), 0, viewGroup, null);
        mmk stateToBind2 = div2View.stateToBind(omkVar2);
        if (stateToBind2 == null || (m3kVar2 = stateToBind2.a) == null) {
            d0dVar.getClass();
            return false;
        }
        h660 h660Var = new h660(new cxk(m3kVar2, this.w), 0, null);
        if (kmoVar.a(h660Var)) {
            g(kmoVar, h660Var);
        } else {
            b(kmoVar);
            d(h660Var);
        }
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            kmo kmoVar2 = ((h660) it.next()).e;
            if (kmoVar2 == null) {
                d0dVar.getClass();
                return false;
            }
            LinkedList linkedList = (LinkedList) this.E.a.get(Integer.valueOf(kmoVar2.c));
            if (linkedList != null) {
                Iterator it2 = linkedList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (jl40.l(((kmo) obj).e, kmoVar2.e)) {
                        break;
                    }
                }
                ym11.a(linkedList).remove(obj);
            }
            this.y.add(kmoVar2);
        }
        return true;
    }

    public final void b(kmo kmoVar) {
        String id = kmoVar.d.d().getId();
        if (id != null) {
            this.C.put(id, kmoVar);
        } else {
            this.A.add(kmoVar);
        }
        Iterator it = kmoVar.b(null).iterator();
        while (it.hasNext()) {
            b((kmo) it.next());
        }
    }

    @Override // defpackage.pfi0
    public final n2k0 c() {
        return this.E;
    }

    @Override // defpackage.pfi0
    public final void clear() {
        this.D = false;
        n2k0 n2k0Var = this.E;
        n2k0Var.a.clear();
        n2k0Var.b.clear();
        this.y.clear();
        this.A.clear();
        this.B.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008c A[LOOP:1: B:23:0x0086->B:25:0x008c, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(h660 h660Var) {
        Object obj;
        Iterator it;
        ArrayList arrayList = this.A;
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it2.next();
                if (((kmo) obj).a(h660Var)) {
                    break;
                }
            }
        }
        kmo kmoVar = (kmo) obj;
        if (kmoVar != null) {
            arrayList.remove(kmoVar);
            g(kmoVar, h660Var);
            return;
        }
        m3k m3kVar = h660Var.d;
        String id = m3kVar.d().getId();
        LinkedHashMap linkedHashMap = this.C;
        kmo kmoVar2 = id != null ? (kmo) linkedHashMap.get(id) : null;
        if (id != null && kmoVar2 != null) {
            m3k m3kVar2 = kmoVar2.d;
            if (m3kVar2.getClass().equals(m3kVar.getClass()) && qjk.c(m3kVar2.d(), m3kVar.d(), this.c, this.w)) {
                linkedHashMap.remove(id);
                this.z.add(new kmo(h660Var.a, h660Var.b, kmoVar2.e, kmoVar2.f));
                it = h660Var.b().iterator();
                while (it.hasNext()) {
                    d((h660) it.next());
                }
            }
        }
        this.B.add(h660Var);
        it = h660Var.b().iterator();
        while (it.hasNext()) {
        }
    }

    @Override // defpackage.pfi0
    public final boolean e(omk omkVar, omk omkVar2, ViewGroup viewGroup, b bVar) {
        boolean z;
        Div2View div2View;
        hgk hgkVar;
        d0d d0dVar = this.x;
        clear();
        this.D = true;
        try {
            z = a(omkVar, omkVar2, viewGroup);
        } catch (RebindTask$UnsupportedElementException unused) {
            d0dVar.getClass();
            z = false;
        }
        if (!z) {
            return false;
        }
        LinkedHashSet linkedHashSet = this.y;
        if (linkedHashSet.isEmpty() && this.E.a.isEmpty()) {
            d0dVar.getClass();
            return false;
        }
        Iterator it = this.A.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            div2View = this.a;
            if (!hasNext) {
                break;
            }
            kmo kmoVar = (kmo) it.next();
            m3k m3kVar = kmoVar.d;
            View view = kmoVar.e;
            if (m3kVar instanceof j2k ? true : m3kVar instanceof y2k) {
                div2View.getReleaseViewVisitor$div_release().getClass();
                wsi0.i(view);
            }
            div2View.unbindViewFromDiv$div_release(view);
        }
        for (kmo kmoVar2 : this.C.values()) {
            m3k m3kVar2 = kmoVar2.d;
            View view2 = kmoVar2.e;
            if (m3kVar2 instanceof j2k ? true : m3kVar2 instanceof y2k) {
                div2View.getReleaseViewVisitor$div_release().getClass();
                wsi0.i(view2);
            }
            div2View.unbindViewFromDiv$div_release(view2);
        }
        Iterator it2 = linkedHashSet.iterator();
        while (true) {
            boolean hasNext2 = it2.hasNext();
            hgkVar = this.b;
            if (!hasNext2) {
                break;
            }
            kmo kmoVar3 = (kmo) it2.next();
            kmo kmoVar4 = kmoVar3.f;
            View view3 = kmoVar3.e;
            if (!a.G(linkedHashSet, kmoVar4)) {
                aw5 v = com.yandex.div.core.view2.divs.a.v(view3);
                if (v == null) {
                    v = div2View.getBindingContext();
                }
                hgkVar.b(v, view3, kmoVar3.a.a, bVar);
            }
        }
        Iterator it3 = this.z.iterator();
        while (it3.hasNext()) {
            kmo kmoVar5 = (kmo) it3.next();
            kmo kmoVar6 = kmoVar5.f;
            View view4 = kmoVar5.e;
            if (!a.G(linkedHashSet, kmoVar6)) {
                aw5 v2 = com.yandex.div.core.view2.divs.a.v(view4);
                if (v2 == null) {
                    v2 = div2View.getBindingContext();
                }
                hgkVar.b(v2, view4, kmoVar5.a.a, bVar);
            }
        }
        clear();
        d0dVar.getClass();
        return true;
    }

    @Override // defpackage.pfi0
    public final boolean f() {
        return this.D;
    }

    public final void g(kmo kmoVar, h660 h660Var) {
        Object obj;
        kmo kmoVar2 = new kmo(h660Var.a, h660Var.b, kmoVar.e, kmoVar.f);
        h660Var.e = kmoVar2;
        ArrayList arrayList = new ArrayList(h660Var.b());
        ArrayList arrayList2 = new ArrayList();
        for (kmo kmoVar3 : kmoVar.b(kmoVar2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((h660) obj).a(kmoVar3)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            h660 h660Var2 = (h660) obj;
            if (h660Var2 != null) {
                g(kmoVar3, h660Var2);
                arrayList.remove(h660Var2);
            } else {
                arrayList2.add(kmoVar3);
            }
        }
        if (arrayList.size() != arrayList2.size()) {
            this.y.add(kmoVar2);
        } else {
            n2k0 n2k0Var = this.E;
            n2k0Var.getClass();
            HashMap hashMap = n2k0Var.a;
            Integer valueOf = Integer.valueOf(kmoVar2.c);
            Object obj2 = hashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new LinkedList();
                hashMap.put(valueOf, obj2);
            }
            ((LinkedList) obj2).add(kmoVar2);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            b((kmo) it2.next());
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            d((h660) it3.next());
        }
    }
}
