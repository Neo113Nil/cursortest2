package androidx.camera.core.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public interface EncoderProfilesProvider {
    public static final AnonymousClass1 EMPTY = new AnonymousClass1();
    public static final List QUALITY_HIGH_TO_LOW = Collections.unmodifiableList(Arrays.asList(13, 10, 8, 11, 6, 5, 4, 9, 3, 7, 2));

    /* renamed from: androidx.camera.core.impl.EncoderProfilesProvider$1, reason: invalid class name */
    public final class AnonymousClass1 implements EncoderProfilesProvider {
        @Override // androidx.camera.core.impl.EncoderProfilesProvider
        public final EncoderProfilesProxy getAll(int i) {
            return null;
        }

        @Override // androidx.camera.core.impl.EncoderProfilesProvider
        public final boolean hasProfile(int i) {
            return false;
        }
    }

    EncoderProfilesProxy getAll(int i);

    boolean hasProfile(int i);
}
