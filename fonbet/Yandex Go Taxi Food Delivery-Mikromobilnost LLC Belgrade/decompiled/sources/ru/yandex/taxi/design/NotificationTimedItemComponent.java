package ru.yandex.taxi.design;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import defpackage.evu0;
import defpackage.j7m;
import defpackage.wj60;
import defpackage.xj60;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000 ,*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002\u0010-B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\f2\b\b\u0001\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u0016\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0016\u0010\u000eJ\u000f\u0010\u001d\u001a\u00020\fH\u0015¢\u0006\u0004\b\u001d\u0010\u000eJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\fH\u0014¢\u0006\u0004\b\"\u0010\u000eR\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006."}, d2 = {"Lru/yandex/taxi/design/NotificationTimedItemComponent;", "Landroid/view/View;", "T", "Lru/yandex/taxi/design/NotificationItemComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "dispose", "()V", "onAttachedToWindow", "Lxj60;", "expiresListener", "setExpiresListener", "(Lxj60;)V", "", "duration", "startExpiresTimer", "(J)V", "", "provideTextForAccessibilityAnnounce", "()Ljava/lang/String;", "provideDurationTime", "()J", "onExpires", "", "removedManually", "onDetachNotification", "(Z)V", "onDetachedFromWindow", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "internalExpiresListener", "Lxj60;", "isTimerStarted", "Z", "getExpiresListener", "()Lxj60;", "Companion", "wj60", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class NotificationTimedItemComponent<T extends View> extends NotificationItemComponent<T> {
    private static final wj60 Companion = new wj60();
    private static final long DEFAULT_DURATION_MS = 2750;
    private static final int TIME_IS_OUT = 1;
    private final Handler handler;
    private xj60 internalExpiresListener;
    private boolean isTimerStarted;

    public NotificationTimedItemComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.handler = new Handler(Looper.getMainLooper(), new j7m(2, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(NotificationTimedItemComponent notificationTimedItemComponent, Message message) {
        if (message.what != 1) {
            return false;
        }
        notificationTimedItemComponent.onExpires();
        return true;
    }

    private final void dispose() {
        this.handler.removeCallbacksAndMessages(null);
        this.isTimerStarted = false;
    }

    /* renamed from: getExpiresListener, reason: from getter */
    public final xj60 getInternalExpiresListener() {
        return this.internalExpiresListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String provideTextForAccessibilityAnnounce = provideTextForAccessibilityAnnounce();
        if (evu0.J(provideTextForAccessibilityAnnounce)) {
            return;
        }
        announceForAccessibility(provideTextForAccessibilityAnnounce);
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public void onDetachNotification(boolean removedManually) {
        super.onDetachNotification(removedManually);
        dispose();
        setExpiresListener(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dispose();
        setExpiresListener(null);
    }

    public void onExpires() {
        this.isTimerStarted = false;
        xj60 internalExpiresListener = getInternalExpiresListener();
        if (internalExpiresListener != null) {
            internalExpiresListener.a();
        }
        dispose();
    }

    /* renamed from: provideDurationTime */
    public long getDuration() {
        return DEFAULT_DURATION_MS;
    }

    public String provideTextForAccessibilityAnnounce() {
        return "";
    }

    public final void setExpiresListener(xj60 expiresListener) {
        this.internalExpiresListener = expiresListener;
    }

    public final void startExpiresTimer(long duration) {
        if (this.isTimerStarted) {
            return;
        }
        dispose();
        this.isTimerStarted = true;
        Handler handler = this.handler;
        handler.sendMessageDelayed(Message.obtain(handler, 1), duration);
    }

    public NotificationTimedItemComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public void startExpiresTimer() {
        startExpiresTimer(getDuration());
    }

    public NotificationTimedItemComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ NotificationTimedItemComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? xng0.notificationTimedItemComponentStyle : i);
    }
}
