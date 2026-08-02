package app.cash.local.viewmodels.sheet;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.local.primitives.ShortlinkKey;
import com.squareup.cash.clientroutes.ClientRoute;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class EducationalButtonAction {

    public final class ClientRoute extends EducationalButtonAction {
        public final String value;

        public ClientRoute(String str) {
            str.getClass();
            this.value = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClientRoute) && Intrinsics.areEqual(this.value, ((ClientRoute) obj).value);
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ClientRoute(value=", this.value, ")");
        }
    }

    public final class Dismiss extends EducationalButtonAction {
        public static final Dismiss INSTANCE = new Dismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return 1709724122;
        }

        public final String toString() {
            return "Dismiss";
        }
    }

    public final class Paginate extends EducationalButtonAction {
        public static final Paginate INSTANCE = new Paginate();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Paginate);
        }

        public final int hashCode() {
            return 2043520807;
        }

        public final String toString() {
            return "Paginate";
        }
    }

    public final class Shortlink extends EducationalButtonAction {
        public final String nextShortlinkFlowState;
        public final String shortlinkKey;

        public Shortlink(String str, String str2) {
            str.getClass();
            this.shortlinkKey = str;
            this.nextShortlinkFlowState = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Shortlink)) {
                return false;
            }
            Shortlink shortlink = (Shortlink) obj;
            return Intrinsics.areEqual(this.shortlinkKey, shortlink.shortlinkKey) && Intrinsics.areEqual(this.nextShortlinkFlowState, shortlink.nextShortlinkFlowState);
        }

        public final int hashCode() {
            int hashCode = this.shortlinkKey.hashCode() * 31;
            String str = this.nextShortlinkFlowState;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Shortlink(shortlinkKey=", ShortlinkKey.m1285toStringimpl(this.shortlinkKey), ", nextShortlinkFlowState=", this.nextShortlinkFlowState, ")");
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewDocumentAfterpayStatements.deepLinkSpecs;
    }
}
