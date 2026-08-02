package com.squareup.cash.data.contacts;

import com.squareup.protos.cash.contacts.app.SyncContactsResponse;
import com.squareup.protos.cash.genericelements.ui.Alignment;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class DetailedContactsSyncEncryptedRoutine$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[SyncContactsResponse.ResponseCode.values().length];
        try {
            Alignment.Companion companion = SyncContactsResponse.ResponseCode.Companion;
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            Alignment.Companion companion2 = SyncContactsResponse.ResponseCode.Companion;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
