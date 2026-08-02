package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.kinopoisk.sdk.easylogin.internal.Z0;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class eb6 extends uif implements Function0 {
    public final /* synthetic */ fb6 r;
    public final /* synthetic */ Z0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb6(fb6 fb6Var, Z0 z0) {
        super(0);
        this.r = fb6Var;
        this.s = z0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        bkk bkkVar;
        Timber.Tree tag = Timber.INSTANCE.tag("ContainerFragmentNavigator");
        fb6 fb6Var = this.r;
        Z0 z0 = this.s;
        tag.d("applyCommand: command = %s", fb6.access$toLogCommand(fb6Var, z0));
        z = fb6Var.isTerminated;
        if (z) {
            bkkVar = fb6Var.pendingCommandBuffer;
            Z0[] z0Arr = {z0};
            ((ckk) bkkVar).getClass();
            voi voiVar = ckk.b;
            List list = (List) voiVar.d();
            if (list == null) {
                list = c5b.a;
            }
            List list2 = list;
            list2.getClass();
            ArrayList arrayList = new ArrayList(list2.size() + 1);
            arrayList.addAll(list2);
            z75.u(arrayList, z0Arr);
            voiVar.l(arrayList);
        } else {
            if (z0 instanceof jsc ? true : z0 instanceof vyn ? true : z0 instanceof aj2) {
                super/*ru.kinopoisk.sdk.easylogin.internal.z4*/.applyCommand(z0);
            } else if (z0 instanceof ni2) {
                fb6.access$executeBackCommand(fb6Var);
            } else {
                fb6Var.getFragmentManager().C(fb6Var.getContainerId());
            }
            if ((z0 instanceof vyn) && (((vyn) z0).a instanceof li)) {
                fb6Var.isTerminated = true;
            }
        }
        return Unit.a;
    }
}
