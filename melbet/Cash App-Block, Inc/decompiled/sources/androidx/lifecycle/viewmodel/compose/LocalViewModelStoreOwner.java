package androidx.lifecycle.viewmodel.compose;

import android.view.View;
import androidx.compose.material.TextKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import com.squareup.util.Strings;

/* loaded from: classes3.dex */
public abstract class LocalViewModelStoreOwner {
    public static final DynamicProvidableCompositionLocal LocalViewModelStoreOwner = new DynamicProvidableCompositionLocal(new TextKt$$ExternalSyntheticLambda0(26));

    public static ViewModelStoreOwner getCurrent(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) gapComposer.consume(LocalViewModelStoreOwner);
        if (viewModelStoreOwner == null) {
            gapComposer.startReplaceGroup(1260197608);
            viewModelStoreOwner = Strings.get((View) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalView));
        } else {
            gapComposer.startReplaceGroup(1260196492);
        }
        gapComposer.end(false);
        return viewModelStoreOwner;
    }
}
