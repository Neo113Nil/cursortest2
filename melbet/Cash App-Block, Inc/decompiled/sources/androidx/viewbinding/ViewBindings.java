package androidx.viewbinding;

import android.view.View;
import android.view.ViewGroup;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class ViewBindings {
    public static final String buildInitiationData(Flow$Type flow$Type, Message message) {
        flow$Type.getClass();
        message.getClass();
        String base64Url = message.encodeByteString().base64Url();
        flow$Type.getClass();
        base64Url.getClass();
        return Recorder$$ExternalSyntheticOutline2.m(flow$Type.name(), "?params=", base64Url);
    }

    public static View findChildViewById(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View findViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewBoostPicker.deepLinkSpecs;
    }
}
