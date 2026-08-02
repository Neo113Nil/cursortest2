package androidx.compose.ui.platform;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.Owner;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public abstract class PlatformTextInputModifierNodeKt {
    public static final StaticProvidableCompositionLocal LocalChainedPlatformTextInputInterceptor = new StaticProvidableCompositionLocal(InspectionModeKt$LocalInspectionMode$1.INSTANCE$1);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void establishTextInputSession(PlatformTextInputModifierNode platformTextInputModifierNode, Function2 function2, ContinuationImpl continuationImpl) {
        PlatformTextInputModifierNodeKt$establishTextInputSession$1 platformTextInputModifierNodeKt$establishTextInputSession$1;
        int i;
        if (continuationImpl instanceof PlatformTextInputModifierNodeKt$establishTextInputSession$1) {
            platformTextInputModifierNodeKt$establishTextInputSession$1 = (PlatformTextInputModifierNodeKt$establishTextInputSession$1) continuationImpl;
            int i2 = platformTextInputModifierNodeKt$establishTextInputSession$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                platformTextInputModifierNodeKt$establishTextInputSession$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = platformTextInputModifierNodeKt$establishTextInputSession$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = platformTextInputModifierNodeKt$establishTextInputSession$1.label;
                if (i == 0) {
                    if (i == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return;
                }
                SafeTrace.throwOnFailure(obj);
                if (!((Modifier.Node) platformTextInputModifierNode).getNode().isAttached()) {
                    a$$ExternalSyntheticBUOutline0.m$3("establishTextInputSession called from an unattached node");
                    return;
                }
                Owner requireOwner = DepthSortedSetKt.requireOwner(platformTextInputModifierNode);
                PersistentCompositionLocalHashMap persistentCompositionLocalHashMap = (PersistentCompositionLocalHashMap) DepthSortedSetKt.requireLayoutNode(platformTextInputModifierNode).compositionLocalMap;
                persistentCompositionLocalHashMap.getClass();
                if (Updater.read(persistentCompositionLocalHashMap, LocalChainedPlatformTextInputInterceptor) != null) {
                    a$$ExternalSyntheticBUOutline0.m$1();
                    return;
                } else {
                    platformTextInputModifierNodeKt$establishTextInputSession$1.label = 1;
                    interceptedTextInputSession(requireOwner, function2, platformTextInputModifierNodeKt$establishTextInputSession$1);
                    return;
                }
            }
        }
        platformTextInputModifierNodeKt$establishTextInputSession$1 = new PlatformTextInputModifierNodeKt$establishTextInputSession$1(continuationImpl);
        Object obj2 = platformTextInputModifierNodeKt$establishTextInputSession$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = platformTextInputModifierNodeKt$establishTextInputSession$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void interceptedTextInputSession(Owner owner, Function2 function2, ContinuationImpl continuationImpl) {
        PlatformTextInputModifierNodeKt$interceptedTextInputSession$1 platformTextInputModifierNodeKt$interceptedTextInputSession$1;
        int i;
        if (continuationImpl instanceof PlatformTextInputModifierNodeKt$interceptedTextInputSession$1) {
            platformTextInputModifierNodeKt$interceptedTextInputSession$1 = (PlatformTextInputModifierNodeKt$interceptedTextInputSession$1) continuationImpl;
            int i2 = platformTextInputModifierNodeKt$interceptedTextInputSession$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                platformTextInputModifierNodeKt$interceptedTextInputSession$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = platformTextInputModifierNodeKt$interceptedTextInputSession$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = platformTextInputModifierNodeKt$interceptedTextInputSession$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    platformTextInputModifierNodeKt$interceptedTextInputSession$1.label = 1;
                    ((AndroidComposeView) owner).textInputSession(function2, platformTextInputModifierNodeKt$interceptedTextInputSession$1);
                    return;
                } else {
                    if (i == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    if (i == 2) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return;
                }
            }
        }
        platformTextInputModifierNodeKt$interceptedTextInputSession$1 = new PlatformTextInputModifierNodeKt$interceptedTextInputSession$1(continuationImpl);
        Object obj2 = platformTextInputModifierNodeKt$interceptedTextInputSession$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = platformTextInputModifierNodeKt$interceptedTextInputSession$1.label;
        if (i != 0) {
        }
    }
}
