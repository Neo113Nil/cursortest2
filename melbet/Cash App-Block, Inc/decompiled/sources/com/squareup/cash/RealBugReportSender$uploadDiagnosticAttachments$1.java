package com.squareup.cash;

import com.squareup.cash.bugreporting.viewmodels.BugReport;
import com.squareup.cash.bugreporting.viewmodels.DiagnosticContext;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.CreateBugReportResponse;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class RealBugReportSender$uploadDiagnosticAttachments$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public CreateBugReportResponse L$0;
    public BugReport L$1;
    public DiagnosticContext L$2;
    public List L$3;
    public Iterator L$7;
    public File L$9;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealBugReportSender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBugReportSender$uploadDiagnosticAttachments$1(RealBugReportSender realBugReportSender, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realBugReportSender;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealBugReportSender.access$uploadDiagnosticAttachments(this.this$0, null, null, null, null, this);
    }
}
