package q2;

import android.content.Context;
import com.google.android.gms.internal.ads.C2684Nb;
import com.google.android.gms.internal.ads.InterfaceC3423jd;
import java.util.Objects;

/* renamed from: q2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4891h extends AbstractC4905o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f40063b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f40064c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f40065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3423jd f40066e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4903n f40067f;

    public C4891h(C4903n c4903n, Context context, g1 g1Var, String str, InterfaceC3423jd interfaceC3423jd) {
        this.f40063b = context;
        this.f40064c = g1Var;
        this.f40065d = str;
        this.f40066e = interfaceC3423jd;
        Objects.requireNonNull(c4903n);
        this.f40067f = c4903n;
    }

    @Override // q2.AbstractC4905o
    public final Object a() {
        C4903n.p(this.f40063b, "app_open");
        return new Q0();
    }

    @Override // q2.AbstractC4905o
    public final /* synthetic */ Object b() {
        return ((C2684Nb) this.f40067f.f40101u).s(this.f40063b, this.f40064c, this.f40065d, this.f40066e, 4);
    }

    @Override // q2.AbstractC4905o
    public final Object c(X x3) {
        return x3.W2(new V2.b(this.f40063b), this.f40064c, this.f40065d, this.f40066e, 261710000);
    }
}
