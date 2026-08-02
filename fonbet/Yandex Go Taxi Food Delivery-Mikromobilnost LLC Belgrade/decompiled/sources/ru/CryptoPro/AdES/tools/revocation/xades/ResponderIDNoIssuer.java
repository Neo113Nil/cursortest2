package ru.CryptoPro.AdES.tools.revocation.xades;

import defpackage.bvj0;
import defpackage.jc51;
import defpackage.lc51;
import defpackage.v4i0;
import defpackage.xc4;
import java.util.Vector;

/* loaded from: classes4.dex */
public class ResponderIDNoIssuer extends bvj0 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ResponderIDNoIssuer() {
        super(r0);
        xc4 xc4Var = jc51.y;
        xc4Var.getClass();
        lc51 lc51Var = new lc51(xc4Var);
        Vector vector = lc51Var.b;
        int size = vector.size();
        v4i0[] v4i0VarArr = new v4i0[size];
        for (int i = 0; i != size; i++) {
            v4i0VarArr[i] = (v4i0) vector.elementAt(i);
        }
        jc51 jc51Var = new jc51(xc4Var, new jc51(lc51Var.a, v4i0VarArr).n());
        jc51Var.c = xc4Var;
    }

    public String toString() {
        return "";
    }
}
