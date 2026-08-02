package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;

/* loaded from: classes10.dex */
public final class yes0 {
    public static SimpleSpinnerModalView a(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        Object tag = viewGroup.getTag(ndh0.simple_spinner);
        if (tag instanceof SimpleSpinnerModalView) {
            return (SimpleSpinnerModalView) tag;
        }
        return null;
    }

    public static void b(ViewGroup viewGroup) {
        SimpleSpinnerModalView a = a(viewGroup);
        if (a != null) {
            a.dismiss();
        }
    }

    public static SimpleSpinnerModalView c(ViewGroup viewGroup, boolean z, boolean z2) {
        SimpleSpinnerModalView a = a(viewGroup);
        if (a != null) {
            return a;
        }
        SimpleSpinnerModalView simpleSpinnerModalView = (SimpleSpinnerModalView) LayoutInflater.from(viewGroup.getContext()).inflate(sph0.simple_spinner_layout, viewGroup, false);
        simpleSpinnerModalView.notAnimateAfterAttach = z;
        simpleSpinnerModalView.isHidden = z2;
        viewGroup.addView(simpleSpinnerModalView);
        viewGroup.setTag(ndh0.simple_spinner, simpleSpinnerModalView);
        return simpleSpinnerModalView;
    }

    public static SimpleSpinnerModalView d(ViewGroup viewGroup, Runnable runnable) {
        SimpleSpinnerModalView c = c(viewGroup, false, false);
        c.setFocusableInTouchMode(true);
        c.requestAccessibilityFocus();
        qc qcVar = new qc(20, runnable);
        tje.a0(c.getContext(), qcVar);
        c.setOnBackPressedCallback(qcVar);
        return c;
    }
}
