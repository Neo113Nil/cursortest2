package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.SslErrorHandler;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.yandex.messenger.websdk.api.MessengerAnalytics;
import com.yandex.music.shared.experiments.impl.local.migrations.ExperimentInfoOldDto;
import com.yandex.music.shared.experiments.impl.local.migrations.OldDetailsFile$Companion$parseOldExperiments$typeToken$1;
import com.yandex.music.shared.experiments.impl.local.migrations.a;
import com.yandex.pulse.metrics.o;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;
import ru.yandex.music.common.media.context.Page;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.b;
import ru.yandex.music.common.media.context.e;
import ru.yandex.music.common.media.context.h;

/* loaded from: classes3.dex */
public final class qdc implements MessengerAnalytics, ngl, nkq, zfv, vft, x7o, adu, w2q, eym {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public qdc(vbv vbvVar) {
        PackageInfo packageInfo;
        this.a = 5;
        Context context = vbvVar.a;
        this.b = vbvVar.b.b();
        vae vaeVar = (vae) vbvVar.q.getValue();
        ote oteVar = (ote) vbvVar.p.getValue();
        if (vbvVar.i.getValue() != null) {
            l1j.f();
            throw null;
        }
        Pair pair = new Pair("serviceId", "ru.yandex.music_release");
        String str = vaeVar.c;
        Pair pair2 = new Pair("deviceId", str == null ? "" : str);
        Pair pair3 = new Pair("sessionId", oteVar.a);
        Pair pair4 = new Pair("environment", "production");
        try {
            packageInfo = context.getPackageManager().getPackageInfo("com.google.android.webview", 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        String str2 = packageInfo != null ? packageInfo.versionName : null;
        this.c = uah.e(pair, pair2, pair3, pair4, new Pair("webView", str2 == null ? "unknown" : str2));
    }

    @Override // defpackage.vft
    public void A() {
        ((j1k) this.c).c.F(Boolean.TRUE);
    }

    public Object C(bdt bdtVar) {
        return D(bdtVar, (l13) ((jyr) this.b).getValue(), null);
    }

    public Object D(bdt bdtVar, l13 l13Var, Set set) {
        l13Var.getClass();
        if (set != null) {
            if (set.contains(bdtVar)) {
                rj7.j("Cyclic dep for ", bdtVar, " - ", set);
                return null;
            }
            set.add(bdtVar);
        }
        c23 c23Var = (c23) t().get(bdtVar);
        Object a = c23Var != null ? c23Var.a(l13Var) : null;
        Object obj = a != null ? a : null;
        if (obj == null) {
            rj7.i(bdtVar, " found.", "No binding for ");
            return null;
        }
        if (set != null) {
            set.remove(bdtVar);
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0095, code lost:
    
        r2.add(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List E() {
        c5b a;
        String name;
        ExperimentInfoOldDto.DetailsDto dWl;
        JsonObject dWi;
        File file = (File) this.b;
        if (!file.exists() || !file.isFile() || !file.canRead()) {
            return c5b.a;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), Charsets.UTF_8), RemoteCameraConfig.Notification.ID);
        try {
            String F = t7g.F(bufferedReader);
            bufferedReader.close();
            if (F.length() == 0) {
                return c5b.a;
            }
            try {
                List<ExperimentInfoOldDto> list = (List) ((Gson) this.c).c(new StringReader(F), TypeToken.get(new OldDetailsFile$Companion$parseOldExperiments$typeToken$1().getType()));
                if (list == null) {
                    return c5b.a;
                }
                ArrayList arrayList = new ArrayList();
                for (ExperimentInfoOldDto experimentInfoOldDto : list) {
                    kxb kxbVar = null;
                    if (experimentInfoOldDto != null && (name = experimentInfoOldDto.getName()) != null && (dWl = experimentInfoOldDto.getDWl()) != null && (dWi = dWl.getDWi()) != null) {
                        kxbVar = new kxb(name, dWi);
                    }
                }
                return arrayList;
            } catch (JsonParseException e) {
                a = a.a(F, e);
                return a;
            } catch (IOException e2) {
                a = a.a(F, e2);
                return a;
            } catch (IllegalStateException e3) {
                a = a.a(F, e3);
                return a;
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                yd5.q(bufferedReader, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.ngl
    public void H(String str, String str2, Object obj, Object... objArr) {
        str.getClass();
        ((mnn) ((jyr) this.b).getValue()).f(System.currentTimeMillis(), new hsg(1, obj, str, str2));
        Log.v(str, "[" + str2 + "] " + obj);
    }

    public Object I(Object obj, aur aurVar) {
        Pair n = n(obj, true);
        wjn wjnVar = (wjn) n.a;
        if (((Boolean) n.b).booleanValue()) {
            return Unit.a;
        }
        Object a = wjnVar.a(aurVar);
        return a == nm6.a ? a : Unit.a;
    }

    public sd2 J() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(u());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i = ouj.E(5)[optInt];
        if (i == 0) {
            jj4.j("Null registrationStatus");
            return null;
        }
        String str = i == 0 ? " registrationStatus" : "";
        if (str.isEmpty()) {
            return new sd2(optString, i, optString2, optString3, optLong2, optLong, optString4);
        }
        xq0.q("Missing required properties:".concat(str));
        return null;
    }

    public void K(Object obj) {
        HashMap hashMap = (HashMap) this.c;
        ReentrantLock reentrantLock = (ReentrantLock) this.b;
        reentrantLock.lock();
        try {
            Pair pair = (Pair) hashMap.get(obj);
            if (pair == null) {
                throw new IllegalStateException("No mutex for key " + obj);
            }
            AtomicInteger atomicInteger = (AtomicInteger) pair.b;
            if (atomicInteger.get() != 0) {
                if (atomicInteger.decrementAndGet() == 0) {
                    hashMap.remove(obj);
                }
            } else {
                throw new IllegalStateException("Could not release with count " + atomicInteger);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.ngl
    public void M(String str, String str2, Object obj, Throwable th, Object... objArr) {
        str.getClass();
        jyr jyrVar = (jyr) this.b;
        ((mnn) jyrVar.getValue()).f(System.currentTimeMillis(), new hsg(0, obj, str, str2));
        ((mnn) jyrVar.getValue()).a(str, new RuntimeException(String.valueOf(obj), th), System.currentTimeMillis());
        Log.e(str, "[" + str2 + "] " + obj, th);
    }

    public boolean N(Object obj) {
        boolean z;
        obj.getClass();
        Pair n = n(obj, false);
        wjn wjnVar = (wjn) n.a;
        if (((Boolean) n.b).booleanValue()) {
            z = true;
        } else {
            xdr xdrVar = wjnVar.b;
            ReentrantLock reentrantLock = wjnVar.a;
            reentrantLock.lock();
            try {
                if (((Number) xdrVar.getValue()).intValue() == 0) {
                    xdrVar.getClass();
                    xdrVar.m(null, -1);
                    z = true;
                } else {
                    z = false;
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        if (z) {
            return true;
        }
        K(obj);
        return false;
    }

    public void O(Object obj) {
        obj.getClass();
        wjn v = v(obj);
        xdr xdrVar = v.b;
        ReentrantLock reentrantLock = v.a;
        reentrantLock.lock();
        try {
            if (((Number) xdrVar.getValue()).intValue() <= 0) {
                throw new IllegalStateException("Mutex not locked for read");
            }
            xdrVar.m(null, Integer.valueOf(((Number) xdrVar.getValue()).intValue() - 1));
            reentrantLock.unlock();
            K(obj);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void P(Object obj) {
        obj.getClass();
        wjn v = v(obj);
        xdr xdrVar = v.b;
        ReentrantLock reentrantLock = v.a;
        reentrantLock.lock();
        try {
            if (((Number) xdrVar.getValue()).intValue() >= 0) {
                throw new IllegalStateException("Mutex not locked for write");
            }
            xdrVar.getClass();
            xdrVar.m(null, 0);
            reentrantLock.unlock();
            K(obj);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.eym
    public ja8 a(szb szbVar, Function0 function0) {
        return szbVar.c((zzb) this.b, new kif(5, function0));
    }

    @Override // defpackage.nkq
    public void b(ka8 ka8Var) {
        ra8.g((yeh) this.c, ka8Var);
    }

    @Override // defpackage.w2q
    public Object c(foc focVar) {
        focVar.getClass();
        return null;
    }

    @Override // defpackage.eym
    public Object d(szb szbVar) {
        return szbVar.a((zzb) this.b);
    }

    @Override // defpackage.zfv
    public void e() {
        ((SslErrorHandler) this.b).cancel();
        ((Function0) this.c).invoke();
    }

    @Override // defpackage.eym
    public void f(String str, String str2, List list, Object obj) {
        gc8 gc8Var = (gc8) ((szm) this.c).get();
        if (gc8Var == null) {
            xq0.q(hrg.q("Property '", str, "' set skipped: target Div2View is gone"));
            return;
        }
        zzb h = ((zzb) this.b).h(f1d.g("property:", str), new m86(tah.b(new Pair(str2, obj))));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gc8Var.E((bd8) it.next(), "property_variable_set", h);
        }
    }

    @Override // defpackage.w2q
    public Object g(faq faqVar) {
        faqVar.getClass();
        return null;
    }

    @Override // defpackage.w2q
    public Object h(jzs jzsVar) {
        jzsVar.getClass();
        mqs mqsVar = jzsVar.a;
        if (mqsVar.k == dg2.b && !((qqs) this.b).d((u3q) this.c, jzsVar)) {
            return mqsVar;
        }
        return null;
    }

    @Override // defpackage.w2q
    public Object i(m1q m1qVar) {
        m1qVar.getClass();
        return null;
    }

    @Override // defpackage.w2q
    public Object j(i5u i5uVar) {
        i5uVar.getClass();
        return null;
    }

    @Override // defpackage.w2q
    public Object k(k4d k4dVar) {
        k4dVar.getClass();
        return null;
    }

    @Override // com.yandex.messenger.websdk.api.MessengerAnalytics
    public void l(String str, Throwable th) {
        dwt.b(new cte(0, this, str, th));
    }

    public int m(imh imhVar) {
        imhVar.getClass();
        x0 x0Var = (x0) this.c;
        if (x0Var != null) {
            y7g.Y(false, (qdc) x0Var.c);
            int indexOf = ((ArrayList) x0Var.d).indexOf(imhVar);
            if (indexOf != -1) {
                return indexOf + x0Var.b;
            }
        }
        return -1;
    }

    public Pair n(Object obj, boolean z) {
        Pair pair;
        HashMap hashMap = (HashMap) this.c;
        ReentrantLock reentrantLock = (ReentrantLock) this.b;
        reentrantLock.lock();
        try {
            Pair pair2 = (Pair) hashMap.get(obj);
            if (pair2 != null) {
                ((AtomicInteger) pair2.b).incrementAndGet();
                pair = new Pair(pair2.a, Boolean.FALSE);
            } else {
                wjn wjnVar = z ? new wjn(1) : new wjn(-1);
                hashMap.put(obj, new Pair(wjnVar, new AtomicInteger(1)));
                pair = new Pair(wjnVar, Boolean.TRUE);
            }
            reentrantLock.unlock();
            return pair;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.nkq
    public void onError(Throwable th) {
        ((nkq) this.b).onError(th);
    }

    @Override // defpackage.nkq
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 11:
                ((nkq) this.b).onSuccess(obj);
                break;
            default:
                ggk ggkVar = (ggk) obj;
                ggkVar.getClass();
                ((egk) this.c).b = new dgk(ggkVar);
                x7o x7oVar = (x7o) this.b;
                if (x7oVar != null) {
                    x7oVar.onSuccess(ggkVar);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.vft
    public void p() {
        ((pt0) this.b).F(Unit.a);
    }

    public void q(bdt bdtVar) {
        if (t().containsKey(bdtVar)) {
            return;
        }
        jj4.h(bdtVar, " found", "No binding for ");
    }

    public void s() {
        this.b = null;
        this.c = null;
    }

    @Override // com.yandex.messenger.websdk.api.MessengerAnalytics
    public void sendEvent(String str, Map map) {
        map.getClass();
        dwt.b(new cte(map, this, str));
    }

    public Map t() {
        return (HashMap) this.c;
    }

    public File u() {
        if (((File) this.b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.b) == null) {
                        aec aecVar = (aec) this.c;
                        aecVar.a();
                        this.b = new File(aecVar.a.getFilesDir(), "PersistedInstallation." + ((aec) this.c).f() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.b;
    }

    public wjn v(Object obj) {
        wjn wjnVar;
        ReentrantLock reentrantLock = (ReentrantLock) this.b;
        reentrantLock.lock();
        try {
            Pair pair = (Pair) ((HashMap) this.c).get(obj);
            if (pair != null && (wjnVar = (wjn) pair.a) != null) {
                return wjnVar;
            }
            throw new IllegalStateException("No mutex for key " + obj);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.x7o
    public void x(Object obj) {
        bfk bfkVar = (bfk) obj;
        bfkVar.getClass();
        ((egk) this.c).b = new agk(bfkVar);
        x7o x7oVar = (x7o) this.b;
        if (x7oVar != null) {
            x7oVar.x(bfkVar);
        }
    }

    public void y(sd2 sd2Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", sd2Var.a);
            jSONObject.put("Status", ouj.D(sd2Var.b));
            jSONObject.put("AuthToken", sd2Var.c);
            jSONObject.put("RefreshToken", sd2Var.d);
            jSONObject.put("TokenCreationEpochInSecs", sd2Var.f);
            jSONObject.put("ExpiresInSecs", sd2Var.e);
            jSONObject.put("FisError", sd2Var.g);
            aec aecVar = (aec) this.c;
            aecVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", aecVar.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(u())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    @Override // defpackage.zfv
    public void z() {
        ((SslErrorHandler) this.b).proceed();
    }

    public /* synthetic */ qdc(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public qdc(kzn kznVar) {
        this.a = 10;
        this.c = kznVar;
        this.b = btf.b(new ypb(15, this));
    }

    public qdc(cq4 cq4Var, e65 e65Var) {
        this.a = 3;
        this.b = e65Var;
        rar rarVar = (rar) this.c;
        Continuation continuation = null;
        if (rarVar != null) {
            rarVar.g(null);
        }
        int i = 2;
        this.c = ox6.B(new eno(new jud(i, 2, continuation)), cq4Var, new otd(i, this));
    }

    public qdc(kxi kxiVar) {
        this.a = 8;
        this.c = kxiVar;
        UUID.randomUUID().toString().getClass();
        this.b = btf.b(new bff(6));
    }

    public qdc(e eVar, PlaybackScope playbackScope) {
        this.a = 23;
        eVar.getClass();
        playbackScope.getClass();
        this.b = eVar;
        this.c = playbackScope;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qdc(e eVar, h hVar, int i) {
        this(eVar, (i & 2) != 0 ? new b(Page.RADIO, PlaybackScope.Type.SIMPLE_PAGE) : hVar);
        this.a = 23;
        if ((i & 1) != 0) {
            l18 l18Var = l18.b;
            bdt I = hag.I(e.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            eVar = (e) qdcVar.C(I);
        }
    }

    public qdc(mka mkaVar, ovn ovnVar) {
        this.a = 17;
        this.b = mkaVar;
        this.c = Executors.newSingleThreadExecutor();
        new Handler(Looper.getMainLooper());
        btf.b(new d1j(0, this));
        new tuh(29, this);
        new AtomicBoolean(false);
    }

    public qdc(qdc qdcVar) {
        this.a = 6;
        this.b = qdcVar;
    }

    public qdc(kxi kxiVar, String str) {
        this.a = 7;
        ekb[] ekbVarArr = ekb.a;
        pkb pkbVar = pkb.Audiobook;
        dkb dkbVar = dkb.Longtap;
        kxiVar.getClass();
        str.getClass();
        this.b = kxiVar;
        this.c = str;
    }

    public qdc(g0c g0cVar) {
        this.a = 2;
        dq7 dq7Var = ca8.a;
        dq7Var.getClass();
        this.b = g0cVar;
        this.c = dq7Var;
    }

    public /* synthetic */ qdc(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    public qdc(qqs qqsVar, u3q u3qVar) {
        this.a = 26;
        qqsVar.getClass();
        u3qVar.getClass();
        this.b = qqsVar;
        this.c = u3qVar;
    }

    public qdc(int i) {
        this.a = i;
        switch (i) {
            case 13:
                this.b = h6i.b;
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                xdr a = ydr.a(c5b.a);
                this.b = a;
                this.c = a;
                break;
            case 29:
                this.b = new ReentrantLock();
                this.c = new HashMap();
                break;
        }
    }

    public qdc(ix6 ix6Var) {
        this.a = 0;
        this.a = 0;
        this.b = btf.b(new yg6(8, this));
        this.c = new HashMap((Map) ix6Var.b);
    }

    public qdc(b7q b7qVar, tcl tclVar, sgl sglVar) {
        this.a = 24;
        tclVar.getClass();
        sglVar.getClass();
        this.c = sglVar;
        this.b = b7qVar.b(hag.I(mib.class), true);
    }

    public qdc(gzl gzlVar) {
        this.a = 25;
        this.b = gzlVar.g.m();
        this.c = gzlVar.getM();
    }

    public qdc(j1k j1kVar, pt0 pt0Var) {
        this.a = 19;
        pt0Var.getClass();
        this.c = j1kVar;
        this.b = pt0Var;
    }

    public qdc(qsn qsnVar, int[] iArr) {
        this.a = 16;
        this.b = yde.v(qsnVar);
        this.c = iArr;
    }

    public qdc(aqh aqhVar, irh irhVar) {
        this.a = 12;
        this.c = aqhVar;
        this.b = irhVar;
    }
}
