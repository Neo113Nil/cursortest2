package defpackage;

import android.view.View;
import com.yandex.go.mainscreen.superapp.impl.header.presentation.header.SuperAppMainScreenHeader;
import flex.utils.android.DimensionUnit;

/* loaded from: classes9.dex */
public final /* synthetic */ class yul implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yul(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i9) {
            case 0:
                g0d g0dVar = (g0d) obj2;
                h690 h690Var = (h690) obj;
                int i10 = g0dVar.a;
                View view2 = (View) g0dVar.c;
                int measuredHeight = i10 != 0 ? i10 != 1 ? view2.getMeasuredHeight() : view2.getMeasuredHeight() : view2.getMeasuredWidth();
                if (measuredHeight != g0dVar.b || !jl40.l((h690) g0dVar.f, h690Var)) {
                    g0dVar.b = measuredHeight;
                    ((tls) g0dVar.e).invoke(new pkj((int) (((g690) h690Var).a * measuredHeight), DimensionUnit.PX));
                    break;
                }
                break;
            default:
                SuperAppMainScreenHeader.listenToLayoutChanges$lambda$0((SuperAppMainScreenHeader) obj2, (int[]) obj, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }
}
