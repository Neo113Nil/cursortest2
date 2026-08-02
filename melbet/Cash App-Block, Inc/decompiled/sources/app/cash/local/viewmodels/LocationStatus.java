package app.cash.local.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.cash.local.client.v1.LocalText;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class LocationStatus {

    public final class Closed extends LocationStatus {
        public final String description;
        public final String label;

        public Closed(String str, String str2) {
            str.getClass();
            this.label = str;
            this.description = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Closed)) {
                return false;
            }
            Closed closed = (Closed) obj;
            return Intrinsics.areEqual(this.label, closed.label) && Intrinsics.areEqual(this.description, closed.description);
        }

        @Override // app.cash.local.viewmodels.LocationStatus
        public final String getDescription() {
            return this.description;
        }

        @Override // app.cash.local.viewmodels.LocationStatus
        public final LocalText getEstimatedWaitTime() {
            return null;
        }

        @Override // app.cash.local.viewmodels.LocationStatus
        public final String getLabel() {
            return this.label;
        }

        public final int hashCode() {
            int hashCode = this.label.hashCode() * 31;
            String str = this.description;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Closed(label=", this.label, ", description=", this.description, ")");
        }
    }

    public final class TemporarilyDisabled extends LocationStatus {
        public final String label;

        public TemporarilyDisabled(String str) {
            str.getClass();
            this.label = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TemporarilyDisabled) && Intrinsics.areEqual(this.label, ((TemporarilyDisabled) obj).label);
        }

        @Override // app.cash.local.viewmodels.LocationStatus
        public final String getDescription() {
            return null;
        }

        @Override // app.cash.local.viewmodels.LocationStatus
        public final LocalText getEstimatedWaitTime() {
            return null;
        }

        @Override // app.cash.local.viewmodels.LocationStatus
        public final String getLabel() {
            return this.label;
        }

        public final int hashCode() {
            return this.label.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TemporarilyDisabled(label=", this.label, ")");
        }
    }

    public final class Unknown extends LocationStatus {
        public final String description;

        public Unknown(String str) {
            this.description = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown) && Intrinsics.areEqual(this.description, ((Unknown) obj).description);
        }

        @Override // app.cash.local.viewmodels.LocationStatus
        public final String getDescription() {
            return this.description;
        }

        @Override // app.cash.local.viewmodels.LocationStatus
        public final LocalText getEstimatedWaitTime() {
            return null;
        }

        @Override // app.cash.local.viewmodels.LocationStatus
        public final String getLabel() {
            return "";
        }

        public final int hashCode() {
            String str = this.description;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Unknown(description=", this.description, ")");
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewDirectDepositSetup.deepLinkSpecs;
    }

    public abstract String getDescription();

    public abstract LocalText getEstimatedWaitTime();

    public abstract String getLabel();

    public final class Open extends LocationStatus {
        public final String description;
        public final LocalText estimatedWaitTime;
        public final String label;

        public Open(LocalText localText, String str, String str2) {
            str.getClass();
            this.label = str;
            this.description = str2;
            this.estimatedWaitTime = localText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Open)) {
                return false;
            }
            Open open = (Open) obj;
            return Intrinsics.areEqual(this.label, open.label) && Intrinsics.areEqual(this.description, open.description) && Intrinsics.areEqual(this.estimatedWaitTime, open.estimatedWaitTime);
        }

        @Override // app.cash.local.viewmodels.LocationStatus
        public final String getDescription() {
            return this.description;
        }

        @Override // app.cash.local.viewmodels.LocationStatus
        public final LocalText getEstimatedWaitTime() {
            return this.estimatedWaitTime;
        }

        @Override // app.cash.local.viewmodels.LocationStatus
        public final String getLabel() {
            return this.label;
        }

        public final int hashCode() {
            int hashCode = this.label.hashCode() * 31;
            String str = this.description;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            LocalText localText = this.estimatedWaitTime;
            return hashCode2 + (localText != null ? localText.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Open(label=", this.label, ", description=", this.description, ", estimatedWaitTime=");
            m.append(this.estimatedWaitTime);
            m.append(")");
            return m.toString();
        }

        public /* synthetic */ Open(String str, String str2, int i) {
            this((LocalText) null, str, (i & 2) != 0 ? null : str2);
        }
    }
}
