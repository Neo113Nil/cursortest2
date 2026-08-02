package com.squareup.cash.account.settings.viewmodels.documents;

import androidx.appcompat.widget.AppCompatHintHelper;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.datadog.android.okhttp.TraceContext;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.arcade.Icons;
import com.squareup.protos.franklin.investing.resources.StatementType;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AccountDocumentsViewModel {
    public final List documents;
    public final String emptyStateDescription;
    public final boolean isLoading;
    public final StatementType statementType;
    public final String title;

    public abstract class DocumentModel {

        public final class BannerModel extends DocumentModel {
            public final String body;
            public final String buttonLabel;
            public final String title;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class BannerStyle {
                public static final /* synthetic */ BannerStyle[] $VALUES;
                public static final BannerStyle BITCOIN_TAXES;

                static {
                    BannerStyle bannerStyle = new BannerStyle("BITCOIN_TAXES", 0);
                    BITCOIN_TAXES = bannerStyle;
                    $VALUES = new BannerStyle[]{bannerStyle, new BannerStyle("DEFAULT", 1)};
                }

                public static BannerStyle valueOf(String str) {
                    return (BannerStyle) Enum.valueOf(BannerStyle.class, str);
                }

                public static BannerStyle[] values() {
                    return (BannerStyle[]) $VALUES.clone();
                }
            }

            public BannerModel(String str, String str2, String str3) {
                BannerStyle bannerStyle = BannerStyle.BITCOIN_TAXES;
                zzd zzdVar = Icons.Companion;
                re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
                this.title = str;
                this.body = str2;
                this.buttonLabel = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BannerModel)) {
                    return false;
                }
                BannerModel bannerModel = (BannerModel) obj;
                if (!Intrinsics.areEqual(this.title, bannerModel.title) || !Intrinsics.areEqual(this.body, bannerModel.body) || !Intrinsics.areEqual(this.buttonLabel, bannerModel.buttonLabel)) {
                    return false;
                }
                BannerStyle bannerStyle = BannerStyle.BITCOIN_TAXES;
                zzd zzdVar = Icons.Companion;
                return true;
            }

            public final int hashCode() {
                return Icons.Taxes24.hashCode() + ((BannerStyle.BITCOIN_TAXES.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body), 31, this.buttonLabel)) * 31);
            }

            public final String toString() {
                BannerStyle bannerStyle = BannerStyle.BITCOIN_TAXES;
                Icons icons = Icons.Taxes24;
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BannerModel(title=", this.title, ", body=", this.body, ", buttonLabel=");
                m.append(this.buttonLabel);
                m.append(", bannerStyle=");
                m.append(bannerStyle);
                m.append(", icon=");
                m.append(icons);
                m.append(")");
                return m.toString();
            }
        }

        public final class DisclosureModel extends DocumentModel {
            public final String markdownContent;

            public DisclosureModel(String str) {
                str.getClass();
                this.markdownContent = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DisclosureModel) && Intrinsics.areEqual(this.markdownContent, ((DisclosureModel) obj).markdownContent);
            }

            public final int hashCode() {
                return this.markdownContent.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DisclosureModel(markdownContent=", this.markdownContent, ")");
            }
        }

        public final class FooterModel extends DocumentModel {
            public final String buttonLabel;
            public final String label;
            public final String url;

            public FooterModel(String str, String str2, String str3) {
                str.getClass();
                str2.getClass();
                this.label = str;
                this.buttonLabel = str2;
                this.url = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FooterModel)) {
                    return false;
                }
                FooterModel footerModel = (FooterModel) obj;
                return Intrinsics.areEqual(this.label, footerModel.label) && Intrinsics.areEqual(this.buttonLabel, footerModel.buttonLabel) && this.url.equals(footerModel.url);
            }

            public final int hashCode() {
                return this.url.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.label.hashCode() * 31, 31, this.buttonLabel);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FooterModel(label=", this.label, ", buttonLabel=", this.buttonLabel, ", url="), this.url, ")");
            }
        }

        public final class HeaderModel extends DocumentModel {
            public final String label;

            public HeaderModel(String str) {
                str.getClass();
                this.label = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof HeaderModel) && Intrinsics.areEqual(this.label, ((HeaderModel) obj).label);
            }

            public final int hashCode() {
                return this.label.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("HeaderModel(label=", this.label, ")");
            }
        }

        public final class RecordModel extends DocumentModel {
            public final String label;
            public final AppCompatHintHelper payload;

            public RecordModel(String str, AppCompatHintHelper appCompatHintHelper) {
                str.getClass();
                this.label = str;
                this.payload = appCompatHintHelper;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RecordModel)) {
                    return false;
                }
                RecordModel recordModel = (RecordModel) obj;
                return Intrinsics.areEqual(this.label, recordModel.label) && this.payload.equals(recordModel.payload);
            }

            public final int hashCode() {
                return this.payload.hashCode() + (this.label.hashCode() * 31);
            }

            public final String toString() {
                return "RecordModel(label=" + this.label + ", payload=" + this.payload + ")";
            }
        }

        public final class SectionModel extends DocumentModel {
            public final String label;
            public final TraceContext payload;

            public SectionModel(String str, TraceContext traceContext) {
                str.getClass();
                this.label = str;
                this.payload = traceContext;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SectionModel)) {
                    return false;
                }
                SectionModel sectionModel = (SectionModel) obj;
                return Intrinsics.areEqual(this.label, sectionModel.label) && this.payload.equals(sectionModel.payload);
            }

            public final int hashCode() {
                return this.payload.hashCode() + (this.label.hashCode() * 31);
            }

            public final String toString() {
                return "SectionModel(label=" + this.label + ", payload=" + this.payload + ")";
            }
        }
    }

    public /* synthetic */ AccountDocumentsViewModel(String str, List list, StatementType statementType, String str2, int i) {
        this(str, list, (i & 4) == 0, (i & 8) != 0 ? null : statementType, (i & 16) != 0 ? null : str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountDocumentsViewModel)) {
            return false;
        }
        AccountDocumentsViewModel accountDocumentsViewModel = (AccountDocumentsViewModel) obj;
        return Intrinsics.areEqual(this.title, accountDocumentsViewModel.title) && Intrinsics.areEqual(this.documents, accountDocumentsViewModel.documents) && this.isLoading == accountDocumentsViewModel.isLoading && this.statementType == accountDocumentsViewModel.statementType && Intrinsics.areEqual(this.emptyStateDescription, accountDocumentsViewModel.emptyStateDescription);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(this.title.hashCode() * 31, 31, this.documents), 31, this.isLoading);
        StatementType statementType = this.statementType;
        int hashCode = (m + (statementType == null ? 0 : statementType.hashCode())) * 31;
        String str = this.emptyStateDescription;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("AccountDocumentsViewModel(title=", this.title, ", documents=", ", isLoading=", this.documents);
        m.append(this.isLoading);
        m.append(", statementType=");
        m.append(this.statementType);
        m.append(", emptyStateDescription=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.emptyStateDescription, ")");
    }

    public AccountDocumentsViewModel(String str, List list, boolean z, StatementType statementType, String str2) {
        str.getClass();
        list.getClass();
        this.title = str;
        this.documents = list;
        this.isLoading = z;
        this.statementType = statementType;
        this.emptyStateDescription = str2;
    }
}
