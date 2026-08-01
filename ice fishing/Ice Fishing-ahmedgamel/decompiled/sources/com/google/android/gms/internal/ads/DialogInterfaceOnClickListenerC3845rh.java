package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.internal.ads.rh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogInterfaceOnClickListenerC3845rh implements DialogInterface.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33648n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ JsResult f33649u;

    public /* synthetic */ DialogInterfaceOnClickListenerC3845rh(JsResult jsResult, int i) {
        this.f33648n = i;
        this.f33649u = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f33648n) {
            case 0:
                this.f33649u.cancel();
                break;
            default:
                this.f33649u.confirm();
                break;
        }
    }
}
