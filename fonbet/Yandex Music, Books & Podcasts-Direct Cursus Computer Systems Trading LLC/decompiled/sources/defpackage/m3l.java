package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.GestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class m3l implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p8n b;

    public /* synthetic */ m3l(p8n p8nVar, int i) {
        this.a = i;
        this.b = p8nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        p8n p8nVar = this.b;
        switch (i) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                RecyclerView recyclerView = new RecyclerView(context);
                recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                recyclerView.setAdapter(p8nVar);
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
                s0f s0fVar = p8nVar.o;
                o0f o0fVar = s0fVar.z;
                RecyclerView recyclerView2 = s0fVar.r;
                if (recyclerView2 != recyclerView) {
                    if (recyclerView2 != null) {
                        ArrayList arrayList = s0fVar.p;
                        recyclerView2.u0(s0fVar);
                        RecyclerView recyclerView3 = s0fVar.r;
                        recyclerView3.q.remove(o0fVar);
                        if (recyclerView3.r == o0fVar) {
                            recyclerView3.r = null;
                        }
                        ArrayList arrayList2 = s0fVar.r.C;
                        if (arrayList2 != null) {
                            arrayList2.remove(s0fVar);
                        }
                        int size = arrayList.size();
                        while (true) {
                            size--;
                            if (size >= 0) {
                                p0f p0fVar = (p0f) arrayList.get(0);
                                p0fVar.g.cancel();
                                s0fVar.m.d(s0fVar.r, p0fVar.e);
                            } else {
                                arrayList.clear();
                                s0fVar.w = null;
                                VelocityTracker velocityTracker = s0fVar.t;
                                if (velocityTracker != null) {
                                    velocityTracker.recycle();
                                    s0fVar.t = null;
                                }
                                r0f r0fVar = s0fVar.y;
                                if (r0fVar != null) {
                                    r0fVar.a = false;
                                    s0fVar.y = null;
                                }
                                if (s0fVar.x != null) {
                                    s0fVar.x = null;
                                }
                            }
                        }
                    }
                    s0fVar.r = recyclerView;
                    Resources resources = recyclerView.getResources();
                    s0fVar.f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
                    s0fVar.g = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
                    s0fVar.q = ViewConfiguration.get(s0fVar.r.getContext()).getScaledTouchSlop();
                    s0fVar.r.s(s0fVar);
                    s0fVar.r.q.add(o0fVar);
                    RecyclerView recyclerView4 = s0fVar.r;
                    if (recyclerView4.C == null) {
                        recyclerView4.C = new ArrayList();
                    }
                    recyclerView4.C.add(s0fVar);
                    s0fVar.y = new r0f(s0fVar);
                    s0fVar.x = new GestureDetector(s0fVar.r.getContext(), s0fVar.y);
                }
                recyclerView.s(p8nVar.p);
                recyclerView.setId(R.id.queue_recycler);
                return recyclerView;
            default:
                p8n.w(p8nVar, ((Integer) obj).intValue());
                return Unit.a;
        }
    }
}
