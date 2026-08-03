package z;

import androidx.compose.foundation.layout.LayoutWeightElement;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final j0 f8967a = new j0();

    public static y0.n a() {
        if (1.0f > 0.0d) {
            return new LayoutWeightElement(1.0f);
        }
        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
    }
}
