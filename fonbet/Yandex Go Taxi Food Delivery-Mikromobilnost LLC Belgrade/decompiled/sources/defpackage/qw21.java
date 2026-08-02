package defpackage;

import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class qw21 {
    public static final /* synthetic */ int a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static plx a(ilx ilxVar) {
        mlx A = plx.A();
        int C = ilxVar.C();
        A.e();
        plx.x((plx) A.b, C);
        for (hlx hlxVar : ilxVar.B()) {
            nlx C2 = olx.C();
            String C3 = hlxVar.B().C();
            C2.e();
            olx.x((olx) C2.b, C3);
            KeyStatusType E = hlxVar.E();
            C2.e();
            olx.z((olx) C2.b, E);
            OutputPrefixType D = hlxVar.D();
            C2.e();
            olx.y((olx) C2.b, D);
            int C4 = hlxVar.C();
            C2.e();
            olx.A((olx) C2.b, C4);
            olx olxVar = (olx) C2.b();
            A.e();
            plx.y((plx) A.b, olxVar);
        }
        return (plx) A.b();
    }
}
