package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.album.AlbumDto;
import com.yandex.music.shared.dto.album.AlbumRelatedAlbumsBlockDto;
import com.yandex.music.shared.dto.album.AlbumRelatedContentBlockDto;
import com.yandex.music.shared.dto.album.AlbumRelatedContentBlocksDto;
import com.yandex.music.shared.dto.artist.ArtistAlbumsDto;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import retrofit2.Call;
import ru.yandex.music.api.AlbumApi;

/* loaded from: classes6.dex */
public final class ay {
    public final ss a;
    public final aoi b;
    public final b20 c;
    public final AlbumApi d;
    public final yr e;

    public ay(ss ssVar, aoi aoiVar, b20 b20Var, AlbumApi albumApi, yr yrVar) {
        this.a = ssVar;
        this.b = aoiVar;
        this.c = b20Var;
        this.d = albumApi;
        this.e = yrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cg6 cg6Var) {
        ux uxVar;
        int i;
        bii biiVar;
        qx qxVar;
        px pxVar;
        String type;
        sx W;
        if (cg6Var instanceof ux) {
            uxVar = (ux) cg6Var;
            int i2 = uxVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uxVar.l = i2 - Integer.MIN_VALUE;
                Object obj = uxVar.j;
                nm6 nm6Var = nm6.a;
                i = uxVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<AlbumRelatedContentBlocksDto>> b = this.d.b(str);
                    uxVar.l = 1;
                    obj = swf.N(b, uxVar);
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
                AlbumRelatedContentBlocksDto albumRelatedContentBlocksDto = (AlbumRelatedContentBlocksDto) ((aii) biiVar).a;
                albumRelatedContentBlocksDto.getClass();
                List<AlbumRelatedContentBlockDto> blocks = albumRelatedContentBlocksDto.getBlocks();
                if (blocks != null) {
                    ArrayList arrayList = new ArrayList();
                    for (AlbumRelatedContentBlockDto albumRelatedContentBlockDto : blocks) {
                        if (albumRelatedContentBlockDto != null) {
                            if (!(albumRelatedContentBlockDto instanceof AlbumRelatedAlbumsBlockDto)) {
                                b6e.s();
                                return null;
                            }
                            AlbumRelatedAlbumsBlockDto albumRelatedAlbumsBlockDto = (AlbumRelatedAlbumsBlockDto) albumRelatedContentBlockDto;
                            String id = albumRelatedAlbumsBlockDto.getId();
                            if (id != null && (type = albumRelatedAlbumsBlockDto.getType()) != null && (W = vut.W(type)) != null) {
                                String title = albumRelatedAlbumsBlockDto.getTitle();
                                String categoryId = albumRelatedAlbumsBlockDto.getCategoryId();
                                List<AlbumDto> albums = albumRelatedAlbumsBlockDto.getAlbums();
                                if (albums != null) {
                                    ArrayList arrayList2 = new ArrayList();
                                    for (AlbumDto albumDto : albums) {
                                        oq G = albumDto != null ? ild.G(albumDto) : null;
                                        if (G != null) {
                                            arrayList2.add(G);
                                        }
                                    }
                                    pxVar = new px(id, W, title, categoryId, arrayList2);
                                    if (pxVar == null) {
                                        arrayList.add(pxVar);
                                    }
                                }
                            }
                        }
                        pxVar = null;
                        if (pxVar == null) {
                        }
                    }
                    if (arrayList.isEmpty()) {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        qxVar = new qx(arrayList);
                        return qxVar != null ? new nj6(null) : new qj6(qxVar);
                    }
                }
                qxVar = null;
                if (qxVar != null) {
                }
            }
        }
        uxVar = new ux(this, cg6Var);
        Object obj2 = uxVar.j;
        nm6 nm6Var2 = nm6.a;
        i = uxVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum b(oq oqVar, cg6 cg6Var) {
        vx vxVar;
        int i;
        r10 r10Var;
        if (cg6Var instanceof vx) {
            vxVar = (vx) cg6Var;
            int i2 = vxVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vxVar.m = i2 - Integer.MIN_VALUE;
                Object obj = vxVar.k;
                nm6 nm6Var = nm6.a;
                i = vxVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    l18 l18Var = l18.b;
                    bdt I = hag.I(frt.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    String str = ((frt) qdcVar.C(I)).c().a;
                    str.getClass();
                    b20 b20Var = this.c;
                    String str2 = oqVar.a;
                    vxVar.j = oqVar;
                    vxVar.m = 1;
                    obj = b20Var.a.c(str, str2, vxVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oqVar = vxVar.j;
                    qgg.h0(obj);
                }
                r10Var = (r10) obj;
                if (r10Var != null) {
                    return oqVar.f();
                }
                int ordinal = r10Var.ordinal();
                if (ordinal == 0) {
                    return mq.Desc;
                }
                if (ordinal == 1) {
                    return mq.Asc;
                }
                b6e.s();
                return null;
            }
        }
        vxVar = new vx(this, cg6Var);
        Object obj2 = vxVar.k;
        nm6 nm6Var2 = nm6.a;
        i = vxVar.m;
        if (i != 0) {
        }
        r10Var = (r10) obj2;
        if (r10Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, cg6 cg6Var) {
        wx wxVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof wx) {
            wxVar = (wx) cg6Var;
            int i2 = wxVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wxVar.l = i2 - Integer.MIN_VALUE;
                Object obj = wxVar.j;
                nm6 nm6Var = nm6.a;
                i = wxVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<ArtistAlbumsDto>> a = this.d.a(str);
                    wxVar.l = 1;
                    obj = swf.N(a, wxVar);
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
                    List albums = ((ArtistAlbumsDto) ((aii) biiVar).a).getAlbums();
                    ArrayList I = albums != null ? ild.I(albums) : null;
                    return I == null ? new nj6(null) : new qj6(I);
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
        wxVar = new wx(this, cg6Var);
        Object obj2 = wxVar.j;
        nm6 nm6Var2 = nm6.a;
        i = wxVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004f, code lost:
    
        if (r10 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, boolean z, cg6 cg6Var) {
        yx yxVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof yx) {
            yxVar = (yx) cg6Var;
            int i2 = yxVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yxVar.n = i2 - Integer.MIN_VALUE;
                Object obj = yxVar.l;
                nm6 nm6Var = nm6.a;
                i = yxVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    yxVar.k = z;
                    yxVar.n = 1;
                    yr yrVar = this.e;
                    obj = z ? yrVar.d(str, yxVar) : yrVar.a(str, yxVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Object obj2 = yxVar.j;
                        qgg.h0(obj);
                        return obj2;
                    }
                    z = yxVar.k;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    oq oqVar = (oq) ((qj6) rj6Var).a;
                    mn7 mn7Var = dm6.a;
                    qi qiVar = new qi((Continuation) null, this, oqVar, 3);
                    yxVar.j = obj;
                    yxVar.k = z;
                    yxVar.n = 2;
                    if (x97.V(mn7Var, qiVar, yxVar) == nm6Var) {
                        return nm6Var;
                    }
                } else if (!(rj6Var instanceof pj6)) {
                    b6e.s();
                    return null;
                }
                return obj;
            }
        }
        yxVar = new yx(this, cg6Var);
        Object obj3 = yxVar.l;
        nm6 nm6Var2 = nm6.a;
        i = yxVar.n;
        if (i != 0) {
        }
        rj6Var = (rj6) obj3;
        if (!(rj6Var instanceof qj6)) {
        }
        return obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004f, code lost:
    
        if (r10 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, boolean z, cg6 cg6Var) {
        zx zxVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof zx) {
            zxVar = (zx) cg6Var;
            int i2 = zxVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zxVar.n = i2 - Integer.MIN_VALUE;
                Object obj = zxVar.l;
                nm6 nm6Var = nm6.a;
                i = zxVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    zxVar.k = z;
                    zxVar.n = 1;
                    yr yrVar = this.e;
                    obj = z ? yrVar.c(str, true, zxVar) : yrVar.b(str, zxVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Object obj2 = zxVar.j;
                        qgg.h0(obj);
                        return obj2;
                    }
                    z = zxVar.k;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    mt mtVar = (mt) ((qj6) rj6Var).a;
                    mn7 mn7Var = dm6.a;
                    qi qiVar = new qi((Continuation) null, this, mtVar, 4);
                    zxVar.j = obj;
                    zxVar.k = z;
                    zxVar.n = 2;
                    if (x97.V(mn7Var, qiVar, zxVar) == nm6Var) {
                        return nm6Var;
                    }
                } else if (!(rj6Var instanceof pj6)) {
                    b6e.s();
                    return null;
                }
                return obj;
            }
        }
        zxVar = new zx(this, cg6Var);
        Object obj3 = zxVar.l;
        nm6 nm6Var2 = nm6.a;
        i = zxVar.n;
        if (i != 0) {
        }
        rj6Var = (rj6) obj3;
        if (!(rj6Var instanceof qj6)) {
        }
        return obj3;
    }
}
