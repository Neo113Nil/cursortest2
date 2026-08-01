package h0;

import O1.q;
import Z.AbstractComponentCallbacksC0070s;
import android.util.Log;
import androidx.navigation.fragment.FragmentNavigator;
import f0.C0141f;
import f0.C0144i;

/* loaded from: classes.dex */
public final class i extends D1.j implements C1.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0144i f3256b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FragmentNavigator f3257c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0070s f3258d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(C0141f c0141f, C0144i c0144i, FragmentNavigator fragmentNavigator, AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s) {
        super(0);
        this.f3256b = c0144i;
        this.f3257c = fragmentNavigator;
        this.f3258d = abstractComponentCallbacksC0070s;
    }

    @Override // C1.a
    public final Object c() {
        C0144i c0144i = this.f3256b;
        for (C0141f c0141f : (Iterable) ((q) c0144i.f2937f.f852a).f()) {
            this.f3257c.getClass();
            if (FragmentNavigator.n()) {
                Log.v("FragmentNavigator", "Marking transition complete for entry " + c0141f + " due to fragment " + this.f3258d + " viewmodel being cleared");
            }
            c0144i.b(c0141f);
        }
        return t1.i.f4388c;
    }
}
