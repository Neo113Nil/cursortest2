package androidx.navigation;

import android.os.Bundle;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class NavAction {
    public final int destinationId;
    public NavOptions navOptions = null;
    public Bundle defaultArguments = null;

    public NavAction(int i) {
        this.destinationId = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavAction)) {
            return false;
        }
        NavAction navAction = (NavAction) obj;
        if (this.destinationId != navAction.destinationId || !Intrinsics.areEqual(this.navOptions, navAction.navOptions)) {
            return false;
        }
        Bundle bundle = this.defaultArguments;
        Bundle bundle2 = navAction.defaultArguments;
        if (Intrinsics.areEqual(bundle, bundle2)) {
            return true;
        }
        return (bundle == null || bundle2 == null || !zzrl.contentDeepEquals$SavedStateReaderKt__SavedStateReader_androidKt(bundle, bundle2)) ? false : true;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.destinationId) * 31;
        NavOptions navOptions = this.navOptions;
        int hashCode2 = hashCode + (navOptions != null ? navOptions.hashCode() : 0);
        Bundle bundle = this.defaultArguments;
        if (bundle != null) {
            return zzrl.contentDeepHashCode$SavedStateReaderKt__SavedStateReader_androidKt(bundle) + (hashCode2 * 31);
        }
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavAction(0x");
        NavAction$$ExternalSyntheticOutline0.m(this.destinationId, ")", sb);
        if (this.navOptions != null) {
            sb.append(" navOptions=");
            sb.append(this.navOptions);
        }
        return sb.toString();
    }
}
