package com.squareup.cash.blockers.views;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.R;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.ConfirmPaymentViewEvent;
import com.squareup.cash.blockers.viewmodels.ConfirmPaymentViewModel;
import com.squareup.cash.blockers.views.BlockerLayout;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.ui.OnBackListener;
import com.squareup.protos.franklin.common.scenarios.ConfirmBlockerSupplement;
import com.squareup.util.Strings;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ConfirmPaymentView extends BlockerLayout implements OnBackListener, Ui {
    public final BlockersScreens.ConfirmPaymentScreen args;
    public final BlockersDataNavigator blockersNavigator;
    public final ColorPalette colorPalette;
    public Ui.EventReceiver eventReceiver;

    public ConfirmPaymentView(BlockersDataNavigator blockersDataNavigator, Context context, BlockersScreens.ConfirmPaymentScreen confirmPaymentScreen) {
        super(context);
        this.blockersNavigator = blockersDataNavigator;
        this.args = confirmPaymentScreen;
        this.colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
    }

    @Override // com.squareup.cash.ui.OnBackListener
    public final boolean onBack() {
        if (this.loadingHelper.reusable) {
            return true;
        }
        BlockersScreens.ConfirmPaymentScreen confirmPaymentScreen = this.args;
        Screen back = this.blockersNavigator.getBack(confirmPaymentScreen, confirmPaymentScreen.blockersData);
        if (back == null) {
            return false;
        }
        Ui.EventReceiver eventReceiver = this.eventReceiver;
        if (eventReceiver != null) {
            eventReceiver.sendEvent(new ConfirmPaymentViewEvent.BackClick(back));
            return true;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
        throw null;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(ConfirmPaymentViewModel confirmPaymentViewModel) {
        confirmPaymentViewModel.getClass();
        setLoading(confirmPaymentViewModel.isLoading);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        Strings.applyStyle(appCompatTextView, TextStyles.header3);
        appCompatTextView.setTextColor(this.colorPalette.label);
        ConfirmBlockerSupplement confirmBlockerSupplement = confirmPaymentViewModel.supplement;
        appCompatTextView.setText(confirmBlockerSupplement.main_text);
        BlockerLayout.Element.Field field = new BlockerLayout.Element.Field(appCompatTextView);
        final int i = 1;
        final int i2 = 0;
        verticallyLayoutInto(this.contentLayout, (BlockerLayout.Element[]) Arrays.copyOf(new BlockerLayout.Element[]{field}, 1));
        String str = confirmBlockerSupplement.confirm_payment_button_title;
        String str2 = confirmBlockerSupplement.pay_duplicate_button_title;
        if (str == null || str2 == null) {
            Context context = getContext();
            context.getClass();
            MooncakePillButton mooncakePillButton = new MooncakePillButton(context, null, MooncakePillButton.Size.LARGE, MooncakePillButton.Style.PRIMARY, 2, null);
            mooncakePillButton.setText(R.string.blockers_confirm_payment_confirm);
            mooncakePillButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.blockers.views.ConfirmPaymentView$$ExternalSyntheticLambda0
                public final /* synthetic */ ConfirmPaymentView f$0;

                {
                    this.f$0 = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = i2;
                    ConfirmPaymentViewEvent.ConfirmOrNextClick confirmOrNextClick = ConfirmPaymentViewEvent.ConfirmOrNextClick.INSTANCE;
                    ConfirmPaymentView confirmPaymentView = this.f$0;
                    switch (i3) {
                        case 0:
                            Ui.EventReceiver eventReceiver = confirmPaymentView.eventReceiver;
                            if (eventReceiver != null) {
                                eventReceiver.sendEvent(confirmOrNextClick);
                                return;
                            } else {
                                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                throw null;
                            }
                        case 1:
                            Ui.EventReceiver eventReceiver2 = confirmPaymentView.eventReceiver;
                            if (eventReceiver2 != null) {
                                eventReceiver2.sendEvent(ConfirmPaymentViewEvent.PayDuplicateClick.INSTANCE);
                                return;
                            } else {
                                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                throw null;
                            }
                        default:
                            Ui.EventReceiver eventReceiver3 = confirmPaymentView.eventReceiver;
                            if (eventReceiver3 != null) {
                                eventReceiver3.sendEvent(confirmOrNextClick);
                                return;
                            } else {
                                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                throw null;
                            }
                    }
                }
            });
            setFooterContent(new BlockerLayout.Element.Field(mooncakePillButton));
            return;
        }
        Context context2 = getContext();
        context2.getClass();
        MooncakePillButton.Size size = MooncakePillButton.Size.LARGE;
        MooncakePillButton.Style style = MooncakePillButton.Style.SECONDARY;
        MooncakePillButton mooncakePillButton2 = new MooncakePillButton(context2, null, size, style, 2, null);
        mooncakePillButton2.setText(str);
        mooncakePillButton2.setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.blockers.views.ConfirmPaymentView$$ExternalSyntheticLambda0
            public final /* synthetic */ ConfirmPaymentView f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                ConfirmPaymentViewEvent.ConfirmOrNextClick confirmOrNextClick = ConfirmPaymentViewEvent.ConfirmOrNextClick.INSTANCE;
                ConfirmPaymentView confirmPaymentView = this.f$0;
                switch (i3) {
                    case 0:
                        Ui.EventReceiver eventReceiver = confirmPaymentView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(confirmOrNextClick);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    case 1:
                        Ui.EventReceiver eventReceiver2 = confirmPaymentView.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(ConfirmPaymentViewEvent.PayDuplicateClick.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    default:
                        Ui.EventReceiver eventReceiver3 = confirmPaymentView.eventReceiver;
                        if (eventReceiver3 != null) {
                            eventReceiver3.sendEvent(confirmOrNextClick);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                }
            }
        });
        BlockerLayout.Element.Field field2 = new BlockerLayout.Element.Field(mooncakePillButton2);
        BlockerLayout.Element.Spacer spacer = new BlockerLayout.Element.Spacer();
        Context context3 = getContext();
        context3.getClass();
        MooncakePillButton mooncakePillButton3 = new MooncakePillButton(context3, null, size, style, 2, null);
        mooncakePillButton3.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        mooncakePillButton3.setText(str2);
        final int i3 = 2;
        mooncakePillButton3.setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.blockers.views.ConfirmPaymentView$$ExternalSyntheticLambda0
            public final /* synthetic */ ConfirmPaymentView f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i3;
                ConfirmPaymentViewEvent.ConfirmOrNextClick confirmOrNextClick = ConfirmPaymentViewEvent.ConfirmOrNextClick.INSTANCE;
                ConfirmPaymentView confirmPaymentView = this.f$0;
                switch (i32) {
                    case 0:
                        Ui.EventReceiver eventReceiver = confirmPaymentView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(confirmOrNextClick);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    case 1:
                        Ui.EventReceiver eventReceiver2 = confirmPaymentView.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(ConfirmPaymentViewEvent.PayDuplicateClick.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    default:
                        Ui.EventReceiver eventReceiver3 = confirmPaymentView.eventReceiver;
                        if (eventReceiver3 != null) {
                            eventReceiver3.sendEvent(confirmOrNextClick);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                }
            }
        });
        setFooterContent(field2, spacer, new BlockerLayout.Element.Field(mooncakePillButton3));
    }
}
