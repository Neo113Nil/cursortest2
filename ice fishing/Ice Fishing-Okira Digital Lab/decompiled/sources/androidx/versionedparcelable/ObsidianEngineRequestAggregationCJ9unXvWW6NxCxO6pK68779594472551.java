package androidx.versionedparcelable;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import com.icecatchpuzzle.puzzleicecatch.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class ObsidianEngineRequestAggregationCJ9unXvWW6NxCxO6pK68779594472551 {
    public static final /* synthetic */ int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = 0;

    static {
        new WeakHashMap();
    }

    public static void ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(View view, LunarNodeObjectObjectQgXbsfqVqhvAjE6JeW45008419743283 lunarNodeObjectObjectQgXbsfqVqhvAjE6JeW45008419743283) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(lunarNodeObjectObjectQgXbsfqVqhvAjE6JeW45008419743283 != null ? new RapidLogicEncryptionChannelNXaiZDGcG91qXCNvrg15875028284247(lunarNodeObjectObjectQgXbsfqVqhvAjE6JeW45008419743283) : null);
            return;
        }
        PathInterpolator pathInterpolator = DragonRouteEncryptionFunctionJ2BNn1e8kOcd7r6Ufp87565523347357.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        View.OnApplyWindowInsetsListener solarMeshParserContainerOsc09Oralx1i5CYD9E41634279416902 = lunarNodeObjectObjectQgXbsfqVqhvAjE6JeW45008419743283 != null ? new SolarMeshParserContainerOsc09Oralx1i5CYD9E41634279416902(view, lunarNodeObjectObjectQgXbsfqVqhvAjE6JeW45008419743283) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, solarMeshParserContainerOsc09Oralx1i5CYD9E41634279416902);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(solarMeshParserContainerOsc09Oralx1i5CYD9E41634279416902);
        }
    }

    public static void AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(ViewGroup viewGroup, AxiomCoreBuilderNamespaceKyvsok5t34Z6Vt7XY643022687390460 axiomCoreBuilderNamespaceKyvsok5t34Z6Vt7XY643022687390460) {
        if (viewGroup.getImportantForAccessibility() == 0) {
            viewGroup.setImportantForAccessibility(1);
        }
        viewGroup.setAccessibilityDelegate(axiomCoreBuilderNamespaceKyvsok5t34Z6Vt7XY643022687390460.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x003d, code lost:
    
        if (r3 == 9) goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(View view, int i) {
        int i2;
        if (i != -1) {
            int i3 = Build.VERSION.SDK_INT;
            i2 = 6;
            if (i3 < 34) {
                switch (i) {
                    case 21:
                    case 23:
                    case 26:
                        i = 6;
                        break;
                    case 22:
                    case 24:
                    case 27:
                        i = 4;
                        break;
                    case 25:
                        i = 0;
                        break;
                }
            }
            if (i3 < 30) {
                if (i != 12) {
                    if (i != 13) {
                        if (i != 16) {
                            if (i == 17) {
                                i2 = 0;
                            }
                        }
                    }
                    if (i3 < 27) {
                        if (i2 == 7) {
                            if (i2 == 8) {
                            }
                        }
                    }
                    if (i2 != -1) {
                        return;
                    }
                    view.performHapticFeedback(i2);
                    return;
                }
                i2 = 1;
                if (i3 < 27) {
                }
                if (i2 != -1) {
                }
            }
            i2 = i;
            if (i3 < 27) {
            }
            if (i2 != -1) {
            }
        }
        i2 = -1;
        if (i2 != -1) {
        }
    }
}
