package com.anythink.basead.ui.component;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.anythink.basead.ui.component.a.c;
import com.anythink.basead.ui.component.a.d;
import com.anythink.basead.ui.component.a.e;
import com.anythink.basead.ui.f.b;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;

/* loaded from: classes.dex */
public class CTAButtonLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    protected final int f10818a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f10819b;

    /* renamed from: c, reason: collision with root package name */
    protected final int f10820c;

    /* renamed from: d, reason: collision with root package name */
    protected final int f10821d;

    /* renamed from: e, reason: collision with root package name */
    d f10822e;

    /* renamed from: f, reason: collision with root package name */
    private int f10823f;

    public CTAButtonLayout(Context context) {
        this(context, null);
    }

    private void a() {
        setOrientation(0);
        this.f10823f = 0;
    }

    public void activateSubCloseButton() {
        d dVar = this.f10822e;
        if (dVar != null) {
            dVar.a(this);
        }
    }

    public void changeMajorButtonBackground(Drawable drawable) {
        d dVar = this.f10822e;
        if (dVar != null) {
            dVar.a(drawable);
        }
    }

    public void changeMinorButtonStyle() {
        d dVar = this.f10822e;
        if (dVar != null) {
            dVar.c(this);
        }
    }

    public View getMajorCTAButtonView() {
        d dVar = this.f10822e;
        return dVar != null ? dVar.b() : this;
    }

    public String getMajorCTAText() {
        d dVar = this.f10822e;
        return dVar != null ? dVar.a() : "";
    }

    public View getSubCloseView() {
        d dVar;
        if (this.f10823f != 3 || (dVar = this.f10822e) == null) {
            return null;
        }
        return dVar.c();
    }

    public void initSetting(w wVar, x xVar, boolean z8, b.a aVar) {
        int a9 = a(wVar, xVar, z8);
        int i = this.f10823f;
        if (a9 != i) {
            if (i != 0) {
                removeAllViews();
            }
            this.f10823f = a9;
            d cVar = a9 != 2 ? a9 != 3 ? new c() : new com.anythink.basead.ui.component.a.b() : new e();
            this.f10822e = cVar;
            cVar.b(this);
        }
        d dVar = this.f10822e;
        if (dVar != null) {
            dVar.a(this, wVar, xVar, z8, aVar);
        }
    }

    public boolean needInterceptCloseViewShow() {
        return this.f10823f == 3;
    }

    public void setMajorCTAText(String str) {
        d dVar = this.f10822e;
        if (dVar != null) {
            dVar.a(str);
        }
    }

    public CTAButtonLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CTAButtonLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10818a = 0;
        this.f10819b = 1;
        this.f10820c = 2;
        this.f10821d = 3;
        setOrientation(0);
        this.f10823f = 0;
    }

    public int a(w wVar, x xVar, boolean z8) {
        String valueOf = String.valueOf(xVar.f14320j);
        valueOf.getClass();
        if (valueOf.equals("1")) {
            return (z8 || xVar.f14325o.bl() != 2) ? 1 : 3;
        }
        if (valueOf.equals("3")) {
            return (TextUtils.equals("2", xVar.f14325o.Q()) || !com.anythink.basead.b.e.a(wVar, xVar)) ? xVar.f14325o.bl() == 2 ? 3 : 1 : (z8 || xVar.f14325o.bl() != 2) ? 1 : 3;
        }
        return 1;
    }

    private static d a(int i) {
        if (i == 2) {
            return new e();
        }
        if (i != 3) {
            return new c();
        }
        return new com.anythink.basead.ui.component.a.b();
    }
}
