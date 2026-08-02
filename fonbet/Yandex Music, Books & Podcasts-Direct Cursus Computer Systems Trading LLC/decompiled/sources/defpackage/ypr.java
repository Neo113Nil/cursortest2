package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ypr extends FrameLayout {
    public List a;
    public tu3 b;
    public float c;
    public float d;
    public boolean e;
    public boolean f;
    public int g;
    public wpr h;
    public View i;

    public ypr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = Collections.EMPTY_LIST;
        this.b = tu3.e;
        this.c = 0.0533f;
        this.d = 0.08f;
        this.e = true;
        this.f = true;
        qu3 qu3Var = new qu3(context, 0);
        this.h = qu3Var;
        this.i = qu3Var;
        addView(qu3Var);
        this.g = 1;
    }

    private List<Object> getCuesWithStylingPreferencesApplied() {
        if (this.e && this.f) {
            return this.a;
        }
        ArrayList arrayList = new ArrayList(this.a.size());
        if (this.a.size() <= 0) {
            return arrayList;
        }
        this.a.get(0).getClass();
        l1j.f();
        return null;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (yut.a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private tu3 getUserCaptionStyle() {
        CaptioningManager captioningManager;
        int i = yut.a;
        tu3 tu3Var = tu3.e;
        if (i < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return tu3Var;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        if (i >= 21) {
            return new tu3(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
        }
        return new tu3(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
    }

    private <T extends View & wpr> void setView(T t) {
        removeView(this.i);
        View view = this.i;
        if (view instanceof fgv) {
            ((fgv) view).b.destroy();
        }
        this.i = t;
        this.h = t;
        addView(t);
    }

    public final void a() {
        setStyle(getUserCaptionStyle());
    }

    public final void b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void c() {
        this.h.a(getCuesWithStylingPreferencesApplied(), this.b, this.c, this.d);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.f = z;
        c();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.e = z;
        c();
    }

    public void setBottomPaddingFraction(float f) {
        this.d = f;
        c();
    }

    public void setCues(List<Object> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.a = list;
        c();
    }

    public void setFractionalTextSize(float f) {
        this.c = f;
        c();
    }

    public void setStyle(tu3 tu3Var) {
        this.b = tu3Var;
        c();
    }

    public void setViewType(int i) {
        if (this.g == i) {
            return;
        }
        if (i == 1) {
            setView(new qu3(getContext(), 0));
        } else {
            if (i != 2) {
                e7o.e();
                return;
            }
            setView(new fgv(getContext()));
        }
        this.g = i;
    }

    public ypr(Context context) {
        this(context, null);
    }
}
