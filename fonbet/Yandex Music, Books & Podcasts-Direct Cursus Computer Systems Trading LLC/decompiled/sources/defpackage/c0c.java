package defpackage;

import java.io.Serializable;
import kotlin.text.Regex;

/* loaded from: classes3.dex */
public final class c0c extends qu2 {
    public final /* synthetic */ int b = 1;
    public final Serializable c;

    public c0c(Regex regex, boolean z) {
        super(z);
        this.c = regex;
    }

    @Override // defpackage.qu2
    public final boolean a(String str) {
        switch (this.b) {
            case 0:
                if ((!this.a || str.length() != 0) && !((Boolean) ((qs6) this.c).invoke()).booleanValue()) {
                }
                break;
            default:
                if ((!this.a || str.length() != 0) && !((Regex) this.c).e(str)) {
                }
                break;
        }
        return false;
    }

    public c0c(boolean z, qs6 qs6Var) {
        super(z);
        this.c = qs6Var;
    }
}
