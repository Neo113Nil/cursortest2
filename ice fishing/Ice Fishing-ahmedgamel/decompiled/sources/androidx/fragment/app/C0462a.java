package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0462a implements L {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4897a;

    /* renamed from: b, reason: collision with root package name */
    public int f4898b;

    /* renamed from: c, reason: collision with root package name */
    public int f4899c;

    /* renamed from: d, reason: collision with root package name */
    public int f4900d;

    /* renamed from: e, reason: collision with root package name */
    public int f4901e;

    /* renamed from: f, reason: collision with root package name */
    public int f4902f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4903g;

    /* renamed from: h, reason: collision with root package name */
    public String f4904h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f4905j;

    /* renamed from: k, reason: collision with root package name */
    public int f4906k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f4907l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f4908m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f4909n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4910o;

    /* renamed from: p, reason: collision with root package name */
    public final N f4911p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4912q;

    /* renamed from: r, reason: collision with root package name */
    public int f4913r;

    public C0462a(N n9) {
        n9.B();
        C0483w c0483w = n9.f4836t;
        if (c0483w != null) {
            c0483w.f5042A.getClassLoader();
        }
        this.f4897a = new ArrayList();
        this.f4910o = false;
        this.f4913r = -1;
        this.f4911p = n9;
    }

    @Override // androidx.fragment.app.L
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (N.E(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f4903g) {
            return true;
        }
        N n9 = this.f4911p;
        if (n9.f4821d == null) {
            n9.f4821d = new ArrayList();
        }
        n9.f4821d.add(this);
        return true;
    }

    public final void b(W w3) {
        this.f4897a.add(w3);
        w3.f4881d = this.f4898b;
        w3.f4882e = this.f4899c;
        w3.f4883f = this.f4900d;
        w3.f4884g = this.f4901e;
    }

    public final void c(int i) {
        if (this.f4903g) {
            if (N.E(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f4897a;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                W w3 = (W) arrayList.get(i4);
                AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = w3.f4879b;
                if (abstractComponentCallbacksC0479s != null) {
                    abstractComponentCallbacksC0479s.J += i;
                    if (N.E(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + w3.f4879b + " to " + w3.f4879b.J);
                    }
                }
            }
        }
    }

    public final int d(boolean z6) {
        if (this.f4912q) {
            throw new IllegalStateException("commit already called");
        }
        if (N.E(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new Y());
            f("  ", printWriter, true);
            printWriter.close();
        }
        this.f4912q = true;
        boolean z9 = this.f4903g;
        N n9 = this.f4911p;
        if (z9) {
            this.f4913r = n9.i.getAndIncrement();
        } else {
            this.f4913r = -1;
        }
        n9.v(this, z6);
        return this.f4913r;
    }

    public final void e(int i, AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s, String str, int i4) {
        String str2 = abstractComponentCallbacksC0479s.f5023l0;
        if (str2 != null) {
            f0.d.c(abstractComponentCallbacksC0479s, str2);
        }
        Class<?> cls = abstractComponentCallbacksC0479s.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = abstractComponentCallbacksC0479s.f5011Q;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(abstractComponentCallbacksC0479s);
                sb.append(": was ");
                throw new IllegalStateException(D.x.p(sb, abstractComponentCallbacksC0479s.f5011Q, " now ", str));
            }
            abstractComponentCallbacksC0479s.f5011Q = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC0479s + " with tag " + str + " to container view with no id");
            }
            int i6 = abstractComponentCallbacksC0479s.f5009O;
            if (i6 != 0 && i6 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC0479s + ": was " + abstractComponentCallbacksC0479s.f5009O + " now " + i);
            }
            abstractComponentCallbacksC0479s.f5009O = i;
            abstractComponentCallbacksC0479s.f5010P = i;
        }
        b(new W(i4, abstractComponentCallbacksC0479s));
        abstractComponentCallbacksC0479s.f5005K = this.f4911p;
    }

    public final void f(String str, PrintWriter printWriter, boolean z6) {
        String str2;
        if (z6) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f4904h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f4913r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f4912q);
            if (this.f4902f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f4902f));
            }
            if (this.f4898b != 0 || this.f4899c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4898b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4899c));
            }
            if (this.f4900d != 0 || this.f4901e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4900d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4901e));
            }
            if (this.i != 0 || this.f4905j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f4905j);
            }
            if (this.f4906k != 0 || this.f4907l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4906k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f4907l);
            }
        }
        ArrayList arrayList = this.f4897a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            W w3 = (W) arrayList.get(i);
            switch (w3.f4878a) {
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
                    str2 = "cmd=" + w3.f4878a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(w3.f4879b);
            if (z6) {
                if (w3.f4881d != 0 || w3.f4882e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(w3.f4881d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(w3.f4882e));
                }
                if (w3.f4883f != 0 || w3.f4884g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(w3.f4883f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(w3.f4884g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f4913r >= 0) {
            sb.append(" #");
            sb.append(this.f4913r);
        }
        if (this.f4904h != null) {
            sb.append(" ");
            sb.append(this.f4904h);
        }
        sb.append("}");
        return sb.toString();
    }
}
