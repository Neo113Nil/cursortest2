package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.artist.ArtistDto;
import com.yandex.music.shared.dto.metatag.MetaTagArtistsDto;
import com.yandex.music.shared.dto.metatag.MetaTagDto;
import com.yandex.music.shared.network.repositories.retrofit.MetaTagApi;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class k2i {
    public final MetaTagApi a;

    public k2i(e0j e0jVar) {
        this.a = (MetaTagApi) e0jVar.a.b(MetaTagApi.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ap0 ap0Var, String str3, cg6 cg6Var) {
        h2i h2iVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof h2i) {
            h2iVar = (h2i) cg6Var;
            int i2 = h2iVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h2iVar.l = i2 - Integer.MIN_VALUE;
                Object obj = h2iVar.j;
                nm6 nm6Var = nm6.a;
                i = h2iVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<MetaTagDto>> c = this.a.c(str, ap0Var.a, ap0Var.b, str2, str3);
                    h2iVar.l = 1;
                    obj = swf.N(c, h2iVar);
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
                    o0i a = u1i.a((MetaTagDto) ((aii) biiVar).a);
                    return a == null ? new nj6(null) : new qj6(a);
                }
                if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i3 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    String str4 = name == null ? "" : name;
                    String message = musicBackendInvocationError.getMessage();
                    return new kj6(i3, musicBackendInvocationError.getDetails(), str4, message == null ? "" : message, xhiVar.a);
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
        }
        h2iVar = new h2i(this, cg6Var);
        Object obj2 = h2iVar.j;
        nm6 nm6Var2 = nm6.a;
        i = h2iVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ap0 ap0Var, cg6 cg6Var) {
        i2i i2iVar;
        int i;
        bii biiVar;
        MetaTagDto.TitleDto title;
        String fullTitle;
        String title2;
        c5b c5bVar;
        c5b c5bVar2;
        o0i o0iVar;
        n0i n0iVar;
        Boolean active;
        String value;
        ArtistDto artist;
        if (cg6Var instanceof i2i) {
            i2iVar = (i2i) cg6Var;
            int i2 = i2iVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i2iVar.l = i2 - Integer.MIN_VALUE;
                Object obj = i2iVar.j;
                nm6 nm6Var = nm6.a;
                i = i2iVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<MetaTagArtistsDto>> a = this.a.a(str, ap0Var.a, ap0Var.b, null, "week");
                    i2iVar.l = 1;
                    obj = swf.N(a, i2iVar);
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
                        String str2 = name == null ? "" : name;
                        String message = musicBackendInvocationError.getMessage();
                        return new kj6(i3, musicBackendInvocationError.getDetails(), str2, message == null ? "" : message, xhiVar.a);
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
                MetaTagArtistsDto metaTagArtistsDto = (MetaTagArtistsDto) ((aii) biiVar).a;
                metaTagArtistsDto.getClass();
                String id = metaTagArtistsDto.getId();
                if (id == null || (title = metaTagArtistsDto.getTitle()) == null || (fullTitle = title.getFullTitle()) == null || (title2 = metaTagArtistsDto.getTitle().getTitle()) == null) {
                    o0iVar = null;
                } else {
                    c5b c5bVar3 = c5b.a;
                    List<MetaTagArtistsDto.DataDto> artists = metaTagArtistsDto.getArtists();
                    if (artists != null) {
                        ArrayList arrayList = new ArrayList();
                        for (MetaTagArtistsDto.DataDto dataDto : artists) {
                            c01 C = (dataDto == null || (artist = dataDto.getArtist()) == null) ? null : lxe.C(artist);
                            if (C != null) {
                                arrayList.add(C);
                            }
                        }
                        c5bVar = arrayList;
                    } else {
                        c5bVar = c5bVar3;
                    }
                    c5b c5bVar4 = c5b.a;
                    List<MetaTagDto.SortByDto> sortByValues = metaTagArtistsDto.getSortByValues();
                    if (sortByValues != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (MetaTagDto.SortByDto sortByDto : sortByValues) {
                            if (sortByDto != null && (active = sortByDto.getActive()) != null) {
                                boolean booleanValue = active.booleanValue();
                                String title3 = sortByDto.getTitle();
                                if (title3 != null && (value = sortByDto.getValue()) != null) {
                                    n0iVar = new n0i(title3, value, booleanValue);
                                    if (n0iVar == null) {
                                        arrayList2.add(n0iVar);
                                    }
                                }
                            }
                            n0iVar = null;
                            if (n0iVar == null) {
                            }
                        }
                        c5bVar2 = arrayList2;
                    } else {
                        c5bVar2 = c5bVar4;
                    }
                    o0iVar = new o0i(id, fullTitle, title2, c5bVar3, c5bVar3, c5bVar, c5bVar4, c5bVar2);
                }
                return o0iVar == null ? new nj6(null) : new qj6(o0iVar);
            }
        }
        i2iVar = new i2i(this, cg6Var);
        Object obj2 = i2iVar.j;
        nm6 nm6Var2 = nm6.a;
        i = i2iVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, ap0 ap0Var, cg6 cg6Var) {
        j2i j2iVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof j2i) {
            j2iVar = (j2i) cg6Var;
            int i2 = j2iVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j2iVar.l = i2 - Integer.MIN_VALUE;
                Object obj = j2iVar.j;
                nm6 nm6Var = nm6.a;
                i = j2iVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<MetaTagDto>> b = this.a.b(str, ap0Var.a, ap0Var.b, str2, "week");
                    j2iVar.l = 1;
                    obj = swf.N(b, j2iVar);
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
                    o0i a = u1i.a((MetaTagDto) ((aii) biiVar).a);
                    return a == null ? new nj6(null) : new qj6(a);
                }
                if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i3 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    String str3 = name == null ? "" : name;
                    String message = musicBackendInvocationError.getMessage();
                    return new kj6(i3, musicBackendInvocationError.getDetails(), str3, message == null ? "" : message, xhiVar.a);
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
        }
        j2iVar = new j2i(this, cg6Var);
        Object obj2 = j2iVar.j;
        nm6 nm6Var2 = nm6.a;
        i = j2iVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }
}
