package ru.yandex.taxi.summary.topnotification.tariff_unavailable.ui;

import android.content.Context;
import defpackage.cpx0;
import defpackage.ipx0;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationItemComponent;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB\u0019\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lru/yandex/taxi/summary/topnotification/tariff_unavailable/ui/TariffUnavailableNotificationComponent;", "Lru/yandex/taxi/design/NotificationItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Lru/yandex/taxi/summary/topnotification/tariff_unavailable/presentation/a;", "presenter", "<init>", "(Landroid/content/Context;Lru/yandex/taxi/summary/topnotification/tariff_unavailable/presentation/a;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lru/yandex/taxi/summary/topnotification/tariff_unavailable/presentation/a;", "Lru/yandex/taxi/summary/topnotification/tariff_unavailable/ui/TariffUnavailableNotificationComponent$a;", "internalMvpView", "Lru/yandex/taxi/summary/topnotification/tariff_unavailable/ui/TariffUnavailableNotificationComponent$a;", "", "getNotificationPriority", "()I", "notificationPriority", "", "getNotificationId", "()Ljava/lang/String;", "notificationId", "Companion", "cpx0", "a", "topnotification"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TariffUnavailableNotificationComponent extends NotificationItemComponent<ListItemComponent> {
    public static final cpx0 Companion = new cpx0();
    public static final String NOTIFICATION_ID = "TariffUnavailableNotification";
    private final a internalMvpView;
    private final ru.yandex.taxi.summary.topnotification.tariff_unavailable.presentation.a presenter;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lru/yandex/taxi/summary/topnotification/tariff_unavailable/ui/TariffUnavailableNotificationComponent$a;", "Lipx0;", "topnotification"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface a extends ipx0 {
    }

    public TariffUnavailableNotificationComponent(Context context, ru.yandex.taxi.summary.topnotification.tariff_unavailable.presentation.a aVar) {
        super(context, null, 0, 6, null);
        this.presenter = aVar;
        setChild(new ListItemComponent(context, null, 0, 6, null));
        this.internalMvpView = new ru.yandex.taxi.summary.topnotification.tariff_unavailable.ui.a(this);
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public String getNotificationId() {
        return NOTIFICATION_ID;
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public int getNotificationPriority() {
        return 3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.presenter.Kg(this.internalMvpView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }
}
