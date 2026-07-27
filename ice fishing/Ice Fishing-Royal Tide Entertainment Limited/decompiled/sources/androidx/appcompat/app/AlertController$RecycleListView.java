package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import kotlin.text.CatchingFishWidgetGlide;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {
    public final int CatchingFishDaggerWebsocket;
    public final int CatchingFishReduxKtor;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CatchingFishWidgetGlide.CatchingFishJetpackCompose);
        this.CatchingFishDaggerWebsocket = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.CatchingFishReduxKtor = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
