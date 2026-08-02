package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class qtq extends kzb {
    public final quq q;
    public final Rect r;

    public qtq(quq quqVar) {
        super(quqVar);
        this.q = quqVar;
        this.r = new Rect();
        wdu.q(quqVar, this);
        quqVar.setAccessibilityLiveRegion(1);
    }

    public final float A(int i) {
        quq quqVar = this.q;
        if (i == 0) {
            return quqVar.getThumbValue();
        }
        Float thumbSecondaryValue = quqVar.getThumbSecondaryValue();
        return thumbSecondaryValue != null ? thumbSecondaryValue.floatValue() : quqVar.getThumbValue();
    }

    @Override // defpackage.kzb
    public final int o(float f, float f2) {
        int D;
        quq quqVar = this.q;
        if (f < quqVar.getPaddingLeft() || (D = ouj.D(quqVar.b((int) f))) == 0) {
            return 0;
        }
        if (D == 1) {
            return 1;
        }
        b6e.s();
        return 0;
    }

    @Override // defpackage.kzb
    public final void p(ArrayList arrayList) {
        arrayList.add(0);
        if (this.q.getThumbSecondaryValue() != null) {
            arrayList.add(1);
        }
    }

    @Override // defpackage.kzb
    public final boolean u(int i, int i2, Bundle bundle) {
        float A;
        quq quqVar = this.q;
        if (i2 == 4096) {
            A = A(i) + Math.max(eeh.a((quqVar.getMaxValue() - quqVar.getMinValue()) * 0.05d), 1);
        } else if (i2 == 8192) {
            A = A(i) - Math.max(eeh.a((quqVar.getMaxValue() - quqVar.getMinValue()) * 0.05d), 1);
        } else {
            if (i2 != 16908349 || bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                return false;
            }
            A = bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE");
        }
        quqVar.q((i == 0 || quqVar.getThumbSecondaryValue() == null) ? 1 : 2, quqVar.f(A), false, true);
        z(i, 4);
        q(i, 0);
        return true;
    }

    @Override // defpackage.kzb
    public final void w(int i, vb vbVar) {
        int V;
        int U;
        vbVar.n("android.widget.SeekBar");
        quq quqVar = this.q;
        vbVar.a.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(0, quqVar.getMinValue(), quqVar.getMaxValue(), A(i)));
        StringBuilder sb = new StringBuilder();
        CharSequence contentDescription = quqVar.getContentDescription();
        if (contentDescription != null) {
            sb.append(contentDescription);
            sb.append(StringUtils.COMMA);
        }
        String str = "";
        if (quqVar.getThumbSecondaryValue() != null) {
            if (i == 0) {
                str = quqVar.getContext().getString(R.string.div_slider_range_start);
            } else if (i == 1) {
                str = quqVar.getContext().getString(R.string.div_slider_range_end);
            }
        }
        sb.append(str);
        vbVar.r(sb.toString());
        vbVar.b(qb.i);
        vbVar.b(qb.j);
        if (i == 1) {
            int i2 = quq.I;
            V = hdg.V(quqVar.getThumbSecondaryDrawable());
            U = hdg.U(quqVar.getThumbSecondaryDrawable());
        } else {
            int i3 = quq.I;
            V = hdg.V(quqVar.getThumbDrawable());
            U = hdg.U(quqVar.getThumbDrawable());
        }
        int paddingLeft = quqVar.getPaddingLeft() + quqVar.r(quqVar.getWidth(), A(i));
        Rect rect = this.r;
        rect.left = paddingLeft;
        rect.right = paddingLeft + V;
        rect.top = (((quqVar.getPaddingTop() + quqVar.getHeight()) - quqVar.getPaddingBottom()) - U) / 2;
        rect.bottom = (((quqVar.getPaddingTop() + quqVar.getHeight()) - quqVar.getPaddingBottom()) + U) / 2;
        vbVar.k(rect);
    }

    @Override // defpackage.kzb, androidx.core.view.a
    public final void d(View view, vb vbVar) {
    }
}
