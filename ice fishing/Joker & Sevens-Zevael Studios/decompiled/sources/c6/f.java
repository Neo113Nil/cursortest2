package c6;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import bc.o;
import com.google.firebase.messaging.FirebaseMessaging;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import d8.b0;
import d8.e0;
import d8.g0;
import d8.s;
import d8.t;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import l7.r;
import m0.d1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements e6.b, g7.e, g7.c, l7.e, h4.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1249g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1250h;

    public /* synthetic */ f(int i10, Object obj) {
        this.f1249g = i10;
        this.f1250h = obj;
    }

    @Override // e6.b
    public Object a() {
        SQLiteDatabase a6;
        int i10 = this.f1249g;
        int i11 = 0;
        Object obj = this.f1250h;
        switch (i10) {
            case 0:
                d6.j jVar = (d6.j) ((d6.c) obj);
                jVar.getClass();
                int i12 = z5.a.f9134e;
                s sVar = new s();
                sVar.f1813h = null;
                sVar.f1814i = new ArrayList();
                sVar.f1815j = null;
                sVar.f1812g = "";
                HashMap hashMap = new HashMap();
                a6 = jVar.a();
                a6.beginTransaction();
                try {
                    z5.a aVar = (z5.a) d6.j.k(a6.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new b6.b(jVar, hashMap, sVar, 3));
                    a6.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                d6.j jVar2 = (d6.j) ((d6.d) obj);
                long a8 = jVar2.f1703h.a() - jVar2.f1705j.f1689d;
                a6 = jVar2.a();
                a6.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(a8)};
                    Cursor rawQuery = a6.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        try {
                            jVar2.g(rawQuery.getInt(0), z5.c.MESSAGE_TOO_OLD, rawQuery.getString(1));
                        } catch (Throwable th) {
                            rawQuery.close();
                            throw th;
                        }
                    }
                    rawQuery.close();
                    int delete = a6.delete("events", "timestamp_ms < ?", strArr);
                    a6.setTransactionSuccessful();
                    a6.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                d6.j jVar3 = (d6.j) ((d6.c) ((l) obj).f1276i);
                a6 = jVar3.a();
                a6.beginTransaction();
                try {
                    a6.compileStatement("DELETE FROM log_event_dropped").execute();
                    a6.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + jVar3.f1703h.a()).execute();
                    a6.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                s sVar2 = (s) obj;
                Iterator it = ((Iterable) ((d6.j) ((d6.d) sVar2.f1813h)).d(new d6.f(i11))).iterator();
                while (it.hasNext()) {
                    ((a5.c) sVar2.f1814i).I((w5.i) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // h4.c
    public h4.d b(h4.b bVar) {
        Context context = (Context) this.f1250h;
        String str = bVar.f2840b;
        h4.a aVar = bVar.f2841c;
        pc.j.e(aVar, "callback");
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new i4.g(context, str, aVar, true, true);
    }

    public u5.b c(a5.c cVar) {
        u5.c cVar2 = (u5.c) this.f1250h;
        URL url = (URL) cVar.f262h;
        String concat = "TRuntime.".concat("CctTransportBackend");
        if (Log.isLoggable(concat, 4)) {
            Log.i(concat, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(cVar2.f6708g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.8 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) cVar.f263i;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    m7.g gVar = cVar2.f6702a;
                    v5.i iVar = (v5.i) cVar.f261g;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    r7.d dVar = (r7.d) gVar.f4957h;
                    r7.e eVar = new r7.e(bufferedWriter, dVar.f6101a, dVar.f6102b, dVar.f6103c, dVar.f6104d);
                    eVar.f(iVar);
                    eVar.h();
                    eVar.f6106b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String concat2 = "TRuntime.".concat("CctTransportBackend");
                    if (Log.isLoggable(concat2, 4)) {
                        Log.i(concat2, String.format("Status Code: %d", valueOf));
                    }
                    a.a.r("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    a.a.r("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new u5.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new u5.b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            u5.b bVar = new u5.b(responseCode, null, v5.m.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f7289a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (ConnectException e10) {
            e = e10;
            a.a.u("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new u5.b(PermissionsActivity.DELAY_TIME_CALLBACK_CALL, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            a.a.u("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new u5.b(PermissionsActivity.DELAY_TIME_CALLBACK_CALL, null, 0L);
        } catch (IOException e12) {
            e = e12;
            a.a.u("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new u5.b(400, null, 0L);
        } catch (p7.b e13) {
            e = e13;
            a.a.u("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new u5.b(400, null, 0L);
        }
    }

    @Override // g7.e
    public void d(Object obj) {
        boolean z10;
        b0 b0Var = (b0) obj;
        if (!((FirebaseMessaging) this.f1250h).f1464e.c() || b0Var.f1752h.a() == null) {
            return;
        }
        synchronized (b0Var) {
            z10 = b0Var.f1751g;
        }
        if (z10) {
            return;
        }
        b0Var.f(0L);
    }

    @Override // l7.e
    public Object e(t tVar) {
        switch (this.f1249g) {
            case 9:
                return this.f1250h;
            default:
                return new u7.c((Context) tVar.a(Context.class), ((i7.g) tVar.a(i7.g.class)).c(), tVar.h(r.a(u7.d.class)), tVar.d(f8.b.class), (Executor) tVar.b((r) this.f1250h));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.lang.Object] */
    public void f() {
        oc.e eVar = (oc.e) this.f1250h;
        synchronized (w0.m.f7580c) {
            ?? r22 = w0.m.f7585h;
            pc.j.e(r22, "<this>");
            ArrayList arrayList = new ArrayList(o.O(r22));
            boolean z10 = false;
            for (Object obj : r22) {
                boolean z11 = true;
                if (!z10 && pc.j.a(obj, eVar)) {
                    z10 = true;
                    z11 = false;
                }
                if (z11) {
                    arrayList.add(obj);
                }
            }
            w0.m.f7585h = arrayList;
        }
    }

    public void g(Object obj) {
        ((oc.c) ((d1) this.f1250h).getValue()).invoke(obj);
    }

    @Override // g7.c
    public void k(g7.o oVar) {
        switch (this.f1249g) {
            case 5:
                e0.b((Intent) this.f1250h);
                break;
            case 6:
                ((g0) this.f1250h).f1778b.c(null);
                break;
            default:
                ((ScheduledFuture) this.f1250h).cancel(false);
                break;
        }
    }
}
