package defpackage;

import java.io.PrintStream;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class yfb1 {
    public static final nya1 a;

    static {
        nya1 vfb1Var;
        Integer num = null;
        try {
            try {
                num = (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Exception e) {
                System.err.getClass();
                e.printStackTrace(System.err);
            }
            vfb1Var = (num == null || num.intValue() < 19) ? !Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ? new ssb1() : new vfb1(0) : new vfb1(1);
        } catch (Throwable th) {
            PrintStream printStream = System.err;
            new StringBuilder(vfb1.class.getName().length() + HProv.PP_ENUM_CONTAINER_EXTENSION);
            printStream.getClass();
            th.printStackTrace(System.err);
            vfb1Var = new vfb1(0);
        }
        a = vfb1Var;
    }
}
