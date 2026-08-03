package h2;

import java.util.Comparator;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2636a;

    public /* synthetic */ d(int i10) {
        this.f2636a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2636a) {
        }
        return a.a.p(Integer.valueOf(((c) obj).f2632b), Integer.valueOf(((c) obj2).f2632b));
    }
}
