package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.common_models.net.map_object.AdditionalRequestAction;
import ru.yandex.taxi.common_models.net.map_object.Type;
import ru.yandex.taxi.common_models.net.map_object.b0;
import ru.yandex.taxi.common_models.net.map_object.c0;
import ru.yandex.taxi.common_models.net.map_object.d0;
import ru.yandex.taxi.common_models.net.map_object.e0;
import ru.yandex.taxi.common_models.net.map_object.f0;
import ru.yandex.taxi.common_models.net.map_object.g0;
import ru.yandex.taxi.common_models.net.map_object.h0;
import ru.yandex.taxi.common_models.net.map_object.i0;
import ru.yandex.taxi.common_models.net.map_object.j;
import ru.yandex.taxi.common_models.net.map_object.j0;
import ru.yandex.taxi.common_models.net.map_object.k0;
import ru.yandex.taxi.common_models.net.map_object.m;
import ru.yandex.taxi.common_models.net.map_object.n;
import ru.yandex.taxi.common_models.net.map_object.n0;
import ru.yandex.taxi.common_models.net.map_object.o;
import ru.yandex.taxi.common_models.net.map_object.o0;
import ru.yandex.taxi.common_models.net.map_object.p;
import ru.yandex.taxi.common_models.net.map_object.p0;
import ru.yandex.taxi.common_models.net.map_object.q;
import ru.yandex.taxi.common_models.net.map_object.q0;
import ru.yandex.taxi.common_models.net.map_object.r;
import ru.yandex.taxi.common_models.net.map_object.r0;
import ru.yandex.taxi.common_models.net.map_object.s;
import ru.yandex.taxi.common_models.net.map_object.s0;
import ru.yandex.taxi.common_models.net.map_object.t;
import ru.yandex.taxi.common_models.net.map_object.t0;
import ru.yandex.taxi.common_models.net.map_object.u;
import ru.yandex.taxi.common_models.net.map_object.u0;
import ru.yandex.taxi.common_models.net.map_object.v;
import ru.yandex.taxi.common_models.net.map_object.v0;
import ru.yandex.taxi.common_models.net.map_object.w;
import ru.yandex.taxi.common_models.net.map_object.w0;
import ru.yandex.taxi.common_models.net.map_object.x;
import ru.yandex.taxi.common_models.net.map_object.y;

/* loaded from: classes9.dex */
public final class zsd0 extends lnt {
    public static final zsd0 f = new zsd0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, s0.INSTANCE.serializer(), qoi0.a(s0.class));
    }

    @Override // defpackage.h9
    public final List f() {
        Type type = Type.SHOW_POPUP;
        f9 f9Var = new f9((String) h().invoke(type), p0.Companion.serializer(), qoi0.a(p0.class));
        Type type2 = Type.CHANGE_ZONE_MODE;
        f9 f9Var2 = new f9((String) h().invoke(type2), o.Companion.serializer(), qoi0.a(o.class));
        Type type3 = Type.CHANGE_TARIFF;
        f9 f9Var3 = new f9((String) h().invoke(type3), d0.Companion.serializer(), qoi0.a(d0.class));
        Type type4 = Type.SHOW_WEBVIEW;
        f9 f9Var4 = new f9((String) h().invoke(type4), r0.Companion.serializer(), qoi0.a(r0.class));
        Type type5 = Type.DEEPLINK;
        f9 f9Var5 = new f9((String) h().invoke(type5), p.Companion.serializer(), qoi0.a(p.class));
        Type type6 = Type.DRIVE_CARD;
        f9 f9Var6 = new f9((String) h().invoke(type6), q.Companion.serializer(), qoi0.a(q.class));
        Type type7 = Type.SHOW_SCREEN_THROUGH_PROMO;
        f9 f9Var7 = new f9((String) h().invoke(type7), q0.Companion.serializer(), qoi0.a(q0.class));
        Type type8 = Type.STOP_CARD;
        f9 f9Var8 = new f9((String) h().invoke(type8), t.Companion.serializer(), qoi0.a(t.class));
        Type type9 = Type.SELECT_SHUTTLE_STOP_POINT;
        f9 f9Var9 = new f9((String) h().invoke(type9), j0.INSTANCE.serializer(), qoi0.a(j0.class));
        Type type10 = Type.FINALIZE;
        f9 f9Var10 = new f9((String) h().invoke(type10), s.Companion.serializer(), qoi0.a(s.class));
        Type type11 = Type.PULL_OUT_OF_ZONE;
        f9 f9Var11 = new f9((String) h().invoke(type11), c0.INSTANCE.serializer(), qoi0.a(c0.class));
        Type type12 = Type.SHOW_POINT_CLARIFICATION_SCREEN;
        f9 f9Var12 = new f9((String) h().invoke(type12), o0.Companion.serializer(), qoi0.a(o0.class));
        Type type13 = Type.DRIVE_SUMMARY_OFFER;
        f9 f9Var13 = new f9((String) h().invoke(type13), r.Companion.serializer(), qoi0.a(r.class));
        Type type14 = Type.WALK_ROUTE;
        f9 f9Var14 = new f9((String) h().invoke(type14), t0.Companion.serializer(), qoi0.a(t0.class));
        Type type15 = Type.WALK_TO_DELIVERY_POINT;
        f9 f9Var15 = new f9((String) h().invoke(type15), u0.Companion.serializer(), qoi0.a(u0.class));
        Type type16 = Type.ORGANIZATION_CARD;
        f9 f9Var16 = new f9((String) h().invoke(type16), u.Companion.serializer(), qoi0.a(u.class));
        Type type17 = Type.PICK_SCOOTER;
        f9 f9Var17 = new f9((String) h().invoke(type17), x.Companion.serializer(), qoi0.a(x.class));
        Type type18 = Type.PICK_SCOOTER_PARKING;
        f9 f9Var18 = new f9((String) h().invoke(type18), y.Companion.serializer(), qoi0.a(y.class));
        Type type19 = Type.SHOW_PARKING_DESCRIPTION;
        f9 f9Var19 = new f9((String) h().invoke(type19), n0.Companion.serializer(), qoi0.a(n0.class));
        Type type20 = Type.PICK_CHARGERS_STATION;
        f9 f9Var20 = new f9((String) h().invoke(type20), v.Companion.serializer(), qoi0.a(v.class));
        Type type21 = Type.PICK_DRIVE_PARKING;
        f9 f9Var21 = new f9((String) h().invoke(type21), w.Companion.serializer(), qoi0.a(w.class));
        Type type22 = Type.WHERE_YOU_ARE;
        f9 f9Var22 = new f9((String) h().invoke(type22), v0.Companion.serializer(), qoi0.a(v0.class));
        Type type23 = Type.ZOOM_MAP_BBOX;
        f9 f9Var23 = new f9((String) h().invoke(type23), w0.Companion.serializer(), qoi0.a(w0.class));
        Type type24 = Type.SHOW_NAVIGATION;
        f9 f9Var24 = new f9((String) h().invoke(type24), k0.Companion.serializer(), qoi0.a(k0.class));
        Type type25 = Type.REPEAT_REQUEST;
        f9 f9Var25 = new f9((String) h().invoke(type25), e0.Companion.serializer(), qoi0.a(e0.class));
        Type type26 = Type.SELECT_AS_DESTINATION;
        f9 f9Var26 = new f9((String) h().invoke(type26), f0.Companion.serializer(), qoi0.a(f0.class));
        Type type27 = Type.SELECT_AS_NAVIGATION_DESTINATION;
        f9 f9Var27 = new f9((String) h().invoke(type27), g0.Companion.serializer(), qoi0.a(g0.class));
        Type type28 = Type.BUILD_ROUTE_NAVIGATION;
        f9 f9Var28 = new f9((String) h().invoke(type28), m.Companion.serializer(), qoi0.a(m.class));
        Type type29 = Type.ADDRESS_SELECTION;
        f9 f9Var29 = new f9((String) h().invoke(type29), j.Companion.serializer(), qoi0.a(j.class));
        Type type30 = Type.SELECT_SCOOTERS_ZONE;
        f9 f9Var30 = new f9((String) h().invoke(type30), i0.Companion.serializer(), qoi0.a(i0.class));
        Type type31 = Type.POSITION_CONFIRMATION;
        f9 f9Var31 = new f9((String) h().invoke(type31), b0.Companion.serializer(), qoi0.a(b0.class));
        Type type32 = Type.CALL_LINK_BACKGROUND;
        f9 f9Var32 = new f9((String) h().invoke(type32), n.Companion.serializer(), qoi0.a(n.class));
        Type type33 = Type.ADDITIONAL_REQUEST;
        f9 f9Var33 = new f9((String) h().invoke(type33), AdditionalRequestAction.Companion.serializer(), qoi0.a(AdditionalRequestAction.class));
        Type type34 = Type.SELECT_NDD_PICKUP_POINT;
        return Arrays.asList(f9Var, f9Var2, f9Var3, f9Var4, f9Var5, f9Var6, f9Var7, f9Var8, f9Var9, f9Var10, f9Var11, f9Var12, f9Var13, f9Var14, f9Var15, f9Var16, f9Var17, f9Var18, f9Var19, f9Var20, f9Var21, f9Var22, f9Var23, f9Var24, f9Var25, f9Var26, f9Var27, f9Var28, f9Var29, f9Var30, f9Var31, f9Var32, f9Var33, new f9((String) h().invoke(type34), h0.Companion.serializer(), qoi0.a(h0.class)));
    }

    @Override // defpackage.n4o
    public final KSerializer g() {
        return Type.Companion.serializer();
    }
}
