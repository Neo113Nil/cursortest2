package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class up80 implements zo31 {
    public final GoLinearLayout a;
    public final RobotoTextView b;
    public final RecyclerView c;

    public up80(GoLinearLayout goLinearLayout, RobotoTextView robotoTextView, RecyclerView recyclerView) {
        this.a = goLinearLayout;
        this.b = robotoTextView;
        this.c = recyclerView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
