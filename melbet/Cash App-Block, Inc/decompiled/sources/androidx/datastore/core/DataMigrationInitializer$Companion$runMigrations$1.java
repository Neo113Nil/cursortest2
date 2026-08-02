package androidx.datastore.core;

import androidx.room.TransactorKt;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class DataMigrationInitializer$Companion$runMigrations$1 extends ContinuationImpl {
    public Serializable L$0;
    public Iterator L$1;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return TransactorKt.access$runMigrations(null, null, this);
    }
}
