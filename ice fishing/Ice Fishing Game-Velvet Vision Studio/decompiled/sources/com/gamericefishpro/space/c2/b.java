package com.gamericefishpro.space.c2;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.gamericefishpro.space.i9.a3;
import com.gamericefishpro.space.i9.z2;
import com.gamericefishpro.space.n9.k;
import com.gamericefishpro.space.n9.m;
import com.gamericefishpro.space.n9.r1;
import com.gamericefishpro.space.n9.v0;
import com.gamericefishpro.space.n9.z0;
import com.gamericefishpro.space.v8.c0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public long a;
    public final Object b;
    public final Object c;

    public b(m mVar, String str) {
        this.c = mVar;
        c0.d(str);
        this.b = str;
        this.a = -1L;
    }

    public void a(long j, long j2) {
        ((e) this.b).a(j, Float.intBitsToFloat((int) (j2 >> 32)));
        ((e) this.c).a(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public List b() {
        List list;
        List list2;
        m mVar = (m) this.c;
        ArrayList arrayList = new ArrayList();
        String str = (String) this.b;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = mVar.g0().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{str, String.valueOf(this.a)}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j = cursorQuery.getLong(0);
                        long j2 = cursorQuery.getLong(3);
                        boolean z = cursorQuery.getLong(5) == 1;
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j > this.a) {
                            this.a = j;
                        }
                        try {
                            z2 z2Var = (z2) z0.e0(a3.z(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            z2Var.b();
                            ((a3) z2Var.e).F(string);
                            long j3 = cursorQuery.getLong(2);
                            z2Var.b();
                            ((a3) z2Var.e).G(j3);
                            arrayList.add(new k(j, j2, z, (a3) z2Var.e()));
                        } catch (IOException e) {
                            v0 v0Var = ((r1) mVar.d).y;
                            r1.l(v0Var);
                            v0Var.y.c("Data loss. Failed to merge raw event. appId", v0.z(str), e);
                        }
                    } while (cursorQuery.moveToNext());
                    list = arrayList;
                } else {
                    list2 = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e2) {
                v0 v0Var2 = ((r1) mVar.d).y;
                r1.l(v0Var2);
                v0Var2.y.c("Data loss. Error querying raw events batch. appId", v0.z(str), e2);
                list = arrayList;
            }
            list = list2;
            return list;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public b(m mVar, String str, long j) {
        this.c = mVar;
        c0.d(str);
        this.b = str;
        this.a = mVar.c0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j)}, -1L);
    }

    public b() {
        d dVar = d.d;
        this.b = new e();
        this.c = new e();
    }
}
