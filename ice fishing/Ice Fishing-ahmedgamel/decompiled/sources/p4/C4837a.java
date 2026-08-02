package p4;

import com.IceFishing.LiveIceFishing.StartActivity;
import u7.AbstractC5083i;
import u7.C5082h;
import z7.InterfaceC5240d;
import z7.InterfaceC5245i;

/* renamed from: p4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4837a implements InterfaceC5240d {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5245i f39815n;

    public C4837a(InterfaceC5245i interfaceC5245i, N6.g gVar) {
        this.f39815n = interfaceC5245i;
    }

    @Override // z7.InterfaceC5240d
    public final InterfaceC5245i getContext() {
        return this.f39815n;
    }

    @Override // z7.InterfaceC5240d
    public final void resumeWith(Object obj) {
        boolean z6 = obj instanceof C5082h;
        Object obj2 = z6 ? null : obj;
        AbstractC5083i.a(obj);
        int i = StartActivity.f6381z;
        if (z6) {
            return;
        }
        ((Boolean) obj2).booleanValue();
    }
}
