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
    public final /* synthetic */ Context f40146b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1 f40147c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f40148d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3572md f40149e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4896n f40150f;

    public C4882g(C4896n c4896n, Context context, f1 f1Var, String str, InterfaceC3572md interfaceC3572md) {
        this.f40146b = context;
        this.f40147c = f1Var;
        this.f40148d = str;
        this.f40149e = interfaceC3572md;
        Objects.requireNonNull(c4896n);
        this.f40150f = c4896n;
    }

    @Override // q2.AbstractC4898o
    public final Object a() {
        C4896n.p(this.f40146b, com.anythink.expressad.foundation.g.a.f.f19123e);
        return new Q0();
    }

    @Override // q2.AbstractC4898o
    public final /* synthetic */ Object b() {
        return ((C2753Rb) this.f40150f.f40189u).s(this.f40146b, this.f40147c, this.f40148d, this.f40149e, 1);
    }

    @Override // q2.AbstractC4898o
    public final Object c(X x9) {
        return x9.z1(new W2.b(this.f40146b), this.f40147c, this.f40148d, this.f40149e, ModuleDescriptor.MODULE_VERSION);
    }
}
