package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class mle {
    public static final mle b = new mle(0);
    public final /* synthetic */ int a;

    public /* synthetic */ mle(int i) {
        this.a = i;
    }

    public static kle a(mle mleVar, List list, List list2, int i) {
        if ((i & 1) != 0) {
            list = null;
        }
        if ((i & 2) != 0) {
            list2 = null;
        }
        return new lle(list, list2);
    }

    public final kle b() {
        switch (this.a) {
            case 0:
                return jle.b;
            default:
                return a(this, null, null, 3);
        }
    }

    public final kle c() {
        switch (this.a) {
            case 0:
                return jle.b;
            default:
                return new jle(1);
        }
    }

    public final kle d() {
        switch (this.a) {
            case 0:
                return jle.b;
            default:
                return a(this, u75.h("freemium", "lowbattery", "kids_tab_visibility_informer", "concert", "donation", "smart_cache_restrictions_informer", "DiskSpaceInformerEntity"), null, 2);
        }
    }

    public final kle e() {
        switch (this.a) {
            case 0:
                return jle.b;
            default:
                return a(this, null, t75.c("freemium"), 1);
        }
    }
}
