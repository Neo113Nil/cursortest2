package B1;

import A1.m;
import A1.u;
import A1.v;
import A1.w;
import A1.x;
import com.bumptech.glide.load.data.j;
import java.util.ArrayDeque;
import u1.g;
import u1.h;

/* loaded from: classes.dex */
public final class a implements x {

    /* renamed from: b, reason: collision with root package name */
    public static final g f253b = g.a(Integer.valueOf(com.anythink.basead.exoplayer.d.f7550c), "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* renamed from: a, reason: collision with root package name */
    public final n4.c f254a;

    public a(n4.c cVar) {
        this.f254a = cVar;
    }

    @Override // A1.x
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // A1.x
    public final w b(Object obj, int i, int i4, h hVar) {
        m mVar = (m) obj;
        n4.c cVar = this.f254a;
        if (cVar != null) {
            v a9 = v.a(mVar);
            u uVar = (u) cVar.f39658u;
            Object a10 = uVar.a(a9);
            ArrayDeque arrayDeque = v.f88b;
            synchronized (arrayDeque) {
                arrayDeque.offer(a9);
            }
            m mVar2 = (m) a10;
            if (mVar2 == null) {
                uVar.f(v.a(mVar), mVar);
            } else {
                mVar = mVar2;
            }
        }
        return new w(mVar, new j(mVar, ((Integer) hVar.c(f253b)).intValue()));
    }
}
