package e2;

import Z1.i;
import Z1.k;
import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import c2.C0534a;
import c2.C0535b;
import c2.C0537d;
import c2.C0538e;
import c2.C0539f;
import c2.C0540g;
import c2.EnumC0536c;
import com.google.firebase.messaging.FirebaseMessaging;
import g1.C4523c;
import g2.C4524a;
import g2.C4525b;
import g2.f;
import g2.h;
import h2.InterfaceC4563b;
import j3.g;
import j3.m;
import j4.j;
import j4.q;
import j4.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import q2.C4896n;

/* renamed from: e2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4461a implements InterfaceC4563b, f, g {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f37184n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f37185u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f37186v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f37187w;

    public /* synthetic */ C4461a(int i, Object obj, Object obj2, Object obj3) {
        this.f37184n = i;
        this.f37186v = obj;
        this.f37185u = obj2;
        this.f37187w = obj3;
    }

    @Override // j3.g
    public m a(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f37186v;
        String str = (String) this.f37185u;
        r rVar = (r) this.f37187w;
        String str2 = (String) obj;
        C4523c c9 = FirebaseMessaging.c(firebaseMessaging.f36194b);
        O3.g gVar = firebaseMessaging.f36193a;
        gVar.a();
        String d2 = "[DEFAULT]".equals(gVar.f2346b) ? "" : gVar.d();
        String a9 = firebaseMessaging.f36200h.a();
        synchronized (c9) {
            String a10 = r.a(str2, a9, System.currentTimeMillis());
            if (a10 != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) c9.f37627u).edit();
                edit.putString(d2 + "|T|" + str + "|*", a10);
                edit.commit();
            }
        }
        if (rVar == null || !str2.equals(rVar.f38438a)) {
            O3.g gVar2 = firebaseMessaging.f36193a;
            gVar2.a();
            if ("[DEFAULT]".equals(gVar2.f2346b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                    gVar2.a();
                    sb.append(gVar2.f2346b);
                    Log.d("FirebaseMessaging", sb.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new j(firebaseMessaging.f36194b).b(intent);
            }
        }
        return S0.f.i(str2);
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
        EnumC0536c enumC0536c;
        EnumC0536c enumC0536c2;
        String str2 = "bytes";
        int i6 = 5;
        int i9 = 4;
        int i10 = 3;
        EnumC0536c enumC0536c3 = EnumC0536c.CACHE_FULL;
        Object obj2 = this.f37187w;
        int i11 = 2;
        int i12 = 0;
        Object obj3 = this.f37185u;
        Object obj4 = this.f37186v;
        int i13 = 1;
        switch (this.f37184n) {
            case 1:
                Cursor cursor2 = (Cursor) obj;
                h hVar = (h) obj4;
                hVar.getClass();
                while (cursor2.moveToNext()) {
                    long j6 = cursor2.getLong(0);
                    int i14 = cursor2.getInt(7) != 0 ? i13 : 0;
                    C4896n c4896n = new C4896n(i11);
                    c4896n.f40197z = new HashMap();
                    String string = cursor2.getString(i13);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    c4896n.f40192u = string;
                    c4896n.f40195x = Long.valueOf(cursor2.getLong(i11));
                    c4896n.f40196y = Long.valueOf(cursor2.getLong(3));
                    if (i14 != 0) {
                        String string2 = cursor2.getString(4);
                        c4896n.f40194w = new k(string2 == null ? h.f37641y : new W1.c(string2), cursor2.getBlob(5));
                        str = str2;
                        i = i13;
                    } else {
                        String string3 = cursor2.getString(4);
                        W1.c cVar = string3 == null ? h.f37641y : new W1.c(string3);
                        Cursor query = hVar.b().query("event_payloads", new String[]{str2}, "event_id = ?", new String[]{String.valueOf(j6)}, null, null, "sequence_num");
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
                            c4896n.f40194w = new k(cVar, bArr);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = query;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        c4896n.f40193v = Integer.valueOf(cursor2.getInt(6));
                    }
                    ((ArrayList) obj2).add(new C4525b(j6, (i) obj3, c4896n.c()));
                    i13 = i;
                    str2 = str;
                    i11 = 2;
                }
                return null;
            case 2:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                h hVar2 = (h) obj4;
                long simpleQueryForLong = hVar2.b().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar2.b().compileStatement("PRAGMA page_count").simpleQueryForLong();
                C4524a c4524a = hVar2.f37645w;
                long j9 = c4524a.f37629a;
                Z1.h hVar3 = (Z1.h) obj2;
                String str3 = hVar3.f4142a;
                if (simpleQueryForLong >= j9) {
                    hVar2.l(1L, enumC0536c3, str3);
                    return -1L;
                }
                i iVar = (i) obj3;
                Long i19 = h.i(sQLiteDatabase, iVar);
                if (i19 != null) {
                    insert = i19.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", iVar.f4148a);
                    contentValues.put("priority", Integer.valueOf(j2.a.a(iVar.f4150c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr3 = iVar.f4149b;
                    if (bArr3 != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr3, 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                k kVar = hVar3.f4144c;
                byte[] bArr4 = kVar.f4154b;
                int length = bArr4.length;
                int i20 = c4524a.f37633e;
                boolean z3 = length <= i20;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", str3);
                contentValues2.put("timestamp_ms", Long.valueOf(hVar3.f4145d));
                contentValues2.put("uptime_ms", Long.valueOf(hVar3.f4146e));
                contentValues2.put("payload_encoding", kVar.f4153a.f3406a);
                contentValues2.put("code", hVar3.f4143b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put(com.anythink.core.express.b.a.f17534k, Boolean.valueOf(z3));
                contentValues2.put("payload", z3 ? bArr4 : new byte[0]);
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z3) {
                    int ceil = (int) Math.ceil(bArr4.length / i20);
                    for (int i21 = 1; i21 <= ceil; i21++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr4, (i21 - 1) * i20, Math.min(i21 * i20, bArr4.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i21));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(hVar3.f4147f).entrySet()) {
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
                        int i22 = cursor3.getInt(1);
                        EnumC0536c enumC0536c4 = EnumC0536c.REASON_UNKNOWN;
                        if (i22 != 0) {
                            if (i22 == 1) {
                                enumC0536c4 = EnumC0536c.MESSAGE_TOO_OLD;
                            } else if (i22 == 2) {
                                enumC0536c = enumC0536c3;
                                enumC0536c2 = enumC0536c;
                                long j10 = cursor3.getLong(2);
                                if (hashMap.containsKey(string4)) {
                                    hashMap.put(string4, new ArrayList());
                                }
                                ((List) hashMap.get(string4)).add(new C0537d(j10, enumC0536c));
                                enumC0536c3 = enumC0536c2;
                                i6 = 5;
                                i9 = 4;
                                i10 = 3;
                                i12 = 0;
                            } else if (i22 == i10) {
                                enumC0536c4 = EnumC0536c.PAYLOAD_TOO_BIG;
                            } else if (i22 == i9) {
                                enumC0536c4 = EnumC0536c.MAX_RETRIES_REACHED;
                            } else if (i22 == i6) {
                                enumC0536c4 = EnumC0536c.INVALID_PAYLOD;
                            } else if (i22 == 6) {
                                enumC0536c4 = EnumC0536c.SERVER_ERROR;
                            } else {
                                O3.b.i("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i22));
                            }
                        }
                        enumC0536c2 = enumC0536c3;
                        enumC0536c = enumC0536c4;
                        long j102 = cursor3.getLong(2);
                        if (hashMap.containsKey(string4)) {
                        }
                        ((List) hashMap.get(string4)).add(new C0537d(j102, enumC0536c));
                        enumC0536c3 = enumC0536c2;
                        i6 = 5;
                        i9 = 4;
                        i10 = 3;
                        i12 = 0;
                    } else {
                        Iterator it = hashMap.entrySet().iterator();
                        while (true) {
                            q qVar = (q) obj2;
                            if (!it.hasNext()) {
                                long g4 = hVar4.f37643u.g();
                                SQLiteDatabase b9 = hVar4.b();
                                b9.beginTransaction();
                                try {
                                    Cursor rawQuery = b9.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                                    try {
                                        rawQuery.moveToNext();
                                        C0540g c0540g = new C0540g(rawQuery.getLong(0), g4);
                                        rawQuery.close();
                                        b9.setTransactionSuccessful();
                                        b9.endTransaction();
                                        qVar.f38434u = c0540g;
                                        qVar.f38436w = new C0535b(new C0539f(hVar4.b().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar4.b().compileStatement("PRAGMA page_count").simpleQueryForLong(), C4524a.f37628f.f37629a));
                                        qVar.f38433n = (String) hVar4.f37646x.get();
                                        return new C0534a((C0540g) qVar.f38434u, Collections.unmodifiableList((ArrayList) qVar.f38435v), (C0535b) qVar.f38436w, (String) qVar.f38433n);
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
                            int i23 = C0538e.f5546c;
                            new ArrayList();
                            ((ArrayList) qVar.f38435v).add(new C0538e((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                        }
                    }
                }
        }
    }

    @Override // h2.InterfaceC4563b
    public Object c() {
        b bVar = (b) this.f37186v;
        h hVar = (h) bVar.f37192d;
        hVar.getClass();
        i iVar = (i) this.f37185u;
        Z1.h hVar2 = (Z1.h) this.f37187w;
        String w6 = O3.b.w("SQLiteEventStore");
        if (Log.isLoggable(w6, 3)) {
            Log.d(w6, "Storing event with priority=" + iVar.f4150c + ", name=" + hVar2.f4142a + " for destination " + iVar.f4148a);
        }
        ((Long) hVar.j(new C4461a(hVar, hVar2, iVar, 2))).getClass();
        bVar.f37189a.a(iVar, 1, false);
        return null;
    }

    public /* synthetic */ C4461a(h hVar, Object obj, i iVar, int i) {
        this.f37184n = i;
        this.f37186v = hVar;
        this.f37187w = obj;
        this.f37185u = iVar;
    }
}
