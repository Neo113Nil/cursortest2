package coil3.request;

import android.view.View;
import com.squareup.cash.R;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class ViewTargetRequestManagerKt {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewInvestingRoundups.deepLinkSpecs;
    }

    public static final ViewTargetRequestManager getRequestManager(View view) {
        ViewTargetRequestManager viewTargetRequestManager;
        Object tag = view.getTag(R.id.coil3_request_manager);
        ViewTargetRequestManager viewTargetRequestManager2 = tag instanceof ViewTargetRequestManager ? (ViewTargetRequestManager) tag : null;
        if (viewTargetRequestManager2 != null) {
            return viewTargetRequestManager2;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(R.id.coil3_request_manager);
                viewTargetRequestManager = tag2 instanceof ViewTargetRequestManager ? (ViewTargetRequestManager) tag2 : null;
                if (viewTargetRequestManager == null) {
                    viewTargetRequestManager = new ViewTargetRequestManager(view);
                    view.addOnAttachStateChangeListener(viewTargetRequestManager);
                    view.setTag(R.id.coil3_request_manager, viewTargetRequestManager);
                }
            } finally {
            }
        }
        return viewTargetRequestManager;
    }
}
