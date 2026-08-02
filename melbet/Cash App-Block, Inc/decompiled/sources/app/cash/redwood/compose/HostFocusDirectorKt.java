package app.cash.redwood.compose;

import app.cash.redwood.widget.Widget;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.sequences.SequenceScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public abstract class HostFocusDirectorKt {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$yieldDepthFirst(SequenceScope sequenceScope, List list, BaseContinuationImpl baseContinuationImpl) {
        HostFocusDirectorKt$yieldDepthFirst$1 hostFocusDirectorKt$yieldDepthFirst$1;
        int i;
        SequenceScope sequenceScope2;
        Iterator it;
        if (baseContinuationImpl instanceof HostFocusDirectorKt$yieldDepthFirst$1) {
            hostFocusDirectorKt$yieldDepthFirst$1 = (HostFocusDirectorKt$yieldDepthFirst$1) baseContinuationImpl;
            int i2 = hostFocusDirectorKt$yieldDepthFirst$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                hostFocusDirectorKt$yieldDepthFirst$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = hostFocusDirectorKt$yieldDepthFirst$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = hostFocusDirectorKt$yieldDepthFirst$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Iterator it2 = list.iterator();
                    sequenceScope2 = sequenceScope;
                    it = it2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = hostFocusDirectorKt$yieldDepthFirst$1.L$2;
                    sequenceScope2 = hostFocusDirectorKt$yieldDepthFirst$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                if (it.hasNext()) {
                    return Unit.INSTANCE;
                }
                Widget widget = (Widget) it.next();
                hostFocusDirectorKt$yieldDepthFirst$1.L$0 = sequenceScope2;
                hostFocusDirectorKt$yieldDepthFirst$1.L$2 = it;
                hostFocusDirectorKt$yieldDepthFirst$1.label = 1;
                sequenceScope2.yield(widget, hostFocusDirectorKt$yieldDepthFirst$1);
                return coroutineSingletons;
            }
        }
        hostFocusDirectorKt$yieldDepthFirst$1 = new HostFocusDirectorKt$yieldDepthFirst$1(baseContinuationImpl);
        Object obj2 = hostFocusDirectorKt$yieldDepthFirst$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = hostFocusDirectorKt$yieldDepthFirst$1.label;
        if (i != 0) {
        }
        if (it.hasNext()) {
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewDocumentStockMonthlyStatementList.deepLinkSpecs;
    }
}
