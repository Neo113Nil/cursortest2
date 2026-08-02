package app.cash.redwood.lazylayout.widget;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class LazyListUpdateProcessor$Edit {

    public final class Insert extends LazyListUpdateProcessor$Edit {
        public int index;
        public final ArrayList widgets;

        public Insert(int i, ArrayList arrayList) {
            this.index = i;
            this.widgets = arrayList;
        }
    }

    public final class Move extends LazyListUpdateProcessor$Edit {
    }

    public final class Remove extends LazyListUpdateProcessor$Edit {
        public int count;
        public int index;
    }
}
