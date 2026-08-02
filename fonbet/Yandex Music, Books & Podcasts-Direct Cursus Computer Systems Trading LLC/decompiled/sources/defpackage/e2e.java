package defpackage;

import android.content.Context;
import androidx.fragment.app.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.search.SearchActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class e2e implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h2e b;

    public /* synthetic */ e2e(h2e h2eVar, int i) {
        this.a = i;
        this.b = h2eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                h2e h2eVar = this.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(upq.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                upq upqVar = (upq) qdcVar.C(I);
                hla hlaVar = new hla(h2eVar.g.m(), h2eVar.getN(), h2eVar.x(), h2eVar.k);
                jyr jyrVar = o5j.e;
                String str = tyf.v() ? "mobile_foryou" : "main";
                String str2 = tyf.v() ? "mobile_foryou" : "main";
                uvf uvfVar = (uvf) hlaVar.d;
                hnq hnqVar = hnq.a;
                uvfVar.getClass();
                return new uoq(str, null, null, new cjf(str2, upqVar, uvfVar, null, hnqVar, null), hlaVar);
            case 1:
                uoq uoqVar = (uoq) this.b.l.getValue();
                lnq lnqVar = new lnq();
                uoqVar.getClass();
                return new gpq(uoqVar, lnqVar);
            case 2:
                h2e h2eVar2 = this.b;
                ((b2e) h2eVar2.n.getValue()).getClass();
                return new a2e(h2eVar2);
            default:
                a2e a2eVar = (a2e) this.b.o.getValue();
                t requireActivity = a2eVar.a.requireActivity();
                np2 np2Var = requireActivity instanceof np2 ? (np2) requireActivity : null;
                rf3 J = np2Var != null ? np2Var.l().J() : null;
                Context context = a2eVar.b;
                int i = SearchActivity.Z;
                context.startActivity(rvf.E(context, rvf.x(J)));
                return Unit.a;
        }
    }
}
