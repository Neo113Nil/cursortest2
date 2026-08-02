package defpackage;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class ve00 {
    public static final lxs b = new lxs(1);
    public final se00 a;

    public ve00() {
        qt10 qt10Var;
        Class cls = g72.a;
        try {
            qt10Var = (qt10) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            qt10Var = b;
        }
        qt10[] qt10VarArr = {lxs.b, qt10Var};
        se00 se00Var = new se00();
        se00Var.a = qt10VarArr;
        Charset charset = rqw.a;
        this.a = se00Var;
    }
}
