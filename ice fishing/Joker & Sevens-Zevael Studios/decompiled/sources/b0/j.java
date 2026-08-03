package b0;

import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final o0.e f839a;

    public j(int i10) {
        switch (i10) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                this.f839a = new o0.e(new x.h[16]);
                break;
            default:
                this.f839a = new o0.e(new i[16]);
                break;
        }
    }

    public void a(CancellationException cancellationException) {
        o0.e eVar = this.f839a;
        int i10 = eVar.f5136i;
        yc.f[] fVarArr = new yc.f[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            fVarArr[i11] = ((x.h) eVar.f5134g[i11]).f7797b;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            fVarArr[i12].n(cancellationException);
        }
        if (eVar.f5136i != 0) {
            throw new IllegalStateException("uncancelled requests present");
        }
    }

    public void b() {
        o0.e eVar = this.f839a;
        int i10 = 0;
        int i11 = new uc.d(0, eVar.f5136i - 1, 1).f6736h;
        if (i11 >= 0) {
            while (true) {
                ((x.h) eVar.f5134g[i10]).f7797b.resumeWith(ac.o.f277a);
                if (i10 == i11) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        eVar.g();
    }
}
