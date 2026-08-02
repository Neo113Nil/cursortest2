package androidx.paging;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.PrefetchHandleProvider$HandleAndRequestImpl;
import androidx.paging.LoadState;
import androidx.paging.PageEvent;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes3.dex */
public final class FlattenedPageEventStorage {
    public Object mediatorStates;
    public final List pages;
    public int placeholdersAfter;
    public int placeholdersBefore;
    public boolean receivedFirstEvent;
    public final Object sourceStates;

    public FlattenedPageEventStorage(PrefetchHandleProvider$HandleAndRequestImpl prefetchHandleProvider$HandleAndRequestImpl, List list) {
        this.mediatorStates = prefetchHandleProvider$HandleAndRequestImpl;
        this.pages = list;
        this.sourceStates = new List[list.size()];
        if (list.isEmpty()) {
            InlineClassHelperKt.throwIllegalArgumentException("NestedPrefetchController shouldn't be created with no states");
        }
    }

    public void add(PageEvent pageEvent) {
        ArrayDeque arrayDeque = (ArrayDeque) this.pages;
        SingleRunner$Holder singleRunner$Holder = (SingleRunner$Holder) this.sourceStates;
        pageEvent.getClass();
        this.receivedFirstEvent = true;
        if (!(pageEvent instanceof PageEvent.Insert)) {
            if (pageEvent instanceof PageEvent.Drop) {
                singleRunner$Holder.set((LoadType) null, LoadState.NotLoading.Incomplete);
                throw null;
            }
            if (pageEvent instanceof PageEvent.LoadStateUpdate) {
                PageEvent.LoadStateUpdate loadStateUpdate = (PageEvent.LoadStateUpdate) pageEvent;
                singleRunner$Holder.set(loadStateUpdate.source);
                this.mediatorStates = loadStateUpdate.mediator;
                return;
            } else {
                if (!(pageEvent instanceof PageEvent.StaticList)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                arrayDeque.clear();
                this.placeholdersAfter = 0;
                this.placeholdersBefore = 0;
                arrayDeque.addLast(new TransformablePage(0, ((PageEvent.StaticList) pageEvent).data));
                return;
            }
        }
        PageEvent.Insert insert = (PageEvent.Insert) pageEvent;
        LoadStates loadStates = insert.sourceLoadStates;
        int i = insert.placeholdersBefore;
        int i2 = insert.placeholdersAfter;
        List list = insert.pages;
        singleRunner$Holder.set(loadStates);
        this.mediatorStates = insert.mediatorLoadStates;
        int ordinal = insert.loadType.ordinal();
        if (ordinal == 0) {
            arrayDeque.clear();
            this.placeholdersAfter = i2;
            this.placeholdersBefore = i;
            arrayDeque.addAll(list);
            return;
        }
        if (ordinal == 1) {
            this.placeholdersBefore = i;
            IntProgressionIterator it = RangesKt___RangesKt.downTo(list.size() - 1, 0).iterator();
            while (it.hasNext) {
                arrayDeque.addFirst(list.get(it.nextInt()));
            }
            return;
        }
        if (ordinal != 2) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        } else {
            this.placeholdersAfter = i2;
            arrayDeque.addAll(list);
        }
    }

    public List getAsEvents() {
        ArrayDeque arrayDeque = (ArrayDeque) this.pages;
        if (!this.receivedFirstEvent) {
            return EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        LoadStates snapshot = ((SingleRunner$Holder) this.sourceStates).snapshot();
        if (arrayDeque.isEmpty()) {
            arrayList.add(new PageEvent.LoadStateUpdate(snapshot, (LoadStates) this.mediatorStates));
            return arrayList;
        }
        List list = CollectionsKt.toList(arrayDeque);
        int i = this.placeholdersBefore;
        int i2 = this.placeholdersAfter;
        LoadStates loadStates = (LoadStates) this.mediatorStates;
        list.getClass();
        arrayList.add(new PageEvent.Insert(LoadType.REFRESH, list, i, i2, snapshot, loadStates));
        return arrayList;
    }

    public FlattenedPageEventStorage() {
        this.pages = new ArrayDeque();
        this.sourceStates = new SingleRunner$Holder(2);
    }
}
