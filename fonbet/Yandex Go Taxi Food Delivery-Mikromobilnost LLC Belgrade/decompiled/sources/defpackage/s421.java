package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.common.collect.ImmutableList;
import com.ybsdk.feature.webview.api.WebViewHeader;
import flex.engine.a;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.zip.Inflater;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import org.json.JSONArray;
import org.json.JSONObject;
import org.webrtc.MediaStreamTrack;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.rt.ebs.cryptosdk.core.common.entities.models.Token;
import ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage;
import ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationSessionController;
import ru.rt.ebs.cryptosdk.core.verificationFlow.di.IVerificationSessionComponent;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.VerificationRequestScheme;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.VerificationResult;
import yads.hm2;
import yads.q63;
import yads.r0;
import yads.vd2;

/* loaded from: classes7.dex */
public final class s421 implements q3l0, IVerificationSessionComponent, q2v0, rt41, oq41, sf81, cz71, s191, io71 {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;
    public Object w;
    public Object x;

    public s421(List list) {
        int i;
        this.a = 6;
        this.b = new ef90();
        this.c = new ef90();
        hy31 hy31Var = new hy31();
        this.w = hy31Var;
        String trim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        int i2 = tw21.a;
        for (String str : trim.split("\\r?\\n", -1)) {
            if (str.startsWith("palette: ")) {
                String[] split = str.substring(9).split(",", -1);
                hy31Var.d = new int[split.length];
                for (int i3 = 0; i3 < split.length; i3++) {
                    int[] iArr = hy31Var.d;
                    try {
                        i = Integer.parseInt(split[i3].trim(), 16);
                    } catch (RuntimeException unused) {
                        i = 0;
                    }
                    iArr[i3] = i;
                }
            } else if (str.startsWith("size: ")) {
                String[] split2 = str.substring(6).trim().split(RemoteBioParameters.X, -1);
                if (split2.length == 2) {
                    try {
                        hy31Var.e = Integer.parseInt(split2[0]);
                        hy31Var.f = Integer.parseInt(split2[1]);
                        hy31Var.b = true;
                    } catch (RuntimeException e) {
                        lk91.k("Parsing IDX failed", e);
                    }
                }
            }
        }
    }

    public static pil0 g(pil0 pil0Var) {
        long j = pil0Var.d;
        long j2 = pil0Var.e;
        return (j == j && j2 == j2) ? pil0Var : new pil0(pil0Var.a, pil0Var.b, (qd81) pil0Var.f, pil0Var.c, pil0Var.g, j, j2);
    }

    @Override // defpackage.s191
    public Object a(JSONObject jSONObject) {
        lg71 lg71Var;
        ArrayList arrayList;
        il81 il81Var;
        w97 w97Var;
        l9s l9sVar;
        Object failure;
        li61 y191Var;
        if (!jSONObject.has("value") || jSONObject.isNull("value")) {
            yx61.e("Native Ad json has not required attributes");
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("value");
        nr41 nr41Var = (nr41) this.b;
        if (!jSONObject2.has("media") || jSONObject2.isNull("media")) {
            lg71Var = null;
        } else {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("media");
            nr41Var.getClass();
            float f = (float) jSONObject3.getDouble("aspectRatio");
            if (f == 0.0f) {
                f = 1.7777778f;
            }
            try {
                y191Var = new kv81(((vh81) nr41Var.b).a("html", jSONObject3));
            } catch (Exception e) {
                String optString = jSONObject3.optString("htmlUrl");
                if (optString.length() == 0) {
                    optString = null;
                }
                if (optString == null) {
                    throw e;
                }
                y191Var = new y191(optString);
            }
            lg71Var = new lg71(y191Var, f);
        }
        JSONArray optJSONArray = jSONObject2.optJSONArray("images");
        if (optJSONArray != null) {
            p271 p271Var = (p271) this.x;
            p271Var.getClass();
            arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(p271Var.a.a(optJSONArray.getJSONObject(i)));
            }
        } else {
            arrayList = null;
        }
        cu81 a = (!jSONObject2.has("image") || jSONObject2.isNull("image")) ? null : ((w081) this.w).a(jSONObject2.getJSONObject("image"));
        if ((arrayList == null || arrayList.isEmpty()) && a != null) {
            arrayList = scc.i(a);
        }
        vmn0 vmn0Var = (vmn0) this.c;
        if (jSONObject2.has(MediaStreamTrack.VIDEO_TRACK_KIND) && !jSONObject2.isNull(MediaStreamTrack.VIDEO_TRACK_KIND)) {
            JSONObject jSONObject4 = jSONObject2.getJSONObject(MediaStreamTrack.VIDEO_TRACK_KIND);
            try {
                w97Var = ((rr41) vmn0Var.w).h(((vh81) vmn0Var.b).a("vast", jSONObject4), (zy2) vmn0Var.a);
            } catch (Exception unused) {
                w97Var = null;
            }
            if (w97Var != null) {
                ArrayList arrayList2 = w97Var.b;
                if (!arrayList2.isEmpty()) {
                    JSONObject optJSONObject = jSONObject4.optJSONObject("settings");
                    if (optJSONObject != null) {
                        ((xv71) vmn0Var.x).getClass();
                        boolean optBoolean = optJSONObject.optBoolean("volumeControlVisible", true);
                        boolean optBoolean2 = optJSONObject.optBoolean("isProgressBarHidden", false);
                        try {
                            failure = Double.valueOf(optJSONObject.getDouble("initialVolume"));
                        } catch (Throwable th) {
                            failure = new Result.Failure(th);
                        }
                        if (failure instanceof Result.Failure) {
                            failure = null;
                        }
                        l9sVar = new l9s(optBoolean, optBoolean2, (Double) failure);
                    } else {
                        l9sVar = null;
                    }
                    ArrayList b = ((vi71) vmn0Var.c).b(arrayList2);
                    if (b.isEmpty()) {
                        yx61.e("Invalid VAST in response");
                        return null;
                    }
                    JSONObject optJSONObject2 = jSONObject4.optJSONObject("preview");
                    il81Var = new il81(b, l9sVar, optJSONObject2 != null ? ((w081) vmn0Var.y).a(optJSONObject2) : null);
                }
            }
            yx61.e("Invalid VAST in response");
            return null;
        }
        il81Var = null;
        if (lg71Var != null || ((arrayList != null && !arrayList.isEmpty()) || il81Var != null)) {
            return new d171(lg71Var, il81Var, arrayList != null ? new ArrayList(arrayList) : null);
        }
        yx61.e("Native Ad json has not required attributes");
        return null;
    }

    @Override // defpackage.q2v0
    public void b(byte[] bArr, int i, int i2, p2v0 p2v0Var, c9e c9eVar) {
        Rect rect;
        ef90 ef90Var = (ef90) this.b;
        ef90Var.I(i + i2, bArr);
        ef90Var.K(i);
        ef90 ef90Var2 = (ef90) this.c;
        hy31 hy31Var = (hy31) this.w;
        if (((Inflater) this.x) == null) {
            this.x = new Inflater();
        }
        Inflater inflater = (Inflater) this.x;
        int i3 = tw21.a;
        if (ef90Var.a() > 0 && ef90Var.h() == 120 && tw21.P(ef90Var, ef90Var2, inflater)) {
            ef90Var.I(ef90Var2.c, ef90Var2.a);
        }
        hy31Var.c = false;
        odf odfVar = null;
        hy31Var.g = null;
        hy31Var.h = -1;
        hy31Var.i = -1;
        int a = ef90Var.a();
        if (a >= 2 && ef90Var.E() == a) {
            int[] iArr = hy31Var.d;
            if (iArr != null && hy31Var.b) {
                ef90Var.L(ef90Var.E() - 2);
                int E = ef90Var.E();
                int[] iArr2 = hy31Var.a;
                while (ef90Var.b < E && ef90Var.a() > 0) {
                    switch (ef90Var.y()) {
                        case 3:
                            if (ef90Var.a() < 2) {
                                break;
                            } else {
                                int y = ef90Var.y();
                                int y2 = ef90Var.y();
                                iArr2[3] = hy31.a(y >> 4, iArr);
                                iArr2[2] = hy31.a(y & 15, iArr);
                                iArr2[1] = hy31.a(y2 >> 4, iArr);
                                iArr2[0] = hy31.a(y2 & 15, iArr);
                                hy31Var.c = true;
                            }
                        case 4:
                            if (ef90Var.a() >= 2 && hy31Var.c) {
                                int y3 = ef90Var.y();
                                int y4 = ef90Var.y();
                                iArr2[3] = hy31.c(iArr2[3], y3 >> 4);
                                iArr2[2] = hy31.c(iArr2[2], y3 & 15);
                                iArr2[1] = hy31.c(iArr2[1], y4 >> 4);
                                iArr2[0] = hy31.c(iArr2[0], y4 & 15);
                            }
                            break;
                        case 5:
                            if (ef90Var.a() < 6) {
                                break;
                            } else {
                                int y5 = ef90Var.y();
                                int y6 = ef90Var.y();
                                int i4 = (y5 << 4) | (y6 >> 4);
                                int y7 = ((y6 & 15) << 8) | ef90Var.y();
                                int y8 = ef90Var.y();
                                int y9 = ef90Var.y();
                                hy31Var.g = new Rect(i4, (y8 << 4) | (y9 >> 4), y7 + 1, (((y9 & 15) << 8) | ef90Var.y()) + 1);
                            }
                        case 6:
                            if (ef90Var.a() < 4) {
                                break;
                            } else {
                                hy31Var.h = ef90Var.E();
                                hy31Var.i = ef90Var.E();
                            }
                    }
                }
            }
            if (hy31Var.d != null && hy31Var.b && hy31Var.c && (rect = hy31Var.g) != null && hy31Var.h != -1 && hy31Var.i != -1 && rect.width() >= 2 && hy31Var.g.height() >= 2) {
                Rect rect2 = hy31Var.g;
                int[] iArr3 = new int[rect2.height() * rect2.width()];
                df90 df90Var = new df90();
                ef90Var.K(hy31Var.h);
                df90Var.l(ef90Var);
                hy31Var.b(df90Var, true, rect2, iArr3);
                ef90Var.K(hy31Var.i);
                df90Var.l(ef90Var);
                hy31Var.b(df90Var, false, rect2, iArr3);
                Bitmap createBitmap = Bitmap.createBitmap(iArr3, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
                ndf ndfVar = new ndf();
                ndfVar.b = createBitmap;
                ndfVar.h = rect2.left / hy31Var.e;
                ndfVar.i = 0;
                ndfVar.e = rect2.top / hy31Var.f;
                ndfVar.f = 0;
                ndfVar.g = 0;
                ndfVar.l = rect2.width() / hy31Var.e;
                ndfVar.m = rect2.height() / hy31Var.f;
                odfVar = ndfVar.a();
            }
        }
        c9eVar.accept(new tdf(odfVar != null ? ImmutableList.r(odfVar) : ImmutableList.p(), -9223372036854775807L, 5000000L));
    }

    @Override // defpackage.sf81
    public void c(int i, v281 v281Var, nl81 nl81Var, pil0 pil0Var) {
        if (o(i, v281Var)) {
            ((sc81) this.c).f(nl81Var, g(pil0Var));
        }
    }

    @Override // defpackage.q3l0
    public o3l0 e(ou ouVar) {
        return new o331((w030) this.b, (Context) this.c, (a) ouVar.invoke(), (i331) this.w, (i3m) this.x);
    }

    @Override // defpackage.q2v0
    public int f() {
        return 2;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.di.IVerificationSessionComponent
    public IVerificationSessionController getVerificationSessionController() {
        hwo0 hwo0Var = (hwo0) this.b;
        y831 y831Var = (y831) this.x;
        if (y831Var != null) {
            return y831Var;
        }
        IKeyStorage memoryKeyStorage = hwo0Var.memoryKeyStorage(((mpe) this.w).i);
        y831 y831Var2 = new y831(new c1x0(memoryKeyStorage), hwo0Var.getKeyStorageManager(), ((an8) this.c).getCommonController());
        this.x = y831Var2;
        return y831Var2;
    }

    @Override // defpackage.io71
    public Object h(View view, xh71 xh71Var, r0 r0Var) {
        tp81 tp81Var = (tp81) xh71Var;
        for (String str : tp81Var.b()) {
            pb81 pb81Var = (pb81) this.w;
            q63 q63Var = q63.b;
            ExecutorService executorService = pb81.d;
            pb81Var.a(str, q63Var, b.f());
        }
        if (tp81Var instanceof m671) {
            ((ro81) this.b).b(view, (m671) tp81Var);
        } else if (tp81Var instanceof dc81) {
            ep81 ep81Var = (ep81) this.c;
            Context context = view.getContext();
            dc81 dc81Var = (dc81) tp81Var;
            if (!ep81.d) {
                ep81Var.a(ep81Var.b.w(context, dc81Var));
            }
        }
        vmn0 vmn0Var = (vmn0) this.x;
        ((ge71) vmn0Var.w).c(vmn0Var.b(hm2.i, new HashMap()));
        return new b391(false);
    }

    public List i(String str, boolean z) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            d6w n = y6i0.n(0, jSONArray.length());
            ArrayList arrayList = new ArrayList();
            c6w it = n.iterator();
            while (it.c) {
                ap81 a = ((pp61) this.w).a(jSONArray.getJSONObject(it.nextInt()));
                if (a != null) {
                    arrayList.add(a);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ld71 c = ((fp71) this.x).c((ap81) it2.next(), z);
                if (c != null) {
                    arrayList2.add(c);
                }
            }
            arrayList2.size();
            return arrayList2;
        } catch (Exception e) {
            ((ge71) this.b).d("Failed to parse DivKit designs JSON array", e);
            return EmptyList.a;
        }
    }

    public void j(String str) {
        Object obj;
        hn71 a = ((f571) this.x).a((fe81) this.c, (d881) this.w);
        Map map = (Map) a.b;
        vd2 vd2Var = (vd2) fs81.a.getValue();
        if (vd2Var != null) {
            int ordinal = vd2Var.ordinal();
            if (ordinal == 0) {
                obj = PluginErrorDetails.Platform.FLUTTER;
            } else if (ordinal == 1) {
                obj = "react-native";
            } else {
                if (ordinal != 2) {
                    w511.b();
                    return;
                }
                obj = PluginErrorDetails.Platform.UNITY;
            }
        } else {
            obj = map.get("plugin_type");
        }
        LinkedHashMap n = b.n(map, b.i(new Pair("activity_event", str), new Pair("plugin_type", obj)));
        ((ge71) this.b).c(new zj71("activity_action", new LinkedHashMap(n), (no61) a.c));
    }

    @Override // defpackage.sf81
    public void k(int i, v281 v281Var, nl81 nl81Var, pil0 pil0Var) {
        if (o(i, v281Var)) {
            ((sc81) this.c).c(nl81Var, g(pil0Var));
        }
    }

    @Override // defpackage.rt41
    public void l() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 8:
                gl.r((gl) obj, ((SslError) ((zch) ((ti51) this.c)).a).getUrl(), null, "Web 3DS view SSL error recovered by NUC", null, null, null, Boolean.TRUE, null, null, 888);
                ui51 ui51Var = (ui51) this.w;
                if (ui51Var != null) {
                    ((zmf) ui51Var).a.proceed();
                    break;
                }
                break;
            default:
                nl91.g(((SslError) ((zch) ((ti51) obj)).a).getUrl(), null, "Web view SSL error recovered by NUC", null, null, null, null, Boolean.TRUE, null, null, 1912);
                ui51 ui51Var2 = (ui51) this.c;
                if (ui51Var2 != null) {
                    ((zmf) ui51Var2).a.proceed();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.sf81
    public void m(int i, v281 v281Var, nl81 nl81Var, pil0 pil0Var) {
        if (o(i, v281Var)) {
            ((sc81) this.c).g(nl81Var, g(pil0Var));
        }
    }

    @Override // defpackage.sf81
    public void n(int i, v281 v281Var, nl81 nl81Var, pil0 pil0Var, IOException iOException, boolean z) {
        if (o(i, v281Var)) {
            ((sc81) this.c).d(nl81Var, g(pil0Var), iOException, z);
        }
    }

    public boolean o(int i, v281 v281Var) {
        v281 v281Var2;
        int i2;
        i571 i571Var = (i571) this.x;
        if (v281Var != null) {
            v281Var2 = i571Var.f(this.b, v281Var);
            if (v281Var2 == null) {
                return false;
            }
        } else {
            v281Var2 = null;
        }
        v281 v281Var3 = v281Var2;
        sc81 sc81Var = (sc81) this.c;
        if (sc81Var.a == i && rf71.o(sc81Var.b, v281Var3)) {
            i2 = i;
        } else {
            i2 = i;
            this.c = new sc81(i571Var.c.c, i2, v281Var3, 0L);
        }
        cw71 cw71Var = (cw71) this.w;
        if (cw71Var.a == i2 && rf71.o(cw71Var.b, v281Var3)) {
            return true;
        }
        this.w = new cw71(i571Var.d.c, i2, v281Var3);
        return true;
    }

    @Override // defpackage.rt41
    public void onCanceled() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 8:
                gl glVar = (gl) obj;
                boolean z = glVar.a;
                ui51 ui51Var = (ui51) this.w;
                if (z) {
                    if (ui51Var != null) {
                        ((zmf) ui51Var).a.proceed();
                    }
                } else if (ui51Var != null) {
                    ((zmf) ui51Var).a.cancel();
                }
                glVar.m((ti51) this.c, (aj51) this.x);
                break;
            default:
                ui51 ui51Var2 = (ui51) this.c;
                if (ui51Var2 != null) {
                    ((zmf) ui51Var2).a.cancel();
                }
                ((com.ybsdk.feature.webview.internal.presentation.a) this.w).a((ti51) obj, (aj51) this.x);
                break;
        }
    }

    public synchronized String[] p() {
        try {
            if (((String[]) this.c) == null) {
                this.c = new String[((ArrayList) this.b).size()];
                Iterator it = ((ArrayList) this.b).iterator();
                int i = 0;
                while (it.hasNext()) {
                    ((String[]) this.c)[i] = ((or61) it.next()).c;
                    i++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String[]) ((String[]) this.c).clone();
    }

    public String q(WebViewHeader webViewHeader) {
        int i = sp41.a[webViewHeader.ordinal()];
        if (i == 1) {
            return ((gff) this.b).f;
        }
        if (i == 2) {
            String str = ((com.ybsdk.common.repositiories.auth.b) this.c).d;
            if (str != null) {
                return "Bearer ".concat(str);
            }
            return null;
        }
        if (i == 3) {
            return ((sw51) this.w).a();
        }
        if (i == 4) {
            return ((wop0) this.x).a();
        }
        w511.b();
        return null;
    }

    public String r(pex0 pex0Var) {
        int b = ((ore) this.c).b(pex0Var);
        if (b > 1) {
            return (String) ((i3y) this.x).getValue();
        }
        if (b == 1) {
            return (String) ((i3y) this.w).getValue();
        }
        return null;
    }

    @Override // ru.rt.ebs.cryptosdk.core.common.entities.models.IComponent
    public void release() {
        ((hwo0) this.b).removeStorage(((mpe) this.w).i);
        this.x = null;
    }

    @Override // defpackage.sf81
    public void s(int i, v281 v281Var, pil0 pil0Var) {
        if (o(i, v281Var)) {
            ((sc81) this.c).b(g(pil0Var));
        }
    }

    public String toString() {
        switch (this.a) {
            case 17:
                return ((ArrayList) this.b).toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.sf81
    public void u(int i, v281 v281Var, pil0 pil0Var) {
        if (o(i, v281Var)) {
            ((sc81) this.c).e(g(pil0Var));
        }
    }

    public s421(String[] strArr) {
        this.a = 17;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                or61 b = or61.b(str);
                if (!arrayList.contains(b)) {
                    arrayList.add(b);
                }
            }
            this.b = arrayList;
            if (arrayList.size() == 1 && arrayList.contains(or61.x)) {
                ny61.g("SSLv2Hello cannot be enabled unless at least one other supported version is also enabled.");
                throw null;
            }
            if (arrayList.size() == 0) {
                or61 or61Var = or61.w;
                this.w = or61Var;
                this.x = or61Var;
                return;
            } else {
                Collections.sort(arrayList);
                this.w = (or61) arrayList.get(0);
                this.x = (or61) unr0.k(1, arrayList);
                return;
            }
        }
        ny61.g("Protocols may not be null");
        throw null;
    }

    public s421(z831 z831Var, hwo0 hwo0Var, an8 an8Var, mpe mpeVar) {
        this.a = 5;
        this.b = hwo0Var;
        this.c = an8Var;
        this.w = mpeVar;
    }

    public s421(Context context, int i) {
        ys81 ys81Var;
        this.a = i;
        switch (i) {
            case 29:
                lt71 lt71Var = new lt71();
                cu71 cu71Var = new cu71();
                mx71 mx71Var = new mx71();
                this.b = lt71Var;
                this.c = cu71Var;
                this.w = mx71Var;
                this.x = context.getApplicationContext();
                return;
            default:
                this.b = context.getApplicationContext();
                this.c = dda1.g(context);
                ys81 ys81Var2 = ys81.b;
                if (ys81Var2 == null) {
                    synchronized (ys81.a) {
                        ys81Var = ys81.b;
                        if (ys81Var == null) {
                            ys81Var = new ys81();
                            ys81.b = ys81Var;
                        }
                    }
                    ys81Var2 = ys81Var;
                }
                this.w = ys81Var2;
                this.x = dha1.f();
                return;
        }
    }

    public s421(Context context, e971 e971Var, i971 i971Var, wo71 wo71Var, v981 v981Var, fe81 fe81Var) {
        this.a = 25;
        Context applicationContext = context.getApplicationContext();
        tpq0 tpq0Var = new tpq0(applicationContext, e971Var, i971Var, wo71Var, v981Var, fe81Var);
        u371 u371Var = new u371();
        this.b = applicationContext;
        this.c = tpq0Var;
        this.w = u371Var;
        this.x = new ArrayList();
    }

    public s421(Context context, ge71 ge71Var, zy2 zy2Var) {
        this.a = 19;
        nr41 nr41Var = new nr41(zy2Var.a);
        vmn0 vmn0Var = new vmn0(context, ge71Var, zy2Var);
        w081 w081Var = new w081();
        p271 p271Var = new p271();
        this.b = nr41Var;
        this.c = vmn0Var;
        this.w = w081Var;
        this.x = p271Var;
    }

    public s421(Context context, ge71 ge71Var, nr41 nr41Var) {
        this.a = 23;
        sf71 sf71Var = new sf71();
        this.b = nr41Var;
        this.c = sf71Var;
        this.w = new xf81();
        this.x = new lm71(context, ge71Var);
    }

    public s421(Context context, fe81 fe81Var, v981 v981Var, e971 e971Var, nn81 nn81Var) {
        this.a = 14;
        Handler handler = new Handler(Looper.getMainLooper());
        xrr xrrVar = new xrr(context, fe81Var, e971Var, v981Var);
        this.b = nn81Var;
        this.c = handler;
        this.w = xrrVar;
    }

    public s421(Context context, fe81 fe81Var, v981 v981Var, d881 d881Var) {
        this.a = 16;
        this.b = fe81Var;
        this.c = v981Var;
        this.w = d881Var;
        Context applicationContext = context.getApplicationContext();
        this.x = applicationContext != null ? applicationContext : context;
    }

    public s421(yp61 yp61Var, hlx0 hlx0Var, vk81 vk81Var) {
        this.a = 27;
        sl81 sl81Var = new sl81(vk81Var);
        this.b = yp61Var;
        this.c = hlx0Var;
        this.w = sl81Var;
        this.x = new a441(this);
    }

    public s421(i571 i571Var, Object obj) {
        this.a = 18;
        this.x = i571Var;
        this.c = new sc81(i571Var.c.c, 0, null, 0L);
        this.w = new cw71(i571Var.d.c, 0, null);
        this.b = obj;
    }

    public s421(ge71 ge71Var) {
        this.a = 28;
        xf81 xf81Var = new xf81();
        pp61 pp61Var = new pp61();
        fp71 fp71Var = new fp71(ge71Var);
        this.b = ge71Var;
        this.c = xf81Var;
        this.w = pp61Var;
        this.x = fp71Var;
    }

    public s421(ge71 ge71Var, fe81 fe81Var, d881 d881Var) {
        this.a = 15;
        f571 f571Var = new f571();
        this.b = ge71Var;
        this.c = fe81Var;
        this.w = d881Var;
        this.x = f571Var;
    }

    public s421(wx71 wx71Var, boolean[] zArr) {
        this.a = 26;
        this.b = wx71Var;
        this.c = zArr;
        int i = wx71Var.a;
        this.w = new boolean[i];
        this.x = new boolean[i];
    }

    public s421(z581 z581Var) {
        mp71 mp71Var;
        this.a = 20;
        mp71 mp71Var2 = mp71.e;
        if (mp71Var2 == null) {
            synchronized (mp71.d) {
                mp71Var = mp71.e;
                if (mp71Var == null) {
                    mp71Var = new mp71();
                    mp71.e = mp71Var;
                }
            }
            mp71Var2 = mp71Var;
        }
        Executor a = mp71Var2.a();
        rr41 rr41Var = new rr41(z581Var);
        new en61();
        aj31 aj31Var = new aj31(19, z581Var);
        xs81 xs81Var = new xs81();
        this.b = a;
        this.c = rr41Var;
        this.w = aj31Var;
        this.x = xs81Var;
    }

    public s421(VerificationRequestScheme verificationRequestScheme, VerificationResult.Empty empty, Token token) {
        this.a = 4;
        this.b = verificationRequestScheme;
        this.c = empty;
        this.w = token;
        this.x = null;
    }

    public s421(fe81 fe81Var, v981 v981Var) {
        this.a = 21;
        x781 x781Var = new x781();
        jc71 jc71Var = new jc71();
        this.b = fe81Var;
        this.c = v981Var;
        this.w = x781Var;
        this.x = jc71Var;
    }

    public s421(zuj0 zuj0Var, ore oreVar) {
        final int i = 1;
        this.a = 1;
        this.b = zuj0Var;
        this.c = oreVar;
        final int i2 = 0;
        this.w = kotlin.a.a(new sls(this) { // from class: y421
            public final /* synthetic */ s421 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                s421 s421Var = this.b;
                switch (i3) {
                    case 0:
                        return ((avj0) ((zuj0) s421Var.b)).h(kyh0.summary_remove_unknown_requirement);
                    default:
                        return ((avj0) ((zuj0) s421Var.b)).h(kyh0.summary_remove_unknown_requirements);
                }
            }
        });
        this.x = kotlin.a.a(new sls(this) { // from class: y421
            public final /* synthetic */ s421 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i;
                s421 s421Var = this.b;
                switch (i3) {
                    case 0:
                        return ((avj0) ((zuj0) s421Var.b)).h(kyh0.summary_remove_unknown_requirement);
                    default:
                        return ((avj0) ((zuj0) s421Var.b)).h(kyh0.summary_remove_unknown_requirements);
                }
            }
        });
    }

    public /* synthetic */ s421(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
    }
}
