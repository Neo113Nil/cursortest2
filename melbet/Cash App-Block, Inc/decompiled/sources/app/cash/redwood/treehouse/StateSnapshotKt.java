package app.cash.redwood.treehouse;

import coil3.svg.SvgDecoder$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.modules.SerialModuleImpl;
import kotlinx.serialization.modules.SerializersModuleBuilder;

/* loaded from: classes.dex */
public abstract class StateSnapshotKt {
    public static final SerialModuleImpl SaveableStateSerializersModule;

    static {
        SerializersModuleBuilder serializersModuleBuilder = new SerializersModuleBuilder();
        ReflectionFactory reflectionFactory = Reflection.factory;
        KClass orCreateKotlinClass = reflectionFactory.getOrCreateKotlinClass(Object.class);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(reflectionFactory.getOrCreateKotlinClass(Boolean.TYPE), BooleanSerializer.INSTANCE));
        arrayList.add(new Pair(reflectionFactory.getOrCreateKotlinClass(Double.TYPE), DoubleSerializer.INSTANCE));
        arrayList.add(new Pair(reflectionFactory.getOrCreateKotlinClass(Float.TYPE), FloatSerializer.INSTANCE));
        arrayList.add(new Pair(reflectionFactory.getOrCreateKotlinClass(Integer.TYPE), IntSerializer.INSTANCE));
        arrayList.add(new Pair(reflectionFactory.getOrCreateKotlinClass(String.class), StringSerializer.INSTANCE));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            KClass kClass = (KClass) pair.first;
            KSerializer kSerializer = (KSerializer) pair.second;
            kClass.getClass();
            kSerializer.getClass();
            SerializersModuleBuilder.registerPolymorphicSerializer$default(serializersModuleBuilder, orCreateKotlinClass, kClass, kSerializer);
        }
        ReflectionFactory reflectionFactory2 = Reflection.factory;
        serializersModuleBuilder.polymorphicDefaultSerializer(reflectionFactory2.getOrCreateKotlinClass(Object.class), new SvgDecoder$$ExternalSyntheticLambda0(2));
        serializersModuleBuilder.polymorphicDefaultDeserializer(reflectionFactory2.getOrCreateKotlinClass(Object.class), new SvgDecoder$$ExternalSyntheticLambda0(3));
        SaveableStateSerializersModule = serializersModuleBuilder.build();
    }
}
