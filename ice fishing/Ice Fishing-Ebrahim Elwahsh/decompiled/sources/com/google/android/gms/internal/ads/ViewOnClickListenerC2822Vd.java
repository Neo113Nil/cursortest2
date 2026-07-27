package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Vd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC2822Vd implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28269n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f28270u;

    public /* synthetic */ ViewOnClickListenerC2822Vd(C2611In c2611In) {
        this.f28270u = c2611In;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f28269n) {
            case 0:
                ((C2839Wd) this.f28270u).x(true);
                break;
            default:
                ((C2611In) this.f28270u).f25600j.f39758b = true;
                break;
        }
    }

    public ViewOnClickListenerC2822Vd(C2839Wd c2839Wd) {
        Objects.requireNonNull(c2839Wd);
        this.f28270u = c2839Wd;
    }
}
