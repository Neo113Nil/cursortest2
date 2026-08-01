package Z;

import a0.AbstractC0082d;
import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: Z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0053a implements J {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1511a;

    /* renamed from: b, reason: collision with root package name */
    public int f1512b;

    /* renamed from: c, reason: collision with root package name */
    public int f1513c;

    /* renamed from: d, reason: collision with root package name */
    public int f1514d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f1515f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1516g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1517h;
    public String i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f1518k;

    /* renamed from: l, reason: collision with root package name */
    public int f1519l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f1520m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f1521n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f1522o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1523p;

    /* renamed from: q, reason: collision with root package name */
    public final M f1524q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1525r;

    /* renamed from: s, reason: collision with root package name */
    public int f1526s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1527t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0053a(M m2) {
        this();
        m2.D();
        C0074w c0074w = m2.f1452u;
        if (c0074w != null) {
            c0074w.f1629b.getClassLoader();
        }
        this.f1526s = -1;
        this.f1527t = false;
        this.f1524q = m2;
    }

    @Override // Z.J
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f1516g) {
            return true;
        }
        M m2 = this.f1524q;
        if (m2.f1438d == null) {
            m2.f1438d = new ArrayList();
        }
        m2.f1438d.add(this);
        return true;
    }

    public final void b(U u2) {
        this.f1511a.add(u2);
        u2.f1490d = this.f1512b;
        u2.e = this.f1513c;
        u2.f1491f = this.f1514d;
        u2.f1492g = this.e;
    }

    public final void c(int i) {
        if (this.f1516g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f1511a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                U u2 = (U) arrayList.get(i2);
                AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = u2.f1488b;
                if (abstractComponentCallbacksC0070s != null) {
                    abstractComponentCallbacksC0070s.f1613r += i;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Bump nesting of " + u2.f1488b + " to " + u2.f1488b.f1613r);
                    }
                }
            }
        }
    }

    public final int d(boolean z2) {
        if (this.f1525r) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new W());
            f("  ", printWriter, true);
            printWriter.close();
        }
        this.f1525r = true;
        boolean z3 = this.f1516g;
        M m2 = this.f1524q;
        if (z3) {
            this.f1526s = m2.i.getAndIncrement();
        } else {
            this.f1526s = -1;
        }
        m2.v(this, z2);
        return this.f1526s;
    }

    public final void e(int i, AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s, String str, int i2) {
        String str2 = abstractComponentCallbacksC0070s.f1590M;
        if (str2 != null) {
            AbstractC0082d.c(abstractComponentCallbacksC0070s, str2);
        }
        Class<?> cls = abstractComponentCallbacksC0070s.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = abstractComponentCallbacksC0070s.f1620y;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + abstractComponentCallbacksC0070s + ": was " + abstractComponentCallbacksC0070s.f1620y + " now " + str);
            }
            abstractComponentCallbacksC0070s.f1620y = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC0070s + " with tag " + str + " to container view with no id");
            }
            int i3 = abstractComponentCallbacksC0070s.f1618w;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC0070s + ": was " + abstractComponentCallbacksC0070s.f1618w + " now " + i);
            }
            abstractComponentCallbacksC0070s.f1618w = i;
            abstractComponentCallbacksC0070s.f1619x = i;
        }
        b(new U(i2, abstractComponentCallbacksC0070s));
        abstractComponentCallbacksC0070s.f1614s = this.f1524q;
    }

    public final void f(String str, PrintWriter printWriter, boolean z2) {
        String str2;
        if (z2) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1526s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1525r);
            if (this.f1515f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1515f));
            }
            if (this.f1512b != 0 || this.f1513c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1512b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1513c));
            }
            if (this.f1514d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1514d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.j != 0 || this.f1518k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1518k);
            }
            if (this.f1519l != 0 || this.f1520m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1519l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1520m);
            }
        }
        ArrayList arrayList = this.f1511a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            U u2 = (U) arrayList.get(i);
            switch (u2.f1487a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + u2.f1487a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(u2.f1488b);
            if (z2) {
                if (u2.f1490d != 0 || u2.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(u2.f1490d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(u2.e));
                }
                if (u2.f1491f != 0 || u2.f1492g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(u2.f1491f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(u2.f1492g));
                }
            }
        }
    }

    public final void g(AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s) {
        M m2 = abstractComponentCallbacksC0070s.f1614s;
        if (m2 == null || m2 == this.f1524q) {
            b(new U(8, abstractComponentCallbacksC0070s));
            return;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + abstractComponentCallbacksC0070s.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1526s >= 0) {
            sb.append(" #");
            sb.append(this.f1526s);
        }
        if (this.i != null) {
            sb.append(" ");
            sb.append(this.i);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0053a(C0053a c0053a) {
        this();
        c0053a.f1524q.D();
        C0074w c0074w = c0053a.f1524q.f1452u;
        if (c0074w != null) {
            c0074w.f1629b.getClassLoader();
        }
        Iterator it = c0053a.f1511a.iterator();
        while (it.hasNext()) {
            U u2 = (U) it.next();
            ArrayList arrayList = this.f1511a;
            U u3 = new U();
            u3.f1487a = u2.f1487a;
            u3.f1488b = u2.f1488b;
            u3.f1489c = u2.f1489c;
            u3.f1490d = u2.f1490d;
            u3.e = u2.e;
            u3.f1491f = u2.f1491f;
            u3.f1492g = u2.f1492g;
            u3.f1493h = u2.f1493h;
            u3.i = u2.i;
            arrayList.add(u3);
        }
        this.f1512b = c0053a.f1512b;
        this.f1513c = c0053a.f1513c;
        this.f1514d = c0053a.f1514d;
        this.e = c0053a.e;
        this.f1515f = c0053a.f1515f;
        this.f1516g = c0053a.f1516g;
        this.f1517h = c0053a.f1517h;
        this.i = c0053a.i;
        this.f1519l = c0053a.f1519l;
        this.f1520m = c0053a.f1520m;
        this.j = c0053a.j;
        this.f1518k = c0053a.f1518k;
        if (c0053a.f1521n != null) {
            ArrayList arrayList2 = new ArrayList();
            this.f1521n = arrayList2;
            arrayList2.addAll(c0053a.f1521n);
        }
        if (c0053a.f1522o != null) {
            ArrayList arrayList3 = new ArrayList();
            this.f1522o = arrayList3;
            arrayList3.addAll(c0053a.f1522o);
        }
        this.f1523p = c0053a.f1523p;
        this.f1526s = -1;
        this.f1527t = false;
        this.f1524q = c0053a.f1524q;
        this.f1525r = c0053a.f1525r;
        this.f1526s = c0053a.f1526s;
        this.f1527t = c0053a.f1527t;
    }

    public C0053a() {
        this.f1511a = new ArrayList();
        this.f1517h = true;
        this.f1523p = false;
    }
}
