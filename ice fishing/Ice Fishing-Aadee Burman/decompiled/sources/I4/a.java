package I4;

import H4.e;
import H4.f;
import H4.g;
import com.onesignal.common.modeling.c;
import com.onesignal.common.modeling.d;
import com.onesignal.common.modeling.i;
import com.onesignal.common.modeling.j;
import java.io.Closeable;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public abstract class a implements d, com.onesignal.core.internal.startup.a, Closeable {
    private final f opRepo;
    private final c store;

    public a(c store, f opRepo) {
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

    public abstract g getAddOperation(i iVar);

    public abstract g getRemoveOperation(i iVar);

    public abstract g getUpdateOperation(i iVar, String str, String str2, Object obj, Object obj2);

    @Override // com.onesignal.common.modeling.d
    public void onModelAdded(i model, String tag) {
        g addOperation;
        h.e(model, "model");
        h.e(tag, "tag");
        if (tag.equals("NORMAL") && (addOperation = getAddOperation(model)) != null) {
            e.enqueue$default(this.opRepo, addOperation, false, 2, null);
        }
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelRemoved(i model, String tag) {
        g removeOperation;
        h.e(model, "model");
        h.e(tag, "tag");
        if (tag.equals("NORMAL") && (removeOperation = getRemoveOperation(model)) != null) {
            e.enqueue$default(this.opRepo, removeOperation, false, 2, null);
        }
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelUpdated(j args, String tag) {
        h.e(args, "args");
        h.e(tag, "tag");
        if (tag.equals("NORMAL")) {
            i model = args.getModel();
            h.c(model, "null cannot be cast to non-null type TModel of com.onesignal.core.internal.operations.listeners.ModelStoreListener");
            g updateOperation = getUpdateOperation(model, args.getPath(), args.getProperty(), args.getOldValue(), args.getNewValue());
            if (updateOperation != null) {
                e.enqueue$default(this.opRepo, updateOperation, false, 2, null);
            }
        }
    }
}
