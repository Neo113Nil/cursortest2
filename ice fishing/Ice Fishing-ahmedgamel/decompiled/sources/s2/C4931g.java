package s2;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.C2773Rb;
import com.google.android.gms.internal.ads.InterfaceC3595md;
import java.util.Objects;

/* renamed from: s2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4931g extends AbstractC4947o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f40448b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1 f40449c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f40450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3595md f40451e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4945n f40452f;

    public C4931g(C4945n c4945n, Context context, f1 f1Var, String str, InterfaceC3595md interfaceC3595md) {
        this.f40448b = context;
        this.f40449c = f1Var;
        this.f40450d = str;
        this.f40451e = interfaceC3595md;
        Objects.requireNonNull(c4945n);
        this.f40452f = c4945n;
    }

    @Override // s2.AbstractC4947o
    public final Object a() {
        C4945n.p(this.f40448b, com.anythink.expressad.foundation.g.a.f.f19910e);
        return new Q0();
    }

    @Override // s2.AbstractC4947o
    public final /* synthetic */ Object b() {
        return ((C2773Rb) this.f40452f.f40491u).s(this.f40448b, this.f40449c, this.f40450d, this.f40451e, 1);
    }

    @Override // s2.AbstractC4947o
    public final Object c(X x9) {
        return x9.C2(new Y2.b(this.f40448b), this.f40449c, this.f40450d, this.f40451e, ModuleDescriptor.MODULE_VERSION);
    }
}
