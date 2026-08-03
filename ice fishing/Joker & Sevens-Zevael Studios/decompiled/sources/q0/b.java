package q0;

import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5698g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Collection f5699h;

    public /* synthetic */ b(int i10, Collection collection) {
        this.f5698g = i10;
        this.f5699h = collection;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        boolean contains;
        switch (this.f5698g) {
            case 0:
                contains = this.f5699h.contains(obj);
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                contains = this.f5699h.contains(obj);
                break;
            default:
                contains = ((List) obj).retainAll(this.f5699h);
                break;
        }
        return Boolean.valueOf(contains);
    }
}
