package com.squareup.cash.featureflags;

import com.squareup.cash.api.ApiResultCallAdapterFactory$get$resultType$1;
import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.moshi.JsonClass;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes.dex */
public final class JsonFeatureFlags$GenerationAttemptMri extends FeatureFlag$JsonFeatureFlag {
    public static final JsonFeatureFlags$GenerationAttemptMri INSTANCE = new JsonFeatureFlags$GenerationAttemptMri(new ApiResultCallAdapterFactory$get$resultType$1(new Type[]{GenerationAttempt.class}, 2), new FeatureFlag$JsonFeatureFlag.Options("ORIGINAL_BEHAVIOR", CollectionsKt__CollectionsKt.listOf((Object[]) new GenerationAttempt[]{new GenerationAttempt("P256", 256, 10, true, true), new GenerationAttempt("P256", 256, 10, true, false), new GenerationAttempt("P256", 256, 10, false, true), new GenerationAttempt("P256", 256, 10, false, false)})), "cashclient/generation_attempts_mri");

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/squareup/cash/featureflags/JsonFeatureFlags$GenerationAttemptMri$GenerationAttempt", "", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class GenerationAttempt {
        public final int keySize;
        public final int timeout;

        /* renamed from: type, reason: collision with root package name */
        public final String f1133type;
        public final boolean withDeviceProperties;
        public final boolean withStrongBox;

        public GenerationAttempt(String str, int i, int i2, boolean z, boolean z2) {
            this.f1133type = str;
            this.withStrongBox = z;
            this.withDeviceProperties = z2;
            this.keySize = i;
            this.timeout = i2;
        }
    }
}
