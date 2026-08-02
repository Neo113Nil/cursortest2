package androidx.compose.foundation.lazy;

import androidx.collection.MutableIntList;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.squareup.cash.avatar.components.BadgedAvatarKt$$ExternalSyntheticLambda4;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes3.dex */
public final class LazyListIntervalContent extends LazyLayoutKt implements LazyListScope {
    public MutableIntList _headerIndexes;
    public final HuffmanTreeGroup intervals = new HuffmanTreeGroup(4);

    public LazyListIntervalContent(Function1 function1) {
        function1.invoke(this);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKt
    public final HuffmanTreeGroup getIntervals() {
        return this.intervals;
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public final void item(Object obj, Object obj2, Function3 function3) {
        this.intervals.addInterval(1, new LazyListInterval(obj != null ? new LazyListIntervalContent$$ExternalSyntheticLambda0(obj, 0) : null, new LazyListIntervalContent$$ExternalSyntheticLambda0(obj2, 0), new ComposableLambdaImpl(new LazyListIntervalContent$$ExternalSyntheticLambda1(function3, 0), true, -857469575)));
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public final void items(int i, Function1 function1, Function1 function12, ComposableLambdaImpl composableLambdaImpl) {
        this.intervals.addInterval(i, new LazyListInterval(function1, function12, composableLambdaImpl));
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public final void stickyHeader(Object obj, Object obj2, ComposableLambdaImpl composableLambdaImpl) {
        MutableIntList mutableIntList = this._headerIndexes;
        if (mutableIntList == null) {
            mutableIntList = new MutableIntList();
            this._headerIndexes = mutableIntList;
        }
        HuffmanTreeGroup huffmanTreeGroup = this.intervals;
        mutableIntList.add(huffmanTreeGroup.alphabetSize);
        item(obj, obj2, new ComposableLambdaImpl(new BadgedAvatarKt$$ExternalSyntheticLambda4(composableLambdaImpl, huffmanTreeGroup.alphabetSize, 1), true, -1588696110));
    }
}
