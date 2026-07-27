package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import java.util.HashMap;
import t2.BinderC5036d;

/* renamed from: com.google.android.gms.internal.ads.Wp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnCancelListenerC2848Wp implements DialogInterface.OnCancelListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28405n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ BinderC2880Yp f28406u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ BinderC5036d f28407v;

    public /* synthetic */ DialogInterfaceOnCancelListenerC2848Wp(BinderC2880Yp binderC2880Yp, BinderC5036d binderC5036d, int i) {
        this.f28405n = i;
        this.f28406u = binderC2880Yp;
        this.f28407v = binderC5036d;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
        switch (this.f28405n) {
            case 0:
                BinderC2880Yp binderC2880Yp = this.f28406u;
                binderC2880Yp.f28747x.i(binderC2880Yp.f28748y);
                HashMap hashMap = new HashMap();
                hashMap.put("dialog_action", "dismiss");
                binderC2880Yp.a4(binderC2880Yp.f28748y, "dialog_click", hashMap);
                BinderC5036d binderC5036d = this.f28407v;
                if (binderC5036d != null) {
                    binderC5036d.t();
                    break;
                }
                break;
            default:
                BinderC2880Yp binderC2880Yp2 = this.f28406u;
                binderC2880Yp2.f28747x.i(binderC2880Yp2.f28748y);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("dialog_action", "dismiss");
                binderC2880Yp2.a4(binderC2880Yp2.f28748y, "rtsdc", hashMap2);
                BinderC5036d binderC5036d2 = this.f28407v;
                if (binderC5036d2 != null) {
                    binderC5036d2.t();
                    break;
                }
                break;
        }
    }
}
