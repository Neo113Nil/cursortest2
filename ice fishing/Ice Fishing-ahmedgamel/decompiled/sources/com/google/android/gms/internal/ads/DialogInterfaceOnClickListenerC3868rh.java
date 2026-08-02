package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.internal.ads.rh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogInterfaceOnClickListenerC3868rh implements DialogInterface.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f34421n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ JsResult f34422u;

    public /* synthetic */ DialogInterfaceOnClickListenerC3868rh(JsResult jsResult, int i) {
        this.f34421n = i;
        this.f34422u = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f34421n) {
            case 0:
                this.f34422u.cancel();
                break;
            default:
                this.f34422u.confirm();
                break;
        }
    }
}
