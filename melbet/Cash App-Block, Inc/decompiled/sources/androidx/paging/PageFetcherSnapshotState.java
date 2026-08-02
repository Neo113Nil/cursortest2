package androidx.paging;

import androidx.paging.LoadState;
import androidx.paging.PageEvent;
import androidx.paging.PagingSource;
import androidx.paging.ViewportHint;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.sync.MutexImpl;
import papa.PapaEvent;

/* loaded from: classes3.dex */
public final class PageFetcherSnapshotState {
    public final ArrayList _pages;
    public int _placeholdersAfter;
    public int _placeholdersBefore;
    public final BufferedChannel appendGenerationIdCh;
    public final PagingConfig config;
    public final LinkedHashMap failedHintsByLoadType;
    public int initialPageIndex;
    public final LinkedHashMap pageKeys;
    public final ArrayList pages;
    public final BufferedChannel prependGenerationIdCh;
    public final SingleRunner$Holder sourceLoadStates;

    public final class Holder {
        public final MutexImpl lock = new MutexImpl();
        public final PageFetcherSnapshotState state;

        public Holder(PagingConfig pagingConfig) {
            this.state = new PageFetcherSnapshotState(pagingConfig);
        }
    }

    public PageFetcherSnapshotState(PagingConfig pagingConfig) {
        this.config = pagingConfig;
        ArrayList arrayList = new ArrayList();
        this._pages = arrayList;
        this.pages = arrayList;
        this.pageKeys = new LinkedHashMap();
        this.prependGenerationIdCh = PapaEvent.Channel$default(-1, null, null, 6);
        this.appendGenerationIdCh = PapaEvent.Channel$default(-1, null, null, 6);
        this.failedHintsByLoadType = new LinkedHashMap();
        SingleRunner$Holder singleRunner$Holder = new SingleRunner$Holder(2);
        singleRunner$Holder.set(LoadType.REFRESH, LoadState.Loading.INSTANCE);
        this.sourceLoadStates = singleRunner$Holder;
    }

    public final PagingState currentPagingState$paging_common(ViewportHint.Access access) {
        Integer num;
        PagingConfig pagingConfig = this.config;
        int i = pagingConfig.pageSize;
        ArrayList arrayList = this.pages;
        List list = CollectionsKt.toList(arrayList);
        if (access != null) {
            int i2 = access.pageOffset;
            int i3 = this._placeholdersBefore;
            int i4 = -this.initialPageIndex;
            int size = (arrayList.size() - 1) - this.initialPageIndex;
            int i5 = i4;
            while (i5 < i2) {
                i3 += i5 > size ? i : ((PagingSource.LoadResult.Page) arrayList.get(this.initialPageIndex + i5)).data.size();
                i5++;
            }
            int i6 = i3 + access.indexInPage;
            if (i2 < i4) {
                i6 -= i;
            }
            num = Integer.valueOf(i6);
        } else {
            num = null;
        }
        return new PagingState(list, num, pagingConfig, this._placeholdersBefore);
    }

    public final int getStorageCount$paging_common() {
        Iterator it = this.pages.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((PagingSource.LoadResult.Page) it.next()).data.size();
        }
        return i;
    }

    public final boolean insert(int i, LoadType loadType, PagingSource.LoadResult.Page page, Object obj) {
        loadType.getClass();
        page.getClass();
        int i2 = page.itemsBefore;
        List list = page.data;
        int i3 = page.itemsAfter;
        int ordinal = loadType.ordinal();
        LinkedHashMap linkedHashMap = this.pageKeys;
        ArrayList arrayList = this._pages;
        ArrayList arrayList2 = this.pages;
        if (ordinal == 0) {
            if (!arrayList2.isEmpty()) {
                a$$ExternalSyntheticBUOutline0.m$1("cannot receive multiple init calls");
                return false;
            }
            if (i != 0) {
                a$$ExternalSyntheticBUOutline0.m$1("init loadId must be the initial value, 0");
                return false;
            }
            arrayList.add(page);
            linkedHashMap.put(Integer.valueOf(page.hashCode()), obj);
            this.initialPageIndex = 0;
            if (i3 == Integer.MIN_VALUE) {
                i3 = 0;
            }
            this._placeholdersAfter = i3;
            if (i2 == Integer.MIN_VALUE) {
                i2 = 0;
            }
            this._placeholdersBefore = i2;
            return true;
        }
        LinkedHashMap linkedHashMap2 = this.failedHintsByLoadType;
        if (ordinal != 1) {
            if (ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return false;
            }
            if (arrayList2.isEmpty()) {
                a$$ExternalSyntheticBUOutline0.m$1("should've received an init before append");
                return false;
            }
            if (i == 0) {
                arrayList.add(page);
                linkedHashMap.put(Integer.valueOf(page.hashCode()), obj);
                if (i3 == Integer.MIN_VALUE) {
                    int size = this._placeholdersAfter - list.size();
                    i3 = size < 0 ? 0 : size;
                }
                this._placeholdersAfter = i3 != Integer.MIN_VALUE ? i3 : 0;
                linkedHashMap2.remove(LoadType.APPEND);
                return true;
            }
        } else {
            if (arrayList2.isEmpty()) {
                a$$ExternalSyntheticBUOutline0.m$1("should've received an init before prepend");
                return false;
            }
            if (i == 0) {
                arrayList.add(0, page);
                linkedHashMap.put(Integer.valueOf(page.hashCode()), obj);
                this.initialPageIndex++;
                if (i2 == Integer.MIN_VALUE) {
                    int size2 = this._placeholdersBefore - list.size();
                    i2 = size2 < 0 ? 0 : size2;
                }
                this._placeholdersBefore = i2 != Integer.MIN_VALUE ? i2 : 0;
                linkedHashMap2.remove(LoadType.PREPEND);
                return true;
            }
        }
        return false;
    }

    public final PageEvent.Insert toPageEvent$paging_common(PagingSource.LoadResult.Page page, LoadType loadType) {
        page.getClass();
        int ordinal = loadType.ordinal();
        int i = 0;
        if (ordinal != 0) {
            if (ordinal == 1) {
                i = 0 - this.initialPageIndex;
            } else {
                if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                i = (this.pages.size() - this.initialPageIndex) - 1;
            }
        }
        List listOf = CollectionsKt__CollectionsJVMKt.listOf(new TransformablePage(i, page.data));
        int ordinal2 = loadType.ordinal();
        SingleRunner$Holder singleRunner$Holder = this.sourceLoadStates;
        if (ordinal2 == 0) {
            int i2 = this._placeholdersBefore;
            int i3 = this._placeholdersAfter;
            LoadStates snapshot = singleRunner$Holder.snapshot();
            listOf.getClass();
            return new PageEvent.Insert(LoadType.REFRESH, listOf, i2, i3, snapshot, null);
        }
        if (ordinal2 == 1) {
            int i4 = this._placeholdersBefore;
            LoadStates snapshot2 = singleRunner$Holder.snapshot();
            listOf.getClass();
            return new PageEvent.Insert(LoadType.PREPEND, listOf, i4, -1, snapshot2, null);
        }
        if (ordinal2 != 2) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        int i5 = this._placeholdersAfter;
        LoadStates snapshot3 = singleRunner$Holder.snapshot();
        listOf.getClass();
        return new PageEvent.Insert(LoadType.APPEND, listOf, -1, i5, snapshot3, null);
    }
}
