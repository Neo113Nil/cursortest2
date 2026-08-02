package com.squareup.cash.data.contacts;

import com.squareup.cash.cdf.ContactSyncResult;
import com.squareup.cash.cdf.contact.ContactSyncSendToServer;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class ContactsSyncToServerRoutineKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[ContactSyncSendToServer.ServerResponse.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            ContactSyncSendToServer.ServerResponse serverResponse = ContactSyncSendToServer.ServerResponse.SUCCESS;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            ContactSyncSendToServer.ServerResponse serverResponse2 = ContactSyncSendToServer.ServerResponse.SUCCESS;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            ContactSyncSendToServer.ServerResponse serverResponse3 = ContactSyncSendToServer.ServerResponse.SUCCESS;
            iArr[3] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            ContactSyncSendToServer.ServerResponse serverResponse4 = ContactSyncSendToServer.ServerResponse.SUCCESS;
            iArr[4] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            ContactSyncSendToServer.ServerResponse serverResponse5 = ContactSyncSendToServer.ServerResponse.SUCCESS;
            iArr[5] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr2 = new int[ContactSyncResult.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            ContactSyncResult contactSyncResult = ContactSyncResult.SUCCESS;
            iArr2[4] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            ContactSyncResult contactSyncResult2 = ContactSyncResult.SUCCESS;
            iArr2[1] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            ContactSyncResult contactSyncResult3 = ContactSyncResult.SUCCESS;
            iArr2[2] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            ContactSyncResult contactSyncResult4 = ContactSyncResult.SUCCESS;
            iArr2[3] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
