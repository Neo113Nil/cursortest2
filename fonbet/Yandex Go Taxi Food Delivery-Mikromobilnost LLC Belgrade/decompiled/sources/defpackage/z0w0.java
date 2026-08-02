package defpackage;

import java.util.Set;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes.dex */
public final class z0w0 {
    public static final /* synthetic */ kgx[] f = {new MutablePropertyReference1Impl("onboardingIds", 0, "getOnboardingIds()Ljava/util/Set;", z0w0.class)};
    public final n0 a = ffx.c(5, 5, null, 4);
    public final sme0 b;
    public boolean c;
    public final r0 d;
    public final r0 e;

    public z0w0(dne0 dne0Var) {
        cne0 a = dne0Var.a("SuperAppMainScreenOnboardingPrefs");
        sme0 sme0Var = new sme0(1, a, a, "onboardingIds");
        this.b = sme0Var;
        this.c = true;
        r0 c = bvf0.c(new c1w0((Set) sme0Var.getValue(this, f[0]), false, false));
        this.d = c;
        this.e = c;
    }
}
