package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
@vv("fragment")
/* loaded from: classes.dex */
public class nj extends wv {
    public final Context MdtA4re8;
    public final int VgvYg0wo;
    public final ej wxUZMvaN;
    public final LinkedHashSet P7K7Inc8 = new LinkedHashSet();
    public final ArrayList b2ZJblxo = new ArrayList();
    public final ij Qr9iLBAD = new ij(0, this);
    public final b2ZJblxo jb9XjC4I = new b2ZJblxo(1, this);

    /* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
    public static final class qoPGr6Ce extends ng0 {
        public WeakReference NCTxEWno;

        @Override // defpackage.ng0
        public final void wxUZMvaN() {
            WeakReference weakReference = this.NCTxEWno;
            if (weakReference == null) {
                fn.ytu5o6f4("completeTransition");
                throw null;
            }
            ok okVar = (ok) weakReference.get();
            if (okVar != null) {
                okVar.qoPGr6Ce();
            }
        }
    }

    public nj(Context context, ej ejVar, int i) {
        this.MdtA4re8 = context;
        this.wxUZMvaN = ejVar;
        this.VgvYg0wo = i;
    }

    public static void k3x7lurq(nj njVar, String str, int i) {
        int size;
        int i2 = 0;
        boolean z = (i & 2) == 0;
        boolean z2 = (i & 4) != 0;
        ArrayList arrayList = njVar.b2ZJblxo;
        if (z2) {
            int size2 = arrayList.size() - 1;
            if (size2 >= 0) {
                int i3 = 0;
                while (true) {
                    Object obj = arrayList.get(i2);
                    hx hxVar = (hx) obj;
                    hxVar.getClass();
                    if (!fn.qoPGr6Ce(hxVar.NCTxEWno, str)) {
                        if (i3 != i2) {
                            arrayList.set(i3, obj);
                        }
                        i3++;
                    }
                    if (i2 == size2) {
                        break;
                    } else {
                        i2++;
                    }
                }
                i2 = i3;
            }
            if (i2 < arrayList.size() && i2 <= (size = arrayList.size() - 1)) {
                while (true) {
                    arrayList.remove(size);
                    if (size == i2) {
                        break;
                    } else {
                        size--;
                    }
                }
            }
        }
        arrayList.add(new hx(str, Boolean.valueOf(z)));
    }

    public static boolean ygLcUYwZ() {
        return Log.isLoggable("FragmentManager", 2) || Log.isLoggable("FragmentNavigator", 2);
    }

    public final n1 OnDfzHZD(ut utVar, xu xuVar) {
        pu puVar = utVar.MdtA4re8;
        puVar.getClass();
        Bundle qoPGr6Ce2 = utVar.jb9XjC4I.qoPGr6Ce();
        String str = ((oj) puVar).Qr9iLBAD;
        if (str == null) {
            m1.Ey6iv0m0("Fragment class was not set");
            return null;
        }
        char charAt = str.charAt(0);
        Context context = this.MdtA4re8;
        if (charAt == '.') {
            str = context.getPackageName() + str;
        }
        ej ejVar = this.wxUZMvaN;
        yi Mq3SeTnW = ejVar.Mq3SeTnW();
        context.getClassLoader();
        li qoPGr6Ce3 = Mq3SeTnW.qoPGr6Ce(str);
        qoPGr6Ce3.getClass();
        qoPGr6Ce3.hzgxAD8d(qoPGr6Ce2);
        n1 n1Var = new n1(ejVar);
        int i = xuVar != null ? xuVar.P7K7Inc8 : -1;
        int i2 = xuVar != null ? xuVar.b2ZJblxo : -1;
        int i3 = xuVar != null ? xuVar.Qr9iLBAD : -1;
        int i4 = xuVar != null ? xuVar.jb9XjC4I : -1;
        if (i != -1 || i2 != -1 || i3 != -1 || i4 != -1) {
            if (i == -1) {
                i = 0;
            }
            if (i2 == -1) {
                i2 = 0;
            }
            if (i3 == -1) {
                i3 = 0;
            }
            int i5 = i4 != -1 ? i4 : 0;
            n1Var.NCTxEWno = i;
            n1Var.MdtA4re8 = i2;
            n1Var.wxUZMvaN = i3;
            n1Var.VgvYg0wo = i5;
        }
        String str2 = utVar.b2ZJblxo;
        int i6 = this.VgvYg0wo;
        if (i6 == 0) {
            m1.sjUBp5pO("Must use non-zero containerViewId");
            return null;
        }
        n1Var.VgvYg0wo(i6, qoPGr6Ce3, str2, 2);
        n1Var.b2ZJblxo(qoPGr6Ce3);
        n1Var.sjUBp5pO = true;
        return n1Var;
    }

    @Override // defpackage.wv
    public final void P7K7Inc8(ut utVar) {
        String str = utVar.b2ZJblxo;
        ej ejVar = this.wxUZMvaN;
        if (ejVar.Xkz7p5xa()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        n1 OnDfzHZD = OnDfzHZD(utVar, null);
        List list = (List) NCTxEWno().VgvYg0wo.NCTxEWno.Qr9iLBAD();
        if (list.size() > 1) {
            ut utVar2 = (ut) x5.LfKQckgD(list, list.size() - 2);
            if (utVar2 != null) {
                k3x7lurq(this, utVar2.b2ZJblxo, 6);
            }
            k3x7lurq(this, str, 4);
            ejVar.RXQxj5Oe(new cj(ejVar, str, -1), false);
            k3x7lurq(this, str, 2);
            if (!OnDfzHZD.Qr9iLBAD) {
                m1.Ey6iv0m0("This FragmentTransaction is not allowed to be added to the back stack.");
                return;
            } else {
                OnDfzHZD.b2ZJblxo = true;
                OnDfzHZD.jb9XjC4I = str;
            }
        }
        OnDfzHZD.wxUZMvaN(false);
        NCTxEWno().wxUZMvaN(utVar);
    }

    @Override // defpackage.wv
    public final Bundle Qr9iLBAD() {
        LinkedHashSet linkedHashSet = this.P7K7Inc8;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return w30.VgvYg0wo(new hx("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    @Override // defpackage.wv
    public final void VgvYg0wo(final au auVar) {
        this.qoPGr6Ce = auVar;
        this.NCTxEWno = true;
        if (ygLcUYwZ()) {
            Log.v("FragmentNavigator", "onAttach");
        }
        rj rjVar = new rj() { // from class: kj
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, qj] */
            @Override // defpackage.rj
            public final void NCTxEWno(ej ejVar, li liVar) {
                Object obj;
                Object obj2;
                ejVar.getClass();
                au auVar2 = au.this;
                List list = (List) auVar2.VgvYg0wo.NCTxEWno.Qr9iLBAD();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    obj = null;
                    if (!listIterator.hasPrevious()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = listIterator.previous();
                        if (((ut) obj2).b2ZJblxo.equals(liVar.DK9slbsy)) {
                            break;
                        }
                    }
                }
                ut utVar = (ut) obj2;
                boolean ygLcUYwZ = nj.ygLcUYwZ();
                nj njVar = this;
                if (ygLcUYwZ) {
                    Log.v("FragmentNavigator", "Attaching fragment " + liVar + " associated with entry " + utVar + " to FragmentManager " + njVar.wxUZMvaN);
                }
                if (utVar != null) {
                    nt ntVar = liVar.N8VPGzVC;
                    final lj ljVar = new lj(njVar, liVar, utVar);
                    ?? r4 = new pw() { // from class: qj
                        public final boolean equals(Object obj3) {
                            if ((obj3 instanceof pw) && (obj3 instanceof qj)) {
                                return lj.this == lj.this;
                            }
                            return false;
                        }

                        public final int hashCode() {
                            return lj.this.hashCode();
                        }

                        @Override // defpackage.pw
                        public final /* synthetic */ void qoPGr6Ce(Object obj3) {
                            lj.this.ow5vqvCr(obj3);
                        }
                    };
                    ntVar.getClass();
                    nt.qoPGr6Ce("observe");
                    if (liVar.FXJmAAN1.MdtA4re8 != po.NCTxEWno) {
                        aq aqVar = new aq(ntVar, liVar, r4);
                        p40 p40Var = ntVar.NCTxEWno;
                        m40 qoPGr6Ce2 = p40Var.qoPGr6Ce(r4);
                        if (qoPGr6Ce2 != null) {
                            obj = qoPGr6Ce2.MdtA4re8;
                        } else {
                            m40 m40Var = new m40(r4, aqVar);
                            p40Var.VgvYg0wo++;
                            m40 m40Var2 = p40Var.MdtA4re8;
                            if (m40Var2 == null) {
                                p40Var.NCTxEWno = m40Var;
                                p40Var.MdtA4re8 = m40Var;
                            } else {
                                m40Var2.wxUZMvaN = m40Var;
                                m40Var.VgvYg0wo = m40Var2;
                                p40Var.MdtA4re8 = m40Var;
                            }
                        }
                        bq bqVar = (bq) obj;
                        if (bqVar != null && !bqVar.MdtA4re8(liVar)) {
                            m1.sjUBp5pO("Cannot add the same observer with different lifecycles");
                            return;
                        } else if (bqVar == null) {
                            liVar.FXJmAAN1.qoPGr6Ce(aqVar);
                        }
                    }
                    liVar.FXJmAAN1.qoPGr6Ce(njVar.Qr9iLBAD);
                    njVar.ow5vqvCr(liVar, utVar, auVar2);
                }
            }
        };
        ej ejVar = this.wxUZMvaN;
        ejVar.ygLcUYwZ.add(rjVar);
        pj pjVar = new pj(auVar, this);
        ArrayList arrayList = ejVar.ow5vqvCr;
        if (arrayList == null) {
            arrayList = new ArrayList();
            ejVar.ow5vqvCr = arrayList;
        }
        arrayList.add(pjVar);
    }

    @Override // defpackage.wv
    public final void b2ZJblxo(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.P7K7Inc8;
            linkedHashSet.clear();
            d6.KRabZ4CU(stringArrayList, linkedHashSet);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008d, code lost:
    
        if (r11 < 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0098, code lost:
    
        if (r13.b2ZJblxo.equals(r8.b2ZJblxo) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
    
        r4.add(r10);
     */
    @Override // defpackage.wv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void jb9XjC4I(ut utVar, boolean z) {
        int i;
        ej ejVar = this.wxUZMvaN;
        if (ejVar.Xkz7p5xa()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) NCTxEWno().VgvYg0wo.NCTxEWno.Qr9iLBAD();
        int indexOf = list.indexOf(utVar);
        List subList = list.subList(indexOf, list.size());
        ut utVar2 = (ut) x5.ESscZ9M1(list);
        int i2 = 1;
        ut utVar3 = (ut) x5.LfKQckgD(list, indexOf - 1);
        if (utVar3 != null) {
            k3x7lurq(this, utVar3.b2ZJblxo, 6);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = subList.iterator();
        while (true) {
            int i3 = 0;
            if (!it.hasNext()) {
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    k3x7lurq(this, ((ut) obj).b2ZJblxo, 4);
                }
                if (z) {
                    for (ut utVar4 : x5.f7oeun2L(subList)) {
                        if (fn.qoPGr6Ce(utVar4, utVar2)) {
                            Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + utVar4);
                        } else {
                            ejVar.RXQxj5Oe(new dj(ejVar, utVar4.b2ZJblxo, i2), false);
                            this.P7K7Inc8.add(utVar4.b2ZJblxo);
                        }
                    }
                } else {
                    ejVar.RXQxj5Oe(new cj(ejVar, utVar.b2ZJblxo, -1), false);
                }
                if (ygLcUYwZ()) {
                    Log.v("FragmentNavigator", "Calling popWithTransition via popBackStack() on entry " + utVar + " with savedState " + z);
                }
                NCTxEWno().P7K7Inc8(utVar, z);
                return;
            }
            Object next = it.next();
            ut utVar5 = (ut) next;
            String str = utVar5.b2ZJblxo;
            Iterator it2 = this.b2ZJblxo.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                }
                hx hxVar = (hx) it2.next();
                hxVar.getClass();
                String str2 = (String) hxVar.NCTxEWno;
                if (i3 < 0) {
                    y5.ZyZthT5G();
                    throw null;
                }
                if (str.equals(str2)) {
                    i = i3;
                    break;
                }
                i3++;
            }
        }
    }

    public final void ow5vqvCr(li liVar, ut utVar, au auVar) {
        ug0 P7K7Inc8 = liVar.P7K7Inc8();
        vm vmVar = new vm(0);
        vmVar.qoPGr6Ce(m20.qoPGr6Ce(qoPGr6Ce.class), new tKaxLBvG(5));
        wkPeYiwH NCTxEWno = vmVar.NCTxEWno();
        y9 y9Var = y9.NCTxEWno;
        y9Var.getClass();
        VZZbw3BB vZZbw3BB = new VZZbw3BB(P7K7Inc8, NCTxEWno, y9Var);
        p5 qoPGr6Ce2 = m20.qoPGr6Ce(qoPGr6Ce.class);
        String NCTxEWno2 = qoPGr6Ce2.NCTxEWno();
        if (NCTxEWno2 == null) {
            m1.sjUBp5pO("Local and anonymous classes can not be ViewModels");
        } else {
            ((qoPGr6Ce) vZZbw3BB.Qr9iLBAD(qoPGr6Ce2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(NCTxEWno2))).NCTxEWno = new WeakReference(new mj(utVar, auVar, this, liVar));
        }
    }

    @Override // defpackage.wv
    public final pu qoPGr6Ce() {
        return new oj(this);
    }

    @Override // defpackage.wv
    public final void wxUZMvaN(List list, xu xuVar) {
        ej ejVar = this.wxUZMvaN;
        if (ejVar.Xkz7p5xa()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ut utVar = (ut) it.next();
            boolean isEmpty = ((List) NCTxEWno().VgvYg0wo.NCTxEWno.Qr9iLBAD()).isEmpty();
            int i = 0;
            if (xuVar == null || isEmpty || !xuVar.NCTxEWno || !this.P7K7Inc8.remove(utVar.b2ZJblxo)) {
                n1 OnDfzHZD = OnDfzHZD(utVar, xuVar);
                String str = utVar.b2ZJblxo;
                if (!isEmpty) {
                    ut utVar2 = (ut) x5.hGvurcGl((List) NCTxEWno().VgvYg0wo.NCTxEWno.Qr9iLBAD());
                    if (utVar2 != null) {
                        k3x7lurq(this, utVar2.b2ZJblxo, 6);
                    }
                    k3x7lurq(this, str, 6);
                    if (!OnDfzHZD.Qr9iLBAD) {
                        m1.Ey6iv0m0("This FragmentTransaction is not allowed to be added to the back stack.");
                        return;
                    } else {
                        OnDfzHZD.b2ZJblxo = true;
                        OnDfzHZD.jb9XjC4I = str;
                    }
                }
                OnDfzHZD.wxUZMvaN(false);
                if (ygLcUYwZ()) {
                    Log.v("FragmentNavigator", "Calling pushWithTransition via navigate() on entry " + utVar);
                }
                NCTxEWno().Qr9iLBAD(utVar);
            } else {
                ejVar.RXQxj5Oe(new dj(ejVar, utVar.b2ZJblxo, i), false);
                NCTxEWno().Qr9iLBAD(utVar);
            }
        }
    }
}
