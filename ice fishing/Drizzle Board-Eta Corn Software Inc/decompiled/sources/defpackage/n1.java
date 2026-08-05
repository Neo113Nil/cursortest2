package defpackage;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class n1 implements bj {
    public boolean Ey6iv0m0;
    public int KlHjfFWx;
    public int MdtA4re8;
    public int NCTxEWno;
    public CharSequence OnDfzHZD;
    public final ej OxcuoDLp;
    public int P7K7Inc8;
    public boolean Qr9iLBAD;
    public int VgvYg0wo;
    public boolean amk52bBQ;
    public boolean b2ZJblxo;
    public int eVhOlqcC;
    public String jb9XjC4I;
    public CharSequence k3x7lurq;
    public ArrayList lDXGDhIF;
    public int ow5vqvCr;
    public final ArrayList qoPGr6Ce;
    public boolean sjUBp5pO;
    public int wxUZMvaN;
    public ArrayList ygLcUYwZ;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n1(n1 n1Var) {
        this();
        n1Var.OxcuoDLp.Mq3SeTnW();
        ni niVar = n1Var.OxcuoDLp.I5GHvsYW;
        if (niVar != null) {
            niVar.OxcuoDLp.getClassLoader();
        }
        ArrayList arrayList = n1Var.qoPGr6Ce;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ak akVar = (ak) obj;
            ArrayList arrayList2 = this.qoPGr6Ce;
            ak akVar2 = new ak();
            akVar2.qoPGr6Ce = akVar.qoPGr6Ce;
            akVar2.NCTxEWno = akVar.NCTxEWno;
            akVar2.MdtA4re8 = akVar.MdtA4re8;
            akVar2.wxUZMvaN = akVar.wxUZMvaN;
            akVar2.VgvYg0wo = akVar.VgvYg0wo;
            akVar2.P7K7Inc8 = akVar.P7K7Inc8;
            akVar2.b2ZJblxo = akVar.b2ZJblxo;
            akVar2.Qr9iLBAD = akVar.Qr9iLBAD;
            akVar2.jb9XjC4I = akVar.jb9XjC4I;
            arrayList2.add(akVar2);
        }
        this.NCTxEWno = n1Var.NCTxEWno;
        this.MdtA4re8 = n1Var.MdtA4re8;
        this.wxUZMvaN = n1Var.wxUZMvaN;
        this.VgvYg0wo = n1Var.VgvYg0wo;
        this.P7K7Inc8 = n1Var.P7K7Inc8;
        this.b2ZJblxo = n1Var.b2ZJblxo;
        this.Qr9iLBAD = n1Var.Qr9iLBAD;
        this.jb9XjC4I = n1Var.jb9XjC4I;
        this.ow5vqvCr = n1Var.ow5vqvCr;
        this.OnDfzHZD = n1Var.OnDfzHZD;
        this.eVhOlqcC = n1Var.eVhOlqcC;
        this.k3x7lurq = n1Var.k3x7lurq;
        if (n1Var.ygLcUYwZ != null) {
            ArrayList arrayList3 = new ArrayList();
            this.ygLcUYwZ = arrayList3;
            arrayList3.addAll(n1Var.ygLcUYwZ);
        }
        if (n1Var.lDXGDhIF != null) {
            ArrayList arrayList4 = new ArrayList();
            this.lDXGDhIF = arrayList4;
            arrayList4.addAll(n1Var.lDXGDhIF);
        }
        this.sjUBp5pO = n1Var.sjUBp5pO;
        this.KlHjfFWx = -1;
        this.Ey6iv0m0 = false;
        this.OxcuoDLp = n1Var.OxcuoDLp;
        this.amk52bBQ = n1Var.amk52bBQ;
        this.KlHjfFWx = n1Var.KlHjfFWx;
        this.Ey6iv0m0 = n1Var.Ey6iv0m0;
    }

    public final void MdtA4re8(int i) {
        if (this.b2ZJblxo) {
            if (ej.ytu5o6f4(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.qoPGr6Ce;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ak akVar = (ak) arrayList.get(i2);
                li liVar = akVar.NCTxEWno;
                if (liVar != null) {
                    liVar.KlHjfFWx += i;
                    if (ej.ytu5o6f4(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + akVar.NCTxEWno + " to " + akVar.NCTxEWno.KlHjfFWx);
                    }
                }
            }
        }
    }

    public final void NCTxEWno(ak akVar) {
        this.qoPGr6Ce.add(akVar);
        akVar.wxUZMvaN = this.NCTxEWno;
        akVar.VgvYg0wo = this.MdtA4re8;
        akVar.P7K7Inc8 = this.wxUZMvaN;
        akVar.b2ZJblxo = this.VgvYg0wo;
    }

    public final void P7K7Inc8(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.jb9XjC4I);
            printWriter.print(" mIndex=");
            printWriter.print(this.KlHjfFWx);
            printWriter.print(" mCommitted=");
            printWriter.println(this.amk52bBQ);
            if (this.P7K7Inc8 != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.P7K7Inc8));
            }
            if (this.NCTxEWno != 0 || this.MdtA4re8 != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.NCTxEWno));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.MdtA4re8));
            }
            if (this.wxUZMvaN != 0 || this.VgvYg0wo != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.wxUZMvaN));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.VgvYg0wo));
            }
            if (this.eVhOlqcC != 0 || this.k3x7lurq != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.eVhOlqcC));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.k3x7lurq);
            }
            if (this.ow5vqvCr != 0 || this.OnDfzHZD != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.ow5vqvCr));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.OnDfzHZD);
            }
        }
        ArrayList arrayList = this.qoPGr6Ce;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ak akVar = (ak) arrayList.get(i);
            switch (akVar.qoPGr6Ce) {
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
                    str2 = "cmd=" + akVar.qoPGr6Ce;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(akVar.NCTxEWno);
            if (z) {
                if (akVar.wxUZMvaN != 0 || akVar.VgvYg0wo != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(akVar.wxUZMvaN));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(akVar.VgvYg0wo));
                }
                if (akVar.P7K7Inc8 != 0 || akVar.b2ZJblxo != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(akVar.P7K7Inc8));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(akVar.b2ZJblxo));
                }
            }
        }
    }

    public final void VgvYg0wo(int i, li liVar, String str, int i2) {
        String str2 = liVar.hzgxAD8d;
        if (str2 != null) {
            zj.MdtA4re8(liVar, str2);
        }
        Class<?> cls = liVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            m1.VgvYg0wo(cls.getCanonicalName(), " must be a public static class to be  properly recreated from instance state.", "Fragment ");
            return;
        }
        if (str != null) {
            String str3 = liVar.DK9slbsy;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(liVar);
                String str4 = liVar.DK9slbsy;
                sb.append(": was ");
                sb.append(str4);
                sb.append(" now ");
                sb.append(str);
                throw new IllegalStateException(sb.toString());
            }
            liVar.DK9slbsy = str;
        }
        if (i != 0) {
            if (i == -1) {
                m1.k3x7lurq("Can't add fragment ", liVar, " with tag ", str, " to container view with no id");
                return;
            }
            int i3 = liVar.gjV1z5T1;
            if (i3 != 0 && i3 != i) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(liVar);
                int i4 = liVar.gjV1z5T1;
                sb2.append(": was ");
                sb2.append(i4);
                sb2.append(" now ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
            liVar.gjV1z5T1 = i;
            liVar.WYNAV5pd = i;
        }
        NCTxEWno(new ak(i2, liVar));
        liVar.Ey6iv0m0 = this.OxcuoDLp;
    }

    public final void b2ZJblxo(li liVar) {
        ej ejVar = liVar.Ey6iv0m0;
        if (ejVar == null || ejVar == this.OxcuoDLp) {
            NCTxEWno(new ak(8, liVar));
            return;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + liVar.toString() + " is already attached to a FragmentManager.");
    }

    @Override // defpackage.bj
    public final boolean qoPGr6Ce(ArrayList arrayList, ArrayList arrayList2) {
        if (ej.ytu5o6f4(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.b2ZJblxo) {
            return true;
        }
        ej ejVar = this.OxcuoDLp;
        ArrayList arrayList3 = ejVar.wxUZMvaN;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            ejVar.wxUZMvaN = arrayList3;
        }
        arrayList3.add(this);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.KlHjfFWx >= 0) {
            sb.append(" #");
            sb.append(this.KlHjfFWx);
        }
        if (this.jb9XjC4I != null) {
            sb.append(" ");
            sb.append(this.jb9XjC4I);
        }
        sb.append("}");
        return sb.toString();
    }

    public final int wxUZMvaN(boolean z) {
        if (this.amk52bBQ) {
            m1.Ey6iv0m0("commit already called");
            return 0;
        }
        if (ej.ytu5o6f4(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new kq());
            P7K7Inc8("  ", printWriter, true);
            printWriter.close();
        }
        this.amk52bBQ = true;
        boolean z2 = this.b2ZJblxo;
        ej ejVar = this.OxcuoDLp;
        if (z2) {
            this.KlHjfFWx = ejVar.jb9XjC4I.getAndIncrement();
        } else {
            this.KlHjfFWx = -1;
        }
        ejVar.RXQxj5Oe(this, z);
        return this.KlHjfFWx;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n1(ej ejVar) {
        this();
        ejVar.Mq3SeTnW();
        ni niVar = ejVar.I5GHvsYW;
        if (niVar != null) {
            niVar.OxcuoDLp.getClassLoader();
        }
        this.KlHjfFWx = -1;
        this.Ey6iv0m0 = false;
        this.OxcuoDLp = ejVar;
    }

    public n1() {
        this.qoPGr6Ce = new ArrayList();
        this.Qr9iLBAD = true;
        this.sjUBp5pO = false;
    }
}
