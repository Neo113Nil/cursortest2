package d;

import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements oc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1536g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y f1537h;

    public /* synthetic */ s(y yVar, int i10) {
        this.f1536g = i10;
        this.f1537h = yVar;
    }

    @Override // oc.a
    public final Object invoke() {
        switch (this.f1536g) {
            case 0:
                this.f1537h.b();
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                this.f1537h.a();
                break;
            default:
                this.f1537h.b();
                break;
        }
        return ac.o.f277a;
    }
}
