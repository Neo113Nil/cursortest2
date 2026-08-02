package ru.CryptoPro.JCSP.api.bio;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ru.CryptoPro.JCSP.api.bio.event.CspBioChangeMaxEvent;
import ru.CryptoPro.JCSP.api.bio.event.CspBioChangeProgressEvent;
import ru.CryptoPro.JCSP.tools.common.window.CspBioDialogController;

/* loaded from: classes4.dex */
public abstract class CspBaseBioGuiCustomizer implements CspBioGuiCustomizer {
    protected CspBioDialogController bioDialogController;
    protected Context context;
    protected CspBioParameters cspBioParameters;

    @Override // ru.CryptoPro.JCSP.api.bio.CspBioGuiCustomizer
    public void cancel() {
        this.bioDialogController.cancel();
    }

    @Override // ru.CryptoPro.JCSP.api.bio.CspBioGuiCustomizer
    public abstract /* synthetic */ int getBioRandomViewId();

    @Override // ru.CryptoPro.JCSP.api.bio.CspBioGuiCustomizer
    public void onCreate(Context context, CspBioDialogController cspBioDialogController) {
        this.context = context;
        this.bioDialogController = cspBioDialogController;
    }

    @Override // ru.CryptoPro.JCSP.api.bio.CspBioGuiCustomizer
    public abstract /* synthetic */ Dialog onCreateDialog(Bundle bundle);

    @Override // ru.CryptoPro.JCSP.api.bio.CspBioGuiCustomizer
    public abstract /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    @Override // ru.CryptoPro.JCSP.api.bio.CspBioGuiCustomizer
    public void onLoadParameters(CspBioParameters cspBioParameters) {
        this.cspBioParameters = cspBioParameters;
    }

    @Override // ru.CryptoPro.JCSP.api.bio.CspBioGuiCustomizer, ru.CryptoPro.JCSP.api.bio.CspBioEventListener
    public abstract /* synthetic */ void onMaxChanged(CspBioChangeMaxEvent cspBioChangeMaxEvent);

    @Override // ru.CryptoPro.JCSP.api.bio.CspBioGuiCustomizer, ru.CryptoPro.JCSP.api.bio.CspBioEventListener
    public abstract /* synthetic */ void onProgressChanged(CspBioChangeProgressEvent cspBioChangeProgressEvent);

    @Override // ru.CryptoPro.JCSP.api.bio.CspBioGuiCustomizer
    public abstract /* synthetic */ void onSaveInstanceState(Bundle bundle);
}
