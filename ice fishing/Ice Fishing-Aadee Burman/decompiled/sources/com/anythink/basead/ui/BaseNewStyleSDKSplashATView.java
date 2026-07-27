package com.anythink.basead.ui;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.b.e;
import com.anythink.basead.b.f;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.h;

/* loaded from: classes.dex */
public abstract class BaseNewStyleSDKSplashATView extends BaseSdkSplashATView {

    /* renamed from: A, reason: collision with root package name */
    int f9837A;

    /* renamed from: B, reason: collision with root package name */
    int f9838B;

    /* renamed from: a, reason: collision with root package name */
    private boolean f9839a;

    public BaseNewStyleSDKSplashATView(Context context) {
        super(context);
    }

    private void D() {
        String B9 = this.f9736g.B();
        if (TextUtils.isEmpty(B9)) {
            if (this.f9736g.V() <= 0 || this.f9736g.W() <= 0) {
                return;
            }
            this.f9837A = this.f9736g.V();
            this.f9838B = this.f9736g.W();
            return;
        }
        f.a();
        int[] a9 = h.a(f.a(1, B9));
        if (a9 != null) {
            this.f9837A = a9[0];
            this.f9838B = a9[1];
        }
    }

    @Override // com.anythink.basead.ui.BaseSplashATView
    public final void a(boolean z3, int i) {
        int i6;
        super.a(z3, i);
        if (this.f9839a) {
            return;
        }
        this.f9839a = true;
        x xVar = this.f9735f;
        w wVar = this.f9736g;
        e.a(xVar);
        int i9 = 2;
        if (this.f9837A > this.f9838B) {
            i6 = 2;
        } else {
            i6 = 2;
            i9 = 1;
        }
        com.anythink.core.common.u.e.a(xVar, wVar, 1, i9, BaseSdkSplashATView.isSinglePicture(this.f9736g, this.f9735f.f14168o) ? i6 : 1, this.f9752x, this.f9753y);
    }

    @Override // com.anythink.basead.ui.BaseSplashATView, com.anythink.basead.ui.BaseATView
    public final void e() {
        super.e();
        String B9 = this.f9736g.B();
        if (TextUtils.isEmpty(B9)) {
            if (this.f9736g.V() <= 0 || this.f9736g.W() <= 0) {
                return;
            }
            this.f9837A = this.f9736g.V();
            this.f9838B = this.f9736g.W();
            return;
        }
        f.a();
        int[] a9 = h.a(f.a(1, B9));
        if (a9 != null) {
            this.f9837A = a9[0];
            this.f9838B = a9[1];
        }
    }

    public BaseNewStyleSDKSplashATView(Context context, x xVar, w wVar, com.anythink.basead.g.a aVar) {
        super(context, xVar, wVar, aVar);
    }
}
