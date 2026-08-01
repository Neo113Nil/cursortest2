package q2;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.BinderC3464kd;
import com.google.android.gms.internal.ads.C2753Rb;
import java.util.Objects;

/* renamed from: q2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4886i extends AbstractC4898o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f40171b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1 f40172c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f40173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BinderC3464kd f40174e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4896n f40175f;

    public C4886i(C4896n c4896n, Context context, f1 f1Var, String str, BinderC3464kd binderC3464kd) {
        this.f40171b = context;
        this.f40172c = f1Var;
        this.f40173d = str;
        this.f40174e = binderC3464kd;
        Objects.requireNonNull(c4896n);
        this.f40175f = c4896n;
    }

    @Override // q2.AbstractC4898o
    public final Object a() {
        C4896n.p(this.f40171b, com.anythink.expressad.foundation.g.a.f.f19122d);
        return new Q0();
    }

    @Override // q2.AbstractC4898o
    public final /* synthetic */ Object b() {
        C2753Rb c2753Rb = (C2753Rb) this.f40175f.f40192u;
        BinderC3464kd binderC3464kd = this.f40174e;
        return c2753Rb.s(this.f40171b, this.f40172c, this.f40173d, binderC3464kd, 2);
    }

    @Override // q2.AbstractC4898o
    public final Object c(X x9) {
        return x9.d1(new W2.b(this.f40171b), this.f40172c, this.f40173d, this.f40174e, ModuleDescriptor.MODULE_VERSION);
    }
}
