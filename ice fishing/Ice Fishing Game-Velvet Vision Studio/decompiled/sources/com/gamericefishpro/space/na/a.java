package com.gamericefishpro.space.na;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ q e;

    public /* synthetic */ a(q qVar, int i) {
        this.d = i;
        this.e = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                e eVar = (e) this.e;
                EditText editText = eVar.i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    eVar.p();
                    break;
                }
                break;
            case 1:
                ((m) this.e).t();
                break;
            default:
                u uVar = (u) this.e;
                EditText editText2 = uVar.f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = uVar.f;
                    if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        uVar.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else {
                        uVar.f.setTransformationMethod(null);
                    }
                    if (selectionEnd >= 0) {
                        uVar.f.setSelection(selectionEnd);
                    }
                    uVar.p();
                    break;
                }
                break;
        }
    }
}
