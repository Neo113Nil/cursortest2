package com.squareup.cash.collapsingtoolbar.views;

import com.squareup.cash.sheet.RealSheetState;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class ExitUntilCollapsedNestedScrollConnection$onPostFling$1 extends ContinuationImpl {
    public long J$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealSheetState.SheetNestedScrollConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExitUntilCollapsedNestedScrollConnection$onPostFling$1(RealSheetState.SheetNestedScrollConnection sheetNestedScrollConnection, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = sheetNestedScrollConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.mo241onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
