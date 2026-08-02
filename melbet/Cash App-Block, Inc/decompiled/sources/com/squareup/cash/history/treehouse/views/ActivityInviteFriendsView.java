package com.squareup.cash.history.treehouse.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import app.cash.broadway.navigation.Navigator;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.history.presenters.RealActivityInvitePresenter;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda28;
import com.squareup.cash.ui.widget.text.LineSpacingTextView;
import com.squareup.util.android.Views;
import com.squareup.util.android.Views$SCALE$1;
import com.squareup.util.android.coroutines.ViewKt;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes6.dex */
public final class ActivityInviteFriendsView extends LineSpacingTextView {
    public final Instrument$Adapter factory;
    public final Navigator navigator;
    public RealActivityInvitePresenter presenter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityInviteFriendsView(Instrument$Adapter instrument$Adapter, Navigator navigator, Context context) {
        super(context, null);
        navigator.getClass();
        this.factory = instrument$Adapter;
        this.navigator = navigator;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        Drawable drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.referrals_icon_invite_button, null);
        Views$SCALE$1 views$SCALE$1 = Views.SCALE;
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        compoundDrawablesRelative.getClass();
        setCompoundDrawablesRelativeWithIntrinsicBounds(compoundDrawablesRelative[0], drawableCompat, compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
        setCompoundDrawablePadding(Views.dip((View) this, 12));
        setGravity(1);
        setPadding(Views.dip((View) this, 16), Views.dip((View) this, 48), Views.dip((View) this, 16), Views.dip((View) this, 48));
        setTextAppearance(R.style.TextAppearance_Cash_Subtext);
        setTextColor(ThemeHelpersKt.themeInfo(this).colorPalette.label);
        setOnClickListener(new ChatView$$ExternalSyntheticLambda28(this, 2));
        ViewKt.whileEachAttached(this, EmptyCoroutineContext.INSTANCE, new CheckStatusPresenter.AnonymousClass1.C00611(this, null, 24));
    }
}
