package defpackage;

import androidx.compose.material3.tokens.ShapeKeyTokens;

/* loaded from: classes.dex */
public abstract class zir0 {
    public static final a7u0 a = new a7u0(new dwq0(15));

    public static final ehr0 a(wir0 wir0Var, ShapeKeyTokens shapeKeyTokens) {
        switch (yir0.a[shapeKeyTokens.ordinal()]) {
            case 1:
                return wir0Var.e;
            case 2:
                return wir0Var.g;
            case 3:
                return wir0Var.h;
            case 4:
                return c(wir0Var.e);
            case 5:
                return wir0Var.a;
            case 6:
                return c(wir0Var.a);
            case 7:
                return cyk0.a;
            case 8:
                return wir0Var.d;
            case 9:
                return wir0Var.f;
            case 10:
                byk0 byk0Var = wir0Var.d;
                z7m z7mVar = nhr0.i;
                return byk0.b(byk0Var, z7mVar, null, null, z7mVar, 6);
            case 11:
                return c(wir0Var.d);
            case 12:
                return wir0Var.c;
            case 13:
                return qke.q;
            case 14:
                return wir0Var.b;
            case 15:
                byk0 byk0Var2 = wir0Var.d;
                z7m z7mVar2 = nhr0.i;
                return byk0.b(byk0Var2, null, z7mVar2, z7mVar2, null, 9);
            default:
                w511.b();
                return null;
        }
    }

    public static final ehr0 b(ShapeKeyTokens shapeKeyTokens, fid fidVar) {
        return a((wir0) ((bts) fidVar).m(a), shapeKeyTokens);
    }

    public static byk0 c(byk0 byk0Var) {
        z7m z7mVar = nhr0.i;
        return byk0.b(byk0Var, null, null, z7mVar, z7mVar, 3);
    }
}
