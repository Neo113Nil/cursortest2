package ru.yandex.taxi.communications.benefitscenter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import defpackage.tje;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationTimedItemComponent;
import ru.yandex.taxi.widget.ShimmeringBar;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0010\u001a\u00020\u000b2\b\b\u0001\u0010\u000f\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/communications/benefitscenter/BenefitsCenterNotification;", "Lru/yandex/taxi/design/NotificationTimedItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "", "id", "title", "subtitle", "Landroid/content/Context;", "context", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V", "Lzy11;", "showShimmer", "()V", "Landroid/graphics/Bitmap;", "image", "setImage", "(Landroid/graphics/Bitmap;)V", "", "(I)V", "notificationId", "Ljava/lang/String;", "getNotificationId", "()Ljava/lang/String;", "listItemComponent", "Lru/yandex/taxi/design/ListItemComponent;", "getNotificationPriority", "()I", "notificationPriority", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BenefitsCenterNotification extends NotificationTimedItemComponent<ListItemComponent> {
    public static final int $stable = 8;
    private final ListItemComponent listItemComponent;
    private final String notificationId;

    public BenefitsCenterNotification(String str, String str2, String str3, Context context) {
        super(context, null, 0);
        this.notificationId = str;
        ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        listItemComponent.setLeadImagePadding(tje.u(8, listItemComponent.getContext()));
        listItemComponent.setTitle(str2);
        if (str3 != null) {
            listItemComponent.setSubtitle(str3);
        }
        this.listItemComponent = listItemComponent;
        setChild(listItemComponent);
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    /* renamed from: getNotificationId, reason: from getter */
    public String getId() {
        return this.notificationId;
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public int getNotificationPriority() {
        return 3;
    }

    public final void setImage(Bitmap image) {
        this.listItemComponent.setLeadImage(image);
    }

    public final void showShimmer() {
        int u = tje.u(8, getContext());
        int u2 = tje.u(56, getContext());
        ShimmeringBar shimmeringBar = new ShimmeringBar(getContext(), null, 0, 0, 14, null);
        shimmeringBar.setLayoutParams(new FrameLayout.LayoutParams(u2, u2));
        shimmeringBar.setPadding(u, u, u, u);
        shimmeringBar.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.yandex.taxi.communications.benefitscenter.BenefitsCenterNotification$showShimmer$shimmerView$1$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setOval(view.getPaddingLeft(), view.getPaddingTop(), view.getWidth() - view.getPaddingRight(), view.getHeight() - view.getPaddingBottom());
            }
        });
        shimmeringBar.setClipToOutline(true);
        this.listItemComponent.setLeadView(shimmeringBar);
    }

    public final void setImage(int image) {
        this.listItemComponent.setLeadImage(image);
    }
}
