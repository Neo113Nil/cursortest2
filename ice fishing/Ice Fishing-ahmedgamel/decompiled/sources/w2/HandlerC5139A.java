package w2;

import android.content.Context;
import android.os.Message;
import com.google.android.gms.internal.ads.AbstractC2888Ya;
import r2.C4906k;

/* renamed from: w2.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC5139A extends c3.e {
    @Override // c3.e
    public final void a(Message message) {
        try {
            super.a(message);
        } catch (Throwable th) {
            C4906k c4906k = C4906k.f40186C;
            D d9 = c4906k.f40191c;
            Context context = c4906k.f40196h.f30306e;
            if (context != null) {
                try {
                    if (((Boolean) AbstractC2888Ya.f29459b.r()).booleanValue()) {
                        V2.b.a(context, th);
                    }
                } catch (IllegalStateException unused) {
                }
            }
            throw th;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e9) {
            C4906k.f40186C.f40196h.d("AdMobHandler.handleMessage", e9);
        }
    }
}
