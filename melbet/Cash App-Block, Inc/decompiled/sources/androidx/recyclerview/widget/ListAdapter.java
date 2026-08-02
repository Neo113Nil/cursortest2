package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import coil3.svg.internal.AndroidSvg;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public abstract class ListAdapter extends RecyclerView.Adapter {
    public final AsyncListDiffer mDiffer;

    /* renamed from: androidx.recyclerview.widget.ListAdapter$1, reason: invalid class name */
    public final class AnonymousClass1 {
        public AnonymousClass1() {
        }
    }

    public ListAdapter(DiffUtil diffUtil) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        OpReorderer opReorderer = new OpReorderer(this);
        synchronized (DiffUtil.sExecutorLock) {
            try {
                if (DiffUtil.sDiffExecutor == null) {
                    DiffUtil.sDiffExecutor = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AsyncListDiffer asyncListDiffer = new AsyncListDiffer(opReorderer, new AndroidSvg(9, DiffUtil.sDiffExecutor, diffUtil));
        this.mDiffer = asyncListDiffer;
        asyncListDiffer.mListeners.add(anonymousClass1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.mDiffer.mReadOnlyList.size();
    }
}
