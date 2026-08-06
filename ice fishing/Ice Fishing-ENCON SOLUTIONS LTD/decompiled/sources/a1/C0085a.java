package a1;

import F.C0038n;
import android.util.Log;
import java.nio.ByteBuffer;

/* renamed from: a1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0085a implements InterfaceC0089e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2028a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2029b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2030c;

    public /* synthetic */ C0085a(int i2, Object obj, Object obj2) {
        this.f2028a = i2;
        this.f2030c = obj;
        this.f2029b = obj2;
    }

    @Override // a1.InterfaceC0089e
    public final void a(ByteBuffer byteBuffer) {
        switch (this.f2028a) {
            case 0:
                C0038n c0038n = (C0038n) this.f2030c;
                try {
                    ((InterfaceC0087c) this.f2029b).f(((InterfaceC0094j) c0038n.f534c).decodeMessage(byteBuffer));
                    break;
                } catch (RuntimeException e2) {
                    Log.e("BasicMessageChannel#" + ((String) c0038n.f533b), "Failed to handle message reply", e2);
                    return;
                }
            default:
                I0.b bVar = (I0.b) this.f2030c;
                Z0.j jVar = (Z0.j) this.f2029b;
                try {
                    if (byteBuffer == null) {
                        jVar.getClass();
                    } else {
                        try {
                            jVar.c(((InterfaceC0096l) bVar.f723d).c(byteBuffer));
                        } catch (C0091g e3) {
                            jVar.a(e3.f2031a, e3.getMessage(), e3.f2032b);
                        }
                    }
                    break;
                } catch (RuntimeException e4) {
                    Log.e("MethodChannel#" + ((String) bVar.f722c), "Failed to handle method call result", e4);
                    return;
                }
        }
    }
}
