package defpackage;

import io.requery.android.database.sqlite.RequerySQLiteOpenHelperFactory;

/* loaded from: classes.dex */
public final class gwc implements usr {
    public final /* synthetic */ int a;

    public /* synthetic */ gwc(int i) {
        this.a = i;
    }

    @Override // defpackage.usr
    public final vsr create(tsr tsrVar) {
        switch (this.a) {
            case 0:
                return new fwc(tsrVar.a, tsrVar.b, tsrVar.c, tsrVar.d, tsrVar.e);
            default:
                vsr create = new RequerySQLiteOpenHelperFactory().create(tsrVar);
                create.getClass();
                return new crg(create);
        }
    }
}
