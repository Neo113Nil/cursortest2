package com.squareup.cash.sheet;

import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.ui.Modifier;
import androidx.credentials.exceptions.domerrors.DomError;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import androidx.credentials.internal.FrameworkClassParsingException;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class PinnedKt {
    public static final Exception access$generateException(DomError domError, String str, Exception exc) {
        if (exc instanceof CreatePublicKeyCredentialDomException) {
            return new CreatePublicKeyCredentialDomException(domError, str);
        }
        if (exc instanceof GetPublicKeyCredentialDomException) {
            return new GetPublicKeyCredentialDomException(domError, str);
        }
        throw new FrameworkClassParsingException();
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.JoinGameTrivia.deepLinkSpecs;
    }

    public static final Modifier pinned(Modifier modifier, RealSheetState realSheetState) {
        modifier.getClass();
        realSheetState.getClass();
        return OffsetKt.offset(modifier, new PinnedKt$$ExternalSyntheticLambda0(realSheetState, 0));
    }
}
