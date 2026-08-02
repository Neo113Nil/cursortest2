package app.cash.redwood.protocol;

import app.cash.redwood.protocol.ChildrenChange;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public interface Change {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/redwood/protocol/Change$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/redwood/protocol/Change;", "serializer", "()Lkotlinx/serialization/KSerializer;", "redwood-protocol"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public final KSerializer serializer() {
            ReflectionFactory reflectionFactory = Reflection.factory;
            return new SealedClassSerializer("app.cash.redwood.protocol.Change", reflectionFactory.getOrCreateKotlinClass(Change.class), new KClass[]{reflectionFactory.getOrCreateKotlinClass(ChildrenChange.Add.class), reflectionFactory.getOrCreateKotlinClass(ChildrenChange.Move.class), reflectionFactory.getOrCreateKotlinClass(ChildrenChange.Remove.class), reflectionFactory.getOrCreateKotlinClass(Create.class), reflectionFactory.getOrCreateKotlinClass(ModifierChange.class), reflectionFactory.getOrCreateKotlinClass(PropertyChange.class)}, new KSerializer[]{ChildrenChange$Add$$serializer.INSTANCE, ChildrenChange$Move$$serializer.INSTANCE, ChildrenChange$Remove$$serializer.INSTANCE, Create$$serializer.INSTANCE, ModifierChange$$serializer.INSTANCE, PropertyChange$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    /* renamed from: getId-0HhLjSo, reason: not valid java name */
    int mo1368getId0HhLjSo();
}
