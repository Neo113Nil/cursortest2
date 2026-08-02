package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteException;

/* loaded from: classes3.dex */
public final class b3b extends ow7 {
    public final /* synthetic */ int c = 1;
    public final Object d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3b(l9w l9wVar, pej pejVar, ssr ssrVar) {
        super(ssrVar);
        ssrVar.getClass();
        this.d = l9wVar;
        this.e = pejVar;
    }

    @Override // defpackage.ow7, defpackage.ssr
    public void c(rsr rsrVar) {
        switch (this.c) {
            case 0:
                rsrVar.getClass();
                wc5.c((wc5) this.d, (Context) ((anx) this.e).b, new SQLiteException("DB corrupted: " + rsrVar));
                break;
            default:
                super.c(rsrVar);
                break;
        }
    }

    @Override // defpackage.ow7, defpackage.ssr
    public void g(rsr rsrVar, int i, int i2) {
        switch (this.c) {
            case 1:
                rsrVar.getClass();
                ((l9w) this.d).getClass();
                bow.z("user_db_upgrade", i + " to " + i2);
                ((pej) this.e).getClass();
                this.b.g(rsrVar, i, i2);
                break;
            default:
                super.g(rsrVar, i, i2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3b(wc5 wc5Var, anx anxVar, ssr ssrVar) {
        super(ssrVar);
        this.d = wc5Var;
        this.e = anxVar;
    }
}
