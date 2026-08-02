package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.gson.Gson;
import com.yandex.music.databases.main.MainDatabase;
import com.yandex.music.databases.user.UserDatabase;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.AppMetricaYandex;
import io.appmetrica.analytics.RtmConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class seg extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public seg(Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.j = 27;
        this.l = (aur) function2;
    }

    /* JADX WARN: Type inference failed for: r1v55, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new seg((dn9) this.k, (reg) this.l, continuation, 0);
            case 1:
                return new seg(continuation, (klg) this.k, (cvl) this.l, 1);
            case 2:
                return new seg(continuation, (klg) this.k, (Collection) this.l, 2);
            case 3:
                return new seg((MainDatabase) this.k, (UserDatabase) this.l, continuation, 3);
            case 4:
                return new seg((mm6) this.k, (obh) this.l, continuation, 4);
            case 5:
                return new seg((vm7) this.k, (String) this.l, continuation, 5);
            case 6:
                return new seg((l2j) this.k, (Context) this.l, continuation, 6);
            case 7:
                return new seg((v9j) this.k, (List) this.l, continuation, 7);
            case 8:
                return new seg((udj) this.k, (List) this.l, continuation, 8);
            case 9:
                seg segVar = new seg((ljj) this.l, continuation, 9);
                segVar.k = obj;
                return segVar;
            case 10:
                seg segVar2 = new seg((clj) this.l, continuation, 10);
                segVar2.k = obj;
                return segVar2;
            case 11:
                seg segVar3 = new seg((avj) this.l, continuation, 11);
                segVar3.k = obj;
                return segVar3;
            case 12:
                seg segVar4 = new seg((lx7) this.l, continuation, 12);
                segVar4.k = obj;
                return segVar4;
            case 13:
                seg segVar5 = new seg((w1k) this.l, continuation, 13);
                segVar5.k = obj;
                return segVar5;
            case 14:
                seg segVar6 = new seg((zwk) this.l, continuation, 14);
                segVar6.k = obj;
                return segVar6;
            case 15:
                seg segVar7 = new seg((Integer) this.l, continuation, 15);
                segVar7.k = obj;
                return segVar7;
            case 16:
                return new seg((qj6) this.k, (z4l) this.l, continuation, 16);
            case 17:
                seg segVar8 = new seg(continuation, (j9l) this.l, 17);
                segVar8.k = obj;
                return segVar8;
            case 18:
                seg segVar9 = new seg(continuation, (FrameLayout) this.l, 18);
                segVar9.k = obj;
                return segVar9;
            case 19:
                seg segVar10 = new seg((dn9) this.l, continuation, 19);
                segVar10.k = obj;
                return segVar10;
            case 20:
                seg segVar11 = new seg((aqi) this.l, continuation, 20);
                segVar11.k = obj;
                return segVar11;
            case 21:
                return new seg((i6n) this.k, (xxq) this.l, continuation, 21);
            case 22:
                return new seg((ubn) this.k, (nyn) this.l, continuation, 22);
            case 23:
                return new seg(continuation, (ViewGroup) this.k, (gc8) this.l, 23);
            case 24:
                return new seg((dn9) this.k, (ytn) this.l, continuation, 24);
            case 25:
                return new seg((ja0) this.k, (Function0) this.l, continuation, 25);
            case 26:
                return new seg((f6o) this.k, (mqs) this.l, continuation, 26);
            case 27:
                seg segVar12 = new seg((aur) this.l, continuation);
                segVar12.k = obj;
                return segVar12;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new seg((yc5) this.k, (lum) this.l, continuation, 28);
            default:
                return new seg((String) this.k, (aqi) this.l, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
        }
        return ((seg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        boolean isOpen;
        boolean isOpen2;
        RtmConfig.Environment environment;
        Object obj2;
        boolean contains;
        int i = this.j;
        int i2 = R.string.collection_audiobooks_empty_screen;
        boolean z = false;
        z = false;
        int i3 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                try {
                    g3a g3aVar = (g3a) ((dn9) this.k).f;
                    reg regVar = (reg) this.l;
                    g3aVar.f(new u2a(regVar.c, regVar.a));
                } catch (IllegalStateException unused) {
                }
                return Unit.a;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                btl btlVar = ((klg) this.k).c;
                cvl cvlVar = (cvl) this.l;
                cvl g = btlVar.g(cvlVar);
                return g == null ? cvlVar : g;
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                btl btlVar2 = ((klg) this.k).c;
                Collection<nvl> collection = (Collection) this.l;
                btlVar2.getClass();
                collection.getClass();
                if (collection.isEmpty()) {
                    return new LinkedList();
                }
                for (nvl nvlVar : collection) {
                    if (nvlVar.a.length() == 0) {
                        dfi.r("uid is empty", "PlaylistDataSource");
                    }
                    if (nvlVar.b.length() == 0) {
                        dfi.r("kind is empty", "PlaylistDataSource");
                    }
                }
                return (List) x97.D(g.a, new b5l(btlVar2, collection, continuation, 16));
            case 3:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                MainDatabase mainDatabase = (MainDatabase) this.k;
                a42 a42Var = mainDatabase.j;
                if (a42Var != null) {
                    isOpen = !a42Var.a;
                } else {
                    v97 v97Var = mainDatabase.f;
                    if (v97Var == null) {
                        Intrinsics.j("connectionManager");
                        throw null;
                    }
                    rsr rsrVar = (rsr) v97Var.i;
                    isOpen = rsrVar != null ? rsrVar.isOpen() : false;
                }
                if (isOpen) {
                    UserDatabase userDatabase = (UserDatabase) this.l;
                    a42 a42Var2 = userDatabase.j;
                    if (a42Var2 != null) {
                        isOpen2 = !a42Var2.a;
                    } else {
                        v97 v97Var2 = userDatabase.f;
                        if (v97Var2 == null) {
                            Intrinsics.j("connectionManager");
                            throw null;
                        }
                        rsr rsrVar2 = (rsr) v97Var2.i;
                        isOpen2 = rsrVar2 != null ? rsrVar2.isOpen() : false;
                    }
                    if (isOpen2) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 4:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                x97.y((mm6) this.k, null, null, new ebh((obh) this.l, continuation, z ? 1 : 0), 3);
                return Unit.a;
            case 5:
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                Gson gson = who.a;
                ((vm7) this.k).getClass();
                String str = (String) this.l;
                jkl jklVar = new jkl();
                vho vhoVar = vho.a;
                who.b = jklVar;
                RtmConfig.Builder withProjectName = RtmConfig.newBuilder().withProjectName("MUSICANDROID");
                int ordinal = vhoVar.ordinal();
                if (ordinal == 0) {
                    environment = RtmConfig.Environment.DEVELOPMENT;
                } else {
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    environment = RtmConfig.Environment.PRODUCTION;
                }
                RtmConfig.Builder withEnvironment = withProjectName.withEnvironment(environment);
                if (str != null) {
                    withEnvironment.withUserId(str);
                }
                RtmConfig build = withEnvironment.build();
                build.getClass();
                AppMetricaYandex.updateRtmConfig(build);
                ssg.a(2, "MetricaInitializer", "rtm activated", null);
                return Unit.a;
            case 6:
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                return l2j.b((Context) this.l);
            case 7:
                nm6 nm6Var8 = nm6.a;
                qgg.h0(obj);
                v9j v9jVar = (v9j) this.k;
                List<oq> Y = o2g.Y((List) this.l);
                ArrayList arrayList = new ArrayList(v75.o(Y, 10));
                for (oq oqVar : Y) {
                    oqVar.a.getClass();
                    arrayList.add(new x9j(oqVar, jbj.a(oqVar, true)));
                }
                if (!arrayList.isEmpty()) {
                    return new p9j(arrayList);
                }
                int ordinal2 = v9jVar.k.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        b6e.s();
                        return null;
                    }
                    i2 = R.string.collection_podcasts_empty_screen;
                }
                return new n9j(i2);
            case 8:
                nm6 nm6Var9 = nm6.a;
                qgg.h0(obj);
                udj udjVar = (udj) this.k;
                List Y2 = o2g.Y((List) this.l);
                udjVar.w = Y2;
                ArrayList H = hag.H(Y2);
                if (!H.isEmpty()) {
                    return new pdj(H);
                }
                int ordinal3 = udjVar.k.ordinal();
                if (ordinal3 != 0) {
                    if (ordinal3 != 1) {
                        b6e.s();
                        return null;
                    }
                    i2 = R.string.collection_podcasts_empty_screen;
                }
                return new ndj(i2);
            case 9:
                ljj ljjVar = (ljj) this.l;
                nm6 nm6Var10 = nm6.a;
                qgg.h0(obj);
                yl2 yl2Var = (yl2) this.k;
                if (Intrinsics.d(yl2Var, vl2.a)) {
                    ((x60) ljjVar.a).a(gut.x0());
                } else if (Intrinsics.d(yl2Var, wl2.a)) {
                    ((x60) ljjVar.a).a(gut.y0());
                } else if (Intrinsics.d(yl2Var, ul2.b)) {
                    ((x60) ljjVar.a).a(gut.v0());
                } else if (Intrinsics.d(yl2Var, ul2.d)) {
                    ((x60) ljjVar.a).a(gut.A0());
                } else if (Intrinsics.d(yl2Var, ul2.a)) {
                    ((x60) ljjVar.a).a(gut.u0());
                } else if (Intrinsics.d(yl2Var, ul2.c)) {
                    ((x60) ljjVar.a).a(gut.z0());
                }
                return Unit.a;
            case 10:
                mm6 mm6Var = (mm6) this.k;
                nm6 nm6Var11 = nm6.a;
                qgg.h0(obj);
                clj cljVar = (clj) this.l;
                k1l k1lVar = cljVar.b;
                x97.y(mm6Var, null, null, new rfg(new kvh(((z66) cljVar.e.getValue()).c(), 20), (Continuation) null, cljVar, new zkj(k1lVar, (uaa) cljVar.f.getValue(), cljVar.c, cljVar.d), new alj(k1lVar)), 3);
                return Unit.a;
            case 11:
                nm6 nm6Var12 = nm6.a;
                qgg.h0(obj);
                mm6 mm6Var2 = (mm6) this.k;
                avj avjVar = (avj) this.l;
                x97.y(mm6Var2, null, null, new zuj(avjVar, continuation, z ? 1 : 0), 3);
                return x97.y(mm6Var2, null, null, new zuj(avjVar, continuation, i3), 3);
            case 12:
                lke lkeVar = (lke) this.k;
                nm6 nm6Var13 = nm6.a;
                qgg.h0(obj);
                return new cma(lkeVar != null ? lkeVar.c((lx7) this.l) : 0);
            case 13:
                nm6 nm6Var14 = nm6.a;
                qgg.h0(obj);
                hiu hiuVar = (hiu) this.k;
                int i4 = hiuVar.a * (-1);
                int i5 = ((w1k) this.l).c.d;
                return Boolean.valueOf(i4 > i5 || hiuVar.b * (-1) > i5);
            case 14:
                j1g j1gVar = (j1g) this.k;
                nm6 nm6Var15 = nm6.a;
                qgg.h0(obj);
                ((zwk) this.l).c = j1gVar;
                return Unit.a;
            case 15:
                v1o v1oVar = (v1o) this.k;
                nm6 nm6Var16 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(v1oVar.a == ((Integer) this.l).intValue());
            case 16:
                nm6 nm6Var17 = nm6.a;
                qgg.h0(obj);
                Collection<l1l> collection2 = ((x0l) ((qj6) this.k).a).b;
                z4l z4lVar = (z4l) this.l;
                for (l1l l1lVar : collection2) {
                    r1l r1lVar = (r1l) z4lVar.e.getValue();
                    String str2 = l1lVar.a;
                    r1lVar.getClass();
                    str2.getClass();
                    r1lVar.c.a(t75.c(str2));
                }
                return Unit.a;
            case 17:
                j9l j9lVar = (j9l) this.l;
                CopyOnWriteArrayList copyOnWriteArrayList = j9lVar.q;
                Object obj3 = this.k;
                nm6 nm6Var18 = nm6.a;
                qgg.h0(obj);
                u8l u8lVar = (u8l) obj3;
                if (u8lVar instanceof n8l) {
                    onh M0 = j9lVar.M0();
                    int v0 = j9lVar.v0();
                    g8l i1 = j9l.i1(j9lVar, M0, ((n8l) u8lVar).b, v0);
                    g8l i12 = j9l.i1(j9lVar, M0, 0L, v0);
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((f8l) it.next()).u(1, i1, i12);
                    }
                } else if (u8lVar instanceof o8l) {
                    onh M02 = j9lVar.M0();
                    int v02 = j9lVar.v0();
                    o8l o8lVar = (o8l) u8lVar;
                    g8l i13 = j9l.i1(j9lVar, M02, o8lVar.b, v02);
                    g8l i14 = j9l.i1(j9lVar, M02, o8lVar.c, v02);
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (it2.hasNext()) {
                        ((f8l) it2.next()).u(1, i13, i14);
                    }
                } else if (!(u8lVar instanceof q8l) && !(u8lVar instanceof p8l) && !(u8lVar instanceof j8l) && !(u8lVar instanceof k8l) && !(u8lVar instanceof l8l) && !(u8lVar instanceof m8l) && !(u8lVar instanceof r8l) && !(u8lVar instanceof s8l) && !(u8lVar instanceof t8l)) {
                    b6e.s();
                    return null;
                }
                return Unit.a;
            case 18:
                Object obj4 = this.k;
                nm6 nm6Var19 = nm6.a;
                qgg.h0(obj);
                int intValue = ((Number) obj4).intValue();
                FrameLayout frameLayout = (FrameLayout) this.l;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                if (layoutParams == null) {
                    jj4.j("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = intValue;
                frameLayout.setLayoutParams(marginLayoutParams);
                frameLayout.requestLayout();
                return Unit.a;
            case 19:
                igl iglVar = (igl) this.k;
                nm6 nm6Var20 = nm6.a;
                qgg.h0(obj);
                ((xdr) ((dn9) this.l).d).l(iglVar);
                return Unit.a;
            case 20:
                kke kkeVar = (kke) this.k;
                nm6 nm6Var21 = nm6.a;
                qgg.h0(obj);
                ((aqi) this.l).setValue(kkeVar);
                return Unit.a;
            case 21:
                nm6 nm6Var22 = nm6.a;
                qgg.h0(obj);
                Context context = ((i6n) this.k).a;
                xxq xxqVar = (xxq) this.l;
                xxqVar.getClass();
                SharedPreferences sharedPreferences = context.getSharedPreferences("audio_quality_prefs" + xxqVar.a, 0);
                sharedPreferences.getClass();
                kwl kwlVar = i7q.b;
                String string = sharedPreferences.getString("preferable_audio_quality", i6n.c.a);
                if (string == null) {
                    jj4.j("null cannot be cast to non-null type kotlin.String");
                    return null;
                }
                kwlVar.getClass();
                rdb rdbVar = i7q.h;
                rdbVar.getClass();
                c7 c7Var = new c7(0, rdbVar);
                while (c7Var.hasNext()) {
                    i7q i7qVar = (i7q) c7Var.next();
                    if (i7qVar.a.equalsIgnoreCase(string)) {
                        return i7qVar;
                    }
                }
                xq0.x(hrg.q(" value '", string, "' is not allowed."));
                return null;
            case 22:
                nm6 nm6Var23 = nm6.a;
                qgg.h0(obj);
                ubn ubnVar = (ubn) this.k;
                hyn J = t7g.J((nyn) this.l);
                SharedPreferences.Editor edit = ubnVar.a.edit();
                edit.putInt("repeat_mode", J.a);
                edit.apply();
                return Unit.a;
            case 23:
                nm6 nm6Var24 = nm6.a;
                qgg.h0(obj);
                ViewGroup viewGroup = (ViewGroup) this.k;
                gc8 gc8Var = (gc8) this.l;
                c7 c7Var2 = new c7(8, viewGroup);
                while (c7Var2.hasNext()) {
                    yd5.R(gc8Var.getReleaseViewVisitor$div_release(), (View) c7Var2.next());
                }
                viewGroup.removeAllViews();
                return Unit.a;
            case 24:
                nm6 nm6Var25 = nm6.a;
                qgg.h0(obj);
                try {
                    ((g3a) ((dn9) this.k).f).f(new v2a(((ytn) this.l).a));
                } catch (IllegalStateException unused2) {
                }
                return Unit.a;
            case 25:
                nm6 nm6Var26 = nm6.a;
                qgg.h0(obj);
                int ordinal4 = ((dwn) ((ja0) this.k).h.getValue()).ordinal();
                if (ordinal4 == 0) {
                    ((Function0) this.l).invoke();
                } else if (ordinal4 != 1) {
                    b6e.s();
                    return null;
                }
                return Unit.a;
            case 26:
                nm6 nm6Var27 = nm6.a;
                qgg.h0(obj);
                return ((q3t) ((f6o) this.k).b.getValue()).e(new zvs(((mqs) this.l).a));
            case 27:
                nm6 nm6Var28 = nm6.a;
                qgg.h0(obj);
                CoroutineContext.Element element = ((mm6) this.k).getCoroutineContext().get(d.t0);
                element.getClass();
                d dVar = (d) element;
                gm5 j = hld.j();
                x97.x(cmd.a, dVar, pm6.d, new kun(j, (Function2) this.l, (Continuation) null));
                while (!j.X()) {
                    try {
                        return x97.D(dVar, new unc(j, continuation, i3));
                    } catch (InterruptedException unused3) {
                    }
                }
                return j.C();
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                nm6 nm6Var29 = nm6.a;
                qgg.h0(obj);
                yc5 yc5Var = (yc5) this.k;
                String str3 = yc5Var.a;
                str3.getClass();
                jtc jtcVar = new jtc();
                jtcVar.a = str3;
                jtcVar.b = (z66) l18.b.c(hag.I(z66.class));
                List e0 = jtcVar.e0();
                kcc kccVar = new kcc(new lhc(new wz0(1, e0), new d0p(5), ihp.a));
                while (true) {
                    if (kccVar.hasNext()) {
                        obj2 = kccVar.next();
                        if (Intrinsics.d(((zp2) obj2).a, yc5Var.a)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                zp2 zp2Var = (zp2) obj2;
                if (zp2Var == null) {
                    dfi.r("Artist for search autoflow not found", "SearchEntityDataHelper");
                    return null;
                }
                l3q l3qVar = new l3q(new yc5(zp2Var.a), new n3q(zp2Var.b), k3q.a);
                if (gut.h1((z66) ((jyr) ((lum) this.l).b).getValue())) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = ((ArrayList) e0).iterator();
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        mqs mqsVar = (mqs) next;
                        if (mqsVar == null) {
                            su4.s(2, null, "PermanentCachedTrackPredicate: track is null", null);
                            contains = false;
                        } else {
                            l18 l18Var = l18.b;
                            bdt I = hag.I(uaa.class);
                            qdc qdcVar = l18Var.a;
                            qdcVar.getClass();
                            contains = ((lja) ((e6q) ((uaa) qdcVar.C(I))).e.getValue()).a.contains(mqsVar.a);
                        }
                        if (contains) {
                            arrayList2.add(next);
                        }
                    }
                    e0 = arrayList2;
                }
                return new fuu(l3qVar, e0);
            default:
                nm6 nm6Var30 = nm6.a;
                qgg.h0(obj);
                aqi aqiVar = (aqi) this.l;
                String str4 = ((ybs) aqiVar.getValue()).a.b;
                String str5 = (String) this.k;
                if (!Intrinsics.d(str4, str5)) {
                    ybs ybsVar = (ybs) aqiVar.getValue();
                    int length = str5.length();
                    aqiVar.setValue(ybs.b(ybsVar, str5, y5g.P(length, length), 4));
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ seg(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ seg(Continuation continuation, Object obj, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ seg(Continuation continuation, Object obj, Object obj2, int i) {
        super(2, continuation);
        this.j = i;
        this.k = obj;
        this.l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ seg(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = obj;
        this.l = obj2;
    }
}
