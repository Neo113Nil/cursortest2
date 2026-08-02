package androidx.paging;

import android.os.Build;
import android.util.Log;
import androidx.transition.Transition;
import androidx.work.Data$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.Response;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt__IndentKt;

/* loaded from: classes3.dex */
public abstract class PagingSource {
    public final Response invalidateCallbackTracker = new Response(new Data$$ExternalSyntheticLambda0(3));

    public abstract class LoadParams {
        public final int loadSize;

        public final class Append extends LoadParams {
            public final Object key;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Append(Object obj, int i) {
                super(i);
                obj.getClass();
                this.key = obj;
            }

            @Override // androidx.paging.PagingSource.LoadParams
            public final Object getKey() {
                return this.key;
            }
        }

        public final class Prepend extends LoadParams {
            public final Object key;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Prepend(Object obj, int i) {
                super(i);
                obj.getClass();
                this.key = obj;
            }

            @Override // androidx.paging.PagingSource.LoadParams
            public final Object getKey() {
                return this.key;
            }
        }

        public final class Refresh extends LoadParams {
            public final Object key;

            public Refresh(Object obj, int i) {
                super(i);
                this.key = obj;
            }

            @Override // androidx.paging.PagingSource.LoadParams
            public final Object getKey() {
                return this.key;
            }
        }

        public LoadParams(int i) {
            this.loadSize = i;
        }

        public abstract Object getKey();
    }

    public abstract class LoadResult {

        public final class Error extends LoadResult {
            public final Throwable throwable;

            public Error(Throwable th) {
                this.throwable = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && this.throwable.equals(((Error) obj).throwable);
            }

            public final int hashCode() {
                return this.throwable.hashCode();
            }

            public final String toString() {
                return StringsKt__IndentKt.trimMargin$default("LoadResult.Error(\n                    |   throwable: " + this.throwable + "\n                    |) ");
            }
        }

        public final class Invalid extends LoadResult {
            public final String toString() {
                return "LoadResult.Invalid";
            }
        }

        public final class Page extends LoadResult implements Iterable, KMappedMarker {
            public final List data;
            public final int itemsAfter;
            public final int itemsBefore;
            public final Object nextKey;
            public final Object prevKey;

            static {
                new Page(EmptyList.INSTANCE, null, null, 0, 0);
            }

            public Page(List list, Integer num, Object obj, int i, int i2) {
                list.getClass();
                this.data = list;
                this.prevKey = num;
                this.nextKey = obj;
                this.itemsBefore = i;
                this.itemsAfter = i2;
                if (i != Integer.MIN_VALUE && i < 0) {
                    a$$ExternalSyntheticBUOutline0.m$3("itemsBefore cannot be negative");
                    throw null;
                }
                if (i2 == Integer.MIN_VALUE || i2 >= 0) {
                    return;
                }
                a$$ExternalSyntheticBUOutline0.m$3("itemsAfter cannot be negative");
                throw null;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Page)) {
                    return false;
                }
                Page page = (Page) obj;
                return Intrinsics.areEqual(this.data, page.data) && Intrinsics.areEqual(this.prevKey, page.prevKey) && Intrinsics.areEqual(this.nextKey, page.nextKey) && this.itemsBefore == page.itemsBefore && this.itemsAfter == page.itemsAfter;
            }

            public final int hashCode() {
                int hashCode = this.data.hashCode() * 31;
                Object obj = this.prevKey;
                int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
                Object obj2 = this.nextKey;
                return Integer.hashCode(this.itemsAfter) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.itemsBefore, (hashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31, 31);
            }

            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return this.data.listIterator();
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("LoadResult.Page(\n                    |   data size: ");
                List list = this.data;
                sb.append(list.size());
                sb.append("\n                    |   first Item: ");
                sb.append(CollectionsKt.firstOrNull(list));
                sb.append("\n                    |   last Item: ");
                sb.append(CollectionsKt.lastOrNull(list));
                sb.append("\n                    |   nextKey: ");
                sb.append(this.nextKey);
                sb.append("\n                    |   prevKey: ");
                sb.append(this.prevKey);
                sb.append("\n                    |   itemsBefore: ");
                sb.append(this.itemsBefore);
                sb.append("\n                    |   itemsAfter: ");
                sb.append(this.itemsAfter);
                sb.append("\n                    |) ");
                return StringsKt__IndentKt.trimMargin$default(sb.toString());
            }
        }
    }

    public boolean getKeyReuseSupported() {
        return false;
    }

    public abstract Object getRefreshKey(PagingState pagingState);

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invalidate() {
        boolean z;
        Response response = this.invalidateCallbackTracker;
        if (!response.intermediate) {
            synchronized (((Transition.AnonymousClass1) response.cacheEntry)) {
                if (!response.intermediate) {
                    response.intermediate = true;
                    List list = CollectionsKt.toList((ArrayList) response.error);
                    ((ArrayList) response.error).clear();
                    Data$$ExternalSyntheticLambda0 data$$ExternalSyntheticLambda0 = (Data$$ExternalSyntheticLambda0) response.result;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        data$$ExternalSyntheticLambda0.invoke(it.next());
                    }
                    z = true;
                }
            }
            if (z) {
                return;
            }
            if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                Log.d("Paging", "Invalidated PagingSource " + this, null);
                return;
            }
            return;
        }
        z = false;
        if (z) {
        }
    }

    public abstract Object load(LoadParams loadParams, ContinuationImpl continuationImpl);

    public void queryResultsChanged() {
        invalidate();
    }

    public final void registerInvalidatedCallback(Function0 function0) {
        boolean z;
        Response response = this.invalidateCallbackTracker;
        response.getClass();
        if (response.intermediate) {
            ((Data$$ExternalSyntheticLambda0) response.result).invoke(function0);
            return;
        }
        synchronized (((Transition.AnonymousClass1) response.cacheEntry)) {
            if (response.intermediate) {
                z = true;
            } else {
                ((ArrayList) response.error).add(function0);
                z = false;
            }
        }
        if (z) {
            ((Data$$ExternalSyntheticLambda0) response.result).invoke(function0);
        }
    }
}
