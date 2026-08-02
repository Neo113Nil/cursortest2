package defpackage;

import java.util.Comparator;

/* loaded from: classes14.dex */
public final class vk90 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Long.valueOf(((sk90) obj2).d).compareTo(Long.valueOf(((sk90) obj).d));
    }
}
