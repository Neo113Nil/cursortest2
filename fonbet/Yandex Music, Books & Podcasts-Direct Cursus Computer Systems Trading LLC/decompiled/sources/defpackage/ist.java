package defpackage;

import android.content.SharedPreferences;
import android.view.accessibility.AccessibilityManager;
import com.yandex.passport.internal.account.f;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import ru.yandex.music.services.RoutineService;

/* loaded from: classes6.dex */
public final class ist {
    public static final ist a = new ist();
    public static final jyr b = btf.b(new hft(10));
    public static final jyr c;
    public static final jyr d;
    public static final jyr e;
    public static final jyr f;
    public static final jyr g;
    public static final jyr h;

    static {
        bdt I = hag.I(wst.class);
        l18 l18Var = l18.b;
        c = l18Var.b(I, true);
        d = l18Var.b(hag.I(c72.class), true);
        e = l18Var.b(hag.I(m8q.class), true);
        f = l18Var.b(hag.I(d0q.class), true);
        g = l18Var.b(hag.I(syp.class), true);
        h = l18Var.b(hag.I(akd.class), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(f fVar, yxc yxcVar, RoutineService routineService, pfj pfjVar, ezb ezbVar, u0j u0jVar, jul julVar, j7q j7qVar, cg6 cg6Var) {
        hst hstVar;
        int i;
        nmb nmbVar;
        String str;
        String s;
        vjb vjbVar;
        vjb vjbVar2;
        boolean booleanValue;
        yjb yjbVar;
        yjb yjbVar2;
        boolean booleanValue2;
        akb akbVar;
        akb akbVar2;
        boolean z;
        RoutineService routineService2;
        pfj pfjVar2;
        boolean z2;
        jul julVar2;
        boolean z3;
        List a2;
        boolean z4;
        boolean z5;
        boolean z6;
        if (cg6Var instanceof hst) {
            hstVar = (hst) cg6Var;
            int i2 = hstVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hstVar.x = i2 - Integer.MIN_VALUE;
                Object obj = hstVar.v;
                nm6 nm6Var = nm6.a;
                i = hstVar.x;
                if (i != 0) {
                    qgg.h0(obj);
                    wst wstVar = (wst) c.getValue();
                    xxq d2 = yxcVar.d();
                    wstVar.getClass();
                    dtt b2 = wstVar.b(d2);
                    nmbVar = (nmb) b.getValue();
                    str = (String) sn4.a.getValue();
                    String name = ad.a(fVar).name();
                    Locale locale = Locale.ENGLISH;
                    s = ouj.s(locale, name, locale);
                    int ordinal = u0jVar.ordinal();
                    if (ordinal == 0) {
                        vjbVar = vjb.Offline;
                    } else {
                        if (ordinal != 1) {
                            b6e.s();
                            return null;
                        }
                        vjbVar = vjb.Mobile;
                    }
                    vjbVar2 = vjbVar;
                    booleanValue = ((Boolean) b2.f(pff.e)).booleanValue();
                    ou0.a.getClass();
                    int ordinal2 = klx.Z(routineService).ordinal();
                    if (ordinal2 == 0) {
                        yjbVar = yjb.Dark;
                    } else {
                        if (ordinal2 != 1) {
                            b6e.s();
                            return null;
                        }
                        yjbVar = yjb.Light;
                    }
                    yjbVar2 = yjbVar;
                    booleanValue2 = ((Boolean) ((d0q) f.getValue()).e.getValue()).booleanValue();
                    int ordinal3 = ((i7q) j7qVar.e.getValue()).ordinal();
                    if (ordinal3 == 0) {
                        akbVar = akb.Low;
                    } else if (ordinal3 == 1) {
                        akbVar = akb.High;
                    } else if (ordinal3 == 2) {
                        akbVar = akb.Lossless;
                    } else {
                        if (ordinal3 != 3) {
                            b6e.s();
                            return null;
                        }
                        akbVar = akb.High;
                    }
                    akbVar2 = akbVar;
                    int ordinal4 = ezbVar.a().ordinal();
                    if (ordinal4 == 0) {
                        z = false;
                    } else {
                        if (ordinal4 != 1) {
                            b6e.s();
                            return null;
                        }
                        z = true;
                    }
                    c72 c72Var = (c72) d.getValue();
                    routineService2 = routineService;
                    hstVar.j = routineService2;
                    pfjVar2 = pfjVar;
                    z2 = false;
                    hstVar.k = pfjVar2;
                    julVar2 = julVar;
                    hstVar.l = julVar2;
                    hstVar.m = nmbVar;
                    hstVar.n = str;
                    hstVar.o = s;
                    hstVar.p = vjbVar2;
                    hstVar.q = yjbVar2;
                    hstVar.r = akbVar2;
                    hstVar.s = booleanValue;
                    hstVar.t = booleanValue2;
                    hstVar.u = z;
                    boolean z7 = z;
                    hstVar.x = 1;
                    obj = ((z22) c72Var).b(hstVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    z3 = z7;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z3 = hstVar.u;
                    booleanValue2 = hstVar.t;
                    booleanValue = hstVar.s;
                    akbVar2 = hstVar.r;
                    yjbVar2 = hstVar.q;
                    vjbVar2 = hstVar.p;
                    s = hstVar.o;
                    str = hstVar.n;
                    nmbVar = hstVar.m;
                    jul julVar3 = hstVar.l;
                    pfj pfjVar3 = hstVar.k;
                    RoutineService routineService3 = hstVar.j;
                    qgg.h0(obj);
                    julVar2 = julVar3;
                    pfjVar2 = pfjVar3;
                    z2 = false;
                    routineService2 = routineService3;
                }
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                agd agdVar = ((akd) h.getValue()).c;
                a2 = agdVar.a();
                if (a2 == null) {
                    List list = a2;
                    z4 = booleanValue3;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        z6 = z2;
                        z5 = true;
                    } else {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            String str2 = ((fgd) it.next()).b;
                            str2.getClass();
                            Iterator it2 = it;
                            SharedPreferences b3 = agdVar.b();
                            agd agdVar2 = agdVar;
                            z5 = true;
                            if (b3.getBoolean(str2, true)) {
                                z6 = true;
                                break;
                            }
                            it = it2;
                            agdVar = agdVar2;
                        }
                    }
                    String str3 = pfjVar2.a() == z5 ? "enabled" : "disabled";
                    zjb zjbVar = ((Boolean) julVar2.e.e.getValue()).booleanValue() == z5 ? zjb.Head : zjb.Tail;
                    AccessibilityManager a3 = l1b.a(routineService2);
                    boolean z8 = (a3.isEnabled() || !a3.isTouchExplorationEnabled()) ? z2 : true;
                    boolean booleanValue4 = ((Boolean) ((syp) g.getValue()).e.getValue()).booleanValue();
                    boolean booleanValue5 = ((Boolean) ((m8q) e.getValue()).e.getValue()).booleanValue();
                    nmbVar.getClass();
                    yjbVar2.getClass();
                    vjbVar2.getClass();
                    akbVar2.getClass();
                    str.getClass();
                    s.getClass();
                    boolean z9 = z6;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("theme", yjbVar2.a);
                    linkedHashMap.put("network_policy", vjbVar2.a);
                    linkedHashMap.put("playlist_tracks_insertion_mode", zjbVar.a);
                    linkedHashMap.put("track_quality", akbVar2.a);
                    linkedHashMap.put("clid", str);
                    linkedHashMap.put("auth_type", s);
                    linkedHashMap.put("subscription_id", "");
                    linkedHashMap.put("subscription_type", "");
                    eta.u(linkedHashMap, "notifications", str3, z3, "content_mode");
                    linkedHashMap.put("kids_tab", String.valueOf(booleanValue));
                    linkedHashMap.put("auto_downloading", String.valueOf(z4));
                    linkedHashMap.put("stations_autoconnection", String.valueOf(z9));
                    linkedHashMap.put("auto_flow", String.valueOf(true));
                    linkedHashMap.put("cross_fade", String.valueOf(booleanValue2));
                    linkedHashMap.put("voice_over", String.valueOf(z8));
                    linkedHashMap.put("no_sleep", String.valueOf(z2));
                    linkedHashMap.put("player_background", String.valueOf(z2));
                    linkedHashMap.put("autoplay", String.valueOf(booleanValue4));
                    linkedHashMap.put("shake_wave", String.valueOf(booleanValue5));
                    linkedHashMap.put("_meta", nmb.u(1));
                    nmbVar.C("Application.User", linkedHashMap);
                    return Unit.a;
                }
                z4 = booleanValue3;
                z5 = true;
                z6 = z2;
                if (pfjVar2.a() == z5) {
                }
                if (((Boolean) julVar2.e.e.getValue()).booleanValue() == z5) {
                }
                AccessibilityManager a32 = l1b.a(routineService2);
                if (a32.isEnabled()) {
                }
                boolean booleanValue42 = ((Boolean) ((syp) g.getValue()).e.getValue()).booleanValue();
                boolean booleanValue52 = ((Boolean) ((m8q) e.getValue()).e.getValue()).booleanValue();
                nmbVar.getClass();
                yjbVar2.getClass();
                vjbVar2.getClass();
                akbVar2.getClass();
                str.getClass();
                s.getClass();
                boolean z92 = z6;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("theme", yjbVar2.a);
                linkedHashMap2.put("network_policy", vjbVar2.a);
                linkedHashMap2.put("playlist_tracks_insertion_mode", zjbVar.a);
                linkedHashMap2.put("track_quality", akbVar2.a);
                linkedHashMap2.put("clid", str);
                linkedHashMap2.put("auth_type", s);
                linkedHashMap2.put("subscription_id", "");
                linkedHashMap2.put("subscription_type", "");
                eta.u(linkedHashMap2, "notifications", str3, z3, "content_mode");
                linkedHashMap2.put("kids_tab", String.valueOf(booleanValue));
                linkedHashMap2.put("auto_downloading", String.valueOf(z4));
                linkedHashMap2.put("stations_autoconnection", String.valueOf(z92));
                linkedHashMap2.put("auto_flow", String.valueOf(true));
                linkedHashMap2.put("cross_fade", String.valueOf(booleanValue2));
                linkedHashMap2.put("voice_over", String.valueOf(z8));
                linkedHashMap2.put("no_sleep", String.valueOf(z2));
                linkedHashMap2.put("player_background", String.valueOf(z2));
                linkedHashMap2.put("autoplay", String.valueOf(booleanValue42));
                linkedHashMap2.put("shake_wave", String.valueOf(booleanValue52));
                linkedHashMap2.put("_meta", nmb.u(1));
                nmbVar.C("Application.User", linkedHashMap2);
                return Unit.a;
            }
        }
        hstVar = new hst(this, cg6Var);
        Object obj2 = hstVar.v;
        nm6 nm6Var2 = nm6.a;
        i = hstVar.x;
        if (i != 0) {
        }
        boolean booleanValue32 = ((Boolean) obj2).booleanValue();
        agd agdVar3 = ((akd) h.getValue()).c;
        a2 = agdVar3.a();
        if (a2 == null) {
        }
        z5 = true;
        z6 = z2;
        if (pfjVar2.a() == z5) {
        }
        if (((Boolean) julVar2.e.e.getValue()).booleanValue() == z5) {
        }
        AccessibilityManager a322 = l1b.a(routineService2);
        if (a322.isEnabled()) {
        }
        boolean booleanValue422 = ((Boolean) ((syp) g.getValue()).e.getValue()).booleanValue();
        boolean booleanValue522 = ((Boolean) ((m8q) e.getValue()).e.getValue()).booleanValue();
        nmbVar.getClass();
        yjbVar2.getClass();
        vjbVar2.getClass();
        akbVar2.getClass();
        str.getClass();
        s.getClass();
        boolean z922 = z6;
        LinkedHashMap linkedHashMap22 = new LinkedHashMap();
        linkedHashMap22.put("theme", yjbVar2.a);
        linkedHashMap22.put("network_policy", vjbVar2.a);
        linkedHashMap22.put("playlist_tracks_insertion_mode", zjbVar.a);
        linkedHashMap22.put("track_quality", akbVar2.a);
        linkedHashMap22.put("clid", str);
        linkedHashMap22.put("auth_type", s);
        linkedHashMap22.put("subscription_id", "");
        linkedHashMap22.put("subscription_type", "");
        eta.u(linkedHashMap22, "notifications", str3, z3, "content_mode");
        linkedHashMap22.put("kids_tab", String.valueOf(booleanValue));
        linkedHashMap22.put("auto_downloading", String.valueOf(z4));
        linkedHashMap22.put("stations_autoconnection", String.valueOf(z922));
        linkedHashMap22.put("auto_flow", String.valueOf(true));
        linkedHashMap22.put("cross_fade", String.valueOf(booleanValue2));
        linkedHashMap22.put("voice_over", String.valueOf(z8));
        linkedHashMap22.put("no_sleep", String.valueOf(z2));
        linkedHashMap22.put("player_background", String.valueOf(z2));
        linkedHashMap22.put("autoplay", String.valueOf(booleanValue422));
        linkedHashMap22.put("shake_wave", String.valueOf(booleanValue522));
        linkedHashMap22.put("_meta", nmb.u(1));
        nmbVar.C("Application.User", linkedHashMap22);
        return Unit.a;
    }
}
