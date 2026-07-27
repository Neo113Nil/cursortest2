package kotlin.text;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class CatchingFishSnackbarMVI implements CatchingFishLiveDataHandler {
    public volatile Set CatchingFishParcelableFAB;
    public volatile Set CatchingFishSnackbar;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
    
        throw r0;
     */
    @Override // kotlin.text.CatchingFishLiveDataHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get() {
        if (this.CatchingFishSnackbar == null) {
            synchronized (this) {
                try {
                    if (this.CatchingFishSnackbar == null) {
                        this.CatchingFishSnackbar = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            Iterator it = this.CatchingFishParcelableFAB.iterator();
                            while (it.hasNext()) {
                                this.CatchingFishSnackbar.add(((CatchingFishLiveDataHandler) it.next()).get());
                            }
                            this.CatchingFishParcelableFAB = null;
                        }
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.CatchingFishSnackbar);
    }
}
