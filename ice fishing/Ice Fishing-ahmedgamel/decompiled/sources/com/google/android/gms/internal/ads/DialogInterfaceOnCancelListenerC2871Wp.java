package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import java.util.HashMap;
import v2.BinderC5100d;

/* renamed from: com.google.android.gms.internal.ads.Wp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnCancelListenerC2871Wp implements DialogInterface.OnCancelListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29187n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ BinderC2903Yp f29188u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ BinderC5100d f29189v;

    public /* synthetic */ DialogInterfaceOnCancelListenerC2871Wp(BinderC2903Yp binderC2903Yp, BinderC5100d binderC5100d, int i) {
        this.f29187n = i;
        this.f29188u = binderC2903Yp;
        this.f29189v = binderC5100d;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
        switch (this.f29187n) {
            case 0:
                BinderC2903Yp binderC2903Yp = this.f29188u;
                binderC2903Yp.f29526x.i(binderC2903Yp.f29527y);
                HashMap hashMap = new HashMap();
                hashMap.put("dialog_action", "dismiss");
                binderC2903Yp.a4(binderC2903Yp.f29527y, "dialog_click", hashMap);
                BinderC5100d binderC5100d = this.f29189v;
                if (binderC5100d != null) {
                    binderC5100d.t();
                    break;
                }
                break;
            default:
                BinderC2903Yp binderC2903Yp2 = this.f29188u;
                binderC2903Yp2.f29526x.i(binderC2903Yp2.f29527y);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("dialog_action", "dismiss");
                binderC2903Yp2.a4(binderC2903Yp2.f29527y, "rtsdc", hashMap2);
                BinderC5100d binderC5100d2 = this.f29189v;
                if (binderC5100d2 != null) {
                    binderC5100d2.t();
                    break;
                }
                break;
        }
    }
}
