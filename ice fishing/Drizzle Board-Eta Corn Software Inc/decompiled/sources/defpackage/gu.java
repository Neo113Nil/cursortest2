package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class gu {
    public zk Ey6iv0m0;
    public int FySoLYna;
    public du I5GHvsYW;
    public final LinkedHashMap KlHjfFWx;
    public ru MdtA4re8;
    public final zt NCTxEWno;
    public vo OnDfzHZD;
    public final ij OxcuoDLp;
    public final q0 P7K7Inc8 = new q0();
    public final x90 Qr9iLBAD;
    public final LinkedHashMap RXQxj5Oe;
    public Bundle[] VgvYg0wo;
    public final h70 WYNAV5pd;
    public final xv amk52bBQ;
    public final x90 b2ZJblxo;
    public final LinkedHashMap eVhOlqcC;
    public final ArrayList gjV1z5T1;
    public final LinkedHashMap jb9XjC4I;
    public final LinkedHashMap k3x7lurq;
    public final ArrayList lDXGDhIF;
    public final LinkedHashMap ow5vqvCr;
    public final uu qoPGr6Ce;
    public po sjUBp5pO;
    public Bundle wxUZMvaN;
    public hu ygLcUYwZ;

    public gu(uu uuVar, zt ztVar) {
        this.qoPGr6Ce = uuVar;
        this.NCTxEWno = ztVar;
        wf wfVar = wf.NCTxEWno;
        this.b2ZJblxo = ra.qoPGr6Ce(wfVar);
        this.Qr9iLBAD = ra.qoPGr6Ce(wfVar);
        this.jb9XjC4I = new LinkedHashMap();
        this.eVhOlqcC = new LinkedHashMap();
        this.k3x7lurq = new LinkedHashMap();
        this.ow5vqvCr = new LinkedHashMap();
        this.lDXGDhIF = new ArrayList();
        this.sjUBp5pO = po.MdtA4re8;
        this.OxcuoDLp = new ij(1, this);
        this.amk52bBQ = new xv();
        this.KlHjfFWx = new LinkedHashMap();
        this.RXQxj5Oe = new LinkedHashMap();
        this.gjV1z5T1 = new ArrayList();
        this.WYNAV5pd = le0.qoPGr6Ce(2);
    }

    public static pu wxUZMvaN(int i, pu puVar, pu puVar2, boolean z) {
        if (puVar.MdtA4re8.qoPGr6Ce == i && (puVar2 == null || (puVar.equals(puVar2) && fn.qoPGr6Ce(puVar.wxUZMvaN, puVar2.wxUZMvaN)))) {
            return puVar;
        }
        ru ruVar = puVar instanceof ru ? (ru) puVar : null;
        if (ruVar == null) {
            ruVar = puVar.wxUZMvaN;
            ruVar.getClass();
        }
        return ruVar.Qr9iLBAD.qoPGr6Ce(i, ruVar, puVar2, z);
    }

    public static /* synthetic */ void ygLcUYwZ(gu guVar, ut utVar) {
        guVar.OnDfzHZD(utVar, false, new q0());
    }

    public final void KlHjfFWx() {
        f1 f1Var;
        Set set;
        ArrayList X1t0wlBd = x5.X1t0wlBd(this.P7K7Inc8);
        if (X1t0wlBd.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(new p0(new pu[]{((ut) x5.LvHlPNBd(X1t0wlBd)).MdtA4re8}));
        ArrayList arrayList2 = new ArrayList();
        if (x5.LvHlPNBd(arrayList) instanceof pc) {
            Iterator it = x5.f7oeun2L(X1t0wlBd).iterator();
            while (it.hasNext()) {
                pu puVar = ((ut) it.next()).MdtA4re8;
                arrayList2.add(puVar);
                if (!(puVar instanceof pc) && !(puVar instanceof ru)) {
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        for (ut utVar : x5.f7oeun2L(X1t0wlBd)) {
            po poVar = utVar.jb9XjC4I.k3x7lurq;
            pu puVar2 = utVar.MdtA4re8;
            pu puVar3 = (pu) x5.VGmz0ccI(arrayList);
            po poVar2 = po.P7K7Inc8;
            po poVar3 = po.VgvYg0wo;
            if (puVar3 != null && puVar3.MdtA4re8.qoPGr6Ce == puVar2.MdtA4re8.qoPGr6Ce) {
                if (poVar != poVar2) {
                    au auVar = (au) this.KlHjfFWx.get(this.amk52bBQ.NCTxEWno(utVar.MdtA4re8.NCTxEWno));
                    if (fn.qoPGr6Ce((auVar == null || (set = (Set) auVar.P7K7Inc8.NCTxEWno.Qr9iLBAD()) == null) ? null : Boolean.valueOf(set.contains(utVar)), Boolean.TRUE) || ((f1Var = (f1) this.eVhOlqcC.get(utVar)) != null && f1Var.qoPGr6Ce.get() == 0)) {
                        hashMap.put(utVar, poVar3);
                    } else {
                        hashMap.put(utVar, poVar2);
                    }
                }
                pu puVar4 = (pu) x5.VGmz0ccI(arrayList2);
                if (puVar4 != null && puVar4.MdtA4re8.qoPGr6Ce == puVar2.MdtA4re8.qoPGr6Ce) {
                    d6.gmkaJpmS(arrayList2);
                }
                d6.gmkaJpmS(arrayList);
                ru ruVar = puVar2.wxUZMvaN;
                if (ruVar != null) {
                    arrayList.add(ruVar);
                }
            } else if (arrayList2.isEmpty() || puVar2.MdtA4re8.qoPGr6Ce != ((pu) x5.ESscZ9M1(arrayList2)).MdtA4re8.qoPGr6Ce) {
                utVar.NCTxEWno(po.wxUZMvaN);
            } else {
                pu puVar5 = (pu) d6.gmkaJpmS(arrayList2);
                if (poVar == poVar2) {
                    utVar.NCTxEWno(poVar3);
                } else if (poVar != poVar3) {
                    hashMap.put(utVar, poVar3);
                }
                ru ruVar2 = puVar5.wxUZMvaN;
                if (ruVar2 != null && !arrayList2.contains(ruVar2)) {
                    arrayList2.add(ruVar2);
                }
            }
        }
        int size = X1t0wlBd.size();
        int i = 0;
        while (i < size) {
            Object obj = X1t0wlBd.get(i);
            i++;
            ut utVar2 = (ut) obj;
            po poVar4 = (po) hashMap.get(utVar2);
            if (poVar4 != null) {
                utVar2.NCTxEWno(poVar4);
            } else {
                utVar2.jb9XjC4I.NCTxEWno();
            }
        }
    }

    public final pu MdtA4re8(int i, pu puVar) {
        pu puVar2;
        ru ruVar = this.MdtA4re8;
        if (ruVar == null) {
            return null;
        }
        if (ruVar.MdtA4re8.qoPGr6Ce == i) {
            if (puVar == null) {
                return ruVar;
            }
            if (fn.qoPGr6Ce(ruVar, puVar) && puVar.wxUZMvaN == null) {
                return this.MdtA4re8;
            }
        }
        ut utVar = (ut) this.P7K7Inc8.P7K7Inc8();
        if (utVar == null || (puVar2 = utVar.MdtA4re8) == null) {
            puVar2 = this.MdtA4re8;
            puVar2.getClass();
        }
        return wxUZMvaN(i, puVar2, puVar, false);
    }

    public final boolean NCTxEWno() {
        q0 q0Var;
        while (true) {
            q0Var = this.P7K7Inc8;
            if (q0Var.isEmpty() || !(((ut) q0Var.last()).MdtA4re8 instanceof ru)) {
                break;
            }
            ygLcUYwZ(this, (ut) q0Var.last());
        }
        ut utVar = (ut) q0Var.P7K7Inc8();
        ArrayList arrayList = this.gjV1z5T1;
        if (utVar != null) {
            arrayList.add(utVar);
        }
        this.FySoLYna++;
        KlHjfFWx();
        int i = this.FySoLYna - 1;
        this.FySoLYna = i;
        if (i == 0) {
            ArrayList X1t0wlBd = x5.X1t0wlBd(arrayList);
            arrayList.clear();
            int size = X1t0wlBd.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = X1t0wlBd.get(i2);
                i2++;
                ut utVar2 = (ut) obj;
                for (bu buVar : x5.B1cjorwa(this.lDXGDhIF)) {
                    pu puVar = utVar2.MdtA4re8;
                    utVar2.jb9XjC4I.qoPGr6Ce();
                    buVar.qoPGr6Ce(this.qoPGr6Ce, puVar);
                }
                this.WYNAV5pd.OxcuoDLp(utVar2);
            }
            ArrayList arrayList2 = new ArrayList(q0Var);
            x90 x90Var = this.b2ZJblxo;
            x90Var.getClass();
            x90Var.eVhOlqcC(null, arrayList2);
            ArrayList lDXGDhIF = lDXGDhIF();
            x90 x90Var2 = this.Qr9iLBAD;
            x90Var2.getClass();
            x90Var2.eVhOlqcC(null, lDXGDhIF);
        }
        return utVar != null;
    }

    public final void OnDfzHZD(ut utVar, boolean z, q0 q0Var) {
        hu huVar;
        Set set;
        utVar.getClass();
        q0 q0Var2 = this.P7K7Inc8;
        ut utVar2 = (ut) q0Var2.last();
        if (!fn.qoPGr6Ce(utVar2, utVar)) {
            StringBuilder sb = new StringBuilder("Attempted to pop ");
            sb.append(utVar.MdtA4re8);
            pu puVar = utVar2.MdtA4re8;
            sb.append(", which is not the top of the back stack (");
            sb.append(puVar);
            sb.append(')');
            throw new IllegalStateException(sb.toString().toString());
        }
        d6.TrssYQ34(q0Var2);
        au auVar = (au) this.KlHjfFWx.get(this.amk52bBQ.NCTxEWno(utVar2.MdtA4re8.NCTxEWno));
        boolean z2 = true;
        if ((auVar == null || (set = (Set) auVar.P7K7Inc8.NCTxEWno.Qr9iLBAD()) == null || !set.contains(utVar2)) && !this.eVhOlqcC.containsKey(utVar2)) {
            z2 = false;
        }
        po poVar = utVar2.jb9XjC4I.eVhOlqcC.MdtA4re8;
        po poVar2 = po.wxUZMvaN;
        if (poVar.compareTo(poVar2) >= 0) {
            if (z) {
                utVar2.NCTxEWno(poVar2);
                q0Var.addFirst(new xt(utVar2));
            }
            if (z2) {
                utVar2.NCTxEWno(poVar2);
            } else {
                utVar2.NCTxEWno(po.NCTxEWno);
                amk52bBQ(utVar2);
            }
        }
        if (z || z2 || (huVar = this.ygLcUYwZ) == null) {
            return;
        }
        ug0 ug0Var = (ug0) huVar.NCTxEWno.remove(utVar2.b2ZJblxo);
        if (ug0Var != null) {
            ug0Var.qoPGr6Ce();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0324 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0269  */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [android.os.Bundle[], java.lang.Throwable, pu] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OxcuoDLp(ru ruVar, Bundle bundle) {
        q0 q0Var;
        ?? r4;
        boolean z;
        q0 q0Var2;
        Intent intent;
        int[] intArray;
        Bundle bundle2;
        int[] iArr;
        ou jb9XjC4I;
        int[] iArr2;
        int length;
        int i;
        String str;
        pu Qr9iLBAD;
        ru ruVar2;
        int i2;
        Bundle bundle3;
        pu Qr9iLBAD2;
        ru ruVar3;
        yt ytVar = ruVar.Qr9iLBAD;
        q0 q0Var3 = this.P7K7Inc8;
        if (!q0Var3.isEmpty() && Qr9iLBAD() == po.NCTxEWno) {
            m1.Ey6iv0m0("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
            return;
        }
        if (fn.qoPGr6Ce(this.MdtA4re8, ruVar)) {
            int MdtA4re8 = ((a80) ytVar.wxUZMvaN).MdtA4re8();
            for (int i3 = 0; i3 < MdtA4re8; i3++) {
                pu puVar = (pu) ((a80) ytVar.wxUZMvaN).wxUZMvaN(i3);
                ru ruVar4 = this.MdtA4re8;
                ruVar4.getClass();
                int qoPGr6Ce = ((a80) ruVar4.Qr9iLBAD.wxUZMvaN).qoPGr6Ce(i3);
                ru ruVar5 = this.MdtA4re8;
                ruVar5.getClass();
                a80 a80Var = (a80) ruVar5.Qr9iLBAD.wxUZMvaN;
                if (a80Var.NCTxEWno) {
                    ej0.amk52bBQ(a80Var);
                }
                int P7K7Inc8 = le0.P7K7Inc8(a80Var.VgvYg0wo, qoPGr6Ce, a80Var.MdtA4re8);
                if (P7K7Inc8 >= 0) {
                    Object[] objArr = a80Var.wxUZMvaN;
                    Object obj = objArr[P7K7Inc8];
                    objArr[P7K7Inc8] = puVar;
                }
            }
            Iterator it = q0Var3.iterator();
            while (it.hasNext()) {
                ut utVar = (ut) it.next();
                int i4 = pu.b2ZJblxo;
                pu puVar2 = utVar.MdtA4re8;
                puVar2.getClass();
                p30 p30Var = new p30(l60.FySoLYna(l60.RXQxj5Oe(puVar2, new tKaxLBvG(16))));
                pu puVar3 = this.MdtA4re8;
                puVar3.getClass();
                Iterator it2 = p30Var.iterator();
                while (true) {
                    ListIterator listIterator = ((o30) it2).NCTxEWno;
                    if (listIterator.hasPrevious()) {
                        pu puVar4 = (pu) listIterator.previous();
                        if (!fn.qoPGr6Ce(puVar4, this.MdtA4re8) || !puVar3.equals(ruVar)) {
                            if (puVar3 instanceof ru) {
                                puVar3 = ((ru) puVar3).Qr9iLBAD(puVar4.MdtA4re8.qoPGr6Ce);
                                puVar3.getClass();
                            }
                        }
                    }
                }
                utVar.MdtA4re8 = puVar3;
            }
            return;
        }
        ru ruVar6 = this.MdtA4re8;
        LinkedHashMap linkedHashMap = this.KlHjfFWx;
        Bundle bundle4 = null;
        boolean z2 = true;
        if (ruVar6 != null) {
            ArrayList arrayList = new ArrayList(this.k3x7lurq.keySet());
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                int i6 = i5 + 1;
                Integer num = (Integer) arrayList.get(i5);
                num.getClass();
                int intValue = num.intValue();
                Iterator it3 = linkedHashMap.values().iterator();
                while (it3.hasNext()) {
                    ((au) it3.next()).wxUZMvaN = true;
                }
                ArrayList arrayList2 = arrayList;
                int i7 = size;
                Bundle bundle5 = bundle4;
                q0 q0Var4 = q0Var3;
                boolean sjUBp5pO = sjUBp5pO(intValue, bundle5, new xu(false, true, -1, false, false, -1, -1, -1, -1));
                Iterator it4 = linkedHashMap.values().iterator();
                while (it4.hasNext()) {
                    ((au) it4.next()).wxUZMvaN = false;
                }
                if (sjUBp5pO) {
                    ow5vqvCr(intValue, true, false);
                }
                bundle4 = bundle5;
                i5 = i6;
                size = i7;
                q0Var3 = q0Var4;
                arrayList = arrayList2;
            }
            q0Var = q0Var3;
            r4 = bundle4;
            ow5vqvCr(ruVar6.MdtA4re8.qoPGr6Ce, true, false);
        } else {
            q0Var = q0Var3;
            r4 = 0;
        }
        this.MdtA4re8 = ruVar;
        uu uuVar = this.qoPGr6Ce;
        gu guVar = uuVar.NCTxEWno;
        k0 k0Var = uuVar.MdtA4re8;
        Bundle bundle6 = this.wxUZMvaN;
        xv xvVar = this.amk52bBQ;
        if (bundle6 != null && bundle6.containsKey("android-support-nav:controller:navigatorState:names")) {
            ArrayList<String> stringArrayList = bundle6.getStringArrayList("android-support-nav:controller:navigatorState:names");
            if (stringArrayList == null) {
                n50.P7K7Inc8("android-support-nav:controller:navigatorState:names");
                throw r4;
            }
            int size2 = stringArrayList.size();
            int i8 = 0;
            while (i8 < size2) {
                String str2 = stringArrayList.get(i8);
                i8++;
                String str3 = str2;
                wv NCTxEWno = xvVar.NCTxEWno(str3);
                if (bundle6.containsKey(str3)) {
                    Bundle bundle7 = bundle6.getBundle(str3);
                    if (bundle7 == null) {
                        n50.P7K7Inc8(str3);
                        throw r4;
                    }
                    NCTxEWno.b2ZJblxo(bundle7);
                }
            }
        }
        Bundle[] bundleArr = this.VgvYg0wo;
        if (bundleArr != null) {
            int length2 = bundleArr.length;
            int i9 = 0;
            while (i9 < length2) {
                Bundle bundle8 = bundleArr[i9];
                bundle8.getClass();
                bundle8.setClassLoader(xt.class.getClassLoader());
                String string = bundle8.getString("nav-entry-state:id");
                if (string == null) {
                    n50.P7K7Inc8("nav-entry-state:id");
                    throw r4;
                }
                int wxUZMvaN = m50.wxUZMvaN("nav-entry-state:destination-id", bundle8);
                boolean z3 = z2;
                Bundle bundle9 = bundle8.getBundle("nav-entry-state:args");
                if (bundle9 == null) {
                    n50.P7K7Inc8("nav-entry-state:args");
                    throw r4;
                }
                Bundle bundle10 = bundle8.getBundle("nav-entry-state:saved-state");
                if (bundle10 == null) {
                    n50.P7K7Inc8("nav-entry-state:saved-state");
                    throw r4;
                }
                pu MdtA4re82 = MdtA4re8(wxUZMvaN, r4);
                if (MdtA4re82 == null) {
                    int i10 = pu.b2ZJblxo;
                    StringBuilder b2ZJblxo = q70.b2ZJblxo("Restoring the Navigation back stack failed: destination ", ra.KlHjfFWx(k0Var, wxUZMvaN), " cannot be found from the current destination ");
                    b2ZJblxo.append(P7K7Inc8());
                    throw new IllegalStateException(b2ZJblxo.toString());
                }
                po Qr9iLBAD3 = Qr9iLBAD();
                hu huVar = this.ygLcUYwZ;
                k0Var.getClass();
                Qr9iLBAD3.getClass();
                bundle9.setClassLoader(k0Var.qoPGr6Ce.getClassLoader());
                ut utVar2 = new ut(k0Var, MdtA4re82, bundle9, Qr9iLBAD3, huVar, string, bundle10);
                wv NCTxEWno2 = xvVar.NCTxEWno(MdtA4re82.NCTxEWno);
                Object obj2 = linkedHashMap.get(NCTxEWno2);
                if (obj2 == null) {
                    obj2 = new au(uuVar, NCTxEWno2);
                    linkedHashMap.put(NCTxEWno2, obj2);
                }
                q0 q0Var5 = q0Var;
                q0Var5.addLast(utVar2);
                ((au) obj2).qoPGr6Ce(utVar2);
                ru ruVar7 = utVar2.MdtA4re8.wxUZMvaN;
                if (ruVar7 != null) {
                    eVhOlqcC(utVar2, VgvYg0wo(ruVar7.MdtA4re8.qoPGr6Ce));
                }
                i9++;
                q0Var = q0Var5;
                z2 = z3;
            }
            z = z2;
            q0Var2 = q0Var;
            this.NCTxEWno.qoPGr6Ce();
            this.VgvYg0wo = r4;
        } else {
            z = true;
            q0Var2 = q0Var;
        }
        Collection values = zq.LfKQckgD(xvVar.qoPGr6Ce).values();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : values) {
            if (!((wv) obj3).NCTxEWno) {
                arrayList3.add(obj3);
            }
        }
        int size3 = arrayList3.size();
        int i11 = 0;
        while (i11 < size3) {
            Object obj4 = arrayList3.get(i11);
            i11++;
            wv wvVar = (wv) obj4;
            Object obj5 = linkedHashMap.get(wvVar);
            if (obj5 == null) {
                wvVar.getClass();
                obj5 = new au(uuVar, wvVar);
                linkedHashMap.put(wvVar, obj5);
            }
            wvVar.VgvYg0wo((au) obj5);
        }
        if (this.MdtA4re8 == null || !q0Var2.isEmpty()) {
            NCTxEWno();
            return;
        }
        Activity activity = uuVar.wxUZMvaN;
        if (!uuVar.VgvYg0wo && activity != null && (intent = activity.getIntent()) != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                try {
                    intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                } catch (Exception e) {
                    Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e);
                }
                ArrayList parcelableArrayList = extras == null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : r4;
                Bundle VgvYg0wo = w30.VgvYg0wo((hx[]) Arrays.copyOf(new hx[0], 0));
                bundle2 = extras == null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : r4;
                if (bundle2 != null) {
                    VgvYg0wo.putAll(bundle2);
                }
                if (intArray != null || intArray.length == 0) {
                    ru jb9XjC4I2 = guVar.jb9XjC4I();
                    iArr = intArray;
                    jb9XjC4I = jb9XjC4I2.jb9XjC4I(new f0(intent.getData(), intent.getAction(), intent.getType(), 11), jb9XjC4I2);
                    if (jb9XjC4I != null) {
                        pu puVar5 = jb9XjC4I.NCTxEWno;
                        int[] NCTxEWno3 = puVar5.NCTxEWno(null);
                        Bundle qoPGr6Ce2 = puVar5.qoPGr6Ce(jb9XjC4I.MdtA4re8);
                        if (qoPGr6Ce2 != null) {
                            VgvYg0wo.putAll(qoPGr6Ce2);
                        }
                        iArr2 = NCTxEWno3;
                        parcelableArrayList = null;
                        if (iArr2 != null && iArr2.length != 0) {
                            guVar.getClass();
                            ru ruVar8 = guVar.MdtA4re8;
                            length = iArr2.length;
                            i = 0;
                            while (true) {
                                if (i < length) {
                                    str = null;
                                    break;
                                }
                                int i12 = iArr2[i];
                                if (i == 0) {
                                    ru ruVar9 = guVar.MdtA4re8;
                                    ruVar9.getClass();
                                    Qr9iLBAD2 = ruVar9.MdtA4re8.qoPGr6Ce == i12 ? guVar.MdtA4re8 : null;
                                } else {
                                    ruVar8.getClass();
                                    Qr9iLBAD2 = ruVar8.Qr9iLBAD(i12);
                                }
                                if (Qr9iLBAD2 == null) {
                                    int i13 = pu.b2ZJblxo;
                                    str = ra.KlHjfFWx(guVar.qoPGr6Ce.MdtA4re8, i12);
                                    break;
                                }
                                if (i != iArr2.length - 1 && (Qr9iLBAD2 instanceof ru)) {
                                    while (true) {
                                        ruVar3 = (ru) Qr9iLBAD2;
                                        ruVar3.getClass();
                                        yt ytVar2 = ruVar3.Qr9iLBAD;
                                        if (!(ruVar3.Qr9iLBAD(ytVar2.qoPGr6Ce) instanceof ru)) {
                                            break;
                                        } else {
                                            Qr9iLBAD2 = ruVar3.Qr9iLBAD(ytVar2.qoPGr6Ce);
                                        }
                                    }
                                    ruVar8 = ruVar3;
                                }
                                i++;
                            }
                            if (str != null) {
                                VgvYg0wo.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                                int length3 = iArr2.length;
                                Bundle[] bundleArr2 = new Bundle[length3];
                                for (int i14 = 0; i14 < length3; i14++) {
                                    Bundle VgvYg0wo2 = w30.VgvYg0wo((hx[]) Arrays.copyOf(new hx[0], 0));
                                    VgvYg0wo2.putAll(VgvYg0wo);
                                    if (parcelableArrayList != null && (bundle3 = (Bundle) parcelableArrayList.get(i14)) != null) {
                                        VgvYg0wo2.putAll(bundle3);
                                    }
                                    bundleArr2[i14] = VgvYg0wo2;
                                }
                                int flags = intent.getFlags();
                                int i15 = 268435456 & flags;
                                if (i15 != 0 && (flags & 32768) == 0) {
                                    intent.addFlags(32768);
                                    qb0 qb0Var = new qb0(uuVar.qoPGr6Ce);
                                    ComponentName component = intent.getComponent();
                                    if (component == null) {
                                        component = intent.resolveActivity(qb0Var.MdtA4re8.getPackageManager());
                                    }
                                    if (component != null) {
                                        qb0Var.qoPGr6Ce(component);
                                    }
                                    qb0Var.NCTxEWno.add(intent);
                                    qb0Var.NCTxEWno();
                                    activity.finish();
                                    activity.overridePendingTransition(0, 0);
                                    return;
                                }
                                if (i15 != 0 ? z : false) {
                                    if (guVar.P7K7Inc8.isEmpty()) {
                                        i2 = 0;
                                    } else {
                                        ru ruVar10 = guVar.MdtA4re8;
                                        ruVar10.getClass();
                                        i2 = 0;
                                        guVar.ow5vqvCr(ruVar10.MdtA4re8.qoPGr6Ce, z, false);
                                    }
                                    int i16 = i2;
                                    while (i16 < iArr2.length) {
                                        int i17 = iArr2[i16];
                                        int i18 = i16 + 1;
                                        Bundle bundle11 = bundleArr2[i16];
                                        pu MdtA4re83 = guVar.MdtA4re8(i17, null);
                                        if (MdtA4re83 == null) {
                                            int i19 = pu.b2ZJblxo;
                                            StringBuilder b2ZJblxo2 = q70.b2ZJblxo("Deep Linking failed: destination ", ra.KlHjfFWx(k0Var, i17), " cannot be found from the current destination ");
                                            b2ZJblxo2.append(guVar.P7K7Inc8());
                                            throw new IllegalStateException(b2ZJblxo2.toString());
                                        }
                                        cm cmVar = new cm(MdtA4re83, 3, uuVar);
                                        yu yuVar = new yu();
                                        cmVar.ow5vqvCr(yuVar);
                                        wu wuVar = yuVar.qoPGr6Ce;
                                        wuVar.qoPGr6Ce = false;
                                        wuVar.NCTxEWno = false;
                                        int i20 = yuVar.NCTxEWno;
                                        boolean z4 = yuVar.MdtA4re8;
                                        wuVar.MdtA4re8 = i20;
                                        wuVar.wxUZMvaN = z4;
                                        guVar.k3x7lurq(MdtA4re83, bundle11, wuVar.qoPGr6Ce());
                                        i16 = i18;
                                    }
                                    uuVar.VgvYg0wo = true;
                                    return;
                                }
                                ru ruVar11 = guVar.MdtA4re8;
                                int length4 = iArr2.length;
                                ru ruVar12 = ruVar11;
                                for (int i21 = 0; i21 < length4; i21++) {
                                    int i22 = iArr2[i21];
                                    Bundle bundle12 = bundleArr2[i21];
                                    if (i21 == 0) {
                                        Qr9iLBAD = guVar.MdtA4re8;
                                    } else {
                                        ruVar12.getClass();
                                        Qr9iLBAD = ruVar12.Qr9iLBAD(i22);
                                    }
                                    if (Qr9iLBAD == null) {
                                        int i23 = pu.b2ZJblxo;
                                        throw new IllegalStateException("Deep Linking failed: destination " + ra.KlHjfFWx(k0Var, i22) + " cannot be found in graph " + ruVar12);
                                    }
                                    if (i21 == iArr2.length - 1) {
                                        ru ruVar13 = guVar.MdtA4re8;
                                        ruVar13.getClass();
                                        guVar.k3x7lurq(Qr9iLBAD, bundle12, new xu(false, false, ruVar13.MdtA4re8.qoPGr6Ce, true, false, 0, 0, -1, -1));
                                    } else if (Qr9iLBAD instanceof ru) {
                                        while (true) {
                                            ruVar2 = (ru) Qr9iLBAD;
                                            ruVar2.getClass();
                                            yt ytVar3 = ruVar2.Qr9iLBAD;
                                            if (!(ruVar2.Qr9iLBAD(ytVar3.qoPGr6Ce) instanceof ru)) {
                                                break;
                                            } else {
                                                Qr9iLBAD = ruVar2.Qr9iLBAD(ytVar3.qoPGr6Ce);
                                            }
                                        }
                                        ruVar12 = ruVar2;
                                    }
                                }
                                uuVar.VgvYg0wo = true;
                                return;
                            }
                            Log.i("NavController", "Could not find destination " + str + " in the navigation graph, ignoring the deep link from " + intent);
                        }
                    }
                } else {
                    iArr = intArray;
                }
                iArr2 = iArr;
                if (iArr2 != null) {
                    guVar.getClass();
                    ru ruVar82 = guVar.MdtA4re8;
                    length = iArr2.length;
                    i = 0;
                    while (true) {
                        if (i < length) {
                        }
                        i++;
                    }
                    if (str != null) {
                    }
                }
            }
            intArray = r4;
            if (extras == null) {
            }
            Bundle VgvYg0wo3 = w30.VgvYg0wo((hx[]) Arrays.copyOf(new hx[0], 0));
            if (extras == null) {
            }
            if (bundle2 != null) {
            }
            if (intArray != null) {
            }
            ru jb9XjC4I22 = guVar.jb9XjC4I();
            iArr = intArray;
            jb9XjC4I = jb9XjC4I22.jb9XjC4I(new f0(intent.getData(), intent.getAction(), intent.getType(), 11), jb9XjC4I22);
            if (jb9XjC4I != null) {
            }
            iArr2 = iArr;
            if (iArr2 != null) {
            }
        }
        ru ruVar14 = this.MdtA4re8;
        ruVar14.getClass();
        k3x7lurq(ruVar14, bundle, null);
    }

    public final pu P7K7Inc8() {
        ut utVar = (ut) this.P7K7Inc8.P7K7Inc8();
        if (utVar != null) {
            return utVar.MdtA4re8;
        }
        return null;
    }

    public final po Qr9iLBAD() {
        return this.OnDfzHZD == null ? po.wxUZMvaN : this.sjUBp5pO;
    }

    public final ut VgvYg0wo(int i) {
        Object obj;
        q0 q0Var = this.P7K7Inc8;
        ListIterator<E> listIterator = q0Var.listIterator(q0Var.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((ut) obj).MdtA4re8.MdtA4re8.qoPGr6Ce == i) {
                break;
            }
        }
        ut utVar = (ut) obj;
        if (utVar != null) {
            return utVar;
        }
        throw new IllegalArgumentException(("No destination with ID " + i + " is on the NavController's back stack. The current destination is " + P7K7Inc8()).toString());
    }

    public final void amk52bBQ(ut utVar) {
        utVar.getClass();
        ut utVar2 = (ut) this.jb9XjC4I.remove(utVar);
        if (utVar2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.eVhOlqcC;
        f1 f1Var = (f1) linkedHashMap.get(utVar2);
        Integer valueOf = f1Var != null ? Integer.valueOf(f1Var.qoPGr6Ce.decrementAndGet()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            au auVar = (au) this.KlHjfFWx.get(this.amk52bBQ.NCTxEWno(utVar2.MdtA4re8.NCTxEWno));
            if (auVar != null) {
                auVar.MdtA4re8(utVar2);
            }
            linkedHashMap.remove(utVar2);
        }
    }

    public final ru b2ZJblxo() {
        ru ruVar = this.MdtA4re8;
        if (ruVar != null) {
            ruVar.getClass();
            return ruVar;
        }
        m1.Ey6iv0m0("You must call setGraph() before calling getGraph()");
        return null;
    }

    public final void eVhOlqcC(ut utVar, ut utVar2) {
        this.jb9XjC4I.put(utVar, utVar2);
        LinkedHashMap linkedHashMap = this.eVhOlqcC;
        if (linkedHashMap.get(utVar2) == null) {
            linkedHashMap.put(utVar2, new f1());
        }
        Object obj = linkedHashMap.get(utVar2);
        obj.getClass();
        ((f1) obj).qoPGr6Ce.incrementAndGet();
    }

    public final ru jb9XjC4I() {
        pu puVar;
        ut utVar = (ut) this.P7K7Inc8.P7K7Inc8();
        if (utVar == null || (puVar = utVar.MdtA4re8) == null) {
            puVar = this.MdtA4re8;
            puVar.getClass();
        }
        ru ruVar = puVar instanceof ru ? (ru) puVar : null;
        if (ruVar != null) {
            return ruVar;
        }
        ru ruVar2 = puVar.wxUZMvaN;
        ruVar2.getClass();
        return ruVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f4, code lost:
    
        if (r13.equals(r3) == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0106, code lost:
    
        r3 = new defpackage.q0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0110, code lost:
    
        if ((r12.size() - r7) < r14) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0112, code lost:
    
        r6 = (defpackage.ut) defpackage.d6.TrssYQ34(r12);
        amk52bBQ(r6);
        r23 = r4;
        r15 = new defpackage.ut(r6.NCTxEWno, r6.MdtA4re8, r6.MdtA4re8.qoPGr6Ce(r26), r6.VgvYg0wo, r6.P7K7Inc8, r6.b2ZJblxo, r6.Qr9iLBAD);
        r4 = r6.VgvYg0wo;
        r8 = r15.jb9XjC4I;
        r8.getClass();
        r4.getClass();
        r8.wxUZMvaN = r4;
        r8.k3x7lurq = r6.jb9XjC4I.k3x7lurq;
        r8.NCTxEWno();
        r3.addFirst(r15);
        r4 = r23;
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015e, code lost:
    
        r23 = r4;
        r4 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0168, code lost:
    
        if (r4.hasNext() == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x016a, code lost:
    
        r6 = (defpackage.ut) r4.next();
        r7 = r6.MdtA4re8.wxUZMvaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0174, code lost:
    
        if (r7 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0176, code lost:
    
        eVhOlqcC(r6, VgvYg0wo(r7.MdtA4re8.qoPGr6Ce));
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0181, code lost:
    
        r12.addLast(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0185, code lost:
    
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018d, code lost:
    
        if (r3.hasNext() == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018f, code lost:
    
        r4 = (defpackage.ut) r3.next();
        r11.NCTxEWno(r4.MdtA4re8.NCTxEWno).P7K7Inc8(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a1, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0104, code lost:
    
        if (r3.qoPGr6Ce == r6.MdtA4re8.qoPGr6Ce) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01e0 A[LOOP:1: B:19:0x01da->B:21:0x01e0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x008d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k3x7lurq(final pu puVar, Bundle bundle, xu xuVar) {
        boolean z;
        LinkedHashMap linkedHashMap;
        boolean z2;
        ListIterator listIterator;
        int i;
        Iterator it;
        puVar.getClass();
        VM67d7Sv vM67d7Sv = puVar.MdtA4re8;
        LinkedHashMap linkedHashMap2 = this.KlHjfFWx;
        Iterator it2 = linkedHashMap2.values().iterator();
        while (true) {
            int i2 = 1;
            if (!it2.hasNext()) {
                break;
            } else {
                ((au) it2.next()).wxUZMvaN = true;
            }
        }
        final j20 j20Var = new j20();
        if (xuVar != null) {
            boolean z3 = xuVar.VgvYg0wo;
            boolean z4 = xuVar.wxUZMvaN;
            int i3 = xuVar.MdtA4re8;
            if (i3 != -1) {
                z = ow5vqvCr(i3, z4, z3);
                final Bundle qoPGr6Ce = puVar.qoPGr6Ce(bundle);
                if (xuVar != null && xuVar.NCTxEWno) {
                    if (this.k3x7lurq.containsKey(Integer.valueOf(vM67d7Sv.qoPGr6Ce))) {
                        j20Var.NCTxEWno = sjUBp5pO(vM67d7Sv.qoPGr6Ce, qoPGr6Ce, xuVar);
                        linkedHashMap = linkedHashMap2;
                        z2 = false;
                        this.NCTxEWno.qoPGr6Ce();
                        it = linkedHashMap.values().iterator();
                        while (it.hasNext()) {
                            ((au) it.next()).wxUZMvaN = false;
                        }
                        if (!z || j20Var.NCTxEWno || z2) {
                            NCTxEWno();
                        } else {
                            KlHjfFWx();
                            return;
                        }
                    }
                }
                xv xvVar = this.amk52bBQ;
                if (xuVar != null && xuVar.qoPGr6Ce) {
                    q0 q0Var = this.P7K7Inc8;
                    ut utVar = (ut) q0Var.P7K7Inc8();
                    listIterator = q0Var.listIterator(q0Var.qoPGr6Ce());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            i = -1;
                            break;
                        } else if (((ut) listIterator.previous()).MdtA4re8 == puVar) {
                            i = listIterator.nextIndex();
                            break;
                        }
                    }
                    if (i != -1) {
                        if (puVar instanceof ru) {
                            int i4 = ru.jb9XjC4I;
                            List FySoLYna = l60.FySoLYna(new nb0(l60.RXQxj5Oe((ru) puVar, new tKaxLBvG(17)), new tKaxLBvG(12), 1));
                            if (q0Var.wxUZMvaN - i == FySoLYna.size()) {
                                List subList = q0Var.subList(i, q0Var.wxUZMvaN);
                                ArrayList arrayList = new ArrayList(z5.bvfAo0eO(subList, 10));
                                Iterator it3 = subList.iterator();
                                while (it3.hasNext()) {
                                    arrayList.add(Integer.valueOf(((ut) it3.next()).MdtA4re8.MdtA4re8.qoPGr6Ce));
                                }
                            }
                        } else if (utVar != null) {
                            pu puVar2 = utVar.MdtA4re8;
                            if (puVar2 != null) {
                            }
                        }
                        if (!z2) {
                            ut MdtA4re8 = re.MdtA4re8(this.qoPGr6Ce.MdtA4re8, puVar, qoPGr6Ce, Qr9iLBAD(), this.ygLcUYwZ);
                            wv NCTxEWno = xvVar.NCTxEWno(puVar.NCTxEWno);
                            List FySoLYna2 = ra.FySoLYna(MdtA4re8);
                            this.Ey6iv0m0 = new zk() { // from class: cu
                                @Override // defpackage.zk
                                public final Object ow5vqvCr(Object obj) {
                                    ut utVar2 = (ut) obj;
                                    utVar2.getClass();
                                    j20.this.NCTxEWno = true;
                                    this.qoPGr6Ce(puVar, qoPGr6Ce, utVar2, wf.NCTxEWno);
                                    return xe0.qoPGr6Ce;
                                }
                            };
                            NCTxEWno.wxUZMvaN(FySoLYna2, xuVar);
                            this.Ey6iv0m0 = null;
                        }
                        this.NCTxEWno.qoPGr6Ce();
                        it = linkedHashMap.values().iterator();
                        while (it.hasNext()) {
                        }
                        if (z) {
                        }
                        NCTxEWno();
                    }
                }
                linkedHashMap = linkedHashMap2;
                z2 = false;
                if (!z2) {
                }
                this.NCTxEWno.qoPGr6Ce();
                it = linkedHashMap.values().iterator();
                while (it.hasNext()) {
                }
                if (z) {
                }
                NCTxEWno();
            }
        }
        z = false;
        final Bundle qoPGr6Ce2 = puVar.qoPGr6Ce(bundle);
        if (xuVar != null) {
            if (this.k3x7lurq.containsKey(Integer.valueOf(vM67d7Sv.qoPGr6Ce))) {
            }
        }
        xv xvVar2 = this.amk52bBQ;
        if (xuVar != null) {
            q0 q0Var2 = this.P7K7Inc8;
            ut utVar2 = (ut) q0Var2.P7K7Inc8();
            listIterator = q0Var2.listIterator(q0Var2.qoPGr6Ce());
            while (true) {
                if (listIterator.hasPrevious()) {
                }
            }
            if (i != -1) {
            }
        }
        linkedHashMap = linkedHashMap2;
        z2 = false;
        if (!z2) {
        }
        this.NCTxEWno.qoPGr6Ce();
        it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
        }
        if (z) {
        }
        NCTxEWno();
    }

    public final ArrayList lDXGDhIF() {
        po poVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.KlHjfFWx.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            poVar = po.VgvYg0wo;
            if (!hasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((au) it.next()).P7K7Inc8.NCTxEWno.Qr9iLBAD();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                ut utVar = (ut) obj;
                if (!arrayList.contains(utVar) && utVar.jb9XjC4I.k3x7lurq.compareTo(poVar) < 0) {
                    arrayList2.add(obj);
                }
            }
            d6.KRabZ4CU(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.P7K7Inc8.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            ut utVar2 = (ut) next;
            if (!arrayList.contains(utVar2) && utVar2.jb9XjC4I.k3x7lurq.compareTo(poVar) >= 0) {
                arrayList3.add(next);
            }
        }
        d6.KRabZ4CU(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            if (!(((ut) obj2).MdtA4re8 instanceof ru)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public final boolean ow5vqvCr(int i, boolean z, boolean z2) {
        pu puVar;
        boolean z3;
        q0 q0Var = this.P7K7Inc8;
        final int i2 = 0;
        if (q0Var.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = x5.f7oeun2L(q0Var).iterator();
        while (true) {
            if (!it.hasNext()) {
                puVar = null;
                break;
            }
            pu puVar2 = ((ut) it.next()).MdtA4re8;
            String str = puVar2.NCTxEWno;
            VM67d7Sv vM67d7Sv = puVar2.MdtA4re8;
            wv NCTxEWno = this.amk52bBQ.NCTxEWno(str);
            if (z || vM67d7Sv.qoPGr6Ce != i) {
                arrayList.add(NCTxEWno);
            }
            if (vM67d7Sv.qoPGr6Ce == i) {
                puVar = puVar2;
                break;
            }
        }
        if (puVar == null) {
            int i3 = pu.b2ZJblxo;
            Log.i("NavController", "Ignoring popBackStack to destination " + ra.KlHjfFWx(this.qoPGr6Ce.MdtA4re8, i) + " as it was not found on the current back stack");
            return false;
        }
        j20 j20Var = new j20();
        q0 q0Var2 = new q0();
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                z3 = z2;
                break;
            }
            int i5 = i4 + 1;
            wv wvVar = (wv) arrayList.get(i4);
            j20 j20Var2 = new j20();
            ut utVar = (ut) q0Var.last();
            z3 = z2;
            du duVar = new du(j20Var2, j20Var, this, z3, q0Var2);
            wvVar.getClass();
            utVar.getClass();
            this.I5GHvsYW = duVar;
            wvVar.jb9XjC4I(utVar, z3);
            this.I5GHvsYW = null;
            if (!j20Var2.NCTxEWno) {
                break;
            }
            i4 = i5;
        }
        if (z3) {
            LinkedHashMap linkedHashMap = this.k3x7lurq;
            if (!z) {
                vg vgVar = new vg(new nb0(l60.RXQxj5Oe(puVar, new tKaxLBvG(10)), new zk(this) { // from class: eu
                    public final /* synthetic */ gu MdtA4re8;

                    {
                        this.MdtA4re8 = this;
                    }

                    @Override // defpackage.zk
                    public final Object ow5vqvCr(Object obj) {
                        boolean containsKey;
                        int i6 = i2;
                        gu guVar = this.MdtA4re8;
                        pu puVar3 = (pu) obj;
                        switch (i6) {
                            case 0:
                                puVar3.getClass();
                                containsKey = guVar.k3x7lurq.containsKey(Integer.valueOf(puVar3.MdtA4re8.qoPGr6Ce));
                                break;
                            default:
                                puVar3.getClass();
                                containsKey = guVar.k3x7lurq.containsKey(Integer.valueOf(puVar3.MdtA4re8.qoPGr6Ce));
                                break;
                        }
                        return Boolean.valueOf(!containsKey);
                    }
                }, 0));
                while (vgVar.hasNext()) {
                    Integer valueOf = Integer.valueOf(((pu) vgVar.next()).MdtA4re8.qoPGr6Ce);
                    xt xtVar = (xt) (q0Var2.isEmpty() ? null : q0Var2.MdtA4re8[q0Var2.NCTxEWno]);
                    linkedHashMap.put(valueOf, xtVar != null ? (String) xtVar.qoPGr6Ce.NCTxEWno : null);
                }
            }
            if (!q0Var2.isEmpty()) {
                yt ytVar = ((xt) q0Var2.first()).qoPGr6Ce;
                String str2 = (String) ytVar.NCTxEWno;
                final int i6 = 1;
                vg vgVar2 = new vg(new nb0(l60.RXQxj5Oe(MdtA4re8(ytVar.qoPGr6Ce, null), new tKaxLBvG(11)), new zk(this) { // from class: eu
                    public final /* synthetic */ gu MdtA4re8;

                    {
                        this.MdtA4re8 = this;
                    }

                    @Override // defpackage.zk
                    public final Object ow5vqvCr(Object obj) {
                        boolean containsKey;
                        int i62 = i6;
                        gu guVar = this.MdtA4re8;
                        pu puVar3 = (pu) obj;
                        switch (i62) {
                            case 0:
                                puVar3.getClass();
                                containsKey = guVar.k3x7lurq.containsKey(Integer.valueOf(puVar3.MdtA4re8.qoPGr6Ce));
                                break;
                            default:
                                puVar3.getClass();
                                containsKey = guVar.k3x7lurq.containsKey(Integer.valueOf(puVar3.MdtA4re8.qoPGr6Ce));
                                break;
                        }
                        return Boolean.valueOf(!containsKey);
                    }
                }, 0));
                while (vgVar2.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((pu) vgVar2.next()).MdtA4re8.qoPGr6Ce), str2);
                }
                if (linkedHashMap.values().contains(str2)) {
                    this.ow5vqvCr.put(str2, q0Var2);
                }
            }
        }
        this.NCTxEWno.qoPGr6Ce();
        return j20Var.NCTxEWno;
    }

    public final void qoPGr6Ce(pu puVar, Bundle bundle, ut utVar, List list) {
        Object obj;
        Object obj2;
        k0 k0Var = this.qoPGr6Ce.MdtA4re8;
        pu puVar2 = utVar.MdtA4re8;
        boolean z = puVar2 instanceof pc;
        q0 q0Var = this.P7K7Inc8;
        if (!z) {
            while (!q0Var.isEmpty() && (((ut) q0Var.last()).MdtA4re8 instanceof pc) && ow5vqvCr(((ut) q0Var.last()).MdtA4re8.MdtA4re8.qoPGr6Ce, true, false)) {
            }
        }
        q0 q0Var2 = new q0();
        Object obj3 = null;
        if (puVar instanceof ru) {
            pu puVar3 = puVar2;
            do {
                puVar3.getClass();
                puVar3 = puVar3.wxUZMvaN;
                if (puVar3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = listIterator.previous();
                            if (fn.qoPGr6Ce(((ut) obj2).MdtA4re8, puVar3)) {
                                break;
                            }
                        }
                    }
                    ut utVar2 = (ut) obj2;
                    if (utVar2 == null) {
                        utVar2 = re.MdtA4re8(k0Var, puVar3, bundle, Qr9iLBAD(), this.ygLcUYwZ);
                    }
                    q0Var2.addFirst(utVar2);
                    if (!q0Var.isEmpty() && ((ut) q0Var.last()).MdtA4re8 == puVar3) {
                        ygLcUYwZ(this, (ut) q0Var.last());
                    }
                }
                if (puVar3 == null) {
                    break;
                }
            } while (puVar3 != puVar);
        }
        pu puVar4 = q0Var2.isEmpty() ? puVar2 : ((ut) q0Var2.first()).MdtA4re8;
        while (puVar4 != null && MdtA4re8(puVar4.MdtA4re8.qoPGr6Ce, puVar4) != puVar4) {
            puVar4 = puVar4.wxUZMvaN;
            if (puVar4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        obj = null;
                        break;
                    } else {
                        obj = listIterator2.previous();
                        if (fn.qoPGr6Ce(((ut) obj).MdtA4re8, puVar4)) {
                            break;
                        }
                    }
                }
                ut utVar3 = (ut) obj;
                if (utVar3 == null) {
                    utVar3 = re.MdtA4re8(k0Var, puVar4, puVar4.qoPGr6Ce(bundle2), Qr9iLBAD(), this.ygLcUYwZ);
                }
                q0Var2.addFirst(utVar3);
            }
        }
        if (!q0Var2.isEmpty()) {
            puVar2 = ((ut) q0Var2.first()).MdtA4re8;
        }
        while (!q0Var.isEmpty() && (((ut) q0Var.last()).MdtA4re8 instanceof ru)) {
            pu puVar5 = ((ut) q0Var.last()).MdtA4re8;
            puVar5.getClass();
            if (ej0.eVhOlqcC((a80) ((ru) puVar5).Qr9iLBAD.wxUZMvaN, puVar2.MdtA4re8.qoPGr6Ce) != null) {
                break;
            } else {
                ygLcUYwZ(this, (ut) q0Var.last());
            }
        }
        ut utVar4 = (ut) (q0Var.isEmpty() ? null : q0Var.MdtA4re8[q0Var.NCTxEWno]);
        if (utVar4 == null) {
            utVar4 = (ut) (q0Var2.isEmpty() ? null : q0Var2.MdtA4re8[q0Var2.NCTxEWno]);
        }
        if (!fn.qoPGr6Ce(utVar4 != null ? utVar4.MdtA4re8 : null, this.MdtA4re8)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object previous = listIterator3.previous();
                pu puVar6 = ((ut) previous).MdtA4re8;
                ru ruVar = this.MdtA4re8;
                ruVar.getClass();
                if (fn.qoPGr6Ce(puVar6, ruVar)) {
                    obj3 = previous;
                    break;
                }
            }
            ut utVar5 = (ut) obj3;
            if (utVar5 == null) {
                ru ruVar2 = this.MdtA4re8;
                ruVar2.getClass();
                ru ruVar3 = this.MdtA4re8;
                ruVar3.getClass();
                utVar5 = re.MdtA4re8(k0Var, ruVar2, ruVar3.qoPGr6Ce(bundle), Qr9iLBAD(), this.ygLcUYwZ);
            }
            q0Var2.addFirst(utVar5);
        }
        Iterator it = q0Var2.iterator();
        while (it.hasNext()) {
            ut utVar6 = (ut) it.next();
            Object obj4 = this.KlHjfFWx.get(this.amk52bBQ.NCTxEWno(utVar6.MdtA4re8.NCTxEWno));
            if (obj4 == null) {
                m1.I5GHvsYW(puVar.NCTxEWno, " should already be created", "NavigatorBackStack for ");
                return;
            }
            ((au) obj4).qoPGr6Ce(utVar6);
        }
        q0Var.addAll(q0Var2);
        q0Var.addLast(utVar);
        ArrayList orhfF2Ya = x5.orhfF2Ya(q0Var2, utVar);
        int size = orhfF2Ya.size();
        int i = 0;
        while (i < size) {
            Object obj5 = orhfF2Ya.get(i);
            i++;
            ut utVar7 = (ut) obj5;
            ru ruVar4 = utVar7.MdtA4re8.wxUZMvaN;
            if (ruVar4 != null) {
                eVhOlqcC(utVar7, VgvYg0wo(ruVar4.MdtA4re8.qoPGr6Ce));
            }
        }
    }

    public final boolean sjUBp5pO(int i, final Bundle bundle, xu xuVar) {
        pu b2ZJblxo;
        ut utVar;
        pu puVar;
        Bundle bundle2;
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.k3x7lurq;
        int i2 = 0;
        if (!linkedHashMap.containsKey(valueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        Collection values = linkedHashMap.values();
        values.getClass();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (fn.qoPGr6Ce((String) it.next(), str)) {
                it.remove();
            }
        }
        LinkedHashMap linkedHashMap2 = this.ow5vqvCr;
        le0.MdtA4re8(linkedHashMap2);
        q0 q0Var = (q0) linkedHashMap2.remove(str);
        k0 k0Var = this.qoPGr6Ce.MdtA4re8;
        ArrayList arrayList = new ArrayList();
        ut utVar2 = (ut) this.P7K7Inc8.P7K7Inc8();
        if (utVar2 == null || (b2ZJblxo = utVar2.MdtA4re8) == null) {
            b2ZJblxo = b2ZJblxo();
        }
        if (q0Var != null) {
            Iterator it2 = q0Var.iterator();
            while (it2.hasNext()) {
                xt xtVar = (xt) it2.next();
                yt ytVar = xtVar.qoPGr6Ce;
                yt ytVar2 = xtVar.qoPGr6Ce;
                pu wxUZMvaN = wxUZMvaN(ytVar.qoPGr6Ce, b2ZJblxo, null, true);
                if (wxUZMvaN == null) {
                    int i3 = pu.b2ZJblxo;
                    m1.OxcuoDLp("Restore State failed: destination ", ra.KlHjfFWx(k0Var, ytVar2.qoPGr6Ce), " cannot be found from the current destination ", b2ZJblxo);
                    return false;
                }
                po Qr9iLBAD = Qr9iLBAD();
                hu huVar = this.ygLcUYwZ;
                k0Var.getClass();
                Qr9iLBAD.getClass();
                Bundle bundle3 = (Bundle) ytVar2.MdtA4re8;
                if (bundle3 != null) {
                    bundle3.setClassLoader(k0Var.qoPGr6Ce.getClassLoader());
                    bundle2 = bundle3;
                } else {
                    bundle2 = null;
                }
                arrayList.add(new ut(k0Var, wxUZMvaN, bundle2, Qr9iLBAD, huVar, (String) ytVar2.NCTxEWno, (Bundle) ytVar2.wxUZMvaN));
                b2ZJblxo = wxUZMvaN;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            if (!(((ut) obj).MdtA4re8 instanceof ru)) {
                arrayList3.add(obj);
            }
        }
        int size2 = arrayList3.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList3.get(i5);
            i5++;
            ut utVar3 = (ut) obj2;
            List list = (List) x5.hGvurcGl(arrayList2);
            if (fn.qoPGr6Ce((list == null || (utVar = (ut) x5.LvHlPNBd(list)) == null || (puVar = utVar.MdtA4re8) == null) ? null : puVar.NCTxEWno, utVar3.MdtA4re8.NCTxEWno)) {
                list.add(utVar3);
            } else {
                arrayList2.add(new ArrayList(new p0(new ut[]{utVar3})));
            }
        }
        final j20 j20Var = new j20();
        int size3 = arrayList2.size();
        while (i2 < size3) {
            Object obj3 = arrayList2.get(i2);
            i2++;
            List list2 = (List) obj3;
            wv NCTxEWno = this.amk52bBQ.NCTxEWno(((ut) x5.ESscZ9M1(list2)).MdtA4re8.NCTxEWno);
            final k20 k20Var = new k20();
            final ArrayList arrayList4 = arrayList;
            this.Ey6iv0m0 = new zk() { // from class: fu
                @Override // defpackage.zk
                public final Object ow5vqvCr(Object obj4) {
                    List list3;
                    ut utVar4 = (ut) obj4;
                    utVar4.getClass();
                    j20.this.NCTxEWno = true;
                    ArrayList arrayList5 = arrayList4;
                    int indexOf = arrayList5.indexOf(utVar4);
                    if (indexOf != -1) {
                        k20 k20Var2 = k20Var;
                        int i6 = indexOf + 1;
                        list3 = arrayList5.subList(k20Var2.NCTxEWno, i6);
                        k20Var2.NCTxEWno = i6;
                    } else {
                        list3 = wf.NCTxEWno;
                    }
                    this.qoPGr6Ce(utVar4.MdtA4re8, bundle, utVar4, list3);
                    return xe0.qoPGr6Ce;
                }
            };
            NCTxEWno.wxUZMvaN(list2, xuVar);
            this.Ey6iv0m0 = null;
            arrayList = arrayList4;
        }
        return j20Var.NCTxEWno;
    }
}
