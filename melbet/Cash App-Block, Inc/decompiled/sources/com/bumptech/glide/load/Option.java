package com.bumptech.glide.load;

import android.text.TextUtils;
import androidx.transition.Transition;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public final class Option {
    public static final Transition.AnonymousClass1 EMPTY_UPDATER = new Transition.AnonymousClass1();
    public final CacheKeyUpdater cacheKeyUpdater;
    public final Object defaultValue;
    public final String key;
    public volatile byte[] keyBytes;

    public interface CacheKeyUpdater {
        void update(byte[] bArr, Object obj, MessageDigest messageDigest);
    }

    public Option(String str, Object obj, CacheKeyUpdater cacheKeyUpdater) {
        if (TextUtils.isEmpty(str)) {
            a$$ExternalSyntheticBUOutline0.m$3("Must not be null or empty");
            throw null;
        }
        this.key = str;
        this.defaultValue = obj;
        this.cacheKeyUpdater = cacheKeyUpdater;
    }

    public static Option memory(Object obj, String str) {
        return new Option(str, obj, EMPTY_UPDATER);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Option) {
            return this.key.equals(((Option) obj).key);
        }
        return false;
    }

    public final int hashCode() {
        return this.key.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Option{key='"), this.key, "'}");
    }
}
