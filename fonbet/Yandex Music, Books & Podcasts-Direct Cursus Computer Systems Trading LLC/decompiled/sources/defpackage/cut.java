package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.playlist.PlaylistHeaderDto;
import com.yandex.music.shared.network.api.retrofit.IllegalRequestOnNetworkModeException;
import com.yandex.music.shared.network.api.retrofit.MusicBackendHttpException;
import com.yandex.music.shared.network.api.retrofit.MusicCommonHttpException;
import com.yandex.music.shared.network.repositories.retrofit.UsersPlaylistApi;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.text.StringsKt;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class cut {
    public final String a;
    public final UsersPlaylistApi b;
    public final jyr c;
    public final jyr d;

    public cut(e0j e0jVar, String str) {
        str.getClass();
        this.a = str;
        this.b = (UsersPlaylistApi) e0jVar.a.b(UsersPlaylistApi.class);
        this.c = btf.b(new mze(e0jVar, 17));
        this.d = btf.b(new mze(e0jVar, 18));
    }

    public static /* synthetic */ Object h(cut cutVar, String str, String str2, boolean z, boolean z2, cg6 cg6Var, int i) {
        cg6 cg6Var2;
        boolean z3;
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        if ((i & 16) != 0) {
            cg6Var2 = cg6Var;
            z3 = true;
        } else {
            cg6Var2 = cg6Var;
            z3 = false;
        }
        return cutVar.f(str, str2, z, z2, z3, cg6Var2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, int i, String str3, cg6 cg6Var) {
        ntt nttVar;
        int i2;
        bii biiVar;
        if (cg6Var instanceof ntt) {
            nttVar = (ntt) cg6Var;
            int i3 = nttVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nttVar.l = i3 - Integer.MIN_VALUE;
                Object obj = nttVar.j;
                nm6 nm6Var = nm6.a;
                i2 = nttVar.l;
                if (i2 != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<PlaylistHeaderDto>> e = this.b.e(str, str2, i, str3);
                    nttVar.l = 1;
                    obj = swf.N(e, nttVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                biiVar = (bii) obj;
                if (!(biiVar instanceof aii)) {
                    return new qj6(uwf.I((PlaylistHeaderDto) ((aii) biiVar).a));
                }
                if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i4 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    String str4 = name == null ? "" : name;
                    String message = musicBackendInvocationError.getMessage();
                    return new kj6(i4, musicBackendInvocationError.getDetails(), str4, message == null ? "" : message, xhiVar.a);
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
        nttVar = new ntt(this, cg6Var);
        Object obj2 = nttVar.j;
        nm6 nm6Var2 = nm6.a;
        i2 = nttVar.l;
        if (i2 != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, String str3, String str4, cg6 cg6Var) {
        ott ottVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof ott) {
            ottVar = (ott) cg6Var;
            int i2 = ottVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ottVar.l = i2 - Integer.MIN_VALUE;
                Object obj = ottVar.j;
                nm6 nm6Var = nm6.a;
                i = ottVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<PlaylistHeaderDto>> o = this.b.o(str, str2, str3, str4);
                    ottVar.l = 1;
                    obj = swf.N(o, ottVar);
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
                    return new qj6(uwf.I((PlaylistHeaderDto) ((aii) biiVar).a));
                }
                if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i3 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    String str5 = name == null ? "" : name;
                    String message = musicBackendInvocationError.getMessage();
                    return new kj6(i3, musicBackendInvocationError.getDetails(), str5, message == null ? "" : message, xhiVar.a);
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
        ottVar = new ott(this, cg6Var);
        Object obj2 = ottVar.j;
        nm6 nm6Var2 = nm6.a;
        i = ottVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, cg6 cg6Var) {
        ptt pttVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof ptt) {
            pttVar = (ptt) cg6Var;
            int i2 = pttVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pttVar.l = i2 - Integer.MIN_VALUE;
                Object obj = pttVar.j;
                nm6 nm6Var = nm6.a;
                i = pttVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<PlaylistHeaderDto>> c = this.b.c(str, str2);
                    pttVar.l = 1;
                    obj = swf.N(c, pttVar);
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
                    return new qj6(uwf.I((PlaylistHeaderDto) ((aii) biiVar).a));
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
        pttVar = new ptt(this, cg6Var);
        Object obj2 = pttVar.j;
        nm6 nm6Var2 = nm6.a;
        i = pttVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, cg6 cg6Var) {
        qtt qttVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof qtt) {
            qttVar = (qtt) cg6Var;
            int i2 = qttVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qttVar.l = i2 - Integer.MIN_VALUE;
                Object obj = qttVar.j;
                nm6 nm6Var = nm6.a;
                i = qttVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<Unit> l = this.b.l(str, str2);
                    qttVar.l = 1;
                    obj = swf.O(l, Unit.class, qttVar);
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
        qttVar = new qtt(this, cg6Var);
        Object obj2 = qttVar.j;
        nm6 nm6Var2 = nm6.a;
        i = qttVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(cvl cvlVar, cg6 cg6Var) {
        rtt rttVar;
        int i;
        cvl cvlVar2;
        cut cutVar;
        try {
            if (cg6Var instanceof rtt) {
                rttVar = (rtt) cg6Var;
                int i2 = rttVar.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    rttVar.n = i2 - Integer.MIN_VALUE;
                    rtt rttVar2 = rttVar;
                    Object obj = rttVar2.l;
                    nm6 nm6Var = nm6.a;
                    i = rttVar2.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        eut eutVar = (eut) this.c.getValue();
                        String str = cvlVar.c.a;
                        String str2 = cvlVar.a;
                        UsersPlaylistApi usersPlaylistApi = this.b;
                        rttVar2.j = cvlVar;
                        rttVar2.k = this;
                        rttVar2.n = 1;
                        obj = eutVar.n(str, str2, false, usersPlaylistApi, rttVar2);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        cvlVar2 = cvlVar;
                        cutVar = this;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            cvl cvlVar3 = rttVar2.j;
                            qgg.h0(obj);
                            bii biiVar = (bii) obj;
                            if (biiVar instanceof aii) {
                                return new qj6(zdg.L(n((PlaylistHeaderDto) ((aii) biiVar).a, cvlVar3)));
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
                        cutVar = rttVar2.k;
                        cvlVar2 = rttVar2.j;
                        qgg.h0(obj);
                    }
                    return new qj6(zdg.L(cutVar.n((PlaylistHeaderDto) obj, cvlVar2)));
                }
            }
            if (i != 0) {
            }
            return new qj6(zdg.L(cutVar.n((PlaylistHeaderDto) obj, cvlVar2)));
        } catch (IllegalRequestOnNetworkModeException e) {
            return new oj6(e.a, e.b);
        } catch (MusicBackendHttpException e2) {
            MusicBackendInvocationError musicBackendInvocationError2 = e2.b;
            String name2 = musicBackendInvocationError2.getName();
            String str4 = name2 == null ? "" : name2;
            String message2 = musicBackendInvocationError2.getMessage();
            return new kj6(e2.a, musicBackendInvocationError2.getDetails(), str4, message2 == null ? "" : message2, e2.c);
        } catch (MusicCommonHttpException e3) {
            return new lj6(e3.a, e3.b, e3.c);
        } catch (IOException e4) {
            return new oj6(btf.b(new ur(14, e4)));
        }
        rttVar = new rtt(this, cg6Var);
        rtt rttVar22 = rttVar;
        Object obj2 = rttVar22.l;
        nm6 nm6Var2 = nm6.a;
        i = rttVar22.n;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, String str2, boolean z, boolean z2, boolean z3, cg6 cg6Var) {
        stt sttVar;
        int i;
        try {
            if (cg6Var instanceof stt) {
                sttVar = (stt) cg6Var;
                int i2 = sttVar.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    sttVar.l = i2 - Integer.MIN_VALUE;
                    stt sttVar2 = sttVar;
                    Object obj = sttVar2.j;
                    nm6 nm6Var = nm6.a;
                    i = sttVar2.l;
                    if (i != 0) {
                        qgg.h0(obj);
                        dut dutVar = (dut) this.d.getValue();
                        UsersPlaylistApi usersPlaylistApi = this.b;
                        sttVar2.l = 1;
                        obj = dutVar.o(str, str2, z2, z3, 0, 0, z, usersPlaylistApi, sttVar2);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj);
                            bii biiVar = (bii) obj;
                            if (biiVar instanceof aii) {
                                return new qj6(zdg.L((PlaylistHeaderDto) ((aii) biiVar).a));
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
                        qgg.h0(obj);
                    }
                    return new qj6(zdg.L((PlaylistHeaderDto) obj));
                }
            }
            if (i != 0) {
            }
            return new qj6(zdg.L((PlaylistHeaderDto) obj));
        } catch (IllegalRequestOnNetworkModeException e) {
            return new oj6(e.a, e.b);
        } catch (MusicBackendHttpException e2) {
            MusicBackendInvocationError musicBackendInvocationError2 = e2.b;
            String name2 = musicBackendInvocationError2.getName();
            String str4 = name2 == null ? "" : name2;
            String message2 = musicBackendInvocationError2.getMessage();
            return new kj6(e2.a, musicBackendInvocationError2.getDetails(), str4, message2 == null ? "" : message2, e2.c);
        } catch (MusicCommonHttpException e3) {
            return new lj6(e3.a, e3.b, e3.c);
        } catch (IOException e4) {
            return new oj6(btf.b(new ur(15, e4)));
        }
        sttVar = new stt(this, cg6Var);
        stt sttVar22 = sttVar;
        Object obj2 = sttVar22.j;
        nm6 nm6Var2 = nm6.a;
        i = sttVar22.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, boolean z, cg6 cg6Var) {
        ttt tttVar;
        int i;
        try {
            if (cg6Var instanceof ttt) {
                tttVar = (ttt) cg6Var;
                int i2 = tttVar.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    tttVar.l = i2 - Integer.MIN_VALUE;
                    Object obj = tttVar.j;
                    nm6 nm6Var = nm6.a;
                    i = tttVar.l;
                    if (i != 0) {
                        qgg.h0(obj);
                        eut eutVar = (eut) this.c.getValue();
                        UsersPlaylistApi usersPlaylistApi = this.b;
                        tttVar.l = 1;
                        obj = eutVar.e(str, z, usersPlaylistApi, tttVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj);
                            bii biiVar = (bii) obj;
                            if (biiVar instanceof aii) {
                                return new qj6(zdg.L((PlaylistHeaderDto) ((aii) biiVar).a));
                            }
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
                        qgg.h0(obj);
                    }
                    return new qj6(zdg.L((PlaylistHeaderDto) obj));
                }
            }
            if (i != 0) {
            }
            return new qj6(zdg.L((PlaylistHeaderDto) obj));
        } catch (IllegalRequestOnNetworkModeException e) {
            return new oj6(e.a, e.b);
        } catch (MusicBackendHttpException e2) {
            MusicBackendInvocationError musicBackendInvocationError2 = e2.b;
            String name2 = musicBackendInvocationError2.getName();
            String str3 = name2 == null ? "" : name2;
            String message2 = musicBackendInvocationError2.getMessage();
            return new kj6(e2.a, musicBackendInvocationError2.getDetails(), str3, message2 == null ? "" : message2, e2.c);
        } catch (MusicCommonHttpException e3) {
            return new lj6(e3.a, e3.b, e3.c);
        } catch (IOException e4) {
            return new oj6(btf.b(new ur(16, e4)));
        }
        tttVar = new ttt(this, cg6Var);
        Object obj2 = tttVar.j;
        nm6 nm6Var2 = nm6.a;
        i = tttVar.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, String str2, boolean z, cg6 cg6Var) {
        utt uttVar;
        int i;
        try {
            if (cg6Var instanceof utt) {
                uttVar = (utt) cg6Var;
                int i2 = uttVar.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    uttVar.l = i2 - Integer.MIN_VALUE;
                    utt uttVar2 = uttVar;
                    Object obj = uttVar2.j;
                    nm6 nm6Var = nm6.a;
                    i = uttVar2.l;
                    if (i != 0) {
                        qgg.h0(obj);
                        eut eutVar = (eut) this.c.getValue();
                        UsersPlaylistApi usersPlaylistApi = this.b;
                        uttVar2.l = 1;
                        obj = eutVar.n(str, str2, z, usersPlaylistApi, uttVar2);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj);
                            bii biiVar = (bii) obj;
                            if (biiVar instanceof aii) {
                                return new qj6(uwf.H((PlaylistHeaderDto) ((aii) biiVar).a));
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
                        qgg.h0(obj);
                    }
                    return new qj6(uwf.H((PlaylistHeaderDto) obj));
                }
            }
            if (i != 0) {
            }
            return new qj6(uwf.H((PlaylistHeaderDto) obj));
        } catch (IllegalRequestOnNetworkModeException e) {
            return new oj6(e.a, e.b);
        } catch (MusicBackendHttpException e2) {
            MusicBackendInvocationError musicBackendInvocationError2 = e2.b;
            String name2 = musicBackendInvocationError2.getName();
            String str4 = name2 == null ? "" : name2;
            String message2 = musicBackendInvocationError2.getMessage();
            return new kj6(e2.a, musicBackendInvocationError2.getDetails(), str4, message2 == null ? "" : message2, e2.c);
        } catch (MusicCommonHttpException e3) {
            return new lj6(e3.a, e3.b, e3.c);
        } catch (IOException e4) {
            return new oj6(btf.b(new ur(17, e4)));
        }
        uttVar = new utt(this, cg6Var);
        utt uttVar22 = uttVar;
        Object obj2 = uttVar22.j;
        nm6 nm6Var2 = nm6.a;
        i = uttVar22.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, boolean z, cg6 cg6Var) {
        vtt vttVar;
        int i;
        try {
            if (cg6Var instanceof vtt) {
                vttVar = (vtt) cg6Var;
                int i2 = vttVar.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    vttVar.l = i2 - Integer.MIN_VALUE;
                    vtt vttVar2 = vttVar;
                    Object obj = vttVar2.j;
                    nm6 nm6Var = nm6.a;
                    i = vttVar2.l;
                    if (i != 0) {
                        qgg.h0(obj);
                        dut dutVar = (dut) this.d.getValue();
                        UsersPlaylistApi usersPlaylistApi = this.b;
                        vttVar2.l = 1;
                        obj = dut.L(dutVar, str, true, 0, 0, z, usersPlaylistApi, vttVar2, 12, null);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj);
                            bii biiVar = (bii) obj;
                            if (biiVar instanceof aii) {
                                return new qj6(uwf.H((PlaylistHeaderDto) ((aii) biiVar).a));
                            }
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
                        qgg.h0(obj);
                    }
                    return new qj6(uwf.H((PlaylistHeaderDto) obj));
                }
            }
            if (i != 0) {
            }
            return new qj6(uwf.H((PlaylistHeaderDto) obj));
        } catch (IllegalRequestOnNetworkModeException e) {
            return new oj6(e.a, e.b);
        } catch (MusicBackendHttpException e2) {
            MusicBackendInvocationError musicBackendInvocationError2 = e2.b;
            String name2 = musicBackendInvocationError2.getName();
            String str3 = name2 == null ? "" : name2;
            String message2 = musicBackendInvocationError2.getMessage();
            return new kj6(e2.a, musicBackendInvocationError2.getDetails(), str3, message2 == null ? "" : message2, e2.c);
        } catch (MusicCommonHttpException e3) {
            return new lj6(e3.a, e3.b, e3.c);
        } catch (IOException e4) {
            return new oj6(btf.b(new ur(18, e4)));
        }
        vttVar = new vtt(this, cg6Var);
        vtt vttVar22 = vttVar;
        Object obj2 = vttVar22.j;
        nm6 nm6Var2 = nm6.a;
        i = vttVar22.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(cg6 cg6Var, String str, List list) {
        wtt wttVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof wtt) {
            wttVar = (wtt) cg6Var;
            int i2 = wttVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wttVar.l = i2 - Integer.MIN_VALUE;
                Object obj = wttVar.j;
                nm6 nm6Var = nm6.a;
                i = wttVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<List<PlaylistHeaderDto>>> f = this.b.f(str, new o3f(list));
                    wttVar.l = 1;
                    obj = swf.N(f, wttVar);
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
                    List<PlaylistHeaderDto> list2 = (List) ((aii) biiVar).a;
                    ArrayList arrayList = new ArrayList();
                    for (PlaylistHeaderDto playlistHeaderDto : list2) {
                        rrl L = playlistHeaderDto != null ? zdg.L(playlistHeaderDto) : null;
                        if (L != null) {
                            arrayList.add(L);
                        }
                    }
                    return new qj6(arrayList);
                }
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
        }
        wttVar = new wtt(this, cg6Var);
        Object obj2 = wttVar.j;
        nm6 nm6Var2 = nm6.a;
        i = wttVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(String str, String str2, cg6 cg6Var) {
        xtt xttVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof xtt) {
            xttVar = (xtt) cg6Var;
            int i2 = xttVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xttVar.l = i2 - Integer.MIN_VALUE;
                Object obj = xttVar.j;
                nm6 nm6Var = nm6.a;
                i = xttVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<PlaylistHeaderDto>> i3 = this.b.i(str, str2, true);
                    xttVar.l = 1;
                    obj = swf.N(i3, xttVar);
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
                    return new qj6(uwf.H((PlaylistHeaderDto) ((aii) biiVar).a));
                }
                if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i4 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    String str3 = name == null ? "" : name;
                    String message = musicBackendInvocationError.getMessage();
                    return new kj6(i4, musicBackendInvocationError.getDetails(), str3, message == null ? "" : message, xhiVar.a);
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
        xttVar = new xtt(this, cg6Var);
        Object obj2 = xttVar.j;
        nm6 nm6Var2 = nm6.a;
        i = xttVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(String str, String str2, String str3, cg6 cg6Var) {
        ytt yttVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof ytt) {
            yttVar = (ytt) cg6Var;
            int i2 = yttVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yttVar.l = i2 - Integer.MIN_VALUE;
                Object obj = yttVar.j;
                nm6 nm6Var = nm6.a;
                i = yttVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<PlaylistHeaderDto>> n = this.b.n(str, str2, str3);
                    yttVar.l = 1;
                    obj = swf.N(n, yttVar);
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
                    return new qj6(uwf.I((PlaylistHeaderDto) ((aii) biiVar).a));
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
        yttVar = new ytt(this, cg6Var);
        Object obj2 = yttVar.j;
        nm6 nm6Var2 = nm6.a;
        i = yttVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    public final PlaylistHeaderDto n(PlaylistHeaderDto playlistHeaderDto, cvl cvlVar) {
        String title = playlistHeaderDto.getTitle();
        if (title == null || !StringsKt.U(title) || !cvlVar.d()) {
            return playlistHeaderDto;
        }
        if (StringsKt.U(title)) {
            title = null;
        }
        if (title == null) {
            title = this.a;
        }
        return PlaylistHeaderDto.b(title, playlistHeaderDto);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(String str, String str2, String str3, cg6 cg6Var) {
        ztt zttVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof ztt) {
            zttVar = (ztt) cg6Var;
            int i2 = zttVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zttVar.l = i2 - Integer.MIN_VALUE;
                Object obj = zttVar.j;
                nm6 nm6Var = nm6.a;
                i = zttVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<Unit> h = this.b.h(str, str2, str3);
                    zttVar.l = 1;
                    obj = swf.O(h, Unit.class, zttVar);
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
        zttVar = new ztt(this, cg6Var);
        Object obj2 = zttVar.j;
        nm6 nm6Var2 = nm6.a;
        i = zttVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(String str, String str2, String str3, cg6 cg6Var) {
        aut autVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof aut) {
            autVar = (aut) cg6Var;
            int i2 = autVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autVar.l = i2 - Integer.MIN_VALUE;
                Object obj = autVar.j;
                nm6 nm6Var = nm6.a;
                i = autVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<PlaylistHeaderDto>> m = this.b.m(str, str2, str3);
                    autVar.l = 1;
                    obj = swf.N(m, autVar);
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
                    return new qj6(uwf.I((PlaylistHeaderDto) ((aii) biiVar).a));
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
        autVar = new aut(this, cg6Var);
        Object obj2 = autVar.j;
        nm6 nm6Var2 = nm6.a;
        i = autVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(String str, String str2, File file, cg6 cg6Var) {
        but butVar;
        int i;
        twh twhVar;
        bii biiVar;
        if (cg6Var instanceof but) {
            butVar = (but) cg6Var;
            int i2 = butVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                butVar.l = i2 - Integer.MIN_VALUE;
                Object obj = butVar.j;
                nm6 nm6Var = nm6.a;
                i = butVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    String name = file.getName();
                    Pattern pattern = twh.e;
                    try {
                        twhVar = q5g.C("image/jpg");
                    } catch (IllegalArgumentException unused) {
                        twhVar = null;
                    }
                    Call<MusicBackendResponse<PlaylistHeaderDto>> j = this.b.j(str, str2, w1g.u("image", name, new f0o(twhVar, file, 0)));
                    butVar.l = 1;
                    obj = swf.N(j, butVar);
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
                    return new qj6(uwf.I((PlaylistHeaderDto) ((aii) biiVar).a));
                }
                if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i3 = xhiVar.b;
                    String name2 = musicBackendInvocationError.getName();
                    String str3 = name2 == null ? "" : name2;
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
        butVar = new but(this, cg6Var);
        Object obj2 = butVar.j;
        nm6 nm6Var2 = nm6.a;
        i = butVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }
}
