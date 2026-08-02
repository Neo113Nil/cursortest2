package androidx.camera.core.impl.utils;

import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import java.util.Comparator;

/* loaded from: classes3.dex */
public abstract class AspectRatioUtil {
    public static final Rational ASPECT_RATIO_4_3 = new Rational(4, 3);
    public static final Rational ASPECT_RATIO_3_4 = new Rational(3, 4);
    public static final Rational ASPECT_RATIO_16_9 = new Rational(16, 9);
    public static final Rational ASPECT_RATIO_9_16 = new Rational(9, 16);

    public final class CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace implements Comparator {
        public final Rational mFullFovRatio;
        public final RectF mTransformedMappingArea;

        public CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace(Rational rational, Rational rational2) {
            this.mFullFovRatio = rational2 == null ? new Rational(4, 3) : rational2;
            this.mTransformedMappingArea = getTransformedMappingArea(rational);
        }

        public static float getOverlappingAreaSize(RectF rectF, RectF rectF2) {
            return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Rational rational = (Rational) obj;
            Rational rational2 = (Rational) obj2;
            boolean z = false;
            if (rational.equals(rational2)) {
                return 0;
            }
            RectF transformedMappingArea = getTransformedMappingArea(rational);
            RectF transformedMappingArea2 = getTransformedMappingArea(rational2);
            float width = transformedMappingArea.width();
            RectF rectF = this.mTransformedMappingArea;
            boolean z2 = width >= rectF.width() && transformedMappingArea.height() >= rectF.height();
            if (transformedMappingArea2.width() >= rectF.width() && transformedMappingArea2.height() >= rectF.height()) {
                z = true;
            }
            if (z2 && z) {
                return (int) Math.signum((transformedMappingArea.height() * transformedMappingArea.width()) - (transformedMappingArea2.height() * transformedMappingArea2.width()));
            }
            if (z2) {
                return -1;
            }
            if (z) {
                return 1;
            }
            return -((int) Math.signum(getOverlappingAreaSize(transformedMappingArea, rectF) - getOverlappingAreaSize(transformedMappingArea2, rectF)));
        }

        public final RectF getTransformedMappingArea(Rational rational) {
            float floatValue = rational.floatValue();
            Rational rational2 = this.mFullFovRatio;
            return floatValue == rational2.floatValue() ? new RectF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, rational2.getNumerator(), rational2.getDenominator()) : rational.floatValue() > rational2.floatValue() ? new RectF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, rational2.getNumerator(), (rational.getDenominator() * rational2.getNumerator()) / rational.getNumerator()) : new RectF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, (rational.getNumerator() * rational2.getDenominator()) / rational.getDenominator(), rational2.getDenominator());
        }
    }

    public static boolean hasMatchingAspectRatio(Size size, Rational rational, Size size2) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        Size size3 = SizeUtil.RESOLUTION_ZERO;
        if (size.getHeight() * size.getWidth() >= SizeUtil.getArea(size2)) {
            int width = size.getWidth();
            int height = size.getHeight();
            Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
            int i = width % 16;
            if (i == 0 && height % 16 == 0) {
                if (ratioIntersectsMod16Segment(Math.max(0, height - 16), width, rational) || ratioIntersectsMod16Segment(Math.max(0, width - 16), height, rational2)) {
                    return true;
                }
            } else {
                if (i == 0) {
                    return ratioIntersectsMod16Segment(height, width, rational);
                }
                if (height % 16 == 0) {
                    return ratioIntersectsMod16Segment(width, height, rational2);
                }
            }
        }
        return false;
    }

    public static boolean ratioIntersectsMod16Segment(int i, int i2, Rational rational) {
        TransactorKt.checkArgument(i2 % 16 == 0);
        double numerator = (rational.getNumerator() * i) / rational.getDenominator();
        return numerator > ((double) Math.max(0, i2 + (-16))) && numerator < ((double) (i2 + 16));
    }
}
