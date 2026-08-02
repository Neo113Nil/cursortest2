package defpackage;

import android.content.Context;
import android.util.Base64;
import com.yandex.pulse.metrics.o;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;
import okhttp3.OkHttpClient;
import ru.domesticroots.certificatetransparency.internal.loglist.model.v2.Log;
import ru.domesticroots.certificatetransparency.internal.loglist.model.v2.LogListV2;
import ru.domesticroots.certificatetransparency.internal.loglist.model.v2.Operator;
import ru.domesticroots.certificatetransparency.internal.loglist.model.v2.State;
import ru.yandex.video.m3.data.DrmParameters;
import ru.yandex.video.m3.ott.data.dto.c;
import ru.yandex.video.m3.ott.data.dto.drm.DrmModule;
import ru.yandex.video.m3.player.impl.tracking.a;
import ru.yandex.video.m3.player.impl.tracking.data.PlayerState;
import ru.yandex.video.m3.player.impl.tracking.event.Event;
import ru.yandex.video.m3.player.impl.tracking.event.EventDefault;
import ru.yandex.video.m3.player.impl.tracking.event.EventType;
import ru.yandex.video.m3.player.impl.tracking.event.PlayerAliveData;

/* loaded from: classes6.dex */
public final class ybg extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybg(u3k u3kVar, rwo rwoVar) {
        super(1);
        this.r = 14;
        this.s = u3kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0524  */
    /* JADX WARN: Type inference failed for: r5v23, types: [ryc, uif] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object rrgVar;
        fxf zrgVar;
        Object jrgVar;
        int i = 11;
        int i2 = 0;
        Object obj2 = null;
        switch (this.r) {
            case 0:
                c cVar = (c) obj;
                cVar.getClass();
                imh imhVar = (imh) this.s;
                cVar.h = imhVar.c;
                cVar.j = imhVar.b;
                return Unit.a;
            case 1:
                gld.L(((ecg) this.s).k, null);
                return Unit.a;
            case 2:
                zmm zmmVar = (zmm) obj;
                zmmVar.getClass();
                zmmVar.b = new ji7((Context) this.s, 5);
                return Unit.a;
            case 3:
                ((uob) this.s).close();
                return Unit.a;
            case 4:
                ((lcg) this.s).cancel(false);
                return Unit.a;
            case 5:
                xin xinVar = (xin) obj;
                xinVar.getClass();
                j6e j6eVar = (j6e) this.s;
                if (xinVar instanceof win) {
                    win winVar = (win) xinVar;
                    byte[] bArr = winVar.a;
                    byte[] bArr2 = winVar.b;
                    cib cibVar = (cib) j6eVar.a;
                    cibVar.getClass();
                    fxf fxfVar = bsg.a;
                    bArr.getClass();
                    if (bArr2 != null) {
                        try {
                            Signature signature = Signature.getInstance("SHA256withRSA");
                            signature.initVerify((PublicKey) cibVar.b);
                            signature.update(bArr);
                            if (!signature.verify(bArr2)) {
                                fxfVar = yrg.a;
                            }
                        } catch (InvalidKeyException e) {
                            zrgVar = new xrg(e);
                            fxfVar = zrgVar;
                            if (!(fxfVar instanceof bsg)) {
                            }
                        } catch (NoSuchAlgorithmException e2) {
                            zrgVar = new wrg(e2);
                            fxfVar = zrgVar;
                            if (!(fxfVar instanceof bsg)) {
                            }
                        } catch (SignatureException e3) {
                            zrgVar = new zrg(e3);
                            fxfVar = zrgVar;
                            if (!(fxfVar instanceof bsg)) {
                            }
                        }
                    }
                    if (!(fxfVar instanceof bsg)) {
                        mrg mrgVar = (mrg) j6eVar.b;
                        String str = new String(bArr, Charsets.UTF_8);
                        ((nrg) mrgVar).getClass();
                        try {
                            List<Operator> operators = ((LogListV2) nrg.a.b(LogListV2.INSTANCE.serializer(), str)).getOperators();
                            ArrayList arrayList = new ArrayList();
                            Iterator<T> it = operators.iterator();
                            while (it.hasNext()) {
                                z75.t(arrayList, ((Operator) it.next()).getLogs());
                            }
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                Log log = (Log) next;
                                if (log.getState() != null && !(log.getState() instanceof State.Pending) && !(log.getState() instanceof State.Rejected)) {
                                    arrayList2.add(next);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                Log log2 = (Log) it3.next();
                                String key = log2.getKey();
                                key.getClass();
                                byte[] decode = Base64.decode(key, 0);
                                decode.getClass();
                                try {
                                    arrayList3.add(new urg(ezf.B(decode), ((log2.getState() instanceof State.Retired) || (log2.getState() instanceof State.ReadOnly)) ? Long.valueOf(log2.getState().getTimestamp()) : null));
                                } catch (IllegalArgumentException e4) {
                                    jrgVar = new vrg(log2.getKey(), e4);
                                } catch (NoSuchAlgorithmException e5) {
                                    jrgVar = new vrg(log2.getKey(), e5);
                                } catch (InvalidKeySpecException e6) {
                                    jrgVar = new vrg(log2.getKey(), e6);
                                }
                            }
                            jrgVar = new prg(arrayList3);
                        } catch (zhp e7) {
                            jrgVar = new jrg(e7);
                        }
                        return jrgVar;
                    }
                    if (!(fxfVar instanceof asg)) {
                        b6e.s();
                        return null;
                    }
                    rrgVar = new xfq((asg) fxfVar);
                } else {
                    if (!(xinVar instanceof vin)) {
                        b6e.s();
                        return null;
                    }
                    vin vinVar = (vin) xinVar;
                    if (vinVar instanceof tin) {
                        return new lrg(((tin) vinVar).a);
                    }
                    if (!(vinVar instanceof yin)) {
                        return krg.b;
                    }
                    rrgVar = new rrg(null);
                }
                return rrgVar;
            case 6:
                ((gzg) obj).getClass();
                return (Integer) this.s;
            case 7:
                ieg iegVar = (ieg) obj;
                iegVar.getClass();
                axh axhVar = (axh) this.s;
                iegVar.b = Long.valueOf(axhVar.a);
                iegVar.c = Long.valueOf(axhVar.b);
                return Unit.a;
            case 8:
                zco zcoVar = (zco) obj;
                float floatValue = ((Number) ((fk0) this.s).e()).floatValue();
                float d = sbi.d(zcoVar, floatValue);
                float e8 = sbi.e(zcoVar, floatValue);
                zcoVar.n(e8 == 0.0f ? 1.0f : d / e8);
                zcoVar.v(sbi.c);
                return Unit.a;
            case 9:
                return Integer.valueOf(((lfi) this.s).a.a(((mfi) obj).e));
            case 10:
                return Boolean.valueOf(((txi) obj).b.equals((mfi) this.s));
            case 11:
                e1j e1jVar = (e1j) obj;
                e1jVar.getClass();
                xo7 xo7Var = ((d0j) this.s).a;
                xo7Var.getClass();
                e1jVar.getClass();
                qs6 qs6Var = new qs6(i, xo7Var, e1jVar);
                ?? r5 = xo7Var.d;
                String b = e1jVar.b();
                String g = e1jVar.c().g("X-Request-ID");
                if (g == null) {
                    g = "";
                }
                String g2 = e1jVar.c().g("traceparent");
                r5.invoke(b, g, g2 != null ? g2 : "", xo7Var.a(e1jVar).a.d);
                ju7 ju7Var = new ju7((ig3) xo7Var.g.b);
                OkHttpClient okHttpClient = xo7Var.f;
                d0o d0oVar = (d0o) qs6Var.invoke();
                okHttpClient.getClass();
                new mkn(okHttpClient, d0oVar, false).z(new wo7(i2, ju7Var, xo7Var, e1jVar));
                return ju7Var.a;
            case 12:
                e1j e1jVar2 = (e1j) obj;
                e1jVar2.getClass();
                return ((b0j) this.s).c(e1jVar2);
            case 13:
                fom fomVar = (fom) obj;
                fomVar.getClass();
                DrmParameters drmParameters = (DrmParameters) this.s;
                fomVar.b = ((DrmModule) drmParameters.getDrmConfig()).getLicenseKeyId();
                fomVar.c = drmParameters.getDrmSecurityLevel();
                return Unit.a;
            case 14:
                float floatValue2 = ((Number) obj).floatValue();
                o3k o3kVar = ((u3k) this.s).b;
                o3kVar.s.i(o3kVar.i(o3kVar.j() + eeh.b(o3kVar.p() != 0 ? floatValue2 / o3kVar.p() : 0.0f)));
                return Unit.a;
            case 15:
                r7w r7wVar = (r7w) obj;
                r7wVar.getClass();
                qdq.A(new ssb(28, (ime) this.s, r7wVar));
                return Unit.a;
            case 16:
                nq0 nq0Var = (nq0) this.s;
                List list = (List) obj;
                list.getClass();
                if (!list.isEmpty()) {
                    z2t z2tVar = (z2t) nq0Var.b;
                    a aVar = z2tVar.a;
                    PlayerState a = z2tVar.b.a();
                    n0l n0lVar = z2tVar.v;
                    aVar.getClass();
                    boolean z = aVar.l;
                    chs chsVar = aVar.p;
                    chsVar.getClass();
                    chsVar.a("[EventTrackerImpl]", "onPlayerAlive", "states count = " + list.size(), new Object[0]);
                    cjb i3 = aVar.i();
                    bjb j = aVar.j();
                    if (z) {
                        x97.y(aVar.k, null, null, new jjb(j, null, aVar, n0lVar, a, list, i3, 2), 3);
                    } else {
                        Event event = Event.PLAYER_ALIVE;
                        EventType eventType = EventType.EVENT;
                        aVar.g.getClass();
                        eventType.getClass();
                        ylr ylrVar = aVar.a;
                        if (z) {
                            EventDefault h = a.h(aVar, new bjb(n0lVar), event, null, a.getVideoType(), null, new PlayerAliveData(list), i3, 10);
                            ylrVar.getClass();
                            ylrVar.c(h);
                        } else {
                            ylrVar.b(a.h(aVar, new bjb(n0lVar), event, null, a.getVideoType(), null, new PlayerAliveData(list), i3, 10));
                        }
                    }
                }
                if (nq0Var.c && !nq0Var.d && !nq0Var.e) {
                    o9l c = nq0Var.c();
                    ScheduledFuture scheduledFuture = c.h;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(true);
                    }
                    c.h = null;
                    nq0Var.c = false;
                    nq0Var.d();
                    nq0Var.c().b((ScheduledExecutorService) nq0Var.f);
                }
                return Unit.a;
            case 17:
                List list2 = (List) obj;
                list2.getClass();
                eqm eqmVar = (eqm) this.s;
                eqmVar.getClass();
                ArrayList y0 = CollectionsKt.y0(list2);
                eqmVar.s = y0;
                if (y0.size() == 1) {
                    eqmVar.J((rfk) CollectionsKt.Q(eqmVar.s), false);
                } else {
                    eqmVar.H();
                }
                return Unit.a;
            case 18:
                zco zcoVar2 = (zco) obj;
                zcoVar2.y(((d1n) this.s).e.e() - nmq.b(zcoVar2.p));
                return Unit.a;
            case 19:
                bg2 bg2Var = (bg2) obj;
                bg2Var.getClass();
                return ((fjn) this.s).d.a(bg2Var);
            case 20:
                Throwable th = (Throwable) obj;
                CancellationException c2 = n7w.c("Recomposer effect job completed", th);
                cnn cnnVar = (cnn) this.s;
                synchronized (cnnVar.c) {
                    try {
                        r2f r2fVar = cnnVar.d;
                        if (r2fVar != null) {
                            xdr xdrVar = cnnVar.u;
                            zmn zmnVar = zmn.b;
                            xdrVar.getClass();
                            xdrVar.m(null, zmnVar);
                            xdr xdrVar2 = cnn.y;
                            r2fVar.g(c2);
                            cnnVar.r = null;
                            r2fVar.R(new afg(23, cnnVar, th));
                        } else {
                            cnnVar.e = c2;
                            xdr xdrVar3 = cnnVar.u;
                            zmn zmnVar2 = zmn.a;
                            xdrVar3.getClass();
                            xdrVar3.m(null, zmnVar2);
                        }
                    } finally {
                    }
                }
                return Unit.a;
            case 21:
                ((wr5) this.s).f(obj);
                return Unit.a;
            case 22:
                ((qnn) this.s).a((i1b) obj);
                return Unit.a;
            case 23:
                aqi aqiVar = (aqi) obj;
                if (!(aqiVar instanceof l2r)) {
                    xq0.x("Failed requirement.");
                    return null;
                }
                if (aqiVar.getValue() != null) {
                    apo apoVar = (apo) this.s;
                    Object value = aqiVar.getValue();
                    value.getClass();
                    obj2 = ((Function1) apoVar.c).invoke(value);
                }
                n2r f = ((l2r) aqiVar).f();
                f.getClass();
                return new x6k(obj2, f);
            case 24:
                zxn zxnVar = (zxn) obj;
                zxnVar.getClass();
                return Boolean.valueOf(zxnVar.a.a != ((zxn) this.s).a.a);
            case 25:
                ((am8) this.s).invoke(((tjo) obj).a);
                return Unit.a;
            case 26:
                koo kooVar = ((ioo) this.s).c;
                return Boolean.valueOf(kooVar != null ? kooVar.c(obj) : true);
            case 27:
                hqo hqoVar = (hqo) obj;
                spo spoVar = (spo) this.s;
                if (hqoVar instanceof fqo) {
                    spo.y(spoVar, 10);
                } else if (hqoVar instanceof eqo) {
                    spo.y(spoVar, 11);
                }
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                cro croVar = (cro) obj;
                croVar.getClass();
                ((qtf) this.s).invoke(croVar.a, croVar.b);
                return Unit.a;
            default:
                float floatValue3 = ((Number) obj).floatValue();
                two twoVar = (two) this.s;
                u6k u6kVar = twoVar.a;
                float h2 = u6kVar.h() + floatValue3 + twoVar.e;
                float c3 = yhn.c(h2, 0.0f, twoVar.d.h());
                boolean z2 = h2 == c3;
                float h3 = c3 - u6kVar.h();
                int round = Math.round(h3);
                u6kVar.i(u6kVar.h() + round);
                twoVar.e = h3 - round;
                if (!z2) {
                    floatValue3 = h3;
                }
                return Float.valueOf(floatValue3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ybg(int i, Object obj) {
        super(1);
        this.r = i;
        this.s = obj;
    }
}
