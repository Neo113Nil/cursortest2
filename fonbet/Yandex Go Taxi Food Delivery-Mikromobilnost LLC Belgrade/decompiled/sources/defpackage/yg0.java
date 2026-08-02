package defpackage;

import androidx.compose.ui.layout.k;
import java.util.List;

/* loaded from: classes13.dex */
public final class yg0 implements z910 {
    public final /* synthetic */ boolean a;

    public yg0(boolean z) {
        this.a = z;
    }

    @Override // defpackage.z910
    public final aa10 b(k kVar, List list, long j) {
        int b = m810.b(kVar.w0(4.0f));
        return (list.size() > 2 || !(this.a || o57.a(b, j, list))) ? o57.b(kVar, list, j, b) : o57.c(kVar, list, j, b);
    }
}
