package u7;

import android.util.Base64OutputStream;
import androidx.work.impl.WorkDatabase;
import com.onesignal.inAppMessages.internal.display.impl.a;
import d8.v;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6716a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6717b;

    public /* synthetic */ b(int i10, Object obj) {
        this.f6716a = i10;
        this.f6717b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String byteArrayOutputStream;
        switch (this.f6716a) {
            case 0:
                c cVar = (c) this.f6717b;
                synchronized (cVar) {
                    try {
                        v vVar = (v) cVar.f6718a.get();
                        ArrayList c3 = vVar.c();
                        vVar.b();
                        JSONArray jSONArray = new JSONArray();
                        for (int i10 = 0; i10 < c3.size(); i10++) {
                            a aVar = (a) c3.get(i10);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", aVar.f6714a);
                            jSONObject.put("dates", new JSONArray((Collection) aVar.f6715b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return byteArrayOutputStream;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                c cVar2 = (c) this.f6717b;
                synchronized (cVar2) {
                    ((v) cVar2.f6718a.get()).h(System.currentTimeMillis(), ((f8.b) cVar2.f6720c.get()).a());
                }
                return null;
            default:
                WorkDatabase workDatabase = ((y4.f) this.f6717b).f8748a;
                Long d10 = workDatabase.l().d("next_alarm_manager_id");
                int longValue = d10 != null ? (int) d10.longValue() : 0;
                workDatabase.l().e(new x4.d("next_alarm_manager_id", Long.valueOf(longValue != Integer.MAX_VALUE ? longValue + 1 : 0)));
                return Integer.valueOf(longValue);
        }
    }
}
