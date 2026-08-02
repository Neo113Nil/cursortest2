package app.cash.redwood.layout.api;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import okio.Path$$ExternalSyntheticBUOutline0;

@JvmInline
@Serializable
/* loaded from: classes3.dex */
public final class MainAxisAlignment {
    public static final Companion Companion = new Companion();
    public final int ordinal;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/redwood/layout/api/MainAxisAlignment$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/redwood/layout/api/MainAxisAlignment;", "serializer", "()Lkotlinx/serialization/KSerializer;", "redwood-layout-api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return MainAxisAlignment$$serializer.INSTANCE;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof MainAxisAlignment) {
            return this.ordinal == ((MainAxisAlignment) obj).ordinal;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.ordinal);
    }

    public final String toString() {
        int i = this.ordinal;
        if (i == 0) {
            return "Start";
        }
        if (i == 1) {
            return "Center";
        }
        if (i == 2) {
            return "End";
        }
        if (i == 3) {
            return "SpaceBetween";
        }
        if (i == 4) {
            return "SpaceAround";
        }
        if (i == 5) {
            return "SpaceEvenly";
        }
        Path$$ExternalSyntheticBUOutline0.m$2();
        return null;
    }
}
