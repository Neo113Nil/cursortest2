package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import t2.BinderC5036d;

/* renamed from: com.google.android.gms.internal.ads.qh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogInterfaceOnCancelListenerC3792qh implements DialogInterface.OnCancelListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33257n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f33258u;

    public /* synthetic */ DialogInterfaceOnCancelListenerC3792qh(int i, Object obj) {
        this.f33257n = i;
        this.f33258u = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f33257n) {
            case 0:
                ((JsResult) this.f33258u).cancel();
                break;
            case 1:
                ((JsPromptResult) this.f33258u).cancel();
                break;
            default:
                BinderC5036d binderC5036d = (BinderC5036d) this.f33258u;
                if (binderC5036d != null) {
                    binderC5036d.t();
                    break;
                }
                break;
        }
    }
}
