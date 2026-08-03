package h5;

import ac.o;
import android.os.Bundle;
import pc.k;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends k implements oc.a {

    /* renamed from: h, reason: collision with root package name */
    public static final b f2848h;

    /* renamed from: i, reason: collision with root package name */
    public static final b f2849i;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2850g;

    static {
        int i10 = 0;
        f2848h = new b(i10, 0);
        f2849i = new b(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, int i11) {
        super(i10);
        this.f2850g = i11;
    }

    @Override // oc.a
    public final Object invoke() {
        switch (this.f2850g) {
            case 0:
                return new Bundle();
            default:
                return o.f277a;
        }
    }
}
