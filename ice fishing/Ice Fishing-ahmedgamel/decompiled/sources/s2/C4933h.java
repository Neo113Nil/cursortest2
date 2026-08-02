package s2;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.C2773Rb;
import com.google.android.gms.internal.ads.InterfaceC3595md;
import java.util.Objects;

/* renamed from: s2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4933h extends AbstractC4947o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f40457b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1 f40458c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f40459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3595md f40460e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4945n f40461f;

    public C4933h(C4945n c4945n, Context context, f1 f1Var, String str, InterfaceC3595md interfaceC3595md) {
        this.f40457b = context;
        this.f40458c = f1Var;
        this.f40459d = str;
        this.f40460e = interfaceC3595md;
        Objects.requireNonNull(c4945n);
        this.f40461f = c4945n;
    }

    @Override // s2.AbstractC4947o
    public final Object a() {
        C4945n.p(this.f40457b, "app_open");
        return new Q0();
    }

    @Override // s2.AbstractC4947o
    public final /* synthetic */ Object b() {
        return ((C2773Rb) this.f40461f.f40491u).s(this.f40457b, this.f40458c, this.f40459d, this.f40460e, 4);
    }

    @Override // s2.AbstractC4947o
    public final Object c(X x9) {
        return x9.L0(new Y2.b(this.f40457b), this.f40458c, this.f40459d, this.f40460e, ModuleDescriptor.MODULE_VERSION);
    }
}
