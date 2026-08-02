package defpackage;

import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class qkr extends x6t {
    public final /* synthetic */ String h;

    public qkr(jml jmlVar, String str) {
        this.h = str;
    }

    @Override // defpackage.x6t
    public final void n(Object obj) {
        om3 om3Var = (om3) obj;
        String str = this.h;
        k(null, om3Var.l(str != null ? Charset.forName(str) : null));
    }
}
