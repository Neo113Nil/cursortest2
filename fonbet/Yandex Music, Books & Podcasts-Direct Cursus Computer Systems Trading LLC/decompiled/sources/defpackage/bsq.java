package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class bsq extends c9g {
    public final /* synthetic */ int a = 1;

    @Override // defpackage.esq
    public final float a(ViewGroup viewGroup, View view) {
        switch (this.a) {
            case 0:
                return view.getTranslationY() - viewGroup.getHeight();
            default:
                return view.getTranslationY() + viewGroup.getHeight();
        }
    }
}
