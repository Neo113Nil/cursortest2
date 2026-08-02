package app.cash.arcade.values;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes3.dex */
public abstract class Color {
    public static final Companion Companion = new Companion();
    public static final Lazy $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Font$$ExternalSyntheticLambda0(14));

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/Color$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/Color;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return (KSerializer) Color.$cachedSerializer$delegate.getValue();
        }
    }

    @SerialName("Id")
    @Serializable
    public final class Id extends Color {
        public static final Companion Companion = new Companion();
        public final int id;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/Color$Id$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/Color$Id;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return Color$Id$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Id(int i, int i2) {
            if (1 == (i & 1)) {
                this.id = i2;
            } else {
                TuplesKt.throwMissingFieldException(i, 1, Color$Id$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Id) && this.id == ((Id) obj).id;
        }

        public final int hashCode() {
            return Integer.hashCode(this.id);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id, "Id(id=", ")");
        }

        public Id(int i) {
            this.id = i;
        }
    }

    @SerialName("Token")
    @Serializable
    public final class Token extends Color {
        public static final Companion Companion = new Companion();
        public final String id;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/Color$Token$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/Color$Token;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return Color$Token$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Token(int i, String str) {
            if (1 == (i & 1)) {
                this.id = str;
            } else {
                TuplesKt.throwMissingFieldException(i, 1, Color$Token$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Token) && Intrinsics.areEqual(this.id, ((Token) obj).id);
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Token(id=", this.id, ")");
        }

        public Token(String str) {
            this.id = str;
        }
    }

    @SerialName("Code")
    @Serializable
    public final class Code extends Color {
        public static final Companion Companion = new Companion();
        public final ModeVariant dark;
        public final ModeVariant light;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/Color$Code$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/Color$Code;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return Color$Code$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Code(int i, ModeVariant modeVariant, ModeVariant modeVariant2) {
            if (1 != (i & 1)) {
                TuplesKt.throwMissingFieldException(i, 1, Color$Code$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.light = modeVariant;
            if ((i & 2) == 0) {
                this.dark = null;
            } else {
                this.dark = modeVariant2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Code)) {
                return false;
            }
            Code code = (Code) obj;
            return Intrinsics.areEqual(this.light, code.light) && Intrinsics.areEqual(this.dark, code.dark);
        }

        public final int hashCode() {
            int hashCode = this.light.hashCode() * 31;
            ModeVariant modeVariant = this.dark;
            return hashCode + (modeVariant == null ? 0 : modeVariant.hashCode());
        }

        public final String toString() {
            return "Code(light=" + this.light + ", dark=" + this.dark + ")";
        }

        public Code(ModeVariant modeVariant, ModeVariant modeVariant2) {
            this.light = modeVariant;
            this.dark = modeVariant2;
        }
    }

    @Serializable
    public final class ModeVariant {
        public static final Companion Companion = new Companion();
        public final String highContrastP3;
        public final String highContrastSrgb;
        public final String p3;
        public final String srgb;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/Color$ModeVariant$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/Color$ModeVariant;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return Color$ModeVariant$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ ModeVariant(String str, int i, String str2, String str3, String str4) {
            if (1 != (i & 1)) {
                TuplesKt.throwMissingFieldException(i, 1, Color$ModeVariant$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.srgb = str;
            if ((i & 2) == 0) {
                this.p3 = null;
            } else {
                this.p3 = str2;
            }
            if ((i & 4) == 0) {
                this.highContrastSrgb = null;
            } else {
                this.highContrastSrgb = str3;
            }
            if ((i & 8) == 0) {
                this.highContrastP3 = null;
            } else {
                this.highContrastP3 = str4;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ModeVariant)) {
                return false;
            }
            ModeVariant modeVariant = (ModeVariant) obj;
            return Intrinsics.areEqual(this.srgb, modeVariant.srgb) && Intrinsics.areEqual(this.p3, modeVariant.p3) && Intrinsics.areEqual(this.highContrastSrgb, modeVariant.highContrastSrgb) && Intrinsics.areEqual(this.highContrastP3, modeVariant.highContrastP3);
        }

        public final int hashCode() {
            int hashCode = this.srgb.hashCode() * 31;
            String str = this.p3;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.highContrastSrgb;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.highContrastP3;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ModeVariant(srgb=", this.srgb, ", p3=", this.p3, ", highContrastSrgb="), this.highContrastSrgb, ", highContrastP3=", this.highContrastP3, ")");
        }

        public ModeVariant(String str) {
            this.srgb = str;
            this.p3 = null;
            this.highContrastSrgb = null;
            this.highContrastP3 = null;
        }
    }
}
