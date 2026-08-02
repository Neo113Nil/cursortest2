package app.cash.arcade.values;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumSerializer;

@Serializable
/* loaded from: classes3.dex */
public interface TitleBarAction {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/TitleBarAction$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/TitleBarAction;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public final KSerializer serializer() {
            ReflectionFactory reflectionFactory = Reflection.factory;
            return new SealedClassSerializer("app.cash.arcade.values.TitleBarAction", reflectionFactory.getOrCreateKotlinClass(TitleBarAction.class), new KClass[]{reflectionFactory.getOrCreateKotlinClass(AvatarAction.class), reflectionFactory.getOrCreateKotlinClass(IconAction.class)}, new KSerializer[]{new EnumSerializer("AvatarAction", AvatarAction.INSTANCE, new Annotation[0]), IconAction$$serializer.INSTANCE}, new Annotation[0]);
        }
    }
}
