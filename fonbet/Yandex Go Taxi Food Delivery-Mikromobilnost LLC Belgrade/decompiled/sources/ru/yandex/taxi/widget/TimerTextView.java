package ru.yandex.taxi.widget;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.dwh0;
import defpackage.fcl0;
import defpackage.g8e;
import defpackage.ifq0;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.oew0;
import defpackage.sls;
import defpackage.zy11;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0014\u0010\u0010R.\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0011\u0010#\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010$\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/yandex/taxi/widget/TimerTextView;", "Lru/yandex/taxi/widget/RobotoTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "schedule", "Lzy11;", "tick", "(Z)V", "startTimer", "()V", "initAccessibilityDelegate", "stopTimer", "onAttachedToWindow", "onDetachedFromWindow", "", "value", "startTime", "Ljava/lang/Long;", "getStartTime", "()Ljava/lang/Long;", "setStartTime", "(Ljava/lang/Long;)V", "Lkotlin/Function0;", "tickSchedule", "Lsls;", "", "getCurrentContentDescription", "()Ljava/lang/String;", "currentContentDescription", "isStarted", "()Z", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TimerTextView extends RobotoTextView {
    public static final int $stable = 8;
    private Long startTime;
    private final sls tickSchedule;

    public TimerTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initAccessibilityDelegate();
        this.tickSchedule = new oew0(28, this);
    }

    private final void initAccessibilityDelegate() {
        androidx.core.view.b.p(this, new ifq0(11, this));
    }

    private final void startTimer() {
        Long l = this.startTime;
        if (l != null) {
            long longValue = l.longValue();
            long currentTimeMillis = System.currentTimeMillis();
            long j = (currentTimeMillis - longValue) / 1000;
            if (j == 0) {
                j++;
            }
            postDelayed(new fcl0(25, this.tickSchedule), TimeUnit.SECONDS.toMillis(j) - currentTimeMillis);
        }
    }

    private final void tick(boolean schedule) {
        Long l = this.startTime;
        if (l != null) {
            long currentTimeMillis = System.currentTimeMillis() - l.longValue();
            setText(getContext().getString(kyh0.timer_format, Long.valueOf(currentTimeMillis / 60000), Long.valueOf((currentTimeMillis % 60000) / 1000)));
            if (schedule) {
                postDelayed(new fcl0(27, this.tickSchedule), 1000L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 tickSchedule$lambda$0(TimerTextView timerTextView) {
        timerTextView.tick(true);
        return zy11.a;
    }

    public final String getCurrentContentDescription() {
        Long l = this.startTime;
        if (l == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis() - l.longValue();
        int i = (int) (currentTimeMillis / 60000);
        int i2 = (int) ((currentTimeMillis % 60000) / 1000);
        return g8e.p(getResources().getQuantityString(dwh0.date_format_in_minutes, i, Integer.valueOf(i)), Extension.FIX_SPACE, getResources().getQuantityString(dwh0.date_format_in_seconds, i2, Integer.valueOf(i2)));
    }

    public final Long getStartTime() {
        return this.startTime;
    }

    public final boolean isStarted() {
        return this.startTime != null;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        tick(false);
        startTimer();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopTimer();
    }

    public final void setStartTime(Long l) {
        if (jl40.l(this.startTime, l)) {
            return;
        }
        this.startTime = l;
        tick(false);
        if (isAttachedToWindow()) {
            stopTimer();
            startTimer();
        }
    }

    public final void stopTimer() {
        removeCallbacks(new fcl0(26, this.tickSchedule));
    }

    public TimerTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public TimerTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ TimerTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
