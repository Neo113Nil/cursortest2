package com.squareup.cash.android;

import com.squareup.cash.treehouse.buildconfig.RawBuildConfigService;
import com.squareup.protos.franklin.common.AppVersion;
import com.squareup.protos.franklin.common.Platform;
import java.util.List;
import kotlin.text.StringsKt;
import okio.ByteString;

/* loaded from: classes.dex */
public final class AndroidBuildConfigService implements RawBuildConfigService {
    public final boolean isDebug;
    public final String versionName;

    public AndroidBuildConfigService(String str, boolean z) {
        this.versionName = str;
        this.isDebug = z;
    }

    @Override // com.squareup.cash.treehouse.buildconfig.RawBuildConfigService
    public final ByteString encodedAppVersion() {
        List split$default = StringsKt.split$default(this.versionName, new char[]{'.'}, 6);
        return new AppVersion.Builder().platform(Platform.ANDROID).major_version(Integer.valueOf(Integer.parseInt((String) split$default.get(0)))).minor_version(Integer.valueOf(Integer.parseInt((String) split$default.get(1)))).patch_version(Integer.valueOf(Integer.parseInt((String) split$default.get(2)))).build().encodeByteString();
    }

    @Override // com.squareup.cash.treehouse.buildconfig.RawBuildConfigService
    public final boolean isDebug() {
        return this.isDebug;
    }
}
