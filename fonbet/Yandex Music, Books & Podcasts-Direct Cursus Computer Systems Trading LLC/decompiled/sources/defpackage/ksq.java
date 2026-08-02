package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.view2.animations.a;

/* loaded from: classes3.dex */
public final class ksq extends dag {
    public final /* synthetic */ int a;

    @Override // defpackage.qsq
    public final float b(int i, View view, ViewGroup viewGroup) {
        switch (this.a) {
            case 0:
                float translationY = view.getTranslationY();
                lsq lsqVar = a.L;
                int height = viewGroup.getHeight() - view.getTop();
                if (i == -1) {
                    i = height;
                }
                return translationY + i;
            default:
                float translationY2 = view.getTranslationY();
                lsq lsqVar2 = a.L;
                int bottom = view.getBottom();
                if (i == -1) {
                    i = bottom;
                }
                return translationY2 - i;
        }
    }
}
