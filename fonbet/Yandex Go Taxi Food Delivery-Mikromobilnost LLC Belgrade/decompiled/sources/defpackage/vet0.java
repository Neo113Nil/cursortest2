package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes6.dex */
public final /* synthetic */ class vet0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ vet0(ViewGroup viewGroup, int i) {
        this.a = i;
        this.b = viewGroup;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        ViewGroup viewGroup = this.b;
        switch (i) {
            case 0:
                xw31.L(((t1w) obj).b, viewGroup);
                return Boolean.FALSE;
            default:
                Object parent = ((View) obj).getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || view == viewGroup) {
                    return null;
                }
                return view;
        }
    }
}
