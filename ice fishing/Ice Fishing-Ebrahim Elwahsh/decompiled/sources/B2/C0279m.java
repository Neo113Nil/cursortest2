package B2;

import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC3137eE;
import com.google.android.gms.internal.ads.AbstractC3212fg;
import com.google.android.gms.internal.ads.Av;
import com.google.android.gms.internal.ads.C2674Mi;
import com.google.android.gms.internal.ads.C2860Xh;
import com.google.android.gms.internal.ads.C2950ar;
import com.google.android.gms.internal.ads.C3002bo;
import com.google.android.gms.internal.ads.C3113dr;
import com.google.android.gms.internal.ads.C3157eg;
import com.google.android.gms.internal.ads.C3214fi;
import com.google.android.gms.internal.ads.C3280gu;
import com.google.android.gms.internal.ads.C3348i7;
import com.google.android.gms.internal.ads.C3381io;
import com.google.android.gms.internal.ads.C3706oq;
import com.google.android.gms.internal.ads.C3710ou;
import com.google.android.gms.internal.ads.C4009uN;
import com.google.android.gms.internal.ads.C4077vk;
import com.google.android.gms.internal.ads.C4117wN;
import com.google.android.gms.internal.ads.C4121wa;
import com.google.android.gms.internal.ads.C4304zv;
import com.google.android.gms.internal.ads.InterfaceC2573Gj;
import com.google.android.gms.internal.ads.InterfaceC4063vN;
import com.google.android.gms.internal.ads.InterfaceC4279zN;
import com.google.android.gms.internal.ads.Ou;
import com.google.android.gms.internal.ads.Yu;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: B2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0279m implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final C2860Xh f276b;

    /* renamed from: c, reason: collision with root package name */
    public final C4009uN f277c;

    /* renamed from: d, reason: collision with root package name */
    public final C4009uN f278d;

    /* renamed from: e, reason: collision with root package name */
    public final C4009uN f279e;

    /* renamed from: f, reason: collision with root package name */
    public final C4009uN f280f;

    /* renamed from: g, reason: collision with root package name */
    public final C4009uN f281g;

    /* renamed from: h, reason: collision with root package name */
    public final C4009uN f282h;
    public final C4009uN i;

    /* renamed from: j, reason: collision with root package name */
    public final C4009uN f283j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f284k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC4063vN f285l;

    /* renamed from: m, reason: collision with root package name */
    public final InterfaceC4279zN f286m;

    public C0279m(C2860Xh c2860Xh, C4009uN c4009uN, C4009uN c4009uN2, C4009uN c4009uN3, C4009uN c4009uN4, C4009uN c4009uN5, C4009uN c4009uN6, C4009uN c4009uN7, C4009uN c4009uN8, C4009uN c4009uN9, C2674Mi c2674Mi, C4009uN c4009uN10) {
        this.f276b = c2860Xh;
        this.f277c = c4009uN;
        this.f278d = c4009uN2;
        this.f279e = c4009uN3;
        this.f280f = c4009uN4;
        this.f281g = c4009uN5;
        this.f282h = c4009uN6;
        this.i = c4009uN7;
        this.f283j = c4009uN8;
        this.f284k = c4009uN9;
        this.f285l = c2674Mi;
        this.f286m = c4009uN10;
    }

    public C3113dr a() {
        Context a9 = this.f276b.a();
        Ou ou = (Ou) this.f277c.d();
        C2950ar c2950ar = (C2950ar) this.f278d.d();
        C4077vk c4077vk = (C4077vk) this.f279e.d();
        C4304zv c4304zv = (C4304zv) this.f280f.d();
        Av av = (Av) this.f281g.d();
        InterfaceC2573Gj interfaceC2573Gj = (InterfaceC2573Gj) this.f282h.d();
        C3157eg c3157eg = AbstractC3212fg.f30738a;
        AbstractC3137eE.h(c3157eg);
        return new C3113dr(a9, ou, c2950ar, c4077vk, c4304zv, av, interfaceC2573Gj, c3157eg, (ScheduledExecutorService) this.i.d(), (C3706oq) this.f283j.d(), (Yu) ((C4009uN) this.f284k).d(), ((C2674Mi) this.f285l).a(), (C3002bo) ((C4009uN) this.f286m).d());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f275a) {
            case 0:
                C3214fi c3214fi = (C3214fi) ((C4117wN) this.f284k).f34977a;
                Context a9 = this.f276b.a();
                C3348i7 c3348i7 = (C3348i7) this.f277c.d();
                C3710ou c3710ou = (C3710ou) this.f278d.d();
                C3157eg c3157eg = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg);
                return new BinderC0278l(c3214fi, a9, c3348i7, c3710ou, c3157eg, (ScheduledExecutorService) this.f279e.d(), (C3381io) this.f280f.d(), (Av) this.f281g.d(), ((C2860Xh) this.f285l).b(), ((C4121wa) this.f286m).a(), (C3280gu) this.f282h.d(), (E) this.i.d(), (C0268b) this.f283j.d());
            default:
                return a();
        }
    }

    public C0279m(C4117wN c4117wN, C2860Xh c2860Xh, C4009uN c4009uN, C4009uN c4009uN2, C4009uN c4009uN3, C4009uN c4009uN4, C4009uN c4009uN5, C2860Xh c2860Xh2, C4121wa c4121wa, C4009uN c4009uN6, C4009uN c4009uN7, C4009uN c4009uN8) {
        this.f284k = c4117wN;
        this.f276b = c2860Xh;
        this.f277c = c4009uN;
        this.f278d = c4009uN2;
        this.f279e = c4009uN3;
        this.f280f = c4009uN4;
        this.f281g = c4009uN5;
        this.f285l = c2860Xh2;
        this.f286m = c4121wa;
        this.f282h = c4009uN6;
        this.i = c4009uN7;
        this.f283j = c4009uN8;
    }
}
