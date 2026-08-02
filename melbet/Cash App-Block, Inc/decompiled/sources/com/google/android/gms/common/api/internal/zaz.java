package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import net.oneformapp.PopEncryptorV2_;

/* loaded from: classes4.dex */
public final class zaz implements OnCompleteListener {
    public static final Status zaa = new Status(8, "The connection to Google Play services was lost", null, null);

    /* renamed from: zaa, reason: collision with other field name */
    public final Object f62zaa;
    public final Object zab;

    public zaz() {
        this.f62zaa = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.zab = new zact(this);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((zaaa) this.zab).zab.remove((TaskCompletionSource) this.f62zaa);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zab() {
        boolean z;
        Set set = (Set) this.f62zaa;
        for (BasePendingResult basePendingResult : (BasePendingResult[]) set.toArray(new BasePendingResult[0])) {
            basePendingResult.zai.set(null);
            synchronized (basePendingResult.zae) {
                try {
                    if (((GoogleApiClient) basePendingResult.zac.get()) != null) {
                        if (!basePendingResult.zaq) {
                        }
                        synchronized (basePendingResult.zae) {
                            z = basePendingResult.zam;
                        }
                    }
                    basePendingResult.cancel();
                    synchronized (basePendingResult.zae) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                set.remove(basePendingResult);
            }
        }
    }

    public zaz(PopEncryptorV2_ popEncryptorV2_, ListenerHolder.ListenerKey listenerKey) {
        this.zab = popEncryptorV2_;
        this.f62zaa = listenerKey;
    }

    public zaz(zaaa zaaaVar, TaskCompletionSource taskCompletionSource) {
        this.f62zaa = taskCompletionSource;
        Objects.requireNonNull(zaaaVar);
        this.zab = zaaaVar;
    }
}
