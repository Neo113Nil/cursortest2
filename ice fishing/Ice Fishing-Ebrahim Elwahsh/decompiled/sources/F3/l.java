package F3;

import B2.N;
import O.C0340d;
import O.InterfaceC0338c;
import O.X;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import c2.C0538a;
import com.anythink.core.common.n.b.r;
import e2.C4468a;
import g1.C4523c;
import g1.C4524d;
import h2.InterfaceC4565b;
import h3.InterfaceC4567a;
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
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import m.C4762u;
import q2.C4903n;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements N3.e, r.a, N1.i, InterfaceC4565b, InterfaceC4567a, h3.c, t.i {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1040n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1041u;

    public /* synthetic */ l(int i, Object obj) {
        this.f1040n = i;
        this.f1041u = obj;
    }

    public X1.b a(Y2.e eVar) {
        X1.c cVar = (X1.c) this.f1041u;
        String j9 = U2.a.j("CctTransportBackend");
        boolean isLoggable = Log.isLoggable(j9, 4);
        URL url = (URL) eVar.f3963u;
        if (isLoggable) {
            Log.i(j9, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(cVar.f3826g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", com.anythink.expressad.foundation.g.f.g.b.f19499d);
        httpURLConnection.setRequestProperty("Content-Type", com.anythink.core.common.m.a.f14561q);
        httpURLConnection.setRequestProperty("Accept-Encoding", com.anythink.expressad.foundation.g.f.g.b.f19499d);
        String str = (String) eVar.f3965w;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    C4523c c4523c = cVar.f3820a;
                    Y1.i iVar = (Y1.i) eVar.f3964v;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    T3.d dVar = (T3.d) c4523c.f37856u;
                    T3.e eVar2 = new T3.e(bufferedWriter, dVar.f3107a, dVar.f3108b, dVar.f3109c, dVar.f3110d);
                    eVar2.f(iVar);
                    eVar2.h();
                    eVar2.f3112b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String j10 = U2.a.j("CctTransportBackend");
                    if (Log.isLoggable(j10, 4)) {
                        Log.i(j10, String.format("Status Code: %d", valueOf));
                    }
                    U2.a.c("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    U2.a.c("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new X1.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new X1.b(responseCode, (URL) null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = com.anythink.expressad.foundation.g.f.g.b.f19499d.equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            X1.b bVar = new X1.b(responseCode, (URL) null, Y1.m.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f3947a);
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
        } catch (R3.b e6) {
            e = e6;
            U2.a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new X1.b(400, (URL) null, 0L);
        } catch (ConnectException e9) {
            e = e9;
            U2.a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new X1.b(500, (URL) null, 0L);
        } catch (UnknownHostException e10) {
            e = e10;
            U2.a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new X1.b(500, (URL) null, 0L);
        } catch (IOException e11) {
            e = e11;
            U2.a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new X1.b(400, (URL) null, 0L);
        }
    }

    @Override // N3.e
    public Object b(N n9) {
        return this.f1041u;
    }

    @Override // t.i
    public Object c(t.h hVar) {
        O7.B b9 = (O7.B) this.f1041u;
        b9.G(false, true, new P7.d(2, hVar, b9));
        return "Deferred.asListenableFuture";
    }

    @Override // com.anythink.core.common.n.b.r.a
    public com.anythink.core.common.n.b.r create(com.anythink.core.common.n.b.e eVar) {
        com.anythink.core.common.n.b.r a9;
        a9 = com.anythink.core.common.n.b.r.a((com.anythink.core.common.n.b.r) this.f1041u, eVar);
        return a9;
    }

    @Override // h2.InterfaceC4565b
    public Object d() {
        SQLiteDatabase b9;
        Object obj = this.f1041u;
        switch (this.f1040n) {
            case 6:
                g2.h hVar = (g2.h) ((g2.c) obj);
                hVar.getClass();
                int i = C0538a.f5686e;
                S0.n nVar = new S0.n();
                nVar.f2914n = null;
                nVar.f2915u = new ArrayList();
                nVar.f2916v = null;
                nVar.f2917w = "";
                HashMap hashMap = new HashMap();
                b9 = hVar.b();
                b9.beginTransaction();
                try {
                    C0538a c0538a = (C0538a) g2.h.p(b9.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new C4468a(hVar, hashMap, nVar, 4));
                    b9.setTransactionSuccessful();
                    return c0538a;
                } finally {
                }
            case 7:
                g2.h hVar2 = (g2.h) ((g2.d) obj);
                long a9 = hVar2.f37874u.a() - hVar2.f37876w.f37863d;
                b9 = hVar2.b();
                b9.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(a9)};
                    Cursor rawQuery = b9.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        try {
                            hVar2.k(rawQuery.getInt(0), c2.c.MESSAGE_TOO_OLD, rawQuery.getString(1));
                        } catch (Throwable th) {
                            rawQuery.close();
                            throw th;
                        }
                    }
                    rawQuery.close();
                    int delete = b9.delete("events", "timestamp_ms < ?", strArr);
                    b9.setTransactionSuccessful();
                    b9.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            case 8:
                g2.h hVar3 = (g2.h) ((f2.i) obj).i;
                b9 = hVar3.b();
                b9.beginTransaction();
                try {
                    b9.compileStatement("DELETE FROM log_event_dropped").execute();
                    b9.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + hVar3.f37874u.a()).execute();
                    b9.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                f2.j jVar = (f2.j) obj;
                Iterator it = ((Iterable) ((g2.h) jVar.f37695b).i(new com.anythink.core.common.n.b.A(12))).iterator();
                while (it.hasNext()) {
                    jVar.f37696c.a((Z1.i) it.next(), 1, false);
                }
                return null;
        }
    }

    public boolean e(C4524d c4524d, int i, Bundle bundle) {
        InterfaceC0338c interfaceC0338c;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 25 && (i & 1) != 0) {
            try {
                ((T.g) c4524d.f37858u).e();
                Parcelable parcelable = (Parcelable) ((T.g) c4524d.f37858u).h();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e6) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e6);
                return false;
            }
        }
        ClipDescription description = ((T.g) c4524d.f37858u).getDescription();
        T.g gVar = (T.g) c4524d.f37858u;
        ClipData clipData = new ClipData(description, new ClipData.Item(gVar.b()));
        if (i4 >= 31) {
            interfaceC0338c = new C4523c(clipData, 2);
        } else {
            C0340d c0340d = new C0340d();
            c0340d.f2252u = clipData;
            c0340d.f2253v = 2;
            interfaceC0338c = c0340d;
        }
        interfaceC0338c.h(gVar.f());
        interfaceC0338c.e(bundle);
        return X.k((C4762u) this.f1041u, interfaceC0338c.build()) == null;
    }

    @Override // N1.i
    public Object get() {
        com.bumptech.glide.c cVar = (com.bumptech.glide.c) this.f1041u;
        cVar.getClass();
        return new com.bumptech.glide.b(cVar);
    }

    @Override // h3.c
    public void o(h3.n nVar) {
        switch (this.f1040n) {
            case 11:
                f4.x.b((Intent) this.f1041u);
                break;
            case 12:
                ((f4.z) this.f1041u).f37807b.d(null);
                break;
            default:
                ((ScheduledFuture) this.f1041u).cancel(false);
                break;
        }
    }

    @Override // h3.InterfaceC4567a
    public Object s(h3.n nVar) {
        Object obj;
        ((C4903n) this.f1041u).getClass();
        synchronized (nVar.f38220a) {
            O2.w.j("Task is not yet complete", nVar.f38222c);
            if (nVar.f38223d) {
                throw new CancellationException("Task is already canceled.");
            }
            if (IOException.class.isInstance(nVar.f38225f)) {
                throw ((Throwable) IOException.class.cast(nVar.f38225f));
            }
            Exception exc = nVar.f38225f;
            if (exc != null) {
                throw new h3.f(exc);
            }
            obj = nVar.f38224e;
        }
        Bundle bundle = (Bundle) obj;
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }
}
