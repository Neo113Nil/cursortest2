package a9;

import com.onesignal.common.modeling.c;
import com.onesignal.common.modeling.d;
import com.onesignal.common.modeling.i;
import java.io.Closeable;
import pc.j;
import z8.e;
import z8.f;
import z8.g;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class a implements d, d9.a, Closeable {
    private final f opRepo;
    private final c store;

    public a(c cVar, f fVar) {
        j.e(cVar, "store");
        j.e(fVar, "opRepo");
        this.store = cVar;
        this.opRepo = fVar;
    }

    @Override // d9.a
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
    public void onModelAdded(i iVar, String str) {
        g addOperation;
        j.e(iVar, "model");
        j.e(str, "tag");
        if (str.equals("NORMAL") && (addOperation = getAddOperation(iVar)) != null) {
            e.enqueue$default(this.opRepo, addOperation, false, 2, null);
        }
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelRemoved(i iVar, String str) {
        g removeOperation;
        j.e(iVar, "model");
        j.e(str, "tag");
        if (str.equals("NORMAL") && (removeOperation = getRemoveOperation(iVar)) != null) {
            e.enqueue$default(this.opRepo, removeOperation, false, 2, null);
        }
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelUpdated(com.onesignal.common.modeling.j jVar, String str) {
        j.e(jVar, "args");
        j.e(str, "tag");
        if (str.equals("NORMAL")) {
            i model = jVar.getModel();
            j.c(model, "null cannot be cast to non-null type TModel of com.onesignal.core.internal.operations.listeners.ModelStoreListener");
            g updateOperation = getUpdateOperation(model, jVar.getPath(), jVar.getProperty(), jVar.getOldValue(), jVar.getNewValue());
            if (updateOperation != null) {
                e.enqueue$default(this.opRepo, updateOperation, false, 2, null);
            }
        }
    }
}
