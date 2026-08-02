package ru.yandex.video.m3.player.lowlatency.bandwidth.ewma;

import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\rJ\u0015\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0005R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/yandex/video/m3/player/lowlatency/bandwidth/ewma/EWMA;", "", "", CaretView.ALPHA_PROPERTY, "<init>", "(D)V", "estimate", "weight", "applyZeroFactor", "(DD)D", "", "value", "computeEstimate", "(DJ)D", "Lzy11;", "sample", "(DJ)V", "getEstimate", "()D", "predictEstimate", "halfLife", "setHalfLife", CA20Status.STATUS_REQUEST_D, "totalWeight", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EWMA {
    public static final int $stable = 8;
    private double alpha;
    private double estimate;
    private double totalWeight;

    public EWMA(double d) {
        this.alpha = d;
    }

    private final double applyZeroFactor(double estimate, double weight) {
        return estimate / (1.0d - Math.pow(this.alpha, weight));
    }

    private final double computeEstimate(double weight, long value) {
        double pow = Math.pow(this.alpha, weight);
        return (pow * this.estimate) + ((1.0d - pow) * value);
    }

    public final double getEstimate() {
        return this.estimate / (1.0d - Math.pow(this.alpha, this.totalWeight));
    }

    public final double predictEstimate(double weight, long value) {
        return applyZeroFactor(computeEstimate(weight, value), this.totalWeight + weight);
    }

    public final void sample(double weight, long value) {
        double computeEstimate = computeEstimate(weight, value);
        if (computeEstimate > 0.0d) {
            this.estimate = computeEstimate;
            this.totalWeight += weight;
        }
    }

    public final void setHalfLife(double halfLife) {
        this.alpha = Math.exp(Math.log(0.5d) / halfLife);
    }
}
