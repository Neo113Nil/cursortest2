package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import com.yandex.go.chargers.design.components.badges.ChargersBadgesView;
import com.yandex.go.chargers.tariff_item_info.api.ChargersTariffsView;
import com.yandex.go.design.divider.CardDivider;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoView;
import ru.yandex.taxi.design.DialogueComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NumberCheckoutView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringBar;

/* loaded from: classes12.dex */
public final class r8a implements zo31 {
    public final ChargersTariffsView A;
    public final FrameLayout a;
    public final ListItemComponent b;
    public final ImageView c;
    public final ImageView d;
    public final GoConstraintLayout e;
    public final RobotoTextView f;
    public final ChargersBadgesView g;
    public final GoView h;
    public final RobotoTextView i;
    public final ComposeView j;
    public final Group k;
    public final GoImageView l;
    public final RobotoTextView m;
    public final RobotoTextView n;
    public final RobotoTextView o;
    public final GoConstraintLayout p;
    public final NestedScrollView q;
    public final Group r;
    public final DialogueComponent s;
    public final ShimmeringBar t;
    public final Group u;
    public final Group v;
    public final NumberCheckoutView w;
    public final Group x;
    public final RobotoTextView y;
    public final CardDivider z;

    public r8a(FrameLayout frameLayout, ListItemComponent listItemComponent, ImageView imageView, ImageView imageView2, GoConstraintLayout goConstraintLayout, RobotoTextView robotoTextView, ChargersBadgesView chargersBadgesView, GoView goView, RobotoTextView robotoTextView2, ComposeView composeView, Group group, GoImageView goImageView, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4, RobotoTextView robotoTextView5, GoConstraintLayout goConstraintLayout2, NestedScrollView nestedScrollView, Group group2, DialogueComponent dialogueComponent, ShimmeringBar shimmeringBar, Group group3, Group group4, NumberCheckoutView numberCheckoutView, Group group5, RobotoTextView robotoTextView6, CardDivider cardDivider, ChargersTariffsView chargersTariffsView) {
        this.a = frameLayout;
        this.b = listItemComponent;
        this.c = imageView;
        this.d = imageView2;
        this.e = goConstraintLayout;
        this.f = robotoTextView;
        this.g = chargersBadgesView;
        this.h = goView;
        this.i = robotoTextView2;
        this.j = composeView;
        this.k = group;
        this.l = goImageView;
        this.m = robotoTextView3;
        this.n = robotoTextView4;
        this.o = robotoTextView5;
        this.p = goConstraintLayout2;
        this.q = nestedScrollView;
        this.r = group2;
        this.s = dialogueComponent;
        this.t = shimmeringBar;
        this.u = group3;
        this.v = group4;
        this.w = numberCheckoutView;
        this.x = group5;
        this.y = robotoTextView6;
        this.z = cardDivider;
        this.A = chargersTariffsView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
