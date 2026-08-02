package com.squareup.cash.profile.views.preview;

import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewModel;
import com.squareup.cash.activity.viewmodels.ActivityFeedEntry;
import com.squareup.cash.activity.viewmodels.fixtures.ActivityEmbeddedFixtureScope;
import com.squareup.cash.activity.views.ActivityTabViewKt$$ExternalSyntheticLambda17;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.favorites.viewmodels.AddOrRemoveAsFavoriteButtonViewModel;
import com.squareup.cash.favorites.viewmodels.FavoriteState;
import com.squareup.cash.history.payments.viewmodels.BarColorState;
import com.squareup.cash.history.payments.viewmodels.ProfilePaymentHistoryViewModel;
import com.squareup.cash.history.payments.viewmodels.ProfileTransactionsBarViewModel;
import com.squareup.cash.profile.viewmodels.GenericProfileElementViewModel;
import com.squareup.cash.profile.viewmodels.GenericProfileElementsViewModel$Success;
import com.squareup.cash.profile.viewmodels.NavigationIcon;
import com.squareup.cash.profile.viewmodels.ProfileHeaderViewModel;
import com.squareup.cash.profile.viewmodels.ProfileViewModel;
import com.squareup.cash.profile.viewmodels.ProfileViewModel$Loaded$ProfileBody$Loaded;
import com.squareup.cash.profile.viewmodels.ProfileViewModel$Loaded$ProfileBody$Loading;
import com.squareup.cash.profile.viewmodels.TrustElementWidget;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cropview.Edge;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.compose.StableHolder;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt___StringsKt;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ProfileViewModelProvider implements PreviewParameterProvider {
    public final ProfileViewModel.Loaded defaultViewModel;

    public ProfileViewModelProvider() {
        Object elementAt = SequencesKt___SequencesKt.elementAt(getValues(), 2);
        elementAt.getClass();
        this.defaultViewModel = (ProfileViewModel.Loaded) elementAt;
    }

    public static GenericProfileElementsViewModel$Success buildProfileElements$default(ProfileViewModelProvider profileViewModelProvider, String str, boolean z, int i, int i2) {
        ProfilePaymentHistoryViewModel profilePaymentHistoryViewModel;
        String str2 = (i2 & 1) != 0 ? "4 weeks ago" : str;
        boolean z2 = (i2 & 2) != 0;
        boolean z3 = (i2 & 4) != 0 ? true : z;
        int i3 = (i2 & 8) != 0 ? 0 : 10;
        int i4 = (i2 & 16) != 0 ? 0 : i;
        boolean z4 = (i2 & 32) == 0;
        boolean z5 = (i2 & 64) == 0;
        boolean z6 = (i2 & 128) == 0;
        int i5 = i3 + i3;
        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        ListBuilder createListBuilder2 = CollectionsKt__CollectionsJVMKt.createListBuilder();
        createListBuilder2.add(new TrustElementWidget("joined", str2 != null ? "Joined ".concat(str2) : "Hasn't joined Cash App", new StableHolder(new Image("fake:///trusted_contact_icon.png", "fake:///trusted_contact_icon.png", 4)), Boolean.valueOf(str2 != null), null));
        if (str2 != null) {
            String str3 = z2 ? "Paid by people you know" : "Not paid by people you know";
            zzd zzdVar = Icons.Companion;
            createListBuilder2.add(new TrustElementWidget("paid_by", str3, null, Boolean.valueOf(z2), z2 ? "9GFu36" : "45tQF6"));
        }
        String str4 = z3 ? "In your contacts" : "Not in your synced contacts";
        zzd zzdVar2 = Icons.Companion;
        createListBuilder2.add(new TrustElementWidget("contacts", str4, null, Boolean.valueOf(z3), z3 ? "FpDJiD" : "45tQF6"));
        createListBuilder.add(new GenericProfileElementViewModel.TrustIndicatorsWidget(CollectionsKt__CollectionsJVMKt.build(createListBuilder2)));
        if (i5 > 0) {
            ProfileTransactionsBarViewModel profileTransactionsBarViewModel = new ProfileTransactionsBarViewModel("Total transactions", String.valueOf(i5), JsonLogicResult$Success$$ExternalSyntheticOutline0.m((i4 / 2) * 100, "$"), JsonLogicResult$Success$$ExternalSyntheticOutline0.m((i3 / 2) * 100, "$"), i3 / i5, i4 > i3, (i3 <= 0 || i4 != 0) ? (i4 <= 0 || i3 != 0) ? i3 > i4 ? BarColorState.MORE_SENT : i4 > i3 ? BarColorState.MORE_RECEIVED : BarColorState.DEFAULT : BarColorState.ONLY_RECEIVED : BarColorState.ONLY_SENT, 4);
            final int min = Math.min(i5, 5);
            final boolean z7 = i5 > 5;
            if ((1 & 2) != 0) {
                z7 = true;
            }
            if ((1 & 4) != 0) {
                min = 3;
            }
            Function1 function1 = new Function1() { // from class: com.squareup.cash.activity.viewmodels.fixtures.ActivityFixturesKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ActivityEmbeddedFixtureScope activityEmbeddedFixtureScope = (ActivityEmbeddedFixtureScope) obj;
                    activityEmbeddedFixtureScope.getClass();
                    activityEmbeddedFixtureScope.embeddedHeader = new ActivityFeedEntry.EmbeddedHeader(z7);
                    for (int i6 = 0; i6 < min; i6++) {
                        activityEmbeddedFixtureScope.entries.add(new ActivityFeedEntry.Item(ActivityFixturesKt.activityItemFixture$default(null, 7, (char) 0)));
                    }
                    return Unit.INSTANCE;
                }
            };
            ActivityEmbeddedFixtureScope activityEmbeddedFixtureScope = new ActivityEmbeddedFixtureScope();
            function1.invoke(activityEmbeddedFixtureScope);
            ListBuilder createListBuilder3 = CollectionsKt__CollectionsJVMKt.createListBuilder();
            ActivityFeedEntry.EmbeddedHeader embeddedHeader = activityEmbeddedFixtureScope.embeddedHeader;
            if (embeddedHeader != null) {
                createListBuilder3.add(embeddedHeader);
            }
            createListBuilder3.addAll(activityEmbeddedFixtureScope.entries);
            profilePaymentHistoryViewModel = new ProfilePaymentHistoryViewModel.Data(profileTransactionsBarViewModel, new UiCallbackModel(new ActivityTabViewKt$$ExternalSyntheticLambda17(6), new ActivityEmbeddedViewModel(false, CollectionsKt__CollectionsJVMKt.build(createListBuilder3))));
        } else {
            profilePaymentHistoryViewModel = ProfilePaymentHistoryViewModel.Empty.INSTANCE;
        }
        createListBuilder.add(new GenericProfileElementViewModel.PaymentHistoryWidget(profilePaymentHistoryViewModel));
        String str5 = z4 ? "Unblock" : "Block";
        Edge.Companion companion = GenericProfileElement.ButtonElement.TertiaryStyle.TitleStyle.Companion;
        Boolean valueOf = Boolean.valueOf(!z4);
        ByteString byteString = ByteString.EMPTY;
        createListBuilder.add(new GenericProfileElementViewModel.GroupedButtonsWidget(CollectionsKt__CollectionsKt.listOf((Object[]) new GenericProfileElementViewModel.ButtonWidget[]{new GenericProfileElementViewModel.ButtonWidget(str5, new GenericProfileElement.ButtonElement.BlockAction(null, valueOf, byteString), (GenericProfileElement.ButtonElement.ReportAction) null, 8), new GenericProfileElementViewModel.ButtonWidget(z5 ? "Reported" : "Report", (GenericProfileElement.ButtonElement.BlockAction) null, new GenericProfileElement.ButtonElement.ReportAction(GenericProfileElement.ButtonElement.ReportAction.ADAPTER, byteString), 4)})));
        GenericProfileElementViewModel.BlankDivider.Size size = GenericProfileElementViewModel.BlankDivider.Size.SMALL;
        createListBuilder.add(new GenericProfileElementViewModel.BlankDivider());
        return new GenericProfileElementsViewModel$Success(CollectionsKt__CollectionsJVMKt.build(createListBuilder), z6, z4);
    }

    public static ProfileViewModel.Loaded.ProfileHeader profileHeader$default(ProfileViewModelProvider profileViewModelProvider, String str, String str2, ColorModel colorModel, boolean z, int i) {
        Icons icons = Icons.Block24;
        String str3 = (i & 1) != 0 ? "Dwight Schrute" : str;
        String str4 = (i & 2) != 0 ? "$beets" : str2;
        ColorModel colorModel2 = (i & 4) != 0 ? ColorModel.CashGreen.INSTANCE : colorModel;
        boolean z2 = (i & 8) != 0 ? true : z;
        boolean z3 = (i & 16) != 0;
        Icons icons2 = (i & 64) != 0 ? null : icons;
        boolean z4 = (i & 128) == 0;
        boolean z5 = (i & 256) == 0;
        return new ProfileViewModel.Loaded.ProfileHeader(NavigationIcon.CLOSE, new ProfileViewModel.Loaded.ProfileHeader.FavoriteAction(new AddOrRemoveAsFavoriteButtonViewModel("C_0aw1kgymz", str3, new Color((Color.ModeVariant) null, (Color.ModeVariant) null, 7), new Image("https://example.com/photo.jpg", "https://example.com/photo.jpg", 4), Character.valueOf(StringsKt___StringsKt.first(str3)), FavoriteState.FAVORITE)), new ProfileHeaderViewModel(new StackedAvatarViewModel.Single(new StackedAvatarViewModel.Avatar(colorModel2, 'D', null, null, null, null, null, null, false, false, null, false, null, null, 131068)), "View profile photo for Dwight Schrute", new ProfileHeaderViewModel.BadgeName(str3, z5, z4), icons2, str4, 16), z3 ? new ProfileViewModel.Loaded.ProfileHeader.ActionButton("Request") : new ProfileViewModel.Loaded.ProfileHeader.ActionButton("Pay"), z3 ? new ProfileViewModel.Loaded.ProfileHeader.ActionButton("Pay") : null, z2);
    }

    public final Sequence getValues() {
        ProfileViewModel.Loading loading = new ProfileViewModel.Loading(true);
        ProfileViewModel.Loaded loaded = new ProfileViewModel.Loaded(profileHeader$default(this, null, null, null, false, 511), ProfileViewModel$Loaded$ProfileBody$Loading.INSTANCE, null);
        ProfileViewModel.Loaded loaded2 = new ProfileViewModel.Loaded(profileHeader$default(this, null, null, null, false, 351), new ProfileViewModel$Loaded$ProfileBody$Loaded(buildProfileElements$default(this, null, false, 0, 119)), null);
        zzd zzdVar = Icons.Companion;
        return ArraysKt___ArraysKt.asSequence(new ProfileViewModel[]{loading, loaded, loaded2, new ProfileViewModel.Loaded(profileHeader$default(this, null, null, null, false, 447), new ProfileViewModel$Loaded$ProfileBody$Loaded(buildProfileElements$default(this, "10 months ago", false, 10, 192)), null), new ProfileViewModel.Loaded(profileHeader$default(this, null, null, null, false, 511), new ProfileViewModel$Loaded$ProfileBody$Loaded(buildProfileElements$default(this, null, false, 1, EnumC0170g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE)), null), new ProfileViewModel.Loaded(profileHeader$default(this, "Dunder Mifflin", "$dunderMifflin", null, false, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE), new ProfileViewModel$Loaded$ProfileBody$Loaded(buildProfileElements$default(this, "10 years ago", false, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE)), null), new ProfileViewModel.Loaded(profileHeader$default(this, "Jim", "jim@cash.app", ColorModel.Investing.INSTANCE, true, 480), new ProfileViewModel$Loaded$ProfileBody$Loaded(buildProfileElements$default(this, null, true, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE)), null), new ProfileViewModel.Loaded(profileHeader$default(this, null, null, ColorModel.Bitcoin.INSTANCE, false, 499), new ProfileViewModel$Loaded$ProfileBody$Loaded(buildProfileElements$default(this, null, false, 0, 255)), null)});
    }
}
