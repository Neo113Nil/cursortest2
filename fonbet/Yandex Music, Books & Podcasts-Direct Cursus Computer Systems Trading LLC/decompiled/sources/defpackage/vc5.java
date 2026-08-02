package defpackage;

import android.database.Cursor;

/* loaded from: classes3.dex */
public final class vc5 extends ow7 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc5(wc5 wc5Var, ssr ssrVar) {
        super(ssrVar);
        this.c = 1;
    }

    @Override // defpackage.ow7, defpackage.ssr
    public void b(rsr rsrVar) {
        switch (this.c) {
            case 0:
                rsrVar.getClass();
                this.b.b(rsrVar);
                rsrVar.execSQL("PRAGMA synchronous=NORMAL");
                rsrVar.setMaxSqlCacheSize(100);
                break;
            case 1:
            default:
                super.b(rsrVar);
                break;
            case 2:
                rsrVar.getClass();
                this.b.b(rsrVar);
                rsrVar.execSQL("PRAGMA temp_store = MEMORY;");
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    @Override // defpackage.ow7, defpackage.ssr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(rsr rsrVar) {
        boolean z;
        switch (this.c) {
            case 1:
                rsrVar.getClass();
                Cursor query = rsrVar.query("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
                try {
                    Cursor cursor = query;
                    if (cursor.moveToFirst()) {
                        if (cursor.getInt(0) != 0) {
                            z = true;
                            yd5.q(query, null);
                            if (z) {
                                query = rsrVar.query("SELECT COUNT(*) FROM room_master_table");
                                try {
                                    Cursor cursor2 = query;
                                    cursor2.moveToFirst();
                                    int i = cursor2.getInt(0);
                                    yd5.q(query, null);
                                    if (i == 0) {
                                        rsrVar.execSQL("DROP TABLE room_master_table");
                                    }
                                } finally {
                                }
                            }
                            this.b.f(rsrVar);
                            return;
                        }
                    }
                    z = false;
                    yd5.q(query, null);
                    if (z) {
                    }
                    this.b.f(rsrVar);
                    return;
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            case 2:
                rsrVar.getClass();
                this.b.f(new rfc(rsrVar, 0));
                return;
            default:
                super.f(rsrVar);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vc5(ssr ssrVar, int i) {
        super(ssrVar);
        this.c = i;
    }
}
