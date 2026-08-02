package ru.yandex.taxi.design;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import defpackage.k4o;
import kotlin.Metadata;
import ru.yandex.taxi.utils.CustomImageSpan;

/* loaded from: classes9.dex */
public final class SpannableTextStrategyInteractor {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/design/SpannableTextStrategyInteractor$SpannableTextStrategy;", "", "SCALE_SIZE_BY_DENSITY", "SCALE_SIZE_BY_50_TEXT_SIZE", "SCALE_SIZE_BY_55_TEXT_SIZE", "SCALE_SIZE_BY_100_TEXT_SIZE", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class SpannableTextStrategy {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ SpannableTextStrategy[] $VALUES;
        public static final SpannableTextStrategy SCALE_SIZE_BY_100_TEXT_SIZE;
        public static final SpannableTextStrategy SCALE_SIZE_BY_50_TEXT_SIZE;
        public static final SpannableTextStrategy SCALE_SIZE_BY_55_TEXT_SIZE;
        public static final SpannableTextStrategy SCALE_SIZE_BY_DENSITY;

        static {
            SpannableTextStrategy spannableTextStrategy = new SpannableTextStrategy("SCALE_SIZE_BY_DENSITY", 0);
            SCALE_SIZE_BY_DENSITY = spannableTextStrategy;
            SpannableTextStrategy spannableTextStrategy2 = new SpannableTextStrategy("SCALE_SIZE_BY_50_TEXT_SIZE", 1);
            SCALE_SIZE_BY_50_TEXT_SIZE = spannableTextStrategy2;
            SpannableTextStrategy spannableTextStrategy3 = new SpannableTextStrategy("SCALE_SIZE_BY_55_TEXT_SIZE", 2);
            SCALE_SIZE_BY_55_TEXT_SIZE = spannableTextStrategy3;
            SpannableTextStrategy spannableTextStrategy4 = new SpannableTextStrategy("SCALE_SIZE_BY_100_TEXT_SIZE", 3);
            SCALE_SIZE_BY_100_TEXT_SIZE = spannableTextStrategy4;
            SpannableTextStrategy[] spannableTextStrategyArr = {spannableTextStrategy, spannableTextStrategy2, spannableTextStrategy3, spannableTextStrategy4};
            $VALUES = spannableTextStrategyArr;
            $ENTRIES = kotlin.enums.a.a(spannableTextStrategyArr);
        }

        public static SpannableTextStrategy valueOf(String str) {
            return (SpannableTextStrategy) Enum.valueOf(SpannableTextStrategy.class, str);
        }

        public static SpannableTextStrategy[] values() {
            return (SpannableTextStrategy[]) $VALUES.clone();
        }
    }

    public static SpannableStringBuilder a(CharSequence charSequence, Drawable drawable, int i, double d, int i2) {
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicHeight > 0) {
            double d2 = i * d;
            double d3 = intrinsicHeight;
            double d4 = d2 / d3;
            drawable.setBounds(0, 0, (int) (drawable.getIntrinsicWidth() * d4), (int) (d3 * d4));
        }
        return new SpannableStringBuilder(charSequence).append((CharSequence) " ").append(" ", new CustomImageSpan(drawable, i2, false, false, null, 28, null), 18);
    }
}
