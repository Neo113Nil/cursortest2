package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.p;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class zhk implements qfy0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [com.yandex.div.json.expressions.Expression] */
    public static whk b(yf90 yf90Var, aik aikVar, JSONObject jSONObject) {
        exq exqVar = aikVar.a;
        tms tmsVar = wm11.b;
        tls tlsVar = b.h;
        z3k z3kVar = p.e;
        kvo kvoVar = p.a;
        Expression n = xcx.n(yf90Var, exqVar, jSONObject, "duration", tmsVar, tlsVar, z3kVar, kvoVar);
        if (n == null) {
            n = kvoVar;
        }
        exq exqVar2 = aikVar.b;
        qkj qkjVar = p.d;
        tls tlsVar2 = DivAnimationInterpolator.FROM_STRING;
        kvo kvoVar2 = p.b;
        Expression o = xcx.o(yf90Var, exqVar2, jSONObject, "interpolator", qkjVar, tlsVar2, kvoVar2);
        if (o == null) {
            o = kvoVar2;
        }
        exq exqVar3 = aikVar.c;
        z3k z3kVar2 = p.f;
        kvo kvoVar3 = p.c;
        ?? n2 = xcx.n(yf90Var, exqVar3, jSONObject, "start_delay", tmsVar, tlsVar, z3kVar2, kvoVar3);
        if (n2 != 0) {
            kvoVar3 = n2;
        }
        return new whk(n, o, kvoVar3);
    }

    @Override // defpackage.qfy0
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, hex hexVar, JSONObject jSONObject) {
        return b(yf90Var, (aik) hexVar, jSONObject);
    }
}
