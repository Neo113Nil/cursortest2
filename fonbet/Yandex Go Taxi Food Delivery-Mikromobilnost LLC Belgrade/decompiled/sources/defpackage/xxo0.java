package defpackage;

/* loaded from: classes13.dex */
public final class xxo0 {
    public static vxo0 a(dyo0 dyo0Var) {
        uxo0 txo0Var;
        if (dyo0Var != null) {
            CharSequence charSequence = dyo0Var.a;
            if (charSequence.length() != 0) {
                cyo0 cyo0Var = dyo0Var.c;
                CharSequence charSequence2 = dyo0Var.b;
                if (cyo0Var.equals(ayo0.a)) {
                    txo0Var = h2b1.O;
                } else if (cyo0Var instanceof byo0) {
                    txo0Var = new txo0(((byo0) cyo0Var).a);
                } else {
                    w511.b();
                }
                return new vxo0(charSequence, charSequence2, txo0Var);
            }
        }
        return null;
    }
}
