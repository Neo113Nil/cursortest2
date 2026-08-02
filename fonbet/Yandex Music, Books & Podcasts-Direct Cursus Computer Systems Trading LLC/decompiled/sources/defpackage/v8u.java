package defpackage;

import androidx.compose.foundation.lazy.a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class v8u extends uif implements ryc {
    public final /* synthetic */ sdr A;
    public final /* synthetic */ sdr B;
    public final /* synthetic */ sdr C;
    public final /* synthetic */ i2u D;
    public final /* synthetic */ i2u E;
    public final /* synthetic */ i2u F;
    public final /* synthetic */ List r;
    public final /* synthetic */ y8u s;
    public final /* synthetic */ atb t;
    public final /* synthetic */ float u;
    public final /* synthetic */ float v;
    public final /* synthetic */ aqi w;
    public final /* synthetic */ i2u x;
    public final /* synthetic */ sdr y;
    public final /* synthetic */ sdr z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8u(List list, y8u y8uVar, atb atbVar, float f, float f2, aqi aqiVar, i2u i2uVar, sdr sdrVar, sdr sdrVar2, sdr sdrVar3, sdr sdrVar4, sdr sdrVar5, i2u i2uVar2, i2u i2uVar3, i2u i2uVar4) {
        super(4);
        this.r = list;
        this.s = y8uVar;
        this.t = atbVar;
        this.u = f;
        this.v = f2;
        this.w = aqiVar;
        this.x = i2uVar;
        this.y = sdrVar;
        this.z = sdrVar2;
        this.A = sdrVar3;
        this.B = sdrVar4;
        this.C = sdrVar5;
        this.D = i2uVar2;
        this.E = i2uVar3;
        this.F = i2uVar4;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fd  */
    @Override // defpackage.ryc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        m6u m6uVar;
        boolean h;
        Object K;
        boolean h2;
        Object K2;
        boolean h3;
        Object K3;
        boolean h4;
        Object K4;
        boolean h5;
        Object K5;
        boolean h6;
        Object K6;
        boolean h7;
        Object K7;
        boolean h8;
        Object K8;
        a aVar = (a) obj;
        int intValue = ((Number) obj2).intValue();
        hq5 hq5Var = (hq5) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (((oq5) hq5Var).f(aVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((oq5) hq5Var).d(intValue) ? 32 : 16;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(i & 1, (i & 147) != 146)) {
            m4u m4uVar = (m4u) this.r.get(intValue);
            oq5Var.Z(996426799);
            aqi aqiVar = this.w;
            int intValue3 = ((Number) aqiVar.getValue()).intValue();
            Function1 function1 = null;
            Object obj5 = gq5.a;
            y8u y8uVar = this.s;
            if (intValue == intValue3) {
                oq5Var.Z(170688164);
                String str = m4uVar.a.b;
                boolean h9 = oq5Var.h(y8uVar) | oq5Var.f(m4uVar);
                Object K9 = oq5Var.K();
                if (h9 || K9 == obj5) {
                    K9 = new i6u(y8uVar, m4uVar, null, 1);
                    oq5Var.k0(K9);
                }
                gld.w(oq5Var, str, (Function2) K9);
            } else {
                oq5Var.Z(986205633);
            }
            oq5Var.p(false);
            atb atbVar = intValue == ((Number) aqiVar.getValue()).intValue() ? this.t : null;
            i2u i2uVar = this.x;
            if (intValue == w8u.f(i2uVar)) {
                sdr sdrVar = this.y;
                if (Intrinsics.d(((m6u) sdrVar.getValue()).a, m4uVar.a.b)) {
                    m6uVar = (m6u) sdrVar.getValue();
                    boolean booleanValue = intValue != ((Number) aqiVar.getValue()).intValue() ? ((Boolean) this.z.getValue()).booleanValue() : false;
                    boolean booleanValue2 = ((Boolean) this.A.getValue()).booleanValue();
                    boolean booleanValue3 = ((Boolean) this.B.getValue()).booleanValue();
                    boolean booleanValue4 = ((Boolean) this.C.getValue()).booleanValue();
                    h = oq5Var.h(y8uVar);
                    K = oq5Var.K();
                    if (!h || K == obj5) {
                        Object j6uVar = new j6u(0, y8uVar, y8u.class, "play", "play()V", 0, 6);
                        oq5Var.k0(j6uVar);
                        K = j6uVar;
                    }
                    h9f h9fVar = (h9f) K;
                    h2 = oq5Var.h(y8uVar);
                    K2 = oq5Var.K();
                    if (!h2 || K2 == obj5) {
                        K2 = new j6u(0, y8uVar, y8u.class, "pause", "pause()V", 0, 7);
                        oq5Var.k0(K2);
                    }
                    h9f h9fVar2 = (h9f) K2;
                    h3 = oq5Var.h(y8uVar);
                    K3 = oq5Var.K();
                    if (!h3 || K3 == obj5) {
                        Object j6uVar2 = new j6u(0, y8uVar, y8u.class, "toggleMute", "toggleMute()V", 0, 8);
                        oq5Var.k0(j6uVar2);
                        K3 = j6uVar2;
                    }
                    h9f h9fVar3 = (h9f) K3;
                    h4 = oq5Var.h(y8uVar);
                    K4 = oq5Var.K();
                    if (!h4 || K4 == obj5) {
                        Object j6uVar3 = new j6u(0, y8uVar, y8u.class, "toggleLike", "toggleLike()V", 0, 9);
                        oq5Var.k0(j6uVar3);
                        K4 = j6uVar3;
                    }
                    h9f h9fVar4 = (h9f) K4;
                    h5 = oq5Var.h(y8uVar);
                    K5 = oq5Var.K();
                    if (!h5 || K5 == obj5) {
                        Object j6uVar4 = new j6u(0, y8uVar, y8u.class, "showOverflow", "showOverflow()V", 0, 10);
                        oq5Var.k0(j6uVar4);
                        K5 = j6uVar4;
                    }
                    h9f h9fVar5 = (h9f) K5;
                    h6 = oq5Var.h(y8uVar);
                    K6 = oq5Var.K();
                    if (!h6 || K6 == obj5) {
                        Object lgqVar = new lgq(1, y8uVar, y8u.class, "seekTo", "seekTo(F)V", 0, 20);
                        oq5Var.k0(lgqVar);
                        K6 = lgqVar;
                    }
                    h9f h9fVar6 = (h9f) K6;
                    h7 = oq5Var.h(y8uVar);
                    K7 = oq5Var.K();
                    if (!h7 || K7 == obj5) {
                        Object j6uVar5 = new j6u(0, y8uVar, y8u.class, "expandPlayer", "expandPlayer()V", 0, 11);
                        oq5Var.k0(j6uVar5);
                        K7 = j6uVar5;
                    }
                    h9f h9fVar7 = (h9f) K7;
                    if (w8u.f(i2uVar) != intValue) {
                        oq5Var.Z(998012324);
                        float f = this.u;
                        boolean c = oq5Var.c(f);
                        float f2 = this.v;
                        boolean c2 = c | oq5Var.c(f2);
                        Object K10 = oq5Var.K();
                        if (c2 || K10 == obj5) {
                            K10 = new bsa(this.D, f, f2);
                            oq5Var.k0(K10);
                        }
                        function1 = (Function1) K10;
                        oq5Var.p(false);
                    } else {
                        oq5Var.Z(998293525);
                        oq5Var.p(false);
                    }
                    Function1 function12 = function1;
                    h8 = oq5Var.h(y8uVar);
                    K8 = oq5Var.K();
                    if (!h8 || K8 == obj5) {
                        Object j6uVar6 = new j6u(0, y8uVar, y8u.class, "toggleControlsFromAccessibility", "toggleControlsFromAccessibility()V", 0, 5);
                        oq5Var.k0(j6uVar6);
                        K8 = j6uVar6;
                    }
                    h9f h9fVar8 = (h9f) K8;
                    i2u i2uVar2 = this.D;
                    i2u i2uVar3 = this.E;
                    i2u i2uVar4 = this.x;
                    Function0 function0 = (Function0) h9fVar8;
                    w8u.c(m4uVar, atbVar, m6uVar, booleanValue, booleanValue2, booleanValue3, booleanValue4, (Function0) h9fVar, (Function0) h9fVar2, (Function0) h9fVar3, (Function0) h9fVar7, new k50(intValue, i2uVar2, y8uVar, i2uVar3, i2uVar4), (Function1) h9fVar6, (Function0) h9fVar4, (Function0) h9fVar5, function12, new i25(intValue, i2uVar4, this.F), function0, oq5Var, 0, 0);
                    oq5Var.p(false);
                }
            }
            m6uVar = null;
            if (intValue != ((Number) aqiVar.getValue()).intValue()) {
            }
            boolean booleanValue22 = ((Boolean) this.A.getValue()).booleanValue();
            boolean booleanValue32 = ((Boolean) this.B.getValue()).booleanValue();
            boolean booleanValue42 = ((Boolean) this.C.getValue()).booleanValue();
            h = oq5Var.h(y8uVar);
            K = oq5Var.K();
            if (!h) {
            }
            Object j6uVar7 = new j6u(0, y8uVar, y8u.class, "play", "play()V", 0, 6);
            oq5Var.k0(j6uVar7);
            K = j6uVar7;
            h9f h9fVar9 = (h9f) K;
            h2 = oq5Var.h(y8uVar);
            K2 = oq5Var.K();
            if (!h2) {
            }
            K2 = new j6u(0, y8uVar, y8u.class, "pause", "pause()V", 0, 7);
            oq5Var.k0(K2);
            h9f h9fVar22 = (h9f) K2;
            h3 = oq5Var.h(y8uVar);
            K3 = oq5Var.K();
            if (!h3) {
            }
            Object j6uVar22 = new j6u(0, y8uVar, y8u.class, "toggleMute", "toggleMute()V", 0, 8);
            oq5Var.k0(j6uVar22);
            K3 = j6uVar22;
            h9f h9fVar32 = (h9f) K3;
            h4 = oq5Var.h(y8uVar);
            K4 = oq5Var.K();
            if (!h4) {
            }
            Object j6uVar32 = new j6u(0, y8uVar, y8u.class, "toggleLike", "toggleLike()V", 0, 9);
            oq5Var.k0(j6uVar32);
            K4 = j6uVar32;
            h9f h9fVar42 = (h9f) K4;
            h5 = oq5Var.h(y8uVar);
            K5 = oq5Var.K();
            if (!h5) {
            }
            Object j6uVar42 = new j6u(0, y8uVar, y8u.class, "showOverflow", "showOverflow()V", 0, 10);
            oq5Var.k0(j6uVar42);
            K5 = j6uVar42;
            h9f h9fVar52 = (h9f) K5;
            h6 = oq5Var.h(y8uVar);
            K6 = oq5Var.K();
            if (!h6) {
            }
            Object lgqVar2 = new lgq(1, y8uVar, y8u.class, "seekTo", "seekTo(F)V", 0, 20);
            oq5Var.k0(lgqVar2);
            K6 = lgqVar2;
            h9f h9fVar62 = (h9f) K6;
            h7 = oq5Var.h(y8uVar);
            K7 = oq5Var.K();
            if (!h7) {
            }
            Object j6uVar52 = new j6u(0, y8uVar, y8u.class, "expandPlayer", "expandPlayer()V", 0, 11);
            oq5Var.k0(j6uVar52);
            K7 = j6uVar52;
            h9f h9fVar72 = (h9f) K7;
            if (w8u.f(i2uVar) != intValue) {
            }
            Function1 function122 = function1;
            h8 = oq5Var.h(y8uVar);
            K8 = oq5Var.K();
            if (!h8) {
            }
            Object j6uVar62 = new j6u(0, y8uVar, y8u.class, "toggleControlsFromAccessibility", "toggleControlsFromAccessibility()V", 0, 5);
            oq5Var.k0(j6uVar62);
            K8 = j6uVar62;
            h9f h9fVar82 = (h9f) K8;
            i2u i2uVar22 = this.D;
            i2u i2uVar32 = this.E;
            i2u i2uVar42 = this.x;
            Function0 function02 = (Function0) h9fVar82;
            w8u.c(m4uVar, atbVar, m6uVar, booleanValue, booleanValue22, booleanValue32, booleanValue42, (Function0) h9fVar9, (Function0) h9fVar22, (Function0) h9fVar32, (Function0) h9fVar72, new k50(intValue, i2uVar22, y8uVar, i2uVar32, i2uVar42), (Function1) h9fVar62, (Function0) h9fVar42, (Function0) h9fVar52, function122, new i25(intValue, i2uVar42, this.F), function02, oq5Var, 0, 0);
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }
}
