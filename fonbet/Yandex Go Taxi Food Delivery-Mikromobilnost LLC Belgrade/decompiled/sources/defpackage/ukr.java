package defpackage;

/* loaded from: classes4.dex */
public abstract class ukr {
    public static /* synthetic */ tkr create$default(ukr ukrVar, j190 j190Var, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: create");
            return null;
        }
        if ((i & 1) != 0) {
            j190Var = null;
        }
        return ukrVar.create(j190Var);
    }

    public final tkr create() {
        return create$default(this, null, 1, null);
    }

    public tkr create(j190 j190Var) {
        return skr.a;
    }
}
