package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import java.util.HashMap;
import t2.BinderC5036d;

/* renamed from: com.google.android.gms.internal.ads.Vp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC2832Vp implements DialogInterface.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28240n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ BinderC2880Yp f28241u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ BinderC5036d f28242v;

    public /* synthetic */ DialogInterfaceOnClickListenerC2832Vp(BinderC2880Yp binderC2880Yp, BinderC5036d binderC5036d, int i) {
        this.f28240n = i;
        this.f28241u = binderC2880Yp;
        this.f28242v = binderC5036d;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f28240n) {
            case 0:
                BinderC2880Yp binderC2880Yp = this.f28241u;
                binderC2880Yp.f28747x.i(binderC2880Yp.f28748y);
                HashMap hashMap = new HashMap();
                hashMap.put("dialog_action", "dismiss");
                binderC2880Yp.a4(binderC2880Yp.f28748y, "dialog_click", hashMap);
                BinderC5036d binderC5036d = this.f28242v;
                if (binderC5036d != null) {
                    binderC5036d.t();
                    break;
                }
                break;
            default:
                BinderC2880Yp binderC2880Yp2 = this.f28241u;
                binderC2880Yp2.f28747x.i(binderC2880Yp2.f28748y);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("dialog_action", "dismiss");
                binderC2880Yp2.a4(binderC2880Yp2.f28748y, "rtsdc", hashMap2);
                BinderC5036d binderC5036d2 = this.f28242v;
                if (binderC5036d2 != null) {
                    binderC5036d2.t();
                    break;
                }
                break;
        }
    }
}
