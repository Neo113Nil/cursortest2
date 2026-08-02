package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import v2.BinderC5100d;

/* renamed from: com.google.android.gms.internal.ads.qh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogInterfaceOnCancelListenerC3815qh implements DialogInterface.OnCancelListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f34039n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f34040u;

    public /* synthetic */ DialogInterfaceOnCancelListenerC3815qh(int i, Object obj) {
        this.f34039n = i;
        this.f34040u = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f34039n) {
            case 0:
                ((JsResult) this.f34040u).cancel();
                break;
            case 1:
                ((JsPromptResult) this.f34040u).cancel();
                break;
            default:
                BinderC5100d binderC5100d = (BinderC5100d) this.f34040u;
                if (binderC5100d != null) {
                    binderC5100d.t();
                    break;
                }
                break;
        }
    }
}
