package kotlin.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class CatchingFishWidgetExoPlayer {
    public final float CatchingFishCoroutine;
    public final int CatchingFishDaggerWebsocket;
    public final float CatchingFishParcelableFAB;
    public final float CatchingFishReduxKtor;
    public final float CatchingFishSnackbar;

    public CatchingFishWidgetExoPlayer(Context context, XmlResourceParser xmlResourceParser) {
        this.CatchingFishParcelableFAB = Float.NaN;
        this.CatchingFishSnackbar = Float.NaN;
        this.CatchingFishCoroutine = Float.NaN;
        this.CatchingFishReduxKtor = Float.NaN;
        this.CatchingFishDaggerWebsocket = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), CatchingFishFluxAndroidX.CatchingFishFragmentHandler);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.CatchingFishDaggerWebsocket);
                this.CatchingFishDaggerWebsocket = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new CatchingFishAnimationBundle().CatchingFishSnackbar((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.CatchingFishReduxKtor = obtainStyledAttributes.getDimension(index, this.CatchingFishReduxKtor);
            } else if (index == 2) {
                this.CatchingFishSnackbar = obtainStyledAttributes.getDimension(index, this.CatchingFishSnackbar);
            } else if (index == 3) {
                this.CatchingFishCoroutine = obtainStyledAttributes.getDimension(index, this.CatchingFishCoroutine);
            } else if (index == 4) {
                this.CatchingFishParcelableFAB = obtainStyledAttributes.getDimension(index, this.CatchingFishParcelableFAB);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
