package ru.yandex.taxi.summary.personalaction.notification;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import defpackage.hg;
import defpackage.j3b0;
import defpackage.m3b0;
import defpackage.tls;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationItemComponent;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lru/yandex/taxi/summary/personalaction/notification/PersonalActionNotificationComponent;", "Lru/yandex/taxi/design/NotificationItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Lm3b0;", "Lzy11;", "onClickAction", "onDismissAction", "<init>", "(Landroid/content/Context;Ltls;Ltls;)V", "", "removedManually", "onDetachNotification", "(Z)V", "onNotificationClick", "()V", "viewModel", "renderViewModel", "(Lm3b0;)V", "Landroid/graphics/Bitmap;", "icon", "renderIcon", "(Landroid/graphics/Bitmap;)V", "Ltls;", "Lm3b0;", "item", "Lru/yandex/taxi/design/ListItemComponent;", "", "getNotificationPriority", "()I", "notificationPriority", "", "getNotificationId", "()Ljava/lang/String;", "notificationId", "Companion", "j3b0", "personalaction"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PersonalActionNotificationComponent extends NotificationItemComponent<ListItemComponent> {
    public static final j3b0 Companion = new j3b0();
    public static final String NOTIFICATION_ID = "PersonalStateNotificationComponent";
    private final ListItemComponent item;
    private final tls onClickAction;
    private final tls onDismissAction;
    private m3b0 viewModel;

    public PersonalActionNotificationComponent(Context context, tls tlsVar, tls tlsVar2) {
        super(context, null, 0, 6, null);
        this.onClickAction = tlsVar;
        this.onDismissAction = tlsVar2;
        ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        listItemComponent.setBackgroundColor(0);
        listItemComponent.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        listItemComponent.setFocusable(true);
        this.item = listItemComponent;
        setChild(listItemComponent);
        hg.a(this);
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public String getNotificationId() {
        return NOTIFICATION_ID;
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public int getNotificationPriority() {
        return 3;
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public void onDetachNotification(boolean removedManually) {
        m3b0 m3b0Var;
        super.onDetachNotification(removedManually);
        if (!removedManually || (m3b0Var = this.viewModel) == null) {
            return;
        }
        this.onDismissAction.invoke(m3b0Var);
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public void onNotificationClick() {
        m3b0 m3b0Var = this.viewModel;
        if (m3b0Var != null) {
            this.onClickAction.invoke(m3b0Var);
        }
    }

    public final void renderIcon(Bitmap icon) {
        ListItemComponent listItemComponent = this.item;
        if (icon == null) {
            listItemComponent.setLeadImage(0);
        } else {
            listItemComponent.setLeadImage(icon);
        }
    }

    public final void renderViewModel(m3b0 viewModel) {
        this.viewModel = viewModel;
        this.item.setTitle(viewModel.a);
        this.item.setSubtitle(viewModel.b);
        int i = viewModel.e;
        if (i == 0) {
            this.item.clearTrailView();
        } else if (i == 1 || i == 2) {
            this.item.setTrailMode(i);
        }
    }
}
