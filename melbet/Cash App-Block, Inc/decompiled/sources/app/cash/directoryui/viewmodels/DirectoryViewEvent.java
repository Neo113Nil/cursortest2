package app.cash.directoryui.viewmodels;

import com.squareup.cash.db.contacts.Recipient;

/* loaded from: classes3.dex */
public interface DirectoryViewEvent {

    public interface DirectoryItemViewEvent extends DirectoryViewEvent {

        public final class ActionClick implements DirectoryItemViewEvent, DirectoryViewEvent {
            public final String actionUrl;
            public final DirectoryAnalyticsData analyticsData;

            public ActionClick(String str, DirectoryAnalyticsData directoryAnalyticsData, Recipient recipient) {
                recipient.getClass();
                this.actionUrl = str;
                this.analyticsData = directoryAnalyticsData;
            }
        }

        public final class AnalyticsEvent implements DirectoryItemViewEvent, DirectoryViewEvent {
            public final DirectoryAnalyticsData data;

            public AnalyticsEvent(DirectoryAnalyticsData directoryAnalyticsData) {
                this.data = directoryAnalyticsData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AnalyticsEvent) && this.data.equals(((AnalyticsEvent) obj).data);
            }

            public final int hashCode() {
                return this.data.hashCode();
            }

            public final String toString() {
                return "AnalyticsEvent(data=" + this.data + ")";
            }
        }

        public final class MissingMetadataEvent implements DirectoryItemViewEvent, DirectoryViewEvent {
            public final MissingMetadata metadata;

            public MissingMetadataEvent(MissingMetadata missingMetadata) {
                this.metadata = missingMetadata;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MissingMetadataEvent) && this.metadata.equals(((MissingMetadataEvent) obj).metadata);
            }

            public final int hashCode() {
                return this.metadata.hashCode();
            }

            public final String toString() {
                return "MissingMetadataEvent(metadata=" + this.metadata + ")";
            }
        }

        public final class SectionView implements DirectoryItemViewEvent, DirectoryViewEvent {
            public final DirectoryAnalyticsData data;

            public SectionView(DirectoryAnalyticsData directoryAnalyticsData) {
                directoryAnalyticsData.getClass();
                this.data = directoryAnalyticsData;
            }
        }
    }
}
