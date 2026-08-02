package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import com.connectsdk.service.command.ServiceCommand;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.google.gson.JsonObject;
import com.lightside.slab.SlotView;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.SlidesHttpApi;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.SlidesResponseDto;
import io.grpc.internal.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import org.json.JSONObject;
import retrofit2.Call;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class sfm implements x7o, vdj, oc5, srq, m56 {
    public Object a;
    public Object b;
    public Object c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sfm(List list, int i) {
        this(new e50(list, null, 11));
        switch (i) {
            case 16:
                this.a = list;
                this.b = new azs[list.size()];
                this.c = new sj(new h5n(10, this));
                break;
            default:
                list.getClass();
                break;
        }
    }

    public static String N(pxm pxmVar) {
        if (pxmVar instanceof vqt) {
            return "EMPTY";
        }
        if (pxmVar instanceof wqt) {
            return ServiceCommand.TYPE_GET;
        }
        if (pxmVar instanceof xqt) {
            return ServiceCommand.TYPE_POST;
        }
        if (pxmVar instanceof yqt) {
            return ServiceCommand.TYPE_PUT;
        }
        b6e.s();
        return null;
    }

    public static pjp j(sfm sfmVar, tjp tjpVar, pjp pjpVar, qgr qgrVar) {
        b bVar = (b) sfmVar.c;
        tjpVar.b0();
        qo4[] qo4VarArr = qgrVar.a;
        int i = 0;
        if (qo4VarArr.length > 0) {
            qo4VarArr[0].getClass();
            l1j.f();
            return null;
        }
        vip vipVar = pjpVar.b;
        njp[] njpVarArr = bVar.h;
        int length = njpVarArr.length;
        while (i < length) {
            aqd aqdVar = new aqd(njpVarArr[i], vipVar);
            i++;
            vipVar = aqdVar;
        }
        return new pjp(pjpVar.a, vipVar);
    }

    public static JsonObject l(pxm pxmVar, Function1 function1) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.u("url", pxmVar.a);
        String str = pxmVar.b;
        jsonObject.u("urlScheme", str);
        jsonObject.u("urlType", N(pxmVar));
        jsonObject.u("typedUrlScheme", N(pxmVar) + "_" + str);
        function1.invoke(jsonObject);
        return jsonObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static llo u(jlo jloVar, String str) {
        llo u;
        llo lloVar = (llo) jloVar;
        if (str.equals(lloVar.c)) {
            return lloVar;
        }
        for (Object obj : jloVar.a()) {
            if (obj instanceof llo) {
                llo lloVar2 = (llo) obj;
                if (str.equals(lloVar2.c)) {
                    return lloVar2;
                }
                if ((obj instanceof jlo) && (u = u((jlo) obj, str)) != null) {
                    return u;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0054 A[Catch: all -> 0x0057, TRY_LEAVE, TryCatch #0 {all -> 0x0057, blocks: (B:12:0x004e, B:14:0x0054), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object A(r2f r2fVar, cg6 cg6Var) {
        llq llqVar;
        int i;
        qqi qqiVar;
        sfm sfmVar;
        try {
            if (cg6Var instanceof llq) {
                llqVar = (llq) cg6Var;
                int i2 = llqVar.o;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    llqVar.o = i2 - Integer.MIN_VALUE;
                    Object obj = llqVar.m;
                    nm6 nm6Var = nm6.a;
                    i = llqVar.o;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = (qqi) this.b;
                        llqVar.j = this;
                        llqVar.k = r2fVar;
                        llqVar.l = qqiVar;
                        llqVar.o = 1;
                        if (qqiVar.a(llqVar) == nm6Var) {
                            return nm6Var;
                        }
                        sfmVar = this;
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qqi qqiVar2 = llqVar.l;
                        r2f r2fVar2 = llqVar.k;
                        sfmVar = llqVar.j;
                        qgg.h0(obj);
                        qqiVar = qqiVar2;
                        r2fVar = r2fVar2;
                    }
                    if (r2fVar == ((r2f) sfmVar.c)) {
                        sfmVar.c = null;
                    }
                    qqiVar.b(null);
                    return Unit.a;
                }
            }
            if (r2fVar == ((r2f) sfmVar.c)) {
            }
            qqiVar.b(null);
            return Unit.a;
        } catch (Throwable th) {
            qqiVar.b(null);
            throw th;
        }
        llqVar = new llq(this, cg6Var);
        Object obj2 = llqVar.m;
        nm6 nm6Var2 = nm6.a;
        i = llqVar.o;
        if (i != 0) {
        }
    }

    public void B(Activity activity, uqv uqvVar) {
        WeakHashMap weakHashMap = (WeakHashMap) this.c;
        activity.getClass();
        ReentrantLock reentrantLock = (ReentrantLock) this.b;
        reentrantLock.lock();
        try {
            if (uqvVar.equals((uqv) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((pfq) ((z6n) this.a).b).b.iterator();
            while (it.hasNext()) {
                ofq ofqVar = (ofq) it.next();
                if (ofqVar.a.equals(activity)) {
                    ofqVar.c = uqvVar;
                    ofqVar.b.accept(uqvVar);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void C(String str, String str2, pkb pkbVar, int i, boolean z) {
        str.getClass();
        str2.getClass();
        nmb nmbVar = (nmb) this.b;
        int i2 = i + 1;
        String G = ((fnb) this.a).G();
        wjb wjbVar = wjb.SearchScreen;
        qkb qkbVar = qkb.Carousel;
        String concat = "search_request:".concat(str);
        kmb kmbVar = kmb.Tap;
        sjb sjbVar = sjb.Ok;
        nmb.i(nmbVar, G, wjbVar, null, null, pkbVar, str2, i2, "search_best_results", "SEARCH_BEST_RESULTS", concat, "", "", z ? "resume_playing" : "pause", 82182392);
    }

    public void D(kyf kyfVar) {
        cj3 cj3Var = (cj3) this.c;
        if (cj3Var != null) {
            cj3Var.run();
        }
        cj3 cj3Var2 = new cj3((gzf) this.a, kyfVar);
        this.c = cj3Var2;
        ((Handler) this.b).postAtFrontOfQueue(cj3Var2);
    }

    public Picture E(int i, int i2) {
        Picture picture = new Picture();
        Canvas beginRecording = picture.beginRecording(i, i2);
        spi spiVar = new spi(0.0f, 0.0f, i, i2);
        mmo mmoVar = new mmo(0);
        mmoVar.b = beginRecording;
        mmoVar.c = this;
        glo gloVar = (glo) this.a;
        if (gloVar == null) {
            Log.w("SVGAndroidRenderer", "Nothing to render. Document is empty.");
        } else {
            spi spiVar2 = gloVar.o;
            lqm lqmVar = gloVar.n;
            mmoVar.d = new kmo();
            mmoVar.e = new Stack();
            mmoVar.a1((kmo) mmoVar.d, flo.b());
            kmo kmoVar = (kmo) mmoVar.d;
            kmoVar.f = null;
            kmoVar.h = false;
            ((Stack) mmoVar.e).push(new kmo(kmoVar));
            mmoVar.g = new Stack();
            mmoVar.f = new Stack();
            Boolean bool = gloVar.d;
            if (bool != null) {
                ((kmo) mmoVar.d).h = bool.booleanValue();
            }
            mmoVar.R0();
            spi spiVar3 = new spi(spiVar);
            rko rkoVar = gloVar.r;
            if (rkoVar != null) {
                spiVar3.d = rkoVar.c(mmoVar, spiVar3.d);
            }
            rko rkoVar2 = gloVar.s;
            if (rkoVar2 != null) {
                spiVar3.e = rkoVar2.c(mmoVar, spiVar3.e);
            }
            mmoVar.E0(gloVar, spiVar3, spiVar2, lqmVar);
            mmoVar.Q0();
        }
        picture.endRecording();
        return picture;
    }

    public void F(o6e o6eVar) {
        kkp kkpVar = (kkp) this.c;
        vzp vzpVar = (vzp) kkpVar.c;
        LinkedHashMap linkedHashMap = (LinkedHashMap) kkpVar.d;
        ReentrantLock reentrantLock = (ReentrantLock) kkpVar.e;
        reentrantLock.lock();
        try {
            Integer num = (Integer) linkedHashMap.get(vzpVar.invoke(o6eVar));
            boolean z = true;
            if (num == null) {
                linkedHashMap.put(vzpVar.invoke(o6eVar), 1);
            } else if (num.intValue() < ((Number) ((oxo) kkpVar.b).invoke()).intValue()) {
                linkedHashMap.put(vzpVar.invoke(o6eVar), Integer.valueOf(num.intValue() + 1));
            } else {
                z = false;
            }
            reentrantLock.unlock();
            if (z) {
                JsonObject l = l(o6eVar.b, new xum(17, o6eVar, this));
                if (o6eVar instanceof m6e) {
                    MusicBackendResponse musicBackendResponse = ((m6e) o6eVar).e;
                    MusicBackendInvocationError error = musicBackendResponse.getError();
                    l.u("backendErrorMessage", error != null ? error.getMessage() : null);
                    MusicBackendInvocationError error2 = musicBackendResponse.getError();
                    l.u("backendErrorName", error2 != null ? error2.getName() : null);
                    l.t("musBackendFormatDescription", Boolean.TRUE);
                } else {
                    if (!(o6eVar instanceof n6e)) {
                        b6e.s();
                        return;
                    }
                    l.t("musBackendFormatDescription", Boolean.FALSE);
                }
                b3i b3iVar = (b3i) this.a;
                String jsonElement = l.toString();
                jsonElement.getClass();
                b3iVar.P("backend_error", jsonElement);
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void G(nnd nndVar) {
        JsonObject l = l((pxm) nndVar.b, new kzp(1, nndVar));
        b3i b3iVar = (b3i) this.a;
        String jsonElement = l.toString();
        jsonElement.getClass();
        b3iVar.P("illegal_network_mode", jsonElement);
    }

    public llo H(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        String replace = str.replace("\\\n", "").replace("\\A", StringUtil.LF);
        if (replace.length() <= 1 || !replace.startsWith("#")) {
            return null;
        }
        String substring = replace.substring(1);
        HashMap hashMap = (HashMap) this.c;
        if (substring == null || substring.length() == 0) {
            return null;
        }
        if (substring.equals(((glo) this.a).c)) {
            return (glo) this.a;
        }
        if (hashMap.containsKey(substring)) {
            return (llo) hashMap.get(substring);
        }
        llo u = u((glo) this.a, substring);
        hashMap.put(substring, u);
        return u;
    }

    public Object I(byte[] bArr, Continuation continuation) {
        try {
            Pattern pattern = twh.e;
            twh C = q5g.C("application/x-protobuf");
            int length = bArr.length;
            bArr.getClass();
            cvt.c(bArr.length, 0, length);
            g0o g0oVar = new g0o(C, length, bArr);
            b0o b0oVar = new b0o();
            b0oVar.g((String) this.a);
            b0oVar.e(ServiceCommand.TYPE_POST, g0oVar);
            d0o b = b0oVar.b();
            OkHttpClient okHttpClient = (OkHttpClient) this.c;
            okHttpClient.getClass();
            new mkn(okHttpClient, b, false).execute();
        } catch (Exception unused) {
            Object invoke = ((w4i) this.b).invoke(bArr, continuation);
            if (invoke == nm6.a) {
                return invoke;
            }
        }
        return Unit.a;
    }

    public void J(Object obj) {
        long r = ldg.r();
        if (r == cgs.a) {
            this.c = obj;
            return;
        }
        synchronized (this.b) {
            vfs vfsVar = (vfs) ((AtomicReference) this.a).get();
            int a = vfsVar.a(r);
            if (a < 0) {
                ((AtomicReference) this.a).set(vfsVar.b(r, obj));
            } else {
                vfsVar.c[a] = obj;
            }
        }
    }

    public void K(String str, String str2, pkb pkbVar, int i, String str3, String str4) {
        String G = ((fnb) this.a).G();
        wjb wjbVar = wjb.SearchScreen;
        qkb qkbVar = qkb.Carousel;
        nmb.t((nmb) this.b, G, wjbVar, null, null, null, null, null, pkbVar, str2, 1, i + 1, str3, "top", 1, true, "search_best_results", "SEARCH_BEST_RESULTS", 0, 0, 1, f1d.g("search_request:", str), null, null, 0, str4, "", null, 164368508);
    }

    public void L(tjp tjpVar, String str, s2i s2iVar) {
        Executor aipVar;
        qe6 qe6Var;
        b bVar = (b) this.c;
        Logger logger = b.w;
        if (bVar.d != e48.a) {
            aipVar = new sip(((b) this.c).d);
        } else {
            aipVar = new aip();
            tjpVar.X();
        }
        Executor executor = aipVar;
        l2i l2iVar = xqd.e;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= s2iVar.b) {
                break;
            }
            if (Arrays.equals(l2iVar.b, s2iVar.f(i))) {
                String str2 = (String) s2iVar.c(xqd.e);
                bh7 bh7Var = (bh7) ((b) this.c).s.a.get(str2);
                if ((bh7Var != null ? bh7Var.a : null) == null) {
                    tjpVar.z0(b.x);
                    tjpVar.Q(sgr.m.i("Can't find decompressor for " + str2), new s2i());
                    return;
                }
            } else {
                i++;
            }
        }
        qgr O = tjpVar.O();
        o2g.O(O, "statsTraceCtx not present from stream");
        Long l = (Long) s2iVar.c(xqd.d);
        we6 we6Var = ((b) this.c).r;
        o2g.O(we6Var, "context");
        qo4[] qo4VarArr = O.a;
        if (qo4VarArr.length > 0) {
            qo4VarArr[0].getClass();
            l1j.f();
            return;
        }
        yfx yfxVar = tve.a;
        b bVar2 = (b) this.c;
        ulk ulkVar = we6Var.b;
        we6 we6Var2 = new we6(we6Var, ulkVar == null ? new slk(1, yfxVar, bVar2) : ulkVar.a(yfxVar.hashCode(), yfxVar, bVar2, 0));
        if (l == null) {
            qe6Var = new qe6(we6Var2);
        } else {
            long longValue = l.longValue();
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            fs7 fs7Var = ((b) this.c).v;
            if (timeUnit == null) {
                jj4.j("units");
                return;
            }
            ce7 ce7Var = new ce7(fs7Var, longValue);
            ScheduledExecutorService scheduledExecutorService = ((x13) this.a).b;
            we6.o(scheduledExecutorService, "scheduler");
            ce7 H = we6Var2.H();
            if (H == null || H.compareTo(ce7Var) > 0) {
                z = true;
            } else {
                ce7Var = H;
            }
            qe6 qe6Var2 = new qe6(we6Var2, ce7Var);
            if (z) {
                if (ce7Var.d()) {
                    qe6Var2.Q(new TimeoutException("context timed out"));
                } else {
                    synchronized (qe6Var2) {
                        q9 q9Var = new q9(14, qe6Var2);
                        long j = ce7Var.b;
                        ce7Var.a.getClass();
                        qe6Var2.k = scheduledExecutorService.schedule(q9Var, j - System.nanoTime(), timeUnit);
                    }
                }
            }
            qe6Var = qe6Var2;
        }
        jkk.b();
        fjp fjpVar = new fjp(executor, ((b) this.c).d, tjpVar, qe6Var);
        tjpVar.z0(fjpVar);
        xop xopVar = new xop();
        executor.execute(new jjp(this, qe6Var, str, tjpVar, fjpVar, xopVar, O, s2iVar, executor));
        executor.execute(new ijp(this, qe6Var, xopVar, str, s2iVar, tjpVar, fjpVar));
    }

    public JSONObject M() {
        oq9 oq9Var;
        JSONObject jSONObject = new JSONObject();
        dq8 dq8Var = (dq8) this.a;
        dq8Var.getClass();
        int ordinal = dq8Var.ordinal();
        if (ordinal == 0) {
            oq9Var = oq9.SELECT;
        } else if (ordinal == 1) {
            oq9Var = oq9.CVV;
        } else if (ordinal == 2) {
            oq9Var = oq9.BANK_SELECT;
        } else if (ordinal == 3) {
            oq9Var = oq9.EXIT;
        } else if (ordinal == 4) {
            oq9Var = oq9.SBP_LICENSE;
        } else if (ordinal == 6) {
            oq9Var = oq9.SBP_CHALLENGER;
        } else if (ordinal == 7) {
            oq9Var = oq9.CARD_INPUT_SCREEN;
        } else {
            if (ordinal != 9) {
                xq0.x("Unsupported DivCardForAnalytics value");
                return null;
            }
            oq9Var = oq9.RESULT;
        }
        JSONObject put = jSONObject.put("template", oq9Var.a).put("lang", (String) this.b).put("data", (JSONObject) this.c);
        put.getClass();
        return put;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:14:0x0089, B:22:0x005d, B:24:0x0063, B:26:0x0068, B:28:0x0076), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:14:0x0089, B:22:0x005d, B:24:0x0063, B:26:0x0068, B:28:0x0076), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:14:0x0089, B:22:0x005d, B:24:0x0063, B:26:0x0068, B:28:0x0076), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r10v0, types: [r2f] */
    /* JADX WARN: Type inference failed for: r10v1, types: [oqi] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [oqi] */
    /* JADX WARN: Type inference failed for: r10v4, types: [oqi] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object O(r2f r2fVar, cg6 cg6Var) {
        mlq mlqVar;
        int i;
        sfm sfmVar;
        r2f r2fVar2;
        r2f r2fVar3;
        r2f r2fVar4;
        sfm sfmVar2;
        try {
            if (cg6Var instanceof mlq) {
                mlqVar = (mlq) cg6Var;
                int i2 = mlqVar.o;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    mlqVar.o = i2 - Integer.MIN_VALUE;
                    Object obj = mlqVar.m;
                    nm6 nm6Var = nm6.a;
                    i = mlqVar.o;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqi qqiVar = (qqi) this.b;
                        mlqVar.j = this;
                        mlqVar.k = r2fVar;
                        mlqVar.l = qqiVar;
                        mlqVar.o = 1;
                        if (qqiVar.a(mlqVar) != nm6Var) {
                            sfmVar = this;
                            r2fVar2 = r2fVar;
                            r2fVar = qqiVar;
                        }
                        return nm6Var;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oqi oqiVar = mlqVar.l;
                        r2fVar4 = mlqVar.k;
                        sfmVar2 = mlqVar.j;
                        qgg.h0(obj);
                        r2fVar = oqiVar;
                        sfmVar = sfmVar2;
                        r2fVar2 = r2fVar4;
                        sfmVar.c = r2fVar2;
                        return true;
                    }
                    oqi oqiVar2 = mlqVar.l;
                    r2fVar2 = mlqVar.k;
                    sfmVar = mlqVar.j;
                    qgg.h0(obj);
                    r2fVar = oqiVar2;
                    r2fVar3 = (r2f) sfmVar.c;
                    if (r2fVar3 != null) {
                        r2fVar3.b();
                    }
                    if (r2fVar3 != null) {
                        r2fVar3.g(new klq((vtm) sfmVar.a));
                    }
                    if (r2fVar3 != null) {
                        mlqVar.j = sfmVar;
                        mlqVar.k = r2fVar2;
                        mlqVar.l = r2fVar;
                        mlqVar.o = 2;
                        if (r2fVar3.j0(mlqVar) != nm6Var) {
                            r2fVar4 = r2fVar2;
                            sfmVar2 = sfmVar;
                            r2fVar = r2fVar;
                            sfmVar = sfmVar2;
                            r2fVar2 = r2fVar4;
                        }
                        return nm6Var;
                    }
                    sfmVar.c = r2fVar2;
                    return true;
                }
            }
            if (i != 0) {
            }
            r2fVar3 = (r2f) sfmVar.c;
            if (r2fVar3 != null) {
            }
            if (r2fVar3 != null) {
            }
            if (r2fVar3 != null) {
            }
            sfmVar.c = r2fVar2;
            return true;
        } finally {
            r2fVar.b(null);
        }
        mlqVar = new mlq(this, cg6Var);
        Object obj2 = mlqVar.m;
        nm6 nm6Var2 = nm6.a;
        i = mlqVar.o;
    }

    public void P(int i, lm4 lm4Var, otq otqVar) {
        Object putIfAbsent;
        mwq mwqVar = new mwq(i, lm4Var);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
        Object obj = concurrentHashMap.get(mwqVar);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(mwqVar, (obj = ydr.a(otqVar)))) != null) {
            obj = putIfAbsent;
        }
        ((xdr) ((bqi) obj)).m(null, otqVar);
    }

    @Override // defpackage.srq
    public void c() {
        ((xum) this.c).invoke((SlotView) this.b);
        o();
    }

    @Override // defpackage.oc5
    public void e(x1u x1uVar) {
        x1uVar.getClass();
        g6p g6pVar = (g6p) this.a;
        e4p e4pVar = ((w7p) this.b).c;
        ((Number) ((aqi) this.c).getValue()).intValue();
        g6pVar.A0(x1uVar, e4pVar);
    }

    @Override // defpackage.vdj
    public void f(boolean z) {
        g6p g6pVar = (g6p) this.a;
        x6p x6pVar = (x6p) this.b;
        g6pVar.s0(x6pVar, ((Number) ((aqi) this.c).getValue()).intValue(), z, x6pVar.c);
    }

    @Override // defpackage.m56
    public void g(Exception exc, dt1 dt1Var) {
        if (exc != null) {
            eta.q(((u4r) this.c).i.remove((String) this.a));
        }
        ((ps1) this.b).g(exc, dt1Var);
    }

    @Override // defpackage.oc5
    public boolean h(x1u x1uVar) {
        x1uVar.getClass();
        ((g6p) this.a).A(x1uVar, ((w7p) this.b).c, ((Number) ((aqi) this.c).getValue()).intValue());
        return true;
    }

    @Override // defpackage.oc5
    public void i(x1u x1uVar) {
        x1uVar.getClass();
        ((g6p) this.a).J(((Number) ((aqi) this.c).getValue()).intValue(), ((w7p) this.b).c, x1uVar, false);
    }

    @Override // defpackage.oc5
    public void k(x1u x1uVar, boolean z) {
        x1uVar.getClass();
        ((g6p) this.a).N(((Number) ((aqi) this.c).getValue()).intValue(), ((w7p) this.b).c, x1uVar, z);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(4:(2:3|(7:5|6|7|(1:(1:(7:11|12|13|14|15|16|17)(2:24|25))(1:26))(1:48)|27|28|(2:30|31)(4:32|33|(5:36|14|15|16|17)|35)))|27|28|(0)(0))|51|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0054, code lost:
    
        if (r4 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0094, code lost:
    
        r8 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [adn, java.lang.Object, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v3, types: [oqi] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r4v4, types: [aur, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r8v5, types: [oqi, qqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m(cg6 cg6Var) {
        ?? r0;
        int i;
        int i2;
        oqi oqiVar;
        Object obj;
        oqi oqiVar2;
        Throwable th;
        Object invoke;
        Object obj2;
        try {
            if (cg6Var instanceof adn) {
                adn adnVar = (adn) cg6Var;
                int i3 = adnVar.n;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    adnVar.n = i3 - Integer.MIN_VALUE;
                    r0 = adnVar;
                    Object obj3 = r0.l;
                    nm6 nm6Var = nm6.a;
                    i = r0.n;
                    if (i != 0) {
                        qgg.h0(obj3);
                        ?? r8 = (qqi) this.b;
                        r0.j = r8;
                        i2 = 0;
                        r0.k = 0;
                        r0.n = 1;
                        Object a = r8.a(r0);
                        oqiVar = r8;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar2 = r0.j;
                            try {
                                qgg.h0(obj3);
                                obj2 = CollectionsKt.O((Iterable) obj3);
                            } catch (CancellationException e) {
                                throw e;
                            } catch (Throwable th2) {
                                th = th2;
                                ssg.a(7, "QueueTrackProvider", "tracks provider thrown an exception", th);
                                obj2 = c5b.a;
                                this.c = obj2;
                                oqiVar2.b(null);
                                return obj2;
                            }
                            this.c = obj2;
                            oqiVar2.b(null);
                            return obj2;
                        }
                        i2 = r0.k;
                        oqi oqiVar3 = r0.j;
                        qgg.h0(obj3);
                        oqiVar = oqiVar3;
                    }
                    obj = this.c;
                    if (obj == null) {
                        oqiVar.b(null);
                        return obj;
                    }
                    try {
                        ?? r4 = (aur) this.a;
                        r0.j = oqiVar;
                        r0.k = i2;
                        r0.n = 2;
                        invoke = r4.invoke(r0);
                    } catch (CancellationException e2) {
                        throw e2;
                    } catch (Throwable th3) {
                        oqiVar2 = oqiVar;
                        th = th3;
                        ssg.a(7, "QueueTrackProvider", "tracks provider thrown an exception", th);
                        obj2 = c5b.a;
                        this.c = obj2;
                        oqiVar2.b(null);
                        return obj2;
                    }
                    if (invoke != nm6Var) {
                        oqiVar2 = oqiVar;
                        obj3 = invoke;
                        obj2 = CollectionsKt.O((Iterable) obj3);
                        this.c = obj2;
                        oqiVar2.b(null);
                        return obj2;
                    }
                    return nm6Var;
                }
            }
            obj = this.c;
            if (obj == null) {
            }
        } catch (Throwable th4) {
            r0 = oqiVar;
            th = th4;
            r0.b(null);
            throw th;
        }
        r0 = new adn(this, cg6Var);
        Object obj32 = r0.l;
        nm6 nm6Var2 = nm6.a;
        i = r0.n;
        if (i != 0) {
        }
    }

    public void n(t2c t2cVar, cp2 cp2Var) {
        azs[] azsVarArr = (azs[]) this.b;
        for (int i = 0; i < azsVarArr.length; i++) {
            cp2Var.g();
            cp2Var.i();
            azs M = t2cVar.M(cp2Var.c, 3);
            dsc dscVar = (dsc) ((List) this.a).get(i);
            String str = dscVar.n;
            vq1.u("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String str2 = dscVar.a;
            if (str2 == null) {
                cp2Var.i();
                str2 = (String) cp2Var.e;
            }
            bsc bscVar = new bsc();
            bscVar.a = str2;
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

    public void o() {
        wrq wrqVar = (wrq) this.a;
        if (wrqVar != null) {
            View view = wrqVar.i;
            view.removeOnAttachStateChangeListener(wrqVar);
            if (view.isAttachedToWindow()) {
                wrqVar.onViewDetachedFromWindow(view);
            }
        }
        this.a = null;
    }

    @Override // defpackage.x7o
    public void onSuccess(Object obj) {
        en enVar = (en) obj;
        enVar.getClass();
        rro rroVar = (rro) this.a;
        if (!(enVar instanceof zm)) {
            if (enVar instanceof dn) {
                dn dnVar = (dn) enVar;
                ((qtf) this.c).invoke(dnVar.a, dnVar.b);
                return;
            }
            return;
        }
        hl2 hl2Var = (hl2) this.b;
        if (hl2Var instanceof gl2) {
            gl2 gl2Var = (gl2) hl2Var;
            SharedPreferences sharedPreferences = rroVar.o;
            sharedPreferences.getClass();
            sharedPreferences.edit().putString("com.yandex.payment.LAST_USED_BANK_NAME", gl2Var.a).putString("com.yandex.payment.LAST_USED_BANK_SCHEME", gl2Var.b).putString("com.yandex.payment.LAST_USED_BANK_ICON_URI", gl2Var.g.toString()).putString("com.yandex.payment.LAST_USED_BANK_URL_TEMPLATE", gl2Var.f).putString("com.yandex.payment.LAST_USED_BANK_WEB_CLIENT_URI", gl2Var.c).putBoolean("com.yandex.payment.LAST_USED_BANK_IS_WEB_CLIENT_ACTIVE", gl2Var.d).apply();
        }
        rroVar.K(new oro());
    }

    public void p(ffm ffmVar) {
        tfm tfmVar = (tfm) this.c;
        List list = ffmVar.a;
        List list2 = list;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            if (((lfm) list.get(i)).b()) {
                if (((qfm) this.b) == qfm.b) {
                    wof wofVar = (wof) this.a;
                    if (wofVar == null) {
                        xq0.q("layoutCoordinates not set");
                        return;
                    }
                    zwf.d0(ffmVar, wofVar.S(0L), new rfm(tfmVar, 0), true);
                }
                this.b = qfm.c;
                return;
            }
        }
        wof wofVar2 = (wof) this.a;
        if (wofVar2 == null) {
            xq0.q("layoutCoordinates not set");
            return;
        }
        zwf.d0(ffmVar, wofVar2.S(0L), new afg(21, this, tfmVar), false);
        if (((qfm) this.b) == qfm.b) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((lfm) list.get(i2)).a();
            }
            fmq fmqVar = ffmVar.b;
            if (fmqVar == null) {
                return;
            }
            fmqVar.b = !tfmVar.c;
        }
    }

    public void q(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.a;
        dzm dzmVar = new dzm(byteArrayOutputStream, hashMap, (HashMap) this.b, (rhj) this.c);
        rhj rhjVar = (rhj) hashMap.get(obj.getClass());
        if (rhjVar != null) {
            rhjVar.a(obj, dzmVar);
            return;
        }
        throw new r6b("No encoder for " + obj.getClass());
    }

    public String r(Date date) {
        date.getClass();
        Object obj = ((urm) this.c).get();
        obj.getClass();
        String format = ((SimpleDateFormat) obj).format(date);
        format.getClass();
        return format;
    }

    public Object s() {
        long r = ldg.r();
        if (r == cgs.a) {
            return this.c;
        }
        vfs vfsVar = (vfs) ((AtomicReference) this.a).get();
        int a = vfsVar.a(r);
        if (a >= 0) {
            return vfsVar.c[a];
        }
        return null;
    }

    public spi t() {
        int i;
        float f;
        int i2;
        glo gloVar = (glo) this.a;
        rko rkoVar = gloVar.r;
        rko rkoVar2 = gloVar.s;
        if (rkoVar == null || rkoVar.h() || (i = rkoVar.b) == 9 || i == 2 || i == 3) {
            return new spi(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float d = rkoVar.d();
        if (rkoVar2 == null) {
            spi spiVar = ((glo) this.a).o;
            f = spiVar != null ? (spiVar.e * d) / spiVar.d : d;
        } else {
            if (rkoVar2.h() || (i2 = rkoVar2.b) == 9 || i2 == 2 || i2 == 3) {
                return new spi(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            f = rkoVar2.d();
        }
        return new spi(0.0f, 0.0f, d, f);
    }

    public List v(byte[] bArr) {
        List list = (List) ((ConcurrentHashMap) this.a).get(new ism(bArr));
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public vdr w(int i, lm4 lm4Var, otq otqVar) {
        mwq mwqVar = new mwq(i, lm4Var);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
        Object obj = concurrentHashMap.get(mwqVar);
        if (obj == null) {
            xdr a = ydr.a(otqVar);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(mwqVar, a);
            obj = putIfAbsent == null ? a : putIfAbsent;
        }
        bqi bqiVar = (bqi) obj;
        fkn fknVar = new fkn(bqiVar);
        if (ern.a(bqiVar.getValue().getClass()).equals(lm4Var)) {
            return fknVar;
        }
        throw new IllegalStateException(("StateFlow value type (" + ern.a(bqiVar.getValue().getClass()) + ") doesn't match expected type (" + lm4Var + ").").toString());
    }

    @Override // defpackage.x7o
    public void x(Object obj) {
        bfk bfkVar = (bfk) obj;
        bfkVar.getClass();
        ((rro) this.a).K(new lro(bfkVar, R.string.paymentsdk_sbp_something_went_wrong, R.string.paymentsdk_sbp_something_went_wrong_description));
    }

    public void y(String str, String str2, pkb pkbVar, int i, boolean z) {
        nmb nmbVar = (nmb) this.b;
        kmb kmbVar = kmb.Tap;
        String G = ((fnb) this.a).G();
        wjb wjbVar = wjb.SearchScreen;
        qkb qkbVar = qkb.Carousel;
        sjb sjbVar = sjb.Ok;
        nmb.i(nmbVar, G, wjbVar, null, null, pkbVar, str2, i + 1, "search_best_results", "SEARCH_BEST_RESULTS", f1d.g("search_request:", str), "", "", z ? "unlike" : "like", 82313464);
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x00d3, code lost:
    
        if (r3 == r7) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0161, code lost:
    
        if (r3 == r7) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x01f1, code lost:
    
        if (r3 == r7) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0281, code lost:
    
        if (r3 == r7) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0311, code lost:
    
        if (r3 == r7) goto L196;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object z(boolean z, zvq zvqVar, cg6 cg6Var) {
        ovq ovqVar;
        rj6 qj6Var;
        kj6 kj6Var;
        qj6 qj6Var2;
        rj6 rj6Var;
        Object obj;
        xsq xsqVar;
        String str;
        boolean z2 = z;
        atn atnVar = (atn) this.c;
        SlidesHttpApi slidesHttpApi = (SlidesHttpApi) this.a;
        if (cg6Var instanceof ovq) {
            ovqVar = (ovq) cg6Var;
            int i = ovqVar.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                ovqVar.p = i - Integer.MIN_VALUE;
                Object obj2 = ovqVar.n;
                nm6 nm6Var = nm6.a;
                int i2 = 0;
                switch (ovqVar.p) {
                    case 0:
                        qgg.h0(obj2);
                        if (!((z66) this.b).g()) {
                            ssg.a(6, "SlidesRepository", "no connection to load slides", null);
                            return new oj6(new IOException("no connection to load slides"));
                        }
                        if (zvqVar instanceof tuq) {
                            qj6Var = new qj6(new ptq(pvq.a, pvq.b, true));
                            rj6Var = qj6Var;
                            if (rj6Var instanceof qj6) {
                                ptq ptqVar = (ptq) ((qj6) rj6Var).a;
                                xsq xsqVar2 = (xsq) CollectionsKt.firstOrNull(ptqVar.b);
                                if (xsqVar2 != null) {
                                    ovqVar.k = rj6Var;
                                    ovqVar.l = xsqVar2;
                                    ovqVar.j = z2;
                                    ovqVar.m = 0;
                                    ovqVar.p = 6;
                                    if (ptqVar != null && (str = ptqVar.a) != null) {
                                        obj = ((cce) atnVar.c).a(atnVar.G(str), ovqVar);
                                        if (obj != nm6Var) {
                                        }
                                        if (obj != nm6Var) {
                                            xsqVar = xsqVar2;
                                            ovqVar.k = rj6Var;
                                            ovqVar.l = null;
                                            ovqVar.j = z2;
                                            ovqVar.m = i2;
                                            ovqVar.p = 7;
                                            if (atnVar.J(xsqVar, ovqVar) != nm6Var) {
                                            }
                                        }
                                    }
                                    obj = Unit.a;
                                    if (obj != nm6Var) {
                                    }
                                }
                            }
                        }
                        if (zvqVar instanceof qvq) {
                            Call<MusicBackendResponse<SlidesResponseDto>> c = slidesHttpApi.c(((qvq) zvqVar).a);
                            ovqVar.k = null;
                            ovqVar.j = z2;
                            ovqVar.m = 0;
                            ovqVar.p = 1;
                            obj2 = swf.N(c, ovqVar);
                            break;
                        } else if (Intrinsics.d(zvqVar, dwq.a)) {
                            Call<MusicBackendResponse<SlidesResponseDto>> b = slidesHttpApi.b();
                            ovqVar.k = null;
                            ovqVar.j = z2;
                            ovqVar.m = 0;
                            ovqVar.p = 2;
                            obj2 = swf.N(b, ovqVar);
                            break;
                        } else if (Intrinsics.d(zvqVar, wvq.a)) {
                            Call<MusicBackendResponse<SlidesResponseDto>> d = slidesHttpApi.d();
                            ovqVar.k = null;
                            ovqVar.j = z2;
                            ovqVar.m = 0;
                            ovqVar.p = 3;
                            obj2 = swf.N(d, ovqVar);
                            break;
                        } else if (zvqVar instanceof awq) {
                            Call<MusicBackendResponse<SlidesResponseDto>> e = slidesHttpApi.e(((awq) zvqVar).a);
                            ovqVar.k = null;
                            ovqVar.j = z2;
                            ovqVar.m = 0;
                            ovqVar.p = 4;
                            obj2 = swf.N(e, ovqVar);
                            break;
                        } else {
                            if (!(zvqVar instanceof bwq)) {
                                b6e.s();
                                return null;
                            }
                            Call<MusicBackendResponse<SlidesResponseDto>> a = slidesHttpApi.a(((bwq) zvqVar).a);
                            ovqVar.k = null;
                            ovqVar.j = z2;
                            ovqVar.m = 0;
                            ovqVar.p = 5;
                            obj2 = swf.N(a, ovqVar);
                            break;
                        }
                    case 1:
                        z2 = ovqVar.j;
                        qgg.h0(obj2);
                        bii biiVar = (bii) obj2;
                        if (biiVar instanceof aii) {
                            ptq l0 = vq1.l0((SlidesResponseDto) ((aii) biiVar).a, z2);
                            if (l0 == null) {
                                qj6Var = new nj6(null);
                            } else {
                                qj6Var2 = new qj6(l0);
                                qj6Var = qj6Var2;
                            }
                        } else if (biiVar instanceof xhi) {
                            xhi xhiVar = (xhi) biiVar;
                            MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                            int i3 = xhiVar.b;
                            String name = musicBackendInvocationError.getName();
                            String str2 = name == null ? "" : name;
                            String message = musicBackendInvocationError.getMessage();
                            kj6Var = new kj6(i3, musicBackendInvocationError.getDetails(), str2, message == null ? "" : message, xhiVar.a);
                            qj6Var = kj6Var;
                        } else if (biiVar instanceof yhi) {
                            yhi yhiVar = (yhi) biiVar;
                            qj6Var = new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                        } else {
                            if (!(biiVar instanceof zhi)) {
                                b6e.s();
                                return null;
                            }
                            qj6Var = uwf.J((zhi) biiVar);
                        }
                        rj6Var = qj6Var;
                        if (rj6Var instanceof qj6) {
                        }
                    case 2:
                        z2 = ovqVar.j;
                        qgg.h0(obj2);
                        bii biiVar2 = (bii) obj2;
                        if (biiVar2 instanceof aii) {
                            ptq l02 = vq1.l0((SlidesResponseDto) ((aii) biiVar2).a, z2);
                            if (l02 == null) {
                                qj6Var = new nj6(null);
                            } else {
                                qj6Var2 = new qj6(l02);
                                qj6Var = qj6Var2;
                            }
                        } else if (biiVar2 instanceof xhi) {
                            xhi xhiVar2 = (xhi) biiVar2;
                            MusicBackendInvocationError musicBackendInvocationError2 = xhiVar2.c;
                            int i4 = xhiVar2.b;
                            String name2 = musicBackendInvocationError2.getName();
                            String str3 = name2 == null ? "" : name2;
                            String message2 = musicBackendInvocationError2.getMessage();
                            kj6Var = new kj6(i4, musicBackendInvocationError2.getDetails(), str3, message2 == null ? "" : message2, xhiVar2.a);
                            qj6Var = kj6Var;
                        } else if (biiVar2 instanceof yhi) {
                            yhi yhiVar2 = (yhi) biiVar2;
                            qj6Var = new lj6(yhiVar2.b, yhiVar2.c, yhiVar2.a);
                        } else {
                            if (!(biiVar2 instanceof zhi)) {
                                b6e.s();
                                return null;
                            }
                            qj6Var = uwf.J((zhi) biiVar2);
                        }
                        rj6Var = qj6Var;
                        if (rj6Var instanceof qj6) {
                        }
                    case 3:
                        z2 = ovqVar.j;
                        qgg.h0(obj2);
                        bii biiVar3 = (bii) obj2;
                        if (biiVar3 instanceof aii) {
                            ptq l03 = vq1.l0((SlidesResponseDto) ((aii) biiVar3).a, z2);
                            if (l03 == null) {
                                qj6Var = new nj6(null);
                            } else {
                                qj6Var2 = new qj6(l03);
                                qj6Var = qj6Var2;
                            }
                        } else if (biiVar3 instanceof xhi) {
                            xhi xhiVar3 = (xhi) biiVar3;
                            MusicBackendInvocationError musicBackendInvocationError3 = xhiVar3.c;
                            int i5 = xhiVar3.b;
                            String name3 = musicBackendInvocationError3.getName();
                            String str4 = name3 == null ? "" : name3;
                            String message3 = musicBackendInvocationError3.getMessage();
                            kj6Var = new kj6(i5, musicBackendInvocationError3.getDetails(), str4, message3 == null ? "" : message3, xhiVar3.a);
                            qj6Var = kj6Var;
                        } else if (biiVar3 instanceof yhi) {
                            yhi yhiVar3 = (yhi) biiVar3;
                            qj6Var = new lj6(yhiVar3.b, yhiVar3.c, yhiVar3.a);
                        } else {
                            if (!(biiVar3 instanceof zhi)) {
                                b6e.s();
                                return null;
                            }
                            qj6Var = uwf.J((zhi) biiVar3);
                        }
                        rj6Var = qj6Var;
                        if (rj6Var instanceof qj6) {
                        }
                    case 4:
                        z2 = ovqVar.j;
                        qgg.h0(obj2);
                        bii biiVar4 = (bii) obj2;
                        if (biiVar4 instanceof aii) {
                            ptq l04 = vq1.l0((SlidesResponseDto) ((aii) biiVar4).a, z2);
                            if (l04 == null) {
                                qj6Var = new nj6(null);
                            } else {
                                qj6Var2 = new qj6(l04);
                                qj6Var = qj6Var2;
                            }
                        } else if (biiVar4 instanceof xhi) {
                            xhi xhiVar4 = (xhi) biiVar4;
                            MusicBackendInvocationError musicBackendInvocationError4 = xhiVar4.c;
                            int i6 = xhiVar4.b;
                            String name4 = musicBackendInvocationError4.getName();
                            String str5 = name4 == null ? "" : name4;
                            String message4 = musicBackendInvocationError4.getMessage();
                            kj6Var = new kj6(i6, musicBackendInvocationError4.getDetails(), str5, message4 == null ? "" : message4, xhiVar4.a);
                            qj6Var = kj6Var;
                        } else if (biiVar4 instanceof yhi) {
                            yhi yhiVar4 = (yhi) biiVar4;
                            qj6Var = new lj6(yhiVar4.b, yhiVar4.c, yhiVar4.a);
                        } else {
                            if (!(biiVar4 instanceof zhi)) {
                                b6e.s();
                                return null;
                            }
                            qj6Var = uwf.J((zhi) biiVar4);
                        }
                        rj6Var = qj6Var;
                        if (rj6Var instanceof qj6) {
                        }
                    case 5:
                        z2 = ovqVar.j;
                        qgg.h0(obj2);
                        bii biiVar5 = (bii) obj2;
                        if (biiVar5 instanceof aii) {
                            ptq l05 = vq1.l0((SlidesResponseDto) ((aii) biiVar5).a, z2);
                            if (l05 == null) {
                                qj6Var = new nj6(null);
                            } else {
                                qj6Var2 = new qj6(l05);
                                qj6Var = qj6Var2;
                            }
                        } else if (biiVar5 instanceof xhi) {
                            xhi xhiVar5 = (xhi) biiVar5;
                            MusicBackendInvocationError musicBackendInvocationError5 = xhiVar5.c;
                            int i7 = xhiVar5.b;
                            String name5 = musicBackendInvocationError5.getName();
                            String str6 = name5 == null ? "" : name5;
                            String message5 = musicBackendInvocationError5.getMessage();
                            kj6Var = new kj6(i7, musicBackendInvocationError5.getDetails(), str6, message5 == null ? "" : message5, xhiVar5.a);
                            qj6Var = kj6Var;
                        } else if (biiVar5 instanceof yhi) {
                            yhi yhiVar5 = (yhi) biiVar5;
                            qj6Var = new lj6(yhiVar5.b, yhiVar5.c, yhiVar5.a);
                        } else {
                            if (!(biiVar5 instanceof zhi)) {
                                b6e.s();
                                return null;
                            }
                            qj6Var = uwf.J((zhi) biiVar5);
                        }
                        rj6Var = qj6Var;
                        if (rj6Var instanceof qj6) {
                        }
                    case 6:
                        i2 = ovqVar.m;
                        z2 = ovqVar.j;
                        xsqVar = ovqVar.l;
                        rj6Var = ovqVar.k;
                        qgg.h0(obj2);
                        ovqVar.k = rj6Var;
                        ovqVar.l = null;
                        ovqVar.j = z2;
                        ovqVar.m = i2;
                        ovqVar.p = 7;
                        return atnVar.J(xsqVar, ovqVar) != nm6Var ? rj6Var : nm6Var;
                    case 7:
                        rj6 rj6Var2 = ovqVar.k;
                        qgg.h0(obj2);
                        return rj6Var2;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        ovqVar = new ovq(this, cg6Var);
        Object obj22 = ovqVar.n;
        nm6 nm6Var2 = nm6.a;
        int i22 = 0;
        switch (ovqVar.p) {
        }
    }

    @Override // defpackage.srq
    public void a() {
    }

    @Override // defpackage.srq
    public void b() {
    }

    @Override // defpackage.srq
    public void d() {
    }

    @Override // defpackage.srq
    public void onResume() {
    }

    @Override // defpackage.srq
    public void onStop() {
    }

    public sfm(dq8 dq8Var, JSONObject jSONObject, int i) {
        String language = Locale.getDefault().getLanguage();
        language.getClass();
        jSONObject = (i & 4) != 0 ? new JSONObject() : jSONObject;
        this.a = dq8Var;
        this.b = language;
        this.c = jSONObject;
    }

    public sfm(String str, Locale locale) {
        locale.getClass();
        this.a = str;
        this.b = locale;
        this.c = new urm(1, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public sfm(Function1 function1) {
        this.a = (aur) function1;
        this.b = rqi.a();
    }

    public /* synthetic */ sfm(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public sfm() {
        this.a = new AtomicReference(vut.j);
        this.b = new Object();
    }
}
