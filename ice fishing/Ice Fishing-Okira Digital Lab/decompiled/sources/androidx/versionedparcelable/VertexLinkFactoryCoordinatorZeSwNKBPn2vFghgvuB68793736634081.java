package androidx.versionedparcelable;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public class VertexLinkFactoryCoordinatorZeSwNKBPn2vFghgvuB68793736634081 extends ObsidianEngineAbstractionStreamFKfQWwMgmmWPBFRauD96959591755676 {
    public final Window ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public VertexLinkFactoryCoordinatorZeSwNKBPn2vFghgvuB68793736634081(Window window) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = window;
    }

    @Override // androidx.versionedparcelable.ObsidianEngineAbstractionStreamFKfQWwMgmmWPBFRauD96959591755676
    public final void LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(boolean z) {
        Window window = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        if (!z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
    }
}
