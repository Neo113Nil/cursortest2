package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.RectF;
import android.net.Uri;
import android.view.ViewGroup;
import com.connectsdk.device.DefaultConnectableDeviceStore;
import com.connectsdk.service.DeviceService;
import com.yandex.passport.api.m;
import com.yandex.pulse.metrics.o;
import java.net.URI;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.kinopoisk.sdk.easylogin.internal.Z0;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class m40 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m40(int i, Object obj) {
        super(1);
        this.r = i;
        this.s = obj;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:140:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03d1  */
    /* JADX WARN: Type inference failed for: r0v68, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Type inference failed for: r1v8, types: [ksk, n40] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        double d;
        y7o y7oVar;
        ft7 ft7Var;
        y7o y7oVar2;
        ft7 ft7Var2;
        int i;
        d43 d43Var;
        fbe fbeVar;
        fbe fbeVar2;
        boolean z;
        ai3 ai3Var;
        yg0 o;
        ou3 ou3Var;
        nsh nshVar;
        float f;
        float f2;
        long B;
        float intBitsToFloat;
        Bitmap bitmap;
        int i2 = this.r;
        int i3 = 0;
        Object obj2 = this.s;
        switch (i2) {
            case 0:
                n40 n40Var = (n40) obj;
                npf npfVar = (npf) obj2;
                if (n40Var.t()) {
                    if (n40Var.b().b) {
                        n40Var.r();
                    }
                    for (Map.Entry entry : n40Var.b().i.entrySet()) {
                        npf.a(npfVar, (v2e) entry.getKey(), ((Number) entry.getValue()).intValue(), n40Var.D());
                    }
                    f8j f8jVar = n40Var.D().n;
                    f8jVar.getClass();
                    while (!f8jVar.equals(npfVar.a.D())) {
                        for (v2e v2eVar : npfVar.b(f8jVar).keySet()) {
                            npf.a(npfVar, v2eVar, npfVar.c(f8jVar, v2eVar), f8jVar);
                        }
                        f8jVar = f8jVar.n;
                        f8jVar.getClass();
                    }
                }
                return Unit.a;
            case 1:
                return new hi(2, (ta8) obj2);
            case 2:
                ((jfp) obj).o(pep.c, new oep(xrd.a, ((onj) obj2).a(), nep.b, true));
                return Unit.a;
            case 3:
                ((mpf) obj2).Z((jx7) obj);
                return Unit.a;
            case 4:
                n9i n9iVar = (n9i) obj;
                dj2 dj2Var = (dj2) obj2;
                if (n9iVar == null) {
                    return nif.d(null);
                }
                String str = n9iVar.b;
                if (!dj2Var.c) {
                    return nif.d(n9iVar);
                }
                e9k b = s9k.b();
                if (b == null) {
                    return nif.c(new k03("Mobile backend invalid authorization error: Oauth token exchange failure - \"Failed to perform Oauth token exchange due to the missing \\\"passport\\\" library dependency.\nPlease, make sure that it is provided in your .gradle file.\n\"", 4));
                }
                String str2 = dj2Var.f;
                if (str2 != null) {
                    return nif.d(new n9i(str2, str));
                }
                Context context = dj2Var.a;
                boolean z2 = dj2Var.d;
                context.getClass();
                str.getClass();
                yop b2 = mif.b(mif.a(nif.b(nif.a, new zl0(5, new f9k((g9k) b, z2, m.a(context)), str, z2 ? j66.a : j66.b)), lhb.z0, rq1.w, 1), new al(14, dj2Var, n9iVar), null, 5);
                g0c g0cVar = dj2Var.e;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                r1f r1fVar = r1f.a;
                vtm k = su4.k("Выдача авторизационного токена для конкретного пользователя", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
                ci0 ci0Var = qjb.a;
                ci0Var.a = su4.g(1, ci0Var.a);
                k.u(qee.n() + ci0Var.a, "eventus_id");
                ((x60) g0cVar).b(su4.j(k, "event_name", "exchange_oauth_token", "exchange_oauth_token", k), b2);
                return b2;
            case 5:
                vk2 vk2Var = (vk2) obj;
                vk2Var.getClass();
                uk2 uk2Var = (uk2) obj2;
                double d2 = vk2Var.a;
                double d3 = vk2Var.b;
                wnb wnbVar = uk2Var.c;
                vj0 vj0Var = uk2Var.b;
                gya gyaVar = wnbVar.c;
                gya gyaVar2 = wnbVar.b;
                if (d2 > 0.0d && d3 >= 2000.0d) {
                    if (vj0Var == null) {
                        vj0Var = wnb.f;
                    }
                    double d4 = vj0Var.b;
                    gyaVar2.getClass();
                    gyaVar2.a = Math.exp(Math.log(0.5d) / d4);
                    double d5 = vj0Var.a;
                    gyaVar.getClass();
                    gyaVar.a = Math.exp(Math.log(0.5d) / d5);
                    double d6 = (8.0d * d3) / (d2 / 1000.0d);
                    wnbVar.d += d3;
                    gyaVar2.a(d6);
                    gyaVar.a(d6);
                    iwe iweVar = wnbVar.e;
                    if (wnbVar.d >= 128000.0d) {
                        double d7 = 1;
                        double pow = gyaVar2.b / (d7 - Math.pow(gyaVar2.a, gyaVar2.c));
                        gya gyaVar3 = wnbVar.c;
                        d = Math.min(pow, gyaVar3.b / (d7 - Math.pow(gyaVar3.a, gyaVar3.c)));
                    } else {
                        d = wnbVar.a;
                    }
                    Double valueOf = Double.valueOf(d);
                    if (!Intrinsics.d((Double) iweVar.b, valueOf)) {
                        iweVar.b = valueOf;
                        Iterator it = ((LinkedHashSet) iweVar.c).iterator();
                        while (it.hasNext()) {
                            ((Function1) it.next()).invoke(valueOf);
                        }
                    }
                }
                return Unit.a;
            case 6:
                r7w r7wVar = (r7w) obj;
                r7wVar.getClass();
                qdq.A(new ha0(9, (kpm) obj2, r7wVar));
                return Unit.a;
            case 7:
                vq2.r((ViewGroup) obj2, ((Boolean) obj).booleanValue());
                return Unit.a;
            case 8:
                sa8 sa8Var = (sa8) obj;
                sa8Var.getClass();
                ((rt2) obj2).a.Z(new nt2(sa8Var));
                return Unit.a;
            case 9:
                iek iekVar = (iek) obj;
                iekVar.getClass();
                ((wa4) obj2).k(iekVar);
                return Unit.a;
            case 10:
                q1f q1fVar = (q1f) obj;
                q1fVar.getClass();
                z9h b3 = q1fVar.b();
                q1f q1fVar2 = (q1f) obj2;
                q1fVar2.getClass();
                et2 et2Var = (et2) bkp.a0(q1fVar2, rq1.z).d();
                return new k13(et2Var.a, et2Var.b, et2Var.c, b3.o("purchase_token"));
            case 11:
                cw3 cw3Var = (cw3) obj;
                cw3Var.getClass();
                t23 t23Var = (t23) obj2;
                String str3 = t23Var.a.a;
                str3.getClass();
                h3j h3jVar = new h3j(t23Var.h == null ? Integer.valueOf(t23Var.i) : null, str3, t23Var.b.a, cw3Var.b, cw3Var.a);
                g0c g0cVar2 = t23Var.k;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                r1f r1fVar2 = r1f.a;
                vtm k2 = su4.k("Запрос на привязку: запрос в DieHard на получение cardID", linkedHashMap2, DeviceService.KEY_DESC, linkedHashMap2);
                ci0 ci0Var2 = qjb.a;
                ci0Var2.a = su4.g(1, ci0Var2.a);
                k2.u(qee.n() + ci0Var2.a, "eventus_id");
                qne j = su4.j(k2, "event_name", "bind_new_card_binding", "bind_new_card_binding", k2);
                t28 t28Var = t23Var.g;
                yop I = yd5.I("new_card_binding", t28Var.b, new qs6(13, t28Var, h3jVar));
                ((x60) g0cVar2).b(j, I);
                return I;
            case 12:
                hi4 hi4Var = (hi4) obj;
                hi4Var.getClass();
                gi4 gi4Var = (gi4) obj2;
                jzi jziVar = gi4Var.a;
                g0c g0cVar3 = gi4Var.b;
                String str4 = hi4Var.a;
                String str5 = hi4Var.d;
                if (str4.equals("success")) {
                    return ngg.F(ggm.done);
                }
                if (str4.equals("wait_for_notification")) {
                    try {
                        String str6 = hi4Var.g;
                        if (str6 != null && !gi4Var.c) {
                            gi4Var.c = true;
                            try {
                                String uri = new URI(str6).toString();
                                uri.getClass();
                                Uri parse = Uri.parse(uri);
                                parse.getClass();
                                ft7Var = new ft7(parse);
                            } catch (Throwable unused) {
                                ft7Var = null;
                            }
                            if (ft7Var == null) {
                                return new y7o(null, hld.u(hi4Var));
                            }
                            ((x60) g0cVar3).a(gut.u());
                            jziVar.m(ft7Var);
                        }
                        if (!gi4Var.d && (Intrinsics.d(str5, "success") || Intrinsics.d(str5, "failed"))) {
                            gi4Var.d = true;
                            ((x60) g0cVar3).a(gut.J0(str5));
                            jziVar.c();
                        }
                        return ngg.F(ggm.retry);
                    } catch (RuntimeException e) {
                        y7oVar = new y7o(null, hld.t(hi4Var, e));
                    }
                } else {
                    q1c r = yd5.r(hi4Var);
                    r1c r1cVar = r1c.c;
                    String str7 = hi4Var.c;
                    y7oVar = new y7o(null, new k03(r, r1cVar, null, str4, "Undefined binding payment status: ".concat(hrg.s("<DiehardResponse: status - ", str4, ", desc - ", str7 != null ? str7 : "null", ">"))));
                }
                return y7oVar;
            case 13:
                hi4 hi4Var2 = (hi4) obj;
                hi4Var2.getClass();
                bz2 bz2Var = (bz2) obj2;
                bz2Var.getClass();
                hi4Var2.getClass();
                String str8 = hi4Var2.a;
                String str9 = hi4Var2.k;
                String str10 = hi4Var2.j;
                if (str8.equals("success")) {
                    return ngg.F(ggm.done);
                }
                if (str8.equals("wait_for_notification")) {
                    if (str10 != null && str9 != null) {
                        try {
                            if (!bz2Var.b) {
                                bz2Var.b = true;
                                try {
                                    String uri2 = new URI(str10).toString();
                                    uri2.getClass();
                                    Uri parse2 = Uri.parse(uri2);
                                    parse2.getClass();
                                    ft7Var2 = new ft7(parse2);
                                } catch (Throwable unused2) {
                                    ft7Var2 = null;
                                }
                                if (ft7Var2 == null) {
                                    return new y7o(null, hld.A(str10, hi4Var2));
                                }
                                qdq.A(new t03((Function1) ((jzi) bz2Var.c).a, ft7Var2, str9));
                            }
                        } catch (RuntimeException e2) {
                            y7oVar2 = new y7o(null, hld.t(hi4Var2, e2));
                        }
                    }
                    return ngg.F(ggm.retry);
                }
                q1c r2 = yd5.r(hi4Var2);
                r1c r1cVar2 = r1c.c;
                String str11 = hi4Var2.c;
                y7oVar2 = new y7o(null, new k03(r2, r1cVar2, null, str8, "Undefined binding payment status: ".concat(hrg.s("<DiehardResponse: status - ", str8, ", desc - ", str11 != null ? str11 : "null", ">"))));
                return y7oVar2;
            case 14:
                cj4 cj4Var = (cj4) obj;
                cj4Var.getClass();
                gi4 gi4Var2 = (gi4) obj2;
                String str12 = cj4Var.a;
                String str13 = cj4Var.e;
                switch (str12.hashCode()) {
                    case -1867169789:
                        if (str12.equals("success")) {
                            return ngg.F(ggm.done);
                        }
                        break;
                    case -1086574198:
                        if (str12.equals("failure")) {
                            return new y7o(null, new k03(xv.x(str13), r1c.b, null, str12, hrg.q("Card verification failed with rc: ", str13, "}")));
                        }
                        break;
                    case -753541113:
                        if (str12.equals("in_progress")) {
                            return gi4Var2.a(cj4Var);
                        }
                        break;
                    case -465110703:
                        if (str12.equals("3ds_status_received")) {
                            if (!gi4Var2.d) {
                                gi4Var2.d = true;
                                gi4Var2.a.c();
                            }
                            return ngg.F(ggm.retry);
                        }
                        break;
                    case 1028554472:
                        if (str12.equals(DefaultConnectableDeviceStore.KEY_CREATED)) {
                            return gi4Var2.a(cj4Var);
                        }
                        break;
                    case 1554903868:
                        if (str12.equals("3ds_required")) {
                            return gi4Var2.a(cj4Var);
                        }
                        break;
                }
                q1c x = xv.x(str13);
                r1c r1cVar3 = r1c.b;
                StringBuilder m = f1d.m("<VerificationResponse: status - ", str12, ", status code - ", cj4Var.b, ", rc - ");
                m.append(str13);
                m.append(">");
                return new y7o(null, new k03(x, r1cVar3, null, str12, "Undefined binding verification status: ".concat(m.toString())));
            case 15:
                ((qi4) obj).getClass();
                return new qv3(((mwt) obj2).b, null);
            case 16:
                np3 np3Var = (np3) obj;
                cd3 cd3Var = (cd3) obj2;
                if (np3Var.getDensity() * cd3Var.r < 0.0f || nmq.c(np3Var.a.e()) <= 0.0f) {
                    return np3Var.b(rq1.Z);
                }
                float f3 = 2;
                float min = Math.min(cma.a(cd3Var.r, 0.0f) ? 1.0f : (float) Math.ceil(np3Var.getDensity() * cd3Var.r), (float) Math.ceil(nmq.c(np3Var.a.e()) / f3));
                float f4 = min / f3;
                long floatToRawIntBits = (Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L);
                long floatToRawIntBits2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (np3Var.a.e() >> 32)) - min) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (np3Var.a.e() & 4294967295L)) - min) & 4294967295L);
                float f5 = min * f3;
                boolean z3 = f5 > nmq.c(np3Var.a.e());
                ocg I2 = cd3Var.t.I(np3Var.a.e(), np3Var.a.getLayoutDirection(), np3Var);
                if (!(I2 instanceof zxj)) {
                    if (!(I2 instanceof byj)) {
                        if (!(I2 instanceof ayj)) {
                            b6e.s();
                            return null;
                        }
                        ai3 ai3Var2 = cd3Var.s;
                        if (z3) {
                            floatToRawIntBits = 0;
                        }
                        long j2 = floatToRawIntBits;
                        if (z3) {
                            floatToRawIntBits2 = np3Var.a.e();
                        }
                        return np3Var.b(new zc3(0, j2, floatToRawIntBits2, ai3Var2, z3 ? dbc.a : new amr(min, 0.0f, 0, 0, 30)));
                    }
                    ai3 ai3Var3 = cd3Var.s;
                    jgo jgoVar = ((byj) I2).j;
                    if (cb0.B(jgoVar)) {
                        return np3Var.b(new bd3(z3, ai3Var3, jgoVar.e, f4, min, floatToRawIntBits, floatToRawIntBits2, new amr(min, 0.0f, 0, 0, 30)));
                    }
                    if (cd3Var.q == null) {
                        cd3Var.q = new xc3();
                    }
                    xc3 xc3Var = cd3Var.q;
                    xc3Var.getClass();
                    nh0 nh0Var = xc3Var.d;
                    nh0 nh0Var2 = nh0Var;
                    if (nh0Var == null) {
                        nh0 a = ph0.a();
                        xc3Var.d = a;
                        nh0Var2 = a;
                    }
                    nh0Var2.h();
                    eak.a(nh0Var2, jgoVar);
                    if (!z3) {
                        eak a2 = ph0.a();
                        eak.a(a2, new jgo(min, min, jgoVar.b() - min, jgoVar.a() - min, c3x.T(min, jgoVar.e), c3x.T(min, jgoVar.f), c3x.T(min, jgoVar.g), c3x.T(min, jgoVar.h)));
                        nh0Var2.g(nh0Var2, a2, 0);
                    }
                    return np3Var.b(new al(25, nh0Var2, ai3Var3));
                }
                ai3 ai3Var4 = cd3Var.s;
                zxj zxjVar = (zxj) I2;
                eak eakVar = zxjVar.j;
                if (z3) {
                    return np3Var.b(new al(24, zxjVar, ai3Var4));
                }
                if (ai3Var4 instanceof f3r) {
                    d43Var = new d43(d85.b(((f3r) ai3Var4).a, 1.0f, 0.0f, 0.0f, 0.0f, 14), 5);
                    i = 1;
                } else {
                    i = 0;
                    d43Var = null;
                }
                ynn d8 = ((nh0) eakVar).d();
                float f6 = d8.b;
                float f7 = d8.a;
                if (cd3Var.q == null) {
                    cd3Var.q = new xc3();
                }
                xc3 xc3Var2 = cd3Var.q;
                xc3Var2.getClass();
                nh0 nh0Var3 = xc3Var2.d;
                nh0 nh0Var4 = nh0Var3;
                if (nh0Var3 == null) {
                    nh0 a3 = ph0.a();
                    xc3Var2.d = a3;
                    nh0Var4 = a3;
                }
                nh0Var4.h();
                bak bakVar = bak.a;
                float f8 = d8.a;
                float f9 = d8.d;
                float f10 = d8.c;
                float f11 = d8.b;
                if (Float.isNaN(f8) || Float.isNaN(f11) || Float.isNaN(f10) || Float.isNaN(f9)) {
                    ph0.c("Invalid rectangle, make sure no value is NaN");
                }
                if (nh0Var4.b == null) {
                    nh0Var4.b = new RectF();
                }
                RectF rectF = nh0Var4.b;
                rectF.getClass();
                rectF.set(f8, f11, f10, f9);
                Path path = nh0Var4.a;
                RectF rectF2 = nh0Var4.b;
                rectF2.getClass();
                path.addRect(rectF2, ph0.b(bakVar));
                nh0Var4.g(nh0Var4, eakVar, 0);
                xqn xqnVar = new xqn();
                long ceil = (((int) Math.ceil(d8.c - f7)) << 32) | (((int) Math.ceil(d8.d - f6)) & 4294967295L);
                xc3 xc3Var3 = cd3Var.q;
                xc3Var3.getClass();
                yg0 yg0Var = xc3Var3.a;
                ud0 ud0Var = xc3Var3.b;
                if (yg0Var != null) {
                    Bitmap.Config config = yg0Var.a.getConfig();
                    config.getClass();
                    fbeVar = new fbe(fx1.q(config));
                } else {
                    fbeVar = null;
                }
                try {
                    try {
                        if (fbeVar == null || fbeVar.a != 0) {
                            if (yg0Var != null) {
                                Bitmap.Config config2 = yg0Var.a.getConfig();
                                config2.getClass();
                                fbeVar2 = new fbe(fx1.q(config2));
                            } else {
                                fbeVar2 = null;
                            }
                            if (fbeVar2 == null || i != fbeVar2.a) {
                                z = false;
                                if (yg0Var != null && ud0Var != null) {
                                    intBitsToFloat = Float.intBitsToFloat((int) (np3Var.a.e() >> 32));
                                    bitmap = yg0Var.a;
                                    if (intBitsToFloat <= bitmap.getWidth()) {
                                        ai3Var = ai3Var4;
                                        if (Float.intBitsToFloat((int) (np3Var.a.e() & 4294967295L)) <= bitmap.getHeight() && z) {
                                            o = yg0Var;
                                            ou3Var = xc3Var3.c;
                                            if (ou3Var == null) {
                                                ou3Var = new ou3();
                                                xc3Var3.c = ou3Var;
                                            }
                                            nshVar = ou3Var.b;
                                            nu3 nu3Var = ou3Var.a;
                                            long Q = nt0.Q(ceil);
                                            xof layoutDirection = np3Var.a.getLayoutDirection();
                                            ou3 ou3Var2 = ou3Var;
                                            jx7 jx7Var = nu3Var.a;
                                            xof xofVar = nu3Var.b;
                                            nh0 nh0Var5 = nh0Var4;
                                            mu3 mu3Var = nu3Var.c;
                                            yg0 yg0Var2 = o;
                                            long j3 = nu3Var.d;
                                            nu3Var.a = np3Var;
                                            nu3Var.b = layoutDirection;
                                            nu3Var.c = ud0Var;
                                            nu3Var.d = Q;
                                            ud0Var.r();
                                            jpa.B(ou3Var2, d85.b, 0L, Q, 0.0f, null, 0, 58);
                                            f = -f7;
                                            f2 = -f6;
                                            ((xzi) nshVar.b).m0(f, f2);
                                            ai3 ai3Var5 = ai3Var;
                                            jpa.C(ou3Var2, zxjVar.j, ai3Var5, 0.0f, new amr(f5, 0.0f, 0, 0, 30), 52);
                                            float f12 = 1;
                                            float intBitsToFloat2 = (Float.intBitsToFloat((int) (ou3Var2.e() >> 32)) + f12) / Float.intBitsToFloat((int) (ou3Var2.e() >> 32));
                                            float intBitsToFloat3 = (Float.intBitsToFloat((int) (ou3Var2.e() & 4294967295L)) + f12) / Float.intBitsToFloat((int) (ou3Var2.e() & 4294967295L));
                                            long y0 = ou3Var2.y0();
                                            ud0 ud0Var2 = ud0Var;
                                            B = nshVar.B();
                                            nshVar.s().r();
                                            ((xzi) nshVar.b).f0(intBitsToFloat2, intBitsToFloat3, y0);
                                            jpa.C(ou3Var2, nh0Var5, ai3Var5, 0.0f, null, 28);
                                            ((xzi) nshVar.b).m0(-f, -f2);
                                            ud0Var2.k();
                                            nu3Var.a = jx7Var;
                                            nu3Var.b = xofVar;
                                            nu3Var.c = mu3Var;
                                            nu3Var.d = j3;
                                            yg0Var2.a.prepareToDraw();
                                            xqnVar.a = yg0Var2;
                                            return np3Var.b(new ad3(d8, xqnVar, ceil, d43Var, 0));
                                        }
                                        o = xee.o((int) (ceil >> 32), (int) (ceil & 4294967295L), i);
                                        xc3Var3.a = o;
                                        ud0Var = bow.d(o);
                                        xc3Var3.b = ud0Var;
                                        ou3Var = xc3Var3.c;
                                        if (ou3Var == null) {
                                        }
                                        nshVar = ou3Var.b;
                                        nu3 nu3Var2 = ou3Var.a;
                                        long Q2 = nt0.Q(ceil);
                                        xof layoutDirection2 = np3Var.a.getLayoutDirection();
                                        ou3 ou3Var22 = ou3Var;
                                        jx7 jx7Var2 = nu3Var2.a;
                                        xof xofVar2 = nu3Var2.b;
                                        nh0 nh0Var52 = nh0Var4;
                                        mu3 mu3Var2 = nu3Var2.c;
                                        yg0 yg0Var22 = o;
                                        long j32 = nu3Var2.d;
                                        nu3Var2.a = np3Var;
                                        nu3Var2.b = layoutDirection2;
                                        nu3Var2.c = ud0Var;
                                        nu3Var2.d = Q2;
                                        ud0Var.r();
                                        jpa.B(ou3Var22, d85.b, 0L, Q2, 0.0f, null, 0, 58);
                                        f = -f7;
                                        f2 = -f6;
                                        ((xzi) nshVar.b).m0(f, f2);
                                        ai3 ai3Var52 = ai3Var;
                                        jpa.C(ou3Var22, zxjVar.j, ai3Var52, 0.0f, new amr(f5, 0.0f, 0, 0, 30), 52);
                                        float f122 = 1;
                                        float intBitsToFloat22 = (Float.intBitsToFloat((int) (ou3Var22.e() >> 32)) + f122) / Float.intBitsToFloat((int) (ou3Var22.e() >> 32));
                                        float intBitsToFloat32 = (Float.intBitsToFloat((int) (ou3Var22.e() & 4294967295L)) + f122) / Float.intBitsToFloat((int) (ou3Var22.e() & 4294967295L));
                                        long y02 = ou3Var22.y0();
                                        ud0 ud0Var22 = ud0Var;
                                        B = nshVar.B();
                                        nshVar.s().r();
                                        ((xzi) nshVar.b).f0(intBitsToFloat22, intBitsToFloat32, y02);
                                        jpa.C(ou3Var22, nh0Var52, ai3Var52, 0.0f, null, 28);
                                        ((xzi) nshVar.b).m0(-f, -f2);
                                        ud0Var22.k();
                                        nu3Var2.a = jx7Var2;
                                        nu3Var2.b = xofVar2;
                                        nu3Var2.c = mu3Var2;
                                        nu3Var2.d = j32;
                                        yg0Var22.a.prepareToDraw();
                                        xqnVar.a = yg0Var22;
                                        return np3Var.b(new ad3(d8, xqnVar, ceil, d43Var, 0));
                                    }
                                }
                                ai3Var = ai3Var4;
                                o = xee.o((int) (ceil >> 32), (int) (ceil & 4294967295L), i);
                                xc3Var3.a = o;
                                ud0Var = bow.d(o);
                                xc3Var3.b = ud0Var;
                                ou3Var = xc3Var3.c;
                                if (ou3Var == null) {
                                }
                                nshVar = ou3Var.b;
                                nu3 nu3Var22 = ou3Var.a;
                                long Q22 = nt0.Q(ceil);
                                xof layoutDirection22 = np3Var.a.getLayoutDirection();
                                ou3 ou3Var222 = ou3Var;
                                jx7 jx7Var22 = nu3Var22.a;
                                xof xofVar22 = nu3Var22.b;
                                nh0 nh0Var522 = nh0Var4;
                                mu3 mu3Var22 = nu3Var22.c;
                                yg0 yg0Var222 = o;
                                long j322 = nu3Var22.d;
                                nu3Var22.a = np3Var;
                                nu3Var22.b = layoutDirection22;
                                nu3Var22.c = ud0Var;
                                nu3Var22.d = Q22;
                                ud0Var.r();
                                jpa.B(ou3Var222, d85.b, 0L, Q22, 0.0f, null, 0, 58);
                                f = -f7;
                                f2 = -f6;
                                ((xzi) nshVar.b).m0(f, f2);
                                ai3 ai3Var522 = ai3Var;
                                jpa.C(ou3Var222, zxjVar.j, ai3Var522, 0.0f, new amr(f5, 0.0f, 0, 0, 30), 52);
                                float f1222 = 1;
                                float intBitsToFloat222 = (Float.intBitsToFloat((int) (ou3Var222.e() >> 32)) + f1222) / Float.intBitsToFloat((int) (ou3Var222.e() >> 32));
                                float intBitsToFloat322 = (Float.intBitsToFloat((int) (ou3Var222.e() & 4294967295L)) + f1222) / Float.intBitsToFloat((int) (ou3Var222.e() & 4294967295L));
                                long y022 = ou3Var222.y0();
                                ud0 ud0Var222 = ud0Var;
                                B = nshVar.B();
                                nshVar.s().r();
                                ((xzi) nshVar.b).f0(intBitsToFloat222, intBitsToFloat322, y022);
                                jpa.C(ou3Var222, nh0Var522, ai3Var522, 0.0f, null, 28);
                                ((xzi) nshVar.b).m0(-f, -f2);
                                ud0Var222.k();
                                nu3Var22.a = jx7Var22;
                                nu3Var22.b = xofVar22;
                                nu3Var22.c = mu3Var22;
                                nu3Var22.d = j322;
                                yg0Var222.a.prepareToDraw();
                                xqnVar.a = yg0Var222;
                                return np3Var.b(new ad3(d8, xqnVar, ceil, d43Var, 0));
                            }
                        }
                        ((xzi) nshVar.b).f0(intBitsToFloat222, intBitsToFloat322, y022);
                        jpa.C(ou3Var222, nh0Var522, ai3Var522, 0.0f, null, 28);
                        ((xzi) nshVar.b).m0(-f, -f2);
                        ud0Var222.k();
                        nu3Var22.a = jx7Var22;
                        nu3Var22.b = xofVar22;
                        nu3Var22.c = mu3Var22;
                        nu3Var22.d = j322;
                        yg0Var222.a.prepareToDraw();
                        xqnVar.a = yg0Var222;
                        return np3Var.b(new ad3(d8, xqnVar, ceil, d43Var, 0));
                    } finally {
                        nshVar.s().k();
                        nshVar.R(B);
                    }
                    ai3 ai3Var5222 = ai3Var;
                    jpa.C(ou3Var222, zxjVar.j, ai3Var5222, 0.0f, new amr(f5, 0.0f, 0, 0, 30), 52);
                    float f12222 = 1;
                    float intBitsToFloat2222 = (Float.intBitsToFloat((int) (ou3Var222.e() >> 32)) + f12222) / Float.intBitsToFloat((int) (ou3Var222.e() >> 32));
                    float intBitsToFloat3222 = (Float.intBitsToFloat((int) (ou3Var222.e() & 4294967295L)) + f12222) / Float.intBitsToFloat((int) (ou3Var222.e() & 4294967295L));
                    long y0222 = ou3Var222.y0();
                    ud0 ud0Var2222 = ud0Var;
                    B = nshVar.B();
                    nshVar.s().r();
                } catch (Throwable th) {
                    ((xzi) nshVar.b).m0(-f, -f2);
                    throw th;
                }
                z = true;
                if (yg0Var != null) {
                    intBitsToFloat = Float.intBitsToFloat((int) (np3Var.a.e() >> 32));
                    bitmap = yg0Var.a;
                    if (intBitsToFloat <= bitmap.getWidth()) {
                    }
                }
                ai3Var = ai3Var4;
                o = xee.o((int) (ceil >> 32), (int) (ceil & 4294967295L), i);
                xc3Var3.a = o;
                ud0Var = bow.d(o);
                xc3Var3.b = ud0Var;
                ou3Var = xc3Var3.c;
                if (ou3Var == null) {
                }
                nshVar = ou3Var.b;
                nu3 nu3Var222 = ou3Var.a;
                long Q222 = nt0.Q(ceil);
                xof layoutDirection222 = np3Var.a.getLayoutDirection();
                ou3 ou3Var2222 = ou3Var;
                jx7 jx7Var222 = nu3Var222.a;
                xof xofVar222 = nu3Var222.b;
                nh0 nh0Var5222 = nh0Var4;
                mu3 mu3Var222 = nu3Var222.c;
                yg0 yg0Var2222 = o;
                long j3222 = nu3Var222.d;
                nu3Var222.a = np3Var;
                nu3Var222.b = layoutDirection222;
                nu3Var222.c = ud0Var;
                nu3Var222.d = Q222;
                ud0Var.r();
                jpa.B(ou3Var2222, d85.b, 0L, Q222, 0.0f, null, 0, 58);
                f = -f7;
                f2 = -f6;
                ((xzi) nshVar.b).m0(f, f2);
                break;
            case 17:
                ((x0q) ((gs4) obj2).b).a(null);
                return Unit.a;
            case 18:
                try {
                    ((mkn) obj2).cancel();
                } catch (Throwable unused3) {
                }
                return Unit.a;
            case 19:
                ((pjq) obj2).a.o(null, false);
                return Unit.a;
            case 20:
                jw3 jw3Var = (jw3) obj;
                jw3Var.getClass();
                mw3 mw3Var = (mw3) obj2;
                mw3Var.g = jw3Var;
                mv3 mv3Var = (mv3) mw3Var.d;
                if (mv3Var != null) {
                    mv3Var.j(mw3Var.j(jw3Var));
                }
                return Unit.a;
            case 21:
                long j4 = ((enj) obj).a;
                nn4 nn4Var = (nn4) obj2;
                if (nn4Var.u) {
                    nn4Var.v.invoke();
                }
                return Unit.a;
            case 22:
                return Boolean.valueOf(((s7w) obj2).a.contains(obj));
            case 23:
                bn0 bn0Var = (bn0) obj;
                float f13 = bn0Var.b;
                if (f13 < 0.0f) {
                    f13 = 0.0f;
                }
                if (f13 > 1.0f) {
                    f13 = 1.0f;
                }
                float f14 = bn0Var.c;
                if (f14 < -0.5f) {
                    f14 = -0.5f;
                }
                if (f14 > 0.5f) {
                    f14 = 0.5f;
                }
                float f15 = bn0Var.d;
                float f16 = f15 >= -0.5f ? f15 : -0.5f;
                float f17 = f16 <= 0.5f ? f16 : 0.5f;
                float f18 = bn0Var.a;
                if (f18 < 0.0f) {
                    f18 = 0.0f;
                }
                return new d85(d85.a(c3x.e(f13, f14, f17, f18 > 1.0f ? 1.0f : f18, n95.x), (l95) obj2));
            case 24:
                Z0 z0 = (Z0) obj;
                z0.getClass();
                return fb6.access$toLogCommand((fb6) obj2, z0);
            case 25:
                ii6 ii6Var = (ii6) obj;
                ei6 ei6Var = (ei6) obj2;
                ii6Var.getClass();
                eg6 eg6Var = ei6Var.i;
                if (eg6Var != null) {
                    sbp sbpVar = eg6Var.a;
                    if (ii6Var.equals(gi6.a)) {
                        ((rhk) ei6Var.x()).a.setVisibility(0);
                        ((rhk) ei6Var.x()).a.setState(new dvm(false));
                        if (ei6Var.j) {
                            sbpVar.n(false);
                        }
                    } else if (ii6Var instanceof fi6) {
                        if (ei6Var.j) {
                            sbpVar.n(false);
                        }
                        sbpVar.t();
                        bfk bfkVar = ((fi6) ii6Var).a;
                        bfkVar.getClass();
                        sbpVar.B(bfkVar);
                    } else if (ii6Var instanceof hi6) {
                        if (ei6Var.j) {
                            sbpVar.n(false);
                        }
                        sbpVar.t();
                        sbpVar.L(R.string.paymentsdk_success_title);
                    }
                }
                return Unit.a;
            case 26:
                m7d m7dVar = (m7d) obj;
                m7dVar.getClass();
                ts6 ts6Var = (ts6) obj2;
                ts6Var.f().execute(new ps6(ts6Var, m7dVar, i3));
                return Unit.a;
            case 27:
                zq6 zq6Var = (zq6) obj;
                zq6Var.getClass();
                ws6 ws6Var = (ws6) obj2;
                Executor executor = ws6Var.e;
                if (executor != null) {
                    executor.execute(new qf0(27, ws6Var, zq6Var));
                    return Unit.a;
                }
                Intrinsics.j("executor");
                throw null;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                zq6 zq6Var2 = (zq6) obj;
                zq6Var2.getClass();
                dt6 dt6Var = (dt6) obj2;
                Executor executor2 = dt6Var.f;
                if (executor2 != null) {
                    executor2.execute(new ys6(dt6Var, zq6Var2, i3));
                    return Unit.a;
                }
                Intrinsics.j("executor");
                throw null;
            default:
                ((zco) obj).a(((Number) ((sdr) obj2).getValue()).floatValue());
                return Unit.a;
        }
    }
}
