package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.yandex.music.shared.playback.api.commands.PauseCommand;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.d;

/* loaded from: classes.dex */
public final /* synthetic */ class m5 extends ezc implements Function1 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m5(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0083, code lost:
    
        if (r5 == false) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, pm6] */
    /* JADX WARN: Type inference failed for: r6v15 */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        ka1 ka1Var;
        ?? r6;
        Collection values;
        sml smlVar;
        ?? r16;
        Pair pair;
        Pair pair2;
        String b;
        m84 m84Var;
        n7q n7qVar;
        u3q g;
        int i5 = 8;
        char c = 7;
        int i6 = 10;
        int i7 = 2;
        switch (this.a) {
            case 0:
                int i8 = 0;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                s5 s5Var = (s5) this.receiver;
                yoi yoiVar = s5Var.B;
                if (booleanValue) {
                    s5Var.Y0();
                } else {
                    if (s5Var.q != null) {
                        Object[] objArr = yoiVar.c;
                        long[] jArr = yoiVar.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i9 = 0;
                            while (true) {
                                long j = jArr[i9];
                                if ((((~j) << c) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                                    int i11 = i8;
                                    while (i11 < i10) {
                                        if ((255 & j) < 128) {
                                            i3 = i8;
                                            i4 = i5;
                                            x97.y(s5Var.G0(), null, null, new p5(s5Var, (rqm) objArr[(i9 << 3) + i11], null, i3), 3);
                                        } else {
                                            i3 = i8;
                                            i4 = i5;
                                        }
                                        j >>= i4;
                                        i11++;
                                        i5 = i4;
                                        i8 = i3;
                                    }
                                    i = i5;
                                    i2 = i8;
                                    if (i10 != i) {
                                    }
                                } else {
                                    i = i5;
                                    i2 = i8;
                                }
                                if (i9 != length) {
                                    i9++;
                                    i8 = i2;
                                    i5 = i;
                                    c = 7;
                                }
                            }
                        }
                    }
                    yoiVar.a();
                    s5Var.Z0();
                }
                break;
            case 1:
                ((ju7) this.receiver).b(obj);
                break;
            case 2:
                r7w r7wVar = (r7w) obj;
                r7wVar.getClass();
                ((ju7) this.receiver).a(r7wVar);
                break;
            case 3:
                ((ju7) this.receiver).b(obj);
                break;
            case 4:
                r7w r7wVar2 = (r7w) obj;
                r7wVar2.getClass();
                ((ju7) this.receiver).a(r7wVar2);
                break;
            case 5:
                bxl bxlVar = (bxl) obj;
                bxlVar.getClass();
                il ilVar = (il) this.receiver;
                ilVar.getClass();
                bxlVar.getClass();
                boolean z2 = !bxlVar.d;
                HashMap hashMap = ilVar.f;
                String str = bxlVar.a;
                hashMap.put(str, Boolean.valueOf(z2));
                ilVar.g.add(str);
                xdr xdrVar = ilVar.d;
                ml mlVar = (ml) xdrVar.getValue();
                if (mlVar instanceof jl) {
                    List<bxl> list = ((jl) mlVar).a;
                    ArrayList arrayList = new ArrayList(v75.o(list, 10));
                    for (bxl bxlVar2 : list) {
                        if (bxlVar2.a.equals(str)) {
                            String str2 = bxlVar2.a;
                            String str3 = bxlVar2.b;
                            String str4 = bxlVar2.c;
                            str3.getClass();
                            str4.getClass();
                            bxlVar2 = new bxl(str2, str3, str4, z2);
                        }
                        arrayList.add(bxlVar2);
                    }
                    jl jlVar = new jl(arrayList);
                    xdrVar.getClass();
                    xdrVar.m(null, jlVar);
                }
                break;
            case 6:
                u51 u51Var = (u51) obj;
                u51Var.getClass();
                hr hrVar = (hr) this.receiver;
                hrVar.getClass();
                hrVar.c.b(wjb.ArtistScreen);
                hrVar.d.S(u51Var);
                break;
            case 7:
                String str5 = (String) obj;
                str5.getClass();
                ((tnb) this.receiver).c(str5);
                break;
            case 8:
                vbc vbcVar = (vbc) obj;
                vbcVar.getClass();
                y40 y40Var = (y40) this.receiver;
                y40Var.getClass();
                x97.y(ot0.F(y40Var), null, null, new l5(y40Var, vbcVar, null, 13), 3);
                break;
            case 9:
                vbc vbcVar2 = (vbc) obj;
                vbcVar2.getClass();
                e60 e60Var = (e60) this.receiver;
                e60Var.getClass();
                x97.y(ot0.F(e60Var), null, null, new l5(e60Var, vbcVar2, null, 16), 3);
                break;
            case 10:
                Function0 function0 = (Function0) obj;
                gpi gpiVar = ((AndroidComposeView) this.receiver).a1;
                if (gpiVar.f(function0) < 0) {
                    gpiVar.a(function0);
                }
                break;
            case 11:
                int i12 = ((loc) obj).a;
                AndroidComposeView androidComposeView = (AndroidComposeView) this.receiver;
                Class cls = AndroidComposeView.j1;
                androidComposeView.getClass();
                if (i12 != 7 && i12 != 8) {
                    Integer K = yd5.K(i12);
                    if (K != null) {
                        int intValue = K.intValue();
                        ynn y = androidComposeView.y();
                        Rect D = y != null ? uwf.D(y) : null;
                        FocusFinder focusFinder = FocusFinder.getInstance();
                        View findNextFocus = D == null ? focusFinder.findNextFocus(androidComposeView, androidComposeView.findFocus(), intValue) : focusFinder.findNextFocusFromRect(androidComposeView, D, intValue);
                        if (findNextFocus != null) {
                            z = yd5.H(findNextFocus, Integer.valueOf(intValue), D);
                            break;
                        }
                    } else {
                        xq0.q("Invalid focus direction");
                        break;
                    }
                }
                z = false;
            case 12:
                oq oqVar = (oq) obj;
                oqVar.getClass();
                f11 f11Var = (f11) this.receiver;
                f11Var.getClass();
                v01 v01Var = f11Var.c;
                v01Var.getClass();
                t tVar = v01Var.a;
                tVar.startActivity(quj.T(tVar, oqVar, null));
                break;
            case 13:
                oq oqVar2 = (oq) obj;
                oqVar2.getClass();
                f11 f11Var2 = (f11) this.receiver;
                f11Var2.getClass();
                v01 v01Var2 = f11Var2.c;
                v01Var2.getClass();
                t tVar2 = v01Var2.a;
                lwg C = g0g.C(oqVar2, null);
                y supportFragmentManager = tVar2.getSupportFragmentManager();
                szf.R(supportFragmentManager, vz1.f(supportFragmentManager, C), d.a());
                break;
            case 14:
                IntRange intRange = (IntRange) obj;
                intRange.getClass();
                ((q0d) this.receiver).e(intRange);
                break;
            case 15:
                IntRange intRange2 = (IntRange) obj;
                intRange2.getClass();
                ((q0d) this.receiver).e(intRange2);
                break;
            case 16:
                lt ltVar = (lt) obj;
                ltVar.getClass();
                ((ug1) this.receiver).b(ltVar);
                break;
            case 17:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                mj1 mj1Var = (mj1) this.receiver;
                xdr xdrVar2 = mj1Var.s;
                Object value = xdrVar2.getValue();
                cj1 cj1Var = value instanceof cj1 ? (cj1) value : null;
                if (cj1Var != null && (ka1Var = cj1Var.a) != null) {
                    if (!booleanValue2) {
                        a68 a68Var = (a68) mj1Var.r.getValue();
                        u51 u51Var2 = mj1Var.D;
                        a68Var.getClass();
                        u51Var2.getClass();
                        a68Var.c.put(u51Var2.a, Long.valueOf(a68Var.a.b()));
                    }
                    xdrVar2.m(null, new aj1(ka1Var));
                }
                break;
            case 18:
                oq oqVar3 = (oq) obj;
                oqVar3.getClass();
                dz1 dz1Var = (dz1) this.receiver;
                dz1Var.getClass();
                gw4 gw4Var = dz1Var.c;
                gw4Var.getClass();
                t tVar3 = gw4Var.a;
                tVar3.startActivity(quj.T(tVar3, oqVar3, null));
                break;
            case 19:
                oq oqVar4 = (oq) obj;
                oqVar4.getClass();
                dz1 dz1Var2 = (dz1) this.receiver;
                dz1Var2.getClass();
                gw4 gw4Var2 = dz1Var2.c;
                gw4Var2.getClass();
                lwg C2 = g0g.C(oqVar4, null);
                y supportFragmentManager2 = gw4Var2.a.getSupportFragmentManager();
                szf.R(supportFragmentManager2, vz1.f(supportFragmentManager2, C2), d.j());
                break;
            case 20:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                q32 q32Var = (q32) this.receiver;
                t32 t32Var = q32Var.a;
                if (((lwc) t32Var.k.b.getValue()).a()) {
                    v7g.L(q32Var.b.a, new lik(vik.f, null, null));
                } else {
                    ((vnb) t32Var.l.c.getValue()).a(xjb.AutoCache, booleanValue3);
                    xdr xdrVar3 = t32Var.n;
                    Object value2 = xdrVar3.getValue();
                    v32 v32Var = value2 instanceof v32 ? (v32) value2 : null;
                    if (v32Var != null) {
                        r6 = 0;
                        xdrVar3.m(null, v32.a(v32Var, booleanValue3, null, 6));
                    } else {
                        r6 = 0;
                    }
                    x97.y(ot0.F(t32Var), r6, r6, new z11(booleanValue3, t32Var, (Continuation) r6, i7), 3);
                }
                break;
            case 21:
                break;
            case 22:
                ((np2) this.receiver).w((yxc) obj);
                break;
            case 23:
                qt2 qt2Var = (qt2) obj;
                qt2Var.getClass();
                rt2 rt2Var = (rt2) this.receiver;
                rt2Var.getClass();
                if (qt2Var instanceof pt2) {
                    pt2 pt2Var = (pt2) qt2Var;
                    zjj zjjVar = pt2Var.a;
                    sa8 sa8Var = pt2Var.b;
                    LinkedHashMap linkedHashMap = rt2Var.b;
                    if (linkedHashMap == null) {
                        zjjVar.onComplete();
                        sa8Var.a.invoke(sa8Var);
                    } else {
                        linkedHashMap.put(sa8Var, zjjVar);
                        rt2Var.a(zjjVar);
                    }
                } else if (qt2Var instanceof ot2) {
                    Object obj2 = ((ot2) qt2Var).a;
                    rt2Var.b(obj2);
                    LinkedHashMap linkedHashMap2 = rt2Var.b;
                    if (linkedHashMap2 != null && (values = linkedHashMap2.values()) != null) {
                        Iterator it = values.iterator();
                        while (it.hasNext()) {
                            ((vjj) it.next()).onNext(obj2);
                        }
                    }
                } else if (qt2Var instanceof mt2) {
                    LinkedHashMap linkedHashMap3 = rt2Var.b;
                    if (linkedHashMap3 != null) {
                        for (Map.Entry entry : linkedHashMap3.entrySet()) {
                            sa8 sa8Var2 = (sa8) entry.getKey();
                            ((vjj) entry.getValue()).onComplete();
                            sa8Var2.a.invoke(sa8Var2);
                        }
                    }
                    rt2Var.b = null;
                } else if (!(qt2Var instanceof nt2)) {
                    b6e.s();
                    break;
                } else {
                    sa8 sa8Var3 = ((nt2) qt2Var).a;
                    LinkedHashMap linkedHashMap4 = rt2Var.b;
                    if (linkedHashMap4 != null) {
                    }
                }
                break;
            case 24:
                vbc vbcVar3 = (vbc) obj;
                vbcVar3.getClass();
                x83 x83Var = (x83) this.receiver;
                x83Var.getClass();
                x97.y(ot0.F(x83Var), null, null, new cs1(x83Var, vbcVar3, null, i6), 3);
                break;
            case 25:
                String str6 = (String) obj;
                str6.getClass();
                ((tnb) this.receiver).c(str6);
                break;
            case 26:
                l18 l18Var = l18.b;
                String str7 = (String) obj;
                str7.getClass();
                z74 z74Var = (z74) this.receiver;
                z74Var.getClass();
                l74 l74Var = z74Var.b;
                b84 b84Var = z74Var.a;
                Iterator it2 = ((List) b84Var.c.getValue(b84Var, b84.h[0])).iterator();
                Continuation continuation = null;
                boolean z3 = false;
                x74 x74Var = null;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else {
                        ?? next = it2.next();
                        if (Intrinsics.d(((x74) next).a(), str7)) {
                            if (!z3) {
                                x74Var = next;
                                z3 = true;
                            }
                        }
                    }
                }
                x74Var = null;
                x74 x74Var2 = x74Var;
                if (x74Var2 != null && (smlVar = l74Var.a) != null) {
                    j2n j2nVar = (j2n) smlVar.a;
                    y74 y74Var = (y74) j2nVar.t.getValue();
                    n2n n2nVar = j2nVar.d;
                    boolean z4 = j2nVar.e;
                    Context context = j2nVar.a;
                    y74Var.getClass();
                    context.getClass();
                    boolean z5 = x74Var2 instanceof s74;
                    if (z5) {
                        r16 = 0;
                        pair2 = new Pair(okb.Phone, slb.Other);
                    } else {
                        r16 = 0;
                        if (x74Var2 instanceof t74) {
                            pair = new Pair(okb.Station, slb.Other);
                        } else if (x74Var2 instanceof r74) {
                            pair = new Pair(okb.Chromecast, slb.Chromecast);
                        } else if (!(x74Var2 instanceof w74)) {
                            b6e.s();
                            break;
                        } else {
                            pair = new Pair(xv7.y(((w74) x74Var2).e), slb.Ynison);
                        }
                        pair2 = pair;
                    }
                    okb okbVar = (okb) pair2.a;
                    slb slbVar = (slb) pair2.b;
                    Integer c2 = x74Var2.c();
                    if (c2 == null || (b = context.getString(c2.intValue())) == null) {
                        b = x74Var2.b();
                    }
                    if (b != null) {
                        nmb nmbVar = y74Var.c;
                        String a = x74Var2.a();
                        nmbVar.getClass();
                        okbVar.getClass();
                        slbVar.getClass();
                        a.getClass();
                        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                        linkedHashMap5.put(CommonUrlParts.DEVICE_TYPE, okbVar.a);
                        linkedHashMap5.put("protocol_type", slbVar.a);
                        linkedHashMap5.put("device_id", a);
                        dfi.p(2, "device_name", b, "_meta", linkedHashMap5);
                        nmbVar.C("Pult.Picker.Selected", linkedHashMap5);
                    }
                    rar rarVar = j2nVar.u;
                    if (rarVar != null) {
                        rarVar.g(null);
                    }
                    f7l f7lVar = ((oq7) j2nVar.n.getValue()).a;
                    boolean C3 = p6g.C((e6l) f7lVar.d.getValue());
                    d6l x = p6g.x((e6l) f7lVar.c.getValue());
                    boolean R = (x == null || (n7qVar = x.a) == null || (g = n7qVar.g()) == null) ? r16 : gut.R(g);
                    if (!z5 && !(x74Var2 instanceof r74)) {
                        if (x74Var2 instanceof w74) {
                            if (C3) {
                                j2n.c(j2nVar, R.string.remote_queue_launch_error_trailer);
                            } else if (!R) {
                                w74 w74Var = (w74) x74Var2;
                                if (!w74Var.f) {
                                    int ordinal = w74Var.e.ordinal();
                                    int i13 = R.string.pult_picker_connect_offline_ynison_device_music;
                                    switch (ordinal) {
                                        case 0:
                                        case 4:
                                        case 5:
                                            j2n.c(j2nVar, i13);
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i13 = R.string.pult_picker_connect_offline_ynison_device_tv;
                                            j2n.c(j2nVar, i13);
                                            break;
                                        case 6:
                                        case 7:
                                            i13 = R.string.pult_picker_connect_offline_ynison_device_other;
                                            j2n.c(j2nVar, i13);
                                            break;
                                        default:
                                            b6e.s();
                                            break;
                                    }
                                }
                            } else {
                                j2n.c(j2nVar, R.string.remote_queue_launch_error_sets);
                            }
                            ssg.a(2, null, "picker unavailable " + x74Var2.a + "(id=" + x74Var2.a() + ") clicked", null);
                        } else if (!(x74Var2 instanceof t74)) {
                            b6e.s();
                            break;
                        } else {
                            if (C3) {
                                j2n.c(j2nVar, R.string.remote_queue_launch_error_trailer);
                            } else if (R) {
                                j2n.c(j2nVar, R.string.remote_queue_launch_error_sets);
                            } else {
                                int ordinal2 = ((t74) x74Var2).e.ordinal();
                                if (ordinal2 != 0) {
                                    if (ordinal2 == 1) {
                                        nmb nmbVar2 = w64.a;
                                        w64.b(ulb.Connection, w64.a(null, "unavailable_wifi"));
                                        j2n.c(j2nVar, R.string.pult_picker_connect_unaccessible_station);
                                    } else if (ordinal2 != 2) {
                                        b6e.s();
                                        break;
                                    } else {
                                        j2n.c(j2nVar, R.string.pult_picker_connect_update_version);
                                    }
                                }
                            }
                            ssg.a(2, null, "picker unavailable " + x74Var2.a + "(id=" + x74Var2.a() + ") clicked", null);
                        }
                    }
                    xdr xdrVar4 = j2nVar.v;
                    xdrVar4.getClass();
                    xdrVar4.m(null, x74Var2);
                    if (z5) {
                        bdt I = hag.I(byb.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        if (((Boolean) ((qgw) ((byb) qdcVar.C(I)).c(ern.a(qgw.class))).e.getValue()).booleanValue()) {
                            j2nVar.i().g(new zsw(p6g.C((e6l) ((oq7) j2nVar.n.getValue()).a.c.getValue())));
                        }
                    } else if (x74Var2 instanceof w74) {
                        w74 w74Var2 = (w74) x74Var2;
                        if (!j2nVar.j(w74Var2) || z4) {
                            afw i14 = j2nVar.i();
                            Cnew a2 = n2nVar.a();
                            if (a2 != null) {
                                n1n n1nVar = new n1n(j2nVar, 1);
                                i14.getClass();
                                String str8 = afw.l;
                                String str9 = w74Var2.c;
                                if (i14.a().c()) {
                                    if (a2 instanceof lew) {
                                        ssg.a(4, str8, "requested current playback transfer", null);
                                        ((udw) i14.j.getValue()).a(w74Var2);
                                        i14.f(str9, new zsw(true));
                                    } else if (!(a2 instanceof mew)) {
                                        b6e.s();
                                        break;
                                    } else {
                                        ssg.a(4, str8, "requested target playback transfer", null);
                                        ((udw) i14.j.getValue()).a(w74Var2);
                                        i14.f(str9, null);
                                        String str10 = w74Var2.c;
                                        mew mewVar = (mew) a2;
                                        rar rarVar2 = i14.k;
                                        if (rarVar2 != null) {
                                            rarVar2.g(null);
                                        }
                                        i14.k = x97.y(i14.b, null, null, new ocu(i14, str10, n1nVar, mewVar, (Continuation) null, 10), 3);
                                    }
                                }
                            } else {
                                j2nVar.d();
                            }
                        } else {
                            j2nVar.d();
                        }
                    } else if (x74Var2 instanceof t74) {
                        t74 t74Var = (t74) x74Var2;
                        if (j2nVar.n(h74.a)) {
                            if (!j2nVar.j(t74Var) || z4) {
                                n74 n74Var = (n74) j2nVar.A.getValue(j2nVar, j2n.D[r16]);
                                if (n74Var != null && (m84Var = (m84) n74Var.c.getValue(n74Var, n74.f[r16])) != null) {
                                    x74 a3 = m84Var.a();
                                    if (!(a3 instanceof r74)) {
                                        if (!Intrinsics.d(a3, s74.c) && !(a3 instanceof t74) && !(a3 instanceof w74) && a3 != null) {
                                            b6e.s();
                                            break;
                                        }
                                    } else if (m84Var.b() == n84.c) {
                                        ((k1l) j2nVar.o.getValue()).a(PauseCommand.INSTANCE, new b3t("core_pause"));
                                    }
                                }
                                diw b2 = ((wlw) j2nVar.i().c.getValue()).b();
                                bdt I2 = hag.I(kmw.class);
                                qdc qdcVar2 = b2.a;
                                qdcVar2.getClass();
                                boolean a4 = ((kmw) qdcVar2.C(I2)).a(cyk.c);
                                odd h = j2nVar.h();
                                String str11 = t74Var.c;
                                vgd b3 = n2nVar.b();
                                bz2 bz2Var = new bz2(a4, j2nVar, 14);
                                h.getClass();
                                str11.getClass();
                                x97.y(h.f, null, null, new akc(h, str11, new gx4(h, true, bz2Var, str11, b3, null), continuation, 11), 3);
                            } else {
                                j2nVar.d();
                            }
                        }
                    } else if (!(x74Var2 instanceof r74)) {
                        b6e.s();
                        break;
                    } else {
                        r74 r74Var = (r74) x74Var2;
                        if (lxe.l() instanceof c0b) {
                            bdt I3 = hag.I(byb.class);
                            qdc qdcVar3 = l18Var.a;
                            qdcVar3.getClass();
                            if (((qk4) ((byb) qdcVar3.C(I3)).c(ern.a(qk4.class))).h()) {
                                x97.y(j2nVar.g, null, null, new s1n(j2nVar, r74Var, (Continuation) null), 3);
                            }
                        }
                        j2nVar.e(r74Var);
                    }
                }
                break;
            case 27:
                yur yurVar = (yur) obj;
                yurVar.getClass();
                ((tt4) this.receiver).g(yurVar);
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                xur xurVar = (xur) obj;
                xurVar.getClass();
                ((st4) this.receiver).i(xurVar);
                break;
            default:
                ((st4) this.receiver).j(((Number) obj).floatValue());
                break;
        }
        return Unit.a;
    }
}
