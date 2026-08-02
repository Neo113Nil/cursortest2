package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.LinearGradient;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import androidx.fragment.app.t;
import com.connectsdk.etc.helper.HttpMessage;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.google.gson.JsonObject;
import com.yandex.auth.LegacyAccountType;
import com.yandex.media.ynison.service.c0;
import com.yandex.media.ynison.service.s0;
import com.yandex.music.shared.dto.wave.AgentCoverDto;
import com.yandex.music.shared.dto.wave.AgentDto;
import com.yandex.music.shared.dto.wave.AgentEntityTypeDto;
import com.yandex.music.shared.dto.wave.recommendation.WaveDto;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.payment.tariffpaywall.TariffPaywallActivity;
import ru.yandex.music.url.ui.StubActivity;
import ru.yandex.music.url.ui.UrlActivity;
import ru.yandex.music.yandexplus.home.PlusHomeActivity;

/* loaded from: classes3.dex */
public abstract class w1g {
    public static final float A(float f, hq5 hq5Var) {
        float f2 = vt0.b;
        oq5 oq5Var = (oq5) hq5Var;
        jx7 jx7Var = (jx7) oq5Var.j(es5.h);
        cma cmaVar = new cma(f);
        if (Float.compare(f, 0) <= 0) {
            cmaVar = null;
        }
        float f3 = cmaVar != null ? cmaVar.a : 360;
        boolean c = oq5Var.c(f3) | oq5Var.f(jx7Var);
        Object K = oq5Var.K();
        if (c || K == gq5.a) {
            float f4 = vt0.a;
            K = new cma(o5g.t(f3, f4, f4, vt0.d, 2, Integer.MAX_VALUE, Float.NaN, f2, jx7Var));
            oq5Var.k0(K);
        }
        return ((cma) K).a;
    }

    public static final void B(Map map, Object obj, Object obj2) {
        map.getClass();
        map.put(obj, obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object C(xlw xlwVar, slw slwVar, s0 s0Var, rgw rgwVar, cg6 cg6Var) {
        kzk kzkVar;
        int i;
        slw slwVar2;
        s0 s0Var2;
        mwk mwkVar;
        xlw xlwVar2 = xlwVar;
        rgw rgwVar2 = rgwVar;
        if (cg6Var instanceof kzk) {
            kzkVar = (kzk) cg6Var;
            int i2 = kzkVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kzkVar.o = i2 - Integer.MIN_VALUE;
                Object obj = kzkVar.n;
                nm6 nm6Var = nm6.a;
                i = kzkVar.o;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    rlg rlgVar = new rlg(xlwVar2, rgwVar2, continuation, 26);
                    bsd b = dm6.b();
                    kzkVar.j = xlwVar2;
                    kzkVar.k = slwVar;
                    kzkVar.l = s0Var;
                    kzkVar.m = rgwVar2;
                    kzkVar.o = 1;
                    obj = x97.V(b, rlgVar, kzkVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    slwVar2 = slwVar;
                    s0Var2 = s0Var;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rgw rgwVar3 = kzkVar.m;
                    s0 s0Var3 = kzkVar.l;
                    slwVar2 = kzkVar.k;
                    xlw xlwVar3 = kzkVar.j;
                    qgg.h0(obj);
                    s0Var2 = s0Var3;
                    rgwVar2 = rgwVar3;
                    xlwVar2 = xlwVar3;
                }
                Pair pair = (Pair) obj;
                long longValue = ((Number) pair.a).longValue();
                long longValue2 = ((Number) pair.b).longValue();
                cuk cukVar = slwVar2.b;
                mwkVar = (mwk) xlwVar2.c.b;
                if (mwkVar != null) {
                    if (mwkVar.equals(h1b.e)) {
                        mwkVar = null;
                    }
                    if (mwkVar != null) {
                        yk3 yk3Var = xlwVar2.c;
                        boolean z = yk3Var.a;
                        double d = ((h4q) ((jyr) yk3Var.e).getValue()).a;
                        rgwVar2.getClass();
                        if (rgw.b()) {
                            longValue = yhn.g(longValue, new lvg(0L, longValue2));
                        }
                        s0Var2.getClass();
                        xqn xqnVar = new xqn();
                        dag.p(mwkVar, new tlw(z, xqnVar, longValue2, longValue, d, s0Var2));
                        return (c0) xqnVar.a;
                    }
                }
                return null;
            }
        }
        kzkVar = new kzk(cg6Var);
        Object obj2 = kzkVar.n;
        nm6 nm6Var2 = nm6.a;
        i = kzkVar.o;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        Pair pair2 = (Pair) obj2;
        long longValue3 = ((Number) pair2.a).longValue();
        long longValue22 = ((Number) pair2.b).longValue();
        cuk cukVar2 = slwVar2.b;
        mwkVar = (mwk) xlwVar2.c.b;
        if (mwkVar != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object D(xlw xlwVar, slw slwVar, s0 s0Var, cg6 cg6Var) {
        lzk lzkVar;
        int i;
        slw slwVar2;
        s0 s0Var2;
        mwk mwkVar;
        xlw xlwVar2 = xlwVar;
        if (cg6Var instanceof lzk) {
            lzkVar = (lzk) cg6Var;
            int i2 = lzkVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lzkVar.n = i2 - Integer.MIN_VALUE;
                Object obj = lzkVar.m;
                nm6 nm6Var = nm6.a;
                i = lzkVar.n;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    h1j h1jVar = new h1j(xlwVar2, continuation, 26);
                    bsd b = dm6.b();
                    lzkVar.j = xlwVar2;
                    lzkVar.k = slwVar;
                    lzkVar.l = s0Var;
                    lzkVar.n = 1;
                    obj = x97.V(b, h1jVar, lzkVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    slwVar2 = slwVar;
                    s0Var2 = s0Var;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    s0 s0Var3 = lzkVar.l;
                    slwVar2 = lzkVar.k;
                    xlw xlwVar3 = lzkVar.j;
                    qgg.h0(obj);
                    s0Var2 = s0Var3;
                    xlwVar2 = xlwVar3;
                }
                Pair pair = (Pair) obj;
                long longValue = ((Number) pair.a).longValue();
                long longValue2 = ((Number) pair.b).longValue();
                long j = longValue2 >= 0 ? 0L : longValue2;
                cuk cukVar = slwVar2.b;
                mwkVar = (mwk) xlwVar2.c.b;
                if (mwkVar != null) {
                    if (mwkVar.equals(h1b.e)) {
                        mwkVar = null;
                    }
                    if (mwkVar != null) {
                        double d = ((h4q) ((jyr) xlwVar2.c.e).getValue()).a;
                        long g = yhn.g(longValue, new lvg(0L, j));
                        s0Var2.getClass();
                        xqn xqnVar = new xqn();
                        dag.p(mwkVar, new tlw(false, xqnVar, j, g, d, s0Var2));
                        return (c0) xqnVar.a;
                    }
                }
                return null;
            }
        }
        lzkVar = new lzk(cg6Var);
        Object obj2 = lzkVar.m;
        nm6 nm6Var2 = nm6.a;
        i = lzkVar.n;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        Pair pair2 = (Pair) obj2;
        long longValue3 = ((Number) pair2.a).longValue();
        long longValue22 = ((Number) pair2.b).longValue();
        if (longValue22 >= 0) {
        }
        cuk cukVar2 = slwVar2.b;
        mwkVar = (mwk) xlwVar2.c.b;
        if (mwkVar != null) {
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final np E(AgentDto agentDto) {
        AgentCoverDto cover;
        String uri;
        String color;
        elu eluVar;
        agentDto.getClass();
        String animationUri = agentDto.getAnimationUri();
        String str = null;
        if (animationUri == null || (cover = agentDto.getCover()) == null || (uri = cover.getUri()) == null || (color = agentDto.getCover().getColor()) == null) {
            return null;
        }
        op opVar = new op(uri, color, false);
        AgentEntityTypeDto entity = agentDto.getEntity();
        String type = entity != null ? entity.getType() : null;
        if (type != null) {
            str = type.toLowerCase(Locale.ROOT);
            str.getClass();
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -1409097913:
                    if (str.equals("artist")) {
                        eluVar = elu.d;
                        break;
                    }
                    break;
                case 92896879:
                    if (str.equals("album")) {
                        eluVar = elu.a;
                        break;
                    }
                    break;
                case 110621003:
                    if (str.equals("track")) {
                        eluVar = elu.c;
                        break;
                    }
                    break;
                case 1879474642:
                    if (str.equals("playlist")) {
                        eluVar = elu.b;
                        break;
                    }
                    break;
            }
            return new np(animationUri, opVar, eluVar);
        }
        eluVar = elu.e;
        return new np(animationUri, opVar, eluVar);
    }

    public static final Object F(Object obj, jkl jklVar) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer)) {
            return obj;
        }
        if (obj instanceof Long) {
            return obj;
        }
        if (obj instanceof vxp) {
            return jkl.l((vxp) obj);
        }
        if (obj instanceof txp) {
            Bundle bundle = ((txp) obj).a;
            JSONObject jSONObject = new JSONObject();
            for (String str : bundle.keySet()) {
                jSONObject.put(str, F(bundle.get(str), jklVar));
            }
            return jSONObject;
        }
        if (obj instanceof List) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(F(it.next(), jklVar));
            }
            return jSONArray;
        }
        return null;
    }

    public static final fqf G(u38 u38Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            return ymv.a.a(u38Var);
        }
        Object obj = rqf.a;
        if (u38Var instanceof n38) {
            return fqf.EXACT;
        }
        if (u38Var instanceof s38) {
            return fqf.WRAP;
        }
        if (u38Var instanceof p38) {
            return fqf.FILL;
        }
        if (u38Var instanceof o38) {
            return fqf.EXPAND;
        }
        xq0.q("After resolution, no other type should be present");
        return null;
    }

    public static final oqf H(int i) {
        if (i == 0) {
            return oqf.TOP;
        }
        if (i == 1) {
            return oqf.CENTER_VERTICALLY;
        }
        if (i == 2) {
            return oqf.BOTTOM;
        }
        e7o.i(e40.b(i), "unknown vertical alignment ");
        return null;
    }

    public static final gqf I(int i) {
        if (i == 0) {
            return gqf.START;
        }
        if (i == 1) {
            return gqf.CENTER_HORIZONTALLY;
        }
        if (i == 2) {
            return gqf.END;
        }
        e7o.i(d40.b(i), "unknown horizontal alignment ");
        return null;
    }

    public static final String J(List list) {
        if (list == null) {
            return "null";
        }
        if (list.size() < 3) {
            return list.toString();
        }
        Object firstOrNull = CollectionsKt.firstOrNull(list);
        Object Z = CollectionsKt.Z(list);
        int size = list.size();
        StringBuilder sb = new StringBuilder("[");
        sb.append(firstOrNull);
        sb.append(", ..., ");
        sb.append(Z);
        sb.append("](");
        return f1d.i(sb, size, ")");
    }

    public static final String K(uft uftVar, oq5 oq5Var) {
        int i;
        int i2;
        uftVar.getClass();
        int ordinal = uftVar.ordinal();
        if (ordinal == 0) {
            i = -95394203;
            i2 = R.string.quality_settings_list_element_lossless;
        } else if (ordinal == 1) {
            i = -95391263;
            i2 = R.string.quality_settings_list_element_high;
        } else if (ordinal == 2) {
            i = -95388480;
            i2 = R.string.quality_settings_list_element_low;
        } else {
            if (ordinal != 3) {
                throw vz1.i(oq5Var, -95394989, false);
            }
            i = -95385695;
            i2 = R.string.quality_settings_list_element_auto;
        }
        return vz1.n(oq5Var, i, i2, oq5Var, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0025, code lost:
    
        if (r2 == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0029, code lost:
    
        if (r0 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final yku L(WaveDto waveDto) {
        List list;
        String stationId = waveDto.getStationId();
        String str = null;
        if (stationId == null || (list = tyf.E(stationId, waveDto.getSeeds())) == null) {
            List<String> seeds = waveDto.getSeeds();
            if (seeds != null) {
                ArrayList t = tyf.t(CollectionsKt.O(seeds));
                boolean isEmpty = t.isEmpty();
                list = t;
            }
            list = null;
        }
        s9p E = o8g.E(list);
        String name = waveDto.getName();
        if (name != null) {
            String description = waveDto.getDescription();
            String idForFrom = waveDto.getIdForFrom();
            if (idForFrom == null) {
                idForFrom = o8g.t(E);
            }
            String str2 = idForFrom;
            String type = waveDto.getType();
            if (type != null) {
                str = type.toUpperCase(Locale.ROOT);
                str.getClass();
            }
            return new yku(E, str2, name, description, Intrinsics.d(str, "MIX") ? xku.a : Intrinsics.d(str, "Q2V") ? xku.c : xku.b);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(Function0 function0, x1g x1gVar, w3g w3gVar, yci yciVar, boolean z, Function0 function02, hq5 hq5Var, int i, int i2) {
        Function0 function03;
        int i3;
        yci yciVar2;
        int i4;
        boolean z2;
        Function0 function04;
        yci yciVar3;
        boolean z3;
        xmn r;
        function0.getClass();
        x1gVar.getClass();
        w3gVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1458040852);
        if ((i & 6) == 0) {
            function03 = function0;
            i3 = (oq5Var.h(function03) ? 4 : 2) | i;
        } else {
            function03 = function0;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? oq5Var.f(x1gVar) : oq5Var.h(x1gVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var.f(w3gVar) : oq5Var.h(w3gVar) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z2 = z;
                i3 |= oq5Var.g(z2) ? 16384 : RemoteCameraConfig.Notification.ID;
                if ((i & 196608) == 0) {
                    function04 = function02;
                    i3 |= oq5Var.h(function04) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                } else {
                    function04 = function02;
                }
                if (oq5Var.P(i3 & 1, (74899 & i3) != 74898)) {
                    yci yciVar4 = i5 != 0 ? vci.a : yciVar2;
                    boolean z4 = i4 != 0 ? false : z2;
                    u1g.c(function03, x1gVar.a, w3gVar, a.a(yciVar4, "non_music_grid_item"), z4, ild.C(-2067828970, new tt5(19, x1gVar), oq5Var), null, function04, oq5Var, 196608 | (i3 & 14) | (i3 & 896) | (57344 & i3) | ((i3 << 6) & 29360128), 64);
                    z3 = z4;
                    yciVar3 = yciVar4;
                } else {
                    oq5Var.S();
                    yciVar3 = yciVar2;
                    z3 = z2;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new tp(function0, x1gVar, w3gVar, yciVar3, z3, function02, i, i2, 5);
                    return;
                }
                return;
            }
            z2 = z;
            if ((i & 196608) == 0) {
            }
            if (oq5Var.P(i3 & 1, (74899 & i3) != 74898)) {
            }
            r = oq5Var.r();
            if (r != null) {
            }
        }
        yciVar2 = yciVar;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 196608) == 0) {
        }
        if (oq5Var.P(i3 & 1, (74899 & i3) != 74898)) {
        }
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final LinearGradient b(long j, long j2, List list, List list2, int i) {
        xee.P(list, list2);
        int y = xee.y(list);
        return new LinearGradient(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), xee.H(list, y), xee.I(y, list2, list), saf.l0(i));
    }

    public static final void c(float f, boolean z, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1471247701);
        int i2 = i | (oq5Var.c(f) ? 4 : 2) | (oq5Var.g(z) ? 32 : 16) | 384;
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            float f2 = 16;
            vci vciVar = vci.a;
            yci m = androidx.compose.foundation.layout.a.m(vciVar, f2);
            kx0 kx0Var = qx0.c;
            gz2 gz2Var = b2c.n;
            ta5 a = sa5.a(kx0Var, gz2Var, oq5Var, 0);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, m);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            yci d = d.d(vciVar, 1.0f);
            nho a2 = lho.a(qx0.g, b2c.l, oq5Var, 54);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, d);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            gae.b(a0g.E(R.drawable.ic_logo_yandex_books, 0, oq5Var), null, d.z(d.g(vciVar, f, 0.0f, 2), 2), ((dq0) oq5Var.j(eq0.a)).c.c, oq5Var, 48, 0);
            oq5Var = oq5Var;
            u1g.l(oq5Var, d.r(vciVar, f2));
            int i5 = (i2 >> 3) & 14;
            ivf.k(i5, 0, oq5Var, d.o(xp3.u(vciVar, ugo.a), 90, f), z);
            oq5Var.p(true);
            u1g.l(oq5Var, d.e(vciVar, 14));
            ta5 a3 = sa5.a(kx0Var, gz2Var, oq5Var, 0);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l3 = oq5Var.l();
            yci H3 = vnj.H(oq5Var, vciVar);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var);
            g0g.U(oq5Var, l3, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var3);
            }
            g0g.U(oq5Var, H3, kb5Var4);
            int i7 = i5 | 48;
            ivf.l(z, d.d(vciVar, 1.0f), nu0.j(), oq5Var, i7, 0);
            ivf.l(z, d.d(vciVar, 0.35f), nu0.j(), oq5Var, i7, 0);
            oq5Var.p(true);
            oq5Var.p(true);
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new om2(f, z, yciVar2, i, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x021b, code lost:
    
        if (r10.h(r2) != false) goto L96;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x022b  */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final mgt mgtVar, final eaj eajVar, float f, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        yci yciVar2;
        agr agrVar;
        kb5 kb5Var;
        kb5 kb5Var2;
        kb5 kb5Var3;
        boolean z;
        ?? r15;
        oq5 oq5Var;
        boolean z2;
        oq5 oq5Var2;
        final eaj eajVar2;
        boolean z3;
        boolean z4;
        Object K;
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(818972518);
        if ((i & 6) == 0) {
            i2 = (oq5Var3.f(mgtVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? oq5Var3.f(eajVar) : oq5Var3.h(eajVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var3.c(f) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (oq5Var3.P(i3 & 1, (i3 & 1171) != 1170)) {
            float f2 = 16;
            vci vciVar = vci.a;
            yci m = androidx.compose.foundation.layout.a.m(vciVar, f2);
            int i4 = i3 & 112;
            int i5 = i3 & 14;
            boolean z5 = (i4 == 32 || ((i3 & 64) != 0 && oq5Var3.h(eajVar))) | (i5 == 4);
            Object K2 = oq5Var3.K();
            kjn kjnVar = gq5.a;
            if (z5 || K2 == kjnVar) {
                K2 = new m2g(25, eajVar, mgtVar);
                oq5Var3.k0(K2);
            }
            yci b = com.yandex.music.core.ui.compose.a.b(m, null, 0L, 0.0f, null, (Function2) K2, 15);
            ta5 a = sa5.a(qx0.c, b2c.n, oq5Var3, 0);
            int i6 = oq5Var3.P;
            androidx.compose.runtime.internal.a l = oq5Var3.l();
            yci H = vnj.H(oq5Var3, b);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var3.d0();
            if (oq5Var3.O) {
                oq5Var3.k(grbVar);
            } else {
                oq5Var3.n0();
            }
            kb5 kb5Var4 = wp5.f;
            g0g.U(oq5Var3, a, kb5Var4);
            kb5 kb5Var5 = wp5.e;
            g0g.U(oq5Var3, l, kb5Var5);
            kb5 kb5Var6 = wp5.g;
            if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var3, i6, kb5Var6);
            }
            kb5 kb5Var7 = wp5.d;
            g0g.U(oq5Var3, H, kb5Var7);
            yci d = d.d(vciVar, 1.0f);
            nho a2 = lho.a(qx0.g, b2c.l, oq5Var3, 54);
            int i7 = oq5Var3.P;
            androidx.compose.runtime.internal.a l2 = oq5Var3.l();
            yci H2 = vnj.H(oq5Var3, d);
            oq5Var3.d0();
            if (oq5Var3.O) {
                oq5Var3.k(grbVar);
            } else {
                oq5Var3.n0();
            }
            g0g.U(oq5Var3, a2, kb5Var4);
            g0g.U(oq5Var3, l2, kb5Var5);
            if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i7))) {
                ouj.x(i7, oq5Var3, i7, kb5Var6);
            }
            g0g.U(oq5Var3, H2, kb5Var7);
            w4k E = a0g.E(R.drawable.ic_logo_yandex_books, 0, oq5Var3);
            String M = rvf.M(R.string.yandex_books, oq5Var3);
            agr agrVar2 = eq0.a;
            gae.b(E, M, a.a(d.z(d.g(vciVar, f, 0.0f, 2), 2), "bookmate_banner_icon"), ((dq0) oq5Var3.j(agrVar2)).a.a, oq5Var3, 0, 0);
            oq5 oq5Var4 = oq5Var3;
            u1g.l(oq5Var4, d.r(vciVar, f2));
            if (mgtVar.b == null || mgtVar.d == null) {
                agrVar = agrVar2;
                kb5Var = kb5Var5;
                kb5Var2 = kb5Var6;
                kb5Var3 = kb5Var7;
                z = true;
                r15 = 0;
                oq5Var4.Z(1814009398);
                oq5Var = oq5Var4;
            } else {
                oq5Var4.Z(1819522407);
                yci a3 = a.a(d.g(vciVar, f, 0.0f, 2), "bookmate_banner_button");
                final int i8 = 0;
                kfh d2 = ug3.d(b2c.b, false);
                int i9 = oq5Var4.P;
                androidx.compose.runtime.internal.a l3 = oq5Var4.l();
                yci H3 = vnj.H(oq5Var4, a3);
                oq5Var4.d0();
                if (oq5Var4.O) {
                    oq5Var4.k(grbVar);
                } else {
                    oq5Var4.n0();
                }
                g0g.U(oq5Var4, d2, kb5Var4);
                g0g.U(oq5Var4, l3, kb5Var5);
                if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i9))) {
                    ouj.x(i9, oq5Var4, i9, kb5Var6);
                }
                g0g.U(oq5Var4, H3, kb5Var7);
                if (mgtVar.c) {
                    oq5Var4.Z(88952182);
                    String str = mgtVar.b;
                    if (i4 != 32) {
                        if ((i3 & 64) != 0) {
                            eajVar2 = eajVar;
                        } else {
                            eajVar2 = eajVar;
                        }
                        z3 = false;
                        z4 = z3 | (i5 != 4);
                        K = oq5Var4.K();
                        if (!z4 || K == kjnVar) {
                            K = new Function0() { // from class: y9j
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i8) {
                                        case 0:
                                            String str2 = mgtVar.d;
                                            eaj eajVar3 = eajVar2;
                                            if (str2 != null) {
                                                w1g.y(eajVar3.b.b, str2, true);
                                                eajVar3.a.e.d(-1, -1, str2);
                                            } else {
                                                eajVar3.getClass();
                                            }
                                            break;
                                        default:
                                            String str3 = mgtVar.d;
                                            eaj eajVar4 = eajVar2;
                                            if (str3 != null) {
                                                w1g.y(eajVar4.b.b, str3, true);
                                                eajVar4.a.e.d(-1, -1, str3);
                                            } else {
                                                eajVar4.getClass();
                                            }
                                            break;
                                    }
                                    return Unit.a;
                                }
                            };
                            oq5Var4.k0(K);
                        }
                        agrVar = agrVar2;
                        kb5Var = kb5Var5;
                        kb5Var2 = kb5Var6;
                        kb5Var3 = kb5Var7;
                        z2 = false;
                        y7g.c(str, (Function0) K, null, nu0.i(), androidx.compose.foundation.layout.a.a(20, 0.0f, 2), 0.0f, oq5Var4, 24576, 36);
                        oq5 oq5Var5 = oq5Var4;
                        oq5Var5.p(false);
                        z = true;
                        oq5Var2 = oq5Var5;
                    } else {
                        eajVar2 = eajVar;
                    }
                    z3 = true;
                    z4 = z3 | (i5 != 4);
                    K = oq5Var4.K();
                    if (!z4) {
                    }
                    K = new Function0() { // from class: y9j
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i8) {
                                case 0:
                                    String str2 = mgtVar.d;
                                    eaj eajVar3 = eajVar2;
                                    if (str2 != null) {
                                        w1g.y(eajVar3.b.b, str2, true);
                                        eajVar3.a.e.d(-1, -1, str2);
                                    } else {
                                        eajVar3.getClass();
                                    }
                                    break;
                                default:
                                    String str3 = mgtVar.d;
                                    eaj eajVar4 = eajVar2;
                                    if (str3 != null) {
                                        w1g.y(eajVar4.b.b, str3, true);
                                        eajVar4.a.e.d(-1, -1, str3);
                                    } else {
                                        eajVar4.getClass();
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var4.k0(K);
                    agrVar = agrVar2;
                    kb5Var = kb5Var5;
                    kb5Var2 = kb5Var6;
                    kb5Var3 = kb5Var7;
                    z2 = false;
                    y7g.c(str, (Function0) K, null, nu0.i(), androidx.compose.foundation.layout.a.a(20, 0.0f, 2), 0.0f, oq5Var4, 24576, 36);
                    oq5 oq5Var52 = oq5Var4;
                    oq5Var52.p(false);
                    z = true;
                    oq5Var2 = oq5Var52;
                } else {
                    agrVar = agrVar2;
                    kb5Var3 = kb5Var7;
                    kb5Var = kb5Var5;
                    kb5Var2 = kb5Var6;
                    z2 = false;
                    oq5Var4.Z(89364203);
                    yci g = d.g(vciVar, 48, 0.0f, 2);
                    String str2 = mgtVar.b;
                    q0k a4 = androidx.compose.foundation.layout.a.a(20, 0.0f, 2);
                    boolean z6 = (i4 == 32 || ((i3 & 64) != 0 && oq5Var4.h(eajVar))) | (i5 == 4);
                    Object K3 = oq5Var4.K();
                    if (z6 || K3 == kjnVar) {
                        z = true;
                        final boolean z7 = true ? 1 : 0;
                        K3 = new Function0() { // from class: y9j
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (z7) {
                                    case 0:
                                        String str22 = mgtVar.d;
                                        eaj eajVar3 = eajVar;
                                        if (str22 != null) {
                                            w1g.y(eajVar3.b.b, str22, true);
                                            eajVar3.a.e.d(-1, -1, str22);
                                        } else {
                                            eajVar3.getClass();
                                        }
                                        break;
                                    default:
                                        String str3 = mgtVar.d;
                                        eaj eajVar4 = eajVar;
                                        if (str3 != null) {
                                            w1g.y(eajVar4.b.b, str3, true);
                                            eajVar4.a.e.d(-1, -1, str3);
                                        } else {
                                            eajVar4.getClass();
                                        }
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var4.k0(K3);
                    } else {
                        z = true;
                    }
                    hdg.q(str2, (Function0) K3, g, a4, oq5Var4, 3456);
                    oq5Var4.p(false);
                    oq5Var2 = oq5Var4;
                }
                oq5Var2.p(z);
                oq5Var = oq5Var2;
                r15 = z2;
            }
            oq5Var.p(r15);
            oq5Var.p(z);
            u1g.l(oq5Var, d.e(vciVar, 14));
            yci e = d.e(vciVar, p(nu0.j(), r15, oq5Var, r15, 2) * 2);
            kfh d3 = ug3.d(b2c.f, r15);
            int i10 = oq5Var.P;
            androidx.compose.runtime.internal.a l4 = oq5Var.l();
            yci H4 = vnj.H(oq5Var, e);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d3, kb5Var4);
            g0g.U(oq5Var, l4, kb5Var);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i10))) {
                ouj.x(i10, oq5Var, i10, kb5Var2);
            }
            g0g.U(oq5Var, H4, kb5Var3);
            oq5 oq5Var6 = oq5Var;
            xcs.b(mgtVar.a, a.a(d.d(vciVar, 1.0f), "bookmate_banner_message"), ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, nu0.j(), oq5Var6, 48, 3120, 55288);
            oq5Var3 = oq5Var6;
            oq5Var3.p(true);
            oq5Var3.p(true);
            yciVar2 = vciVar;
        } else {
            oq5Var3.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var3.r();
        if (r != null) {
            r.d = new og6(f, i, 2, mgtVar, eajVar, yciVar2);
        }
    }

    public static final void e(eaj eajVar, yci yciVar, hq5 hq5Var, int i) {
        eaj eajVar2;
        eajVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-886036936);
        int i2 = (oq5Var.f(eajVar) ? 4 : 2) | i | 48;
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            zgt zgtVar = (zgt) szf.Q(eajVar.c, oq5Var).getValue();
            float max = Math.max(ff7.P(nu0.j().b.c, oq5Var) + 8, 48);
            kfh d = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            vci vciVar = vci.a;
            yci H = vnj.H(oq5Var, vciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            if (zgtVar instanceof agt) {
                oq5Var.Z(1858829017);
                c(max, ((agt) zgtVar).a, null, oq5Var, 0);
                oq5Var.p(false);
                eajVar2 = eajVar;
            } else {
                if (!(zgtVar instanceof mgt)) {
                    throw vz1.i(oq5Var, 1858827578, false);
                }
                oq5Var.Z(1858834512);
                eajVar2 = eajVar;
                d((mgt) zgtVar, eajVar2, max, null, oq5Var, (i2 << 3) & 112);
                oq5Var.p(false);
            }
            oq5Var.p(true);
            yciVar = vciVar;
        } else {
            eajVar2 = eajVar;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new m2g(eajVar2, yciVar, i, 24);
        }
    }

    public static final void f(qzl qzlVar, jab jabVar, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        qzlVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1500681633);
        int i2 = i | (oq5Var.f(qzlVar) ? 4 : 2) | (oq5Var.h(jabVar) ? 32 : 16) | 384;
        int i3 = 0;
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            vci vciVar = vci.a;
            yci q = androidx.compose.foundation.layout.a.q(d.d(vciVar, 1.0f), 0.0f, 16, 0.0f, 0.0f, 13);
            ta5 a = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, q);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            int i5 = i2 & 14;
            boolean z = i5 == 4;
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z || K == kjnVar) {
                thj thjVar = new thj(pkb.Shortcut, "add_tracks", 1, 1, "");
                oq5Var.k0(thjVar);
                K = thjVar;
            }
            thj thjVar2 = (thj) K;
            String M = rvf.M(R.string.playlist_add_tracks_to_current_playlist, oq5Var);
            boolean h = (i5 == 4) | oq5Var.h(jabVar) | oq5Var.h(thjVar2);
            Object K2 = oq5Var.K();
            if (h || K2 == kjnVar) {
                K2 = new cte(15, qzlVar, jabVar, thjVar2);
                oq5Var.k0(K2);
            }
            Function0 function0 = (Function0) K2;
            yci f = a.a(vciVar, "add_tracks_button").f(new HorizontalAlignElement(b2c.o));
            boolean h2 = (i5 == 4) | oq5Var.h(jabVar) | oq5Var.h(thjVar2);
            Object K3 = oq5Var.K();
            if (h2 || K3 == kjnVar) {
                K3 = new myl(qzlVar, jabVar, thjVar2, i3);
                oq5Var.k0(K3);
            }
            hdg.t(M, function0, com.yandex.music.core.ui.compose.a.b(f, null, 0L, 0.0f, null, (Function2) K3, 15), null, oq5Var, 0, 8);
            oq5Var.p(true);
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q6h(qzlVar, jabVar, yciVar2, i, 21);
        }
    }

    public static final void g(boolean z, wn5 wn5Var, wn5 wn5Var2, wn5 wn5Var3, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1117944768);
        if ((i & 6) == 0) {
            i2 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(wn5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(wn5Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(wn5Var3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if (oq5Var.P(i2 & 1, (i2 & 9363) != 9362)) {
            yci d = d.d(yciVar, 1.0f);
            boolean z2 = (i2 & 14) == 4;
            Object K = oq5Var.K();
            if (z2 || K == gq5.a) {
                K = new i32(4, z);
                oq5Var.k0(K);
            }
            yci m = androidx.compose.foundation.layout.a.m(nfp.b(d, false, (Function1) K), 16);
            nho a = lho.a(qx0.g, b2c.l, oq5Var, 54);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, m);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, 1.0f);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, layoutWeightElement);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            wn5Var.invoke(oq5Var, Integer.valueOf((i2 >> 3) & 14));
            eta.l((i2 >> 6) & 14, wn5Var2, oq5Var, true);
            eta.l((i2 >> 9) & 14, wn5Var3, oq5Var, true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k95(z, wn5Var, wn5Var2, wn5Var3, yciVar, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(yci yciVar, m1p m1pVar, Function2 function2, hq5 hq5Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        yci yciVar2;
        m1p m1pVar2;
        Function2 function22;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1627059550);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
        } else {
            i3 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        }
        if ((i2 & 2) == 0) {
            if ((i & 64) == 0 ? oq5Var.f(m1pVar) : oq5Var.h(m1pVar)) {
                i4 = 32;
                i5 = i3 | i4;
                i6 = i2 & 4;
                if (i6 == 0) {
                    i5 |= 384;
                } else if ((i & 384) == 0) {
                    i5 |= oq5Var.h(function2) ? 256 : 128;
                }
                if ((i5 & 147) == 146 || !oq5Var.z()) {
                    oq5Var.U();
                    if ((i & 1) != 0 || oq5Var.y()) {
                        if (i7 != 0) {
                            yciVar = vci.a;
                        }
                        if ((i2 & 2) != 0) {
                            m1pVar = y1g.T(null, null, oq5Var, 0, 7);
                            i5 &= -113;
                        }
                        if (i6 != 0) {
                            function2 = men.f;
                        }
                    } else {
                        oq5Var.S();
                        if ((i2 & 2) != 0) {
                            i5 &= -113;
                        }
                    }
                    yci yciVar3 = yciVar;
                    m1p m1pVar3 = m1pVar;
                    Function2 function23 = function2;
                    oq5Var.q();
                    h6g h6gVar = nu0.a;
                    h6g h6gVar2 = h6g.c;
                    i(nu0.j(), yciVar3, m1pVar3, function23, oq5Var, (i5 << 9) & 523264);
                    yciVar2 = yciVar3;
                    m1pVar2 = m1pVar3;
                    function22 = function23;
                } else {
                    oq5Var.S();
                    function22 = function2;
                    m1pVar2 = m1pVar;
                    yciVar2 = yciVar;
                }
                r = oq5Var.r();
                if (r == null) {
                    r.d = new lx(yciVar2, m1pVar2, function22, i, i2);
                    return;
                }
                return;
            }
        }
        i4 = 16;
        i5 = i3 | i4;
        i6 = i2 & 4;
        if (i6 == 0) {
        }
        if ((i5 & 147) == 146) {
        }
        oq5Var.U();
        if ((i & 1) != 0) {
        }
        if (i7 != 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if (i6 != 0) {
        }
        yci yciVar32 = yciVar;
        m1p m1pVar32 = m1pVar;
        Function2 function232 = function2;
        oq5Var.q();
        h6g h6gVar3 = nu0.a;
        h6g h6gVar22 = h6g.c;
        i(nu0.j(), yciVar32, m1pVar32, function232, oq5Var, (i5 << 9) & 523264);
        yciVar2 = yciVar32;
        m1pVar2 = m1pVar32;
        function22 = function232;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void i(ges gesVar, yci yciVar, m1p m1pVar, Function2 function2, hq5 hq5Var, int i) {
        int i2;
        Object bmlVar;
        m1p m1pVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2062594656);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(gesVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.d(R.string.clear_text_content_description) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.d(R.string.go_back) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? oq5Var.f(m1pVar) : oq5Var.h(m1pVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var.h(function2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        int i3 = i2;
        if ((74899 & i3) == 74898 && oq5Var.z()) {
            oq5Var.S();
        } else {
            oq5Var.U();
            if ((i & 1) != 0 && !oq5Var.y()) {
                oq5Var.S();
            }
            oq5Var.q();
            nho a = lho.a(qx0.a, b2c.l, oq5Var, 48);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            float f = 40;
            vci vciVar = vci.a;
            yci o = d.o(vciVar, 44, f);
            agr agrVar = eq0.a;
            long j = ((dq0) oq5Var.j(agrVar)).a.a;
            int i5 = (i3 & 57344) ^ 24576;
            int i6 = 0;
            boolean z = (i5 > 16384 && oq5Var.h(m1pVar)) || (i3 & 24576) == 16384;
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z || K == kjnVar) {
                K = new i1p(m1pVar, i6);
                oq5Var.k0(K);
            }
            zsd.g((Function0) K, o, R.string.go_back, j, 0, oq5Var, (i3 & 896) | 48, 16);
            yci e = d.e(d.d(androidx.compose.foundation.a.b(vciVar, ((dq0) oq5Var.j(agrVar)).c.b, ugo.a), 1.0f), f);
            ybs ybsVar = (ybs) m1pVar.b.getValue();
            boolean z2 = (i5 > 16384 && oq5Var.h(m1pVar)) || (i3 & 24576) == 16384;
            Object K2 = oq5Var.K();
            if (z2 || K2 == kjnVar) {
                bmlVar = new bml(1, m1pVar, m1p.class, "setText", "setText(Landroidx/compose/ui/text/input/TextFieldValue;)V", 0, 22);
                m1pVar2 = m1pVar;
                oq5Var.k0(bmlVar);
            } else {
                m1pVar2 = m1pVar;
                bmlVar = K2;
            }
            nv2.a(ybsVar, (Function1) ((h9f) bmlVar), e, false, ges.b(gesVar, ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, null, 0L, 0, 0L, null, null, 0, 0, 16711678), null, null, true, 0, 1, null, null, null, new f3r(((dq0) oq5Var.j(agrVar)).b.d), ild.C(-1465865697, new gab(29, m1pVar2, function2), oq5Var), oq5Var, 100663296, 196614, 15064);
            oq5Var = oq5Var;
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new zkl(gesVar, yciVar, m1pVar, function2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void j(final Object obj, final String str, yci yciVar, Function1 function1, Function1 function12, g40 g40Var, jd6 jd6Var, float f, m85 m85Var, int i, final wn5 wn5Var, hq5 hq5Var, final int i2, final int i3) {
        int i4;
        final yci yciVar2;
        final Function1 function13;
        int i5;
        Function1 function14;
        int i6;
        g40 g40Var2;
        int i7;
        jd6 jd6Var2;
        int i8;
        int i9;
        int i10;
        m85 m85Var2;
        int i11;
        g40 g40Var3;
        jd6 jd6Var3;
        int i12;
        float f2;
        final Function1 function15;
        final g40 g40Var4;
        final jd6 jd6Var4;
        final float f3;
        final m85 m85Var3;
        final int i13;
        xmn r;
        int i14;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1861172663);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.h(obj) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.f(str) ? 32 : 16;
        }
        int i15 = i3 & 4;
        if (i15 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            yciVar2 = yciVar;
            i4 |= oq5Var.f(yciVar2) ? 256 : 128;
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    function13 = function1;
                    if (oq5Var.h(function13)) {
                        i14 = 2048;
                        i4 |= i14;
                    }
                } else {
                    function13 = function1;
                }
                i14 = 1024;
                i4 |= i14;
            } else {
                function13 = function1;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                function14 = function12;
                i4 |= oq5Var.h(function14) ? 16384 : RemoteCameraConfig.Notification.ID;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                } else if ((196608 & i2) == 0) {
                    g40Var2 = g40Var;
                    i4 |= oq5Var.f(g40Var2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
                    } else if ((1572864 & i2) == 0) {
                        jd6Var2 = jd6Var;
                        i4 |= oq5Var.f(jd6Var2) ? 1048576 : 524288;
                        i8 = 12582912 | i4;
                        int i16 = i4;
                        i9 = i3 & 256;
                        if (i9 != 0) {
                            i8 = i16 | 113246208;
                        } else if ((i2 & 100663296) == 0) {
                            i10 = i9;
                            i8 |= oq5Var.f(m85Var) ? 67108864 : 33554432;
                            if ((i2 & 805306368) == 0) {
                                i8 |= 268435456;
                            }
                            if ((i8 & 306783379) == 306783378 || !oq5Var.z()) {
                                oq5Var.U();
                                if ((i2 & 1) != 0 || oq5Var.y()) {
                                    if (i15 != 0) {
                                        yciVar2 = vci.a;
                                    }
                                    if ((i3 & 8) != 0) {
                                        i8 &= -7169;
                                        function13 = rq1.u;
                                    }
                                    if (i5 != 0) {
                                        function14 = null;
                                    }
                                    g40 g40Var5 = i6 == 0 ? b2c.f : g40Var2;
                                    jd6 jd6Var5 = i7 == 0 ? hd6.b : jd6Var2;
                                    m85Var2 = i10 == 0 ? m85Var : null;
                                    i11 = (-1879048193) & i8;
                                    g40Var3 = g40Var5;
                                    jd6Var3 = jd6Var5;
                                    i12 = 1;
                                    f2 = 1.0f;
                                } else {
                                    oq5Var.S();
                                    if ((i3 & 8) != 0) {
                                        i8 &= -7169;
                                    }
                                    i11 = i8 & (-1879048193);
                                    f2 = f;
                                    m85Var2 = m85Var;
                                    i12 = i;
                                    g40Var3 = g40Var2;
                                    jd6Var3 = jd6Var2;
                                }
                                yci yciVar3 = yciVar2;
                                Function1 function16 = function13;
                                Function1 function17 = function14;
                                oq5Var.q();
                                if (p1g.G(oq5Var)) {
                                    oq5Var.Z(1833959903);
                                    int i17 = i11 & 126;
                                    int i18 = i11 << 3;
                                    bzf.n(obj, str, (cce) oq5Var.j(tkg.a), yciVar3, function16, function17, g40Var3, jd6Var3, f2, m85Var2, i12, wn5Var, oq5Var, i17 | (i18 & 7168) | (57344 & i18) | (458752 & i18) | (3670016 & i18) | (29360128 & i18) | (234881024 & i18) | (i18 & 1879048192), 48);
                                    yciVar3 = yciVar3;
                                    oq5Var.p(false);
                                } else {
                                    oq5Var.Z(1833517347);
                                    g40 g40Var6 = g40Var3;
                                    jd6 jd6Var6 = jd6Var3;
                                    float f4 = f2;
                                    m85 m85Var4 = m85Var2;
                                    int i19 = i12;
                                    saf.s(obj, str, yciVar3, function16, function17, g40Var6, jd6Var6, f4, m85Var4, i19, wn5Var, oq5Var, i11 & 2147483646);
                                    i12 = i19;
                                    m85Var2 = m85Var4;
                                    f2 = f4;
                                    jd6Var3 = jd6Var6;
                                    g40Var3 = g40Var6;
                                    function17 = function17;
                                    function16 = function16;
                                    oq5Var.p(false);
                                }
                                yciVar2 = yciVar3;
                                function13 = function16;
                                function15 = function17;
                                g40Var4 = g40Var3;
                                jd6Var4 = jd6Var3;
                                f3 = f2;
                                m85Var3 = m85Var2;
                                i13 = i12;
                            } else {
                                oq5Var.S();
                                m85Var3 = m85Var;
                                function15 = function14;
                                g40Var4 = g40Var2;
                                jd6Var4 = jd6Var2;
                                f3 = f;
                                i13 = i;
                            }
                            r = oq5Var.r();
                            if (r == null) {
                                r.d = new Function2() { // from class: imq
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj2, Object obj3) {
                                        ((Integer) obj3).getClass();
                                        w1g.j(obj, str, yciVar2, function13, function15, g40Var4, jd6Var4, f3, m85Var3, i13, wn5Var, (hq5) obj2, rvf.R(i2 | 1), i3);
                                        return Unit.a;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        i10 = i9;
                        if ((i2 & 805306368) == 0) {
                        }
                        if ((i8 & 306783379) == 306783378) {
                        }
                        oq5Var.U();
                        if ((i2 & 1) != 0) {
                        }
                        if (i15 != 0) {
                        }
                        if ((i3 & 8) != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        m85Var2 = i10 == 0 ? m85Var : null;
                        i11 = (-1879048193) & i8;
                        g40Var3 = g40Var5;
                        jd6Var3 = jd6Var5;
                        i12 = 1;
                        f2 = 1.0f;
                        yci yciVar32 = yciVar2;
                        Function1 function162 = function13;
                        Function1 function172 = function14;
                        oq5Var.q();
                        if (p1g.G(oq5Var)) {
                        }
                        yciVar2 = yciVar32;
                        function13 = function162;
                        function15 = function172;
                        g40Var4 = g40Var3;
                        jd6Var4 = jd6Var3;
                        f3 = f2;
                        m85Var3 = m85Var2;
                        i13 = i12;
                        r = oq5Var.r();
                        if (r == null) {
                        }
                    }
                    jd6Var2 = jd6Var;
                    i8 = 12582912 | i4;
                    int i162 = i4;
                    i9 = i3 & 256;
                    if (i9 != 0) {
                    }
                    i10 = i9;
                    if ((i2 & 805306368) == 0) {
                    }
                    if ((i8 & 306783379) == 306783378) {
                    }
                    oq5Var.U();
                    if ((i2 & 1) != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if ((i3 & 8) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    m85Var2 = i10 == 0 ? m85Var : null;
                    i11 = (-1879048193) & i8;
                    g40Var3 = g40Var5;
                    jd6Var3 = jd6Var5;
                    i12 = 1;
                    f2 = 1.0f;
                    yci yciVar322 = yciVar2;
                    Function1 function1622 = function13;
                    Function1 function1722 = function14;
                    oq5Var.q();
                    if (p1g.G(oq5Var)) {
                    }
                    yciVar2 = yciVar322;
                    function13 = function1622;
                    function15 = function1722;
                    g40Var4 = g40Var3;
                    jd6Var4 = jd6Var3;
                    f3 = f2;
                    m85Var3 = m85Var2;
                    i13 = i12;
                    r = oq5Var.r();
                    if (r == null) {
                    }
                }
                g40Var2 = g40Var;
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                jd6Var2 = jd6Var;
                i8 = 12582912 | i4;
                int i1622 = i4;
                i9 = i3 & 256;
                if (i9 != 0) {
                }
                i10 = i9;
                if ((i2 & 805306368) == 0) {
                }
                if ((i8 & 306783379) == 306783378) {
                }
                oq5Var.U();
                if ((i2 & 1) != 0) {
                }
                if (i15 != 0) {
                }
                if ((i3 & 8) != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                m85Var2 = i10 == 0 ? m85Var : null;
                i11 = (-1879048193) & i8;
                g40Var3 = g40Var5;
                jd6Var3 = jd6Var5;
                i12 = 1;
                f2 = 1.0f;
                yci yciVar3222 = yciVar2;
                Function1 function16222 = function13;
                Function1 function17222 = function14;
                oq5Var.q();
                if (p1g.G(oq5Var)) {
                }
                yciVar2 = yciVar3222;
                function13 = function16222;
                function15 = function17222;
                g40Var4 = g40Var3;
                jd6Var4 = jd6Var3;
                f3 = f2;
                m85Var3 = m85Var2;
                i13 = i12;
                r = oq5Var.r();
                if (r == null) {
                }
            }
            function14 = function12;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            g40Var2 = g40Var;
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            jd6Var2 = jd6Var;
            i8 = 12582912 | i4;
            int i16222 = i4;
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            i10 = i9;
            if ((i2 & 805306368) == 0) {
            }
            if ((i8 & 306783379) == 306783378) {
            }
            oq5Var.U();
            if ((i2 & 1) != 0) {
            }
            if (i15 != 0) {
            }
            if ((i3 & 8) != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            m85Var2 = i10 == 0 ? m85Var : null;
            i11 = (-1879048193) & i8;
            g40Var3 = g40Var5;
            jd6Var3 = jd6Var5;
            i12 = 1;
            f2 = 1.0f;
            yci yciVar32222 = yciVar2;
            Function1 function162222 = function13;
            Function1 function172222 = function14;
            oq5Var.q();
            if (p1g.G(oq5Var)) {
            }
            yciVar2 = yciVar32222;
            function13 = function162222;
            function15 = function172222;
            g40Var4 = g40Var3;
            jd6Var4 = jd6Var3;
            f3 = f2;
            m85Var3 = m85Var2;
            i13 = i12;
            r = oq5Var.r();
            if (r == null) {
            }
        }
        yciVar2 = yciVar;
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        function14 = function12;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        g40Var2 = g40Var;
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        jd6Var2 = jd6Var;
        i8 = 12582912 | i4;
        int i162222 = i4;
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        i10 = i9;
        if ((i2 & 805306368) == 0) {
        }
        if ((i8 & 306783379) == 306783378) {
        }
        oq5Var.U();
        if ((i2 & 1) != 0) {
        }
        if (i15 != 0) {
        }
        if ((i3 & 8) != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        m85Var2 = i10 == 0 ? m85Var : null;
        i11 = (-1879048193) & i8;
        g40Var3 = g40Var5;
        jd6Var3 = jd6Var5;
        i12 = 1;
        f2 = 1.0f;
        yci yciVar322222 = yciVar2;
        Function1 function1622222 = function13;
        Function1 function1722222 = function14;
        oq5Var.q();
        if (p1g.G(oq5Var)) {
        }
        yciVar2 = yciVar322222;
        function13 = function1622222;
        function15 = function1722222;
        g40Var4 = g40Var3;
        jd6Var4 = jd6Var3;
        f3 = f2;
        m85Var3 = m85Var2;
        i13 = i12;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void k(final Object obj, final yci yciVar, final ryc rycVar, final ryc rycVar2, final ryc rycVar3, g40 g40Var, jd6 jd6Var, float f, int i, hq5 hq5Var, final int i2) {
        int i3;
        g40 g40Var2;
        int i4;
        jd6 jd6Var2;
        float f2;
        float f3;
        final g40 g40Var3;
        final float f4;
        final jd6 jd6Var3;
        final int i5;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(144276569);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(null) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.h(rycVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var.h(rycVar2) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i3 |= oq5Var.h(rycVar3) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        int i6 = i3 | 920125440;
        if ((306783379 & i6) == 306783378 && oq5Var.z()) {
            oq5Var.S();
            g40Var3 = g40Var;
            jd6Var3 = jd6Var;
            f4 = f;
            i5 = i;
        } else {
            oq5Var.U();
            if ((i2 & 1) == 0 || oq5Var.y()) {
                g40Var2 = b2c.f;
                i4 = 1;
                jd6Var2 = hd6.b;
                f2 = 1.0f;
            } else {
                oq5Var.S();
                g40Var2 = g40Var;
                jd6Var2 = jd6Var;
                f2 = f;
                i4 = i;
            }
            oq5Var.q();
            if (p1g.G(oq5Var)) {
                oq5Var.Z(-1118220874);
                f3 = f2;
                jd6 jd6Var4 = jd6Var2;
                saf.t(obj, yciVar, rycVar, rycVar2, rycVar3, g40Var2, jd6Var4, f3, i4, oq5Var, i6 & 2147483646, 438);
                jd6Var2 = jd6Var4;
                oq5Var.p(false);
            } else {
                oq5Var.Z(-1117686062);
                int i7 = i6 << 3;
                g40 g40Var4 = g40Var2;
                bzf.l(obj, (cce) oq5Var.j(tkg.a), yciVar, rycVar, rycVar2, rycVar3, null, null, null, g40Var4, jd6Var2, f2, i4, oq5Var, (i6 & 126) | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (3670016 & i7) | (29360128 & i7) | (234881024 & i7) | (i7 & 1879048192), ((i6 >> 27) & 14) | 3504);
                g40Var2 = g40Var4;
                f3 = f2;
                oq5Var.p(false);
            }
            g40Var3 = g40Var2;
            f4 = f3;
            jd6Var3 = jd6Var2;
            i5 = i4;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: hmq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    w1g.k(obj, yciVar, rycVar, rycVar2, rycVar3, g40Var3, jd6Var3, f4, i5, (hq5) obj2, rvf.R(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void l(yci yciVar, hq5 hq5Var, int i) {
        int i2;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(790048761);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new nrq(25);
                oq5Var.k0(K);
            }
            yciVar2 = yciVar;
            y7g.d((Function0) K, yciVar2, false, 0.0f, c3x.e, oq5Var, ((i2 << 3) & 112) | 24966, 8);
        } else {
            yciVar2 = yciVar;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new jm0(yciVar2, i, 12);
        }
    }

    public static final void m(Function0 function0, hq5 hq5Var, int i) {
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1322717757);
        int i2 = (oq5Var.h(function0) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            v3g.c(function0, oq5Var, i2 & 14);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new xtp(function0, i, 8);
        }
    }

    public static final void n(Map map, Function2 function2) {
        map.getClass();
        for (Map.Entry entry : map.entrySet()) {
            function2.invoke(entry.getValue(), entry.getKey());
        }
    }

    public static void o(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    public static final float p(ges gesVar, int i, hq5 hq5Var, int i2, int i3) {
        mn0 mn0Var;
        float f;
        gesVar.getClass();
        if ((i3 & 2) != 0) {
            i = 1;
        }
        oq5 oq5Var = (oq5) hq5Var;
        ppc ppcVar = (ppc) oq5Var.j(es5.k);
        jx7 jx7Var = (jx7) oq5Var.j(es5.h);
        boolean f2 = ((((i2 & 112) ^ 48) > 32 && oq5Var.d(i)) || (i2 & 48) == 32) | ((((i2 & 14) ^ 6) > 4 && oq5Var.f(gesVar)) || (i2 & 6) == 4) | oq5Var.f(jx7Var);
        Object K = oq5Var.K();
        if (f2 || K == gq5.a) {
            LinkedHashMap linkedHashMap = ecs.a;
            ppcVar.getClass();
            jx7Var.getClass();
            dcs dcsVar = new dcs(gesVar, jx7Var, i);
            LinkedHashMap linkedHashMap2 = ecs.a;
            Float f3 = (Float) linkedHashMap2.get(dcsVar);
            if (f3 != null) {
                f = f3.floatValue();
            } else {
                String str = "H";
                if (i == 1) {
                    mn0Var = new mn0(6, "H", (ArrayList) null);
                } else {
                    for (int i4 = 1; i4 < i; i4++) {
                        str = str.concat("\nH");
                    }
                    mn0Var = new mn0(6, str, (ArrayList) null);
                }
                f = new ogi(mn0Var, gesVar, ia6.a(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE), jx7Var, ppcVar, Integer.MAX_VALUE, true).e;
                linkedHashMap2.put(dcsVar, Float.valueOf(f));
            }
            K = Float.valueOf(f);
            oq5Var.k0(K);
        }
        return jx7Var.d0(((Number) K).floatValue());
    }

    public static void q(String str, boolean z) {
        if (z) {
            return;
        }
        xq0.x(str);
    }

    public static void r(Object obj) {
        s(obj, "Argument must not be null");
    }

    public static void s(Object obj, String str) {
        if (obj != null) {
            return;
        }
        jj4.j(str);
    }

    public static final Intent t(Context context, Intent intent, kqt kqtVar) {
        context.getClass();
        intent.getClass();
        kqtVar.getClass();
        int i = kqtVar.c;
        int i2 = i == 0 ? -1 : jqt.a[ouj.D(i)];
        if (i2 == 1) {
            return StubActivity.y(context, intent, fmr.a);
        }
        if (i2 == 2) {
            return StubActivity.y(context, intent, fmr.b).putExtra("auth_data", kqtVar.a.Q(LegacyAccountType.STRING_LOGIN));
        }
        if (i2 != 3) {
            return null;
        }
        int i3 = TariffPaywallActivity.z;
        return dml.b(context, new lik(vik.e, null, null)).addFlags(268468224);
    }

    public static ahi u(String str, String str2, h0o h0oVar) {
        str.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("form-data; name=");
        twh twhVar = bhi.e;
        u1g.w(str, sb);
        if (str2 != null) {
            sb.append("; filename=");
            u1g.w(str2, sb);
        }
        String sb2 = sb.toString();
        pv9 pv9Var = new pv9(9);
        pv9Var.n("Content-Disposition", sb2);
        zvd r = pv9Var.r();
        if (r.a(HttpMessage.CONTENT_TYPE_HEADER) != null) {
            xq0.x("Unexpected header: Content-Type");
            return null;
        }
        if (r.a("Content-Length") == null) {
            return new ahi(r, h0oVar);
        }
        xq0.x("Unexpected header: Content-Length");
        return null;
    }

    public static final mqf v(c3b c3bVar) {
        nqf nqfVar;
        eqf eqfVar;
        lqf w = mqf.w();
        hhm hhmVar = hhm.y;
        if (c3bVar instanceof e3b) {
            nqfVar = nqf.BOX;
        } else if (c3bVar instanceof j3b) {
            nqfVar = ((j3b) c3bVar).c.c(hhmVar) ? nqf.RADIO_ROW : nqf.ROW;
        } else if (c3bVar instanceof g3b) {
            nqfVar = ((g3b) c3bVar).c.c(hhmVar) ? nqf.RADIO_COLUMN : nqf.COLUMN;
        } else if (c3bVar instanceof m3b) {
            nqfVar = nqf.TEXT;
        } else if (c3bVar instanceof d3b) {
            nqfVar = nqf.ANDROID_REMOTE_VIEWS;
        } else if (c3bVar instanceof l3b) {
            nqfVar = nqf.SPACER;
        } else if (c3bVar instanceof i3b) {
            nqfVar = nqf.IMAGE;
        } else if (c3bVar instanceof f3b) {
            nqfVar = nqf.CIRCULAR_PROGRESS_INDICATOR;
        } else if (c3bVar instanceof yvn) {
            nqfVar = nqf.REMOTE_VIEWS_ROOT;
        } else {
            if (!(c3bVar instanceof k3b)) {
                kac.l(c3bVar.getClass().getCanonicalName(), "Unknown element type ");
                return null;
            }
            nqfVar = nqf.SIZE_BOX;
        }
        w.d();
        mqf.k((mqf) w.b, nqfVar);
        yov yovVar = (yov) c3bVar.b().a(null, ucs.x);
        u38 u38Var = s38.a;
        fqf G = G(yovVar != null ? yovVar.a : u38Var);
        w.d();
        mqf.l((mqf) w.b, G);
        bxd bxdVar = (bxd) c3bVar.b().a(null, ucs.y);
        if (bxdVar != null) {
            u38Var = bxdVar.a;
        }
        fqf G2 = G(u38Var);
        w.d();
        mqf.m((mqf) w.b, G2);
        boolean z = c3bVar.b().a(null, ucs.v) != null;
        w.d();
        mqf.r((mqf) w.b, z);
        if (c3bVar.b().a(null, ucs.w) != null) {
            w.d();
            mqf.q((mqf) w.b);
        }
        if (c3bVar instanceof i3b) {
            i3b i3bVar = (i3b) c3bVar;
            int i = i3bVar.d;
            if (i == 1) {
                eqfVar = eqf.FIT;
            } else if (i == 0) {
                eqfVar = eqf.CROP;
            } else {
                if (i != 2) {
                    e7o.i(id6.a(i3bVar.d), "Unknown content scale ");
                    return null;
                }
                eqfVar = eqf.FILL_BOUNDS;
            }
            w.d();
            mqf.p((mqf) w.b, eqfVar);
            boolean z2 = !saf.Y(i3bVar);
            w.d();
            mqf.t((mqf) w.b, z2);
            boolean z3 = i3bVar.c != null;
            w.d();
            mqf.u((mqf) w.b, z3);
        } else if (c3bVar instanceof g3b) {
            gqf I = I(((g3b) c3bVar).e);
            w.d();
            mqf.n((mqf) w.b, I);
        } else if (c3bVar instanceof j3b) {
            oqf H = H(((j3b) c3bVar).e);
            w.d();
            mqf.o((mqf) w.b, H);
        } else if (c3bVar instanceof e3b) {
            e3b e3bVar = (e3b) c3bVar;
            gqf I2 = I(e3bVar.d.a);
            w.d();
            mqf.n((mqf) w.b, I2);
            oqf H2 = H(e3bVar.d.b);
            w.d();
            mqf.o((mqf) w.b, H2);
        }
        if (c3bVar instanceof n3b) {
            ArrayList arrayList = ((n3b) c3bVar).b;
            ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(v((c3b) it.next()));
            }
            w.d();
            mqf.s((mqf) w.b, arrayList2);
        }
        return (mqf) w.b();
    }

    public static final u76 w(x3f x3fVar) {
        return ((s7k) swf.X(x3fVar.b, ern.a(s7k.class))).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final lfh x(fho fhoVar, int i, int i2, int i3, int i4, int i5, mfh mfhVar, List list, ksk[] kskVarArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        int i10;
        float f;
        boolean z;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        List list2 = list;
        long j = i5;
        int i17 = i7 - i6;
        int[] iArr2 = new int[i17];
        int i18 = i6;
        int i19 = 0;
        int i20 = 0;
        boolean z2 = false;
        int i21 = 0;
        int i22 = 0;
        float f2 = 0.0f;
        while (i18 < i7) {
            ffh ffhVar = (ffh) list2.get(i18);
            long j2 = j;
            jho I = u1g.I(ffhVar);
            float J = u1g.J(I);
            if (!z2) {
                jf0 jf0Var = I != null ? I.c : null;
                if (!(jf0Var != null ? jf0Var instanceof cu6 : false)) {
                    z2 = false;
                    if (J <= 0.0f) {
                        f2 += J;
                        i20++;
                        i14 = i18;
                    } else {
                        int i23 = i3 - i21;
                        ksk kskVar = kskVarArr[i18];
                        if (kskVar == null) {
                            if (i3 == Integer.MAX_VALUE) {
                                i14 = i18;
                                i15 = i20;
                                i16 = Integer.MAX_VALUE;
                            } else {
                                i14 = i18;
                                i15 = i20;
                                i16 = i23 < 0 ? 0 : i23;
                            }
                            kskVar = ffhVar.M(fhoVar.j(0, i16, i4, false));
                        } else {
                            i14 = i18;
                            i15 = i20;
                        }
                        int i24 = fhoVar.i(kskVar);
                        int h = fhoVar.h(kskVar);
                        iArr2[i14 - i6] = i24;
                        int i25 = i23 - i24;
                        if (i25 < 0) {
                            i25 = 0;
                        }
                        i22 = Math.min(i5, i25);
                        i21 += i24 + i22;
                        i19 = Math.max(i19, h);
                        kskVarArr[i14] = kskVar;
                        i20 = i15;
                    }
                    i18 = i14 + 1;
                    j = j2;
                }
            }
            z2 = true;
            if (J <= 0.0f) {
            }
            i18 = i14 + 1;
            j = j2;
        }
        long j3 = j;
        boolean z3 = true;
        if (i20 == 0) {
            i21 -= i22;
            i9 = 0;
        } else {
            long j4 = (r24 - 1) * j3;
            long j5 = ((i3 != Integer.MAX_VALUE ? i3 : i) - i21) - j4;
            if (j5 < 0) {
                j5 = 0;
            }
            float f3 = j5 / f2;
            int i26 = i6;
            while (i26 < i7) {
                j5 -= Math.round(u1g.J(u1g.I((ffh) list2.get(i26))) * f3);
                i26++;
                j4 = j4;
            }
            long j6 = j4;
            int i27 = i6;
            int i28 = 0;
            while (i27 < i7) {
                if (kskVarArr[i27] == null) {
                    ffh ffhVar2 = (ffh) list2.get(i27);
                    jho I2 = u1g.I(ffhVar2);
                    float J2 = u1g.J(I2);
                    if (!(J2 > 0.0f ? z3 : false)) {
                        qme.b("All weights <= 0 should have placeables");
                    }
                    i10 = i27;
                    int signum = Long.signum(j5);
                    f = f3;
                    j5 -= signum;
                    int max = Math.max(0, Math.round(f * J2) + signum);
                    if ((I2 != null ? I2.b : z3) && max != Integer.MAX_VALUE) {
                        i11 = max;
                        z = z3;
                        ksk M = ffhVar2.M(fhoVar.j(i11, max, i4, z));
                        int i29 = fhoVar.i(M);
                        int h2 = fhoVar.h(M);
                        iArr2[i10 - i6] = i29;
                        i28 += i29;
                        int max2 = Math.max(i19, h2);
                        kskVarArr[i10] = M;
                        i19 = max2;
                    }
                    i11 = 0;
                    z = z3;
                    ksk M2 = ffhVar2.M(fhoVar.j(i11, max, i4, z));
                    int i292 = fhoVar.i(M2);
                    int h22 = fhoVar.h(M2);
                    iArr2[i10 - i6] = i292;
                    i28 += i292;
                    int max22 = Math.max(i19, h22);
                    kskVarArr[i10] = M2;
                    i19 = max22;
                } else {
                    i10 = i27;
                    f = f3;
                    z = z3;
                }
                list2 = list;
                z3 = z;
                i27 = i10 + 1;
                f3 = f;
            }
            i9 = (int) (i28 + j6);
            int i30 = i3 - i21;
            if (i9 < 0) {
                i9 = 0;
            }
            if (i9 > i30) {
                i9 = i30;
            }
        }
        if (z2) {
            int i31 = 0;
            i12 = 0;
            for (int i32 = i6; i32 < i7; i32++) {
                ksk kskVar2 = kskVarArr[i32];
                kskVar2.getClass();
                Object n = kskVar2.n();
                jho jhoVar = n instanceof jho ? (jho) n : null;
                jf0 jf0Var2 = jhoVar != null ? jhoVar.c : null;
                Integer x = jf0Var2 != null ? jf0Var2.x(kskVar2) : null;
                if (x != null) {
                    int intValue = x.intValue();
                    int h3 = fhoVar.h(kskVar2);
                    i31 = Math.max(i31, intValue != Integer.MIN_VALUE ? x.intValue() : 0);
                    if (intValue == Integer.MIN_VALUE) {
                        intValue = h3;
                    }
                    i12 = Math.max(i12, h3 - intValue);
                }
            }
            i13 = i31;
        } else {
            i12 = 0;
            i13 = 0;
        }
        int i33 = i21 + i9;
        int max3 = Math.max(i33 < 0 ? 0 : i33, i);
        int max4 = Math.max(i19, Math.max(i2, i12 + i13));
        int[] iArr3 = new int[i17];
        fhoVar.f(max3, iArr2, iArr3, mfhVar);
        return fhoVar.g(kskVarArr, mfhVar, i13, iArr3, max3, max4, iArr, i8, i6, i7);
    }

    public static final void y(Context context, String str, boolean z) {
        context.getClass();
        str.getClass();
        ypt a = fqt.a(str, true, false);
        rpt rptVar = rpt.NOT_FOUND;
        if (a == null) {
            ssg.a(5, null, "invalid urlScheme: ".concat(str), null);
            context.startActivity(StubActivity.z(context, rptVar));
            pz7 pz7Var = pz7.b;
            pz7Var.getClass();
            JsonObject jsonObject = new JsonObject();
            jsonObject.u("openUri_invalid_urlScheme", str);
            ot0.L(pz7Var.e(), "dev_metrics", jsonObject.toString());
            return;
        }
        if (a instanceof ibw) {
            int i = PlusHomeActivity.v;
            String str2 = ((ibw) a).g;
            str2.getClass();
            Intent intent = new Intent(context, (Class<?>) PlusHomeActivity.class);
            intent.putExtra("deeplink", str2);
            context.startActivity(intent);
            return;
        }
        if (!(a instanceof gw6)) {
            int i2 = UrlActivity.C;
            ru.yandex.music.common.media.context.a aVar = PlaybackScope.a;
            aVar.getClass();
            context.startActivity(zfm.a(context, a, aVar, null, z));
            return;
        }
        gw6 gw6Var = (gw6) a;
        t tVar = context instanceof t ? (t) context : null;
        fw6 b = gw6Var.b();
        if (tVar != null) {
            b.t(tVar);
        } else {
            v3w.l("invalid urlScheme: ", gw6Var.c, 5, null, null);
            context.startActivity(StubActivity.z(context, rptVar));
        }
    }

    public static final void z(Context context, String str) {
        String str2;
        context.getClass();
        Uri parse = Uri.parse(str);
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", parse));
        } catch (ActivityNotFoundException e) {
            hag.x(context, R.string.error_unknown, 0);
            if (parse == null || (str2 = parse.toString()) == null) {
                str2 = "";
            }
            Assertions.throwOrSkip("UrlUtils", new FailedAssertionException("Failed to open url: ".concat(str2), e));
        }
    }

    public abstract zkx M(flx flxVar);

    public abstract elx N(flx flxVar);

    public abstract void O(elx elxVar, elx elxVar2);

    public abstract void P(elx elxVar, Thread thread);

    public abstract boolean Q(flx flxVar, zkx zkxVar, zkx zkxVar2);

    public abstract boolean R(flx flxVar, Object obj, Object obj2);

    public abstract boolean S(flx flxVar, elx elxVar, elx elxVar2);
}
