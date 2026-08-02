package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.firebase.installations.local.AutoValue_PersistedInstallationEntry;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final /* synthetic */ class FirebaseInstallations$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FirebaseInstallations f$0;

    public /* synthetic */ FirebaseInstallations$$ExternalSyntheticLambda1(FirebaseInstallations firebaseInstallations, int i) {
        this.$r8$classId = i;
        this.f$0 = firebaseInstallations;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        AutoValue_PersistedInstallationEntry registerFidWithServer;
        int i = this.$r8$classId;
        FirebaseInstallations firebaseInstallations = this.f$0;
        switch (i) {
            case 0:
                firebaseInstallations.doRegistrationOrRefresh();
                return;
            case 1:
                firebaseInstallations.doRegistrationOrRefresh();
                return;
            default:
                AutoValue_PersistedInstallationEntry multiProcessSafePrefs = firebaseInstallations.getMultiProcessSafePrefs();
                try {
                    int i2 = multiProcessSafePrefs.registrationStatus;
                    if (!(i2 == 5)) {
                        if (!(i2 == 3)) {
                            if (firebaseInstallations.f1007utils.isAuthTokenExpired(multiProcessSafePrefs)) {
                                registerFidWithServer = firebaseInstallations.fetchAuthTokenFromServer(multiProcessSafePrefs);
                                firebaseInstallations.insertOrUpdatePrefs(registerFidWithServer);
                                synchronized (firebaseInstallations) {
                                    try {
                                        if (firebaseInstallations.fidListeners.size() != 0 && !TextUtils.equals(multiProcessSafePrefs.firebaseInstallationId, registerFidWithServer.firebaseInstallationId)) {
                                            Iterator it = firebaseInstallations.fidListeners.iterator();
                                            if (it.hasNext()) {
                                                if (it.next() != null) {
                                                    throw new ClassCastException();
                                                }
                                                throw null;
                                            }
                                        }
                                    } finally {
                                    }
                                }
                                if (registerFidWithServer.registrationStatus == 4) {
                                    String str = registerFidWithServer.firebaseInstallationId;
                                    synchronized (firebaseInstallations) {
                                        firebaseInstallations.cachedFid = str;
                                    }
                                }
                                int i3 = registerFidWithServer.registrationStatus;
                                if (i3 == 5) {
                                    firebaseInstallations.triggerOnException(new FirebaseInstallationsException());
                                    return;
                                } else if (i3 == 2 || i3 == 1) {
                                    firebaseInstallations.triggerOnException(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                                    return;
                                } else {
                                    firebaseInstallations.triggerOnStateReached(registerFidWithServer);
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    registerFidWithServer = firebaseInstallations.registerFidWithServer(multiProcessSafePrefs);
                    firebaseInstallations.insertOrUpdatePrefs(registerFidWithServer);
                    synchronized (firebaseInstallations) {
                    }
                } catch (FirebaseInstallationsException e) {
                    firebaseInstallations.triggerOnException(e);
                    return;
                }
                break;
        }
    }
}
