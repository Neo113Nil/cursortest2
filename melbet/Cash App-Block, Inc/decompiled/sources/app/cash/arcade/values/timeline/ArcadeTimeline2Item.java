package app.cash.arcade.values.timeline;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.arcade.values.Color;
import app.cash.arcade.values.Shape$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes3.dex */
public final class ArcadeTimeline2Item {
    public static final Lazy[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final String body;
    public final Color bodyColor;
    public final String id;
    public final boolean isClickable;
    public final State state;
    public final String title;
    public final String value;
    public final Color valueColor;
    public final String valueDescriptor;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/timeline/ArcadeTimeline2Item$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/timeline/ArcadeTimeline2Item;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return ArcadeTimeline2Item$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Serializable
    public final class State {

        /* JADX INFO: Fake field, exist only in values array */
        State EF5;
        public static final /* synthetic */ State[] $VALUES = {new State("NotStarted", 0), new State("Incomplete", 1), new State("Pending", 2), new State("Skipped", 3), new State("Done", 4)};
        public static final Companion Companion = new Companion();
        public static final Lazy $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Shape$$ExternalSyntheticLambda0(26));

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/timeline/ArcadeTimeline2Item$State$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/timeline/ArcadeTimeline2Item$State;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return (KSerializer) State.$cachedSerializer$delegate.getValue();
            }
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        $childSerializers = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Shape$$ExternalSyntheticLambda0(23)), null, null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Shape$$ExternalSyntheticLambda0(24)), null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Shape$$ExternalSyntheticLambda0(25)), null, null, null};
    }

    public /* synthetic */ ArcadeTimeline2Item(int i, State state, String str, String str2, Color color, String str3, Color color2, String str4, boolean z, String str5) {
        if (3 != (i & 3)) {
            TuplesKt.throwMissingFieldException(i, 3, ArcadeTimeline2Item$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.state = state;
        this.title = str;
        if ((i & 4) == 0) {
            this.value = null;
        } else {
            this.value = str2;
        }
        if ((i & 8) == 0) {
            this.valueColor = null;
        } else {
            this.valueColor = color;
        }
        if ((i & 16) == 0) {
            this.body = null;
        } else {
            this.body = str3;
        }
        if ((i & 32) == 0) {
            this.bodyColor = null;
        } else {
            this.bodyColor = color2;
        }
        if ((i & 64) == 0) {
            this.valueDescriptor = null;
        } else {
            this.valueDescriptor = str4;
        }
        if ((i & 128) == 0) {
            this.isClickable = false;
        } else {
            this.isClickable = z;
        }
        if ((i & 256) == 0) {
            this.id = null;
        } else {
            this.id = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArcadeTimeline2Item)) {
            return false;
        }
        ArcadeTimeline2Item arcadeTimeline2Item = (ArcadeTimeline2Item) obj;
        return this.state == arcadeTimeline2Item.state && Intrinsics.areEqual(this.title, arcadeTimeline2Item.title) && Intrinsics.areEqual(this.value, arcadeTimeline2Item.value) && Intrinsics.areEqual(this.valueColor, arcadeTimeline2Item.valueColor) && Intrinsics.areEqual(this.body, arcadeTimeline2Item.body) && Intrinsics.areEqual(this.bodyColor, arcadeTimeline2Item.bodyColor) && Intrinsics.areEqual(this.valueDescriptor, arcadeTimeline2Item.valueDescriptor) && this.isClickable == arcadeTimeline2Item.isClickable && Intrinsics.areEqual(this.id, arcadeTimeline2Item.id);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.state.hashCode() * 31, 31, this.title);
        String str = this.value;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        Color color = this.valueColor;
        int hashCode2 = (hashCode + (color == null ? 0 : color.hashCode())) * 31;
        String str2 = this.body;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Color color2 = this.bodyColor;
        int hashCode4 = (hashCode3 + (color2 == null ? 0 : color2.hashCode())) * 31;
        String str3 = this.valueDescriptor;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.isClickable);
        String str4 = this.id;
        return m2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArcadeTimeline2Item(state=");
        sb.append(this.state);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", valueColor=");
        sb.append(this.valueColor);
        sb.append(", body=");
        sb.append(this.body);
        sb.append(", bodyColor=");
        sb.append(this.bodyColor);
        sb.append(", valueDescriptor=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.valueDescriptor, ", isClickable=", this.isClickable, ", id=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.id, ")");
    }
}
