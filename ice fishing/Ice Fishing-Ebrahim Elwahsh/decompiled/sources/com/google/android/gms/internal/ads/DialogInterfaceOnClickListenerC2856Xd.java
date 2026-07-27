package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* renamed from: com.google.android.gms.internal.ads.Xd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogInterfaceOnClickListenerC2856Xd implements DialogInterface.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28657n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f28658u;

    public /* synthetic */ DialogInterfaceOnClickListenerC2856Xd(int i, Object obj) {
        this.f28657n = i;
        this.f28658u = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f28657n) {
            case 0:
                ((C2873Yd) this.f28658u).t("User canceled the download.");
                break;
            default:
                ((JsPromptResult) this.f28658u).cancel();
                break;
        }
    }
}
