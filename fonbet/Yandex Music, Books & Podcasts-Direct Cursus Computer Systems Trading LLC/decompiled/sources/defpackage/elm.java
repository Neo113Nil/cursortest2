package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.presave.UserPreSaveDto;
import com.yandex.music.shared.dto.presave.UserPreSavesDto;
import com.yandex.music.shared.network.repositories.retrofit.PreSavesApi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class elm {
    public final jyr a;

    public elm(e0j e0jVar) {
        this.a = btf.b(new mze(e0jVar, 8));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, cg6 cg6Var) {
        blm blmVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof blm) {
            blmVar = (blm) cg6Var;
            int i2 = blmVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                blmVar.l = i2 - Integer.MIN_VALUE;
                Object obj = blmVar.j;
                nm6 nm6Var = nm6.a;
                i = blmVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<Unit> a = ((PreSavesApi) this.a.getValue()).a(str, str2, true);
                    blmVar.l = 1;
                    obj = swf.O(a, Unit.class, blmVar);
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
                    return new qj6(((aii) biiVar).a);
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
        blmVar = new blm(this, cg6Var);
        Object obj2 = blmVar.j;
        nm6 nm6Var2 = nm6.a;
        i = blmVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, cg6 cg6Var) {
        clm clmVar;
        int i;
        bii biiVar;
        ArrayList arrayList;
        if (cg6Var instanceof clm) {
            clmVar = (clm) cg6Var;
            int i2 = clmVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                clmVar.l = i2 - Integer.MIN_VALUE;
                Object obj = clmVar.j;
                nm6 nm6Var = nm6.a;
                i = clmVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<UserPreSavesDto>> c = ((PreSavesApi) this.a.getValue()).c(str, true, false);
                    clmVar.l = 1;
                    obj = swf.N(c, clmVar);
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
                    UserPreSavesDto userPreSavesDto = (UserPreSavesDto) ((aii) biiVar).a;
                    userPreSavesDto.getClass();
                    List<UserPreSaveDto> upcomingAlbums = userPreSavesDto.getUpcomingAlbums();
                    if (upcomingAlbums != null) {
                        arrayList = new ArrayList();
                        for (UserPreSaveDto userPreSaveDto : upcomingAlbums) {
                            kjm R = userPreSaveDto != null ? o5g.R(userPreSaveDto) : null;
                            if (R != null) {
                                arrayList.add(R);
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
        clmVar = new clm(this, cg6Var);
        Object obj2 = clmVar.j;
        nm6 nm6Var2 = nm6.a;
        i = clmVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, cg6 cg6Var) {
        dlm dlmVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof dlm) {
            dlmVar = (dlm) cg6Var;
            int i2 = dlmVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dlmVar.l = i2 - Integer.MIN_VALUE;
                Object obj = dlmVar.j;
                nm6 nm6Var = nm6.a;
                i = dlmVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<Unit> b = ((PreSavesApi) this.a.getValue()).b(str, str2, true);
                    dlmVar.l = 1;
                    obj = swf.O(b, Unit.class, dlmVar);
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
                    return new qj6(((aii) biiVar).a);
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
        dlmVar = new dlm(this, cg6Var);
        Object obj2 = dlmVar.j;
        nm6 nm6Var2 = nm6.a;
        i = dlmVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }
}
