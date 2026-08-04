package com.gamericefishpro.space.dd;

import com.gamericefishpro.space.bd.e;
import com.gamericefishpro.space.bd.f;
import com.gamericefishpro.space.fc.g;
import com.gamericefishpro.space.fc.i;
import com.gamericefishpro.space.fc.j;
import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements g, com.gamericefishpro.space.jd.a, Closeable {
    private final f opRepo;
    private final com.gamericefishpro.space.fc.f store;

    public b(com.gamericefishpro.space.fc.f store, f opRepo) {
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

    public abstract com.gamericefishpro.space.bd.g getReplaceOperation(i iVar);

    public abstract com.gamericefishpro.space.bd.g getUpdateOperation(i iVar, String str, String str2, Object obj, Object obj2);

    @Override // com.gamericefishpro.space.fc.g
    public void onModelReplaced(i model, String tag) {
        com.gamericefishpro.space.bd.g replaceOperation;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (Intrinsics.a(tag, "NORMAL") && (replaceOperation = getReplaceOperation(model)) != null) {
            e.enqueue$default(this.opRepo, replaceOperation, false, 2, null);
        }
    }

    @Override // com.gamericefishpro.space.fc.g
    public void onModelUpdated(j args, String tag) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (Intrinsics.a(tag, "NORMAL")) {
            i model = args.getModel();
            Intrinsics.c(model, "null cannot be cast to non-null type TModel of com.onesignal.core.internal.operations.listeners.SingletonModelStoreListener");
            com.gamericefishpro.space.bd.g updateOperation = getUpdateOperation(model, args.getPath(), args.getProperty(), args.getOldValue(), args.getNewValue());
            if (updateOperation != null) {
                e.enqueue$default(this.opRepo, updateOperation, false, 2, null);
            }
        }
    }
}
