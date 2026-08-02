package defpackage;

import android.content.Context;
import com.connectsdk.service.airplay.PListParser;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.yandex.media.ynison.service.f;
import com.yandex.media.ynison.service.x;
import com.yandex.music.databases.main.MainDatabase;
import com.yandex.music.shared.dto.track.TrackDto;
import com.yandex.music.shared.recognition.data.network.Directive;
import com.yandex.music.shared.recognition.data.network.DirectiveHeader;
import com.yandex.music.shared.recognition.data.network.DirectivePayload;
import com.yandex.music.shared.recognition.data.network.MatchDirective;
import com.yandex.music.shared.recognition.data.network.RecognitionPayloadResult;
import com.yandex.pulse.metrics.o;
import defpackage.hmm;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class dae implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dae(Function0 function0, aqi aqiVar) {
        this.a = 23;
        this.c = function0;
        this.b = aqiVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list;
        q7g q7gVar;
        TrackDto match;
        Boolean musicDetected;
        DirectiveHeader header;
        int i = 21;
        int i2 = 6;
        int i3 = 22;
        int i4 = 7;
        int i5 = 2;
        int i6 = 16;
        int i7 = 10;
        int i8 = 15;
        int i9 = 17;
        int i10 = 5;
        boolean z = false;
        z = false;
        sni sniVar = null;
        switch (this.a) {
            case 0:
                w4k w4kVar = (w4k) this.b;
                Function0 function0 = (Function0) this.c;
                opf opfVar = (opf) obj;
                opfVar.getClass();
                w4k.h(w4kVar, opfVar, opfVar.a.e(), new d43(((d85) function0.invoke()).a, 5), 2);
                return Unit.a;
            case 1:
                fle fleVar = (fle) this.b;
                jx7 jx7Var = (jx7) this.c;
                jx7 jx7Var2 = (jx7) obj;
                jx7Var2.getClass();
                return Integer.valueOf(jx7Var2.L(fleVar.a(jx7Var)));
            case 2:
                x0f x0fVar = (x0f) this.b;
                Object obj2 = this.c;
                lpi lpiVar = (lpi) obj;
                lpiVar.getClass();
                hmm.a aVar = x0fVar.a;
                d1f d1fVar = x0fVar.e;
                String str = (String) lpiVar.a(aVar);
                if (str == null || (list = d1fVar.a(str, x0fVar.b)) == null) {
                    list = c5b.a;
                }
                if (list.contains(obj2)) {
                    return Unit.a;
                }
                LinkedHashSet z0 = CollectionsKt.z0(list);
                z0.add(obj2);
                String j = ((Gson) d1fVar.a.getValue()).j(z0);
                if (j == null) {
                    j = "[]";
                }
                lpiVar.g(aVar, j);
                return Unit.a;
            case 3:
                uaf uafVar = (uaf) this.b;
                Type type = (Type) this.c;
                obj.getClass();
                w4i w4iVar = uafVar.b;
                type.getClass();
                return (String) w4iVar.invoke(type, obj);
            case 4:
                List list2 = (List) this.b;
                bdf bdfVar = (bdf) this.c;
                vuf vufVar = (vuf) obj;
                vufVar.getClass();
                vufVar.Z(list2.size(), new sea(16, new rea(i), list2), new bl(29, list2, z), new wn5(new cl(i8, list2, bdfVar), -1091073711, true));
                return Unit.a;
            case 5:
                List list3 = (List) this.b;
                cdf cdfVar = (cdf) this.c;
                vuf vufVar2 = (vuf) obj;
                vufVar2.getClass();
                vufVar2.Z(list3.size(), new sea(17, new rea(i3), list3), new zcf(list3, z ? 1 : 0), new wn5(new cl(16, list3, cdfVar), -1091073711, true));
                return Unit.a;
            case 6:
                ArrayList arrayList = (ArrayList) this.b;
                zef zefVar = (zef) this.c;
                vuf vufVar3 = (vuf) obj;
                vufVar3.getClass();
                vufVar3.Z(arrayList.size(), new sea(18, new rea(23), arrayList), new vv(arrayList, i8), new wn5(new cl(17, arrayList, zefVar), -1091073711, true));
                return Unit.a;
            case 7:
                ArrayList arrayList2 = (ArrayList) this.b;
                aff affVar = (aff) this.c;
                vuf vufVar4 = (vuf) obj;
                vufVar4.getClass();
                vufVar4.Z(arrayList2.size(), new sea(19, new rea(24), arrayList2), new vv(arrayList2, i6), new wn5(new cl(18, arrayList2, affVar), -1091073711, true));
                return Unit.a;
            case 8:
                ArrayList arrayList3 = (ArrayList) this.b;
                zgf zgfVar = (zgf) this.c;
                vuf vufVar5 = (vuf) obj;
                vufVar5.getClass();
                vufVar5.Z(arrayList3.size(), new sea(20, new s3f(i8), arrayList3), new vv(arrayList3, i9), new wn5(new t50(arrayList3, (Object) zgfVar, (Object) arrayList3, i7), -632812321, true));
                return Unit.a;
            case 9:
                zgf zgfVar2 = (zgf) this.b;
                mqs mqsVar = (mqs) this.c;
                String str2 = (String) obj;
                str2.getClass();
                pgf pgfVar = zgfVar2.e;
                String str3 = mqsVar.a;
                str3.getClass();
                nmb.z(pgfVar.b, pgfVar.a.G(), wjb.KidsTrackListScreen, null, null, null, null, 0, false, "songs_and_episodes", "songs_and_episodes", 0, "track", str3, 0, str2, 52476);
                return Unit.a;
            case 10:
                mm6 mm6Var = (mm6) this.b;
                fvf fvfVar = (fvf) this.c;
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                t1b t1bVar = new t1b(24, mm6Var, fvfVar);
                s9f[] s9fVarArr = wfp.a;
                jfpVar.o(hfp.d, new sa(null, t1bVar));
                return Unit.a;
            case 11:
                q4g q4gVar = (q4g) this.b;
                uwl uwlVar = (uwl) this.c;
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                q4gVar.d.H(xjoVar, uwlVar);
                return Unit.a;
            case 12:
                q4g q4gVar2 = (q4g) this.b;
                ew ewVar = (ew) this.c;
                xjo xjoVar2 = (xjo) obj;
                xjoVar2.getClass();
                q4gVar2.b.H(xjoVar2, ewVar);
                return Unit.a;
            case 13:
                q4g q4gVar3 = (q4g) this.b;
                h5u h5uVar = (h5u) this.c;
                xjo xjoVar3 = (xjo) obj;
                xjoVar3.getClass();
                q4gVar3.e.H(xjoVar3, h5uVar);
                return Unit.a;
            case 14:
                q4g q4gVar4 = (q4g) this.b;
                re1 re1Var = (re1) this.c;
                xjo xjoVar4 = (xjo) obj;
                xjoVar4.getClass();
                q4gVar4.c.H(xjoVar4, re1Var);
                return Unit.a;
            case 15:
                x2f x2fVar = (x2f) this.b;
                xop xopVar = x2fVar.b;
                ou7 ou7Var = (ou7) this.c;
                Throwable th = (Throwable) obj;
                if (th == null) {
                    xopVar.l(ou7Var.C());
                } else if (th instanceof CancellationException) {
                    xopVar.l(new iu3((CancellationException) th));
                } else if (xopVar.m(th)) {
                    x2fVar.c = true;
                }
                return Unit.a;
            case 16:
                mqs mqsVar2 = (mqs) this.b;
                j1h j1hVar = (j1h) this.c;
                ((is6) obj).getClass();
                o8q o8qVar = (o8q) j1hVar.d.getValue();
                int i11 = j1hVar.e;
                mqsVar2.getClass();
                o8qVar.getClass();
                return new y1h(new l1h(mqsVar2.a, mqsVar2.c, Long.valueOf(mqsVar2.e), zwf.a0(mqsVar2, o8qVar, i11), mqsVar2.e, mqsVar2.i()), j1hVar);
            case 17:
                oc7 oc7Var = (oc7) this.b;
                final h5h h5hVar = (h5h) this.c;
                final String str4 = (String) obj;
                str4.getClass();
                bdt I = hag.I(Context.class);
                qdc qdcVar = oc7Var.a;
                qdcVar.getClass();
                Context context = (Context) qdcVar.C(I);
                bdt I2 = hag.I(p5c.class);
                qdc qdcVar2 = oc7Var.a;
                qdcVar2.getClass();
                final p5c p5cVar = (p5c) qdcVar2.C(I2);
                bdt I3 = hag.I(l9w.class);
                qdc qdcVar3 = oc7Var.a;
                qdcVar3.getClass();
                final l9w l9wVar = (l9w) qdcVar3.C(I3);
                bdt I4 = hag.I(usr.class);
                qdc qdcVar4 = oc7Var.a;
                qdcVar4.getClass();
                usr usrVar = (usr) qdcVar4.C(I4);
                bdt I5 = hag.I(z2b.class);
                qdc qdcVar5 = oc7Var.a;
                qdcVar5.getClass();
                z2b z2bVar = (z2b) qdcVar5.C(I5);
                bdt I6 = hag.I(p4h.class);
                qdc qdcVar6 = oc7Var.a;
                qdcVar6.getClass();
                final p4h p4hVar = (p4h) qdcVar6.C(I6);
                final xdh xdhVar = new xdh(0);
                bdt I7 = hag.I(o9w.class);
                qdc qdcVar7 = oc7Var.a;
                qdcVar7.getClass();
                o9w o9wVar = (o9w) qdcVar7.C(I7);
                bdt I8 = hag.I(e1n.class);
                qdc qdcVar8 = oc7Var.a;
                qdcVar8.getClass();
                final e1n e1nVar = (e1n) qdcVar8.C(I8);
                final jyr b = btf.b(new opg(18, o9wVar));
                seo M = bzf.M(MainDatabase.class, context, str4.equals(CommonUrlParts.Values.FALSE_INTEGER) ? null : "ymusic.sqlite_".concat(str4), usrVar, z2bVar, new e9r() { // from class: z4h
                    @Override // defpackage.e9r
                    public final vsr a(anx anxVar) {
                        String str5 = str4;
                        str5.getClass();
                        return new a5h(anxVar.B(new e5h((xxq) x97.D(g.a, new zig(h5h.this, str5, null, 7)), (Context) anxVar.b, p5cVar, l9wVar, p4hVar, (ssr) anxVar.c)), e1nVar, b, xdhVar);
                    }
                });
                M.a(g5h.d, g5h.e, g5h.f, g5h.g, g5h.h, g5h.i, g5h.j, g5h.k, g5h.l, g5h.m, g5h.n, g5h.o, g5h.p, g5h.q, g5h.r, g5h.s, g5h.t, g5h.u);
                MainDatabase mainDatabase = (MainDatabase) M.b();
                bdt I9 = hag.I(p4h.class);
                qdc qdcVar9 = oc7Var.a;
                qdcVar9.getClass();
                ydh a = ((p4h) qdcVar9.C(I9)).a(str4);
                mainDatabase.n.set(a);
                synchronized (xdhVar.c) {
                    xdhVar.d = a;
                }
                return mainDatabase;
            case 18:
                gvb gvbVar = (gvb) this.b;
                sdr sdrVar = (sdr) this.c;
                zco zcoVar = (zco) obj;
                zcoVar.getClass();
                float f = ivb.a;
                gvbVar.getClass();
                if (!(gvbVar instanceof fvb)) {
                    zcoVar.k(((Number) sdrVar.getValue()).floatValue());
                    zcoVar.n(((Number) sdrVar.getValue()).floatValue());
                }
                return Unit.a;
            case 19:
                t9f t9fVar = (t9f) this.b;
                t9f t9fVar2 = (t9f) this.c;
                mm4 mm4Var = (mm4) obj;
                mm4Var.getClass();
                mm4.a(mm4Var, PListParser.TAG_KEY, t9fVar.getDescriptor());
                mm4.a(mm4Var, Constants.KEY_VALUE, t9fVar2.getDescriptor());
                return Unit.a;
            case 20:
                ksk kskVar = (ksk) this.b;
                nbh nbhVar = (nbh) this.c;
                jsk jskVar = (jsk) obj;
                jskVar.getClass();
                jsk.l(jskVar, kskVar, eeh.b(nbhVar.S0() * (-((Number) nbhVar.r.e()).floatValue())), 0, null, 12);
                return Unit.a;
            case 21:
                j6i j6iVar = (j6i) this.b;
                List list4 = (List) this.c;
                u51 u51Var = (u51) obj;
                u51Var.getClass();
                jtc jtcVar = (jtc) j6iVar.b.p.c;
                int indexOf = list4.indexOf(u51Var);
                String str5 = (String) jtcVar.b;
                if (str5 != null) {
                    sfm sfmVar = (sfm) jtcVar.a;
                    nmb nmbVar = (nmb) sfmVar.b;
                    wjb wjbVar = wjb.ArtistScreen;
                    String str6 = u51Var.a;
                    String G = ((fnb) sfmVar.a).G();
                    wjb wjbVar2 = wjb.BottomsheetScreen;
                    qkb qkbVar = qkb.Carousel;
                    nmbVar.n(wjbVar2, wjbVar, G, wjbVar2, (r60 & 16) != 0 ? ilb.Fullscreen : null, (r60 & 32) != 0 ? glb.Fullscreen : null, (r60 & 64) != 0 ? "" : null, (r60 & 128) != 0 ? pkb.NonApplicable : null, (r60 & 256) != 0 ? "" : null, pkb.Artist, str6, (r60 & 2048) != 0 ? 0 : 1, (r60 & 4096) != 0 ? 0 : indexOf + 1, (r60 & RemoteCameraConfig.Notification.ID) != 0 ? "" : "top", (r60 & 16384) != 0 ? 0 : 1, (32768 & r60) != 0 ? false : true, "search_best_results", "SEARCH_BEST_RESULTS", 1, (524288 & r60) != 0 ? 1 : 0, (1048576 & r60) != 0 ? 0 : 1, (2097152 & r60) != 0 ? "" : "search_request:".concat(str5), (4194304 & r60) != 0 ? "" : null, (8388608 & r60) != 0 ? "" : null, (16777216 & r60) != 0 ? 0 : 0, "", "", "", (r60 & 268435456) != 0 ? "" : "");
                }
                return Unit.a;
            case 22:
                List list5 = (List) this.b;
                w8i w8iVar = (w8i) this.c;
                bsf bsfVar = (bsf) obj;
                bsfVar.getClass();
                bsfVar.Y(list5.size(), null, new zcf(list5, i10), new wn5(new cl(20, list5, w8iVar), 699646206, true));
                return Unit.a;
            case 23:
                Function0 function02 = (Function0) this.c;
                aqi aqiVar = (aqi) this.b;
                ((oa8) obj).getClass();
                return new mf0(8, function02, aqiVar);
            case 24:
                HashMap hashMap = (HashMap) this.b;
                x xVar = (x) this.c;
                f fVar = (f) obj;
                fVar.getClass();
                fhl l = xVar.C().l();
                l.getClass();
                kiw kiwVar = liw.a;
                int ordinal = fVar.u().ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        String t = fVar.t();
                        t.getClass();
                        kiwVar = q5g.G(t, fVar.p().g());
                    } else if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal == 4) {
                                String t2 = fVar.t();
                                t2.getClass();
                                kiwVar = new miw(t2);
                            } else if (ordinal != 5) {
                                b6e.s();
                                return null;
                            }
                        } else if (mgg.a[l.ordinal()] == 1) {
                            String t3 = fVar.t();
                            t3.getClass();
                            kiwVar = new jiw(t3);
                        }
                    }
                }
                Object obj3 = hashMap.get(kiwVar);
                Object obj4 = obj3;
                if (obj3 == null) {
                    obj4 = new wwk(kiwVar, 0);
                }
                wwk wwkVar = (wwk) obj4;
                wwk wwkVar2 = new wwk(wwkVar.a, wwkVar.b + 1);
                hashMap.put(kiwVar, wwkVar2);
                return new t9n(wwkVar2, fVar);
            case 25:
                mfh mfhVar = (mfh) this.b;
                ksk kskVar2 = (ksk) this.c;
                jsk jskVar2 = (jsk) obj;
                jskVar2.getClass();
                if (mfhVar.getLayoutDirection() == xof.b) {
                    jsk.l(jskVar2, kskVar2, 0, 0, new p1i(i8), 4);
                } else {
                    jskVar2.d(kskVar2, 0, 0, 0.0f);
                }
                return Unit.a;
            case 26:
                sdr sdrVar2 = (sdr) this.b;
                kii kiiVar = (kii) this.c;
                vuf vufVar6 = (vuf) obj;
                int i12 = kii.p;
                vufVar6.getClass();
                List list6 = (List) sdrVar2.getValue();
                vufVar6.Z(list6.size(), new afg(i10, new d6h(i5), list6), new zcf(list6, i2), new wn5(new cl(i, list6, kiiVar), -1091073711, true));
                return Unit.a;
            case 27:
                xli xliVar = (xli) this.b;
                eli eliVar = (eli) this.c;
                String str7 = (String) obj;
                str7.getClass();
                ime imeVar = xliVar.a.s;
                imeVar.getClass();
                eliVar.getClass();
                v70 U = ot0.U((zii) eliVar.b().c, eliVar.a());
                l80 X = ot0.X(eliVar.b());
                nmb nmbVar2 = (nmb) imeVar.d;
                pkb a0 = ime.a0(m80.f);
                String str8 = X.b;
                int i13 = X.c;
                String G2 = ((fnb) imeVar.b).G();
                wjb wjbVar3 = wjb.MusicHistoryScreen;
                w70 w70Var = U.c;
                nmb.s(nmbVar2, G2, wjbVar3, null, null, null, a0, str8, 1, i13, w70Var.a.b(), w70Var.b, false, U.a.a, U.b, w70Var.c, 0, null, null, null, 0, str7, 24911996);
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                lni lniVar = (lni) this.b;
                i50 i50Var = (i50) this.c;
                String str9 = (String) obj;
                str9.getClass();
                uni uniVar = rni.a;
                g8c g8cVar = lniVar.a;
                q7g q7gVar2 = pni.f;
                try {
                    MatchDirective matchDirective = (MatchDirective) ((Gson) g8cVar.a).d(str9, MatchDirective.class);
                    Directive directive = matchDirective.getDirective();
                    String name = (directive == null || (header = directive.getHeader()) == null) ? null : header.getName();
                    if (Intrinsics.d(name, "classifying")) {
                        DirectivePayload payload = matchDirective.getDirective().getPayload();
                        if (payload != null && (musicDetected = payload.getMusicDetected()) != null) {
                            z = musicDetected.booleanValue();
                        }
                        q7gVar = new mni(z);
                    } else if (Intrinsics.d(name, "recognition")) {
                        DirectivePayload payload2 = matchDirective.getDirective().getPayload();
                        RecognitionPayloadResult result = payload2 != null ? payload2.getResult() : null;
                        mqs a2 = (result == null || (match = result.getMatch()) == null) ? null : wts.a(match);
                        if (a2 != null) {
                            if (a2.f.isEmpty()) {
                                a2 = mqs.e(a2, 0L, t75.c(zp2.k), null, null, null, -33);
                            }
                            q7gVar = new oni(a2);
                        } else {
                            q7gVar = nni.f;
                        }
                    } else {
                        q7gVar = q7gVar2;
                    }
                } catch (JsonParseException | IOException | IllegalStateException unused) {
                    q7gVar = null;
                }
                if (q7gVar != null) {
                    q7gVar2 = q7gVar;
                }
                if (q7gVar2 instanceof mni) {
                    if (((mni) q7gVar2).f) {
                        ssg.a(3, "MusicMatchRecognitionService", "music detected", null);
                    } else {
                        ssg.a(3, "MusicMatchRecognitionService", "no music", null);
                        sniVar = sni.a;
                    }
                    uniVar = sniVar;
                } else if (q7gVar2 instanceof oni) {
                    mqs mqsVar3 = ((oni) q7gVar2).f;
                    ssg.a(3, "MusicMatchRecognitionService", "track: " + mqsVar3.c + " by " + mqsVar3.f, null);
                    uniVar = new tni(mqsVar3);
                } else if (q7gVar2 instanceof nni) {
                    ssg.a(3, "MusicMatchRecognitionService", "no matches", null);
                } else {
                    if (!(q7gVar2 instanceof pni)) {
                        b6e.s();
                        return null;
                    }
                    ssg.a(3, "MusicMatchRecognitionService", "unknown", null);
                }
                if (uniVar != null) {
                    lniVar.a(uniVar, i50Var);
                }
                return Unit.a;
            default:
                zab zabVar = (zab) this.b;
                vti vtiVar = (vti) this.c;
                vuf vufVar7 = (vuf) obj;
                vufVar7.getClass();
                List list7 = zabVar.b;
                vufVar7.Z(list7.size(), null, new zcf(list7, i4), new wn5(new cl(i3, list7, vtiVar), -1091073711, true));
                return Unit.a;
        }
    }

    public /* synthetic */ dae(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
