package com.squareup.cash.featureflags;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes.dex */
public final class LaunchDarklyFeatureFlags$AndroidFilamentBlacklist extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$AndroidFilamentBlacklist INSTANCE;

    static {
        FeatureFlag$StringFeatureFlag$Value featureFlag$StringFeatureFlag$Value = new FeatureFlag$StringFeatureFlag$Value("NONEXISTENT_GPU", "NONEXISTENT_GPU");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$StringFeatureFlag$Value[]{new FeatureFlag$StringFeatureFlag$Value("NONEXISTENT_GPU", "NONEXISTENT_GPU"), new FeatureFlag$StringFeatureFlag$Value("GE8100,GE8300,GE8320,GE8322", "GE8100,GE8300,GE8320,GE8322"), new FeatureFlag$StringFeatureFlag$Value("GE8100,GE8300,GE8320,GE8322,Adreno (TM) 630", "GE8100,GE8300,GE8320,GE8322,Adreno (TM) 630"), new FeatureFlag$StringFeatureFlag$Value("GE8100,GE8300,GE8320,GE8322,Adreno (TM) 308,Adreno (TM) 540,Adreno (TM) 630,PowerVR Rogue GM9446,PowerVR Rogue GX6250", "GE8100,GE8300,GE8320,GE8322,Adreno (TM) 308,Adreno (TM) 540,Adreno (TM) 630,PowerVR Rogue GM9446,PowerVR Rogue GX6250"), new FeatureFlag$StringFeatureFlag$Value("GE8100,GE8300,GE8320,GE8322,Adreno (TM) 308,Adreno (TM) 330,Adreno (TM) 540,Adreno (TM) 630,PowerVR Rogue GM9446,PowerVR Rogue GX6250", "GE8100,GE8300,GE8320,GE8322,Adreno (TM) 308,Adreno (TM) 330,Adreno (TM) 540,Adreno (TM) 630,PowerVR Rogue GM9446,PowerVR Rogue GX6250"), new FeatureFlag$StringFeatureFlag$Value("GE8100,GE8300,GE8320,GE8322,Adreno (TM) 308,Adreno (TM) 330,Adreno (TM) 540,Adreno (TM) 630,Adreno (TM) 640,PowerVR Rogue GM9446,PowerVR Rogue GX6250,PowerVR SGX 544MP", "GE8100,GE8300,GE8320,GE8322,Adreno (TM) 308,Adreno (TM) 330,Adreno (TM) 540,Adreno (TM) 630,Adreno (TM) 640,PowerVR Rogue GM9446,PowerVR Rogue GX6250,PowerVR SGX 544MP"), new FeatureFlag$StringFeatureFlag$Value("Adreno (TM) 304,Adreno (TM) 306,Adreno (TM) 308,Adreno (TM) 330,Adreno (TM) 540,Adreno (TM) 630,Adreno (TM) 640,GE8100,GE8300,GE8320,GE8322,Mali-T820,Mali-T830,PowerVR Rogue GE8320,PowerVR Rogue GM9446,PowerVR Rogue GX6250", "Adreno (TM) 304,Adreno (TM) 306,Adreno (TM) 308,Adreno (TM) 330,Adreno (TM) 540,Adreno (TM) 630,Adreno (TM) 640,GE8100,GE8300,GE8320,GE8322,Mali-T820,Mali-T830,PowerVR Rogue GE8320,PowerVR Rogue GM9446,PowerVR Rogue GX6250")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$AndroidFilamentBlacklist("cashclient/android_filament_blacklist", featureFlag$StringFeatureFlag$Value, listOf, 5);
    }
}
