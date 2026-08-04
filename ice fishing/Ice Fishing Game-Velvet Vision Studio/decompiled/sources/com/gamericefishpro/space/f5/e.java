package com.gamericefishpro.space.f5;

import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends n0 {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, boolean z) {
        super(z);
        this.k = i;
    }

    @Override // com.gamericefishpro.space.f5.n0
    public final Object a(String key, Bundle source) {
        switch (this.k) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                if (!com.gamericefishpro.space.u6.f.n(key, source) || com.gamericefishpro.space.u6.f.G(key, source)) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(key, "key");
                boolean z = source.getBoolean(key, false);
                if (z || !source.getBoolean(key, true)) {
                    return Boolean.valueOf(z);
                }
                com.gamericefishpro.space.wa.b.K(key);
                throw null;
            case 1:
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(key, "key");
                float f = source.getFloat(key, Float.MIN_VALUE);
                if (f != Float.MIN_VALUE || source.getFloat(key, Float.MAX_VALUE) != Float.MAX_VALUE) {
                    return Float.valueOf(f);
                }
                com.gamericefishpro.space.wa.b.K(key);
                throw null;
            case 2:
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                return Integer.valueOf(com.gamericefishpro.space.u6.f.A(key, source));
            case 3:
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(key, "key");
                long j = source.getLong(key, Long.MIN_VALUE);
                if (j != Long.MIN_VALUE || source.getLong(key, Long.MAX_VALUE) != Long.MAX_VALUE) {
                    return Long.valueOf(j);
                }
                com.gamericefishpro.space.wa.b.K(key);
                throw null;
            default:
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                if (!com.gamericefishpro.space.u6.f.n(key, source) || com.gamericefishpro.space.u6.f.G(key, source)) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(key, "key");
                String string = source.getString(key);
                if (string != null) {
                    return string;
                }
                com.gamericefishpro.space.wa.b.K(key);
                throw null;
        }
    }

    @Override // com.gamericefishpro.space.f5.n0
    public final String b() {
        switch (this.k) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "boolean";
            case 1:
                return "float";
            case 2:
                return "integer";
            case 3:
                return "long";
            default:
                return "string";
        }
    }

    @Override // com.gamericefishpro.space.f5.n0
    public final Object d(String value) {
        boolean z;
        int i;
        String strSubstring;
        long j;
        switch (this.k) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.equals("true")) {
                    z = true;
                } else {
                    if (!value.equals("false")) {
                        throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                Intrinsics.checkNotNullParameter(value, "value");
                return Float.valueOf(Float.parseFloat(value));
            case 2:
                Intrinsics.checkNotNullParameter(value, "value");
                if (kotlin.text.d.j(value, "0x")) {
                    String strSubstring2 = value.substring(2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    i = Integer.parseInt(strSubstring2, CharsKt.checkRadix(16));
                } else {
                    i = Integer.parseInt(value);
                }
                return Integer.valueOf(i);
            case 3:
                Intrinsics.checkNotNullParameter(value, "value");
                if (kotlin.text.d.f(value, "L")) {
                    strSubstring = value.substring(0, value.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                } else {
                    strSubstring = value;
                }
                if (kotlin.text.d.j(value, "0x")) {
                    String strSubstring3 = strSubstring.substring(2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                    j = Long.parseLong(strSubstring3, CharsKt.checkRadix(16));
                } else {
                    j = Long.parseLong(strSubstring);
                }
                return Long.valueOf(j);
            default:
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.equals("null")) {
                    return null;
                }
                return value;
        }
    }

    @Override // com.gamericefishpro.space.f5.n0
    public final void e(Bundle source, String key, Object obj) {
        switch (this.k) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(key, "key");
                source.putBoolean(key, zBooleanValue);
                break;
            case 1:
                float fFloatValue = ((Number) obj).floatValue();
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(key, "key");
                source.putFloat(key, fFloatValue);
                break;
            case 2:
                int iIntValue = ((Number) obj).intValue();
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(key, "key");
                source.putInt(key, iIntValue);
                break;
            case 3:
                long jLongValue = ((Number) obj).longValue();
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(key, "key");
                source.putLong(key, jLongValue);
                break;
            default:
                String value = (String) obj;
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                if (value == null) {
                    com.gamericefishpro.space.z5.f.a(key, source);
                } else {
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(value, "value");
                    source.putString(key, value);
                }
                break;
        }
    }
}
