package defpackage;

import java.text.MessageFormat;
import java.util.logging.Level;

/* loaded from: classes5.dex */
public final class nwe extends zc4 {
    public sue n;

    @Override // defpackage.zc4
    public final void I(int i, String str) {
        sue sueVar = this.n;
        Level n0 = ad4.n0(i);
        if (jd4.c.isLoggable(n0)) {
            jd4.a(sueVar, n0, str);
        }
    }

    @Override // defpackage.zc4
    public final void J(int i, String str, Object... objArr) {
        sue sueVar = this.n;
        Level n0 = ad4.n0(i);
        if (jd4.c.isLoggable(n0)) {
            jd4.a(sueVar, n0, MessageFormat.format(str, objArr));
        }
    }
}
