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
    int f10623A;

    /* renamed from: B, reason: collision with root package name */
    int f10624B;

    /* renamed from: a, reason: collision with root package name */
    private boolean f10625a;

    public BaseNewStyleSDKSplashATView(Context context) {
        super(context);
    }

    private void D() {
        String B3 = this.f10522g.B();
        if (TextUtils.isEmpty(B3)) {
            if (this.f10522g.V() <= 0 || this.f10522g.W() <= 0) {
                return;
            }
            this.f10623A = this.f10522g.V();
            this.f10624B = this.f10522g.W();
            return;
        }
        f.a();
        int[] a9 = h.a(f.a(1, B3));
        if (a9 != null) {
            this.f10623A = a9[0];
            this.f10624B = a9[1];
        }
    }

    @Override // com.anythink.basead.ui.BaseSplashATView
    public final void a(boolean z6, int i) {
        int i4;
        super.a(z6, i);
        if (this.f10625a) {
            return;
        }
        this.f10625a = true;
        x xVar = this.f10521f;
        w wVar = this.f10522g;
        e.a(xVar);
        int i6 = 2;
        if (this.f10623A > this.f10624B) {
            i4 = 2;
        } else {
            i4 = 2;
            i6 = 1;
        }
        com.anythink.core.common.u.e.a(xVar, wVar, 1, i6, BaseSdkSplashATView.isSinglePicture(this.f10522g, this.f10521f.f14954o) ? i4 : 1, this.f10538x, this.f10539y);
    }

    @Override // com.anythink.basead.ui.BaseSplashATView, com.anythink.basead.ui.BaseATView
    public final void e() {
        super.e();
        String B3 = this.f10522g.B();
        if (TextUtils.isEmpty(B3)) {
            if (this.f10522g.V() <= 0 || this.f10522g.W() <= 0) {
                return;
            }
            this.f10623A = this.f10522g.V();
            this.f10624B = this.f10522g.W();
            return;
        }
        f.a();
        int[] a9 = h.a(f.a(1, B3));
        if (a9 != null) {
            this.f10623A = a9[0];
            this.f10624B = a9[1];
        }
    }

    public BaseNewStyleSDKSplashATView(Context context, x xVar, w wVar, com.anythink.basead.g.a aVar) {
        super(context, xVar, wVar, aVar);
    }
}
