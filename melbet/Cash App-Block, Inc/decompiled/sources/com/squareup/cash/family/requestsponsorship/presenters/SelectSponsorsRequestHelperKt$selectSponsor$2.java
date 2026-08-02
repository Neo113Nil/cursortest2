package com.squareup.cash.family.requestsponsorship.presenters;

import com.google.android.gms.internal.mlkit_vision_barcode.zzcj;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.resource.text.AndroidStringManager;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class SelectSponsorsRequestHelperKt$selectSponsor$2 extends ContinuationImpl {
    public BlockersScreens L$10;
    public BlockersDataNavigator L$11;
    public AndroidStringManager L$12;
    public Function0 L$15;
    public BetterNavigator.ScreenNavigator L$9;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return zzcj.selectSponsor(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this);
    }
}
