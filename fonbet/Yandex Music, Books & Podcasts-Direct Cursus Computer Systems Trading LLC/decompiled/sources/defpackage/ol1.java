package defpackage;

import com.yandex.music.screen.artist.albums.data.PagingResultTracksDto;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.dto.PagerDto;
import com.yandex.music.shared.network.api.retrofit.IllegalRequestOnNetworkModeException;
import com.yandex.music.shared.network.api.retrofit.MusicBackendHttpException;
import com.yandex.music.shared.network.api.retrofit.MusicCommonHttpException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class ol1 {
    public final jyr a = btf.b(new pa1(18));

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ql1 a(PagingResultTracksDto pagingResultTracksDto) {
        PagerDto pager;
        ap0 ap0Var;
        List tracks = pagingResultTracksDto.getTracks();
        if (tracks != null && (pager = pagingResultTracksDto.getPager()) != null) {
            ArrayList b = wts.b(tracks);
            Integer page = pager.getPage();
            int intValue = page != null ? page.intValue() : 0;
            Integer perPage = pager.getPerPage();
            if (perPage != null) {
                int intValue2 = perPage.intValue();
                Integer total = pager.getTotal();
                if (total != null) {
                    ap0Var = new ap0(intValue, intValue2, total.intValue());
                    if (ap0Var != null) {
                        return new ql1(b, ap0Var);
                    }
                }
            }
            ap0Var = null;
            if (ap0Var != null) {
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f A[Catch: IOException -> 0x0029, IllegalRequestOnNetworkModeException -> 0x002c, MusicCommonHttpException -> 0x002f, MusicBackendHttpException -> 0x0032, TryCatch #2 {IllegalRequestOnNetworkModeException -> 0x002c, MusicBackendHttpException -> 0x0032, MusicCommonHttpException -> 0x002f, IOException -> 0x0029, blocks: (B:11:0x0025, B:12:0x0057, B:14:0x005f, B:17:0x0066, B:22:0x003f), top: B:8:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066 A[Catch: IOException -> 0x0029, IllegalRequestOnNetworkModeException -> 0x002c, MusicCommonHttpException -> 0x002f, MusicBackendHttpException -> 0x0032, TRY_LEAVE, TryCatch #2 {IllegalRequestOnNetworkModeException -> 0x002c, MusicBackendHttpException -> 0x0032, MusicCommonHttpException -> 0x002f, IOException -> 0x0029, blocks: (B:11:0x0025, B:12:0x0057, B:14:0x005f, B:17:0x0066, B:22:0x003f), top: B:8:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ap0 ap0Var, boolean z, cg6 cg6Var) {
        nl1 nl1Var;
        int i;
        try {
            if (cg6Var instanceof nl1) {
                nl1Var = (nl1) cg6Var;
                int i2 = nl1Var.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    nl1Var.l = i2 - Integer.MIN_VALUE;
                    nl1 nl1Var2 = nl1Var;
                    Object obj = nl1Var2.j;
                    nm6 nm6Var = nm6.a;
                    i = nl1Var2.l;
                    if (i != 0) {
                        qgg.h0(obj);
                        pl1 pl1Var = (pl1) this.a.getValue();
                        int i3 = ap0Var.a;
                        int i4 = ap0Var.b;
                        nl1Var2.l = 1;
                        obj = pl1Var.J(str, i3, i4, z, nl1Var2);
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
                    ql1 a = a((PagingResultTracksDto) obj);
                    return a != null ? new nj6(null) : new qj6(a);
                }
            }
            if (i != 0) {
            }
            ql1 a2 = a((PagingResultTracksDto) obj);
            if (a2 != null) {
            }
        } catch (IllegalRequestOnNetworkModeException e) {
            return new oj6(e.a, e.b);
        } catch (MusicBackendHttpException e2) {
            MusicBackendInvocationError musicBackendInvocationError = e2.b;
            String name = musicBackendInvocationError.getName();
            String str2 = name == null ? "" : name;
            String message = musicBackendInvocationError.getMessage();
            return new kj6(e2.a, musicBackendInvocationError.getDetails(), str2, message == null ? "" : message, e2.c);
        } catch (MusicCommonHttpException e3) {
            return new lj6(e3.a, e3.b, e3.c);
        } catch (IOException e4) {
            return new oj6(btf.b(new ur(2, e4)));
        }
        nl1Var = new nl1(this, cg6Var);
        nl1 nl1Var22 = nl1Var;
        Object obj2 = nl1Var22.j;
        nm6 nm6Var2 = nm6.a;
        i = nl1Var22.l;
    }
}
