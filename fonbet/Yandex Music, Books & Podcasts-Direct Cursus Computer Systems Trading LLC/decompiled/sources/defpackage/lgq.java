package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.connectsdk.service.airplay.PListParser;
import com.yandex.music.shared.playback.api.commands.SeekToFractionCommand;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.catalog.artist.screen.ArtistScreenActivity;
import ru.yandex.music.common.media.context.d;

/* loaded from: classes3.dex */
public final /* synthetic */ class lgq extends ezc implements Function1 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lgq(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02c1  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        vb5 vb5Var;
        iaf v;
        Integer valueOf;
        String str;
        Object value;
        fht fhtVar;
        int i = 20;
        boolean z = true;
        Continuation continuation = null;
        switch (this.a) {
            case 0:
                c01 c01Var = (c01) obj;
                c01Var.getClass();
                pgq pgqVar = (pgq) this.receiver;
                pgqVar.getClass();
                hgq hgqVar = pgqVar.c;
                hgqVar.getClass();
                t tVar = hgqVar.a;
                int i2 = ArtistScreenActivity.w0;
                tVar.startActivity(l48.o(tVar, c01Var, null, 28));
                break;
            case 1:
                c01 c01Var2 = (c01) obj;
                c01Var2.getClass();
                pgq pgqVar2 = (pgq) this.receiver;
                pgqVar2.getClass();
                hgq hgqVar2 = pgqVar2.c;
                hgqVar2.getClass();
                t tVar2 = hgqVar2.a;
                lwg E = g0g.E(c01Var2);
                y supportFragmentManager = tVar2.getSupportFragmentManager();
                szf.R(supportFragmentManager, vz1.f(supportFragmentManager, E), d.c());
                break;
            case 2:
                int intValue = ((Number) obj).intValue();
                v2s v2sVar = (v2s) ((qqq) this.receiver).b.N().getValue();
                if (v2sVar != null) {
                    v2sVar.g(intValue);
                }
                break;
            case 3:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                eqp eqpVar = (eqp) this.receiver;
                eqpVar.c.b().a(xjb.Crossfade, booleanValue);
                d0q d0qVar = (d0q) eqpVar.l.getValue();
                x97.y(d0qVar.c, null, null, new cg1(d0qVar, booleanValue, continuation, 18), 3);
                break;
            case 4:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                eqp eqpVar2 = (eqp) this.receiver;
                eqpVar2.c.b().a(xjb.Autoplay, booleanValue2);
                syp sypVar = (syp) eqpVar2.m.getValue();
                x97.y(sypVar.c, null, null, new z11(sypVar, booleanValue2, continuation, 17), 3);
                break;
            case 5:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                eqp eqpVar3 = (eqp) this.receiver;
                eqpVar3.c.b().a(xjb.ShowVideo, booleanValue3);
                t8q t8qVar = (t8q) eqpVar3.k.getValue();
                x97.y(t8qVar.b, null, null, new z11(t8qVar, booleanValue3, continuation, 19), 3);
                break;
            case 6:
                boolean booleanValue4 = ((Boolean) obj).booleanValue();
                eqp eqpVar4 = (eqp) this.receiver;
                eqpVar4.c.b().a(xjb.Shake, booleanValue4);
                m8q m8qVar = (m8q) eqpVar4.n.getValue();
                x97.y(m8qVar.c, null, null, new cg1(m8qVar, booleanValue4, continuation, i), 3);
                break;
            case 7:
                Context context = (Context) obj;
                context.getClass();
                break;
            case 8:
                Context context2 = (Context) obj;
                context2.getClass();
                break;
            case 9:
                Context context3 = (Context) obj;
                context3.getClass();
                ((uyr) this.receiver).getClass();
                Object systemService = context3.getSystemService("display");
                if (systemService != null) {
                    Display display = ((DisplayManager) systemService).getDisplay(0);
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    display.getClass();
                    display.getMetrics(displayMetrics);
                    break;
                } else {
                    jj4.j("null cannot be cast to non-null type android.hardware.display.DisplayManager");
                    break;
                }
            case 10:
                ((o2s) this.receiver).a.g(((Number) obj).intValue());
                break;
            case 11:
                ((o2s) this.receiver).a.g(((Number) obj).intValue());
                break;
            case 12:
                KeyEvent keyEvent = ((qaf) obj).a;
                dbs dbsVar = (dbs) this.receiver;
                pds pdsVar = dbsVar.f;
                boolean z2 = dbsVar.d;
                if (keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar())) {
                    ae7 ae7Var = dbsVar.i;
                    ae7Var.getClass();
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                        ae7Var.a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                        valueOf = null;
                    } else {
                        Integer num = ae7Var.a;
                        if (num != null) {
                            ae7Var.a = null;
                            int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar);
                            valueOf = Integer.valueOf(deadChar);
                            if (deadChar == 0) {
                                valueOf = null;
                            }
                            if (valueOf == null) {
                                valueOf = Integer.valueOf(unicodeChar);
                            }
                        } else {
                            valueOf = Integer.valueOf(unicodeChar);
                        }
                    }
                    if (valueOf != null) {
                        vb5Var = new vb5(new StringBuilder().appendCodePoint(valueOf.intValue()).toString(), 1);
                        if (vb5Var == null) {
                            if (z2) {
                                dbsVar.a(t75.c(vb5Var));
                                pdsVar.a = null;
                            }
                            z = false;
                        } else {
                            if (saf.U(keyEvent) == 2 && (v = dbsVar.j.v(keyEvent)) != null && (!v.a || z2)) {
                                tqn tqnVar = new tqn();
                                tqnVar.a = true;
                                lma lmaVar = new lma(25, v, dbsVar, tqnVar);
                                ybs ybsVar = dbsVar.c;
                                gbs gbsVar = new gbs(ybsVar, dbsVar.g, dbsVar.a.d(), pdsVar);
                                lmaVar.invoke(gbsVar);
                                boolean a = rds.a(gbsVar.f, ybsVar.b);
                                mn0 mn0Var = gbsVar.g;
                                if (!a || !Intrinsics.d(mn0Var, ybsVar.a)) {
                                    dbsVar.k.invoke(ybs.a(ybsVar, mn0Var, gbsVar.f, 4));
                                }
                                mit mitVar = dbsVar.h;
                                if (mitVar != null) {
                                    mitVar.e = true;
                                }
                                z = tqnVar.a;
                            }
                            z = false;
                        }
                        break;
                    }
                }
                vb5Var = null;
                if (vb5Var == null) {
                }
                break;
            case 13:
                ((cjs) this.receiver).b(((Number) obj).longValue());
                break;
            case 14:
                ((cjs) this.receiver).b(((Number) obj).longValue());
                break;
            case 15:
                long longValue = ((Number) obj).longValue();
                cjs cjsVar = (cjs) this.receiver;
                cjsVar.b(longValue);
                gc8 gc8Var = cjsVar.e;
                if (gc8Var != null) {
                    qg8.c(cjsVar.b, gc8Var, gc8Var.getExpressionResolver(), cjsVar.g, "timer");
                }
                break;
            case 16:
                long longValue2 = ((Number) obj).longValue();
                cjs cjsVar2 = (cjs) this.receiver;
                cjsVar2.b(longValue2);
                gc8 gc8Var2 = cjsVar2.e;
                if (gc8Var2 != null) {
                    qg8.c(cjsVar2.b, gc8Var2, gc8Var2.getExpressionResolver(), cjsVar2.h, "timer");
                }
                break;
            case 17:
                u51 u51Var = (u51) obj;
                u51Var.getClass();
                nrs nrsVar = (nrs) this.receiver;
                nrsVar.getClass();
                nrsVar.c.b(wjb.ArtistScreen);
                jrs jrsVar = nrsVar.d;
                jrsVar.dismiss();
                int i3 = ArtistScreenActivity.w0;
                Context context4 = jrsVar.b;
                context4.startActivity(l48.p(context4, u51Var, jrsVar.c, null, 24));
                break;
            case 18:
                vxt vxtVar = (vxt) this.receiver;
                mxt mxtVar = vxtVar.b;
                List<Pair> list = (List) obj;
                ArrayList arrayList = new ArrayList(v75.o(list, 10));
                for (Pair pair : list) {
                    String str2 = (String) pair.a;
                    kxt kxtVar = (kxt) pair.b;
                    String c = kxtVar.c();
                    if (kxtVar instanceof zwt) {
                        str = PListParser.TAG_ARRAY;
                    } else if (kxtVar instanceof axt) {
                        str = "boolean";
                    } else if (kxtVar instanceof bxt) {
                        str = "color";
                    } else if (kxtVar instanceof cxt) {
                        str = PListParser.TAG_DICT;
                    } else if (kxtVar instanceof dxt) {
                        str = "number";
                    } else if (kxtVar instanceof ext) {
                        str = PListParser.TAG_INTEGER;
                    } else if (kxtVar instanceof hxt) {
                        str = PListParser.TAG_STRING;
                    } else if (kxtVar instanceof ixt) {
                        str = "url";
                    } else if (!(kxtVar instanceof gxt)) {
                        b6e.s();
                        break;
                    } else {
                        str = "property";
                    }
                    arrayList.add(new txt(c, str2, str, kxtVar.d().toString()));
                }
                mxtVar.d.b(arrayList, new bhp(i, vxtVar));
                break;
            case 19:
                ((y8u) this.receiver).q(((Number) obj).floatValue());
                break;
            case 20:
                ((y8u) this.receiver).q(((Number) obj).floatValue());
                break;
            case 21:
                glu gluVar = (glu) obj;
                gluVar.getClass();
                nlu nluVar = (nlu) this.receiver;
                nluVar.getClass();
                slu sluVar = nluVar.a;
                sluVar.f.q(gluVar.a.a);
                xdr xdrVar = sluVar.h;
                do {
                    value = xdrVar.getValue();
                    fhtVar = (fht) value;
                    if (fhtVar instanceof sgt) {
                        sgt sgtVar = (sgt) fhtVar;
                        fhtVar = new sgt(sgtVar.a, sgtVar.b, gluVar);
                    }
                } while (!xdrVar.k(value, fhtVar));
            case 22:
                String str3 = (String) obj;
                str3.getClass();
                ((lpu) this.receiver).a(str3);
                break;
            case 23:
                String str4 = (String) obj;
                str4.getClass();
                ((lpu) this.receiver).a(str4);
                break;
            case 24:
                String str5 = (String) obj;
                str5.getClass();
                ((lpu) this.receiver).a(str5);
                break;
            case 25:
                ((s2v) this.receiver).a.k.b.c.a(new SeekToFractionCommand(((Number) obj).floatValue()), new b3t("core_seek"));
                break;
            case 26:
                s9p s9pVar = (s9p) obj;
                s9pVar.getClass();
                break;
            case 27:
                ((s2v) this.receiver).b(((Boolean) obj).booleanValue());
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((s2v) this.receiver).a.k.b.c.a(new SeekToFractionCommand(((Number) obj).floatValue()), new b3t("core_seek"));
                break;
            default:
                oav oavVar = (oav) obj;
                oavVar.getClass();
                ((jav) this.receiver).c(oavVar);
                break;
        }
        return Unit.a;
    }
}
