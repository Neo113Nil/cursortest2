package androidx.compose.foundation.lazy.layout;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class CachedItem {
    public static final NoKey NoKey = new NoKey();
    public Object key;
    public int mainAxisSize;

    public final class NoKey {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CachedItem(key=");
        sb.append(this.key);
        sb.append(", mainAxisSize=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.mainAxisSize, ')');
    }
}
