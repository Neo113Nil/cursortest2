package com.squareup.cash.shopping.presenters;

import androidx.emoji2.text.EmojiExclusions;
import app.cash.directory.data.Directory$Section;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.shopping.backend.real.RealRecentSearchManager;
import com.squareup.cash.shopping.viewmodels.ShopHubResultsListItem;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class ShopHubMapperKt$mapSections$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public AndroidStringManager L$1;
    public RealRecentSearchManager L$2;
    public ShopHubResultsListItem L$3;
    public List L$4;
    public List L$5;
    public Iterator L$7;
    public Directory$Section L$9;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return EmojiExclusions.mapSections(null, null, false, null, null, this);
    }
}
