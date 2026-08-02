package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Set;
import ru.yandex.music.R;
import ru.yandex.music.utils.Assertions;
import ru.yandex.music.utils.Preconditions;

/* loaded from: classes6.dex */
public class y7c extends bf6 {
    public String k;
    public mrr l;
    public String m;

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.view_recycler, viewGroup, false);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [s3r] */
    /* JADX WARN: Type inference failed for: r6v0, types: [s3r] */
    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        hq0 hq0Var = (hq0) Preconditions.nonNull((hq0) l());
        new HashMap();
        qd supportActionBar = hq0Var.getSupportActionBar();
        Assertions.assertNonNull(supportActionBar, "setTitle(): actionBar is null");
        if (supportActionBar != null) {
            supportActionBar.r(R.string.feedback_write_to_developers_title);
        }
        qd supportActionBar2 = hq0Var.getSupportActionBar();
        Assertions.assertNonNull(supportActionBar2, "setSubtitle(): actionBar is null");
        if (supportActionBar2 != null) {
            supportActionBar2.q(null);
        }
        qd supportActionBar3 = hq0Var.getSupportActionBar();
        Assertions.assertNonNull(supportActionBar3, "showToolbar(): actionBar is null");
        if (supportActionBar3 != null) {
            supportActionBar3.u();
        }
        Bundle bundle2 = (Bundle) Preconditions.nonNull(getArguments());
        this.k = bundle2.getString("arg_initial_message");
        this.l = (mrr) bundle2.getSerializable("arg_source");
        this.m = bundle2.getString("arg_payload");
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        final int i = 0;
        if (linearLayoutManager.i) {
            linearLayoutManager.i = false;
            linearLayoutManager.j = 0;
            RecyclerView recyclerView2 = linearLayoutManager.b;
            if (recyclerView2 != null) {
                recyclerView2.c.n();
            }
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        final int i2 = 1;
        recyclerView.setHasFixedSize(true);
        l1j l1jVar = new l1j(24);
        final x3n x3nVar = new x3n();
        x3nVar.a = new HashMap();
        x3nVar.b = Collections.newSetFromMap(new IdentityHashMap());
        x3nVar.c = new ArrayList();
        x3nVar.d = l1jVar;
        ArrayList arrayList = (ArrayList) x3nVar.c;
        int i3 = 3;
        final hjp hjpVar = new hjp(i3, new ikq(new l3l()));
        x3nVar.U(hjpVar, "title_space");
        arrayList.add(new an6(hjpVar, new fyc() { // from class: s3r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                switch (i2) {
                }
                return (Integer) ((l1j) x3nVar.d).c((qon) hjpVar.b);
            }
        }, false));
        x7c.d.getClass();
        ArrayList d = u75.d(x7c.SUBSCRIPTION, x7c.NO_ARTIST_TRACKS, x7c.CONTENT_PROBLEM, x7c.APP_PROBLEM, x7c.ENHANCEMENT, x7c.ANOTHER);
        a8c a8cVar = new a8c();
        ArrayList arrayList2 = a8cVar.d;
        arrayList2.clear();
        arrayList2.addAll(d);
        a8cVar.g();
        a8cVar.e = new g3a(14, this);
        final hjp hjpVar2 = new hjp(i3, a8cVar);
        x3nVar.U(hjpVar2, "topic_space");
        arrayList.add(new an6(hjpVar2, new fyc() { // from class: s3r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                switch (i) {
                }
                return (Integer) ((l1j) x3nVar.d).c((qon) hjpVar2.b);
            }
        }));
        HashMap hashMap = (HashMap) x3nVar.a;
        Set set = (Set) x3nVar.b;
        lum lumVar = new lum();
        lumVar.a = hashMap;
        lumVar.b = arrayList;
        lumVar.c = set;
        x3n x3nVar2 = new x3n();
        x3nVar2.a = new qj();
        x3nVar2.b = new au1(9);
        x3nVar2.c = new ppe(0);
        x3nVar2.d = lumVar;
        recyclerView.setAdapter(new oon(x3nVar2));
    }
}
