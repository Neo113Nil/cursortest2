package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes3.dex */
public final class PagerLayoutIntervalContent extends LazyLayoutKt {
    public final HuffmanTreeGroup intervals;
    public final Function1 key;

    public PagerLayoutIntervalContent(Function4 function4, Function1 function1, int i) {
        this.key = function1;
        HuffmanTreeGroup huffmanTreeGroup = new HuffmanTreeGroup(4);
        huffmanTreeGroup.addInterval(i, new PagerIntervalContent(function1, function4));
        this.intervals = huffmanTreeGroup;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKt
    public final HuffmanTreeGroup getIntervals() {
        return this.intervals;
    }
}
