package defpackage;

import androidx.compose.foundation.lazy.a;
import com.yandex.music.shared.player.download2.InternalDownloadException;
import com.yandex.passport.data.network.l;
import com.yandex.plus.home.api.payment.google.b;
import com.yandex.plus.home.f;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.data.audio.Album$AlbumType;

/* loaded from: classes3.dex */
public final /* synthetic */ class avi implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ avi(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r2v48, types: [cma] */
    /* JADX WARN: Type inference failed for: r2v84 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        vuf vufVar;
        int i = 7;
        int i2 = 20;
        int i3 = 19;
        int i4 = 23;
        int i5 = 24;
        int i6 = 25;
        int i7 = 8;
        cma cmaVar = 0;
        cmaVar = 0;
        final int i8 = 1;
        switch (this.a) {
            case 0:
                final lvi lviVar = (lvi) this.b;
                dvi dviVar = (dvi) this.c;
                vuf vufVar2 = (vuf) obj;
                vufVar2.getClass();
                zab zabVar = lviVar.a;
                zab zabVar2 = lviVar.b;
                List list = zabVar.b;
                if (!list.isEmpty()) {
                    final Object[] objArr = null == true ? 1 : 0;
                    vuf.Y(vufVar2, null, new wn5(new pyc() { // from class: bvi
                        @Override // defpackage.pyc
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i9 = objArr;
                            a aVar = (a) obj2;
                            hq5 hq5Var = (hq5) obj3;
                            int intValue = ((Integer) obj4).intValue();
                            switch (i9) {
                                case 0:
                                    aVar.getClass();
                                    oq5 oq5Var = (oq5) hq5Var;
                                    if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                                        y2x.f(lviVar.a.a, androidx.compose.ui.platform.a.a(vci.a, "my_shelf_recently_played_title"), 0, null, t9b.a(14, 24), oq5Var, 48, 12);
                                    } else {
                                        oq5Var.S();
                                    }
                                    break;
                                default:
                                    aVar.getClass();
                                    oq5 oq5Var2 = (oq5) hq5Var;
                                    if (oq5Var2.P(intValue & 1, (intValue & 17) != 16)) {
                                        y2x.f(lviVar.b.a, androidx.compose.ui.platform.a.a(vci.a, "my_shelf_liked_title"), 0, null, t9b.a(14, 24), oq5Var2, 48, 12);
                                    } else {
                                        oq5Var2.S();
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    }, 70726382, true), 3);
                    List q0 = CollectionsKt.q0(list, 3);
                    vufVar2.Z(q0.size(), null, new zcf(q0, i7), new wn5(new cvi(q0, dviVar, null == true ? 1 : 0), -1091073711, true));
                    if (list.size() >= 3) {
                        vuf.Y(vufVar2, null, new wn5(new gab(11, dviVar, lviVar), 874756147, true), 3);
                    }
                }
                List list2 = zabVar2.b;
                List list3 = list2;
                if (!list3.isEmpty()) {
                    vuf.Y(vufVar2, null, new wn5(new pyc() { // from class: bvi
                        @Override // defpackage.pyc
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i9 = i8;
                            a aVar = (a) obj2;
                            hq5 hq5Var = (hq5) obj3;
                            int intValue = ((Integer) obj4).intValue();
                            switch (i9) {
                                case 0:
                                    aVar.getClass();
                                    oq5 oq5Var = (oq5) hq5Var;
                                    if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                                        y2x.f(lviVar.a.a, androidx.compose.ui.platform.a.a(vci.a, "my_shelf_recently_played_title"), 0, null, t9b.a(14, 24), oq5Var, 48, 12);
                                    } else {
                                        oq5Var.S();
                                    }
                                    break;
                                default:
                                    aVar.getClass();
                                    oq5 oq5Var2 = (oq5) hq5Var;
                                    if (oq5Var2.P(intValue & 1, (intValue & 17) != 16)) {
                                        y2x.f(lviVar.b.a, androidx.compose.ui.platform.a.a(vci.a, "my_shelf_liked_title"), 0, null, t9b.a(14, 24), oq5Var2, 48, 12);
                                    } else {
                                        oq5Var2.S();
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    }, -143118121, true), 3);
                    List q02 = CollectionsKt.q0(list2, 3);
                    vufVar2.Z(q02.size(), null, new zcf(q02, 9), new wn5(new cvi(q02, dviVar, i8), -1091073711, true));
                    if (list3.size() >= 3) {
                        vuf.Y(vufVar2, null, new wn5(new tt5(i4, dviVar), -564627236, true), 3);
                    }
                }
                return Unit.a;
            case 1:
                rar rarVar = (rar) this.b;
                ltm ltmVar = (ltm) this.c;
                rarVar.g(null);
                ((oc4) ltmVar).c((na6) obj);
                return Unit.a;
            case 2:
                a9j a9jVar = (a9j) this.b;
                w8j w8jVar = (w8j) this.c;
                n9b n9bVar = (n9b) obj;
                n9bVar.getClass();
                ubi ubiVar = n9bVar.a;
                if (Intrinsics.d(a9jVar, x8j.a) || Intrinsics.d(a9jVar, y8j.a)) {
                    lg3.A(n9bVar);
                } else {
                    if (!(a9jVar instanceof z8j)) {
                        b6e.s();
                        return null;
                    }
                    z8j z8jVar = (z8j) a9jVar;
                    Album$AlbumType album$AlbumType = z8jVar.b;
                    xv.n(n9bVar, z8jVar.a);
                    List list4 = z8jVar.c;
                    if (list4 != null) {
                        if (list4.isEmpty()) {
                            list4 = null;
                        }
                        if (list4 != null) {
                            ild.e(n9bVar, list4, new kef(1, w8jVar, w8j.class, "onArtistClick", "onArtistClick(Lru/yandex/music/data/domainitem/ArtistDomainItem;)V", 0, 16));
                        }
                    }
                    qld.h(n9bVar, z8jVar.f);
                    String str = z8jVar.d;
                    if (str != null) {
                        lg3.D(n9bVar, 8);
                        xv.l(n9bVar, str, new sui(0, w8jVar, w8j.class, "onDescriptionClick", "onDescriptionClick()V", 0, 12), null, 12);
                    }
                    lg3.D(n9bVar, 16);
                    for (f10 f10Var : z8jVar.e) {
                        if (f10Var == shi.a) {
                            u7g.n(n9bVar, new sui(0, w8jVar, w8j.class, "onShareClick", "onShareClick()V", 0, 16));
                        } else if (f10Var == shi.b) {
                            ubiVar.a(new wn5(new yah(null == true ? 1 : 0, new sui(0, w8jVar, w8j.class, "onMarkAllListenedClick", "onMarkAllListenedClick()V", 0, 17)), 411325892, true));
                        } else if (f10Var == shi.c) {
                            ubiVar.a(new wn5(new yah(i8, new sui(0, w8jVar, w8j.class, "onMarkAllUnlistenedClick", "onMarkAllUnlistenedClick()V", 0, 18)), -1599191022, true));
                        } else if (f10Var == shi.d) {
                            wxf.b(n9bVar, new sui(0, w8jVar, w8j.class, "onPlayNextClick", "onPlayNextClick()V", 0, 19));
                        } else if (f10Var == shi.e) {
                            up6.a(n9bVar, new sui(0, w8jVar, w8j.class, "onAddToQueueClick", "onAddToQueueClick()V", 0, 20));
                        } else if (f10Var == shi.f) {
                            vq1.f(n9bVar, new sui(0, w8jVar, w8j.class, "onDevicePickerClick", "onDevicePickerClick()V", 0, 21));
                        } else if (f10Var == sn.a) {
                            sui suiVar = new sui(0, w8jVar, w8j.class, "onLikeClick", "onLikeClick()V", 0, 22);
                            album$AlbumType.getClass();
                            ubiVar.a(new wn5(new t1b(28, album$AlbumType, suiVar), -234439899, true));
                        } else if (f10Var == sn.b) {
                            sui suiVar2 = new sui(0, w8jVar, w8j.class, "onUnlikeClick", "onUnlikeClick()V", 0, 23);
                            album$AlbumType.getClass();
                            ubiVar.a(new wn5(new t1b(27, album$AlbumType, suiVar2), 726250188, true));
                        } else if (f10Var == sn.d) {
                            ubiVar.a(new wn5(new q2(i2, new sui(0, w8jVar, w8j.class, "onCacheClick", "onCacheClick()V", 0, 24)), 300348364, true));
                        } else if (f10Var == sn.e) {
                            ubiVar.a(new wn5(new q2(i3, new sui(0, w8jVar, w8j.class, "onCancelCacheClick", "onCancelCacheClick()V", 0, 13)), -634751950, true));
                        } else if (f10Var == sn.f) {
                            ubiVar.a(new wn5(new zk(9, new sui(0, w8jVar, w8j.class, "onUncacheClick", "onUncacheClick()V", 0, 14)), 979608211, true));
                        } else {
                            if (f10Var != sn.c) {
                                b6e.s();
                                return null;
                            }
                            sui suiVar3 = new sui(0, w8jVar, w8j.class, "onGoToAlbumClick", "onGoToAlbumClick()V", 0, 15);
                            album$AlbumType.getClass();
                            ubiVar.a(new wn5(new t1b(12, suiVar3, album$AlbumType), -396909717, true));
                        }
                    }
                }
                return Unit.a;
            case 3:
                ArrayList arrayList = (ArrayList) this.b;
                l9j l9jVar = (l9j) this.c;
                vuf vufVar3 = (vuf) obj;
                vufVar3.getClass();
                vufVar3.Z(arrayList.size(), new afg(i7, new d6h(i), arrayList), new vv(arrayList, i6), new wn5(new cl(i4, arrayList, l9jVar), -1091073711, true));
                return Unit.a;
            case 4:
                mq mqVar = (mq) this.b;
                avi aviVar = (avi) this.c;
                hoi hoiVar = (hoi) obj;
                hoiVar.getClass();
                Object obj2 = hoiVar.b;
                if (obj2 != mqVar) {
                    aviVar.invoke(obj2);
                }
                return Unit.a;
            case 5:
                rcj rcjVar = (rcj) this.b;
                ncj ncjVar = (ncj) this.c;
                n9b n9bVar2 = (n9b) obj;
                n9bVar2.getClass();
                if (rcjVar.equals(pcj.a)) {
                    lg3.A(n9bVar2);
                } else {
                    if (!(rcjVar instanceof qcj)) {
                        b6e.s();
                        return null;
                    }
                    qcj qcjVar = (qcj) rcjVar;
                    n9bVar2.a.a(new wn5(new wcj(null == true ? 1 : 0, qcjVar, new m9j(0, ncjVar, ncj.class, "onAlbumClick", "onAlbumClick()V", 0, 8)), -1591654487, true));
                    String str2 = qcjVar.g;
                    if (str2 != null) {
                        xv.l(n9bVar2, str2, new m9j(0, ncjVar, ncj.class, "onDescriptionClick", "onDescriptionClick()V", 0, 9), null, 12);
                    }
                    List list5 = qcjVar.h;
                    if (list5 != null) {
                        ild.e(n9bVar2, list5, new kef(1, ncjVar, ncj.class, "onArtistClick", "onArtistClick(Lru/yandex/music/data/domainitem/ArtistDomainItem;)V", 0, 19));
                    }
                    qld.h(n9bVar2, qcjVar.i);
                    ubb ubbVar = qcjVar.j;
                    if (ubbVar != null) {
                        ltg.f(n9bVar2, ubbVar, 2);
                    }
                    lg3.D(n9bVar2, 24);
                    Iterator it = qcjVar.k.iterator();
                    while (it.hasNext()) {
                        ksw.A(n9bVar2, (sbb) it.next());
                    }
                    lg3.D(n9bVar2, 16);
                    Iterator it2 = qcjVar.l.iterator();
                    while (it2.hasNext()) {
                        ksw.A(n9bVar2, (sbb) it2.next());
                    }
                }
                return Unit.a;
            case 6:
                mdj mdjVar = (mdj) this.b;
                mqs mqsVar = (mqs) this.c;
                String str3 = (String) obj;
                str3.getClass();
                ew4 ew4Var = mdjVar.e;
                String str4 = mqsVar.a;
                int indexOf = mdjVar.b.w.indexOf(mqsVar);
                switch (ew4Var.a) {
                    case 0:
                        str3.getClass();
                        str4.getClass();
                        nmb.z(ew4Var.c, ew4Var.b.G(), wjb.CollectionAudiobooksScreen, null, null, null, null, 0, false, "saved_chapters", "saved_chapters", 0, "track", str4, indexOf + 1, str3, 19708);
                        break;
                    default:
                        str3.getClass();
                        str4.getClass();
                        nmb.z(ew4Var.c, ew4Var.b.G(), wjb.CollectionPodcastScreen, null, null, null, null, 0, false, "saved_episodes", "saved_episodes", 0, "track", str4, indexOf + 1, str3, 19708);
                        break;
                }
                return Unit.a;
            case 7:
                List list6 = (List) this.b;
                aqi aqiVar = (aqi) this.c;
                vuf vufVar4 = (vuf) obj;
                vufVar4.getClass();
                vufVar4.Z(Integer.MAX_VALUE, null, vsf.v, new wn5(new jv(16, list6, aqiVar), -1067872665, true));
                return Unit.a;
            case 8:
                lvf lvfVar = (lvf) this.b;
                wn5 wn5Var = (wn5) this.c;
                vuf vufVar5 = (vuf) obj;
                vufVar5.getClass();
                vufVar5.Z(lvfVar.d(), new u8b(9, lvfVar), new u8b(i7, lvfVar), new wn5(new f4k(lvfVar, wn5Var, null == true ? 1 : 0), -909996743, true));
                vuf.Y(vufVar5, null, new wn5(new sl1(lvfVar, i8), 1318737314, true), 3);
                return Unit.a;
            case 9:
                String str5 = (String) this.b;
                HashSet hashSet = (HashSet) this.c;
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                cko D0 = xjoVar.D0(str5);
                try {
                    Iterator it3 = hashSet.iterator();
                    while (it3.hasNext()) {
                        D0.bindLong(i8, ((Number) it3.next()).intValue());
                        i8++;
                    }
                    D0.q();
                    D0.close();
                    return Unit.a;
                } catch (Throwable th) {
                    D0.close();
                    throw th;
                }
            case 10:
                bok bokVar = (bok) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                xjo xjoVar2 = (xjo) obj;
                xjoVar2.getClass();
                bokVar.b.G(xjoVar2, arrayList2);
                return Unit.a;
            case 11:
                bvk bvkVar = (bvk) this.b;
                fvk fvkVar = (fvk) this.c;
                xjo xjoVar3 = (xjo) obj;
                xjoVar3.getClass();
                bvkVar.b.H(xjoVar3, fvkVar);
                return Unit.a;
            case 12:
                usr usrVar = (usr) this.b;
                z2b z2bVar = (z2b) this.c;
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new ivk((cvk) l13Var.a.D(hag.I(cvk.class), l13Var, l13Var.b), usrVar, z2bVar);
            case 13:
                w1l w1lVar = (w1l) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                xjo xjoVar4 = (xjo) obj;
                xjoVar4.getClass();
                w1lVar.b.G(xjoVar4, arrayList3);
                return Unit.a;
            case 14:
                k5l k5lVar = (k5l) this.b;
                l5l l5lVar = (l5l) this.c;
                xjo xjoVar5 = (xjo) obj;
                xjoVar5.getClass();
                k5lVar.b.H(xjoVar5, l5lVar);
                return Unit.a;
            case 15:
                yke ykeVar = (yke) this.b;
                sdr sdrVar = (sdr) this.c;
                zco zcoVar = (zco) obj;
                zcoVar.getClass();
                fle m = ykeVar.m();
                m.getClass();
                lke lkeVar = (lke) m.b.getValue();
                if (lkeVar != null) {
                    if (!lkeVar.d().contains(m.a)) {
                        lkeVar = null;
                    }
                    if (lkeVar != null) {
                        cmaVar = new cma(((Number) m.d.e()).floatValue() * lkeVar.f());
                    }
                }
                float f = cmaVar != 0 ? cmaVar.a : 0.0f;
                zcoVar.c(Float.compare(f, (float) 0) > 0);
                zcoVar.r(ugo.c(f, f));
                zcoVar.a(1 - (((Number) sdrVar.getValue()).floatValue() / 0.5f));
                return Unit.a;
            case 16:
                xjl xjlVar = (xjl) this.b;
                kxi kxiVar = (kxi) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                lkl lklVar = (lkl) xjlVar.b.getValue();
                bdt I = hag.I(uil.class);
                qdc qdcVar = lklVar.a;
                qdcVar.getClass();
                uil uilVar = (uil) qdcVar.C(I);
                fnb fnbVar = kxiVar.a;
                gs4 gs4Var = uilVar.a;
                fnbVar.getClass();
                pkl pklVar = booleanValue ? new pkl(hlb.Fullscreen, glb.Fullscreen) : new pkl(hlb.Miniplayer, glb.Bottom);
                okb okbVar = (okb) gs4Var.c;
                return new xil(okbVar, fnbVar, new xdh(okbVar, (wil) ((jyr) gs4Var.d).getValue(), (vil) ((jyr) gs4Var.e).getValue()), pklVar);
            case 17:
                jvl jvlVar = (jvl) this.b;
                sai saiVar = (sai) this.c;
                String str6 = (String) obj;
                str6.getClass();
                jvlVar.getClass();
                str6.getClass();
                kvl kvlVar = jvlVar.a;
                thj thjVar = new thj(pkb.Shortcut, str6, 1, 1, "");
                kvlVar.getClass();
                x97.y(ot0.F(kvlVar), null, null, new ckg(kvlVar, thjVar, (Continuation) cmaVar, 15), 3);
                saiVar.a();
                return Unit.a;
            case 18:
                ArrayList arrayList4 = (ArrayList) this.b;
                eha ehaVar = (eha) this.c;
                vuf vufVar6 = (vuf) obj;
                vufVar6.getClass();
                vufVar6.Z(arrayList4.size(), new afg(17, new d6h(15), arrayList4), new vv(arrayList4, 28), new wn5(new cl(i5, arrayList4, ehaVar), -1091073711, true));
                return Unit.a;
            case 19:
                Function0 function0 = (Function0) this.b;
                ksk kskVar = (ksk) this.c;
                jsk jskVar = (jsk) obj;
                jskVar.getClass();
                if (((Boolean) function0.invoke()).booleanValue()) {
                    jskVar.d(kskVar, 0, 0, 0.0f);
                }
                return Unit.a;
            case 20:
                q1m q1mVar = (q1m) this.b;
                List list7 = (List) this.c;
                xjo xjoVar6 = (xjo) obj;
                xjoVar6.getClass();
                q1mVar.b.G(xjoVar6, list7);
                return Unit.a;
            case 21:
                r4m r4mVar = (r4m) this.b;
                ytl ytlVar = (ytl) this.c;
                xjo xjoVar7 = (xjo) obj;
                xjoVar7.getClass();
                return Long.valueOf(r4mVar.b.I(xjoVar7, ytlVar));
            case 22:
                l13 l13Var2 = (l13) this.b;
                u7m u7mVar = (u7m) this.c;
                f fVar = (f) obj;
                fVar.getClass();
                bdt I2 = hag.I(w7m.class);
                qdc qdcVar2 = l13Var2.a;
                Set set = l13Var2.b;
                fVar.b = ((w7m) qdcVar2.D(I2, l13Var2, set)).a.a.c();
                fVar.c = 10000;
                fVar.a = "music";
                fVar.e = asq.K(u7mVar.b.e(), new k7m(i));
                fVar.f = new a6m(u7mVar, 2);
                fVar.g = b.a;
                fVar.d = new l((j9m) l13Var2.a.D(hag.I(j9m.class), l13Var2, set));
                return Unit.a;
            case 23:
                nam namVar = (nam) this.b;
                mam mamVar = (mam) this.c;
                vuf vufVar7 = (vuf) obj;
                vufVar7.getClass();
                ArrayList arrayList5 = namVar.b;
                if (!arrayList5.isEmpty()) {
                    c9g.e(vufVar7, arrayList5, R.string.collection_selected_episodes_title, androidx.compose.foundation.layout.a.c(0.0f, 8, 0.0f, 4, 5), mamVar.j, new ayl(0, mamVar, mam.class, "onViewAllEpisodesClick", "onViewAllEpisodesClick()V", 0, 20));
                }
                ArrayList arrayList6 = namVar.a;
                if (arrayList6.isEmpty()) {
                    vufVar = vufVar7;
                } else {
                    int i9 = 0;
                    int i10 = 1;
                    vufVar = vufVar7;
                    cb0.c(vufVar, arrayList6, R.string.collection_podcasts_your_subscriptions, androidx.compose.foundation.layout.a.c(0.0f, 32, 0.0f, 8, 5), new bml(i10, mamVar, mam.class, "onPodcastClick", "onPodcastClick(Lru/yandex/music/data/audio/Album;)V", i9, 7), new bml(i10, mamVar, mam.class, "onPodcastLongClick", "onPodcastLongClick(Lru/yandex/music/data/audio/Album;)V", i9, 8), new ayl(0, mamVar, mam.class, "onViewAllPostponedPodcastsClick", "onViewAllPostponedPodcastsClick()V", i9, 21));
                }
                vuf.Y(vufVar, null, xee.e, 3);
                return Unit.a;
            case 24:
                rmb rmbVar = (rmb) this.b;
                rbm rbmVar = (rbm) this.c;
                mq mqVar2 = (mq) obj;
                mqVar2.getClass();
                fcc v = c3x.v(mqVar2);
                rmb.a(rmbVar, sjb.SelectFilter, null, v, 6);
                xdr xdrVar = rbmVar.f;
                mxs mxsVar = new mxs(mqVar2, v, rbmVar.d.a);
                xdrVar.getClass();
                xdrVar.m(null, mxsVar);
                gcm gcmVar = rbmVar.b;
                gcmVar.getClass();
                x97.y(ot0.F(gcmVar), null, null, new b5l(gcmVar, mqVar2, (Continuation) cmaVar, i4), 3);
                return Unit.a;
            case 25:
                List list8 = (List) this.b;
                sem semVar = (sem) this.c;
                vuf vufVar8 = (vuf) obj;
                vufVar8.getClass();
                vufVar8.Z(list8.size(), new afg(i2, new d6h(i3), list8), new zcf(list8, 14), new wn5(new cl(i6, list8, semVar), -1091073711, true));
                return Unit.a;
            case 26:
                fam famVar = (fam) this.b;
                fam famVar2 = (fam) this.c;
                InternalDownloadException internalDownloadException = (InternalDownloadException) obj;
                internalDownloadException.getClass();
                if ((internalDownloadException instanceof ats) || (internalDownloadException instanceof tte) || (internalDownloadException instanceof qte) || (internalDownloadException instanceof rte) || (internalDownloadException instanceof vte)) {
                    return zao.b;
                }
                if ((internalDownloadException instanceof wte) || (internalDownloadException instanceof aue) || (internalDownloadException instanceof eue) || (internalDownloadException instanceof yte) || (internalDownloadException instanceof cue)) {
                    return new kbo(Long.MAX_VALUE, new abo(10000L, new fam(i5)));
                }
                if (internalDownloadException instanceof ute) {
                    return new dbo();
                }
                if (internalDownloadException instanceof pte) {
                    return (lbo) famVar.invoke(internalDownloadException);
                }
                if (internalDownloadException instanceof xte) {
                    return (lbo) famVar2.invoke(internalDownloadException);
                }
                if (internalDownloadException instanceof due) {
                    return new kbo(Long.MAX_VALUE, new abo(2000L, new fam(i6)));
                }
                b6e.s();
                return null;
            case 27:
                zkm zkmVar = (zkm) this.b;
                alm almVar = (alm) this.c;
                xjo xjoVar8 = (xjo) obj;
                xjoVar8.getClass();
                zkmVar.b.H(xjoVar8, almVar);
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                flm flmVar = (flm) this.b;
                wkm wkmVar = (wkm) this.c;
                xjo xjoVar9 = (xjo) obj;
                xjoVar9.getClass();
                flmVar.b.H(xjoVar9, wkmVar);
                return Unit.a;
            default:
                xlm xlmVar = (xlm) this.b;
                wlm wlmVar = (wlm) this.c;
                xjo xjoVar10 = (xjo) obj;
                xjoVar10.getClass();
                xlmVar.b.H(xjoVar10, wlmVar);
                return Unit.a;
        }
    }
}
