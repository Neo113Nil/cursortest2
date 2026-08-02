package defpackage;

import com.caverock.androidsvg.f;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class t97 implements q97 {
    public List a;

    @Override // defpackage.q97
    public final boolean a(yml0 yml0Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (f.g((x97) it.next(), yml0Var)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return ly3.s(new StringBuilder("not("), this.a, Extension.C_BRAKE);
    }
}
