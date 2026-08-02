package com.squareup.cash.shopping.presenters;

import androidx.emoji2.text.EmojiExclusions;
import app.cash.directory.data.Directory$Section;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class ShopHubMapperKt$getRecentViewsAndSearches$1 extends ContinuationImpl {
    public int I$0;
    public Directory$Section L$1;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return EmojiExclusions.getRecentViewsAndSearches(null, null, 0, this);
    }
}
