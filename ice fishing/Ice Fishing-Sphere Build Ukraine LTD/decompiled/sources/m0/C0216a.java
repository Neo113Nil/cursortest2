package m0;

import D.C0013n;
import L.C0026b;
import android.util.Log;
import java.nio.ByteBuffer;
import l0.C0208k;

/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0216a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2772a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2773b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2774c;

    public /* synthetic */ C0216a(int i2, Object obj, Object obj2) {
        this.f2772a = i2;
        this.f2774c = obj;
        this.f2773b = obj2;
    }

    @Override // m0.e
    public final void a(ByteBuffer byteBuffer) {
        switch (this.f2772a) {
            case 0:
                C0013n c0013n = (C0013n) this.f2774c;
                try {
                    ((InterfaceC0218c) this.f2773b).e(((j) c0013n.f245c).a(byteBuffer));
                    break;
                } catch (RuntimeException e2) {
                    Log.e("BasicMessageChannel#" + ((String) c0013n.f244b), "Failed to handle message reply", e2);
                    return;
                }
            default:
                C0026b c0026b = (C0026b) this.f2774c;
                C0208k c0208k = (C0208k) this.f2773b;
                try {
                    if (byteBuffer == null) {
                        c0208k.getClass();
                    } else {
                        try {
                            c0208k.c(((l) c0026b.f526h).f(byteBuffer));
                        } catch (g e3) {
                            c0208k.a(e3.f2775e, e3.getMessage(), e3.f2776f);
                        }
                    }
                    break;
                } catch (RuntimeException e4) {
                    Log.e("MethodChannel#".concat((String) c0026b.f524f), "Failed to handle method call result", e4);
                    return;
                }
        }
    }
}
