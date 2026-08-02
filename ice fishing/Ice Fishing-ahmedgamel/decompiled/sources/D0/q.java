package D0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class q extends p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s.b f502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f503b;

    public q(r rVar, s.b bVar) {
        this.f503b = rVar;
        this.f502a = bVar;
    }

    @Override // D0.m
    public final void d(o oVar) {
        ((ArrayList) this.f502a.getOrDefault(this.f503b.f505u, null)).remove(oVar);
        oVar.C(this);
    }
}
