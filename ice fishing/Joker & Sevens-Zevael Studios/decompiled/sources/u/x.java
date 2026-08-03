package u;

import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class x extends pc.k implements oc.c {

    /* renamed from: h, reason: collision with root package name */
    public static final x f6655h;

    /* renamed from: i, reason: collision with root package name */
    public static final x f6656i;

    /* renamed from: j, reason: collision with root package name */
    public static final x f6657j;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6658g;

    static {
        int i10 = 1;
        f6655h = new x(i10, 0);
        f6656i = new x(i10, 1);
        f6657j = new x(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i10, int i11) {
        super(i10);
        this.f6658g = i11;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        switch (this.f6658g) {
            case 0:
                long j3 = ((f1.j0) obj).f2268a;
                return new v.k(f1.j0.b(j3), f1.j0.c(j3));
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                v.k kVar = (v.k) obj;
                float f10 = kVar.f6874a;
                float f11 = kVar.f6875b;
                return new f1.j0((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
            default:
                return v.d.i(0.0f, 0.0f, null, 7);
        }
    }
}
