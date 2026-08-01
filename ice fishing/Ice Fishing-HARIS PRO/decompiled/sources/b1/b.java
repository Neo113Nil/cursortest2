package b1;

import com.lumenpath.harispro.hrnavigator.ui.builder.BuilderFragment;
import h.AbstractActivityC0168i;
import t1.i;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements C1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2332a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2333b;

    public /* synthetic */ b(int i, Object obj) {
        this.f2332a = i;
        this.f2333b = obj;
    }

    @Override // C1.a
    public final Object c() {
        switch (this.f2332a) {
            case 0:
                ((BuilderFragment) this.f2333b).f2783Z = true;
                return i.f4388c;
            case 1:
                ((BuilderFragment) this.f2333b).f2783Z = false;
                return i.f4388c;
            case 2:
                ((BuilderFragment) this.f2333b).f2784a0 = true;
                return i.f4388c;
            case 3:
                ((BuilderFragment) this.f2333b).f2784a0 = false;
                return i.f4388c;
            case 4:
                ((BuilderFragment) this.f2333b).f2785b0 = true;
                return i.f4388c;
            case 5:
                ((BuilderFragment) this.f2333b).f2785b0 = false;
                return i.f4388c;
            default:
                ((AbstractActivityC0168i) this.f2333b).reportFullyDrawn();
                return null;
        }
    }
}
