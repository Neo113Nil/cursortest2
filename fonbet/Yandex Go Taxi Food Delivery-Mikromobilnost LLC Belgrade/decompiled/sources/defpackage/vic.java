package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import com.yandex.go.tariffcard.ui.recyclerview.animationmanager.CombinedValueAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class vic implements sg2 {
    public final List a;

    public vic(List list) {
        this.a = list;
    }

    @Override // defpackage.sg2
    public final ValueAnimator a(View view) {
        List list = this.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((sg2) it.next()).a(view));
        }
        return new CombinedValueAnimator(arrayList, CombinedValueAnimator.DurationScaleMode.TOGETHER_END, 0L, 4, null);
    }

    @Override // defpackage.sg2
    public final ValueAnimator b(View view, uo31 uo31Var) {
        List list = this.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((sg2) it.next()).b(view, uo31Var));
        }
        return new CombinedValueAnimator(arrayList, CombinedValueAnimator.DurationScaleMode.TOGETHER_START, 0L, 4, null);
    }

    @Override // defpackage.sg2
    public final void c(ValueAnimator valueAnimator, long j) {
        List<ValueAnimator> animators;
        CombinedValueAnimator combinedValueAnimator = valueAnimator instanceof CombinedValueAnimator ? (CombinedValueAnimator) valueAnimator : null;
        if (combinedValueAnimator != null && (animators = combinedValueAnimator.getAnimators()) != null) {
            Iterator it = a.P0(animators, this.a).iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                ((sg2) pair.getSecond()).c((ValueAnimator) pair.getFirst(), j);
            }
        }
        if (combinedValueAnimator != null) {
            combinedValueAnimator.bindInnerAnimators();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vic) && this.a.equals(((vic) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("CombinedAnimation(animations=", Extension.C_BRAKE, this.a);
    }
}
