package H3;

import C2.N;
import O.C0327d;
import O.InterfaceC0325c;
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
import c2.C0534a;
import c2.EnumC0536c;
import com.anythink.core.common.n.b.r;
import e2.C4461a;
import g1.C4522b;
import g2.InterfaceC4526c;
import g2.InterfaceC4527d;
import h2.InterfaceC4563b;
import j3.InterfaceC4604a;
import j4.C4605A;
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
import m.C4714u;
import q2.C4896n;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements R3.e, r.a, N1.i, InterfaceC4563b, InterfaceC4604a, j3.c, t.i {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1127n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1128u;

    public /* synthetic */ l(int i, Object obj) {
        this.f1127n = i;
        this.f1128u = obj;
    }

    public X1.b a(Z2.e eVar) {
        X1.c cVar = (X1.c) this.f1128u;
        String w6 = O3.b.w("CctTransportBackend");
        boolean isLoggable = Log.isLoggable(w6, 4);
        URL url = (URL) eVar.f4170u;
        if (isLoggable) {
            Log.i(w6, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(cVar.f3770g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", com.anythink.expressad.foundation.g.f.g.b.f19341d);
        httpURLConnection.setRequestProperty("Content-Type", com.anythink.core.common.m.a.f14404q);
        httpURLConnection.setRequestProperty("Accept-Encoding", com.anythink.expressad.foundation.g.f.g.b.f19341d);
        String str = (String) eVar.f4172w;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    I0.j jVar = cVar.f3764a;
                    Y1.i iVar = (Y1.i) eVar.f4171v;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    X3.d dVar = (X3.d) jVar.f1264u;
                    X3.e eVar2 = new X3.e(bufferedWriter, dVar.f3801a, dVar.f3802b, dVar.f3803c, dVar.f3804d);
                    eVar2.f(iVar);
                    eVar2.h();
                    eVar2.f3806b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String w9 = O3.b.w("CctTransportBackend");
                    if (Log.isLoggable(w9, 4)) {
                        Log.i(w9, String.format("Status Code: %d", valueOf));
                    }
                    O3.b.i("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    O3.b.i("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new X1.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new X1.b(responseCode, (URL) null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = com.anythink.expressad.foundation.g.f.g.b.f19341d.equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            X1.b bVar = new X1.b(responseCode, (URL) null, Y1.m.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f3934a);
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
        } catch (V3.b e9) {
            e = e9;
            O3.b.k("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new X1.b(400, (URL) null, 0L);
        } catch (ConnectException e10) {
            e = e10;
            O3.b.k("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new X1.b(500, (URL) null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            O3.b.k("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new X1.b(500, (URL) null, 0L);
        } catch (IOException e12) {
            e = e12;
            O3.b.k("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new X1.b(400, (URL) null, 0L);
        }
    }

    @Override // R3.e
    public Object b(N n9) {
        return this.f1128u;
    }

    @Override // h2.InterfaceC4563b
    public Object c() {
        SQLiteDatabase b9;
        int i = 1;
        Object obj = this.f1128u;
        switch (this.f1127n) {
            case 6:
                g2.h hVar = (g2.h) ((InterfaceC4526c) obj);
                hVar.getClass();
                int i6 = C0534a.f5529e;
                j4.q qVar = new j4.q();
                qVar.f38434u = null;
                qVar.f38435v = new ArrayList();
                qVar.f38436w = null;
                qVar.f38433n = "";
                HashMap hashMap = new HashMap();
                b9 = hVar.b();
                b9.beginTransaction();
                try {
                    C0534a c0534a = (C0534a) g2.h.p(b9.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new C4461a(3, hVar, hashMap, qVar));
                    b9.setTransactionSuccessful();
                    return c0534a;
                } finally {
                }
            case 7:
                g2.h hVar2 = (g2.h) ((InterfaceC4527d) obj);
                long g4 = hVar2.f37643u.g() - hVar2.f37645w.f37632d;
                b9 = hVar2.b();
                b9.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(g4)};
                    Cursor rawQuery = b9.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        try {
                            hVar2.l(rawQuery.getInt(0), EnumC0536c.MESSAGE_TOO_OLD, rawQuery.getString(1));
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
                    b9.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + hVar3.f37643u.g()).execute();
                    b9.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                f2.j jVar = (f2.j) obj;
                Iterator it = ((Iterable) ((g2.h) jVar.f37491b).j(new d4.f(i))).iterator();
                while (it.hasNext()) {
                    jVar.f37492c.a((Z1.i) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // com.anythink.core.common.n.b.r.a
    public com.anythink.core.common.n.b.r create(com.anythink.core.common.n.b.e eVar) {
        com.anythink.core.common.n.b.r a9;
        a9 = com.anythink.core.common.n.b.r.a((com.anythink.core.common.n.b.r) this.f1128u, eVar);
        return a9;
    }

    public boolean d(I0.j jVar, int i, Bundle bundle) {
        InterfaceC0325c interfaceC0325c;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 25 && (i & 1) != 0) {
            try {
                ((T.g) jVar.f1264u).c();
                Parcelable parcelable = (Parcelable) ((T.g) jVar.f1264u).h();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e9) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e9);
                return false;
            }
        }
        ClipDescription description = ((T.g) jVar.f1264u).getDescription();
        T.g gVar = (T.g) jVar.f1264u;
        ClipData clipData = new ClipData(description, new ClipData.Item(gVar.a()));
        if (i6 >= 31) {
            interfaceC0325c = new C4522b(clipData, 2);
        } else {
            C0327d c0327d = new C0327d();
            c0327d.f2066u = clipData;
            c0327d.f2067v = 2;
            interfaceC0325c = c0327d;
        }
        interfaceC0325c.f(gVar.e());
        interfaceC0325c.b(bundle);
        return X.k((C4714u) this.f1128u, interfaceC0325c.build()) == null;
    }

    @Override // t.i
    public Object e(t.h hVar) {
        S7.B b9 = (S7.B) this.f1128u;
        b9.G(false, true, new T7.d(2, hVar, b9));
        return "Deferred.asListenableFuture";
    }

    @Override // j3.c
    public void f(j3.m mVar) {
        switch (this.f1127n) {
            case 11:
                j4.y.b((Intent) this.f1128u);
                break;
            case 12:
                ((C4605A) this.f1128u).f38376b.d(null);
                break;
            default:
                ((ScheduledFuture) this.f1128u).cancel(false);
                break;
        }
    }

    @Override // N1.i
    public Object get() {
        com.bumptech.glide.c cVar = (com.bumptech.glide.c) this.f1128u;
        cVar.getClass();
        return new com.bumptech.glide.b(cVar);
    }

    @Override // j3.InterfaceC4604a
    public Object h(j3.m mVar) {
        Object obj;
        ((C4896n) this.f1128u).getClass();
        synchronized (mVar.f38369a) {
            P2.w.j("Task is not yet complete", mVar.f38371c);
            if (mVar.f38372d) {
                throw new CancellationException("Task is already canceled.");
            }
            if (IOException.class.isInstance(mVar.f38374f)) {
                throw ((Throwable) IOException.class.cast(mVar.f38374f));
            }
            Exception exc = mVar.f38374f;
            if (exc != null) {
                throw new j3.f(exc);
            }
            obj = mVar.f38373e;
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
