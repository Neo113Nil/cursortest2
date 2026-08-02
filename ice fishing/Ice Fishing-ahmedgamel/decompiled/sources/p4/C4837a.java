package p4;

import com.icefishingapp.icefishing.StartActivity;
import u7.AbstractC5091i;
import u7.C5090h;
import z7.InterfaceC5267d;
import z7.InterfaceC5272i;

/* renamed from: p4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4837a implements InterfaceC5267d {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5272i f39768n;

    public C4837a(InterfaceC5272i interfaceC5272i, N6.g gVar) {
        this.f39768n = interfaceC5272i;
    }

    @Override // z7.InterfaceC5267d
    public final InterfaceC5272i getContext() {
        return this.f39768n;
    }

    @Override // z7.InterfaceC5267d
    public final void resumeWith(Object obj) {
        boolean z3 = obj instanceof C5090h;
        Object obj2 = z3 ? null : obj;
        AbstractC5091i.a(obj);
        int i = StartActivity.f36892z;
        if (z3) {
            return;
        }
        ((Boolean) obj2).booleanValue();
    }
}
