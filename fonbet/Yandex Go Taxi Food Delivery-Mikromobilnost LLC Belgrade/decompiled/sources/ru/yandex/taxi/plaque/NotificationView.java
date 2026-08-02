package ru.yandex.taxi.plaque;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import defpackage.fsg0;
import defpackage.ioc0;
import defpackage.l0h0;
import defpackage.moc0;
import defpackage.nk60;
import defpackage.noc0;
import defpackage.ny61;
import defpackage.ooc0;
import defpackage.poc0;
import defpackage.qoc0;
import defpackage.sqg0;
import defpackage.tje;
import defpackage.w511;
import defpackage.wuj0;
import defpackage.yma1;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.plaque.api.models.PlaqueModel$TabletPlaqueModel$Notification$Position;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/yandex/taxi/plaque/NotificationView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Looc0;", "notification", "", "notificationSize", "Landroid/widget/FrameLayout$LayoutParams;", "getLayoutParams", "(Looc0;I)Landroid/widget/FrameLayout$LayoutParams;", "Lru/yandex/taxi/plaque/api/models/PlaqueModel$TabletPlaqueModel$Notification$Position;", "position", "Lzy11;", "updateNotificationMargins", "(Lru/yandex/taxi/plaque/api/models/PlaqueModel$TabletPlaqueModel$Notification$Position;I)V", "Landroid/widget/ImageView;", "createIconView", "()Landroid/widget/ImageView;", "Landroid/widget/TextView;", "createCountView", "()Landroid/widget/TextView;", "Lqoc0;", "plaqueModel", "update", "(Lqoc0;)V", "tabletNotificationSize", CA20Status.STATUS_USER_I, "plaqueNotificationSize", "iconView", "Landroid/widget/ImageView;", "countView", "Landroid/widget/TextView;", "plaque_sdk"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NotificationView extends FrameLayout {
    private final TextView countView;
    private final ImageView iconView;
    private final int plaqueNotificationSize;
    private final int tabletNotificationSize;

    public NotificationView(Context context) {
        super(context);
        this.tabletNotificationSize = tje.u(20, getContext());
        this.plaqueNotificationSize = tje.u(28, getContext());
        ImageView createIconView = createIconView();
        this.iconView = createIconView;
        TextView createCountView = createCountView();
        this.countView = createCountView;
        setTransitionName("plaque_notification_container_transition_name");
        setImportantForAccessibility(2);
        addView(createIconView);
        addView(createCountView);
        setClipChildren(false);
        setClipToPadding(false);
    }

    private final TextView createCountView() {
        TextView textView = new TextView(getContext());
        textView.setTransitionName("plaque_notification_count_transition_name");
        textView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        textView.setImportantForAccessibility(2);
        textView.setMinWidth(this.tabletNotificationSize);
        Resources resources = textView.getContext().getResources();
        int i = l0h0.plaque_notification_count_background;
        ThreadLocal threadLocal = wuj0.a;
        textView.setBackground(yma1.b(resources, i, null));
        textView.setGravity(17);
        textView.setTextSize(0, tje.r(fsg0.plaque_notification_count_text_size, textView.getContext()));
        textView.setTextColor(textView.getContext().getResources().getColor(sqg0.plaque_notification_count_text, null));
        textView.setVisibility(8);
        return textView;
    }

    private final ImageView createIconView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setTransitionName("plaque_notification_icon_transition_name");
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        imageView.setImportantForAccessibility(2);
        imageView.setScaleType(ImageView.ScaleType.FIT_START);
        imageView.setVisibility(8);
        return imageView;
    }

    private final FrameLayout.LayoutParams getLayoutParams(ooc0 notification, int notificationSize) {
        FrameLayout.LayoutParams layoutParams;
        int i;
        if (notification instanceof moc0) {
            layoutParams = new FrameLayout.LayoutParams(-2, notificationSize);
        } else {
            if (!(notification instanceof noc0)) {
                w511.b();
                return null;
            }
            layoutParams = new FrameLayout.LayoutParams(notificationSize, notificationSize);
        }
        int i2 = nk60.a[notification.getPosition().ordinal()];
        if (i2 == 1) {
            i = 8388611;
        } else {
            if (i2 != 2) {
                w511.b();
                return null;
            }
            i = 8388613;
        }
        layoutParams.gravity = i;
        return layoutParams;
    }

    private final void updateNotificationMargins(PlaqueModel$TabletPlaqueModel$Notification$Position position, int notificationSize) {
        int i;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i2 = -notificationSize;
        int i3 = i2 / 2;
        int[] iArr = nk60.a;
        int i4 = iArr[position.ordinal()];
        int i5 = 0;
        if (i4 == 1) {
            i = i3;
        } else {
            if (i4 != 2) {
                w511.b();
                return;
            }
            i = 0;
        }
        int i6 = iArr[position.ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                w511.b();
                return;
            }
            i5 = i2 / 4;
        }
        int i7 = marginLayoutParams.bottomMargin;
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.topMargin = i3;
        marginLayoutParams.setMarginEnd(i5);
        marginLayoutParams.bottomMargin = i7;
        setLayoutParams(marginLayoutParams);
    }

    public final void update(qoc0 plaqueModel) {
        int i;
        ooc0 f = plaqueModel.f();
        if (f == null) {
            this.iconView.setVisibility(8);
            this.countView.setVisibility(8);
            return;
        }
        if (f instanceof moc0) {
            this.iconView.setVisibility(8);
            this.countView.setVisibility(0);
            setTransitionName("plaque_notification_count_transition_name");
            TextView textView = this.countView;
            int i2 = ((moc0) f).a;
            textView.setText(i2 <= 99 ? String.valueOf(i2) : "99+");
        } else {
            if (!(f instanceof noc0)) {
                w511.b();
                return;
            }
            this.countView.setVisibility(8);
            this.iconView.setVisibility(0);
            setTransitionName("plaque_notification_icon_transition_name");
            this.iconView.setImageDrawable(((noc0) f).a.a);
        }
        if (plaqueModel instanceof poc0) {
            i = this.tabletNotificationSize;
        } else {
            if (!(plaqueModel instanceof ioc0)) {
                w511.b();
                return;
            }
            i = this.plaqueNotificationSize;
        }
        setLayoutParams(getLayoutParams(f, i));
        updateNotificationMargins(f.getPosition(), i);
    }
}
