package androidx.compose.ui.layout;

import java.util.Map;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface MeasureScope extends IntrinsicMeasureScope {
    static MeasureResult layout$default(MeasureScope measureScope, int i, int i2, Function1 function1) {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        return measureScope.layout(i, i2, emptyMap, function1);
    }

    default MeasureResult layout(int i, int i2, Map map, Function1 function1) {
        return layout(i, i2, map, null, function1);
    }

    MeasureResult layout(int i, int i2, Map map, Function1 function1, Function1 function12);
}
