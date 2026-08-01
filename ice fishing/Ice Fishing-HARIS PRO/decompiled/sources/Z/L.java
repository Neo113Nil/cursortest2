package Z;

import android.os.Bundle;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class L implements J {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1419a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1420b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M f1421c;

    public /* synthetic */ L(M m2, String str, int i) {
        this.f1419a = i;
        this.f1421c = m2;
        this.f1420b = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x0372, code lost:
    
        r6.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a0, code lost:
    
        if (r6 != 8) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        Iterator it;
        switch (this.f1419a) {
            case 0:
                M m2 = this.f1421c;
                C0055c c0055c = (C0055c) m2.j.remove(this.f1420b);
                boolean z2 = false;
                if (c0055c != null) {
                    HashMap hashMap = new HashMap();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        C0053a c0053a = (C0053a) it2.next();
                        if (c0053a.f1527t) {
                            Iterator it3 = c0053a.f1511a.iterator();
                            while (it3.hasNext()) {
                                AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = ((U) it3.next()).f1488b;
                                if (abstractComponentCallbacksC0070s != null) {
                                    hashMap.put(abstractComponentCallbacksC0070s.e, abstractComponentCallbacksC0070s);
                                }
                            }
                        }
                    }
                    ArrayList<String> arrayList3 = c0055c.f1539a;
                    HashMap hashMap2 = new HashMap(arrayList3.size());
                    for (String str : arrayList3) {
                        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s2 = (AbstractComponentCallbacksC0070s) hashMap.get(str);
                        if (abstractComponentCallbacksC0070s2 != null) {
                            hashMap2.put(abstractComponentCallbacksC0070s2.e, abstractComponentCallbacksC0070s2);
                        } else {
                            Bundle o2 = m2.f1437c.o(null, str);
                            if (o2 != null) {
                                ClassLoader classLoader = m2.f1452u.f1629b.getClassLoader();
                                AbstractComponentCallbacksC0070s a2 = ((S) o2.getParcelable("state")).a(m2.D());
                                a2.f1600b = o2;
                                if (o2.getBundle("savedInstanceState") == null) {
                                    a2.f1600b.putBundle("savedInstanceState", new Bundle());
                                }
                                Bundle bundle = o2.getBundle("arguments");
                                if (bundle != null) {
                                    bundle.setClassLoader(classLoader);
                                }
                                a2.L(bundle);
                                hashMap2.put(a2.e, a2);
                            }
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (C0054b c0054b : c0055c.f1540b) {
                        c0054b.getClass();
                        C0053a c0053a2 = new C0053a(m2);
                        c0054b.a(c0053a2);
                        int i = 0;
                        while (true) {
                            ArrayList arrayList5 = c0054b.f1529b;
                            if (i < arrayList5.size()) {
                                String str2 = (String) arrayList5.get(i);
                                if (str2 != null) {
                                    AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s3 = (AbstractComponentCallbacksC0070s) hashMap2.get(str2);
                                    if (abstractComponentCallbacksC0070s3 == null) {
                                        throw new IllegalStateException("Restoring FragmentTransaction " + c0054b.f1532f + " failed due to missing saved state for Fragment (" + str2 + ")");
                                    }
                                    ((U) c0053a2.f1511a.get(i)).f1488b = abstractComponentCallbacksC0070s3;
                                }
                                i++;
                            }
                        }
                    }
                    Iterator it4 = arrayList4.iterator();
                    while (it4.hasNext()) {
                        ((C0053a) it4.next()).a(arrayList, arrayList2);
                        z2 = true;
                    }
                }
                return z2;
            default:
                M m3 = this.f1421c;
                String str3 = this.f1420b;
                int z3 = m3.z(str3, -1, true);
                if (z3 < 0) {
                    return false;
                }
                for (int i2 = z3; i2 < m3.f1438d.size(); i2++) {
                    C0053a c0053a3 = (C0053a) m3.f1438d.get(i2);
                    if (!c0053a3.f1523p) {
                        m3.b0(new IllegalArgumentException("saveBackStack(\"" + str3 + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + c0053a3 + " that did not use setReorderingAllowed(true)."));
                        throw null;
                    }
                }
                HashSet hashSet = new HashSet();
                for (int i3 = z3; i3 < m3.f1438d.size(); i3++) {
                    C0053a c0053a4 = (C0053a) m3.f1438d.get(i3);
                    HashSet hashSet2 = new HashSet();
                    HashSet hashSet3 = new HashSet();
                    Iterator it5 = c0053a4.f1511a.iterator();
                    while (it5.hasNext()) {
                        U u2 = (U) it5.next();
                        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s4 = u2.f1488b;
                        if (abstractComponentCallbacksC0070s4 != null) {
                            if (u2.f1489c) {
                                int i4 = u2.f1487a;
                                it = it5;
                                if (i4 != 1) {
                                    if (i4 != 2) {
                                        break;
                                    }
                                }
                            } else {
                                it = it5;
                            }
                            hashSet.add(abstractComponentCallbacksC0070s4);
                            hashSet2.add(abstractComponentCallbacksC0070s4);
                            int i5 = u2.f1487a;
                            if (i5 == 1 || i5 == 2) {
                                hashSet3.add(abstractComponentCallbacksC0070s4);
                            }
                            it5 = it;
                        }
                    }
                    hashSet2.removeAll(hashSet3);
                    if (!hashSet2.isEmpty()) {
                        StringBuilder sb = new StringBuilder("saveBackStack(\"");
                        sb.append(str3);
                        sb.append("\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                        sb.append(hashSet2.size() == 1 ? " " + hashSet2.iterator().next() : "s " + hashSet2);
                        sb.append(" in ");
                        sb.append(c0053a4);
                        sb.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                        m3.b0(new IllegalArgumentException(sb.toString()));
                        throw null;
                    }
                }
                ArrayDeque arrayDeque = new ArrayDeque(hashSet);
                while (!arrayDeque.isEmpty()) {
                    AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s5 = (AbstractComponentCallbacksC0070s) arrayDeque.removeFirst();
                    if (abstractComponentCallbacksC0070s5.f1580B) {
                        StringBuilder sb2 = new StringBuilder("saveBackStack(\"");
                        sb2.append(str3);
                        sb2.append("\") must not contain retained fragments. Found ");
                        sb2.append(hashSet.contains(abstractComponentCallbacksC0070s5) ? "direct reference to retained " : "retained child ");
                        sb2.append("fragment ");
                        sb2.append(abstractComponentCallbacksC0070s5);
                        m3.b0(new IllegalArgumentException(sb2.toString()));
                        throw null;
                    }
                    Iterator it6 = abstractComponentCallbacksC0070s5.f1616u.f1437c.i().iterator();
                    while (it6.hasNext()) {
                        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s6 = (AbstractComponentCallbacksC0070s) it6.next();
                        if (abstractComponentCallbacksC0070s6 != null) {
                            arrayDeque.addLast(abstractComponentCallbacksC0070s6);
                        }
                    }
                }
                ArrayList arrayList6 = new ArrayList();
                Iterator it7 = hashSet.iterator();
                while (it7.hasNext()) {
                    arrayList6.add(((AbstractComponentCallbacksC0070s) it7.next()).e);
                }
                ArrayList arrayList7 = new ArrayList(m3.f1438d.size() - z3);
                for (int i6 = z3; i6 < m3.f1438d.size(); i6++) {
                    arrayList7.add(null);
                }
                C0055c c0055c2 = new C0055c(arrayList6, arrayList7);
                int i7 = 1;
                for (int size = m3.f1438d.size() - 1; size >= z3; size--) {
                    C0053a c0053a5 = (C0053a) m3.f1438d.remove(size);
                    C0053a c0053a6 = new C0053a(c0053a5);
                    ArrayList arrayList8 = c0053a6.f1511a;
                    int size2 = arrayList8.size() - i7;
                    while (size2 >= 0) {
                        U u3 = (U) arrayList8.get(size2);
                        if (u3.f1489c) {
                            if (u3.f1487a == 8) {
                                u3.f1489c = false;
                                arrayList8.remove(size2 - 1);
                                size2--;
                            } else {
                                int i8 = u3.f1488b.f1619x;
                                u3.f1487a = 2;
                                u3.f1489c = false;
                                for (int i9 = size2 - 1; i9 >= 0; i9--) {
                                    U u4 = (U) arrayList8.get(i9);
                                    if (u4.f1489c && u4.f1488b.f1619x == i8) {
                                        arrayList8.remove(i9);
                                        size2--;
                                    }
                                }
                            }
                        }
                        size2--;
                    }
                    arrayList7.set(size - z3, new C0054b(c0053a6));
                    i7 = 1;
                    c0053a5.f1527t = true;
                    arrayList.add(c0053a5);
                    arrayList2.add(Boolean.TRUE);
                }
                m3.j.put(str3, c0055c2);
                return i7;
        }
    }
}
