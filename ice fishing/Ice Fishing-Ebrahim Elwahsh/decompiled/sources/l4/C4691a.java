package l4;

import com.icefishing.icefishingliveapp.StartActivity;
import q7.AbstractC4940i;
import q7.C4939h;
import v7.InterfaceC5133d;
import v7.InterfaceC5138i;

/* renamed from: l4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4691a implements InterfaceC5133d {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5138i f39048n;

    public C4691a(InterfaceC5138i interfaceC5138i, J6.g gVar) {
        this.f39048n = interfaceC5138i;
    }

    @Override // v7.InterfaceC5133d
    public final InterfaceC5138i getContext() {
        return this.f39048n;
    }

    @Override // v7.InterfaceC5133d
    public final void resumeWith(Object obj) {
        boolean z8 = obj instanceof C4939h;
        Object obj2 = z8 ? null : obj;
        AbstractC4940i.a(obj);
        int i = StartActivity.f37053z;
        if (z8) {
            return;
        }
        ((Boolean) obj2).booleanValue();
    }
}
