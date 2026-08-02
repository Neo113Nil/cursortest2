package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import defpackage.c6w;
import defpackage.d6w;
import defpackage.gw00;
import defpackage.tcc;
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
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* renamed from: io.appmetrica.analytics.impl.gk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0368gk implements UnderlyingNetworkTask {
    public final S5 a;
    public C0414i8 c;
    public final C0397hk d;
    public C0395hi e;
    public final Lj f;
    public final PublicLogger g;
    public final Mj h;
    public final FullUrlFormer i;
    public final C0563nd j;
    public final RequestDataHolder k;
    public final ResponseDataHolder l;
    public final SendingDataTaskHelper m;
    public int n;
    public final LinkedHashMap b = new LinkedHashMap();
    public boolean o = false;

    public C0368gk(S5 s5, Mj mj, C0563nd c0563nd, FullUrlFormer<Xj> fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, RequestBodyEncrypter requestBodyEncrypter) {
        this.m = new SendingDataTaskHelper(requestBodyEncrypter, new GZIPCompressor(), requestDataHolder, responseDataHolder, new DefaultNetworkResponseHandler());
        this.h = mj;
        this.a = s5;
        C0397hk c0397hk = new C0397hk(s5);
        this.d = c0397hk;
        PublicLogger q = s5.q();
        this.g = q;
        this.j = c0563nd;
        this.k = requestDataHolder;
        this.l = responseDataHolder;
        this.i = fullUrlFormer;
        this.f = new Lj(c0397hk, new R3(1024000, "event value in ReportTask", q), R1.a(), Jb.k().C());
    }

    public final void a(boolean z) {
        int i;
        C0397hk c0397hk = this.d;
        C0395hi c0395hi = this.e;
        C0791va[] c0791vaArr = c0395hi.a.a;
        List list = c0395hi.b;
        int i2 = this.n;
        as asVar = c0397hk.c;
        synchronized (asVar) {
            JSONObject a = asVar.a.a();
            if (a.optInt("report_request_id", -1) != i2) {
                asVar.a.a(a.put("report_request_id", i2));
            }
            bs bsVar = asVar.a;
            bs.a(bsVar.a);
            bs.a(bsVar.b);
        }
        ArrayList arrayList = new ArrayList(c0791vaArr.length);
        int length = c0791vaArr.length;
        char c = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            Long l = null;
            if (i3 >= length) {
                break;
            }
            C0791va c0791va = c0791vaArr[i3];
            int i5 = i4 + 1;
            long longValue = ((Number) list.get(i4)).longValue();
            EnumC0718so enumC0718so = (EnumC0718so) Di.b.get(c0791va.b.c);
            if (enumC0718so == null) {
                enumC0718so = EnumC0718so.FOREGROUND;
            }
            C0733ta[] c0733taArr = c0791va.c;
            if (c0733taArr.length == 0) {
                i = i3;
            } else {
                i = i3;
                Long valueOf = Long.valueOf(c0733taArr[c].a);
                c6w it = new d6w(1, c0733taArr.length - 1, 1).iterator();
                l = valueOf;
                while (it.c) {
                    List list2 = list;
                    C0791va[] c0791vaArr2 = c0791vaArr;
                    Long valueOf2 = Long.valueOf(c0733taArr[it.nextInt()].a);
                    if (l.compareTo(valueOf2) < 0) {
                        l = valueOf2;
                    }
                    c0791vaArr = c0791vaArr2;
                    list = list2;
                }
            }
            List list3 = list;
            C0791va[] c0791vaArr3 = c0791vaArr;
            long longValue2 = l != null ? l.longValue() : 0L;
            C0733ta[] c0733taArr2 = c0791va.c;
            if (c0733taArr2 != null) {
                for (C0733ta c0733ta : c0733taArr2) {
                }
            }
            arrayList.add(new C0228bo(longValue, enumC0718so.a, longValue2, z));
            i3 = i + 1;
            c0791vaArr = c0791vaArr3;
            i4 = i5;
            list = list3;
            c = 0;
        }
        I7 i7 = c0397hk.a;
        long a2 = c0397hk.b.a();
        i7.getClass();
        ArrayList arrayList2 = new ArrayList();
        String format = String.format(Locale.US, "%1$s = ? AND %2$s = ? AND %3$s <= ?", "session_id", "session_type", "number_in_session");
        i7.b.lock();
        try {
            SQLiteDatabase writableDatabase = i7.c.getWritableDatabase();
            if (writableDatabase != null) {
                if (AbstractC0671r6.a.booleanValue()) {
                    i7.c();
                }
                writableDatabase.beginTransaction();
                try {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(i7.a(writableDatabase, format, (C0228bo) it2.next()));
                    }
                    writableDatabase.delete("sessions", AbstractC0614p6.c, new String[]{String.valueOf(a2)});
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
        } catch (Throwable unused) {
        }
        i7.b.unlock();
        Iterator it3 = arrayList2.iterator();
        int i6 = 0;
        while (it3.hasNext()) {
            D7 d7 = (D7) it3.next();
            if (d7.a != null) {
                ArrayList arrayList3 = new ArrayList();
                Iterator it4 = d7.a.iterator();
                while (it4.hasNext()) {
                    Integer asInteger = ((ContentValues) it4.next()).getAsInteger("type");
                    asInteger.getClass();
                    arrayList3.add(asInteger);
                }
                Iterator it5 = i7.g.iterator();
                while (it5.hasNext()) {
                    ((InterfaceC0387ha) it5.next()).b(arrayList3);
                }
                List list4 = d7.a;
                for (int i8 = 0; i8 < list4.size(); i8++) {
                    ContentValues contentValues = (ContentValues) list4.get(i8);
                    Integer asInteger2 = contentValues.getAsInteger("type");
                    if (La.d.contains(Hc.a(asInteger2 != null ? asInteger2.intValue() : -1))) {
                        C0212b8 model = new C0241c8(null, 1, null).toModel(contentValues);
                        PublicLogger publicLogger = i7.e.m;
                        Hc hc = model.d;
                        C0183a8 c0183a8 = model.g;
                        publicLogger.info(Ei.a("Event removed from db", hc, c0183a8.b, c0183a8.c), new Object[0]);
                    }
                }
            }
            i6 += d7.b;
        }
        i7.f.addAndGet(-i6);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final String description() {
        return "ReportTask_" + ApiKeyUtils.createPartialApiKey(this.a.b.b);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.i;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RequestDataHolder getRequestDataHolder() {
        return this.k;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final ResponseDataHolder getResponseDataHolder() {
        return this.l;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((Xj) this.a.k.a()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final SSLSocketFactory getSslSocketFactory() {
        return Jb.I.z().getSslSocketFactory();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0407 A[EDGE_INSN: B:157:0x0407->B:109:0x0407 BREAK  A[LOOP:4: B:89:0x0340->B:102:0x03b8], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021a A[LOOP:3: B:79:0x0214->B:81:0x021a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0346  */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.util.Map] */
    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onCreateTask() {
        Cursor cursor;
        ContentValues contentValues;
        int i;
        C0414i8 c0414i8;
        int i2;
        int d;
        LinkedHashMap linkedHashMap;
        Cursor cursor2;
        SQLiteDatabase readableDatabase;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList;
        Iterator it;
        JSONObject jSONObject;
        ArrayList arrayList2;
        JSONObject jSONObject2;
        int i3;
        C0560na[] c0560naArr;
        C0395hi c0395hi;
        C0860xl c0860xl;
        I7 i7 = this.d.a;
        i7.getClass();
        ArrayList arrayList3 = new ArrayList();
        i7.a.lock();
        try {
            SQLiteDatabase readableDatabase2 = i7.c.getReadableDatabase();
            if (readableDatabase2 != null) {
                cursor = readableDatabase2.rawQuery(AbstractC0614p6.b, null);
                while (cursor.moveToNext()) {
                    try {
                        ContentValues contentValues2 = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(cursor, contentValues2);
                        arrayList3.add(contentValues2);
                    } catch (Throwable unused) {
                        try {
                            arrayList3 = new ArrayList();
                            contentValues = (ContentValues) kotlin.collections.a.R(arrayList3);
                            if (contentValues != null) {
                            }
                        } finally {
                            Or.a(cursor);
                            i7.a.unlock();
                        }
                    }
                }
            } else {
                cursor = null;
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        contentValues = (ContentValues) kotlin.collections.a.R(arrayList3);
        if (contentValues != null) {
            return false;
        }
        this.b.clear();
        for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
            this.b.put(entry.getKey(), entry.getValue().toString());
        }
        String asString = contentValues.getAsString("report_request_parameters");
        if (TextUtils.isEmpty(asString)) {
            C0414i8 c0414i82 = new C0414i8();
            this.c = c0414i82;
            this.h.c = c0414i82;
        } else {
            try {
                C0414i8 c0414i83 = new C0414i8(new Uc(asString));
                this.c = c0414i83;
                this.h.c = c0414i83;
            } catch (Throwable unused3) {
                C0414i8 c0414i84 = new C0414i8();
                this.c = c0414i84;
                this.h.c = c0414i84;
            }
        }
        Xj config = this.j.getConfig();
        List list = config.w;
        if (Or.a((Collection) list)) {
            return false;
        }
        this.i.setHosts(config.q);
        if (!config.v() || Or.a((Collection) this.i.getAllHosts())) {
            this.o = true;
            return false;
        }
        C0414i8 c0414i85 = this.c;
        if (c0414i85 == null) {
            c0414i85 = new C0414i8();
        }
        C0414i8 c0414i86 = c0414i85;
        Lj lj = this.f;
        LinkedHashMap linkedHashMap3 = this.b;
        C0339fk c0339fk = lj.b;
        c0339fk.getClass();
        ArrayList arrayList4 = new ArrayList();
        int i4 = 100;
        try {
            i2 = 0;
            for (C0616p8 c0616p8 : c0339fk.a.a(linkedHashMap3)) {
                try {
                    if (arrayList4.size() >= i4) {
                        break;
                    }
                    Long l = c0616p8.a;
                    if (l != null) {
                        C0587o8 c0587o8 = c0616p8.d;
                        Long l2 = c0587o8.a;
                        i = i4;
                        try {
                            Long l3 = c0587o8.b;
                            Boolean bool = c0587o8.c;
                            Map map = Di.a;
                            C0849xa c0849xa = new C0849xa();
                            if (l2 != null) {
                                c0414i8 = c0414i86;
                                try {
                                    c0849xa.a = l2.longValue();
                                    c0849xa.b = ((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(l2.longValue() * 1000) / 1000;
                                } catch (Throwable th) {
                                    th = th;
                                    c0339fk.b.reportError("protobuf_serialization_error", th);
                                    Pair pair = new Pair(arrayList4, Integer.valueOf(i2));
                                    List<C0310ek> list2 = (List) pair.getFirst();
                                    int intValue = ((Number) pair.getSecond()).intValue();
                                    d = gw00.d(tcc.n(list2, 10));
                                    if (d < 16) {
                                    }
                                    linkedHashMap = new LinkedHashMap(d);
                                    while (r0.hasNext()) {
                                    }
                                    I7 i72 = c0339fk.a.a;
                                    i72.getClass();
                                    if (linkedHashMap.isEmpty()) {
                                    }
                                    if (cursor2 == null) {
                                    }
                                    JSONObject jSONObject3 = new JSONObject();
                                    arrayList = new ArrayList();
                                    ArrayList arrayList5 = new ArrayList();
                                    it = list2.iterator();
                                    int i5 = intValue;
                                    int i6 = 0;
                                    Integer num = null;
                                    C0579o0 c0579o0 = null;
                                    JSONObject jSONObject4 = jSONObject3;
                                    while (it.hasNext()) {
                                    }
                                    jSONObject = jSONObject4;
                                    arrayList2 = arrayList5;
                                    jSONObject2 = jSONObject;
                                    if (arrayList.isEmpty()) {
                                    }
                                    this.e = c0395hi;
                                    if (c0395hi == null) {
                                    }
                                }
                            } else {
                                c0414i8 = c0414i86;
                            }
                            if (l3 != null) {
                                c0849xa.c = l3.longValue();
                            }
                            if (bool != null) {
                                c0849xa.d = bool.booleanValue();
                            }
                            String locale = config.getLocale();
                            EnumC0718so enumC0718so = c0616p8.b;
                            C0762ua c0762ua = new C0762ua();
                            c0762ua.a = c0849xa;
                            c0762ua.b = locale;
                            if (enumC0718so != null) {
                                Integer num2 = (Integer) Di.a.get(enumC0718so);
                                c0762ua.c = num2 != null ? num2.intValue() : 0;
                            }
                            i2 = i2 + CodedOutputByteBufferNano.computeUInt64Size(1, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) + CodedOutputByteBufferNano.computeMessageSize(2, c0762ua);
                            if (i2 >= 250880) {
                                break;
                            }
                            EnumC0718so enumC0718so2 = (EnumC0718so) Di.b.get(c0762ua.c);
                            if (enumC0718so2 == null) {
                                enumC0718so2 = EnumC0718so.FOREGROUND;
                            }
                            arrayList4.add(new C0310ek(l.longValue(), c0762ua, enumC0718so2.a));
                            i4 = i;
                            c0414i86 = c0414i8;
                        } catch (Throwable th2) {
                            th = th2;
                            c0414i8 = c0414i86;
                            c0339fk.b.reportError("protobuf_serialization_error", th);
                            Pair pair2 = new Pair(arrayList4, Integer.valueOf(i2));
                            List<C0310ek> list22 = (List) pair2.getFirst();
                            int intValue2 = ((Number) pair2.getSecond()).intValue();
                            d = gw00.d(tcc.n(list22, 10));
                            if (d < 16) {
                            }
                            linkedHashMap = new LinkedHashMap(d);
                            while (r0.hasNext()) {
                            }
                            I7 i722 = c0339fk.a.a;
                            i722.getClass();
                            if (linkedHashMap.isEmpty()) {
                            }
                            if (cursor2 == null) {
                            }
                            JSONObject jSONObject32 = new JSONObject();
                            arrayList = new ArrayList();
                            ArrayList arrayList52 = new ArrayList();
                            it = list22.iterator();
                            int i52 = intValue2;
                            int i62 = 0;
                            Integer num3 = null;
                            C0579o0 c0579o02 = null;
                            JSONObject jSONObject42 = jSONObject32;
                            while (it.hasNext()) {
                            }
                            jSONObject = jSONObject42;
                            arrayList2 = arrayList52;
                            jSONObject2 = jSONObject;
                            if (arrayList.isEmpty()) {
                            }
                            this.e = c0395hi;
                            if (c0395hi == null) {
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    i = i4;
                }
            }
            i = i4;
            c0414i8 = c0414i86;
        } catch (Throwable th4) {
            th = th4;
            i = 100;
            c0414i8 = c0414i86;
            i2 = 0;
        }
        Pair pair22 = new Pair(arrayList4, Integer.valueOf(i2));
        List<C0310ek> list222 = (List) pair22.getFirst();
        int intValue22 = ((Number) pair22.getSecond()).intValue();
        d = gw00.d(tcc.n(list222, 10));
        if (d < 16) {
            d = 16;
        }
        linkedHashMap = new LinkedHashMap(d);
        for (C0310ek c0310ek : list222) {
            Pair pair3 = new Pair(Long.valueOf(c0310ek.a), Integer.valueOf(c0310ek.c));
            linkedHashMap.put(pair3.c(), pair3.f());
        }
        I7 i7222 = c0339fk.a.a;
        i7222.getClass();
        if (linkedHashMap.isEmpty()) {
            cursor2 = null;
        } else {
            i7222.a.lock();
            try {
                readableDatabase = i7222.c.getReadableDatabase();
            } catch (Throwable unused4) {
            }
            if (readableDatabase != null) {
                StringBuilder sb = new StringBuilder();
                String[] strArr = new String[linkedHashMap.size() * 2];
                int i8 = 0;
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    if (i8 > 0) {
                        sb.append(" OR ");
                    }
                    sb.append(Extension.O_BRAKE);
                    sb.append("session_id");
                    sb.append(" = ? AND ");
                    sb.append("session_type");
                    sb.append(" = ?)");
                    int i9 = i8 * 2;
                    strArr[i9] = Long.toString(((Long) entry2.getKey()).longValue());
                    strArr[i9 + 1] = Integer.toString(((Integer) entry2.getValue()).intValue());
                    i8++;
                }
                cursor2 = readableDatabase.query("events", null, sb.toString(), strArr, null, null, "session_id ASC, number_in_session ASC", String.valueOf(i));
                i7222.a.unlock();
            }
            cursor2 = null;
            i7222.a.unlock();
        }
        if (cursor2 == null) {
            linkedHashMap2 = kotlin.collections.b.f();
        } else {
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            while (cursor2.moveToNext()) {
                try {
                    try {
                        ContentValues contentValues3 = new ContentValues();
                        DBUtils.cursorRowToContentValues(cursor2, contentValues3);
                        Long asLong = contentValues3.getAsLong("session_id");
                        Object obj = linkedHashMap4.get(asLong);
                        if (obj == null) {
                            obj = new ArrayList();
                            linkedHashMap4.put(asLong, obj);
                        }
                        ((List) obj).add(contentValues3);
                    } catch (Throwable unused5) {
                    }
                } finally {
                }
            }
            cursor2.close();
            linkedHashMap2 = linkedHashMap4;
        }
        JSONObject jSONObject322 = new JSONObject();
        arrayList = new ArrayList();
        ArrayList arrayList522 = new ArrayList();
        it = list222.iterator();
        int i522 = intValue22;
        int i622 = 0;
        Integer num32 = null;
        C0579o0 c0579o022 = null;
        JSONObject jSONObject422 = jSONObject322;
        while (it.hasNext()) {
            C0310ek c0310ek2 = (C0310ek) it.next();
            Iterator it2 = it;
            if (i622 >= i) {
                break;
            }
            C0339fk c0339fk2 = c0339fk;
            C0632po c0632po = c0339fk2.c;
            jSONObject = jSONObject422;
            long j = c0310ek2.a;
            C0762ua c0762ua2 = c0310ek2.b;
            List list3 = (List) linkedHashMap2.get(Long.valueOf(j));
            if (list3 == null) {
                list3 = EmptyList.a;
            }
            C0579o0 c0579o03 = c0579o022;
            int size = arrayList.size();
            Ej ej = new Ej(i522, i622, num32);
            c0632po.getClass();
            int i10 = i622;
            LinkedHashMap linkedHashMap5 = linkedHashMap2;
            Integer num4 = num32;
            arrayList2 = arrayList522;
            int i11 = i522;
            try {
                c0860xl = c0632po.a(j, c0762ua2, list3, config, size, ej);
            } catch (Throwable th5) {
                c0632po.b.reportError("protobuf_serialization_error", th5);
                c0860xl = null;
            }
            if (c0860xl != null) {
                i522 = c0860xl.d;
                i622 = c0860xl.e;
                num32 = c0860xl.f;
                if (c0579o03 != null && !c0579o03.equals(c0860xl.b)) {
                    break;
                }
                c0579o022 = c0860xl.b;
                arrayList2.add(Long.valueOf(c0310ek2.a));
                arrayList.add(c0860xl.a);
                C0579o0 c0579o04 = c0860xl.b;
                String str = c0579o04 != null ? c0579o04.a : null;
                if (str != null && str.length() != 0) {
                    try {
                        jSONObject2 = new JSONObject(str);
                    } catch (Throwable unused6) {
                    }
                    if (!c0860xl.c) {
                        break;
                    }
                    arrayList522 = arrayList2;
                    jSONObject422 = jSONObject2;
                    it = it2;
                    c0339fk = c0339fk2;
                }
                jSONObject2 = jSONObject;
                if (!c0860xl.c) {
                }
            } else {
                c0579o022 = c0579o03;
                arrayList522 = arrayList2;
                num32 = num4;
                it = it2;
                jSONObject422 = jSONObject;
                i622 = i10;
                c0339fk = c0339fk2;
                i522 = i11;
            }
            linkedHashMap2 = linkedHashMap5;
            i = 100;
        }
        jSONObject = jSONObject422;
        arrayList2 = arrayList522;
        jSONObject2 = jSONObject;
        if (arrayList.isEmpty()) {
            c0395hi = null;
        } else {
            Kj kj = lj.c;
            kj.getClass();
            C0878ya c0878ya = new C0878ya();
            C0647qa c0647qa = new C0647qa();
            C0414i8 c0414i87 = c0414i8;
            c0647qa.a = WrapUtils.getOrDefaultIfEmpty(c0414i87.b, config.getUuid());
            c0647qa.b = WrapUtils.getOrDefaultIfEmpty(c0414i87.a, config.getDeviceId());
            c0878ya.b = c0647qa;
            Kq kq = kj.a;
            Jj jj = new Jj(c0878ya);
            synchronized (kq) {
                kq.a.a(jj);
            }
            c0878ya.a = (C0791va[]) arrayList.toArray(new C0791va[0]);
            int length = jSONObject2.length();
            if (length <= 0) {
                c0560naArr = null;
                i3 = 0;
            } else {
                ArrayList arrayList6 = new ArrayList(length);
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        C0560na c0560na = new C0560na();
                        c0560na.a = next;
                        c0560na.b = jSONObject2.getString(next);
                        arrayList6.add(c0560na);
                    } catch (Throwable unused7) {
                    }
                }
                i3 = 0;
                c0560naArr = (C0560na[]) arrayList6.toArray(new C0560na[0]);
            }
            c0878ya.c = c0560naArr;
            c0878ya.e = (String[]) list.toArray(new String[i3]);
            String[] strArr2 = (String[]) config.x.toArray(new String[i3]);
            int length2 = strArr2.length;
            byte[][] bArr = new byte[length2][];
            for (int i12 = 0; i12 < length2; i12++) {
                bArr[i12] = StringUtils.getUTF8Bytes(strArr2[i12]);
            }
            c0878ya.f = bArr;
            c0395hi = new C0395hi(c0878ya, arrayList2, lj.a.a());
        }
        this.e = c0395hi;
        if (c0395hi == null) {
            return false;
        }
        int i13 = c0395hi.c;
        this.n = i13;
        this.h.e = i13;
        this.m.prepareAndSetPostData(MessageNano.toByteArray(c0395hi.a));
        return true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
        this.m.onPerformRequest();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z) {
        String a;
        if (z) {
            a(false);
        } else if (this.l.getResponseCode() == 400) {
            a(true);
        }
        if (z) {
            for (C0791va c0791va : this.e.a.a) {
                for (C0733ta c0733ta : c0791va.c) {
                    if (c0733ta != null && (a = Ei.a(c0733ta)) != null) {
                        this.g.info(a, new Object[0]);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        return this.m.isResponseValid();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(Throwable th) {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
        this.o = true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        this.o = true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskAdded() {
        ((C0325f6) this.a.p).d.set(false);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskFinished() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskRemoved() {
        ((C0325f6) this.a.p).d.set(true);
        if (this.o) {
            ((C0325f6) this.a.p).f();
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onUnsuccessfulTaskFinished() {
    }
}
