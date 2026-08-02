package defpackage;

import com.yandex.messaging.base.rights.OrganizationRightsFlag;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class x4b0 {
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final w4b0[] j;
    public final String k;
    public final boolean l;

    public x4b0(String str, long j, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, w4b0[] w4b0VarArr, String str7) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = z;
        this.i = z2;
        this.j = w4b0VarArr;
        this.k = str7;
        int length = w4b0VarArr.length;
        boolean z3 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            w4b0 w4b0Var = w4b0VarArr[i];
            if (w4b0Var.a == 0 && w4b0Var.e) {
                z3 = true;
                break;
            }
            i++;
        }
        this.l = z3;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        for (w4b0 w4b0Var : this.j) {
            if (!w4b0Var.d && !w4b0Var.e && w4b0Var.a != 0) {
                arrayList.add(w4b0Var);
            }
        }
        return arrayList;
    }

    public final w4b0 b(Long l) {
        for (w4b0 w4b0Var : this.j) {
            if (w4b0Var.a == l.longValue()) {
                return w4b0Var;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (new defpackage.ok80(r4).f(r5) == true) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(OrganizationRightsFlag organizationRightsFlag, long j) {
        w4b0 b = b(Long.valueOf(j));
        if (b != null) {
            wdz wdzVar = ok80.c;
            int i = (int) b.g;
            wdzVar.getClass();
        }
        return j == 0;
    }
}
