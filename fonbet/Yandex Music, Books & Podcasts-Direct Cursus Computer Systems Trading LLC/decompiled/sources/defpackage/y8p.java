package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.opentelemetry.proto.common.v1.a;
import io.opentelemetry.proto.common.v1.d;
import io.opentelemetry.proto.trace.v1.c;
import java.io.FileWriter;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import org.json.JSONObject;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public class y8p implements aqr, nkq, ysb, jpj, OnCompleteListener {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    public y8p(String str, kn3 kn3Var, kef kefVar) {
        int i;
        this.a = 4;
        str.getClass();
        kn3Var.getClass();
        this.b = kefVar;
        w3r w3rVar = (w3r) c.i.createBuilder();
        w3rVar.d();
        c cVar = (c) w3rVar.b;
        cVar.getClass();
        cVar.a = kn3Var;
        phn.a.getClass();
        n8 n8Var = phn.b;
        n8Var.getClass();
        byte[] bArr = new byte[8];
        n8Var.h().nextBytes(bArr);
        kn3 n = nn3.n(bArr, 0, 8);
        w3rVar.d();
        c cVar2 = (c) w3rVar.b;
        cVar2.getClass();
        cVar2.b = n;
        w3rVar.d();
        c cVar3 = (c) w3rVar.b;
        cVar3.getClass();
        cVar3.d = str;
        w3rVar.d();
        c cVar4 = (c) w3rVar.b;
        cVar4.getClass();
        switch (2) {
            case 1:
                i = 0;
                break;
            case 2:
                i = 1;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                i = 3;
                break;
            case 5:
                i = 4;
                break;
            case 6:
                i = 5;
                break;
            case 7:
                i = -1;
                break;
            default:
                throw null;
        }
        cVar4.e = i;
        this.c = w3rVar;
    }

    @Override // defpackage.jpj
    public kqv G(View view, kqv kqvVar) {
        lgu lguVar = (lgu) this.c;
        kqv l = wdu.l(view, kqvVar);
        if (l.a.o()) {
            return l;
        }
        Rect rect = (Rect) this.b;
        rect.left = l.b();
        rect.top = l.d();
        rect.right = l.c();
        rect.bottom = l.a();
        int childCount = lguVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            kqv c = wdu.c(lguVar.getChildAt(i), l);
            rect.left = Math.min(c.b(), rect.left);
            rect.top = Math.min(c.d(), rect.top);
            rect.right = Math.min(c.c(), rect.right);
            rect.bottom = Math.min(c.a(), rect.bottom);
        }
        return l.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    public r34 a(f24 f24Var, e44 e44Var) {
        ahs zgsVar;
        ygs ygsVar;
        zgs zgsVar2;
        f34 f34Var = e44Var != null ? e44Var.b : null;
        boolean contains = e44Var != null ? e44Var.a.a.keySet().contains(f24Var) : false;
        switch (f24Var.ordinal()) {
            case 0:
                if (f34Var == null) {
                    ygsVar = new ygs(g().c(R.string.downloaded_screen_title));
                    zgsVar = ygsVar;
                    return new r34(zgsVar, f24Var, contains);
                }
                List list = f34Var.b;
                zgsVar = new zgs(R.drawable.ic_download_24, g().c(R.string.downloaded_screen_title), saf.M(f34Var.a), xp3.n0(list), xp3.m0(list));
                return new r34(zgsVar, f24Var, contains);
            case 1:
                if (f34Var == null) {
                    ygsVar = new ygs(g().c(R.string.playlists));
                    zgsVar = ygsVar;
                    return new r34(zgsVar, f24Var, contains);
                }
                List list2 = f34Var.c;
                zgsVar2 = new zgs(R.drawable.ic_playlist_24, g().c(R.string.playlists), null, xp3.n0(list2), xp3.m0(list2));
                zgsVar = zgsVar2;
                return new r34(zgsVar, f24Var, contains);
            case 2:
                if (f34Var == null) {
                    ygsVar = new ygs(g().c(R.string.albums));
                    zgsVar = ygsVar;
                    return new r34(zgsVar, f24Var, contains);
                }
                List list3 = f34Var.d;
                zgsVar2 = new zgs(R.drawable.ic_album_24, g().c(R.string.albums), null, xp3.n0(list3), xp3.m0(list3));
                zgsVar = zgsVar2;
                return new r34(zgsVar, f24Var, contains);
            case 3:
                if (f34Var == null) {
                    ygsVar = new ygs(g().c(R.string.kids_tab));
                    zgsVar = ygsVar;
                    return new r34(zgsVar, f24Var, contains);
                }
                List list4 = f34Var.h;
                zgsVar2 = new zgs(R.drawable.ic_kid_24, g().c(R.string.kids_tab), null, xp3.n0(list4), xp3.m0(list4));
                zgsVar = zgsVar2;
                return new r34(zgsVar, f24Var, contains);
            case 4:
                String c = g().c(R.string.collection_audiobooks_hyphenated_title);
                if (f34Var == null) {
                    zgsVar = new ygs(c);
                } else {
                    List list5 = f34Var.g;
                    zgsVar = new zgs(R.drawable.ic_book_24, c, null, xp3.n0(list5), xp3.m0(list5));
                }
                return new r34(zgsVar, f24Var, contains);
            case 5:
                if (f34Var == null) {
                    ygsVar = new ygs(g().c(R.string.my_music_podcasts));
                    zgsVar = ygsVar;
                    return new r34(zgsVar, f24Var, contains);
                }
                List list6 = f34Var.f;
                zgsVar2 = new zgs(R.drawable.ic_podcast_24, g().c(R.string.my_music_podcasts), null, xp3.n0(list6), xp3.m0(list6));
                zgsVar = zgsVar2;
                return new r34(zgsVar, f24Var, contains);
            case 6:
                if (f34Var == null) {
                    ygsVar = new ygs(g().c(R.string.video_clips));
                    zgsVar = ygsVar;
                    return new r34(zgsVar, f24Var, contains);
                }
                List list7 = f34Var.e;
                zgsVar2 = new zgs(R.drawable.ic_clip_24, g().c(R.string.video_clips), null, xp3.n0(list7), xp3.m0(list7));
                zgsVar = zgsVar2;
                return new r34(zgsVar, f24Var, contains);
            case 7:
                ((o34) this.b).getClass();
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                ugs ugsVar = !((iqu) ((byb) qdcVar.C(I)).b(iqu.class)).h() ? (ugs) z8p.a.getValue() : (ugs) z8p.b.getValue();
                if (f34Var == null) {
                    zgsVar = new ygs(g().c(R.string.wave_for_two_screen_title));
                    return new r34(zgsVar, f24Var, contains);
                }
                zgsVar2 = new zgs(R.drawable.ic_wave_16, g().c(R.string.wave_for_two_screen_title), null, c5b.a, t75.c(ugsVar));
                zgsVar = zgsVar2;
                return new r34(zgsVar, f24Var, contains);
            default:
                b6e.s();
                return null;
        }
    }

    @Override // defpackage.nkq
    public void b(ka8 ka8Var) {
        ((nkq) this.b).b(ka8Var);
    }

    public void c(long j, d7k d7kVar) {
        if (d7kVar.a() < 9) {
            return;
        }
        int h = d7kVar.h();
        int h2 = d7kVar.h();
        int v = d7kVar.v();
        if (h == 434 && h2 == 1195456820 && v == 3) {
            saf.G(j, d7kVar, (azs[]) this.c);
        }
    }

    public a8w d(xvs xvsVar, int[] iArr, yk2 yk2Var, yde ydeVar) {
        xvsVar.getClass();
        iArr.getClass();
        yk2Var.getClass();
        ydeVar.getClass();
        long j = 25000;
        return new rtr((arr) this.b, xvsVar, iArr, yk2Var, 10000, j, j, ydeVar, (arr) this.c);
    }

    public void e(t2c t2cVar, cp2 cp2Var) {
        azs[] azsVarArr = (azs[]) this.c;
        for (int i = 0; i < azsVarArr.length; i++) {
            cp2Var.g();
            cp2Var.i();
            azs M = t2cVar.M(cp2Var.c, 3);
            dsc dscVar = (dsc) ((List) this.b).get(i);
            String str = dscVar.n;
            vq1.u("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            bsc bscVar = new bsc();
            cp2Var.i();
            bscVar.a = (String) cp2Var.e;
            bscVar.l = l5i.p("video/mp2t");
            bscVar.m = l5i.p(str);
            bscVar.e = dscVar.e;
            bscVar.d = dscVar.d;
            bscVar.H = dscVar.I;
            bscVar.p = dscVar.q;
            eta.o(bscVar, M);
            azsVarArr[i] = M;
        }
    }

    public x3r f() {
        w3r w3rVar = (w3r) this.c;
        long currentTimeMillis = System.currentTimeMillis() * 1000000;
        w3rVar.d();
        ((c) w3rVar.b).g = currentTimeMillis;
        x3r x3rVar = new x3r((c) w3rVar.b());
        ((kef) this.b).invoke(x3rVar);
        return x3rVar;
    }

    public skr g() {
        return (skr) ((jyr) this.c).getValue();
    }

    public void h(boolean z) {
        Object value;
        bis bisVar = (bis) this.b;
        xdr xdrVar = bisVar.d;
        if (z) {
            uol uolVar = ((oq7) bisVar.b.getValue()).c;
            long h = ((s5d) ((cr) uolVar.a.a).h).h();
            if (h < 0) {
                h = 0;
            }
            long g = h - uolVar.g();
            do {
                value = xdrVar.getValue();
                msa msaVar = nsa.b;
            } while (!xdrVar.k(value, rhs.a((rhs) value, yd5.N(g, ssa.MILLISECONDS), false, false, false, 14)));
            if (bisVar.b().e.getValue() instanceof kjs) {
                kmd b = bisVar.b();
                rar rarVar = b.c;
                Continuation continuation = null;
                if (rarVar != null) {
                    rarVar.g(null);
                }
                b.c = x97.y(b.a, null, null, new jmd(b, continuation, 0), 3);
            }
        } else if (bisVar.b().e.getValue() instanceof kjs) {
            bisVar.b().a(((rhs) xdrVar.getValue()).a);
        }
        while (true) {
            Object value2 = xdrVar.getValue();
            boolean z2 = z;
            if (xdrVar.k(value2, rhs.a((rhs) value2, 0L, false, z2, false, 11))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    @Override // defpackage.ysb
    public zsb[] i(xsb[] xsbVarArr, yk2 yk2Var) {
        zsb d;
        qsn H = sk3.H(xsbVarArr);
        zsb[] zsbVarArr = new zsb[xsbVarArr.length];
        for (int i = 0; i < xsbVarArr.length; i++) {
            xsb xsbVar = xsbVarArr[i];
            if (xsbVar != null) {
                int[] iArr = xsbVar.b;
                if (iArr.length != 0) {
                    int length = iArr.length;
                    xvs xvsVar = xsbVar.a;
                    if (length == 1) {
                        d = new mgc(xvsVar, iArr[0]);
                    } else {
                        yde ydeVar = (yde) H.get(i);
                        if (xvsVar.a < 1 || l5i.i(xvsVar.d[0].n) != 1) {
                            d = d(xvsVar, iArr, yk2Var, ydeVar);
                            zsbVarArr[i] = d;
                        } else {
                            long j = 25000;
                            d = new a8w(xvsVar, iArr, yk2Var, 10000, j, j, ydeVar);
                        }
                    }
                    zsbVarArr[i] = d;
                }
            }
        }
        return zsbVarArr;
    }

    public void j(LinkedHashMap linkedHashMap) {
        nbf nbfVar = (nbf) d.d.createBuilder();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            nbfVar.d();
            d dVar = (d) nbfVar.b;
            dVar.getClass();
            str.getClass();
            dVar.b = str;
            co0 co0Var = (co0) a.c.createBuilder();
            String str2 = (String) entry.getValue();
            co0Var.d();
            a aVar = (a) co0Var.b;
            aVar.getClass();
            str2.getClass();
            aVar.a = 1;
            aVar.b = str2;
            nbfVar.d();
            d dVar2 = (d) nbfVar.b;
            a aVar2 = (a) co0Var.b();
            dVar2.getClass();
            dVar2.c = aVar2;
            dVar2.a |= 1;
            w3r w3rVar = (w3r) this.c;
            d dVar3 = (d) nbfVar.b();
            w3rVar.d();
            c cVar = (c) w3rVar.b;
            cVar.getClass();
            rse rseVar = cVar.h;
            if (!((u8) rseVar).a) {
                cVar.h = o3d.mutableCopy(rseVar);
            }
            cVar.h.add(dVar3);
        }
    }

    public void k(byte[] bArr) {
        bArr.getClass();
        w3r w3rVar = (w3r) this.c;
        kn3 n = nn3.n(bArr, 0, bArr.length);
        w3rVar.d();
        c cVar = (c) w3rVar.b;
        cVar.getClass();
        cVar.c = n;
    }

    @Override // defpackage.aqr
    public Task l(Object obj) {
        FileWriter fileWriter;
        hgp hgpVar = (hgp) this.c;
        JSONObject jSONObject = (JSONObject) ((ExecutorService) ((vq6) ((osh) this.b).c).b).submit(new tn3(2, this)).get();
        FileWriter fileWriter2 = null;
        if (jSONObject != null) {
            bpp g = ((c5p) hgpVar.d).g(jSONObject);
            qr3 qr3Var = (qr3) hgpVar.f;
            long j = g.c;
            qr3Var.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j);
                fileWriter = new FileWriter(qr3Var.a);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Throwable th) {
                        th = th;
                        fileWriter2 = fileWriter;
                        kg5.q(fileWriter2, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Exception e) {
                    e = e;
                    Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                    kg5.q(fileWriter, "Failed to close settings writer.");
                    hgp.o("Loaded settings: ", jSONObject);
                    String str = ((fsp) hgpVar.c).f;
                    SharedPreferences.Editor edit = ((Context) hgpVar.b).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                    edit.putString("existing_instance_identifier", str);
                    edit.apply();
                    ((AtomicReference) hgpVar.h).set(g);
                    ((i8s) ((AtomicReference) hgpVar.i).get()).d(g);
                    return ywf.w(null);
                }
            } catch (Exception e2) {
                e = e2;
                fileWriter = null;
            } catch (Throwable th2) {
                th = th2;
                kg5.q(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            kg5.q(fileWriter, "Failed to close settings writer.");
            hgp.o("Loaded settings: ", jSONObject);
            String str2 = ((fsp) hgpVar.c).f;
            SharedPreferences.Editor edit2 = ((Context) hgpVar.b).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str2);
            edit2.apply();
            ((AtomicReference) hgpVar.h).set(g);
            ((i8s) ((AtomicReference) hgpVar.i).get()).d(g);
        }
        return ywf.w(null);
    }

    public void m() {
        w3r w3rVar = (w3r) this.c;
        long currentTimeMillis = System.currentTimeMillis() * 1000000;
        w3rVar.d();
        ((c) w3rVar.b).f = currentTimeMillis;
    }

    public void n(ucr ucrVar, ujl ujlVar) {
        ucrVar.getClass();
        j4w j4wVar = (j4w) this.c;
        j4wVar.a.execute(new gtm(8, this, ucrVar, ujlVar));
    }

    public void o(ucr ucrVar, int i) {
        ucrVar.getClass();
        j4w j4wVar = (j4w) this.c;
        j4wVar.a.execute(new md3((htm) this.b, ucrVar, false, i));
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        boolean z;
        k74 k74Var;
        l3x l3xVar = (l3x) this.b;
        k74 k74Var2 = (k74) this.c;
        krh krhVar = l3xVar.h;
        msg msgVar = l3x.m;
        boolean z2 = false;
        if (task.l()) {
            Bundle bundle = (Bundle) task.h();
            boolean z3 = bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
            msgVar.b("The module-to-client output switcher flag %s", true != z3 ? "not existed" : "existed");
            if (z3) {
                z = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                Log.i(msgVar.a, msgVar.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z), Boolean.valueOf(k74Var2.m)));
                boolean z4 = !z && k74Var2.m;
                if (krhVar != null || (k74Var = l3xVar.i) == null) {
                }
                boolean z5 = k74Var.k;
                boolean z6 = k74Var.j;
                hx1 hx1Var = new hx1();
                int i = Build.VERSION.SDK_INT;
                hx1Var.a = i >= 30;
                if (i >= 30) {
                    hx1Var.a = z4;
                }
                if (i >= 30) {
                    hx1Var.c = z5;
                }
                if (i >= 30) {
                    hx1Var.b = z6;
                }
                mrh mrhVar = new mrh(hx1Var);
                krh.b();
                yld c = krh.c();
                mrh mrhVar2 = c.u;
                vld vldVar = c.a;
                c.u = mrhVar;
                boolean f = c.f();
                kph kphVar = c.r;
                if (f) {
                    if (kphVar == null) {
                        kph kphVar2 = new kph(c.h, new awc(c));
                        c.r = kphVar2;
                        c.a(kphVar2, true);
                        c.k();
                        d18 d18Var = c.c;
                        ((Handler) d18Var.d).post((dsd) d18Var.h);
                    }
                    if (mrhVar2 != null && mrhVar2.c) {
                        z2 = true;
                    }
                    if (z2 != mrhVar.c) {
                        kph kphVar3 = c.r;
                        kphVar3.e = c.A;
                        if (!kphVar3.f) {
                            kphVar3.f = true;
                            kphVar3.c.sendEmptyMessage(2);
                        }
                    }
                } else if (kphVar != null) {
                    hrh d = c.d(kphVar);
                    if (d != null) {
                        krh.b();
                        kphVar.d = null;
                        kphVar.h(null);
                        c.m(d, null);
                        vldVar.b(514, d);
                        c.l.remove(d);
                    }
                    c.r = null;
                    d18 d18Var2 = c.c;
                    ((Handler) d18Var2.d).post((dsd) d18Var2.h);
                }
                vldVar.b(769, mrhVar);
                Log.i(msgVar.a, msgVar.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(l3xVar.l), Boolean.valueOf(z4), Boolean.valueOf(z5), Boolean.valueOf(z6)));
                if (z5) {
                    b4x b4xVar = l3xVar.k;
                    y1g.G(b4xVar);
                    h3x h3xVar = new h3x(b4xVar);
                    krh.b();
                    krh.c().f = h3xVar;
                    zix.a(rgx.CAST_TRANSFER_TO_LOCAL_ENABLED);
                    return;
                }
                return;
            }
        }
        z = true;
        Log.i(msgVar.a, msgVar.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z), Boolean.valueOf(k74Var2.m)));
        if (z) {
        }
        if (krhVar != null) {
        }
    }

    @Override // defpackage.nkq
    public void onError(Throwable th) {
        ((nkq) this.b).onError(th);
    }

    @Override // defpackage.nkq
    public void onSuccess(Object obj) {
        nkq nkqVar = (nkq) this.b;
        try {
            ((g3a) ((zeh) this.c).c).accept(obj);
            nkqVar.onSuccess(obj);
        } catch (Throwable th) {
            leu.a0(th);
            nkqVar.onError(th);
        }
    }

    public void p(boolean z, boolean z2) {
        if (z && ((WifiManager.WifiLock) this.c) == null) {
            WifiManager wifiManager = (WifiManager) ((Context) this.b).getApplicationContext().getSystemService("wifi");
            if (wifiManager == null) {
                vq1.n0("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.c = createWifiLock;
                createWifiLock.setReferenceCounted(false);
            }
        }
        WifiManager.WifiLock wifiLock = (WifiManager.WifiLock) this.c;
        if (wifiLock == null) {
            return;
        }
        if (z && z2) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }

    public int q(Context context, fo0 fo0Var) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        y1g.G(context);
        y1g.G(fo0Var);
        int k = fo0Var.k();
        int i = sparseIntArray.get(k, -1);
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= sparseIntArray.size()) {
                i2 = -1;
                break;
            }
            int keyAt = sparseIntArray.keyAt(i3);
            if (keyAt > k && sparseIntArray.get(keyAt) == 0) {
                break;
            }
            i3++;
        }
        if (i2 == -1) {
            i2 = ((qmd) this.c).b(context, k);
        }
        sparseIntArray.put(k, i2);
        return i2;
    }

    public String toString() {
        switch (this.a) {
            case 5:
                StringBuilder sb = new StringBuilder("StatisticEvent{mName='");
                sb.append((String) this.b);
                sb.append("', mAttributes=");
                return k5r.p(sb, (Map) this.c, '}');
            default:
                return super.toString();
        }
    }

    public y8p(arr arrVar, arr arrVar2) {
        this.a = 6;
        arrVar.getClass();
        this.b = arrVar;
        this.c = arrVar2;
    }

    public /* synthetic */ y8p(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public y8p(qmd qmdVar) {
        this.a = 16;
        this.b = new SparseIntArray();
        y1g.G(qmdVar);
        this.c = qmdVar;
    }

    public y8p(bis bisVar) {
        this.a = 7;
        this.b = bisVar;
        this.c = bisVar.e;
    }

    public y8p(oq7 oq7Var) {
        this.a = 8;
        oq7Var.getClass();
        this.b = oq7Var;
        this.c = new gao();
    }

    public /* synthetic */ y8p(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public y8p(o34 o34Var) {
        this.a = 0;
        o34Var.getClass();
        this.b = o34Var;
        this.c = l18.b.b(hag.I(skr.class), true);
    }

    public y8p() {
        this.a = 12;
        this.b = new eqi(new Reference[16]);
        this.c = new ReferenceQueue();
    }

    public y8p(List list) {
        this.a = 9;
        this.b = list;
        this.c = new azs[list.size()];
    }

    public y8p(htm htmVar, j4w j4wVar) {
        this.a = 14;
        htmVar.getClass();
        j4wVar.getClass();
        this.b = htmVar;
        this.c = j4wVar;
    }

    public y8p(fos fosVar, hwd hwdVar) {
        this.a = 15;
        fosVar.getClass();
        hwdVar.getClass();
        this.b = fosVar;
        this.c = hwdVar;
    }

    public y8p(Context context, int i) {
        yfx yfxVar;
        this.a = i;
        switch (i) {
            case 19:
                this.b = new yix(context, qmd.b);
                synchronized (yfx.class) {
                    try {
                        if (yfx.d == null) {
                            yfx.d = new yfx(context.getApplicationContext());
                        }
                        yfxVar = yfx.d;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.c = yfxVar;
                return;
            default:
                this.b = context;
                return;
        }
    }

    public y8p(ArrayList arrayList) {
        this.a = 2;
        this.b = arrayList;
        int[] iArr = new int[arrayList.size()];
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i >= 0) {
                iArr[((Number) obj).intValue()] = i;
                i = i2;
            } else {
                u75.n();
                throw null;
            }
        }
        this.c = new tz0(1, iArr);
    }

    public y8p(lgu lguVar) {
        this.a = 11;
        this.c = lguVar;
        this.b = new Rect();
    }
}
