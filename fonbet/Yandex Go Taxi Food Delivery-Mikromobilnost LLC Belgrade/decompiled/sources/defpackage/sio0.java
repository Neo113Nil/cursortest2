package defpackage;

import android.view.View;
import android.view.ViewStub;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class sio0 implements zo31 {
    public final ConstraintLayout a;
    public final Guideline b;
    public final ButtonComponent c;
    public final Group d;
    public final RobotoTextView e;
    public final RobotoTextView f;
    public final RobotoTextView g;
    public final ViewStub h;
    public final View i;
    public final View j;
    public final Group k;
    public final ButtonComponent l;
    public final AppCompatImageView m;
    public final ToolbarComponent n;
    public final Guideline o;

    public sio0(ConstraintLayout constraintLayout, Guideline guideline, ButtonComponent buttonComponent, Group group, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, ViewStub viewStub, View view, View view2, Group group2, ButtonComponent buttonComponent2, AppCompatImageView appCompatImageView, ToolbarComponent toolbarComponent, Guideline guideline2) {
        this.a = constraintLayout;
        this.b = guideline;
        this.c = buttonComponent;
        this.d = group;
        this.e = robotoTextView;
        this.f = robotoTextView2;
        this.g = robotoTextView3;
        this.h = viewStub;
        this.i = view;
        this.j = view2;
        this.k = group2;
        this.l = buttonComponent2;
        this.m = appCompatImageView;
        this.n = toolbarComponent;
        this.o = guideline2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
