package androidx.room.driver;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class SupportSQLitePooledConnection$transaction$1 extends ContinuationImpl {
    public SupportSQLitePooledConnection L$0;
    public SupportSQLiteDatabase L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SupportSQLitePooledConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportSQLitePooledConnection$transaction$1(SupportSQLitePooledConnection supportSQLitePooledConnection, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = supportSQLitePooledConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.transaction$2(null, null, this);
    }
}
