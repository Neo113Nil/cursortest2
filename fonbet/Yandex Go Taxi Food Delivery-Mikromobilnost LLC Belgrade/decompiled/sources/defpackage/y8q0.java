package defpackage;

import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.d;
import java.util.function.Consumer;

/* loaded from: classes5.dex */
public final class y8q0 implements d {
    public final /* synthetic */ TabLayout.a a;
    public final /* synthetic */ Consumer b;
    public final /* synthetic */ View c;
    public final /* synthetic */ Consumer d;

    public y8q0(TabLayout.a aVar, Consumer consumer, View view, Consumer consumer2) {
        this.a = aVar;
        this.b = consumer;
        this.c = view;
        this.d = consumer2;
    }

    @Override // com.google.android.material.tabs.c
    public final void a(TabLayout.a aVar) {
        Consumer consumer;
        if (!jl40.l(aVar, this.a) || (consumer = this.b) == null) {
            return;
        }
        consumer.accept(this.c);
    }

    @Override // com.google.android.material.tabs.c
    public final void b(TabLayout.a aVar) {
        Consumer consumer;
        if (!jl40.l(aVar, this.a) || (consumer = this.d) == null) {
            return;
        }
        consumer.accept(this.c);
    }
}
