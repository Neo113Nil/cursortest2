package ru.yandex.taxi.design;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat$Api21Impl;
import com.yandex.go.design.view.GoFrameLayout;
import defpackage.dzg0;
import defpackage.mrg0;
import defpackage.tje;
import defpackage.xng0;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0015\u001a\u0004\u0018\u00018\u00008F¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/design/NotificationComponent;", "Landroid/view/View;", "T", "Lcom/yandex/go/design/view/GoFrameLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "view", "Lzy11;", "setChild", "(Landroid/view/View;)V", "getChild", "()Landroid/view/View;", "getChild$annotations", "()V", "child", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class NotificationComponent<T extends View> extends GoFrameLayout {
    public NotificationComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setBackgroundResource(dzg0.component_notification_background);
        float r = tje.r(mrg0.go_design_s_space, getContext());
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ViewCompat$Api21Impl.m(this, r);
    }

    public static /* synthetic */ void getChild$annotations() {
    }

    public final T getChild() {
        T t = (T) getChildAt(0);
        if (t != null) {
            return t;
        }
        return null;
    }

    public final void setChild(T view) {
        removeAllViews();
        addView(view);
    }

    public NotificationComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public NotificationComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ NotificationComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? xng0.notificationComponentStyle : i);
    }
}
