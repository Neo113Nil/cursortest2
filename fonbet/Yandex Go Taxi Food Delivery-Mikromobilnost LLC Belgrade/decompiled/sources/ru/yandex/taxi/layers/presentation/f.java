package ru.yandex.taxi.layers.presentation;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import com.yandex.go.layers.api.model.Action;
import com.yandex.go.layers.api.model.AppearanceType;
import com.yandex.go.layers.api.model.MapObjectComponentType;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.geo.XYPoint;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.CameraUpdateReason;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectTapListener;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.map.VisibleRegionUtils;
import com.yandex.runtime.image.ImageProvider;
import defpackage.ah00;
import defpackage.ap00;
import defpackage.bn00;
import defpackage.bp00;
import defpackage.brd;
import defpackage.byx;
import defpackage.clm0;
import defpackage.dn00;
import defpackage.dxu0;
import defpackage.e2k;
import defpackage.evu0;
import defpackage.f4c0;
import defpackage.g6u;
import defpackage.g8e;
import defpackage.gh00;
import defpackage.gxm;
import defpackage.h73;
import defpackage.hbp0;
import defpackage.hr7;
import defpackage.iez;
import defpackage.if61;
import defpackage.jid;
import defpackage.jl40;
import defpackage.jq00;
import defpackage.jse;
import defpackage.kdc;
import defpackage.l8x;
import defpackage.lm00;
import defpackage.lp00;
import defpackage.lz2;
import defpackage.mbb1;
import defpackage.mbp0;
import defpackage.nm6;
import defpackage.ny61;
import defpackage.o400;
import defpackage.om6;
import defpackage.oyr;
import defpackage.p0u;
import defpackage.pp60;
import defpackage.pt3;
import defpackage.pzt0;
import defpackage.r8;
import defpackage.rl6;
import defpackage.rn00;
import defpackage.s8o;
import defpackage.td1;
import defpackage.tdp;
import defpackage.th5;
import defpackage.tje;
import defpackage.tls;
import defpackage.tt2;
import defpackage.tzy0;
import defpackage.ud1;
import defpackage.ufu;
import defpackage.um00;
import defpackage.up00;
import defpackage.uyj;
import defpackage.v35;
import defpackage.v4r0;
import defpackage.vp00;
import defpackage.vsq;
import defpackage.wls;
import defpackage.wp00;
import defpackage.x43;
import defpackage.xm00;
import defpackage.xp00;
import defpackage.xw31;
import defpackage.y2b1;
import defpackage.ycc;
import defpackage.ym00;
import defpackage.ym6;
import defpackage.ym91;
import defpackage.yw01;
import defpackage.zy11;
import defpackage.zyx;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiConsumer;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.map_object.MapObjectType;
import ru.yandex.taxi.layers.LayersAnalyticEventEmmiter;
import ru.yandex.taxi.layers.a;
import ru.yandex.taxi.layers.domain.model.BubbleType;
import ru.yandex.taxi.layers.domain.o;
import ru.yandex.taxi.layers.presentation.f;
import ru.yandex.taxi.layers.presentation.g;
import ru.yandex.taxi.layers.source.factory.componentfactory.l;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.map_common.map.intersection.Participant;
import ru.yandex.taxi.map_common.map.intersection.ParticipantRelationsMode;
import ru.yandex.taxi.map_common.map.process.MapComputationsProcessor$ExecuteOn;

/* loaded from: classes9.dex */
public final class f extends r8 implements jq00 {
    public final ru.yandex.taxi.layers.source.factory.componentfactory.g A;
    public final ru.yandex.taxi.layers.experiments.a B;
    public final ru.yandex.taxi.layers.source.factory.componentfactory.f C;
    public final bp00 D;
    public final ru.yandex.taxi.favorites.address.api.experiment.a E;
    public final mbp0 F;
    public final jse G;
    public final g6u H;
    public final Map I;
    public final Map J;
    public final hbp0 K;
    public LinkedHashMap L;
    public final xm00 M;
    public Map N;
    public final LinkedHashMap O;
    public final tzy0 P;
    public byx Q;
    public boolean R;
    public final ArrayList S;
    public pzt0 T;
    public pzt0 U;
    public final ConcurrentHashMap V;
    public final HashSet W;
    public volatile CameraPosition Z;
    public Map a0;
    public final b b0;
    public final g c;
    public final c c0;
    public final d d0;
    public final up00 e0;
    public final lp00 w;
    public final zyx x;
    public final rn00 y;
    public final l z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v24, types: [ru.yandex.taxi.layers.presentation.b] */
    /* JADX WARN: Type inference failed for: r11v25, types: [ru.yandex.taxi.layers.presentation.c] */
    /* JADX WARN: Type inference failed for: r11v27, types: [up00] */
    public f(final ah00 ah00Var, ru.yandex.taxi.map_common.map.process.b bVar, tt2 tt2Var, g gVar, lp00 lp00Var, zyx zyxVar, rn00 rn00Var, l lVar, ru.yandex.taxi.layers.source.factory.componentfactory.g gVar2, ru.yandex.taxi.layers.experiments.a aVar, ru.yandex.taxi.layers.source.factory.componentfactory.f fVar, bp00 bp00Var, ru.yandex.taxi.favorites.address.api.experiment.a aVar2) {
        super(5, ah00Var);
        this.c = gVar;
        this.w = lp00Var;
        this.x = zyxVar;
        this.y = rn00Var;
        this.z = lVar;
        this.A = gVar2;
        this.B = aVar;
        this.C = fVar;
        this.D = bp00Var;
        this.E = aVar2;
        this.F = new mbp0(bVar.a);
        tt2Var.getClass();
        this.G = uyj.a.P(1);
        this.H = o400.a.x;
        Participant participant = Participant.BODIES;
        ParticipantRelationsMode participantRelationsMode = ParticipantRelationsMode.MANY_TO_MANY;
        Participant participant2 = Participant.LABELS;
        Participant participant3 = Participant.BUBBLES;
        Participant participant4 = Participant.SOURCE_POINT_PIN;
        Participant participant5 = Participant.CAR_ICON;
        Pair pair = new Pair(participant, new Pair(participantRelationsMode, new Participant[]{participant2, participant3, participant, participant4, participant5}));
        Participant participant6 = Participant.DESTINATION_POINT_PIN;
        this.I = kotlin.collections.b.i(pair, new Pair(participant2, new Pair(participantRelationsMode, new Participant[]{participant2, participant3, participant6})), new Pair(participant3, new Pair(participantRelationsMode, new Participant[]{participant3, Participant.PIN, participant4, participant6, participant5})));
        this.J = kotlin.collections.b.i(new Pair(participant, new bn00(0)), new Pair(participant2, new bn00(0)), new Pair(participant3, new bn00(0)), new Pair(Participant.IMAGE_OVERLAYS, new bn00(0)));
        this.K = new hbp0(new MapObjectsOverlay$scopeDelegate$1(0, tt2Var, tt2.class, "main", "main()Lkotlinx/coroutines/CoroutineDispatcher;", 0), null, 0 == true ? 1 : 0, 6);
        xm00 p = ((gh00) ah00Var).i.p();
        p.k(1.0f);
        this.M = p;
        this.N = kotlin.collections.b.f();
        this.O = new LinkedHashMap();
        this.P = new tzy0(600, new MapObjectsOverlay$throttle$1(1, this, f.class, "onCameraChange", "onCameraChange(Lcom/yandex/mapkit/map/CameraPosition;)V", 0));
        this.R = true;
        this.S = new ArrayList();
        this.V = new ConcurrentHashMap();
        this.W = new HashSet();
        this.a0 = kotlin.collections.b.f();
        this.b0 = new hr7() { // from class: ru.yandex.taxi.layers.presentation.b
            @Override // defpackage.hr7
            public final void h(CameraPosition cameraPosition, CameraUpdateReason cameraUpdateReason, boolean z) {
                f fVar2 = f.this;
                pzt0 pzt0Var = fVar2.T;
                if (pzt0Var != null && pzt0Var.isActive()) {
                    fVar2.Z = cameraPosition;
                    return;
                }
                if (z && cameraUpdateReason == CameraUpdateReason.GESTURES) {
                    fVar2.F.a(MapComputationsProcessor$ExecuteOn.MAIN, new MapObjectsOverlay$cameraChangeListener$1$1(fVar2, cameraPosition, null));
                }
                if (z) {
                    fVar2.F.a(MapComputationsProcessor$ExecuteOn.WORKER, new MapObjectsOverlay$onCameraChange$1(fVar2, cameraPosition, null));
                    fVar2.x.a();
                    return;
                }
                fVar2.P.a(cameraPosition);
                byx byxVar = fVar2.Q;
                if (byxVar == null) {
                    return;
                }
                fVar2.x.e(byxVar, fVar2.N.size());
            }
        };
        this.c0 = new wls() { // from class: ru.yandex.taxi.layers.presentation.c
            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                f fVar2 = f.this;
                fVar2.F.a(MapComputationsProcessor$ExecuteOn.WORKER, new MapObjectsOverlay$visibilityListener$1$1(fVar2, (ym00) obj2, booleanValue, null));
                return zy11.a;
            }
        };
        this.d0 = new d(this, 0);
        this.e0 = new MapObjectTapListener() { // from class: up00
            @Override // com.yandex.mapkit.map.MapObjectTapListener
            public final boolean onMapObjectTap(MapObject mapObject, Point point) {
                el40 sharedMultiClickHandler;
                TaxiMapView h = ((gh00) ah00.this).h();
                Object context = h != null ? h.getContext() : null;
                fl40 fl40Var = context instanceof fl40 ? (fl40) context : null;
                if (fl40Var != null && (sharedMultiClickHandler = fl40Var.sharedMultiClickHandler()) != null) {
                    if (!sharedMultiClickHandler.satisfiesClickDelay()) {
                        return false;
                    }
                    sharedMultiClickHandler.updateLastClickOnItemTimestamp();
                }
                Object userData = mapObject.getUserData();
                pp60 pp60Var = (pp60) (userData instanceof pp60 ? userData : null);
                if (pp60Var == null) {
                    pp60Var = new pp60();
                    mapObject.setUserData(pp60Var);
                }
                ym00 d = pp60Var.d();
                if (d == null) {
                    jst.e.getClass();
                    return false;
                }
                String e = d.e();
                f fVar2 = this;
                Object obj = fVar2.N.get(e);
                if (obj == null) {
                    jst.e.k(new NoSuchElementException(oyr.p("There is no key ", e, " in mapObjectsMap")), "Unknown mapObject, click has not been dispatched");
                    return false;
                }
                lm00 lm00Var = (lm00) obj;
                sm00 sm00Var = lm00Var.h;
                String str = lm00Var.a;
                g gVar3 = fVar2.c;
                gVar3.getClass();
                wp31 wp31Var = lm00Var.d;
                MapObjectType mapObjectType = lm00Var.c;
                if (str.equals("selected_organizations_pin")) {
                    return true;
                }
                boolean Kg = g.Kg(lm00Var);
                k22 k22Var = gVar3.y;
                sm00 a = sm00.a(sm00Var, Kg);
                LayersAnalyticEventEmmiter layersAnalyticEventEmmiter = k22Var.a;
                MapObjectComponentType h2 = ((v35) d).h();
                a aVar3 = (a) layersAnalyticEventEmmiter.a.get(mapObjectType);
                if (aVar3 != null) {
                    aVar3.a(str, h2, LayersAnalyticEventEmmiter.Event.TAP, a);
                }
                o oVar = gVar3.A;
                oVar.getClass();
                if (mapObjectType == MapObjectType.ADVERT) {
                    oVar.i.h = lm00Var;
                }
                gVar3.x.c(new nm00(str, lm00Var.b, lm00Var.e, Action.TAP, wp31Var.g(), wp31Var.b(), sm00Var.k(), sm00Var.n()));
                return true;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0257 A[Catch: all -> 0x0218, TryCatch #0 {all -> 0x0218, blocks: (B:86:0x020d, B:88:0x0213, B:90:0x021e, B:94:0x0228, B:96:0x0232, B:98:0x0240, B:99:0x0249, B:101:0x0257, B:103:0x0263, B:107:0x026f), top: B:85:0x020d }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0240 A[Catch: all -> 0x0218, TryCatch #0 {all -> 0x0218, blocks: (B:86:0x020d, B:88:0x0213, B:90:0x021e, B:94:0x0228, B:96:0x0232, B:98:0x0240, B:99:0x0249, B:101:0x0257, B:103:0x0263, B:107:0x026f), top: B:85:0x020d }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v30, types: [java.lang.Float, java.util.concurrent.CancellationException, pzt0] */
    /* JADX WARN: Type inference failed for: r10v40 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Hg(f fVar, String str, CameraPosition cameraPosition, ym00 ym00Var, ym00 ym00Var2, List list, boolean z, int i, ContinuationImpl continuationImpl) {
        MapObjectsOverlay$addClusterObject$1 mapObjectsOverlay$addClusterObject$1;
        int i2;
        lm00 lm00Var;
        int i3;
        int i4;
        String str2;
        CameraPosition cameraPosition2;
        ym00 ym00Var3;
        ym00 ym00Var4;
        List list2;
        boolean z2;
        int i5;
        String str3;
        lm00 lm00Var2;
        Integer num;
        td1 td1Var;
        ru.yandex.taxi.layers.source.factory.componentfactory.g gVar;
        PointF pointF;
        Float f;
        boolean z3;
        ym00 ym00Var5;
        ym00 ym00Var6;
        int i6;
        Object obj;
        String str4;
        lm00 lm00Var3;
        CameraPosition cameraPosition3;
        boolean z4;
        kdc b;
        Float f2;
        float h;
        ym00 b2;
        float f3;
        int i7;
        PointF pointF2;
        CoroutineSingletons coroutineSingletons;
        String str5;
        int i8;
        XYPoint xYPoint;
        ym00 ym00Var7;
        ym00 ym00Var8;
        lm00 lm00Var4;
        float f4;
        CameraPosition cameraPosition4;
        ym00 ym00Var9;
        float f5;
        String str6;
        String str7;
        float f6;
        int i9;
        Object a;
        XYPoint xYPoint2;
        PointF pointF3;
        lm00 lm00Var5;
        ym00 ym00Var10;
        boolean z5;
        lm00 lm00Var6;
        lm00 lm00Var7;
        ?? r10;
        CameraPosition cameraPosition5;
        ym00 ym00Var11;
        CameraPosition cameraPosition6;
        ym00 ym00Var12;
        pzt0 pzt0Var;
        ym00 ym00Var13;
        boolean z6;
        fVar.getClass();
        if (continuationImpl instanceof MapObjectsOverlay$addClusterObject$1) {
            mapObjectsOverlay$addClusterObject$1 = (MapObjectsOverlay$addClusterObject$1) continuationImpl;
            int i10 = mapObjectsOverlay$addClusterObject$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mapObjectsOverlay$addClusterObject$1.label = i10 - Integer.MIN_VALUE;
                MapObjectsOverlay$addClusterObject$1 mapObjectsOverlay$addClusterObject$12 = mapObjectsOverlay$addClusterObject$1;
                Object obj2 = mapObjectsOverlay$addClusterObject$12.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = mapObjectsOverlay$addClusterObject$12.label;
                if (i2 != 0) {
                    kotlin.b.b(obj2);
                    LinkedHashMap linkedHashMap = fVar.O;
                    lm00 lm00Var8 = (lm00) linkedHashMap.get(str);
                    if (lm00Var8 == null) {
                        lm00 lm00Var9 = (lm00) fVar.N.get(str);
                        if (lm00Var9 == null) {
                            lm00Var = null;
                            if (lm00Var != null) {
                                return zy11.a;
                            }
                            Og(lm00Var, new iez(29));
                            String str8 = str + ":cluster_preview:";
                            Og(lm00Var, new vsq(str8, 22));
                            Set set = lm00Var.f;
                            if (!(set instanceof Collection) || !set.isEmpty()) {
                                Iterator it = set.iterator();
                                while (it.hasNext()) {
                                    if (((v35) ((ym00) it.next())).h() == MapObjectComponentType.BUBBLE) {
                                        i3 = 1;
                                        break;
                                    }
                                }
                            }
                            i3 = 0;
                            if (i3 == 0) {
                                ru.yandex.taxi.layers.source.factory.componentfactory.g gVar2 = fVar.A;
                                String i11 = oyr.i(i, "+");
                                mapObjectsOverlay$addClusterObject$12.L$0 = str;
                                mapObjectsOverlay$addClusterObject$12.L$1 = cameraPosition;
                                mapObjectsOverlay$addClusterObject$12.L$2 = ym00Var;
                                mapObjectsOverlay$addClusterObject$12.L$3 = ym00Var2;
                                mapObjectsOverlay$addClusterObject$12.L$4 = list;
                                mapObjectsOverlay$addClusterObject$12.L$5 = lm00Var;
                                mapObjectsOverlay$addClusterObject$12.L$6 = str8;
                                mapObjectsOverlay$addClusterObject$12.Z$0 = z;
                                mapObjectsOverlay$addClusterObject$12.I$0 = i;
                                mapObjectsOverlay$addClusterObject$12.I$1 = i3;
                                mapObjectsOverlay$addClusterObject$12.label = 1;
                                String name = gVar2.d.getThemeType().name();
                                lm00 lm00Var10 = lm00Var;
                                i4 = i3;
                                rl6 rl6Var = new rl6(Collections.singletonList(new nm6("", 2)), g8e.p(ym00Var2.e(), "-", name), new dxu0("l:#FFFFFF;d:#21201F", null, new ym6(0), 990), 31470);
                                EmptyList emptyList = EmptyList.a;
                                om6 om6Var = new om6(emptyList, emptyList, null, rl6Var);
                                List b3 = om6Var.b();
                                rl6 a2 = om6Var.a();
                                String k = oyr.k(i11.length(), "overlap_bg_len_", "_", name);
                                int length = i11.length();
                                synchronized (gVar2.f) {
                                    try {
                                        dxu0 k2 = a2.getK();
                                        String a3 = k2 != null ? k2.getA() : null;
                                        if (a3 != null) {
                                            if (evu0.J(a3)) {
                                                a3 = null;
                                            }
                                            if (a3 != null && (b = ((ufu) gVar2.b).b(a3)) != null) {
                                                num = Integer.valueOf(s8o.m(b, gVar2.a));
                                                int intValue = num == null ? num.intValue() : 0;
                                                String hexString = Integer.toHexString(intValue);
                                                BubbleType e = mbb1.e(a2);
                                                dxu0 k3 = a2.getK();
                                                int i12 = length - 2;
                                                ud1 b4 = gVar2.b(k, b3, intValue, hexString, e, k3 == null ? k3.getE() : null, i12 >= 0 ? 0 : i12);
                                                td1Var = new td1(b4.b(), b4.a(), a2);
                                            }
                                        }
                                        num = null;
                                        if (num == null) {
                                        }
                                        String hexString2 = Integer.toHexString(intValue);
                                        BubbleType e2 = mbb1.e(a2);
                                        dxu0 k32 = a2.getK();
                                        int i122 = length - 2;
                                        ud1 b42 = gVar2.b(k, b3, intValue, hexString2, e2, k32 == null ? k32.getE() : null, i122 >= 0 ? 0 : i122);
                                        td1Var = new td1(b42.b(), b42.a(), a2);
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                String e3 = ym00Var2.e();
                                XYPoint f7 = ym00Var2.f();
                                ImageProvider b5 = td1Var.b();
                                int a4 = td1Var.a();
                                lz2 lz2Var = (lz2) kotlin.collections.a.Q(ym00Var2.a());
                                float h2 = lz2Var != null ? lz2Var.h() + 1.0f : 1.0f;
                                dxu0 k4 = rl6Var.getK();
                                Context context = gVar2.a;
                                if (z) {
                                    pointF = new PointF(0.5f, 5.5f);
                                    gVar = gVar2;
                                } else {
                                    List d = k4 != null ? k4.getD() : null;
                                    if (d == null || d.size() != 2) {
                                        gVar = gVar2;
                                        pointF = new PointF(!xw31.n(context) ? 0.5f : 1.05f, -0.8f);
                                    } else {
                                        gVar = gVar2;
                                        pointF = new PointF(((Number) d.get(0)).floatValue(), ((Number) d.get(1)).floatValue());
                                    }
                                }
                                float f8 = pointF.x;
                                float f9 = pointF.y;
                                if (a4 < 1) {
                                    a4 = 1;
                                }
                                f = null;
                                z3 = true;
                                Object a5 = gVar.a(rl6Var, e3, f7, Collections.singleton(new lz2(b5, h2, (y2b1) null, 0.0f, (pt3) null, (AppearanceType) null, new PointF(f8, (((f9 - 1.0f) * tje.x(context, 14.0f)) / a4) + 1.0f), (ImageProvider) null, (PointF) null, 892)), new um00(300L), new Float(ym00Var2.g().c), ym00Var2.c(), mapObjectsOverlay$addClusterObject$12);
                                if (a5 == coroutineSingletons2) {
                                    return coroutineSingletons2;
                                }
                                str2 = str;
                                ym00Var5 = ym00Var;
                                ym00Var6 = ym00Var2;
                                list2 = list;
                                i6 = i;
                                obj = a5;
                                str4 = str8;
                                lm00Var3 = lm00Var10;
                                cameraPosition3 = cameraPosition;
                                z4 = z;
                            } else {
                                lm00 lm00Var11 = lm00Var;
                                i4 = i3;
                                str2 = str;
                                cameraPosition2 = cameraPosition;
                                ym00Var3 = ym00Var;
                                ym00Var4 = ym00Var2;
                                list2 = list;
                                z2 = z;
                                i5 = i;
                                str3 = str8;
                                lm00Var2 = lm00Var11;
                                int i13 = i4;
                                XYPoint f10 = ym00Var4.f();
                                f2 = new Float(ym00Var4.g().c);
                                if (f2.floatValue() == 0.0f) {
                                    f2 = null;
                                }
                                if (f2 != null) {
                                    h = f2.floatValue();
                                } else {
                                    lz2 lz2Var2 = (lz2) kotlin.collections.a.Q(ym00Var4.a());
                                    h = lz2Var2 != null ? lz2Var2.h() : 0.0f;
                                }
                                float f11 = h - 0.2f;
                                float f12 = h - 0.12f;
                                float f13 = h;
                                PointF pointF4 = new PointF(0.76f, 0.42000002f);
                                PointF pointF5 = new PointF(0.24000001f, 0.42000002f);
                                String str9 = (String) kotlin.collections.a.S(0, list2);
                                b2 = (str9 != null || (lm00Var7 = (lm00) fVar.N.get(str9)) == null) ? null : dn00.b(lm00Var7, MapObjectComponentType.BODY);
                                String str10 = (String) kotlin.collections.a.S(1, list2);
                                ym00 b6 = (str10 != null || (lm00Var6 = (lm00) fVar.N.get(str10)) == null) ? null : dn00.b(lm00Var6, MapObjectComponentType.BODY);
                                if (b2 != null) {
                                    ru.yandex.taxi.layers.source.factory.componentfactory.f fVar2 = fVar.C;
                                    ym00 ym00Var14 = b2;
                                    String p = g8e.p(str3, "-left-", ym00Var14.e());
                                    if61 c = ym00Var4.c();
                                    mapObjectsOverlay$addClusterObject$12.L$0 = str2;
                                    mapObjectsOverlay$addClusterObject$12.L$1 = cameraPosition2;
                                    mapObjectsOverlay$addClusterObject$12.L$2 = ym00Var3;
                                    mapObjectsOverlay$addClusterObject$12.L$3 = ym00Var4;
                                    mapObjectsOverlay$addClusterObject$12.L$4 = null;
                                    mapObjectsOverlay$addClusterObject$12.L$5 = lm00Var2;
                                    mapObjectsOverlay$addClusterObject$12.L$6 = str3;
                                    mapObjectsOverlay$addClusterObject$12.L$7 = f10;
                                    mapObjectsOverlay$addClusterObject$12.L$8 = null;
                                    mapObjectsOverlay$addClusterObject$12.L$9 = pointF5;
                                    mapObjectsOverlay$addClusterObject$12.L$10 = null;
                                    mapObjectsOverlay$addClusterObject$12.L$11 = b6;
                                    mapObjectsOverlay$addClusterObject$12.Z$0 = z2;
                                    mapObjectsOverlay$addClusterObject$12.I$0 = i5;
                                    mapObjectsOverlay$addClusterObject$12.I$1 = i13;
                                    mapObjectsOverlay$addClusterObject$12.F$0 = f13;
                                    mapObjectsOverlay$addClusterObject$12.F$1 = f11;
                                    mapObjectsOverlay$addClusterObject$12.F$2 = f12;
                                    mapObjectsOverlay$addClusterObject$12.label = 2;
                                    boolean z7 = z2;
                                    i7 = i13;
                                    str7 = str3;
                                    lm00 lm00Var12 = lm00Var2;
                                    f6 = f11;
                                    f3 = f12;
                                    i9 = i5;
                                    a = fVar2.a(p, str2, f10, c, ym00Var14, f6, pointF4, 0.92f, -10.0f, mapObjectsOverlay$addClusterObject$12);
                                    mapObjectsOverlay$addClusterObject$12 = mapObjectsOverlay$addClusterObject$12;
                                    coroutineSingletons = coroutineSingletons2;
                                    if (a == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    ym00Var7 = ym00Var4;
                                    xYPoint2 = f10;
                                    pointF3 = pointF5;
                                    lm00Var5 = lm00Var12;
                                    f4 = f13;
                                    ym00Var10 = b6;
                                    z5 = z7;
                                    ym00Var11 = (ym00) a;
                                    if (ym00Var11 == null) {
                                    }
                                    ym00Var9 = ym00Var12;
                                    z2 = z5;
                                    pointF2 = pointF3;
                                    lm00Var4 = lm00Var5;
                                    cameraPosition4 = cameraPosition6;
                                    ym00Var8 = ym00Var10;
                                    str5 = str2;
                                    i8 = i9;
                                    xYPoint = xYPoint2;
                                    str6 = str7;
                                    f5 = f6;
                                    float f14 = f3;
                                    int i14 = i7;
                                    if (ym00Var8 == null) {
                                    }
                                } else {
                                    f3 = f12;
                                    int i15 = i5;
                                    i7 = i13;
                                    pointF2 = pointF5;
                                    coroutineSingletons = coroutineSingletons2;
                                    str5 = str2;
                                    i8 = i15;
                                    xYPoint = f10;
                                    ym00Var7 = ym00Var4;
                                    ym00Var8 = b6;
                                    lm00Var4 = lm00Var2;
                                    f4 = f13;
                                    cameraPosition4 = cameraPosition2;
                                    ym00Var9 = ym00Var3;
                                    f5 = f11;
                                    str6 = str3;
                                    float f142 = f3;
                                    int i142 = i7;
                                    if (ym00Var8 == null) {
                                    }
                                }
                            }
                        } else {
                            lm00Var8 = lm00.a(lm00Var9, null, new LinkedHashSet(), 223);
                            linkedHashMap.put(str, lm00Var8);
                        }
                    }
                    lm00Var = lm00Var8;
                    if (lm00Var != null) {
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            lm00Var4 = (lm00) mapObjectsOverlay$addClusterObject$12.L$5;
                            ym00Var9 = (ym00) mapObjectsOverlay$addClusterObject$12.L$2;
                            cameraPosition5 = (CameraPosition) mapObjectsOverlay$addClusterObject$12.L$1;
                            kotlin.b.b(obj2);
                            ym00Var13 = (ym00) obj2;
                            if (ym00Var13 == null) {
                                lm00Var4.f.add(ym00Var13);
                                z6 = false;
                                a.b(cameraPosition5.getZoom(), null, lm00Var4, ym00Var13, fVar.M);
                            } else {
                                z6 = false;
                            }
                            cameraPosition4 = cameraPosition5;
                            r10 = z6;
                            lm00Var4.f.add(ym00Var9);
                            a.b(cameraPosition4.getZoom(), r10, lm00Var4, ym00Var9, fVar.M);
                            pzt0Var = fVar.U;
                            if (pzt0Var != 0) {
                                pzt0Var.a(r10);
                            }
                            fVar.U = r10;
                            return zy11.a;
                        }
                        float f15 = mapObjectsOverlay$addClusterObject$12.F$2;
                        float f16 = mapObjectsOverlay$addClusterObject$12.F$1;
                        float f17 = mapObjectsOverlay$addClusterObject$12.F$0;
                        int i16 = mapObjectsOverlay$addClusterObject$12.I$1;
                        int i17 = mapObjectsOverlay$addClusterObject$12.I$0;
                        boolean z8 = mapObjectsOverlay$addClusterObject$12.Z$0;
                        ym00Var10 = (ym00) mapObjectsOverlay$addClusterObject$12.L$11;
                        pointF3 = (PointF) mapObjectsOverlay$addClusterObject$12.L$9;
                        XYPoint xYPoint3 = (XYPoint) mapObjectsOverlay$addClusterObject$12.L$7;
                        String str11 = (String) mapObjectsOverlay$addClusterObject$12.L$6;
                        lm00Var5 = (lm00) mapObjectsOverlay$addClusterObject$12.L$5;
                        ym00Var7 = (ym00) mapObjectsOverlay$addClusterObject$12.L$3;
                        ym00 ym00Var15 = (ym00) mapObjectsOverlay$addClusterObject$12.L$2;
                        CameraPosition cameraPosition7 = (CameraPosition) mapObjectsOverlay$addClusterObject$12.L$1;
                        String str12 = (String) mapObjectsOverlay$addClusterObject$12.L$0;
                        kotlin.b.b(obj2);
                        f3 = f15;
                        i7 = i16;
                        i9 = i17;
                        str7 = str11;
                        a = obj2;
                        coroutineSingletons = coroutineSingletons2;
                        z5 = z8;
                        xYPoint2 = xYPoint3;
                        str2 = str12;
                        f6 = f16;
                        f4 = f17;
                        ym00Var3 = ym00Var15;
                        cameraPosition2 = cameraPosition7;
                        ym00Var11 = (ym00) a;
                        if (ym00Var11 == null) {
                            lm00Var5.f.add(ym00Var11);
                            cameraPosition6 = cameraPosition2;
                            ym00Var12 = ym00Var3;
                            a.b(cameraPosition2.getZoom(), null, lm00Var5, ym00Var11, fVar.M);
                        } else {
                            cameraPosition6 = cameraPosition2;
                            ym00Var12 = ym00Var3;
                        }
                        ym00Var9 = ym00Var12;
                        z2 = z5;
                        pointF2 = pointF3;
                        lm00Var4 = lm00Var5;
                        cameraPosition4 = cameraPosition6;
                        ym00Var8 = ym00Var10;
                        str5 = str2;
                        i8 = i9;
                        xYPoint = xYPoint2;
                        str6 = str7;
                        f5 = f6;
                        float f1422 = f3;
                        int i1422 = i7;
                        if (ym00Var8 == null) {
                            r10 = 0;
                            lm00Var4.f.add(ym00Var9);
                            a.b(cameraPosition4.getZoom(), r10, lm00Var4, ym00Var9, fVar.M);
                            pzt0Var = fVar.U;
                            if (pzt0Var != 0) {
                            }
                            fVar.U = r10;
                            return zy11.a;
                        }
                        CoroutineSingletons coroutineSingletons3 = coroutineSingletons;
                        ru.yandex.taxi.layers.source.factory.componentfactory.f fVar3 = fVar.C;
                        String p2 = g8e.p(str6, "-right-", ym00Var8.e());
                        if61 c2 = ym00Var7.c();
                        mapObjectsOverlay$addClusterObject$12.L$0 = null;
                        mapObjectsOverlay$addClusterObject$12.L$1 = cameraPosition4;
                        mapObjectsOverlay$addClusterObject$12.L$2 = ym00Var9;
                        mapObjectsOverlay$addClusterObject$12.L$3 = null;
                        mapObjectsOverlay$addClusterObject$12.L$4 = null;
                        mapObjectsOverlay$addClusterObject$12.L$5 = lm00Var4;
                        mapObjectsOverlay$addClusterObject$12.L$6 = null;
                        mapObjectsOverlay$addClusterObject$12.L$7 = null;
                        mapObjectsOverlay$addClusterObject$12.L$8 = null;
                        mapObjectsOverlay$addClusterObject$12.L$9 = null;
                        mapObjectsOverlay$addClusterObject$12.L$10 = null;
                        mapObjectsOverlay$addClusterObject$12.L$11 = null;
                        mapObjectsOverlay$addClusterObject$12.Z$0 = z2;
                        mapObjectsOverlay$addClusterObject$12.I$0 = i8;
                        mapObjectsOverlay$addClusterObject$12.I$1 = i1422;
                        mapObjectsOverlay$addClusterObject$12.F$0 = f4;
                        mapObjectsOverlay$addClusterObject$12.F$1 = f5;
                        mapObjectsOverlay$addClusterObject$12.F$2 = f1422;
                        mapObjectsOverlay$addClusterObject$12.label = 3;
                        obj2 = fVar3.a(p2, str5, xYPoint, c2, ym00Var8, f1422, pointF2, 0.88f, 10.0f, mapObjectsOverlay$addClusterObject$12);
                        if (obj2 == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                        cameraPosition5 = cameraPosition4;
                        ym00Var13 = (ym00) obj2;
                        if (ym00Var13 == null) {
                        }
                        cameraPosition4 = cameraPosition5;
                        r10 = z6;
                        lm00Var4.f.add(ym00Var9);
                        a.b(cameraPosition4.getZoom(), r10, lm00Var4, ym00Var9, fVar.M);
                        pzt0Var = fVar.U;
                        if (pzt0Var != 0) {
                        }
                        fVar.U = r10;
                        return zy11.a;
                    }
                    int i18 = mapObjectsOverlay$addClusterObject$12.I$1;
                    int i19 = mapObjectsOverlay$addClusterObject$12.I$0;
                    z4 = mapObjectsOverlay$addClusterObject$12.Z$0;
                    String str13 = (String) mapObjectsOverlay$addClusterObject$12.L$6;
                    lm00Var3 = (lm00) mapObjectsOverlay$addClusterObject$12.L$5;
                    list2 = (List) mapObjectsOverlay$addClusterObject$12.L$4;
                    ym00Var6 = (ym00) mapObjectsOverlay$addClusterObject$12.L$3;
                    ym00Var5 = (ym00) mapObjectsOverlay$addClusterObject$12.L$2;
                    cameraPosition3 = (CameraPosition) mapObjectsOverlay$addClusterObject$12.L$1;
                    str2 = (String) mapObjectsOverlay$addClusterObject$12.L$0;
                    kotlin.b.b(obj2);
                    obj = obj2;
                    i4 = i18;
                    z3 = true;
                    f = null;
                    str4 = str13;
                    i6 = i19;
                }
                ym00 ym00Var16 = (ym00) obj;
                lm00Var3.f.add(ym00Var16);
                a.b(cameraPosition3.getZoom(), f, lm00Var3, ym00Var16, fVar.M);
                i5 = i6;
                ym00Var4 = ym00Var6;
                cameraPosition2 = cameraPosition3;
                z2 = z4;
                str3 = str4;
                ym00Var3 = ym00Var5;
                lm00Var2 = lm00Var3;
                int i132 = i4;
                XYPoint f102 = ym00Var4.f();
                f2 = new Float(ym00Var4.g().c);
                if (f2.floatValue() == 0.0f) {
                }
                if (f2 != null) {
                }
                float f112 = h - 0.2f;
                float f122 = h - 0.12f;
                float f132 = h;
                PointF pointF42 = new PointF(0.76f, 0.42000002f);
                PointF pointF52 = new PointF(0.24000001f, 0.42000002f);
                String str92 = (String) kotlin.collections.a.S(0, list2);
                if (str92 != null) {
                }
                String str102 = (String) kotlin.collections.a.S(1, list2);
                if (str102 != null) {
                }
                if (b2 != null) {
                }
            }
        }
        mapObjectsOverlay$addClusterObject$1 = new MapObjectsOverlay$addClusterObject$1(fVar, continuationImpl);
        MapObjectsOverlay$addClusterObject$1 mapObjectsOverlay$addClusterObject$122 = mapObjectsOverlay$addClusterObject$1;
        Object obj22 = mapObjectsOverlay$addClusterObject$122.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = mapObjectsOverlay$addClusterObject$122.label;
        if (i2 != 0) {
        }
        ym00 ym00Var162 = (ym00) obj;
        lm00Var3.f.add(ym00Var162);
        a.b(cameraPosition3.getZoom(), f, lm00Var3, ym00Var162, fVar.M);
        i5 = i6;
        ym00Var4 = ym00Var6;
        cameraPosition2 = cameraPosition3;
        z2 = z4;
        str3 = str4;
        ym00Var3 = ym00Var5;
        lm00Var2 = lm00Var3;
        int i1322 = i4;
        XYPoint f1022 = ym00Var4.f();
        f2 = new Float(ym00Var4.g().c);
        if (f2.floatValue() == 0.0f) {
        }
        if (f2 != null) {
        }
        float f1122 = h - 0.2f;
        float f1222 = h - 0.12f;
        float f1322 = h;
        PointF pointF422 = new PointF(0.76f, 0.42000002f);
        PointF pointF522 = new PointF(0.24000001f, 0.42000002f);
        String str922 = (String) kotlin.collections.a.S(0, list2);
        if (str922 != null) {
        }
        String str1022 = (String) kotlin.collections.a.S(1, list2);
        if (str1022 != null) {
        }
        if (b2 != null) {
        }
    }

    public static final Object Ig(f fVar, CameraPosition cameraPosition, SuspendLambda suspendLambda) {
        Object k0;
        return (((gh00) ((ah00) fVar.b)).n() || (k0 = tje.k0(fVar.H, new MapObjectsOverlay$finalizeGravityIfPossible$2(fVar, cameraPosition, null), suspendLambda)) != CoroutineSingletons.COROUTINE_SUSPENDED) ? zy11.a : k0;
    }

    public static final void Jg(f fVar, String str) {
        ArrayList n = fVar.M.n();
        ArrayList arrayList = new ArrayList();
        Iterator it = n.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            ap00 ap00Var = (ap00) next;
            Object obj = ap00Var.d;
            if (!(obj instanceof pp60)) {
                obj = null;
            }
            pp60 pp60Var = (pp60) obj;
            if (pp60Var == null) {
                pp60Var = new pp60();
                ap00Var.h(pp60Var);
            }
            ym00 d = pp60Var.d();
            if (jl40.l(d != null ? d.e() : null, str)) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((ap00) it2.next()).d();
        }
        ycc.v(fVar.W, new brd(str, 7), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b0, code lost:
    
        if (defpackage.tje.k0(r10, r5, r0) != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
    
        if (defpackage.tje.k0(r7, r8, r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(f fVar, ContinuationImpl continuationImpl) {
        MapObjectsOverlay$prepareAndShow$1 mapObjectsOverlay$prepareAndShow$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        CameraPosition cameraPosition;
        boolean z;
        g6u g6uVar;
        MapObjectsOverlay$prepareAndShow$4 mapObjectsOverlay$prepareAndShow$4;
        CameraPosition cameraPosition2;
        fVar.getClass();
        if (continuationImpl instanceof MapObjectsOverlay$prepareAndShow$1) {
            mapObjectsOverlay$prepareAndShow$1 = (MapObjectsOverlay$prepareAndShow$1) continuationImpl;
            int i2 = mapObjectsOverlay$prepareAndShow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapObjectsOverlay$prepareAndShow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapObjectsOverlay$prepareAndShow$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapObjectsOverlay$prepareAndShow$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Iterator it = fVar.S.iterator();
                    while (it.hasNext()) {
                        ((l8x) it.next()).a(null);
                    }
                    cameraPosition = ((gh00) ((ah00) fVar.b)).e.c;
                    z = fVar.R;
                    g6u g6uVar2 = fVar.H;
                    MapObjectsOverlay$prepareAndShow$3 mapObjectsOverlay$prepareAndShow$3 = new MapObjectsOverlay$prepareAndShow$3(fVar, z, null);
                    mapObjectsOverlay$prepareAndShow$1.L$0 = cameraPosition;
                    mapObjectsOverlay$prepareAndShow$1.Z$0 = z;
                    mapObjectsOverlay$prepareAndShow$1.label = 1;
                } else if (i == 1) {
                    z = mapObjectsOverlay$prepareAndShow$1.Z$0;
                    CameraPosition cameraPosition3 = (CameraPosition) mapObjectsOverlay$prepareAndShow$1.L$0;
                    kotlin.b.b(obj);
                    cameraPosition = cameraPosition3;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    z = mapObjectsOverlay$prepareAndShow$1.Z$0;
                    cameraPosition2 = (CameraPosition) mapObjectsOverlay$prepareAndShow$1.L$0;
                    kotlin.b.b(obj);
                    g6u g6uVar3 = fVar.H;
                    MapObjectsOverlay$prepareAndShow$5 mapObjectsOverlay$prepareAndShow$5 = new MapObjectsOverlay$prepareAndShow$5(fVar, cameraPosition2, null);
                    mapObjectsOverlay$prepareAndShow$1.L$0 = null;
                    mapObjectsOverlay$prepareAndShow$1.Z$0 = z;
                    mapObjectsOverlay$prepareAndShow$1.label = 3;
                }
                g6uVar = fVar.H;
                mapObjectsOverlay$prepareAndShow$4 = new MapObjectsOverlay$prepareAndShow$4(fVar, cameraPosition, z, null);
                mapObjectsOverlay$prepareAndShow$1.L$0 = cameraPosition;
                mapObjectsOverlay$prepareAndShow$1.Z$0 = z;
                mapObjectsOverlay$prepareAndShow$1.label = 2;
                if (tje.k0(g6uVar, mapObjectsOverlay$prepareAndShow$4, mapObjectsOverlay$prepareAndShow$1) != coroutineSingletons) {
                    cameraPosition2 = cameraPosition;
                    g6u g6uVar32 = fVar.H;
                    MapObjectsOverlay$prepareAndShow$5 mapObjectsOverlay$prepareAndShow$52 = new MapObjectsOverlay$prepareAndShow$5(fVar, cameraPosition2, null);
                    mapObjectsOverlay$prepareAndShow$1.L$0 = null;
                    mapObjectsOverlay$prepareAndShow$1.Z$0 = z;
                    mapObjectsOverlay$prepareAndShow$1.label = 3;
                }
                return coroutineSingletons;
            }
        }
        mapObjectsOverlay$prepareAndShow$1 = new MapObjectsOverlay$prepareAndShow$1(fVar, continuationImpl);
        Object obj2 = mapObjectsOverlay$prepareAndShow$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapObjectsOverlay$prepareAndShow$1.label;
        if (i != 0) {
        }
        g6uVar = fVar.H;
        mapObjectsOverlay$prepareAndShow$4 = new MapObjectsOverlay$prepareAndShow$4(fVar, cameraPosition, z, null);
        mapObjectsOverlay$prepareAndShow$1.L$0 = cameraPosition;
        mapObjectsOverlay$prepareAndShow$1.Z$0 = z;
        mapObjectsOverlay$prepareAndShow$1.label = 2;
        if (tje.k0(g6uVar, mapObjectsOverlay$prepareAndShow$4, mapObjectsOverlay$prepareAndShow$1) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:273:0x0139, code lost:
    
        if (defpackage.tje.k0(r7, r4, r8) == r9) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:242:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:246:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:251:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0157 A[LOOP:16: B:256:0x0151->B:258:0x0157, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /* JADX WARN: Type inference failed for: r10v10, types: [wls] */
    /* JADX WARN: Type inference failed for: r12v10, types: [jse] */
    /* JADX WARN: Type inference failed for: r14v6, types: [tls] */
    /* JADX WARN: Type inference failed for: r15v17, types: [tls] */
    /* JADX WARN: Type inference failed for: r5v44, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Lg(f fVar, Map map, CameraPosition cameraPosition, boolean z, ContinuationImpl continuationImpl) {
        MapObjectsOverlay$prepareMapObjectsViewState$1 mapObjectsOverlay$prepareMapObjectsViewState$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Map map2;
        Iterator it;
        float zoom;
        MapObjectsOverlay$prepareMapObjectsViewState$6 mapObjectsOverlay$prepareMapObjectsViewState$6;
        Object b;
        c cVar;
        lp00 lp00Var;
        CoroutineSingletons coroutineSingletons2;
        Map map3;
        boolean z2;
        LinkedHashMap linkedHashMap;
        MapObjectsOverlay$prepareMapObjectsViewState$5 mapObjectsOverlay$prepareMapObjectsViewState$5;
        xm00 xm00Var;
        g6u g6uVar;
        CameraPosition cameraPosition2;
        boolean z3;
        BoundingBox boundingBox;
        Map map4;
        CoroutineSingletons coroutineSingletons3;
        boolean z4;
        Continuation continuation;
        Object f;
        MapObjectsOverlay$prepareMapObjectsViewState$1 mapObjectsOverlay$prepareMapObjectsViewState$12;
        MapObjectsOverlay$prepareMapObjectsViewState$7 mapObjectsOverlay$prepareMapObjectsViewState$7;
        Object a;
        Map map5;
        Object obj;
        Map map6;
        CameraPosition cameraPosition3;
        Object obj2;
        char c;
        List list;
        Map map7;
        ConcurrentHashMap concurrentHashMap;
        Set set;
        Set set2;
        Set set3;
        Object obj3;
        Set set4;
        Set set5;
        ym00 b2;
        Set<ym00> set6;
        Map map8 = map;
        CameraPosition cameraPosition4 = cameraPosition;
        boolean z5 = z;
        g6u g6uVar2 = fVar.H;
        if (continuationImpl instanceof MapObjectsOverlay$prepareMapObjectsViewState$1) {
            mapObjectsOverlay$prepareMapObjectsViewState$1 = (MapObjectsOverlay$prepareMapObjectsViewState$1) continuationImpl;
            int i2 = mapObjectsOverlay$prepareMapObjectsViewState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapObjectsOverlay$prepareMapObjectsViewState$1.label = i2 - Integer.MIN_VALUE;
                MapObjectsOverlay$prepareMapObjectsViewState$1 mapObjectsOverlay$prepareMapObjectsViewState$13 = mapObjectsOverlay$prepareMapObjectsViewState$1;
                Object obj4 = mapObjectsOverlay$prepareMapObjectsViewState$13.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapObjectsOverlay$prepareMapObjectsViewState$13.label;
                if (i != 0) {
                    kotlin.b.b(obj4);
                    if (z5) {
                        Iterator it2 = fVar.J.values().iterator();
                        while (it2.hasNext()) {
                            ((bn00) it2.next()).a = cameraPosition4;
                        }
                        MapObjectsOverlay$prepareMapObjectsViewState$3 mapObjectsOverlay$prepareMapObjectsViewState$3 = new MapObjectsOverlay$prepareMapObjectsViewState$3(fVar, map8, cameraPosition4, null);
                        mapObjectsOverlay$prepareMapObjectsViewState$13.L$0 = map8;
                        mapObjectsOverlay$prepareMapObjectsViewState$13.L$1 = cameraPosition4;
                        mapObjectsOverlay$prepareMapObjectsViewState$13.Z$0 = z5;
                        mapObjectsOverlay$prepareMapObjectsViewState$13.label = 1;
                    }
                } else if (i == 1) {
                    boolean z6 = mapObjectsOverlay$prepareMapObjectsViewState$13.Z$0;
                    cameraPosition4 = (CameraPosition) mapObjectsOverlay$prepareMapObjectsViewState$13.L$1;
                    Map map9 = (Map) mapObjectsOverlay$prepareMapObjectsViewState$13.L$0;
                    kotlin.b.b(obj4);
                    z5 = z6;
                    map8 = map9;
                } else if (i == 2) {
                    boolean z7 = mapObjectsOverlay$prepareMapObjectsViewState$13.Z$1;
                    float f2 = mapObjectsOverlay$prepareMapObjectsViewState$13.F$0;
                    boolean z8 = mapObjectsOverlay$prepareMapObjectsViewState$13.Z$0;
                    ?? r5 = (Map) mapObjectsOverlay$prepareMapObjectsViewState$13.L$11;
                    lp00 lp00Var2 = (lp00) mapObjectsOverlay$prepareMapObjectsViewState$13.L$10;
                    ?? r10 = (wls) mapObjectsOverlay$prepareMapObjectsViewState$13.L$9;
                    xm00 xm00Var2 = (xm00) mapObjectsOverlay$prepareMapObjectsViewState$13.L$8;
                    ?? r12 = (jse) mapObjectsOverlay$prepareMapObjectsViewState$13.L$7;
                    BoundingBox boundingBox2 = (BoundingBox) mapObjectsOverlay$prepareMapObjectsViewState$13.L$6;
                    ?? r14 = (tls) mapObjectsOverlay$prepareMapObjectsViewState$13.L$5;
                    ?? r15 = (tls) mapObjectsOverlay$prepareMapObjectsViewState$13.L$4;
                    Map map10 = (Map) mapObjectsOverlay$prepareMapObjectsViewState$13.L$3;
                    Map map11 = (Map) mapObjectsOverlay$prepareMapObjectsViewState$13.L$2;
                    CameraPosition cameraPosition5 = (CameraPosition) mapObjectsOverlay$prepareMapObjectsViewState$13.L$1;
                    Map map12 = (Map) mapObjectsOverlay$prepareMapObjectsViewState$13.L$0;
                    kotlin.b.b(obj4);
                    g6uVar = r12;
                    boundingBox = boundingBox2;
                    linkedHashMap = r5;
                    lp00Var = lp00Var2;
                    coroutineSingletons2 = coroutineSingletons;
                    cVar = r10;
                    mapObjectsOverlay$prepareMapObjectsViewState$6 = r14;
                    mapObjectsOverlay$prepareMapObjectsViewState$5 = r15;
                    z3 = z7;
                    map3 = map12;
                    zoom = f2;
                    b = obj4;
                    xm00Var = xm00Var2;
                    map2 = map10;
                    map4 = map11;
                    z2 = z8;
                    cameraPosition2 = cameraPosition5;
                    boolean z9 = ((tdp) b).b;
                    mapObjectsOverlay$prepareMapObjectsViewState$13.L$0 = map3;
                    mapObjectsOverlay$prepareMapObjectsViewState$13.L$1 = cameraPosition2;
                    mapObjectsOverlay$prepareMapObjectsViewState$13.L$2 = map4;
                    mapObjectsOverlay$prepareMapObjectsViewState$13.L$3 = null;
                    mapObjectsOverlay$prepareMapObjectsViewState$13.L$4 = null;
                    mapObjectsOverlay$prepareMapObjectsViewState$13.L$5 = null;
                    mapObjectsOverlay$prepareMapObjectsViewState$13.L$6 = null;
                    mapObjectsOverlay$prepareMapObjectsViewState$13.L$7 = null;
                    mapObjectsOverlay$prepareMapObjectsViewState$13.L$8 = null;
                    mapObjectsOverlay$prepareMapObjectsViewState$13.L$9 = null;
                    mapObjectsOverlay$prepareMapObjectsViewState$13.L$10 = null;
                    mapObjectsOverlay$prepareMapObjectsViewState$13.L$11 = null;
                    mapObjectsOverlay$prepareMapObjectsViewState$13.Z$0 = z2;
                    mapObjectsOverlay$prepareMapObjectsViewState$13.label = 3;
                    coroutineSingletons3 = coroutineSingletons2;
                    z4 = true;
                    continuation = null;
                    f = a.f(map2, mapObjectsOverlay$prepareMapObjectsViewState$5, zoom, mapObjectsOverlay$prepareMapObjectsViewState$6, boundingBox, g6uVar, z3, xm00Var, cVar, lp00Var, linkedHashMap, z9, mapObjectsOverlay$prepareMapObjectsViewState$13);
                    mapObjectsOverlay$prepareMapObjectsViewState$12 = mapObjectsOverlay$prepareMapObjectsViewState$13;
                    if (f == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                    mapObjectsOverlay$prepareMapObjectsViewState$7 = new MapObjectsOverlay$prepareMapObjectsViewState$7(fVar, continuation);
                    mapObjectsOverlay$prepareMapObjectsViewState$12.L$0 = map3;
                    mapObjectsOverlay$prepareMapObjectsViewState$12.L$1 = cameraPosition2;
                    mapObjectsOverlay$prepareMapObjectsViewState$12.L$2 = map4;
                    mapObjectsOverlay$prepareMapObjectsViewState$12.Z$0 = z2;
                    mapObjectsOverlay$prepareMapObjectsViewState$12.label = 4;
                    if (tje.k0(g6uVar2, mapObjectsOverlay$prepareMapObjectsViewState$7, mapObjectsOverlay$prepareMapObjectsViewState$12) == coroutineSingletons3) {
                    }
                    fVar.Rg(map3);
                    ru.yandex.taxi.layers.experiments.a aVar = fVar.B;
                    mapObjectsOverlay$prepareMapObjectsViewState$12.L$0 = map3;
                    mapObjectsOverlay$prepareMapObjectsViewState$12.L$1 = cameraPosition2;
                    mapObjectsOverlay$prepareMapObjectsViewState$12.L$2 = map4;
                    mapObjectsOverlay$prepareMapObjectsViewState$12.Z$0 = z2;
                    mapObjectsOverlay$prepareMapObjectsViewState$12.label = 5;
                    a = aVar.a(mapObjectsOverlay$prepareMapObjectsViewState$12);
                    if (a != coroutineSingletons3) {
                    }
                } else {
                    if (i != 3) {
                        if (i == 4) {
                            boolean z10 = mapObjectsOverlay$prepareMapObjectsViewState$13.Z$0;
                            map4 = (Map) mapObjectsOverlay$prepareMapObjectsViewState$13.L$2;
                            cameraPosition2 = (CameraPosition) mapObjectsOverlay$prepareMapObjectsViewState$13.L$1;
                            Map map13 = (Map) mapObjectsOverlay$prepareMapObjectsViewState$13.L$0;
                            kotlin.b.b(obj4);
                            z2 = z10;
                            map3 = map13;
                            coroutineSingletons3 = coroutineSingletons;
                            z4 = true;
                            mapObjectsOverlay$prepareMapObjectsViewState$12 = mapObjectsOverlay$prepareMapObjectsViewState$13;
                            fVar.Rg(map3);
                            ru.yandex.taxi.layers.experiments.a aVar2 = fVar.B;
                            mapObjectsOverlay$prepareMapObjectsViewState$12.L$0 = map3;
                            mapObjectsOverlay$prepareMapObjectsViewState$12.L$1 = cameraPosition2;
                            mapObjectsOverlay$prepareMapObjectsViewState$12.L$2 = map4;
                            mapObjectsOverlay$prepareMapObjectsViewState$12.Z$0 = z2;
                            mapObjectsOverlay$prepareMapObjectsViewState$12.label = 5;
                            a = aVar2.a(mapObjectsOverlay$prepareMapObjectsViewState$12);
                            if (a != coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                            map5 = map4;
                            obj = a;
                            map6 = map3;
                            cameraPosition3 = cameraPosition2;
                            if (((Boolean) obj).booleanValue()) {
                            }
                            return zy11.a;
                        }
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Map map14 = (Map) mapObjectsOverlay$prepareMapObjectsViewState$13.L$2;
                        CameraPosition cameraPosition6 = (CameraPosition) mapObjectsOverlay$prepareMapObjectsViewState$13.L$1;
                        Map map15 = (Map) mapObjectsOverlay$prepareMapObjectsViewState$13.L$0;
                        kotlin.b.b(obj4);
                        map5 = map14;
                        map6 = map15;
                        obj = obj4;
                        z4 = true;
                        cameraPosition3 = cameraPosition6;
                        if (((Boolean) obj).booleanValue()) {
                            ConcurrentHashMap concurrentHashMap2 = fVar.V;
                            LinkedHashMap linkedHashMap2 = fVar.O;
                            for (String str : v4r0.g(linkedHashMap2.keySet(), map6.keySet())) {
                                lm00 lm00Var = (lm00) linkedHashMap2.remove(str);
                                if (lm00Var != null && (set6 = lm00Var.f) != null) {
                                    for (ym00 ym00Var : set6) {
                                        dn00.d(ym00Var);
                                        ym00Var.g().d();
                                    }
                                }
                                concurrentHashMap2.remove(str);
                            }
                            ArrayList arrayList = new ArrayList();
                            Set keySet = map5.keySet();
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj5 : keySet) {
                                lm00 lm00Var2 = (lm00) map6.get((String) obj5);
                                if (lm00Var2 != null && (b2 = dn00.b(lm00Var2, MapObjectComponentType.BODY)) != null && (!b2.g().b) == z4) {
                                    arrayList2.add(obj5);
                                }
                                z4 = true;
                            }
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                String str2 = (String) it3.next();
                                Collection collection = (Set) map5.get(str2);
                                if (collection == null) {
                                    collection = EmptySet.a;
                                }
                                if (!collection.isEmpty()) {
                                    LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                                    x43 x43Var = new x43();
                                    x43Var.addLast(str2);
                                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                    while (!x43Var.isEmpty()) {
                                        String str3 = (String) x43Var.removeFirst();
                                        if (!linkedHashSet2.contains(str3)) {
                                            linkedHashSet2.add(str3);
                                            linkedHashSet.add(str3);
                                            Set<String> set7 = (Set) map5.get(str3);
                                            if (set7 != null) {
                                                for (String str4 : set7) {
                                                    if (!linkedHashSet2.contains(str4)) {
                                                        x43Var.addLast(str4);
                                                    }
                                                }
                                            }
                                            map5.forEach(new th5(10, new gxm(24, str3, linkedHashSet2, x43Var)));
                                        }
                                    }
                                    for (String str5 : linkedHashSet) {
                                        if (!jl40.l(str5, str2)) {
                                            arrayList.add(new Pair(str5, collection));
                                        }
                                    }
                                }
                            }
                            Iterator it4 = arrayList.iterator();
                            while (it4.hasNext()) {
                                Pair pair = (Pair) it4.next();
                                String str6 = (String) pair.getFirst();
                                Set set8 = (Set) pair.getSecond();
                                Set set9 = (Set) map5.get(str6);
                                if (set9 != null) {
                                    set9.addAll(set8);
                                }
                            }
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                            LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                            Iterator it5 = map5.entrySet().iterator();
                            while (it5.hasNext()) {
                                linkedHashMap3.put(((Map.Entry) it5.next()).getKey(), new LinkedHashSet());
                            }
                            for (lm00 lm00Var3 : kotlin.collections.a.x0(map6.values(), new wp00())) {
                                ym00 b3 = dn00.b(lm00Var3, MapObjectComponentType.BODY);
                                String str7 = lm00Var3.a;
                                if (b3 != null && b3.g().b) {
                                    Iterator it6 = map5.keySet().iterator();
                                    while (true) {
                                        if (!it6.hasNext()) {
                                            obj3 = null;
                                            break;
                                        }
                                        obj3 = it6.next();
                                        Set set10 = (Set) map5.get((String) obj3);
                                        if (set10 != null && set10.contains(str7)) {
                                            break;
                                        }
                                    }
                                    String str8 = (String) obj3;
                                    if (str8 == null) {
                                        Set<String> set11 = (Set) map5.get(str7);
                                        if (set11 != null) {
                                            for (String str9 : set11) {
                                                if (!linkedHashSet4.contains(str9) && (set4 = (Set) linkedHashMap3.get(str7)) != null) {
                                                    set4.add(str9);
                                                }
                                                linkedHashSet4.add(str9);
                                            }
                                        }
                                    } else {
                                        Set<String> set12 = (Set) map5.get(str7);
                                        if (set12 != null) {
                                            for (String str10 : set12) {
                                                if (!linkedHashSet4.contains(str10) && (set5 = (Set) linkedHashMap3.get(str8)) != null) {
                                                    set5.add(str10);
                                                }
                                                linkedHashSet4.add(str10);
                                            }
                                        }
                                    }
                                }
                            }
                            final jid jidVar = new jid(1, map6);
                            linkedHashMap2.forEach(new BiConsumer() { // from class: tp00
                                @Override // java.util.function.BiConsumer
                                public final void accept(Object obj6, Object obj7) {
                                    jid.this.invoke(obj6, obj7);
                                }
                            });
                            for (Map.Entry entry : linkedHashMap3.entrySet()) {
                                String str11 = (String) entry.getKey();
                                Set set13 = (Set) entry.getValue();
                                linkedHashSet3.addAll(set13);
                                lm00 lm00Var4 = (lm00) map6.get(str11);
                                if (lm00Var4 != null) {
                                    Iterator it7 = lm00Var4.f.iterator();
                                    while (true) {
                                        if (!it7.hasNext()) {
                                            obj2 = null;
                                            break;
                                        }
                                        obj2 = it7.next();
                                        if (((v35) ((ym00) obj2)).h() == MapObjectComponentType.BODY) {
                                            break;
                                        }
                                    }
                                    ym00 ym00Var2 = (ym00) obj2;
                                    if (ym00Var2 != null) {
                                        boolean l = jl40.l(str11, "selected_organizations_pin");
                                        Set N0 = kotlin.collections.a.N0(set13);
                                        Set set14 = (Set) concurrentHashMap2.get(str11);
                                        Set N02 = set14 != null ? kotlin.collections.a.N0(set14) : null;
                                        lm00 lm00Var5 = (lm00) linkedHashMap2.get(str11);
                                        boolean z11 = (lm00Var5 == null || (set3 = lm00Var5.f) == null || !(set3.isEmpty() ^ true)) ? false : true;
                                        if (!jl40.l(N02, N0) || !z11) {
                                            concurrentHashMap2.put(str11, set13);
                                            if (set13.isEmpty()) {
                                                lm00 lm00Var6 = (lm00) linkedHashMap2.get(str11);
                                                if (lm00Var6 != null && (set2 = lm00Var6.f) != null) {
                                                    for (ym00 ym00Var3 : kotlin.collections.a.J0(set2)) {
                                                        dn00.d(ym00Var3);
                                                        ym00Var3.g().d();
                                                    }
                                                }
                                                lm00 lm00Var7 = (lm00) linkedHashMap2.get(str11);
                                                if (lm00Var7 != null && (set = lm00Var7.f) != null) {
                                                    set.clear();
                                                }
                                                concurrentHashMap2.remove(str11);
                                            } else {
                                                if (l) {
                                                    c = 2;
                                                    list = EmptyList.a;
                                                } else {
                                                    c = 2;
                                                    list = kotlin.sequences.b.s(kotlin.sequences.b.q(new yw01(new e2k(2, kotlin.sequences.b.o(kotlin.sequences.b.g(new h73(1, set13), new brd(str11, 8)), new vp00(map6, 0)), new xp00()), new p0u(25)), 2));
                                                }
                                                map7 = map6;
                                                concurrentHashMap = concurrentHashMap2;
                                                fVar.S.add(hbp0.e(fVar.K, null, null, new MapObjectsOverlay$showAdvertClusterization$1$job$1(fVar.z.c(ym00Var2, set13.size(), l), fVar, str11, cameraPosition3, ym00Var2, list, l, set13, linkedHashSet3, map5, null), 3));
                                                map6 = map7;
                                                concurrentHashMap2 = concurrentHashMap;
                                            }
                                        }
                                    }
                                }
                                map7 = map6;
                                concurrentHashMap = concurrentHashMap2;
                                map6 = map7;
                                concurrentHashMap2 = concurrentHashMap;
                            }
                        }
                        return zy11.a;
                    }
                    boolean z12 = mapObjectsOverlay$prepareMapObjectsViewState$13.Z$0;
                    map4 = (Map) mapObjectsOverlay$prepareMapObjectsViewState$13.L$2;
                    cameraPosition2 = (CameraPosition) mapObjectsOverlay$prepareMapObjectsViewState$13.L$1;
                    Map map16 = (Map) mapObjectsOverlay$prepareMapObjectsViewState$13.L$0;
                    kotlin.b.b(obj4);
                    z2 = z12;
                    map3 = map16;
                    coroutineSingletons3 = coroutineSingletons;
                    z4 = true;
                    continuation = null;
                    mapObjectsOverlay$prepareMapObjectsViewState$12 = mapObjectsOverlay$prepareMapObjectsViewState$13;
                    mapObjectsOverlay$prepareMapObjectsViewState$7 = new MapObjectsOverlay$prepareMapObjectsViewState$7(fVar, continuation);
                    mapObjectsOverlay$prepareMapObjectsViewState$12.L$0 = map3;
                    mapObjectsOverlay$prepareMapObjectsViewState$12.L$1 = cameraPosition2;
                    mapObjectsOverlay$prepareMapObjectsViewState$12.L$2 = map4;
                    mapObjectsOverlay$prepareMapObjectsViewState$12.Z$0 = z2;
                    mapObjectsOverlay$prepareMapObjectsViewState$12.label = 4;
                    if (tje.k0(g6uVar2, mapObjectsOverlay$prepareMapObjectsViewState$7, mapObjectsOverlay$prepareMapObjectsViewState$12) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                    fVar.Rg(map3);
                    ru.yandex.taxi.layers.experiments.a aVar22 = fVar.B;
                    mapObjectsOverlay$prepareMapObjectsViewState$12.L$0 = map3;
                    mapObjectsOverlay$prepareMapObjectsViewState$12.L$1 = cameraPosition2;
                    mapObjectsOverlay$prepareMapObjectsViewState$12.L$2 = map4;
                    mapObjectsOverlay$prepareMapObjectsViewState$12.Z$0 = z2;
                    mapObjectsOverlay$prepareMapObjectsViewState$12.label = 5;
                    a = aVar22.a(mapObjectsOverlay$prepareMapObjectsViewState$12);
                    if (a != coroutineSingletons3) {
                    }
                }
                map2 = map8;
                CameraPosition cameraPosition7 = cameraPosition4;
                boolean z13 = z5;
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                it = map2.entrySet().iterator();
                while (it.hasNext()) {
                    linkedHashMap4.put(((Map.Entry) it.next()).getKey(), new LinkedHashSet());
                }
                MapObjectsOverlay$prepareMapObjectsViewState$5 mapObjectsOverlay$prepareMapObjectsViewState$52 = new MapObjectsOverlay$prepareMapObjectsViewState$5(1, fVar.y, rn00.class, "getVisibleZoomRange", "getVisibleZoomRange(Lru/yandex/taxi/common_models/net/map_object/MapObjectType;)Lcom/yandex/go/layers/api/model/ZoomRange;", 0);
                zoom = cameraPosition7.getZoom();
                MapObjectsOverlay$prepareMapObjectsViewState$6 mapObjectsOverlay$prepareMapObjectsViewState$62 = new MapObjectsOverlay$prepareMapObjectsViewState$6(1, fVar, f.class, "getOverrideIconScale", "getOverrideIconScale(Lru/yandex/taxi/common_models/net/map_object/MapObjectType;Lcom/yandex/mapkit/map/CameraPosition;)Ljava/lang/Float;", 0);
                BoundingBox bounds = VisibleRegionUtils.getBounds(((gh00) ((ah00) fVar.b)).e.f());
                xm00 xm00Var3 = fVar.M;
                c cVar2 = fVar.c0;
                lp00 lp00Var3 = fVar.w;
                ru.yandex.taxi.favorites.address.api.experiment.a aVar3 = fVar.E;
                mapObjectsOverlay$prepareMapObjectsViewState$13.L$0 = map2;
                mapObjectsOverlay$prepareMapObjectsViewState$13.L$1 = cameraPosition7;
                mapObjectsOverlay$prepareMapObjectsViewState$13.L$2 = linkedHashMap4;
                mapObjectsOverlay$prepareMapObjectsViewState$13.L$3 = map2;
                mapObjectsOverlay$prepareMapObjectsViewState$13.L$4 = mapObjectsOverlay$prepareMapObjectsViewState$52;
                mapObjectsOverlay$prepareMapObjectsViewState$13.L$5 = mapObjectsOverlay$prepareMapObjectsViewState$62;
                mapObjectsOverlay$prepareMapObjectsViewState$13.L$6 = bounds;
                mapObjectsOverlay$prepareMapObjectsViewState$13.L$7 = g6uVar2;
                mapObjectsOverlay$prepareMapObjectsViewState$13.L$8 = xm00Var3;
                mapObjectsOverlay$prepareMapObjectsViewState$13.L$9 = cVar2;
                mapObjectsOverlay$prepareMapObjectsViewState$13.L$10 = lp00Var3;
                mapObjectsOverlay$prepareMapObjectsViewState$13.L$11 = linkedHashMap4;
                mapObjectsOverlay$prepareMapObjectsViewState$13.Z$0 = z13;
                mapObjectsOverlay$prepareMapObjectsViewState$13.F$0 = zoom;
                mapObjectsOverlay$prepareMapObjectsViewState$13.Z$1 = z13;
                mapObjectsOverlay$prepareMapObjectsViewState$6 = mapObjectsOverlay$prepareMapObjectsViewState$62;
                mapObjectsOverlay$prepareMapObjectsViewState$13.label = 2;
                b = aVar3.a.b(mapObjectsOverlay$prepareMapObjectsViewState$13);
                if (b != coroutineSingletons) {
                    cVar = cVar2;
                    lp00Var = lp00Var3;
                    coroutineSingletons2 = coroutineSingletons;
                    map3 = map2;
                    z2 = z13;
                    linkedHashMap = linkedHashMap4;
                    mapObjectsOverlay$prepareMapObjectsViewState$5 = mapObjectsOverlay$prepareMapObjectsViewState$52;
                    xm00Var = xm00Var3;
                    g6uVar = g6uVar2;
                    cameraPosition2 = cameraPosition7;
                    z3 = z2;
                    boundingBox = bounds;
                    map4 = linkedHashMap;
                    boolean z92 = ((tdp) b).b;
                    mapObjectsOverlay$prepareMapObjectsViewState$13.L$0 = map3;
                    mapObjectsOverlay$prepareMapObjectsViewState$13.L$1 = cameraPosition2;
                    mapObjectsOverlay$prepareMapObjectsViewState$13.L$2 = map4;
                    mapObjectsOverlay$prepareMapObjectsViewState$13.L$3 = null;
                    mapObjectsOverlay$prepareMapObjectsViewState$13.L$4 = null;
                    mapObjectsOverlay$prepareMapObjectsViewState$13.L$5 = null;
                    mapObjectsOverlay$prepareMapObjectsViewState$13.L$6 = null;
                    mapObjectsOverlay$prepareMapObjectsViewState$13.L$7 = null;
                    mapObjectsOverlay$prepareMapObjectsViewState$13.L$8 = null;
                    mapObjectsOverlay$prepareMapObjectsViewState$13.L$9 = null;
                    mapObjectsOverlay$prepareMapObjectsViewState$13.L$10 = null;
                    mapObjectsOverlay$prepareMapObjectsViewState$13.L$11 = null;
                    mapObjectsOverlay$prepareMapObjectsViewState$13.Z$0 = z2;
                    mapObjectsOverlay$prepareMapObjectsViewState$13.label = 3;
                    coroutineSingletons3 = coroutineSingletons2;
                    z4 = true;
                    continuation = null;
                    f = a.f(map2, mapObjectsOverlay$prepareMapObjectsViewState$5, zoom, mapObjectsOverlay$prepareMapObjectsViewState$6, boundingBox, g6uVar, z3, xm00Var, cVar, lp00Var, linkedHashMap, z92, mapObjectsOverlay$prepareMapObjectsViewState$13);
                    mapObjectsOverlay$prepareMapObjectsViewState$12 = mapObjectsOverlay$prepareMapObjectsViewState$13;
                    if (f == coroutineSingletons3) {
                    }
                    mapObjectsOverlay$prepareMapObjectsViewState$7 = new MapObjectsOverlay$prepareMapObjectsViewState$7(fVar, continuation);
                    mapObjectsOverlay$prepareMapObjectsViewState$12.L$0 = map3;
                    mapObjectsOverlay$prepareMapObjectsViewState$12.L$1 = cameraPosition2;
                    mapObjectsOverlay$prepareMapObjectsViewState$12.L$2 = map4;
                    mapObjectsOverlay$prepareMapObjectsViewState$12.Z$0 = z2;
                    mapObjectsOverlay$prepareMapObjectsViewState$12.label = 4;
                    if (tje.k0(g6uVar2, mapObjectsOverlay$prepareMapObjectsViewState$7, mapObjectsOverlay$prepareMapObjectsViewState$12) == coroutineSingletons3) {
                    }
                    fVar.Rg(map3);
                    ru.yandex.taxi.layers.experiments.a aVar222 = fVar.B;
                    mapObjectsOverlay$prepareMapObjectsViewState$12.L$0 = map3;
                    mapObjectsOverlay$prepareMapObjectsViewState$12.L$1 = cameraPosition2;
                    mapObjectsOverlay$prepareMapObjectsViewState$12.L$2 = map4;
                    mapObjectsOverlay$prepareMapObjectsViewState$12.Z$0 = z2;
                    mapObjectsOverlay$prepareMapObjectsViewState$12.label = 5;
                    a = aVar222.a(mapObjectsOverlay$prepareMapObjectsViewState$12);
                    if (a != coroutineSingletons3) {
                    }
                }
                return coroutineSingletons;
            }
        }
        mapObjectsOverlay$prepareMapObjectsViewState$1 = new MapObjectsOverlay$prepareMapObjectsViewState$1(fVar, continuationImpl);
        MapObjectsOverlay$prepareMapObjectsViewState$1 mapObjectsOverlay$prepareMapObjectsViewState$132 = mapObjectsOverlay$prepareMapObjectsViewState$1;
        Object obj42 = mapObjectsOverlay$prepareMapObjectsViewState$132.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapObjectsOverlay$prepareMapObjectsViewState$132.label;
        if (i != 0) {
        }
        map2 = map8;
        CameraPosition cameraPosition72 = cameraPosition4;
        boolean z132 = z5;
        LinkedHashMap linkedHashMap42 = new LinkedHashMap();
        it = map2.entrySet().iterator();
        while (it.hasNext()) {
        }
        MapObjectsOverlay$prepareMapObjectsViewState$5 mapObjectsOverlay$prepareMapObjectsViewState$522 = new MapObjectsOverlay$prepareMapObjectsViewState$5(1, fVar.y, rn00.class, "getVisibleZoomRange", "getVisibleZoomRange(Lru/yandex/taxi/common_models/net/map_object/MapObjectType;)Lcom/yandex/go/layers/api/model/ZoomRange;", 0);
        zoom = cameraPosition72.getZoom();
        MapObjectsOverlay$prepareMapObjectsViewState$6 mapObjectsOverlay$prepareMapObjectsViewState$622 = new MapObjectsOverlay$prepareMapObjectsViewState$6(1, fVar, f.class, "getOverrideIconScale", "getOverrideIconScale(Lru/yandex/taxi/common_models/net/map_object/MapObjectType;Lcom/yandex/mapkit/map/CameraPosition;)Ljava/lang/Float;", 0);
        BoundingBox bounds2 = VisibleRegionUtils.getBounds(((gh00) ((ah00) fVar.b)).e.f());
        xm00 xm00Var32 = fVar.M;
        c cVar22 = fVar.c0;
        lp00 lp00Var32 = fVar.w;
        ru.yandex.taxi.favorites.address.api.experiment.a aVar32 = fVar.E;
        mapObjectsOverlay$prepareMapObjectsViewState$132.L$0 = map2;
        mapObjectsOverlay$prepareMapObjectsViewState$132.L$1 = cameraPosition72;
        mapObjectsOverlay$prepareMapObjectsViewState$132.L$2 = linkedHashMap42;
        mapObjectsOverlay$prepareMapObjectsViewState$132.L$3 = map2;
        mapObjectsOverlay$prepareMapObjectsViewState$132.L$4 = mapObjectsOverlay$prepareMapObjectsViewState$522;
        mapObjectsOverlay$prepareMapObjectsViewState$132.L$5 = mapObjectsOverlay$prepareMapObjectsViewState$622;
        mapObjectsOverlay$prepareMapObjectsViewState$132.L$6 = bounds2;
        mapObjectsOverlay$prepareMapObjectsViewState$132.L$7 = g6uVar2;
        mapObjectsOverlay$prepareMapObjectsViewState$132.L$8 = xm00Var32;
        mapObjectsOverlay$prepareMapObjectsViewState$132.L$9 = cVar22;
        mapObjectsOverlay$prepareMapObjectsViewState$132.L$10 = lp00Var32;
        mapObjectsOverlay$prepareMapObjectsViewState$132.L$11 = linkedHashMap42;
        mapObjectsOverlay$prepareMapObjectsViewState$132.Z$0 = z132;
        mapObjectsOverlay$prepareMapObjectsViewState$132.F$0 = zoom;
        mapObjectsOverlay$prepareMapObjectsViewState$132.Z$1 = z132;
        mapObjectsOverlay$prepareMapObjectsViewState$6 = mapObjectsOverlay$prepareMapObjectsViewState$622;
        mapObjectsOverlay$prepareMapObjectsViewState$132.label = 2;
        b = aVar32.a.b(mapObjectsOverlay$prepareMapObjectsViewState$132);
        if (b != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public static void Og(lm00 lm00Var, tls tlsVar) {
        Set set = lm00Var.f;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (((Boolean) tlsVar.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        for (ym00 ym00Var : kotlin.collections.a.J0(arrayList)) {
            dn00.d(ym00Var);
            ym00Var.g().d();
            set.remove(ym00Var);
        }
    }

    public static Float Pg(f fVar, MapObjectType mapObjectType) {
        clm0 a = fVar.y.a(mapObjectType, ((gh00) ((ah00) fVar.b)).e.c.getZoom());
        if (a != null) {
            return Float.valueOf(a.c());
        }
        return null;
    }

    @Override // defpackage.jq00
    public final void D1(String str) {
        this.F.a(MapComputationsProcessor$ExecuteOn.MAIN, new MapObjectsOverlay$deselectObject$1(this, str, null));
    }

    public final void Mg() {
        pzt0 pzt0Var = this.U;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.U = null;
        LinkedHashMap linkedHashMap = this.O;
        for (lm00 lm00Var : linkedHashMap.values()) {
            for (ym00 ym00Var : lm00Var.f) {
                dn00.d(ym00Var);
                ym00Var.g().d();
            }
            lm00Var.f.clear();
        }
        linkedHashMap.clear();
        this.V.clear();
    }

    @Override // defpackage.jq00
    public final void N5(lm00 lm00Var) {
        if (this.L == null) {
            this.L = new LinkedHashMap(this.a0);
        }
        LinkedHashMap linkedHashMap = this.L;
        if (linkedHashMap != null) {
            linkedHashMap.put(lm00Var.a, lm00Var);
        }
    }

    @Override // defpackage.jq00
    public final void N6(Point point) {
        MapWindow mapWindow;
        ScreenPoint worldToScreen;
        ah00 ah00Var = (ah00) this.b;
        TaxiMapView h = ((gh00) ah00Var).h();
        if (h == null || (mapWindow = h.getMapWindow()) == null || (worldToScreen = mapWindow.worldToScreen(point)) == null) {
            return;
        }
        Point screenToWorld = h.getMapWindow().screenToWorld(new ScreenPoint(worldToScreen.getX(), worldToScreen.getY()));
        if (screenToWorld != null) {
            point = screenToWorld;
        }
        ((gh00) ah00Var).D(point, 17.0f, 500.0f, null);
    }

    public final void Ng() {
        HashSet hashSet = this.W;
        Set<f4c0> N0 = kotlin.collections.a.N0(hashSet);
        hashSet.clear();
        for (f4c0 f4c0Var : N0) {
            if (f4c0Var.f != null) {
                Object obj = f4c0Var.d;
                if (!(obj instanceof pp60)) {
                    obj = null;
                }
                pp60 pp60Var = (pp60) obj;
                if (pp60Var == null) {
                    pp60Var = oyr.c(f4c0Var);
                }
                ValueAnimator a = pp60Var.a();
                if (a != null) {
                    a.cancel();
                }
                Object obj2 = f4c0Var.d;
                if (!(obj2 instanceof pp60)) {
                    obj2 = null;
                }
                pp60 pp60Var2 = (pp60) obj2;
                if (pp60Var2 == null) {
                    pp60Var2 = oyr.c(f4c0Var);
                }
                pp60Var2.f(null);
                f4c0Var.A(1.0f);
                f4c0Var.i(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Qg(lm00 lm00Var, float f) {
        boolean z;
        if (lm00Var.g) {
            return;
        }
        if (this.y.a.get(lm00Var.c) != null) {
            for (ym00 ym00Var : lm00Var.f) {
                lz2 a = dn00.a(f, ym00Var, lm00Var.d.e());
                clm0 a2 = this.y.a(lm00Var.c, ((gh00) ((ah00) this.b)).e.c.getZoom());
                IconStyle iconStyle = null;
                ImageProvider a3 = a2 != null ? a2.a() : null;
                ImageProvider g = a.g();
                if (lm00Var.g && g != null) {
                    a3 = g;
                } else if (a3 == null) {
                    a3 = a.e();
                }
                if (a3.getId() != null) {
                    String id = a3.getId();
                    ImageProvider r = ym00Var.g().r();
                    if (!jl40.l(id, r != null ? r.getId() : null)) {
                        z = true;
                        Float Pg = Pg(this, lm00Var.c);
                        if (!z) {
                            IconStyle t = ym00Var.g().t();
                            if (t != null) {
                                if (Pg == null) {
                                    Pg = t.getScale();
                                }
                                t.setScale(Pg);
                                iconStyle = t;
                            }
                            ym00Var.g().z(a3, iconStyle);
                        } else if (Pg != null) {
                            ym91.a(ym00Var.g(), Pg.floatValue());
                        }
                    }
                }
                z = false;
                Float Pg2 = Pg(this, lm00Var.c);
                if (!z) {
                }
            }
        }
    }

    @Override // defpackage.jq00
    public final void R6(byx byxVar) {
        this.Q = byxVar;
        LinkedHashMap linkedHashMap = this.L;
        Map t = linkedHashMap != null ? kotlin.collections.b.t(linkedHashMap) : this.a0;
        this.L = null;
        this.a0 = t;
        this.x.g(byxVar, t.size());
        pzt0 pzt0Var = this.T;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 a = this.F.a(MapComputationsProcessor$ExecuteOn.MAIN, new MapObjectsOverlay$commit$1(this, t, null));
        a.w(new d(this, 1));
        this.T = a;
    }

    public final void Rg(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Qg((lm00) ((Map.Entry) it.next()).getValue(), ((gh00) ((ah00) this.b)).e.c.getZoom());
        }
    }

    @Override // defpackage.jq00
    public final void Z5(lm00 lm00Var) {
        if (this.L == null) {
            this.L = new LinkedHashMap(this.a0);
        }
        LinkedHashMap linkedHashMap = this.L;
        if (linkedHashMap != null) {
            linkedHashMap.put(lm00Var.a, lm00Var);
        }
    }

    @Override // defpackage.jq00
    public final void h4(String str) {
        this.F.a(MapComputationsProcessor$ExecuteOn.MAIN, new MapObjectsOverlay$selectObject$1(this, str, null));
    }

    @Override // defpackage.jq00
    public final void hide() {
        mbp0 mbp0Var = this.F;
        kotlinx.coroutines.a.g(mbp0Var.b.a, null);
        this.L = null;
        Map map = this.a0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((lm00) entry.getValue()).g) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.a0 = linkedHashMap;
        Ng();
        Mg();
        mbp0Var.a(MapComputationsProcessor$ExecuteOn.MAIN, new MapObjectsOverlay$hide$2(this, null));
    }

    @Override // defpackage.jq00
    public final void o1(boolean z) {
        this.R = z;
    }

    @Override // defpackage.jq00
    public final void s3(String str) {
        if (this.L == null) {
            this.L = new LinkedHashMap(this.a0);
        }
        LinkedHashMap linkedHashMap = this.L;
        if (linkedHashMap != null) {
        }
    }

    @Override // defpackage.jq00
    public final void x8() {
        kotlinx.coroutines.a.g(this.F.b.a, null);
        pzt0 pzt0Var = this.T;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.T = null;
        Iterator it = this.S.iterator();
        while (it.hasNext()) {
            ((l8x) it.next()).a(null);
        }
        this.S.clear();
        this.L = null;
        this.Z = null;
        this.a0 = kotlin.collections.b.f();
        Ng();
        Mg();
        Iterator it2 = kotlin.collections.a.J0(this.M.n()).iterator();
        while (it2.hasNext()) {
            ((ap00) it2.next()).d();
        }
        this.N = kotlin.collections.b.f();
    }
}
