package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.NestedScrollableHost;

/* loaded from: classes6.dex */
public final class qy30 extends lys {
    public static final /* synthetic */ int T = 0;
    public final RecyclerView S;

    public qy30(NestedScrollableHost nestedScrollableHost) {
        super(nestedScrollableHost);
        this.S = (RecyclerView) ((NestedScrollableHost) ((View) this.R)).findViewById(reh0.routes);
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        this.S.setAdapter(((mgl0) obj).a);
    }
}
