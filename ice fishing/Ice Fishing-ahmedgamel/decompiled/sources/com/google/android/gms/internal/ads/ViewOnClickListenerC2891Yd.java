package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Yd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC2891Yd implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29469n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f29470u;

    public /* synthetic */ ViewOnClickListenerC2891Yd(C2632In c2632In) {
        this.f29470u = c2632In;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f29469n) {
            case 0:
                ((C2907Zd) this.f29470u).B(true);
                break;
            default:
                ((C2632In) this.f29470u).f26328j.f40145b = true;
                break;
        }
    }

    public ViewOnClickListenerC2891Yd(C2907Zd c2907Zd) {
        Objects.requireNonNull(c2907Zd);
        this.f29470u = c2907Zd;
    }
}
