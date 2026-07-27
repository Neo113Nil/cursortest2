package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.versionedparcelable.AxiomCoreContextGatewayHG3XGCTnCCPBbBaMe245429917137328;
import androidx.versionedparcelable.GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246;
import androidx.versionedparcelable.QuantumStreamCoordinatorMiddlewareTSKOIWMnVaRUGXK2sn54610037750220;
import androidx.versionedparcelable.YellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r6.equals("--list-dumpables") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (r6.equals("--dump-dumpable") == false) goto L37;
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
        AxiomCoreContextGatewayHG3XGCTnCCPBbBaMe245429917137328 axiomCoreContextGatewayHG3XGCTnCCPBbBaMe245429917137328 = ((QuantumStreamCoordinatorMiddlewareTSKOIWMnVaRUGXK2sn54610037750220) new YellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412(this, LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119()).YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170).AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        if (axiomCoreContextGatewayHG3XGCTnCCPBbBaMe245429917137328.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 <= 0) {
            throw null;
        }
        printWriter.print(str3);
        printWriter.println("Loaders:");
        if (axiomCoreContextGatewayHG3XGCTnCCPBbBaMe245429917137328.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 <= 0) {
            throw null;
        }
        if (axiomCoreContextGatewayHG3XGCTnCCPBbBaMe245429917137328.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(0) != null) {
            GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333();
            return;
        }
        printWriter.print(str3);
        printWriter.print("  #");
        printWriter.print(axiomCoreContextGatewayHG3XGCTnCCPBbBaMe245429917137328.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867[0]);
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
