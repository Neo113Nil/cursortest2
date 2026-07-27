package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import java.util.HashMap;
import s2.BinderC4996d;

/* renamed from: com.google.android.gms.internal.ads.Yp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnCancelListenerC2885Yp implements DialogInterface.OnCancelListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28886n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ BinderC2949aq f28887u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ BinderC4996d f28888v;

    public /* synthetic */ DialogInterfaceOnCancelListenerC2885Yp(BinderC2949aq binderC2949aq, BinderC4996d binderC4996d, int i) {
        this.f28886n = i;
        this.f28887u = binderC2949aq;
        this.f28888v = binderC4996d;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
        switch (this.f28886n) {
            case 0:
                BinderC2949aq binderC2949aq = this.f28887u;
                binderC2949aq.f29334x.g(binderC2949aq.f29335y);
                HashMap hashMap = new HashMap();
                hashMap.put("dialog_action", "dismiss");
                binderC2949aq.M3(binderC2949aq.f29335y, "dialog_click", hashMap);
                BinderC4996d binderC4996d = this.f28888v;
                if (binderC4996d != null) {
                    binderC4996d.z();
                    break;
                }
                break;
            default:
                BinderC2949aq binderC2949aq2 = this.f28887u;
                binderC2949aq2.f29334x.g(binderC2949aq2.f29335y);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("dialog_action", "dismiss");
                binderC2949aq2.M3(binderC2949aq2.f29335y, "rtsdc", hashMap2);
                BinderC4996d binderC4996d2 = this.f28888v;
                if (binderC4996d2 != null) {
                    binderC4996d2.z();
                    break;
                }
                break;
        }
    }
}
