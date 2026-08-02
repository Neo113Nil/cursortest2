package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.skeleton.blocks.non_music_banner.data.NonMusicBannerBlockApi;
import com.yandex.music.skeleton.blocks.non_music_banner.data.NonMusicBannerEntityDto;
import kotlin.Unit;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class caj extends xmm implements ayd {
    public final z9j d;
    public final q43 e;
    public final jyr f;
    public final jyr g;
    public final xdr h;
    public final xdr i;
    public final jyr j;

    public caj(z9j z9jVar, q43 q43Var) {
        z9jVar.getClass();
        this.d = z9jVar;
        this.e = q43Var;
        this.f = btf.b(new s9j(1));
        this.g = l18.b.b(hag.I(k8w.class), true);
        this.h = ydr.a(new agt(true));
        this.i = ydr.a(Boolean.FALSE);
        this.j = btf.b(new s9j(2));
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.d;
    }

    @Override // defpackage.ayd
    public final void b(boolean z) {
        v3w.n(z, this.i, null);
    }

    @Override // defpackage.xmm
    public final boolean n() {
        return this.h.getValue() instanceof mgt;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0180, code lost:
    
        if (r1 == r3) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01b3, code lost:
    
        if (r1 == r3) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x006c, code lost:
    
        if (r1 == r3) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0057  */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    @Override // defpackage.xmm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(boolean z, cg6 cg6Var) {
        baj bajVar;
        int i;
        boolean z2;
        ?? booleanValue;
        boolean z3;
        int i2;
        bii biiVar;
        Object J;
        Object lj6Var;
        if (cg6Var instanceof baj) {
            bajVar = (baj) cg6Var;
            int i3 = bajVar.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bajVar.n = i3 - Integer.MIN_VALUE;
                Object obj = bajVar.l;
                nm6 nm6Var = nm6.a;
                i = bajVar.n;
                jyr jyrVar = this.j;
                xdr xdrVar = this.h;
                z9j z9jVar = this.d;
                if (i != 0) {
                    qgg.h0(obj);
                    lnq lnqVar = (lnq) jyrVar.getValue();
                    z2 = z;
                    bajVar.j = z2;
                    bajVar.n = 1;
                    obj = lnqVar.a.c(z9jVar, bajVar);
                } else if (i == 1) {
                    z2 = bajVar.j;
                    qgg.h0(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            qgg.h0(obj);
                            return new b73(z9jVar);
                        }
                        if (i != 4) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        q43 q43Var = this.e;
                        q43Var.b(q43Var.a, 1, null, null);
                        return new d73(z9jVar);
                    }
                    i2 = bajVar.k;
                    z3 = bajVar.j;
                    qgg.h0(obj);
                    biiVar = (bii) obj;
                    if (biiVar instanceof aii) {
                        if (biiVar instanceof xhi) {
                            xhi xhiVar = (xhi) biiVar;
                            MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                            int i4 = xhiVar.b;
                            String name = musicBackendInvocationError.getName();
                            String str = name == null ? "" : name;
                            String message = musicBackendInvocationError.getMessage();
                            J = new kj6(i4, musicBackendInvocationError.getDetails(), str, message == null ? "" : message, xhiVar.a);
                        } else if (biiVar instanceof yhi) {
                            yhi yhiVar = (yhi) biiVar;
                            lj6Var = new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                            J = lj6Var;
                        } else {
                            if (!(biiVar instanceof zhi)) {
                                b6e.s();
                                return null;
                            }
                            J = uwf.J((zhi) biiVar);
                        }
                        if (!(J instanceof qj6)) {
                        }
                    } else {
                        daj a = ((NonMusicBannerEntityDto) ((aii) biiVar).a).a();
                        if (a == null) {
                            J = new nj6(null);
                            if (!(J instanceof qj6)) {
                                if (!(J instanceof pj6)) {
                                    b6e.s();
                                    return null;
                                }
                                if (!n()) {
                                    agt agtVar = new agt(false);
                                    xdrVar.getClass();
                                    xdrVar.m(null, agtVar);
                                }
                                ((pj6) J).a();
                                return new c73(z9jVar);
                            }
                            daj dajVar = (daj) ((qj6) J).a;
                            jyr jyrVar2 = this.g;
                            boolean contains = v3g.E(((m8w) ((k8w) jyrVar2.getValue())).a).i.contains("bookmate");
                            boolean d = ((m8w) ((k8w) jyrVar2.getValue())).d();
                            boolean z4 = !contains;
                            if (contains && d && dajVar.c != null) {
                                bajVar.j = z3;
                                bajVar.k = i2;
                                bajVar.n = 3;
                                Object a2 = ((lnq) jyrVar.getValue()).a.a(z9jVar, true, bajVar);
                                if (a2 != nm6Var) {
                                    a2 = Unit.a;
                                }
                            } else {
                                mgt mgtVar = new mgt(dajVar.b, dajVar.c, dajVar.d, z4);
                                xdrVar.getClass();
                                xdrVar.m(null, mgtVar);
                                bajVar.j = z3;
                                bajVar.k = i2;
                                bajVar.n = 4;
                                Object a3 = ((lnq) jyrVar.getValue()).a.a(z9jVar, false, bajVar);
                                if (a3 != nm6Var) {
                                    a3 = Unit.a;
                                }
                            }
                            return nm6Var;
                        }
                        lj6Var = new qj6(a);
                        J = lj6Var;
                        if (!(J instanceof qj6)) {
                        }
                    }
                }
                Boolean bool = (Boolean) obj;
                booleanValue = bool == null ? bool.booleanValue() : 0;
                if (booleanValue == 0) {
                    return new b73(z9jVar);
                }
                if (!n()) {
                    agt agtVar2 = new agt(true);
                    xdrVar.getClass();
                    xdrVar.m(null, agtVar2);
                }
                Call<MusicBackendResponse<NonMusicBannerEntityDto>> a4 = ((NonMusicBannerBlockApi) this.f.getValue()).a(z9jVar.b.a, men.G(z9jVar.a), z2 ? "no-cache" : null);
                bajVar.j = z2;
                bajVar.k = booleanValue;
                bajVar.n = 2;
                Object N = swf.N(a4, bajVar);
                if (N != nm6Var) {
                    z3 = z2;
                    i2 = booleanValue;
                    obj = N;
                    biiVar = (bii) obj;
                    if (biiVar instanceof aii) {
                    }
                }
                return nm6Var;
            }
        }
        bajVar = new baj(this, cg6Var);
        Object obj2 = bajVar.l;
        nm6 nm6Var2 = nm6.a;
        i = bajVar.n;
        jyr jyrVar3 = this.j;
        xdr xdrVar2 = this.h;
        z9j z9jVar2 = this.d;
        if (i != 0) {
        }
        Boolean bool2 = (Boolean) obj2;
        if (bool2 == null) {
        }
        if (booleanValue == 0) {
        }
    }
}
