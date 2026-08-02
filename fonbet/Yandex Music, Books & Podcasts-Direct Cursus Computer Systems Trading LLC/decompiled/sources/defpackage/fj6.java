package defpackage;

import androidx.compose.foundation.e;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.material.MinimumInteractiveModifier;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.platform.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.music.core.ui.compose.b;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public abstract class fj6 {
    public static final float a = 16;
    public static final float b = f6h.a;
    public static final float c = 24;
    public static final float d = 12;
    public static final long e = xv.m(72, 48);

    public static final void a(boolean z, h5l h5lVar, eml emlVar, c6h c6hVar, yci yciVar, boolean z2, hq5 hq5Var, int i, int i2) {
        boolean z3;
        int i3;
        boolean z4;
        h5lVar.getClass();
        emlVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1692494);
        int i4 = i | (oq5Var.g(z) ? 4 : 2) | (oq5Var.f(h5lVar) ? 32 : 16) | (oq5Var.f(emlVar) ? 256 : 128) | (oq5Var.h(c6hVar) ? 2048 : 1024);
        int i5 = i2 & 32;
        if (i5 != 0) {
            i3 = i4 | 196608;
            z3 = z2;
        } else {
            z3 = z2;
            i3 = i4 | (oq5Var.g(z3) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        }
        int i6 = i3;
        if ((74899 & i6) == 74898 && oq5Var.z()) {
            oq5Var.S();
            z4 = z3;
        } else {
            boolean z5 = i5 != 0 ? false : z3;
            boolean h = oq5Var.h(c6hVar);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                ej6 ej6Var = new ej6(0, c6hVar, c6h.class, "onPlayClick", "onPlayClick()V", 0, 0);
                oq5Var.k0(ej6Var);
                K = ej6Var;
            }
            h9f h9fVar = (h9f) K;
            boolean h2 = oq5Var.h(c6hVar);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                mt4 mt4Var = new mt4(1, c6hVar, c6h.class, "onPreviousClick", "onPreviousClick(Lcom/yandex/music/shared/player/screen/common/api/ui/models/PlaybackSkippingControlsUiData$Type;)V", 0, 20);
                oq5Var.k0(mt4Var);
                K2 = mt4Var;
            }
            h9f h9fVar2 = (h9f) K2;
            boolean h3 = oq5Var.h(c6hVar);
            Object K3 = oq5Var.K();
            if (h3 || K3 == kjnVar) {
                mt4 mt4Var2 = new mt4(1, c6hVar, c6h.class, "onSkipClick", "onSkipClick(Lcom/yandex/music/shared/player/screen/common/api/ui/models/PlaybackSkippingControlsUiData$Type;)V", 0, 21);
                oq5Var.k0(mt4Var2);
                K3 = mt4Var2;
            }
            h9f h9fVar3 = (h9f) K3;
            boolean h4 = oq5Var.h(c6hVar);
            Object K4 = oq5Var.K();
            if (h4 || K4 == kjnVar) {
                ej6 ej6Var2 = new ej6(0, c6hVar, c6h.class, "onLikeClick", "onLikeClick()V", 0, 1);
                oq5Var.k0(ej6Var2);
                K4 = ej6Var2;
            }
            h9f h9fVar4 = (h9f) K4;
            boolean h5 = oq5Var.h(c6hVar);
            Object K5 = oq5Var.K();
            if (h5 || K5 == kjnVar) {
                ej6 ej6Var3 = new ej6(0, c6hVar, c6h.class, "onDislikeClick", "onDislikeClick()V", 0, 2);
                oq5Var.k0(ej6Var3);
                K5 = ej6Var3;
            }
            h9f h9fVar5 = (h9f) K5;
            boolean h6 = oq5Var.h(c6hVar);
            Object K6 = oq5Var.K();
            if (h6 || K6 == kjnVar) {
                mt4 mt4Var3 = new mt4(1, c6hVar, c6h.class, "onSkipLongPressInteraction", "onSkipLongPressInteraction(Lcom/yandex/music/shared/player/screen/api/ui/expanded/main/player/MainPlayerPresenter$LongPressInteraction;)V", 0, 22);
                oq5Var.k0(mt4Var3);
                K6 = mt4Var3;
            }
            h9f h9fVar6 = (h9f) K6;
            boolean h7 = oq5Var.h(c6hVar);
            Object K7 = oq5Var.K();
            if (h7 || K7 == kjnVar) {
                mt4 mt4Var4 = new mt4(1, c6hVar, c6h.class, "onPreviousLongPressInteraction", "onPreviousLongPressInteraction(Lcom/yandex/music/shared/player/screen/api/ui/expanded/main/player/MainPlayerPresenter$LongPressInteraction;)V", 0, 23);
                oq5Var.k0(mt4Var4);
                K7 = mt4Var4;
            }
            boolean z6 = z5;
            b(z, h5lVar, emlVar, (Function0) h9fVar4, (Function0) h9fVar5, (Function0) h9fVar, (Function1) h9fVar2, (Function1) h9fVar3, (Function1) ((h9f) K7), (Function1) h9fVar6, yciVar, z6, oq5Var, i6 & 1022, (i6 >> 12) & 126);
            z4 = z6;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new aj6(z, h5lVar, emlVar, c6hVar, yciVar, z4, i, i2);
        }
    }

    public static final void b(final boolean z, final h5l h5lVar, eml emlVar, final Function0 function0, final Function0 function02, final Function0 function03, final Function1 function1, final Function1 function12, final Function1 function13, final Function1 function14, final yci yciVar, final boolean z2, hq5 hq5Var, final int i, final int i2) {
        int i3;
        int i4;
        float f;
        j1g j1gVar;
        f5l f5lVar;
        f5l f5lVar2;
        vci vciVar;
        MinimumInteractiveModifier minimumInteractiveModifier;
        int i5;
        boolean z3;
        int i6;
        int i7;
        boolean z4;
        String n;
        String str;
        int i8;
        int i9;
        boolean z5;
        String n2;
        String str2;
        yci k;
        boolean z6;
        final eml emlVar2 = emlVar;
        h5lVar.getClass();
        f5l f5lVar3 = h5lVar.c;
        f5l f5lVar4 = h5lVar.b;
        emlVar2.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        function1.getClass();
        function12.getClass();
        function13.getClass();
        function14.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1621563556);
        if ((i & 6) == 0) {
            i3 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? oq5Var.f(h5lVar) : oq5Var.h(h5lVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.f(emlVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= oq5Var.h(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= oq5Var.h(function02) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i3 |= oq5Var.h(function03) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((i & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
            i3 |= oq5Var.h(function1) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= oq5Var.h(function12) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((i & 100663296) == 0) {
            i3 |= oq5Var.h(function13) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= oq5Var.h(function14) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        int i10 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (oq5Var.f(yciVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.g(z2) ? 32 : 16;
        }
        int i11 = i4;
        if ((i10 & 306783379) == 306783378 && (i11 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci a2 = a.a(yciVar, "controls");
            nho a3 = lho.a(qx0.g, b2c.l, oq5Var, 54);
            int i12 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i12))) {
                ouj.x(i12, oq5Var, i12, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            boolean z7 = emlVar2.c;
            j1g j1gVar2 = emlVar2.a;
            float f2 = d;
            vci vciVar2 = vci.a;
            MinimumInteractiveModifier minimumInteractiveModifier2 = MinimumInteractiveModifier.a;
            if (z7) {
                oq5Var.Z(176222190);
                if (z2) {
                    oq5Var.Z(176289770);
                    k = f(oq5Var);
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(176382894);
                    oq5Var.p(false);
                    k = androidx.compose.foundation.layout.a.k(vciVar2, -f2, 0.0f, 2);
                }
                j1g j1gVar3 = j1g.c;
                yci c2 = b.c(a.a(ksw.D(k, rvf.M(R.string.menu_element_dislike, oq5Var), rvf.M(j1gVar2 == j1gVar3 ? R.string.accessibility_uncheck_action : R.string.accessibility_check_action, oq5Var)), "dislike_button"), "is_disliked", Boolean.valueOf(j1gVar2 == j1gVar3));
                wn5 C = ild.C(-1264035359, new kv4(17, emlVar2), oq5Var);
                if (z2) {
                    oq5Var.Z(177343491);
                    saf.g(((i10 >> 12) & 14) | 384, ild.C(-713306774, new j26(C, 1), oq5Var), oq5Var, c2, function02);
                    z6 = false;
                    oq5Var.p(false);
                    vciVar = vciVar2;
                    j1gVar = j1gVar2;
                    f5lVar = f5lVar4;
                    f5lVar2 = f5lVar3;
                    f = f2;
                    minimumInteractiveModifier = minimumInteractiveModifier2;
                } else {
                    oq5Var.Z(177475024);
                    j1gVar = j1gVar2;
                    minimumInteractiveModifier = minimumInteractiveModifier2;
                    f5lVar = f5lVar4;
                    f5lVar2 = f5lVar3;
                    f = f2;
                    vciVar = vciVar2;
                    aae.a(function02, c2, false, ild.C(-743185765, new y61(C, 10), oq5Var), oq5Var, ((i10 >> 12) & 14) | 24576, 12);
                    z6 = false;
                    oq5Var.p(false);
                }
                oq5Var.p(z6);
            } else {
                f = f2;
                j1gVar = j1gVar2;
                f5lVar = f5lVar4;
                f5lVar2 = f5lVar3;
                vciVar = vciVar2;
                minimumInteractiveModifier = minimumInteractiveModifier2;
                oq5Var.Z(177603085);
                agr agrVar = yre.a;
                u1g.l(oq5Var, minimumInteractiveModifier);
                oq5Var.p(false);
            }
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            u1g.l(oq5Var, new LayoutWeightElement(true, 1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE));
            g5l g5lVar = h5lVar.a;
            f5l f5lVar5 = f5l.a;
            kjn kjnVar = gq5.a;
            if (f5lVar != f5lVar5) {
                i5 = 29360128;
                oq5Var.Z(177869530);
                int ordinal = g5lVar.ordinal();
                if (ordinal != 0) {
                    i8 = 1;
                    if (ordinal != 1) {
                        b6e.s();
                        return;
                    }
                    i9 = R.drawable.ic_seek_15_big_24;
                } else {
                    i8 = 1;
                    i9 = R.drawable.ic_backward_big_24;
                }
                int i13 = i9;
                int ordinal2 = g5lVar.ordinal();
                if (ordinal2 == 0) {
                    z5 = false;
                    n2 = vz1.n(oq5Var, 1391222144, R.string.player_previous_description, oq5Var, false);
                } else {
                    if (ordinal2 != i8) {
                        throw vz1.i(oq5Var, 1391219498, false);
                    }
                    oq5Var.Z(1391226242);
                    n2 = rvf.N(R.string.player_seek_backward_description, new Object[]{15}, oq5Var);
                    z5 = false;
                    oq5Var.p(false);
                }
                String str3 = n2;
                oq5Var.Z(1391234737);
                yci f3 = z2 ? f(oq5Var) : vciVar;
                oq5Var.p(z5);
                int ordinal3 = g5lVar.ordinal();
                if (ordinal3 == 0) {
                    str2 = "previous_button";
                } else {
                    if (ordinal3 != 1) {
                        b6e.s();
                        return;
                    }
                    str2 = "seek_backward_button";
                }
                yci a4 = a.a(f3, str2);
                boolean z8 = f5lVar == f5l.c;
                boolean z9 = ((i10 & 3670016) == 1048576) | ((i10 & 112) == 32 || ((i10 & 64) != 0 && oq5Var.h(h5lVar)));
                Object K = oq5Var.K();
                if (z9 || K == kjnVar) {
                    final int i14 = 0;
                    K = new Function0() { // from class: cj6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i14) {
                                case 0:
                                    function1.invoke(h5lVar.a);
                                    break;
                                default:
                                    function1.invoke(h5lVar.a);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var.k0(K);
                }
                d((Function0) K, function13, z8, c, i13, str3, a4, z2, oq5Var, ((i10 >> 21) & 112) | 3072 | ((i11 << 18) & 29360128));
                oq5Var.p(false);
            } else {
                i5 = 29360128;
                oq5Var.Z(179546413);
                agr agrVar2 = yre.a;
                u1g.l(oq5Var, minimumInteractiveModifier);
                oq5Var.p(false);
            }
            e(b, function03, b.c(a.a(androidx.compose.foundation.layout.a.o(vciVar, 16, 0.0f, 2), "play_pause_button"), "is_playing", Boolean.valueOf(z)), false, null, ild.C(1636814317, new sm(19, z), oq5Var), oq5Var, ((i10 >> 12) & 112) | 196614);
            if (f5lVar2 != f5lVar5) {
                oq5Var.Z(180636962);
                int ordinal4 = g5lVar.ordinal();
                if (ordinal4 != 0) {
                    i6 = 1;
                    if (ordinal4 != 1) {
                        b6e.s();
                        return;
                    }
                    i7 = R.drawable.ic_seek_30_big_24;
                } else {
                    i6 = 1;
                    i7 = R.drawable.ic_forward_big_24;
                }
                int i15 = i7;
                int ordinal5 = g5lVar.ordinal();
                if (ordinal5 == 0) {
                    z4 = false;
                    n = vz1.n(oq5Var, 1391311164, R.string.player_skip_description, oq5Var, false);
                } else {
                    if (ordinal5 != i6) {
                        throw vz1.i(oq5Var, 1391308516, false);
                    }
                    oq5Var.Z(1391315136);
                    n = rvf.N(R.string.player_seek_forward_description, new Object[]{30}, oq5Var);
                    z4 = false;
                    oq5Var.p(false);
                }
                String str4 = n;
                oq5Var.Z(1391323569);
                yci f4 = z2 ? f(oq5Var) : vciVar;
                oq5Var.p(z4);
                int ordinal6 = g5lVar.ordinal();
                if (ordinal6 == 0) {
                    str = "skip_button";
                } else {
                    if (ordinal6 != 1) {
                        b6e.s();
                        return;
                    }
                    str = "seek_forward_button";
                }
                yci a5 = a.a(f4, str);
                boolean z10 = f5lVar2 == f5l.c;
                boolean z11 = ((i10 & i5) == 8388608) | ((i10 & 112) == 32 || ((i10 & 64) != 0 && oq5Var.h(h5lVar)));
                Object K2 = oq5Var.K();
                if (z11 || K2 == kjnVar) {
                    final int i16 = 1;
                    K2 = new Function0() { // from class: cj6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i16) {
                                case 0:
                                    function12.invoke(h5lVar.a);
                                    break;
                                default:
                                    function12.invoke(h5lVar.a);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var.k0(K2);
                }
                d((Function0) K2, function14, z10, c, i15, str4, a5, z2, oq5Var, ((i10 >> 24) & 112) | 3072 | ((i11 << 18) & i5));
                oq5Var.p(false);
            } else {
                oq5Var.Z(182275405);
                agr agrVar3 = yre.a;
                u1g.l(oq5Var, minimumInteractiveModifier);
                oq5Var.p(false);
            }
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            u1g.l(oq5Var, new LayoutWeightElement(true, 1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f));
            emlVar2 = emlVar;
            if (emlVar2.b) {
                oq5Var.Z(182477432);
                boolean z12 = j1gVar == j1g.a;
                if (z2) {
                    oq5Var.Z(182561225);
                    saf.g(((i10 >> 9) & 14) | 384, ild.C(1993262947, new xu0(9, z12), oq5Var), oq5Var, b.c(a.a(ksw.D(f(oq5Var), rvf.M(R.string.menu_element_like, oq5Var), rvf.M(z12 ? R.string.accessibility_uncheck_action : R.string.accessibility_check_action, oq5Var)), "like_button"), "is_liked", Boolean.valueOf(z12)), function0);
                    oq5Var.p(false);
                    z3 = false;
                } else {
                    oq5Var.Z(183543398);
                    yci m = d.m(vciVar, c);
                    agr agrVar4 = eq0.a;
                    z3 = false;
                    saf.q(z12, function0, androidx.compose.foundation.layout.a.k(vciVar, f, 0.0f, 2), m, ((dq0) oq5Var.j(agrVar4)).a.a, ((dq0) oq5Var.j(agrVar4)).a.c, oq5Var, ((i10 >> 6) & 112) | 3456, 0);
                    oq5Var = oq5Var;
                    oq5Var.p(false);
                }
                oq5Var.p(z3);
            } else {
                oq5Var.Z(183940973);
                agr agrVar5 = yre.a;
                u1g.l(oq5Var, minimumInteractiveModifier);
                oq5Var.p(false);
            }
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: dj6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(i | 1);
                    int R2 = rvf.R(i2);
                    fj6.b(z, h5lVar, emlVar2, function0, function02, function03, function1, function12, function13, function14, yciVar, z2, (hq5) obj, R, R2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1016399319);
        if (((i | 6) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            nho a2 = lho.a(qx0.a, b2c.l, oq5Var, 48);
            int i2 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yciVar2 = vci.a;
            yci H = vnj.H(oq5Var, yciVar2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            float f = c;
            yci m = d.m(yciVar2, f);
            tgo tgoVar = ugo.a;
            pm0.c(xp3.u(m, tgoVar), oq5Var, 0);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            u1g.l(oq5Var, new LayoutWeightElement(true, 1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f));
            pm0.c(xp3.u(d.m(yciVar2, f), tgoVar), oq5Var, 0);
            pm0.c(xp3.u(d.m(androidx.compose.foundation.layout.a.o(yciVar2, a + 12, 0.0f, 2), b), tgoVar), oq5Var, 0);
            pm0.c(xp3.u(d.m(yciVar2, f), tgoVar), oq5Var, 0);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            u1g.l(oq5Var, new LayoutWeightElement(true, 1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f));
            pm0.c(xp3.u(d.m(yciVar2, f), tgoVar), oq5Var, 0);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u71(yciVar2, i, 24);
        }
    }

    public static final void d(final Function0 function0, final Function1 function1, final boolean z, final float f, final int i, final String str, final yci yciVar, final boolean z2, hq5 hq5Var, final int i2) {
        int i3;
        String str2;
        aqi aqiVar;
        yci f2;
        boolean z3;
        long j;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(267101766);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.g(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.c(f) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var.d(i) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            str2 = str;
            i3 |= oq5Var.f(str2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        } else {
            str2 = str;
        }
        if ((1572864 & i2) == 0) {
            i3 |= oq5Var.f(yciVar) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= oq5Var.g(z2) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((4793491 & i3) == 4793490 && oq5Var.z()) {
            oq5Var.S();
        } else {
            aqi o0 = szf.o0(function0, oq5Var);
            Object o02 = szf.o0(Boolean.valueOf(z), oq5Var);
            Object K = oq5Var.K();
            Object obj = gq5.a;
            if (K == obj) {
                K = vz1.h(oq5Var);
            }
            uoi uoiVar = (uoi) K;
            Object K2 = oq5Var.K();
            if (K2 == obj) {
                K2 = szf.g0(Boolean.FALSE);
                oq5Var.k0(K2);
            }
            aqi aqiVar2 = (aqi) K2;
            geo a2 = z2 ? eeo.a(0.0f, 6, 0L, true) : eeo.a(24, 4, 0L, false);
            agr agrVar = yre.a;
            yci a3 = e.a(yciVar.f(MinimumInteractiveModifier.a), uoiVar, a2);
            boolean f3 = oq5Var.f(o02) | ((i3 & 112) == 32) | oq5Var.f(o0);
            Object K3 = oq5Var.K();
            if (f3 || K3 == obj) {
                K3 = new xg(function1, o02, aqiVar2, uoiVar, o0, (Continuation) null, 6);
                aqiVar = o0;
                oq5Var.k0(K3);
            } else {
                aqiVar = o0;
            }
            f2 = a3.f(new SuspendPointerInputElement(uoiVar, null, null, new dur((Function2) K3), 6));
            boolean f4 = oq5Var.f(aqiVar) | ((i3 & 896) == 256);
            Object K4 = oq5Var.K();
            if (f4 || K4 == obj) {
                z3 = true;
                K4 = new pi6(z, aqiVar, 1);
                oq5Var.k0(K4);
            } else {
                z3 = true;
            }
            yci b2 = nfp.b(f2, z3, (Function1) K4);
            kfh d2 = ug3.d(b2c.f, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, b2);
            xp5.T.getClass();
            Function0 function02 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(function02);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            yci m = d.m(vci.a, f);
            int i5 = i3 >> 12;
            w4k E = a0g.E(i, i5 & 14, oq5Var);
            if (z) {
                oq5Var.Z(-1786467769);
                j = ((dq0) oq5Var.j(eq0.a)).a.a;
                oq5Var.p(false);
            } else {
                oq5Var.Z(-1786403258);
                j = ((dq0) oq5Var.j(eq0.a)).a.e;
                oq5Var.p(false);
            }
            gae.b(E, str2, m, j, oq5Var, i5 & 112, 0);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: bj6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    fj6.d(Function0.this, function1, z, f, i, str, yciVar, z2, (hq5) obj2, rvf.R(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(float f, Function0 function0, yci yciVar, boolean z, uoi uoiVar, wn5 wn5Var, hq5 hq5Var, int i) {
        int i2;
        uoi uoiVar2;
        boolean z2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2049286764);
        if ((i & 6) == 0) {
            i2 = (oq5Var.c(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        int i3 = i2 | 27648;
        if ((196608 & i) == 0) {
            i3 |= oq5Var.h(wn5Var) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((74899 & i3) == 74898 && oq5Var.z()) {
            oq5Var.S();
            z2 = z;
            uoiVar2 = uoiVar;
        } else {
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = vz1.h(oq5Var);
            }
            uoi uoiVar3 = (uoi) K;
            yci m = d.m(yciVar, f);
            agr agrVar = yre.a;
            yci d2 = androidx.compose.foundation.a.d(m.f(MinimumInteractiveModifier.a), uoiVar3, eeo.a(f / 2, 4, 0L, false), true, null, new meo(0), function0, 8);
            kfh d3 = ug3.d(b2c.f, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, d2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d3, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            oq5Var.Z(189717497);
            qs5 qs5Var = mb6.a;
            float floatValue = ((Number) oq5Var.j(qs5Var)).floatValue();
            oq5Var.p(false);
            etn.l(qs5Var.a(Float.valueOf(floatValue)), wn5Var, oq5Var, ((i3 >> 12) & 112) | 8);
            oq5Var.p(true);
            uoiVar2 = uoiVar3;
            z2 = true;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new qi6(f, function0, yciVar, z2, uoiVar2, wn5Var, i, 1);
        }
    }

    public static final yci f(hq5 hq5Var) {
        return androidx.compose.foundation.a.b(xp3.u(d.n(e, vci.a), ugo.a), ((dq0) ((oq5) hq5Var).j(eq0.a)).d.c, vnj.i);
    }
}
