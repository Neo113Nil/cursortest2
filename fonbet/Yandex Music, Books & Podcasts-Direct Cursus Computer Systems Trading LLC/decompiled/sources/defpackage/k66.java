package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class k66 {
    public boolean a;
    public String[] b;
    public String[] c;
    public boolean d;

    public k66(m66 m66Var) {
        this.a = m66Var.a;
        this.b = m66Var.b;
        this.c = m66Var.c;
        this.d = m66Var.d;
    }

    public l66 a() {
        return new l66(this.a, this.d, this.b, this.c);
    }

    public void b(el4... el4VarArr) {
        if (!this.a) {
            xq0.x("no cipher suites for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(el4VarArr.length);
        for (el4 el4Var : el4VarArr) {
            arrayList.add(el4Var.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        d((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void c(fl4... fl4VarArr) {
        if (!this.a) {
            xq0.q("no cipher suites for cleartext connections");
            return;
        }
        String[] strArr = new String[fl4VarArr.length];
        for (int i = 0; i < fl4VarArr.length; i++) {
            strArr[i] = fl4VarArr[i].a;
        }
        this.b = strArr;
    }

    public void d(String... strArr) {
        if (!this.a) {
            xq0.x("no cipher suites for cleartext connections");
        } else if (strArr.length != 0) {
            this.b = (String[]) strArr.clone();
        } else {
            xq0.x("At least one cipher suite is required");
        }
    }

    public void e(sks... sksVarArr) {
        if (!this.a) {
            xq0.x("no TLS versions for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(sksVarArr.length);
        for (sks sksVar : sksVarArr) {
            arrayList.add(sksVar.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        g((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void f(tks... tksVarArr) {
        if (!this.a) {
            xq0.q("no TLS versions for cleartext connections");
            return;
        }
        if (tksVarArr.length == 0) {
            xq0.x("At least one TlsVersion is required");
            return;
        }
        String[] strArr = new String[tksVarArr.length];
        for (int i = 0; i < tksVarArr.length; i++) {
            strArr[i] = tksVarArr[i].a;
        }
        this.c = strArr;
    }

    public void g(String... strArr) {
        if (!this.a) {
            xq0.x("no TLS versions for cleartext connections");
        } else if (strArr.length != 0) {
            this.c = (String[]) strArr.clone();
        } else {
            xq0.x("At least one TLS version is required");
        }
    }

    public k66() {
        this.a = true;
    }
}
