package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.d;
import androidx.fragment.app.t;
import com.yandex.music.shared.playback.utils.api.commands.RemovePlayableByQueuePositionCommand;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.yandex.plus.bdui.flex.ui.error.a;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class ny2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ny2(String str, laa laaVar) {
        this.a = 18;
        this.c = str;
        this.b = laaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0611  */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String valueOf;
        ?? r6;
        boolean z;
        boolean b;
        StackTraceElement stackTraceElement;
        jyr jyrVar;
        String str;
        vhc vhcVar;
        View view;
        StackTraceElement stackTraceElement2;
        String str2;
        vhc vhcVar2;
        q2a q2aVar;
        View view2;
        ViewGroup viewGroup;
        kb6 kb6Var;
        ub6 ub6Var;
        StackTraceElement stackTraceElement3;
        String str3;
        vhc vhcVar3;
        StackTraceElement stackTraceElement4;
        String str4;
        StackTraceElement stackTraceElement5;
        String str5;
        vhc vhcVar4;
        int i = this.a;
        int i2 = 25;
        int i3 = 7;
        int i4 = 24;
        int i5 = 10;
        int i6 = 9;
        int i7 = 11;
        int i8 = 28;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                r2f r2fVar = (r2f) ((oy2) obj3).f.remove((String) obj2);
                if (r2fVar != null) {
                    r2fVar.g(null);
                }
                break;
            case 1:
                wnv wnvVar = (wnv) obj3;
                Context context = (Context) obj2;
                ifp ifpVar = (ifp) obj;
                ifpVar.getClass();
                wnvVar.getClass();
                context.getClass();
                rnv rnvVar = wnvVar.b;
                if (!rnvVar.equals(mnv.a)) {
                    if (!(rnvVar instanceof nnv)) {
                        if (!(rnvVar instanceof pnv)) {
                            if (!(rnvVar instanceof qnv)) {
                                b6e.s();
                                break;
                            } else {
                                valueOf = String.valueOf(context.getResources().getText(R.string.shortcut_long_label_play_my_vibe));
                            }
                        } else {
                            aab aabVar = ((pnv) rnvVar).a;
                            if (!(aabVar instanceof lt)) {
                                if (!(aabVar instanceof u51)) {
                                    if (!(aabVar instanceof eul)) {
                                        b6e.s();
                                        break;
                                    } else {
                                        CharSequence text = context.getResources().getText(R.string.playlist);
                                        valueOf = ((Object) text) + ". " + ((eul) aabVar).c;
                                    }
                                } else {
                                    CharSequence text2 = context.getResources().getText(R.string.artist);
                                    valueOf = ((Object) text2) + ". " + ((u51) aabVar).b;
                                }
                            } else {
                                StringBuilder sb = new StringBuilder();
                                lt ltVar = (lt) aabVar;
                                sb.append(lxe.x(ltVar) ? String.valueOf(context.getResources().getText(R.string.podcast)) : lxe.w(ltVar) ? String.valueOf(context.getResources().getText(R.string.book)) : String.valueOf(context.getResources().getText(R.string.album)));
                                sb.append(". ");
                                sb.append(ltVar.c);
                                valueOf = sb.toString();
                            }
                        }
                    } else {
                        aab aabVar2 = ((nnv) rnvVar).a;
                        if (!(aabVar2 instanceof lt)) {
                            if (!(aabVar2 instanceof u51)) {
                                if (!(aabVar2 instanceof eul)) {
                                    b6e.s();
                                    break;
                                } else {
                                    CharSequence text3 = context.getResources().getText(R.string.playlist);
                                    valueOf = ((Object) text3) + ". " + ((eul) aabVar2).c;
                                }
                            } else {
                                CharSequence text4 = context.getResources().getText(R.string.artist);
                                valueOf = ((Object) text4) + ". " + ((u51) aabVar2).b;
                            }
                        } else {
                            CharSequence text5 = context.getResources().getText(R.string.album);
                            valueOf = ((Object) text5) + ". " + ((lt) aabVar2).c;
                        }
                    }
                } else {
                    valueOf = ((Object) context.getResources().getText(R.string.playlist)) + ". " + ((Object) context.getResources().getText(R.string.favorite_playlist_title));
                }
                ngg.G(ifpVar, valueOf);
                break;
            case 2:
                as1 as1Var = (as1) obj;
                as1Var.getClass();
                x97.y((mm6) obj3, null, null, new cs1(as1Var, (aqi) obj2, null, i2), 3);
                break;
            case 3:
                jx7 jx7Var = (jx7) obj;
                jx7Var.getClass();
                break;
            case 4:
                List list = (List) obj3;
                vuf vufVar = (vuf) obj;
                vufVar.getClass();
                vufVar.Z(list.size(), new sv4(0, new t83(i6), list), new bl(i6, list, 0 == true ? 1 : 0), new wn5(new cl(6, list, (tv4) obj2), -1091073711, true));
                break;
            case 5:
                l25 l25Var = (l25) obj3;
                j25 j25Var = (j25) obj2;
                vuf vufVar2 = (vuf) obj;
                vufVar2.getClass();
                if (l25Var.a) {
                    r6 = 1;
                    vuf.Y(vufVar2, null, new wn5(new u2(i2, j25Var), 707014913, true), 3);
                } else {
                    r6 = 1;
                }
                List list2 = l25Var.b;
                vufVar2.Z(list2.size(), new sv4((int) r6, new t83(i7), list2), new bl(i5, list2, false), new wn5(new cl(i3, list2, j25Var), -1091073711, r6));
                break;
            case 6:
                vuf vufVar3 = (vuf) obj;
                vufVar3.getClass();
                c5b c5bVar = c5b.a;
                l26 l26Var = new l26(r16.a, n16.a, x06.a);
                c5bVar.getClass();
                vq2.f(vufVar3, (lvf) obj3, new b26(l26Var, apq.a, c5bVar), (xqc) obj2, 0);
                break;
            case 7:
                lx5 lx5Var = (lx5) obj3;
                vuf vufVar4 = (vuf) obj;
                vufVar4.getClass();
                ArrayList arrayList = ((gx5) lx5Var).a;
                vufVar4.Z(arrayList.size(), null, new vv(arrayList, i7), new wn5(new t50(arrayList, obj2, (Object) lx5Var, i3), -1091073711, true));
                break;
            case 8:
                Integer num = (Integer) obj;
                num.intValue();
                break;
            case 9:
                ut6 ut6Var = (ut6) obj3;
                jmj jmjVar = (jmj) obj2;
                n9b n9bVar = (n9b) obj;
                n9bVar.getClass();
                ubi ubiVar = n9bVar.a;
                if (!(ut6Var instanceof st6)) {
                    if (!(ut6Var instanceof rt6)) {
                        if (!(ut6Var instanceof tt6)) {
                            b6e.s();
                            break;
                        } else {
                            tt6 tt6Var = (tt6) ut6Var;
                            ox6.i(n9bVar, tt6Var.a);
                            ubiVar.a(new wn5(new yt6(tt6Var.b), -1456977594, true));
                        }
                    } else {
                        ox6.i(n9bVar, ((rt6) ut6Var).a);
                        ksw.y(n9bVar, jmjVar, d.x(d.c(vci.a, 1.0f), b2c.f, 2));
                    }
                } else {
                    ox6.i(n9bVar, ((st6) ut6Var).a);
                    lg3.D(n9bVar, 24);
                    ubiVar.a(vnj.b);
                    lg3.D(n9bVar, 32);
                }
                break;
            case 10:
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                ((rx7) obj3).b.H(xjoVar, (nx7) obj2);
                break;
            case 11:
                cds cdsVar = (cds) obj;
                cdsVar.getClass();
                ((Function2) obj3).invoke(((rn0) obj2).a, cdsVar);
                break;
            case 12:
                xjo xjoVar2 = (xjo) obj;
                xjoVar2.getClass();
                ((m68) obj3).b.G(xjoVar2, (ArrayList) obj2);
                break;
            case 13:
                List list3 = (List) obj3;
                vuf vufVar5 = (vuf) obj;
                vufVar5.getClass();
                vufVar5.Z(list3.size(), new sv4(15, new fp5(i4), list3), new bl(16, list3, false), new wn5(new cl(i6, list3, (w50) obj2), -1091073711, true));
                break;
            case 14:
                ns8 ns8Var = (ns8) obj3;
                os8 os8Var = (os8) obj2;
                dzf dzfVar = (dzf) obj;
                dzfVar.getClass();
                t requireActivity = ns8Var.requireActivity();
                requireActivity.getClass();
                break;
            case 15:
                o3a o3aVar = (o3a) obj3;
                jyr jyrVar2 = o3aVar.B;
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                m6a m6aVar = (m6a) obj;
                g06 g06Var = o3aVar.q;
                boolean z2 = m6aVar instanceof i6a;
                vhc vhcVar5 = vhc.d;
                if (z2) {
                    jyr b2 = btf.b(wg.o);
                    c5b c5bVar2 = c5b.a;
                    htb htbVar = ((thc) g06Var.c).a;
                    if (Boolean.FALSE.booleanValue() && (stackTraceElement5 = (StackTraceElement) hrg.k(0)) != null) {
                        String fileName = stackTraceElement5.getFileName();
                        if (fileName == null) {
                            fileName = "No file info";
                        }
                        String methodName = stackTraceElement5.getMethodName();
                        int lineNumber = stackTraceElement5.getLineNumber();
                        Integer valueOf2 = Integer.valueOf(lineNumber);
                        if (lineNumber <= 0) {
                            valueOf2 = null;
                        }
                        if (valueOf2 == null || (str5 = valueOf2.toString()) == null) {
                            str5 = "No line info";
                        }
                        vhcVar4 = new vhc(fileName, methodName, str5);
                    } else {
                        vhcVar4 = vhcVar5;
                    }
                    g06Var.N(yhc.DEBUG, "Applying idle document state", b2, c5bVar2, vhcVar4.a, vhcVar4.b, vhcVar4.c);
                    viewGroup2.removeAllViews();
                } else if (m6aVar instanceof j6a) {
                    j6a j6aVar = (j6a) m6aVar;
                    q2a q2aVar2 = j6aVar.d;
                    if (q2aVar2 == null) {
                        jyr a = fsg.a(new Pair("documentQuery", j6aVar.c.a));
                        c5b c5bVar3 = c5b.a;
                        htb htbVar2 = ((thc) g06Var.c).a;
                        if (Boolean.FALSE.booleanValue() && (stackTraceElement3 = (StackTraceElement) hrg.k(0)) != null) {
                            String fileName2 = stackTraceElement3.getFileName();
                            if (fileName2 == null) {
                                fileName2 = "No file info";
                            }
                            String methodName2 = stackTraceElement3.getMethodName();
                            int lineNumber2 = stackTraceElement3.getLineNumber();
                            Integer valueOf3 = Integer.valueOf(lineNumber2);
                            if (lineNumber2 <= 0) {
                                valueOf3 = null;
                            }
                            if (valueOf3 == null || (str3 = valueOf3.toString()) == null) {
                                str3 = "No line info";
                            }
                            vhcVar3 = new vhc(fileName2, methodName2, str3);
                        } else {
                            vhcVar3 = vhcVar5;
                        }
                        g06Var.N(yhc.DEBUG, "Applying loading document state", a, c5bVar3, vhcVar3.a, vhcVar3.b, vhcVar3.c);
                        b = false;
                        if (!b) {
                            String q = hrg.q("Failed to apply document state (", ern.a(m6aVar.getClass()).h(), ")");
                            jyr b3 = btf.b(wg.n);
                            c5b c5bVar4 = c5b.a;
                            htb htbVar3 = ((thc) g06Var.c).a;
                            if (Boolean.FALSE.booleanValue() && (stackTraceElement4 = (StackTraceElement) hrg.k(0)) != null) {
                                String fileName3 = stackTraceElement4.getFileName();
                                if (fileName3 == null) {
                                    fileName3 = "No file info";
                                }
                                String methodName3 = stackTraceElement4.getMethodName();
                                int lineNumber3 = stackTraceElement4.getLineNumber();
                                Integer valueOf4 = lineNumber3 > 0 ? Integer.valueOf(lineNumber3) : null;
                                if (valueOf4 == null || (str4 = valueOf4.toString()) == null) {
                                    str4 = "No line info";
                                }
                                vhcVar5 = new vhc(fileName3, methodName3, str4);
                            }
                            vhc vhcVar6 = vhcVar5;
                            g06Var.N(yhc.DEBUG, q, b3, c5bVar4, vhcVar6.a, vhcVar6.b, vhcVar6.c);
                        }
                        break;
                    } else {
                        o3aVar.o(o3aVar.l(q2aVar2));
                    }
                } else {
                    if (!(m6aVar instanceof k6a)) {
                        z = false;
                        if (!(m6aVar instanceof h6a)) {
                            if (!(m6aVar instanceof l6a)) {
                                b6e.s();
                                break;
                            } else {
                                b = o3aVar.b((l6a) m6aVar, viewGroup2);
                            }
                        } else {
                            h6a h6aVar = (h6a) m6aVar;
                            ldi ldiVar = o3aVar.j;
                            m4a m4aVar = h6aVar.b;
                            w3a w3aVar = h6aVar.d;
                            t5a t5aVar = h6aVar.c;
                            l2a l2aVar = (m4aVar == null || (q2aVar = m4aVar.a) == null) ? null : q2aVar.d;
                            if (m4aVar == null || !m4aVar.d) {
                                jyr a2 = fsg.a(new Pair("errorMessage", w3aVar.b), new Pair("errorType", w3aVar.a));
                                l2a l2aVar2 = l2aVar;
                                c5b c5bVar5 = c5b.a;
                                htb htbVar4 = ((thc) g06Var.c).a;
                                if (Boolean.FALSE.booleanValue() && (stackTraceElement = (StackTraceElement) hrg.k(0)) != null) {
                                    String fileName4 = stackTraceElement.getFileName();
                                    if (fileName4 == null) {
                                        fileName4 = "No file info";
                                    }
                                    jyrVar = jyrVar2;
                                    String methodName4 = stackTraceElement.getMethodName();
                                    int lineNumber4 = stackTraceElement.getLineNumber();
                                    Integer valueOf5 = Integer.valueOf(lineNumber4);
                                    if (lineNumber4 <= 0) {
                                        valueOf5 = null;
                                    }
                                    if (valueOf5 == null || (str = valueOf5.toString()) == null) {
                                        str = "No line info";
                                    }
                                    vhcVar = new vhc(fileName4, methodName4, str);
                                } else {
                                    jyrVar = jyrVar2;
                                    vhcVar = vhcVar5;
                                }
                                g06Var.N(yhc.DEBUG, "Applying failed document state", a2, c5bVar5, vhcVar.a, vhcVar.b, vhcVar.c);
                                if (m4aVar != null) {
                                    if ((l2aVar2 != null ? l2aVar2.c : null) != null) {
                                        xv.F(ldiVar, l2aVar2.c, new z2a(m4aVar.a.c));
                                        b = true;
                                    }
                                }
                                a aVar = (a) jyrVar.getValue();
                                if (aVar != null) {
                                    view = aVar.o(viewGroup2);
                                    o3aVar.I = view;
                                } else {
                                    view = null;
                                }
                                if (view == null) {
                                    viewGroup2.removeAllViews();
                                    b = z;
                                } else {
                                    if (viewGroup2.getChildCount() != 1 || !Intrinsics.d(viewGroup2.getChildAt(0), view)) {
                                        viewGroup2.removeAllViewsInLayout();
                                        ViewGroup viewGroup3 = (ViewGroup) view.getParent();
                                        if (viewGroup3 != null) {
                                            viewGroup3.removeView(view);
                                        }
                                        viewGroup2.addView(view);
                                    }
                                    a aVar2 = (a) jyrVar.getValue();
                                    if (aVar2 != null) {
                                        try {
                                            aVar2.G(w3aVar);
                                            Unit.a.getClass();
                                            b = true;
                                        } catch (Throwable th) {
                                            efo efoVar = o3aVar.c;
                                            String message = th.getMessage();
                                            if (message == null) {
                                                message = "Document failed state rendering failed";
                                            }
                                            efo.i(efoVar, "Engine.DocumentRenderingFailed", message, "DocumentEngine.applyFailedState", th, null, lxe.I(t5aVar), 161);
                                            String concat = "Failed to render ".concat(h6a.class.getSimpleName());
                                            jyr a3 = fsg.a(new Pair("errorMessage", th.getMessage()));
                                            c5b c5bVar6 = c5b.a;
                                            htb htbVar5 = ((thc) g06Var.c).a;
                                            if (Boolean.FALSE.booleanValue() && (stackTraceElement2 = (StackTraceElement) hrg.k(0)) != null) {
                                                String fileName5 = stackTraceElement2.getFileName();
                                                if (fileName5 == null) {
                                                    fileName5 = "No file info";
                                                }
                                                String methodName5 = stackTraceElement2.getMethodName();
                                                int lineNumber5 = stackTraceElement2.getLineNumber();
                                                Integer valueOf6 = Integer.valueOf(lineNumber5);
                                                if (lineNumber5 <= 0) {
                                                    valueOf6 = null;
                                                }
                                                if (valueOf6 == null || (str2 = valueOf6.toString()) == null) {
                                                    str2 = "No line info";
                                                }
                                                vhcVar2 = new vhc(fileName5, methodName5, str2);
                                            } else {
                                                vhcVar2 = vhcVar5;
                                            }
                                            g06Var.N(yhc.DEBUG, concat, a3, c5bVar6, vhcVar2.a, vhcVar2.b, vhcVar2.c);
                                        }
                                    }
                                    b = false;
                                }
                            } else {
                                l6a l6aVar = o3aVar.L;
                                if (o3aVar.P) {
                                    if (Intrinsics.d(l6aVar != null ? l6aVar.c : null, t5aVar)) {
                                        xv.F(ldiVar, l2aVar != null ? l2aVar.f : null, new z2a(m4aVar.a.c));
                                    }
                                } else if (l6aVar != null) {
                                    o3aVar.b(l6aVar, viewGroup2);
                                }
                            }
                        }
                    } else {
                        k6a k6aVar = (k6a) m6aVar;
                        q2a q2aVar3 = k6aVar.d;
                        if (q2aVar3 != null) {
                            o3aVar.o(o3aVar.l(q2aVar3));
                        } else {
                            View view3 = o3aVar.I;
                            if (view3 != null) {
                                viewGroup2.removeView(view3);
                            }
                            m4a m4aVar2 = k6aVar.b;
                            if (m4aVar2 == null) {
                                b = false;
                            } else {
                                q2a q2aVar4 = m4aVar2.a;
                                sro sroVar = q2aVar4.b;
                                kb6 kb6Var2 = q2aVar4.a;
                                tro m = o3aVar.m(sroVar, viewGroup2);
                                ub6 j = o3aVar.j(kb6Var2, viewGroup2, null, true);
                                if (m != null) {
                                    view2 = m.o(viewGroup2);
                                    viewGroup = m.G(view2);
                                } else {
                                    view2 = null;
                                    viewGroup = null;
                                }
                                if (view2 != null) {
                                    z = false;
                                    if (viewGroup2.indexOfChild(view2) == -1) {
                                        ViewGroup viewGroup4 = (ViewGroup) view2.getParent();
                                        if (viewGroup4 != null) {
                                            viewGroup4.removeView(view2);
                                        }
                                        viewGroup2.addView(view2);
                                    }
                                } else {
                                    z = false;
                                }
                                if (viewGroup != null) {
                                    viewGroup2 = viewGroup;
                                }
                                o3aVar.k(j, viewGroup2, true);
                                if (sroVar == null || m == null) {
                                    kb6Var = kb6Var2;
                                    ub6Var = j;
                                } else {
                                    kb6Var = kb6Var2;
                                    ub6Var = j;
                                    m.B(new jso(k6aVar.a, k6aVar.c, sroVar, q2aVar4.c, true));
                                }
                                ub6Var.B(new ee6(k6aVar.a, k6aVar.c, kb6Var, q2aVar4.c, true));
                                b = z;
                            }
                        }
                    }
                    if (!b) {
                    }
                }
                b = true;
                if (!b) {
                }
                break;
            case 16:
                m mVar = (m) obj3;
                Function1 function1 = (Function1) obj2;
                g4f g4fVar = (g4f) obj;
                g4fVar.d = true;
                g4fVar.c = true;
                g4fVar.b = false;
                g4fVar.e = true;
                mip mipVar = new mip();
                mipVar.l(ern.a(s7k.class), new s7k());
                mipVar.l(ern.a(q2a.class), (qg) mVar.b);
                mipVar.l(ern.a(t5a.class), (qg) mVar.c);
                mipVar.l(ern.a(kb6.class), (cd6) mVar.e);
                mipVar.l(ern.a(sro.class), (gso) mVar.f);
                mipVar.l(ern.a(f0q.class), (g0q) mVar.h);
                mipVar.l(ern.a(bsj.class), (qg) mVar.i);
                mipVar.l(ern.a(l2a.class), (qg) mVar.d);
                mipVar.l(ern.a(md.class), (og) mVar.g);
                mipVar.l(ern.a(p2a.class), (qg) mVar.j);
                Iterator it = ((ArrayList) mVar.k).iterator();
                while (it.hasNext()) {
                    ((nun) it.next()).getClass();
                    mipVar.l(ern.a(pg.class), new qg(0));
                }
                function1.invoke(mipVar);
                g4fVar.i = mipVar.c();
                break;
            case 17:
                cir cirVar = (cir) obj3;
                t5a t5aVar2 = (t5a) obj2;
                l4a l4aVar = (l4a) ((syn) obj).a;
                if (l4aVar instanceof k4a) {
                    cirVar.b(new f5a(t5aVar2, ((k4a) l4aVar).a));
                }
                break;
            case 18:
                laa laaVar = (laa) obj3;
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.k(jfpVar, (String) obj2);
                wfp.q(jfpVar, 0);
                laaVar.getClass();
                if (!(laaVar instanceof kaa) && !(laaVar instanceof iaa) && !Intrinsics.d(laaVar, haa.a)) {
                    if (!Intrinsics.d(laaVar, jaa.a)) {
                        b6e.s();
                        break;
                    } else {
                        wfp.c(jfpVar);
                    }
                }
                break;
            case 19:
                xjo xjoVar3 = (xjo) obj;
                xjoVar3.getClass();
                ((ada) obj3).b.H(xjoVar3, (ica) obj2);
                break;
            case 20:
                ArrayList arrayList2 = (ArrayList) obj3;
                vuf vufVar6 = (vuf) obj;
                vufVar6.getClass();
                vufVar6.Z(arrayList2.size(), new sv4(i8, new fp5(27), arrayList2), new vv(arrayList2, 12), new wn5(new cl(i5, arrayList2, (hda) obj2), -1091073711, true));
                break;
            case 21:
                ArrayList arrayList3 = (ArrayList) obj3;
                vuf vufVar7 = (vuf) obj;
                vufVar7.getClass();
                vufVar7.Z(arrayList3.size(), new sv4(29, new fp5(i8), arrayList3), new vv(arrayList3, 13), new wn5(new cl(i7, arrayList3, (yda) obj2), -1091073711, true));
                break;
            case 22:
                xjo xjoVar4 = (xjo) obj;
                xjoVar4.getClass();
                ((yga) obj3).b.H(xjoVar4, (dga) obj2);
                break;
            case 23:
                vuf vufVar8 = (vuf) obj;
                vufVar8.getClass();
                vuf.Y(vufVar8, null, new wn5(new ar(i8, (zwa) obj3, (sdr) obj2), -636094578, true), 3);
                break;
            case 24:
                o6g o6gVar = (o6g) obj3;
                aqi aqiVar = (aqi) obj2;
                opf opfVar = (opf) obj;
                opfVar.getClass();
                opfVar.a();
                if (((xov) aqiVar.getValue()).a > ((xov) aqiVar.getValue()).b) {
                    jpa.A0(opfVar, o6gVar, 0L, 0L, 0.0f, null, null, 6, 62);
                }
                break;
            case 25:
                sub subVar = (sub) obj3;
                aqi aqiVar2 = (aqi) obj2;
                int intValue = ((Integer) obj).intValue();
                if (intValue >= 0 && intValue < ((List) aqiVar2.getValue()).size()) {
                    ArrayList y0 = CollectionsKt.y0((List) aqiVar2.getValue());
                    y0.remove(intValue);
                    aqiVar2.setValue(y0);
                    subVar.a.b.a(new RemovePlayableByQueuePositionCommand(intValue), new b3t("queue_remove"));
                }
                break;
            case 26:
                Function1 function12 = (Function1) obj2;
                int intValue2 = ((Integer) obj).intValue();
                ln0 ln0Var = (ln0) CollectionsKt.firstOrNull(((mn0) obj3).b(intValue2, intValue2, "URL"));
                if (ln0Var != null) {
                    function12.invoke((String) ln0Var.a);
                }
                break;
            case 27:
                ((bsd) obj3).d.removeCallbacks((juc) obj2);
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((v2s) obj3).g(((Integer) obj).intValue());
                ((npq) obj2).a().U(0);
                break;
            default:
                String str6 = (String) obj;
                str6.getClass();
                ((w3e) obj3).b.m(null, (thj) obj2, str6);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ny2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
