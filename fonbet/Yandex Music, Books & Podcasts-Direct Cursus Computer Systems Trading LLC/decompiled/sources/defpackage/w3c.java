package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public class w3c extends niu {
    public w3c(int i) {
        a0(i);
    }

    public static float c0(b9t b9tVar, float f) {
        Float f2;
        return (b9tVar == null || (f2 = (Float) b9tVar.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    @Override // defpackage.niu
    public final ObjectAnimator X(ViewGroup viewGroup, View view, b9t b9tVar, b9t b9tVar2) {
        yhu.a.getClass();
        return b0(view, c0(b9tVar, 0.0f), 1.0f);
    }

    @Override // defpackage.niu
    public final ObjectAnimator Z(ViewGroup viewGroup, View view, b9t b9tVar, b9t b9tVar2) {
        aiu aiuVar = yhu.a;
        aiuVar.getClass();
        ObjectAnimator b0 = b0(view, c0(b9tVar, 1.0f), 0.0f);
        if (b0 == null) {
            aiuVar.H(view, c0(b9tVar2, 1.0f));
        }
        return b0;
    }

    public final ObjectAnimator b0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        yhu.a.H(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, yhu.b, f2);
        u3c u3cVar = new u3c(view);
        ofFloat.addListener(u3cVar);
        t().b(u3cVar);
        return ofFloat;
    }

    @Override // defpackage.b8t
    public final void j(b9t b9tVar) {
        niu.U(b9tVar);
        View view = b9tVar.b;
        Float f = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f == null) {
            f = view.getVisibility() == 0 ? Float.valueOf(yhu.a.z(view)) : Float.valueOf(0.0f);
        }
        b9tVar.a.put("android:fade:transitionAlpha", f);
    }

    @Override // defpackage.b8t
    public final boolean y() {
        return true;
    }
}
