package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.yandex.music.playlist_filters.data.local.FilterLocalDto;
import com.yandex.music.playlist_filters.data.local.FiltersLocalInfoDto;
import com.yandex.music.playlist_filters.data.remote.FiltersApi;
import com.yandex.music.playlist_filters.data.remote.list.FilterDto;
import com.yandex.music.playlist_filters.data.remote.list.FiltersBodyDto;
import com.yandex.music.playlist_filters.data.remote.list.FiltersResponseDto;
import com.yandex.music.playlist_filters.data.remote.name.FilterNameResponseDto;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import retrofit2.Call;
import ru.yandex.music.glagol.data.b;
import ru.yandex.quasar.glagol.State;

/* loaded from: classes6.dex */
public final class fzb extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public fzb(Function2 function2, odd oddVar, Continuation continuation) {
        super(2, continuation);
        this.j = 17;
        this.l = (aur) function2;
        this.m = oddVar;
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new fzb((gzb) this.m, continuation, 0);
            case 1:
                return new fzb((jm1) this.l, (String) this.m, continuation, 1);
            case 2:
                return new fzb((dib) this.l, (aqi) this.m, continuation, 2);
            case 3:
                fzb fzbVar = new fzb((g8c) this.m, continuation, 3);
                fzbVar.l = obj;
                return fzbVar;
            case 4:
                return new fzb((rn5) this.l, (q27) this.m, continuation, 4);
            case 5:
                return new fzb((ddc) this.l, (String) this.m, continuation, 5);
            case 6:
                return new fzb((ddc) this.l, (Set) this.m, continuation, 6);
            case 7:
                return new fzb((ddc) this.l, (ucc) this.m, continuation, 7);
            case 8:
                return new fzb((fvf) this.l, (jic) this.m, continuation, 8);
            case 9:
                return new fzb((pjc) this.l, (ltm) this.m, continuation, 9);
            case 10:
                return new fzb((pjc) this.l, (rjc) this.m, continuation, 10);
            case 11:
                return new fzb((xqn) this.l, (rjc) this.m, continuation, 11);
            case 12:
                fzb fzbVar2 = new fzb((bnc) this.m, continuation, 12);
                fzbVar2.l = obj;
                return fzbVar2;
            case 13:
                return new fzb((String) this.l, (iz7) this.m, continuation, 13);
            case 14:
                return new fzb((q0d) this.l, (hs1) this.m, continuation, 14);
            case 15:
                return new fzb((o3k) this.l, (z0d) this.m, continuation, 15);
            case 16:
                return new fzb((fp7) this.l, (q0d) this.m, continuation, 16);
            case 17:
                return new fzb((Function2) this.l, (odd) this.m, continuation);
            case 18:
                fzb fzbVar3 = new fzb((tqn) this.m, continuation, 18);
                fzbVar3.l = obj;
                return fzbVar3;
            case 19:
                return new fzb((State) this.l, (ced) this.m, continuation, 19);
            case 20:
                fzb fzbVar4 = new fzb((ced) this.m, continuation, 20);
                fzbVar4.l = obj;
                return fzbVar4;
            case 21:
                return new fzb((iz7) this.l, (med[]) this.m, continuation, 21);
            case 22:
                return new fzb((fs) this.l, continuation, (chd) this.m, 22);
            case 23:
                return new fzb((tc4) this.l, continuation, (chd) this.m, 23);
            case 24:
                return new fzb((b) this.l, (Iterable) this.m, continuation, 24);
            case 25:
                return new fzb((b) this.l, (qhd) this.m, continuation, 25);
            case 26:
                return new fzb((b) this.l, (List) this.m, continuation, 26);
            case 27:
                fzb fzbVar5 = new fzb((rv0) this.m, continuation, 27);
                fzbVar5.l = obj;
                return fzbVar5;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new fzb((Context) this.l, (pkd) this.m, continuation, 28);
            default:
                return new fzb((Function0) this.m, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 2:
                ((fzb) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                break;
            case 14:
                ((fzb) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((fzb) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:207:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0395  */
    /* JADX WARN: Type inference failed for: r3v47, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object g0;
        gzb gzbVar;
        Object x;
        Object l;
        Object N;
        Object N2;
        ArrayList arrayList;
        ecc eccVar;
        String id;
        String name;
        HashSet hashSet;
        Object invoke;
        tnl tnlVar;
        Double progress;
        unl unlVar;
        long j;
        vhd vhdVar;
        unl playerState;
        Map extra;
        sqd sqdVar;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    gzb gzbVar2 = (gzb) this.m;
                    pjc g = ((frt) gzbVar2.b.getValue()).g();
                    this.l = gzbVar2;
                    this.k = 1;
                    g0 = zsd.g0(g, this);
                    if (g0 == nm6Var) {
                        return nm6Var;
                    }
                    gzbVar = gzbVar2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gzbVar = (gzb) this.l;
                    qgg.h0(obj);
                    g0 = obj;
                }
                xxq xxqVar = (xxq) g0;
                Context context = gzbVar.a;
                xxqVar.getClass();
                SharedPreferences sharedPreferences = context.getSharedPreferences("EXPLICIT_PREFERENCES" + xxqVar.a, 0);
                sharedPreferences.getClass();
                String string = sharedPreferences.getString("KEY_EXPLICIT_CONTENT_TYPE", gzb.c.a);
                Object obj2 = null;
                if (string == null) {
                    return null;
                }
                yyb.b.getClass();
                Iterator it = yyb.f.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((yyb) next).a.equals(string)) {
                            obj2 = next;
                        }
                    }
                }
                return (yyb) obj2;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 != 0) {
                    if (i2 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                c9k c9kVar = (c9k) ((jm1) this.l).g.getValue();
                String str = (String) this.m;
                this.k = 1;
                Object g2 = c9kVar.g(str, this);
                return g2 == nm6Var2 ? nm6Var2 : g2;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    dib dibVar = (dib) this.l;
                    oc ocVar = new oc((aqi) this.m, 3);
                    this.k = 1;
                    if (dibVar.collect(ocVar, this) == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj7.f();
                return null;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    ltm ltmVar = (ltm) this.l;
                    kpm kpmVar = (kpm) ((g8c) this.m).a;
                    pv9 pv9Var = new pv9(6, ltmVar);
                    jek a = ((sbp) kpmVar.b).c.a();
                    ((tdk) a.c).g(a.a, a.b, new aqd(13, a, pv9Var));
                    grb grbVar = grb.u;
                    this.k = 1;
                    if (y7g.q(ltmVar, grbVar, this) == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i4 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 4:
                q27 q27Var = (q27) this.m;
                rn5 rn5Var = (rn5) this.l;
                nm6 nm6Var5 = nm6.a;
                int i5 = this.k;
                try {
                } catch (Throwable th) {
                    qne.m(gut.V0(dq8.SELECT), th.getMessage(), 2).y();
                    this.k = 2;
                    x = rn5Var.x(q27Var);
                    if (x == nm6Var5) {
                        return nm6Var5;
                    }
                }
                if (i5 == 0) {
                    qgg.h0(obj);
                    xiu xiuVar = (xiu) rn5Var.b;
                    JSONObject C = irf.C(q27Var);
                    this.k = 1;
                    l = xiuVar.l(C, this);
                    if (l == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        x = obj;
                        return (JSONObject) x;
                    }
                    qgg.h0(obj);
                    l = obj;
                }
                return (JSONObject) l;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<FilterNameResponseDto>> b = ((FiltersApi) ((ddc) this.l).a.getValue()).b((String) this.m);
                    this.k = 1;
                    N = swf.N(b, this);
                    if (N == nm6Var6) {
                        return nm6Var6;
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    N = obj;
                }
                bii biiVar = (bii) N;
                if (biiVar instanceof aii) {
                    FilterNameResponseDto filterNameResponseDto = (FilterNameResponseDto) ((aii) biiVar).a;
                    filterNameResponseDto.getClass();
                    String name2 = filterNameResponseDto.getName();
                    if (name2 == null || StringsKt.U(name2)) {
                        name2 = null;
                    }
                    return name2 == null ? new nj6(null) : new qj6(name2);
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
                int i7 = xhiVar.b;
                String name3 = musicBackendInvocationError.getName();
                if (name3 == null) {
                    name3 = "";
                }
                String message = musicBackendInvocationError.getMessage();
                if (message == null) {
                    message = "";
                }
                return new kj6(i7, musicBackendInvocationError.getDetails(), name3, message, xhiVar.a);
            case 6:
                nm6 nm6Var7 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<FiltersResponseDto>> a2 = ((FiltersApi) ((ddc) this.l).a.getValue()).a(new FiltersBodyDto((Set) this.m));
                    this.k = 1;
                    N2 = swf.N(a2, this);
                    if (N2 == nm6Var7) {
                        return nm6Var7;
                    }
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    N2 = obj;
                }
                bii biiVar2 = (bii) N2;
                if (!(biiVar2 instanceof aii)) {
                    if (!(biiVar2 instanceof xhi)) {
                        if (biiVar2 instanceof yhi) {
                            yhi yhiVar2 = (yhi) biiVar2;
                            return new lj6(yhiVar2.b, yhiVar2.c, yhiVar2.a);
                        }
                        if (biiVar2 instanceof zhi) {
                            return uwf.J((zhi) biiVar2);
                        }
                        b6e.s();
                        return null;
                    }
                    xhi xhiVar2 = (xhi) biiVar2;
                    MusicBackendInvocationError musicBackendInvocationError2 = xhiVar2.c;
                    int i9 = xhiVar2.b;
                    String name4 = musicBackendInvocationError2.getName();
                    if (name4 == null) {
                        name4 = "";
                    }
                    String message2 = musicBackendInvocationError2.getMessage();
                    if (message2 == null) {
                        message2 = "";
                    }
                    return new kj6(i9, musicBackendInvocationError2.getDetails(), name4, message2, xhiVar2.a);
                }
                FiltersResponseDto filtersResponseDto = (FiltersResponseDto) ((aii) biiVar2).a;
                filtersResponseDto.getClass();
                List<FilterDto> filters = filtersResponseDto.getFilters();
                if (filters != null) {
                    arrayList = new ArrayList();
                    for (FilterDto filterDto : filters) {
                        if (filterDto == null || (id = filterDto.getId()) == null || (name = filterDto.getName()) == null) {
                            eccVar = null;
                        } else {
                            List<String> tracks = filterDto.getTracks();
                            if (tracks != null) {
                                hashSet = new HashSet();
                                for (String str2 : tracks) {
                                    if (str2 != null) {
                                        hashSet.add(str2);
                                    }
                                }
                            } else {
                                hashSet = null;
                            }
                            eccVar = new ecc(id, name, hashSet);
                        }
                        if (eccVar != null) {
                            arrayList.add(eccVar);
                        }
                    }
                } else {
                    arrayList = null;
                }
                return arrayList == null ? new nj6(null) : new qj6(arrayList);
            case 7:
                nm6 nm6Var8 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    zcc zccVar = (zcc) ((ddc) this.l).b.getValue();
                    ucc uccVar = (ucc) this.m;
                    Long valueOf = Long.valueOf(uccVar.a);
                    List w0 = CollectionsKt.w0(uccVar.b);
                    List<ecc> list = uccVar.c;
                    ArrayList arrayList2 = new ArrayList(v75.o(list, 10));
                    for (ecc eccVar2 : list) {
                        eccVar2.getClass();
                        String str3 = eccVar2.a;
                        String str4 = eccVar2.b;
                        Set set = eccVar2.c;
                        arrayList2.add(new FilterLocalDto(str3, str4, set != null ? CollectionsKt.w0(set) : null));
                    }
                    FiltersLocalInfoDto filtersLocalInfoDto = new FiltersLocalInfoDto(valueOf, w0, arrayList2);
                    this.k = 1;
                    if (zccVar.c(filtersLocalInfoDto, this) == nm6Var8) {
                        return nm6Var8;
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 8:
                nm6 nm6Var9 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    fvf fvfVar = (fvf) this.l;
                    da3 da3Var = new da3((jic) this.m, null, 1);
                    this.k = 1;
                    if (fvfVar.a(hqi.a, da3Var, this) == nm6Var9) {
                        return nm6Var9;
                    }
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 9:
                nm6 nm6Var10 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar = (pjc) this.l;
                    wjc wjcVar = new wjc((ltm) this.m, 0);
                    this.k = 1;
                    if (pjcVar.collect(wjcVar, this) == nm6Var10) {
                        return nm6Var10;
                    }
                } else {
                    if (i12 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 10:
                nm6 nm6Var11 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar2 = (pjc) this.l;
                    rjc rjcVar = (rjc) this.m;
                    this.k = 1;
                    if (pjcVar2.collect(rjcVar, this) == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i13 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 11:
                nm6 nm6Var12 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    xqn xqnVar = (xqn) this.l;
                    Object obj3 = xqnVar.a;
                    if (obj3 == null) {
                        return Unit.a;
                    }
                    xqnVar.a = null;
                    rjc rjcVar2 = (rjc) this.m;
                    if (obj3 == ugj.a) {
                        obj3 = null;
                    }
                    this.k = 1;
                    if (rjcVar2.emit(obj3, this) == nm6Var12) {
                        return nm6Var12;
                    }
                } else {
                    if (i14 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 12:
                mm6 mm6Var = (mm6) this.l;
                nm6 nm6Var13 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    bnc bncVar = (bnc) this.m;
                    pjc f = bncVar.f(mm6Var, bncVar.a);
                    u58 u58Var = new u58(23, (bnc) this.m);
                    this.l = null;
                    this.k = 1;
                    if (f.collect(u58Var, this) == nm6Var13) {
                        return nm6Var13;
                    }
                } else {
                    if (i15 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 13:
                iz7 iz7Var = (iz7) this.m;
                nm6 nm6Var14 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    String str5 = (String) this.l;
                    ixc ixcVar = (ixc) iz7Var.d;
                    Continuation continuation = null;
                    if (ixcVar == null) {
                        Intrinsics.j("data");
                        throw null;
                    }
                    String str6 = ixcVar.b;
                    str5.getClass();
                    str6.getClass();
                    l18 l18Var = l18.b;
                    bdt I = hag.I(i5h.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    i5h i5hVar = (i5h) qdcVar.C(I);
                    bdt I2 = hag.I(frt.class);
                    qdc qdcVar2 = l18Var.a;
                    qdcVar2.getClass();
                    String str7 = ((frt) qdcVar2.C(I2)).c().a;
                    str7.getClass();
                    pjc k0 = zsd.k0(i5hVar.f(str7, new String[]{"playlist"}, new ck0(str5, str6, continuation, 1)), dm6.b);
                    mxc mxcVar = new mxc(iz7Var, 1);
                    this.k = 1;
                    Object collect = k0.collect(new orc(mxcVar, 3), this);
                    if (collect != nm6Var14) {
                        collect = Unit.a;
                    }
                    if (collect == nm6Var14) {
                        return nm6Var14;
                    }
                } else {
                    if (i16 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 14:
                nm6 nm6Var15 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    dib h = ((q0d) this.l).h();
                    dv5 dv5Var = new dv5((hs1) this.m, 1);
                    this.k = 1;
                    if (h.collect(dv5Var, this) == nm6Var15) {
                        return nm6Var15;
                    }
                } else {
                    if (i17 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj7.f();
                return null;
            case 15:
                nm6 nm6Var16 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    o3k o3kVar = (o3k) this.l;
                    int i19 = ((z0d) this.m).b;
                    this.k = 1;
                    if (o3k.g(o3kVar, i19, null, this, 6) == nm6Var16) {
                        return nm6Var16;
                    }
                } else {
                    if (i18 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 16:
                nm6 nm6Var17 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    h7a H0 = zsd.H0(((fp7) this.l).r.a, 1);
                    u58 u58Var2 = new u58(25, (q0d) this.m);
                    this.k = 1;
                    if (H0.collect(u58Var2, this) == nm6Var17) {
                        return nm6Var17;
                    }
                } else {
                    if (i20 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 17:
                xdr xdrVar = ((odd) this.m).o;
                nm6 nm6Var18 = nm6.a;
                int i21 = this.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    ?? r3 = (aur) this.l;
                    Object value = xdrVar.getValue();
                    this.k = 1;
                    invoke = r3.invoke(value, this);
                    if (invoke == nm6Var18) {
                        return nm6Var18;
                    }
                } else {
                    if (i21 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    invoke = obj;
                }
                if (((Boolean) invoke).booleanValue()) {
                    xdrVar.l(null);
                }
                return Unit.a;
            case 18:
                tqn tqnVar = (tqn) this.m;
                Object obj4 = this.l;
                nm6 nm6Var19 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    if (tqnVar.a && !((Boolean) ((Pair) obj4).b).booleanValue()) {
                        this.l = obj4;
                        this.k = 1;
                        if (y2x.o(10000L, this) == nm6Var19) {
                            return nm6Var19;
                        }
                    }
                } else {
                    if (i22 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                tqnVar.a = false;
                return obj4;
            case 19:
                nm6 nm6Var20 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    boolean z = ((ced) this.m).n;
                    ced cedVar = (ced) this.m;
                    if (z) {
                        cedVar.o = (State) this.l;
                        return Unit.a;
                    }
                    String str8 = cedVar.p;
                    State state = (State) this.l;
                    if (!Intrinsics.d(str8, (state == null || (playerState = state.getPlayerState()) == null || (extra = playerState.getExtra()) == null) ? null : (String) extra.get("requestID")) && ((ced) this.m).l.b()) {
                        return Unit.a;
                    }
                    if (((ced) this.m).p != null) {
                        ((ced) this.m).l.g(null);
                        ((ced) this.m).p = null;
                    }
                    ced cedVar2 = (ced) this.m;
                    State state2 = (State) this.l;
                    xdr xdrVar2 = cedVar2.v;
                    Double volume = state2 != null ? state2.getVolume() : null;
                    zgd zgdVar = volume == null ? zgd.b : new zgd(yhn.d((int) (volume.doubleValue() * 10), 0, 10));
                    xdrVar2.getClass();
                    xdrVar2.m(null, zgdVar);
                    xdr xdrVar3 = ((ced) this.m).u;
                    State state3 = (State) this.l;
                    unl playerState2 = state3 != null ? state3.getPlayerState() : null;
                    zzp zzpVar = (zzp) ((ced) this.m).k.getValue();
                    zzpVar.getClass();
                    if (playerState2 == null) {
                        vhdVar = vhd.h;
                    } else {
                        String id2 = playerState2.getId();
                        if (id2 == null) {
                            id2 = vhd.h.a;
                        }
                        boolean o0 = lg3.o0(playerState2);
                        String str9 = id2;
                        boolean hasPause = playerState2.hasPause();
                        if (!xp3.S(playerState2) && !playerState2.isHasNext()) {
                            Double duration = playerState2.getDuration();
                            Integer valueOf2 = duration != null ? Integer.valueOf((int) duration.doubleValue()) : null;
                            Double progress2 = playerState2.getProgress();
                            if (Intrinsics.d(valueOf2, progress2 != null ? Integer.valueOf((int) progress2.doubleValue()) : null)) {
                                tnlVar = tnl.e;
                                progress = playerState2.getProgress();
                                if (progress == null) {
                                    unlVar = playerState2;
                                    j = (long) (1000 * progress.doubleValue());
                                } else {
                                    unlVar = playerState2;
                                    j = 0;
                                }
                                Double duration2 = unlVar.getDuration();
                                vhdVar = new vhd(str9, o0, hasPause, tnlVar, j, duration2 == null ? (long) (1000 * duration2.doubleValue()) : 0L, zzpVar.b());
                            }
                        }
                        tnlVar = tnl.d;
                        progress = playerState2.getProgress();
                        if (progress == null) {
                        }
                        Double duration22 = unlVar.getDuration();
                        vhdVar = new vhd(str9, o0, hasPause, tnlVar, j, duration22 == null ? (long) (1000 * duration22.doubleValue()) : 0L, zzpVar.b());
                    }
                    xdrVar3.l(vhdVar);
                    ((ced) this.m).t.l((State) this.l);
                    b bVar = ((ced) this.m).r;
                    State state4 = (State) this.l;
                    unl playerState3 = state4 != null ? state4.getPlayerState() : null;
                    this.k = 1;
                    if (bVar.c(playerState3, this) == nm6Var20) {
                        return nm6Var20;
                    }
                } else {
                    if (i23 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                ((ced) this.m).o = null;
                return Unit.a;
            case 20:
                zgd zgdVar2 = (zgd) this.l;
                nm6 nm6Var21 = nm6.a;
                int i24 = this.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    ced cedVar3 = (ced) this.m;
                    this.l = null;
                    this.k = 1;
                    mdg mdgVar = cedVar3.a;
                    double d = 10;
                    String str10 = "volume " + (zgdVar2.a / d);
                    mdk setVolumePayload = cedVar3.b().getPayloadFactory().getSetVolumePayload(new Double(zgdVar2.a / d));
                    setVolumePayload.getClass();
                    if (cedVar3.H(mdgVar, str10, setVolumePayload, this) == nm6Var21) {
                        return nm6Var21;
                    }
                } else {
                    if (i24 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 21:
                nm6 nm6Var22 = nm6.a;
                int i25 = this.k;
                if (i25 != 0) {
                    if (i25 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                iz7 iz7Var2 = (iz7) this.l;
                u21 u21Var = new u21(11, new bca(((odd) iz7Var2.a).n, 29), iz7Var2, (med[]) this.m);
                this.k = 1;
                Object g02 = zsd.g0(u21Var, this);
                return g02 == nm6Var22 ? nm6Var22 : g02;
            case 22:
                nm6 nm6Var23 = nm6.a;
                int i26 = this.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    fs fsVar = (fs) this.l;
                    d57 d57Var = new d57(null, (chd) this.m);
                    this.k = 1;
                    if (zsd.O(fsVar, d57Var, this) == nm6Var23) {
                        return nm6Var23;
                    }
                } else {
                    if (i26 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 23:
                nm6 nm6Var24 = nm6.a;
                int i27 = this.k;
                if (i27 == 0) {
                    qgg.h0(obj);
                    tc4 tc4Var = (tc4) this.l;
                    fr4 fr4Var = new fr4((Continuation) null, (chd) this.m, 2);
                    this.k = 1;
                    if (zsd.O(tc4Var, fr4Var, this) == nm6Var24) {
                        return nm6Var24;
                    }
                } else {
                    if (i27 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 24:
                nm6 nm6Var25 = nm6.a;
                int i28 = this.k;
                if (i28 != 0) {
                    if (i28 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                b bVar2 = (b) this.l;
                Iterable iterable = (Iterable) this.m;
                this.k = 1;
                Object a3 = b.a(bVar2, iterable, this);
                return a3 == nm6Var25 ? nm6Var25 : a3;
            case 25:
                nm6 nm6Var26 = nm6.a;
                int i29 = this.k;
                if (i29 != 0) {
                    if (i29 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                b bVar3 = (b) this.l;
                qhd qhdVar = (qhd) this.m;
                this.k = 1;
                Object Q = gld.Q(new akc(bVar3, qhdVar, (Continuation) null, 14), this);
                return Q == nm6Var26 ? nm6Var26 : Q;
            case 26:
                nm6 nm6Var27 = nm6.a;
                int i30 = this.k;
                if (i30 != 0) {
                    if (i30 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                b bVar4 = (b) this.l;
                List list2 = (List) this.m;
                this.k = 1;
                Object Q2 = gld.Q(new ov(bVar4, list2, (Continuation) null, 24), this);
                return Q2 == nm6Var27 ? nm6Var27 : Q2;
            case 27:
                nm6 nm6Var28 = nm6.a;
                int i31 = this.k;
                if (i31 == 0) {
                    qgg.h0(obj);
                    omp ompVar = (omp) this.l;
                    String x2 = ot0.x(((rv0) this.m).a);
                    this.k = 1;
                    aw0 aw0Var = (aw0) ompVar.a.remove(x2);
                    if (aw0Var != null) {
                        aw0Var.c.n(null);
                        aw0Var.b.set(false);
                        aw0Var.l.g(null);
                    }
                    if (Unit.a == nm6Var28) {
                        return nm6Var28;
                    }
                } else {
                    if (i31 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                nm6 nm6Var29 = nm6.a;
                int i32 = this.k;
                try {
                    if (i32 == 0) {
                        qgg.h0(obj);
                        Context context2 = (Context) this.l;
                        pkd pkdVar = (pkd) this.m;
                        okd okdVar = new okd(context2);
                        pv0 b2 = pkdVar.b();
                        this.k = 1;
                        if (okdVar.c(pkdVar, b2, this) == nm6Var29) {
                            return nm6Var29;
                        }
                    } else {
                        if (i32 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                } catch (CancellationException unused) {
                } catch (Throwable th2) {
                    Log.e("GlanceAppWidget", "Error in Glance App Widget", th2);
                }
                return Unit.a;
            default:
                nm6 nm6Var30 = nm6.a;
                int i33 = this.k;
                if (i33 == 0) {
                    qgg.h0(obj);
                    sqdVar = null;
                } else {
                    if (i33 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sqdVar = (sqd) this.l;
                    qgg.h0(obj);
                }
                while (sqdVar == null) {
                    try {
                        sqdVar = (sqd) ((Function0) this.m).invoke();
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception unused2) {
                        this.l = sqdVar;
                        this.k = 1;
                        if (y2x.o(1000L, this) == nm6Var30) {
                            return nm6Var30;
                        }
                    }
                }
                return sqdVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fzb(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fzb(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fzb(pjc pjcVar, Continuation continuation, chd chdVar, int i) {
        super(2, continuation);
        this.j = i;
        this.l = pjcVar;
        this.m = chdVar;
    }
}
