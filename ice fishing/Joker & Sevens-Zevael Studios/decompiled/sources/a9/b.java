package a9;

import com.onesignal.common.modeling.g;
import com.onesignal.common.modeling.i;
import java.io.Closeable;
import pc.j;
import z8.e;
import z8.f;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class b implements g, d9.a, Closeable {
    private final f opRepo;
    private final com.onesignal.common.modeling.f store;

    public b(com.onesignal.common.modeling.f fVar, f fVar2) {
        j.e(fVar, "store");
        j.e(fVar2, "opRepo");
        this.store = fVar;
        this.opRepo = fVar2;
    }

    @Override // d9.a
    public void bootstrap() {
        this.store.subscribe(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.store.unsubscribe(this);
    }

    public abstract z8.g getReplaceOperation(i iVar);

    public abstract z8.g getUpdateOperation(i iVar, String str, String str2, Object obj, Object obj2);

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(i iVar, String str) {
        z8.g replaceOperation;
        j.e(iVar, "model");
        j.e(str, "tag");
        if (str.equals("NORMAL") && (replaceOperation = getReplaceOperation(iVar)) != null) {
            e.enqueue$default(this.opRepo, replaceOperation, false, 2, null);
        }
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(com.onesignal.common.modeling.j jVar, String str) {
        j.e(jVar, "args");
        j.e(str, "tag");
        if (str.equals("NORMAL")) {
            i model = jVar.getModel();
            j.c(model, "null cannot be cast to non-null type TModel of com.onesignal.core.internal.operations.listeners.SingletonModelStoreListener");
            z8.g updateOperation = getUpdateOperation(model, jVar.getPath(), jVar.getProperty(), jVar.getOldValue(), jVar.getNewValue());
            if (updateOperation != null) {
                e.enqueue$default(this.opRepo, updateOperation, false, 2, null);
            }
        }
    }
}
