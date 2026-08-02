package app.cash.broadway;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.time.TimeSource;

/* loaded from: classes.dex */
public final class Broadway {
    public final List presenterFactories;
    public final List themers;
    public final TimeSource timeSource;
    public final List transitionFactories;
    public final List uiFactories;

    public Broadway(List list, List list2, List list3, List list4) {
        TimeSource.Monotonic monotonic = TimeSource.Monotonic.INSTANCE;
        list.getClass();
        list2.getClass();
        list4.getClass();
        monotonic.getClass();
        this.timeSource = monotonic;
        this.themers = CollectionsKt.toList(list);
        this.uiFactories = CollectionsKt.toList(list2);
        this.transitionFactories = CollectionsKt.toList(list3);
        this.presenterFactories = CollectionsKt.toList(list4);
    }
}
