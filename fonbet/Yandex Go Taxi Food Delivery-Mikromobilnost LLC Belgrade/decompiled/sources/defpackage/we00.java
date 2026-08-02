package defpackage;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class we00 {
    public static final mxs b = new mxs(1);
    public final te00 a;

    public we00() {
        rt10 rt10Var;
        fvf0 fvf0Var = fvf0.c;
        try {
            rt10Var = (rt10) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            rt10Var = b;
        }
        rt10[] rt10VarArr = {mxs.b, rt10Var};
        te00 te00Var = new te00();
        te00Var.a = rt10VarArr;
        Charset charset = tqw.a;
        this.a = te00Var;
    }
}
