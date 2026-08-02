package defpackage;

import android.content.Context;
import androidx.compose.foundation.lazy.a;
import androidx.fragment.app.t;
import com.google.gson.JsonObject;
import com.lightside.slab.SlotView;
import com.yandex.music.shared.network.api.okhttp.AuthenticatorHelper$RefreshTokenException;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.OkHttpClient;
import ru.yandex.music.catalog.artist.screen.ArtistScreenActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class xum implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xum(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        String str2;
        d1 d1Var;
        int i = 5;
        int i2 = 19;
        int i3 = 10;
        final int i4 = 0;
        final int i5 = 2;
        final int i6 = 3;
        switch (this.a) {
            case 0:
                aqi aqiVar = (aqi) this.b;
                poi poiVar = (poi) this.c;
                float floatValue = ((Float) obj).floatValue();
                aqiVar.setValue(Boolean.TRUE);
                ((t6k) poiVar).h(floatValue);
                return Unit.a;
            case 1:
                hur hurVar = (hur) this.b;
                jap japVar = (jap) this.c;
                lfm lfmVar = (lfm) obj;
                int i7 = (int) (hurVar.f.y >> 32);
                r6 = i7 >= 1 ? i7 : 1;
                japVar.d.i(r6);
                japVar.c.setValue(Float.valueOf(enj.e(lfmVar.c) - (r6 / 2.0f)));
                lfmVar.a();
                return Unit.a;
            case 2:
                jx7 jx7Var = (jx7) this.c;
                aqi aqiVar2 = (aqi) this.b;
                wof wofVar = (wof) obj;
                wofVar.getClass();
                float c0 = jx7Var.c0((int) (wofVar.j() & 4294967295L));
                float f = x2n.a;
                if (Float.compare(c0, f) <= 0) {
                    c0 = f;
                }
                aqiVar2.setValue(new cma(c0));
                return Unit.a;
            case 3:
                yg0 yg0Var = (yg0) this.b;
                yg0 yg0Var2 = (yg0) this.c;
                jpa jpaVar = (jpa) obj;
                jpaVar.getClass();
                if (nmq.d(jpaVar.e()) - (jpaVar.n0(c5n.a) * 2) < jpaVar.n0(c5n.b)) {
                    c5n.b(jpaVar, yg0Var, 0.390625f);
                } else {
                    c5n.b(jpaVar, yg0Var2, 0.1736111f);
                }
                return Unit.a;
            case 4:
                y5n y5nVar = (y5n) this.c;
                aqi aqiVar3 = (aqi) this.b;
                uft uftVar = (uft) obj;
                uftVar.getClass();
                l6n l6nVar = (l6n) aqiVar3.getValue();
                k6n k6nVar = l6nVar instanceof k6n ? (k6n) l6nVar : null;
                uft uftVar2 = k6nVar != null ? k6nVar.a : null;
                x5n x5nVar = y5nVar.a;
                if (y5nVar.d && uftVar == uft.c) {
                    x5nVar.b();
                } else {
                    y5nVar.b.a(uftVar);
                    x5nVar.d(uftVar2, uftVar);
                }
                return Unit.a;
            case 5:
                t5n t5nVar = (t5n) this.b;
                sdr sdrVar = (sdr) this.c;
                uft uftVar3 = (uft) obj;
                uftVar3.getClass();
                l6n l6nVar2 = (l6n) sdrVar.getValue();
                k6n k6nVar2 = l6nVar2 instanceof k6n ? (k6n) l6nVar2 : null;
                uft uftVar4 = k6nVar2 != null ? k6nVar2.a : null;
                t5nVar.getClass();
                if (t5nVar.e && uftVar3 == uft.c) {
                    v7g.L((hn5) t5nVar.b.b, new lik(vik.f, null, null));
                } else {
                    dn9 dn9Var = t5nVar.c;
                    if (uftVar4 == null) {
                        uftVar4 = uftVar3;
                    }
                    ((vnb) ((jyr) dn9Var.f).getValue()).b(xjb.SoundQuality, t5n.a(uftVar4).a, t5n.a(uftVar3).a);
                    t5nVar.a.a(uftVar3);
                }
                return Unit.a;
            case 6:
                ljn ljnVar = (ljn) this.b;
                d0o d0oVar = (d0o) this.c;
                AuthenticatorHelper$RefreshTokenException authenticatorHelper$RefreshTokenException = (AuthenticatorHelper$RefreshTokenException) obj;
                sfm sfmVar = ljnVar.b;
                String str3 = d0oVar.a.i;
                int i8 = ljnVar.d;
                authenticatorHelper$RefreshTokenException.getClass();
                JsonObject jsonObject = new JsonObject();
                jsonObject.u("url", str3);
                jsonObject.s(Integer.valueOf(i8), "currentRetryCount");
                jsonObject.u("reAuthError", fob.b(authenticatorHelper$RefreshTokenException));
                b3i b3iVar = (b3i) sfmVar.a;
                String jsonElement = jsonObject.toString();
                jsonElement.getClass();
                b3iVar.P("re_auth_error", jsonElement);
                ljnVar.a();
                return Unit.a;
            case 7:
                mjm mjmVar = (mjm) this.b;
                sai saiVar = (sai) this.c;
                umn umnVar = (umn) obj;
                umnVar.getClass();
                mjmVar.invoke(umnVar);
                saiVar.a();
                return Unit.a;
            case 8:
                uiq uiqVar = (uiq) this.b;
                dgw dgwVar = (dgw) this.c;
                ((fwd) obj).getClass();
                s2i s2iVar = new s2i();
                fwd.b(s2iVar, "Ynison-Session-Id", String.valueOf(uiqVar.C()));
                fwd.b(s2iVar, "Ynison-Device-Id", dgwVar.b());
                fwd.c(s2iVar, dgwVar.c());
                return s2iVar;
            case 9:
                xod xodVar = (xod) this.b;
                gm5 gm5Var = (gm5) this.c;
                opf opfVar = (opf) obj;
                opfVar.getClass();
                jpa.T(opfVar, xodVar, new mtd(opfVar));
                yd5.s(opfVar, xodVar);
                Unit unit = Unit.a;
                gm5Var.U(unit);
                return unit;
            case 10:
                Function0 function0 = (Function0) this.b;
                Function1 function1 = (Function1) this.c;
                List list = (List) obj;
                list.getClass();
                return new m1p((String) CollectionsKt.Q(list), function0, function1);
            case 11:
                Function1 function12 = (Function1) this.b;
                x3n x3nVar = (x3n) this.c;
                u51 u51Var = (u51) obj;
                u51Var.getClass();
                function12.invoke(u51Var);
                int i9 = ArtistScreenActivity.w0;
                t tVar = (t) x3nVar.a;
                tVar.startActivity(l48.p(tVar, u51Var, null, null, 24));
                return Unit.a;
            case 12:
                ppp pppVar = (ppp) this.b;
                mpp mppVar = (mpp) this.c;
                vuf vufVar = (vuf) obj;
                vufVar.getClass();
                if (!Intrinsics.d(pppVar, npp.a)) {
                    if (!(pppVar instanceof opp)) {
                        b6e.s();
                        return null;
                    }
                    vuf.Y(vufVar, null, new wn5(new f6p(r6, pppVar, mppVar), -1508468951, true), 3);
                }
                return Unit.a;
            case 13:
                List list2 = (List) this.b;
                eqp eqpVar = (eqp) this.c;
                vuf vufVar2 = (vuf) obj;
                vufVar2.getClass();
                int i10 = 0;
                for (Object obj2 : list2) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        u75.n();
                        throw null;
                    }
                    z53 z53Var = (z53) obj2;
                    final x8l x8lVar = new x8l(i10, z53Var, eqpVar);
                    if (!Intrinsics.d(z53Var, f53.a)) {
                        if (z53Var instanceof o53) {
                            o53 o53Var = (o53) z53Var;
                            if (o53Var instanceof m53) {
                                vuf.Y(vufVar2, null, new wn5(new f6p(i6, (m53) o53Var, x8lVar), -738418904, true), 3);
                            } else {
                                if (!(o53Var instanceof n53)) {
                                    b6e.s();
                                    return null;
                                }
                                vuf.Y(vufVar2, null, new wn5(new aqp(i4, (n53) o53Var, eqpVar, x8lVar), -1132039905, true), 3);
                            }
                        } else if (z53Var instanceof r53) {
                            r53 r53Var = (r53) z53Var;
                            if (r53Var instanceof p53) {
                                vuf.Y(vufVar2, null, new wn5(new f6p(i5, (p53) r53Var, x8lVar), 913173352, true), 3);
                            } else {
                                if (!(r53Var instanceof q53)) {
                                    b6e.s();
                                    return null;
                                }
                                vuf.Y(vufVar2, null, new wn5(new vtb(29, (q53) r53Var, eqpVar, x8lVar), 2091208927, true), 3);
                            }
                        } else if (z53Var instanceof l53) {
                            l53 l53Var = (l53) z53Var;
                            if (l53Var instanceof j53) {
                                vuf.Y(vufVar2, null, new wn5(new f6p(4, (j53) l53Var, x8lVar), -2007326478, true), 3);
                            } else {
                                if (!(l53Var instanceof k53)) {
                                    b6e.s();
                                    return null;
                                }
                                vuf.Y(vufVar2, null, new wn5(new aqp(r6, (k53) l53Var, eqpVar, x8lVar), 1229649961, true), 3);
                            }
                        } else if (z53Var instanceof u53) {
                            u53 u53Var = (u53) z53Var;
                            if (u53Var.equals(s53.a)) {
                                vuf.Y(vufVar2, null, new wn5(new pyc() { // from class: zpp
                                    @Override // defpackage.pyc
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        int i12 = i6;
                                        a aVar = (a) obj3;
                                        hq5 hq5Var = (hq5) obj4;
                                        int intValue = ((Integer) obj5).intValue();
                                        switch (i12) {
                                            case 0:
                                                aVar.getClass();
                                                oq5 oq5Var = (oq5) hq5Var;
                                                if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                                                    wct.k((yci) x8lVar.invoke(oq5Var, 0), oq5Var, 0);
                                                } else {
                                                    oq5Var.S();
                                                }
                                                break;
                                            case 1:
                                                aVar.getClass();
                                                oq5 oq5Var2 = (oq5) hq5Var;
                                                if (oq5Var2.P(intValue & 1, (intValue & 17) != 16)) {
                                                    q5g.q((yci) x8lVar.invoke(oq5Var2, 0), oq5Var2, 0);
                                                } else {
                                                    oq5Var2.S();
                                                }
                                                break;
                                            case 2:
                                                aVar.getClass();
                                                oq5 oq5Var3 = (oq5) hq5Var;
                                                if (oq5Var3.P(intValue & 1, (intValue & 17) != 16)) {
                                                    ltg.h((yci) x8lVar.invoke(oq5Var3, 0), oq5Var3, 0);
                                                } else {
                                                    oq5Var3.S();
                                                }
                                                break;
                                            default:
                                                aVar.getClass();
                                                oq5 oq5Var4 = (oq5) hq5Var;
                                                if (oq5Var4.P(intValue & 1, (intValue & 17) != 16)) {
                                                    dag.j((yci) x8lVar.invoke(oq5Var4, 0), oq5Var4, 0);
                                                } else {
                                                    oq5Var4.S();
                                                }
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                }, 110026792, true), 3);
                            } else {
                                if (!(u53Var instanceof t53)) {
                                    b6e.s();
                                    return null;
                                }
                                vuf.Y(vufVar2, null, new wn5(new vtb(27, (t53) u53Var, eqpVar, x8lVar), 1288062367, true), 3);
                            }
                        } else if (z53Var instanceof y53) {
                            y53 y53Var = (y53) z53Var;
                            if (y53Var.equals(v53.a)) {
                                continue;
                            } else if (y53Var.equals(w53.a)) {
                                vuf.Y(vufVar2, null, new wn5(new pyc() { // from class: zpp
                                    @Override // defpackage.pyc
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        int i12 = r2;
                                        a aVar = (a) obj3;
                                        hq5 hq5Var = (hq5) obj4;
                                        int intValue = ((Integer) obj5).intValue();
                                        switch (i12) {
                                            case 0:
                                                aVar.getClass();
                                                oq5 oq5Var = (oq5) hq5Var;
                                                if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                                                    wct.k((yci) x8lVar.invoke(oq5Var, 0), oq5Var, 0);
                                                } else {
                                                    oq5Var.S();
                                                }
                                                break;
                                            case 1:
                                                aVar.getClass();
                                                oq5 oq5Var2 = (oq5) hq5Var;
                                                if (oq5Var2.P(intValue & 1, (intValue & 17) != 16)) {
                                                    q5g.q((yci) x8lVar.invoke(oq5Var2, 0), oq5Var2, 0);
                                                } else {
                                                    oq5Var2.S();
                                                }
                                                break;
                                            case 2:
                                                aVar.getClass();
                                                oq5 oq5Var3 = (oq5) hq5Var;
                                                if (oq5Var3.P(intValue & 1, (intValue & 17) != 16)) {
                                                    ltg.h((yci) x8lVar.invoke(oq5Var3, 0), oq5Var3, 0);
                                                } else {
                                                    oq5Var3.S();
                                                }
                                                break;
                                            default:
                                                aVar.getClass();
                                                oq5 oq5Var4 = (oq5) hq5Var;
                                                if (oq5Var4.P(intValue & 1, (intValue & 17) != 16)) {
                                                    dag.j((yci) x8lVar.invoke(oq5Var4, 0), oq5Var4, 0);
                                                } else {
                                                    oq5Var4.S();
                                                }
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                }, -795975219, true), 3);
                            } else {
                                if (!(y53Var instanceof x53)) {
                                    b6e.s();
                                    return null;
                                }
                                vuf.Y(vufVar2, null, new wn5(new aqp(i5, (x53) y53Var, eqpVar, x8lVar), 714046606, true), 3);
                            }
                        } else if (z53Var instanceof e53) {
                            e53 e53Var = (e53) z53Var;
                            if (e53Var instanceof c53) {
                                vuf.Y(vufVar2, null, new wn5(new pyc() { // from class: zpp
                                    @Override // defpackage.pyc
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        int i12 = i5;
                                        a aVar = (a) obj3;
                                        hq5 hq5Var = (hq5) obj4;
                                        int intValue = ((Integer) obj5).intValue();
                                        switch (i12) {
                                            case 0:
                                                aVar.getClass();
                                                oq5 oq5Var = (oq5) hq5Var;
                                                if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                                                    wct.k((yci) x8lVar.invoke(oq5Var, 0), oq5Var, 0);
                                                } else {
                                                    oq5Var.S();
                                                }
                                                break;
                                            case 1:
                                                aVar.getClass();
                                                oq5 oq5Var2 = (oq5) hq5Var;
                                                if (oq5Var2.P(intValue & 1, (intValue & 17) != 16)) {
                                                    q5g.q((yci) x8lVar.invoke(oq5Var2, 0), oq5Var2, 0);
                                                } else {
                                                    oq5Var2.S();
                                                }
                                                break;
                                            case 2:
                                                aVar.getClass();
                                                oq5 oq5Var3 = (oq5) hq5Var;
                                                if (oq5Var3.P(intValue & 1, (intValue & 17) != 16)) {
                                                    ltg.h((yci) x8lVar.invoke(oq5Var3, 0), oq5Var3, 0);
                                                } else {
                                                    oq5Var3.S();
                                                }
                                                break;
                                            default:
                                                aVar.getClass();
                                                oq5 oq5Var4 = (oq5) hq5Var;
                                                if (oq5Var4.P(intValue & 1, (intValue & 17) != 16)) {
                                                    dag.j((yci) x8lVar.invoke(oq5Var4, 0), oq5Var4, 0);
                                                } else {
                                                    oq5Var4.S();
                                                }
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                }, -224483436, true), 3);
                            } else {
                                if (!(e53Var instanceof d53)) {
                                    b6e.s();
                                    return null;
                                }
                                vuf.Y(vufVar2, null, new wn5(new aqp(i6, (d53) e53Var, eqpVar, x8lVar), -1863654325, true), 3);
                            }
                        } else {
                            if (!(z53Var instanceof i53)) {
                                b6e.s();
                                return null;
                            }
                            i53 i53Var = (i53) z53Var;
                            if (i53Var.equals(g53.a)) {
                                vuf.Y(vufVar2, null, new wn5(new pyc() { // from class: zpp
                                    @Override // defpackage.pyc
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        int i12 = i4;
                                        a aVar = (a) obj3;
                                        hq5 hq5Var = (hq5) obj4;
                                        int intValue = ((Integer) obj5).intValue();
                                        switch (i12) {
                                            case 0:
                                                aVar.getClass();
                                                oq5 oq5Var = (oq5) hq5Var;
                                                if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                                                    wct.k((yci) x8lVar.invoke(oq5Var, 0), oq5Var, 0);
                                                } else {
                                                    oq5Var.S();
                                                }
                                                break;
                                            case 1:
                                                aVar.getClass();
                                                oq5 oq5Var2 = (oq5) hq5Var;
                                                if (oq5Var2.P(intValue & 1, (intValue & 17) != 16)) {
                                                    q5g.q((yci) x8lVar.invoke(oq5Var2, 0), oq5Var2, 0);
                                                } else {
                                                    oq5Var2.S();
                                                }
                                                break;
                                            case 2:
                                                aVar.getClass();
                                                oq5 oq5Var3 = (oq5) hq5Var;
                                                if (oq5Var3.P(intValue & 1, (intValue & 17) != 16)) {
                                                    ltg.h((yci) x8lVar.invoke(oq5Var3, 0), oq5Var3, 0);
                                                } else {
                                                    oq5Var3.S();
                                                }
                                                break;
                                            default:
                                                aVar.getClass();
                                                oq5 oq5Var4 = (oq5) hq5Var;
                                                if (oq5Var4.P(intValue & 1, (intValue & 17) != 16)) {
                                                    dag.j((yci) x8lVar.invoke(oq5Var4, 0), oq5Var4, 0);
                                                } else {
                                                    oq5Var4.S();
                                                }
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                }, 2129507112, true), 3);
                            } else {
                                if (!(i53Var instanceof h53)) {
                                    b6e.s();
                                    return null;
                                }
                                vuf.Y(vufVar2, null, new wn5(new vtb(28, (h53) i53Var, eqpVar, x8lVar), -1214597345, true), 3);
                            }
                        }
                    }
                    i10 = i11;
                }
                return Unit.a;
            case 14:
                String str4 = (String) this.b;
                tqp tqpVar = (tqp) this.c;
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.q(jfpVar, 0);
                wfp.k(jfpVar, str4);
                wfp.s(jfpVar, String.valueOf(tqpVar.a));
                return Unit.a;
            case 15:
                wwp wwpVar = (wwp) this.b;
                Function1 function13 = (Function1) this.c;
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                ywp ywpVar = wwpVar.a;
                xdr xdrVar = ywpVar.k;
                xwp xwpVar = (xwp) ywpVar.l.a.getValue();
                String str5 = xwpVar.a;
                String str6 = xwpVar.b;
                str5.getClass();
                str6.getClass();
                xwp xwpVar2 = new xwp(str5, str6, booleanValue);
                xdrVar.getClass();
                xdrVar.m(null, xwpVar2);
                x3n x3nVar2 = wwpVar.c;
                nmb nmbVar = (nmb) ((jyr) x3nVar2.b).getValue();
                String G = ((fnb) x3nVar2.c).G();
                cvo cvoVar = (cvo) x3nVar2.d;
                wjb wjbVar = cvoVar.a;
                ilb ilbVar = ilb.Fullscreen;
                glb glbVar = glb.Fullscreen;
                avo avoVar = cvoVar.e;
                pkb pkbVar = avoVar.a;
                String str7 = avoVar.b;
                qkb qkbVar = qkb.Carousel;
                String str8 = (String) x3nVar2.a;
                if (str8 == null) {
                    str8 = "None";
                }
                String str9 = str8;
                String a = cvoVar.a();
                pkb pkbVar2 = avoVar.a;
                String str10 = avoVar.b;
                if (booleanValue) {
                    sjb sjbVar = sjb.Ok;
                    str = "enable";
                } else {
                    sjb sjbVar2 = sjb.Ok;
                    str = "disable";
                }
                String str11 = str;
                kmb kmbVar = kmb.Tap;
                nmb.i(nmbVar, G, wjbVar, pkbVar, str7, pkbVar2, str10, 0, "share_subscription", "share_subscription", null, str9, a, str11, 83786784);
                function13.invoke(bool);
                return Unit.a;
            case 16:
                String str12 = (String) this.b;
                fyp fypVar = (fyp) this.c;
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.k(jfpVar2, str12);
                fypVar.getClass();
                if (Intrinsics.d(fypVar, zxp.a)) {
                    str2 = "share_copy_link";
                } else if (Intrinsics.d(fypVar, zxp.b)) {
                    str2 = "share_more";
                } else if (Intrinsics.d(fypVar, dyp.b)) {
                    str2 = "share_whatsapp";
                } else if (Intrinsics.d(fypVar, cyp.b)) {
                    str2 = "share_telegram";
                } else if (Intrinsics.d(fypVar, ayp.b)) {
                    str2 = "share_facebook";
                } else {
                    if (!Intrinsics.d(fypVar, byp.b)) {
                        b6e.s();
                        return null;
                    }
                    str2 = "share_instagram";
                }
                wfp.t(jfpVar2, str2);
                return Unit.a;
            case 17:
                o6e o6eVar = (o6e) this.b;
                sfm sfmVar2 = (sfm) this.c;
                JsonObject jsonObject2 = (JsonObject) obj;
                jsonObject2.getClass();
                int i12 = o6eVar.c;
                jsonObject2.s(Integer.valueOf(i12), "code");
                sfmVar2.getClass();
                jsonObject2.u("codeType", (200 > i12 || i12 >= 300) ? (400 > i12 || i12 >= 500) ? (500 > i12 || i12 >= 600) ? "OTHER" : "5xx" : "4xx" : "2xx");
                jsonObject2.u("requestId", o6eVar.a);
                jsonObject2.s(Integer.valueOf(o6eVar.d), "retryCount");
                return Unit.a;
            case 18:
                uyk uykVar = (uyk) this.b;
                yk3 yk3Var = (yk3) this.c;
                Throwable th = (Throwable) obj;
                th.getClass();
                ssg.a(5, e3q.k, "start(mode=" + uykVar + ") failed", th);
                qld.J(new rln(i2, yk3Var, th));
                return Unit.a;
            case 19:
                Context context = (Context) this.b;
                uhr uhrVar = (uhr) this.c;
                ((l13) obj).getClass();
                return new niq(context, uhrVar);
            case 20:
                Context context2 = (Context) this.b;
                i0j i0jVar = (i0j) this.c;
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                dwh dwhVar = (dwh) l13Var.a.D(hag.I(dwh.class), l13Var, l13Var.b);
                o oVar = ((tcl) l13Var.a.D(hag.I(tcl.class), l13Var, l13Var.b)).b;
                uzn uznVar = (uzn) l13Var.a.D(hag.I(uzn.class), l13Var, l13Var.b);
                oVar.getClass();
                OkHttpClient okHttpClient = i0jVar.b(new evj(pao.a, "StrmTelemetry", (ozw) null, (Function1) null, 53)).a;
                OkHttpClient okHttpClient2 = dwhVar.a;
                xum xumVar = new xum(25, oVar, okHttpClient);
                Context applicationContext = context2.getApplicationContext();
                applicationContext.getClass();
                sar sarVar = new sar();
                xumVar.invoke(sarVar);
                Context applicationContext2 = applicationContext.getApplicationContext();
                applicationContext2.getClass();
                String str13 = sarVar.a;
                if (str13 == null) {
                    str13 = "AndroidPlayer";
                }
                String str14 = str13;
                ArrayList arrayList = sarVar.d;
                vpl vplVar = sarVar.b;
                OkHttpClient okHttpClient3 = sarVar.c;
                if (okHttpClient3 == null) {
                    okHttpClient3 = new OkHttpClient();
                }
                OkHttpClient okHttpClient4 = okHttpClient3;
                String c = new jml(new ujl()).c("MAN");
                Context applicationContext3 = applicationContext2.getApplicationContext();
                tyi tyiVar = new tyi(okHttpClient4, new sld((u7e) null));
                pyi pyiVar = new pyi(okHttpClient2, (pt0) tyiVar.h);
                ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(new lp7(3, Executors.defaultThreadFactory()));
                newCachedThreadPool.getClass();
                c5p c5pVar = new c5p(3);
                rdk rdkVar = rdk.i;
                if (rdkVar == null || (d1Var = rdkVar.A(c)) == null) {
                    d1Var = d1.g;
                }
                d1 d1Var2 = d1Var;
                c5p c5pVar2 = new c5p(3);
                applicationContext3.getClass();
                yar yarVar = new yar(applicationContext3, okHttpClient4, newCachedThreadPool, c, odl.a.getAndIncrement(), c5pVar2, d1Var2, null, str14, arrayList, vplVar);
                cke ckeVar = new cke(applicationContext3);
                bjq bjqVar = new bjq(ckeVar, new ujl());
                ylr ylrVar = new ylr(okHttpClient4, null, n4f.a, ckeVar, new ksa(), null);
                String f2 = ckeVar.b.f();
                if (f2 == null) {
                    f2 = "";
                }
                vsg vsgVar = new vsg(c, f2, str14, d1Var2.a, ckeVar.b().a, ckeVar.b(), ot0.T(s4b.c.a));
                new gos(i2);
                new y9w(i2);
                wqr n = a4g.n();
                dq7 dq7Var = ca8.a;
                tf6 e = gld.e(e.c(n, mn7.d).plus(new b43(rre.f, i)));
                x3n x3nVar3 = new x3n();
                x3nVar3.a = vsgVar;
                x3nVar3.b = c5pVar2;
                x3nVar3.c = ylrVar;
                x3nVar3.d = e;
                nnk nnkVar = new nnk();
                nnkVar.a = x3nVar3;
                nnkVar.b = new yjj();
                tar tarVar = new tar(c, tyiVar, pyiVar, bjqVar, c5pVar, yarVar, newCachedThreadPool, nnkVar);
                nka nkaVar = uznVar.d;
                nkaVar.getClass();
                qdc qdcVar = nkaVar.b;
                mib mibVar = (mib) ((jyr) qdcVar.b).getValue();
                p3i p3iVar = new p3i(450);
                p3iVar.e("allowPreheatWithoutCrossfade", ((Boolean) ((sgl) qdcVar.c).a.a).booleanValue());
                p3iVar.d("sessionId", c);
                LinkedHashMap a2 = p3iVar.a();
                LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(a2.size()));
                for (Map.Entry entry : a2.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ((t3i) entry.getValue()).getValue());
                }
                mibVar.b("PLAYER_STRM_SESSION", linkedHashMap);
                return tarVar;
            case 21:
                pl0 pl0Var = (pl0) this.b;
                ekq ekqVar = (ekq) this.c;
                ((oa8) obj).getClass();
                if (pl0Var != null) {
                    pl0Var.b(ekqVar);
                }
                if (pl0Var != null) {
                    pl0Var.start();
                }
                return new mf0(i3, pl0Var, ekqVar);
            case 22:
                upq upqVar = (upq) this.b;
                spq spqVar = (spq) this.c;
                joj jojVar = (joj) obj;
                jojVar.getClass();
                ArrayList arrayList2 = jojVar.c;
                jojVar.k = upqVar.j;
                if (spqVar != null) {
                    arrayList2.add(new lar(spqVar, upqVar.e, (vpq) upqVar.g.getValue()));
                }
                arrayList2.add(new up3(i3, upqVar.d));
                arrayList2.add(new up3(i6, new kzp(11, upqVar)));
                jojVar.d.add(new up3(i5, fp3.a));
                return Unit.a;
            case 23:
                trq trqVar = (trq) this.b;
                orq orqVar = (orq) this.c;
                SlotView slotView = (SlotView) obj;
                slotView.getClass();
                slotView.a(orqVar).b(new w40(3, trqVar, trq.class, "onInsert", "onInsert(Lcom/lightside/slab/Slab;Landroid/view/View;Lcom/lightside/slab/Slot;)V", 0, 9));
                trqVar.d = null;
                return Unit.a;
            case 24:
                fa0 fa0Var = (fa0) this.b;
                uqn uqnVar = (uqn) this.c;
                fk0 fk0Var = (fk0) obj;
                fa0Var.a(((Number) fk0Var.e()).floatValue() - uqnVar.a);
                uqnVar.a = ((Number) fk0Var.e()).floatValue();
                return Unit.a;
            case 25:
                o oVar2 = (o) this.b;
                OkHttpClient okHttpClient5 = (OkHttpClient) this.c;
                sar sarVar2 = (sar) obj;
                sarVar2.getClass();
                List d = ((byb) oVar2.a.getValue()).d();
                d.getClass();
                List list3 = d;
                ArrayList arrayList3 = new ArrayList(v75.o(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList3.add(StringsKt.n0((String) it.next(), StringUtils.COMMA));
                }
                sarVar2.d = arrayList3;
                sarVar2.a = "AndroidMusic";
                sarVar2.b = new vpl();
                sarVar2.c = okHttpClient5;
                return Unit.a;
            case 26:
                nru nruVar = (nru) this.b;
                sai saiVar2 = (sai) this.c;
                gsu gsuVar = (gsu) obj;
                gsuVar.getClass();
                nruVar.k(gsuVar);
                saiVar2.a();
                return Unit.a;
            case 27:
                pur purVar = (pur) this.b;
                sdr sdrVar2 = (sdr) this.c;
                zco zcoVar = (zco) obj;
                zcoVar.getClass();
                purVar.l(zcoVar, ((Number) sdrVar2.getValue()).floatValue());
                zcoVar.d(2);
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                sdr sdrVar3 = (sdr) this.b;
                sdr sdrVar4 = (sdr) this.c;
                zco zcoVar2 = (zco) obj;
                zcoVar2.getClass();
                zcoVar2.a(((Number) sdrVar3.getValue()).floatValue());
                zcoVar2.k(((Number) sdrVar4.getValue()).floatValue());
                zcoVar2.n(((Number) sdrVar4.getValue()).floatValue());
                return Unit.a;
            default:
                jzr jzrVar = (jzr) this.b;
                izr izrVar = (izr) this.c;
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                jzrVar.b.H(xjoVar, izrVar);
                return Unit.a;
        }
    }

    public /* synthetic */ xum(Object obj, aqi aqiVar, int i) {
        this.a = i;
        this.c = obj;
        this.b = aqiVar;
    }
}
