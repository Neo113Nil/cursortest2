package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class c5t implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g5t b;

    public /* synthetic */ c5t(g5t g5tVar, int i) {
        this.a = i;
        this.b = g5tVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Serializable serializable;
        String string;
        kxi kxiVar;
        switch (this.a) {
            case 0:
                Bundle arguments = this.b.getArguments();
                if (arguments == null) {
                    return null;
                }
                if (Build.VERSION.SDK_INT >= 34) {
                    serializable = rb.z(arguments, l5t.class, "TRAILER_ENTITY_TYPE_ARG_KEY");
                } else {
                    serializable = arguments.getSerializable("TRAILER_ENTITY_TYPE_ARG_KEY");
                    if (!l5t.class.isInstance(serializable)) {
                        serializable = null;
                    }
                }
                l5t l5tVar = (l5t) serializable;
                if (l5tVar == null || (string = arguments.getString("TRAILER_ENTITY_ID_ARG_KEY")) == null || (kxiVar = (kxi) ((Parcelable) vwb.O(arguments, kxi.class, "TRAILER_NAVIGATION_DATA_ARG_KEY"))) == null) {
                    return null;
                }
                return new e5t(kxiVar, l5tVar, string);
            case 1:
                g5t g5tVar = this.b;
                l5t l5tVar2 = g5tVar.y().a;
                String str = g5tVar.y().b;
                boolean z = g5tVar.requireArguments().getBoolean("TRAILER_ENTITY_OPENED_FROM_ENTITY_ARG_KEY");
                kxi kxiVar2 = g5tVar.y().c;
                t4t t4tVar = (t4t) g5tVar.k.getValue();
                l18 l18Var = l18.b;
                bdt I = hag.I(x5t.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return new e6t(t4tVar, z, kxiVar2, l5tVar2, str, (x5t) qdcVar.C(I));
            case 2:
                g5t g5tVar2 = this.b;
                return new t4t(g5tVar2.y().c, g5tVar2.y().a, g5tVar2.y().b);
            default:
                g5t g5tVar3 = this.b;
                cvo cvoVar = cvo.i;
                return o6m.b(wjb.TrailerScreen, new avo(pkb.Trailer, ((t4t) g5tVar3.k.getValue()).a()), 2);
        }
    }
}
