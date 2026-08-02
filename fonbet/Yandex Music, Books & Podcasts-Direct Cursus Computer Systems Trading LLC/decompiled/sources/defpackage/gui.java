package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.myshelf.data.remote.MyShelfApi;
import com.yandex.music.shared.myshelf.data.remote.MyShelfCatalogDto;
import com.yandex.music.shared.myshelf.data.remote.MyShelfEntityDto;
import com.yandex.music.shared.myshelf.data.remote.MyShelfHistoryDto;
import com.yandex.music.shared.myshelf.data.remote.MyShelfHistoryPagerDto;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;

/* loaded from: classes3.dex */
public final class gui {
    public final MyShelfApi a;

    public gui(MyShelfApi myShelfApi) {
        myShelfApi.getClass();
        this.a = myShelfApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        dui duiVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof dui) {
            duiVar = (dui) cg6Var;
            int i2 = duiVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                duiVar.l = i2 - Integer.MIN_VALUE;
                Object obj = duiVar.j;
                nm6 nm6Var = nm6.a;
                i = duiVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<MyShelfCatalogDto>> bookshelf = this.a.bookshelf();
                    duiVar.l = 1;
                    obj = swf.N(bookshelf, duiVar);
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
                if (!(biiVar instanceof aii)) {
                    return new qj6(y7g.S((MyShelfCatalogDto) ((aii) biiVar).a));
                }
                if (!(biiVar instanceof xhi)) {
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
                xhi xhiVar = (xhi) biiVar;
                MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                int i3 = xhiVar.b;
                String name = musicBackendInvocationError.getName();
                if (name == null) {
                    name = "";
                }
                String message = musicBackendInvocationError.getMessage();
                if (message == null) {
                    message = "";
                }
                return new kj6(i3, musicBackendInvocationError.getDetails(), name, message, xhiVar.a);
            }
        }
        duiVar = new dui(this, cg6Var);
        Object obj2 = duiVar.j;
        nm6 nm6Var2 = nm6.a;
        i = duiVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r3v4, types: [c5b] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i, int i2, cg6 cg6Var) {
        eui euiVar;
        int i3;
        bii biiVar;
        ?? r3;
        if (cg6Var instanceof eui) {
            euiVar = (eui) cg6Var;
            int i4 = euiVar.n;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                euiVar.n = i4 - Integer.MIN_VALUE;
                Object obj = euiVar.l;
                nm6 nm6Var = nm6.a;
                i3 = euiVar.n;
                if (i3 != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<MyShelfHistoryDto>> myShelfHistory = this.a.myShelfHistory(i, i2);
                    euiVar.j = i;
                    euiVar.k = i2;
                    euiVar.n = 1;
                    obj = swf.N(myShelfHistory, euiVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = euiVar.k;
                    i = euiVar.j;
                    qgg.h0(obj);
                }
                biiVar = (bii) obj;
                if (biiVar instanceof aii) {
                    if (biiVar instanceof xhi) {
                        xhi xhiVar = (xhi) biiVar;
                        MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                        int i5 = xhiVar.b;
                        String name = musicBackendInvocationError.getName();
                        String str = name == null ? "" : name;
                        String message = musicBackendInvocationError.getMessage();
                        return new kj6(i5, musicBackendInvocationError.getDetails(), str, message == null ? "" : message, xhiVar.a);
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
                MyShelfHistoryDto myShelfHistoryDto = (MyShelfHistoryDto) ((aii) biiVar).a;
                myShelfHistoryDto.getClass();
                String title = myShelfHistoryDto.getTitle();
                List<MyShelfEntityDto> entities = myShelfHistoryDto.getEntities();
                ap0 ap0Var = null;
                if (entities != null) {
                    r3 = new ArrayList();
                    for (MyShelfEntityDto myShelfEntityDto : entities) {
                        xsi T = myShelfEntityDto != null ? y7g.T(myShelfEntityDto) : null;
                        if (T != null) {
                            r3.add(T);
                        }
                    }
                } else {
                    r3 = c5b.a;
                }
                MyShelfHistoryPagerDto pager = myShelfHistoryDto.getPager();
                if (pager != null && pager.b(i, i2)) {
                    Integer total = pager.getTotal();
                    ap0Var = new ap0(i, i2, total != null ? total.intValue() : Integer.MAX_VALUE);
                }
                return new qj6(new tui(title, r3, ap0Var));
            }
        }
        euiVar = new eui(this, cg6Var);
        Object obj2 = euiVar.l;
        nm6 nm6Var2 = nm6.a;
        i3 = euiVar.n;
        if (i3 != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(cg6 cg6Var) {
        fui fuiVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof fui) {
            fuiVar = (fui) cg6Var;
            int i2 = fuiVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fuiVar.l = i2 - Integer.MIN_VALUE;
                Object obj = fuiVar.j;
                nm6 nm6Var = nm6.a;
                i = fuiVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<MyShelfCatalogDto>> newEpisodes = this.a.newEpisodes();
                    fuiVar.l = 1;
                    obj = swf.N(newEpisodes, fuiVar);
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
                if (!(biiVar instanceof aii)) {
                    return new qj6(y7g.S((MyShelfCatalogDto) ((aii) biiVar).a));
                }
                if (!(biiVar instanceof xhi)) {
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
                xhi xhiVar = (xhi) biiVar;
                MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                int i3 = xhiVar.b;
                String name = musicBackendInvocationError.getName();
                if (name == null) {
                    name = "";
                }
                String message = musicBackendInvocationError.getMessage();
                if (message == null) {
                    message = "";
                }
                return new kj6(i3, musicBackendInvocationError.getDetails(), name, message, xhiVar.a);
            }
        }
        fuiVar = new fui(this, cg6Var);
        Object obj2 = fuiVar.j;
        nm6 nm6Var2 = nm6.a;
        i = fuiVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }
}
