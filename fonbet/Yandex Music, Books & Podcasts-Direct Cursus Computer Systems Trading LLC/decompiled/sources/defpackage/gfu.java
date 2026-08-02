package defpackage;

/* loaded from: classes.dex */
public interface gfu {
    default bfu a(f9f f9fVar, is6 is6Var) {
        f9fVar.getClass();
        is6Var.getClass();
        return c(leu.P(f9fVar), is6Var);
    }

    default bfu b(Class cls) {
        cls.getClass();
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default bfu c(Class cls, is6 is6Var) {
        is6Var.getClass();
        return b(cls);
    }
}
