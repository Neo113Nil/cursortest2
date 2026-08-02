package ru.yandex.video.m3.player.ui.debug.view.graph;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.R;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 #2\u00020\u0001:\u0002#$B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010 \u001a\u00020\u001a2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\u0004\b \u0010!R\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\"¨\u0006%"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/view/graph/LineGraphView;", "Lru/yandex/video/m3/player/ui/debug/view/graph/DebugGraphView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "value", "", "lowerBound", "upperBound", "getStopY", "(JFF)F", ClidProvider.TIMESTAMP, "getStopX", "(J)F", "getUpperBound", "()F", "getLowerBound", "Landroid/graphics/Canvas;", "canvas", "Lzy11;", "drawHistory", "(Landroid/graphics/Canvas;)V", "", "Lru/yandex/video/m3/player/ui/debug/view/graph/LineGraphView$Event;", "events", "setEvents", "(Ljava/util/List;)V", "Ljava/util/List;", "Companion", "Event", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LineGraphView extends DebugGraphView {
    public static final float DEFAULT_SCALING = 2.0f;
    private List<? extends Event> events;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/view/graph/LineGraphView$Event;", "", ClidProvider.TIMESTAMP, "", "getTimestamp", "()J", "value", "getValue", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Event {
        long getTimestamp();

        long getValue();
    }

    public /* synthetic */ LineGraphView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    private final float getLowerBound() {
        Long l;
        Iterator<T> it = this.events.iterator();
        if (it.hasNext()) {
            Long valueOf = Long.valueOf(((Event) it.next()).getValue());
            while (it.hasNext()) {
                Long valueOf2 = Long.valueOf(((Event) it.next()).getValue());
                if (valueOf.compareTo(valueOf2) > 0) {
                    valueOf = valueOf2;
                }
            }
            l = valueOf;
        } else {
            l = null;
        }
        if (l != null) {
            return l.longValue();
        }
        return 0.0f;
    }

    private final float getStopX(long timestamp) {
        return ((timestamp - getInitialTimestamp()) / getHistoryLengthMs()) * getWidth();
    }

    private final float getStopY(long value, float lowerBound, float upperBound) {
        return (1.0f - (value / (upperBound - lowerBound))) * getHeight();
    }

    private final float getUpperBound() {
        Long l;
        Iterator<T> it = this.events.iterator();
        if (it.hasNext()) {
            Long valueOf = Long.valueOf(((Event) it.next()).getValue());
            while (it.hasNext()) {
                Long valueOf2 = Long.valueOf(((Event) it.next()).getValue());
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            l = valueOf;
        } else {
            l = null;
        }
        if (l != null) {
            return l.longValue() * 2.0f;
        }
        return 0.0f;
    }

    @Override // ru.yandex.video.m3.player.ui.debug.view.graph.DebugGraphView
    public void drawHistory(Canvas canvas) {
        Event event;
        float stopY;
        getPaint().setStrokeWidth(4.0f);
        getPaint().setColor(getColor());
        float upperBound = getUpperBound();
        float lowerBound = getLowerBound();
        List<? extends Event> list = this.events;
        long initialTimestamp = getInitialTimestamp();
        if (list.isEmpty()) {
            stopY = 0.0f;
        } else {
            ListIterator<? extends Event> listIterator = list.listIterator(list.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    event = listIterator.previous();
                    if (event.getTimestamp() < initialTimestamp) {
                        break;
                    }
                } else {
                    event = null;
                    break;
                }
            }
            Event event2 = event;
            stopY = getStopY(event2 != null ? event2.getValue() : 0L, lowerBound, upperBound);
        }
        float f = stopY;
        float f2 = 0.0f;
        for (Event event3 : list) {
            if (event3.getTimestamp() >= initialTimestamp) {
                float stopX = getStopX(event3.getTimestamp());
                float stopY2 = getStopY(event3.getValue(), lowerBound, upperBound);
                canvas.drawLine(f2, f, stopX, stopY2, getPaint());
                f2 = stopX;
                f = stopY2;
            }
        }
        canvas.drawLine(f2, f, getPointer(), f, getPaint());
    }

    public final void setEvents(List<? extends Event> events) {
        this.events = events;
    }

    public LineGraphView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public LineGraphView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public LineGraphView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public LineGraphView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.events = EmptyList.a;
        View.inflate(context, R.layout.graph_view, this);
        setWillNotDraw(false);
        invalidate();
    }
}
