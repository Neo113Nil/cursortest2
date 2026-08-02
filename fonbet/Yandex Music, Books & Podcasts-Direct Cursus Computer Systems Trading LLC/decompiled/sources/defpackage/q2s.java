package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.skeleton.blocks.tabs.TabDataDto;
import com.yandex.music.shared.skeleton.blocks.tabs.TabsBlockApi;
import com.yandex.music.shared.skeleton.blocks.tabs.TabsEntitiesDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class q2s {
    public final jyr a;

    public q2s(upq upqVar) {
        e0j c = upqVar.c();
        c.getClass();
        this.a = btf.b(new mze(c, 15));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        if (r7 == false) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(drf drfVar, onq onqVar, boolean z, cg6 cg6Var) {
        p2s p2sVar;
        int i;
        bii biiVar;
        c5b c5bVar;
        if (cg6Var instanceof p2s) {
            p2sVar = (p2s) cg6Var;
            int i2 = p2sVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p2sVar.l = i2 - Integer.MIN_VALUE;
                Object obj = p2sVar.j;
                nm6 nm6Var = nm6.a;
                i = p2sVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<TabsEntitiesDto>> a = ((TabsBlockApi) this.a.getValue()).a(onqVar.a, men.G(drfVar.a()), z ? "no-cache" : null);
                    p2sVar.l = 1;
                    obj = swf.N(a, p2sVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                biiVar = (bii) obj;
                if (biiVar instanceof aii) {
                    if (biiVar instanceof xhi) {
                        xhi xhiVar = (xhi) biiVar;
                        MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                        int i3 = xhiVar.b;
                        String name = musicBackendInvocationError.getName();
                        String str = name == null ? "" : name;
                        String message = musicBackendInvocationError.getMessage();
                        return new kj6(i3, musicBackendInvocationError.getDetails(), str, message == null ? "" : message, xhiVar.a);
                    }
                    if (biiVar instanceof yhi) {
                        yhi yhiVar = (yhi) biiVar;
                        return new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                    }
                    if (biiVar instanceof zhi) {
                        return uwf.J((zhi) biiVar);
                    }
                    b6e.s();
                    return null;
                }
                TabsEntitiesDto tabsEntitiesDto = (TabsEntitiesDto) ((aii) biiVar).a;
                tabsEntitiesDto.getClass();
                List tabs = tabsEntitiesDto.getTabs();
                if (tabs != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = tabs.iterator();
                    while (it.hasNext()) {
                        r0s N = zdg.N((TabDataDto) it.next(), null);
                        if (N != null) {
                            arrayList.add(N);
                        }
                    }
                    boolean isEmpty = arrayList.isEmpty();
                    c5bVar = arrayList;
                }
                c5bVar = null;
                if (c5bVar == null) {
                    c5bVar = c5b.a;
                }
                return c5bVar == null ? new nj6(null) : new qj6(c5bVar);
            }
        }
        p2sVar = new p2s(this, cg6Var);
        Object obj2 = p2sVar.j;
        nm6 nm6Var2 = nm6.a;
        i = p2sVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }
}
