package androidx.fragment.app;

import android.util.Log;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import defpackage.gsg;
import defpackage.kac;
import defpackage.muc;
import defpackage.otc;
import defpackage.ptc;
import defpackage.tuc;
import defpackage.uuc;
import defpackage.vz1;
import defpackage.xq0;
import defpackage.ztc;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a extends uuc implements ztc {
    public final y t;
    public boolean u;
    public int v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(y yVar) {
        super(r0, r1 != null ? r1.b.getClassLoader() : null);
        otc J = yVar.J();
        ptc ptcVar = yVar.x;
        this.v = -1;
        this.t = yVar;
    }

    @Override // defpackage.ztc
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (y.M(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.i) {
            return true;
        }
        this.t.d.add(this);
        return true;
    }

    @Override // defpackage.uuc
    public final void d(int i, o oVar, String str, int i2) {
        String str2 = oVar.mPreviousWho;
        if (str2 != null) {
            muc.d(oVar, str2);
        }
        Class<?> cls = oVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = oVar.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(oVar);
                sb.append(": was ");
                xq0.q(vz1.s(sb, oVar.mTag, " now ", str));
                return;
            }
            oVar.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                kac.g("Can't add fragment ", oVar, " with tag ", str, " to container view with no id");
                return;
            }
            int i3 = oVar.mFragmentId;
            if (i3 != 0 && i3 != i) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(oVar);
                int i4 = oVar.mFragmentId;
                sb2.append(": was ");
                sb2.append(i4);
                sb2.append(" now ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
            oVar.mFragmentId = i;
            oVar.mContainerId = i;
        }
        b(new tuc(oVar, i2));
        oVar.mFragmentManager = this.t;
    }

    public final void h(int i) {
        if (this.i) {
            if (y.M(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                tuc tucVar = (tuc) arrayList.get(i2);
                o oVar = tucVar.b;
                if (oVar != null) {
                    oVar.mBackStackNesting += i;
                    if (y.M(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + tucVar.b + " to " + tucVar.b.mBackStackNesting);
                    }
                }
            }
        }
    }

    public final void i() {
        ArrayList arrayList = this.c;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            tuc tucVar = (tuc) arrayList.get(size);
            if (tucVar.c) {
                if (tucVar.a == 8) {
                    tucVar.c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i = tucVar.b.mContainerId;
                    tucVar.a = 2;
                    tucVar.c = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        tuc tucVar2 = (tuc) arrayList.get(i2);
                        if (tucVar2.c && tucVar2.b.mContainerId == i) {
                            arrayList.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final int j() {
        return k(false, true);
    }

    public final int k(boolean z, boolean z2) {
        if (this.u) {
            xq0.q("commit already called");
            return 0;
        }
        if (y.M(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new gsg());
            l("  ", printWriter, true);
            printWriter.close();
        }
        this.u = true;
        boolean z3 = this.i;
        y yVar = this.t;
        if (z3) {
            this.v = yVar.k.getAndIncrement();
        } else {
            this.v = -1;
        }
        if (z2) {
            yVar.x(this, z);
        }
        return this.v;
    }

    public final void l(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.k);
            printWriter.print(" mIndex=");
            printWriter.print(this.v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.u);
            if (this.h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.h));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.f != 0 || this.g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.g));
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.m);
            }
            if (this.n != 0 || this.o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.o);
            }
        }
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            tuc tucVar = (tuc) arrayList.get(i);
            switch (tucVar.a) {
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
                    str2 = "cmd=" + tucVar.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(StringUtil.SPACE);
            printWriter.println(tucVar.b);
            if (z) {
                if (tucVar.d != 0 || tucVar.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(tucVar.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(tucVar.e));
                }
                if (tucVar.f != 0 || tucVar.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(tucVar.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(tucVar.g));
                }
            }
        }
    }

    public final a m(o oVar) {
        y yVar = oVar.mFragmentManager;
        if (yVar == null || yVar == this.t) {
            b(new tuc(oVar, 3));
            return this;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + oVar.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.v >= 0) {
            sb.append(" #");
            sb.append(this.v);
        }
        if (this.k != null) {
            sb.append(StringUtil.SPACE);
            sb.append(this.k);
        }
        sb.append("}");
        return sb.toString();
    }
}
