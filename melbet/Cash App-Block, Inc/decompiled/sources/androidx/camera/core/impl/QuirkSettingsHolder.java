package androidx.camera.core.impl;

import com.google.mlkit.vision.face.internal.zzm;

/* loaded from: classes3.dex */
public final class QuirkSettingsHolder {
    public static final QuirkSettings DEFAULT = new QuirkSettings(true, null, null);
    public static final QuirkSettingsHolder sInstance = new QuirkSettingsHolder();
    public final zzm mObservable = new zzm(DEFAULT);
}
