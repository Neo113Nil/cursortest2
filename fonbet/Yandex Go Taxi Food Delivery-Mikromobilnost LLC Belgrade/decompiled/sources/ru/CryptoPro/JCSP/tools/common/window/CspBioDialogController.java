package ru.CryptoPro.JCSP.tools.common.window;

import android.app.Dialog;
import android.os.Bundle;

/* loaded from: classes4.dex */
public interface CspBioDialogController {
    void cancel();

    Dialog onSuperCreateDialog(Bundle bundle);

    void onSuperSaveInstanceState(Bundle bundle);
}
