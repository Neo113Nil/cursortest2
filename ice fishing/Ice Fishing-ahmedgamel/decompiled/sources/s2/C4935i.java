package s2;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.BinderC3487kd;
import com.google.android.gms.internal.ads.C2773Rb;
import java.util.Objects;

/* renamed from: s2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4935i extends AbstractC4947o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f40470b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1 f40471c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f40472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BinderC3487kd f40473e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4945n f40474f;

    public C4935i(C4945n c4945n, Context context, f1 f1Var, String str, BinderC3487kd binderC3487kd) {
        this.f40470b = context;
        this.f40471c = f1Var;
        this.f40472d = str;
        this.f40473e = binderC3487kd;
        Objects.requireNonNull(c4945n);
        this.f40474f = c4945n;
    }

    @Override // s2.AbstractC4947o
    public final Object a() {
        C4945n.p(this.f40470b, com.anythink.expressad.foundation.g.a.f.f19909d);
        return new Q0();
    }

    @Override // s2.AbstractC4947o
    public final /* synthetic */ Object b() {
        C2773Rb c2773Rb = (C2773Rb) this.f40474f.f40491u;
        BinderC3487kd binderC3487kd = this.f40473e;
        return c2773Rb.s(this.f40470b, this.f40471c, this.f40472d, binderC3487kd, 2);
    }

    @Override // s2.AbstractC4947o
    public final Object c(X x9) {
        return x9.j1(new Y2.b(this.f40470b), this.f40471c, this.f40472d, this.f40473e, ModuleDescriptor.MODULE_VERSION);
    }
}
