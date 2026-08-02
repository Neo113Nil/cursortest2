package defpackage;

import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.g;
import androidx.fragment.app.y;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class tr7 extends uif implements Function0 {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ g s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ ViewGroup u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr7(g gVar, ViewGroup viewGroup, Object obj) {
        super(0);
        this.s = gVar;
        this.u = viewGroup;
        this.t = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                this.s.f.e(this.u, this.t);
                break;
            default:
                g gVar = this.s;
                ArrayList arrayList = gVar.c;
                bvc bvcVar = gVar.f;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (!((ur7) it.next()).a.g) {
                            if (y.M(2)) {
                                Log.v("FragmentManager", "Completing animating immediately");
                            }
                            hu3 hu3Var = new hu3();
                            bvcVar.u(((ur7) arrayList.get(0)).a.c, this.t, hu3Var, new sr7(1, gVar));
                            hu3Var.a();
                            break;
                        }
                    }
                }
                if (y.M(2)) {
                    Log.v("FragmentManager", "Animating to start");
                }
                Object obj = gVar.q;
                obj.getClass();
                bvcVar.d(obj, new jt6(21, gVar, this.u));
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr7(g gVar, Object obj, ViewGroup viewGroup) {
        super(0);
        this.s = gVar;
        this.t = obj;
        this.u = viewGroup;
    }
}
