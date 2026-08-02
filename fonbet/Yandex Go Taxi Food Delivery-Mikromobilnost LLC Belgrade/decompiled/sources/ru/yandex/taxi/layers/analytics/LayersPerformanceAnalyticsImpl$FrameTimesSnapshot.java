package ru.yandex.taxi.layers.analytics;

import android.util.SparseIntArray;
import android.view.Choreographer;
import defpackage.byx;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"ru/yandex/taxi/layers/analytics/LayersPerformanceAnalyticsImpl$FrameTimesSnapshot", "Landroid/view/Choreographer$FrameCallback;", "Lbyx;", "layersCondition", "", "collectionSize", "<init>", "(Lru/yandex/taxi/layers/analytics/a;Lbyx;I)V", "", "frameTimeNanos", "Lzy11;", "doFrame", "(J)V", "start", "()V", "stop", "", "toString", "()Ljava/lang/String;", "Lbyx;", "getLayersCondition", "()Lbyx;", CA20Status.STATUS_USER_I, "getCollectionSize", "()I", "Landroid/util/SparseIntArray;", "frameTimes", "Landroid/util/SparseIntArray;", "getFrameTimes", "()Landroid/util/SparseIntArray;", "lastFrameTimeMillis", "J", "startTimeMillis", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes2.dex */
final class LayersPerformanceAnalyticsImpl$FrameTimesSnapshot implements Choreographer.FrameCallback {
    private final int collectionSize;
    private final SparseIntArray frameTimes = new SparseIntArray();
    private long lastFrameTimeMillis;
    private final byx layersCondition;
    private long startTimeMillis;
    final /* synthetic */ a this$0;

    public LayersPerformanceAnalyticsImpl$FrameTimesSnapshot(a aVar, byx byxVar, int i) {
        this.this$0 = aVar;
        this.layersCondition = byxVar;
        this.collectionSize = i;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long frameTimeNanos) {
        long j = frameTimeNanos / 1000000;
        long j2 = this.lastFrameTimeMillis;
        if (j2 > 0) {
            int i = (int) (j - j2);
            SparseIntArray sparseIntArray = this.frameTimes;
            sparseIntArray.put(i, sparseIntArray.get(i) + 1);
        }
        this.lastFrameTimeMillis = j;
        ((Choreographer) this.this$0.b.getValue()).postFrameCallback(this);
    }

    public final int getCollectionSize() {
        return this.collectionSize;
    }

    public final SparseIntArray getFrameTimes() {
        return this.frameTimes;
    }

    public final byx getLayersCondition() {
        return this.layersCondition;
    }

    public final void start() {
        this.startTimeMillis = System.currentTimeMillis();
        ((Choreographer) this.this$0.b.getValue()).postFrameCallback(this);
    }

    public final void stop() {
        ((Choreographer) this.this$0.b.getValue()).removeFrameCallback(this);
        if (this.frameTimes.size() == 0) {
            this.frameTimes.put((int) (System.currentTimeMillis() - this.startTimeMillis), 1);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = this.frameTimes.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append(Extension.FIX_SPACE);
            }
            sb.append(this.frameTimes.keyAt(i));
            sb.append('=');
            sb.append(this.frameTimes.valueAt(i));
        }
        return sb.toString();
    }
}
