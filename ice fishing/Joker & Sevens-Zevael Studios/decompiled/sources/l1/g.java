package l1;

import android.graphics.PathMeasure;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g extends pc.k implements oc.a {

    /* renamed from: h, reason: collision with root package name */
    public static final g f4002h;

    /* renamed from: i, reason: collision with root package name */
    public static final g f4003i;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4004g;

    static {
        int i10 = 0;
        f4002h = new g(i10, 0);
        f4003i = new g(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i10, int i11) {
        super(i10);
        this.f4004g = i11;
    }

    @Override // oc.a
    public final Object invoke() {
        switch (this.f4004g) {
            case 0:
                return new f1.j(new PathMeasure());
            default:
                return ac.o.f277a;
        }
    }
}
