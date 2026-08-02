package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public final class kvd extends dpn {
    public final View a;
    public final int b;

    public kvd(View view) {
        view.getClass();
        this.a = view;
        Context context = view.getContext();
        context.getClass();
        this.b = (10 * sht.b(context).densityDpi) / 160;
    }

    @Override // defpackage.dpn
    public final void b(RecyclerView recyclerView, int i, int i2) {
        float computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset() / this.b;
        if (computeVerticalScrollOffset > 1.0f) {
            computeVerticalScrollOffset = 1.0f;
        }
        this.a.setElevation(computeVerticalScrollOffset * 4.0f);
    }
}
