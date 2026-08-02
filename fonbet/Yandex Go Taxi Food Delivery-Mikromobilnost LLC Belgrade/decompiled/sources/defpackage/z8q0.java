package defpackage;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.d;
import java.util.function.Consumer;

/* loaded from: classes5.dex */
public final class z8q0 implements d {
    public final /* synthetic */ Consumer a;

    public z8q0(Consumer consumer) {
        this.a = consumer;
    }

    @Override // com.google.android.material.tabs.c
    public final void a(TabLayout.a aVar) {
        this.a.accept(Integer.valueOf(aVar.d));
    }

    @Override // com.google.android.material.tabs.c
    public final void b(TabLayout.a aVar) {
    }
}
