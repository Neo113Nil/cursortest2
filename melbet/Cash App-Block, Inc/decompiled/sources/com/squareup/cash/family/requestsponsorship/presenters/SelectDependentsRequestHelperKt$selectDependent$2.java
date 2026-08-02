package com.squareup.cash.family.requestsponsorship.presenters;

import com.google.android.gms.internal.mlkit_vision_barcode.zzap;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.common.composeui.DrawerViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.resource.text.AndroidStringManager;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class SelectDependentsRequestHelperKt$selectDependent$2 extends ContinuationImpl {
    public BlockersDataNavigator L$10;
    public AndroidStringManager L$11;
    public DrawerViewKt$$ExternalSyntheticLambda2 L$14;
    public BetterNavigator.ScreenNavigator L$8;
    public BlockersScreens L$9;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return zzap.selectDependent(null, null, null, null, null, null, null, null, null, null, null, null, null, null, this);
    }
}
