package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* renamed from: com.google.android.gms.internal.ads.ae, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogInterfaceOnClickListenerC2952ae implements DialogInterface.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29841n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f29842u;

    public /* synthetic */ DialogInterfaceOnClickListenerC2952ae(int i, Object obj) {
        this.f29841n = i;
        this.f29842u = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f29841n) {
            case 0:
                ((C3006be) this.f29842u).x("User canceled the download.");
                break;
            default:
                ((JsPromptResult) this.f29842u).cancel();
                break;
        }
    }
}
