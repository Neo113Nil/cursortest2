package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.due_timetable.presentation.widget.ShimmeringDueTimetableView;
import com.yandex.go.ui.CircleLoadingImageView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringBar;

/* loaded from: classes12.dex */
public final class qzm implements zo31 {
    public final /* synthetic */ int a;
    public final View b;
    public final Object c;
    public final Object d;
    public final View e;
    public final View f;
    public final View g;
    public final View h;

    public qzm(ConstraintLayout constraintLayout, LinearLayout linearLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4, CircleLoadingImageView circleLoadingImageView) {
        this.a = 6;
        this.d = constraintLayout;
        this.c = linearLayout;
        this.e = robotoTextView;
        this.f = robotoTextView2;
        this.b = robotoTextView3;
        this.g = robotoTextView4;
        this.h = circleLoadingImageView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                return (LinearLayout) obj;
            case 1:
                return (GoConstraintLayout) obj;
            case 2:
                return (FrameLayout) this.e;
            case 3:
                return (ConstraintLayout) obj;
            case 4:
                return (ConstraintLayout) obj;
            case 5:
                return (ConstraintLayout) obj;
            default:
                return (ConstraintLayout) this.d;
        }
    }

    public /* synthetic */ qzm(ConstraintLayout constraintLayout, View view, View view2, View view3, View view4, RobotoTextView robotoTextView, View view5, int i) {
        this.a = i;
        this.c = constraintLayout;
        this.d = view;
        this.e = view2;
        this.f = view3;
        this.b = view4;
        this.g = robotoTextView;
        this.h = view5;
    }

    public qzm(LinearLayout linearLayout, FrameLayout frameLayout, View view, LinearLayout linearLayout2, ShimmeringBar shimmeringBar, ShimmeringDueTimetableView shimmeringDueTimetableView, ShimmeringBar shimmeringBar2) {
        this.a = 0;
        this.c = linearLayout;
        this.e = frameLayout;
        this.f = view;
        this.d = linearLayout2;
        this.b = shimmeringBar;
        this.h = shimmeringDueTimetableView;
        this.g = shimmeringBar2;
    }

    public qzm(FrameLayout frameLayout, m2y m2yVar, qzm qzmVar, RobotoTextView robotoTextView, ImageView imageView, FrameLayout frameLayout2, ConstraintLayout constraintLayout) {
        this.a = 2;
        this.e = frameLayout;
        this.c = m2yVar;
        this.d = qzmVar;
        this.f = robotoTextView;
        this.b = imageView;
        this.g = frameLayout2;
        this.h = constraintLayout;
    }

    public qzm(ConstraintLayout constraintLayout, RecyclerView recyclerView, RobotoTextView robotoTextView, ButtonComponent buttonComponent, ListItemInputComponent listItemInputComponent, RobotoTextView robotoTextView2, View view) {
        this.a = 5;
        this.c = constraintLayout;
        this.d = recyclerView;
        this.e = robotoTextView;
        this.b = buttonComponent;
        this.g = listItemInputComponent;
        this.h = robotoTextView2;
        this.f = view;
    }

    public qzm(GoConstraintLayout goConstraintLayout, RobotoTextView robotoTextView, GoImageView goImageView, ShimmeringBar shimmeringBar, RobotoTextView robotoTextView2, Group group, RobotoTextView robotoTextView3) {
        this.a = 1;
        this.c = goConstraintLayout;
        this.d = robotoTextView;
        this.e = goImageView;
        this.b = shimmeringBar;
        this.f = robotoTextView2;
        this.g = group;
        this.h = robotoTextView3;
    }
}
