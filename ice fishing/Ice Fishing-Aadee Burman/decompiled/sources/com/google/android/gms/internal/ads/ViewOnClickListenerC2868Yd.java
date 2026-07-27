package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Yd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC2868Yd implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28694n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f28695u;

    public /* synthetic */ ViewOnClickListenerC2868Yd(C2595Hn c2595Hn) {
        this.f28695u = c2595Hn;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f28694n) {
            case 0:
                ((C2884Zd) this.f28695u).C(true);
                break;
            default:
                ((C2595Hn) this.f28695u).f25364j.f39690b = true;
                break;
        }
    }

    public ViewOnClickListenerC2868Yd(C2884Zd c2884Zd) {
        Objects.requireNonNull(c2884Zd);
        this.f28695u = c2884Zd;
    }
}
