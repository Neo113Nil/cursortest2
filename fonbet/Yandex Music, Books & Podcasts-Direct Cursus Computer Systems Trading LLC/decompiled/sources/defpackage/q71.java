package defpackage;

import androidx.fragment.app.t;
import androidx.fragment.app.y;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.c;
import ru.yandex.music.common.media.context.e;

/* loaded from: classes3.dex */
public final class q71 extends m18 {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public q71(kf1 kf1Var, s71 s71Var, int i, ArrayList arrayList) {
        this.d = kf1Var;
        this.e = s71Var;
        this.c = i;
        this.f = arrayList;
    }

    @Override // defpackage.ag5
    public final void b(mqs mqsVar) {
        int i = this.b;
        Object obj = this.e;
        switch (i) {
            case 0:
                mqsVar.getClass();
                s71 s71Var = (s71) obj;
                xzi xziVar = s71Var.i().l;
                fkn fknVar = s71Var.h;
                ki1 K = q6k.K(((v71) fknVar.a.getValue()).c().a);
                int b = ((v71) fknVar.a.getValue()).b();
                int r = q6k.r((v71) fknVar.a.getValue());
                boolean z = ((v71) fknVar.a.getValue()).c().a == s71Var.a;
                li1[] li1VarArr = li1.a;
                xziVar.getClass();
                osh oshVar = (osh) xziVar.a;
                oshVar.getClass();
                nmb nmbVar = (nmb) oshVar.c;
                String G = ((fnb) oshVar.b).G();
                String str = (String) oshVar.a;
                alb a = K.a();
                blb[] blbVarArr = blb.a;
                nmbVar.getClass();
                str.getClass();
                G.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("artist_id", str);
                linkedHashMap.put("hash", G);
                linkedHashMap.put("page_id", "main_screen");
                linkedHashMap.put("page_type", "landing");
                linkedHashMap.put("entity_type", "artist_familiar_tracks");
                eta.m(1, "entity_id", str, "entity_pos_x", linkedHashMap);
                ouj.y(1, linkedHashMap, "entity_pos_y", r, "objects_count");
                linkedHashMap.put("filter_key", "artist");
                eta.m(1, "filter_value", str, "filter_pos", linkedHashMap);
                eta.m(b + 1, "tab_id", a.a, "tab_pos", linkedHashMap);
                linkedHashMap.put("is_tab_selected_by_default", String.valueOf(z));
                linkedHashMap.put("from", "familiar_screen");
                dfi.p(1, "to", "track_actions_screen", "_meta", linkedHashMap);
                nmbVar.C("Familiar.Tracks.Navigated", linkedHashMap);
                w61 w61Var = s71Var.d;
                kf1 kf1Var = (kf1) this.d;
                u51 u51Var = s71Var.b;
                w61Var.getClass();
                u51Var.getClass();
                PlaybackScope a2 = w61Var.a(kf1Var);
                ((e) w61Var.e.getValue()).getClass();
                c e = a2.e(u51Var);
                zus zusVar = new zus(this.c);
                b6v t0 = y5g.t0(u51Var, k3q.a);
                ve veVar = new ve(muo.ARTIST, zqt.d);
                t tVar = w61Var.a;
                y yVar = w61Var.b;
                kxi kxiVar = w61Var.d;
                PlaybackScope playbackScope = e.a;
                playbackScope.getClass();
                rre.Z(mqsVar, zusVar, t0, veVar, tVar, yVar, kxiVar, playbackScope, null, null, null, 1792);
                break;
            default:
                mqsVar.getClass();
                ((Function1) obj).invoke(mqsVar);
                break;
        }
    }

    @Override // defpackage.ag5
    public void c(mqs mqsVar) {
        switch (this.b) {
            case 1:
                mqsVar.getClass();
                ((Function1) this.f).invoke(mqsVar);
                break;
            default:
                super.c(mqsVar);
                break;
        }
    }

    @Override // defpackage.ag5
    public final void d(final mqs mqsVar) {
        String str;
        k3q k3qVar;
        switch (this.b) {
            case 0:
                s71 s71Var = (s71) this.e;
                kf1 kf1Var = (kf1) this.d;
                mqsVar.getClass();
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                if (!((k94) ((byb) qdcVar.C(I)).c(ern.a(k94.class))).h()) {
                    final w61 w61Var = s71Var.d;
                    final int i = this.c;
                    final ArrayList arrayList = (ArrayList) this.f;
                    final v50 v50Var = new v50(s71Var, mqsVar, i, 1);
                    w61Var.getClass();
                    PlaybackScope a = w61Var.a(kf1Var);
                    e eVar = (e) w61Var.e.getValue();
                    u51 u51Var = w61Var.c;
                    eVar.getClass();
                    u51Var.getClass();
                    final c e = a.e(u51Var);
                    final String t = weo.t();
                    a0g.G(w61Var.a, mqsVar, new Function0() { // from class: v61
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            z5l z5lVar = new z5l();
                            kxi kxiVar = w61Var.d;
                            String str2 = t;
                            a6l a2 = kxiVar.a(str2);
                            c cVar = c.this;
                            qe5 h = l3l.h(cVar, arrayList, a2);
                            mqs mqsVar2 = mqsVar;
                            h.g = mqsVar2;
                            h.e = i;
                            se5 b = h.b();
                            if (z5lVar.c(cVar, mqsVar2, false)) {
                                z5lVar.i(false);
                            } else {
                                z5lVar.d(b, true, uyk.a);
                                v50Var.invoke(str2);
                            }
                            return Unit.a;
                        }
                    });
                    break;
                } else {
                    int ordinal = kf1Var.ordinal();
                    if (ordinal != 0) {
                        str = "mobile-familiar_you-track-default";
                        if (ordinal != 1 && ordinal != 2) {
                            b6e.s();
                            break;
                        }
                    } else {
                        str = "mobile-artist-artist-default";
                    }
                    u51 u51Var2 = s71Var.b;
                    int ordinal2 = kf1Var.ordinal();
                    if (ordinal2 == 0) {
                        k3qVar = k3q.a;
                    } else if (ordinal2 == 1) {
                        k3qVar = k3q.c;
                    } else if (ordinal2 != 2) {
                        b6e.s();
                        break;
                    } else {
                        k3qVar = k3q.b;
                    }
                    final l3q p0 = y5g.p0(u51Var2, k3qVar);
                    final s71 s71Var2 = (s71) this.e;
                    w61 w61Var2 = s71Var2.d;
                    final int i2 = this.c;
                    final ArrayList arrayList2 = (ArrayList) this.f;
                    final String str2 = str;
                    Function0 function0 = new Function0() { // from class: p71
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            zkb zkbVar;
                            s71 s71Var3 = s71.this;
                            g0l g0lVar = s71Var3.f;
                            int i3 = i2;
                            icr icrVar = new icr(i3);
                            kxi kxiVar = s71Var3.e;
                            cvo cvoVar = new cvo(wjb.ArtistFamiliarToYouScreen, hlb.Fullscreen, (glb) null, (dvo) null, new avo(pkb.Artist, s71Var3.b.a), 44);
                            jab jabVar = new jab(qkb.ArtistFamiliarTracks, 1, 1, 0);
                            thj M = szf.M(mqsVar, 0, i3);
                            fkn fknVar = s71Var3.h;
                            int b = ((v71) fknVar.a.getValue()).b();
                            vdr vdrVar = fknVar.a;
                            boolean z = ((v71) vdrVar.getValue()).c().a == s71Var3.a;
                            int ordinal3 = q6k.K(((v71) vdrVar.getValue()).c().a).ordinal();
                            if (ordinal3 == 0) {
                                zkbVar = zkb.Collection;
                            } else {
                                if (ordinal3 != 1) {
                                    b6e.s();
                                    return null;
                                }
                                zkbVar = zkb.MyWave;
                            }
                            g0l.o(g0lVar, icrVar, arrayList2, kxiVar, new w5l(cvoVar, jabVar, M, new u0s(zkbVar.a, b + 1, z)), str2, p0, 1984);
                            return Unit.a;
                        }
                    };
                    w61Var2.getClass();
                    a0g.G(w61Var2.a, mqsVar, function0);
                    break;
                }
            default:
                mqsVar.getClass();
                ((Function2) this.d).invoke(mqsVar, Integer.valueOf(this.c));
                break;
        }
    }

    public q71(Function2 function2, int i, Function1 function1, Function1 function12) {
        this.d = function2;
        this.c = i;
        this.e = function1;
        this.f = function12;
    }
}
