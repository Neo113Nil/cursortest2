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
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes9.dex */
public final class F7 {
    public final CounterConfigurationReporterType a;

    public F7(CounterConfigurationReporterType counterConfigurationReporterType) {
        this.a = counterConfigurationReporterType;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|2|3|(3:63|64|(9:66|(2:69|67)|70|6|7|8|(2:15|(8:18|7a|26|27|(4:30|(5:34|35|(1:37)(1:41)|38|39)|40|28)|44|45|(2:49|50)))|59|60))|5|6|7|8|(4:10|12|15|(2:18|7a))|59|60|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x005d, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final D7 a(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, int i, String str2, boolean z) {
        Cursor cursor;
        ArrayList<ContentValues> arrayList;
        Am am;
        C0890ym c0890ym;
        G4 g4;
        Integer num;
        try {
            cursor = sQLiteDatabase.query("events", new String[]{"global_number", "type", "event_description"}, str, strArr, null, null, null);
        } catch (Throwable th) {
            th = th;
            cursor = null;
        }
        if (cursor != null) {
            try {
            } catch (Throwable th2) {
                th = th2;
                try {
                    C0313en c0313en = Cm.a;
                    c0313en.getClass();
                    c0313en.a(new Dm("select_rows_to_delete_exception", th));
                    Or.a(cursor);
                    arrayList = null;
                    int i2 = sQLiteDatabase.delete("events", str, strArr);
                    if (arrayList != null) {
                    }
                    return new D7(arrayList, i2);
                } finally {
                    Or.a(cursor);
                }
            }
            if (cursor.getCount() > 0) {
                arrayList = new ArrayList(cursor.getCount());
                while (cursor.moveToNext()) {
                    ContentValues contentValues = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursor, contentValues);
                    arrayList.add(contentValues);
                }
                int i22 = sQLiteDatabase.delete("events", str, strArr);
                if (arrayList != null && arrayList.size() != 0 && i22 == arrayList.size() && z) {
                    am = Jb.I.f;
                    if (str2 != null && am != null) {
                        CounterConfigurationReporterType counterConfigurationReporterType = this.a;
                        synchronized (am) {
                            c0890ym = (C0890ym) am.c.get(str2);
                            if (c0890ym == null) {
                                c0890ym = new C0890ym(str2, am.b, counterConfigurationReporterType, am.a);
                                am.c.put(str2, c0890ym);
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
                                    Hc a = Hc.a(asInteger2.intValue());
                                    if (a == null) {
                                        Map map = Di.a;
                                        num = null;
                                    } else {
                                        num = (Integer) Di.c.get(a);
                                    }
                                    jSONArray2.put(num);
                                }
                            }
                            jSONObject.put("global_number", jSONArray).put("event_type", jSONArray2);
                            JSONObject put = new JSONObject().put("details", new JSONObject().put(CRLReasonCodeExtension.REASON, E7.a(i)).put("cleared", jSONObject).put("actual_deleted_number", i22));
                            PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(str2);
                            String jSONObject2 = put.toString();
                            Set set = La.a;
                            Hc hc = Hc.EVENT_TYPE_UNDEFINED;
                            g4 = new G4(jSONObject2, "", 12290, 0, orCreatePublicLogger);
                        } catch (Throwable unused) {
                            g4 = null;
                        }
                        if (g4 != null && c0890ym.c != null) {
                            try {
                                CounterConfiguration counterConfiguration = new CounterConfiguration(c0890ym.a);
                                counterConfiguration.setReporterType(c0890ym.c);
                                c0890ym.d.a.reportData(1, g4.d(new C0714sk(new C0597oi(c0890ym.b, (ResultReceiver) null), counterConfiguration, new R9(new Po(LoggerStorage.getOrCreatePublicLogger(c0890ym.a), "Crash Environment")), null).c()));
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                }
                return new D7(arrayList, i22);
            }
        }
        arrayList = null;
        int i222 = sQLiteDatabase.delete("events", str, strArr);
        if (arrayList != null) {
            am = Jb.I.f;
            if (str2 != null) {
                CounterConfigurationReporterType counterConfigurationReporterType2 = this.a;
                synchronized (am) {
                }
            }
        }
        return new D7(arrayList, i222);
    }
}
