package app.cash.cdp.backend.jvm;

import androidx.work.impl.WorkLauncherImpl;
import app.cash.cdp.api.EventConsumer;
import app.cash.cdp.persistence.repository.PersistedEventRepository;
import coil3.ImageLoader$Builder;
import com.squareup.cash.android.AndroidModule$Companion$$ExternalSyntheticLambda0;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class RealEventConsumer implements EventConsumer {
    public final ImageLoader$Builder contextProvider;
    public final PersistedEventRepository eventRepository;
    public final CoroutineContext ioDispatcher;
    public final WorkLauncherImpl payloadSerializer;
    public final CoroutineScope scope;

    public RealEventConsumer(ImageLoader$Builder imageLoader$Builder, PersistedEventRepository persistedEventRepository, WorkLauncherImpl workLauncherImpl, AndroidModule$Companion$$ExternalSyntheticLambda0 androidModule$Companion$$ExternalSyntheticLambda0, CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        this.contextProvider = imageLoader$Builder;
        this.eventRepository = persistedEventRepository;
        this.payloadSerializer = workLauncherImpl;
        this.scope = coroutineScope;
        this.ioDispatcher = coroutineContext;
    }
}
