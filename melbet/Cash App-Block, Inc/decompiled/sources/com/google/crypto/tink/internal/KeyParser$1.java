package com.google.crypto.tink.internal;

import com.google.crypto.tink.util.Bytes;

/* loaded from: classes.dex */
public final class KeyParser$1 {
    public final Bytes objectIdentifier;
    public final /* synthetic */ KeyParser$KeyParsingFunction val$function;

    public KeyParser$1(Bytes bytes, KeyParser$KeyParsingFunction keyParser$KeyParsingFunction) {
        this.val$function = keyParser$KeyParsingFunction;
        this.objectIdentifier = bytes;
    }
}
