package defpackage;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.design.view.GoView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.scooters.presentation.feedback.ScootersFeedbackCard;
import ru.yandex.taxi.scooters.presentation.finish_info.info.ScootersFinishInfoCard;
import ru.yandex.taxi.scooters.presentation.finish_info.statistics.ScootersFinishInfoStatisticsCard;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class rnn0 implements zo31 {
    public final GoFrameLayout a;
    public final GoView b;
    public final GoConstraintLayout c;
    public final GoConstraintLayout d;
    public final ButtonComponent e;
    public final ScootersFeedbackCard f;
    public final ScootersFinishInfoCard g;
    public final RobotoTextView h;
    public final GoLinearLayout i;
    public final ListItemComponent j;
    public final ListItemComponent k;
    public final NestedScrollView l;
    public final GoFrameLayout m;
    public final GoFrameLayout n;
    public final ScootersFinishInfoStatisticsCard o;

    public rnn0(GoFrameLayout goFrameLayout, GoView goView, GoConstraintLayout goConstraintLayout, GoConstraintLayout goConstraintLayout2, ButtonComponent buttonComponent, ScootersFeedbackCard scootersFeedbackCard, ScootersFinishInfoCard scootersFinishInfoCard, RobotoTextView robotoTextView, GoLinearLayout goLinearLayout, ListItemComponent listItemComponent, ListItemComponent listItemComponent2, NestedScrollView nestedScrollView, GoFrameLayout goFrameLayout2, GoFrameLayout goFrameLayout3, ScootersFinishInfoStatisticsCard scootersFinishInfoStatisticsCard) {
        this.a = goFrameLayout;
        this.b = goView;
        this.c = goConstraintLayout;
        this.d = goConstraintLayout2;
        this.e = buttonComponent;
        this.f = scootersFeedbackCard;
        this.g = scootersFinishInfoCard;
        this.h = robotoTextView;
        this.i = goLinearLayout;
        this.j = listItemComponent;
        this.k = listItemComponent2;
        this.l = nestedScrollView;
        this.m = goFrameLayout2;
        this.n = goFrameLayout3;
        this.o = scootersFinishInfoStatisticsCard;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
