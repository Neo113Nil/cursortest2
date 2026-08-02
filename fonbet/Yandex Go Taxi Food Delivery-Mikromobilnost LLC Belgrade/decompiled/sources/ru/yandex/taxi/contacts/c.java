package ru.yandex.taxi.contacts;

import android.content.Context;
import android.widget.FrameLayout;
import defpackage.bgb0;
import defpackage.bgq0;
import defpackage.dzg0;
import defpackage.f1h0;
import defpackage.kyh0;
import defpackage.vng;
import defpackage.w511;
import java.util.regex.Pattern;
import ru.yandex.taxi.contacts.SelectContactMvpView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;

/* loaded from: classes5.dex */
public final class c {
    public final Context a;

    public c(Context context) {
        this.a = context;
    }

    public final ListItemComponent a(bgq0 bgq0Var, SelectContactMvpView.UiState uiState, boolean z, Runnable runnable) {
        int i;
        ListItemComponent listItemComponent = new ListItemComponent(this.a, null, 0, 6, null);
        listItemComponent.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        listItemComponent.setBackground(vng.t(dzg0.component_selectable_list_item_bg, listItemComponent.getContext()));
        if (!z) {
            listItemComponent.setDividers(DividerPosition.BOTTOM, DividerType.NORMAL);
        }
        int i2 = b.a[uiState.ordinal()];
        if (i2 != 1) {
            i = 2;
            if (i2 != 2 && i2 != 3) {
                w511.b();
                return null;
            }
        } else {
            i = 1;
        }
        listItemComponent.setTrailMode(i);
        Pattern pattern = bgb0.a;
        String str = bgq0Var.a;
        String str2 = bgq0Var.b;
        if (str.length() <= 0) {
            str = bgb0.e(str2);
        }
        listItemComponent.setTitle(str);
        String e = bgb0.e(str2);
        if (e.length() != 0) {
            listItemComponent.setSubtitle(e);
        } else {
            listItemComponent.setSubtitle(str2);
        }
        listItemComponent.setClickable(true);
        if (uiState == SelectContactMvpView.UiState.EDIT) {
            listItemComponent.setClickableTrailImage(f1h0.cross_in_circle);
            listItemComponent.setTrailContainerClickListener(runnable);
            listItemComponent.setTrailContentDescription(listItemComponent.getContext().getString(kyh0.common_remove));
        }
        return listItemComponent;
    }
}
