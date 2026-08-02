package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoFrameLayout;

/* loaded from: classes13.dex */
public final class t5c0 implements zo31 {
    public final GoFrameLayout a;
    public final RecyclerView b;

    public t5c0(GoFrameLayout goFrameLayout, RecyclerView recyclerView) {
        this.a = goFrameLayout;
        this.b = recyclerView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
