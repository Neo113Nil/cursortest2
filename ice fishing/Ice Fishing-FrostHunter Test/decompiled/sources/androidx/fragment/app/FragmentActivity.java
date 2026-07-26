package androidx.fragment.app;

import android.content.Context;
import android.content.Context.FrostHunterFlowHyperionVortexDelta5013;
import android.content.Context.FrostHunterFragmentTransactionShadowOmega3645;
import android.content.Context.FrostHunterMaterialCardViewShadowBlazeBlaze3823;
import android.content.Context.FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849;
import android.content.Context.FrostHunterOnDeviceTranslatorDragonLegendFusion2692;
import android.content.Context.FrostHunterPaintPrimeUltraHero5427;
import android.content.Context.FrostHunterPropertyValuesHolderMaxSpeed2945;
import android.content.Context.FrostHunterResourceUltraSolarBeta9587;
import android.content.Context.FrostHunterRewardedAdAlphaPhoenixVortex4789;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r7.equals("--list-dumpables") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (r7.equals("--dump-dumpable") == false) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                        return;
                    }
                    break;
                case 100470631:
                    break;
                case 472614934:
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                        return;
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill") && Build.VERSION.SDK_INT >= 26) {
                        return;
                    }
                    break;
            }
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(false);
        printWriter.print(" mResumed=");
        printWriter.print(false);
        printWriter.print(" mStopped=");
        printWriter.print(true);
        if (getApplication() == null) {
            throw null;
        }
        FrostHunterPropertyValuesHolderMaxSpeed2945 FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterLevelListDrawableFusionDragonHero2232();
        FrostHunterLevelListDrawableFusionDragonHero2232.getClass();
        FrostHunterResourceUltraSolarBeta9587 frostHunterResourceUltraSolarBeta9587 = FrostHunterResourceUltraSolarBeta9587.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        frostHunterResourceUltraSolarBeta9587.getClass();
        FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 = new FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849(FrostHunterLevelListDrawableFusionDragonHero2232, FrostHunterPaintPrimeUltraHero5427.FrostHunterBundlePulseFusionHero2475, frostHunterResourceUltraSolarBeta9587);
        FrostHunterRewardedAdAlphaPhoenixVortex4789 FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterFragmentTransactionShadowOmega3645.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterPaintPrimeUltraHero5427.class);
        String FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        if (FrostHunterConstraintSetCloneMasterUltraRogue2633 == null) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Local and anonymous classes can not be ViewModels");
            return;
        }
        FrostHunterOnDeviceTranslatorDragonLegendFusion2692 frostHunterOnDeviceTranslatorDragonLegendFusion2692 = ((FrostHunterPaintPrimeUltraHero5427) frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterBitmapTurboDeltaNebula8743(FrostHunterAlphaAnimationNeoCosmos5761, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(FrostHunterConstraintSetCloneMasterUltraRogue2633))).FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (frostHunterOnDeviceTranslatorDragonLegendFusion2692.FrostHunterAlertDialogAuroraDelta3200 <= 0) {
            throw null;
        }
        printWriter.print(str3);
        printWriter.println("Loaders:");
        if (frostHunterOnDeviceTranslatorDragonLegendFusion2692.FrostHunterAlertDialogAuroraDelta3200 <= 0) {
            throw null;
        }
        if (frostHunterOnDeviceTranslatorDragonLegendFusion2692.FrostHunterServiceEliteCelestialThunder1757(0) != null) {
            FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterAlphaAnimationNeoCosmos5761();
            return;
        }
        printWriter.print(str3);
        printWriter.print("  #");
        printWriter.print(frostHunterOnDeviceTranslatorDragonLegendFusion2692.FrostHunterCameraXPixelTurboCosmos9814[0]);
        printWriter.print(": ");
        throw null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        throw null;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        throw null;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        throw null;
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        throw null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 6) {
            return false;
        }
        throw null;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        throw null;
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        throw null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        throw null;
    }

    @Override // android.app.Activity
    public final void onResume() {
        throw null;
    }

    @Override // android.app.Activity
    public final void onStart() {
        throw null;
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        throw null;
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        throw null;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        throw null;
    }
}
