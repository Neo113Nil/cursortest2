package coil3.memory;

import androidx.compose.foundation.lazy.LazyListState$$ExternalSyntheticLambda3;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.ValueInsets;
import androidx.recyclerview.widget.RecyclerView;
import coil3.Image;
import coil3.memory.RealWeakMemoryCache;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class RealWeakMemoryCache {
    public final LinkedHashMap cache;
    public int operationsSinceCleanUp;

    public final class InternalValue {
        public final Map extras;
        public final WeakReference image;
        public final long size;

        public InternalValue(WeakReference weakReference, Map map, long j) {
            this.image = weakReference;
            this.extras = map;
            this.size = j;
        }
    }

    public RealWeakMemoryCache(int i) {
        switch (i) {
            case 1:
                this.cache = new LinkedHashMap();
                break;
            default:
                this.cache = new LinkedHashMap();
                break;
        }
    }

    /* renamed from: clippedOutline-wH6b6FI$default, reason: not valid java name */
    public static Modifier m1458clippedOutlinewH6b6FI$default(RealWeakMemoryCache realWeakMemoryCache, Modifier modifier, Shape shape, int i) {
        if ((i & 1) != 0) {
            shape = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(RecyclerView.DECELERATION_RATE);
        }
        return realWeakMemoryCache.m1459clippedOutlinewH6b6FI(modifier, shape, RecyclerView.DECELERATION_RATE);
    }

    public void cleanUpIfNecessary() {
        int i = this.operationsSinceCleanUp;
        this.operationsSinceCleanUp = i + 1;
        if (i >= 10) {
            this.operationsSinceCleanUp = 0;
            Iterator it = this.cache.values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) it.next();
                if (arrayList.size() <= 1) {
                    InternalValue internalValue = (InternalValue) CollectionsKt.firstOrNull((List) arrayList);
                    if ((internalValue != null ? (Image) internalValue.image.get() : null) == null) {
                        it.remove();
                    }
                } else {
                    int size = arrayList.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        int i4 = i3 - i2;
                        if (((InternalValue) arrayList.get(i4)).image.get() == null) {
                            arrayList.remove(i4);
                            i2++;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    /* renamed from: clippedOutline-wH6b6FI, reason: not valid java name */
    public Modifier m1459clippedOutlinewH6b6FI(Modifier modifier, final Shape shape, final float f) {
        modifier.getClass();
        shape.getClass();
        final int i = this.operationsSinceCleanUp;
        this.operationsSinceCleanUp = i + 1;
        return ClipKt.drawWithCache(ValueInsets.onGloballyPositioned(modifier, new Function1() { // from class: com.squareup.cash.composeUi.foundation.layout.OutlineClipperScopeImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                RealWeakMemoryCache.this.cache.put(Integer.valueOf(i), new OutlineClipperScopeImpl$ClipSpec(shape, f, layoutCoordinates));
                return Unit.INSTANCE;
            }
        }), new LazyListState$$ExternalSyntheticLambda3(this, i, 9));
    }

    public void set(MemoryCache$Key memoryCache$Key, Image image, Map map, long j) {
        LinkedHashMap linkedHashMap = this.cache;
        Object obj = linkedHashMap.get(memoryCache$Key);
        if (obj == null) {
            obj = new ArrayList();
            linkedHashMap.put(memoryCache$Key, obj);
        }
        ArrayList arrayList = (ArrayList) obj;
        InternalValue internalValue = new InternalValue(new WeakReference(image), map, j);
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                InternalValue internalValue2 = (InternalValue) arrayList.get(i);
                if (j < internalValue2.size) {
                    i++;
                } else if (internalValue2.image.get() == image) {
                    arrayList.set(i, internalValue);
                } else {
                    arrayList.add(i, internalValue);
                }
            }
        } else {
            arrayList.add(internalValue);
        }
        cleanUpIfNecessary();
    }
}
