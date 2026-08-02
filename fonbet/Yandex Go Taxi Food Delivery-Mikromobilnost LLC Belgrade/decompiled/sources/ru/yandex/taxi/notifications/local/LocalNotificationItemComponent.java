package ru.yandex.taxi.notifications.local;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.yandex.go.payments.notifications.a;
import defpackage.a60;
import defpackage.b4z;
import defpackage.evu0;
import defpackage.f7m;
import defpackage.g18;
import defpackage.lbm;
import defpackage.nac;
import defpackage.pav;
import defpackage.v770;
import defpackage.y3z;
import defpackage.yj70;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationTimedItemComponent;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001a\u0010\u0011J\u000f\u0010\u001b\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001b\u0010\u0011J\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\u0018\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00100\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00103\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lru/yandex/taxi/notifications/local/LocalNotificationItemComponent;", "Lru/yandex/taxi/design/NotificationTimedItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "needLoadImage", "()Z", "canBeDismissedBySwipe", "Lzy11;", "onNotificationClick", "()V", "Lb4z;", "listener", "setTapDeeplinkListener", "(Lb4z;)V", "Ly3z;", "localNotification", "init", "(Ly3z;)V", "onAttachedToWindow", "onDetachedFromWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lpav;", "imageLoader", "(Ly3z;Lpav;)V", "notification", "Ly3z;", "Lpav;", "item", "Lru/yandex/taxi/design/ListItemComponent;", "tapDeeplinkListener", "Lb4z;", "Lg18;", "cancellable", "Lg18;", "", "getNotificationId", "()Ljava/lang/String;", "notificationId", "getNotificationPriority", "()I", "notificationPriority", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LocalNotificationItemComponent extends NotificationTimedItemComponent<ListItemComponent> {
    public static final int $stable = 8;
    private g18 cancellable;
    private pav imageLoader;
    private ListItemComponent item;
    private y3z notification;
    private b4z tapDeeplinkListener;

    public /* synthetic */ LocalNotificationItemComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final boolean needLoadImage() {
        y3z y3zVar = this.notification;
        return ((y3zVar != null ? y3zVar.e : null) == null || this.imageLoader == null) ? false : true;
    }

    @Override // com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        ListItemComponent listItemComponent;
        super.applyTheme(themeType);
        y3z y3zVar = this.notification;
        if (y3zVar == null || (listItemComponent = this.item) == null || needLoadImage() || y3zVar.a == 0) {
            return;
        }
        listItemComponent.getLeadImageView().setImageResource(y3zVar.a);
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    /* renamed from: canBeDismissedBySwipe */
    public boolean getIsDismissible() {
        y3z y3zVar = this.notification;
        if (y3zVar != null) {
            return y3zVar.f;
        }
        return true;
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    /* renamed from: getNotificationId */
    public String getId() {
        String str;
        y3z y3zVar = this.notification;
        return (y3zVar == null || (str = y3zVar.d) == null) ? "" : str;
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public int getNotificationPriority() {
        return 3;
    }

    public final void init(y3z localNotification) {
        g18 g18Var;
        lbm a;
        ListItemComponent listItemComponent = new ListItemComponent(getContext(), null, 0, 6, null);
        listItemComponent.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        listItemComponent.setBackground(null);
        setChild(listItemComponent);
        this.item = listItemComponent;
        String str = localNotification.b;
        if (str != null) {
            listItemComponent.setTitle(str);
        }
        String str2 = localNotification.c;
        if (str2 != null) {
            listItemComponent.setSubtitle(str2);
        }
        this.notification = localNotification;
        String str3 = localNotification.e;
        if (!needLoadImage()) {
            if (localNotification.a != 0) {
                listItemComponent.getLeadImageView().setImageResource(localNotification.a);
                return;
            } else {
                listItemComponent.clearLeadView();
                return;
            }
        }
        this.cancellable.cancel();
        pav pavVar = this.imageLoader;
        if (pavVar == null || (a = pavVar.a(listItemComponent.getLeadImageView())) == null) {
            g18Var = g18.u1;
        } else {
            if (str3 == null) {
                str3 = "";
            }
            g18Var = ((nac) a).c(str3);
        }
        this.cancellable = g18Var;
    }

    @Override // ru.yandex.taxi.design.NotificationTimedItemComponent, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ListItemComponent listItemComponent = this.item;
        if (listItemComponent != null) {
            listItemComponent.post(new f7m(listItemComponent, 1));
        }
    }

    @Override // ru.yandex.taxi.design.NotificationTimedItemComponent, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.cancellable.cancel();
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public void onNotificationClick() {
        String str;
        b4z b4zVar;
        super.onNotificationClick();
        y3z y3zVar = this.notification;
        if (y3zVar == null || (str = y3zVar.g) == null || str.length() <= 0 || (b4zVar = this.tapDeeplinkListener) == null) {
            return;
        }
        a aVar = (a) ((yj70) b4zVar).a;
        if (evu0.J(str)) {
            return;
        }
        ((a60) aVar.j).c(str, v770.c);
    }

    public final void setTapDeeplinkListener(b4z listener) {
        this.tapDeeplinkListener = listener;
    }

    public LocalNotificationItemComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public LocalNotificationItemComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.cancellable = g18.u1;
    }

    public LocalNotificationItemComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public final void init(y3z localNotification, pav imageLoader) {
        this.imageLoader = imageLoader;
        init(localNotification);
    }
}
