package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzn extends a0o {
    public final whn f;
    public final gao g;

    public zzn(dsc dscVar, List list, dbp dbpVar, ArrayList arrayList) {
        super(dscVar, list, dbpVar, arrayList);
        Uri.parse(((mu2) list.get(0)).a);
        long j = dbpVar.e;
        whn whnVar = j <= 0 ? null : new whn(null, dbpVar.d, j);
        this.f = whnVar;
        this.g = whnVar == null ? new gao(new whn(null, 0L, -1L)) : null;
    }

    @Override // defpackage.a0o
    public final String a() {
        return null;
    }

    @Override // defpackage.a0o
    public final o97 b() {
        return this.g;
    }

    @Override // defpackage.a0o
    public final whn d() {
        return this.f;
    }
}
