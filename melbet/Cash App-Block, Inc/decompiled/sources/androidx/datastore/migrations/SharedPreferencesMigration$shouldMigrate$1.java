package androidx.datastore.migrations;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class SharedPreferencesMigration$shouldMigrate$1 extends ContinuationImpl {
    public SharedPreferencesMigration L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SharedPreferencesMigration this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration$shouldMigrate$1(SharedPreferencesMigration sharedPreferencesMigration, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = sharedPreferencesMigration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.shouldMigrate(null, this);
    }
}
