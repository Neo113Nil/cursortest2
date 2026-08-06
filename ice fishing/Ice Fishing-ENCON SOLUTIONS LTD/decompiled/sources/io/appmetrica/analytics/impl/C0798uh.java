package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
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
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.uh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0798uh implements UnderlyingNetworkTask {

    /* renamed from: a, reason: collision with root package name */
    public final X4 f6998a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f6999b;

    /* renamed from: c, reason: collision with root package name */
    public C0555l7 f7000c;

    /* renamed from: d, reason: collision with root package name */
    public C0505j9 f7001d;

    /* renamed from: e, reason: collision with root package name */
    public final L6 f7002e;

    /* renamed from: f, reason: collision with root package name */
    public List f7003f;

    /* renamed from: g, reason: collision with root package name */
    public int f7004g;

    /* renamed from: h, reason: collision with root package name */
    public int f7005h;

    /* renamed from: i, reason: collision with root package name */
    public int f7006i;

    /* renamed from: j, reason: collision with root package name */
    public C0772th f7007j;

    /* renamed from: k, reason: collision with root package name */
    public final Z2 f7008k;

    /* renamed from: l, reason: collision with root package name */
    public final PublicLogger f7009l;

    /* renamed from: m, reason: collision with root package name */
    public final C0883xo f7010m;

    /* renamed from: n, reason: collision with root package name */
    public final Ra f7011n;

    /* renamed from: o, reason: collision with root package name */
    public final Zg f7012o;

    /* renamed from: p, reason: collision with root package name */
    public final FullUrlFormer f7013p;

    /* renamed from: q, reason: collision with root package name */
    public final C0896yb f7014q;

    /* renamed from: r, reason: collision with root package name */
    public final RequestDataHolder f7015r;

    /* renamed from: s, reason: collision with root package name */
    public final ResponseDataHolder f7016s;
    public final SendingDataTaskHelper t;

    /* renamed from: u, reason: collision with root package name */
    public int f7017u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7018v;

    public C0798uh(X4 x4, Zg zg, C0896yb c0896yb, FullUrlFormer<C0539kh> fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, RequestBodyEncrypter requestBodyEncrypter) {
        this(x4, zg, c0896yb, fullUrlFormer, requestDataHolder, responseDataHolder, x4.i(), x4.p(), x4.u(), requestBodyEncrypter);
    }

    public final C0505j9 a(C0772th c0772th, List list, C0539kh c0539kh) {
        C0505j9 c0505j9 = new C0505j9();
        C0299b9 c0299b9 = new C0299b9();
        c0299b9.f5615a = WrapUtils.getOrDefaultIfEmpty(this.f7000c.f6425b, c0539kh.getUuid());
        c0299b9.f5616b = WrapUtils.getOrDefaultIfEmpty(this.f7000c.f6424a, c0539kh.getDeviceId());
        this.f7004g = CodedOutputByteBufferNano.computeMessageSize(4, c0299b9) + this.f7004g;
        c0505j9.f6262b = c0299b9;
        C0649on C2 = C0610na.f6575I.C();
        C0720rh c0720rh = new C0720rh(this, c0505j9);
        synchronized (C2) {
            C2.f6696a.a(c0720rh);
        }
        c0505j9.f6261a = (C0428g9[]) c0772th.f6950a.toArray(new C0428g9[0]);
        c0505j9.f6263c = a(c0772th.f6952c);
        c0505j9.f6265e = (String[]) list.toArray(new String[0]);
        Set set = c0539kh.f6394x;
        String[] strArr = (String[]) set.toArray(new String[0]);
        c0505j9.f6266f = new byte[strArr.length][];
        for (int i2 = 0; i2 < set.size(); i2++) {
            c0505j9.f6266f[i2] = StringUtils.getUTF8Bytes(strArr[i2]);
        }
        return c0505j9;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final String description() {
        return "ReportTask_" + ApiKeyUtils.createPartialApiKey(this.f6998a.f5347b.f4951b);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.f7013p;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RequestDataHolder getRequestDataHolder() {
        return this.f7015r;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final ResponseDataHolder getResponseDataHolder() {
        return this.f7016s;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((C0539kh) this.f6998a.f5356k.a()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final SSLSocketFactory getSslSocketFactory() {
        ((Al) C0610na.f6575I.z()).getClass();
        return null;
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
        L6 l6 = this.f6998a.f5350e;
        l6.getClass();
        ArrayList arrayList = new ArrayList();
        l6.f4673a.lock();
        try {
            SQLiteDatabase readableDatabase = l6.f4675c.getReadableDatabase();
            if (readableDatabase != null) {
                cursor = readableDatabase.rawQuery(AbstractC0786u5.f6970b, null);
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
                            AbstractC0572lo.a(cursor);
                            l6.f4673a.unlock();
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
        this.f6999b.clear();
        for (Map.Entry<String, Object> entry : contentValues2.valueSet()) {
            this.f6999b.put(entry.getKey(), entry.getValue().toString());
        }
        String asString = contentValues2.getAsString("report_request_parameters");
        if (TextUtils.isEmpty(asString)) {
            C0555l7 c0555l7 = new C0555l7();
            this.f7000c = c0555l7;
            this.f7012o.f5521c = c0555l7;
        } else {
            try {
                C0555l7 c0555l72 = new C0555l7(new C0404fb(asString));
                this.f7000c = c0555l72;
                this.f7012o.f5521c = c0555l72;
            } catch (Throwable unused3) {
                C0555l7 c0555l73 = new C0555l7();
                this.f7000c = c0555l73;
                this.f7012o.f5521c = c0555l73;
            }
        }
        C0539kh config = this.f7014q.getConfig();
        List list = config.f6393w;
        if (AbstractC0572lo.a((Collection) list)) {
            return false;
        }
        this.f7013p.setHosts(config.f6388q);
        if (!config.u() || AbstractC0572lo.a((Collection) this.f7013p.getAllHosts())) {
            this.f7018v = true;
            return false;
        }
        this.f7003f = null;
        C0772th a2 = a(config);
        this.f7007j = a2;
        if (a2.f6950a.isEmpty()) {
            return false;
        }
        C0883xo c0883xo = this.f7010m;
        synchronized (c0883xo) {
            optInt = c0883xo.f7214a.a().optInt("report_request_id", -1);
        }
        int i2 = optInt + 1;
        this.f7017u = i2;
        this.f7012o.f5523e = i2;
        C0505j9 a3 = a(this.f7007j, list, config);
        this.f7001d = a3;
        this.f7003f = this.f7007j.f6951b;
        this.t.prepareAndSetPostData(MessageNano.toByteArray(a3));
        return true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
        this.t.onPerformRequest();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z2) {
        String a2;
        if (z2) {
            a(false);
        } else if (this.f7016s.getResponseCode() == 400) {
            a(true);
        }
        if (z2) {
            for (int i2 = 0; i2 < this.f7007j.f6950a.size(); i2++) {
                for (C0376e9 c0376e9 : ((C0428g9) this.f7007j.f6950a.get(i2)).f6074c) {
                    if (c0376e9 != null && (a2 = Qf.a(c0376e9)) != null) {
                        this.f7009l.info(a2, new Object[0]);
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
        this.f7018v = true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        this.f7018v = true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskAdded() {
        ((C0527k5) this.f6998a.f5361p).f6349d.set(false);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskFinished() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskRemoved() {
        ((C0527k5) this.f6998a.f5361p).f6349d.set(true);
        if (this.f7018v) {
            ((C0527k5) this.f6998a.f5361p).f();
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onUnsuccessfulTaskFinished() {
    }

    public C0798uh(X4 x4, Zg zg, C0896yb c0896yb, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, L6 l6, PublicLogger publicLogger, C0883xo c0883xo, RequestBodyEncrypter requestBodyEncrypter) {
        this(x4, publicLogger, l6, zg, c0883xo, c0896yb, new Z2(1024000, "event value in ReportTask", publicLogger), AbstractC0860x1.a(), fullUrlFormer, requestDataHolder, responseDataHolder, requestBodyEncrypter);
    }

    public C0798uh(X4 x4, PublicLogger publicLogger, L6 l6, Zg zg, C0883xo c0883xo, C0896yb c0896yb, Z2 z2, Qj qj, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, RequestBodyEncrypter requestBodyEncrypter) {
        this.f6999b = new LinkedHashMap();
        this.f7004g = 0;
        this.f7005h = 0;
        this.f7006i = -1;
        this.f7018v = false;
        this.t = new SendingDataTaskHelper(requestBodyEncrypter, new GZIPCompressor(), requestDataHolder, responseDataHolder, new DefaultNetworkResponseHandler());
        this.f7012o = zg;
        this.f6998a = x4;
        this.f7002e = l6;
        this.f7009l = publicLogger;
        this.f7008k = z2;
        this.f7010m = c0883xo;
        this.f7014q = c0896yb;
        this.f7011n = qj;
        this.f7015r = requestDataHolder;
        this.f7016s = responseDataHolder;
        this.f7013p = fullUrlFormer;
    }

    public static Y8[] a(JSONObject jSONObject) {
        int length = jSONObject.length();
        if (length <= 0) {
            return null;
        }
        Y8[] y8Arr = new Y8[length];
        Iterator<String> keys = jSONObject.keys();
        int i2 = 0;
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                Y8 y8 = new Y8();
                y8.f5422a = next;
                y8.f5423b = jSONObject.getString(next);
                y8Arr[i2] = y8;
            } catch (Throwable unused) {
            }
            i2++;
        }
        return y8Arr;
    }

    public final void a(boolean z2) {
        C0883xo c0883xo = this.f7010m;
        int i2 = this.f7017u;
        synchronized (c0883xo) {
            C0909yo c0909yo = c0883xo.f7214a;
            c0909yo.a(c0909yo.a().put("report_request_id", i2));
        }
        C0428g9[] c0428g9Arr = this.f7001d.f6261a;
        for (int i3 = 0; i3 < c0428g9Arr.length; i3++) {
            try {
                C0428g9 c0428g9 = c0428g9Arr[i3];
                long longValue = ((Long) this.f7003f.get(i3)).longValue();
                Vk vk = (Vk) Pf.f4930b.get(c0428g9.f6073b.f5974c);
                if (vk == null) {
                    vk = Vk.FOREGROUND;
                }
                this.f7002e.a(longValue, vk.f5268a, c0428g9.f6074c.length, z2);
                Pf.a(c0428g9);
            } catch (Throwable unused) {
            }
        }
        L6 l6 = this.f7002e;
        long a2 = this.f6998a.f5355j.a();
        l6.f4674b.lock();
        try {
            if (AbstractC0838w5.f7091a.booleanValue()) {
                l6.c();
            }
            SQLiteDatabase writableDatabase = l6.f4675c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.delete("sessions", AbstractC0786u5.f6971c, new String[]{String.valueOf(a2)});
            }
        } catch (Throwable unused2) {
        }
        l6.f4674b.unlock();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ea A[LOOP:1: B:60:0x00e4->B:62:0x00ea, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0772th a(C0539kh c0539kh) {
        Iterator it;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList3 = new ArrayList();
        Cursor cursor = null;
        try {
            Cursor a2 = a();
            if (a2 != null) {
                JSONObject jSONObject2 = jSONObject;
                C0471i0 c0471i0 = null;
                while (a2.moveToNext() && this.f7005h < 100) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        DBUtils.cursorRowToContentValues(a2, contentValues);
                        C0736s7 model = new C0762t7(null, 1, null).toModel(contentValues);
                        Long l2 = model.f6883a;
                        if (l2 != null) {
                            C0710r7 c0710r7 = model.f6886d;
                            C0480i9 a3 = Pf.a(c0710r7.f6812a, c0710r7.f6813b, c0710r7.f6814c);
                            String locale = c0539kh.getLocale();
                            Vk vk = model.f6884b;
                            C0402f9 c0402f9 = new C0402f9();
                            c0402f9.f5972a = a3;
                            c0402f9.f5973b = locale;
                            if (vk != null) {
                                Integer num = (Integer) Pf.f4929a.get(vk);
                                c0402f9.f5974c = num != null ? num.intValue() : 0;
                            }
                            int computeUInt64Size = this.f7004g + CodedOutputByteBufferNano.computeUInt64Size(1, Long.MAX_VALUE);
                            this.f7004g = computeUInt64Size;
                            int computeMessageSize = computeUInt64Size + CodedOutputByteBufferNano.computeMessageSize(2, c0402f9);
                            this.f7004g = computeMessageSize;
                            if (computeMessageSize >= 250880) {
                                break;
                            }
                            C0746sh a4 = a(l2.longValue(), c0402f9, c0539kh, arrayList3, arrayList.size());
                            if (a4 == null) {
                                continue;
                            } else {
                                if (c0471i0 == null) {
                                    c0471i0 = a4.f6912b;
                                } else if (!c0471i0.equals(a4.f6912b)) {
                                    break;
                                }
                                arrayList2.add(l2);
                                arrayList.add(a4.f6911a);
                                if (!TextUtils.isEmpty(a4.f6912b.f6158a)) {
                                    try {
                                        jSONObject2 = new JSONObject(a4.f6912b.f6158a);
                                    } catch (Throwable unused) {
                                    }
                                }
                                if (a4.f6913c) {
                                    break;
                                }
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = a2;
                        jSONObject = jSONObject2;
                        try {
                            arrayList3.add(th);
                            it = arrayList3.iterator();
                            while (it.hasNext()) {
                            }
                            return new C0772th(arrayList, arrayList2, jSONObject);
                        } finally {
                            AbstractC0572lo.a(cursor);
                        }
                    }
                }
                jSONObject = jSONObject2;
            }
            AbstractC0572lo.a(a2);
        } catch (Throwable th2) {
            th = th2;
        }
        it = arrayList3.iterator();
        while (it.hasNext()) {
            this.f7011n.reportError("protobuf_serialization_error", (Throwable) it.next());
        }
        return new C0772th(arrayList, arrayList2, jSONObject);
    }

    public static C0471i0 a(ContentValues contentValues) {
        C0374e7 model = new C0400f7(null, 1, null).toModel(contentValues);
        return new C0471i0((String) WrapUtils.getOrDefault(model.f5874g.f5794g, ""), ((Long) WrapUtils.getOrDefault(model.f5874g.f5795h, 0L)).longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006c A[Catch: all -> 0x009b, TryCatch #4 {all -> 0x009b, blocks: (B:12:0x0026, B:13:0x002c, B:15:0x0033, B:17:0x0039, B:28:0x006c, B:30:0x0072, B:70:0x0093, B:33:0x00a7, B:35:0x00b6, B:40:0x00c2, B:41:0x00c1, B:42:0x00bc, B:43:0x00c8, B:46:0x00da, B:58:0x00e1, B:74:0x00a0, B:51:0x00f4, B:53:0x00fa, B:57:0x00ea, B:81:0x0066), top: B:11:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ea A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0746sh a(long j2, C0402f9 c0402f9, C0539kh c0539kh, ArrayList arrayList, int i2) {
        Cursor cursor;
        C0746sh c0746sh;
        C0376e9 c0376e9;
        int i3;
        Y8[] a2;
        N8 n8;
        U8 u8;
        boolean z2 = true;
        C0428g9 c0428g9 = new C0428g9();
        c0428g9.f6072a = j2;
        c0428g9.f6073b = c0402f9;
        Vk vk = (Vk) Pf.f4930b.get(c0402f9.f5974c);
        if (vk == null) {
            vk = Vk.FOREGROUND;
        }
        try {
            cursor = a(j2, vk);
            if (cursor != null) {
                try {
                    ArrayList arrayList2 = new ArrayList();
                    C0471i0 c0471i0 = null;
                    while (cursor.moveToNext() && this.f7005h < 100) {
                        ContentValues contentValues = new ContentValues();
                        DBUtils.cursorRowToContentValues(cursor, contentValues);
                        try {
                            n8 = new N8(contentValues);
                            EnumC0301bb enumC0301bb = n8.f4809h;
                            if (enumC0301bb != null) {
                                u8 = (U8) Pf.f4932d.get(enumC0301bb);
                            } else {
                                Map map = Pf.f4929a;
                                u8 = null;
                            }
                            if (u8 == null) {
                                u8 = U8.f5151i;
                            }
                        } catch (Throwable th) {
                            th = th;
                        }
                        try {
                            c0376e9 = u8.a(n8, c0539kh);
                        } catch (Throwable th2) {
                            th = th2;
                            arrayList.add(th);
                            c0376e9 = null;
                            if (c0376e9 == null) {
                            }
                            arrayList2.add(c0376e9);
                            this.f7005h++;
                        }
                        if (c0376e9 == null) {
                            C0471i0 a3 = a(contentValues);
                            if (c0471i0 == null) {
                                if (this.f7006i < 0) {
                                    try {
                                        a2 = a(new JSONObject(a3.f6158a));
                                    } catch (Throwable unused) {
                                    }
                                    if (a2 != null) {
                                        i3 = 0;
                                        for (Y8 y8 : a2) {
                                            i3 += CodedOutputByteBufferNano.computeMessageSize(7, y8);
                                        }
                                        this.f7006i = i3;
                                        this.f7004g += i3;
                                    }
                                    i3 = 0;
                                    this.f7006i = i3;
                                    this.f7004g += i3;
                                }
                                c0471i0 = a3;
                            } else if (!c0471i0.equals(a3)) {
                                break;
                            }
                            Z2 z22 = this.f7008k;
                            byte[] bArr = c0376e9.f5909e;
                            z22.getClass();
                            byte[] a4 = z22.a(bArr);
                            byte[] bArr2 = c0376e9.f5909e;
                            if (bArr2 != a4) {
                                c0376e9.f5913i = ((bArr2 == null ? 0 : bArr2.length) - (a4 == null ? 0 : a4.length)) + c0376e9.f5913i;
                                c0376e9.f5909e = a4;
                            }
                            this.f7004g += CodedOutputByteBufferNano.computeMessageSize(3, c0376e9);
                            if (arrayList2.isEmpty() && i2 == 0) {
                                if (this.f7004g >= 1048576) {
                                    break;
                                }
                            } else if (this.f7004g >= 250880) {
                                break;
                            }
                        }
                        arrayList2.add(c0376e9);
                        this.f7005h++;
                    }
                    z2 = false;
                    if (arrayList2.size() > 0) {
                        c0428g9.f6074c = (C0376e9[]) arrayList2.toArray(new C0376e9[arrayList2.size()]);
                        c0746sh = new C0746sh(c0428g9, c0471i0, z2);
                        return c0746sh;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        arrayList.add(th);
                        AbstractC0572lo.a(cursor);
                        return null;
                    } finally {
                        AbstractC0572lo.a(cursor);
                    }
                }
            }
            c0746sh = null;
            return c0746sh;
        } catch (Throwable th4) {
            th = th4;
            cursor = null;
        }
    }

    public final Cursor a() {
        Cursor cursor;
        SQLiteDatabase readableDatabase;
        L6 l6 = this.f7002e;
        LinkedHashMap linkedHashMap = this.f6999b;
        l6.f4673a.lock();
        try {
            readableDatabase = l6.f4675c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            cursor = readableDatabase.query("sessions", null, L6.a(linkedHashMap), L6.a(new String[]{Long.toString(0L)}, linkedHashMap), null, null, "id ASC", null);
            l6.f4673a.unlock();
            return cursor;
        }
        cursor = null;
        l6.f4673a.unlock();
        return cursor;
    }

    public final Cursor a(long j2, Vk vk) {
        Cursor cursor;
        SQLiteDatabase readableDatabase;
        L6 l6 = this.f7002e;
        l6.f4673a.lock();
        try {
            readableDatabase = l6.f4675c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            cursor = readableDatabase.query("events", null, "session_id = ? AND session_type = ?", new String[]{Long.toString(j2), Integer.toString(vk.f5268a)}, null, null, "number_in_session ASC", null);
            l6.f4673a.unlock();
            return cursor;
        }
        cursor = null;
        l6.f4673a.unlock();
        return cursor;
    }
}
