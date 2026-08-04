package com.gamericefishpro.space.dd;

import com.gamericefishpro.space.bd.e;
import com.gamericefishpro.space.bd.f;
import com.gamericefishpro.space.bd.g;
import com.gamericefishpro.space.fc.c;
import com.gamericefishpro.space.fc.d;
import com.gamericefishpro.space.fc.i;
import com.gamericefishpro.space.fc.j;
import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements d, com.gamericefishpro.space.jd.a, Closeable {
    private final f opRepo;
    private final c store;

    public a(c store, f opRepo) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(opRepo, "opRepo");
        this.store = store;
        this.opRepo = opRepo;
    }

    @Override // com.gamericefishpro.space.jd.a
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

    @Override // com.gamericefishpro.space.fc.d
    public void onModelAdded(i model, String tag) {
        g addOperation;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (Intrinsics.a(tag, "NORMAL") && (addOperation = getAddOperation(model)) != null) {
            e.enqueue$default(this.opRepo, addOperation, false, 2, null);
        }
    }

    @Override // com.gamericefishpro.space.fc.d
    public void onModelRemoved(i model, String tag) {
        g removeOperation;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (Intrinsics.a(tag, "NORMAL") && (removeOperation = getRemoveOperation(model)) != null) {
            e.enqueue$default(this.opRepo, removeOperation, false, 2, null);
        }
    }

    @Override // com.gamericefishpro.space.fc.d
    public void onModelUpdated(j args, String tag) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (Intrinsics.a(tag, "NORMAL")) {
            i model = args.getModel();
            Intrinsics.c(model, "null cannot be cast to non-null type TModel of com.onesignal.core.internal.operations.listeners.ModelStoreListener");
            g updateOperation = getUpdateOperation(model, args.getPath(), args.getProperty(), args.getOldValue(), args.getNewValue());
            if (updateOperation != null) {
                e.enqueue$default(this.opRepo, updateOperation, false, 2, null);
            }
        }
    }
}
