package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class xo {
    public po MdtA4re8;
    public boolean P7K7Inc8;
    public final ArrayList Qr9iLBAD;
    public int VgvYg0wo;
    public boolean b2ZJblxo;
    public final x90 jb9XjC4I;
    public final WeakReference wxUZMvaN;
    public final tg0 qoPGr6Ce = new tg0(8, (byte) 0);
    public rg NCTxEWno = new rg();

    public xo(vo voVar) {
        po poVar = po.MdtA4re8;
        this.MdtA4re8 = poVar;
        this.Qr9iLBAD = new ArrayList();
        this.wxUZMvaN = new WeakReference(voVar);
        this.jb9XjC4I = ra.qoPGr6Ce(poVar);
    }

    public final void MdtA4re8(String str) {
        n0.sjUBp5pO().getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(q70.P7K7Inc8("Method ", str, " must be called on the main thread").toString());
        }
    }

    public final po NCTxEWno(uo uoVar) {
        HashMap hashMap = this.NCTxEWno.P7K7Inc8;
        m40 m40Var = hashMap.containsKey(uoVar) ? ((m40) hashMap.get(uoVar)).VgvYg0wo : null;
        po poVar = m40Var != null ? ((wo) m40Var.MdtA4re8).qoPGr6Ce : null;
        ArrayList arrayList = this.Qr9iLBAD;
        po poVar2 = arrayList.isEmpty() ? null : (po) arrayList.get(arrayList.size() - 1);
        po poVar3 = this.MdtA4re8;
        poVar3.getClass();
        if (poVar == null || poVar.compareTo(poVar3) >= 0) {
            poVar = poVar3;
        }
        return (poVar2 == null || poVar2.compareTo(poVar) >= 0) ? poVar : poVar2;
    }

    public final void P7K7Inc8(uo uoVar) {
        uoVar.getClass();
        MdtA4re8("removeObserver");
        this.NCTxEWno.NCTxEWno(uoVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r11.b2ZJblxo = false;
        r11.jb9XjC4I.jb9XjC4I(r11.MdtA4re8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Qr9iLBAD() {
        vo voVar = (vo) this.wxUZMvaN.get();
        if (voVar == null) {
            m1.Ey6iv0m0("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            rg rgVar = this.NCTxEWno;
            if (rgVar.VgvYg0wo != 0) {
                m40 m40Var = rgVar.NCTxEWno;
                m40Var.getClass();
                po poVar = ((wo) m40Var.MdtA4re8).qoPGr6Ce;
                m40 m40Var2 = this.NCTxEWno.MdtA4re8;
                m40Var2.getClass();
                po poVar2 = ((wo) m40Var2.MdtA4re8).qoPGr6Ce;
                if (poVar == poVar2 && this.MdtA4re8 == poVar2) {
                    break;
                }
                this.b2ZJblxo = false;
                po poVar3 = this.MdtA4re8;
                m40 m40Var3 = this.NCTxEWno.NCTxEWno;
                m40Var3.getClass();
                int compareTo = poVar3.compareTo(((wo) m40Var3.MdtA4re8).qoPGr6Ce);
                ArrayList arrayList = this.Qr9iLBAD;
                if (compareTo < 0) {
                    rg rgVar2 = this.NCTxEWno;
                    l40 l40Var = new l40(rgVar2.MdtA4re8, rgVar2.NCTxEWno, 1);
                    rgVar2.wxUZMvaN.put(l40Var, Boolean.FALSE);
                    while (l40Var.hasNext() && !this.b2ZJblxo) {
                        Map.Entry entry = (Map.Entry) l40Var.next();
                        entry.getClass();
                        uo uoVar = (uo) entry.getKey();
                        wo woVar = (wo) entry.getValue();
                        while (woVar.qoPGr6Ce.compareTo(this.MdtA4re8) > 0 && !this.b2ZJblxo && this.NCTxEWno.P7K7Inc8.containsKey(uoVar)) {
                            mo moVar = oo.Companion;
                            po poVar4 = woVar.qoPGr6Ce;
                            moVar.getClass();
                            poVar4.getClass();
                            int ordinal = poVar4.ordinal();
                            oo ooVar = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : oo.ON_PAUSE : oo.ON_STOP : oo.ON_DESTROY;
                            if (ooVar == null) {
                                throw new IllegalStateException("no event down from " + woVar.qoPGr6Ce);
                            }
                            arrayList.add(ooVar.qoPGr6Ce());
                            woVar.qoPGr6Ce(voVar, ooVar);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                m40 m40Var4 = this.NCTxEWno.MdtA4re8;
                if (!this.b2ZJblxo && m40Var4 != null && this.MdtA4re8.compareTo(((wo) m40Var4.MdtA4re8).qoPGr6Ce) > 0) {
                    rg rgVar3 = this.NCTxEWno;
                    n40 n40Var = new n40(rgVar3);
                    rgVar3.wxUZMvaN.put(n40Var, Boolean.FALSE);
                    while (n40Var.hasNext() && !this.b2ZJblxo) {
                        Map.Entry entry2 = (Map.Entry) n40Var.next();
                        uo uoVar2 = (uo) entry2.getKey();
                        wo woVar2 = (wo) entry2.getValue();
                        while (woVar2.qoPGr6Ce.compareTo(this.MdtA4re8) < 0 && !this.b2ZJblxo && this.NCTxEWno.P7K7Inc8.containsKey(uoVar2)) {
                            arrayList.add(woVar2.qoPGr6Ce);
                            mo moVar2 = oo.Companion;
                            po poVar5 = woVar2.qoPGr6Ce;
                            moVar2.getClass();
                            poVar5.getClass();
                            int ordinal2 = poVar5.ordinal();
                            oo ooVar2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : oo.ON_RESUME : oo.ON_START : oo.ON_CREATE;
                            if (ooVar2 == null) {
                                throw new IllegalStateException("no event up from " + woVar2.qoPGr6Ce);
                            }
                            woVar2.qoPGr6Ce(voVar, ooVar2);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }

    public final void VgvYg0wo(po poVar) {
        if (this.MdtA4re8 == poVar) {
            return;
        }
        vo voVar = (vo) this.wxUZMvaN.get();
        po poVar2 = this.MdtA4re8;
        poVar2.getClass();
        poVar.getClass();
        po poVar3 = po.MdtA4re8;
        po poVar4 = po.NCTxEWno;
        if (poVar2 == poVar3 && poVar == poVar4) {
            throw new IllegalStateException(("State must be at least '" + po.wxUZMvaN + "' to be moved to '" + poVar + "' in component " + voVar).toString());
        }
        if (poVar2 == poVar4 && poVar2 != poVar) {
            throw new IllegalStateException(("State is '" + poVar4 + "' and cannot be moved to `" + poVar + "` in component " + voVar).toString());
        }
        this.MdtA4re8 = poVar;
        if (this.P7K7Inc8 || this.VgvYg0wo != 0) {
            this.b2ZJblxo = true;
            return;
        }
        this.P7K7Inc8 = true;
        Qr9iLBAD();
        this.P7K7Inc8 = false;
        if (this.MdtA4re8 == poVar4) {
            this.NCTxEWno = new rg();
        }
    }

    public final void b2ZJblxo(po poVar) {
        poVar.getClass();
        MdtA4re8("setCurrentState");
        VgvYg0wo(poVar);
    }

    public final void qoPGr6Ce(uo uoVar) {
        to gbVar;
        Object obj;
        vo voVar;
        uoVar.getClass();
        MdtA4re8("addObserver");
        po poVar = this.MdtA4re8;
        po poVar2 = po.NCTxEWno;
        if (poVar != poVar2) {
            poVar2 = po.MdtA4re8;
        }
        wo woVar = new wo();
        HashMap hashMap = yo.qoPGr6Ce;
        boolean z = uoVar instanceof to;
        boolean z2 = uoVar instanceof af;
        int i = 2;
        Object obj2 = null;
        if (z && z2) {
            gbVar = new gb((af) uoVar, r6, (to) uoVar);
        } else if (z2) {
            gbVar = new gb((af) uoVar, r6, obj2);
        } else if (z) {
            gbVar = (to) uoVar;
        } else {
            Class<?> cls = uoVar.getClass();
            if (yo.NCTxEWno(cls) == 2) {
                Object obj3 = yo.NCTxEWno.get(cls);
                obj3.getClass();
                List list = (List) obj3;
                if (list.size() == 1) {
                    yo.qoPGr6Ce((Constructor) list.get(0), uoVar);
                    throw null;
                }
                int size = list.size();
                sl[] slVarArr = new sl[size];
                if (size > 0) {
                    yo.qoPGr6Ce((Constructor) list.get(0), uoVar);
                    throw null;
                }
                gbVar = new i10(i, slVarArr);
            } else {
                gbVar = new gb(uoVar);
            }
        }
        woVar.NCTxEWno = gbVar;
        woVar.qoPGr6Ce = poVar2;
        rg rgVar = this.NCTxEWno;
        m40 qoPGr6Ce = rgVar.qoPGr6Ce(uoVar);
        if (qoPGr6Ce != null) {
            obj = qoPGr6Ce.MdtA4re8;
        } else {
            HashMap hashMap2 = rgVar.P7K7Inc8;
            m40 m40Var = new m40(uoVar, woVar);
            rgVar.VgvYg0wo++;
            m40 m40Var2 = rgVar.MdtA4re8;
            if (m40Var2 == null) {
                rgVar.NCTxEWno = m40Var;
                rgVar.MdtA4re8 = m40Var;
            } else {
                m40Var2.wxUZMvaN = m40Var;
                m40Var.VgvYg0wo = m40Var2;
                rgVar.MdtA4re8 = m40Var;
            }
            hashMap2.put(uoVar, m40Var);
            obj = null;
        }
        if (((wo) obj) == null && (voVar = (vo) this.wxUZMvaN.get()) != null) {
            r6 = (this.VgvYg0wo != 0 || this.P7K7Inc8) ? 1 : 0;
            po NCTxEWno = NCTxEWno(uoVar);
            this.VgvYg0wo++;
            while (woVar.qoPGr6Ce.compareTo(NCTxEWno) < 0 && this.NCTxEWno.P7K7Inc8.containsKey(uoVar)) {
                po poVar3 = woVar.qoPGr6Ce;
                ArrayList arrayList = this.Qr9iLBAD;
                arrayList.add(poVar3);
                mo moVar = oo.Companion;
                po poVar4 = woVar.qoPGr6Ce;
                moVar.getClass();
                poVar4.getClass();
                int ordinal = poVar4.ordinal();
                oo ooVar = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : oo.ON_RESUME : oo.ON_START : oo.ON_CREATE;
                if (ooVar == null) {
                    throw new IllegalStateException("no event up from " + woVar.qoPGr6Ce);
                }
                woVar.qoPGr6Ce(voVar, ooVar);
                arrayList.remove(arrayList.size() - 1);
                NCTxEWno = NCTxEWno(uoVar);
            }
            if (r6 == 0) {
                Qr9iLBAD();
            }
            this.VgvYg0wo--;
        }
    }

    public final void wxUZMvaN(oo ooVar) {
        ooVar.getClass();
        MdtA4re8("handleLifecycleEvent");
        VgvYg0wo(ooVar.qoPGr6Ce());
    }
}
