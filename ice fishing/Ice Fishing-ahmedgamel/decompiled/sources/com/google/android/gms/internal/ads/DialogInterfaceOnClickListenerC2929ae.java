package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* renamed from: com.google.android.gms.internal.ads.ae, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogInterfaceOnClickListenerC2929ae implements DialogInterface.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29066n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f29067u;

    public /* synthetic */ DialogInterfaceOnClickListenerC2929ae(int i, Object obj) {
        this.f29066n = i;
        this.f29067u = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f29066n) {
            case 0:
                ((C2983be) this.f29067u).y("User canceled the download.");
                break;
            default:
                ((JsPromptResult) this.f29067u).cancel();
                break;
        }
    }
}
