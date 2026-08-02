package defpackage;

import kotlin.text.Regex;

/* loaded from: classes11.dex */
public final class wvo extends kl3 {
    public final /* synthetic */ int b = 1;
    public final Object c;

    public wvo(Regex regex, boolean z) {
        super(z);
        this.c = regex;
    }

    @Override // defpackage.kl3
    public final boolean b(String str) {
        int i = this.b;
        Object obj = this.c;
        boolean z = this.a;
        switch (i) {
            case 0:
                if ((z && str.length() == 0) || ((Boolean) ((sls) obj).invoke()).booleanValue()) {
                    break;
                }
                break;
            default:
                if ((z && str.length() == 0) || ((Regex) obj).h(str)) {
                    break;
                }
                break;
        }
        return true;
    }

    public wvo(boolean z, sls slsVar) {
        super(z);
        this.c = slsVar;
    }
}
