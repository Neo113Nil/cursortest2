package u2;

import android.content.Context;
import java.util.Objects;
import q2.AbstractBinderC4897n0;
import q2.C4920z0;

/* renamed from: u2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC5077h extends AbstractBinderC4897n0 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f41282n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j f41283u;

    public BinderC5077h(j jVar, Context context) {
        this.f41282n = context;
        Objects.requireNonNull(jVar);
        this.f41283u = jVar;
    }

    @Override // q2.InterfaceC4899o0
    public final void o2(C4920z0 c4920z0) {
        if (c4920z0 == null) {
            return;
        }
        this.f41283u.i(this.f41282n, c4920z0.f40214u, true, true);
    }
}
