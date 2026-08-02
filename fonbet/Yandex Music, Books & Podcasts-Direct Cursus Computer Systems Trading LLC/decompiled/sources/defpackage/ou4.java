package defpackage;

import android.content.Context;
import androidx.fragment.app.t;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class ou4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ou4(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                pu4 pu4Var = (pu4) this.b;
                oq oqVar = ((oab) this.c).a;
                spd spdVar = (spd) this.d;
                pu4Var.getClass();
                rmb rmbVar = pu4Var.d;
                wjb wjbVar = wjb.AlbumScreen;
                thj w = c3x.w(lxe.B(oqVar), spdVar.a, spdVar.b);
                ru4 ru4Var = pu4Var.b;
                tu4 tu4Var = (tu4) ru4Var.s.getValue();
                List list = (List) ru4Var.o.getValue();
                tu4Var.getClass();
                rmb.j(rmbVar, wjbVar, w, bg3.o(tu4.a(list)), 8);
                ju4 ju4Var = pu4Var.c;
                ju4Var.getClass();
                t tVar = ju4Var.a;
                tVar.startActivity(quj.U(tVar, new uq(oqVar, null, null, null, 124), null));
                return Unit.a;
            case 1:
                int i = ((s9n) this.b).c;
                if (((gdn) this.c).c) {
                    ((Function1) this.d).invoke(Integer.valueOf(i));
                }
                return Unit.a;
            case 2:
                ((l8i) this.b).b((b8i) this.c, (spd) this.d);
                return Unit.a;
            case 3:
                hab habVar = (hab) this.b;
                String str = ((dvl) this.c).a.h;
                return new d85(habVar.a(!(str == null || StringsKt.U(str)), ((qzl) this.d).y));
            case 4:
                return ((xiu) this.b).x((h4n) this.c, (String) this.d, ern.a(h4n.class), ern.a(i4n.class));
            default:
                ((Function2) this.b).invoke((fyp) this.c, (Context) this.d);
                return Unit.a;
        }
    }
}
