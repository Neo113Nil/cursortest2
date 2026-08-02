package defpackage;

import com.apollographql.apollo3.api.d;

/* loaded from: classes.dex */
public final class zwd implements rko {
    public static final r501 b = new r501(14);
    public final ike a;

    public zwd(jse jseVar, ike ikeVar) {
        this.a = ikeVar;
    }

    @Override // defpackage.tko
    public final tko a(sko skoVar) {
        return b != skoVar ? this : ovn.a;
    }

    @Override // defpackage.tko
    public final tko b(tko tkoVar) {
        return d.a(this, tkoVar);
    }

    @Override // defpackage.tko
    public final rko c(sko skoVar) {
        if (b != skoVar) {
            return null;
        }
        return this;
    }

    @Override // defpackage.tko
    public final Object fold(Object obj, wls wlsVar) {
        return wlsVar.invoke(obj, this);
    }

    @Override // defpackage.rko
    public final sko getKey() {
        return b;
    }
}
