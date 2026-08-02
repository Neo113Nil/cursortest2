package defpackage;

import android.text.TextPaint;
import android.view.ViewGroup;
import androidx.recyclerview.widget.x0;
import com.yandex.go.feed.global.div.custom.time_slot_histogram.TimeSlotHistogramSlotView;

/* loaded from: classes6.dex */
public final class z7z0 extends x0 {
    public final TimeSlotHistogramSlotView N;
    public final m7z0 O;
    public final TextPaint P;

    public z7z0(TimeSlotHistogramSlotView timeSlotHistogramSlotView, m7z0 m7z0Var) {
        super(timeSlotHistogramSlotView);
        this.N = timeSlotHistogramSlotView;
        this.O = m7z0Var;
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(tje.r(mrg0.component_text_size_caption, timeSlotHistogramSlotView.getContext()));
        int[] iArr = up11.a;
        textPaint.setTypeface(eja1.w(3, 0));
        this.P = textPaint;
    }

    public final void W(p7z0 p7z0Var, boolean z, int i, Object obj) {
        p7z0 p7z0Var2;
        y7z0 y7z0Var = new y7z0(0, this, p7z0Var);
        TimeSlotHistogramSlotView timeSlotHistogramSlotView = this.N;
        timeSlotHistogramSlotView.setOnClickListener(y7z0Var);
        float f = p7z0Var.e;
        String str = p7z0Var.b;
        String str2 = p7z0Var.c;
        int b = m810.b(i * f);
        int r = tje.r(usg0.due_timetable_available_slot_side_padding, timeSlotHistogramSlotView.getContext());
        int i2 = p7z0Var.k;
        boolean z2 = (i2 & 1) != 0;
        boolean z3 = (i2 & 2) != 0;
        float max = (!z2 || str2 == null) ? 0.0f : Math.max(0.0f, X(str2));
        if (z3) {
            max = Math.max(max, X(str));
        }
        timeSlotHistogramSlotView.setLayoutParams(new ViewGroup.LayoutParams(Math.max(b, max != 0.0f ? m810.b(max + (r * 2)) : 0), -1));
        timeSlotHistogramSlotView.setPaddingRelative(r, timeSlotHistogramSlotView.getPaddingTop(), r, timeSlotHistogramSlotView.getPaddingBottom());
        timeSlotHistogramSlotView.setDesignConfiguration(p7z0Var.i);
        timeSlotHistogramSlotView.setImageUrl(p7z0Var.h);
        boolean z4 = p7z0Var.f;
        w7z0 w7z0Var = v7z0.a;
        w7z0 u7z0Var = z4 ? w7z0Var : new u7z0(p7z0Var.d);
        w7z0 w7z0Var2 = null;
        yhj yhjVar = obj instanceof yhj ? (yhj) obj : null;
        if (yhjVar != null && (p7z0Var2 = (p7z0) yhjVar.a) != null) {
            if (!p7z0Var2.f) {
                w7z0Var = new u7z0(p7z0Var2.d);
            }
            w7z0Var2 = w7z0Var;
        }
        timeSlotHistogramSlotView.setSlotState(w7z0Var2, u7z0Var);
        if (str == null) {
            str = "";
        }
        timeSlotHistogramSlotView.setLabel(str);
        if (str2 == null) {
            str2 = "";
        }
        timeSlotHistogramSlotView.setTopText(str2);
        timeSlotHistogramSlotView.setSelected(z, jl40.l(obj, "animate_selection"));
        String str3 = p7z0Var.g;
        if (str3 != null) {
            timeSlotHistogramSlotView.setContentDescription(str3);
        }
    }

    public final float X(String str) {
        if (str != null && str.length() != 0) {
            jjy jjyVar = new jjy(str);
            if (jjyVar.hasNext()) {
                String str2 = (String) jjyVar.next();
                TextPaint textPaint = this.P;
                float measureText = textPaint.measureText(str2);
                while (jjyVar.hasNext()) {
                    measureText = Math.max(measureText, textPaint.measureText((String) jjyVar.next()));
                }
                return measureText;
            }
            ny61.p();
        }
        return 0.0f;
    }
}
