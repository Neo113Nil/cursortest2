package com.google.firebase;

import androidx.work.impl.WorkLauncherImpl;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.util.Strings;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class FirebaseOptions {
    public final String apiKey;
    public final String applicationId;
    public final String gcmSenderId;
    public final String projectId;

    public FirebaseOptions(String str, String str2, String str3) {
        int i = Strings.$r8$clinit;
        zzae.checkState("ApplicationId must be set.", !str.trim().isEmpty());
        this.applicationId = str;
        this.apiKey = str2;
        this.gcmSenderId = "146513644742";
        this.projectId = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FirebaseOptions)) {
            return false;
        }
        FirebaseOptions firebaseOptions = (FirebaseOptions) obj;
        return zzae.equal(this.applicationId, firebaseOptions.applicationId) && zzae.equal(this.apiKey, firebaseOptions.apiKey) && zzae.equal(null, null) && zzae.equal(null, null) && zzae.equal(this.gcmSenderId, firebaseOptions.gcmSenderId) && zzae.equal(null, null) && zzae.equal(this.projectId, firebaseOptions.projectId);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.applicationId, this.apiKey, null, null, this.gcmSenderId, null, this.projectId});
    }

    public final String toString() {
        WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(this);
        workLauncherImpl.add(this.applicationId, "applicationId");
        workLauncherImpl.add(this.apiKey, "apiKey");
        workLauncherImpl.add(null, "databaseUrl");
        workLauncherImpl.add(this.gcmSenderId, "gcmSenderId");
        workLauncherImpl.add(null, "storageBucket");
        workLauncherImpl.add(this.projectId, "projectId");
        return workLauncherImpl.toString();
    }
}
