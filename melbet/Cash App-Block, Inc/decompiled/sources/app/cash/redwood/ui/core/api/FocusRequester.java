package app.cash.redwood.ui.core.api;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

@Serializable(with = FocusRequesterSerializer.class)
/* loaded from: classes3.dex */
public interface FocusRequester {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/redwood/ui/core/api/FocusRequester$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/redwood/ui/core/api/FocusRequester;", "serializer", "()Lkotlinx/serialization/KSerializer;", "redwood-ui-core-api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public final KSerializer serializer() {
            return FocusRequesterSerializer.INSTANCE;
        }
    }
}
