package ru.yandex.logistics.sdk.cargo_form.impl.ai_widgets.ui;

import defpackage.aq1;
import defpackage.ayu0;
import defpackage.azs0;
import defpackage.bms;
import defpackage.c9x0;
import defpackage.dyu0;
import defpackage.foc;
import defpackage.fz;
import defpackage.gq1;
import defpackage.hq1;
import defpackage.hzt;
import defpackage.j73;
import defpackage.kxy0;
import defpackage.ldc;
import defpackage.lvi0;
import defpackage.lxy0;
import defpackage.mrj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.piy;
import defpackage.pn1;
import defpackage.pre;
import defpackage.r9x0;
import defpackage.s5r;
import defpackage.sae;
import defpackage.t3s;
import defpackage.vn1;
import defpackage.w511;
import defpackage.y8x0;
import defpackage.yfa;
import defpackage.z8x0;
import defpackage.zy11;
import defpackage.zys0;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.logistics.sdk.cargo_form.impl.ai_widgets.data.TextFont;
import ru.yandex.taxi.logistics.sdk.ui_models.form.ai_widgets.TextFontState;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Laq1;", ConfigConstants.CONFIG, "Lt3s;", "formModel", "", "<unused var>", "Lgq1;", "<anonymous>", "(Laq1;Lt3s;Z)Lgq1;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ai_widgets.ui.AiWidgetsConfigProvider$aiWidgetsConfigFlow$1", f = "AiWidgetsConfigProvider.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AiWidgetsConfigProvider$aiWidgetsConfigFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiWidgetsConfigProvider$aiWidgetsConfigFlow$1(a aVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Boolean) obj3).booleanValue();
        AiWidgetsConfigProvider$aiWidgetsConfigFlow$1 aiWidgetsConfigProvider$aiWidgetsConfigFlow$1 = new AiWidgetsConfigProvider$aiWidgetsConfigFlow$1(this.this$0, (Continuation) obj4);
        aiWidgetsConfigProvider$aiWidgetsConfigFlow$1.L$0 = (aq1) obj;
        aiWidgetsConfigProvider$aiWidgetsConfigFlow$1.L$1 = (t3s) obj2;
        return aiWidgetsConfigProvider$aiWidgetsConfigFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fz fzVar;
        TextFontState textFontState;
        lxy0 lxy0Var;
        aq1 aq1Var = (aq1) this.L$0;
        t3s t3sVar = (t3s) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        azs0 azs0Var = null;
        azs0Var = null;
        azs0Var = null;
        azs0Var = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        mrj mrjVar = this.this$0.b;
        mrjVar.getClass();
        if (aq1Var == null) {
            return null;
        }
        pn1 pn1Var = aq1Var.a;
        vn1 vn1Var = pn1Var != null ? new vn1(mrjVar.q(pn1Var.a, null), new fz(new z8x0(pn1Var.b), null)) : null;
        zys0 zys0Var = aq1Var.b;
        yfa yfaVar = (yfa) mrjVar.c;
        if (zys0Var != null) {
            String str = zys0Var.d;
            if (t3sVar != null) {
                ((sae) mrjVar.w).getClass();
                s5r s5rVar = new s5r(kotlin.sequences.b.l(kotlin.sequences.a.c(j73.v(new List[]{t3sVar.a, t3sVar.b, t3sVar.c})), new foc(17)));
                while (true) {
                    if (!s5rVar.hasNext()) {
                        fzVar = null;
                        break;
                    }
                    fzVar = sae.y((pre) s5rVar.next());
                    if (fzVar != null) {
                        break;
                    }
                }
                if (fzVar != null) {
                    ldc f = yfaVar.f(str);
                    r9x0 r9x0Var = fzVar.a;
                    if ((r9x0Var instanceof c9x0) || (r9x0Var instanceof y8x0)) {
                        fz fzVar2 = new fz(mrj.I(r9x0Var, f), fzVar.b);
                        ayu0 ayu0Var = zys0Var.a;
                        String str2 = ayu0Var.a;
                        ldc f2 = yfaVar.f(ayu0Var.b);
                        int i = ayu0Var.c;
                        TextFont textFont = ayu0Var.d;
                        int i2 = textFont == null ? -1 : hq1.a[textFont.ordinal()];
                        if (i2 == -1) {
                            textFontState = null;
                        } else if (i2 == 1) {
                            textFontState = TextFontState.BOLD;
                        } else {
                            if (i2 != 2) {
                                w511.b();
                                return null;
                            }
                            textFontState = TextFontState.REGULAR;
                        }
                        dyu0 dyu0Var = new dyu0(str2, f2, i, textFontState);
                        lvi0 q = mrjVar.q(zys0Var.b, zys0Var.c);
                        ldc f3 = yfaVar.f(str);
                        ldc f4 = yfaVar.f(zys0Var.e);
                        kxy0 kxy0Var = zys0Var.f;
                        if (kxy0Var != null) {
                            hzt p = mrjVar.p(kxy0Var.a);
                            piy piyVar = kxy0Var.b;
                            lxy0Var = new lxy0(p, piyVar != null ? mrjVar.p(piyVar) : null);
                        } else {
                            lxy0Var = null;
                        }
                        azs0Var = new azs0(dyu0Var, q, f3, f4, fzVar2, lxy0Var);
                    }
                }
            }
        }
        return new gq1(vn1Var, azs0Var);
    }
}
