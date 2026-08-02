package app.cash.arcade.values;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes3.dex */
public final class LineChartModel {
    public static final Lazy[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final DataSource dataSource;
    public final HistoricalRange range;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/LineChartModel$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/LineChartModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return LineChartModel$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class DataSource {
        public static final /* synthetic */ DataSource[] $VALUES = {new DataSource("LOCAL_INVESTING", 0), new DataSource("LOCAL_BITCOIN", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        DataSource EF5;

        public static DataSource valueOf(String str) {
            return (DataSource) Enum.valueOf(DataSource.class, str);
        }

        public static DataSource[] values() {
            return (DataSource[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class HistoricalRange {
        public static final /* synthetic */ HistoricalRange[] $VALUES = {new HistoricalRange("DAY", 0), new HistoricalRange("WEEK", 1), new HistoricalRange("MONTH", 2), new HistoricalRange("YEAR", 3), new HistoricalRange("ALL", 4)};

        /* JADX INFO: Fake field, exist only in values array */
        HistoricalRange EF5;

        public static HistoricalRange valueOf(String str) {
            return (HistoricalRange) Enum.valueOf(HistoricalRange.class, str);
        }

        public static HistoricalRange[] values() {
            return (HistoricalRange[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        $childSerializers = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Shape$$ExternalSyntheticLambda0(2)), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Shape$$ExternalSyntheticLambda0(3))};
    }

    public /* synthetic */ LineChartModel(int i, DataSource dataSource, HistoricalRange historicalRange) {
        if (3 != (i & 3)) {
            TuplesKt.throwMissingFieldException(i, 3, LineChartModel$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.dataSource = dataSource;
        this.range = historicalRange;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineChartModel)) {
            return false;
        }
        LineChartModel lineChartModel = (LineChartModel) obj;
        return this.dataSource == lineChartModel.dataSource && this.range == lineChartModel.range;
    }

    public final int hashCode() {
        return this.range.hashCode() + (this.dataSource.hashCode() * 31);
    }

    public final String toString() {
        return "LineChartModel(dataSource=" + this.dataSource + ", range=" + this.range + ")";
    }
}
