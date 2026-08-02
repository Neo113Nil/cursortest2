package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import java.util.List;
import kotlin.collections.b;

/* loaded from: classes5.dex */
public final class r69 implements z910 {
    public static final wbz0 b = new wbz0();
    public final float a;

    public r69(float f) {
        this.a = f;
    }

    @Override // defpackage.z910
    public final aa10 b(k kVar, List list, long j) {
        o l0 = ((x910) list.get(1)).l0(j);
        int min = (int) ((Math.min(l0.a, l0.b) / this.a) * uvb0.a);
        o l02 = ((x910) list.get(0)).l0(p8e.b(0, l0.a + min, 0, l0.b + min, 5));
        o l03 = ((x910) list.get(2)).l0(j);
        int i = l03.a / 2;
        return kVar.w(l02.a, (l02.b + (l03.b / 2)) * 2, b.f(), new hi0(l02, l0, min, l03, i));
    }
}
