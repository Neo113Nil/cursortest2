package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.util.Base64;
import android.view.View;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.yandex.music.databases.user.UserDatabase;
import com.yandex.music.shared.player.download2.HlsMetaValidator$ValidationResult$IoException;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.json.JSONObject;
import ru.yandex.video.m3.ui.ListYandexPlayerView;

/* loaded from: classes3.dex */
public final class n71 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n71(nsb nsbVar, ArrayList arrayList, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.j = 11;
        this.k = nsbVar;
        this.l = arrayList;
        this.m = (uif) function1;
    }

    private final Object k(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        mm6 mm6Var = (mm6) this.k;
        pm6 pm6Var = pm6.d;
        pfm pfmVar = (pfm) this.l;
        has hasVar = (has) this.m;
        Continuation continuation = null;
        x97.y(mm6Var, null, pm6Var, new tl6(pfmVar, hasVar, continuation, 1), 1);
        return x97.y(mm6Var, null, pm6Var, new tl6(pfmVar, hasVar, continuation, 2), 1);
    }

    private final Object l(Object obj) {
        Continuation continuation;
        mm6 mm6Var = (mm6) this.m;
        vat vatVar = (vat) this.k;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        Pair pair = (Pair) vatVar.a;
        ve5 ve5Var = (ve5) vatVar.b;
        j7i j7iVar = (j7i) this.l;
        int i = 0;
        int i2 = 1;
        Iterator it = xz0.w(new r2f[]{j7iVar.K, j7iVar.L}).iterator();
        while (true) {
            continuation = null;
            if (!it.hasNext()) {
                break;
            }
            ((r2f) it.next()).g(null);
        }
        if (!((Collection) pair.a).isEmpty()) {
            j7iVar.G = ve5Var;
            s6i s6iVar = new s6i((List) pair.a, (a0p) pair.b, ve5Var);
            j7iVar.K = x97.y(mm6Var, null, null, new o6i(j7iVar, s6iVar, continuation, i), 3);
            j7iVar.L = x97.y(mm6Var, null, null, new o6i(j7iVar, s6iVar, continuation, i2), 3);
        }
        return Unit.a;
    }

    private final Object n(Object obj) {
        Object obj2;
        InputStream inputStream = (InputStream) this.k;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        if (inputStream != null) {
            long readLong = new DataInputStream(inputStream).readLong();
            xdh xdhVar = (xdh) this.l;
            Gson gson = (Gson) xdhVar.a;
            coi coiVar = (coi) xdhVar.d;
            try {
                obj2 = gson.c(new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), RemoteCameraConfig.Notification.ID), TypeToken.get((Type) this.m));
            } catch (Exception e) {
                if (!(e instanceof IllegalStateException) && !(e instanceof JsonParseException) && !(e instanceof NumberFormatException) && !(e instanceof IOException)) {
                    ssg.a(7, "runWithGsonErrorCatching", "Unexpected exception, converter don't should throw it", e);
                    throw e;
                }
                coiVar.invoke(e);
                obj2 = null;
            }
            if (obj2 != null) {
                return new Pair(obj2, new Long(readLong));
            }
        }
        return null;
    }

    private final Object o(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        bvk v = ((ivk) this.k).b.v();
        ruk rukVar = (ruk) this.l;
        String str = (String) this.m;
        String str2 = rukVar.e;
        String str3 = rukVar.O;
        String str4 = !Intrinsics.d(str3, CommonUrlParts.Values.FALSE_INTEGER) ? str3 : null;
        String str5 = rukVar.x;
        String str6 = rukVar.C;
        String str7 = rukVar.B;
        String str8 = rukVar.A;
        String str9 = rukVar.p;
        String str10 = rukVar.r;
        Boolean bool = rukVar.s;
        Boolean bool2 = rukVar.t;
        Boolean bool3 = rukVar.u;
        String str11 = rukVar.v;
        String str12 = rukVar.w;
        Float f = rukVar.k;
        Boolean bool4 = rukVar.l;
        Boolean bool5 = rukVar.m;
        String str13 = rukVar.q;
        String str14 = rukVar.o;
        String str15 = rukVar.d;
        String str16 = rukVar.E;
        Boolean bool6 = rukVar.D;
        Boolean bool7 = rukVar.c;
        String str17 = rukVar.z;
        String str18 = rukVar.b;
        String str19 = rukVar.g;
        String str20 = rukVar.h;
        String str21 = rukVar.a;
        String str22 = rukVar.y;
        Float f2 = rukVar.j;
        Float f3 = rukVar.i;
        String a = rukVar.a();
        Float f4 = rukVar.n;
        String str23 = rukVar.f;
        String str24 = rukVar.F;
        Boolean bool8 = rukVar.G;
        gxc gxcVar = rukVar.H;
        String str25 = gxcVar != null ? gxcVar.a : null;
        String str26 = gxcVar != null ? gxcVar.b : null;
        gj gjVar = rukVar.I;
        String str27 = gjVar != null ? gjVar.a : null;
        String str28 = gjVar != null ? gjVar.b : null;
        String str29 = gjVar != null ? gjVar.c : null;
        String str30 = gjVar != null ? gjVar.d : null;
        String str31 = gjVar != null ? gjVar.e : null;
        String str32 = rukVar.J;
        Boolean bool9 = rukVar.K;
        Float f5 = rukVar.L;
        e4c e4cVar = rukVar.M;
        fvk fvkVar = new fvk(0L, str2, str4, str5, str6, str7, str8, str9, str10, bool, bool2, bool3, str11, str12, f, bool4, bool5, str13, str14, str15, bool6, str16, bool7, str17, str18, str19, str20, str21, str22, f2, f3, a, f4, str23, str, str24, bool8, str25, str27, str28, str29, str30, str31, str26, str32, bool9, f5, e4cVar != null ? e4cVar.a : null, rukVar.N);
        v.getClass();
        up6.F(v.a, false, true, new avi(11, v, fvkVar));
        return Unit.a;
    }

    private final Object p(Object obj) {
        uvk uvkVar;
        ruk rukVar;
        boolean z;
        int i;
        ruk rukVar2;
        tfs tfsVar;
        Date b;
        Date b2;
        tfs tfsVar2;
        Date b3;
        Date b4;
        fkn fknVar;
        h4q h4qVar;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        vvk vvkVar = (vvk) this.k;
        aqd aqdVar = (aqd) this.l;
        uvk uvkVar2 = (uvk) this.m;
        ruk rukVar3 = uvkVar2.a;
        uvk uvkVar3 = uvkVar2.b;
        uol uolVar = o5g.a;
        Float valueOf = (uolVar == null || (fknVar = uolVar.j) == null || (h4qVar = (h4q) fknVar.a.getValue()) == null) ? null : Float.valueOf(h4qVar.a);
        int i2 = 0;
        boolean z2 = valueOf != null && (((double) valueOf.floatValue()) > 1.1d || ((double) valueOf.floatValue()) < 0.9d);
        while (true) {
            if (uvkVar3 == null) {
                break;
            }
            ruk rukVar4 = uvkVar3.a;
            if (z2) {
                uvkVar = uvkVar3;
                rukVar = rukVar3;
                z = z2;
                i = i2;
            } else {
                String str = vvkVar.b;
                Float f = rukVar3.i;
                String str2 = rukVar3.h;
                String str3 = rukVar3.f;
                Float f2 = rukVar3.k;
                Float f3 = rukVar3.j;
                Float f4 = rukVar3.n;
                if (f == null || f4 == null || rukVar3.a() == null || f3 == null || f2 == null || str3 == null || str2 == null) {
                    uvkVar = uvkVar3;
                    rukVar2 = rukVar3;
                    z = z2;
                    i = i2;
                } else {
                    Float f5 = rukVar4.i;
                    String str4 = rukVar4.h;
                    z = z2;
                    String str5 = rukVar4.f;
                    Float f6 = rukVar4.k;
                    i = i2;
                    Float f7 = rukVar4.j;
                    if (f5 == null) {
                        uvkVar = uvkVar3;
                    } else {
                        uvkVar = uvkVar3;
                        if (rukVar4.n != null && rukVar4.a() != null && f7 != null && f6 != null && str5 != null && str4 != null && f.floatValue() > 1.0f && f.floatValue() < f4.floatValue()) {
                            rukVar2 = rukVar3;
                            if (Intrinsics.d(rukVar3.a(), rukVar4.a()) && Intrinsics.c(f, rukVar4.i) && Intrinsics.c(f3, f7) && Intrinsics.c(f2, f6) && !str3.equals(str5) && (b = (tfsVar = tfs.d).b(str2)) != null && (b2 = tfsVar.b(str4)) != null) {
                                msa msaVar = nsa.b;
                                int c = nsa.c(yd5.L(f.floatValue(), ssa.SECONDS), yd5.N(b.getTime() - b2.getTime(), ssa.MILLISECONDS));
                                String str6 = (String) aqdVar.b;
                                if (c > 0) {
                                    if (str6 != null) {
                                        ((u9w) vvkVar.a.getValue()).getClass();
                                        bow.z("play_audio_events", str6);
                                        ssg.a(4, str, str6, null);
                                    }
                                    Assertions.throwOrSkip(str, new FailedAssertionException("check2", (Exception) aqdVar.c));
                                } else {
                                    if (str6 != null) {
                                        ((u9w) vvkVar.a.getValue()).getClass();
                                        bow.z("play_audio_events", str6);
                                        ssg.a(4, str, str6, null);
                                    }
                                    Assertions.throwOrSkip(str, new FailedAssertionException("check1", (Exception) aqdVar.c));
                                }
                            }
                        }
                    }
                    rukVar2 = rukVar3;
                }
                String str7 = vvkVar.b;
                rukVar = rukVar2;
                Float f8 = rukVar.i;
                String str8 = rukVar.h;
                String str9 = rukVar.f;
                Float f9 = rukVar.n;
                if (f8 != null && f9 != null && str9 != null && str8 != null) {
                    Float f10 = rukVar4.i;
                    String str10 = rukVar4.h;
                    String str11 = rukVar4.f;
                    if (f10 != null && rukVar4.n != null && str11 != null && str10 != null && f8.floatValue() > 1.0f && f8.floatValue() < f9.floatValue() && !str9.equals(str11) && (b3 = (tfsVar2 = tfs.d).b(str8)) != null && (b4 = tfsVar2.b(str10)) != null) {
                        msa msaVar2 = nsa.b;
                        if (nsa.c(yd5.L(f8.floatValue(), ssa.SECONDS), yd5.N(b3.getTime() - b4.getTime(), ssa.MILLISECONDS)) > 0) {
                            String str12 = (String) aqdVar.b;
                            if (str12 != null) {
                                ((u9w) vvkVar.a.getValue()).getClass();
                                bow.z("play_audio_events", str12);
                                ssg.a(4, str7, str12, null);
                            }
                            Assertions.throwOrSkip(str7, new FailedAssertionException("check3", (Exception) aqdVar.c));
                        }
                    }
                }
            }
            i2 = i + 1;
            if (i2 >= vvkVar.c) {
                uvkVar.b = null;
                break;
            }
            rukVar3 = rukVar;
            z2 = z;
            uvkVar3 = uvkVar.b;
        }
        return Unit.a;
    }

    private final Object q(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        tam tamVar = (tam) this.k;
        List list = (List) this.l;
        List list2 = (List) this.m;
        List Y = o2g.Y(list);
        List Y2 = o2g.Y(list2);
        tamVar.p = Y2;
        ArrayList H = hag.H(Y2);
        ArrayList M = a0g.M(Y, new fam(1));
        return (H.isEmpty() && M.isEmpty()) ? oam.a : new qam(new nam(M, H));
    }

    private final Object s(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        i6n i6nVar = (i6n) this.k;
        Context context = i6nVar.a;
        xxq xxqVar = (xxq) this.l;
        xxqVar.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("audio_quality_prefs" + xxqVar.a, 0);
        sharedPreferences.getClass();
        i7q i7qVar = (i7q) this.m;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.getClass();
        edit.putString("preferable_audio_quality", i7qVar.a);
        edit.apply();
        x0q x0qVar = i6nVar.b;
        Unit unit = Unit.a;
        x0qVar.a(unit);
        return unit;
    }

    private final Object t(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        ssg.a(6, "EntityStorage", "Not yet implemented : fetchWaveEntityAndStartSessionBySeeds seeds=" + ((s9p) this.k) + " entityMode=" + ((o4q) this.l) + " fromData=" + ((gxc) this.m), null);
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new n71((o3k) this.k, (t71) this.l, (aqi) this.m, continuation, 0);
            case 1:
                return new n71((kz1) this.k, (List) this.l, (List) this.m, continuation, 1);
            case 2:
                n71 n71Var = new n71((css) this.l, (w62) this.m, continuation, 2);
                n71Var.k = obj;
                return n71Var;
            case 3:
                return new n71((c74) this.k, (List) this.l, (String) this.m, continuation, 3);
            case 4:
                return new n71((pr6) this.k, (Function1) this.l, (Function0) this.m, continuation, 4);
            case 5:
                n71 n71Var2 = new n71((qne) this.l, (cb7) this.m, continuation, 5);
                n71Var2.k = obj;
                return n71Var2;
            case 6:
                n71 n71Var3 = new n71((nq7) this.l, (k4d) this.m, continuation, 6);
                n71Var3.k = obj;
                return n71Var3;
            case 7:
                return new n71((u89) this.k, (w1g) this.l, (View) this.m, continuation, 7);
            case 8:
                n71 n71Var4 = new n71((b5a) this.l, (t5a) this.m, continuation, 8);
                n71Var4.k = obj;
                return n71Var4;
            case 9:
                return new n71((xaa) this.k, (Long) this.l, (ohr) this.m, continuation, 9);
            case 10:
                n71 n71Var5 = new n71((zwa) this.l, (mm6) this.m, continuation, 10);
                n71Var5.k = obj;
                return n71Var5;
            case 11:
                return new n71((nsb) this.k, (ArrayList) this.l, (Function1) this.m, continuation);
            case 12:
                n71 n71Var6 = new n71((xqn) this.l, (qln) this.m, continuation, 12);
                n71Var6.k = obj;
                return n71Var6;
            case 13:
                return new n71((bm2) this.k, (bm2) this.l, (qdc) this.m, continuation, 13);
            case 14:
                return new n71((k0o) this.k, (cr) this.l, (ListYandexPlayerView) this.m, continuation, 14);
            case 15:
                return new n71((zzd) this.k, (cts) this.l, (fts) this.m, continuation, 15);
            case 16:
                return new n71((fjf) this.k, (djf) this.l, (drf) this.m, continuation, 16);
            case 17:
                return new n71((l4a) this.k, (dn9) this.l, (teg) this.m, continuation, 17);
            case 18:
                return new n71((rke) this.k, (Context) this.l, (kle) this.m, continuation, 18);
            case 19:
                return new n71(continuation, (klg) this.k, (Function2) this.l, (cvl) this.m, 19);
            case 20:
                return new n71(continuation, (klg) this.k, (cvl) this.l, (klg) this.m, 20);
            case 21:
                n71 n71Var7 = new n71((pfm) this.l, (has) this.m, continuation, 21);
                n71Var7.k = obj;
                return n71Var7;
            case 22:
                n71 n71Var8 = new n71((j7i) this.l, (mm6) this.m, continuation, 22);
                n71Var8.k = obj;
                return n71Var8;
            case 23:
                n71 n71Var9 = new n71((xdh) this.l, (Type) this.m, continuation, 23);
                n71Var9.k = obj;
                return n71Var9;
            case 24:
                return new n71(continuation, (ivk) this.k, (ruk) this.l, (String) this.m, 24);
            case 25:
                return new n71((vvk) this.k, (aqd) this.l, (uvk) this.m, continuation, 25);
            case 26:
                return new n71((tam) this.k, (List) this.l, (List) this.m, continuation, 26);
            case 27:
                return new n71((i6n) this.k, (xxq) this.l, (i7q) this.m, continuation, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new n71((s9p) this.k, (o4q) this.l, (gxc) this.m, continuation, 28);
            default:
                return new n71((ayg) this.k, (Context) this.l, (String) this.m, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((n71) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((n71) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((n71) create((UserDatabase) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((n71) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((n71) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((n71) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((n71) create((j1g) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((n71) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((n71) create((syn) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((n71) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((n71) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 11:
                return ((n71) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 12:
                return ((n71) create(new gd4(((gd4) obj).a), (Continuation) obj2)).invokeSuspend(Unit.a);
            case 13:
                return ((n71) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 14:
                return ((n71) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 15:
                return ((n71) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 16:
                return ((n71) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 17:
                return ((n71) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 18:
                return ((n71) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 19:
                return ((n71) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 20:
                return ((n71) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 21:
                return ((n71) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 22:
                return ((n71) create((vat) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 23:
                return ((n71) create((InputStream) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 24:
                return ((n71) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 25:
                return ((n71) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 26:
                return ((n71) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 27:
                return ((n71) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((n71) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                return null;
            default:
                return ((n71) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0471, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r3 != null ? r3.b : null, r0 != null ? r0.b : null) != false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0649, code lost:
    
        if (r5.equals("https") == false) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0674, code lost:
    
        ((defpackage.q89) r0.b).getClass();
        r2.getClass();
        r0 = (java.lang.String) defpackage.q89.b.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0686, code lost:
    
        if (r0 == null) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0688, code lost:
    
        r3 = defpackage.gyg.a;
        r3 = new defpackage.ikn(defpackage.fxf.T(new java.io.ByteArrayInputStream(r0.getBytes())));
        r0 = defpackage.b7f.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:?, code lost:
    
        return defpackage.gyg.e(new defpackage.m7f(r3), r2, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x06a9, code lost:
    
        r0 = defpackage.gyg.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x06ab, code lost:
    
        if (r2 != null) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x06ae, code lost:
    
        r11 = defpackage.byg.b.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x06b4, code lost:
    
        if (r11 == null) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:?, code lost:
    
        return new defpackage.nzg(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x06be, code lost:
    
        r11 = defpackage.ff7.I(r3).X(r3, r2, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x06c6, code lost:
    
        if (r2 == null) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x06c8, code lost:
    
        r0 = r11.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x06ca, code lost:
    
        if (r0 == null) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x06cc, code lost:
    
        defpackage.byg.b.a.put(r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:?, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:?, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:?, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0670, code lost:
    
        if (r5.equals("http") == false) goto L270;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v152, types: [dt2, k0o] */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r3v50, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Function1 function1;
        Object t7oVar;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        String str;
        onq e;
        String str2;
        boolean contains;
        Bitmap bitmap;
        int i = 6;
        int i2 = 1;
        int i3 = 0;
        ?? r11 = 0;
        ayg aygVar = null;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                ((t71) this.l).e(((e81) ((v71) ((aqi) this.m).getValue()).b.get(((o3k) this.k).j())).a);
                return Unit.a;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                kz1 kz1Var = (kz1) this.k;
                List list = (List) this.l;
                List list2 = (List) this.m;
                List Y = o2g.Y(list);
                List Y2 = o2g.Y(list2);
                kz1Var.p = Y2;
                ArrayList H = hag.H(Y2);
                ArrayList M = a0g.M(Y, new uv1(i2));
                return (H.isEmpty() && M.isEmpty()) ? fz1.a : new hz1(new ez1(M, H));
            case 2:
                UserDatabase userDatabase = (UserDatabase) this.k;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                hb2 w = userDatabase.w();
                css cssVar = (css) this.l;
                w.getClass();
                cssVar.getClass();
                return new u62(bg3.v(w.a, false, new String[]{"auto_tracks_cache_info", "tracks_cache"}, new gb2(cssVar, i3)), (w62) this.m, i2);
            case 3:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                c74 c74Var = (c74) this.k;
                List list3 = (List) this.l;
                String str3 = (String) this.m;
                StringBuilder sb = new StringBuilder("----\npult technical info:\n\n");
                for (Object obj2 : list3) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        u75.n();
                        throw null;
                    }
                    ggd ggdVar = (ggd) obj2;
                    sb.append("* station_" + i3 + "_id : " + ggdVar.a());
                    sb.append('\n');
                    sb.append("* station_" + i3 + "_name : " + ggdVar.b());
                    sb.append('\n');
                    sb.append("* station_" + i3 + "_mode : " + (Intrinsics.d(ggdVar.a(), str3) ? "casting" : ggdVar.d() ? "available" : "unavailable"));
                    sb.append('\n');
                    if (ggdVar instanceof egd) {
                        egd egdVar = (egd) ggdVar;
                        sb.append("* station_" + i3 + "_firmware : " + egdVar.e);
                        sb.append('\n');
                        sb.append("* station_" + i3 + "_features : [" + CollectionsKt.X(egdVar.c, StringUtils.COMMA, null, null, null, 62) + "]");
                        sb.append('\n');
                    } else if (!(ggdVar instanceof fgd)) {
                        b6e.s();
                        return null;
                    }
                    i3 = i4;
                }
                sb.append('\n');
                sb.append("* username : " + ((frt) c74Var.b.getValue()).c().b);
                sb.append('\n');
                sb.append("* puid : " + c74Var.d);
                sb.append("\n\n");
                Object systemService = c74Var.a.getApplicationContext().getSystemService("wifi");
                systemService.getClass();
                WifiManager wifiManager = (WifiManager) systemService;
                sb.append("* wifi_enabled : " + wifiManager.isWifiEnabled());
                sb.append('\n');
                sb.append("* wifi_name : " + wifiManager.getConnectionInfo().getSSID());
                sb.append('\n');
                sb.append("* wifi_frequency : " + wifiManager.getConnectionInfo().getFrequency());
                sb.append('\n');
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                networkInterfaces.getClass();
                ArrayList list4 = Collections.list(networkInterfaces);
                list4.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    Enumeration<InetAddress> inetAddresses = ((NetworkInterface) it.next()).getInetAddresses();
                    inetAddresses.getClass();
                    ArrayList list5 = Collections.list(inetAddresses);
                    list5.getClass();
                    z75.t(arrayList, list5);
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        if (!((InetAddress) next).isLoopbackAddress()) {
                            r11 = next;
                        }
                    }
                }
                InetAddress inetAddress = (InetAddress) r11;
                sb.append("* wifi_ip_version : ".concat(inetAddress != null ? inetAddress instanceof Inet4Address ? "v4" : inetAddress instanceof Inet6Address ? "v6" : "unknown" : "not found"));
                sb.append("\n\n");
                String str4 = Build.MANUFACTURER;
                String str5 = Build.MODEL;
                int i5 = Build.VERSION.SDK_INT;
                StringBuilder m = f1d.m("* device_info : ", str4, StringUtil.SPACE, str5, StringUtil.SPACE);
                m.append(i5);
                m.append(StringUtil.LF);
                sb.append(m.toString());
                return sb.toString();
            case 4:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                pr6 pr6Var = (pr6) this.k;
                if (pr6Var.b && (function1 = (Function1) this.l) != null) {
                    function1.invoke(pr6Var.a);
                }
                ((Function0) this.m).invoke();
                return Unit.a;
            case 5:
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                mm6 mm6Var = (mm6) this.k;
                qne qneVar = (qne) this.l;
                ou7 ou7Var = (ou7) qneVar.a;
                if (ou7Var != null) {
                    return ou7Var;
                }
                ou7 p = x97.p(mm6Var, null, null, new ja4((cb7) this.m, r11, 23), 3);
                qneVar.a = p;
                x97.y(mm6Var, null, null, new bv6(p, qneVar, r11, 17), 3);
                return p;
            case 6:
                e5d e5dVar = ((k4d) this.m).a;
                nq7 nq7Var = (nq7) this.l;
                j1g j1gVar = (j1g) this.k;
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                int ordinal = j1gVar.ordinal();
                if (ordinal == 0) {
                    nq7.b(nq7Var, e4d.LIKE, true, e5dVar.a, v2l.a);
                } else if (ordinal != 1) {
                    if (ordinal != 2) {
                        b6e.s();
                        return null;
                    }
                    nq7.b(nq7Var, e4d.DISLIKE, true, e5dVar.a, s2l.a);
                }
                return Unit.a;
            case 7:
                nm6 nm6Var8 = nm6.a;
                qgg.h0(obj);
                le3 le3Var = ((u89) this.k).c;
                w1g w1gVar = (w1g) this.l;
                Context context = ((bgg) ((View) this.m)).getContext();
                le3Var.getClass();
                if (!(w1gVar instanceof ryg)) {
                    if (!(w1gVar instanceof qyg)) {
                        b6e.s();
                        return null;
                    }
                    JSONObject jSONObject = ((qyg) w1gVar).a;
                    String hexString = Integer.toHexString(jSONObject.hashCode());
                    HashMap hashMap = gyg.a;
                    ikn iknVar = new ikn(fxf.T(new ByteArrayInputStream(jSONObject.toString().getBytes())));
                    String[] strArr = b7f.e;
                    return gyg.e(new m7f(iknVar), hexString, true);
                }
                String str6 = ((ryg) w1gVar).a;
                z89 z89Var = (z89) le3Var.a;
                String scheme = Uri.parse(str6).getScheme();
                if (scheme != null) {
                    switch (scheme.hashCode()) {
                        case -1951681592:
                            if (scheme.equals("divkit-asset")) {
                                String Y3 = StringsKt.Y(str6, "divkit-asset://");
                                if (!c.v(Y3, "divkit/", false)) {
                                    Y3 = "divkit/".concat(StringsKt.Y(Y3, "/"));
                                }
                                HashMap hashMap2 = gyg.a;
                                return gyg.b(context, Y3, "asset_".concat(Y3));
                            }
                            break;
                        case 112800:
                            if (scheme.equals("res")) {
                                z89Var.getClass();
                                return new nzg(new IllegalArgumentException(hrg.q("Failed to map ", str6, " to internal resource")));
                            }
                            break;
                        case 3213448:
                            break;
                        case 93121264:
                            if (scheme.equals("asset")) {
                                z89Var.getClass();
                                return new nzg(new IllegalArgumentException(hrg.q("Failed to map ", str6, " to internal resource")));
                            }
                            break;
                        case 99617003:
                            break;
                    }
                }
                return new nzg(new IllegalArgumentException(f1d.g("Failed to retrieve lottie json from ", str6)));
            case 8:
                syn synVar = (syn) this.k;
                nm6 nm6Var9 = nm6.a;
                qgg.h0(obj);
                ((b5a) this.l).g((t5a) this.m, synVar, false);
                return Unit.a;
            case 9:
                nm6 nm6Var10 = nm6.a;
                qgg.h0(obj);
                long longValue = ((Long) this.l).longValue();
                ohr ohrVar = (ohr) this.m;
                String str7 = xaa.c;
                long usableSpace = Environment.getDataDirectory().getUsableSpace();
                return usableSpace >= longValue ? new phr(longValue, usableSpace, ohrVar) : new mhr(longValue, usableSpace, ohrVar);
            case 10:
                mm6 mm6Var2 = (mm6) this.k;
                nm6 nm6Var11 = nm6.a;
                qgg.h0(obj);
                zwa zwaVar = (zwa) this.l;
                ox6.B(zwaVar.L(), mm6Var2, new t58(i, (mm6) this.m, zwaVar));
                return Unit.a;
            case 11:
                nm6 nm6Var12 = nm6.a;
                qgg.h0(obj);
                nsb nsbVar = (nsb) this.k;
                ArrayList<Uri> arrayList2 = (ArrayList) this.l;
                ?? r3 = (uif) this.m;
                ArrayList arrayList3 = new ArrayList();
                for (Uri uri : arrayList2) {
                    nb7 nb7Var = new nb7(uri);
                    xla xlaVar = new xla(27);
                    try {
                        r7o r7oVar = z7o.b;
                        new pq3(((ip3) nsbVar.c.a).a(), nb7Var, null, xlaVar).a();
                        t7oVar = Unit.a;
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        t7oVar = new t7o(th);
                    }
                    Throwable a = z7o.a(t7oVar);
                    if (a != null) {
                        int i6 = i9f.a;
                        a.printStackTrace();
                    }
                    arrayList3.add(new ipt(uri, z7o.a(t7oVar)));
                }
                r3.invoke(arrayList3);
                return Unit.a;
            case 12:
                nm6 nm6Var13 = nm6.a;
                qgg.h0(obj);
                Object obj3 = ((gd4) this.k).a;
                xqn xqnVar = (xqn) this.l;
                boolean z = obj3 instanceof fd4;
                if (!z) {
                    xqnVar.a = obj3;
                }
                qln qlnVar = (qln) this.m;
                if (z) {
                    Throwable a2 = gd4.a(obj3);
                    if (a2 != null) {
                        throw a2;
                    }
                    qlnVar.g(new fj4());
                    xqnVar.a = ugj.c;
                }
                return Unit.a;
            case 13:
                bm2 bm2Var = (bm2) this.l;
                nm6 nm6Var14 = nm6.a;
                qgg.h0(obj);
                bm2 bm2Var2 = (bm2) this.k;
                if (bm2Var2 == null || (bigDecimal = bm2Var2.a) == null) {
                    bigDecimal = BigDecimal.ZERO;
                }
                if (bm2Var == null || (bigDecimal2 = bm2Var.a) == null) {
                    bigDecimal2 = BigDecimal.ZERO;
                }
                bigDecimal2.getClass();
                bigDecimal.getClass();
                BigDecimal subtract = bigDecimal2.subtract(bigDecimal);
                subtract.getClass();
                String str8 = bm2Var2 != null ? bm2Var2.b : null;
                if (str8 == null) {
                    str8 = "";
                }
                sqr sqrVar = new sqr(subtract, subtract + StringUtil.SPACE + str8);
                BigDecimal bigDecimal3 = BigDecimal.ZERO;
                if (subtract.compareTo(bigDecimal3) > 0) {
                    break;
                }
                sqrVar = null;
                if (sqrVar == null) {
                    String str9 = bm2Var2 != null ? bm2Var2.b : null;
                    String str10 = str9 != null ? str9 : "";
                    bigDecimal3.getClass();
                    sqrVar = new sqr(bigDecimal3, bigDecimal3 + StringUtil.SPACE + str10);
                }
                g0c g0cVar = (g0c) ((qdc) this.m).b;
                boolean d = Intrinsics.d(sqrVar.a, bigDecimal3);
                boolean z2 = !d;
                String concat = "Вычислена сумма пополнения при совершении платежа: пополнение ".concat(!d ? "требуется" : "не требуется");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                r1f r1fVar = r1f.a;
                linkedHashMap.put("is_need_to_top_up", new mc3(z2));
                linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
                vtm vtmVar = new vtm((Map) linkedHashMap);
                ci0 ci0Var = qjb.a;
                ci0Var.a = su4.g(1, ci0Var.a);
                vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
                qne j = su4.j(vtmVar, "event_name", "sum_to_top_up_calculated", "sum_to_top_up_calculated", vtmVar);
                x60 x60Var = (x60) g0cVar;
                x60Var.getClass();
                x60Var.a(j);
                return sqrVar;
            case 14:
                nm6 nm6Var15 = nm6.a;
                qgg.h0(obj);
                ?? r0 = (k0o) this.k;
                dld dldVar = new dld((qdc) ((cr) this.l).b, (ListYandexPlayerView) this.m);
                r0.E(dldVar, r0);
                return dldVar;
            case 15:
                nm6 nm6Var16 = nm6.a;
                qgg.h0(obj);
                vsb vsbVar = (vsb) ((zzd) this.k).a.getValue();
                liq d2 = vsbVar.d(((fts) this.m).c);
                if (d2 == null) {
                    new aue(null);
                    return new HlsMetaValidator$ValidationResult$IoException();
                }
                try {
                    return bcx.L(new e6b(d2, vsb.c(vsbVar, d2, null, null, 14)), ((cts) this.l).b);
                } catch (IOException unused) {
                    return new HlsMetaValidator$ValidationResult$IoException();
                } catch (IllegalStateException e2) {
                    ssg.a(7, "HlsMetaStage", "checkHlsMeta illegal state error", e2);
                    return new b0e();
                }
            case 16:
                nm6 nm6Var17 = nm6.a;
                qgg.h0(obj);
                JsonObject jsonObject = new JsonObject();
                fjf fjfVar = (fjf) this.k;
                djf djfVar = (djf) this.l;
                drf drfVar = (drf) this.m;
                jsonObject.u("type", fjfVar.d ? "skeleton" : "landing3");
                String str11 = djfVar.b;
                String str12 = "none";
                if (str11 == null) {
                    str11 = "none";
                }
                jsonObject.u("source", str11);
                jsonObject.t("coldRun", Boolean.valueOf(fjfVar.g));
                Boolean bool = djfVar.c;
                if (bool == null || (str = String.valueOf(bool.booleanValue())) == null) {
                    str = "none";
                }
                jsonObject.u("fromCache", str);
                jsonObject.s(new Long(djfVar.d), "startLoadingTime");
                jsonObject.s(new Long(djfVar.e), "finishLoadingTime");
                jsonObject.s(new Long(djfVar.f), "firstContentLoadedTime");
                jsonObject.s(new Long(djfVar.g), "firstContentRenderedTime");
                jsonObject.s(new Long(djfVar.h), "fullContentLoadedTime");
                if (drfVar != null) {
                    String str13 = drfVar.a().b;
                    String str14 = drfVar.a().a;
                    uvn w2 = q5g.w(drfVar);
                    if (w2 != null && (e = w2.e()) != null && (str2 = e.a) != null) {
                        str12 = str2;
                    }
                    StringBuilder m2 = f1d.m("meta=", str13, StringUtils.PROCESS_POSTFIX_DELIMITER, str14, " url=");
                    m2.append(str12);
                    str12 = m2.toString();
                }
                jsonObject.u("firstBlockInfo", str12);
                ot0.L(fjfVar.e(), "landing_timings", jsonObject.toString());
                return Unit.a;
            case 17:
                dn9 dn9Var = (dn9) this.l;
                nm6 nm6Var18 = nm6.a;
                qgg.h0(obj);
                l4a l4aVar = (l4a) this.k;
                if (l4aVar instanceof m4a) {
                    ((g3a) dn9Var.f).f(new x2a(((m4a) l4aVar).a, r2a.d));
                } else {
                    if (!(l4aVar instanceof k4a)) {
                        if (!(l4aVar instanceof j4a)) {
                            b6e.s();
                            return null;
                        }
                        return Unit.a;
                    }
                    md mdVar = (md) ((teg) this.m).b.invoke(((k4a) l4aVar).a);
                    ldi ldiVar = (ldi) dn9Var.d;
                    z2a z2aVar = (z2a) dn9Var.c;
                    e5b e5bVar = e5b.a;
                    e5bVar.getClass();
                    ldiVar.b(mdVar, z2aVar, e5bVar);
                }
                return Unit.a;
            case 18:
                nm6 nm6Var19 = nm6.a;
                qgg.h0(obj);
                rke.a((Context) this.l).c((kle) this.m);
                return Unit.a;
            case 19:
                cvl cvlVar = (cvl) this.m;
                nm6 nm6Var20 = nm6.a;
                qgg.h0(obj);
                try {
                    klg klgVar = (klg) this.k;
                    cvl g = klgVar.c.g(cvlVar);
                    if (g == null) {
                        return null;
                    }
                    klgVar.b.getClass();
                    ArrayList a3 = cus.a(g);
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it3 = a3.iterator();
                    while (it3.hasNext()) {
                        Object next2 = it3.next();
                        if (((Boolean) ((Function2) this.l).invoke(g, (mqs) next2)).booleanValue()) {
                            arrayList4.add(next2);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList(v75.o(arrayList4, 10));
                    Iterator it4 = arrayList4.iterator();
                    while (it4.hasNext()) {
                        arrayList5.add(new t2m(((mqs) it4.next()).d(), null));
                    }
                    rrl rrlVar = new rrl(g, arrayList5, arrayList4);
                    if (!ivf.I(g)) {
                        if (arrayList5.isEmpty()) {
                            return null;
                        }
                    }
                    return rrlVar;
                } catch (IllegalStateException e3) {
                    Assertions.throwOrSkip("LocalPlaylistRepository", new FailedAssertionException(hrg.r("Failed to get playlist ", cvlVar.b, ", id ", cvlVar.e()), e3));
                    return null;
                }
            case 20:
                cvl cvlVar2 = (cvl) this.l;
                nm6 nm6Var21 = nm6.a;
                qgg.h0(obj);
                try {
                    klg klgVar2 = (klg) this.k;
                    cvl g2 = klgVar2.c.g(cvlVar2);
                    if (g2 == null) {
                        return null;
                    }
                    klgVar2.b.getClass();
                    ArrayList a4 = cus.a(g2);
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it5 = a4.iterator();
                    while (it5.hasNext()) {
                        Object next3 = it5.next();
                        mqs mqsVar = (mqs) next3;
                        if (((Boolean) ((klg) this.m).g.invoke(g2, mqsVar)).booleanValue()) {
                            if (mqsVar == null) {
                                Assertions.throwOrSkip$default(new FailedAssertionException("PermanentCachedTrackPredicate: track is null"), null, 2, null);
                                contains = false;
                            } else {
                                l18 l18Var = l18.b;
                                bdt I = hag.I(uaa.class);
                                qdc qdcVar = l18Var.a;
                                qdcVar.getClass();
                                contains = ((lja) ((e6q) ((uaa) qdcVar.C(I))).e.getValue()).a.contains(mqsVar.a);
                            }
                            if (contains) {
                                arrayList6.add(next3);
                            }
                        }
                    }
                    ArrayList arrayList7 = new ArrayList(v75.o(arrayList6, 10));
                    Iterator it6 = arrayList6.iterator();
                    while (it6.hasNext()) {
                        arrayList7.add(new t2m(((mqs) it6.next()).d(), null));
                    }
                    rrl rrlVar2 = new rrl(g2, arrayList7, arrayList6);
                    if (!ivf.I(g2)) {
                        if (arrayList7.isEmpty()) {
                            return null;
                        }
                    }
                    return rrlVar2;
                } catch (IllegalStateException e4) {
                    Assertions.throwOrSkip("LocalPlaylistRepository", new FailedAssertionException(hrg.r("Failed to get playlist ", cvlVar2.b, ", id ", cvlVar2.e()), e4));
                    return null;
                }
            case 21:
                return k(obj);
            case 22:
                return l(obj);
            case 23:
                return n(obj);
            case 24:
                return o(obj);
            case 25:
                return p(obj);
            case 26:
                return q(obj);
            case 27:
                return s(obj);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return t(obj);
            default:
                nm6 nm6Var22 = nm6.a;
                qgg.h0(obj);
                for (hzg hzgVar : ((HashMap) ((ayg) this.k).c()).values()) {
                    hzgVar.getClass();
                    String str15 = hzgVar.d;
                    if (hzgVar.f == null && c.v(str15, "data:", false) && StringsKt.T(str15, "base64,", 0, false, 6) > 0) {
                        try {
                            byte[] decode = Base64.decode(str15.substring(StringsKt.S(str15, ',', 0, 6) + 1), 0);
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inScaled = true;
                            options.inDensity = 160;
                            hzgVar.f = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                        } catch (IllegalArgumentException e5) {
                            psg.c("data URL did not have correct base64 format.", e5);
                        }
                    }
                    Context context2 = (Context) this.l;
                    String str16 = (String) this.m;
                    if (hzgVar.f == null && str16 != null) {
                        try {
                            InputStream open = context2.getAssets().open(str16 + str15);
                            open.getClass();
                            try {
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inScaled = true;
                                options2.inDensity = 160;
                                bitmap = BitmapFactory.decodeStream(open, null, options2);
                            } catch (IllegalArgumentException e6) {
                                psg.c("Unable to decode image.", e6);
                                bitmap = null;
                            }
                            if (bitmap != null) {
                                hzgVar.f = rvt.d(bitmap, hzgVar.a, hzgVar.b);
                            }
                        } catch (IOException e7) {
                            psg.c("Unable to open asset.", e7);
                        }
                    }
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n71(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n71(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n71(Continuation continuation, Object obj, Object obj2, Object obj3, int i) {
        super(2, continuation);
        this.j = i;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
    }
}
