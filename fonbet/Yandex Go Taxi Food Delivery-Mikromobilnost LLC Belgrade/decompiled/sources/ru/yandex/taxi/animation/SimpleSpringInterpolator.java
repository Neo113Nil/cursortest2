package ru.yandex.taxi.animation;

import android.view.animation.Interpolator;
import defpackage.zes0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u001f\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/animation/SimpleSpringInterpolator;", "Landroid/view/animation/Interpolator;", "", "", "values", "", "durationMillis", "<init>", "(Ljava/util/List;J)V", "input", "getInterpolation", "(F)F", "Ljava/util/List;", "J", "getDurationMillis", "()J", "", "valuesLastIndex", CA20Status.STATUS_USER_I, "Companion", "zes0", "utils"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SimpleSpringInterpolator implements Interpolator {
    public static final zes0 Companion = new zes0();
    private static final int FPS = 120;
    private static final float FRAMES_IN_MILLISECOND = 0.12f;
    private static final float FRAME_RATE = 0.008333334f;
    private static final int SPRING_LENGTH = 1;
    private final long durationMillis;
    private final List<Float> values;
    private final int valuesLastIndex;

    private SimpleSpringInterpolator(List<Float> list, long j) {
        this.values = list;
        this.durationMillis = j;
        this.valuesLastIndex = list.size() - 1;
    }

    public final long getDurationMillis() {
        return this.durationMillis;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float input) {
        return this.values.get((int) (input * this.valuesLastIndex)).floatValue();
    }

    public /* synthetic */ SimpleSpringInterpolator(List list, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, j);
    }
}
