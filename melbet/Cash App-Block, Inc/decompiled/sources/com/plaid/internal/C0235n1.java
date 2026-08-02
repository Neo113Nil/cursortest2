package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.C0095a6;
import com.plaid.internal.C0217l1;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* renamed from: com.plaid.internal.n1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0235n1<T> implements FlowCollector {
    public final /* synthetic */ C0217l1 a;

    @DebugMetadata(c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthViewModel$doOnStart$2", f = "HeadlessOAuthViewModel.kt", l = {68, 69, 70}, m = "emit")
    /* renamed from: com.plaid.internal.n1$a */
    public static final class a extends ContinuationImpl {
        public C0235n1 a;
        public /* synthetic */ Object b;
        public final /* synthetic */ C0235n1<T> c;
        public int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C0235n1<? super T> c0235n1, Continuation<? super a> continuation) {
            super(continuation);
            this.c = c0235n1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= PKIFailureInfo.systemUnavail;
            return this.c.emit(null, this);
        }
    }

    public C0235n1(C0217l1 c0217l1) {
        this.a = c0217l1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (com.plaid.internal.C0217l1.a(r7, r8, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        if (com.plaid.internal.C0217l1.b(r7, r8, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004b, code lost:
    
        if (r9 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Pane$PaneRendering pane$PaneRendering, Continuation<? super Unit> continuation) {
        a aVar;
        int i;
        C0217l1.b bVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.d;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.d = i2 - PKIFailureInfo.systemUnavail;
                Object obj = aVar.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.d;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    C0217l1 c0217l1 = this.a;
                    aVar.a = this;
                    aVar.d = 1;
                    obj = C0217l1.a(c0217l1, pane$PaneRendering, aVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = aVar.a;
                    SafeTrace.throwOnFailure(obj);
                }
                bVar = (C0217l1.b) obj;
                if (!(bVar instanceof C0217l1.b.C0054b)) {
                    C0217l1 c0217l12 = this.a;
                    String str = ((C0217l1.b.C0054b) bVar).a;
                    aVar.a = null;
                    aVar.d = 2;
                } else {
                    if (!(bVar instanceof C0217l1.b.a)) {
                        if (bVar instanceof C0217l1.b.c) {
                            C0217l1 c0217l13 = this.a;
                            String str2 = ((C0217l1.b.c) bVar).a;
                            c0217l13.getClass();
                            C0095a6.a.getClass();
                            C0095a6.a.a("Submit redirect URI", true);
                            str2.getClass();
                            HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.b a2 = HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.newBuilder().a(HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.SubmitAction.newBuilder().b(str2));
                            a2.getClass();
                            C0217l1.a(c0217l13, a2);
                        }
                        return Unit.INSTANCE;
                    }
                    C0217l1 c0217l14 = this.a;
                    String str3 = ((C0217l1.b.a) bVar).a;
                    aVar.a = null;
                    aVar.d = 3;
                }
                return coroutineSingletons;
            }
        }
        aVar = new a(this, continuation);
        Object obj2 = aVar.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.d;
        if (i != 0) {
        }
        bVar = (C0217l1.b) obj2;
        if (!(bVar instanceof C0217l1.b.C0054b)) {
        }
        return coroutineSingletons2;
    }
}
