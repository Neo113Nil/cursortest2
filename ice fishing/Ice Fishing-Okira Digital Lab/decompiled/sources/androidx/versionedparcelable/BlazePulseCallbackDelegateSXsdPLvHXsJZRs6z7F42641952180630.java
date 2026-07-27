package androidx.versionedparcelable;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.icecatchpuzzle.puzzleicecatch.R;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class BlazePulseCallbackDelegateSXsdPLvHXsJZRs6z7F42641952180630 {
    public static void AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(View view, XenoGridChannelSingletonM3gd2TaqjmOzoH8ZUi56369206476812 xenoGridChannelSingletonM3gd2TaqjmOzoH8ZUi56369206476812) {
        NovaLayerAttributeAPIXWijJbjaxPGopVu8bv13303294939505 novaLayerAttributeAPIXWijJbjaxPGopVu8bv13303294939505 = xenoGridChannelSingletonM3gd2TaqjmOzoH8ZUi56369206476812 != null ? new NovaLayerAttributeAPIXWijJbjaxPGopVu8bv13303294939505(view, xenoGridChannelSingletonM3gd2TaqjmOzoH8ZUi56369206476812) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, novaLayerAttributeAPIXWijJbjaxPGopVu8bv13303294939505);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (novaLayerAttributeAPIXWijJbjaxPGopVu8bv13303294939505 != null) {
            view.setOnApplyWindowInsetsListener(novaLayerAttributeAPIXWijJbjaxPGopVu8bv13303294939505);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    public static void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }
}
