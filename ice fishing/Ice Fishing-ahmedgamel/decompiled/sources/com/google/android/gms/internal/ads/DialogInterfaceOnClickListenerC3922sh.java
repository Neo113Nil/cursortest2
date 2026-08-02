package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import r2.C4906k;
import w2.C5147g;

/* renamed from: com.google.android.gms.internal.ads.sh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogInterfaceOnClickListenerC3922sh implements DialogInterface.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f34769n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f34770u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f34771v;

    public /* synthetic */ DialogInterfaceOnClickListenerC3922sh(int i, Object obj, Object obj2) {
        this.f34769n = i;
        this.f34770u = obj;
        this.f34771v = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f34769n) {
            case 0:
                ((JsPromptResult) this.f34770u).confirm(((EditText) this.f34771v).getText().toString());
                break;
            default:
                C5147g c5147g = (C5147g) this.f34770u;
                c5147g.getClass();
                w2.D d9 = C4906k.f40186C.f40191c;
                w2.D.s(c5147g.f41661a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", (String) this.f34771v), "Share via"));
                break;
        }
    }
}
