package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.os.ResultReceiver;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class H6 {

    /* renamed from: a, reason: collision with root package name */
    public final CounterConfigurationReporterType f4462a;

    public H6(CounterConfigurationReporterType counterConfigurationReporterType) {
        this.f4462a = counterConfigurationReporterType;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|2|3|(2:5|6)|(3:65|66|(9:68|(2:71|69)|72|9|10|11|(2:18|(8:21|7b|29|30|(4:33|(5:37|38|(1:40)(1:44)|41|42)|43|31)|47|48|(2:52|53)))|61|62))|8|9|10|11|(4:13|15|18|(2:21|7b))|61|62|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x005e, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final F6 a(SQLiteDatabase sQLiteDatabase, String str, int i2, String str2, boolean z2) {
        Throwable th;
        Cursor cursor;
        ArrayList<ContentValues> arrayList;
        C0593mj c0593mj;
        C0541kj c0541kj;
        M3 m3;
        Integer num;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            cursor = sQLiteDatabase.rawQuery("SELECT global_number, type, event_description FROM events WHERE " + str, null);
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            try {
                Qj qj = AbstractC0645oj.f6689a;
                qj.getClass();
                qj.a(new C0671pj("select_rows_to_delete_exception", th));
                AbstractC0572lo.a(cursor);
                arrayList = null;
                int i3 = sQLiteDatabase.delete("events", str, null);
                if (arrayList != null) {
                }
                return new F6(arrayList, i3);
            } finally {
                AbstractC0572lo.a(cursor);
            }
        }
        if (cursor != null) {
            try {
            } catch (Throwable th4) {
                th = th4;
                Qj qj2 = AbstractC0645oj.f6689a;
                qj2.getClass();
                qj2.a(new C0671pj("select_rows_to_delete_exception", th));
                AbstractC0572lo.a(cursor);
                arrayList = null;
                int i32 = sQLiteDatabase.delete("events", str, null);
                if (arrayList != null) {
                }
                return new F6(arrayList, i32);
            }
            if (cursor.getCount() > 0) {
                arrayList = new ArrayList(cursor.getCount());
                while (cursor.moveToNext()) {
                    ContentValues contentValues = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursor, contentValues);
                    arrayList.add(contentValues);
                }
                int i322 = sQLiteDatabase.delete("events", str, null);
                if (arrayList != null && arrayList.size() != 0 && i322 == arrayList.size() && z2) {
                    c0593mj = C0610na.f6575I.f6588f;
                    if (str2 != null && c0593mj != null) {
                        CounterConfigurationReporterType counterConfigurationReporterType = this.f4462a;
                        synchronized (c0593mj) {
                            c0541kj = (C0541kj) c0593mj.f6532c.get(str2);
                            if (c0541kj == null) {
                                c0541kj = new C0541kj(str2, c0593mj.f6531b, counterConfigurationReporterType, c0593mj.f6530a);
                                c0593mj.f6532c.put(str2, c0541kj);
                            }
                        }
                        try {
                            JSONObject jSONObject = new JSONObject();
                            JSONArray jSONArray = new JSONArray();
                            JSONArray jSONArray2 = new JSONArray();
                            for (ContentValues contentValues2 : arrayList) {
                                Integer asInteger = contentValues2.getAsInteger("global_number");
                                Integer asInteger2 = contentValues2.getAsInteger("type");
                                if (asInteger != null && asInteger2 != null) {
                                    jSONArray.put(asInteger);
                                    EnumC0301bb a2 = EnumC0301bb.a(asInteger2.intValue());
                                    if (a2 == null) {
                                        Map map = Pf.f4929a;
                                        num = null;
                                    } else {
                                        num = (Integer) Pf.f4931c.get(a2);
                                    }
                                    jSONArray2.put(num);
                                }
                            }
                            jSONObject.put("global_number", jSONArray).put("event_type", jSONArray2);
                            JSONObject put = new JSONObject().put("details", new JSONObject().put("reason", G6.a(i2)).put("cleared", jSONObject).put("actual_deleted_number", i322));
                            PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(str2);
                            String jSONObject2 = put.toString();
                            Set set = AbstractC0842w9.f7096a;
                            EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
                            m3 = new M3(jSONObject2, "", 12290, 0, orCreatePublicLogger);
                        } catch (Throwable unused) {
                            m3 = null;
                        }
                        if (m3 != null && c0541kj.f6397c != null) {
                            try {
                                CounterConfiguration counterConfiguration = new CounterConfiguration(c0541kj.f6395a);
                                counterConfiguration.setReporterType(c0541kj.f6397c);
                                ((B1) c0541kj.f6398d.f6629a).reportData(1, m3.d(new Fh(new Bf(c0541kj.f6396b, (ResultReceiver) null), counterConfiguration, new D8(new C0724rl(LoggerStorage.getOrCreatePublicLogger(c0541kj.f6395a), "Crash Environment")), null).c()));
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                }
                return new F6(arrayList, i322);
            }
        }
        arrayList = null;
        int i3222 = sQLiteDatabase.delete("events", str, null);
        if (arrayList != null) {
            c0593mj = C0610na.f6575I.f6588f;
            if (str2 != null) {
                CounterConfigurationReporterType counterConfigurationReporterType2 = this.f4462a;
                synchronized (c0593mj) {
                }
            }
        }
        return new F6(arrayList, i3222);
    }
}
