package defpackage;

/* loaded from: classes.dex */
public final class wm4 {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public wm4(z7l z7lVar) {
        z7lVar.getClass();
        this.b = z7lVar;
    }

    public final void a(rsr rsrVar) {
        int i = this.a;
        rsrVar.getClass();
        switch (i) {
            case 0:
                rsrVar.beginTransaction();
                try {
                    StringBuilder sb = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
                    ((z7l) this.b).getClass();
                    sb.append(System.currentTimeMillis() - 86400000);
                    sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                    rsrVar.execSQL(sb.toString());
                    rsrVar.setTransactionSuccessful();
                    return;
                } finally {
                    rsrVar.endTransaction();
                }
            default:
                ((mjm) this.b).invoke(rsrVar);
                return;
        }
    }

    public wm4(mjm mjmVar) {
        this.b = mjmVar;
    }
}
