package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class ujg0 implements yjg0 {
    public boolean a = true;
    public final /* synthetic */ StringBuilder b;

    public /* synthetic */ ujg0(StringBuilder sb) {
        this.b = sb;
    }

    @Override // defpackage.yjg0
    public void a(xjg0 xjg0Var, int i) {
        boolean z = this.a;
        StringBuilder sb = this.b;
        if (z) {
            this.a = false;
        } else {
            sb.append(Extension.FIX_SPACE);
        }
        sb.append(i);
    }

    public void b(int i) {
        boolean z = this.a;
        StringBuilder sb = this.b;
        if (z) {
            this.a = false;
        } else {
            sb.append(Extension.FIX_SPACE);
        }
        sb.append(i);
    }
}
