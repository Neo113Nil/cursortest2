package e2;

import Z1.i;
import Z1.k;
import a.AbstractC0415a;
import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import c2.C0538a;
import c2.C0539b;
import c2.d;
import c2.e;
import com.google.firebase.messaging.FirebaseMessaging;
import com.icefishing.icefishingliveapp.A;
import f4.q;
import g2.C4525a;
import g2.C4526b;
import g2.f;
import g2.h;
import h2.InterfaceC4565b;
import h3.g;
import h3.n;
import j2.AbstractC4595a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import q2.C4903n;

/* renamed from: e2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4468a implements InterfaceC4565b, g, f {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f37315n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f37316u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f37317v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f37318w;

    public /* synthetic */ C4468a(h hVar, Object obj, i iVar, int i) {
        this.f37315n = i;
        this.f37316u = hVar;
        this.f37318w = obj;
        this.f37317v = iVar;
    }

    @Override // h3.g
    public n a(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f37316u;
        String str = (String) this.f37317v;
        q qVar = (q) this.f37318w;
        String str2 = (String) obj;
        A c4 = FirebaseMessaging.c(firebaseMessaging.f36356b);
        K3.g gVar = firebaseMessaging.f36355a;
        gVar.a();
        String d2 = "[DEFAULT]".equals(gVar.f1624b) ? "" : gVar.d();
        String b9 = firebaseMessaging.f36362h.b();
        synchronized (c4) {
            String a9 = q.a(str2, b9, System.currentTimeMillis());
            if (a9 != null) {
                SharedPreferences.Editor edit = c4.f36499a.edit();
                edit.putString(d2 + "|T|" + str + "|*", a9);
                edit.commit();
            }
        }
        if (qVar == null || !str2.equals(qVar.f37768a)) {
            K3.g gVar2 = firebaseMessaging.f36355a;
            gVar2.a();
            if ("[DEFAULT]".equals(gVar2.f1624b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                    gVar2.a();
                    sb.append(gVar2.f1624b);
                    Log.d("FirebaseMessaging", sb.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new f4.h(firebaseMessaging.f36356b).b(intent);
            }
        }
        return AbstractC0415a.r(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007a A[SYNTHETIC] */
    @Override // g2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        Cursor cursor;
        int i;
        String str;
        long insert;
        c2.c cVar;
        c2.c cVar2;
        String str2 = "bytes";
        int i4 = 5;
        int i9 = 4;
        int i10 = 3;
        c2.c cVar3 = c2.c.CACHE_FULL;
        Object obj2 = this.f37318w;
        int i11 = 2;
        int i12 = 0;
        Object obj3 = this.f37317v;
        Object obj4 = this.f37316u;
        int i13 = 1;
        switch (this.f37315n) {
            case 2:
                Cursor cursor2 = (Cursor) obj;
                h hVar = (h) obj4;
                hVar.getClass();
                while (cursor2.moveToNext()) {
                    long j9 = cursor2.getLong(0);
                    int i14 = cursor2.getInt(7) != 0 ? i13 : 0;
                    C4903n c4903n = new C4903n(i11);
                    c4903n.f40106z = new HashMap();
                    String string = cursor2.getString(i13);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    c4903n.f40101u = string;
                    c4903n.f40104x = Long.valueOf(cursor2.getLong(i11));
                    c4903n.f40105y = Long.valueOf(cursor2.getLong(3));
                    if (i14 != 0) {
                        String string2 = cursor2.getString(4);
                        c4903n.f40103w = new k(string2 == null ? h.f37872y : new W1.c(string2), cursor2.getBlob(5));
                        str = str2;
                        i = i13;
                    } else {
                        String string3 = cursor2.getString(4);
                        W1.c cVar4 = string3 == null ? h.f37872y : new W1.c(string3);
                        Cursor query = hVar.b().query("event_payloads", new String[]{str2}, "event_id = ?", new String[]{String.valueOf(j9)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList = new ArrayList();
                            int i15 = 0;
                            while (query.moveToNext()) {
                                int i16 = i13;
                                byte[] blob = query.getBlob(0);
                                arrayList.add(blob);
                                i15 += blob.length;
                                i13 = i16;
                            }
                            i = i13;
                            byte[] bArr = new byte[i15];
                            str = str2;
                            int i17 = 0;
                            int i18 = 0;
                            while (i17 < arrayList.size()) {
                                byte[] bArr2 = (byte[]) arrayList.get(i17);
                                cursor = query;
                                try {
                                    System.arraycopy(bArr2, 0, bArr, i18, bArr2.length);
                                    i18 += bArr2.length;
                                    i17++;
                                    query = cursor;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            query.close();
                            c4903n.f40103w = new k(cVar4, bArr);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = query;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        c4903n.f40102v = Integer.valueOf(cursor2.getInt(6));
                    }
                    ((ArrayList) obj2).add(new C4526b(j9, (i) obj3, c4903n.c()));
                    i13 = i;
                    str2 = str;
                    i11 = 2;
                }
                return null;
            case 3:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                h hVar2 = (h) obj4;
                long simpleQueryForLong = hVar2.b().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar2.b().compileStatement("PRAGMA page_count").simpleQueryForLong();
                C4525a c4525a = hVar2.f37876w;
                long j10 = c4525a.f37860a;
                Z1.h hVar3 = (Z1.h) obj2;
                String str3 = hVar3.f4219a;
                if (simpleQueryForLong >= j10) {
                    hVar2.k(1L, cVar3, str3);
                    return -1L;
                }
                i iVar = (i) obj3;
                Long g9 = h.g(sQLiteDatabase, iVar);
                if (g9 != null) {
                    insert = g9.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", iVar.f4225a);
                    contentValues.put("priority", Integer.valueOf(AbstractC4595a.a(iVar.f4227c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr3 = iVar.f4226b;
                    if (bArr3 != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr3, 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                k kVar = hVar3.f4221c;
                byte[] bArr4 = kVar.f4231b;
                int length = bArr4.length;
                int i19 = c4525a.f37864e;
                boolean z8 = length <= i19;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", str3);
                contentValues2.put("timestamp_ms", Long.valueOf(hVar3.f4222d));
                contentValues2.put("uptime_ms", Long.valueOf(hVar3.f4223e));
                contentValues2.put("payload_encoding", kVar.f4230a.f3418a);
                contentValues2.put("code", hVar3.f4220b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put(com.anythink.core.express.b.a.f17692k, Boolean.valueOf(z8));
                contentValues2.put("payload", z8 ? bArr4 : new byte[0]);
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z8) {
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
                for (Map.Entry entry : Collections.unmodifiableMap(hVar3.f4224f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
            default:
                Cursor cursor3 = (Cursor) obj;
                h hVar4 = (h) obj4;
                hVar4.getClass();
                while (true) {
                    HashMap hashMap = (HashMap) obj3;
                    if (cursor3.moveToNext()) {
                        String string4 = cursor3.getString(i12);
                        int i21 = cursor3.getInt(1);
                        c2.c cVar5 = c2.c.REASON_UNKNOWN;
                        if (i21 != 0) {
                            if (i21 == 1) {
                                cVar5 = c2.c.MESSAGE_TOO_OLD;
                            } else if (i21 == 2) {
                                cVar = cVar3;
                                cVar2 = cVar;
                                long j11 = cursor3.getLong(2);
                                if (hashMap.containsKey(string4)) {
                                    hashMap.put(string4, new ArrayList());
                                }
                                ((List) hashMap.get(string4)).add(new d(j11, cVar));
                                cVar3 = cVar2;
                                i4 = 5;
                                i9 = 4;
                                i10 = 3;
                                i12 = 0;
                            } else if (i21 == i10) {
                                cVar5 = c2.c.PAYLOAD_TOO_BIG;
                            } else if (i21 == i9) {
                                cVar5 = c2.c.MAX_RETRIES_REACHED;
                            } else if (i21 == i4) {
                                cVar5 = c2.c.INVALID_PAYLOD;
                            } else if (i21 == 6) {
                                cVar5 = c2.c.SERVER_ERROR;
                            } else {
                                U2.a.c("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i21));
                            }
                        }
                        cVar2 = cVar3;
                        cVar = cVar5;
                        long j112 = cursor3.getLong(2);
                        if (hashMap.containsKey(string4)) {
                        }
                        ((List) hashMap.get(string4)).add(new d(j112, cVar));
                        cVar3 = cVar2;
                        i4 = 5;
                        i9 = 4;
                        i10 = 3;
                        i12 = 0;
                    } else {
                        Iterator it = hashMap.entrySet().iterator();
                        while (true) {
                            S0.n nVar = (S0.n) obj2;
                            if (!it.hasNext()) {
                                long a9 = hVar4.f37874u.a();
                                SQLiteDatabase b9 = hVar4.b();
                                b9.beginTransaction();
                                try {
                                    Cursor rawQuery = b9.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                                    try {
                                        rawQuery.moveToNext();
                                        c2.g gVar = new c2.g(rawQuery.getLong(0), a9);
                                        rawQuery.close();
                                        b9.setTransactionSuccessful();
                                        b9.endTransaction();
                                        nVar.f2914n = gVar;
                                        nVar.f2916v = new C0539b(new c2.f(hVar4.b().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar4.b().compileStatement("PRAGMA page_count").simpleQueryForLong(), C4525a.f37859f.f37860a));
                                        nVar.f2917w = (String) hVar4.f37877x.get();
                                        return new C0538a((c2.g) nVar.f2914n, Collections.unmodifiableList((ArrayList) nVar.f2915u), (C0539b) nVar.f2916v, (String) nVar.f2917w);
                                    } catch (Throwable th3) {
                                        rawQuery.close();
                                        throw th3;
                                    }
                                } catch (Throwable th4) {
                                    b9.endTransaction();
                                    throw th4;
                                }
                            }
                            Map.Entry entry2 = (Map.Entry) it.next();
                            int i22 = e.f5703c;
                            new ArrayList();
                            ((ArrayList) nVar.f2915u).add(new e((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                        }
                    }
                }
        }
    }

    @Override // h2.InterfaceC4565b
    public Object d() {
        C4469b c4469b = (C4469b) this.f37316u;
        h hVar = (h) c4469b.f37323d;
        hVar.getClass();
        i iVar = (i) this.f37317v;
        Z1.h hVar2 = (Z1.h) this.f37318w;
        String j9 = U2.a.j("SQLiteEventStore");
        if (Log.isLoggable(j9, 3)) {
            Log.d(j9, "Storing event with priority=" + iVar.f4227c + ", name=" + hVar2.f4219a + " for destination " + iVar.f4225a);
        }
        ((Long) hVar.i(new C4468a(hVar, (Object) hVar2, iVar, 3))).getClass();
        c4469b.f37320a.a(iVar, 1, false);
        return null;
    }

    public /* synthetic */ C4468a(Object obj, Object obj2, Object obj3, int i) {
        this.f37315n = i;
        this.f37316u = obj;
        this.f37317v = obj2;
        this.f37318w = obj3;
    }
}
