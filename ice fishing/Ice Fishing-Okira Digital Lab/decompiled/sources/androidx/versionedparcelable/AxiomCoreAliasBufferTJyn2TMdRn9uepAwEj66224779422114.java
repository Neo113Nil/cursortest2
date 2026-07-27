package androidx.versionedparcelable;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class AxiomCoreAliasBufferTJyn2TMdRn9uepAwEj66224779422114 extends WhiteFieldClosureVectorV90NGNIy3LMp3zZnTJ72513326892253 {
    public View YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    @Override // androidx.versionedparcelable.WhiteFieldClosureVectorV90NGNIy3LMp3zZnTJ72513326892253
    public final void CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927() {
        int ime;
        View view = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController != null) {
            ime = WindowInsets.Type.ime();
            windowInsetsController.show(ime);
        }
        super.CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.versionedparcelable.ArcticByteTokenGenericJy2oaEbgAiJMyZBPFx23284209979247] */
    @Override // androidx.versionedparcelable.WhiteFieldClosureVectorV90NGNIy3LMp3zZnTJ72513326892253
    public final void ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111() {
        int ime;
        View view = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController == null) {
            super.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111();
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ?? r3 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.versionedparcelable.ArcticByteTokenGenericJy2oaEbgAiJMyZBPFx23284209979247
            @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
            public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i) {
                atomicBoolean.set((i & 8) != 0);
            }
        };
        windowInsetsController.addOnControllableInsetsChangedListener(r3);
        if (!atomicBoolean.get() && view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        windowInsetsController.removeOnControllableInsetsChangedListener(r3);
        ime = WindowInsets.Type.ime();
        windowInsetsController.hide(ime);
    }
}
