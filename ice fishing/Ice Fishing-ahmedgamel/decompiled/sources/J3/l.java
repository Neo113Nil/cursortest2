package J3;

import E2.M;
import O.C0332d;
import O.InterfaceC0330c;
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
import com.anythink.core.common.n.b.r;
import e2.C4473a;
import e2.EnumC4475c;
import i1.C4585b;
import i1.C4586c;
import i2.InterfaceC4589c;
import i2.InterfaceC4590d;
import j2.InterfaceC4611b;
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
import l3.InterfaceC4673a;
import l4.C4674A;
import m.C4727u;
import s2.C4945n;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements T3.e, r.a, P1.i, InterfaceC4611b, InterfaceC4673a, l3.c, t.i {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1483n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1484u;

    public /* synthetic */ l(int i, Object obj) {
        this.f1483n = i;
        this.f1484u = obj;
    }

    public Z1.b a(b3.e eVar) {
        Z1.c cVar = (Z1.c) this.f1484u;
        String l9 = Z2.d.l("CctTransportBackend");
        boolean isLoggable = Log.isLoggable(l9, 4);
        URL url = (URL) eVar.f5557u;
        if (isLoggable) {
            Log.i(l9, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(cVar.f4121g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", com.anythink.expressad.foundation.g.f.g.b.f20128d);
        httpURLConnection.setRequestProperty("Content-Type", com.anythink.core.common.m.a.f15190q);
        httpURLConnection.setRequestProperty("Accept-Encoding", com.anythink.expressad.foundation.g.f.g.b.f20128d);
        String str = (String) eVar.f5559w;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    C4586c c4586c = cVar.f4115a;
                    a2.i iVar = (a2.i) eVar.f5558v;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    Z3.d dVar = (Z3.d) c4586c.f38154u;
                    Z3.e eVar2 = new Z3.e(bufferedWriter, dVar.f4146a, dVar.f4147b, dVar.f4148c, dVar.f4149d);
                    eVar2.f(iVar);
                    eVar2.h();
                    eVar2.f4151b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String l10 = Z2.d.l("CctTransportBackend");
                    if (Log.isLoggable(l10, 4)) {
                        Log.i(l10, String.format("Status Code: %d", valueOf));
                    }
                    Z2.d.i("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    Z2.d.i("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new Z1.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new Z1.b(responseCode, (URL) null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = com.anythink.expressad.foundation.g.f.g.b.f20128d.equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            Z1.b bVar = new Z1.b(responseCode, (URL) null, a2.m.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f4287a);
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
        } catch (X3.b e9) {
            e = e9;
            Z2.d.j("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new Z1.b(400, (URL) null, 0L);
        } catch (ConnectException e10) {
            e = e10;
            Z2.d.j("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new Z1.b(500, (URL) null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            Z2.d.j("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new Z1.b(500, (URL) null, 0L);
        } catch (IOException e12) {
            e = e12;
            Z2.d.j("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new Z1.b(400, (URL) null, 0L);
        }
    }

    @Override // t.i
    public Object b(t.h hVar) {
        S7.B b9 = (S7.B) this.f1484u;
        b9.G(false, true, new T7.d(2, hVar, b9));
        return "Deferred.asListenableFuture";
    }

    @Override // T3.e
    public Object c(M m9) {
        return this.f1484u;
    }

    @Override // com.anythink.core.common.n.b.r.a
    public com.anythink.core.common.n.b.r create(com.anythink.core.common.n.b.e eVar) {
        com.anythink.core.common.n.b.r a9;
        a9 = com.anythink.core.common.n.b.r.a((com.anythink.core.common.n.b.r) this.f1484u, eVar);
        return a9;
    }

    @Override // j2.InterfaceC4611b
    public Object d() {
        SQLiteDatabase b9;
        Object obj = this.f1484u;
        switch (this.f1483n) {
            case 6:
                i2.h hVar = (i2.h) ((InterfaceC4589c) obj);
                hVar.getClass();
                int i = C4473a.f37244e;
                l4.q qVar = new l4.q();
                qVar.f38946u = null;
                qVar.f38947v = new ArrayList();
                qVar.f38948w = null;
                qVar.f38945n = "";
                HashMap hashMap = new HashMap();
                b9 = hVar.b();
                b9.beginTransaction();
                try {
                    C4473a c4473a = (C4473a) i2.h.p(b9.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new g2.a(3, hVar, hashMap, qVar));
                    b9.setTransactionSuccessful();
                    return c4473a;
                } finally {
                }
            case 7:
                i2.h hVar2 = (i2.h) ((InterfaceC4590d) obj);
                long f2 = hVar2.f38170u.f() - hVar2.f38172w.f38159d;
                b9 = hVar2.b();
                b9.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(f2)};
                    Cursor rawQuery = b9.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        try {
                            hVar2.l(rawQuery.getInt(0), EnumC4475c.MESSAGE_TOO_OLD, rawQuery.getString(1));
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
                i2.h hVar3 = (i2.h) ((h2.i) obj).i;
                b9 = hVar3.b();
                b9.beginTransaction();
                try {
                    b9.compileStatement("DELETE FROM log_event_dropped").execute();
                    b9.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + hVar3.f38170u.f()).execute();
                    b9.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                h2.j jVar = (h2.j) obj;
                Iterator it = ((Iterable) ((i2.h) jVar.f38115b).j(new com.anythink.core.common.n.b.A(8))).iterator();
                while (it.hasNext()) {
                    jVar.f38116c.a((b2.i) it.next(), 1, false);
                }
                return null;
        }
    }

    public boolean e(C4585b c4585b, int i, Bundle bundle) {
        InterfaceC0330c interfaceC0330c;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 25 && (i & 1) != 0) {
            try {
                ((T.g) c4585b.f38152u).c();
                Parcelable parcelable = (Parcelable) ((T.g) c4585b.f38152u).f();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e9) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e9);
                return false;
            }
        }
        ClipDescription description = ((T.g) c4585b.f38152u).getDescription();
        T.g gVar = (T.g) c4585b.f38152u;
        ClipData clipData = new ClipData(description, new ClipData.Item(gVar.b()));
        if (i4 >= 31) {
            interfaceC0330c = new C4586c(clipData, 2);
        } else {
            C0332d c0332d = new C0332d();
            c0332d.f2154u = clipData;
            c0332d.f2155v = 2;
            interfaceC0330c = c0332d;
        }
        interfaceC0330c.h(gVar.d());
        interfaceC0330c.a(bundle);
        return X.k((C4727u) this.f1484u, interfaceC0330c.build()) == null;
    }

    @Override // l3.InterfaceC4673a
    public Object g(l3.m mVar) {
        Object obj;
        ((C4945n) this.f1484u).getClass();
        synchronized (mVar.f38881a) {
            R2.w.j("Task is not yet complete", mVar.f38883c);
            if (mVar.f38884d) {
                throw new CancellationException("Task is already canceled.");
            }
            if (IOException.class.isInstance(mVar.f38886f)) {
                throw ((Throwable) IOException.class.cast(mVar.f38886f));
            }
            Exception exc = mVar.f38886f;
            if (exc != null) {
                throw new l3.f(exc);
            }
            obj = mVar.f38885e;
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

    @Override // P1.i
    public Object get() {
        com.bumptech.glide.c cVar = (com.bumptech.glide.c) this.f1484u;
        cVar.getClass();
        return new com.bumptech.glide.b(cVar);
    }

    @Override // l3.c
    public void r(l3.m mVar) {
        switch (this.f1483n) {
            case 11:
                l4.y.b((Intent) this.f1484u);
                break;
            case 12:
                ((C4674A) this.f1484u).f38888b.d(null);
                break;
            default:
                ((ScheduledFuture) this.f1484u).cancel(false);
                break;
        }
    }
}
