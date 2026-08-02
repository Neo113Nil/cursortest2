package defpackage;

import com.ybsdk.core.analytics.generated.delegates.CardCommonEvents$CardReissuePollingResultResult;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.card.internal.entities.GetApplicationStatusEntity$Status;
import com.ybsdk.feature.card.internal.presentation.cardreissue.a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class qm8 implements vpr {
    public final /* synthetic */ a a;

    public qm8(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        gm8 gm8Var;
        Text text;
        Text text2;
        r0 r0Var3;
        Object value3;
        Text.Constant i;
        Text g;
        r0 r0Var4;
        Object value4;
        r0 r0Var5;
        Object value5;
        r0 r0Var6;
        Object value6;
        g13 g13Var = (g13) obj;
        boolean z = g13Var instanceof e13;
        a aVar = this.a;
        if (z) {
            dqg dqgVar = ((e13) g13Var).a;
            if (dqgVar instanceof cqg) {
                c3t c3tVar = (c3t) ((cqg) dqgVar).a;
                GetApplicationStatusEntity$Status getApplicationStatusEntity$Status = c3tVar.a;
                Text.Constant constant = c3tVar.c;
                Text.Constant constant2 = c3tVar.b;
                int i2 = pm8.a[getApplicationStatusEntity$Status.ordinal()];
                if (i2 == 1) {
                    Text.Resource resource = a.I;
                    pz40 Y = aVar.Y();
                    do {
                        r0Var4 = (r0) Y;
                        value4 = r0Var4.getValue();
                    } while (!r0Var4.k(value4, new gm8(constant2, constant, c3tVar.d, c3tVar.e, c3tVar.g)));
                } else if (i2 == 2) {
                    aVar.F.a.k.h(CardCommonEvents$CardReissuePollingResultResult.OK, null);
                    pz40 Y2 = aVar.Y();
                    do {
                        r0Var5 = (r0) Y2;
                        value5 = r0Var5.getValue();
                    } while (!r0Var5.k(value5, new im8(constant2, constant)));
                    String str = c3tVar.f;
                    if (str != null) {
                        aVar.Z(new mm8(str));
                    }
                    aVar.G.getClass();
                } else {
                    if (i2 != 3) {
                        w511.b();
                        return null;
                    }
                    aVar.F.a.k.h(CardCommonEvents$CardReissuePollingResultResult.SERVER_ERROR, null);
                    pz40 Y3 = aVar.Y();
                    do {
                        r0Var6 = (r0) Y3;
                        value6 = r0Var6.getValue();
                    } while (!r0Var6.k(value6, new em8(constant2, constant, c3tVar.g, null)));
                }
            } else {
                if (!(dqgVar instanceof bqg)) {
                    w511.b();
                    return null;
                }
                bqg bqgVar = (bqg) dqgVar;
                String str2 = bqgVar.b;
                String str3 = bqgVar.a;
                String l = b64.l("error=", str3, ", description=", str2);
                x4c.g("Fail in time status of card reissue observing", null, l, null, 10);
                aVar.F.a.k.h(CardCommonEvents$CardReissuePollingResultResult.SERVER_ERROR, l);
                pz40 Y4 = aVar.Y();
                do {
                    r0Var3 = (r0) Y4;
                    value3 = r0Var3.getValue();
                    i = g8e.i(Text.Companion, str3);
                    g = d.g(str2);
                    if (g == null) {
                        g = a.J;
                    }
                } while (!r0Var3.k(value3, new em8(i, g, bqgVar.d, null)));
            }
        } else if (jl40.l(g13Var, f13.a)) {
            aVar.F.a.k.h(CardCommonEvents$CardReissuePollingResultResult.TIMEOUT, null);
            pz40 Y5 = aVar.Y();
            do {
                r0Var2 = (r0) Y5;
                value2 = r0Var2.getValue();
                km8 km8Var = (km8) value2;
                gm8Var = km8Var instanceof gm8 ? (gm8) km8Var : null;
                if (gm8Var == null || (text = gm8Var.c) == null) {
                    text = a.I;
                }
                if (gm8Var == null || (text2 = gm8Var.d) == null) {
                    text2 = a.J;
                }
            } while (!r0Var2.k(value2, new jm8(text, text2, gm8Var != null ? gm8Var.e : null)));
        } else {
            if (!(g13Var instanceof d13)) {
                w511.b();
                return null;
            }
            aVar.F.a.k.h(CardCommonEvents$CardReissuePollingResultResult.CLIENT_ERROR, ((d13) g13Var).a.getMessage());
            pz40 Y6 = aVar.Y();
            do {
                r0Var = (r0) Y6;
                value = r0Var.getValue();
            } while (!r0Var.k(value, new em8(a.I, a.J, null, null)));
        }
        return zy11.a;
    }
}
