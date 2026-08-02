package androidx.room.util;

import androidx.room.RoomDatabase;
import androidx.room.TransactorKt$$ExternalSyntheticLambda0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class DBUtil__DBUtil_androidKt$performSuspending$1 extends ContinuationImpl {
    public RoomDatabase L$0;
    public TransactorKt$$ExternalSyntheticLambda0 L$1;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return DBUtil.performSuspending(null, false, null, this);
    }
}
