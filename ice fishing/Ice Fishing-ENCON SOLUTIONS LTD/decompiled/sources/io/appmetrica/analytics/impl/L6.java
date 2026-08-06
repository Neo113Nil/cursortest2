package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.db.DBUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class L6 {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock.ReadLock f4673a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantReadWriteLock.WriteLock f4674b;

    /* renamed from: c, reason: collision with root package name */
    public final Y6 f4675c;

    /* renamed from: d, reason: collision with root package name */
    public final K6 f4676d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f4677e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f4678f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f4679g;

    /* renamed from: h, reason: collision with root package name */
    public final X4 f4680h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicLong f4681i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f4682j;

    /* renamed from: k, reason: collision with root package name */
    public final H6 f4683k;

    /* renamed from: l, reason: collision with root package name */
    public final C0400f7 f4684l;

    static {
        HashSet hashSet = new HashSet();
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
        hashSet.add(0);
        hashSet.add(6400);
    }

    public L6(X4 x4, Y6 y6, H6 h6, C0400f7 c0400f7) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f4673a = reentrantReadWriteLock.readLock();
        this.f4674b = reentrantReadWriteLock.writeLock();
        this.f4677e = new Object();
        this.f4678f = new ArrayList(3);
        AtomicLong atomicLong = new AtomicLong();
        this.f4681i = atomicLong;
        this.f4682j = new ArrayList();
        this.f4675c = y6;
        this.f4679g = x4.getContext();
        this.f4680h = x4;
        this.f4683k = h6;
        this.f4684l = c0400f7;
        atomicLong.set(b());
        K6 k6 = new K6(this, x4);
        this.f4676d = k6;
        k6.setName(a(x4));
    }

    public final long a() {
        this.f4673a.lock();
        try {
            return this.f4681i.get();
        } finally {
            this.f4673a.unlock();
        }
    }

    public final long b() {
        long j2;
        SQLiteDatabase readableDatabase;
        this.f4673a.lock();
        try {
            readableDatabase = this.f4675c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            j2 = DBUtils.queryRowsCount(readableDatabase, "events");
            this.f4673a.unlock();
            return j2;
        }
        j2 = 0;
        this.f4673a.unlock();
        return j2;
    }

    public final void c() {
        Cursor cursor;
        Cursor cursor2;
        this.f4673a.lock();
        Cursor cursor3 = null;
        try {
            SQLiteDatabase readableDatabase = this.f4675c.getReadableDatabase();
            if (readableDatabase != null) {
                cursor2 = readableDatabase.rawQuery(" SELECT DISTINCT id From sessions order by id asc ", new String[0]);
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("All sessions in db: ");
                    while (cursor2.moveToNext()) {
                        stringBuffer.append(cursor2.getString(0));
                        stringBuffer.append(", ");
                    }
                    cursor3 = readableDatabase.rawQuery(" SELECT DISTINCT session_id From events order by session_id asc ", new String[0]);
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("All sessions in reports db: ");
                    while (cursor3.moveToNext()) {
                        stringBuffer2.append(cursor3.getString(0));
                        stringBuffer2.append(", ");
                    }
                } catch (Throwable unused) {
                    cursor = cursor3;
                    cursor3 = cursor2;
                    cursor2 = cursor3;
                    cursor3 = cursor;
                    this.f4673a.unlock();
                    AbstractC0572lo.a(cursor2);
                    AbstractC0572lo.a(cursor3);
                }
            } else {
                cursor2 = null;
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        this.f4673a.unlock();
        AbstractC0572lo.a(cursor2);
        AbstractC0572lo.a(cursor3);
    }

    public final void d() {
        this.f4676d.start();
    }

    public final long a(Set set) {
        this.f4673a.lock();
        Cursor cursor = null;
        long j2 = 0;
        try {
            SQLiteDatabase readableDatabase = this.f4675c.getReadableDatabase();
            if (readableDatabase != null) {
                StringBuilder sb = new StringBuilder("SELECT count() FROM events");
                if (!set.isEmpty()) {
                    sb.append(" WHERE ");
                }
                Iterator it = set.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    if (i2 > 0) {
                        sb.append(" OR ");
                    }
                    sb.append("type == " + num);
                    i2++;
                }
                cursor = readableDatabase.rawQuery(sb.toString(), null);
                if (cursor.moveToFirst()) {
                    j2 = cursor.getLong(0);
                }
            }
        } catch (Throwable unused) {
        }
        AbstractC0572lo.a(cursor);
        this.f4673a.unlock();
        return j2;
    }

    public final void a(S8 s8) {
        this.f4682j.add(s8);
    }

    public static String a(Ea ea) {
        return "DatabaseWorker [" + ea.b().e() + "]";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(long j2, Vk vk, long j3) {
        JSONObject jSONObject;
        boolean b2;
        C0762t7 c0762t7 = new C0762t7(null, 1, 0 == true ? 1 : 0);
        C0539kh c0539kh = (C0539kh) this.f4680h.f5356k.a();
        Long valueOf = Long.valueOf(j2);
        Long valueOf2 = Long.valueOf(j3);
        try {
            jSONObject = new JSONObject().put("dId", c0539kh.getDeviceId()).put("uId", c0539kh.getUuid()).put("appVer", c0539kh.getAppVersion()).put("appBuild", c0539kh.getAppBuildNumber()).put("kitBuildType", c0539kh.getAnalyticsSdkBuildType()).put("osVer", c0539kh.getOsVersion()).put("osApiLev", c0539kh.getOsApiLevel()).put("lang", c0539kh.getLocale()).put("root", c0539kh.getDeviceRootStatus()).put("app_debuggable", ((N5) c0539kh).f4798a).put(CommonUrlParts.APP_FRAMEWORK, c0539kh.getAppFramework()).put("attribution_id", c0539kh.f6389r).put("analyticsSdkVersionName", c0539kh.getAnalyticsSdkVersionName()).put("kitBuildNumber", c0539kh.getAnalyticsSdkBuildNumber());
        } catch (Throwable unused) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        Long valueOf3 = Long.valueOf(In.a());
        Xj xj = Wj.f5313a;
        synchronized (xj) {
            b2 = xj.f5401b.b(true);
        }
        ContentValues fromModel = c0762t7.fromModel(new C0736s7(valueOf, vk, jSONObject2, new C0710r7(valueOf2, valueOf3, Boolean.valueOf(b2))));
        if (fromModel == null) {
            return;
        }
        this.f4674b.lock();
        try {
            SQLiteDatabase writableDatabase = this.f4675c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.insertOrThrow("sessions", null, fromModel);
            }
        } catch (Throwable unused2) {
        }
        this.f4674b.unlock();
    }

    public final void a(ContentValues contentValues) {
        synchronized (this.f4677e) {
            this.f4678f.add(contentValues);
        }
        synchronized (this.f4676d) {
            this.f4676d.notifyAll();
        }
    }

    public final int a(SQLiteDatabase sQLiteDatabase) {
        try {
            return this.f4683k.a(sQLiteDatabase, String.format("id IN (SELECT id FROM events ORDER BY CASE WHEN type IN (%1$s) THEN 2 WHEN type IN (%2$s) THEN 1 ELSE 0 END, id LIMIT (SELECT count() FROM events) / %3$s)", TextUtils.join(", ", AbstractC0842w9.f7104i), TextUtils.join(", ", AbstractC0842w9.f7105j), 10), 2, this.f4680h.f5347b.f4951b, true).f4377b;
        } catch (Throwable th) {
            Qj qj = AbstractC0645oj.f6689a;
            qj.getClass();
            qj.a(new C0671pj("deleteExcessiveReports exception", th));
            return 0;
        }
    }

    public final void a(long j2, int i2, int i3, boolean z2) {
        if (i3 <= 0) {
            return;
        }
        this.f4674b.lock();
        try {
            String format = String.format(Locale.US, "%1$s = %2$s AND %3$s = %4$s AND %5$s <= (SELECT %5$s FROM %6$s WHERE %1$s = %2$s AND %3$s = %4$s ORDER BY %5$s ASC LIMIT %7$s, 1)", "session_id", Long.toString(j2), "session_type", Integer.toString(i2), "id", "events", Integer.toString(i3 - 1));
            SQLiteDatabase writableDatabase = this.f4675c.getWritableDatabase();
            if (writableDatabase != null) {
                F6 a2 = this.f4683k.a(writableDatabase, format, 1, this.f4680h.f5347b.f4951b, z2);
                if (a2.f4376a != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = a2.f4376a.iterator();
                    while (it.hasNext()) {
                        Integer asInteger = ((ContentValues) it.next()).getAsInteger("type");
                        asInteger.intValue();
                        arrayList.add(asInteger);
                    }
                    Iterator it2 = this.f4682j.iterator();
                    while (it2.hasNext()) {
                        ((S8) it2.next()).b(arrayList);
                    }
                }
                List list = a2.f4376a;
                if (list != null) {
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        a((ContentValues) list.get(i4), "Event removed from db");
                    }
                }
                this.f4681i.addAndGet(-a2.f4377b);
            }
        } catch (Throwable unused) {
        }
        this.f4674b.unlock();
    }

    public final ContentValues a(long j2, Vk vk) {
        ContentValues contentValues = new ContentValues();
        this.f4673a.lock();
        Cursor cursor = null;
        try {
            SQLiteDatabase readableDatabase = this.f4675c.getReadableDatabase();
            if (readableDatabase != null) {
                Locale locale = Locale.US;
                cursor = readableDatabase.rawQuery("SELECT report_request_parameters FROM sessions WHERE id = " + j2 + " AND type = " + vk.f5268a + " ORDER BY id DESC LIMIT 1", null);
                if (cursor.moveToNext()) {
                    ContentValues contentValues2 = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursor, contentValues2);
                    contentValues = contentValues2;
                }
            }
        } catch (Throwable unused) {
        }
        AbstractC0572lo.a(cursor);
        this.f4673a.unlock();
        return contentValues;
    }

    public static String a(LinkedHashMap linkedHashMap) {
        StringBuilder sb = new StringBuilder("id >= ?");
        for (String str : linkedHashMap.keySet()) {
            sb.append(sb.length() > 0 ? " AND " : "");
            sb.append(str + " = ? ");
        }
        if (TextUtils.isEmpty(sb.toString())) {
            return null;
        }
        return sb.toString();
    }

    public static String[] a(String[] strArr, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(strArr));
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getValue());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ContentValues contentValues, String str) {
        Integer asInteger = contentValues.getAsInteger("type");
        if (AbstractC0842w9.f7099d.contains(EnumC0301bb.a(asInteger != null ? asInteger.intValue() : -1))) {
            C0374e7 model = new C0400f7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
            PublicLogger publicLogger = this.f4680h.f5358m;
            EnumC0301bb enumC0301bb = model.f5871d;
            C0349d7 c0349d7 = model.f5874g;
            publicLogger.info(Qf.a(str, enumC0301bb, c0349d7.f5789b, c0349d7.f5790c), new Object[0]);
        }
    }

    public static boolean a(L6 l6) {
        boolean isEmpty;
        synchronized (l6.f4677e) {
            isEmpty = l6.f4678f.isEmpty();
        }
        return isEmpty;
    }
}
