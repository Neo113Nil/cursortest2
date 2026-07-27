package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import java.util.HashMap;
import s2.BinderC4996d;

/* renamed from: com.google.android.gms.internal.ads.Xp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC2868Xp implements DialogInterface.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28698n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f28699u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f28700v;

    public /* synthetic */ DialogInterfaceOnClickListenerC2868Xp(int i, Object obj, Object obj2) {
        this.f28698n = i;
        this.f28699u = obj;
        this.f28700v = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f28698n) {
            case 0:
                BinderC2949aq binderC2949aq = (BinderC2949aq) this.f28699u;
                binderC2949aq.f29334x.g(binderC2949aq.f29335y);
                HashMap hashMap = new HashMap();
                hashMap.put("dialog_action", "dismiss");
                binderC2949aq.M3(binderC2949aq.f29335y, "dialog_click", hashMap);
                BinderC4996d binderC4996d = (BinderC4996d) this.f28700v;
                if (binderC4996d != null) {
                    binderC4996d.z();
                    break;
                }
                break;
            case 1:
                BinderC2949aq binderC2949aq2 = (BinderC2949aq) this.f28699u;
                binderC2949aq2.f29334x.g(binderC2949aq2.f29335y);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("dialog_action", "dismiss");
                binderC2949aq2.M3(binderC2949aq2.f29335y, "rtsdc", hashMap2);
                BinderC4996d binderC4996d2 = (BinderC4996d) this.f28700v;
                if (binderC4996d2 != null) {
                    binderC4996d2.z();
                    break;
                }
                break;
            default:
                ((JsPromptResult) this.f28699u).confirm(((EditText) this.f28700v).getText().toString());
                break;
        }
    }
}
