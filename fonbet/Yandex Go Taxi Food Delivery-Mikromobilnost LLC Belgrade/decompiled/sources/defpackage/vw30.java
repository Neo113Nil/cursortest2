package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.masstransit.design.snippet.MtSnippetView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class vw30 implements zo31 {
    public final GoConstraintLayout a;
    public final RobotoTextView b;
    public final GoImageView c;
    public final MtSnippetView d;

    public vw30(GoConstraintLayout goConstraintLayout, RobotoTextView robotoTextView, GoImageView goImageView, MtSnippetView mtSnippetView) {
        this.a = goConstraintLayout;
        this.b = robotoTextView;
        this.c = goImageView;
        this.d = mtSnippetView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
