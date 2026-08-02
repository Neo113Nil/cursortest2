package com.google.maps.android.compose;

import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.room.Room;
import com.squareup.cash.instruments.utils.CardBrandGuesser$Brand;
import com.squareup.cash.instruments.utils.InstrumentsKt$WhenMappings;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.util.coroutines.StateFlowKt$$ExternalSyntheticLambda3;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;
import kotlin.reflect.jvm.KCallablesJvm;
import kotlin.reflect.jvm.internal.DescriptorKProperty;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.ReflectKParameter;
import kotlin.reflect.jvm.internal.ReflectKProperty;
import kotlin.reflect.jvm.internal.UtilKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public abstract class InputHandlerKt {
    public static final void InputHandler(Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Composer composer, int i) {
        Object stateFlowKt$$ExternalSyntheticLambda3;
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-510120299);
        int i2 = i | 3510 | (gapComposer.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changedInstance(function12) ? 131072 : 65536) | 1572864 | (gapComposer.changedInstance(function13) ? 8388608 : 4194304) | (gapComposer.changedInstance(function14) ? 67108864 : 33554432) | (gapComposer.changedInstance(function15) ? PKIFailureInfo.duplicateCertReq : 268435456);
        char c = gapComposer.changedInstance(function16) ? (char) 4 : (char) 2;
        if (gapComposer.shouldExecute(i2 & 1, ((i2 & 306783379) == 306783378 && (c & 3) == 2) ? false : true)) {
            boolean z2 = ((i2 & 1879048192) == 536870912) | ((57344 & i2) == 16384) | ((458752 & i2) == 131072) | ((29360128 & i2) == 8388608) | ((234881024 & i2) == 67108864) | ((c & 14) == 4);
            Object rememberedValue = gapComposer.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                z = true;
                stateFlowKt$$ExternalSyntheticLambda3 = new StateFlowKt$$ExternalSyntheticLambda3(function1, function12, function13, function14, function15, function16, 2);
                gapComposer.updateRememberedValue(stateFlowKt$$ExternalSyntheticLambda3);
            } else {
                stateFlowKt$$ExternalSyntheticLambda3 = rememberedValue;
                z = true;
            }
            Function0 function0 = (Function0) stateFlowKt$$ExternalSyntheticLambda3;
            if (!(gapComposer.applier instanceof MapApplier)) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
            } else {
                gapComposer.useNode();
            }
            Updater.m577updateimpl(gapComposer, null, new MarkerKt$$ExternalSyntheticLambda10(23));
            Updater.m577updateimpl(gapComposer, null, new MarkerKt$$ExternalSyntheticLambda10(24));
            Updater.m577updateimpl(gapComposer, null, new MarkerKt$$ExternalSyntheticLambda10(25));
            Updater.m577updateimpl(gapComposer, null, new MarkerKt$$ExternalSyntheticLambda10(26));
            Updater.m577updateimpl(gapComposer, function1, new MarkerKt$$ExternalSyntheticLambda10(27));
            Updater.m577updateimpl(gapComposer, function12, new MarkerKt$$ExternalSyntheticLambda10(28));
            Updater.m577updateimpl(gapComposer, null, new MarkerKt$$ExternalSyntheticLambda10(18));
            Updater.m577updateimpl(gapComposer, function13, new MarkerKt$$ExternalSyntheticLambda10(19));
            Updater.m577updateimpl(gapComposer, function14, new MarkerKt$$ExternalSyntheticLambda10(20));
            Updater.m577updateimpl(gapComposer, function15, new MarkerKt$$ExternalSyntheticLambda10(21));
            Updater.m577updateimpl(gapComposer, function16, new MarkerKt$$ExternalSyntheticLambda10(22));
            gapComposer.end(z);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SwipeToDismissKt$$ExternalSyntheticLambda3(function1, function12, function13, function14, function15, function16, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object getDelegateImpl(ReflectKProperty reflectKProperty, Member member) {
        try {
            DescriptorKProperty.Companion.getClass();
            Object obj = DescriptorKProperty.EXTENSION_PROPERTY_DELEGATE;
            if (obj == null || obj == null) {
                List parameters = reflectKProperty.getParameters();
                if (!(parameters instanceof Collection) || !parameters.isEmpty()) {
                    Iterator it = parameters.iterator();
                    while (it.hasNext()) {
                        if (((ReflectKParameter) it.next()).getKind() == KParameter$Kind.EXTENSION_RECEIVER) {
                        }
                    }
                }
                throw new RuntimeException('\'' + reflectKProperty + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object boundReceiver = Room.isBound(reflectKProperty) ? Room.getBoundReceiver(reflectKProperty) : null;
            DescriptorKProperty.Companion.getClass();
            if (boundReceiver == DescriptorKProperty.EXTENSION_PROPERTY_DELEGATE) {
                boundReceiver = null;
            }
            Room.isBound(reflectKProperty);
            AccessibleObject accessibleObject = member != 0 ? (AccessibleObject) member : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(KCallablesJvm.isAccessible(reflectKProperty));
            }
            if (member == 0) {
                return null;
            }
            if (member instanceof Field) {
                return ((Field) member).get(boundReceiver);
            }
            if (!(member instanceof Method)) {
                throw new AssertionError("delegate field/method " + member + " neither field nor method");
            }
            int length = ((Method) member).getParameterTypes().length;
            if (length == 0) {
                return ((Method) member).invoke(null, null);
            }
            if (length == 1) {
                Method method = (Method) member;
                if (boundReceiver == null) {
                    Class<?> cls = ((Method) member).getParameterTypes()[0];
                    cls.getClass();
                    boundReceiver = UtilKt.defaultPrimitiveValue(cls);
                }
                return method.invoke(null, boundReceiver);
            }
            if (length == 2) {
                Method method2 = (Method) member;
                Class<?> cls2 = ((Method) member).getParameterTypes()[1];
                cls2.getClass();
                return method2.invoke(null, boundReceiver, UtilKt.defaultPrimitiveValue(cls2));
            }
            throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
        } catch (IllegalAccessException e) {
            throw new IllegalPropertyDelegateAccessException("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", e);
        }
    }

    public static final boolean isLocalDelegated(ReflectKProperty reflectKProperty) {
        reflectKProperty.getClass();
        return KDeclarationContainerImpl.LOCAL_PROPERTY_SIGNATURE.matches(reflectKProperty.getSignature());
    }

    public static final CardBrandGuesser$Brand toBrand(InstrumentType instrumentType) {
        switch (instrumentType == null ? -1 : InstrumentsKt$WhenMappings.$EnumSwitchMapping$0[instrumentType.ordinal()]) {
            case -1:
            case 7:
                return CardBrandGuesser$Brand.BALANCE;
            case 0:
            default:
                return CardBrandGuesser$Brand.UNKNOWN;
            case 1:
                return CardBrandGuesser$Brand.AMERICAN_EXPRESS;
            case 2:
                return CardBrandGuesser$Brand.DISCOVER;
            case 3:
                return CardBrandGuesser$Brand.DISCOVER_DINERS;
            case 4:
                return CardBrandGuesser$Brand.JCB;
            case 5:
                return CardBrandGuesser$Brand.MASTER_CARD;
            case 6:
                return CardBrandGuesser$Brand.VISA;
        }
    }
}
