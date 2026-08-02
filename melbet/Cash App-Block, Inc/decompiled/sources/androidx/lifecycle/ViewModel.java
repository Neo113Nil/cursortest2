package androidx.lifecycle;

import androidx.lifecycle.viewmodel.internal.ViewModelImpl;
import java.io.Closeable;
import java.util.Iterator;
import kotlin.Deprecated;

/* loaded from: classes.dex */
public abstract class ViewModel {
    private final ViewModelImpl impl = new ViewModelImpl();

    public final void addCloseable(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        str.getClass();
        autoCloseable.getClass();
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            if (viewModelImpl.isCleared) {
                ViewModelImpl.closeWithRuntimeException(autoCloseable);
                return;
            }
            synchronized (viewModelImpl.lock) {
                autoCloseable2 = (AutoCloseable) viewModelImpl.keyToCloseables.put(str, autoCloseable);
            }
            ViewModelImpl.closeWithRuntimeException(autoCloseable2);
        }
    }

    public final void clear$lifecycle_viewmodel() {
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null && !viewModelImpl.isCleared) {
            viewModelImpl.isCleared = true;
            synchronized (viewModelImpl.lock) {
                try {
                    Iterator it = viewModelImpl.keyToCloseables.values().iterator();
                    while (it.hasNext()) {
                        ViewModelImpl.closeWithRuntimeException((AutoCloseable) it.next());
                    }
                    Iterator it2 = viewModelImpl.closeables.iterator();
                    while (it2.hasNext()) {
                        ViewModelImpl.closeWithRuntimeException((AutoCloseable) it2.next());
                    }
                    viewModelImpl.closeables.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        onCleared();
    }

    public final <T extends AutoCloseable> T getCloseable(String str) {
        T t;
        str.getClass();
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl == null) {
            return null;
        }
        synchronized (viewModelImpl.lock) {
            t = (T) viewModelImpl.keyToCloseables.get(str);
        }
        return t;
    }

    public void onCleared() {
    }

    public void addCloseable(AutoCloseable autoCloseable) {
        autoCloseable.getClass();
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            if (viewModelImpl.isCleared) {
                ViewModelImpl.closeWithRuntimeException(autoCloseable);
                return;
            }
            synchronized (viewModelImpl.lock) {
                viewModelImpl.closeables.add(autoCloseable);
            }
        }
    }

    @Deprecated
    public void addCloseable(Closeable closeable) {
        closeable.getClass();
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            if (viewModelImpl.isCleared) {
                ViewModelImpl.closeWithRuntimeException(closeable);
                return;
            }
            synchronized (viewModelImpl.lock) {
                viewModelImpl.closeables.add(closeable);
            }
        }
    }
}
