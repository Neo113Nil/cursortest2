package com.google.android.gms.internal.mlkit_genai_prompt;

import android.content.ClipboardManager;
import androidx.credentials.exceptions.domerrors.DomError;
import androidx.credentials.exceptions.domerrors.NotAllowedError;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.views.navigation.FlowData;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public abstract class zzagk {
    public static final String access$analyticsMessage(CreatePublicKeyCredentialDomException createPublicKeyCredentialDomException) {
        String simpleName = createPublicKeyCredentialDomException.domError.getClass().getSimpleName();
        CharSequence charSequence = createPublicKeyCredentialDomException.errorMessage;
        if (charSequence == null || StringsKt.isBlank(charSequence)) {
            charSequence = null;
        }
        return CollectionsKt.joinToString$default(ArraysKt___ArraysKt.filterNotNull(new CharSequence[]{"CreatePublicKeyCredentialDomException", simpleName, charSequence}), ": ", null, null, 0, null, null, 62);
    }

    public static final boolean access$isCancelledByUser(GetPublicKeyCredentialDomException getPublicKeyCredentialDomException) {
        DomError domError = getPublicKeyCredentialDomException.domError;
        CharSequence charSequence = getPublicKeyCredentialDomException.errorMessage;
        if (domError instanceof NotAllowedError) {
            return (charSequence != null && StringsKt.contains(charSequence, (CharSequence) "Cancelled by user", true)) || (charSequence != null && StringsKt.contains(charSequence, (CharSequence) "User canceled the request", true));
        }
        return false;
    }

    public static final FlowData access$toFlowData(BlockersData blockersData) {
        return new FlowData(blockersData.flow);
    }

    public static final String analyticsMessage(Exception exc, boolean z) {
        String simpleName = exc.getClass().getSimpleName();
        String message = exc.getMessage();
        if (message == null || !z || StringsKt.isBlank(message)) {
            message = null;
        }
        return CollectionsKt.joinToString$default(ArraysKt___ArraysKt.filterNotNull(new String[]{simpleName, message}), ": ", null, null, 0, null, null, 62);
    }

    public static final void clearPrimaryClip(ClipboardManager clipboardManager) {
        clipboardManager.clearPrimaryClip();
    }

    public static final boolean access$isCancelledByUser(CreatePublicKeyCredentialDomException createPublicKeyCredentialDomException) {
        CharSequence charSequence;
        return (createPublicKeyCredentialDomException.domError instanceof NotAllowedError) && (charSequence = createPublicKeyCredentialDomException.errorMessage) != null && StringsKt.contains(charSequence, (CharSequence) "Cancelled by user", false);
    }
}
