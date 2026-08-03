package x1;

import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d implements w1.f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7996g;

    public static final int a(int i10, long j3) {
        int i11 = x1.f8217b;
        return ((int) (j3 >> (i10 * 15))) & 32767;
    }

    public int b() {
        switch (this.f7996g) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return 16;
            default:
                return 8;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [oc.a, pc.k] */
    @Override // w1.f
    public Object f(w1.g gVar) {
        return gVar.f7640a.invoke();
    }
}
