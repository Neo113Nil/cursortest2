package defpackage;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class ue00 {
    public static final kxs b = new kxs(1);
    public final re00 a;

    public ue00() {
        pt10 pt10Var;
        try {
            pt10Var = (pt10) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            pt10Var = b;
        }
        pt10[] pt10VarArr = {kxs.b, pt10Var};
        re00 re00Var = new re00();
        re00Var.a = pt10VarArr;
        Charset charset = qqw.a;
        this.a = re00Var;
    }
}
