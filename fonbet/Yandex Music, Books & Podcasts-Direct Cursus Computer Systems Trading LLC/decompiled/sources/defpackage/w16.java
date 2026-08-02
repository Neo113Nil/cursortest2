package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.concert.landing.ui.logic.impl.network.ConcertTabConfigApi;
import com.yandex.music.shared.concert.landing.ui.logic.impl.network.ConcertTabFeedApi;
import com.yandex.music.shared.concert.landing.ui.logic.impl.network.model.ConcertTabConfigDto;
import com.yandex.music.shared.concert.landing.ui.logic.impl.network.model.ConcertTabConfigInfoDto;
import com.yandex.music.shared.concert.landing.ui.logic.impl.network.model.ConcertTabConfigParametersDto;
import com.yandex.music.shared.concert.landing.ui.logic.impl.network.model.ConcertsFeedDto;
import com.yandex.music.shared.concert.landing.ui.logic.impl.network.model.ConcertsFeedItemDto;
import com.yandex.music.shared.dto.concert.ConcertWithPriceDto;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;

/* loaded from: classes3.dex */
public final class w16 {
    public final int a;
    public final jyr b;
    public final jyr c;

    public w16(i0j i0jVar, int i) {
        i0jVar.getClass();
        this.a = i;
        this.b = btf.b(new jt5(i0jVar, 2));
        this.c = btf.b(new jt5(i0jVar, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        u16 u16Var;
        int i;
        bii biiVar;
        n06 n06Var;
        ConcertTabConfigParametersDto top;
        o06 o06Var;
        ConcertTabConfigInfoDto configInfo;
        ConcertTabConfigParametersDto feed;
        o06 o06Var2;
        Integer offset;
        if (cg6Var instanceof u16) {
            u16Var = (u16) cg6Var;
            int i2 = u16Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u16Var.l = i2 - Integer.MIN_VALUE;
                Object obj = u16Var.j;
                nm6 nm6Var = nm6.a;
                i = u16Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<ConcertTabConfigDto>> a = ((ConcertTabConfigApi) this.b.getValue()).a();
                    u16Var.l = 1;
                    obj = swf.N(a, u16Var);
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
                ConcertTabConfigDto concertTabConfigDto = (ConcertTabConfigDto) ((aii) biiVar).a;
                concertTabConfigDto.getClass();
                ConcertTabConfigInfoDto configInfo2 = concertTabConfigDto.getConfigInfo();
                if (configInfo2 != null && (top = configInfo2.getTop()) != null) {
                    Integer offset2 = top.getOffset();
                    if (offset2 != null) {
                        int intValue = offset2.intValue();
                        Integer limit = top.getLimit();
                        if (limit != null) {
                            o06Var = new o06(intValue, limit.intValue());
                            if (o06Var != null && (configInfo = concertTabConfigDto.getConfigInfo()) != null && (feed = configInfo.getFeed()) != null) {
                                offset = feed.getOffset();
                                if (offset != null) {
                                    int intValue2 = offset.intValue();
                                    Integer limit2 = feed.getLimit();
                                    if (limit2 != null) {
                                        o06Var2 = new o06(intValue2, limit2.intValue());
                                        if (o06Var2 != null) {
                                            n06Var = new n06(o06Var, o06Var2);
                                            return n06Var != null ? new nj6(null) : new qj6(n06Var);
                                        }
                                    }
                                }
                                o06Var2 = null;
                                if (o06Var2 != null) {
                                }
                            }
                        }
                    }
                    o06Var = null;
                    if (o06Var != null) {
                        offset = feed.getOffset();
                        if (offset != null) {
                        }
                        o06Var2 = null;
                        if (o06Var2 != null) {
                        }
                    }
                }
                n06Var = null;
                if (n06Var != null) {
                }
            }
        }
        u16Var = new u16(this, cg6Var);
        Object obj2 = u16Var.j;
        nm6 nm6Var2 = nm6.a;
        i = u16Var.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Long l, cg6 cg6Var) {
        v16 v16Var;
        int i;
        bii biiVar;
        ArrayList arrayList;
        s26 s26Var;
        if (cg6Var instanceof v16) {
            v16Var = (v16) cg6Var;
            int i2 = v16Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v16Var.l = i2 - Integer.MIN_VALUE;
                Object obj = v16Var.j;
                nm6 nm6Var = nm6.a;
                i = v16Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<ConcertsFeedDto>> a = ((ConcertTabFeedApi) this.c.getValue()).a(l != null ? String.valueOf(l.longValue()) : null);
                    v16Var.l = 1;
                    obj = swf.N(a, v16Var);
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
                ConcertsFeedDto concertsFeedDto = (ConcertsFeedDto) ((aii) biiVar).a;
                concertsFeedDto.getClass();
                List<ConcertsFeedItemDto> items = concertsFeedDto.getItems();
                if (items != null) {
                    arrayList = new ArrayList();
                    for (ConcertsFeedItemDto concertsFeedItemDto : items) {
                        if (concertsFeedItemDto instanceof ConcertsFeedItemDto.ConcertEntityDto) {
                            ConcertWithPriceDto concertItem = ((ConcertsFeedItemDto.ConcertEntityDto) concertsFeedItemDto).getConcertItem();
                            if (concertItem != null) {
                                s26Var = hag.D(concertItem, this.a);
                                if (s26Var == null) {
                                    arrayList.add(s26Var);
                                }
                            }
                        } else if (concertsFeedItemDto != null) {
                            b6e.s();
                            return null;
                        }
                        s26Var = null;
                        if (s26Var == null) {
                        }
                    }
                } else {
                    arrayList = null;
                }
                return arrayList == null ? new nj6(null) : new qj6(arrayList);
            }
        }
        v16Var = new v16(this, cg6Var);
        Object obj2 = v16Var.j;
        nm6 nm6Var2 = nm6.a;
        i = v16Var.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }
}
