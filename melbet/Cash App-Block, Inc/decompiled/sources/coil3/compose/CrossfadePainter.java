package coil3.compose;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ValueInsets;
import androidx.recyclerview.widget.RecyclerView;
import coil3.Extras;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.time.Duration;
import kotlin.time.TimeMark;
import kotlin.time.TimeSource;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class CrossfadePainter extends Painter {
    public ColorFilter colorFilter;
    public final ContentScale contentScale;
    public final long duration;
    public final Painter end;
    public final boolean fadeStart;
    public final long intrinsicSize;
    public final ParcelableSnapshotMutableIntState invalidateTick$delegate;
    public boolean isDone;
    public float maxAlpha;
    public Painter start;
    public TimeMark startTime;
    public final TimeSource timeSource;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if (r7 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CrossfadePainter(Painter painter, Painter painter2, ContentScale contentScale, long j, boolean z, boolean z2) {
        TimeSource.Monotonic monotonic = TimeSource.Monotonic.INSTANCE;
        this.end = painter2;
        this.contentScale = contentScale;
        this.duration = j;
        this.timeSource = monotonic;
        this.fadeStart = z;
        this.invalidateTick$delegate = new ParcelableSnapshotMutableIntState(0);
        this.maxAlpha = 1.0f;
        this.start = painter;
        long mo759getIntrinsicSizeNHjbRc = painter != null ? painter.mo759getIntrinsicSizeNHjbRc() : 0L;
        long mo759getIntrinsicSizeNHjbRc2 = painter2 != null ? painter2.mo759getIntrinsicSizeNHjbRc() : 0L;
        boolean z3 = mo759getIntrinsicSizeNHjbRc != 9205357640488583168L;
        boolean z4 = mo759getIntrinsicSizeNHjbRc2 != 9205357640488583168L;
        if (z2) {
            if (z4) {
                mo759getIntrinsicSizeNHjbRc = mo759getIntrinsicSizeNHjbRc2;
            }
            this.intrinsicSize = mo759getIntrinsicSizeNHjbRc;
        }
        mo759getIntrinsicSizeNHjbRc = (z3 && z4) ? (Float.floatToRawIntBits(Math.max(Float.intBitsToFloat((int) (mo759getIntrinsicSizeNHjbRc >> 32)), Float.intBitsToFloat((int) (mo759getIntrinsicSizeNHjbRc2 >> 32)))) << 32) | (BodyPartID.bodyIdMax & Float.floatToRawIntBits(Math.max(Float.intBitsToFloat((int) (mo759getIntrinsicSizeNHjbRc & BodyPartID.bodyIdMax)), Float.intBitsToFloat((int) (mo759getIntrinsicSizeNHjbRc2 & BodyPartID.bodyIdMax))))) : 9205357640488583168L;
        this.intrinsicSize = mo759getIntrinsicSizeNHjbRc;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyAlpha(float f) {
        this.maxAlpha = f;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    public final void drawPainter(DrawScope drawScope, Painter painter, float f) {
        if (painter == null || f <= RecyclerView.DECELERATION_RATE) {
            return;
        }
        long mo753getSizeNHjbRc = drawScope.mo753getSizeNHjbRc();
        long mo759getIntrinsicSizeNHjbRc = painter.mo759getIntrinsicSizeNHjbRc();
        long m861timesUQTWf7w = (mo759getIntrinsicSizeNHjbRc == 9205357640488583168L || Size.m644isEmptyimpl(mo759getIntrinsicSizeNHjbRc) || mo753getSizeNHjbRc == 9205357640488583168L || Size.m644isEmptyimpl(mo753getSizeNHjbRc)) ? mo753getSizeNHjbRc : ValueInsets.m861timesUQTWf7w(mo759getIntrinsicSizeNHjbRc, this.contentScale.mo832computeScaleFactorH7hwNQA(mo759getIntrinsicSizeNHjbRc, mo753getSizeNHjbRc));
        if (mo753getSizeNHjbRc == 9205357640488583168L || Size.m644isEmptyimpl(mo753getSizeNHjbRc)) {
            painter.m762drawx_KDEd0(drawScope, m861timesUQTWf7w, f, this.colorFilter);
            return;
        }
        float intBitsToFloat = (Float.intBitsToFloat((int) (mo753getSizeNHjbRc >> 32)) - Float.intBitsToFloat((int) (m861timesUQTWf7w >> 32))) / 2.0f;
        float intBitsToFloat2 = (Float.intBitsToFloat((int) (mo753getSizeNHjbRc & BodyPartID.bodyIdMax)) - Float.intBitsToFloat((int) (m861timesUQTWf7w & BodyPartID.bodyIdMax))) / 2.0f;
        ((Extras.Key) drawScope.getDrawContext().path).inset(intBitsToFloat, intBitsToFloat2, intBitsToFloat, intBitsToFloat2);
        try {
            painter.m762drawx_KDEd0(drawScope, m861timesUQTWf7w, f, this.colorFilter);
        } finally {
            float f2 = -intBitsToFloat;
            float f3 = -intBitsToFloat2;
            ((Extras.Key) drawScope.getDrawContext().path).inset(f2, f3, f2, f3);
        }
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo759getIntrinsicSizeNHjbRc() {
        return this.intrinsicSize;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(DrawScope drawScope) {
        boolean z = this.isDone;
        Painter painter = this.end;
        if (z) {
            drawPainter(drawScope, painter, this.maxAlpha);
            return;
        }
        TimeMark timeMark = this.startTime;
        if (timeMark == null) {
            timeMark = this.timeSource.markNow();
            this.startTime = timeMark;
        }
        float m4167getInWholeMillisecondsimpl = Duration.m4167getInWholeMillisecondsimpl(timeMark.mo4160elapsedNowUwyO8pc()) / Duration.m4167getInWholeMillisecondsimpl(this.duration);
        float coerceIn = RangesKt___RangesKt.coerceIn(m4167getInWholeMillisecondsimpl, RecyclerView.DECELERATION_RATE, 1.0f);
        float f = this.maxAlpha;
        float f2 = coerceIn * f;
        if (this.fadeStart) {
            f -= f2;
        }
        this.isDone = m4167getInWholeMillisecondsimpl >= 1.0f;
        drawPainter(drawScope, this.start, f);
        drawPainter(drawScope, painter, f2);
        if (this.isDone) {
            this.start = null;
        } else {
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.invalidateTick$delegate;
            parcelableSnapshotMutableIntState.setIntValue(parcelableSnapshotMutableIntState.getIntValue() + 1);
        }
    }
}
