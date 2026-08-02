package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.camera.core.impl.utils.executor.IoExecutor;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.location.zzdh;
import com.google.android.gms.internal.location.zzfb;
import com.google.android.gms.internal.measurement.zzqd;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class ListenerHolder {
    public final Executor zaa;
    public volatile ListenerKey zab;

    public final class ListenerKey {
        public final Object zaa;
        public final String zab;

        public ListenerKey(Object obj, String str) {
            this.zaa = obj;
            this.zab = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListenerKey)) {
                return false;
            }
            ListenerKey listenerKey = (ListenerKey) obj;
            return this.zaa == listenerKey.zaa && this.zab.equals(listenerKey.zab);
        }

        public final int hashCode() {
            return this.zab.hashCode() + (System.identityHashCode(this.zaa) * 31);
        }

        public final String toIdString() {
            int identityHashCode = System.identityHashCode(this.zaa);
            String str = this.zab;
            StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(identityHashCode).length());
            sb.append(str);
            sb.append("@");
            sb.append(identityHashCode);
            return sb.toString();
        }
    }

    public interface Notifier {
        void notifyListener(Object obj);
    }

    public ListenerHolder(Looper looper, zzqd zzqdVar) {
        this.zaa = new IoExecutor(looper);
        zzae.checkNotEmpty("zzku");
        this.zab = new ListenerKey(zzqdVar, "zzku");
    }

    public final void notifyListener(Notifier notifier) {
        this.zaa.execute(new zao(this, notifier));
    }

    public ListenerHolder(zzdh zzdhVar) {
        this.zaa = zzfb.zza;
        zzae.checkNotEmpty("GetCurrentLocation");
        this.zab = new ListenerKey(zzdhVar, "GetCurrentLocation");
    }
}
