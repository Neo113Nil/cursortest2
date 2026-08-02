package app.cash.local.views.wallet;

import androidx.compose.ui.geometry.Size;
import app.cash.local.viewmodels.wallet.LocalHomeViewEvent;
import com.squareup.cash.account.components.AccountDocumentsView;
import com.squareup.cash.account.settings.viewmodels.AccountViewEvent;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsDownloadOptionsViewEvent$DownloadClick;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewEvent;
import com.squareup.cash.account.settings.viewmodels.documents.ProfileDocumentsDownloaderViewEvent$Cancel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class TabContentViewKt$$ExternalSyntheticLambda6 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ TabContentViewKt$$ExternalSyntheticLambda6(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        AccountDocumentsViewEvent.NavigationClick navigationClick = AccountDocumentsViewEvent.NavigationClick.INSTANCE;
        AccountViewEvent.AddPhotoClick addPhotoClick = AccountViewEvent.AddPhotoClick.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(LocalHomeViewEvent.Refresh.INSTANCE);
                break;
            case 1:
                function1.invoke(LocalHomeViewEvent.AllActiveOrdersClicked.INSTANCE);
                break;
            case 2:
                function1.invoke(new Size(9205357640488583168L));
                break;
            case 3:
                function1.invoke(ProfileDocumentsDownloaderViewEvent$Cancel.INSTANCE);
                break;
            case 4:
                function1.invoke(AccountDocumentsDownloadOptionsViewEvent$DownloadClick.INSTANCE);
                break;
            case 5:
                int i2 = AccountDocumentsView.$r8$clinit;
                function1.invoke(navigationClick);
                break;
            case 6:
                function1.invoke(navigationClick);
                break;
            case 7:
                function1.invoke(AccountViewEvent.SocialInstagramClick.INSTANCE);
                break;
            case 8:
                function1.invoke(AccountViewEvent.SocialXClick.INSTANCE);
                break;
            case 9:
                function1.invoke(AccountViewEvent.VersionCodeClick.INSTANCE);
                break;
            case 10:
                function1.invoke(AccountViewEvent.CreateBusinessAccountClick.INSTANCE);
                break;
            case 11:
                function1.invoke(AccountViewEvent.CreatePersonalAccountClick.INSTANCE);
                break;
            case 12:
                function1.invoke(AccountViewEvent.SignOutClick.INSTANCE);
                break;
            case 13:
                function1.invoke(addPhotoClick);
                break;
            case 14:
                function1.invoke(addPhotoClick);
                break;
            case 15:
                function1.invoke(AccountViewEvent.PrivacyClick.INSTANCE);
                break;
            case 16:
                function1.invoke(AccountViewEvent.SecurityClick.INSTANCE);
                break;
            case 17:
                function1.invoke(AccountViewEvent.ShoppingSettingClick.INSTANCE);
                break;
            case 18:
                function1.invoke(AccountViewEvent.PromotionsReferralsClick.INSTANCE);
                break;
            case 19:
                function1.invoke(AccountViewEvent.DocumentsClick.INSTANCE);
                break;
            case 20:
                function1.invoke(AccountViewEvent.FamilyAccountsClick.INSTANCE);
                break;
            case 21:
                function1.invoke(AccountViewEvent.FavoritesSettingsRowClicked.INSTANCE);
                break;
            case 22:
                function1.invoke(AccountViewEvent.LimitsClick.INSTANCE);
                break;
            case 23:
                function1.invoke(AccountViewEvent.LinkedBanksClick.INSTANCE);
                break;
            case 24:
                function1.invoke(AccountViewEvent.BusinessesClick.INSTANCE);
                break;
            case 25:
                function1.invoke(AccountViewEvent.NotificationsClick.INSTANCE);
                break;
            case 26:
                function1.invoke(AccountViewEvent.PersonalClick.INSTANCE);
                break;
            case 27:
                function1.invoke(AccountViewEvent.HelpClick.INSTANCE);
                break;
            case 28:
                function1.invoke(AccountViewEvent.BusinessInfoClick.INSTANCE);
                break;
            default:
                function1.invoke(AccountViewEvent.ThemesClick.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
