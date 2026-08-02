package defpackage;

import android.os.Bundle;
import com.yandex.passport.api.g;
import java.util.Map;

/* loaded from: classes6.dex */
public final class n9k {
    public final g a;
    public final x0q b;
    public final tf6 c;

    public n9k(g gVar) {
        this.a = gVar;
        x0q b = y0q.b(0, 1, oi3.b, 1);
        this.b = b;
        tf6 e = gld.e(dm6.b().plus(a4g.n()));
        this.c = gld.e(dm6.b());
        ox6.B(zsd.X(b, 15000L), e, new fmi(17, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zun zunVar, cg6 cg6Var) {
        m9k m9kVar;
        int i;
        Object s;
        Throwable a;
        if (cg6Var instanceof m9k) {
            m9kVar = (m9k) cg6Var;
            int i2 = m9kVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m9kVar.l = i2 - Integer.MIN_VALUE;
                Object obj = m9kVar.j;
                nm6 nm6Var = nm6.a;
                i = m9kVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    String string = zunVar.a.getString("from");
                    if (string == null) {
                        return Boolean.FALSE;
                    }
                    Bundle bundle = new Bundle();
                    for (Map.Entry entry : ((xy0) zunVar.d()).entrySet()) {
                        bundle.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    m9kVar.l = 1;
                    s = this.a.s(string, bundle, m9kVar);
                    if (s == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    s = ((z7o) obj).a;
                }
                a = z7o.a(s);
                if (a != null) {
                    ssg.a(6, "PassportNotificationApiImpl", "Passport error during notification message processing", a);
                }
                return !(s instanceof t7o) ? Boolean.FALSE : s;
            }
        }
        m9kVar = new m9k(this, cg6Var);
        Object obj2 = m9kVar.j;
        nm6 nm6Var2 = nm6.a;
        i = m9kVar.l;
        if (i != 0) {
        }
        a = z7o.a(s);
        if (a != null) {
        }
        if (!(s instanceof t7o)) {
        }
    }
}
