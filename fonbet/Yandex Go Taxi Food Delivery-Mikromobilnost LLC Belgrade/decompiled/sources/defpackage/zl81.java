package defpackage;

import android.view.View;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class zl81 extends ia71 {
    public final ge71 c;

    public zl81(View view, ge71 ge71Var) {
        super(view);
        this.c = ge71Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ia71
    public final void a(View view) {
        ((kp81) view).setRating(0.0f);
        view.setVisibility(8);
        view.setOnClickListener(null);
        view.setOnTouchListener(null);
        view.setSelected(false);
    }

    @Override // defpackage.ia71
    public final /* bridge */ /* synthetic */ boolean c(View view, Object obj) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ia71
    public final void e(View view, Object obj) {
        String str = (String) obj;
        try {
            float parseFloat = Float.parseFloat(str);
            kp81 kp81Var = (kp81) view;
            if (parseFloat < 0.0f) {
                parseFloat = 0.0f;
            }
            kp81Var.setRating(parseFloat);
        } catch (NumberFormatException e) {
            String.format("Could not parse rating value. Rating value is %s", Arrays.copyOf(new Object[]{str}, 1));
            this.c.d("Could not parse rating value", e);
        }
    }
}
