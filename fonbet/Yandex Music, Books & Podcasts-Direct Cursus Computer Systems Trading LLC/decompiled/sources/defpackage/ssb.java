package defpackage;

import android.net.Uri;
import android.os.Parcelable;
import com.yandex.payment.sdk.ui.view.PersonalInfoView;
import com.yandex.pulse.metrics.o;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import ru.yandex.video.m3.data.exception.ManifestLoadingException;
import ru.yandex.video.m3.ott.data.dto.VhVideoData;
import ru.yandex.video.m3.player.RepeatMode$Fixed;

/* loaded from: classes6.dex */
public final class ssb extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ssb(Function1 function1, jek jekVar) {
        super(0);
        this.r = 21;
        this.t = (uif) function1;
        this.s = jekVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:256:0x04e8, code lost:
    
        if (((ru.yandex.video.m3.player.RepeatMode$Fixed) r2).isFinished() != false) goto L230;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [xci] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [xci] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v80 */
    /* JADX WARN: Type inference failed for: r2v81 */
    /* JADX WARN: Type inference failed for: r3v10, types: [eqi] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [eqi] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r7v55, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Object t7oVar;
        ggk ggkVar;
        ggk ggkVar2;
        int i = this.r;
        int i2 = 3;
        Object obj = this.t;
        Object obj2 = this.s;
        switch (i) {
            case 0:
                i8l i8lVar = ((tsb) obj).a;
                Object obj3 = ((xqn) obj2).a;
                iyn iynVar = (iyn) obj3;
                if (!(iynVar instanceof fyn)) {
                    if (!(iynVar instanceof eyn)) {
                        if (!(iynVar instanceof RepeatMode$Fixed)) {
                            b6e.s();
                            return null;
                        }
                        break;
                    }
                    r4 = 1;
                }
                i8lVar.w0(r4);
                return Unit.a;
            case 1:
                ((xqn) obj2).a = ((dpc) obj).T0();
                return Unit.a;
            case 2:
                ((xqn) obj2).a = men.t((fpc) obj, hsk.a);
                return Unit.a;
            case 3:
                return ((obd) obj).k((List) obj2);
            case 4:
                ((dzd) obj).g((xci) obj2);
                return Unit.a;
            case 5:
                return ((o9e) obj).a.a(new j13((String) obj2, 1));
            case 6:
                x97.y((mm6) obj, null, null, new jmd((ck0) obj2, r6, i2), 3);
                return Unit.a;
            case 7:
                String str = (String) obj2;
                str.getClass();
                z7o z7oVar = (z7o) ((LinkedHashMap) ((twe) obj).b(t75.c(str))).get(str);
                if (z7oVar != null) {
                    t7oVar = z7oVar.a;
                } else {
                    r7o r7oVar = z7o.b;
                    t7oVar = new t7o(new ManifestLoadingException.NotFound(null, null, 3, null));
                }
                qgg.h0(t7oVar);
                return (VhVideoData) t7oVar;
            case 8:
                cr crVar = ((mpf) obj).F;
                xqn xqnVar = (xqn) obj2;
                if ((((xci) crVar.f).d & 8) != 0) {
                    for (xci xciVar = (i4s) crVar.e; xciVar != null; xciVar = xciVar.e) {
                        if ((xciVar.c & 8) != 0) {
                            cw7 cw7Var = xciVar;
                            ?? r3 = 0;
                            while (cw7Var != 0) {
                                if (cw7Var instanceof ofp) {
                                    ofp ofpVar = (ofp) cw7Var;
                                    if (ofpVar.v()) {
                                        jfp jfpVar = new jfp();
                                        xqnVar.a = jfpVar;
                                        jfpVar.d = true;
                                    }
                                    if (ofpVar.E0()) {
                                        ((jfp) xqnVar.a).c = true;
                                    }
                                    ofpVar.X((jfp) xqnVar.a);
                                } else if ((cw7Var.c & 8) != 0 && (cw7Var instanceof cw7)) {
                                    xci xciVar2 = cw7Var.p;
                                    int i3 = 0;
                                    cw7Var = cw7Var;
                                    r3 = r3;
                                    while (xciVar2 != null) {
                                        if ((xciVar2.c & 8) != 0) {
                                            i3++;
                                            r3 = r3;
                                            if (i3 == 1) {
                                                cw7Var = xciVar2;
                                            } else {
                                                if (r3 == 0) {
                                                    r3 = new eqi(new xci[16]);
                                                }
                                                if (cw7Var != 0) {
                                                    r3.d(cw7Var);
                                                    cw7Var = 0;
                                                }
                                                r3.d(xciVar2);
                                            }
                                        }
                                        xciVar2 = xciVar2.f;
                                        cw7Var = cw7Var;
                                        r3 = r3;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                cw7Var = bcx.p(r3);
                            }
                        }
                    }
                }
                return Unit.a;
            case 9:
                bsf bsfVar = (bsf) ((zx7) obj).getValue();
                tsf tsfVar = (tsf) obj2;
                return new csf(tsfVar, bsfVar, new x0((IntRange) tsfVar.d.f.getValue(), bsfVar));
            case 10:
                u2k u2kVar = (u2k) ((zx7) obj).getValue();
                o3k o3kVar = (o3k) obj2;
                return new v2k(o3kVar, u2kVar, new x0((IntRange) ((xtf) o3kVar.d.f).getValue(), u2kVar));
            case 11:
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                return new qvf((koo) obj, e5bVar, (ioo) obj2);
            case 12:
                Function1 e = ((msk) obj).a.e();
                if (e != null) {
                    e.invoke(new swg((twg) obj2));
                }
                return Unit.a;
            case 13:
                zwg zwgVar = (zwg) obj;
                qpf qpfVar = zwgVar.f;
                qpfVar.h = 0;
                eqi y = qpfVar.a.y();
                Object[] objArr = y.a;
                int i4 = y.c;
                for (int i5 = 0; i5 < i4; i5++) {
                    zwg zwgVar2 = ((mpf) objArr[i5]).G.q;
                    zwgVar2.getClass();
                    zwgVar2.h = zwgVar2.i;
                    zwgVar2.i = Integer.MAX_VALUE;
                    if (zwgVar2.j == kpf.b) {
                        zwgVar2.j = kpf.c;
                    }
                }
                mpf mpfVar = qpfVar.a;
                mpf mpfVar2 = qpfVar.a;
                eqi y2 = mpfVar.y();
                Object[] objArr2 = y2.a;
                int i6 = y2.c;
                for (int i7 = 0; i7 < i6; i7++) {
                    zwg zwgVar3 = ((mpf) objArr2[i7]).G.q;
                    zwgVar3.getClass();
                    zwgVar3.s.d = false;
                }
                zme zmeVar = zwgVar.D().Y;
                if (zmeVar != null) {
                    boolean z = zmeVar.h;
                    List o = mpfVar2.o();
                    int size = o.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        vwg Z0 = ((f8j) ((mpf) ((epi) o).get(i8)).F.d).Z0();
                        if (Z0 != null) {
                            Z0.h = z;
                        }
                    }
                }
                ((vwg) obj2).K0().d();
                if (zwgVar.D().Y != null) {
                    List o2 = mpfVar2.o();
                    int size2 = o2.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        vwg Z02 = ((f8j) ((mpf) ((epi) o2).get(i9)).F.d).Z0();
                        if (Z02 != null) {
                            Z02.h = false;
                        }
                    }
                }
                eqi y3 = mpfVar2.y();
                Object[] objArr3 = y3.a;
                int i10 = y3.c;
                for (int i11 = 0; i11 < i10; i11++) {
                    zwg zwgVar4 = ((mpf) objArr3[i11]).G.q;
                    zwgVar4.getClass();
                    int i12 = zwgVar4.h;
                    int i13 = zwgVar4.i;
                    if (i12 != i13 && i13 == Integer.MAX_VALUE) {
                        zwgVar4.C0(true);
                    }
                }
                eqi y4 = mpfVar2.y();
                Object[] objArr4 = y4.a;
                int i14 = y4.c;
                while (r4 < i14) {
                    zwg zwgVar5 = ((mpf) objArr4[r4]).G.q;
                    zwgVar5.getClass();
                    npf npfVar = zwgVar5.s;
                    npfVar.e = npfVar.d;
                    r4++;
                }
                return Unit.a;
            case 14:
                return ((l9i) obj).a.C((j13) obj2, vsf.Y, p1j.b);
            case 15:
                if (Intrinsics.d((String) obj, "3ds")) {
                    ((x7o) ((pv9) obj2).b).onSuccess(fn.a);
                }
                return Unit.a;
            case 16:
                x7o x7oVar = (x7o) ((pv9) obj2).b;
                t9i t9iVar = (t9i) obj;
                if (t9iVar instanceof va4) {
                    va4 va4Var = (va4) t9iVar;
                    x7oVar.onSuccess(new hn(va4Var.b, va4Var.c));
                } else if (t9iVar instanceof ab4) {
                    ab4 ab4Var = (ab4) t9iVar;
                    x7oVar.onSuccess(new in(new kpo(jpo.RandomAmount, "", ab4Var.b, 0L, ab4Var.c, ab4Var.d, null)));
                } else if (t9iVar instanceof db4) {
                    db4 db4Var = (db4) t9iVar;
                    jpo jpoVar = jpo.SmsChallenge;
                    String str2 = db4Var.b;
                    String str3 = db4Var.d;
                    r6 = str3 != null ? StringsKt.r0(10, str3) : 0;
                    x7oVar.onSuccess(new in(new kpo(jpoVar, "", str2, r6 != 0 ? r6.longValue() : 0L, "", "", db4Var.c)));
                } else if (t9iVar instanceof xa4) {
                    x7oVar.onSuccess(jn.a);
                }
                return Unit.a;
            case 17:
                ((j4x) obj).b++;
                return (mif) ((ssb) obj2).invoke();
            case 18:
                zcq zcqVar = (zcq) obj;
                if (((Boolean) ((Function1) zcqVar.b.d).invoke(gdq.c)).booleanValue()) {
                    x97.y((mm6) obj2, null, null, new bbi(zcqVar, r6, 5), 3);
                }
                return Boolean.TRUE;
            case 19:
                PersonalInfoView personalInfoView = (PersonalInfoView) obj2;
                e3j e3jVar = ((c3j) obj).s;
                if (e3jVar == null) {
                    Intrinsics.j("viewModel");
                    throw null;
                }
                String str4 = personalInfoView.getEmailView().d;
                String email = ((str4 == null || StringsKt.U(str4)) ? 1 : 0) == 0 ? personalInfoView.getEmailView().getEmail() : null;
                e3jVar.m = email;
                j3j j3jVar = e3jVar.l;
                if (!Intrinsics.d(email, j3jVar.h)) {
                    j3jVar.h = email;
                    mv3 mv3Var = (mv3) j3jVar.d;
                    if (mv3Var != null) {
                        mv3Var.j(j3jVar.j((jw3) j3jVar.g));
                    }
                }
                return Unit.a;
            case 20:
                Object invoke = ((Method) obj).invoke(obj2, null);
                invoke.getClass();
                return (e9k) invoke;
            case 21:
                ((uif) obj).invoke(((jek) obj2).c);
                return Unit.a;
            case 22:
                x7o x7oVar2 = (x7o) obj;
                fgk fgkVar = (fgk) obj2;
                fgkVar.getClass();
                int ordinal = fgkVar.ordinal();
                if (ordinal == 0) {
                    ggkVar = ggk.a;
                } else {
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    ggkVar = ggk.b;
                }
                x7oVar2.onSuccess(new gn(ggkVar));
                return Unit.a;
            case 23:
                gek gekVar = (gek) ((oxa) obj).b;
                String uri = ((ft7) obj2).a.toString();
                uri.getClass();
                Uri parse = Uri.parse(uri);
                parse.getClass();
                gekVar.d(parse);
                return Unit.a;
            case 24:
                String str5 = (String) obj;
                eb4[] eb4VarArr = eb4.a;
                boolean d = Intrinsics.d(str5, "3ds");
                gek gekVar2 = (gek) ((jtc) obj2).a;
                if (d) {
                    gekVar2.c();
                } else {
                    gekVar2.l(str5);
                }
                return Unit.a;
            case 25:
                t9i t9iVar2 = (t9i) obj2;
                ozw ozwVar = ((mgk) obj).n;
                if (ozwVar != null) {
                    cb4 cb4Var = (cb4) t9iVar2;
                    Uri parse2 = Uri.parse(cb4Var.b);
                    parse2.getClass();
                    ozwVar.A(parse2, cb4Var.c);
                }
                return Unit.a;
            case 26:
                mgk mgkVar = (mgk) obj;
                mgkVar.h.invoke();
                x7o x7oVar3 = mgkVar.l;
                if (x7oVar3 != null) {
                    fgk fgkVar2 = (fgk) obj2;
                    fgkVar2.getClass();
                    int ordinal2 = fgkVar2.ordinal();
                    if (ordinal2 == 0) {
                        ggkVar2 = ggk.a;
                    } else {
                        if (ordinal2 != 1) {
                            b6e.s();
                            return null;
                        }
                        ggkVar2 = ggk.b;
                    }
                    x7oVar3.onSuccess(ggkVar2);
                }
                return Unit.a;
            case 27:
                Parcelable.Creator<bfk> creator = bfk.CREATOR;
                bfk x = y7g.x((r7w) obj2);
                x7o x7oVar4 = ((mgk) obj).l;
                if (x7oVar4 != null) {
                    x7oVar4.x(x);
                }
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                Parcelable.Creator<bfk> creator2 = bfk.CREATOR;
                ((ime) obj).x(y7g.x((r7w) obj2));
                return Unit.a;
            default:
                eqm eqmVar = (eqm) obj2;
                w7o w7oVar = (w7o) obj;
                if (w7oVar instanceof s7o) {
                    eqmVar.q.l(new xpm(((s7o) w7oVar).a));
                } else if (w7oVar instanceof u7o) {
                    List p = o8g.p((List) ((u7o) w7oVar).a);
                    eqmVar.p.l(p);
                    ArrayList y0 = CollectionsKt.y0(p);
                    eqmVar.s = y0;
                    if (y0.size() == 1) {
                        eqmVar.J((rfk) CollectionsKt.Q(eqmVar.s), false);
                    } else {
                        eqmVar.H();
                    }
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ssb(xqn xqnVar, xci xciVar, int i) {
        super(0);
        this.r = i;
        this.s = xqnVar;
        this.t = xciVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ssb(int i, Object obj, Object obj2) {
        super(0);
        this.r = i;
        this.t = obj;
        this.s = obj2;
    }
}
