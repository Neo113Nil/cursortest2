package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.FragmentTransitionImpl;
import coil3.svg.internal.AndroidSvg;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class AsyncListDiffer {
    public static final MainThreadExecutor sMainThreadExecutor = new MainThreadExecutor();
    public final AndroidSvg mConfig;
    public List mList;
    public int mMaxScheduledGeneration;
    public final ListUpdateCallback mUpdateCallback;
    public final CopyOnWriteArrayList mListeners = new CopyOnWriteArrayList();
    public List mReadOnlyList = Collections.EMPTY_LIST;
    public final MainThreadExecutor mMainThreadExecutor = sMainThreadExecutor;

    public final class MainThreadExecutor implements Executor {
        public final Handler mHandler = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.mHandler.post(runnable);
        }
    }

    public AsyncListDiffer(ListUpdateCallback listUpdateCallback, AndroidSvg androidSvg) {
        this.mUpdateCallback = listUpdateCallback;
        this.mConfig = androidSvg;
    }

    public final void onCurrentListChanged(Runnable runnable) {
        Iterator it = this.mListeners.iterator();
        while (it.hasNext()) {
            ListAdapter listAdapter = ListAdapter.this;
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void submitList(List list, Runnable runnable) {
        int i = this.mMaxScheduledGeneration + 1;
        this.mMaxScheduledGeneration = i;
        List list2 = this.mList;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        ListUpdateCallback listUpdateCallback = this.mUpdateCallback;
        if (list == null) {
            int size = list2.size();
            this.mList = null;
            this.mReadOnlyList = Collections.EMPTY_LIST;
            listUpdateCallback.onRemoved(0, size);
            onCurrentListChanged(runnable);
            return;
        }
        if (list2 != null) {
            ((Executor) this.mConfig.svg).execute(new FragmentTransitionImpl.AnonymousClass1(this, list2, list, i, runnable));
            return;
        }
        this.mList = list;
        this.mReadOnlyList = Collections.unmodifiableList(list);
        listUpdateCallback.onInserted(0, list.size());
        onCurrentListChanged(runnable);
    }
}
