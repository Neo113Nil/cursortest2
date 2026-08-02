package ru.yandex.taxi.summary.topnotification.tariff_unavailable.ui;

import android.graphics.Bitmap;
import defpackage.evu0;
import defpackage.hpx0;
import defpackage.y7x0;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.summary.topnotification.tariff_unavailable.ui.TariffUnavailableNotificationComponent;

/* loaded from: classes6.dex */
public final class a implements TariffUnavailableNotificationComponent.a {
    public final /* synthetic */ TariffUnavailableNotificationComponent a;

    public a(TariffUnavailableNotificationComponent tariffUnavailableNotificationComponent) {
        this.a = tariffUnavailableNotificationComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ipx0
    public final void I9(hpx0 hpx0Var) {
        ru.yandex.taxi.summary.topnotification.tariff_unavailable.presentation.a aVar;
        TariffUnavailableNotificationComponent tariffUnavailableNotificationComponent = this.a;
        ListItemComponent listItemComponent = (ListItemComponent) tariffUnavailableNotificationComponent.getChild();
        if (listItemComponent == null) {
            return;
        }
        listItemComponent.setTitle(hpx0Var.a);
        listItemComponent.setSubtitle(hpx0Var.b);
        aVar = tariffUnavailableNotificationComponent.presenter;
        aVar.Lg(hpx0Var.c);
        String str = hpx0Var.d;
        if (str == null || evu0.J(str)) {
            listItemComponent.setTrailMode(0);
            listItemComponent.setDebounceClickListener(null);
        } else {
            listItemComponent.setTrailMode(2);
            listItemComponent.setDebounceClickListener(new y7x0(6, tariffUnavailableNotificationComponent, str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ipx0
    public final void lf(Bitmap bitmap) {
        ListItemComponent listItemComponent = (ListItemComponent) this.a.getChild();
        if (listItemComponent == null) {
            return;
        }
        if (bitmap == null) {
            listItemComponent.clearLeadView();
        } else {
            listItemComponent.setLeadImage(bitmap);
        }
    }
}
