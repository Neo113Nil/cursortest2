package defpackage;

import java.util.Locale;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes10.dex */
public final class z2b0 {
    public static final /* synthetic */ kgx[] c = {new MutablePropertyReference1Impl("serialisedTranslations", 0, "getSerialisedTranslations()Ljava/lang/String;", z2b0.class)};
    public final wnt a;
    public final qme0 b;

    public z2b0(b03 b03Var, j5z j5zVar, dne0 dne0Var, wnt wntVar) {
        this.a = wntVar;
        Locale c2 = j5zVar.c();
        cne0 a = dne0Var.a(b03Var.getApplicationId() + ".translations.TRANSLATIONS." + c2);
        this.b = new qme0(1, a, a, "TRANSLATIONS");
    }
}
