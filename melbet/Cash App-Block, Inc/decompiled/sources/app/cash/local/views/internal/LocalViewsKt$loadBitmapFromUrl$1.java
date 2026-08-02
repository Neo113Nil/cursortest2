package app.cash.local.views.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class LocalViewsKt$loadBitmapFromUrl$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return LocalViewsKt.loadBitmapFromUrl(null, null, null, 0, 0, this);
    }
}
