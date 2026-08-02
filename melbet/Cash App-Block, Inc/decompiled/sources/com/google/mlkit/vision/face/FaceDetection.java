package com.google.mlkit.vision.face;

import androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.face.internal.FaceDetectorImpl;
import com.google.mlkit.vision.face.internal.zzc;
import com.google.mlkit.vision.face.internal.zzh;
import com.squareup.cash.util.clock.AndroidClock;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.SystemPropertiesKt;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.types.AbstractKType;
import kotlin.reflect.jvm.internal.types.DescriptorKType;
import kotlin.reflect.jvm.internal.types.FlexibleKType;
import kotlin.reflect.jvm.internal.types.MutableCollectionKClassKt;
import kotlin.reflect.jvm.internal.types.SimpleKType;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public abstract class FaceDetection {
    public static final AbstractKType createMutableCollectionKType(KType kType) {
        String qualifiedName;
        kType.getClass();
        if (!SystemPropertiesKt.useK1Implementation) {
            SimpleKType simpleKType = (SimpleKType) kType;
            KClassifier kClassifier = simpleKType.classifier;
            KClass kClass = kClassifier instanceof KClass ? (KClass) kClassifier : null;
            if (kClass == null || (qualifiedName = kClass.getQualifiedName()) == null) {
                f$$ExternalSyntheticLambda0.m$1(kType, "Non-class type cannot be a mutable collection type: ");
                return null;
            }
            FqName readOnlyToMutable = JavaToKotlinClassMap.INSTANCE.readOnlyToMutable(new FqNameUnsafe(qualifiedName));
            if (readOnlyToMutable != null) {
                return new SimpleKType(simpleKType.classifier, simpleKType.arguments, simpleKType.isMarkedNullable, simpleKType.annotations, simpleKType.abbreviation, simpleKType.isDefinitelyNotNullType, simpleKType.isNothingType, simpleKType.isSuspendFunctionType, MutableCollectionKClassKt.getMutableCollectionKClass((KClass) kClassifier, readOnlyToMutable), null);
            }
            OptionalProvider$$ExternalSyntheticLambda0.m((Object) kType, "Not a readonly collection: ");
            return null;
        }
        KotlinType kotlinType = ((DescriptorKType) kType).f1540type;
        if (!(kotlinType instanceof SimpleType)) {
            Path$$ExternalSyntheticBUOutline0.m$3(kType, "Non-simple type cannot be a mutable collection type: ");
            return null;
        }
        ClassifierDescriptor mo4153getDeclarationDescriptor = kotlinType.getConstructor().mo4153getDeclarationDescriptor();
        ClassDescriptor classDescriptor = mo4153getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) mo4153getDeclarationDescriptor : null;
        if (classDescriptor == null) {
            OptionalProvider$$ExternalSyntheticLambda0.m((Object) kType, "Non-class type cannot be a mutable collection type: ");
            return null;
        }
        SimpleType simpleType = (SimpleType) kotlinType;
        FqName readOnlyToMutable2 = JavaToKotlinClassMap.INSTANCE.readOnlyToMutable(DescriptorUtilsKt.getFqNameUnsafe(classDescriptor));
        if (readOnlyToMutable2 == null) {
            OptionalProvider$$ExternalSyntheticLambda0.m((Object) classDescriptor, "Not a readonly collection: ");
            return null;
        }
        ClassDescriptor builtInClassByFqName = DescriptorUtilsKt.getBuiltIns(classDescriptor).getBuiltInClassByFqName(readOnlyToMutable2);
        builtInClassByFqName.getClass();
        TypeConstructor typeConstructor = builtInClassByFqName.getTypeConstructor();
        typeConstructor.getClass();
        return new DescriptorKType(KotlinTypeFactory.simpleType$default(simpleType, (TypeAttributes) null, typeConstructor, (List) null, false, 26, (Object) null), null);
    }

    public static final AbstractKType createPlatformKType(KType kType, KType kType2) {
        if (!SystemPropertiesKt.useK1Implementation) {
            AbstractKType abstractKType = (AbstractKType) kType;
            AbstractKType abstractKType2 = (AbstractKType) kType2;
            return abstractKType.equals(abstractKType2) ? abstractKType : new FlexibleKType(abstractKType, abstractKType2, false, null);
        }
        KotlinType kotlinType = ((DescriptorKType) kType).f1540type;
        kotlinType.getClass();
        KotlinType kotlinType2 = ((DescriptorKType) kType2).f1540type;
        kotlinType2.getClass();
        return new DescriptorKType(KotlinTypeFactory.flexibleType((SimpleType) kotlinType, (SimpleType) kotlinType2), null);
    }

    public static FaceDetectorImpl getClient(FaceDetectorOptions faceDetectorOptions) {
        zzc zzcVar = (zzc) MlKitContext.getInstance().get(zzc.class);
        zzcVar.getClass();
        return new FaceDetectorImpl((zzh) zzcVar.zza.get(faceDetectorOptions), zzcVar.zzb, faceDetectorOptions);
    }

    /* renamed from: timerForAge-Wn2Vu4Y, reason: not valid java name */
    public static final ChannelFlowTransformLatest m2065timerForAgeWn2Vu4Y(Flow flow, AndroidClock androidClock, CoroutineContext coroutineContext, long j) {
        flow.getClass();
        return FlowKt.transformLatest(flow, new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1((Continuation) null, j, androidClock, coroutineContext));
    }
}
