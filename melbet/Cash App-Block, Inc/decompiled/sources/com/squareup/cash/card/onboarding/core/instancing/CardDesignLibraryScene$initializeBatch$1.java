package com.squareup.cash.card.onboarding.core.instancing;

import com.squareup.cash.graphics.swampgl.components.MeshGeometry;
import com.squareup.cash.wallet.data.TagFormFactor;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class CardDesignLibraryScene$initializeBatch$1 extends ContinuationImpl {
    public GridConfig L$1;
    public InstancedCardBatch L$2;
    public Iterator L$3;
    public TagFormFactor L$4;
    public MeshGeometry L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CardDesignLibraryScene this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDesignLibraryScene$initializeBatch$1(CardDesignLibraryScene cardDesignLibraryScene, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cardDesignLibraryScene;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return CardDesignLibraryScene.access$initializeBatch(this.this$0, null, this);
    }
}
