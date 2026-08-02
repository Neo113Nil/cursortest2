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
public interface CspBioGuiCustomizer extends CspBioEventListener {
    void cancel();

    int getBioRandomViewId();

    void onCreate(Context context, CspBioDialogController cspBioDialogController);

    Dialog onCreateDialog(Bundle bundle);

    View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    void onLoadParameters(CspBioParameters cspBioParameters);

    @Override // ru.CryptoPro.JCSP.api.bio.CspBioEventListener
    /* synthetic */ void onMaxChanged(CspBioChangeMaxEvent cspBioChangeMaxEvent);

    @Override // ru.CryptoPro.JCSP.api.bio.CspBioEventListener
    /* synthetic */ void onProgressChanged(CspBioChangeProgressEvent cspBioChangeProgressEvent);

    void onSaveInstanceState(Bundle bundle);
}
