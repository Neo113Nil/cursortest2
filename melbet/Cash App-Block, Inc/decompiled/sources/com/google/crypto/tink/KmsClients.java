package com.google.crypto.tink;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public abstract class KmsClients {
    public static final CopyOnWriteArrayList clients = new CopyOnWriteArrayList();

    public static void get(String str) {
        Iterator it = clients.iterator();
        if (!it.hasNext()) {
            throw new GeneralSecurityException(Recorder$$ExternalSyntheticOutline2.m("No KMS client does support: ", str));
        }
        throw Recorder$$ExternalSyntheticOutline2.m(it);
    }
}
