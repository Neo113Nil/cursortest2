package com.datadog.android.api.storage.datastore;

import androidx.transition.Transition;
import com.bumptech.glide.GlideBuilder$1;
import com.fillr.n;
import java.util.UUID;

/* loaded from: classes4.dex */
public interface DataStoreHandler {
    void setValue(UUID uuid, Transition.AnonymousClass1 anonymousClass1);

    void value(n.b bVar, GlideBuilder$1 glideBuilder$1);
}
