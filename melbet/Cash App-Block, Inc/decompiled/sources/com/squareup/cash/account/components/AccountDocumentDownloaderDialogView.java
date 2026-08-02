package com.squareup.cash.account.components;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import app.cash.broadway.ui.compose.ComposeUiView;
import app.cash.redwood.yoga.internal.Yoga$$ExternalSyntheticLambda7;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsDownloaderViewModel;
import com.squareup.cash.ui.OutsideTapCloses;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class AccountDocumentDownloaderDialogView extends ComposeUiView implements OutsideTapCloses {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountDocumentDownloaderDialogView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(AccountDocumentsDownloaderViewModel accountDocumentsDownloaderViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1975191319);
        int i2 = (gapComposer.changedInstance(accountDocumentsDownloaderViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (accountDocumentsDownloaderViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return;
            }
            AccountToDoKt.AccountDocumentDownloaderDialog(accountDocumentsDownloaderViewModel, function1, null, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Yoga$$ExternalSyntheticLambda7((Object) this, (Object) accountDocumentsDownloaderViewModel, function1, i, 13);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((AccountDocumentsDownloaderViewModel) obj, function1, gapComposer, 0);
    }
}
