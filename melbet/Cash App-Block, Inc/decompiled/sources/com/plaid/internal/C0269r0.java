package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* renamed from: com.plaid.internal.r0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0269r0 implements L4 {
    public final InterfaceC0331y<String, Pane$PaneRendering> a;
    public final C4 b;

    public C0269r0(WorkflowDatabase workflowDatabase) {
        C0093a4 c0093a4 = new C0093a4();
        workflowDatabase.getClass();
        this.a = c0093a4;
        this.b = workflowDatabase.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.plaid.internal.InterfaceC0338y6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(r8 r8Var, ContinuationImpl continuationImpl) {
        C0261q0 c0261q0;
        int i;
        Pane$PaneRendering pane$PaneRendering;
        I4 i4;
        byte[] bArr;
        if (continuationImpl instanceof C0261q0) {
            c0261q0 = (C0261q0) continuationImpl;
            int i2 = c0261q0.e;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                c0261q0.e = i2 - PKIFailureInfo.systemUnavail;
                Object obj = c0261q0.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c0261q0.e;
                pane$PaneRendering = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Pane$PaneRendering pane$PaneRendering2 = (Pane$PaneRendering) this.a.a((String) r8Var.d.getValue());
                    if (pane$PaneRendering2 != null) {
                        pane$PaneRendering = pane$PaneRendering2;
                        if (pane$PaneRendering != null) {
                            this.a.a((String) r8Var.d.getValue(), pane$PaneRendering);
                        }
                        return pane$PaneRendering;
                    }
                    C4 c4 = this.b;
                    String str = r8Var.a;
                    String str2 = r8Var.b;
                    c0261q0.a = this;
                    c0261q0.b = r8Var;
                    c0261q0.e = 1;
                    obj = c4.a(str, str2, c0261q0);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r8Var = c0261q0.b;
                    this = c0261q0.a;
                    SafeTrace.throwOnFailure(obj);
                }
                i4 = (I4) obj;
                if (i4 != null && (bArr = i4.c) != null) {
                    pane$PaneRendering = Pane$PaneRendering.parseFrom(bArr);
                }
                if (pane$PaneRendering != null) {
                }
                return pane$PaneRendering;
            }
        }
        c0261q0 = new C0261q0(this, continuationImpl);
        Object obj2 = c0261q0.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = c0261q0.e;
        pane$PaneRendering = null;
        if (i != 0) {
        }
        i4 = (I4) obj2;
        if (i4 != null) {
            pane$PaneRendering = Pane$PaneRendering.parseFrom(bArr);
        }
        if (pane$PaneRendering != null) {
        }
        return pane$PaneRendering;
    }

    @Override // com.plaid.internal.L4
    public final Object a(r8 r8Var, Pane$PaneRendering pane$PaneRendering, S2 s2) {
        this.a.a((String) r8Var.d.getValue(), pane$PaneRendering);
        C4 c4 = this.b;
        String str = r8Var.a;
        String str2 = r8Var.b;
        byte[] byteArray = pane$PaneRendering.toByteArray();
        byteArray.getClass();
        Object a = c4.a(str, str2, byteArray, s2);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : Unit.INSTANCE;
    }
}
