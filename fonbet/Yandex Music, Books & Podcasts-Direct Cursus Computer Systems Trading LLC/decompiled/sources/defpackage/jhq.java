package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.universalentities.CarouselEntitiesDto;
import com.yandex.music.shared.dto.universalentities.UniversalEntityDto;
import com.yandex.music.shared.network.repositories.retrofit.AlbumApi;
import com.yandex.music.shared.network.repositories.retrofit.TracksApi;
import com.yandex.music.shared.network.repositories.retrofit.UsersPlaylistApi;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class jhq {
    public final jyr a;
    public final jyr b;
    public final jyr c;

    public jhq(e0j e0jVar) {
        e0jVar.getClass();
        this.a = btf.b(new mze(e0jVar, 9));
        this.b = btf.b(new mze(e0jVar, 10));
        this.c = btf.b(new mze(e0jVar, 11));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cg6 cg6Var) {
        ghq ghqVar;
        int i;
        bii biiVar;
        ArrayList arrayList;
        if (cg6Var instanceof ghq) {
            ghqVar = (ghq) cg6Var;
            int i2 = ghqVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ghqVar.l = i2 - Integer.MIN_VALUE;
                Object obj = ghqVar.j;
                nm6 nm6Var = nm6.a;
                i = ghqVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<CarouselEntitiesDto>> a = ((AlbumApi) this.a.getValue()).a(str);
                    ghqVar.l = 1;
                    obj = swf.N(a, ghqVar);
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
                    List<UniversalEntityDto> items = ((CarouselEntitiesDto) ((aii) biiVar).a).getItems();
                    if (items != null) {
                        arrayList = new ArrayList();
                        for (UniversalEntityDto universalEntityDto : items) {
                            yit H = universalEntityDto != null ? tyf.H(universalEntityDto) : null;
                            if (H != null) {
                                arrayList.add(H);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    return arrayList == null ? new nj6(null) : new qj6(arrayList);
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
        ghqVar = new ghq(this, cg6Var);
        Object obj2 = ghqVar.j;
        nm6 nm6Var2 = nm6.a;
        i = ghqVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, cg6 cg6Var) {
        hhq hhqVar;
        int i;
        bii biiVar;
        ArrayList arrayList;
        if (cg6Var instanceof hhq) {
            hhqVar = (hhq) cg6Var;
            int i2 = hhqVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hhqVar.l = i2 - Integer.MIN_VALUE;
                Object obj = hhqVar.j;
                nm6 nm6Var = nm6.a;
                i = hhqVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<CarouselEntitiesDto>> a = ((UsersPlaylistApi) this.b.getValue()).a(str);
                    hhqVar.l = 1;
                    obj = swf.N(a, hhqVar);
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
                    List<UniversalEntityDto> items = ((CarouselEntitiesDto) ((aii) biiVar).a).getItems();
                    if (items != null) {
                        arrayList = new ArrayList();
                        for (UniversalEntityDto universalEntityDto : items) {
                            yit H = universalEntityDto != null ? tyf.H(universalEntityDto) : null;
                            if (H != null) {
                                arrayList.add(H);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    return arrayList == null ? new nj6(null) : new qj6(arrayList);
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
        hhqVar = new hhq(this, cg6Var);
        Object obj2 = hhqVar.j;
        nm6 nm6Var2 = nm6.a;
        i = hhqVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, cg6 cg6Var) {
        ihq ihqVar;
        int i;
        bii biiVar;
        ArrayList arrayList;
        if (cg6Var instanceof ihq) {
            ihqVar = (ihq) cg6Var;
            int i2 = ihqVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ihqVar.l = i2 - Integer.MIN_VALUE;
                Object obj = ihqVar.j;
                nm6 nm6Var = nm6.a;
                i = ihqVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<CarouselEntitiesDto>> a = ((TracksApi) this.c.getValue()).a(str);
                    ihqVar.l = 1;
                    obj = swf.N(a, ihqVar);
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
                    List<UniversalEntityDto> items = ((CarouselEntitiesDto) ((aii) biiVar).a).getItems();
                    if (items != null) {
                        arrayList = new ArrayList();
                        for (UniversalEntityDto universalEntityDto : items) {
                            yit H = universalEntityDto != null ? tyf.H(universalEntityDto) : null;
                            if (H != null) {
                                arrayList.add(H);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    return arrayList == null ? new nj6(null) : new qj6(arrayList);
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
        ihqVar = new ihq(this, cg6Var);
        Object obj2 = ihqVar.j;
        nm6 nm6Var2 = nm6.a;
        i = ihqVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }
}
