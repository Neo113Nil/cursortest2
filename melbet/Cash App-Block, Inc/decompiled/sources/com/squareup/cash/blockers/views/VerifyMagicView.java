package com.squareup.cash.blockers.views;

import android.content.Context;
import app.cash.broadway.ui.Ui;
import com.plaid.internal.Q0$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.blockers.viewmodels.VerifyMagicViewModel;
import com.squareup.cash.blockers.views.BlockerLayout;
import com.squareup.cash.mooncake.components.MooncakeLargeText;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.ui.OnBackListener;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class VerifyMagicView extends BlockerLayout implements OnBackListener, Ui {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final MooncakeLargeText errorMessageView;
    public final MooncakePillButton retryView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyMagicView(Context context) {
        super(context);
        context.getClass();
        MooncakeLargeText mooncakeLargeText = new MooncakeLargeText(context, null, 2, null);
        this.errorMessageView = mooncakeLargeText;
        MooncakePillButton mooncakePillButton = new MooncakePillButton(context, null, MooncakePillButton.Size.LARGE, MooncakePillButton.Style.PRIMARY, 2, null);
        this.retryView = mooncakePillButton;
        verticallyLayoutInto(this.contentLayout, (BlockerLayout.Element[]) Arrays.copyOf(new BlockerLayout.Element[]{new BlockerLayout.Element.Field(mooncakeLargeText)}, 1));
        setFooterContent(new BlockerLayout.Element.Field(mooncakePillButton));
        mooncakePillButton.setVisibility(8);
        mooncakePillButton.setText(context.getString(R.string.verify_magic_retry));
    }

    @Override // com.squareup.cash.ui.OnBackListener
    public final boolean onBack() {
        return this.loadingHelper.reusable;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.retryView.setOnClickListener(new Q0$$ExternalSyntheticLambda0(eventReceiver, 28));
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(VerifyMagicViewModel verifyMagicViewModel) {
        verifyMagicViewModel.getClass();
        setLoading(Intrinsics.areEqual(verifyMagicViewModel, VerifyMagicViewModel.Loading.INSTANCE));
        if (verifyMagicViewModel instanceof VerifyMagicViewModel.Error) {
            this.errorMessageView.setText(((VerifyMagicViewModel.Error) verifyMagicViewModel).message);
            this.retryView.setVisibility(0);
        }
    }
}
