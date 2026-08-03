package l2;

import ac.o;
import pc.k;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d extends k implements oc.c {

    /* renamed from: h, reason: collision with root package name */
    public static final d f4119h;

    /* renamed from: i, reason: collision with root package name */
    public static final d f4120i;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4121g;

    static {
        int i10 = 1;
        f4119h = new d(i10, 0);
        f4120i = new d(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, int i11) {
        super(i10);
        this.f4121g = i11;
    }

    @Override // oc.c
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.f4121g) {
            case 0:
                return o.f277a;
            default:
                throw null;
        }
    }
}
