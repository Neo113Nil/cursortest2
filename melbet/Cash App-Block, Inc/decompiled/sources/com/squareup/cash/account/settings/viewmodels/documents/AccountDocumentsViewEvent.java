package com.squareup.cash.account.settings.viewmodels.documents;

import androidx.appcompat.widget.AppCompatHintHelper;
import com.datadog.android.okhttp.TraceContext;
import com.squareup.protos.franklin.investing.resources.StatementType;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class AccountDocumentsViewEvent {

    public interface AccountStatementPayload {
    }

    public final class BannerClick extends AccountDocumentsViewEvent {
        public final StatementType statementType;

        public BannerClick(StatementType statementType) {
            this.statementType = statementType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BannerClick) && this.statementType == ((BannerClick) obj).statementType;
        }

        public final int hashCode() {
            StatementType statementType = this.statementType;
            if (statementType == null) {
                return 0;
            }
            return statementType.hashCode();
        }

        public final String toString() {
            return "BannerClick(statementType=" + this.statementType + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class DocumentCategory {
        public static final /* synthetic */ DocumentCategory[] $VALUES;
        public static final DocumentCategory AFTERPAY;
        public static final DocumentCategory BITCOIN;
        public static final DocumentCategory CARD_FEES;
        public static final DocumentCategory LEGAL;
        public static final DocumentCategory SAVINGS;
        public static final DocumentCategory STOCKS;
        public static final DocumentCategory TAX_RETURNS;
        public static final DocumentCategory WAGES;

        static {
            DocumentCategory documentCategory = new DocumentCategory("BITCOIN", 0);
            BITCOIN = documentCategory;
            DocumentCategory documentCategory2 = new DocumentCategory("STOCKS", 1);
            STOCKS = documentCategory2;
            DocumentCategory documentCategory3 = new DocumentCategory("TAX_RETURNS", 2);
            TAX_RETURNS = documentCategory3;
            DocumentCategory documentCategory4 = new DocumentCategory("SAVINGS", 3);
            SAVINGS = documentCategory4;
            DocumentCategory documentCategory5 = new DocumentCategory("LEGAL", 4);
            LEGAL = documentCategory5;
            DocumentCategory documentCategory6 = new DocumentCategory("PAY_OVER_TIME", 5);
            DocumentCategory documentCategory7 = new DocumentCategory("AFTERPAY", 6);
            AFTERPAY = documentCategory7;
            DocumentCategory documentCategory8 = new DocumentCategory("CARD_FEES", 7);
            CARD_FEES = documentCategory8;
            DocumentCategory documentCategory9 = new DocumentCategory("WAGES", 8);
            WAGES = documentCategory9;
            $VALUES = new DocumentCategory[]{documentCategory, documentCategory2, documentCategory3, documentCategory4, documentCategory5, documentCategory6, documentCategory7, documentCategory8, documentCategory9};
        }

        public static DocumentCategory valueOf(String str) {
            return (DocumentCategory) Enum.valueOf(DocumentCategory.class, str);
        }

        public static DocumentCategory[] values() {
            return (DocumentCategory[]) $VALUES.clone();
        }
    }

    public final class FooterClick extends AccountDocumentsViewEvent {
        public final String url;

        public FooterClick(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FooterClick) && Intrinsics.areEqual(this.url, ((FooterClick) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FooterClick(url=", this.url, ")");
        }
    }

    public final class NavigationClick extends AccountDocumentsViewEvent {
        public static final NavigationClick INSTANCE = new NavigationClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigationClick);
        }

        public final int hashCode() {
            return -1742913869;
        }

        public final String toString() {
            return "NavigationClick";
        }
    }

    public final class RecordClick extends AccountDocumentsViewEvent {
        public final AppCompatHintHelper payload;

        public RecordClick(AppCompatHintHelper appCompatHintHelper) {
            this.payload = appCompatHintHelper;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RecordClick) && this.payload.equals(((RecordClick) obj).payload);
        }

        public final int hashCode() {
            return this.payload.hashCode();
        }

        public final String toString() {
            return "RecordClick(payload=" + this.payload + ")";
        }
    }

    public final class SectionClick extends AccountDocumentsViewEvent {
        public final TraceContext payload;

        public SectionClick(TraceContext traceContext) {
            this.payload = traceContext;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SectionClick) && this.payload.equals(((SectionClick) obj).payload);
        }

        public final int hashCode() {
            return this.payload.hashCode();
        }

        public final String toString() {
            return "SectionClick(payload=" + this.payload + ")";
        }
    }
}
