package com.gamericefishpro.space.a8;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.gamericefishpro.space.bb.s;
import com.gamericefishpro.space.c8.j;
import com.gamericefishpro.space.d6.f;
import com.gamericefishpro.space.f1.p;
import com.gamericefishpro.space.i8.h;
import com.gamericefishpro.space.o4.i;
import com.gamericefishpro.space.ph.y;
import com.gamericefishpro.space.t0.v0;
import com.gamericefishpro.space.tb.d0;
import com.gamericefishpro.space.tb.f0;
import com.gamericefishpro.space.u6.n;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.onesignal.core.activities.PermissionsActivity;
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
import java.util.concurrent.ScheduledFuture;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements com.gamericefishpro.space.bb.e, com.gamericefishpro.space.k8.b, com.gamericefishpro.space.d6.e, OnCompleteListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // com.gamericefishpro.space.bb.e
    public Object a(com.gamericefishpro.space.b1.d dVar) {
        return this.e;
    }

    @Override // com.gamericefishpro.space.k8.b
    public Object b() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                com.gamericefishpro.space.j8.i iVar = (com.gamericefishpro.space.j8.i) ((com.gamericefishpro.space.j8.c) obj);
                iVar.getClass();
                int i2 = com.gamericefishpro.space.f8.a.e;
                n nVar = new n();
                nVar.d = null;
                nVar.e = new ArrayList();
                nVar.i = null;
                nVar.v = "";
                HashMap map = new HashMap();
                SQLiteDatabase sQLiteDatabaseB = iVar.b();
                sQLiteDatabaseB.beginTransaction();
                try {
                    com.gamericefishpro.space.f8.a aVar = (com.gamericefishpro.space.f8.a) com.gamericefishpro.space.j8.i.w(sQLiteDatabaseB.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new com.gamericefishpro.space.h8.a(iVar, map, nVar, 3));
                    sQLiteDatabaseB.setTransactionSuccessful();
                    return aVar;
                } finally {
                    sQLiteDatabaseB.endTransaction();
                }
            case i.DOUBLE_FIELD_NUMBER /* 7 */:
                com.gamericefishpro.space.j8.i iVar2 = (com.gamericefishpro.space.j8.i) ((com.gamericefishpro.space.j8.d) obj);
                long jD = iVar2.e.d() - iVar2.v.d;
                SQLiteDatabase sQLiteDatabaseB2 = iVar2.b();
                sQLiteDatabaseB2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jD)};
                    Cursor cursorRawQuery = sQLiteDatabaseB2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            iVar2.n(cursorRawQuery.getInt(0), com.gamericefishpro.space.f8.c.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                        } catch (Throwable th) {
                            cursorRawQuery.close();
                            throw th;
                        }
                    }
                    cursorRawQuery.close();
                    int iDelete = sQLiteDatabaseB2.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseB2.setTransactionSuccessful();
                    sQLiteDatabaseB2.endTransaction();
                    return Integer.valueOf(iDelete);
                } catch (Throwable th2) {
                    sQLiteDatabaseB2.endTransaction();
                    throw th2;
                }
            case i.BYTES_FIELD_NUMBER /* 8 */:
                com.gamericefishpro.space.j8.i iVar3 = (com.gamericefishpro.space.j8.i) ((com.gamericefishpro.space.j8.c) ((h) obj).i);
                SQLiteDatabase sQLiteDatabaseB3 = iVar3.b();
                sQLiteDatabaseB3.beginTransaction();
                try {
                    sQLiteDatabaseB3.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseB3.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + iVar3.e.d()).execute();
                    sQLiteDatabaseB3.setTransactionSuccessful();
                    return null;
                } finally {
                    sQLiteDatabaseB3.endTransaction();
                }
            default:
                n nVar2 = (n) obj;
                Iterator it = ((Iterable) ((com.gamericefishpro.space.j8.i) ((com.gamericefishpro.space.j8.d) nVar2.e)).j(new s(18))).iterator();
                while (it.hasNext()) {
                    ((c) nVar2.i).z((j) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // com.gamericefishpro.space.d6.e
    public f c(com.gamericefishpro.space.d6.d configuration) {
        Context context = (Context) this.e;
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        String str = configuration.b;
        com.gamericefishpro.space.d6.c callback = configuration.c;
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (callback == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        }
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        Intrinsics.checkNotNullParameter(new com.gamericefishpro.space.d6.d(context, str, callback, true, true), "configuration");
        return new com.gamericefishpro.space.e6.h(context, str, callback, true, true);
    }

    public d d(c cVar) throws IOException {
        e eVar = (e) this.e;
        URL url = (URL) cVar.e;
        if (Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 4)) {
            String.format("Making request to: %s", url);
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(eVar.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) cVar.v;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    com.gamericefishpro.space.vb.c cVar2 = eVar.a;
                    com.gamericefishpro.space.b8.i iVar = (com.gamericefishpro.space.b8.i) cVar.i;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    com.gamericefishpro.space.ib.d dVar = (com.gamericefishpro.space.ib.d) cVar2.e;
                    com.gamericefishpro.space.ib.e eVar2 = new com.gamericefishpro.space.ib.e(bufferedWriter, dVar.a, dVar.b, dVar.c, dVar.d);
                    eVar2.f(iVar);
                    eVar2.h();
                    eVar2.b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    if (Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 4)) {
                        String.format("Status Code: %d", numValueOf);
                    }
                    com.gamericefishpro.space.wa.b.r("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    com.gamericefishpro.space.wa.b.r("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new d(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new d(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            d dVar2 = new d(responseCode, null, com.gamericefishpro.space.b8.n.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return dVar2;
                        } catch (Throwable th) {
                            if (gZIPInputStream == null) {
                                throw th;
                            }
                            try {
                                gZIPInputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        if (inputStream == null) {
                            throw th3;
                        }
                        try {
                            inputStream.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        gZIPOutputStream.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            } catch (Throwable th7) {
                if (outputStream == null) {
                    throw th7;
                }
                try {
                    outputStream.close();
                    throw th7;
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                    throw th7;
                }
            }
        } catch (com.gamericefishpro.space.gb.b e) {
            e = e;
            com.gamericefishpro.space.wa.b.s("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new d(400, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            com.gamericefishpro.space.wa.b.s("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new d(PermissionsActivity.DELAY_TIME_CALLBACK_CALL, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            com.gamericefishpro.space.wa.b.s("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new d(PermissionsActivity.DELAY_TIME_CALLBACK_CALL, null, 0L);
        } catch (IOException e4) {
            e = e4;
            com.gamericefishpro.space.wa.b.s("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new d(400, null, 0L);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.lang.Object] */
    public void e() {
        Function2 function2 = (Function2) this.e;
        synchronized (p.c) {
            ?? r2 = p.h;
            Intrinsics.checkNotNullParameter(r2, "<this>");
            ArrayList arrayList = new ArrayList(y.j(r2, 10));
            boolean z = false;
            for (Object obj : r2) {
                boolean z2 = true;
                if (!z && Intrinsics.a(obj, function2)) {
                    z = true;
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(obj);
                }
            }
            p.h = arrayList;
            Unit unit = Unit.a;
        }
    }

    public void f(Object obj) {
        ((Function1) ((v0) this.e).getValue()).invoke(obj);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.d) {
            case 12:
                d0.b((Intent) this.e);
                break;
            case 13:
                ((f0) this.e).b.c(null);
                break;
            default:
                ((ScheduledFuture) this.e).cancel(false);
                break;
        }
    }
}
