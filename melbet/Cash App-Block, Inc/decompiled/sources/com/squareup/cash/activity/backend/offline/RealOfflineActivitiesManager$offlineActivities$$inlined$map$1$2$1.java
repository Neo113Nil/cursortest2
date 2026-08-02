package com.squareup.cash.activity.backend.offline;

import androidx.compose.material3.ThumbNode$onAttach$1;
import com.squareup.cash.data.js.ZiplineHistoryDataJavaScripter;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class RealOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public int I$4;
    public Collection L$10;
    public Iterator L$12;
    public FlowCollector L$4;
    public List L$6;
    public ZiplineHistoryDataJavaScripter L$7;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ThumbNode$onAttach$1.AnonymousClass1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealOfflineActivitiesManager$offlineActivities$$inlined$map$1$2$1(ThumbNode$onAttach$1.AnonymousClass1 anonymousClass1, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit((Object) null, this);
    }
}
