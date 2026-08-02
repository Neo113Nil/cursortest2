package ru.CryptoPro.JCSP.tools.common.window;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowMetrics;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentActivity;
import defpackage.ci8;
import defpackage.g9h;
import defpackage.rch0;
import defpackage.woh0;
import ru.CryptoPro.JCSP.api.bio.CspBaseBioGuiCustomizer;
import ru.CryptoPro.JCSP.api.bio.CspBioProgressConstants;
import ru.CryptoPro.JCSP.api.bio.event.CspBioChangeMaxEvent;
import ru.CryptoPro.JCSP.api.bio.event.CspBioChangeProgressEvent;

/* loaded from: classes4.dex */
public class DefaultCspBioGuiCustomizer extends CspBaseBioGuiCustomizer implements CspBioProgressConstants {
    private static final int SCREEN_HEIGHT_SMALL = 470;
    private static final int SCREEN_WIDTH_SMALL = 600;
    private ProgressBar bioBar = null;

    public static boolean isSmallScreen(Context context) {
        int i;
        int i2;
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        WindowInsets windowInsets;
        int systemBars;
        int displayCutout;
        Insets insetsIgnoringVisibility;
        FragmentActivity fragmentActivity = (FragmentActivity) context;
        if (Build.VERSION.SDK_INT >= 30) {
            currentWindowMetrics = fragmentActivity.getWindowManager().getCurrentWindowMetrics();
            bounds = currentWindowMetrics.getBounds();
            windowInsets = currentWindowMetrics.getWindowInsets();
            systemBars = WindowInsets.Type.systemBars();
            displayCutout = WindowInsets.Type.displayCutout();
            insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(systemBars | displayCutout);
            i = (bounds.height() - insetsIgnoringVisibility.bottom) - insetsIgnoringVisibility.top;
            i2 = (bounds.width() - insetsIgnoringVisibility.left) - insetsIgnoringVisibility.right;
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            fragmentActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            i = displayMetrics.heightPixels;
            i2 = displayMetrics.widthPixels;
        }
        return ((float) i) / context.getResources().getDisplayMetrics().density < 470.0f && ((float) i2) / context.getResources().getDisplayMetrics().density < 600.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$0(View view) {
        cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$onCreateView$1(View view, int i, KeyEvent keyEvent) {
        return ((CSPBio) this.bioDialogController).keyBackController(i, keyEvent);
    }

    @Override // ru.CryptoPro.JCSP.api.bio.CspBaseBioGuiCustomizer, ru.CryptoPro.JCSP.api.bio.CspBioGuiCustomizer
    public int getBioRandomViewId() {
        return rch0.bioFrameLayout;
    }

    @Override // ru.CryptoPro.JCSP.api.bio.CspBaseBioGuiCustomizer, ru.CryptoPro.JCSP.api.bio.CspBioGuiCustomizer
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onSuperCreateDialog = this.bioDialogController.onSuperCreateDialog(bundle);
        onSuperCreateDialog.requestWindowFeature(1);
        return onSuperCreateDialog;
    }

    @Override // ru.CryptoPro.JCSP.api.bio.CspBaseBioGuiCustomizer, ru.CryptoPro.JCSP.api.bio.CspBioGuiCustomizer
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(isSmallScreen(this.context) ? woh0.fragment_csp_bio_small_screen : woh0.fragment_csp_bio, viewGroup, false);
        ProgressBar progressBar = (ProgressBar) inflate.findViewById(rch0.pbBioBar);
        this.bioBar = progressBar;
        progressBar.setMax(this.cspBioParameters.getMax());
        this.bioBar.setProgress(this.cspBioParameters.getProgress());
        ((Button) inflate.findViewById(rch0.btCancel)).setOnClickListener(new ci8(26, this));
        inflate.setOnKeyListener(new g9h(0, this));
        return inflate;
    }

    @Override // ru.CryptoPro.JCSP.api.bio.CspBaseBioGuiCustomizer, ru.CryptoPro.JCSP.api.bio.CspBioGuiCustomizer, ru.CryptoPro.JCSP.api.bio.CspBioEventListener
    public void onMaxChanged(CspBioChangeMaxEvent cspBioChangeMaxEvent) {
        this.bioBar.setMax(cspBioChangeMaxEvent.getMax());
    }

    @Override // ru.CryptoPro.JCSP.api.bio.CspBaseBioGuiCustomizer, ru.CryptoPro.JCSP.api.bio.CspBioGuiCustomizer, ru.CryptoPro.JCSP.api.bio.CspBioEventListener
    public void onProgressChanged(CspBioChangeProgressEvent cspBioChangeProgressEvent) {
        this.bioBar.setProgress(cspBioChangeProgressEvent.getProgress());
    }

    @Override // ru.CryptoPro.JCSP.api.bio.CspBaseBioGuiCustomizer, ru.CryptoPro.JCSP.api.bio.CspBioGuiCustomizer
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("progress", this.bioBar.getProgress());
        bundle.putInt(CspBioProgressConstants.MAX, this.bioBar.getMax());
        this.bioDialogController.onSuperSaveInstanceState(bundle);
    }
}
