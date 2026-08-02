package defpackage;

import android.content.Context;
import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes10.dex */
public class u9h {
    public List a(Context context, xb10 xb10Var, a aVar, boolean z, boolean z2) {
        String str = aVar.n;
        if (str == null) {
            return EmptyList.a;
        }
        if (tw21.a >= 26 && "video/dolby-vision".equals(str) && !ey91.d(context)) {
            String b = fd10.b(aVar);
            List p = b == null ? ImmutableList.p() : xb10Var.getDecoderInfos(b, z, z2);
            if (!p.isEmpty()) {
                return p;
            }
        }
        return fd10.g(xb10Var, aVar, z, z2);
    }
}
