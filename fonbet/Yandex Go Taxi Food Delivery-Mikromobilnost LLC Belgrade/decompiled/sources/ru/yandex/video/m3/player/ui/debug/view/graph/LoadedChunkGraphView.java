package ru.yandex.video.m3.player.ui.debug.view.graph;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.R;
import ru.yandex.video.m3.player.ui.debug.model.LoadedChunk;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/view/graph/LoadedChunkGraphView;", "Lru/yandex/video/m3/player/ui/debug/view/graph/DebugGraphView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/graphics/Canvas;", "canvas", "Lzy11;", "drawHistory", "(Landroid/graphics/Canvas;)V", "color", "setErrorColor", "(I)V", "", "Lru/yandex/video/m3/player/ui/debug/model/LoadedChunk;", "events", "setEvents", "(Ljava/util/List;)V", "Ljava/util/List;", "errorColor", CA20Status.STATUS_USER_I, "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LoadedChunkGraphView extends DebugGraphView {
    public static final int DEFAULT_ERROR_COLOR = -65536;
    private int errorColor;
    private List<LoadedChunk> events;
    public static final int $stable = 8;

    public LoadedChunkGraphView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.events = EmptyList.a;
        this.errorColor = -65536;
        View.inflate(context, R.layout.graph_view, this);
        setWillNotDraw(false);
        invalidate();
    }

    @Override // ru.yandex.video.m3.player.ui.debug.view.graph.DebugGraphView
    public void drawHistory(Canvas canvas) {
        getPaint().setStrokeWidth(4.0f);
        List<LoadedChunk> list = this.events;
        long initialTimestamp = getInitialTimestamp();
        float historyLengthMs = getHistoryLengthMs();
        float height = getHeight();
        Iterator<LoadedChunk> it = list.iterator();
        while (it.hasNext()) {
            getPaint().setColor(it.next().isSuccessful() ? getColor() : this.errorColor);
            float timestamp = ((r4.getTimestamp() - initialTimestamp) / historyLengthMs) * getWidth();
            canvas.drawLine(timestamp, 0.0f, timestamp, height, getPaint());
        }
    }

    public final void setErrorColor(int color) {
        this.errorColor = color;
    }

    public final void setEvents(List<LoadedChunk> events) {
        this.events = events;
    }

    public LoadedChunkGraphView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public LoadedChunkGraphView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ LoadedChunkGraphView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public LoadedChunkGraphView(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
