package com.squareup.cash.profile.views;

import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.cash.broadway.ui.Ui;
import com.squareup.address.typeahead.backend.api.AddressKt;
import com.squareup.cash.R;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.data.profile.RealAddressManager;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.mooncake.themes.widget.TextThemeInfo;
import com.squareup.cash.mooncake.theming.RipplesKt;
import com.squareup.cash.profile.viewmodels.AddressSheetResponse;
import com.squareup.cash.profile.viewmodels.AddressSheetViewEvent;
import com.squareup.cash.profile.viewmodels.AddressSheetViewModel;
import com.squareup.cash.shopping.web.ShoppingWebBridge;
import com.squareup.cash.ui.OutsideTapCloses;
import com.squareup.cash.ui.drawable.DividerDrawable;
import com.squareup.kotterknife.KotterKnifeKt;
import com.squareup.kotterknife.Lazy;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.util.Strings;
import com.squareup.util.android.coroutines.ViewKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;

/* loaded from: classes7.dex */
public final class MooncakeAddressSheet extends LinearLayout implements OutsideTapCloses, Ui {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(MooncakeAddressSheet.class, "headerView", "getHeaderView()Landroid/widget/TextView;", 0), new PropertyReference1Impl(MooncakeAddressSheet.class, "replaceAddress", "getReplaceAddress()Landroid/widget/TextView;", 0), new PropertyReference1Impl(MooncakeAddressSheet.class, "cancel", "getCancel()Landroid/widget/TextView;", 0)};
    public final RealAddressManager addressManager;
    public final Lazy cancel$delegate;
    public Ui.EventReceiver eventReceiver;
    public final Lazy headerView$delegate;
    public final Lazy replaceAddress$delegate;

    public MooncakeAddressSheet(RealAddressManager realAddressManager, RealBitcoinCapabilityProvider realBitcoinCapabilityProvider, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper, null);
        this.addressManager = realAddressManager;
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        Lazy bindView = KotterKnifeKt.bindView(this, R.id.header);
        this.headerView$delegate = bindView;
        this.replaceAddress$delegate = KotterKnifeKt.bindView(this, R.id.replace_address);
        this.cancel$delegate = KotterKnifeKt.bindView(this, R.id.cancel);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        final int i = 1;
        setOrientation(1);
        View.inflate(contextThemeWrapper, R.layout.profile_address_sheet_inflate, this);
        setBackgroundColor(colorPalette.elevatedBackground);
        setOrientation(1);
        setShowDividers(2);
        setDividerDrawable(new DividerDrawable(colorPalette.hairline));
        KProperty[] kPropertyArr = $$delegatedProperties;
        final int i2 = 0;
        TextView textView = (TextView) bindView.getValue(this, kPropertyArr[0]);
        int i3 = colorPalette.label;
        textView.setTextColor(i3);
        TextView textView2 = (TextView) bindView.getValue(this, kPropertyArr[0]);
        TextThemeInfo textThemeInfo = TextStyles.mainTitle;
        Strings.applyStyle(textView2, textThemeInfo);
        TextView cancel = getCancel();
        int i4 = colorPalette.elevatedBackground;
        cancel.setBackground(RipplesKt.createRippleDrawable$default(this, Integer.valueOf(i4), 2));
        Strings.applyStyle(getCancel(), textThemeInfo);
        getCancel().setTextColor(colorPalette.green);
        getCancel().setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.profile.views.MooncakeAddressSheet$$ExternalSyntheticLambda0
            public final /* synthetic */ MooncakeAddressSheet f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = i2;
                MooncakeAddressSheet mooncakeAddressSheet = this.f$0;
                switch (i5) {
                    case 0:
                        Ui.EventReceiver eventReceiver = mooncakeAddressSheet.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(AddressSheetViewEvent.Cancel.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    default:
                        Ui.EventReceiver eventReceiver2 = mooncakeAddressSheet.eventReceiver;
                        if (eventReceiver2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                        Parcelable.Creator<AddressSheetResponse> creator = AddressSheetResponse.CREATOR;
                        eventReceiver2.sendEvent(new AddressSheetViewEvent.Replace());
                        return;
                }
            }
        });
        getReplaceAddress().setTextColor(i3);
        Strings.applyStyle(getReplaceAddress(), TextStyles.mainBody);
        getReplaceAddress().setBackground(RipplesKt.createRippleDrawable$default(this, Integer.valueOf(i4), 2));
        getReplaceAddress().setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.profile.views.MooncakeAddressSheet$$ExternalSyntheticLambda0
            public final /* synthetic */ MooncakeAddressSheet f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = i;
                MooncakeAddressSheet mooncakeAddressSheet = this.f$0;
                switch (i5) {
                    case 0:
                        Ui.EventReceiver eventReceiver = mooncakeAddressSheet.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(AddressSheetViewEvent.Cancel.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    default:
                        Ui.EventReceiver eventReceiver2 = mooncakeAddressSheet.eventReceiver;
                        if (eventReceiver2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                        Parcelable.Creator<AddressSheetResponse> creator = AddressSheetResponse.CREATOR;
                        eventReceiver2.sendEvent(new AddressSheetViewEvent.Replace());
                        return;
                }
            }
        });
        getReplaceAddress().setVisibility(0);
        ViewKt.whileEachAttached(this, EmptyCoroutineContext.INSTANCE, new ShoppingWebBridge.AnonymousClass1(this, (Continuation) null, 11));
    }

    public final TextView getCancel() {
        return (TextView) this.cancel$delegate.getValue(this, $$delegatedProperties[2]);
    }

    public final TextView getReplaceAddress() {
        return (TextView) this.replaceAddress$delegate.getValue(this, $$delegatedProperties[1]);
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(AddressSheetViewModel addressSheetViewModel) {
        addressSheetViewModel.getClass();
        GlobalAddress globalAddress = addressSheetViewModel.address;
        TextView textView = (TextView) this.headerView$delegate.getValue(this, $$delegatedProperties[0]);
        globalAddress.getClass();
        textView.setText(AddressKt.buildAsString(globalAddress, false));
    }
}
