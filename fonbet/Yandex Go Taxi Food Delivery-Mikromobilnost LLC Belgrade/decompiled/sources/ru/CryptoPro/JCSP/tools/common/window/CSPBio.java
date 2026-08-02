package ru.CryptoPro.JCSP.tools.common.window;

import android.app.Dialog;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.atomic.AtomicReference;
import ru.CryptoPro.JCSP.api.bio.CspBioGuiCustomizer;
import ru.CryptoPro.JCSP.api.bio.CspBioGuiCustomizerFactory;
import ru.CryptoPro.JCSP.api.bio.CspBioParameters;
import ru.CryptoPro.JCSP.api.bio.CspBioProgressConstants;
import ru.CryptoPro.JCSP.api.bio.event.CspBioChangeMaxEvent;
import ru.CryptoPro.JCSP.api.bio.event.CspBioChangeProgressEvent;
import ru.CryptoPro.JCSP.tools.common.window.elements.BioRndView;
import ru.CryptoPro.JCSP.tools.common.window.elements.CspBioProgressController;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes4.dex */
public class CSPBio extends CSPDialog implements RemoteBioParameters, CspBioDialogController, CspBioProgressConstants {
    private static final AtomicReference<CspBioGuiCustomizerFactory> bioGuiCustomizerFactory = new AtomicReference<>(new DefaultCspBioGuiCustomizerFactory());
    private BioRndView tvBioInfo = null;
    private final CspBioGuiCustomizer bioGuiCustomizer = bioGuiCustomizerFactory.get().createInstance();

    public static native int onTouchEvent(int i, int i2, long j, int[] iArr);

    public static void register(CspBioGuiCustomizerFactory cspBioGuiCustomizerFactory) {
        bioGuiCustomizerFactory.set(cspBioGuiCustomizerFactory);
    }

    @Override // ru.CryptoPro.JCSP.tools.common.window.CspBioDialogController
    public void cancel() {
        BioRndView bioRndView = this.tvBioInfo;
        if (bioRndView != null) {
            bioRndView.setFinished();
        }
        endDialog(1, null);
    }

    @Override // ru.CryptoPro.JCSP.tools.common.window.CSPDialog
    public void createCustomizer() {
        this.bioGuiCustomizer.onCreate(requireActivity(), this);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        return this.bioGuiCustomizer.onCreateDialog(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        int i3 = 0;
        if (bundle == null) {
            Bundle bundle2 = this.bundle;
            if (bundle2 == null) {
                i2 = 0;
                CspBioParameters cspBioParameters = new CspBioParameters();
                cspBioParameters.setMax(i3);
                cspBioParameters.setProgress(i2);
                this.bioGuiCustomizer.onLoadParameters(cspBioParameters);
                View onCreateView = this.bioGuiCustomizer.onCreateView(layoutInflater, viewGroup, bundle);
                BioRndView bioRndView = (BioRndView) onCreateView.findViewById(this.bioGuiCustomizer.getBioRandomViewId());
                this.tvBioInfo = bioRndView;
                bioRndView.setBioProgressController(new CspBioProgressController() { // from class: ru.CryptoPro.JCSP.tools.common.window.CSPBio.1
                    @Override // ru.CryptoPro.JCSP.tools.common.window.elements.CspBioProgressController, ru.CryptoPro.JCSP.tools.common.window.elements.ICSPBioProgressController
                    public void setMax(int i4) {
                        CSPBio.this.bioGuiCustomizer.onMaxChanged(new CspBioChangeMaxEvent(i4));
                    }

                    @Override // ru.CryptoPro.JCSP.tools.common.window.elements.CspBioProgressController, ru.CryptoPro.JCSP.tools.common.window.elements.ICSPBioProgressController
                    public void setProgress(int i4) {
                        CSPBio.this.bioGuiCustomizer.onProgressChanged(new CspBioChangeProgressEvent(i4));
                    }
                });
                this.tvBioInfo.setDialogController(new ICSPBioController() { // from class: ru.CryptoPro.JCSP.tools.common.window.CSPBio.2
                    @Override // ru.CryptoPro.JCSP.tools.common.window.ICSPDialogController
                    public void endDialog(int i4, String str) {
                        CSPBio.this.endDialog(i4, null);
                    }

                    @Override // ru.CryptoPro.JCSP.tools.common.window.ICSPBioController
                    public int onTouch(int i4, int i5, long j, int[] iArr) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putInt("type", -2);
                        bundle3.putInt(RemoteBioParameters.X, i4);
                        bundle3.putInt(RemoteBioParameters.Y, i5);
                        bundle3.putLong(RemoteBioParameters.TIME, j);
                        try {
                            CSPBio.this.remoteCallback.sendResult(bundle3);
                            int i6 = bundle3.getInt(RemoteBioParameters.BIO_RESULT);
                            int i7 = bundle3.getInt(RemoteBioParameters.BIO_PROGRESS_LENGTH);
                            int i8 = bundle3.getInt(RemoteBioParameters.BIO_PROGRESS_MAX);
                            iArr[0] = i7;
                            iArr[1] = i8;
                            return i6;
                        } catch (RemoteException e) {
                            Log.e(DialogConstants.APP_LOGGER_TAG, "Remote exception occurred: " + e.getMessage(), e);
                            return -1;
                        }
                    }
                });
                return onCreateView;
            }
            i = bundle2.getInt(IDialogId.INTENT_EXTRA_IN_MAX, 0);
        } else {
            i = bundle.getInt(CspBioProgressConstants.MAX, 0);
            i3 = bundle.getInt("progress", 0);
        }
        int i4 = i;
        i2 = i3;
        i3 = i4;
        CspBioParameters cspBioParameters2 = new CspBioParameters();
        cspBioParameters2.setMax(i3);
        cspBioParameters2.setProgress(i2);
        this.bioGuiCustomizer.onLoadParameters(cspBioParameters2);
        View onCreateView2 = this.bioGuiCustomizer.onCreateView(layoutInflater, viewGroup, bundle);
        BioRndView bioRndView2 = (BioRndView) onCreateView2.findViewById(this.bioGuiCustomizer.getBioRandomViewId());
        this.tvBioInfo = bioRndView2;
        bioRndView2.setBioProgressController(new CspBioProgressController() { // from class: ru.CryptoPro.JCSP.tools.common.window.CSPBio.1
            @Override // ru.CryptoPro.JCSP.tools.common.window.elements.CspBioProgressController, ru.CryptoPro.JCSP.tools.common.window.elements.ICSPBioProgressController
            public void setMax(int i42) {
                CSPBio.this.bioGuiCustomizer.onMaxChanged(new CspBioChangeMaxEvent(i42));
            }

            @Override // ru.CryptoPro.JCSP.tools.common.window.elements.CspBioProgressController, ru.CryptoPro.JCSP.tools.common.window.elements.ICSPBioProgressController
            public void setProgress(int i42) {
                CSPBio.this.bioGuiCustomizer.onProgressChanged(new CspBioChangeProgressEvent(i42));
            }
        });
        this.tvBioInfo.setDialogController(new ICSPBioController() { // from class: ru.CryptoPro.JCSP.tools.common.window.CSPBio.2
            @Override // ru.CryptoPro.JCSP.tools.common.window.ICSPDialogController
            public void endDialog(int i42, String str) {
                CSPBio.this.endDialog(i42, null);
            }

            @Override // ru.CryptoPro.JCSP.tools.common.window.ICSPBioController
            public int onTouch(int i42, int i5, long j, int[] iArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putInt("type", -2);
                bundle3.putInt(RemoteBioParameters.X, i42);
                bundle3.putInt(RemoteBioParameters.Y, i5);
                bundle3.putLong(RemoteBioParameters.TIME, j);
                try {
                    CSPBio.this.remoteCallback.sendResult(bundle3);
                    int i6 = bundle3.getInt(RemoteBioParameters.BIO_RESULT);
                    int i7 = bundle3.getInt(RemoteBioParameters.BIO_PROGRESS_LENGTH);
                    int i8 = bundle3.getInt(RemoteBioParameters.BIO_PROGRESS_MAX);
                    iArr[0] = i7;
                    iArr[1] = i8;
                    return i6;
                } catch (RemoteException e) {
                    Log.e(DialogConstants.APP_LOGGER_TAG, "Remote exception occurred: " + e.getMessage(), e);
                    return -1;
                }
            }
        });
        return onCreateView2;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        this.bioGuiCustomizer.onSaveInstanceState(bundle);
    }

    @Override // ru.CryptoPro.JCSP.tools.common.window.CspBioDialogController
    public Dialog onSuperCreateDialog(Bundle bundle) {
        return super.onCreateDialog(bundle);
    }

    @Override // ru.CryptoPro.JCSP.tools.common.window.CspBioDialogController
    public void onSuperSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // ru.CryptoPro.JCSP.tools.common.window.CSPDialog
    public void setFinished() {
        this.tvBioInfo.setFinished();
    }
}
