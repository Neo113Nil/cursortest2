package com.gamericefishpro.space.h8;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import com.gamericefishpro.space.c8.j;
import com.gamericefishpro.space.c8.m;
import com.gamericefishpro.space.d9.h;
import com.gamericefishpro.space.f8.d;
import com.gamericefishpro.space.f8.e;
import com.gamericefishpro.space.f8.f;
import com.gamericefishpro.space.j8.g;
import com.gamericefishpro.space.j8.i;
import com.gamericefishpro.space.r9.o;
import com.gamericefishpro.space.tb.k;
import com.gamericefishpro.space.tb.t;
import com.gamericefishpro.space.tb.u;
import com.gamericefishpro.space.u6.n;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements com.gamericefishpro.space.k8.b, g, com.gamericefishpro.space.r9.g {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object v;

    public /* synthetic */ a(i iVar, Object obj, j jVar, int i) {
        this.d = i;
        this.v = iVar;
        this.e = obj;
        this.i = jVar;
    }

    @Override // com.gamericefishpro.space.r9.g
    public o a(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.v;
        String str = (String) this.i;
        t tVar = (t) this.e;
        String str2 = (String) obj;
        u uVarC = FirebaseMessaging.c(firebaseMessaging.b);
        com.gamericefishpro.space.wa.g gVar = firebaseMessaging.a;
        gVar.a();
        String strD = "[DEFAULT]".equals(gVar.b) ? "" : gVar.d();
        String strB = firebaseMessaging.h.b();
        synchronized (uVarC) {
            String strA = t.a(str2, strB, System.currentTimeMillis());
            if (strA != null) {
                SharedPreferences.Editor editorEdit = ((SharedPreferences) uVarC.e).edit();
                editorEdit.putString(strD + "|T|" + str + "|*", strA);
                editorEdit.commit();
            }
        }
        if (tVar == null || !str2.equals(tVar.a)) {
            com.gamericefishpro.space.wa.g gVar2 = firebaseMessaging.a;
            gVar2.a();
            if ("[DEFAULT]".equals(gVar2.b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    gVar2.a();
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new k(firebaseMessaging.b).b(intent);
            }
        }
        return h.w(str2);
    }

    @Override // com.gamericefishpro.space.j8.g
    public Object apply(Object obj) throws Throwable {
        long jInsert;
        Cursor cursor;
        com.gamericefishpro.space.f8.c cVar;
        int i = this.d;
        int i2 = 5;
        int i3 = 4;
        int i4 = 3;
        com.gamericefishpro.space.f8.c cVar2 = com.gamericefishpro.space.f8.c.CACHE_FULL;
        int i5 = 2;
        int i6 = 1;
        Object obj2 = this.e;
        Object obj3 = this.i;
        int i7 = 0;
        i iVar = (i) this.v;
        switch (i) {
            case 1:
                com.gamericefishpro.space.c8.i iVar2 = (com.gamericefishpro.space.c8.i) obj2;
                m mVar = iVar2.c;
                String str = iVar2.a;
                j jVar = (j) obj3;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long jSimpleQueryForLong = iVar.b().compileStatement("PRAGMA page_size").simpleQueryForLong() * iVar.b().compileStatement("PRAGMA page_count").simpleQueryForLong();
                com.gamericefishpro.space.j8.a aVar = iVar.v;
                if (jSimpleQueryForLong >= aVar.a) {
                    iVar.n(1L, cVar2, str);
                    return -1L;
                }
                Long lC = i.c(sQLiteDatabase, jVar);
                if (lC != null) {
                    jInsert = lC.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", jVar.a);
                    contentValues.put("priority", Integer.valueOf(com.gamericefishpro.space.m8.a.a(jVar.c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = jVar.b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i8 = aVar.e;
                byte[] bArr2 = mVar.b;
                boolean z = bArr2.length <= i8;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(iVar2.d));
                contentValues2.put("uptime_ms", Long.valueOf(iVar2.e));
                contentValues2.put("payload_encoding", mVar.a.a);
                contentValues2.put("code", iVar2.b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr2 : new byte[0]);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) i8));
                    for (int i9 = 1; i9 <= iCeil; i9++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i9 - 1) * i8, Math.min(i9 * i8, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i9));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(iVar2.f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                j jVar2 = (j) obj3;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j = cursor2.getLong(0);
                    int i10 = cursor2.getInt(7) != 0 ? i6 : 0;
                    com.gamericefishpro.space.c8.h hVar = new com.gamericefishpro.space.c8.h();
                    hVar.f = new HashMap();
                    String string = cursor2.getString(i6);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    hVar.a = string;
                    hVar.d = Long.valueOf(cursor2.getLong(i5));
                    hVar.e = Long.valueOf(cursor2.getLong(3));
                    if (i10 != 0) {
                        String string2 = cursor2.getString(4);
                        hVar.c = new m(string2 == null ? i.y : new com.gamericefishpro.space.z7.c(string2), cursor2.getBlob(5));
                    } else {
                        String string3 = cursor2.getString(4);
                        com.gamericefishpro.space.z7.c cVar3 = string3 == null ? i.y : new com.gamericefishpro.space.z7.c(string3);
                        Cursor cursorQuery = iVar.b().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int length = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList2.add(blob);
                                length += blob.length;
                            }
                            byte[] bArr3 = new byte[length];
                            int i11 = 0;
                            int length2 = 0;
                            while (i11 < arrayList2.size()) {
                                byte[] bArr4 = (byte[]) arrayList2.get(i11);
                                cursor = cursorQuery;
                                try {
                                    ArrayList arrayList3 = arrayList2;
                                    System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
                                    length2 += bArr4.length;
                                    i11++;
                                    cursorQuery = cursor;
                                    arrayList2 = arrayList3;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            cursorQuery.close();
                            hVar.c = new m(cVar3, bArr3);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        hVar.b = Integer.valueOf(cursor2.getInt(6));
                    }
                    arrayList.add(new com.gamericefishpro.space.j8.b(j, jVar2, hVar.h()));
                    i5 = 2;
                    i6 = 1;
                }
                return null;
            default:
                HashMap map = (HashMap) obj3;
                n nVar = (n) obj2;
                ArrayList arrayList4 = (ArrayList) nVar.e;
                Cursor cursor3 = (Cursor) obj;
                iVar.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i7);
                    int i12 = cursor3.getInt(1);
                    com.gamericefishpro.space.f8.c cVar4 = com.gamericefishpro.space.f8.c.REASON_UNKNOWN;
                    if (i12 != 0) {
                        if (i12 == 1) {
                            cVar4 = com.gamericefishpro.space.f8.c.MESSAGE_TOO_OLD;
                        } else if (i12 == 2) {
                            cVar = cVar2;
                        } else if (i12 == i4) {
                            cVar4 = com.gamericefishpro.space.f8.c.PAYLOAD_TOO_BIG;
                        } else if (i12 == i3) {
                            cVar4 = com.gamericefishpro.space.f8.c.MAX_RETRIES_REACHED;
                        } else if (i12 == i2) {
                            cVar4 = com.gamericefishpro.space.f8.c.INVALID_PAYLOD;
                        } else if (i12 == 6) {
                            cVar4 = com.gamericefishpro.space.f8.c.SERVER_ERROR;
                        } else {
                            com.gamericefishpro.space.wa.b.r("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i12));
                        }
                        cVar = cVar4;
                    } else {
                        cVar = cVar4;
                    }
                    long j2 = cursor3.getLong(2);
                    if (!map.containsKey(string4)) {
                        map.put(string4, new ArrayList());
                    }
                    ((List) map.get(string4)).add(new d(j2, cVar));
                    i7 = 0;
                    i2 = 5;
                    i3 = 4;
                    i4 = 3;
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    int i13 = e.c;
                    new ArrayList();
                    arrayList4.add(new e((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                long jD = iVar.e.d();
                SQLiteDatabase sQLiteDatabaseB = iVar.b();
                sQLiteDatabaseB.beginTransaction();
                try {
                    Cursor cursorRawQuery = sQLiteDatabaseB.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        cursorRawQuery.moveToNext();
                        com.gamericefishpro.space.f8.g gVar = new com.gamericefishpro.space.f8.g(cursorRawQuery.getLong(0), jD);
                        cursorRawQuery.close();
                        sQLiteDatabaseB.setTransactionSuccessful();
                        sQLiteDatabaseB.endTransaction();
                        nVar.d = gVar;
                        nVar.i = new com.gamericefishpro.space.f8.b(new f(iVar.b().compileStatement("PRAGMA page_size").simpleQueryForLong() * iVar.b().compileStatement("PRAGMA page_count").simpleQueryForLong(), com.gamericefishpro.space.j8.a.f.a));
                        nVar.v = (String) iVar.w.get();
                        return new com.gamericefishpro.space.f8.a((com.gamericefishpro.space.f8.g) nVar.d, Collections.unmodifiableList(arrayList4), (com.gamericefishpro.space.f8.b) nVar.i, (String) nVar.v);
                    } catch (Throwable th3) {
                        cursorRawQuery.close();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    sQLiteDatabaseB.endTransaction();
                    throw th4;
                }
        }
    }

    @Override // com.gamericefishpro.space.k8.b
    public Object b() {
        b bVar = (b) this.v;
        j jVar = (j) this.i;
        com.gamericefishpro.space.c8.i iVar = (com.gamericefishpro.space.c8.i) this.e;
        i iVar2 = (i) bVar.d;
        iVar2.getClass();
        com.gamericefishpro.space.z7.d dVar = jVar.c;
        if (Log.isLoggable("TRuntime.".concat("SQLiteEventStore"), 3)) {
            new StringBuilder("Storing event with priority=").append(dVar);
        }
        ((Long) iVar2.j(new a(iVar2, (Object) iVar, jVar, 1))).getClass();
        bVar.a.z(jVar, 1, false);
        return null;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.v = obj;
        this.i = obj2;
        this.e = obj3;
    }
}
