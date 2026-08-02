package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import android.view.View;
import androidx.media3.exoplayer.ExoPlayer;
import com.yandex.metrica.push.YandexMetricaPush;
import com.yandex.metrica.push.YandexMetricaPushSetting;
import com.yandex.music.shared.disclaimers.db.DisclaimerDatabase;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.AppMetricaYandex;
import io.appmetrica.analytics.CommonPulseConfig;
import io.appmetrica.analytics.MviConfig;
import io.appmetrica.analytics.MviTimestamp;
import io.appmetrica.analytics.PulseConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import ru.yandex.music.R;
import ru.yandex.music.YMApplication;
import ru.yandex.music.payment.tariffpaywall.TariffPaywallActivity;
import ru.yandex.video.m3.list_player_manager.impl.telemetry.InitMediaItemData;

/* loaded from: classes3.dex */
public final class nz5 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nz5(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = obj;
        this.l = obj2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new nz5((iv5) this.k, (sdr) this.l, continuation, 0);
            case 1:
                nz5 nz5Var = new nz5(continuation, (i26) this.l, 1);
                nz5Var.k = obj;
                return nz5Var;
            case 2:
                return new nz5((z66) this.k, (ltm) this.l, continuation, 2);
            case 3:
                return new nz5((tu6) this.k, (xxq) this.l, continuation, 3);
            case 4:
                nz5 nz5Var2 = new nz5(continuation, (kv6) this.l, 4);
                nz5Var2.k = obj;
                return nz5Var2;
            case 5:
                nz5 nz5Var3 = new nz5((kw6) this.l, continuation, 5);
                nz5Var3.k = obj;
                return nz5Var3;
            case 6:
                return new nz5(continuation, (znk) this.k, (String) this.l, 6);
            case 7:
                return new nz5(continuation, (znk) this.k, (List) this.l, 7);
            case 8:
                return new nz5(continuation, (vh0) this.k, (yu8) this.l, 8);
            case 9:
                return new nz5(continuation, (ii) this.k, (View) this.l, 9);
            case 10:
                return new nz5((cir) this.k, (l4a) this.l, continuation, 10);
            case 11:
                return new nz5((b61) this.k, (e61) this.l, continuation, 11);
            case 12:
                return new nz5((wwa) this.k, (zwa) this.l, continuation, 12);
            case 13:
                nz5 nz5Var4 = new nz5((qva) this.l, continuation, 13);
                nz5Var4.k = obj;
                return nz5Var4;
            case 14:
                nz5 nz5Var5 = new nz5(continuation, (kub) this.l, 14);
                nz5Var5.k = obj;
                return nz5Var5;
            case 15:
                return new nz5((jub) this.k, (hvb) this.l, continuation, 15);
            case 16:
                return new nz5((g1n) this.k, (mmo) this.l, continuation, 16);
            case 17:
                return new nz5((fuw) this.k, (aqi) this.l, continuation, 17);
            case 18:
                return new nz5((zfd) this.k, (p5d) this.l, continuation, 18);
            case 19:
                return new nz5((akd) this.k, (String) this.l, continuation, 19);
            case 20:
                nz5 nz5Var6 = new nz5((nwd) this.l, continuation, 20);
                nz5Var6.k = obj;
                return nz5Var6;
            case 21:
                nz5 nz5Var7 = new nz5((cyd) this.l, continuation, 21);
                nz5Var7.k = obj;
                return nz5Var7;
            case 22:
                return new nz5((Context) this.k, (l13) this.l, continuation, 22);
            case 23:
                nz5 nz5Var8 = new nz5(continuation, (tkf) this.l, 23);
                nz5Var8.k = obj;
                return nz5Var8;
            case 24:
                nz5 nz5Var9 = new nz5((xqn) this.l, continuation, 24);
                nz5Var9.k = obj;
                return nz5Var9;
            case 25:
                return new nz5((pwq) this.k, (ml4) this.l, continuation, 25);
            case 26:
                nz5 nz5Var10 = new nz5((vof) this.l, continuation, 26);
                nz5Var10.k = obj;
                return nz5Var10;
            case 27:
                nz5 nz5Var11 = new nz5((vqn) this.l, continuation, 27);
                nz5Var11.k = obj;
                return nz5Var11;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                nz5 nz5Var12 = new nz5((qyf) this.l, continuation, 28);
                nz5Var12.k = obj;
                return nz5Var12;
            default:
                nz5 nz5Var13 = new nz5((gag) this.l, continuation, 29);
                nz5Var13.k = obj;
                return nz5Var13;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((nz5) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((nz5) create(obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((nz5) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((nz5) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((nz5) create(obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((nz5) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((nz5) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((nz5) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((nz5) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((nz5) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((nz5) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 11:
                return ((nz5) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 12:
                return ((nz5) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 13:
                return ((nz5) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 14:
                return ((nz5) create(obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 15:
                return ((nz5) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 16:
                return ((nz5) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 17:
                return ((nz5) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 18:
                return ((nz5) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 19:
                return ((nz5) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 20:
                return ((nz5) create((Set) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 21:
                return ((nz5) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 22:
                return ((nz5) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 23:
                return ((nz5) create(obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 24:
                return ((nz5) create((lwu) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 25:
                return ((nz5) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 26:
                return ((nz5) create((iqf) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 27:
                return ((nz5) create((v2s) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return ((nz5) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((nz5) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x069d  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        iv5 iv5Var;
        xiu xiuVar;
        t16 s16Var;
        Object value;
        l26 l26Var;
        Long l;
        Float f;
        lve lveVar;
        lve lveVar2;
        o4c o4cVar;
        fuw fuwVar;
        Object value2;
        eag eagVar;
        ArrayList arrayList;
        int i = 2;
        int i2 = 3;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        i3 = 0;
        int i5 = 1;
        Continuation continuation = null;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                if (!((Boolean) ((sdr) this.l).getValue()).booleanValue() && (iv5Var = (iv5) this.k) != null && (xiuVar = iv5Var.a.n) != null) {
                    rar rarVar = (rar) xiuVar.c;
                    if (rarVar != null) {
                        rarVar.g(null);
                    }
                    xiuVar.c = null;
                }
                return Unit.a;
            case 1:
                Object obj2 = this.k;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                rx5 rx5Var = (rx5) obj2;
                i26 i26Var = (i26) this.l;
                s9f[] s9fVarArr = i26.v;
                if (Intrinsics.d(rx5Var, qx5.a)) {
                    s16Var = r16.a;
                } else if (Intrinsics.d(rx5Var, px5.a)) {
                    s16Var = p16.a;
                } else {
                    if (!(rx5Var instanceof ox5)) {
                        b6e.s();
                        return null;
                    }
                    s16Var = new s16(((ox5) rx5Var).a);
                }
                xdr xdrVar = i26Var.r;
                do {
                    value = xdrVar.getValue();
                    l26Var = (l26) value;
                } while (!xdrVar.k(value, new l26(s16Var, l26Var.b, l26Var.c)));
                i26Var.U(rx5Var, true);
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                z66 z66Var = (z66) this.k;
                ConnectivityManager connectivityManager = (ConnectivityManager) z66Var.d.getValue();
                Context context = z66Var.a;
                w1j w1jVar = (w1j) z66Var.e.getValue();
                y66 y66Var = new y66(1, (ltm) this.l, ltm.class, "trySend", "trySend-JP2dKIU(Ljava/lang/Object;)Ljava/lang/Object;", 8, 0);
                IntentFilter intentFilter = xni.a;
                connectivityManager.getClass();
                w1jVar.getClass();
                try {
                    wni wniVar = new wni(w1jVar, y66Var);
                    if (Build.VERSION.SDK_INT >= 26) {
                        connectivityManager.registerDefaultNetworkCallback(wniVar);
                    } else {
                        connectivityManager.registerNetworkCallback((NetworkRequest) xni.b.getValue(), wniVar);
                    }
                    return new owf(1, wniVar, connectivityManager);
                } catch (SecurityException e) {
                    if (Build.VERSION.SDK_INT != 30) {
                        Assertions.throwOrSkip("RegisterNetworkStateCallback", new FailedAssertionException("Unexpected security exception in ConnectivityManager.registerNetworkCallback", e));
                    }
                    ssg.a(6, "RegisterNetworkStateCallback", "Security exception in ConnectivityManager.registerNetworkCallback, trying legacy way", null);
                    pwf pwfVar = new pwf(connectivityManager, y66Var);
                    context.registerReceiver(pwfVar, xni.a);
                    return new owf(0, pwfVar, context);
                }
            case 3:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                pst a = ost.a(((tu6) this.k).a, (xxq) this.l);
                if (Build.VERSION.SDK_INT <= 28 && c.o(Build.MANUFACTURER, "HUAWEI", true)) {
                    i3 = 1;
                }
                return Boolean.valueOf(a.a.getBoolean("crossfade_enabled", i3 ^ 1));
            case 4:
                Object obj3 = this.k;
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                Pair pair = (Pair) obj3;
                u2q u2qVar = (u2q) pair.a;
                boolean booleanValue = ((Boolean) pair.b).booleanValue();
                gy1 gy1Var = u2qVar.c;
                pxs pxsVar = u2qVar.f;
                vzg k0 = pxsVar != null ? o2g.k0(pxsVar) : null;
                kv6 kv6Var = (kv6) this.l;
                g7q g7qVar = (g7q) kv6Var.j.getValue();
                ncl nclVar = (ncl) ((kv6) this.l).k.getValue();
                g7qVar.getClass();
                zvs zvsVar = u2qVar.b;
                msa msaVar = nsa.b;
                ssa ssaVar = ssa.MILLISECONDS;
                onh c = onh.c(v3g.X(zvsVar, gy1Var, yd5.M(0, ssaVar), yd5.M(0, ssaVar), false, k0, u2qVar.a, u2qVar.g).i);
                b7q b7qVar = kv6Var.h;
                zss zssVar = kv6Var.i;
                b7qVar.getClass();
                iaw iawVar = new iaw(b7qVar, g7qVar, nclVar, c, zssVar);
                if (u2qVar.g == be6.c && booleanValue) {
                    kv6 kv6Var2 = (kv6) this.l;
                    boolean z2 = kv6Var2.f;
                    l = kv6Var2.y;
                    if (z2 && l == null) {
                        qvs b = u2qVar.b();
                        if (b != null) {
                            l = new Long(b.a);
                        }
                    }
                    f = !booleanValue ? new Float(0.0f) : null;
                    eps epsVar = ((kv6) this.l).l;
                    epsVar.getClass();
                    mal.a();
                    ssg.a(3, "InternalPlayerManager", "preHeatPlayer " + ((Object) ("idlePlayer=" + ((lve) epsVar.d))) + ", args(" + (u2qVar + StringUtils.COMMA + l + StringUtils.COMMA + f) + ") ", null);
                    lveVar = (lve) epsVar.d;
                    if (lveVar != null && (o4cVar = lveVar.a) != null && o4cVar.a.e()) {
                        dfi.r("Illegal idlePlayer state isPlaying, but expected is idle", "InternalPlayerManager");
                    }
                    lveVar2 = (lve) epsVar.d;
                    if (lveVar2 != null || (r6 = lveVar2.a) == null) {
                        o4c f2 = epsVar.f();
                    }
                    ExoPlayer exoPlayer = f2.a;
                    n4c n4cVar = f2.b;
                    exoPlayer.stop();
                    exoPlayer.y();
                    exoPlayer.X0(iawVar, l == null ? l.longValue() : -9223372036854775807L);
                    exoPlayer.q();
                    exoPlayer.L(false);
                    if (f != null) {
                        n4cVar.j = 1.0f;
                        n4cVar.i = l4c.a;
                        n4cVar.l(f.floatValue(), h4c.CROSSFADING_PLAYER);
                    }
                    f2.c.b = nua.b;
                    epsVar.d = new lve(f2, new kve(u2qVar, iawVar, l));
                    return Unit.a;
                }
                l = null;
                if (!booleanValue) {
                }
                eps epsVar2 = ((kv6) this.l).l;
                epsVar2.getClass();
                mal.a();
                ssg.a(3, "InternalPlayerManager", "preHeatPlayer " + ((Object) ("idlePlayer=" + ((lve) epsVar2.d))) + ", args(" + (u2qVar + StringUtils.COMMA + l + StringUtils.COMMA + f) + ") ", null);
                lveVar = (lve) epsVar2.d;
                if (lveVar != null) {
                    dfi.r("Illegal idlePlayer state isPlaying, but expected is idle", "InternalPlayerManager");
                }
                lveVar2 = (lve) epsVar2.d;
                if (lveVar2 != null) {
                }
                o4c f22 = epsVar2.f();
                ExoPlayer exoPlayer2 = f22.a;
                n4c n4cVar2 = f22.b;
                exoPlayer2.stop();
                exoPlayer2.y();
                exoPlayer2.X0(iawVar, l == null ? l.longValue() : -9223372036854775807L);
                exoPlayer2.q();
                exoPlayer2.L(false);
                if (f != null) {
                }
                f22.c.b = nua.b;
                epsVar2.d = new lve(f22, new kve(u2qVar, iawVar, l));
                return Unit.a;
            case 5:
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                mm6 mm6Var = (mm6) this.k;
                kw6 kw6Var = (kw6) this.l;
                r2f r2fVar = (r2f) kw6Var.b.getAndSet(null);
                AtomicReference atomicReference = kw6Var.b;
                rar y = x97.y(mm6Var, null, null, new bv6(r2fVar, kw6Var, continuation, i2), 3);
                while (true) {
                    if (atomicReference.compareAndSet(null, y)) {
                        z = true;
                    } else if (atomicReference.get() != null) {
                    }
                }
                return Boolean.valueOf(z);
            case 6:
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                return ((znk) this.k).u((String) this.l);
            case 7:
                nm6 nm6Var8 = nm6.a;
                qgg.h0(obj);
                DisclaimerDatabase disclaimerDatabase = (DisclaimerDatabase) ((znk) this.k).b;
                disclaimerDatabase.b();
                try {
                    up6.F(disclaimerDatabase.w().a, false, true, new c68(i5));
                    m68 w = disclaimerDatabase.w();
                    List<a58> list = (List) this.l;
                    ArrayList arrayList2 = new ArrayList(v75.o(list, 10));
                    for (a58 a58Var : list) {
                        String str = a58Var.a;
                        String str2 = a58Var.b;
                        String str3 = a58Var.c;
                        String str4 = a58Var.d;
                        String str5 = a58Var.e;
                        f58 f58Var = a58Var.f;
                        arrayList2.add(new z58(0L, str, str2, str3, str4, str5, f58Var != null ? f58Var.a : null, f58Var != null ? f58Var.b : null));
                    }
                    w.getClass();
                    up6.F(w.a, false, true, new ny2(12, w, arrayList2));
                    disclaimerDatabase.t();
                    disclaimerDatabase.g();
                    return Unit.a;
                } catch (Throwable th) {
                    disclaimerDatabase.g();
                    throw th;
                }
            case 8:
                nm6 nm6Var9 = nm6.a;
                qgg.h0(obj);
                View view = (View) ((vh0) this.k).invoke();
                view.setTag(R.id.div_custom_tag, (yu8) this.l);
                return view;
            case 9:
                nm6 nm6Var10 = nm6.a;
                qgg.h0(obj);
                ((ii) this.k).invoke((View) this.l);
                return Unit.a;
            case 10:
                nm6 nm6Var11 = nm6.a;
                qgg.h0(obj);
                cir cirVar = (cir) this.k;
                ((j4a) ((l4a) this.l)).getClass();
                cirVar.b(new rhm(null));
                return Unit.a;
            case 11:
                nm6 nm6Var12 = nm6.a;
                qgg.h0(obj);
                b61 b61Var = (b61) this.k;
                udl udlVar = ((d61) ((e61) this.l)).c;
                b61Var.getClass();
                b61Var.a.b(udlVar);
                b61Var.b.b(udlVar);
                return Unit.a;
            case 12:
                nm6 nm6Var13 = nm6.a;
                qgg.h0(obj);
                wwa wwaVar = (wwa) this.k;
                if (Intrinsics.d(wwaVar, twa.a)) {
                    ((zwa) this.l).N();
                } else if (!Intrinsics.d(wwaVar, uwa.a) && !Intrinsics.d(wwaVar, vwa.a)) {
                    b6e.s();
                    return null;
                }
                return Unit.a;
            case 13:
                mm6 mm6Var2 = (mm6) this.k;
                nm6 nm6Var14 = nm6.a;
                qgg.h0(obj);
                qva qvaVar = (qva) this.l;
                ox6.B(qvaVar.z().J(), mm6Var2, new ova(qvaVar, i3));
                ox6.B(qvaVar.y().K(), mm6Var2, new ova(qvaVar, i5));
                return Unit.a;
            case 14:
                Object obj4 = this.k;
                nm6 nm6Var15 = nm6.a;
                qgg.h0(obj);
                ((Boolean) obj4).getClass();
                kub kubVar = (kub) this.l;
                rar rarVar2 = kubVar.q;
                if (rarVar2 != null) {
                    rarVar2.g(null);
                }
                kubVar.q = x97.y(kubVar.e, null, null, new eub(kubVar, continuation, i), 3);
                return Unit.a;
            case 15:
                nm6 nm6Var16 = nm6.a;
                qgg.h0(obj);
                jub jubVar = (jub) this.k;
                hvb hvbVar = (hvb) this.l;
                float f3 = ivb.a;
                hvbVar.getClass();
                v3w.n(hvbVar instanceof fvb, jubVar.h, null);
                return Unit.a;
            case 16:
                nm6 nm6Var17 = nm6.a;
                qgg.h0(obj);
                g1n g1nVar = (g1n) this.k;
                iyb iybVar = new iyb((mmo) this.l, i);
                g1nVar.getClass();
                g1nVar.c = "MUSICANDROID";
                g1nVar.d = 4;
                y3i y3iVar = y3i.a;
                Map map = (Map) iybVar.invoke();
                YMApplication yMApplication = g1nVar.a;
                String str6 = g1nVar.c;
                if (str6 == null) {
                    Intrinsics.j("prefix");
                    throw null;
                }
                PulseConfig.Builder newBuilder = PulseConfig.newBuilder(yMApplication, str6);
                int[] iArr = CommonPulseConfig.POSSIBLE_CHANNELS;
                iArr.getClass();
                boolean t = xz0.t(iArr, g1nVar.d);
                int i6 = g1nVar.d;
                if (t) {
                    i4 = i6;
                } else {
                    ssg.a(7, "PulseInitializer", "Unknown Pulse channel id : " + i6 + ". Acceptable values: " + iArr, null);
                }
                PulseConfig.Builder withChannelId = newBuilder.withChannelId(i4);
                withChannelId.getClass();
                for (Map.Entry entry : map.entrySet()) {
                    withChannelId.addVariation((String) entry.getKey(), (String) entry.getValue());
                }
                withChannelId.withMviConfig(new MviConfig.Builder(MviTimestamp.fromUptimeMillis(g1nVar.b)).withCustomMetricsReporter(new f1n()).build());
                PulseConfig build = withChannelId.build();
                build.getClass();
                synchronized (y3iVar) {
                    try {
                        if (y3i.b) {
                            AppMetricaYandex.activatePulse(build);
                            ssg.a(2, "MetricaInitializer", "Pulse activated", null);
                        } else {
                            y3i.c = build;
                        }
                    } finally {
                    }
                }
                return Unit.a;
            case 17:
                nm6 nm6Var18 = nm6.a;
                qgg.h0(obj);
                aqi aqiVar = (aqi) this.l;
                if (!nmq.a(((nmq) aqiVar.getValue()).a, 9205357640488583168L) && (fuwVar = (fuw) this.k) != null) {
                    fuwVar.b = ((nmq) aqiVar.getValue()).a;
                    fuwVar.d();
                }
                return Unit.a;
            case 18:
                nm6 nm6Var19 = nm6.a;
                qgg.h0(obj);
                zfd zfdVar = (zfd) this.k;
                mwk mwkVar = ((p5d) this.l).a;
                ssg.a(4, "GlagolCastPlayer", "action: prepare", null);
                zfdVar.e = mwkVar;
                vhd vhdVar = (vhd) zfdVar.j.d;
                zfd.z(zfdVar, null, vhdVar.d, vhdVar.c, 1);
                return Unit.a;
            case 19:
                nm6 nm6Var20 = nm6.a;
                qgg.h0(obj);
                try {
                    akd akdVar = (akd) this.k;
                    x0r smarthomeDataApi = akdVar.b.getSmarthomeDataApi(akdVar.a, (String) this.l);
                    smarthomeDataApi.getClass();
                    return ((n3m) smarthomeDataApi).N0().devices;
                } catch (IOException e2) {
                    ssg.a(6, null, "smart home devices: ERROR", e2);
                    return null;
                }
            case 20:
                Set set = (Set) this.k;
                nm6 nm6Var21 = nm6.a;
                qgg.h0(obj);
                ssg.a(3, "HeadsetsConnectedFeature", "Headset connected: " + set + ", requesting ynison active", null);
                afw afwVar = ((nwd) this.l).a;
                String str7 = afw.l;
                afwVar.g(null);
                return Unit.a;
            case 21:
                mm6 mm6Var3 = (mm6) this.k;
                nm6 nm6Var22 = nm6.a;
                qgg.h0(obj);
                cyd cydVar = (cyd) this.l;
                ox6.B(cydVar.b, mm6Var3, new otd(i2, cydVar));
                return Unit.a;
            case 22:
                nm6 nm6Var23 = nm6.a;
                qgg.h0(obj);
                YandexMetricaPush.init((Context) this.k);
                l13 l13Var = (l13) this.l;
                bdt I = hag.I(Context.class);
                qdc qdcVar = l13Var.a;
                Set set2 = l13Var.b;
                YandexMetricaPushSetting.setPushNotificationFactory((Context) qdcVar.D(I, l13Var, set2), new o7w((pfj) l13Var.a.D(hag.I(pfj.class), l13Var, set2)));
                return Unit.a;
            case 23:
                Object obj5 = this.k;
                nm6 nm6Var24 = nm6.a;
                qgg.h0(obj);
                tkf tkfVar = (tkf) this.l;
                int i7 = TariffPaywallActivity.z;
                Context context2 = tkfVar.getContext();
                context2.getClass();
                Intent b2 = dml.b(context2, new lik(vik.f, null, null));
                Context context3 = tkfVar.getContext();
                context3.getClass();
                Activity R = vq2.R(context3);
                if (R != null) {
                    R.startActivity(b2);
                }
                return Unit.a;
            case 24:
                lwu lwuVar = (lwu) this.k;
                nm6 nm6Var25 = nm6.a;
                qgg.h0(obj);
                ((xqn) this.l).a = lwuVar;
                return Unit.a;
            case 25:
                nm6 nm6Var26 = nm6.a;
                qgg.h0(obj);
                ((pwq) this.k).b(((ml4) this.l).b());
                return Unit.a;
            case 26:
                nm6 nm6Var27 = nm6.a;
                qgg.h0(obj);
                iqf iqfVar = (iqf) this.k;
                h3d h3dVar = (h3d) iqfVar.b(5);
                if (!h3dVar.a.equals(iqfVar)) {
                    h3dVar.d();
                    h3d.e(h3dVar.b, iqfVar);
                }
                vof vofVar = (vof) this.l;
                hqf hqfVar = (hqf) h3dVar;
                int p = ((iqf) hqfVar.b).p();
                hqfVar.d();
                iqf.m((iqf) hqfVar.b, p);
                hqfVar.d();
                iqf.l((iqf) hqfVar.b);
                for (Map.Entry entry2 : vofVar.b.entrySet()) {
                    mqf mqfVar = (mqf) entry2.getKey();
                    int intValue = ((Number) entry2.getValue()).intValue();
                    if (vofVar.e.contains(new Integer(intValue))) {
                        jqf o = kqf.o();
                        o.d();
                        kqf.k((kqf) o.b, mqfVar);
                        o.d();
                        kqf.l((kqf) o.b, intValue);
                        hqfVar.d();
                        iqf.k((iqf) hqfVar.b, (kqf) o.b());
                    }
                }
                return hqfVar.b();
            case 27:
                v2s v2sVar = (v2s) this.k;
                nm6 nm6Var28 = nm6.a;
                qgg.h0(obj);
                ((vqn) this.l).a = v2sVar.a.a().b;
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                nm6 nm6Var29 = nm6.a;
                qgg.h0(obj);
                mm6 mm6Var4 = (mm6) this.k;
                qyf qyfVar = (qyf) this.l;
                nyf nyfVar = qyfVar.a;
                if (nyfVar.b().compareTo(lyf.b) >= 0) {
                    nyfVar.a(qyfVar);
                } else {
                    saf.B(mm6Var4.getCoroutineContext(), null);
                }
                return Unit.a;
            default:
                nm6 nm6Var30 = nm6.a;
                qgg.h0(obj);
                List list2 = (List) this.k;
                gag gagVar = (gag) this.l;
                if (!((Boolean) ((fkn) gagVar.b.c).a.getValue()).booleanValue()) {
                    return Unit.a;
                }
                xdr xdrVar2 = gagVar.c;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                List<tle> list3 = list2;
                for (tle tleVar : list3) {
                    imh imhVar = tleVar.b;
                    if (imhVar != null) {
                        linkedHashMap.put(imhVar, tleVar.a.getPlayDelta());
                    }
                }
                while (true) {
                    Object value3 = xdrVar2.getValue();
                    LinkedHashMap linkedHashMap2 = linkedHashMap;
                    if (xdrVar2.k(value3, eag.a((eag) value3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, linkedHashMap2, 65535))) {
                        do {
                            value2 = xdrVar2.getValue();
                            eagVar = (eag) value2;
                            arrayList = new ArrayList(v75.o(list3, 10));
                            for (tle tleVar2 : list3) {
                                imh imhVar2 = tleVar2.b;
                                InitMediaItemData initMediaItemData = tleVar2.a;
                                arrayList.add(new i6r(imhVar2 != null ? imhVar2.d : null, initMediaItemData.getBlurDelta(), initMediaItemData.getImageDelta(), initMediaItemData.getFirstFrameVideoDelta(), initMediaItemData.getTotalTime(), initMediaItemData.getFinishReason()));
                            }
                        } while (!xdrVar2.k(value2, eag.a(eagVar, null, null, null, null, null, null, null, null, null, arrayList, null, null, null, null, null, null, null, 130559)));
                        return Unit.a;
                    }
                    linkedHashMap = linkedHashMap2;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nz5(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nz5(Continuation continuation, Object obj, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nz5(Continuation continuation, Object obj, Object obj2, int i) {
        super(2, continuation);
        this.j = i;
        this.k = obj;
        this.l = obj2;
    }
}
