package w2;

import android.content.Context;
import java.util.Objects;
import s2.AbstractBinderC4946n0;
import s2.C4969z0;

/* renamed from: w2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC5148h extends AbstractBinderC4946n0 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f41672n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j f41673u;

    public BinderC5148h(j jVar, Context context) {
        this.f41672n = context;
        Objects.requireNonNull(jVar);
        this.f41673u = jVar;
    }

    @Override // s2.InterfaceC4948o0
    public final void a3(C4969z0 c4969z0) {
        if (c4969z0 == null) {
            return;
        }
        this.f41673u.i(this.f41672n, c4969z0.f40513u, true, true);
    }
}
