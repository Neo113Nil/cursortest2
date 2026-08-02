package app.cash.redwood.protocol;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes3.dex */
public interface ChildrenChange extends Change {
    public static final Companion Companion = Companion.$$INSTANCE;

    @SerialName("add")
    @Serializable
    public final class Add implements ChildrenChange {
        public static final Companion Companion = new Companion();
        public final int _childId;
        public final int _id;
        public final int _tag;
        public final int index;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/redwood/protocol/ChildrenChange$Add$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/redwood/protocol/ChildrenChange$Add;", "serializer", "()Lkotlinx/serialization/KSerializer;", "redwood-protocol"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return ChildrenChange$Add$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Add(int i, int i2, int i3, int i4, int i5) {
            if (15 != (i & 15)) {
                TuplesKt.throwMissingFieldException(i, 15, ChildrenChange$Add$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this._id = i2;
            this._tag = i3;
            this._childId = i4;
            this.index = i5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Add)) {
                return false;
            }
            Add add = (Add) obj;
            return this._id == add._id && this._tag == add._tag && this._childId == add._childId && this.index == add.index;
        }

        @Override // app.cash.redwood.protocol.Change
        /* renamed from: getId-0HhLjSo */
        public final int mo1368getId0HhLjSo() {
            return this._id;
        }

        @Override // app.cash.redwood.protocol.ChildrenChange
        /* renamed from: getTag-b0W0yNk */
        public final int mo1369getTagb0W0yNk() {
            return this._tag;
        }

        public final int hashCode() {
            return (((((this._id * 31) + this._tag) * 31) + this._childId) * 31) + this.index;
        }

        public final String toString() {
            return Recorder$$ExternalSyntheticOutline1.m(this._childId, this.index, ", index=", ")", Recorder$$ExternalSyntheticOutline2.m107m(this._id, this._tag, "Add(_id=", ", _tag=", ", _childId="));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/redwood/protocol/ChildrenChange$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/redwood/protocol/ChildrenChange;", "serializer", "()Lkotlinx/serialization/KSerializer;", "redwood-protocol"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public final KSerializer serializer() {
            ReflectionFactory reflectionFactory = Reflection.factory;
            return new SealedClassSerializer("app.cash.redwood.protocol.ChildrenChange", reflectionFactory.getOrCreateKotlinClass(ChildrenChange.class), new KClass[]{reflectionFactory.getOrCreateKotlinClass(Add.class), reflectionFactory.getOrCreateKotlinClass(Move.class), reflectionFactory.getOrCreateKotlinClass(Remove.class)}, new KSerializer[]{ChildrenChange$Add$$serializer.INSTANCE, ChildrenChange$Move$$serializer.INSTANCE, ChildrenChange$Remove$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    @SerialName("move")
    @Serializable
    public final class Move implements ChildrenChange {
        public static final Companion Companion = new Companion();
        public final int _id;
        public final int _tag;
        public final int count;
        public final int fromIndex;
        public final int toIndex;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/redwood/protocol/ChildrenChange$Move$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/redwood/protocol/ChildrenChange$Move;", "serializer", "()Lkotlinx/serialization/KSerializer;", "redwood-protocol"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return ChildrenChange$Move$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Move(int i, int i2, int i3, int i4, int i5, int i6) {
            if (31 != (i & 31)) {
                TuplesKt.throwMissingFieldException(i, 31, ChildrenChange$Move$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this._id = i2;
            this._tag = i3;
            this.fromIndex = i4;
            this.toIndex = i5;
            this.count = i6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Move)) {
                return false;
            }
            Move move = (Move) obj;
            return this._id == move._id && this._tag == move._tag && this.fromIndex == move.fromIndex && this.toIndex == move.toIndex && this.count == move.count;
        }

        @Override // app.cash.redwood.protocol.Change
        /* renamed from: getId-0HhLjSo */
        public final int mo1368getId0HhLjSo() {
            return this._id;
        }

        @Override // app.cash.redwood.protocol.ChildrenChange
        /* renamed from: getTag-b0W0yNk */
        public final int mo1369getTagb0W0yNk() {
            return this._tag;
        }

        public final int hashCode() {
            return (((((((this._id * 31) + this._tag) * 31) + this.fromIndex) * 31) + this.toIndex) * 31) + this.count;
        }

        public final String toString() {
            StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(this._id, this._tag, "Move(_id=", ", _tag=", ", fromIndex=");
            Recorder$$ExternalSyntheticOutline1.m105m(this.fromIndex, this.toIndex, ", toIndex=", ", count=", m107m);
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.count, ")", m107m);
        }
    }

    @SerialName("remove")
    @Serializable
    public final class Remove implements ChildrenChange {
        public static final Companion Companion = new Companion();
        public final int _id;
        public final int _tag;
        public final int count;
        public final boolean detach;
        public final int index;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/redwood/protocol/ChildrenChange$Remove$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/redwood/protocol/ChildrenChange$Remove;", "serializer", "()Lkotlinx/serialization/KSerializer;", "redwood-protocol"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return ChildrenChange$Remove$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Remove(int i, int i2, int i3, boolean z, int i4, int i5) {
            if (15 != (i & 15)) {
                TuplesKt.throwMissingFieldException(i, 15, ChildrenChange$Remove$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this._id = i2;
            this._tag = i3;
            this.index = i4;
            this.count = i5;
            if ((i & 16) == 0) {
                this.detach = false;
            } else {
                this.detach = z;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Remove)) {
                return false;
            }
            Remove remove = (Remove) obj;
            return this._id == remove._id && this._tag == remove._tag && this.index == remove.index && this.count == remove.count && this.detach == remove.detach;
        }

        @Override // app.cash.redwood.protocol.Change
        /* renamed from: getId-0HhLjSo */
        public final int mo1368getId0HhLjSo() {
            return this._id;
        }

        @Override // app.cash.redwood.protocol.ChildrenChange
        /* renamed from: getTag-b0W0yNk */
        public final int mo1369getTagb0W0yNk() {
            return this._tag;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.detach) + (((((((this._id * 31) + this._tag) * 31) + this.index) * 31) + this.count) * 31);
        }

        public final String toString() {
            StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(this._id, this._tag, "Remove(_id=", ", _tag=", ", index=");
            Recorder$$ExternalSyntheticOutline1.m105m(this.index, this.count, ", count=", ", detach=", m107m);
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m107m, this.detach, ")");
        }
    }

    /* renamed from: getTag-b0W0yNk, reason: not valid java name */
    int mo1369getTagb0W0yNk();
}
