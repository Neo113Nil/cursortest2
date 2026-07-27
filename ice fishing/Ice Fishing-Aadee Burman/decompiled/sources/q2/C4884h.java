package q2;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.C2753Rb;
import com.google.android.gms.internal.ads.InterfaceC3572md;
import java.util.Objects;

/* renamed from: q2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4884h extends AbstractC4898o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f40155b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1 f40156c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f40157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3572md f40158e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4896n f40159f;

    public C4884h(C4896n c4896n, Context context, f1 f1Var, String str, InterfaceC3572md interfaceC3572md) {
        this.f40155b = context;
        this.f40156c = f1Var;
        this.f40157d = str;
        this.f40158e = interfaceC3572md;
        Objects.requireNonNull(c4896n);
        this.f40159f = c4896n;
    }

    @Override // q2.AbstractC4898o
    public final Object a() {
        C4896n.p(this.f40155b, "app_open");
        return new Q0();
    }

    @Override // q2.AbstractC4898o
    public final /* synthetic */ Object b() {
        return ((C2753Rb) this.f40159f.f40189u).s(this.f40155b, this.f40156c, this.f40157d, this.f40158e, 4);
    }

    @Override // q2.AbstractC4898o
    public final Object c(X x9) {
        return x9.F3(new W2.b(this.f40155b), this.f40156c, this.f40157d, this.f40158e, ModuleDescriptor.MODULE_VERSION);
    }
}
