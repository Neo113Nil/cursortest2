package ru.CryptoPro.JCP.ControlPane;

import ru.CryptoPro.JCP.pref.JCPPref;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public abstract class HiddenPage {
    private static final cl_0 a = cl_0.Inactive;
    private final cl_0 b;

    public enum cl_0 {
        Hidden(-1),
        Inactive(0),
        Active(1);

        private final long d;

        cl_0(long j) {
            this.d = j;
        }

        public static cl_0 b(long j) {
            for (cl_0 cl_0Var : values()) {
                if (cl_0Var.d == j) {
                    return cl_0Var;
                }
            }
            JCPLogger.warning("No enum constant with value " + j);
            return HiddenPage.a;
        }

        public final long a() {
            return this.d;
        }
    }

    public HiddenPage(Class cls) {
        this.b = cl_0.b((int) new JCPPref(cls).getLong(a(), a.a()));
    }

    public abstract String a();

    public boolean b() {
        return this.b == cl_0.Hidden;
    }

    public boolean c() {
        return this.b == cl_0.Inactive;
    }

    public boolean d() {
        return this.b == cl_0.Active;
    }
}
