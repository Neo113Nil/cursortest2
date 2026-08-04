package com.gamericefishpro.space.ma;

import android.os.Handler;
import android.os.Message;
import com.gamericefishpro.space.t0.y0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            throw y0.e(message.obj);
        }
        if (i != 1) {
            return false;
        }
        throw y0.e(message.obj);
    }
}
