package I4;

import H4.e;
import H4.f;
import com.onesignal.common.modeling.g;
import com.onesignal.common.modeling.i;
import com.onesignal.common.modeling.j;
import java.io.Closeable;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public abstract class b implements g, com.onesignal.core.internal.startup.a, Closeable {
    private final f opRepo;
    private final com.onesignal.common.modeling.f store;

    public b(com.onesignal.common.modeling.f store, f opRepo) {
        h.e(store, "store");
        h.e(opRepo, "opRepo");
        this.store = store;
        this.opRepo = opRepo;
    }

    @Override // com.onesignal.core.internal.startup.a
    public void bootstrap() {
        this.store.subscribe(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.store.unsubscribe(this);
    }

    public abstract H4.g getReplaceOperation(i iVar);

    public abstract H4.g getUpdateOperation(i iVar, String str, String str2, Object obj, Object obj2);

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(i model, String tag) {
        H4.g replaceOperation;
        h.e(model, "model");
        h.e(tag, "tag");
        if (tag.equals("NORMAL") && (replaceOperation = getReplaceOperation(model)) != null) {
            e.enqueue$default(this.opRepo, replaceOperation, false, 2, null);
        }
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(j args, String tag) {
        h.e(args, "args");
        h.e(tag, "tag");
        if (tag.equals("NORMAL")) {
            i model = args.getModel();
            h.c(model, "null cannot be cast to non-null type TModel of com.onesignal.core.internal.operations.listeners.SingletonModelStoreListener");
            H4.g updateOperation = getUpdateOperation(model, args.getPath(), args.getProperty(), args.getOldValue(), args.getNewValue());
            if (updateOperation != null) {
                e.enqueue$default(this.opRepo, updateOperation, false, 2, null);
            }
        }
    }
}
