package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.telephony.TelephonyManager;
import android.view.View;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.google.gson.JsonObject;
import com.yandex.music.core.ui.compose.b;
import com.yandex.music.shared.dto.playlist.PlaylistIdDto;
import com.yandex.music.shared.dto.track.TrackDto;
import com.yandex.music.shared.dto.wave.TrackParametersDto;
import com.yandex.music.shared.wave.data.network.response.SequenceItemDto;
import com.yandex.music.shared.webview.ui.screen.WebViewJsBridgeInstance;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public abstract class hyf {
    public static imp a;

    public static final seo A(Context context, Class cls, String str) {
        if (str == null || StringsKt.U(str)) {
            xq0.x("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            return null;
        }
        if (!Intrinsics.d(str, ":memory:")) {
            return new seo(context, cls, str);
        }
        xq0.x("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        return null;
    }

    public static void B(nci nciVar, ArrayList arrayList) {
        File[] listFiles;
        String str = nciVar.d;
        int i = nciVar.g;
        File y = mvt.y();
        if (y != null && (listFiles = y.listFiles()) != null && listFiles.length != 0) {
            String str2 = str + "_" + i;
            for (File file : listFiles) {
                file.getClass();
                String name = file.getName();
                name.getClass();
                if (c.v(name, str, false) && !c.v(name, str2, false)) {
                    file.delete();
                }
            }
        }
        String str3 = str + "_" + i;
        String str4 = nciVar.e;
        ls5 ls5Var = new ls5(arrayList);
        File file2 = new File(mvt.y(), str3);
        if (str4 == null || file2.exists()) {
            ls5Var.a(file2);
        } else {
            new s9c(str4, file2, ls5Var).execute(new String[0]);
        }
    }

    public static final t9f C(p8 p8Var, tq5 tq5Var, String str) {
        p8Var.getClass();
        t9f a2 = p8Var.a(tq5Var, str);
        if (a2 != null) {
            return a2;
        }
        vut.V(str, p8Var.c());
        throw null;
    }

    public static final t9f D(p8 p8Var, l6b l6bVar, Object obj) {
        p8Var.getClass();
        l6bVar.getClass();
        obj.getClass();
        t9f b = p8Var.b(l6bVar, obj);
        if (b != null) {
            return b;
        }
        lm4 a2 = ern.a(obj.getClass());
        f9f c = p8Var.c();
        c.getClass();
        String h = a2.h();
        if (h == null) {
            h = String.valueOf(a2);
        }
        vut.V(h, c);
        throw null;
    }

    public static View E(int i, View view) {
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalStateException("View with id [" + view.getResources().getResourceName(i) + "] doesn't exist");
    }

    public static final int F(long j) {
        msa msaVar = nsa.b;
        ssa ssaVar = ssa.HOURS;
        if (nsa.e(j, yd5.M(3, ssaVar))) {
            return 2;
        }
        return (int) nsa.s(j, ssaVar);
    }

    public static final String G(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("phone");
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        if (telephonyManager != null) {
            String networkCountryIso = telephonyManager.getPhoneType() == 2 ? null : telephonyManager.getNetworkCountryIso();
            if (networkCountryIso != null && networkCountryIso.length() != 0) {
                return networkCountryIso;
            }
        }
        return null;
    }

    public static final long H(long j) {
        msa msaVar = nsa.b;
        return yd5.M(eeh.b(nsa.s(j, ssa.SECONDS) / 60.0f), ssa.MINUTES);
    }

    public static final String I(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.j(AndroidCompositionLocals_androidKt.a);
        Resources resources = ((Context) oq5Var.j(AndroidCompositionLocals_androidKt.b)).getResources();
        return i == 0 ? resources.getString(R.string.navigation_menu) : i == 1 ? resources.getString(R.string.close_drawer) : i == 2 ? resources.getString(R.string.close_sheet) : i == 3 ? resources.getString(R.string.default_error_message) : i == 4 ? resources.getString(R.string.dropdown_menu) : i == 5 ? resources.getString(R.string.range_start) : i == 6 ? resources.getString(R.string.range_end) : i == 7 ? resources.getString(R.string.mc2_snackbar_pane_title) : "";
    }

    public static final aqi J(u7g u7gVar, boolean z, hq5 hq5Var, int i) {
        dzf dzfVar = (dzf) ((oq5) hq5Var).j(ykg.a);
        dcu dcuVar = dcu.One;
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        if (K == gq5.a) {
            K = new aok(5);
            oq5Var.k0(K);
        }
        return t7g.C(u7gVar, z, (Function0) K, dzfVar, oq5Var, 384 | (i & 112), 0);
    }

    public static wxt K(gc8 gc8Var, String str, String str2, xzb xzbVar) {
        Object t7oVar;
        kxt c = xzbVar.c(str);
        if (c == null) {
            wxt wxtVar = new wxt(hrg.q("Variable '", str, "' not defined!"), null);
            gc8Var.I(wxtVar);
            return wxtVar;
        }
        try {
            r7o r7oVar = z7o.b;
            c.g(str2);
            t7oVar = Unit.a;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a2 = z7o.a(t7oVar);
        if (a2 == null) {
            return null;
        }
        wxt wxtVar2 = new wxt(hrg.q("Variable '", str, "' mutation failed!"), a2);
        gc8Var.I(wxtVar2);
        return wxtVar2;
    }

    public static void L(gc8 gc8Var, String str, xzb xzbVar, Function1 function1) {
        Object t7oVar;
        kxt c = xzbVar.c(str);
        if (c == null) {
            gc8Var.I(new wxt(hrg.q("Variable '", str, "' not defined!"), null));
            return;
        }
        try {
            r7o r7oVar = z7o.b;
            c.h((kxt) function1.invoke(c));
            t7oVar = Unit.a;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a2 = z7o.a(t7oVar);
        if (a2 == null) {
            return;
        }
        gc8Var.I(new wxt(hrg.q("Variable '", str, "' mutation failed!"), a2));
    }

    public static final pjc M(Function2 function2) {
        return zsd.C(new eno(new w77(function2, (Continuation) null, 1)), -2);
    }

    public static final c0g N(e2g e2gVar) {
        if (Intrinsics.d(e2gVar, d2g.a)) {
            return c0g.b;
        }
        if (Intrinsics.d(e2gVar, b2g.a)) {
            return c0g.c;
        }
        if (Intrinsics.d(e2gVar, c2g.a)) {
            return c0g.a;
        }
        b6e.s();
        return null;
    }

    public static final ArrayList O(List list) {
        String uid;
        String kind;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PlaylistIdDto playlistIdDto = (PlaylistIdDto) it.next();
            nvl nvlVar = null;
            if (playlistIdDto != null && (uid = playlistIdDto.getUid()) != null && (kind = playlistIdDto.getKind()) != null) {
                nvlVar = new nvl(uid, kind);
            }
            if (nvlVar != null) {
                arrayList.add(nvlVar);
            }
        }
        return arrayList;
    }

    public static final zfo P(SequenceItemDto sequenceItemDto) {
        mqs a2;
        bzs bzsVar;
        TrackDto track = sequenceItemDto.getTrack();
        if (track == null || (a2 = wts.a(track)) == null) {
            return null;
        }
        TrackParametersDto trackParameters = sequenceItemDto.getTrackParameters();
        if (trackParameters != null) {
            Float bpm = trackParameters.getBpm();
            float floatValue = bpm != null ? bpm.floatValue() : 120.0f;
            Float hue = trackParameters.getHue();
            float floatValue2 = hue != null ? hue.floatValue() : 80.0f;
            Float userCollectionHue = trackParameters.getUserCollectionHue();
            Float energy = trackParameters.getEnergy();
            bzsVar = new bzs(floatValue, floatValue2, userCollectionHue, energy != null ? energy.floatValue() : 0.5f);
        } else {
            bzsVar = bzs.e;
        }
        return new zfo(a2, bzsVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (r1.equals("meta_tag_popular_artists") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (r1.equals("meta_tag_new_albums") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0085, code lost:
    
        r3 = new defpackage.cjt(defpackage.zpd.f, defpackage.rht.b, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r1.equals("micro_genre_albums") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a7, code lost:
    
        if (r1.equals("personal-artists") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0132, code lost:
    
        r4 = defpackage.d9g.a;
        r3 = new defpackage.cjt(r3, defpackage.rht.a, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b1, code lost:
    
        if (r1.equals("personal-playlists") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0116, code lost:
    
        r3 = new defpackage.cjt(defpackage.zpd.j, defpackage.rht.b, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bb, code lost:
    
        if (r1.equals("editorial-artists") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c5, code lost:
    
        if (r1.equals("new-playlists") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cf, code lost:
    
        if (r1.equals("editorial-compilation") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0103, code lost:
    
        r3 = new defpackage.cjt(defpackage.zpd.k, defpackage.rht.b, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d9, code lost:
    
        if (r1.equals("mixes-grid") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e6, code lost:
    
        r3 = new defpackage.cjt(defpackage.zpd.e, defpackage.rht.b, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e3, code lost:
    
        if (r1.equals("mixes-music") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f7, code lost:
    
        if (r1.equals("chart-albums") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0100, code lost:
    
        if (r1.equals("non-music-editorial-compilation") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0113, code lost:
    
        if (r1.equals("rewind-playlists") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0126, code lost:
    
        if (r1.equals("editorial-new-releases") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x016c, code lost:
    
        r3 = new defpackage.cjt(defpackage.zpd.f, defpackage.rht.b, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012f, code lost:
    
        if (r1.equals("new-stars-artists") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0143, code lost:
    
        if (r1.equals("new-releases") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r1.equals("micro_genre_top_artists") != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
    
        r4 = defpackage.d9g.a;
        r3 = new defpackage.cjt(r3, defpackage.rht.a, r2);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static gjt Q(tjt tjtVar) {
        cjt cjtVar;
        cjt cjtVar2;
        ujt ujtVar = tjtVar.c;
        String str = tjtVar.a;
        String str2 = tjtVar.b;
        int ordinal = ujtVar.ordinal();
        int i = 2;
        zpd zpdVar = null;
        int i2 = 1;
        if (ordinal == 0) {
            switch (str.hashCode()) {
                case -1981905191:
                    break;
                case -1494777037:
                    break;
                case -1452497633:
                    break;
                case -1313236401:
                    break;
                case -339914219:
                    break;
                case 386919603:
                    break;
                case 702013090:
                    break;
                case 715200297:
                    break;
                case 988348093:
                    break;
                case 1030012148:
                    break;
                case 1087805446:
                    break;
                case 1263661460:
                    break;
                case 1626198911:
                    break;
                default:
                    pz7 pz7Var = pz7.b;
                    pz7Var.getClass();
                    JsonObject jsonObject = new JsonObject();
                    jsonObject.u("universalScreen_unsupportedEntityType", str);
                    ot0.L(pz7Var.e(), "dev_metrics", jsonObject.toString());
                    cjtVar = new cjt(d9g.a, zpd.k, rht.b);
                    break;
            }
            return new gjt(str2, str, cjtVar);
        }
        if (ordinal != 1) {
            b6e.s();
            return null;
        }
        switch (str.hashCode()) {
            case -1772461125:
                break;
            case -1684984158:
                break;
            case -64369977:
                break;
            case 124597980:
                if (str.equals("meta_tag_popular_playlists")) {
                    cjtVar2 = new cjt(zpd.j, rht.b, i2);
                    break;
                }
                pz7 pz7Var2 = pz7.b;
                pz7Var2.getClass();
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.u("universalMetaTagScreen_unsupportedEntityType", str);
                ot0.L(pz7Var2.e(), "dev_metrics", jsonObject2.toString());
                cjtVar2 = new cjt(d9g.a, zpd.k, rht.b);
                break;
            case 588515243:
                break;
            default:
                pz7 pz7Var22 = pz7.b;
                pz7Var22.getClass();
                JsonObject jsonObject22 = new JsonObject();
                jsonObject22.u("universalMetaTagScreen_unsupportedEntityType", str);
                ot0.L(pz7Var22.e(), "dev_metrics", jsonObject22.toString());
                cjtVar2 = new cjt(d9g.a, zpd.k, rht.b);
                break;
        }
        return new gjt(str2, str, cjtVar2);
    }

    public static String R(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'a' && c <= 'z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static final void a(dh3 dh3Var, long j, long j2, hq5 hq5Var, int i) {
        int i2;
        dh3Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(218102238);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(dh3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.e(j2) ? 256 : 128;
        }
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            bg3.a(a.k(dh3Var.b(vci.a), 0.0f, -52, 1), null, false, ild.C(-1174415820, new z4j(0, j, j2), oq5Var), oq5Var, 3072, 6);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new km0(dh3Var, j, j2, i);
        }
    }

    public static rjq b() {
        return new rjq(false);
    }

    public static final void c(l5j l5jVar, int i, bc5 bc5Var, i5j i5jVar, yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var;
        long j;
        l5jVar.getClass();
        i5jVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(158837630);
        int i3 = i2 | (oq5Var2.f(l5jVar) ? 4 : 2) | (oq5Var2.d(i) ? 32 : 16) | (oq5Var2.f(bc5Var) ? 256 : 128) | (oq5Var2.f(i5jVar) ? 2048 : 1024) | (oq5Var2.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID);
        if (oq5Var2.P(i3 & 1, (i3 & 9363) != 9362)) {
            Integer num = l5jVar.g;
            d85 d85Var = num != null ? new d85(c3x.f(num.intValue())) : null;
            if (d85Var == null) {
                oq5Var2.Z(-1975850458);
                agr agrVar = eq0.a;
                j = c3x.D(((dq0) oq5Var2.j(agrVar)).c.c, ((dq0) oq5Var2.j(agrVar)).c.a);
                oq5Var2.p(false);
            } else {
                oq5Var2.Z(-1975852566);
                oq5Var2.p(false);
                j = d85Var.a;
            }
            Integer num2 = l5jVar.e;
            oq5Var = oq5Var2;
            pd.b(new qzm[0], true, ild.C(685932725, new x4j(num2 != null ? new d85(d85.b(jf0.g0(c3x.f(num2.intValue()), null, 0.4f, 1), 0.7f, 0.0f, 0.0f, 0.0f, 14)) : null, yciVar, j, i5jVar, l5jVar, i, gld.M(bc5Var.c(), oq5Var2), bc5Var), oq5Var2), oq5Var, 432, 0);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wda(l5jVar, i, bc5Var, i5jVar, yciVar, i2, 25);
        }
    }

    public static final void d(Boolean bool, yci yciVar, hq5 hq5Var, int i) {
        Boolean bool2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(349986199);
        int i2 = (oq5Var.f(bool) ? 4 : 2) | i | 48;
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            bool2 = bool;
        } else {
            Integer valueOf = Integer.valueOf(R.string.isOnDemandStart);
            oq5Var.a0(-2115993395);
            qs5 qs5Var = r8g.a;
            iag iagVar = (iag) oq5Var.j(qs5Var);
            oq5Var.p(false);
            boolean z = iagVar.N;
            oq5Var.a0(-2115993395);
            iag iagVar2 = (iag) oq5Var.j(qs5Var);
            oq5Var.p(false);
            vci vciVar = vci.a;
            bool2 = bool;
            h4a.i(valueOf, bool2, vciVar, false, z, iagVar2.O, oq5Var, (i2 << 3) & 1008, 8);
            yciVar = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uye(bool2, yciVar, i, 1);
        }
    }

    public static final void e(boolean z, boolean z2, Function0 function0, q0k q0kVar, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        boolean z3;
        boolean z4;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1836624317);
        int i2 = (oq5Var.g(z) ? 4 : 2) | i | (oq5Var.g(z2) ? 32 : 16) | (oq5Var.h(function0) ? 256 : 128);
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(q0kVar) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (oq5Var.P(i3 & 1, (i3 & 9363) != 9362)) {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = szf.g0(null);
                oq5Var.k0(K);
            }
            aqi aqiVar = (aqi) K;
            vci vciVar = vci.a;
            if (z2) {
                oq5Var.Z(-1286338031);
                Object K2 = oq5Var.K();
                if (K2 == kjnVar) {
                    K2 = new x80(aqiVar, 17);
                    oq5Var.k0(K2);
                }
                bzf.d(function0, a.o(androidx.compose.ui.layout.a.b(d.d(androidx.compose.ui.layout.a.f(vciVar, (Function1) K2), 1.0f), new tt5(28, q0kVar)), 0.0f, 16, 1), oq5Var, (i3 >> 6) & 14);
                z3 = false;
            } else {
                z3 = false;
                oq5Var.Z(-1287706433);
            }
            oq5Var.p(z3);
            if (z) {
                oq5Var.Z(-1286017429);
                yci d = d.d(vciVar, 1.0f);
                Object K3 = oq5Var.K();
                if (K3 == kjnVar) {
                    K3 = new jc(aqiVar, 19);
                    oq5Var.k0(K3);
                }
                z4 = false;
                pd.g(0, 0, oq5Var, d.x(a.o(androidx.compose.ui.layout.a.b(d, new f0g(2, (Function0) K3)), 0.0f, 8, 1), null, 3));
            } else {
                z4 = false;
                oq5Var.Z(-1287706433);
            }
            oq5Var.p(z4);
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new en6(z, z2, function0, q0kVar, yciVar2, i);
        }
    }

    public static final void f(zy2 zy2Var, Function0 function0, boolean z, Function0 function02, yci yciVar, Function0 function03, hq5 hq5Var, int i) {
        function0.getClass();
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1534392191);
        int i2 = i | (oq5Var.f(zy2Var) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.g(z) ? 256 : 128) | (oq5Var.h(function02) ? 2048 : 1024) | (oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.h(function03) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        if (oq5Var.P(i2 & 1, (74899 & i2) != 74898)) {
            ghh.a(zy2Var.a, function0, d.d(yciVar, 1.0f), null, ild.C(-1658579346, new s43(zy2Var, function03, function02, z, 20), oq5Var), e9g.a, null, oq5Var, 221184 | (i2 & 112), 72);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k5b(zy2Var, function0, z, function02, yciVar, function03, i);
        }
    }

    public static final void g(p0r p0rVar, w5t w5tVar, m0r m0rVar, yci yciVar, long j, hq5 hq5Var, int i) {
        long j2;
        long j3;
        int i2;
        m0rVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-946861375);
        int i3 = i | (oq5Var.f(p0rVar) ? 4 : 2) | (oq5Var.d(w5tVar.ordinal()) ? 32 : 16) | (oq5Var.f(m0rVar) ? 256 : 128) | (oq5Var.f(yciVar) ? 2048 : 1024) | RemoteCameraConfig.Notification.ID;
        if (oq5Var.P(i3 & 1, (i3 & 9363) != 9362)) {
            oq5Var.U();
            if ((i & 1) == 0 || oq5Var.y()) {
                j3 = ((dq0) oq5Var.j(eq0.a)).c.c;
                i2 = i3 & (-57345);
            } else {
                oq5Var.S();
                i2 = i3 & (-57345);
                j3 = j;
            }
            oq5Var.q();
            aqi Q = szf.Q(m0rVar.e(), oq5Var);
            aqi Q2 = szf.Q(m0rVar.c().h(), oq5Var);
            aqi Q3 = szf.Q(m0rVar.a(), oq5Var);
            aqi Q4 = szf.Q(m0rVar.b(), oq5Var);
            int ordinal = w5tVar.ordinal();
            Object obj = gq5.a;
            if (ordinal == 0) {
                oq5Var.Z(599321899);
                frs frsVar = (frs) Q2.getValue();
                boolean f = oq5Var.f(Q3);
                Object K = oq5Var.K();
                if (f || K == obj) {
                    K = new a9q(Q3, 10);
                    oq5Var.k0(K);
                }
                i(p0rVar, frsVar, m0rVar, j3, (Function0) K, (lzs) Q.getValue(), (e2g) Q4.getValue(), b.c(yciVar, "smart_preview_enabled", Boolean.valueOf(((frs) Q2.getValue()).a())), oq5Var, i2 & 910);
                oq5Var.p(false);
            } else {
                if (ordinal != 1) {
                    throw vz1.i(oq5Var, 599304080, false);
                }
                oq5Var.Z(599305710);
                frs frsVar2 = (frs) Q2.getValue();
                boolean f2 = oq5Var.f(Q3);
                Object K2 = oq5Var.K();
                if (f2 || K2 == obj) {
                    K2 = new a9q(Q3, 9);
                    oq5Var.k0(K2);
                }
                j(p0rVar, frsVar2, m0rVar, j3, (Function0) K2, (lzs) Q.getValue(), (e2g) Q4.getValue(), b.c(yciVar, "smart_preview_enabled", Boolean.valueOf(((frs) Q2.getValue()).a())), oq5Var, i2 & 910);
                oq5Var.p(false);
            }
            j2 = j3;
        } else {
            oq5Var.S();
            j2 = j;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new i0h(p0rVar, w5tVar, m0rVar, yciVar, j2, i, 1);
        }
    }

    public static final void h(w5t w5tVar, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1890294163);
        int i2 = (oq5Var.d(w5tVar.ordinal()) ? 4 : 2) | i | (oq5Var.g(true) ? 32 : 16) | 384;
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            int ordinal = w5tVar.ordinal();
            vci vciVar = vci.a;
            if (ordinal == 0) {
                oq5Var.Z(198482321);
                vut.k((i2 >> 3) & 126, 0, oq5Var, vciVar, true);
                oq5Var.p(false);
            } else {
                if (ordinal != 1) {
                    throw vz1.i(oq5Var, 198480436, false);
                }
                oq5Var.Z(198487064);
                ksw.d((i2 >> 3) & 126, 0, oq5Var, vciVar, true);
                oq5Var.p(false);
            }
            yciVar = vciVar;
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k0r(w5tVar, yciVar, i, 0);
        }
    }

    public static final void i(p0r p0rVar, frs frsVar, m0r m0rVar, long j, Function0 function0, lzs lzsVar, e2g e2gVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        lzs lzsVar2;
        oq5 oq5Var;
        kjn kjnVar;
        int i3;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1845363964);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(p0rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.d(frsVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var2.f(m0rVar) : oq5Var2.h(m0rVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.e(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var2.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var2.d(lzsVar.ordinal()) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            i2 |= oq5Var2.f(e2gVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        boolean z = false;
        if (oq5Var2.P(i2 & 1, (4793491 & i2) != 4793490)) {
            if ((i2 & 896) == 256 || ((i2 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 && oq5Var2.h(m0rVar))) {
                z = true;
            }
            Object K = oq5Var2.K();
            kjn kjnVar2 = gq5.a;
            if (z || K == kjnVar2) {
                kjnVar = kjnVar2;
                i3 = i2;
                vuq vuqVar = new vuq(0, m0rVar, m0r.class, "onLikeClick", "onLikeClick()V", 0, 3);
                oq5Var2.k0(vuqVar);
                K = vuqVar;
            } else {
                i3 = i2;
                kjnVar = kjnVar2;
            }
            h9f h9fVar = (h9f) K;
            c0g N = N(e2gVar);
            hg5 hg5Var = new hg5(p0rVar.f, p0rVar.g, p0rVar.e, p0rVar.d, false);
            rba rbaVar = rba.a;
            int i4 = i3;
            lzs lzsVar3 = lzs.a;
            boolean j2 = m0rVar.c().j();
            nxq nxqVar = nxq.c;
            bg5 c = m0rVar.c();
            boolean h = oq5Var2.h(c);
            Object K2 = oq5Var2.K();
            if (h || K2 == kjnVar) {
                K2 = new vuq(0, c, bg5.class, "onClick", "onClick()V", 0, 4);
                oq5Var2.k0(K2);
            }
            h9f h9fVar2 = (h9f) K2;
            bg5 c2 = m0rVar.c();
            boolean h2 = oq5Var2.h(c2);
            Object K3 = oq5Var2.K();
            if (h2 || K3 == kjnVar) {
                K3 = new vuq(0, c2, bg5.class, "onLongClick", "onLongClick()V", 0, 5);
                oq5Var2.k0(K3);
            }
            h9f h9fVar3 = (h9f) K3;
            bg5 c3 = m0rVar.c();
            boolean h3 = oq5Var2.h(c3);
            Object K4 = oq5Var2.K();
            if (h3 || K4 == kjnVar) {
                K4 = new vuq(0, c3, bg5.class, "onOverflowClick", "onOverflowClick()V", 0, 6);
                oq5Var2.k0(K4);
            }
            lzsVar2 = lzsVar;
            oq5Var = oq5Var2;
            t7g.c(hg5Var, rbaVar, lzsVar3, frsVar, j2, nxqVar, (Function0) h9fVar2, (Function0) h9fVar3, (Function0) ((h9f) K4), yciVar.f(androidx.compose.ui.draw.a.c(vci.a, new wt4(j, function0))), N, (Function0) h9fVar, ild.C(-1901319312, new t2n(18, p0rVar, lzsVar2, frsVar), oq5Var2), oq5Var, 197040 | ((i4 << 6) & 7168), 384, 0);
        } else {
            lzsVar2 = lzsVar;
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new l0r(p0rVar, frsVar, m0rVar, j, function0, lzsVar2, e2gVar, yciVar, i, 1);
        }
    }

    public static final void j(p0r p0rVar, frs frsVar, m0r m0rVar, long j, Function0 function0, lzs lzsVar, e2g e2gVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var;
        kjn kjnVar;
        int i3;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1715990986);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(p0rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.d(frsVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var2.f(m0rVar) : oq5Var2.h(m0rVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.e(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var2.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var2.d(lzsVar.ordinal()) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            i2 |= oq5Var2.f(e2gVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        boolean z = false;
        if (oq5Var2.P(i2 & 1, (4793491 & i2) != 4793490)) {
            if ((i2 & 896) == 256 || ((i2 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 && oq5Var2.h(m0rVar))) {
                z = true;
            }
            Object K = oq5Var2.K();
            kjn kjnVar2 = gq5.a;
            if (z || K == kjnVar2) {
                kjnVar = kjnVar2;
                i3 = i2;
                vuq vuqVar = new vuq(0, m0rVar, m0r.class, "onLikeClick", "onLikeClick()V", 0, 7);
                oq5Var2.k0(vuqVar);
                K = vuqVar;
            } else {
                i3 = i2;
                kjnVar = kjnVar2;
            }
            h9f h9fVar = (h9f) K;
            c0g N = N(e2gVar);
            f20 f20Var = new f20(p0rVar.c, p0rVar.b, p0rVar.f, null, p0rVar.e, p0rVar.d, false);
            rba rbaVar = rba.a;
            int i4 = i3;
            lzs lzsVar2 = lzs.a;
            boolean j2 = m0rVar.c().j();
            bg5 c = m0rVar.c();
            boolean h = oq5Var2.h(c);
            Object K2 = oq5Var2.K();
            if (h || K2 == kjnVar) {
                K2 = new vuq(0, c, bg5.class, "onClick", "onClick()V", 0, 8);
                oq5Var2.k0(K2);
            }
            h9f h9fVar2 = (h9f) K2;
            bg5 c2 = m0rVar.c();
            boolean h2 = oq5Var2.h(c2);
            Object K3 = oq5Var2.K();
            if (h2 || K3 == kjnVar) {
                K3 = new vuq(0, c2, bg5.class, "onLongClick", "onLongClick()V", 0, 9);
                oq5Var2.k0(K3);
            }
            h9f h9fVar3 = (h9f) K3;
            bg5 c3 = m0rVar.c();
            boolean h3 = oq5Var2.h(c3);
            Object K4 = oq5Var2.K();
            if (h3 || K4 == kjnVar) {
                K4 = new vuq(0, c3, bg5.class, "onOverflowClick", "onOverflowClick()V", 0, 10);
                oq5Var2.k0(K4);
            }
            oq5Var = oq5Var2;
            ksw.b(f20Var, rbaVar, lzsVar2, frsVar, j2, (Function0) h9fVar2, (Function0) h9fVar3, (Function0) ((h9f) K4), yciVar.f(androidx.compose.ui.draw.a.c(vci.a, new wt4(j, function0))), N, (Function0) h9fVar, lzsVar, oq5Var, 432 | ((i4 << 6) & 7168), (i4 >> 12) & 112, 0);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new l0r(p0rVar, frsVar, m0rVar, j, function0, lzsVar, e2gVar, yciVar, i, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x01fe, code lost:
    
        if (r13 == r15) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void k(final long j, final boolean z, final boolean z2, final Function1 function1, hq5 hq5Var, final int i) {
        int i2;
        kjn kjnVar;
        long j2;
        kjn kjnVar2;
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1057470305);
        int i3 = i | (oq5Var.e(j) ? 4 : 2) | (oq5Var.g(z) ? 32 : 16) | (oq5Var.g(z2) ? 256 : 128) | (oq5Var.h(function1) ? 2048 : 1024);
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            Object K = oq5Var.K();
            kjn kjnVar3 = gq5.a;
            if (K == kjnVar3) {
                msa msaVar = nsa.b;
                i2 = i3;
                kjnVar = kjnVar3;
                K = new yhs(j, yd5.M(1, ssa.MINUTES), yd5.M(3, ssa.HOURS));
                oq5Var.k0(K);
            } else {
                i2 = i3;
                kjnVar = kjnVar3;
            }
            yhs yhsVar = (yhs) K;
            if (((Boolean) yhsVar.d.getValue()).booleanValue()) {
                j2 = yhsVar.a();
            } else {
                yhsVar.c.setValue(new nsa(j));
                j2 = j;
            }
            msa msaVar2 = nsa.b;
            long n = nsa.n(j2, yd5.M(F(j2), ssa.HOURS));
            ssa ssaVar = ssa.SECONDS;
            float s = nsa.s(n, ssaVar) / 10.0f;
            int F = F(j2);
            vci vciVar = vci.a;
            yci f = d.f(a.o(vciVar, 12, 0.0f, 2), 250, 350);
            kfh d = ug3.d(b2c.b, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, f);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            long H2 = (((Boolean) yhsVar.d.getValue()).booleanValue() || !(z || z2)) ? H(j2) : j2;
            ssa ssaVar2 = ssa.MINUTES;
            String format = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(nsa.s(H2, ssaVar2)), Long.valueOf(nsa.s(H2, ssaVar) % 60)}, 2));
            iz2 iz2Var = b2c.f;
            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.a;
            yci a2 = androidx.compose.ui.platform.a.a(bVar.a(vciVar, iz2Var), "digital_time_text");
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = new phs(1);
                oq5Var.k0(K2);
            }
            kjn kjnVar4 = kjnVar;
            int i5 = i2;
            xcs.b(format, nfp.b(a2, false, (Function1) K2), ((dq0) oq5Var.j(eq0.a)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.e(), oq5Var, 0, 0, 65528);
            oq5Var = oq5Var;
            yci d2 = a.d(vciVar, 1.0f);
            int i6 = i5 & 7168;
            boolean z3 = i6 == 2048;
            Object K3 = oq5Var.K();
            int i7 = 5;
            if (z3) {
                kjnVar2 = kjnVar4;
            } else {
                kjnVar2 = kjnVar4;
            }
            K3 = new k32(i7, function1);
            oq5Var.k0(K3);
            final Function1 function12 = (Function1) K3;
            nsa nsaVar = new nsa(yhsVar.a);
            nsa nsaVar2 = new nsa(yhsVar.b);
            final yk5 yk5Var = new yk5(nsaVar, nsaVar2);
            final long M = yd5.M(5, ssaVar2);
            d2.getClass();
            function12.getClass();
            final long j3 = ((nsa) yhn.i(new nsa(j2), nsaVar, nsaVar2)).a;
            final long j4 = j2;
            yci a3 = bVar.a(d.d(nfp.b(d2, true, new Function1() { // from class: xhs
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    jfp jfpVar = (jfp) obj;
                    jfpVar.getClass();
                    long j5 = j4;
                    wfp.s(jfpVar, saf.r0(j5));
                    yk5 yk5Var2 = yk5Var;
                    Comparable comparable = yk5Var2.a;
                    long n2 = nsa.n(j5, ((nsa) comparable).a);
                    Comparable comparable2 = yk5Var2.b;
                    float d3 = (float) nsa.d(n2, nsa.n(((nsa) comparable2).a, ((nsa) comparable).a));
                    fq4 fq4Var = kg5.j;
                    long n3 = nsa.n(((nsa) comparable2).a, ((nsa) comparable).a);
                    long j6 = M;
                    oum oumVar = new oum(d3, fq4Var, eeh.a(nsa.d(n3, j6)) - 1);
                    xfp xfpVar = ufp.c;
                    s9f s9fVar = wfp.a[1];
                    xfpVar.getClass();
                    jfpVar.o(xfpVar, oumVar);
                    wfp.p(jfpVar, new ql4(yk5Var2, j6, j3, function12));
                    return Unit.a;
                }
            }), 1.0f), iz2Var);
            Unit unit = Unit.a;
            boolean z4 = ((i5 & 112) == 32) | (i6 == 2048);
            Object K4 = oq5Var.K();
            if (z4 || K4 == kjnVar2) {
                K4 = new whs(yhsVar, function1, z);
                oq5Var.k0(K4);
            }
            wxf.f(F, s, eur.a(a3, unit, (PointerInputEventHandler) K4), oq5Var, 0);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2(j, z, z2, function1, i) { // from class: vhs
                public final /* synthetic */ long a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ Function1 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(1);
                    hyf.k(this.a, this.b, this.c, this.d, (hq5) obj, R);
                    return Unit.a;
                }
            };
        }
    }

    public static final void l(l5j l5jVar, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1108777019);
        int i2 = (oq5Var.f(l5jVar) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            kfh d = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
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
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            jzb jzbVar = l5jVar.c.g;
            bg3.a(null, null, false, ild.C(1182063639, new qt(l5jVar, ox6.E(jzbVar, 0L, oq5Var, 6), jzbVar != null, 10), oq5Var), oq5Var, 3072, 7);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new m2g(l5jVar, yciVar, i, 22);
        }
    }

    public static final void m(yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-715573677);
        int i2 = i | 6;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            iz2 iz2Var = b2c.f;
            vci vciVar = vci.a;
            float f = 16;
            yci p = a.p(d.c(androidx.compose.ui.platform.a.a(vciVar, "informer_offline_wave"), 1.0f), f, 10, f, 4);
            kfh d = ug3.d(iz2Var, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, p);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, d, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            nho a2 = lho.a(qx0.e, b2c.l, oq5Var, 54);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, vciVar);
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
            xv7.j(rvf.M(R.string.informers_slow_network_with_offline_wave_playing_text, oq5Var), null, ((dq0) oq5Var.j(eq0.a)).b.a, 0L, 0L, 3, 0L, 2, false, 2, 0, null, ges.b(nu0.i(), 0L, 0L, null, null, 0L, 0, 0L, null, new h6g(17, e6g.b), 0, 0, 15728639), oq5Var, 0, 3120, 55034);
            oq5Var = oq5Var;
            oq5Var.p(true);
            oq5Var.p(true);
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cxd(yciVar2, i, 26);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [boolean, int] */
    public static final void n(final androidx.compose.foundation.layout.c cVar, final b7v b7vVar, final Function0 function0, z9v z9vVar, final z9v z9vVar2, yci yciVar, final Function0 function02, boolean z, final wn5 wn5Var, hq5 hq5Var, int i) {
        int i2;
        float f;
        final float f2;
        float f3;
        Object U;
        ?? r9;
        boolean z2;
        oq5 oq5Var;
        cVar.getClass();
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-197654969);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.f(b7vVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.h(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.h(z9vVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var2.h(z9vVar2) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var2.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            i2 |= oq5Var2.h(function02) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= oq5Var2.g(z) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((100663296 & i) == 0) {
            i2 |= oq5Var2.h(wn5Var) ? 67108864 : 33554432;
        }
        int i3 = i2;
        if ((i3 & 38347923) == 38347922 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            float f4 = 39;
            final float f5 = 20;
            final float f6 = (f4 - f5) - 4;
            float f7 = b7vVar.a;
            float f8 = 2 * f7;
            boolean c = ((i3 & 112) == 32) | oq5Var2.c(cVar.d());
            Object K = oq5Var2.K();
            if (c || K == gq5.a) {
                f = f7;
                f2 = f4;
                f3 = f8;
                U = szf.U(new Function0() { // from class: k3w
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i4;
                        float f9 = f6 + f5;
                        int ordinal = b7vVar.d.ordinal();
                        if (ordinal == 0) {
                            i4 = 12;
                        } else {
                            if (ordinal != 1) {
                                b6e.s();
                                return null;
                            }
                            i4 = 20;
                        }
                        float f10 = i4 + f9;
                        float f11 = g7v.c;
                        androidx.compose.foundation.layout.c cVar2 = cVar;
                        float d = (cVar2.d() - f10) - f2;
                        float d2 = cVar2.d();
                        float f12 = 0;
                        float f13 = ((cma) yhn.a(new cma(d2 - d), new cma(f12))).a;
                        float f14 = g7v.c;
                        float f15 = ((cma) yhn.a(new cma(f14 - f13), new cma(f12))).a;
                        int i5 = Float.compare(d2, f14) >= 0 ? 2 : 3;
                        if (d > f15) {
                            d = f15;
                        }
                        return new g7v(i5, d);
                    }
                });
                oq5Var2.k0(U);
            } else {
                U = K;
                f3 = f8;
                f = f7;
                f2 = f4;
            }
            final sdr sdrVar = (sdr) U;
            lx0 lx0Var = qx0.e;
            hz2 hz2Var = b2c.l;
            float f9 = b7vVar.a;
            vci vciVar = vci.a;
            yci q = a.q(vciVar, 0.0f, f9, 0.0f, f9, 5);
            float f10 = f2;
            final float f11 = f;
            yci f12 = d.t(d.e(q, b7vVar.c), f3, 0.0f, 2).f(yciVar);
            nho a2 = lho.a(lx0Var, hz2Var, oq5Var2, 54);
            int i4 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, f12);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var2, a2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var2, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var2, i4, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var2, H, kb5Var4);
            ov6 ov6Var = lya.a;
            final act S = weo.S(200, 0, ov6Var, 2);
            final boolean booleanValue = ((Boolean) z9vVar.invoke(oq5Var2, Integer.valueOf((i3 >> 9) & 14))).booleanValue();
            yci a3 = androidx.compose.animation.b.a(vciVar, S, 2);
            iz2 iz2Var = b2c.b;
            kfh d = ug3.d(iz2Var, false);
            int i5 = oq5Var2.P;
            androidx.compose.runtime.internal.a l2 = oq5Var2.l();
            yci H2 = vnj.H(oq5Var2, a3);
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, d, kb5Var);
            g0g.U(oq5Var2, l2, kb5Var2);
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var2, i5, kb5Var3);
            }
            g0g.U(oq5Var2, H2, kb5Var4);
            if (booleanValue) {
                r9 = 0;
                oq5Var2.Z(-1947989595);
            } else {
                oq5Var2.Z(-1944055385);
                int ordinal = b7vVar.d.ordinal();
                if (ordinal == 0) {
                    r9 = 0;
                    oq5Var2.Z(-1032540607);
                    oq5Var2.p(false);
                } else {
                    if (ordinal != 1) {
                        throw vz1.i(oq5Var2, -1032542789, false);
                    }
                    oq5Var2.Z(-1032538808);
                    u1g.l(oq5Var2, d.r(vciVar, 3 * b7vVar.g));
                    r9 = 0;
                    oq5Var2.p(false);
                }
            }
            oq5Var2.p(r9);
            oq5Var2.p(true);
            act S2 = weo.S(250, r9, ov6Var, 2);
            final float f13 = f3;
            oq5 oq5Var3 = oq5Var2;
            etn.e(z, null, androidx.compose.animation.c.e(S2, 2), androidx.compose.animation.c.f(S2, 2), null, ild.C(-1512035445, new pyc() { // from class: l3w
                @Override // defpackage.pyc
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6;
                    hq5 hq5Var2 = (hq5) obj2;
                    ((Integer) obj3).getClass();
                    ((am0) obj).getClass();
                    nho a4 = lho.a(qx0.a, b2c.l, hq5Var2, 48);
                    oq5 oq5Var4 = (oq5) hq5Var2;
                    int i7 = oq5Var4.P;
                    androidx.compose.runtime.internal.a l3 = oq5Var4.l();
                    vci vciVar2 = vci.a;
                    yci H3 = vnj.H(hq5Var2, vciVar2);
                    xp5.T.getClass();
                    grb grbVar2 = wp5.b;
                    oq5Var4.d0();
                    if (oq5Var4.O) {
                        oq5Var4.k(grbVar2);
                    } else {
                        oq5Var4.n0();
                    }
                    kb5 kb5Var5 = wp5.f;
                    g0g.U(hq5Var2, a4, kb5Var5);
                    kb5 kb5Var6 = wp5.e;
                    g0g.U(hq5Var2, l3, kb5Var6);
                    kb5 kb5Var7 = wp5.g;
                    if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i7))) {
                        ouj.x(i7, oq5Var4, i7, kb5Var7);
                    }
                    kb5 kb5Var8 = wp5.d;
                    g0g.U(hq5Var2, H3, kb5Var8);
                    u1g.l(hq5Var2, d.r(vciVar2, f6));
                    yci yciVar2 = (yci) function02.invoke();
                    b7v b7vVar2 = b7vVar;
                    float f14 = f5;
                    float f15 = f13;
                    float f16 = f11;
                    boolean z3 = booleanValue;
                    Function0 function03 = function0;
                    asq.r(b7vVar2, f14, f15, f16, z3, function03, z9vVar2, null, yciVar2, hq5Var2, 48);
                    int ordinal2 = b7vVar2.d.ordinal();
                    if (ordinal2 == 0) {
                        i6 = 12;
                    } else {
                        if (ordinal2 != 1) {
                            b6e.s();
                            return null;
                        }
                        i6 = 20;
                    }
                    u1g.l(hq5Var2, d.r(vciVar2, i6));
                    iz2 iz2Var2 = b2c.f;
                    yci a5 = androidx.compose.animation.b.a(d.x(vciVar2, null, 3), S, 2);
                    boolean f17 = oq5Var4.f(function03);
                    Object K2 = oq5Var4.K();
                    if (f17 || K2 == gq5.a) {
                        K2 = new gct(23, function03);
                        oq5Var4.k0(K2);
                    }
                    yci b = d.b(wyf.s(a5, (Function0) K2), 1.0f);
                    kfh d2 = ug3.d(iz2Var2, false);
                    int i8 = oq5Var4.P;
                    androidx.compose.runtime.internal.a l4 = oq5Var4.l();
                    yci H4 = vnj.H(hq5Var2, b);
                    oq5Var4.d0();
                    if (oq5Var4.O) {
                        oq5Var4.k(grbVar2);
                    } else {
                        oq5Var4.n0();
                    }
                    g0g.U(hq5Var2, d2, kb5Var5);
                    g0g.U(hq5Var2, l4, kb5Var6);
                    if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i8))) {
                        ouj.x(i8, oq5Var4, i8, kb5Var7);
                    }
                    g0g.U(hq5Var2, H4, kb5Var8);
                    wn5Var.invoke(sdrVar, hq5Var2, 0);
                    oq5Var4.p(true);
                    oq5Var4.p(true);
                    return Unit.a;
                }
            }, oq5Var2), oq5Var3, 1572870 | ((i3 >> 18) & 112));
            yci a4 = androidx.compose.animation.b.a(vciVar, S, 2);
            kfh d2 = ug3.d(iz2Var, false);
            int i6 = oq5Var3.P;
            androidx.compose.runtime.internal.a l3 = oq5Var3.l();
            yci H3 = vnj.H(oq5Var3, a4);
            oq5Var3.d0();
            if (oq5Var3.O) {
                oq5Var3.k(grbVar);
            } else {
                oq5Var3.n0();
            }
            g0g.U(oq5Var3, d2, kb5Var);
            g0g.U(oq5Var3, l3, kb5Var2);
            if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var3, i6, kb5Var3);
            }
            g0g.U(oq5Var3, H3, kb5Var4);
            if (booleanValue) {
                oq5Var3.Z(613866678);
                u1g.l(oq5Var3, d.r(vciVar, f10));
                z2 = false;
            } else {
                z2 = false;
                oq5Var3.Z(608271612);
            }
            oq5Var3.p(z2);
            oq5Var3.p(true);
            oq5Var3.p(true);
            oq5Var = oq5Var3;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new mc(cVar, b7vVar, function0, z9vVar, z9vVar2, yciVar, function02, z, wn5Var, i);
        }
    }

    public static final void o(Function0 function0, hq5 hq5Var, int i) {
        Function0 function02;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1105277370);
        int i2 = (oq5Var.h(function0) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
            function02 = function0;
        } else {
            float f = 48;
            vci vciVar = vci.a;
            yci a2 = androidx.compose.ui.platform.a.a(a.o(d.d(d.e(vciVar, f), 1.0f), 8, 0.0f, 2), "webview_close_button");
            kfh d = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a2);
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
            function02 = function0;
            aae.a(function02, androidx.compose.foundation.layout.b.a.a(d.m(vciVar, f), b2c.g), false, etn.o, oq5Var, (i2 & 14) | 24576, 12);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new xtp(function02, i, 9);
        }
    }

    public static final void p(mfv mfvVar, xfv xfvVar, boolean z, hq5 hq5Var, int i) {
        int i2;
        mfv mfvVar2;
        xfv xfvVar2;
        boolean z2;
        mfvVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1347074520);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var.f(mfvVar) : oq5Var.h(mfvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(xfvVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.g(z) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            mfvVar2 = mfvVar;
            xfvVar2 = xfvVar;
            z2 = z;
        } else {
            yci b = androidx.compose.foundation.a.b(d.c(vci.a, 1.0f), ((rfv) oq5Var.j(sfv.a)).a, vnj.i);
            kfh d = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, b);
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
            qfv qfvVar = (qfv) gld.O(mfvVar.b, oq5Var).getValue();
            if (Intrinsics.d(qfvVar, nfv.a)) {
                oq5Var.Z(-1695088574);
                oq5Var.p(false);
            } else if (Intrinsics.d(qfvVar, ofv.a)) {
                oq5Var.Z(-1695086980);
                q(0, oq5Var);
                oq5Var.p(false);
            } else {
                if (!(qfvVar instanceof pfv)) {
                    throw vz1.i(oq5Var, -1695091745, false);
                }
                oq5Var.Z(-1695084346);
                mfvVar2 = mfvVar;
                xfvVar2 = xfvVar;
                z2 = z;
                r((pfv) qfvVar, mfvVar2, xfvVar2, z2, oq5Var, (i2 << 3) & 8176);
                oq5Var.p(false);
                oq5Var.p(true);
            }
            mfvVar2 = mfvVar;
            xfvVar2 = xfvVar;
            z2 = z;
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yj(mfvVar2, xfvVar2, z2, i);
        }
    }

    public static final void q(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(699616348);
        if (i == 0 && oq5Var.z()) {
            oq5Var.S();
        } else {
            vci vciVar = vci.a;
            yci c = d.c(vciVar, 1.0f);
            kfh d = ug3.d(b2c.b, false);
            int i2 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, c);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            ((rfv) oq5Var.j(sfv.a)).getClass();
            weo.f.invoke(androidx.compose.foundation.layout.b.a.a(vciVar, b2c.f), oq5Var, 0);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new j1p(i, 29);
        }
    }

    public static final void r(pfv pfvVar, mfv mfvVar, xfv xfvVar, boolean z, hq5 hq5Var, int i) {
        int i2;
        boolean z2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1284585794);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(pfvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? oq5Var.f(mfvVar) : oq5Var.h(mfvVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(xfvVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.g(z) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            boolean z3 = (i2 & 14) == 4;
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z3 || K == kjnVar) {
                K = szf.g0(new xcv(pfvVar.a, pfvVar.c, pfvVar.b));
                oq5Var.k0(K);
            }
            aqi aqiVar = (aqi) K;
            yci z4 = gut.z(gut.p1(gut.a0(d.c(vci.a, 1.0f))));
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, z4);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            if (z) {
                oq5Var.Z(-2085102783);
                boolean z5 = (i2 & 112) == 32 || ((i2 & 64) != 0 && oq5Var.h(mfvVar));
                Object K2 = oq5Var.K();
                if (z5 || K2 == kjnVar) {
                    K2 = new jvu(15, mfvVar);
                    oq5Var.k0(K2);
                }
                z2 = false;
                o((Function0) K2, oq5Var, 0);
            } else {
                z2 = false;
                oq5Var.Z(-2088846250);
            }
            oq5Var.p(z2);
            t((xcv) aqiVar.getValue(), mfvVar, xfvVar, oq5Var, i2 & 1008);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pp(pfvVar, mfvVar, xfvVar, z, i, 19);
        }
    }

    public static final void s(xcv xcvVar, mfv mfvVar, xfv xfvVar, hq5 hq5Var, int i) {
        xcv xcvVar2;
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1142582294);
        if ((i & 6) == 0) {
            xcvVar2 = xcvVar;
            i2 = (oq5Var.f(xcvVar2) ? 4 : 2) | i;
        } else {
            xcvVar2 = xcvVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? oq5Var.f(mfvVar) : oq5Var.h(mfvVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(xfvVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                WebViewJsBridgeInstance webViewJsBridgeInstance = new WebViewJsBridgeInstance(new rjp(mfvVar, context));
                oq5Var.k0(webViewJsBridgeInstance);
                K = webViewJsBridgeInstance;
            }
            WebViewJsBridgeInstance webViewJsBridgeInstance2 = (WebViewJsBridgeInstance) K;
            vci vciVar = vci.a;
            yci c = d.c(vciVar, 1.0f);
            kfh d = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, c);
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
            qs5 qs5Var = sfv.a;
            ((rfv) oq5Var.j(qs5Var)).getClass();
            yci b = androidx.compose.foundation.layout.b.a.b(vciVar);
            yev yevVar = new yev(mfvVar);
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = new zev(mfvVar);
                oq5Var.k0(K2);
            }
            zev zevVar = (zev) K2;
            long j = ((rfv) oq5Var.j(qs5Var)).a;
            Object K3 = oq5Var.K();
            if (K3 == kjnVar) {
                K3 = new cev("ymBridge", "\n            javascript:(function() {\n                function receiveMessage(event) { \n                    if (typeof ymBridge !== 'undefined' && \n                        typeof ymBridge.postMessage === 'function') {\n                        ymBridge.postMessage(event.data);\n                    }\n                }\n                window.addEventListener(\"message\", receiveMessage, false);\n            })()\n        ", webViewJsBridgeInstance2);
                oq5Var.k0(K3);
            }
            ixf.n(xcvVar2, b, yevVar, j, xfvVar, null, zevVar, (cev) K3, null, false, oq5Var, (i2 & 14) | 100663296 | ((i2 << 9) & 458752), 0, 1600);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new xev(xcvVar, mfvVar, xfvVar, i, 1);
        }
    }

    public static final void t(xcv xcvVar, mfv mfvVar, xfv xfvVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2034112343);
        oq5Var.w();
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(xcvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? oq5Var.f(mfvVar) : oq5Var.h(mfvVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(xfvVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci a2 = androidx.compose.ui.platform.a.a(d.c(vci.a, 1.0f), "webview_container");
            kfh d = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a2);
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
            oq5Var.Z(-946426464);
            s(xcvVar, mfvVar, xfvVar, oq5Var, i2 & 1022);
            oq5Var.p(false);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new xev(xcvVar, mfvVar, xfvVar, i, 0);
        }
    }

    public static rzm u(szm szmVar) {
        szmVar.getClass();
        return szmVar instanceof rzm ? (rzm) szmVar : new qp2(szmVar, 11);
    }

    public static nci v(JSONObject jSONObject) {
        float[] fArr;
        float[] fArr2;
        if (jSONObject == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("use_case");
            String string2 = jSONObject.getString("asset_uri");
            String optString = jSONObject.optString("rules_uri", null);
            int i = jSONObject.getInt("version_id");
            oci ociVar = oci.d;
            JSONArray jSONArray = jSONObject.getJSONArray("thresholds");
            Set set = bp6.a;
            if (!set.contains(oci.class)) {
                try {
                } catch (Throwable th) {
                    bp6.a(oci.class, th);
                }
                if (!set.contains(ociVar) && jSONArray != null) {
                    try {
                        fArr = new float[jSONArray.length()];
                        int length = jSONArray.length();
                        for (int i2 = 0; i2 < length; i2++) {
                            try {
                                String string3 = jSONArray.getString(i2);
                                string3.getClass();
                                fArr[i2] = Float.parseFloat(string3);
                            } catch (JSONException unused) {
                            }
                        }
                    } catch (Throwable th2) {
                        bp6.a(ociVar, th2);
                    }
                    fArr2 = fArr;
                    string.getClass();
                    string2.getClass();
                    return new nci(string, string2, optString, i, fArr2);
                }
                fArr = null;
                fArr2 = fArr;
                string.getClass();
                string2.getClass();
                return new nci(string, string2, optString, i, fArr2);
            }
            fArr2 = null;
            string.getClass();
            string2.getClass();
            return new nci(string, string2, optString, i, fArr2);
        } catch (Exception unused2) {
            return null;
        }
    }

    public static eas w(String str, String str2) {
        if (str.length() > str2.length()) {
            eas w = w(str2, str);
            return new eas(w.a, w.c, w.b);
        }
        int length = str2.length() - 1;
        int length2 = str2.length() - str.length();
        int i = 0;
        while (i < length && i < str.length() && str.charAt(i) == str2.charAt(i)) {
            i++;
        }
        while (true) {
            int i2 = length - length2;
            if (i2 < i || str.charAt(i2) != str2.charAt(length)) {
                break;
            }
            length--;
        }
        int i3 = (length + 1) - i;
        return new eas(i, i3, i3 - length2);
    }

    public static float x(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    public static int y(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static h1t z(mqs mqsVar, gj gjVar, fvs fvsVar, n1t n1tVar, int i, cvl cvlVar, j1t j1tVar, i1t i1tVar, qe3 qe3Var) {
        m1t m1tVar;
        m1t m1tVar2;
        mqsVar.getClass();
        qe3Var.getClass();
        int ordinal = n1tVar.a.ordinal();
        if (ordinal == 0) {
            m1tVar2 = new znk(i1tVar.n());
        } else if (ordinal == 1) {
            m1tVar2 = new bnd(i1tVar.n());
        } else if (ordinal == 2) {
            f7l n = i1tVar.n();
            n.getClass();
            awc awcVar = new awc();
            awcVar.a = n;
            m1tVar2 = awcVar;
        } else if (ordinal != 3) {
            if (ordinal != 4) {
                b6e.s();
                return null;
            }
            f7l n2 = i1tVar.n();
            n2.getClass();
            gao gaoVar = new gao();
            gaoVar.a = new znk(n2);
            m1tVar2 = gaoVar;
        } else {
            if (cvlVar == null) {
                xq0.q("PlaylistHeader must be initialized for TrackSheetUsage == PLAYLIST");
                return null;
            }
            if (Intrinsics.d(cvlVar.c.a, i1tVar.o().c().a)) {
                m1tVar = new xdh(cvlVar, i1tVar.n(), i1tVar.l(), i1tVar.o());
                return new h1t(mqsVar, fvsVar, n1tVar, j1tVar, m1tVar, new uu5(mqsVar, gjVar, fvsVar, j1tVar, qe3Var, new n3m(i1tVar.n(), i1tVar.g(), i1tVar.d(), i1tVar.e(), new zhs(0, i1tVar, i1t.class, "generateFrom", "generateFrom()Ljava/lang/String;", 0, 12)), i1tVar), i1tVar.p(), i1tVar.f(), i1tVar.k(), i1tVar.c(), i1tVar.h(), i1tVar.m(), i, i1tVar.a());
            }
            m1tVar2 = new znk(i1tVar.n());
        }
        m1tVar = m1tVar2;
        return new h1t(mqsVar, fvsVar, n1tVar, j1tVar, m1tVar, new uu5(mqsVar, gjVar, fvsVar, j1tVar, qe3Var, new n3m(i1tVar.n(), i1tVar.g(), i1tVar.d(), i1tVar.e(), new zhs(0, i1tVar, i1t.class, "generateFrom", "generateFrom()Ljava/lang/String;", 0, 12)), i1tVar), i1tVar.p(), i1tVar.f(), i1tVar.k(), i1tVar.c(), i1tVar.h(), i1tVar.m(), i, i1tVar.a());
    }
}
