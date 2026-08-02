package defpackage;

import androidx.window.core.VerificationMode;
import androidx.window.core.WindowStrictModeException;
import java.io.Serializable;

/* loaded from: classes10.dex */
public final class s8p extends cpt0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final VerificationMode c;
    public final dab1 d;
    public final Serializable e;

    public s8p(Object obj, String str, String str2, dab1 dab1Var, VerificationMode verificationMode) {
        this.a = 0;
        this.b = obj;
        this.d = dab1Var;
        this.c = verificationMode;
        WindowStrictModeException windowStrictModeException = new WindowStrictModeException(str2 + " value: " + obj);
        windowStrictModeException.setStackTrace((StackTraceElement[]) j73.z(2, windowStrictModeException.getStackTrace()).toArray(new StackTraceElement[0]));
        this.e = windowStrictModeException;
    }

    @Override // defpackage.cpt0
    public final Object a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = r8p.a[this.c.ordinal()];
                if (i2 == 1) {
                    throw ((WindowStrictModeException) this.e);
                }
                if (i2 == 2) {
                    obj.toString();
                    this.d.getClass();
                    return null;
                }
                if (i2 == 3) {
                    return null;
                }
                w511.b();
                return null;
            default:
                return obj;
        }
    }

    @Override // defpackage.cpt0
    public final cpt0 b(tls tlsVar, String str) {
        switch (this.a) {
            case 0:
                return this;
            default:
                if (((Boolean) tlsVar.invoke(this.b)).booleanValue()) {
                    return this;
                }
                return new s8p(this.b, (String) this.e, str, this.d, this.c);
        }
    }

    public s8p(Object obj, VerificationMode verificationMode, dab1 dab1Var) {
        this.a = 1;
        this.b = obj;
        this.e = "bbs0";
        this.c = verificationMode;
        this.d = dab1Var;
    }
}
