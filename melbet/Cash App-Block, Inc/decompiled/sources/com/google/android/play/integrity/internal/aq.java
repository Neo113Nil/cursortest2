package com.google.android.play.integrity.internal;

import java.util.Set;

/* loaded from: classes4.dex */
public abstract class aq extends am implements Set {
    public static final /* synthetic */ int $r8$clinit = 0;
    public transient ar a;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (set.size() == 0) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
