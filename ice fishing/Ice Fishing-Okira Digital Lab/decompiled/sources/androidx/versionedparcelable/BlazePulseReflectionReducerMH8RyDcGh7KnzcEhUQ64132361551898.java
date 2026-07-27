package androidx.versionedparcelable;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public class BlazePulseReflectionReducerMH8RyDcGh7KnzcEhUQ64132361551898 extends ObsidianEngineAbstractionStreamFKfQWwMgmmWPBFRauD96959591755676 {
    public final Window AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final WindowInsetsController ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public BlazePulseReflectionReducerMH8RyDcGh7KnzcEhUQ64132361551898(Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = insetsController;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = window;
    }

    @Override // androidx.versionedparcelable.ObsidianEngineAbstractionStreamFKfQWwMgmmWPBFRauD96959591755676
    public final void LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(boolean z) {
        Window window = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.setSystemBarsAppearance(0, 8);
    }

    @Override // androidx.versionedparcelable.ObsidianEngineAbstractionStreamFKfQWwMgmmWPBFRauD96959591755676
    public final void RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(boolean z) {
        Window window = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.setSystemBarsAppearance(0, 16);
    }
}
