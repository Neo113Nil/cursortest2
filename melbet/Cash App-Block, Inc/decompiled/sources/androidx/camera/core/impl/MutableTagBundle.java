package androidx.camera.core.impl;

import android.util.ArrayMap;

/* loaded from: classes3.dex */
public final class MutableTagBundle extends TagBundle {
    public static MutableTagBundle create() {
        return new MutableTagBundle(new ArrayMap());
    }
}
