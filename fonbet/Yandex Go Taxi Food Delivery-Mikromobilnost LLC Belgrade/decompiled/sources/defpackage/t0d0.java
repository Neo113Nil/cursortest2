package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.plus.home.animation.PlusLoadingAnimationView;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class t0d0 implements n5d0 {
    public final LinkedHashMap a = new LinkedHashMap();

    @Override // defpackage.n5d0
    public final void k(ViewGroup viewGroup) {
        viewGroup.removeView((View) this.a.remove(viewGroup));
    }

    @Override // defpackage.n5d0
    public final void z(ViewGroup viewGroup) {
        LinkedHashMap linkedHashMap = this.a;
        viewGroup.removeView((View) linkedHashMap.remove(viewGroup));
        PlusLoadingAnimationView plusLoadingAnimationView = new PlusLoadingAnimationView(viewGroup.getContext());
        viewGroup.addView(plusLoadingAnimationView);
        linkedHashMap.put(viewGroup, plusLoadingAnimationView);
    }
}
