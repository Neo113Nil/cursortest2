package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import s2.BinderC4996d;

/* renamed from: com.google.android.gms.internal.ads.mh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogInterfaceOnCancelListenerC3589mh implements DialogInterface.OnCancelListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32704n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f32705u;

    public /* synthetic */ DialogInterfaceOnCancelListenerC3589mh(int i, Object obj) {
        this.f32704n = i;
        this.f32705u = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f32704n) {
            case 0:
                ((JsResult) this.f32705u).cancel();
                break;
            case 1:
                ((JsPromptResult) this.f32705u).cancel();
                break;
            default:
                BinderC4996d binderC4996d = (BinderC4996d) this.f32705u;
                if (binderC4996d != null) {
                    binderC4996d.z();
                    break;
                }
                break;
        }
    }
}
