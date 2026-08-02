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

/* loaded from: classes5.dex */
public final class A7 {
    public final CounterConfigurationReporterType a;

    public A7(CounterConfigurationReporterType counterConfigurationReporterType) {
        this.a = counterConfigurationReporterType;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:2|3)|(3:63|64|(9:66|(2:69|67)|70|6|7|8|(2:15|(8:18|76|26|27|(4:30|(5:34|35|(1:37)(1:41)|38|39)|40|28)|44|45|(2:49|50)))|59|60))|5|6|7|8|(4:10|12|15|(2:18|76))|59|60|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0059, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0800y7 a(SQLiteDatabase sQLiteDatabase, String str, int i, String str2, boolean z) {
        Cursor cursor;
        ArrayList<ContentValues> arrayList;
        C0411km c0411km;
        C0353im c0353im;
        C4 c4;
        Integer num;
        try {
            cursor = sQLiteDatabase.rawQuery("SELECT global_number, type, event_description FROM events WHERE " + str, null);
        } catch (Throwable th) {
            th = th;
            cursor = null;
        }
        if (cursor != null) {
            try {
            } catch (Throwable th2) {
                th = th2;
                try {
                    Om om = AbstractC0469mm.a;
                    om.getClass();
                    om.a(new C0498nm("select_rows_to_delete_exception", th));
                    AbstractC0734vr.a(cursor);
                    arrayList = null;
                    int i2 = sQLiteDatabase.delete("events", str, null);
                    if (arrayList != null) {
                    }
                    return new C0800y7(arrayList, i2);
                } finally {
                    AbstractC0734vr.a(cursor);
                }
            }
            if (cursor.getCount() > 0) {
                arrayList = new ArrayList(cursor.getCount());
                while (cursor.moveToNext()) {
                    ContentValues contentValues = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursor, contentValues);
                    arrayList.add(contentValues);
                }
                int i22 = sQLiteDatabase.delete("events", str, null);
                if (arrayList != null && arrayList.size() != 0 && i22 == arrayList.size() && z) {
                    c0411km = C0747wb.I.f;
                    if (str2 != null && c0411km != null) {
                        CounterConfigurationReporterType counterConfigurationReporterType = this.a;
                        synchronized (c0411km) {
                            c0353im = (C0353im) c0411km.c.get(str2);
                            if (c0353im == null) {
                                c0353im = new C0353im(str2, c0411km.b, counterConfigurationReporterType, c0411km.a);
                                c0411km.c.put(str2, c0353im);
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
                                    EnumC0603rc a = EnumC0603rc.a(asInteger2.intValue());
                                    if (a == null) {
                                        Map map = AbstractC0465mi.a;
                                        num = null;
                                    } else {
                                        num = (Integer) AbstractC0465mi.c.get(a);
                                    }
                                    jSONArray2.put(num);
                                }
                            }
                            jSONObject.put("global_number", jSONArray).put("event_type", jSONArray2);
                            JSONObject put = new JSONObject().put("details", new JSONObject().put("reason", AbstractC0828z7.a(i)).put("cleared", jSONObject).put("actual_deleted_number", i22));
                            PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(str2);
                            String jSONObject2 = put.toString();
                            Set set = Ea.a;
                            EnumC0603rc enumC0603rc = EnumC0603rc.EVENT_TYPE_UNDEFINED;
                            c4 = new C4(jSONObject2, "", 12290, 0, orCreatePublicLogger);
                        } catch (Throwable unused) {
                            c4 = null;
                        }
                        if (c4 != null && c0353im.c != null) {
                            try {
                                CounterConfiguration counterConfiguration = new CounterConfiguration(c0353im.a);
                                counterConfiguration.setReporterType(c0353im.c);
                                c0353im.d.a.reportData(1, c4.d(new C0351ik(new Xh(c0353im.b, (ResultReceiver) null), counterConfiguration, new L9(new C0702uo(LoggerStorage.getOrCreatePublicLogger(c0353im.a), "Crash Environment")), null).c()));
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                }
                return new C0800y7(arrayList, i22);
            }
        }
        arrayList = null;
        int i222 = sQLiteDatabase.delete("events", str, null);
        if (arrayList != null) {
            c0411km = C0747wb.I.f;
            if (str2 != null) {
                CounterConfigurationReporterType counterConfigurationReporterType2 = this.a;
                synchronized (c0411km) {
                }
            }
        }
        return new C0800y7(arrayList, i222);
    }
}
