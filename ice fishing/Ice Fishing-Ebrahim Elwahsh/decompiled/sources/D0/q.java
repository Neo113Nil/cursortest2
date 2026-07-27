package D0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class q extends p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s.b f661a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f662b;

    public q(r rVar, s.b bVar) {
        this.f662b = rVar;
        this.f661a = bVar;
    }

    @Override // D0.m
    public final void d(o oVar) {
        ((ArrayList) this.f661a.getOrDefault(this.f662b.f664u, null)).remove(oVar);
        oVar.C(this);
    }
}
