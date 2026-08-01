package q2;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.C2753Rb;
import com.google.android.gms.internal.ads.InterfaceC3572md;
import java.util.Objects;

/* renamed from: q2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4882g extends AbstractC4898o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f40149b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1 f40150c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f40151d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3572md f40152e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4896n f40153f;

    public C4882g(C4896n c4896n, Context context, f1 f1Var, String str, InterfaceC3572md interfaceC3572md) {
        this.f40149b = context;
        this.f40150c = f1Var;
        this.f40151d = str;
        this.f40152e = interfaceC3572md;
        Objects.requireNonNull(c4896n);
        this.f40153f = c4896n;
    }

    @Override // q2.AbstractC4898o
    public final Object a() {
        C4896n.p(this.f40149b, com.anythink.expressad.foundation.g.a.f.f19123e);
        return new Q0();
    }

    @Override // q2.AbstractC4898o
    public final /* synthetic */ Object b() {
        return ((C2753Rb) this.f40153f.f40192u).s(this.f40149b, this.f40150c, this.f40151d, this.f40152e, 1);
    }

    @Override // q2.AbstractC4898o
    public final Object c(X x9) {
        return x9.z1(new W2.b(this.f40149b), this.f40150c, this.f40151d, this.f40152e, ModuleDescriptor.MODULE_VERSION);
    }
}
