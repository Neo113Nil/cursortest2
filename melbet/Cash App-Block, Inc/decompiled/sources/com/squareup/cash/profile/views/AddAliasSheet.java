package com.squareup.cash.profile.views;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.R;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.mooncake.themes.widget.TextThemeInfo;
import com.squareup.cash.mooncake.theming.RipplesKt;
import com.squareup.cash.profile.viewmodels.AddAliasViewEvent;
import com.squareup.cash.profile.viewmodels.AliasItem;
import com.squareup.cash.ui.OutsideTapCloses;
import com.squareup.cash.ui.drawable.DividerDrawable;
import com.squareup.kotterknife.KotterKnifeKt;
import com.squareup.kotterknife.Lazy;
import com.squareup.util.Strings;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;

/* loaded from: classes7.dex */
public final class AddAliasSheet extends LinearLayout implements OutsideTapCloses, Ui {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(AddAliasSheet.class, "cancelView", "getCancelView()Landroid/widget/TextView;", 0), new PropertyReference1Impl(AddAliasSheet.class, "emailView", "getEmailView()Landroid/widget/TextView;", 0), new PropertyReference1Impl(AddAliasSheet.class, "phoneView", "getPhoneView()Landroid/widget/TextView;", 0)};
    public final Lazy cancelView$delegate;
    public final Lazy emailView$delegate;
    public Ui.EventReceiver eventReceiver;
    public final Lazy phoneView$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddAliasSheet(Context context) {
        super(context, null);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        this.cancelView$delegate = KotterKnifeKt.bindView(this, R.id.cancel);
        this.emailView$delegate = KotterKnifeKt.bindView(this, R.id.email);
        this.phoneView$delegate = KotterKnifeKt.bindView(this, R.id.phone);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        View.inflate(context, R.layout.profile_add_alias_sheet, this);
        setBackgroundColor(colorPalette.elevatedBackground);
        final int i = 1;
        setOrientation(1);
        final int i2 = 2;
        setShowDividers(2);
        setDividerDrawable(new DividerDrawable(colorPalette.hairline));
        TextView emailView = getEmailView();
        TextThemeInfo textThemeInfo = TextStyles.mainBody;
        Strings.applyStyle(emailView, textThemeInfo);
        Strings.applyStyle(getPhoneView(), textThemeInfo);
        Strings.applyStyle(getCancelView$1(), TextStyles.mainTitle);
        TextView emailView2 = getEmailView();
        int i3 = colorPalette.label;
        emailView2.setTextColor(i3);
        getPhoneView().setTextColor(i3);
        getCancelView$1().setTextColor(colorPalette.green);
        TextView emailView3 = getEmailView();
        int i4 = colorPalette.elevatedBackground;
        emailView3.setBackground(RipplesKt.createRippleDrawable$default(this, Integer.valueOf(i4), 2));
        getPhoneView().setBackground(RipplesKt.createRippleDrawable$default(this, Integer.valueOf(i4), 2));
        getCancelView$1().setBackground(RipplesKt.createRippleDrawable$default(this, Integer.valueOf(i4), 2));
        final int i5 = 0;
        getCancelView$1().setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.profile.views.AddAliasSheet$$ExternalSyntheticLambda0
            public final /* synthetic */ AddAliasSheet f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = i5;
                AddAliasSheet addAliasSheet = this.f$0;
                switch (i6) {
                    case 0:
                        Ui.EventReceiver eventReceiver = addAliasSheet.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(AddAliasViewEvent.Exit.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    case 1:
                        KProperty[] kPropertyArr = AddAliasSheet.$$delegatedProperties;
                        AliasItem aliasItem = AliasItem.EMAIL;
                        Ui.EventReceiver eventReceiver2 = addAliasSheet.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(new AddAliasViewEvent.AddAlias(aliasItem));
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    default:
                        KProperty[] kPropertyArr2 = AddAliasSheet.$$delegatedProperties;
                        AliasItem aliasItem2 = AliasItem.PHONE;
                        Ui.EventReceiver eventReceiver3 = addAliasSheet.eventReceiver;
                        if (eventReceiver3 != null) {
                            eventReceiver3.sendEvent(new AddAliasViewEvent.AddAlias(aliasItem2));
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                }
            }
        });
        getEmailView().setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.profile.views.AddAliasSheet$$ExternalSyntheticLambda0
            public final /* synthetic */ AddAliasSheet f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = i;
                AddAliasSheet addAliasSheet = this.f$0;
                switch (i6) {
                    case 0:
                        Ui.EventReceiver eventReceiver = addAliasSheet.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(AddAliasViewEvent.Exit.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    case 1:
                        KProperty[] kPropertyArr = AddAliasSheet.$$delegatedProperties;
                        AliasItem aliasItem = AliasItem.EMAIL;
                        Ui.EventReceiver eventReceiver2 = addAliasSheet.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(new AddAliasViewEvent.AddAlias(aliasItem));
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    default:
                        KProperty[] kPropertyArr2 = AddAliasSheet.$$delegatedProperties;
                        AliasItem aliasItem2 = AliasItem.PHONE;
                        Ui.EventReceiver eventReceiver3 = addAliasSheet.eventReceiver;
                        if (eventReceiver3 != null) {
                            eventReceiver3.sendEvent(new AddAliasViewEvent.AddAlias(aliasItem2));
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                }
            }
        });
        getPhoneView().setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.profile.views.AddAliasSheet$$ExternalSyntheticLambda0
            public final /* synthetic */ AddAliasSheet f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = i2;
                AddAliasSheet addAliasSheet = this.f$0;
                switch (i6) {
                    case 0:
                        Ui.EventReceiver eventReceiver = addAliasSheet.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(AddAliasViewEvent.Exit.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    case 1:
                        KProperty[] kPropertyArr = AddAliasSheet.$$delegatedProperties;
                        AliasItem aliasItem = AliasItem.EMAIL;
                        Ui.EventReceiver eventReceiver2 = addAliasSheet.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(new AddAliasViewEvent.AddAlias(aliasItem));
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    default:
                        KProperty[] kPropertyArr2 = AddAliasSheet.$$delegatedProperties;
                        AliasItem aliasItem2 = AliasItem.PHONE;
                        Ui.EventReceiver eventReceiver3 = addAliasSheet.eventReceiver;
                        if (eventReceiver3 != null) {
                            eventReceiver3.sendEvent(new AddAliasViewEvent.AddAlias(aliasItem2));
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                }
            }
        });
    }

    public final TextView getCancelView$1() {
        return (TextView) this.cancelView$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final TextView getEmailView() {
        return (TextView) this.emailView$delegate.getValue(this, $$delegatedProperties[1]);
    }

    public final TextView getPhoneView() {
        return (TextView) this.phoneView$delegate.getValue(this, $$delegatedProperties[2]);
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(Unit unit) {
        unit.getClass();
    }
}
