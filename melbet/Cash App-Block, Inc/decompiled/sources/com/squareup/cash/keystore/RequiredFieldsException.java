package com.squareup.cash.keystore;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.Metadata;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/keystore/RequiredFieldsException;", "Lcom/squareup/cash/keystore/MessageSigningException;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RequiredFieldsException extends MessageSigningException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequiredFieldsException(KClass kClass, IllegalStateException illegalStateException) {
        super(Boxes$$ExternalSyntheticOutline1.m("Proto class ", kClass.getQualifiedName(), " has required fields and cannot be used with populateOriginalFields=false. Either set populateOriginalFields=true or remove required fields from the proto definition. Cause: ", illegalStateException.getMessage(), "."), illegalStateException);
        kClass.getClass();
    }
}
