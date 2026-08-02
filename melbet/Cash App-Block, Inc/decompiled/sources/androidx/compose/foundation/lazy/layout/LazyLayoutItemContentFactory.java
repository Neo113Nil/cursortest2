package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.material3.TextKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LazyLayoutItemContentFactory {
    public final TooltipKt$$ExternalSyntheticLambda1 itemProvider;
    public final MutableScatterMap lambdasCache;
    public final SaveableStateHolder saveableStateHolder;

    public final class CachedItemContent {
        public ComposableLambdaImpl _content;
        public final Object contentType;
        public int index;
        public final Object key;

        public CachedItemContent(int i, Object obj, Object obj2) {
            this.key = obj;
            this.contentType = obj2;
            this.index = i;
        }
    }

    public LazyLayoutItemContentFactory(SaveableStateHolder saveableStateHolder, TooltipKt$$ExternalSyntheticLambda1 tooltipKt$$ExternalSyntheticLambda1) {
        this.saveableStateHolder = saveableStateHolder;
        this.itemProvider = tooltipKt$$ExternalSyntheticLambda1;
        long[] jArr = ScatterMapKt.EmptyGroup;
        this.lambdasCache = new MutableScatterMap();
    }

    public final Function2 getContent(int i, Object obj, Object obj2) {
        MutableScatterMap mutableScatterMap = this.lambdasCache;
        CachedItemContent cachedItemContent = (CachedItemContent) mutableScatterMap.get(obj);
        int i2 = 7;
        if (cachedItemContent != null && cachedItemContent.index == i && Intrinsics.areEqual(cachedItemContent.contentType, obj2)) {
            ComposableLambdaImpl composableLambdaImpl = cachedItemContent._content;
            if (composableLambdaImpl != null) {
                return composableLambdaImpl;
            }
            ComposableLambdaImpl composableLambdaImpl2 = new ComposableLambdaImpl(new TextKt$$ExternalSyntheticLambda0(i2, LazyLayoutItemContentFactory.this, cachedItemContent), true, 818252804);
            cachedItemContent._content = composableLambdaImpl2;
            return composableLambdaImpl2;
        }
        CachedItemContent cachedItemContent2 = new CachedItemContent(i, obj, obj2);
        mutableScatterMap.set(obj, cachedItemContent2);
        ComposableLambdaImpl composableLambdaImpl3 = cachedItemContent2._content;
        if (composableLambdaImpl3 != null) {
            return composableLambdaImpl3;
        }
        ComposableLambdaImpl composableLambdaImpl4 = new ComposableLambdaImpl(new TextKt$$ExternalSyntheticLambda0(i2, this, cachedItemContent2), true, 818252804);
        cachedItemContent2._content = composableLambdaImpl4;
        return composableLambdaImpl4;
    }

    public final Object getContentType(Object obj) {
        if (obj == null) {
            return null;
        }
        CachedItemContent cachedItemContent = (CachedItemContent) this.lambdasCache.get(obj);
        if (cachedItemContent != null) {
            return cachedItemContent.contentType;
        }
        LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) this.itemProvider.invoke();
        int index = lazyLayoutItemProvider.getIndex(obj);
        if (index != -1) {
            return lazyLayoutItemProvider.getContentType(index);
        }
        return null;
    }
}
