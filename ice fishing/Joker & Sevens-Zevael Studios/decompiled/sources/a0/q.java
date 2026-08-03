package a0;

import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class q extends pc.k implements oc.c {

    /* renamed from: h, reason: collision with root package name */
    public static final q f96h;

    /* renamed from: i, reason: collision with root package name */
    public static final q f97i;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f98g;

    static {
        int i10 = 1;
        f96h = new q(i10, 0);
        f97i = new q(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i10, int i11) {
        super(i10);
        this.f98g = i11;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        switch (this.f98g) {
            case 0:
                return ac.o.f277a;
            default:
                List list = (List) obj;
                return new b0(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
        }
    }
}
