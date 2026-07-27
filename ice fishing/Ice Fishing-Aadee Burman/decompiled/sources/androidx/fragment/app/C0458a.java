package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0458a implements L {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4929a;

    /* renamed from: b, reason: collision with root package name */
    public int f4930b;

    /* renamed from: c, reason: collision with root package name */
    public int f4931c;

    /* renamed from: d, reason: collision with root package name */
    public int f4932d;

    /* renamed from: e, reason: collision with root package name */
    public int f4933e;

    /* renamed from: f, reason: collision with root package name */
    public int f4934f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4935g;

    /* renamed from: h, reason: collision with root package name */
    public String f4936h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f4937j;

    /* renamed from: k, reason: collision with root package name */
    public int f4938k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f4939l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f4940m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f4941n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4942o;

    /* renamed from: p, reason: collision with root package name */
    public final N f4943p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4944q;

    /* renamed from: r, reason: collision with root package name */
    public int f4945r;

    public C0458a(N n9) {
        n9.B();
        C0479w c0479w = n9.f4868t;
        if (c0479w != null) {
            c0479w.f5076u.getClassLoader();
        }
        this.f4929a = new ArrayList();
        this.f4942o = false;
        this.f4945r = -1;
        this.f4943p = n9;
    }

    @Override // androidx.fragment.app.L
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (N.E(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f4935g) {
            return true;
        }
        N n9 = this.f4943p;
        if (n9.f4853d == null) {
            n9.f4853d = new ArrayList();
        }
        n9.f4853d.add(this);
        return true;
    }

    public final void b(W w6) {
        this.f4929a.add(w6);
        w6.f4913d = this.f4930b;
        w6.f4914e = this.f4931c;
        w6.f4915f = this.f4932d;
        w6.f4916g = this.f4933e;
    }

    public final void c(int i) {
        if (this.f4935g) {
            if (N.E(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f4929a;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                W w6 = (W) arrayList.get(i6);
                AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = w6.f4911b;
                if (abstractComponentCallbacksC0475s != null) {
                    abstractComponentCallbacksC0475s.J += i;
                    if (N.E(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + w6.f4911b + " to " + w6.f4911b.J);
                    }
                }
            }
        }
    }

    public final int d(boolean z3) {
        if (this.f4944q) {
            throw new IllegalStateException("commit already called");
        }
        if (N.E(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new Y());
            f("  ", printWriter, true);
            printWriter.close();
        }
        this.f4944q = true;
        boolean z6 = this.f4935g;
        N n9 = this.f4943p;
        if (z6) {
            this.f4945r = n9.i.getAndIncrement();
        } else {
            this.f4945r = -1;
        }
        n9.v(this, z3);
        return this.f4945r;
    }

    public final void e(int i, AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s, String str, int i6) {
        String str2 = abstractComponentCallbacksC0475s.f5056q0;
        if (str2 != null) {
            f0.d.c(abstractComponentCallbacksC0475s, str2);
        }
        Class<?> cls = abstractComponentCallbacksC0475s.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = abstractComponentCallbacksC0475s.f5043Q;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(abstractComponentCallbacksC0475s);
                sb.append(": was ");
                throw new IllegalStateException(D.y.s(sb, abstractComponentCallbacksC0475s.f5043Q, " now ", str));
            }
            abstractComponentCallbacksC0475s.f5043Q = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC0475s + " with tag " + str + " to container view with no id");
            }
            int i9 = abstractComponentCallbacksC0475s.f5041O;
            if (i9 != 0 && i9 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC0475s + ": was " + abstractComponentCallbacksC0475s.f5041O + " now " + i);
            }
            abstractComponentCallbacksC0475s.f5041O = i;
            abstractComponentCallbacksC0475s.f5042P = i;
        }
        b(new W(i6, abstractComponentCallbacksC0475s));
        abstractComponentCallbacksC0475s.f5037K = this.f4943p;
    }

    public final void f(String str, PrintWriter printWriter, boolean z3) {
        String str2;
        if (z3) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f4936h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f4945r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f4944q);
            if (this.f4934f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f4934f));
            }
            if (this.f4930b != 0 || this.f4931c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4930b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4931c));
            }
            if (this.f4932d != 0 || this.f4933e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4932d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4933e));
            }
            if (this.i != 0 || this.f4937j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f4937j);
            }
            if (this.f4938k != 0 || this.f4939l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4938k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f4939l);
            }
        }
        ArrayList arrayList = this.f4929a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            W w6 = (W) arrayList.get(i);
            switch (w6.f4910a) {
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
                    str2 = "cmd=" + w6.f4910a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(w6.f4911b);
            if (z3) {
                if (w6.f4913d != 0 || w6.f4914e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(w6.f4913d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(w6.f4914e));
                }
                if (w6.f4915f != 0 || w6.f4916g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(w6.f4915f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(w6.f4916g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f4945r >= 0) {
            sb.append(" #");
            sb.append(this.f4945r);
        }
        if (this.f4936h != null) {
            sb.append(" ");
            sb.append(this.f4936h);
        }
        sb.append("}");
        return sb.toString();
    }
}
