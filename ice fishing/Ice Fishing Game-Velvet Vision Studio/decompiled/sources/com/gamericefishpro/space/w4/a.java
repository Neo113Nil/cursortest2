package com.gamericefishpro.space.w4;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.ka.a0;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final ArrayList a;
    public ArrayList b;
    public final a0 c;
    public boolean d;
    public int e;

    public a(a0 a0Var) {
        a0Var.getClass();
        this.a = new ArrayList();
        this.e = -1;
        this.c = a0Var;
    }

    public final int a(boolean z) {
        String str;
        a0 a0Var = this.c;
        if (this.d) {
            throw new IllegalStateException("commit already called");
        }
        if (a0.l(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new m());
            ArrayList arrayList = this.a;
            printWriter.print("  ");
            printWriter.print("mName=");
            printWriter.print((String) null);
            printWriter.print(" mIndex=");
            printWriter.print(this.e);
            printWriter.print(" mCommitted=");
            printWriter.println(this.d);
            if (!arrayList.isEmpty()) {
                printWriter.print("  ");
                printWriter.println("Operations:");
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    l lVar = (l) arrayList.get(i);
                    switch (lVar.a) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            str = "NULL";
                            break;
                        case 1:
                            str = "ADD";
                            break;
                        case 2:
                            str = "REPLACE";
                            break;
                        case 3:
                            str = "REMOVE";
                            break;
                        case 4:
                            str = "HIDE";
                            break;
                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                            str = "SHOW";
                            break;
                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                            str = "DETACH";
                            break;
                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                            str = "ATTACH";
                            break;
                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                            str = "SET_PRIMARY_NAV";
                            break;
                        case 9:
                            str = "UNSET_PRIMARY_NAV";
                            break;
                        case 10:
                            str = "OP_SET_MAX_LIFECYCLE";
                            break;
                        default:
                            str = "cmd=" + lVar.a;
                            break;
                    }
                    printWriter.print("  ");
                    printWriter.print("  Op #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.print(str);
                    printWriter.print(" ");
                    printWriter.println(lVar.b);
                    if (lVar.d != 0 || lVar.e != 0) {
                        printWriter.print("  ");
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(lVar.d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(lVar.e));
                    }
                    if (lVar.f != 0 || lVar.g != 0) {
                        printWriter.print("  ");
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(lVar.f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(lVar.g));
                    }
                }
            }
            printWriter.close();
        }
        this.d = true;
        this.e = -1;
        if (!z) {
            a0Var.getClass();
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        synchronized (((ArrayList) a0Var.c)) {
            try {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.e >= 0) {
            sb.append(" #");
            sb.append(this.e);
        }
        sb.append("}");
        return sb.toString();
    }
}
