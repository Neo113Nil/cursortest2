package androidx.core.widget;

import android.widget.PopupWindow;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class PopupWindowCompat {
    public static List getDeepLinkSpecs() {
        return ClientRoute.InitiateBitkeyAutoWithdraw.deepLinkSpecs;
    }

    public static void setWindowLayoutType(PopupWindow popupWindow) {
        popupWindow.setWindowLayoutType(2);
    }
}
