package b6;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import d6.h;
import d6.j;
import d8.m;
import d8.s;
import d8.u;
import d8.v;
import g7.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import w5.i;
import w5.k;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements e6.b, h, g7.g {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1021g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1022h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1023i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1024j;

    public /* synthetic */ b(j jVar, Object obj, i iVar, int i10) {
        this.f1021g = i10;
        this.f1023i = jVar;
        this.f1024j = obj;
        this.f1022h = iVar;
    }

    @Override // e6.b
    public Object a() {
        c cVar = (c) this.f1023i;
        i iVar = (i) this.f1022h;
        w5.h hVar = (w5.h) this.f1024j;
        j jVar = (j) cVar.f1029d;
        jVar.getClass();
        t5.d dVar = iVar.f7689c;
        String str = hVar.f7681a;
        String str2 = iVar.f7687a;
        String concat = "TRuntime.".concat("SQLiteEventStore");
        if (Log.isLoggable(concat, 3)) {
            Log.d(concat, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) jVar.d(new b(jVar, (Object) hVar, iVar, 2))).getClass();
        cVar.f1026a.I(iVar, 1, false);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007d A[SYNTHETIC] */
    @Override // d6.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        Cursor cursor;
        String str;
        long insert;
        z5.c cVar;
        int i10 = this.f1021g;
        String str2 = "bytes";
        int i11 = 5;
        int i12 = 4;
        int i13 = 3;
        z5.c cVar2 = z5.c.CACHE_FULL;
        int i14 = 2;
        Object obj2 = this.f1024j;
        Object obj3 = this.f1022h;
        int i15 = 0;
        j jVar = (j) this.f1023i;
        switch (i10) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                ArrayList arrayList = (ArrayList) obj2;
                i iVar = (i) obj3;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j3 = cursor2.getLong(0);
                    boolean z10 = cursor2.getInt(7) != 0;
                    m mVar = new m();
                    mVar.f1802f = new HashMap();
                    String string = cursor2.getString(1);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    mVar.f1797a = string;
                    mVar.f1800d = Long.valueOf(cursor2.getLong(i14));
                    mVar.f1801e = Long.valueOf(cursor2.getLong(3));
                    if (z10) {
                        String string2 = cursor2.getString(4);
                        mVar.f1799c = new k(string2 == null ? j.f1701l : new t5.c(string2), cursor2.getBlob(5));
                        str = str2;
                    } else {
                        String string3 = cursor2.getString(4);
                        t5.c cVar3 = string3 == null ? j.f1701l : new t5.c(string3);
                        Cursor query = jVar.a().query("event_payloads", new String[]{str2}, "event_id = ?", new String[]{String.valueOf(j3)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int i16 = 0;
                            while (query.moveToNext()) {
                                byte[] blob = query.getBlob(0);
                                arrayList2.add(blob);
                                i16 += blob.length;
                            }
                            byte[] bArr = new byte[i16];
                            int i17 = 0;
                            int i18 = 0;
                            while (i17 < arrayList2.size()) {
                                byte[] bArr2 = (byte[]) arrayList2.get(i17);
                                String str3 = str2;
                                cursor = query;
                                try {
                                    System.arraycopy(bArr2, 0, bArr, i18, bArr2.length);
                                    i18 += bArr2.length;
                                    i17++;
                                    query = cursor;
                                    str2 = str3;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            str = str2;
                            query.close();
                            mVar.f1799c = new k(cVar3, bArr);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = query;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        mVar.f1798b = Integer.valueOf(cursor2.getInt(6));
                    }
                    arrayList.add(new d6.b(j3, iVar, mVar.h()));
                    str2 = str;
                    i14 = 2;
                }
                return null;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                w5.h hVar = (w5.h) obj2;
                k kVar = hVar.f7683c;
                String str4 = hVar.f7681a;
                i iVar2 = (i) obj3;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long simpleQueryForLong = jVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * jVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                d6.a aVar = jVar.f1705j;
                if (simpleQueryForLong >= aVar.f1686a) {
                    jVar.g(1L, cVar2, str4);
                    return -1L;
                }
                Long b2 = j.b(sQLiteDatabase, iVar2);
                if (b2 != null) {
                    insert = b2.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", iVar2.f7687a);
                    contentValues.put("priority", Integer.valueOf(g6.a.a(iVar2.f7689c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr3 = iVar2.f7688b;
                    if (bArr3 != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr3, 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i19 = aVar.f1690e;
                byte[] bArr4 = kVar.f7697b;
                boolean z11 = bArr4.length <= i19;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", str4);
                contentValues2.put("timestamp_ms", Long.valueOf(hVar.f7684d));
                contentValues2.put("uptime_ms", Long.valueOf(hVar.f7685e));
                contentValues2.put("payload_encoding", kVar.f7696a.f6526a);
                contentValues2.put("code", hVar.f7682b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z11));
                contentValues2.put("payload", z11 ? bArr4 : new byte[0]);
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z11) {
                    int ceil = (int) Math.ceil(bArr4.length / i19);
                    for (int i20 = 1; i20 <= ceil; i20++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr4, (i20 - 1) * i19, Math.min(i20 * i19, bArr4.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i20));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(hVar.f7686f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
            default:
                HashMap hashMap = (HashMap) obj3;
                s sVar = (s) obj2;
                ArrayList arrayList3 = (ArrayList) sVar.f1814i;
                Cursor cursor3 = (Cursor) obj;
                jVar.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i15);
                    int i21 = cursor3.getInt(1);
                    z5.c cVar4 = z5.c.REASON_UNKNOWN;
                    if (i21 != 0) {
                        if (i21 == 1) {
                            cVar4 = z5.c.MESSAGE_TOO_OLD;
                        } else if (i21 == 2) {
                            cVar = cVar2;
                            long j6 = cursor3.getLong(2);
                            if (hashMap.containsKey(string4)) {
                                hashMap.put(string4, new ArrayList());
                            }
                            ((List) hashMap.get(string4)).add(new z5.d(j6, cVar));
                            i15 = 0;
                            i11 = 5;
                            i12 = 4;
                            i13 = 3;
                        } else if (i21 == i13) {
                            cVar4 = z5.c.PAYLOAD_TOO_BIG;
                        } else if (i21 == i12) {
                            cVar4 = z5.c.MAX_RETRIES_REACHED;
                        } else if (i21 == i11) {
                            cVar4 = z5.c.INVALID_PAYLOD;
                        } else if (i21 == 6) {
                            cVar4 = z5.c.SERVER_ERROR;
                        } else {
                            a.a.r("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i21));
                        }
                    }
                    cVar = cVar4;
                    long j62 = cursor3.getLong(2);
                    if (hashMap.containsKey(string4)) {
                    }
                    ((List) hashMap.get(string4)).add(new z5.d(j62, cVar));
                    i15 = 0;
                    i11 = 5;
                    i12 = 4;
                    i13 = 3;
                }
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    int i22 = z5.e.f9151c;
                    new ArrayList();
                    arrayList3.add(new z5.e((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                long a6 = jVar.f1703h.a();
                SQLiteDatabase a8 = jVar.a();
                a8.beginTransaction();
                try {
                    Cursor rawQuery = a8.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        rawQuery.moveToNext();
                        z5.g gVar = new z5.g(rawQuery.getLong(0), a6);
                        rawQuery.close();
                        a8.setTransactionSuccessful();
                        a8.endTransaction();
                        sVar.f1813h = gVar;
                        sVar.f1815j = new z5.b(new z5.f(jVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * jVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), d6.a.f1685f.f1686a));
                        sVar.f1812g = (String) jVar.f1706k.get();
                        return new z5.a((z5.g) sVar.f1813h, Collections.unmodifiableList(arrayList3), (z5.b) sVar.f1815j, (String) sVar.f1812g);
                    } catch (Throwable th3) {
                        rawQuery.close();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    a8.endTransaction();
                    throw th4;
                }
        }
    }

    @Override // g7.g
    public o c(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f1023i;
        String str = (String) this.f1022h;
        u uVar = (u) this.f1024j;
        String str2 = (String) obj;
        v c3 = FirebaseMessaging.c(firebaseMessaging.f1461b);
        i7.g gVar = firebaseMessaging.f1460a;
        gVar.a();
        String c7 = "[DEFAULT]".equals(gVar.f3232b) ? "" : gVar.c();
        String b2 = firebaseMessaging.f1467h.b();
        synchronized (c3) {
            String a6 = u.a(str2, b2, System.currentTimeMillis());
            if (a6 != null) {
                SharedPreferences.Editor edit = c3.f1825a.edit();
                edit.putString(c7 + "|T|" + str + "|*", a6);
                edit.commit();
            }
        }
        if (uVar == null || !str2.equals(uVar.f1822a)) {
            i7.g gVar2 = firebaseMessaging.f1460a;
            gVar2.a();
            if ("[DEFAULT]".equals(gVar2.f3232b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                    gVar2.a();
                    sb.append(gVar2.f3232b);
                    Log.d("FirebaseMessaging", sb.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new d8.j(firebaseMessaging.f1461b).b(intent);
            }
        }
        return i7.b.u(str2);
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i10) {
        this.f1021g = i10;
        this.f1023i = obj;
        this.f1022h = obj2;
        this.f1024j = obj3;
    }
}
