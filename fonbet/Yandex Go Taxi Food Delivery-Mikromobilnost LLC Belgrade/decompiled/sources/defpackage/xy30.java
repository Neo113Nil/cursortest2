package defpackage;

import com.yandex.mapkit.Time;
import java.util.Comparator;

/* loaded from: classes6.dex */
public final class xy30 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Long.valueOf(((Time) obj).getValue()).compareTo(Long.valueOf(((Time) obj2).getValue()));
    }
}
