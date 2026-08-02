package ru.yandex.taxi.design;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import defpackage.ai60;
import defpackage.jl40;
import defpackage.uh60;
import defpackage.xng0;
import defpackage.zh60;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\b&\u0018\u0000 '*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002\f(B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010 R\u0014\u0010$\u001a\u00020!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001f¨\u0006)"}, d2 = {"Lru/yandex/taxi/design/NotificationItemComponent;", "Landroid/view/View;", "T", "Lru/yandex/taxi/design/NotificationComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lai60;", "detachListener", "Lzy11;", "setDetachListener", "(Lai60;)V", "onAttachNotification", "()V", "", "removedManually", "onDetachNotification", "(Z)V", "onNotificationClick", "canBeDismissedBySwipe", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lai60;", "", "getNotificationId", "()Ljava/lang/String;", "notificationId", "getNotificationPriority", "notificationPriority", "Companion", "zh60", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class NotificationItemComponent<T extends View> extends NotificationComponent<T> {
    public static final zh60 Companion = new zh60();
    public static final int PRIORITY_HIGH = 3;
    public static final int PRIORITY_LOW = 1;
    public static final int PRIORITY_NORMAL = 2;
    private ai60 detachListener;

    public /* synthetic */ NotificationItemComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? xng0.notificationItemComponentStyle : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$0(NotificationItemComponent notificationItemComponent) {
        notificationItemComponent.onNotificationClick();
        return zy11.a;
    }

    /* renamed from: canBeDismissedBySwipe */
    public boolean getIsDismissible() {
        return true;
    }

    public boolean equals(Object other) {
        if (other instanceof NotificationItemComponent) {
            return jl40.l(((NotificationItemComponent) other).getNotificationId(), getNotificationId());
        }
        return false;
    }

    public abstract String getNotificationId();

    public int getNotificationPriority() {
        return 1;
    }

    public int hashCode() {
        return getNotificationId().hashCode();
    }

    public void onAttachNotification() {
    }

    public void onDetachNotification(boolean removedManually) {
        ai60 ai60Var = this.detachListener;
        if (ai60Var != null) {
            ai60Var.i(removedManually);
        }
    }

    public void onNotificationClick() {
    }

    public final void setDetachListener(ai60 detachListener) {
        this.detachListener = detachListener;
    }

    public NotificationItemComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public NotificationItemComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ru.yandex.taxi.design.utils.c.z(new uh60(1, this), this);
    }

    public NotificationItemComponent(Context context) {
        this(context, null, 0, 6, null);
    }
}
