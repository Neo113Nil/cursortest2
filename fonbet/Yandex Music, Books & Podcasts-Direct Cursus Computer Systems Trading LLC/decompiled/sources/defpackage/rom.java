package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class rom extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ som s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rom(som somVar, int i) {
        super(1);
        this.r = i;
        this.s = somVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.r;
        som somVar = this.s;
        switch (i) {
            case 0:
                List list = (List) obj;
                lom lomVar = somVar.n;
                if (lomVar != null) {
                    lomVar.a.r = list;
                    return Unit.a;
                }
                Intrinsics.j("callbacks");
                throw null;
            default:
                dqm dqmVar = (dqm) obj;
                dqmVar.getClass();
                LinearLayout linearLayout = ((vhk) somVar.x()).a;
                linearLayout.getClass();
                View findViewById = somVar.requireView().getRootView().findViewById(R.id.container_layout);
                findViewById.getClass();
                qdq.b(linearLayout, (ViewGroup) findViewById);
                if (dqmVar instanceof ypm) {
                    somVar.z();
                } else if (dqmVar instanceof wpm) {
                    lom lomVar2 = somVar.n;
                    if (lomVar2 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    lomVar2.k(((wpm) dqmVar).a);
                } else if (dqmVar instanceof zpm) {
                    ((vhk) somVar.x()).f.setVisibility(8);
                    ((vhk) somVar.x()).b.setVisibility(0);
                    zpm zpmVar = (zpm) dqmVar;
                    if (zpmVar.c) {
                        ((vhk) somVar.x()).b.t(Integer.valueOf(R.string.paymentsdk_unbind_edit_button), new qom(somVar, 2));
                    } else {
                        ((vhk) somVar.x()).b.t(null, grb.w);
                    }
                    ((vhk) somVar.x()).h.setVisibility(0);
                    lom lomVar3 = somVar.n;
                    if (lomVar3 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    lomVar3.H(true);
                    lom lomVar4 = somVar.n;
                    if (lomVar4 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    ((ohk) lomVar4.a.D()).e.setOnClickListener(new kom(0, new qom(somVar, 3)));
                    mcp mcpVar = somVar.j;
                    if (mcpVar == null) {
                        Intrinsics.j("adapter");
                        throw null;
                    }
                    mcp.x(mcpVar, zpmVar.a, zpmVar.b, 4);
                } else if (dqmVar instanceof cqm) {
                    ((vhk) somVar.x()).f.setVisibility(8);
                    ((vhk) somVar.x()).b.setVisibility(0);
                    ((vhk) somVar.x()).b.t(Integer.valueOf(R.string.paymentsdk_unbind_done_button), new qom(somVar, 4));
                    ((vhk) somVar.x()).h.setVisibility(0);
                    lom lomVar5 = somVar.n;
                    if (lomVar5 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    lomVar5.H(false);
                    mcp mcpVar2 = somVar.j;
                    if (mcpVar2 == null) {
                        Intrinsics.j("adapter");
                        throw null;
                    }
                    mcp.x(mcpVar2, ((cqm) dqmVar).a, null, 6);
                } else if (dqmVar instanceof aqm) {
                    if (somVar.k) {
                        somVar.z();
                    }
                    lom lomVar6 = somVar.n;
                    if (lomVar6 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    lomVar6.f(new qdp(((aqm) dqmVar).a));
                } else if (dqmVar instanceof bqm) {
                    ((vhk) somVar.x()).f.setVisibility(0);
                    ((vhk) somVar.x()).f.setState(new evm(R.string.paymentsdk_unbind_success_title));
                    ((vhk) somVar.x()).b.setVisibility(8);
                    ((vhk) somVar.x()).h.setVisibility(8);
                    lom lomVar7 = somVar.n;
                    if (lomVar7 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    lomVar7.H(false);
                    if (somVar.n == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    cfk.d.a(((bqm) dqmVar).a);
                } else if (dqmVar instanceof xpm) {
                    lom lomVar8 = somVar.n;
                    if (lomVar8 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    lomVar8.e(((xpm) dqmVar).a, R.string.paymentsdk_error_title);
                }
                return Unit.a;
        }
    }
}
