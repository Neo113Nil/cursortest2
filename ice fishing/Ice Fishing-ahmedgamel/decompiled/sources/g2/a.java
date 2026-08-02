package g2;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import b2.i;
import com.bumptech.glide.d;
import com.google.firebase.messaging.FirebaseMessaging;
import e2.C4473a;
import e2.C4474b;
import e2.C4476d;
import e2.C4477e;
import e2.C4478f;
import e2.C4479g;
import e2.EnumC4475c;
import i1.C4586c;
import i2.C4587a;
import i2.C4588b;
import i2.f;
import i2.h;
import j2.InterfaceC4611b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l3.g;
import l3.m;
import l4.j;
import l4.q;
import l4.r;
import s2.C4945n;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC4611b, f, g {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f37660n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f37661u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f37662v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f37663w;

    public /* synthetic */ a(int i, Object obj, Object obj2, Object obj3) {
        this.f37660n = i;
        this.f37662v = obj;
        this.f37661u = obj2;
        this.f37663w = obj3;
    }

    @Override // l3.g
    public m a(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f37662v;
        String str = (String) this.f37661u;
        r rVar = (r) this.f37663w;
        String str2 = (String) obj;
        C4586c c9 = FirebaseMessaging.c(firebaseMessaging.f36961b);
        Q3.g gVar = firebaseMessaging.f36960a;
        gVar.a();
        String d9 = "[DEFAULT]".equals(gVar.f2662b) ? "" : gVar.d();
        String a9 = firebaseMessaging.f36967h.a();
        synchronized (c9) {
            String a10 = r.a(str2, a9, System.currentTimeMillis());
            if (a10 != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) c9.f38154u).edit();
                edit.putString(d9 + "|T|" + str + "|*", a10);
                edit.commit();
            }
        }
        if (rVar == null || !str2.equals(rVar.f38950a)) {
            Q3.g gVar2 = firebaseMessaging.f36960a;
            gVar2.a();
            if ("[DEFAULT]".equals(gVar2.f2662b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                    gVar2.a();
                    sb.append(gVar2.f2662b);
                    Log.d("FirebaseMessaging", sb.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new j(firebaseMessaging.f36961b).b(intent);
            }
        }
        return d.r(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007a A[SYNTHETIC] */
    @Override // i2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        Cursor cursor;
        int i;
        String str;
        long insert;
        EnumC4475c enumC4475c;
        EnumC4475c enumC4475c2;
        String str2 = "bytes";
        int i4 = 5;
        int i6 = 4;
        int i9 = 3;
        EnumC4475c enumC4475c3 = EnumC4475c.CACHE_FULL;
        Object obj2 = this.f37663w;
        int i10 = 2;
        int i11 = 0;
        Object obj3 = this.f37661u;
        Object obj4 = this.f37662v;
        int i12 = 1;
        switch (this.f37660n) {
            case 1:
                Cursor cursor2 = (Cursor) obj;
                h hVar = (h) obj4;
                hVar.getClass();
                while (cursor2.moveToNext()) {
                    long j6 = cursor2.getLong(0);
                    int i13 = cursor2.getInt(7) != 0 ? i12 : 0;
                    C4945n c4945n = new C4945n(i10);
                    c4945n.f40496z = new HashMap();
                    String string = cursor2.getString(i12);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    c4945n.f40491u = string;
                    c4945n.f40494x = Long.valueOf(cursor2.getLong(i10));
                    c4945n.f40495y = Long.valueOf(cursor2.getLong(3));
                    if (i13 != 0) {
                        String string2 = cursor2.getString(4);
                        c4945n.f40493w = new b2.j(string2 == null ? h.f38168y : new Y1.c(string2), cursor2.getBlob(5));
                        str = str2;
                        i = i12;
                    } else {
                        String string3 = cursor2.getString(4);
                        Y1.c cVar = string3 == null ? h.f38168y : new Y1.c(string3);
                        Cursor query = hVar.b().query("event_payloads", new String[]{str2}, "event_id = ?", new String[]{String.valueOf(j6)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList = new ArrayList();
                            int i14 = 0;
                            while (query.moveToNext()) {
                                int i15 = i12;
                                byte[] blob = query.getBlob(0);
                                arrayList.add(blob);
                                i14 += blob.length;
                                i12 = i15;
                            }
                            i = i12;
                            byte[] bArr = new byte[i14];
                            str = str2;
                            int i16 = 0;
                            int i17 = 0;
                            while (i16 < arrayList.size()) {
                                byte[] bArr2 = (byte[]) arrayList.get(i16);
                                cursor = query;
                                try {
                                    System.arraycopy(bArr2, 0, bArr, i17, bArr2.length);
                                    i17 += bArr2.length;
                                    i16++;
                                    query = cursor;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            query.close();
                            c4945n.f40493w = new b2.j(cVar, bArr);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = query;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        c4945n.f40492v = Integer.valueOf(cursor2.getInt(6));
                    }
                    ((ArrayList) obj2).add(new C4588b(j6, (i) obj3, c4945n.c()));
                    i12 = i;
                    str2 = str;
                    i10 = 2;
                }
                return null;
            case 2:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                h hVar2 = (h) obj4;
                long simpleQueryForLong = hVar2.b().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar2.b().compileStatement("PRAGMA page_count").simpleQueryForLong();
                C4587a c4587a = hVar2.f38172w;
                long j9 = c4587a.f38156a;
                b2.h hVar3 = (b2.h) obj2;
                String str3 = hVar3.f5531a;
                if (simpleQueryForLong >= j9) {
                    hVar2.l(1L, enumC4475c3, str3);
                    return -1L;
                }
                i iVar = (i) obj3;
                Long i18 = h.i(sQLiteDatabase, iVar);
                if (i18 != null) {
                    insert = i18.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", iVar.f5537a);
                    contentValues.put("priority", Integer.valueOf(l2.a.a(iVar.f5539c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr3 = iVar.f5538b;
                    if (bArr3 != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr3, 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                b2.j jVar = hVar3.f5533c;
                byte[] bArr4 = jVar.f5541b;
                int length = bArr4.length;
                int i19 = c4587a.f38160e;
                boolean z6 = length <= i19;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", str3);
                contentValues2.put("timestamp_ms", Long.valueOf(hVar3.f5534d));
                contentValues2.put("uptime_ms", Long.valueOf(hVar3.f5535e));
                contentValues2.put("payload_encoding", jVar.f5540a.f3903a);
                contentValues2.put("code", hVar3.f5532b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put(com.anythink.core.express.b.a.f18321k, Boolean.valueOf(z6));
                contentValues2.put("payload", z6 ? bArr4 : new byte[0]);
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z6) {
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
                for (Map.Entry entry : Collections.unmodifiableMap(hVar3.f5536f).entrySet()) {
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
                        String string4 = cursor3.getString(i11);
                        int i21 = cursor3.getInt(1);
                        EnumC4475c enumC4475c4 = EnumC4475c.REASON_UNKNOWN;
                        if (i21 != 0) {
                            if (i21 == 1) {
                                enumC4475c4 = EnumC4475c.MESSAGE_TOO_OLD;
                            } else if (i21 == 2) {
                                enumC4475c = enumC4475c3;
                                enumC4475c2 = enumC4475c;
                                long j10 = cursor3.getLong(2);
                                if (hashMap.containsKey(string4)) {
                                    hashMap.put(string4, new ArrayList());
                                }
                                ((List) hashMap.get(string4)).add(new C4476d(j10, enumC4475c));
                                enumC4475c3 = enumC4475c2;
                                i4 = 5;
                                i6 = 4;
                                i9 = 3;
                                i11 = 0;
                            } else if (i21 == i9) {
                                enumC4475c4 = EnumC4475c.PAYLOAD_TOO_BIG;
                            } else if (i21 == i6) {
                                enumC4475c4 = EnumC4475c.MAX_RETRIES_REACHED;
                            } else if (i21 == i4) {
                                enumC4475c4 = EnumC4475c.INVALID_PAYLOD;
                            } else if (i21 == 6) {
                                enumC4475c4 = EnumC4475c.SERVER_ERROR;
                            } else {
                                Z2.d.i("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i21));
                            }
                        }
                        enumC4475c2 = enumC4475c3;
                        enumC4475c = enumC4475c4;
                        long j102 = cursor3.getLong(2);
                        if (hashMap.containsKey(string4)) {
                        }
                        ((List) hashMap.get(string4)).add(new C4476d(j102, enumC4475c));
                        enumC4475c3 = enumC4475c2;
                        i4 = 5;
                        i6 = 4;
                        i9 = 3;
                        i11 = 0;
                    } else {
                        Iterator it = hashMap.entrySet().iterator();
                        while (true) {
                            q qVar = (q) obj2;
                            if (!it.hasNext()) {
                                long f2 = hVar4.f38170u.f();
                                SQLiteDatabase b9 = hVar4.b();
                                b9.beginTransaction();
                                try {
                                    Cursor rawQuery = b9.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                                    try {
                                        rawQuery.moveToNext();
                                        C4479g c4479g = new C4479g(rawQuery.getLong(0), f2);
                                        rawQuery.close();
                                        b9.setTransactionSuccessful();
                                        b9.endTransaction();
                                        qVar.f38946u = c4479g;
                                        qVar.f38948w = new C4474b(new C4478f(hVar4.b().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar4.b().compileStatement("PRAGMA page_count").simpleQueryForLong(), C4587a.f38155f.f38156a));
                                        qVar.f38945n = (String) hVar4.f38173x.get();
                                        return new C4473a((C4479g) qVar.f38946u, Collections.unmodifiableList((ArrayList) qVar.f38947v), (C4474b) qVar.f38948w, (String) qVar.f38945n);
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
                            int i22 = C4477e.f37261c;
                            new ArrayList();
                            ((ArrayList) qVar.f38947v).add(new C4477e((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                        }
                    }
                }
        }
    }

    @Override // j2.InterfaceC4611b
    public Object d() {
        b bVar = (b) this.f37662v;
        h hVar = (h) bVar.f37668d;
        hVar.getClass();
        i iVar = (i) this.f37661u;
        b2.h hVar2 = (b2.h) this.f37663w;
        String l9 = Z2.d.l("SQLiteEventStore");
        if (Log.isLoggable(l9, 3)) {
            Log.d(l9, "Storing event with priority=" + iVar.f5539c + ", name=" + hVar2.f5531a + " for destination " + iVar.f5537a);
        }
        ((Long) hVar.j(new a(hVar, hVar2, iVar, 2))).getClass();
        bVar.f37665a.a(iVar, 1, false);
        return null;
    }

    public /* synthetic */ a(h hVar, Object obj, i iVar, int i) {
        this.f37660n = i;
        this.f37662v = hVar;
        this.f37663w = obj;
        this.f37661u = iVar;
    }
}
