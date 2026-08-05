package defpackage;

import android.os.Bundle;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class dj implements bj {
    public final /* synthetic */ ej MdtA4re8;
    public final String NCTxEWno;
    public final /* synthetic */ int qoPGr6Ce;

    public /* synthetic */ dj(ej ejVar, String str, int i) {
        this.qoPGr6Ce = i;
        this.MdtA4re8 = ejVar;
        this.NCTxEWno = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a6, code lost:
    
        if (r5 != 8) goto L34;
     */
    @Override // defpackage.bj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean qoPGr6Ce(ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i2 = this.qoPGr6Ce;
        Throwable th = null;
        String str = this.NCTxEWno;
        ej ejVar = this.MdtA4re8;
        switch (i2) {
            case 0:
                p1 p1Var = (p1) ejVar.eVhOlqcC.remove(str);
                if (p1Var == null) {
                    return false;
                }
                HashMap hashMap = new HashMap();
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    n1 n1Var = (n1) obj;
                    if (n1Var.Ey6iv0m0) {
                        ArrayList arrayList3 = n1Var.qoPGr6Ce;
                        int size2 = arrayList3.size();
                        int i4 = 0;
                        while (i4 < size2) {
                            Object obj2 = arrayList3.get(i4);
                            i4++;
                            li liVar = ((ak) obj2).NCTxEWno;
                            if (liVar != null) {
                                hashMap.put(liVar.P7K7Inc8, liVar);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = p1Var.NCTxEWno;
                HashMap hashMap2 = new HashMap(arrayList4.size());
                int size3 = arrayList4.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj3 = arrayList4.get(i5);
                    i5++;
                    String str2 = (String) obj3;
                    li liVar2 = (li) hashMap.get(str2);
                    if (liVar2 != null) {
                        hashMap2.put(liVar2.P7K7Inc8, liVar2);
                    } else {
                        Bundle OnDfzHZD = ejVar.MdtA4re8.OnDfzHZD(str2, null);
                        if (OnDfzHZD != null) {
                            ClassLoader classLoader = ejVar.I5GHvsYW.OxcuoDLp.getClassLoader();
                            li qoPGr6Ce = ((wj) OnDfzHZD.getParcelable("state")).qoPGr6Ce(ejVar.Mq3SeTnW());
                            qoPGr6Ce.MdtA4re8 = OnDfzHZD;
                            if (OnDfzHZD.getBundle("savedInstanceState") == null) {
                                qoPGr6Ce.MdtA4re8.putBundle("savedInstanceState", new Bundle());
                            }
                            Bundle bundle = OnDfzHZD.getBundle("arguments");
                            if (bundle != null) {
                                bundle.setClassLoader(classLoader);
                            }
                            qoPGr6Ce.hzgxAD8d(bundle);
                            hashMap2.put(qoPGr6Ce.P7K7Inc8, qoPGr6Ce);
                        }
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = p1Var.MdtA4re8;
                int size4 = arrayList6.size();
                int i6 = 0;
                while (i6 < size4) {
                    Object obj4 = arrayList6.get(i6);
                    i6++;
                    o1 o1Var = (o1) obj4;
                    ArrayList arrayList7 = o1Var.MdtA4re8;
                    n1 n1Var2 = new n1(ejVar);
                    o1Var.qoPGr6Ce(n1Var2);
                    for (int i7 = 0; i7 < arrayList7.size(); i7++) {
                        String str3 = (String) arrayList7.get(i7);
                        if (str3 != null) {
                            li liVar3 = (li) hashMap2.get(str3);
                            if (liVar3 == null) {
                                throw new IllegalStateException("Restoring FragmentTransaction " + o1Var.b2ZJblxo + " failed due to missing saved state for Fragment (" + str3 + ")");
                            }
                            ((ak) n1Var2.qoPGr6Ce.get(i7)).NCTxEWno = liVar3;
                        }
                    }
                    arrayList5.add(n1Var2);
                }
                int size5 = arrayList5.size();
                int i8 = 0;
                boolean z = false;
                while (i8 < size5) {
                    Object obj5 = arrayList5.get(i8);
                    i8++;
                    ((n1) obj5).qoPGr6Ce(arrayList, arrayList2);
                    z = true;
                }
                return z;
            default:
                char c = 65535;
                int DK9slbsy = ejVar.DK9slbsy(str, -1, true);
                if (DK9slbsy < 0) {
                    return false;
                }
                for (int i9 = DK9slbsy; i9 < ejVar.wxUZMvaN.size(); i9++) {
                    n1 n1Var3 = (n1) ejVar.wxUZMvaN.get(i9);
                    if (!n1Var3.sjUBp5pO) {
                        ejVar.pP9Y2m6O(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + n1Var3 + " that did not use setReorderingAllowed(true)."));
                        throw null;
                    }
                }
                HashSet hashSet = new HashSet();
                int i10 = DK9slbsy;
                while (i10 < ejVar.wxUZMvaN.size()) {
                    n1 n1Var4 = (n1) ejVar.wxUZMvaN.get(i10);
                    HashSet hashSet2 = new HashSet();
                    char c2 = c;
                    HashSet hashSet3 = new HashSet();
                    ArrayList arrayList8 = n1Var4.qoPGr6Ce;
                    Throwable th2 = th;
                    int size6 = arrayList8.size();
                    int i11 = 0;
                    while (i11 < size6) {
                        Object obj6 = arrayList8.get(i11);
                        i11++;
                        ak akVar = (ak) obj6;
                        li liVar4 = akVar.NCTxEWno;
                        if (liVar4 != null) {
                            ArrayList arrayList9 = arrayList8;
                            if (akVar.MdtA4re8) {
                                int i12 = akVar.qoPGr6Ce;
                                i = size6;
                                if (i12 != 1) {
                                    if (i12 != 2) {
                                        break;
                                    }
                                }
                            } else {
                                i = size6;
                            }
                            hashSet.add(liVar4);
                            hashSet2.add(liVar4);
                            int i13 = akVar.qoPGr6Ce;
                            if (i13 == 1 || i13 == 2) {
                                hashSet3.add(liVar4);
                            }
                            arrayList8 = arrayList9;
                            size6 = i;
                        }
                    }
                    hashSet2.removeAll(hashSet3);
                    if (!hashSet2.isEmpty()) {
                        StringBuilder b2ZJblxo = q70.b2ZJblxo("saveBackStack(\"", str, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                        b2ZJblxo.append(hashSet2.size() == 1 ? " " + hashSet2.iterator().next() : "s " + hashSet2);
                        b2ZJblxo.append(" in ");
                        b2ZJblxo.append(n1Var4);
                        b2ZJblxo.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                        ejVar.pP9Y2m6O(new IllegalArgumentException(b2ZJblxo.toString()));
                        throw th2;
                    }
                    i10++;
                    c = c2;
                    th = th2;
                }
                Throwable th3 = th;
                ArrayDeque arrayDeque = new ArrayDeque(hashSet);
                while (!arrayDeque.isEmpty()) {
                    li liVar5 = (li) arrayDeque.removeFirst();
                    if (liVar5.i7xS8jrb) {
                        StringBuilder b2ZJblxo2 = q70.b2ZJblxo("saveBackStack(\"", str, "\") must not contain retained fragments. Found ");
                        b2ZJblxo2.append(hashSet.contains(liVar5) ? "direct reference to retained " : "retained child ");
                        b2ZJblxo2.append("fragment ");
                        b2ZJblxo2.append(liVar5);
                        ejVar.pP9Y2m6O(new IllegalArgumentException(b2ZJblxo2.toString()));
                        throw th3;
                    }
                    ArrayList P7K7Inc8 = liVar5.RXQxj5Oe.MdtA4re8.P7K7Inc8();
                    int size7 = P7K7Inc8.size();
                    int i14 = 0;
                    while (i14 < size7) {
                        Object obj7 = P7K7Inc8.get(i14);
                        i14++;
                        li liVar6 = (li) obj7;
                        if (liVar6 != null) {
                            arrayDeque.addLast(liVar6);
                        }
                    }
                }
                ArrayList arrayList10 = new ArrayList();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    arrayList10.add(((li) it.next()).P7K7Inc8);
                }
                ArrayList arrayList11 = new ArrayList(ejVar.wxUZMvaN.size() - DK9slbsy);
                int i15 = DK9slbsy;
                while (i15 < ejVar.wxUZMvaN.size()) {
                    arrayList11.add(th3);
                    i15++;
                    th3 = null;
                }
                p1 p1Var2 = new p1(arrayList10, arrayList11);
                boolean z2 = true;
                int size8 = ejVar.wxUZMvaN.size() - 1;
                while (size8 >= DK9slbsy) {
                    n1 n1Var5 = (n1) ejVar.wxUZMvaN.remove(size8);
                    n1 n1Var6 = new n1(n1Var5);
                    ArrayList arrayList12 = n1Var6.qoPGr6Ce;
                    int size9 = arrayList12.size() - 1;
                    while (size9 >= 0) {
                        ak akVar2 = (ak) arrayList12.get(size9);
                        if (akVar2.MdtA4re8) {
                            if (akVar2.qoPGr6Ce == 8) {
                                akVar2.MdtA4re8 = false;
                                arrayList12.remove(size9 - 1);
                                size9--;
                            } else {
                                int i16 = akVar2.NCTxEWno.WYNAV5pd;
                                akVar2.qoPGr6Ce = 2;
                                akVar2.MdtA4re8 = false;
                                for (int i17 = size9 - 1; i17 >= 0; i17--) {
                                    ak akVar3 = (ak) arrayList12.get(i17);
                                    if (akVar3.MdtA4re8 && akVar3.NCTxEWno.WYNAV5pd == i16) {
                                        arrayList12.remove(i17);
                                        size9--;
                                    }
                                }
                            }
                        }
                        size9--;
                    }
                    arrayList11.set(size8 - DK9slbsy, new o1(n1Var6));
                    n1Var5.Ey6iv0m0 = true;
                    arrayList.add(n1Var5);
                    arrayList2.add(Boolean.TRUE);
                    size8--;
                    z2 = true;
                }
                boolean z3 = z2;
                ejVar.eVhOlqcC.put(str, p1Var2);
                return z3;
        }
    }
}
