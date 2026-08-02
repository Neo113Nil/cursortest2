package defpackage;

import android.graphics.Bitmap;
import android.util.Base64;
import android.util.Log;
import android.webkit.SslErrorHandler;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.connectsdk.device.ConnectableDevice;
import com.yandex.payment.sdk.ui.view.card.CardNumberInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.a;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Response;
import ru.yandex.video.m3.player.tracks.TrackType;

/* loaded from: classes4.dex */
public final class nnd implements x7o, fnr, ccg, fw6, zfv, adu, w2q, r03, bgn, cmr, os3, t2c {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    public nnd(int i) {
        this.a = i;
        switch (i) {
            case 14:
                this.b = new eqi(new mpf[16]);
                break;
            case 29:
                this.b = l18.b.b(hag.I(f1p.class), true);
                break;
            default:
                this.b = new tpi();
                this.c = new tpi();
                break;
        }
    }

    public static JSONObject J(nnd nndVar, b0i b0iVar, JSONObject jSONObject, String str) {
        JSONObject H = nndVar.H(b0iVar, str, null);
        if (jSONObject != null) {
            H.put("data", jSONObject);
        }
        return H;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [xci] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [xci] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [eqi] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [eqi] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void u(mpf mpfVar) {
        if (mpfVar.G.d == ipf.e && !mpfVar.q() && !mpfVar.r() && !mpfVar.v0 && mpfVar.H()) {
            xci xciVar = (xci) mpfVar.F.f;
            if ((xciVar.d & 256) != 0) {
                while (xciVar != null) {
                    if ((xciVar.c & 256) != 0) {
                        cw7 cw7Var = xciVar;
                        ?? r5 = 0;
                        while (cw7Var != 0) {
                            if (cw7Var instanceof amd) {
                                amd amdVar = (amd) cw7Var;
                                amdVar.G(bcx.D(amdVar, 256));
                            } else if ((cw7Var.c & 256) != 0 && (cw7Var instanceof cw7)) {
                                xci xciVar2 = cw7Var.p;
                                int i = 0;
                                cw7Var = cw7Var;
                                r5 = r5;
                                while (xciVar2 != null) {
                                    if ((xciVar2.c & 256) != 0) {
                                        i++;
                                        r5 = r5;
                                        if (i == 1) {
                                            cw7Var = xciVar2;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new eqi(new xci[16]);
                                            }
                                            if (cw7Var != 0) {
                                                r5.d(cw7Var);
                                                cw7Var = 0;
                                            }
                                            r5.d(xciVar2);
                                        }
                                    }
                                    xciVar2 = xciVar2.f;
                                    cw7Var = cw7Var;
                                    r5 = r5;
                                }
                                if (i == 1) {
                                }
                            }
                            cw7Var = bcx.p(r5);
                        }
                    }
                    if ((xciVar.d & 256) == 0) {
                        break;
                    } else {
                        xciVar = xciVar.f;
                    }
                }
            }
        }
        mpfVar.Z = false;
        eqi y = mpfVar.y();
        Object[] objArr = y.a;
        int i2 = y.c;
        for (int i3 = 0; i3 < i2; i3++) {
            u((mpf) objArr[i3]);
        }
    }

    @Override // defpackage.os3
    public void A(Call call, Throwable th) {
        call.getClass();
        zt3 zt3Var = (zt3) this.b;
        r7o r7oVar = z7o.b;
        zt3Var.resumeWith(new zhi(call.a().a.i, th));
    }

    public boolean C(List list, String str, int i, n43 n43Var, String str2, cok cokVar) {
        int i2;
        List o0 = CollectionsKt.o0(list, new ze0(4, new d6h(11)));
        ArrayList arrayList = new ArrayList(v75.o(o0, 10));
        Iterator it = o0.iterator();
        while (it.hasNext()) {
            arrayList.add(((dok) it.next()).a);
        }
        String str3 = i + "_";
        StringBuilder sb = new StringBuilder();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
        }
        byte[] bytes = sb.toString().getBytes(Charsets.UTF_8);
        bytes.getClass();
        int length = bytes.length;
        get getVar = het.b;
        int i3 = 345647456 ^ length;
        int i4 = 0;
        while (true) {
            i2 = length - i4;
            if (i2 < 4) {
                break;
            }
            int i5 = (bytes[i4] | (bytes[i4 + 1] << 8) | (bytes[i4 + 2] << 16) | (bytes[i4 + 3] << 24)) * 1540483477;
            i3 = (i3 * 1540483477) ^ ((i5 ^ (i5 >>> 24)) * 1540483477);
            i4 += 4;
        }
        if (i2 >= 3) {
            i3 ^= bytes[i4 + 2] << 16;
        }
        if (i2 >= 2) {
            i3 ^= bytes[i4 + 1] << 8;
        }
        if (i2 >= 1) {
            i3 = (bytes[i4] ^ i3) * 1540483477;
        }
        int i6 = ((i3 >>> 13) ^ i3) * 1540483477;
        String n = ouj.n(str3, het.a(i6 ^ (i6 >>> 15)));
        if (n.equals(str)) {
            return false;
        }
        cokVar.b.add(n43Var);
        if (!cokVar.a.contains(n43Var)) {
            cokVar.c.add(n43Var);
        }
        y9w.V(null, new ye(n43Var, str2, n, str, 28));
        return true;
    }

    @Override // defpackage.os3
    public void D(Call call, Response response) {
        call.getClass();
        zt3 zt3Var = (zt3) this.b;
        Class cls = (Class) this.c;
        l3o l3oVar = response.a;
        String str = l3oVar.c;
        int i = l3oVar.d;
        d0o d0oVar = l3oVar.a;
        if (!l3oVar.b()) {
            String str2 = d0oVar.a.i;
            str.getClass();
            yhi yhiVar = new yhi(str2, i, str);
            r7o r7oVar = z7o.b;
            zt3Var.resumeWith(yhiVar);
            return;
        }
        Object obj = response.b;
        if (cls.isAssignableFrom(Unit.class)) {
            r7o r7oVar2 = z7o.b;
            zt3Var.resumeWith(new aii(Unit.a, null));
        } else {
            if (obj != null) {
                r7o r7oVar3 = z7o.b;
                zt3Var.resumeWith(new aii(obj, null));
                return;
            }
            String str3 = d0oVar.a.i;
            str.getClass();
            yhi yhiVar2 = new yhi(str3, i, str);
            r7o r7oVar4 = z7o.b;
            zt3Var.resumeWith(yhiVar2);
        }
    }

    public JSONObject H(b0i b0iVar, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("channelId", (String) this.c);
        if (str == null) {
            str = hld.C();
        }
        jSONObject.put(ConnectableDevice.KEY_ID, str);
        jSONObject.put("type", b0iVar.a);
        if (str2 != null) {
            jSONObject.put("refId", str2);
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        if (((defpackage.bcg) r5) != null) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.ccg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object I(Continuation continuation) {
        dcg dcgVar;
        int i;
        if (continuation instanceof dcg) {
            dcgVar = (dcg) continuation;
            int i2 = dcgVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dcgVar.l = i2 - Integer.MIN_VALUE;
                Object obj = dcgVar.j;
                nm6 nm6Var = nm6.a;
                i = dcgVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ou7 ou7Var = (ou7) this.c;
                    if (ou7Var != null) {
                        dcgVar.l = 1;
                        obj = ou7Var.s(dcgVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    }
                    dfi.r("ListSDK is not initialized", "ListSDK");
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
            }
        }
        dcgVar = new dcg(this, (cg6) continuation);
        Object obj2 = dcgVar.j;
        nm6 nm6Var2 = nm6.a;
        i = dcgVar.l;
        if (i != 0) {
        }
    }

    @Override // defpackage.t2c
    public void K() {
        wio wioVar = (wio) this.c;
        wioVar.b.post(new tio(wioVar, 0));
    }

    @Override // defpackage.t2c
    public azs M(int i, int i2) {
        return (zno) this.b;
    }

    public void N(pxm pxmVar, t0p t0pVar, boolean z) {
        Pair pair;
        Pair pair2;
        v().d = pxmVar;
        v().g = t0pVar;
        f1p v = v();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
        e1p e1pVar = null;
        v.e = (concurrentHashMap == null || (pair2 = (Pair) concurrentHashMap.get(pxmVar)) == null) ? null : (Integer) pair2.a;
        f1p v2 = v();
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) this.c;
        if (concurrentHashMap2 != null && (pair = (Pair) concurrentHashMap2.get(pxmVar)) != null) {
            e1pVar = (e1p) pair.b;
        }
        v2.f = e1pVar;
        v().h = Boolean.valueOf(z);
        v().a();
    }

    @Override // defpackage.ccg
    public bcg O() {
        ou7 ou7Var = (ou7) this.c;
        if (ou7Var == null) {
            dfi.r("deferredManager is null, most likely you forgot to call the init method", "ListSDK");
            return null;
        }
        if (ou7Var.X()) {
            return (bcg) ou7Var.C();
        }
        dfi.r("ListSDK is not ready to get", "ListSDK");
        return null;
    }

    public void P(pxm pxmVar, boolean z) {
        Pair pair;
        Pair pair2;
        v().d = pxmVar;
        f1p v = v();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
        e1p e1pVar = null;
        v.e = (concurrentHashMap == null || (pair2 = (Pair) concurrentHashMap.get(pxmVar)) == null) ? null : (Integer) pair2.a;
        f1p v2 = v();
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) this.c;
        if (concurrentHashMap2 != null && (pair = (Pair) concurrentHashMap2.get(pxmVar)) != null) {
            e1pVar = (e1p) pair.b;
        }
        v2.f = e1pVar;
        v().h = Boolean.valueOf(z);
    }

    public void Q(fgb fgbVar, gzn gznVar) {
        String str;
        if (fgbVar instanceof bgb) {
            str = "STREAM_ERROR_INITIAL_BUFFERING";
        } else if (fgbVar instanceof cgb) {
            str = "STREAM_ERROR_PLAYING";
        } else if (fgbVar instanceof dgb) {
            str = "TRACK_ERROR_INITIAL_BUFFERING2";
        } else {
            if (!(fgbVar instanceof egb)) {
                b6e.s();
                return;
            }
            str = "TRACK_ERROR_PLAYING2";
        }
        qdc qdcVar = (qdc) this.b;
        mib mibVar = (mib) ((jyr) qdcVar.b).getValue();
        p3i p3iVar = new p3i(450);
        p3iVar.e("allowPreheatWithoutCrossfade", ((Boolean) ((sgl) qdcVar.c).a.a).booleanValue());
        gznVar.d(p3iVar);
        LinkedHashMap a = p3iVar.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(a.size()));
        for (Map.Entry entry : a.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((t3i) entry.getValue()).getValue());
        }
        mibVar.b(str, linkedHashMap);
    }

    public void S(fgb fgbVar, IOException iOException, agb agbVar) {
        ews Y = c9g.Y(fgbVar);
        dxb w = c9g.w(fgbVar);
        String str = null;
        if (!(fgbVar instanceof bgb) && !(fgbVar instanceof cgb)) {
            if (fgbVar instanceof dgb) {
                str = ((dgb) fgbVar).c;
            } else {
                if (!(fgbVar instanceof egb)) {
                    b6e.s();
                    return;
                }
                str = ((egb) fgbVar).d;
            }
        }
        Q(fgbVar, saf.V(Y, w, eob.a(iOException, str), agbVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r15v0, types: [c5b] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r17v0, types: [nnd] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object T(a53 a53Var, cok cokVar, yqk yqkVar, cg6 cg6Var) {
        fok fokVar;
        int i;
        cok cokVar2;
        Iterator it;
        Map map;
        l43 l43Var;
        cok cokVar3;
        yqk yqkVar2;
        fok fokVar2;
        ?? r15;
        fok fokVar3;
        if (cg6Var instanceof fok) {
            fokVar = (fok) cg6Var;
            int i2 = fokVar.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fokVar.q = i2 - Integer.MIN_VALUE;
                Object obj = fokVar.o;
                Object obj2 = nm6.a;
                i = fokVar.q;
                if (i != 0) {
                    qgg.h0(obj);
                    i63 i63Var = (i63) a53Var.a;
                    hwr hwrVar = (hwr) a53Var.b;
                    if (i63Var != null) {
                        List list = i63Var.a;
                        if (hwrVar != null) {
                            List list2 = hwrVar.a;
                            List<szj> list3 = list;
                            boolean z = list3 instanceof Collection;
                            l43 l43Var2 = l43.a;
                            if (!z || !list3.isEmpty()) {
                                Iterator it2 = list3.iterator();
                                while (it2.hasNext()) {
                                    if (Intrinsics.d(((szj) it2.next()).d, Boolean.TRUE)) {
                                        cokVar2 = cokVar;
                                        cokVar2.a.add(l43Var2);
                                        break;
                                    }
                                }
                            }
                            cokVar2 = cokVar;
                            int i3 = 10;
                            int a = tah.a(v75.o(list3, 10));
                            if (a < 16) {
                                a = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                            for (szj szjVar : list3) {
                                linkedHashMap.put(szjVar.a, szjVar.e);
                            }
                            List<axr> list4 = list2;
                            ArrayList arrayList = new ArrayList(v75.o(list4, 10));
                            for (axr axrVar : list4) {
                                nvl nvlVar = axrVar.a;
                                int i4 = axrVar.c;
                                List list5 = axrVar.e;
                                if (list5 != null) {
                                    List<cyr> list6 = list5;
                                    r15 = new ArrayList(v75.o(list6, i3));
                                    for (cyr cyrVar : list6) {
                                        r15.add(new dok(cyrVar.b, cyrVar.a.a));
                                    }
                                } else {
                                    List list7 = (List) linkedHashMap.get(nvlVar);
                                    if (list7 != null) {
                                        List<i1m> list8 = list7;
                                        r15 = new ArrayList(v75.o(list8, 10));
                                        for (i1m i1mVar : list8) {
                                            String str = i1mVar.c;
                                            Date date = i1mVar.f;
                                            if (date == null) {
                                                fokVar3 = fokVar;
                                                date = new Date(0L);
                                            } else {
                                                fokVar3 = fokVar;
                                            }
                                            r15.add(new dok(date, str));
                                            fokVar = fokVar3;
                                        }
                                    } else {
                                        fokVar2 = fokVar;
                                        r15 = c5b.a;
                                        arrayList.add(new eok(nvlVar, i4, r15));
                                        fokVar = fokVar2;
                                        i3 = 10;
                                    }
                                }
                                fokVar2 = fokVar;
                                arrayList.add(new eok(nvlVar, i4, r15));
                                fokVar = fokVar2;
                                i3 = 10;
                            }
                            fok fokVar4 = fokVar;
                            int a2 = tah.a(v75.o(list4, i3));
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(a2 < 16 ? 16 : a2);
                            for (axr axrVar2 : list4) {
                                linkedHashMap2.put(axrVar2.a, axrVar2.f);
                            }
                            it = arrayList.iterator();
                            map = linkedHashMap2;
                            l43Var = l43Var2;
                            cokVar3 = cokVar2;
                            fokVar = fokVar4;
                            yqkVar2 = yqkVar;
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Iterator it3 = fokVar.n;
                Map map2 = fokVar.m;
                l43 l43Var3 = fokVar.l;
                yqk yqkVar3 = fokVar.k;
                cok cokVar4 = fokVar.j;
                qgg.h0(obj);
                it = it3;
                yqkVar2 = yqkVar3;
                cokVar3 = cokVar4;
                map = map2;
                l43Var = l43Var3;
                while (it.hasNext()) {
                    eok eokVar = (eok) it.next();
                    nvl nvlVar2 = eokVar.a;
                    int i5 = eokVar.b;
                    List list9 = eokVar.c;
                    String str2 = (String) map.get(nvlVar2);
                    if (str2 != null) {
                        boolean C = C(list9, str2, i5, l43Var, nvlVar2.d(), cokVar3);
                        fokVar.getClass();
                        fokVar.j = cokVar3;
                        fokVar.k = yqkVar2;
                        fokVar.l = l43Var;
                        fokVar.m = map;
                        fokVar.n = it;
                        fokVar.q = 1;
                        Object a3 = lmm.a(yqkVar2.a, new wqk(nvlVar2, C, null), fokVar);
                        if (a3 != nm6.a) {
                            a3 = Unit.a;
                        }
                        if (a3 == obj2) {
                            return obj2;
                        }
                    }
                }
                return Unit.a;
            }
        }
        fokVar = new fok(this, cg6Var);
        Object obj3 = fokVar.o;
        Object obj22 = nm6.a;
        i = fokVar.q;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.a;
    }

    public void U(mfi mfiVar) {
        tpi tpiVar = (tpi) this.b;
        Object g = ((tpi) this.c).g(mfiVar);
        if (g != null) {
            if (!(g instanceof gpi)) {
                sgi.c(tpiVar, (jfi) g, new ybg(10, mfiVar));
                return;
            }
            gpi gpiVar = (gpi) g;
            Object[] objArr = gpiVar.a;
            int i = gpiVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = objArr[i2];
                obj.getClass();
                sgi.c(tpiVar, (jfi) obj, new ybg(10, mfiVar));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:284:0x05d0, code lost:
    
        if (T(r3, r6, r12, r13) == r7) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0265, code lost:
    
        r2 = r15;
        r15 = r14;
        r14 = r2;
        r5 = r6;
        r3 = r21;
        r4 = r11;
        r6 = r12;
        r2 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x079d, code lost:
    
        if (r1 == r7) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0265, code lost:
    
        r2 = r15;
        r15 = r14;
        r14 = r2;
        r5 = r6;
        r4 = r11;
        r6 = r12;
        r2 = r13;
        r3 = r21;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:307:0x07b2 -> B:18:0x07b7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x025c -> B:17:0x0265). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object V(String str, p73 p73Var, cg6 cg6Var) {
        gok gokVar;
        int i;
        p73 p73Var2;
        String str2;
        cok cokVar;
        Iterator it;
        yqk yqkVar;
        gok gokVar2;
        int i2;
        int i3;
        Object obj;
        String str3;
        p73 p73Var3;
        cok cokVar2;
        Iterator it2;
        yqk yqkVar2;
        int i4;
        n43 n43Var;
        String str4;
        ArrayList arrayList;
        int i5;
        Integer num;
        List list;
        n43 n43Var2;
        boolean z;
        int i6;
        Object obj2;
        String str5;
        String str6;
        ArrayList arrayList2;
        int i7;
        Integer num2;
        List list2;
        Object obj3;
        ArrayList arrayList3;
        gok gokVar3;
        int i8;
        Iterator it3;
        yqk yqkVar3;
        Object obj4;
        Integer num3;
        n43 n43Var3;
        boolean z2;
        ArrayList arrayList4;
        gok gokVar4;
        ArrayList arrayList5;
        int i9;
        Iterator it4;
        if (cg6Var instanceof gok) {
            gokVar = (gok) cg6Var;
            int i10 = gokVar.r;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gokVar.r = i10 - Integer.MIN_VALUE;
                Object obj5 = gokVar.p;
                Object obj6 = nm6.a;
                i = gokVar.r;
                int i11 = 1;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            i4 = gokVar.o;
                            it2 = gokVar.n;
                            cokVar2 = gokVar.m;
                            yqkVar2 = gokVar.l;
                            p73Var3 = gokVar.k;
                            str3 = gokVar.j;
                            qgg.h0(obj5);
                            String str7 = str3;
                            p73Var2 = p73Var3;
                            str2 = str7;
                            gokVar2 = gokVar;
                            i2 = i4;
                            it = it2;
                            yqkVar = yqkVar2;
                            cokVar = cokVar2;
                            i11 = 1;
                            if (!it.hasNext()) {
                                n43 n43Var4 = (n43) it.next();
                                j43 j43Var = j43.a;
                                if (Intrinsics.d(n43Var4, j43Var)) {
                                    List list3 = p73Var2.a;
                                    ArrayList arrayList6 = new ArrayList();
                                    for (Object obj7 : list3) {
                                        if (obj7 instanceof g63) {
                                            arrayList6.add(obj7);
                                        }
                                    }
                                    k63 k63Var = (k63) CollectionsKt.firstOrNull(arrayList6);
                                    List list4 = p73Var2.b;
                                    ArrayList arrayList7 = new ArrayList();
                                    for (Object obj8 : list4) {
                                        if (obj8 instanceof fwr) {
                                            arrayList7.add(obj8);
                                        }
                                    }
                                    jwr jwrVar = (jwr) CollectionsKt.firstOrNull(arrayList7);
                                    gokVar2.j = str2;
                                    gokVar2.k = p73Var2;
                                    gokVar2.l = yqkVar;
                                    gokVar2.m = cokVar;
                                    gokVar2.n = it;
                                    gokVar2.o = i2;
                                    gokVar2.r = i11;
                                    g63 g63Var = (g63) k63Var;
                                    fwr fwrVar = (fwr) jwrVar;
                                    if (g63Var == null || fwrVar == null) {
                                        gokVar3 = gokVar2;
                                        i8 = i2;
                                        it3 = it;
                                        yqkVar3 = yqkVar;
                                        obj4 = Unit.a;
                                    } else {
                                        f2g f2gVar = fwrVar.a;
                                        if (Intrinsics.d(g63Var.b, Boolean.TRUE)) {
                                            cokVar.a.add(j43Var);
                                        }
                                        String str8 = f2gVar.b;
                                        Integer num4 = f2gVar.a;
                                        if (str8 == null) {
                                            i8 = i2;
                                            it3 = it;
                                            num3 = num4;
                                            yqkVar3 = yqkVar;
                                            n43Var3 = j43Var;
                                            gokVar3 = gokVar2;
                                            z2 = false;
                                        } else {
                                            List list5 = fwrVar.b;
                                            if (list5 != null) {
                                                gokVar4 = gokVar2;
                                                arrayList5 = new ArrayList(v75.o(list5, 10));
                                                for (Iterator it5 = r5.iterator(); it5.hasNext(); it5 = it5) {
                                                    cyr cyrVar = (cyr) it5.next();
                                                    arrayList5.add(new dok(cyrVar.b, cyrVar.a.a));
                                                }
                                            } else {
                                                gokVar4 = gokVar2;
                                                List list6 = g63Var.c.b;
                                                arrayList5 = new ArrayList(v75.o(list6, 10));
                                                Iterator it6 = list6.iterator();
                                                while (it6.hasNext()) {
                                                    unk unkVar = (unk) it6.next();
                                                    Iterator it7 = it6;
                                                    String str9 = unkVar.a.a;
                                                    Date date = unkVar.b;
                                                    if (date == null) {
                                                        i9 = i2;
                                                        it4 = it;
                                                        date = new Date(0L);
                                                    } else {
                                                        i9 = i2;
                                                        it4 = it;
                                                    }
                                                    arrayList5.add(new dok(date, str9));
                                                    it6 = it7;
                                                    i2 = i9;
                                                    it = it4;
                                                }
                                            }
                                            i8 = i2;
                                            Iterator it8 = it;
                                            List list7 = arrayList5;
                                            String str10 = f2gVar.b;
                                            int intValue = num4 != null ? num4.intValue() : 0;
                                            yqkVar3 = yqkVar;
                                            n43Var3 = j43Var;
                                            gokVar3 = gokVar4;
                                            num3 = num4;
                                            it3 = it8;
                                            z2 = C(list7, str10, intValue, n43Var3, "liked", cokVar);
                                        }
                                        if (f2gVar.c != null) {
                                            List list8 = fwrVar.c;
                                            if (list8 != null) {
                                                List<cyr> list9 = list8;
                                                arrayList4 = new ArrayList(v75.o(list9, 10));
                                                for (cyr cyrVar2 : list9) {
                                                    arrayList4.add(new dok(cyrVar2.b, cyrVar2.a.a));
                                                }
                                            } else {
                                                List<unk> list10 = g63Var.d.b;
                                                arrayList4 = new ArrayList(v75.o(list10, 10));
                                                for (unk unkVar2 : list10) {
                                                    String str11 = unkVar2.a.a;
                                                    Date date2 = unkVar2.b;
                                                    if (date2 == null) {
                                                        date2 = new Date(0L);
                                                    }
                                                    arrayList4.add(new dok(date2, str11));
                                                }
                                            }
                                            z2 |= C(arrayList4, f2gVar.c, num3 != null ? num3.intValue() : 0, n43Var3, "disliked", cokVar);
                                        }
                                        obj4 = yqkVar3.h(n43Var3, z2, gokVar3);
                                        if (obj4 != nm6.a) {
                                            obj4 = Unit.a;
                                        }
                                    }
                                    if (obj4 != obj6) {
                                        p73 p73Var4 = p73Var2;
                                        str3 = str2;
                                        p73Var3 = p73Var4;
                                        cokVar2 = cokVar;
                                        it2 = it3;
                                        yqkVar2 = yqkVar3;
                                        gokVar = gokVar3;
                                        i4 = i8;
                                        String str72 = str3;
                                        p73Var2 = p73Var3;
                                        str2 = str72;
                                        gokVar2 = gokVar;
                                        i2 = i4;
                                        it = it2;
                                        yqkVar = yqkVar2;
                                        cokVar = cokVar2;
                                    }
                                    return obj6;
                                }
                                gok gokVar5 = gokVar2;
                                int i12 = i2;
                                Iterator it9 = it;
                                yqk yqkVar4 = yqkVar;
                                g43 g43Var = g43.a;
                                if (Intrinsics.d(n43Var4, g43Var)) {
                                    List list11 = p73Var2.a;
                                    ArrayList arrayList8 = new ArrayList();
                                    for (Object obj9 : list11) {
                                        if (obj9 instanceof d63) {
                                            arrayList8.add(obj9);
                                        }
                                    }
                                    k63 k63Var2 = (k63) CollectionsKt.firstOrNull(arrayList8);
                                    List list12 = p73Var2.b;
                                    ArrayList arrayList9 = new ArrayList();
                                    for (Object obj10 : list12) {
                                        if (obj10 instanceof cwr) {
                                            arrayList9.add(obj10);
                                        }
                                    }
                                    jwr jwrVar2 = (jwr) CollectionsKt.firstOrNull(arrayList9);
                                    gokVar5.j = str2;
                                    gokVar5.k = p73Var2;
                                    gokVar5.l = yqkVar4;
                                    gokVar5.m = cokVar;
                                    gokVar5.n = it9;
                                    gokVar5.o = i12;
                                    gokVar5.r = 2;
                                    d63 d63Var = (d63) k63Var2;
                                    cwr cwrVar = (cwr) jwrVar2;
                                    if (d63Var == null || cwrVar == null) {
                                        obj3 = Unit.a;
                                    } else {
                                        s1g s1gVar = cwrVar.a;
                                        if (Intrinsics.d(d63Var.b, Boolean.TRUE)) {
                                            cokVar.a.add(g43Var);
                                        }
                                        if (s1gVar.b == null) {
                                            obj3 = Unit.a;
                                        } else {
                                            List list13 = cwrVar.b;
                                            if (list13 != null) {
                                                List<yvr> list14 = list13;
                                                ArrayList arrayList10 = new ArrayList(v75.o(list14, 10));
                                                for (yvr yvrVar : list14) {
                                                    arrayList10.add(new dok(yvrVar.b, yvrVar.a));
                                                }
                                                arrayList3 = arrayList10;
                                            } else {
                                                List<q1g> list15 = d63Var.c;
                                                arrayList3 = new ArrayList(v75.o(list15, 10));
                                                for (q1g q1gVar : list15) {
                                                    arrayList3.add(new dok(q1gVar.b, q1gVar.a));
                                                }
                                            }
                                            String str12 = s1gVar.b;
                                            Integer num5 = s1gVar.a;
                                            obj3 = yqkVar4.h(g43Var, C(arrayList3, str12, num5 != null ? num5.intValue() : 0, g43Var, "", cokVar), gokVar5);
                                            if (obj3 != nm6.a) {
                                                obj3 = Unit.a;
                                            }
                                        }
                                    }
                                    if (obj3 != obj6) {
                                        p73 p73Var5 = p73Var2;
                                        str3 = str2;
                                        p73Var3 = p73Var5;
                                        cokVar2 = cokVar;
                                        i4 = i12;
                                        it2 = it9;
                                        yqkVar2 = yqkVar4;
                                        gokVar = gokVar5;
                                        String str722 = str3;
                                        p73Var2 = p73Var3;
                                        str2 = str722;
                                        gokVar2 = gokVar;
                                        i2 = i4;
                                        it = it2;
                                        yqkVar = yqkVar2;
                                        cokVar = cokVar2;
                                    }
                                    return obj6;
                                }
                                int i13 = i12;
                                h43 h43Var = h43.a;
                                if (Intrinsics.d(n43Var4, h43Var)) {
                                    List list16 = p73Var2.a;
                                    ArrayList arrayList11 = new ArrayList();
                                    for (Object obj11 : list16) {
                                        if (obj11 instanceof e63) {
                                            arrayList11.add(obj11);
                                        }
                                    }
                                    k63 k63Var3 = (k63) CollectionsKt.firstOrNull(arrayList11);
                                    List list17 = p73Var2.b;
                                    ArrayList arrayList12 = new ArrayList();
                                    for (Object obj12 : list17) {
                                        if (obj12 instanceof dwr) {
                                            arrayList12.add(obj12);
                                        }
                                    }
                                    jwr jwrVar3 = (jwr) CollectionsKt.firstOrNull(arrayList12);
                                    gokVar5.j = str2;
                                    gokVar5.k = p73Var2;
                                    gokVar5.l = yqkVar4;
                                    gokVar5.m = cokVar;
                                    gokVar5.n = it9;
                                    gokVar5.o = i13;
                                    gokVar5.r = 3;
                                    e63 e63Var = (e63) k63Var3;
                                    dwr dwrVar = (dwr) jwrVar3;
                                    if (e63Var == null || dwrVar == null) {
                                        i6 = i13;
                                        obj2 = Unit.a;
                                    } else {
                                        t1g t1gVar = dwrVar.a;
                                        String str13 = t1gVar.b;
                                        if (Intrinsics.d(e63Var.b, Boolean.TRUE)) {
                                            cokVar.a.add(h43Var);
                                        }
                                        Integer num6 = t1gVar.a;
                                        String str14 = t1gVar.c;
                                        if (str13 == null && str14 == null) {
                                            obj2 = Unit.a;
                                            i6 = i13;
                                        } else {
                                            List list18 = dwrVar.b;
                                            if (list18 != null) {
                                                str5 = str14;
                                                str6 = str13;
                                                arrayList2 = new ArrayList(v75.o(list18, 10));
                                                for (Iterator it10 = r5.iterator(); it10.hasNext(); it10 = it10) {
                                                    zvr zvrVar = (zvr) it10.next();
                                                    arrayList2.add(new dok(zvrVar.b, zvrVar.a));
                                                }
                                            } else {
                                                str5 = str14;
                                                str6 = str13;
                                                List list19 = e63Var.c;
                                                arrayList2 = new ArrayList(v75.o(list19, 10));
                                                Iterator it11 = list19.iterator();
                                                while (it11.hasNext()) {
                                                    ac1 ac1Var = (ac1) it11.next();
                                                    Iterator it12 = it11;
                                                    String str15 = ac1Var.a;
                                                    Date date3 = ac1Var.c;
                                                    if (date3 == null) {
                                                        i7 = i13;
                                                        num2 = num6;
                                                        date3 = new Date(0L);
                                                    } else {
                                                        i7 = i13;
                                                        num2 = num6;
                                                    }
                                                    arrayList2.add(new dok(date3, str15));
                                                    it11 = it12;
                                                    i13 = i7;
                                                    num6 = num2;
                                                }
                                            }
                                            i6 = i13;
                                            Integer num7 = num6;
                                            List list20 = dwrVar.c;
                                            if (list20 != null) {
                                                List<zvr> list21 = list20;
                                                ArrayList arrayList13 = new ArrayList(v75.o(list21, 10));
                                                for (zvr zvrVar2 : list21) {
                                                    arrayList13.add(new dok(zvrVar2.b, zvrVar2.a));
                                                }
                                                list2 = arrayList13;
                                            } else {
                                                List<ac1> list22 = e63Var.d;
                                                ArrayList arrayList14 = new ArrayList(v75.o(list22, 10));
                                                for (ac1 ac1Var2 : list22) {
                                                    String str16 = ac1Var2.a;
                                                    Date date4 = ac1Var2.c;
                                                    if (date4 == null) {
                                                        date4 = new Date(0L);
                                                    }
                                                    arrayList14.add(new dok(date4, str16));
                                                }
                                                list2 = arrayList14;
                                            }
                                            boolean C = str6 == null ? false : C(arrayList2, str6, num7 != null ? num7.intValue() : 0, h43Var, "liked", cokVar);
                                            if (str5 != null) {
                                                C |= C(list2, str5, num7 != null ? num7.intValue() : 0, h43Var, "disliked", cokVar);
                                            }
                                            obj2 = yqkVar4.h(h43Var, C, gokVar5);
                                            if (obj2 != nm6.a) {
                                                obj2 = Unit.a;
                                            }
                                        }
                                    }
                                    if (obj2 != obj6) {
                                        p73 p73Var6 = p73Var2;
                                        str3 = str2;
                                        p73Var3 = p73Var6;
                                        cokVar2 = cokVar;
                                        it2 = it9;
                                        yqkVar2 = yqkVar4;
                                        gokVar = gokVar5;
                                        i4 = i6;
                                        String str7222 = str3;
                                        p73Var2 = p73Var3;
                                        str2 = str7222;
                                        gokVar2 = gokVar;
                                        i2 = i4;
                                        it = it2;
                                        yqkVar = yqkVar2;
                                        cokVar = cokVar2;
                                    }
                                    return obj6;
                                }
                                int i14 = i13;
                                if (!Intrinsics.d(n43Var4, i43.a)) {
                                    if (Intrinsics.d(n43Var4, l43.a)) {
                                        List list23 = p73Var2.a;
                                        ArrayList arrayList15 = new ArrayList();
                                        for (Object obj13 : list23) {
                                            if (obj13 instanceof i63) {
                                                arrayList15.add(obj13);
                                            }
                                        }
                                        k63 k63Var4 = (k63) CollectionsKt.firstOrNull(arrayList15);
                                        List list24 = p73Var2.b;
                                        ArrayList arrayList16 = new ArrayList();
                                        for (Object obj14 : list24) {
                                            if (obj14 instanceof hwr) {
                                                arrayList16.add(obj14);
                                            }
                                        }
                                        a53 a53Var = new a53(k63Var4, (jwr) CollectionsKt.firstOrNull(arrayList16));
                                        gokVar5.j = str2;
                                        gokVar5.k = p73Var2;
                                        gokVar5.l = yqkVar4;
                                        gokVar5.m = cokVar;
                                        gokVar5.n = it9;
                                        gokVar5.o = i14;
                                        gokVar5.r = 4;
                                    } else {
                                        int i15 = i14;
                                        if (Intrinsics.d(n43Var4, m43.a)) {
                                            i14 = i15;
                                        } else {
                                            k43 k43Var = k43.a;
                                            if (Intrinsics.d(n43Var4, k43Var)) {
                                                List list25 = p73Var2.a;
                                                ArrayList arrayList17 = new ArrayList();
                                                for (Object obj15 : list25) {
                                                    if (obj15 instanceof h63) {
                                                        arrayList17.add(obj15);
                                                    }
                                                }
                                                k63 k63Var5 = (k63) CollectionsKt.firstOrNull(arrayList17);
                                                List list26 = p73Var2.b;
                                                ArrayList arrayList18 = new ArrayList();
                                                for (Object obj16 : list26) {
                                                    if (obj16 instanceof gwr) {
                                                        arrayList18.add(obj16);
                                                    }
                                                }
                                                jwr jwrVar4 = (jwr) CollectionsKt.firstOrNull(arrayList18);
                                                gokVar5.j = str2;
                                                gokVar5.k = p73Var2;
                                                gokVar5.l = yqkVar4;
                                                gokVar5.m = cokVar;
                                                gokVar5.n = it9;
                                                gokVar5.o = i15;
                                                gokVar5.r = 5;
                                                h63 h63Var = (h63) k63Var5;
                                                gwr gwrVar = (gwr) jwrVar4;
                                                if (h63Var == null || gwrVar == null) {
                                                    i3 = i15;
                                                    obj = Unit.a;
                                                } else {
                                                    g2g g2gVar = gwrVar.a;
                                                    String str17 = g2gVar.b;
                                                    if (Intrinsics.d(h63Var.b, Boolean.TRUE)) {
                                                        cokVar.a.add(k43Var);
                                                    }
                                                    Integer num8 = g2gVar.a;
                                                    String str18 = g2gVar.c;
                                                    if (str17 == null && str18 == null) {
                                                        obj = Unit.a;
                                                        i3 = i15;
                                                    } else {
                                                        List list27 = gwrVar.b;
                                                        if (list27 != null) {
                                                            n43Var = k43Var;
                                                            str4 = str17;
                                                            arrayList = new ArrayList(v75.o(list27, 10));
                                                            for (Iterator it13 = r3.iterator(); it13.hasNext(); it13 = it13) {
                                                                fyr fyrVar = (fyr) it13.next();
                                                                arrayList.add(new dok(fyrVar.b, fyrVar.a));
                                                            }
                                                        } else {
                                                            n43Var = k43Var;
                                                            str4 = str17;
                                                            List list28 = h63Var.c;
                                                            ArrayList arrayList19 = new ArrayList(v75.o(list28, 10));
                                                            Iterator it14 = list28.iterator();
                                                            while (it14.hasNext()) {
                                                                r4u r4uVar = (r4u) it14.next();
                                                                Iterator it15 = it14;
                                                                String str19 = r4uVar.a;
                                                                Date date5 = r4uVar.c;
                                                                if (date5 == null) {
                                                                    i5 = i15;
                                                                    num = num8;
                                                                    date5 = new Date(0L);
                                                                } else {
                                                                    i5 = i15;
                                                                    num = num8;
                                                                }
                                                                arrayList19.add(new dok(date5, str19));
                                                                it14 = it15;
                                                                i15 = i5;
                                                                num8 = num;
                                                            }
                                                            arrayList = arrayList19;
                                                        }
                                                        i3 = i15;
                                                        Integer num9 = num8;
                                                        List list29 = gwrVar.c;
                                                        if (list29 != null) {
                                                            List<fyr> list30 = list29;
                                                            ArrayList arrayList20 = new ArrayList(v75.o(list30, 10));
                                                            for (fyr fyrVar2 : list30) {
                                                                arrayList20.add(new dok(fyrVar2.b, fyrVar2.a));
                                                            }
                                                            list = arrayList20;
                                                        } else {
                                                            List<r4u> list31 = h63Var.d;
                                                            ArrayList arrayList21 = new ArrayList(v75.o(list31, 10));
                                                            for (r4u r4uVar2 : list31) {
                                                                String str20 = r4uVar2.a;
                                                                Date date6 = r4uVar2.c;
                                                                if (date6 == null) {
                                                                    date6 = new Date(0L);
                                                                }
                                                                arrayList21.add(new dok(date6, str20));
                                                            }
                                                            list = arrayList21;
                                                        }
                                                        if (str4 == null) {
                                                            n43Var2 = n43Var;
                                                            z = false;
                                                        } else {
                                                            n43Var2 = n43Var;
                                                            z = C(arrayList, str4, num9 != null ? num9.intValue() : 0, n43Var2, "liked", cokVar);
                                                        }
                                                        if (str18 != null) {
                                                            z |= C(list, str18, num9 != null ? num9.intValue() : 0, n43Var2, "disliked", cokVar);
                                                        }
                                                        obj = yqkVar4.h(n43Var2, z, gokVar5);
                                                        if (obj != nm6.a) {
                                                            obj = Unit.a;
                                                        }
                                                    }
                                                }
                                            } else {
                                                i14 = i15;
                                                if (!Intrinsics.d(n43Var4, f43.a)) {
                                                    b6e.s();
                                                    return null;
                                                }
                                            }
                                        }
                                    }
                                }
                                it = it9;
                                yqkVar = yqkVar4;
                                gokVar2 = gokVar5;
                                i2 = i14;
                                i11 = 1;
                                if (!it.hasNext()) {
                                    if (cokVar.b.isEmpty()) {
                                        ssg.a(4, "PhonotekaSynchronizer", "Checksum validate all ok", null);
                                        return cokVar;
                                    }
                                    ssg.a(4, "PhonotekaSynchronizer", "Checksum validate block with mismatch " + cokVar.b, null);
                                    return cokVar;
                                }
                            }
                        } else if (i != 3 && i != 4 && i != 5) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    i4 = gokVar.o;
                    it2 = gokVar.n;
                    cokVar2 = gokVar.m;
                    yqkVar2 = gokVar.l;
                    p73Var3 = gokVar.k;
                    str3 = gokVar.j;
                    qgg.h0(obj5);
                    String str72222 = str3;
                    p73Var2 = p73Var3;
                    str2 = str72222;
                    gokVar2 = gokVar;
                    i2 = i4;
                    it = it2;
                    yqkVar = yqkVar2;
                    cokVar = cokVar2;
                    i11 = 1;
                    if (!it.hasNext()) {
                    }
                } else {
                    qgg.h0(obj5);
                    yqk p = bfg.p((cc7) this.b, str);
                    p73Var2 = p73Var;
                    str2 = str;
                    cokVar = new cok();
                    it = ((Set) this.c).iterator();
                    yqkVar = p;
                    gokVar2 = gokVar;
                    i2 = 0;
                    if (!it.hasNext()) {
                    }
                }
            }
        }
        gokVar = new gok(this, cg6Var);
        Object obj52 = gokVar.p;
        Object obj62 = nm6.a;
        i = gokVar.r;
        int i112 = 1;
        if (i == 0) {
        }
    }

    @Override // defpackage.ccg
    public void a() {
        bcg O = O();
        Continuation continuation = null;
        if (O != null) {
            ecg ecgVar = (ecg) O;
            ecgVar.a.H(ecgVar.m, "release", null, new Object[0]);
            ecg ecgVar2 = fcg.a;
            Log.v("LYPMProvider", "release");
            x97.y(fcg.e, null, null, new jmd(2, continuation), 3);
            x97.y(ecgVar.k, j5h.a, null, new ox1(ecgVar, continuation, 26), 2).R(new ybg(1, ecgVar));
        }
        this.c = null;
    }

    @Override // defpackage.r03
    public q03 b(s2c s2cVar, long j) {
        long position = s2cVar.getPosition();
        int min = (int) Math.min(20000L, s2cVar.getLength() - position);
        d7k d7kVar = (d7k) this.c;
        d7kVar.E(min);
        s2cVar.A(d7kVar.a, 0, min);
        int i = -1;
        int i2 = -1;
        long j2 = -9223372036854775807L;
        while (d7kVar.a() >= 4) {
            if (pgc.H(d7kVar.b, d7kVar.a) != 442) {
                d7kVar.I(1);
            } else {
                d7kVar.I(4);
                long c = a0n.c(d7kVar);
                if (c != -9223372036854775807L) {
                    long b = ((ojs) this.b).b(c);
                    if (b > j) {
                        return j2 == -9223372036854775807L ? new q03(-1, b, position) : q03.b(position + i2);
                    }
                    long j3 = b + 100000;
                    int i3 = d7kVar.b;
                    if (j3 > j) {
                        return q03.b(position + i3);
                    }
                    i2 = i3;
                    j2 = b;
                }
                int i4 = d7kVar.c;
                if (d7kVar.a() >= 10) {
                    d7kVar.I(9);
                    int v = d7kVar.v() & 7;
                    if (d7kVar.a() >= v) {
                        d7kVar.I(v);
                        if (d7kVar.a() >= 4) {
                            if (pgc.H(d7kVar.b, d7kVar.a) == 443) {
                                d7kVar.I(4);
                                int B = d7kVar.B();
                                if (d7kVar.a() < B) {
                                    d7kVar.H(i4);
                                } else {
                                    d7kVar.I(B);
                                }
                            }
                            while (true) {
                                if (d7kVar.a() < 4) {
                                    break;
                                }
                                int H = pgc.H(d7kVar.b, d7kVar.a);
                                if (H == 442 || H == 441 || (H >>> 8) != 1) {
                                    break;
                                }
                                d7kVar.I(4);
                                if (d7kVar.a() < 2) {
                                    d7kVar.H(i4);
                                    break;
                                }
                                d7kVar.H(Math.min(d7kVar.c, d7kVar.b + d7kVar.B()));
                            }
                        } else {
                            d7kVar.H(i4);
                        }
                    } else {
                        d7kVar.H(i4);
                    }
                } else {
                    d7kVar.H(i4);
                }
                i = d7kVar.b;
            }
        }
        return j2 != -9223372036854775807L ? new q03(-2, j2, position + i) : q03.d;
    }

    @Override // defpackage.w2q
    public Object c(foc focVar) {
        focVar.getClass();
        return ea.a;
    }

    @Override // defpackage.r03
    public void d() {
        d7k d7kVar = (d7k) this.c;
        byte[] bArr = dvt.c;
        d7kVar.getClass();
        d7kVar.F(bArr.length, bArr);
    }

    @Override // defpackage.zfv
    public void e() {
        ((SslErrorHandler) this.b).cancel();
        ((ftr) this.c).invoke();
    }

    @Override // defpackage.bgn
    public Object f(long j, fr4 fr4Var) {
        cr crVar = (cr) this.b;
        return x97.V((a) crVar.g, new hgn(crVar, j, null), fr4Var);
    }

    @Override // defpackage.w2q
    public Object g(faq faqVar) {
        faqVar.getClass();
        return ea.a;
    }

    @Override // defpackage.w2q
    public Object h(jzs jzsVar) {
        jzsVar.getClass();
        return q5g.N(jzsVar.a, (ArrayList) this.b);
    }

    @Override // defpackage.w2q
    public Object i(m1q m1qVar) {
        m1qVar.getClass();
        return ea.a;
    }

    @Override // defpackage.w2q
    public Object j(i5u i5uVar) {
        Object obj;
        i5uVar.getClass();
        x1u x1uVar = i5uVar.a;
        List list = (List) this.c;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((fp4) it.next()).a(x1uVar));
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((ia) obj) instanceof ha) {
                break;
            }
        }
        ia iaVar = (ia) obj;
        ha haVar = iaVar instanceof ha ? (ha) iaVar : null;
        return haVar != null ? haVar : ea.a;
    }

    @Override // defpackage.w2q
    public Object k(k4d k4dVar) {
        k4dVar.getClass();
        return ea.a;
    }

    @Override // defpackage.ccg
    public void l(t tVar) {
        tVar.getClass();
        if (((ou7) this.c) != null) {
            xq0.q("ListYandexPlayerManagerHolder is already initialized");
        } else {
            this.c = x97.p(wyf.F(tVar.getLifecycle()), null, null, new ptd(tVar, this, null, 26), 3);
        }
    }

    @Override // defpackage.cmr
    public void m(int i) {
        s66 s66Var = (s66) this.c;
        if (i >= 40) {
            s66Var.evictAll();
        } else {
            if (10 > i || i >= 20) {
                return;
            }
            s66Var.trimToSize(s66Var.size() / 2);
        }
    }

    @Override // defpackage.cmr
    public ywh n(xwh xwhVar) {
        ykn yknVar = (ykn) ((s66) this.c).get(xwhVar);
        if (yknVar != null) {
            return new ywh(yknVar.a, yknVar.b);
        }
        return null;
    }

    @Override // defpackage.x7o
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                str.getClass();
                byte[] bytes = str.getBytes(Charsets.UTF_8);
                bytes.getClass();
                String encodeToString = Base64.encodeToString(bytes, 2);
                Function1 function1 = (Function1) this.b;
                encodeToString.getClass();
                function1.invoke(encodeToString);
                break;
            case 21:
                List list = (List) obj;
                list.getClass();
                ((eqm) this.b).q.l(new cqm(list));
                break;
            default:
                List list2 = (List) obj;
                list2.getClass();
                mm6 mm6Var = (ltm) this.b;
                List<gl2> list3 = list2;
                String str2 = (String) this.c;
                ArrayList arrayList = new ArrayList(v75.o(list3, 10));
                for (gl2 gl2Var : list3) {
                    String str3 = gl2Var.a;
                    String uri = gl2Var.g.toString();
                    uri.getClass();
                    String str4 = gl2Var.b;
                    arrayList.add(new zl2(str3, uri, str4, Intrinsics.d(str2, str4), false, gl2Var.f));
                }
                ((oc4) mm6Var).c(new u7o(arrayList));
                break;
        }
    }

    @Override // defpackage.bgn
    public Object p(int i, long j, fr4 fr4Var) {
        cr crVar = (cr) this.b;
        return x97.V((a) crVar.g, new jgn(crVar, i, j, null), fr4Var);
    }

    @Override // defpackage.cmr
    public void q(xwh xwhVar, Bitmap bitmap, Map map) {
        int e = fx1.e(bitmap);
        s66 s66Var = (s66) this.c;
        if (e <= s66Var.maxSize()) {
            s66Var.put(xwhVar, new ykn(bitmap, map, e));
        } else {
            s66Var.remove(xwhVar);
            ((j4x) this.b).C(xwhVar, bitmap, map, e);
        }
    }

    @Override // defpackage.bgn
    public Object r(w5j w5jVar, long j, fr4 fr4Var) {
        cr crVar = (cr) this.b;
        return x97.V((a) crVar.g, new dgn(crVar, w5jVar, j, null), fr4Var);
    }

    @Override // defpackage.fnr
    public void s(enr enrVar) {
        cpi cpiVar = (cpi) this.c;
        cpiVar.a();
        for (Object obj : enrVar) {
            Object b = ((stf) this.b).b(obj);
            int f = cpiVar.f(0, b);
            if (f == 7) {
                enrVar.remove(obj);
            } else {
                cpiVar.i(f + 1, b);
            }
        }
    }

    @Override // defpackage.fw6
    public void t(t tVar) {
        String str = (String) this.b;
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        if (!((iqu) ((byb) qdcVar.C(I)).b(iqu.class)).h()) {
            bdt I2 = hag.I(byb.class);
            qdc qdcVar2 = l18Var.a;
            qdcVar2.getClass();
            if (!((zqu) ((byb) qdcVar2.C(I2)).b(zqu.class)).h()) {
                return;
            }
        }
        kpu gpuVar = (str == null || StringsKt.U(str)) ? jpu.a : new gpu(str);
        dsu dsuVar = (dsu) ((jyr) this.c).getValue();
        y supportFragmentManager = tVar.getSupportFragmentManager();
        supportFragmentManager.getClass();
        o w = men.w(supportFragmentManager, new xlu(25));
        dsuVar.a(tVar, gpuVar, w != null ? w.isVisible() : false);
    }

    public String toString() {
        switch (this.a) {
            case 25:
                return "Request{url=" + ((v7e) this.b) + '}';
            default:
                return super.toString();
        }
    }

    public f1p v() {
        return (f1p) ((jyr) this.b).getValue();
    }

    @Override // defpackage.x7o
    public void x(Object obj) {
        switch (this.a) {
            case 0:
                r7w r7wVar = (r7w) obj;
                r7wVar.getClass();
                ((Function1) this.c).invoke(r7wVar);
                break;
            case 21:
                ((bfk) obj).getClass();
                ((eqm) this.b).q.l(new cqm((ArrayList) this.c));
                break;
            default:
                bfk bfkVar = (bfk) obj;
                bfkVar.getClass();
                ((oc4) ((ltm) this.b)).c(new s7o(bfkVar));
                break;
        }
    }

    @Override // defpackage.fnr
    public boolean y(Object obj, Object obj2) {
        stf stfVar = (stf) this.b;
        return Intrinsics.d(stfVar.b(obj), stfVar.b(obj2));
    }

    @Override // defpackage.zfv
    public void z() {
        ((SslErrorHandler) this.b).proceed();
    }

    @Override // defpackage.t2c
    public void E(fap fapVar) {
    }

    public nnd(String str) {
        this.a = 10;
        this.b = str;
        this.c = l18.b.b(hag.I(dsu.class), true);
    }

    public nnd(cc7 cc7Var, Set set, y9w y9wVar) {
        this.a = 17;
        set.getClass();
        this.b = cc7Var;
        this.c = set;
    }

    public nnd(yjj yjjVar) {
        this.a = 3;
        this.b = yjjVar;
        this.c = new ConcurrentHashMap(TrackType.values().length, 1.0f, 2);
    }

    public nnd(ju0 ju0Var) {
        this.a = 6;
        this.b = ju0Var;
    }

    public nnd(n nVar, String str) {
        this.a = 4;
        str.getClass();
        this.b = nVar;
        this.c = str;
    }

    public nnd(b56 b56Var, cr crVar, a aVar) {
        this.a = 23;
        aVar.getClass();
        this.b = crVar;
        this.c = gld.e(aVar);
    }

    public nnd(vx6 vx6Var) {
        this.a = 9;
        kkp kkpVar = new kkp(vx6Var);
        this.c = new h5h(1);
        this.b = kkpVar;
    }

    public nnd(CardNumberInput cardNumberInput, TextView textView, EditText editText) {
        this.a = 15;
        this.b = textView;
        this.c = editText;
    }

    public nnd(jtc jtcVar) {
        this.a = 25;
        this.b = (v7e) jtcVar.a;
        ik0 ik0Var = (ik0) jtcVar.b;
        ik0Var.getClass();
        this.c = new oxa(ik0Var);
    }

    public nnd(ri1 ri1Var) {
        this.a = 1;
        this.c = ri1Var;
        this.b = ydr.a(Boolean.FALSE);
    }

    public nnd(pxm pxmVar, v76 v76Var) {
        this.a = 2;
        v76Var.getClass();
        this.b = pxmVar;
        this.c = v76Var;
    }

    public nnd(lam lamVar) {
        this.a = 20;
        this.c = lamVar;
        this.b = o15.b;
    }

    public nnd(int i, j4x j4xVar) {
        this.a = 24;
        this.b = j4xVar;
        this.c = new s66(i, this);
    }

    public nnd(ojs ojsVar) {
        this.a = 22;
        this.b = ojsVar;
        this.c = new d7k();
    }

    public nnd(qdc qdcVar, sgl sglVar) {
        this.a = 19;
        sglVar.getClass();
        this.b = qdcVar;
        this.c = sglVar;
    }

    public nnd(stf stfVar) {
        this.a = 5;
        this.b = stfVar;
        cpi cpiVar = uhj.a;
        this.c = new cpi();
    }

    public nnd(wio wioVar, zno znoVar) {
        this.a = 27;
        this.c = wioVar;
        this.b = znoVar;
    }

    public /* synthetic */ nnd(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
