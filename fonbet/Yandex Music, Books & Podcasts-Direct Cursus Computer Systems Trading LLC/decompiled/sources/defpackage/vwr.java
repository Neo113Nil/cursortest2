package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.lazy.a;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import com.yandex.music.core.ui.compose.b;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class vwr extends uif implements ryc {
    public final /* synthetic */ List r;
    public final /* synthetic */ a3h s;
    public final /* synthetic */ int t;
    public final /* synthetic */ otb u;
    public final /* synthetic */ Function1 v;
    public final /* synthetic */ Function0 w;
    public final /* synthetic */ List x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vwr(List list, a3h a3hVar, int i, otb otbVar, Function1 function1, Function0 function0, List list2) {
        super(4);
        this.r = list;
        this.s = a3hVar;
        this.t = i;
        this.u = otbVar;
        this.v = function1;
        this.w = function0;
        this.x = list2;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        float f;
        Object b;
        a3h a3hVar;
        Object obj5;
        float f2;
        boolean f3;
        Object K;
        boolean f4;
        Object K2;
        boolean f5;
        Object K3;
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
            ywr ywrVar = (ywr) this.r.get(intValue);
            oq5Var.Z(-678262230);
            a3h a3hVar2 = a3h.a;
            int i2 = this.t;
            a3h a3hVar3 = this.s;
            if (a3hVar3 != a3hVar2) {
                if (intValue < i2) {
                    f = 0.0f;
                } else if (intValue != i2) {
                    f = intValue == i2 + 1 ? 0.3f : intValue == i2 + 2 ? 0.1f : 0.05f;
                }
                b = pk0.b(f, null, null, null, oq5Var, 0, 30);
                float f6 = 68;
                float f7 = 32;
                float f8 = this.u.d;
                float f9 = f8 / (f8 - (2 * f6));
                a3hVar = a3h.b;
                if (a3hVar3 == a3hVar || intValue != i2) {
                    obj5 = b;
                    f2 = 1.0f;
                } else {
                    if (1.33f <= f9) {
                        f9 = 1.33f;
                    }
                    float f10 = f9;
                    obj5 = b;
                    f2 = f10;
                }
                Object obj6 = obj5;
                Object b2 = pk0.b(f2, null, null, null, oq5Var, 0, 30);
                String str = ywrVar.b;
                ges d = nu0.d();
                long j = ((dq0) oq5Var.j(eq0.a)).b.a;
                yci d2 = d.d(vci.a, 1.0f);
                Function1 function1 = this.v;
                boolean f11 = oq5Var.f(function1) | oq5Var.f(ywrVar);
                Function0 function0 = this.w;
                f3 = f11 | oq5Var.f(function0);
                int i3 = i;
                K = oq5Var.K();
                Object obj7 = gq5.a;
                if (!f3 || K == obj7) {
                    K = new uwr(function1, ywrVar, function0);
                    oq5Var.k0(K);
                }
                PointerInputEventHandler pointerInputEventHandler = (PointerInputEventHandler) K;
                ffm ffmVar = eur.a;
                yci f12 = d2.f(new SuspendPointerInputElement(ywrVar, function1, null, pointerInputEventHandler, 4));
                List list = this.x;
                f4 = oq5Var.f(list) | ((((i3 & 112) ^ 48) <= 32 && oq5Var.d(intValue)) || (i3 & 48) == 32);
                K2 = oq5Var.K();
                if (!f4 || K2 == obj7) {
                    K2 = new l50(list, intValue);
                    oq5Var.k0(K2);
                }
                yci n = androidx.compose.foundation.layout.a.n(androidx.compose.ui.layout.a.f(f12, (Function1) K2), f6, f7);
                f5 = oq5Var.f(b2) | oq5Var.f(obj6);
                K3 = oq5Var.K();
                if (!f5 || K3 == obj7) {
                    K3 = new kw1(3, b2, obj6);
                    oq5Var.k0(K3);
                }
                xcs.b(str, b.b(b.c(androidx.compose.ui.platform.a.a(androidx.compose.ui.graphics.a.a(n, (Function1) K3), "lyric"), "focused_lyric", Boolean.valueOf(intValue != i2 && a3hVar3 == a3hVar)), intValue), j, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, d, oq5Var, 0, 0, 65016);
                oq5Var.p(false);
            }
            f = 1.0f;
            b = pk0.b(f, null, null, null, oq5Var, 0, 30);
            float f62 = 68;
            float f72 = 32;
            float f82 = this.u.d;
            float f92 = f82 / (f82 - (2 * f62));
            a3hVar = a3h.b;
            if (a3hVar3 == a3hVar) {
            }
            obj5 = b;
            f2 = 1.0f;
            Object obj62 = obj5;
            Object b22 = pk0.b(f2, null, null, null, oq5Var, 0, 30);
            String str2 = ywrVar.b;
            ges d3 = nu0.d();
            long j2 = ((dq0) oq5Var.j(eq0.a)).b.a;
            yci d22 = d.d(vci.a, 1.0f);
            Function1 function12 = this.v;
            boolean f112 = oq5Var.f(function12) | oq5Var.f(ywrVar);
            Function0 function02 = this.w;
            f3 = f112 | oq5Var.f(function02);
            int i32 = i;
            K = oq5Var.K();
            Object obj72 = gq5.a;
            if (!f3) {
            }
            K = new uwr(function12, ywrVar, function02);
            oq5Var.k0(K);
            PointerInputEventHandler pointerInputEventHandler2 = (PointerInputEventHandler) K;
            ffm ffmVar2 = eur.a;
            yci f122 = d22.f(new SuspendPointerInputElement(ywrVar, function12, null, pointerInputEventHandler2, 4));
            List list2 = this.x;
            f4 = oq5Var.f(list2) | ((((i32 & 112) ^ 48) <= 32 && oq5Var.d(intValue)) || (i32 & 48) == 32);
            K2 = oq5Var.K();
            if (!f4) {
            }
            K2 = new l50(list2, intValue);
            oq5Var.k0(K2);
            yci n2 = androidx.compose.foundation.layout.a.n(androidx.compose.ui.layout.a.f(f122, (Function1) K2), f62, f72);
            f5 = oq5Var.f(b22) | oq5Var.f(obj62);
            K3 = oq5Var.K();
            if (!f5) {
            }
            K3 = new kw1(3, b22, obj62);
            oq5Var.k0(K3);
            xcs.b(str2, b.b(b.c(androidx.compose.ui.platform.a.a(androidx.compose.ui.graphics.a.a(n2, (Function1) K3), "lyric"), "focused_lyric", Boolean.valueOf(intValue != i2 && a3hVar3 == a3hVar)), intValue), j2, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, d3, oq5Var, 0, 0, 65016);
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }
}
