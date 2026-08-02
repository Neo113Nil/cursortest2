package app.cash.redwood.lazylayout.api;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes3.dex */
public final class ScrollItemIndex {
    public static final Companion Companion = new Companion();
    public final boolean animated;
    public final int id;
    public final int index;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/redwood/lazylayout/api/ScrollItemIndex$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/redwood/lazylayout/api/ScrollItemIndex;", "serializer", "()Lkotlinx/serialization/KSerializer;", "redwood-lazylayout-api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return ScrollItemIndex$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ScrollItemIndex(int i, int i2, boolean z, int i3) {
        if (3 != (i & 3)) {
            TuplesKt.throwMissingFieldException(i, 3, ScrollItemIndex$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.index = i3;
        if ((i & 4) == 0) {
            this.animated = false;
        } else {
            this.animated = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollItemIndex)) {
            return false;
        }
        ScrollItemIndex scrollItemIndex = (ScrollItemIndex) obj;
        return this.id == scrollItemIndex.id && this.index == scrollItemIndex.index && this.animated == scrollItemIndex.animated;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.animated) + (((this.id * 31) + this.index) * 31);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m107m(this.id, this.index, "ScrollItemIndex(id=", ", index=", ", animated="), this.animated, ")");
    }
}
