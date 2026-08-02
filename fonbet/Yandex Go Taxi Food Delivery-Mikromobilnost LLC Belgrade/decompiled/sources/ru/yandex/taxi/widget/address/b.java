package ru.yandex.taxi.widget.address;

import android.view.View;
import defpackage.tje;
import defpackage.xw31;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes6.dex */
public final class b {
    public final ListItemComponent a;
    public final View b;
    public AddressOnMapController$AddressViewAnimationState c = AddressOnMapController$AddressViewAnimationState.VISIBLE;
    public boolean d;
    public String e;

    public b(ListItemComponent listItemComponent, View view) {
        this.a = listItemComponent;
        this.b = view;
        int u = tje.u(80, listItemComponent.getContext());
        xw31.E(listItemComponent, Integer.valueOf(u), 0, Integer.valueOf(u), 0);
    }

    public final void a(boolean z) {
        AddressOnMapController$AddressViewAnimationState addressOnMapController$AddressViewAnimationState = this.c;
        AddressOnMapController$AddressViewAnimationState addressOnMapController$AddressViewAnimationState2 = AddressOnMapController$AddressViewAnimationState.FADE_OUTED;
        if (addressOnMapController$AddressViewAnimationState == addressOnMapController$AddressViewAnimationState2) {
            return;
        }
        ListItemComponent listItemComponent = this.a;
        listItemComponent.setClickable(false);
        this.c = addressOnMapController$AddressViewAnimationState2;
        listItemComponent.animate().cancel();
        View view = this.b;
        view.animate().cancel();
        if (z) {
            listItemComponent.animate().alpha(0.0f).setDuration(200L);
            view.animate().alpha(0.0f).setDuration(200L);
        } else {
            listItemComponent.setAlpha(0.0f);
            view.setAlpha(0.0f);
        }
    }

    public final void b(final Runnable runnable) {
        ListItemComponent listItemComponent = this.a;
        if (runnable != null) {
            listItemComponent.setDebounceClickListener(new Runnable() { // from class: ru.yandex.taxi.widget.address.a
                @Override // java.lang.Runnable
                public final void run() {
                    if (b.this.c == AddressOnMapController$AddressViewAnimationState.VISIBLE) {
                        runnable.run();
                    }
                }
            });
        } else {
            listItemComponent.setDebounceClickListener(null);
        }
    }

    public final void c(boolean z) {
        AddressOnMapController$AddressViewAnimationState addressOnMapController$AddressViewAnimationState = this.c;
        AddressOnMapController$AddressViewAnimationState addressOnMapController$AddressViewAnimationState2 = AddressOnMapController$AddressViewAnimationState.VISIBLE;
        if (addressOnMapController$AddressViewAnimationState == addressOnMapController$AddressViewAnimationState2) {
            return;
        }
        ListItemComponent listItemComponent = this.a;
        listItemComponent.setClickable(true);
        this.c = addressOnMapController$AddressViewAnimationState2;
        listItemComponent.animate().cancel();
        View view = this.b;
        view.animate().cancel();
        if (z) {
            listItemComponent.animate().translationY(0.0f).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(300L);
            view.animate().alpha(1.0f).setDuration(300L);
        } else {
            listItemComponent.setAlpha(1.0f);
            listItemComponent.setTranslationY(0.0f);
            listItemComponent.setScaleX(1.0f);
            listItemComponent.setScaleY(1.0f);
        }
    }

    public final void d(boolean z) {
        ListItemComponent listItemComponent = this.a;
        boolean isSubTitleInProgress = listItemComponent.isSubTitleInProgress();
        if (this.d && isSubTitleInProgress == z) {
            return;
        }
        this.d = true;
        if (this.c == AddressOnMapController$AddressViewAnimationState.VISIBLE) {
            listItemComponent.animate().cancel();
            listItemComponent.setAlpha(1.0f);
        }
        listItemComponent.setSubtitle(this.e);
        listItemComponent.stopSubtitleProgressAnimation();
        if (z) {
            listItemComponent.startSubtitleProgressAnimation(null, 1000);
        }
    }
}
