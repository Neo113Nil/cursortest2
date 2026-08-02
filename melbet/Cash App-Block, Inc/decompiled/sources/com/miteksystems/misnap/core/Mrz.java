package com.miteksystems.misnap.core;

import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u0082\u0001\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/miteksystems/misnap/core/Mrz;", "", "Companion", "Lcom/miteksystems/misnap/core/Mrz1Line;", "Lcom/miteksystems/misnap/core/MrzData;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public abstract class Mrz {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy a = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.a);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/miteksystems/misnap/core/Mrz$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/Mrz;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer serializer() {
            return (KSerializer) Mrz.a.getValue();
        }
    }

    public final class a extends Lambda implements Function0 {
        public static final a a = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ReflectionFactory reflectionFactory = Reflection.factory;
            return new SealedClassSerializer("com.miteksystems.misnap.core.Mrz", reflectionFactory.getOrCreateKotlinClass(Mrz.class), new KClass[]{reflectionFactory.getOrCreateKotlinClass(Mrz1Line.class), reflectionFactory.getOrCreateKotlinClass(MrzData.class)}, new KSerializer[]{Mrz1Line$$serializer.INSTANCE, MrzData$$serializer.INSTANCE}, new Annotation[0]);
        }
    }
}
