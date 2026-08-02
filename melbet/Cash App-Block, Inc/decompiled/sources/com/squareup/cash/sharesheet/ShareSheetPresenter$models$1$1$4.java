package com.squareup.cash.sharesheet;

import com.squareup.cash.sharesheet.ShareSheetPresenter;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes7.dex */
public final /* synthetic */ class ShareSheetPresenter$models$1$1$4 extends AdaptedFunctionReference implements Function3 {
    public static final ShareSheetPresenter$models$1$1$4 INSTANCE = new ShareSheetPresenter$models$1$1$4(3, ShareSheetPresenter.StateUpdate.DataUpdated.class, "<init>", "<init>(Ljava/lang/String;Ljava/util/List;)V", 4);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new ShareSheetPresenter.StateUpdate.DataUpdated((String) obj, (List) obj2);
    }
}
