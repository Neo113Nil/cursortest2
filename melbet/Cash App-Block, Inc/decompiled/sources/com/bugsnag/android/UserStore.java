package com.bugsnag.android;

import com.bugsnag.android.internal.dag.Provider;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class UserStore {
    public final Provider deviceIdStore;
    public final Logger logger;
    public final boolean persist;
    public final AtomicReference previousUser;
    public final Provider sharedPrefMigrator;
    public final DeliveryParams synchronizedStreamableStore;

    public UserStore(boolean z, StorageModule$special$$inlined$provider$1 storageModule$special$$inlined$provider$1, StorageModule$special$$inlined$provider$2 storageModule$special$$inlined$provider$2, StorageModule$special$$inlined$provider$2 storageModule$special$$inlined$provider$22, Logger logger) {
        File file = new File((File) storageModule$special$$inlined$provider$1.get(), "user-info");
        this.persist = z;
        this.deviceIdStore = storageModule$special$$inlined$provider$2;
        this.sharedPrefMigrator = storageModule$special$$inlined$provider$22;
        this.logger = logger;
        this.previousUser = new AtomicReference(null);
        this.synchronizedStreamableStore = new DeliveryParams(file);
    }

    public final void save(User user) {
        if (!this.persist || Intrinsics.areEqual(user, this.previousUser.getAndSet(user))) {
            return;
        }
        try {
            this.synchronizedStreamableStore.persist(user);
        } catch (Exception e) {
            this.logger.w("Failed to persist user info", e);
        }
    }
}
