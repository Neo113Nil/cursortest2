package app.cash.arcade.values;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable(with = TextStyleSerializer.class)
/* loaded from: classes3.dex */
public abstract class TextStyle {
    public static final Companion Companion = new Companion();

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/TextStyle$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/TextStyle;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return TextStyleSerializer.INSTANCE;
        }
    }

    @SerialName("Id")
    @Serializable
    public final class Id extends TextStyle {
        public static final Companion Companion = new Companion();
        public final int id;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/TextStyle$Id$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/TextStyle$Id;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return TextStyle$Id$$serializer.INSTANCE;
            }
        }

        public Id(int i, int i2) {
            if (1 == (i & 1)) {
                this.id = i2;
            } else {
                TuplesKt.throwMissingFieldException(i, 1, TextStyle$Id$$serializer.INSTANCE.getDescriptor());
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
    public final class Token extends TextStyle {
        public static final Companion Companion = new Companion();
        public final String id;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/TextStyle$Token$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/TextStyle$Token;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return TextStyle$Token$$serializer.INSTANCE;
            }
        }

        public Token(int i, String str) {
            if (1 == (i & 1)) {
                this.id = str;
            } else {
                TuplesKt.throwMissingFieldException(i, 1, TextStyle$Token$$serializer.INSTANCE.getDescriptor());
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
}
