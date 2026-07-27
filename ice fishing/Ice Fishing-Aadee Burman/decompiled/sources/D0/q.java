package D0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class q extends p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s.b f606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f607b;

    public q(r rVar, s.b bVar) {
        this.f607b = rVar;
        this.f606a = bVar;
    }

    @Override // D0.m
    public final void d(o oVar) {
        ((ArrayList) this.f606a.getOrDefault(this.f607b.f609u, null)).remove(oVar);
        oVar.C(this);
    }
}
