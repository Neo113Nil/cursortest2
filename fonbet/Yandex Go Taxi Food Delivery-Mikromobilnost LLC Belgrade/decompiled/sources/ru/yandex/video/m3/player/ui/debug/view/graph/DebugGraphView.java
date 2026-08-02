package ru.yandex.video.m3.player.ui.debug.view.graph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.y6i0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\b \u0018\u0000 :2\u00020\u0001:\u0001:B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010&\u001a\u00020\u001b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010,\u001a\u00020\u00138\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00102\u001a\u00020\u00138\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R\u0016\u00105\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010-R\"\u0010\u0017\u001a\u00020\u00068\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0017\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010\u0019¨\u0006;"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/view/graph/DebugGraphView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/graphics/Canvas;", "canvas", "Lzy11;", "drawField", "(Landroid/graphics/Canvas;)V", "drawPointer", "onDraw", "drawHistory", "", "startTimestamp", "move", "(Ljava/lang/Long;)V", "color", "setGraphColor", "(I)V", "historyLengthSec", "", "stepLengthSec", "setTimeConfiguration", "(IF)V", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "setPaint", "(Landroid/graphics/Paint;)V", "pointer", "F", "getPointer", "()F", "setPointer", "(F)V", "initialTimestamp", "J", "getInitialTimestamp", "()J", "setInitialTimestamp", "(J)V", "historyLengthMs", "getHistoryLengthMs", "setHistoryLengthMs", "stepLength", CA20Status.STATUS_USER_I, "getColor", "()I", "setColor", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class DebugGraphView extends FrameLayout {
    public static final int DEFAULT_FIELD_BACKGROUND_COLOR = 1593835520;
    public static final int DEFAULT_GRAPH_COLOR = -16711936;
    public static final float DEFAULT_GRAPH_WIDTH = 4.0f;
    public static final long DEFAULT_HISTORY_LENGTH_MS = 30000;
    public static final int DEFAULT_POINTER_COLOR = -1;
    public static final float DEFAULT_POINTER_WIDTH = 3.0f;
    public static final long DEFAULT_STEP_LENGTH_MS = 500;
    public static final long ONE_SECOND = 1000;
    private int color;
    private long historyLengthMs;
    private long initialTimestamp;
    private Paint paint;
    private float pointer;
    private long stepLength;
    public static final int $stable = 8;

    public DebugGraphView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.paint = new Paint();
        this.initialTimestamp = System.currentTimeMillis();
        this.historyLengthMs = 30000L;
        this.stepLength = 500L;
        this.color = DEFAULT_GRAPH_COLOR;
    }

    private final void drawField(Canvas canvas) {
        float width;
        if (System.currentTimeMillis() >= this.initialTimestamp + this.historyLengthMs) {
            width = getWidth();
        } else {
            width = ((r0 - this.initialTimestamp) / this.historyLengthMs) * getWidth();
        }
        this.pointer = width;
        this.paint.setColor(DEFAULT_FIELD_BACKGROUND_COLOR);
        canvas.drawRect(0.0f, 0.0f, this.pointer, getHeight(), this.paint);
    }

    private final void drawPointer(Canvas canvas) {
        this.paint.setColor(-1);
        this.paint.setStrokeWidth(3.0f);
        float f = this.pointer;
        canvas.drawLine(f, 0.0f, f, getHeight(), this.paint);
    }

    public abstract void drawHistory(Canvas canvas);

    public final int getColor() {
        return this.color;
    }

    public final long getHistoryLengthMs() {
        return this.historyLengthMs;
    }

    public final long getInitialTimestamp() {
        return this.initialTimestamp;
    }

    public final Paint getPaint() {
        return this.paint;
    }

    public final float getPointer() {
        return this.pointer;
    }

    public final void move(Long startTimestamp) {
        if (startTimestamp != null) {
            long longValue = startTimestamp.longValue();
            long j = this.initialTimestamp;
            this.initialTimestamp = y6i0.f(longValue, j - this.historyLengthMs, j);
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = this.initialTimestamp;
        if (currentTimeMillis >= this.historyLengthMs + j2) {
            this.initialTimestamp = j2 + this.stepLength;
        }
        if (getWidth() > 0) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawField(canvas);
        drawHistory(canvas);
        drawPointer(canvas);
    }

    public final void setColor(int i) {
        this.color = i;
    }

    public final void setGraphColor(int color) {
        this.color = color;
    }

    public final void setHistoryLengthMs(long j) {
        this.historyLengthMs = j;
    }

    public final void setInitialTimestamp(long j) {
        this.initialTimestamp = j;
    }

    public final void setPaint(Paint paint) {
        this.paint = paint;
    }

    public final void setPointer(float f) {
        this.pointer = f;
    }

    public final void setTimeConfiguration(int historyLengthSec, float stepLengthSec) {
        this.historyLengthMs = historyLengthSec * 1000;
        this.stepLength = (long) (stepLengthSec * 1000.0f);
    }

    public DebugGraphView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public DebugGraphView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ DebugGraphView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public DebugGraphView(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
