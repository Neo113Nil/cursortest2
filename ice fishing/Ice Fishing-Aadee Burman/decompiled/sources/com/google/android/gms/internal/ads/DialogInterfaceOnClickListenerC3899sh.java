package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import p2.C4835j;
import u2.C5076g;

/* renamed from: com.google.android.gms.internal.ads.sh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogInterfaceOnClickListenerC3899sh implements DialogInterface.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f34003n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f34004u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f34005v;

    public /* synthetic */ DialogInterfaceOnClickListenerC3899sh(int i, Object obj, Object obj2) {
        this.f34003n = i;
        this.f34004u = obj;
        this.f34005v = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f34003n) {
            case 0:
                ((JsPromptResult) this.f34004u).confirm(((EditText) this.f34005v).getText().toString());
                break;
            default:
                C5076g c5076g = (C5076g) this.f34004u;
                c5076g.getClass();
                u2.D d2 = C4835j.f39730C.f39735c;
                u2.D.s(c5076g.f41268a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", (String) this.f34005v), "Share via"));
                break;
        }
    }
}
