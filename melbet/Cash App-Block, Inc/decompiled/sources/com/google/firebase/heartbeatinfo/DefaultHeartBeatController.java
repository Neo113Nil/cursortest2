package com.google.firebase.heartbeatinfo;

import android.content.Context;
import androidx.room.Room;
import coil3.decode.StaticImageDecoderKt$$ExternalSyntheticLambda0;
import com.google.android.gms.tasks.zzw;
import com.google.firebase.FirebaseApp$$ExternalSyntheticLambda0;
import com.google.firebase.components.Lazy;
import com.google.firebase.inject.Provider;
import com.squareup.cash.mri.android.SafeSignalCollector$$ExternalSyntheticLambda0;
import com.squareup.util.cash.Countries;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class DefaultHeartBeatController implements HeartBeatController, HeartBeatInfo {
    public final Context applicationContext;
    public final Executor backgroundExecutor;
    public final Set consumers;
    public final Lazy storageProvider;
    public final Provider userAgentProvider;

    public DefaultHeartBeatController(Context context, String str, Set set, Provider provider, Executor executor) {
        this.storageProvider = new Lazy(new FirebaseApp$$ExternalSyntheticLambda0(context, str));
        this.consumers = set;
        this.backgroundExecutor = executor;
        this.userAgentProvider = provider;
        this.applicationContext = context;
    }

    public final zzw getHeartBeatsHeader() {
        if (!Countries.isUserUnlocked(this.applicationContext)) {
            return Room.forResult("");
        }
        return Room.call(this.backgroundExecutor, new StaticImageDecoderKt$$ExternalSyntheticLambda0(this, 1));
    }

    public final void registerHeartBeat() {
        if (this.consumers.size() <= 0) {
            Room.forResult(null);
        } else if (!Countries.isUserUnlocked(this.applicationContext)) {
            Room.forResult(null);
        } else {
            Room.call(this.backgroundExecutor, new SafeSignalCollector$$ExternalSyntheticLambda0(this, 1));
        }
    }
}
