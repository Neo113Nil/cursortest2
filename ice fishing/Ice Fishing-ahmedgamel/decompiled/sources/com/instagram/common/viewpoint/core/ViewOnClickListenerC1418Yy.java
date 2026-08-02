package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Yy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1418Yy implements View.OnClickListener {
    public static String[] A01 = {"F6joGwlDI8iHbOzAisWUuE", "maTihVjplMt3yFJVJjmC0KmpbmehhX2e", "XpTxCcWpZPP2y4C0a9j2n0d0MxBWLTpI", "sgfvA1KSqWI8KtEvB6m8ZyDvc5DWsN6n", "pzMBgxyxqMiPYS0J7CYt5msvRsH6xIdq", "11mnBsf4lSYjVT8AEBIdPT", "UMn24MW5IHqIwX55a9EJeoGY4QyDeK8V", "me7LrSnqK6vn3rCyE1y3nY3eC8Lw1mdr"};
    public final /* synthetic */ C07046g A00;

    public ViewOnClickListenerC1418Yy(C07046g c07046g) {
        this.A00 = c07046g;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewOnClickListenerC0867Dg viewOnClickListenerC0867Dg;
        if (WU.A02(this)) {
            return;
        }
        try {
            viewOnClickListenerC0867Dg = this.A00.A0A;
            viewOnClickListenerC0867Dg.onClick(view);
        } catch (Throwable th) {
            WU.A00(th, this);
            if (A01[3].charAt(5) != '1') {
                throw new RuntimeException();
            }
            A01[1] = "W3cGemgA1Z9oaIj4IYerUOiD4w2U2gjw";
        }
    }
}
