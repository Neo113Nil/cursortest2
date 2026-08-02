package androidx.compose.foundation.lazy.layout;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class LazyLayoutMeasureScopeImpl implements MeasureScope {
    public final LazyLayoutItemContentFactory itemContentFactory;
    public final LazyLayoutItemProvider itemProvider;
    public final MutableIntObjectMap measurablesCache;
    public final SubcomposeMeasureScope subcomposeMeasureScope;

    public LazyLayoutMeasureScopeImpl(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, SubcomposeMeasureScope subcomposeMeasureScope) {
        this.itemContentFactory = lazyLayoutItemContentFactory;
        this.subcomposeMeasureScope = subcomposeMeasureScope;
        this.itemProvider = (LazyLayoutItemProvider) lazyLayoutItemContentFactory.itemProvider.invoke();
        IntObjectMapKt.mutableIntObjectMapOf();
        this.measurablesCache = new MutableIntObjectMap();
    }

    public final List compose(int i) {
        MutableIntObjectMap mutableIntObjectMap = this.measurablesCache;
        List list = (List) mutableIntObjectMap.get(i);
        if (list != null) {
            return list;
        }
        LazyLayoutItemProvider lazyLayoutItemProvider = this.itemProvider;
        Object key = lazyLayoutItemProvider.getKey(i);
        List subcompose = this.subcomposeMeasureScope.subcompose(key, this.itemContentFactory.getContent(i, key, lazyLayoutItemProvider.getContentType(i)));
        mutableIntObjectMap.set(i, subcompose);
        return subcompose;
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.subcomposeMeasureScope.getDensity();
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getFontScale() {
        return this.subcomposeMeasureScope.getFontScale();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public final LayoutDirection getLayoutDirection() {
        return this.subcomposeMeasureScope.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public final boolean isLookingAhead() {
        return this.subcomposeMeasureScope.isLookingAhead();
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public final MeasureResult layout(int i, int i2, Map map, Function1 function1) {
        return this.subcomposeMeasureScope.layout(i, i2, map, function1);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public final int mo229roundToPxR2X_6o(long j) {
        return this.subcomposeMeasureScope.mo229roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public final int mo230roundToPx0680j_4(float f) {
        return this.subcomposeMeasureScope.mo230roundToPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-GaN1DYA */
    public final float mo231toDpGaN1DYA(long j) {
        return this.subcomposeMeasureScope.mo231toDpGaN1DYA(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public final float mo233toDpu2uoSUM(int i) {
        return this.subcomposeMeasureScope.mo233toDpu2uoSUM(i);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public final long mo234toDpSizekrfVVM(long j) {
        return this.subcomposeMeasureScope.mo234toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public final float mo235toPxR2X_6o(long j) {
        return this.subcomposeMeasureScope.mo235toPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public final float mo236toPx0680j_4(float f) {
        return this.subcomposeMeasureScope.mo236toPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public final long mo237toSizeXkaWNTQ(long j) {
        return this.subcomposeMeasureScope.mo237toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-0xMU5do */
    public final long mo238toSp0xMU5do(float f) {
        return this.subcomposeMeasureScope.mo238toSp0xMU5do(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public final long mo239toSpkPz2Gy4(float f) {
        return this.subcomposeMeasureScope.mo239toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public final MeasureResult layout(int i, int i2, Map map, Function1 function1, Function1 function12) {
        return this.subcomposeMeasureScope.layout(i, i2, map, function1, function12);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public final float mo232toDpu2uoSUM(float f) {
        return this.subcomposeMeasureScope.mo232toDpu2uoSUM(f);
    }
}
