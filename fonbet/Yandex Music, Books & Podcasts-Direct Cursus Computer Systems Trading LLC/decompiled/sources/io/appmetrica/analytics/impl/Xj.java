package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.db.DBUtils;
import io.appmetrica.analytics.coreutils.internal.io.GZIPCompressor;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.networktasks.internal.DefaultNetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.appmetrica.analytics.networktasks.internal.SendingDataTaskHelper;
import io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class Xj implements UnderlyingNetworkTask {
    public final P5 a;
    public final LinkedHashMap b;
    public C0224e8 c;
    public C0601ra d;
    public final E7 e;
    public List f;
    public int g;
    public int h;
    public int i;
    public Wj j;
    public final O3 k;
    public final PublicLogger l;
    public final Hr m;
    public final InterfaceC0228ec n;
    public final Cj o;
    public final FullUrlFormer p;
    public final Xc q;
    public final RequestDataHolder r;
    public final ResponseDataHolder s;
    public final SendingDataTaskHelper t;
    public int u;
    public boolean v;

    public Xj(P5 p5, PublicLogger publicLogger, E7 e7, Cj cj, Hr hr, Xc xc, O3 o3, Om om, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, RequestBodyEncrypter requestBodyEncrypter) {
        this.b = new LinkedHashMap();
        this.g = 0;
        this.h = 0;
        this.i = -1;
        this.v = false;
        this.t = new SendingDataTaskHelper(requestBodyEncrypter, new GZIPCompressor(), requestDataHolder, responseDataHolder, new DefaultNetworkResponseHandler());
        this.o = cj;
        this.a = p5;
        this.e = e7;
        this.l = publicLogger;
        this.k = o3;
        this.m = hr;
        this.q = xc;
        this.n = om;
        this.r = requestDataHolder;
        this.s = responseDataHolder;
        this.p = fullUrlFormer;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x012d A[LOOP:1: B:47:0x0127->B:49:0x012d, LOOP_END] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v3, types: [io.appmetrica.analytics.impl.j8, kotlin.jvm.internal.DefaultConstructorMarker] */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Wj a(@NonNull Nj nj) {
        Cursor cursor;
        Iterator it;
        Cursor cursor2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList3 = new ArrayList();
        ?? r10 = 0;
        try {
            Cursor a = a();
            if (a != null) {
                JSONObject jSONObject2 = jSONObject;
                C0447m0 c0447m0 = null;
                while (a.moveToNext() && this.h < 100) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        DBUtils.cursorRowToContentValues(a, contentValues);
                        C0426l8 model = new C0455m8(r10, 1, r10).toModel(contentValues);
                        Long l = model.a;
                        if (l != null) {
                            C0397k8 c0397k8 = model.d;
                            Long l2 = c0397k8.a;
                            Long l3 = c0397k8.b;
                            Boolean bool = c0397k8.c;
                            Map map = AbstractC0465mi.a;
                            C0573qa c0573qa = new C0573qa();
                            if (l2 != null) {
                                cursor2 = a;
                                try {
                                    c0573qa.a = l2.longValue();
                                    c0573qa.b = ((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(l2.longValue() * 1000) / 1000;
                                } catch (Throwable th) {
                                    th = th;
                                    jSONObject = jSONObject2;
                                    cursor = cursor2;
                                    try {
                                        arrayList3.add(th);
                                        it = arrayList3.iterator();
                                        while (it.hasNext()) {
                                        }
                                        return new Wj(arrayList, arrayList2, jSONObject);
                                    } finally {
                                        AbstractC0734vr.a(cursor);
                                    }
                                }
                            } else {
                                cursor2 = a;
                            }
                            if (l3 != null) {
                                c0573qa.c = l3.longValue();
                            }
                            if (bool != null) {
                                c0573qa.d = bool.booleanValue();
                            }
                            String locale = nj.getLocale();
                            Xn xn = model.b;
                            C0486na c0486na = new C0486na();
                            c0486na.a = c0573qa;
                            c0486na.b = locale;
                            if (xn != null) {
                                Integer num = (Integer) AbstractC0465mi.a.get(xn);
                                c0486na.c = num != null ? num.intValue() : 0;
                            }
                            int computeUInt64Size = this.g + CodedOutputByteBufferNano.computeUInt64Size(1, Long.MAX_VALUE);
                            this.g = computeUInt64Size;
                            int computeMessageSize = computeUInt64Size + CodedOutputByteBufferNano.computeMessageSize(2, c0486na);
                            this.g = computeMessageSize;
                            if (computeMessageSize >= 250880) {
                                break;
                            }
                            Vj a2 = a(l.longValue(), c0486na, nj, arrayList3, arrayList.size());
                            if (a2 != null) {
                                C0447m0 c0447m02 = a2.b;
                                if (c0447m0 != null) {
                                    if (!c0447m0.equals(c0447m02)) {
                                        break;
                                    }
                                } else {
                                    c0447m0 = c0447m02;
                                }
                                arrayList2.add(l);
                                arrayList.add(a2.a);
                                if (!TextUtils.isEmpty(a2.b.a)) {
                                    try {
                                        jSONObject2 = new JSONObject(a2.b.a);
                                    } catch (Throwable unused) {
                                    }
                                }
                                if (a2.c) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            cursor2 = a;
                        }
                        a = cursor2;
                        r10 = 0;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor2 = a;
                    }
                }
                cursor2 = a;
                jSONObject = jSONObject2;
            } else {
                cursor2 = a;
            }
            AbstractC0734vr.a(cursor2);
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
        it = arrayList3.iterator();
        while (it.hasNext()) {
            this.n.reportError("protobuf_serialization_error", (Throwable) it.next());
        }
        return new Wj(arrayList, arrayList2, jSONObject);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final String description() {
        return "ReportTask_" + ApiKeyUtils.createPartialApiKey(this.a.b.b);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.p;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final RequestDataHolder getRequestDataHolder() {
        return this.r;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final ResponseDataHolder getResponseDataHolder() {
        return this.s;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((Nj) this.a.k.a()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final SSLSocketFactory getSslSocketFactory() {
        return C0747wb.I.z().getSslSocketFactory();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onCreateTask() {
        Cursor cursor;
        int optInt;
        E7 e7 = this.a.e;
        e7.getClass();
        ArrayList arrayList = new ArrayList();
        e7.a.lock();
        try {
            SQLiteDatabase readableDatabase = e7.c.getReadableDatabase();
            if (readableDatabase != null) {
                cursor = readableDatabase.rawQuery(AbstractC0453m6.b, null);
                while (cursor.moveToNext()) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(cursor, contentValues);
                        arrayList.add(contentValues);
                    } catch (Throwable unused) {
                        try {
                            arrayList = new ArrayList();
                            if (!arrayList.isEmpty()) {
                            }
                        } finally {
                            AbstractC0734vr.a(cursor);
                            e7.a.unlock();
                        }
                    }
                }
            } else {
                cursor = null;
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        if (!arrayList.isEmpty()) {
            return false;
        }
        ContentValues contentValues2 = (ContentValues) arrayList.get(0);
        this.b.clear();
        for (Map.Entry<String, Object> entry : contentValues2.valueSet()) {
            this.b.put(entry.getKey(), entry.getValue().toString());
        }
        String asString = contentValues2.getAsString("report_request_parameters");
        if (TextUtils.isEmpty(asString)) {
            C0224e8 c0224e8 = new C0224e8();
            this.c = c0224e8;
            this.o.c = c0224e8;
        } else {
            try {
                C0224e8 c0224e82 = new C0224e8(new Ec(asString));
                this.c = c0224e82;
                this.o.c = c0224e82;
            } catch (Throwable unused3) {
                C0224e8 c0224e83 = new C0224e8();
                this.c = c0224e83;
                this.o.c = c0224e83;
            }
        }
        Nj config = this.q.getConfig();
        List list = config.w;
        if (AbstractC0734vr.a((Collection) list)) {
            return false;
        }
        this.p.setHosts(config.q);
        if (!config.u() || AbstractC0734vr.a((Collection) this.p.getAllHosts())) {
            this.v = true;
            return false;
        }
        this.f = null;
        Wj a = a(config);
        this.j = a;
        if (a.a.isEmpty()) {
            return false;
        }
        Hr hr = this.m;
        synchronized (hr) {
            optInt = hr.a.a().optInt("report_request_id", -1);
        }
        int i = optInt + 1;
        this.u = i;
        this.o.e = i;
        C0601ra a2 = a(this.j, list, config);
        this.d = a2;
        this.f = this.j.b;
        this.t.prepareAndSetPostData(MessageNano.toByteArray(a2));
        return true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
        this.t.onPerformRequest();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z) {
        String a;
        if (z) {
            a(false);
        } else if (this.s.getResponseCode() == 400) {
            a(true);
        }
        if (z) {
            for (int i = 0; i < this.j.a.size(); i++) {
                for (C0457ma c0457ma : ((C0515oa) this.j.a.get(i)).c) {
                    if (c0457ma != null && (a = AbstractC0494ni.a(c0457ma)) != null) {
                        this.l.info(a, new Object[0]);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        return this.t.isResponseValid();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(Throwable th) {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
        this.v = true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        this.v = true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskAdded() {
        ((C0165c6) this.a.p).d.set(false);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskFinished() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskRemoved() {
        ((C0165c6) this.a.p).d.set(true);
        if (this.v) {
            ((C0165c6) this.a.p).f();
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onUnsuccessfulTaskFinished() {
    }

    public Xj(P5 p5, Cj cj, Xc xc, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, E7 e7, PublicLogger publicLogger, Hr hr, RequestBodyEncrypter requestBodyEncrypter) {
        this(p5, publicLogger, e7, cj, hr, xc, new O3(1024000, "event value in ReportTask", publicLogger), R1.a(), fullUrlFormer, requestDataHolder, responseDataHolder, requestBodyEncrypter);
    }

    public Xj(@NonNull P5 p5, @NonNull Cj cj, @NonNull Xc xc, @NonNull FullUrlFormer<Nj> fullUrlFormer, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull RequestBodyEncrypter requestBodyEncrypter) {
        this(p5, cj, xc, fullUrlFormer, requestDataHolder, responseDataHolder, p5.j(), p5.q(), p5.v(), requestBodyEncrypter);
    }

    public static C0284ga[] a(JSONObject jSONObject) {
        int length = jSONObject.length();
        if (length <= 0) {
            return null;
        }
        C0284ga[] c0284gaArr = new C0284ga[length];
        Iterator<String> keys = jSONObject.keys();
        int i = 0;
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                C0284ga c0284ga = new C0284ga();
                c0284ga.a = next;
                c0284ga.b = jSONObject.getString(next);
                c0284gaArr[i] = c0284ga;
            } catch (Throwable unused) {
            }
            i++;
        }
        return c0284gaArr;
    }

    public final void a(boolean z) {
        boolean z2;
        Hr hr = this.m;
        int i = this.u;
        synchronized (hr) {
            Ir ir = hr.a;
            ir.a(ir.a().put("report_request_id", i));
        }
        C0515oa[] c0515oaArr = this.d.a;
        int i2 = 0;
        while (i2 < c0515oaArr.length) {
            try {
                C0515oa c0515oa = c0515oaArr[i2];
                long longValue = ((Long) this.f.get(i2)).longValue();
                Xn xn = (Xn) AbstractC0465mi.b.get(c0515oa.b.c);
                if (xn == null) {
                    xn = Xn.FOREGROUND;
                }
                z2 = z;
                try {
                    this.e.a(longValue, xn.a, c0515oa.c.length, z2);
                    AbstractC0465mi.a(c0515oa);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                z2 = z;
            }
            i2++;
            z = z2;
        }
        E7 e7 = this.e;
        long a = this.a.j.a();
        e7.b.lock();
        try {
            if (AbstractC0511o6.a.booleanValue()) {
                e7.c();
            }
            SQLiteDatabase writableDatabase = e7.c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.delete("sessions", AbstractC0453m6.c, new String[]{String.valueOf(a)});
            }
        } catch (Throwable unused3) {
        }
        e7.b.unlock();
    }

    public final C0601ra a(Wj wj, List list, Nj nj) {
        C0601ra c0601ra = new C0601ra();
        C0370ja c0370ja = new C0370ja();
        c0370ja.a = WrapUtils.getOrDefaultIfEmpty(this.c.b, nj.getUuid());
        c0370ja.b = WrapUtils.getOrDefaultIfEmpty(this.c.a, nj.getDeviceId());
        this.g = CodedOutputByteBufferNano.computeMessageSize(4, c0370ja) + this.g;
        c0601ra.b = c0370ja;
        C0675tq C = C0747wb.I.C();
        Uj uj = new Uj(this, c0601ra);
        synchronized (C) {
            C.a.a(uj);
        }
        c0601ra.a = (C0515oa[]) wj.a.toArray(new C0515oa[0]);
        c0601ra.c = a(wj.c);
        c0601ra.e = (String[]) list.toArray(new String[0]);
        Set set = nj.x;
        String[] strArr = (String[]) set.toArray(new String[0]);
        c0601ra.f = new byte[strArr.length][];
        for (int i = 0; i < set.size(); i++) {
            c0601ra.f[i] = StringUtils.getUTF8Bytes(strArr[i]);
        }
        return c0601ra;
    }

    public static C0447m0 a(ContentValues contentValues) {
        X7 model = new Y7(null, 1, null).toModel(contentValues);
        return new C0447m0((String) WrapUtils.getOrDefault(model.g.g, ""), ((Long) WrapUtils.getOrDefault(model.g.h, 0L)).longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006c A[Catch: all -> 0x009c, TryCatch #4 {all -> 0x009c, blocks: (B:12:0x0025, B:13:0x002b, B:15:0x0032, B:17:0x0038, B:29:0x006c, B:31:0x0072, B:71:0x0094, B:34:0x00a9, B:36:0x00b8, B:41:0x00c4, B:42:0x00c3, B:43:0x00be, B:44:0x00ca, B:47:0x00dc, B:58:0x00e3, B:75:0x00a1, B:57:0x00eb, B:82:0x0065, B:51:0x00f5, B:53:0x00fb), top: B:11:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00eb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Vj a(long j, C0486na c0486na, Nj nj, ArrayList arrayList, int i) {
        Cursor cursor;
        boolean z;
        Vj vj;
        C0457ma c0457ma;
        int i2;
        C0284ga[] a;
        V9 v9;
        C0169ca c0169ca;
        C0515oa c0515oa = new C0515oa();
        c0515oa.a = j;
        c0515oa.b = c0486na;
        Xn xn = (Xn) AbstractC0465mi.b.get(c0486na.c);
        if (xn == null) {
            xn = Xn.FOREGROUND;
        }
        try {
            cursor = a(j, xn);
            if (cursor != null) {
                try {
                    ArrayList arrayList2 = new ArrayList();
                    C0447m0 c0447m0 = null;
                    while (true) {
                        z = false;
                        if (!cursor.moveToNext() || this.h >= 100) {
                            break;
                        }
                        ContentValues contentValues = new ContentValues();
                        DBUtils.cursorRowToContentValues(cursor, contentValues);
                        try {
                            v9 = new V9(contentValues);
                            EnumC0603rc enumC0603rc = v9.h;
                            if (enumC0603rc != null) {
                                c0169ca = (C0169ca) AbstractC0465mi.d.get(enumC0603rc);
                            } else {
                                Map map = AbstractC0465mi.a;
                                c0169ca = null;
                            }
                            if (c0169ca == null) {
                                c0169ca = C0169ca.i;
                            }
                        } catch (Throwable th) {
                            th = th;
                        }
                        try {
                            c0457ma = c0169ca.a(v9, nj);
                        } catch (Throwable th2) {
                            th = th2;
                            arrayList.add(th);
                            c0457ma = null;
                            if (c0457ma == null) {
                            }
                            arrayList2.add(c0457ma);
                            this.h++;
                        }
                        if (c0457ma == null) {
                            C0447m0 a2 = a(contentValues);
                            if (c0447m0 == null) {
                                if (this.i < 0) {
                                    try {
                                        a = a(new JSONObject(a2.a));
                                    } catch (Throwable unused) {
                                    }
                                    if (a != null) {
                                        i2 = 0;
                                        for (C0284ga c0284ga : a) {
                                            i2 += CodedOutputByteBufferNano.computeMessageSize(7, c0284ga);
                                        }
                                        this.i = i2;
                                        this.g += i2;
                                    }
                                    i2 = 0;
                                    this.i = i2;
                                    this.g += i2;
                                }
                                c0447m0 = a2;
                            } else if (!c0447m0.equals(a2)) {
                                z = true;
                                break;
                            }
                            O3 o3 = this.k;
                            byte[] bArr = c0457ma.e;
                            o3.getClass();
                            byte[] a3 = o3.a(bArr);
                            byte[] bArr2 = c0457ma.e;
                            if (bArr2 != a3) {
                                c0457ma.i = ((bArr2 == null ? 0 : bArr2.length) - (a3 == null ? 0 : a3.length)) + c0457ma.i;
                                c0457ma.e = a3;
                            }
                            this.g += CodedOutputByteBufferNano.computeMessageSize(3, c0457ma);
                            if (arrayList2.isEmpty() && i == 0) {
                                if (this.g >= 1048576) {
                                    break;
                                }
                            } else if (this.g >= 250880) {
                                break;
                            }
                        }
                        arrayList2.add(c0457ma);
                        this.h++;
                    }
                    if (arrayList2.size() > 0) {
                        c0515oa.c = (C0457ma[]) arrayList2.toArray(new C0457ma[arrayList2.size()]);
                        vj = new Vj(c0515oa, c0447m0, z);
                        return vj;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        arrayList.add(th);
                        AbstractC0734vr.a(cursor);
                        return null;
                    } finally {
                        AbstractC0734vr.a(cursor);
                    }
                }
            }
            vj = null;
            return vj;
        } catch (Throwable th4) {
            th = th4;
            cursor = null;
        }
    }

    public final Cursor a() {
        Cursor cursor;
        SQLiteDatabase readableDatabase;
        E7 e7 = this.e;
        LinkedHashMap linkedHashMap = this.b;
        e7.a.lock();
        try {
            readableDatabase = e7.c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            cursor = readableDatabase.query("sessions", null, E7.a(linkedHashMap), E7.a(new String[]{Long.toString(0L)}, linkedHashMap), null, null, "id ASC", null);
            e7.a.unlock();
            return cursor;
        }
        cursor = null;
        e7.a.unlock();
        return cursor;
    }

    public final Cursor a(long j, Xn xn) {
        Cursor cursor;
        SQLiteDatabase readableDatabase;
        E7 e7 = this.e;
        e7.a.lock();
        try {
            readableDatabase = e7.c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            cursor = readableDatabase.query("events", null, "session_id = ? AND session_type = ?", new String[]{Long.toString(j), Integer.toString(xn.a)}, null, null, "number_in_session ASC", null);
            e7.a.unlock();
            return cursor;
        }
        cursor = null;
        e7.a.unlock();
        return cursor;
    }
}
