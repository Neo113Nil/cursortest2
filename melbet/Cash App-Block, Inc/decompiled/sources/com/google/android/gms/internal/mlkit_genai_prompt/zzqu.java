package com.google.android.gms.internal.mlkit_genai_prompt;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda0;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController$Companion;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.ResponseUtils$Companion$$ExternalSyntheticLambda1;
import androidx.lifecycle.DispatchQueue$$ExternalSyntheticLambda0;
import androidx.media3.ui.PlayerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.sheet.BasicShieetKt;
import com.squareup.cash.sheet.SheetStateKt;
import com.squareup.cash.shopping.autofill.viewmodels.InputViewModel;
import com.squareup.util.android.Emails;
import com.squareup.util.android.PhoneNumbers;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public abstract class zzqu {
    public static List getDeepLinkSpecs() {
        return ClientRoute.NoOperationWithPromptIfNeededAccount.deepLinkSpecs;
    }

    public static void handleGetCredentialResponse(int i, int i2, Intent intent, Executor executor, CredentialManagerCallback credentialManagerCallback, CancellationSignal cancellationSignal) {
        String string2;
        Bundle bundle;
        GetCredentialResponse getCredentialResponse;
        String m;
        int i3 = CredentialProviderController.CONTROLLER_REQUEST_CODE;
        if (i != i3) {
            Log.w("GetCredentialController", "Returned request code " + i3 + " which  does not match what was given " + i);
            return;
        }
        CredentialProviderBaseController$Companion credentialProviderBaseController$Companion = CredentialProviderController.Companion;
        if (i2 != -1) {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "activity with result code: ", " indicating not RESULT_OK");
            ref$ObjectRef.element = new GetCredentialUnknownException(m);
            if (i2 == 0) {
                ref$ObjectRef.element = new GetCredentialCancellationException("activity is cancelled by the user.");
            }
            CredentialProviderPlayServicesImpl.INSTANCE.getClass();
            if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
                return;
            }
            GetCredentialException getCredentialException = (GetCredentialException) ref$ObjectRef.element;
            getCredentialException.getClass();
            executor.execute(new ResponseUtils$Companion$$ExternalSyntheticLambda1(credentialManagerCallback, getCredentialException, 0));
            return;
        }
        if (intent == null) {
            CredentialProviderPlayServicesImpl.INSTANCE.getClass();
            if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
                return;
            }
            executor.execute(new CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda0(credentialManagerCallback, 7));
            return;
        }
        int i4 = Build.VERSION.SDK_INT;
        GetCredentialException getCredentialException2 = null;
        if (i4 >= 34) {
            getCredentialResponse = PlayerView.Api34.extractGetCredentialResponse(intent);
        } else {
            Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE");
            getCredentialResponse = (bundleExtra == null || (string2 = bundleExtra.getString("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE")) == null || (bundle = bundleExtra.getBundle("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA")) == null) ? null : new GetCredentialResponse(BasicShieetKt.createFrom(bundle, string2));
        }
        if (getCredentialResponse != null) {
            CredentialProviderPlayServicesImpl.INSTANCE.getClass();
            if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
                return;
            }
            executor.execute(new DispatchQueue$$ExternalSyntheticLambda0(3, credentialManagerCallback, getCredentialResponse));
            return;
        }
        if (i4 >= 34) {
            getCredentialException2 = PlayerView.Api34.extractGetCredentialException(intent);
        } else {
            int i5 = GetCredentialException.$r8$clinit;
            Bundle bundleExtra2 = intent.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION");
            if (bundleExtra2 != null) {
                String string3 = bundleExtra2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                if (string3 == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Bundle was missing exception type.");
                    return;
                }
                getCredentialException2 = SheetStateKt.toJetpackGetException(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string3);
            }
        }
        CredentialProviderPlayServicesImpl.INSTANCE.getClass();
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return;
        }
        executor.execute(new ResponseUtils$Companion$$ExternalSyntheticLambda1(credentialManagerCallback, getCredentialException2, 1));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final String invalidErrorMessage(String str, InputViewModel.InputType inputType, AndroidStringManager androidStringManager) {
        switch (inputType.ordinal()) {
            case 0:
            case 1:
            case 4:
            case 6:
            case 7:
                if (str == null || StringsKt.isBlank(str)) {
                    return androidStringManager.get(R.string.field_required);
                }
                return null;
            case 2:
                if (str != null && !StringsKt.isBlank(str) && (((str.length() != 10 || StringsKt.startsWith$default(str, '1')) && (str.length() != 11 || !StringsKt.startsWith$default(str, '1'))) || PhoneNumbers.normalize(str) == null)) {
                    return androidStringManager.get(R.string.invalid);
                }
                return null;
            case 3:
                String str2 = (str == null || StringsKt.isBlank(str)) ? androidStringManager.get(R.string.field_required) : null;
                if (str2 != null) {
                    return str2;
                }
                if (Emails.normalize(str) == null) {
                    return androidStringManager.get(R.string.invalid);
                }
                return null;
            case 5:
                return null;
            case 8:
                if (str == null || StringsKt.isBlank(str)) {
                    return androidStringManager.get(R.string.field_required);
                }
                return null;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }
}
