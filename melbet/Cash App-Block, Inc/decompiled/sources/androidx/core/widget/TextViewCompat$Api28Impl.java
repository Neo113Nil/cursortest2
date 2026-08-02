package androidx.core.widget;

import android.widget.TextView;
import com.squareup.cash.R;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.securityhub.presenters.TrustHubImageUrls;
import com.squareup.cash.securityhub.viewmodels.EducationCardId;
import com.squareup.cash.securityhub.viewmodels.EducationCardUiModel;
import com.squareup.cash.securityhub.viewmodels.RecoveryGuideRowId;
import com.squareup.cash.securityhub.viewmodels.RecoveryGuideRowViewModel;
import com.squareup.cash.securityhub.viewmodels.RecoveryGuideSectionId;
import com.squareup.cash.securityhub.viewmodels.RecoveryGuideSectionViewModel;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class TextViewCompat$Api28Impl {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.InitiateDirectDepositManualForm.deepLinkSpecs;
    }

    public static final RecoveryGuideSectionViewModel getSupportSection(AndroidStringManager androidStringManager) {
        return new RecoveryGuideSectionViewModel(RecoveryGuideSectionId.GET_SUPPORT, androidStringManager.get(R.string.recovery_guide_section_get_support_title), null, new RecoveryGuideSectionViewModel.Content.Rows(CollectionsKt__CollectionsJVMKt.listOf(new RecoveryGuideRowViewModel(RecoveryGuideRowId.REPORT_AN_ISSUE, androidStringManager.get(R.string.recovery_guide_support_report_an_issue_title), androidStringManager.get(R.string.recovery_guide_support_report_an_issue_subtitle), true))));
    }

    public static final RecoveryGuideSectionViewModel protectYourselfSection(AndroidStringManager androidStringManager) {
        return new RecoveryGuideSectionViewModel(RecoveryGuideSectionId.PROTECT_YOURSELF, androidStringManager.get(R.string.recovery_guide_section_protect_yourself_title), null, new RecoveryGuideSectionViewModel.Content.Booklets(CollectionsKt__CollectionsKt.listOf((Object[]) new EducationCardUiModel[]{new EducationCardUiModel(EducationCardId.BUILT_IN_PROTECTIONS, androidStringManager.get(R.string.education_card_built_in_protections), TrustHubImageUrls.ARTICLE_PROTECTIONS), new EducationCardUiModel(EducationCardId.COMMON_SCAMS, androidStringManager.get(R.string.education_card_common_scams), TrustHubImageUrls.ARTICLE_COMMON_SCAMS), new EducationCardUiModel(EducationCardId.SPOT_SCAMS, androidStringManager.get(R.string.education_card_spot_scams), TrustHubImageUrls.ARTICLE_SPOT_SCAMS), new EducationCardUiModel(EducationCardId.PREVENT_FRAUD, androidStringManager.get(R.string.education_card_prevent_fraud), TrustHubImageUrls.ARTICLE_PREVENT_FRAUD), new EducationCardUiModel(EducationCardId.SECURITY_FEATURES, androidStringManager.get(R.string.education_card_security_features), TrustHubImageUrls.ARTICLE_SECURITY_FEATURES)})));
    }

    public static final RecoveryGuideSectionViewModel reportSection(AndroidStringManager androidStringManager, int i, int i2) {
        return new RecoveryGuideSectionViewModel(RecoveryGuideSectionId.REPORT, androidStringManager.get(i), androidStringManager.get(i2), new RecoveryGuideSectionViewModel.Content.Rows(CollectionsKt__CollectionsKt.listOf((Object[]) new RecoveryGuideRowViewModel[]{new RecoveryGuideRowViewModel(RecoveryGuideRowId.REPORT_TO_CASH_APP, androidStringManager.get(R.string.recovery_guide_report_to_cash_app_title), androidStringManager.get(R.string.recovery_guide_report_to_cash_app_subtitle), true), new RecoveryGuideRowViewModel(RecoveryGuideRowId.CONTACT_YOUR_BANK, androidStringManager.get(R.string.recovery_guide_report_contact_your_bank_title), androidStringManager.get(R.string.recovery_guide_report_contact_your_bank_subtitle), false), new RecoveryGuideRowViewModel(RecoveryGuideRowId.REPORT_TO_LOCAL_POLICE, androidStringManager.get(R.string.recovery_guide_report_to_local_police_title), androidStringManager.get(R.string.recovery_guide_report_to_local_police_subtitle), false), new RecoveryGuideRowViewModel(RecoveryGuideRowId.FILE_WITH_FTC, androidStringManager.get(R.string.recovery_guide_report_file_with_ftc_title), androidStringManager.get(R.string.recovery_guide_report_file_with_ftc_subtitle), true), new RecoveryGuideRowViewModel(RecoveryGuideRowId.FILE_WITH_FBI, androidStringManager.get(R.string.recovery_guide_report_file_with_fbi_title), androidStringManager.get(R.string.recovery_guide_report_file_with_fbi_subtitle), true)})));
    }

    public static void setFirstBaselineToTopHeight(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }
}
