package m0;

import D.C0013n;
import L.C0051b;
import android.util.Log;
import java.nio.ByteBuffer;

/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0203a implements InterfaceC0207e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2764a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2765b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2766c;

    public /* synthetic */ C0203a(int i2, Object obj, Object obj2) {
        this.f2764a = i2;
        this.f2766c = obj;
        this.f2765b = obj2;
    }

    @Override // m0.InterfaceC0207e
    public final void a(ByteBuffer byteBuffer) {
        switch (this.f2764a) {
            case 0:
                C0013n c0013n = (C0013n) this.f2766c;
                try {
                    ((InterfaceC0205c) this.f2765b).e(((InterfaceC0212j) c0013n.f244c).a(byteBuffer));
                    break;
                } catch (RuntimeException e2) {
                    Log.e("BasicMessageChannel#" + ((String) c0013n.f243b), "Failed to handle message reply", e2);
                    return;
                }
            default:
                C0051b c0051b = (C0051b) this.f2766c;
                l0.k kVar = (l0.k) this.f2765b;
                try {
                    if (byteBuffer == null) {
                        kVar.getClass();
                    } else {
                        try {
                            kVar.c(((InterfaceC0214l) c0051b.f604i).f(byteBuffer));
                        } catch (C0209g e3) {
                            kVar.a(e3.f2767f, e3.getMessage(), e3.f2768g);
                        }
                    }
                    break;
                } catch (RuntimeException e4) {
                    Log.e("MethodChannel#".concat((String) c0051b.f602g), "Failed to handle method call result", e4);
                    return;
                }
        }
    }
}
