package com.gamericefishpro.space.r8;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.r9.o;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements com.gamericefishpro.space.r9.a, com.gamericefishpro.space.r9.g {
    public static final /* synthetic */ d e = new d(0);
    public static final /* synthetic */ d i = new d(1);
    public static final /* synthetic */ d v = new d(2);
    public final /* synthetic */ int d;

    public /* synthetic */ d(int i2) {
        this.d = i2;
    }

    @Override // com.gamericefishpro.space.r9.g
    public o a(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i2 = b.h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? com.gamericefishpro.space.d9.h.w(bundle) : com.gamericefishpro.space.d9.h.w(null);
    }

    @Override // com.gamericefishpro.space.r9.a
    public Object e(Task task) throws IOException {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (task.isSuccessful()) {
                    return (Bundle) task.getResult();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    "Error making request: ".concat(String.valueOf(task.getException()));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
            default:
                Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
                if (intent != null) {
                    return new a(intent);
                }
                return null;
        }
    }
}
