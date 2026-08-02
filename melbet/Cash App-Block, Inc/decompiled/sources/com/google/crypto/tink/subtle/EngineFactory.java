package com.google.crypto.tink.subtle;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.mlkit.common.internal.zza;
import com.google.mlkit.common.internal.zzb;
import com.google.mlkit.common.internal.zzc;
import com.google.mlkit.common.internal.zzd;
import com.google.mlkit.common.internal.zze;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cash.db.WireAdapter;

/* loaded from: classes.dex */
public final class EngineFactory {
    public static final EngineFactory CIPHER = new EngineFactory(new zzd(8));
    public static final EngineFactory KEY_AGREEMENT;
    public static final EngineFactory KEY_FACTORY;
    public static final EngineFactory KEY_PAIR_GENERATOR;
    public static final EngineFactory MAC;
    public final Policy policy;

    public interface Policy {
        Object getInstance(String str);
    }

    static {
        int i = 9;
        MAC = new EngineFactory(new zzc(i));
        new EngineFactory(new zze(i));
        new EngineFactory(new zzd(i));
        KEY_AGREEMENT = new EngineFactory(new zze(8));
        int i2 = 9;
        KEY_PAIR_GENERATOR = new EngineFactory(new zzb(i2));
        KEY_FACTORY = new EngineFactory(new zza(i2));
    }

    public EngineFactory(EngineWrapper engineWrapper) {
        if (TinkFipsUtil.useOnlyFips()) {
            this.policy = new JCAContext(engineWrapper, 6);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            this.policy = new WireAdapter(engineWrapper);
        } else {
            this.policy = new com.google.mlkit.vision.common.zzb(engineWrapper);
        }
    }
}
