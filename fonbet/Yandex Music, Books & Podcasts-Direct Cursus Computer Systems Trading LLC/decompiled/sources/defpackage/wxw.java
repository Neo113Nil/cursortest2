package defpackage;

import com.google.android.gms.common.api.Scope;

/* loaded from: classes.dex */
public abstract class wxw {
    public static final bww a;
    public static final po0 b;

    static {
        go0 go0Var = new go0();
        bww bwwVar = new bww(0);
        a = bwwVar;
        new Scope(1, "profile");
        new Scope(1, "email");
        b = new po0("SignIn.API", bwwVar, go0Var);
    }
}
