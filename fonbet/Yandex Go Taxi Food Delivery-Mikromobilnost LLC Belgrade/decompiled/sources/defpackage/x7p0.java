package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.scooters.presentation.common.ui.preview.ScootersVehiclePreviewView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class x7p0 implements zo31 {
    public final ScootersVehiclePreviewView a;
    public final ButtonComponent b;
    public final FrameLayout c;
    public final Group d;
    public final RobotoTextView e;
    public final AppCompatImageView f;
    public final Group g;
    public final ListItemComponent h;
    public final ListItemComponent i;
    public final RobotoTextView j;
    public final AppCompatImageView k;
    public final RobotoTextView l;
    public final Group m;
    public final ButtonComponent n;
    public final RobotoTextView o;

    public x7p0(ScootersVehiclePreviewView scootersVehiclePreviewView, ButtonComponent buttonComponent, FrameLayout frameLayout, Group group, RobotoTextView robotoTextView, AppCompatImageView appCompatImageView, Group group2, ListItemComponent listItemComponent, ListItemComponent listItemComponent2, RobotoTextView robotoTextView2, AppCompatImageView appCompatImageView2, RobotoTextView robotoTextView3, Group group3, ButtonComponent buttonComponent2, RobotoTextView robotoTextView4) {
        this.a = scootersVehiclePreviewView;
        this.b = buttonComponent;
        this.c = frameLayout;
        this.d = group;
        this.e = robotoTextView;
        this.f = appCompatImageView;
        this.g = group2;
        this.h = listItemComponent;
        this.i = listItemComponent2;
        this.j = robotoTextView2;
        this.k = appCompatImageView2;
        this.l = robotoTextView3;
        this.m = group3;
        this.n = buttonComponent2;
        this.o = robotoTextView4;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
