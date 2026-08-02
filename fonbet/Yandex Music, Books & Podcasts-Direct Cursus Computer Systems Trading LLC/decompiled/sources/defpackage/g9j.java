package defpackage;

import androidx.compose.foundation.lazy.a;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class g9j implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0k b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ezc e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ g9j(q0k q0kVar, int i, ArrayList arrayList, Function0 function0, int i2) {
        this.a = i2;
        this.b = q0kVar;
        this.c = i;
        this.d = arrayList;
        this.e = (ezc) function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.functions.Function0] */
    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        a aVar = (a) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                aVar.getClass();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                    irf.h(rvf.M(this.c, oq5Var), androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.l(vci.a, this.b), "collection_non_music_albums_block_header"), null, null, this.d.size() > 4 ? this.e : null, false, null, false, null, oq5Var, 0, 492);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                aVar.getClass();
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 17) != 16)) {
                    irf.h(rvf.M(this.c, oq5Var2), androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.l(vci.a, this.b), "collection_non_music_tracks_block_header"), null, null, this.d.size() > 5 ? this.e : null, false, null, false, null, oq5Var2, 0, 492);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
