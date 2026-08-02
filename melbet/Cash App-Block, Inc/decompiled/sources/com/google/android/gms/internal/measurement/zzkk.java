package com.google.android.gms.internal.measurement;

import android.util.Pair;
import androidx.room.Room;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.zacn;
import com.google.android.gms.dynamite.zzg;

/* loaded from: classes.dex */
public final class zzkk extends GoogleApi {
    public static final /* synthetic */ int $r8$clinit = 0;

    static {
        Pair.create(new zzg(11), Room.forResult(null));
    }

    public final com.google.android.gms.tasks.zzw zzc(String str) {
        zacn builder = zacn.builder();
        builder.zaa = new zzpp(str, 2);
        return zae(0, builder.build());
    }
}
