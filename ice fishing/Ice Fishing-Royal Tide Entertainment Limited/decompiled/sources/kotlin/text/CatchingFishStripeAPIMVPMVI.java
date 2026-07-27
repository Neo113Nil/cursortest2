package kotlin.text;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class CatchingFishStripeAPIMVPMVI {
    public final String CatchingFishParcelableFAB;
    public final CatchingFishServiceHilt CatchingFishSnackbar;

    public CatchingFishStripeAPIMVPMVI(Set set, CatchingFishServiceHilt catchingFishServiceHilt) {
        this.CatchingFishParcelableFAB = CatchingFishSnackbar(set);
        this.CatchingFishSnackbar = catchingFishServiceHilt;
    }

    public static String CatchingFishSnackbar(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            CatchingFishSpannableWidget catchingFishSpannableWidget = (CatchingFishSpannableWidget) it.next();
            sb.append(catchingFishSpannableWidget.CatchingFishParcelableFAB);
            sb.append('/');
            sb.append(catchingFishSpannableWidget.CatchingFishSnackbar);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String CatchingFishParcelableFAB() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        String str = this.CatchingFishParcelableFAB;
        CatchingFishServiceHilt catchingFishServiceHilt = this.CatchingFishSnackbar;
        synchronized (((HashSet) catchingFishServiceHilt.CatchingFishDaggerWebsocket)) {
            unmodifiableSet = Collections.unmodifiableSet((HashSet) catchingFishServiceHilt.CatchingFishDaggerWebsocket);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (((HashSet) catchingFishServiceHilt.CatchingFishDaggerWebsocket)) {
            unmodifiableSet2 = Collections.unmodifiableSet((HashSet) catchingFishServiceHilt.CatchingFishDaggerWebsocket);
        }
        sb.append(CatchingFishSnackbar(unmodifiableSet2));
        return sb.toString();
    }
}
