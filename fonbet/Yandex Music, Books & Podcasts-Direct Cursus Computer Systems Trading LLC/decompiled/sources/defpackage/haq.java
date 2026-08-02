package defpackage;

import android.content.Context;
import com.yandex.music.shared.ynison.api.queue.YnisonOptionCommand$RepeatToggle;
import com.yandex.music.shared.ynison.api.queue.YnisonOptionCommand$ShuffleToggle;
import com.yandex.pulse.metrics.o;
import java.io.File;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class haq implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ haq(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                YnisonOptionCommand$RepeatToggle ynisonOptionCommand$RepeatToggle = (YnisonOptionCommand$RepeatToggle) obj;
                ynisonOptionCommand$RepeatToggle.getClass();
                return "Repeat(mode=" + ynisonOptionCommand$RepeatToggle.getMode() + ")";
            case 1:
                YnisonOptionCommand$ShuffleToggle ynisonOptionCommand$ShuffleToggle = (YnisonOptionCommand$ShuffleToggle) obj;
                ynisonOptionCommand$ShuffleToggle.getClass();
                return vz1.q("Shuffle(enabled=", ")", ynisonOptionCommand$ShuffleToggle.getEnabled());
            case 2:
                ((jfp) obj).getClass();
                return Unit.a;
            case 3:
                u51 u51Var = (u51) obj;
                u51Var.getClass();
                return u51Var.b;
            case 4:
                ((jfp) obj).getClass();
                return Unit.a;
            case 5:
                yxc yxcVar = (yxc) obj;
                yxcVar.getClass();
                return new Pair(yxcVar.a.a, Boolean.valueOf(yxcVar.h));
            case 6:
                ((jfp) obj).getClass();
                return Unit.a;
            case 7:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new qlu((upq) l13Var.a.D(hag.I(upq.class), l13Var, l13Var.b));
            case 8:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                return new mck((upq) l13Var2.a.D(hag.I(upq.class), l13Var2, l13Var2.b));
            case 9:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                return new ch6((upq) l13Var3.a.D(hag.I(upq.class), l13Var3, l13Var3.b));
            case 10:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                return new i2b((upq) l13Var4.a.D(hag.I(upq.class), l13Var4, l13Var4.b));
            case 11:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                return new gnu((e0j) l13Var5.a.D(hag.I(e0j.class), l13Var5, l13Var5.b));
            case 12:
                l13 l13Var6 = (l13) obj;
                l13Var6.getClass();
                return new y1b((upq) l13Var6.a.D(hag.I(upq.class), l13Var6, l13Var6.b));
            case 13:
                l13 l13Var7 = (l13) obj;
                l13Var7.getClass();
                return new j14((upq) l13Var7.a.D(hag.I(upq.class), l13Var7, l13Var7.b));
            case 14:
                ((l13) obj).getClass();
                return new s14();
            case 15:
                l13 l13Var8 = (l13) obj;
                l13Var8.getClass();
                return new p4j((upq) l13Var8.a.D(hag.I(upq.class), l13Var8, l13Var8.b));
            case 16:
                ((l13) obj).getClass();
                return new d5j();
            case 17:
                l13 l13Var9 = (l13) obj;
                l13Var9.getClass();
                return new q2s((upq) l13Var9.a.D(hag.I(upq.class), l13Var9, l13Var9.b));
            case 18:
                l13 l13Var10 = (l13) obj;
                l13Var10.getClass();
                return new ohe((upq) l13Var10.a.D(hag.I(upq.class), l13Var10, l13Var10.b));
            case 19:
                l13 l13Var11 = (l13) obj;
                l13Var11.getClass();
                return new tsj((upq) l13Var11.a.D(hag.I(upq.class), l13Var11, l13Var11.b));
            case 20:
                l13 l13Var12 = (l13) obj;
                l13Var12.getClass();
                return new gg4((upq) l13Var12.a.D(hag.I(upq.class), l13Var12, l13Var12.b));
            case 21:
                ((l13) obj).getClass();
                return oo6.a;
            case 22:
                l13 l13Var13 = (l13) obj;
                l13Var13.getClass();
                return new l2g((upq) l13Var13.a.D(hag.I(upq.class), l13Var13, l13Var13.b));
            case 23:
                l13 l13Var14 = (l13) obj;
                l13Var14.getClass();
                return new b36((upq) l13Var14.a.D(hag.I(upq.class), l13Var14, l13Var14.b));
            case 24:
                l13 l13Var15 = (l13) obj;
                l13Var15.getClass();
                return new c8a((upq) l13Var15.a.D(hag.I(upq.class), l13Var15, l13Var15.b));
            case 25:
                l13 l13Var16 = (l13) obj;
                l13Var16.getClass();
                return new hjq((upq) l13Var16.a.D(hag.I(upq.class), l13Var16, l13Var16.b));
            case 26:
                l13 l13Var17 = (l13) obj;
                l13Var17.getClass();
                return new oze((upq) l13Var17.a.D(hag.I(upq.class), l13Var17, l13Var17.b));
            case 27:
                l13 l13Var18 = (l13) obj;
                l13Var18.getClass();
                return new tp4((upq) l13Var18.a.D(hag.I(upq.class), l13Var18, l13Var18.b));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                l13 l13Var19 = (l13) obj;
                l13Var19.getClass();
                return new mav((upq) l13Var19.a.D(hag.I(upq.class), l13Var19, l13Var19.b));
            default:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(upq.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                final int i = 10;
                rp7Var.E(new Function1() { // from class: wnq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        l13 l13Var20 = (l13) obj2;
                        switch (i) {
                            case 0:
                                l13Var20.getClass();
                                return new hsj((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                            case 1:
                                l13Var20.getClass();
                                return new aaj();
                            case 2:
                                l13Var20.getClass();
                                bdt I = hag.I(frt.class);
                                qdc qdcVar = l13Var20.a;
                                Set set = l13Var20.b;
                                return new cmf((frt) qdcVar.D(I, l13Var20, set), (wst) qdcVar.D(hag.I(wst.class), l13Var20, set));
                            case 3:
                                l13Var20.getClass();
                                return new hta();
                            case 4:
                                l13Var20.getClass();
                                return new jck();
                            case 5:
                                l13Var20.getClass();
                                return new doq();
                            case 6:
                                l13Var20.getClass();
                                l18 l18Var = l18.b;
                                bdt I2 = hag.I(Context.class);
                                qdc qdcVar2 = l18Var.a;
                                qdcVar2.getClass();
                                return new m4d((Context) qdcVar2.C(I2));
                            case 7:
                                l13Var20.getClass();
                                return new eoq();
                            case 8:
                                l13Var20.getClass();
                                return new foq(l13Var20);
                            case 9:
                                l13Var20.getClass();
                                return new vg6();
                            case 10:
                                l13Var20.getClass();
                                bdt I3 = hag.I(Context.class);
                                qdc qdcVar3 = l13Var20.a;
                                Set set2 = l13Var20.b;
                                File cacheDir = ((Context) qdcVar3.D(I3, l13Var20, set2)).getCacheDir();
                                cacheDir.getClass();
                                kpm kpmVar = new kpm(cacheDir);
                                jyr jyrVar = tpq.e;
                                jyr jyrVar2 = dvu.e;
                                boolean d = kwl.d();
                                spq w = t7g.w();
                                return new upq(kpmVar, w != null ? spq.a(w, d, null, 123) : null, (i0j) qdcVar3.D(hag.I(i0j.class), l13Var20, set2), (uyt) qdcVar3.D(hag.I(uyt.class), l13Var20, set2), (z66) qdcVar3.D(hag.I(z66.class), l13Var20, set2), (t70) qdcVar3.D(hag.I(t70.class), l13Var20, set2));
                            case 11:
                                l13Var20.getClass();
                                return new goq(l13Var20);
                            case 12:
                                l13Var20.getClass();
                                return new hoq(l13Var20);
                            case 13:
                                l13Var20.getClass();
                                return new ioq(l13Var20);
                            case 14:
                                l13Var20.getClass();
                                return new jqq();
                            case 15:
                                l13Var20.getClass();
                                return new r1b();
                            case 16:
                                l13Var20.getClass();
                                return new xdf();
                            case 17:
                                l13Var20.getClass();
                                return new uff();
                            case 18:
                                l13Var20.getClass();
                                return new tff();
                            case 19:
                                l13Var20.getClass();
                                return new joq();
                            case 20:
                                l13Var20.getClass();
                                return new koq();
                            case 21:
                                l13Var20.getClass();
                                return new ynq();
                            case 22:
                                l13Var20.getClass();
                                bdt I4 = hag.I(Context.class);
                                qdc qdcVar4 = l13Var20.a;
                                Set set3 = l13Var20.b;
                                return new jfr((Context) qdcVar4.D(I4, l13Var20, set3), (cpr) qdcVar4.D(hag.I(cpr.class), l13Var20, set3));
                            case 23:
                                l13Var20.getClass();
                                return new aw8((oy2) l13Var20.a.D(hag.I(oy2.class), l13Var20, l13Var20.b));
                            case 24:
                                l13Var20.getClass();
                                return new loq(l13Var20);
                            case 25:
                                l13Var20.getClass();
                                return new moq((qy2) l13Var20.a.D(hag.I(qy2.class), l13Var20, l13Var20.b), l13Var20);
                            case 26:
                                l13Var20.getClass();
                                return new b14();
                            case 27:
                                l13Var20.getClass();
                                return new ud(l13Var20.b(hag.I(oi5.class), true), l13Var20.b(hag.I(pi5.class), true));
                            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                                l13Var20.getClass();
                                return new yzp();
                            default:
                                l13Var20.getClass();
                                return new bg4((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                        }
                    }
                });
                new k0l(l18.b.b(hag.I(f0p.class), false), 23).invoke(o18Var);
                o18Var.c = hag.I(cmf.class);
                rp7Var.getClass();
                final int i2 = 2;
                rp7Var.E(new Function1() { // from class: wnq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        l13 l13Var20 = (l13) obj2;
                        switch (i2) {
                            case 0:
                                l13Var20.getClass();
                                return new hsj((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                            case 1:
                                l13Var20.getClass();
                                return new aaj();
                            case 2:
                                l13Var20.getClass();
                                bdt I = hag.I(frt.class);
                                qdc qdcVar = l13Var20.a;
                                Set set = l13Var20.b;
                                return new cmf((frt) qdcVar.D(I, l13Var20, set), (wst) qdcVar.D(hag.I(wst.class), l13Var20, set));
                            case 3:
                                l13Var20.getClass();
                                return new hta();
                            case 4:
                                l13Var20.getClass();
                                return new jck();
                            case 5:
                                l13Var20.getClass();
                                return new doq();
                            case 6:
                                l13Var20.getClass();
                                l18 l18Var = l18.b;
                                bdt I2 = hag.I(Context.class);
                                qdc qdcVar2 = l18Var.a;
                                qdcVar2.getClass();
                                return new m4d((Context) qdcVar2.C(I2));
                            case 7:
                                l13Var20.getClass();
                                return new eoq();
                            case 8:
                                l13Var20.getClass();
                                return new foq(l13Var20);
                            case 9:
                                l13Var20.getClass();
                                return new vg6();
                            case 10:
                                l13Var20.getClass();
                                bdt I3 = hag.I(Context.class);
                                qdc qdcVar3 = l13Var20.a;
                                Set set2 = l13Var20.b;
                                File cacheDir = ((Context) qdcVar3.D(I3, l13Var20, set2)).getCacheDir();
                                cacheDir.getClass();
                                kpm kpmVar = new kpm(cacheDir);
                                jyr jyrVar = tpq.e;
                                jyr jyrVar2 = dvu.e;
                                boolean d = kwl.d();
                                spq w = t7g.w();
                                return new upq(kpmVar, w != null ? spq.a(w, d, null, 123) : null, (i0j) qdcVar3.D(hag.I(i0j.class), l13Var20, set2), (uyt) qdcVar3.D(hag.I(uyt.class), l13Var20, set2), (z66) qdcVar3.D(hag.I(z66.class), l13Var20, set2), (t70) qdcVar3.D(hag.I(t70.class), l13Var20, set2));
                            case 11:
                                l13Var20.getClass();
                                return new goq(l13Var20);
                            case 12:
                                l13Var20.getClass();
                                return new hoq(l13Var20);
                            case 13:
                                l13Var20.getClass();
                                return new ioq(l13Var20);
                            case 14:
                                l13Var20.getClass();
                                return new jqq();
                            case 15:
                                l13Var20.getClass();
                                return new r1b();
                            case 16:
                                l13Var20.getClass();
                                return new xdf();
                            case 17:
                                l13Var20.getClass();
                                return new uff();
                            case 18:
                                l13Var20.getClass();
                                return new tff();
                            case 19:
                                l13Var20.getClass();
                                return new joq();
                            case 20:
                                l13Var20.getClass();
                                return new koq();
                            case 21:
                                l13Var20.getClass();
                                return new ynq();
                            case 22:
                                l13Var20.getClass();
                                bdt I4 = hag.I(Context.class);
                                qdc qdcVar4 = l13Var20.a;
                                Set set3 = l13Var20.b;
                                return new jfr((Context) qdcVar4.D(I4, l13Var20, set3), (cpr) qdcVar4.D(hag.I(cpr.class), l13Var20, set3));
                            case 23:
                                l13Var20.getClass();
                                return new aw8((oy2) l13Var20.a.D(hag.I(oy2.class), l13Var20, l13Var20.b));
                            case 24:
                                l13Var20.getClass();
                                return new loq(l13Var20);
                            case 25:
                                l13Var20.getClass();
                                return new moq((qy2) l13Var20.a.D(hag.I(qy2.class), l13Var20, l13Var20.b), l13Var20);
                            case 26:
                                l13Var20.getClass();
                                return new b14();
                            case 27:
                                l13Var20.getClass();
                                return new ud(l13Var20.b(hag.I(oi5.class), true), l13Var20.b(hag.I(pi5.class), true));
                            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                                l13Var20.getClass();
                                return new yzp();
                            default:
                                l13Var20.getClass();
                                return new bg4((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                        }
                    }
                });
                o18Var.c = hag.I(jqq.class);
                rp7Var.getClass();
                final int i3 = 14;
                rp7Var.E(new Function1() { // from class: wnq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        l13 l13Var20 = (l13) obj2;
                        switch (i3) {
                            case 0:
                                l13Var20.getClass();
                                return new hsj((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                            case 1:
                                l13Var20.getClass();
                                return new aaj();
                            case 2:
                                l13Var20.getClass();
                                bdt I = hag.I(frt.class);
                                qdc qdcVar = l13Var20.a;
                                Set set = l13Var20.b;
                                return new cmf((frt) qdcVar.D(I, l13Var20, set), (wst) qdcVar.D(hag.I(wst.class), l13Var20, set));
                            case 3:
                                l13Var20.getClass();
                                return new hta();
                            case 4:
                                l13Var20.getClass();
                                return new jck();
                            case 5:
                                l13Var20.getClass();
                                return new doq();
                            case 6:
                                l13Var20.getClass();
                                l18 l18Var = l18.b;
                                bdt I2 = hag.I(Context.class);
                                qdc qdcVar2 = l18Var.a;
                                qdcVar2.getClass();
                                return new m4d((Context) qdcVar2.C(I2));
                            case 7:
                                l13Var20.getClass();
                                return new eoq();
                            case 8:
                                l13Var20.getClass();
                                return new foq(l13Var20);
                            case 9:
                                l13Var20.getClass();
                                return new vg6();
                            case 10:
                                l13Var20.getClass();
                                bdt I3 = hag.I(Context.class);
                                qdc qdcVar3 = l13Var20.a;
                                Set set2 = l13Var20.b;
                                File cacheDir = ((Context) qdcVar3.D(I3, l13Var20, set2)).getCacheDir();
                                cacheDir.getClass();
                                kpm kpmVar = new kpm(cacheDir);
                                jyr jyrVar = tpq.e;
                                jyr jyrVar2 = dvu.e;
                                boolean d = kwl.d();
                                spq w = t7g.w();
                                return new upq(kpmVar, w != null ? spq.a(w, d, null, 123) : null, (i0j) qdcVar3.D(hag.I(i0j.class), l13Var20, set2), (uyt) qdcVar3.D(hag.I(uyt.class), l13Var20, set2), (z66) qdcVar3.D(hag.I(z66.class), l13Var20, set2), (t70) qdcVar3.D(hag.I(t70.class), l13Var20, set2));
                            case 11:
                                l13Var20.getClass();
                                return new goq(l13Var20);
                            case 12:
                                l13Var20.getClass();
                                return new hoq(l13Var20);
                            case 13:
                                l13Var20.getClass();
                                return new ioq(l13Var20);
                            case 14:
                                l13Var20.getClass();
                                return new jqq();
                            case 15:
                                l13Var20.getClass();
                                return new r1b();
                            case 16:
                                l13Var20.getClass();
                                return new xdf();
                            case 17:
                                l13Var20.getClass();
                                return new uff();
                            case 18:
                                l13Var20.getClass();
                                return new tff();
                            case 19:
                                l13Var20.getClass();
                                return new joq();
                            case 20:
                                l13Var20.getClass();
                                return new koq();
                            case 21:
                                l13Var20.getClass();
                                return new ynq();
                            case 22:
                                l13Var20.getClass();
                                bdt I4 = hag.I(Context.class);
                                qdc qdcVar4 = l13Var20.a;
                                Set set3 = l13Var20.b;
                                return new jfr((Context) qdcVar4.D(I4, l13Var20, set3), (cpr) qdcVar4.D(hag.I(cpr.class), l13Var20, set3));
                            case 23:
                                l13Var20.getClass();
                                return new aw8((oy2) l13Var20.a.D(hag.I(oy2.class), l13Var20, l13Var20.b));
                            case 24:
                                l13Var20.getClass();
                                return new loq(l13Var20);
                            case 25:
                                l13Var20.getClass();
                                return new moq((qy2) l13Var20.a.D(hag.I(qy2.class), l13Var20, l13Var20.b), l13Var20);
                            case 26:
                                l13Var20.getClass();
                                return new b14();
                            case 27:
                                l13Var20.getClass();
                                return new ud(l13Var20.b(hag.I(oi5.class), true), l13Var20.b(hag.I(pi5.class), true));
                            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                                l13Var20.getClass();
                                return new yzp();
                            default:
                                l13Var20.getClass();
                                return new bg4((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                        }
                    }
                });
                o18Var.c = hag.I(a14.class);
                rp7Var.getClass();
                final int i4 = 26;
                rp7Var.D(new Function1() { // from class: wnq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        l13 l13Var20 = (l13) obj2;
                        switch (i4) {
                            case 0:
                                l13Var20.getClass();
                                return new hsj((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                            case 1:
                                l13Var20.getClass();
                                return new aaj();
                            case 2:
                                l13Var20.getClass();
                                bdt I = hag.I(frt.class);
                                qdc qdcVar = l13Var20.a;
                                Set set = l13Var20.b;
                                return new cmf((frt) qdcVar.D(I, l13Var20, set), (wst) qdcVar.D(hag.I(wst.class), l13Var20, set));
                            case 3:
                                l13Var20.getClass();
                                return new hta();
                            case 4:
                                l13Var20.getClass();
                                return new jck();
                            case 5:
                                l13Var20.getClass();
                                return new doq();
                            case 6:
                                l13Var20.getClass();
                                l18 l18Var = l18.b;
                                bdt I2 = hag.I(Context.class);
                                qdc qdcVar2 = l18Var.a;
                                qdcVar2.getClass();
                                return new m4d((Context) qdcVar2.C(I2));
                            case 7:
                                l13Var20.getClass();
                                return new eoq();
                            case 8:
                                l13Var20.getClass();
                                return new foq(l13Var20);
                            case 9:
                                l13Var20.getClass();
                                return new vg6();
                            case 10:
                                l13Var20.getClass();
                                bdt I3 = hag.I(Context.class);
                                qdc qdcVar3 = l13Var20.a;
                                Set set2 = l13Var20.b;
                                File cacheDir = ((Context) qdcVar3.D(I3, l13Var20, set2)).getCacheDir();
                                cacheDir.getClass();
                                kpm kpmVar = new kpm(cacheDir);
                                jyr jyrVar = tpq.e;
                                jyr jyrVar2 = dvu.e;
                                boolean d = kwl.d();
                                spq w = t7g.w();
                                return new upq(kpmVar, w != null ? spq.a(w, d, null, 123) : null, (i0j) qdcVar3.D(hag.I(i0j.class), l13Var20, set2), (uyt) qdcVar3.D(hag.I(uyt.class), l13Var20, set2), (z66) qdcVar3.D(hag.I(z66.class), l13Var20, set2), (t70) qdcVar3.D(hag.I(t70.class), l13Var20, set2));
                            case 11:
                                l13Var20.getClass();
                                return new goq(l13Var20);
                            case 12:
                                l13Var20.getClass();
                                return new hoq(l13Var20);
                            case 13:
                                l13Var20.getClass();
                                return new ioq(l13Var20);
                            case 14:
                                l13Var20.getClass();
                                return new jqq();
                            case 15:
                                l13Var20.getClass();
                                return new r1b();
                            case 16:
                                l13Var20.getClass();
                                return new xdf();
                            case 17:
                                l13Var20.getClass();
                                return new uff();
                            case 18:
                                l13Var20.getClass();
                                return new tff();
                            case 19:
                                l13Var20.getClass();
                                return new joq();
                            case 20:
                                l13Var20.getClass();
                                return new koq();
                            case 21:
                                l13Var20.getClass();
                                return new ynq();
                            case 22:
                                l13Var20.getClass();
                                bdt I4 = hag.I(Context.class);
                                qdc qdcVar4 = l13Var20.a;
                                Set set3 = l13Var20.b;
                                return new jfr((Context) qdcVar4.D(I4, l13Var20, set3), (cpr) qdcVar4.D(hag.I(cpr.class), l13Var20, set3));
                            case 23:
                                l13Var20.getClass();
                                return new aw8((oy2) l13Var20.a.D(hag.I(oy2.class), l13Var20, l13Var20.b));
                            case 24:
                                l13Var20.getClass();
                                return new loq(l13Var20);
                            case 25:
                                l13Var20.getClass();
                                return new moq((qy2) l13Var20.a.D(hag.I(qy2.class), l13Var20, l13Var20.b), l13Var20);
                            case 26:
                                l13Var20.getClass();
                                return new b14();
                            case 27:
                                l13Var20.getClass();
                                return new ud(l13Var20.b(hag.I(oi5.class), true), l13Var20.b(hag.I(pi5.class), true));
                            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                                l13Var20.getClass();
                                return new yzp();
                            default:
                                l13Var20.getClass();
                                return new bg4((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                        }
                    }
                });
                o18Var.c = hag.I(yzp.class);
                rp7Var.getClass();
                final int i5 = 28;
                rp7Var.D(new Function1() { // from class: wnq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        l13 l13Var20 = (l13) obj2;
                        switch (i5) {
                            case 0:
                                l13Var20.getClass();
                                return new hsj((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                            case 1:
                                l13Var20.getClass();
                                return new aaj();
                            case 2:
                                l13Var20.getClass();
                                bdt I = hag.I(frt.class);
                                qdc qdcVar = l13Var20.a;
                                Set set = l13Var20.b;
                                return new cmf((frt) qdcVar.D(I, l13Var20, set), (wst) qdcVar.D(hag.I(wst.class), l13Var20, set));
                            case 3:
                                l13Var20.getClass();
                                return new hta();
                            case 4:
                                l13Var20.getClass();
                                return new jck();
                            case 5:
                                l13Var20.getClass();
                                return new doq();
                            case 6:
                                l13Var20.getClass();
                                l18 l18Var = l18.b;
                                bdt I2 = hag.I(Context.class);
                                qdc qdcVar2 = l18Var.a;
                                qdcVar2.getClass();
                                return new m4d((Context) qdcVar2.C(I2));
                            case 7:
                                l13Var20.getClass();
                                return new eoq();
                            case 8:
                                l13Var20.getClass();
                                return new foq(l13Var20);
                            case 9:
                                l13Var20.getClass();
                                return new vg6();
                            case 10:
                                l13Var20.getClass();
                                bdt I3 = hag.I(Context.class);
                                qdc qdcVar3 = l13Var20.a;
                                Set set2 = l13Var20.b;
                                File cacheDir = ((Context) qdcVar3.D(I3, l13Var20, set2)).getCacheDir();
                                cacheDir.getClass();
                                kpm kpmVar = new kpm(cacheDir);
                                jyr jyrVar = tpq.e;
                                jyr jyrVar2 = dvu.e;
                                boolean d = kwl.d();
                                spq w = t7g.w();
                                return new upq(kpmVar, w != null ? spq.a(w, d, null, 123) : null, (i0j) qdcVar3.D(hag.I(i0j.class), l13Var20, set2), (uyt) qdcVar3.D(hag.I(uyt.class), l13Var20, set2), (z66) qdcVar3.D(hag.I(z66.class), l13Var20, set2), (t70) qdcVar3.D(hag.I(t70.class), l13Var20, set2));
                            case 11:
                                l13Var20.getClass();
                                return new goq(l13Var20);
                            case 12:
                                l13Var20.getClass();
                                return new hoq(l13Var20);
                            case 13:
                                l13Var20.getClass();
                                return new ioq(l13Var20);
                            case 14:
                                l13Var20.getClass();
                                return new jqq();
                            case 15:
                                l13Var20.getClass();
                                return new r1b();
                            case 16:
                                l13Var20.getClass();
                                return new xdf();
                            case 17:
                                l13Var20.getClass();
                                return new uff();
                            case 18:
                                l13Var20.getClass();
                                return new tff();
                            case 19:
                                l13Var20.getClass();
                                return new joq();
                            case 20:
                                l13Var20.getClass();
                                return new koq();
                            case 21:
                                l13Var20.getClass();
                                return new ynq();
                            case 22:
                                l13Var20.getClass();
                                bdt I4 = hag.I(Context.class);
                                qdc qdcVar4 = l13Var20.a;
                                Set set3 = l13Var20.b;
                                return new jfr((Context) qdcVar4.D(I4, l13Var20, set3), (cpr) qdcVar4.D(hag.I(cpr.class), l13Var20, set3));
                            case 23:
                                l13Var20.getClass();
                                return new aw8((oy2) l13Var20.a.D(hag.I(oy2.class), l13Var20, l13Var20.b));
                            case 24:
                                l13Var20.getClass();
                                return new loq(l13Var20);
                            case 25:
                                l13Var20.getClass();
                                return new moq((qy2) l13Var20.a.D(hag.I(qy2.class), l13Var20, l13Var20.b), l13Var20);
                            case 26:
                                l13Var20.getClass();
                                return new b14();
                            case 27:
                                l13Var20.getClass();
                                return new ud(l13Var20.b(hag.I(oi5.class), true), l13Var20.b(hag.I(pi5.class), true));
                            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                                l13Var20.getClass();
                                return new yzp();
                            default:
                                l13Var20.getClass();
                                return new bg4((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                        }
                    }
                });
                o18Var.c = hag.I(bg4.class);
                rp7Var.getClass();
                final int i6 = 29;
                rp7Var.D(new Function1() { // from class: wnq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        l13 l13Var20 = (l13) obj2;
                        switch (i6) {
                            case 0:
                                l13Var20.getClass();
                                return new hsj((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                            case 1:
                                l13Var20.getClass();
                                return new aaj();
                            case 2:
                                l13Var20.getClass();
                                bdt I = hag.I(frt.class);
                                qdc qdcVar = l13Var20.a;
                                Set set = l13Var20.b;
                                return new cmf((frt) qdcVar.D(I, l13Var20, set), (wst) qdcVar.D(hag.I(wst.class), l13Var20, set));
                            case 3:
                                l13Var20.getClass();
                                return new hta();
                            case 4:
                                l13Var20.getClass();
                                return new jck();
                            case 5:
                                l13Var20.getClass();
                                return new doq();
                            case 6:
                                l13Var20.getClass();
                                l18 l18Var = l18.b;
                                bdt I2 = hag.I(Context.class);
                                qdc qdcVar2 = l18Var.a;
                                qdcVar2.getClass();
                                return new m4d((Context) qdcVar2.C(I2));
                            case 7:
                                l13Var20.getClass();
                                return new eoq();
                            case 8:
                                l13Var20.getClass();
                                return new foq(l13Var20);
                            case 9:
                                l13Var20.getClass();
                                return new vg6();
                            case 10:
                                l13Var20.getClass();
                                bdt I3 = hag.I(Context.class);
                                qdc qdcVar3 = l13Var20.a;
                                Set set2 = l13Var20.b;
                                File cacheDir = ((Context) qdcVar3.D(I3, l13Var20, set2)).getCacheDir();
                                cacheDir.getClass();
                                kpm kpmVar = new kpm(cacheDir);
                                jyr jyrVar = tpq.e;
                                jyr jyrVar2 = dvu.e;
                                boolean d = kwl.d();
                                spq w = t7g.w();
                                return new upq(kpmVar, w != null ? spq.a(w, d, null, 123) : null, (i0j) qdcVar3.D(hag.I(i0j.class), l13Var20, set2), (uyt) qdcVar3.D(hag.I(uyt.class), l13Var20, set2), (z66) qdcVar3.D(hag.I(z66.class), l13Var20, set2), (t70) qdcVar3.D(hag.I(t70.class), l13Var20, set2));
                            case 11:
                                l13Var20.getClass();
                                return new goq(l13Var20);
                            case 12:
                                l13Var20.getClass();
                                return new hoq(l13Var20);
                            case 13:
                                l13Var20.getClass();
                                return new ioq(l13Var20);
                            case 14:
                                l13Var20.getClass();
                                return new jqq();
                            case 15:
                                l13Var20.getClass();
                                return new r1b();
                            case 16:
                                l13Var20.getClass();
                                return new xdf();
                            case 17:
                                l13Var20.getClass();
                                return new uff();
                            case 18:
                                l13Var20.getClass();
                                return new tff();
                            case 19:
                                l13Var20.getClass();
                                return new joq();
                            case 20:
                                l13Var20.getClass();
                                return new koq();
                            case 21:
                                l13Var20.getClass();
                                return new ynq();
                            case 22:
                                l13Var20.getClass();
                                bdt I4 = hag.I(Context.class);
                                qdc qdcVar4 = l13Var20.a;
                                Set set3 = l13Var20.b;
                                return new jfr((Context) qdcVar4.D(I4, l13Var20, set3), (cpr) qdcVar4.D(hag.I(cpr.class), l13Var20, set3));
                            case 23:
                                l13Var20.getClass();
                                return new aw8((oy2) l13Var20.a.D(hag.I(oy2.class), l13Var20, l13Var20.b));
                            case 24:
                                l13Var20.getClass();
                                return new loq(l13Var20);
                            case 25:
                                l13Var20.getClass();
                                return new moq((qy2) l13Var20.a.D(hag.I(qy2.class), l13Var20, l13Var20.b), l13Var20);
                            case 26:
                                l13Var20.getClass();
                                return new b14();
                            case 27:
                                l13Var20.getClass();
                                return new ud(l13Var20.b(hag.I(oi5.class), true), l13Var20.b(hag.I(pi5.class), true));
                            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                                l13Var20.getClass();
                                return new yzp();
                            default:
                                l13Var20.getClass();
                                return new bg4((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                        }
                    }
                });
                o18Var.c = hag.I(n4j.class);
                rp7Var.getClass();
                rp7Var.D(new xnq(0));
                o18Var.c = hag.I(wo4.class);
                rp7Var.getClass();
                rp7Var.D(new xnq(1));
                o18Var.c = hag.I(ooq.class);
                rp7Var.getClass();
                rp7Var.D(new xnq(3));
                o18Var.c = hag.I(i2g.class);
                rp7Var.getClass();
                rp7Var.D(new xnq(4));
                o18Var.c = hag.I(ynq.class);
                rp7Var.getClass();
                final int i7 = 21;
                rp7Var.D(new Function1() { // from class: wnq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        l13 l13Var20 = (l13) obj2;
                        switch (i7) {
                            case 0:
                                l13Var20.getClass();
                                return new hsj((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                            case 1:
                                l13Var20.getClass();
                                return new aaj();
                            case 2:
                                l13Var20.getClass();
                                bdt I = hag.I(frt.class);
                                qdc qdcVar = l13Var20.a;
                                Set set = l13Var20.b;
                                return new cmf((frt) qdcVar.D(I, l13Var20, set), (wst) qdcVar.D(hag.I(wst.class), l13Var20, set));
                            case 3:
                                l13Var20.getClass();
                                return new hta();
                            case 4:
                                l13Var20.getClass();
                                return new jck();
                            case 5:
                                l13Var20.getClass();
                                return new doq();
                            case 6:
                                l13Var20.getClass();
                                l18 l18Var = l18.b;
                                bdt I2 = hag.I(Context.class);
                                qdc qdcVar2 = l18Var.a;
                                qdcVar2.getClass();
                                return new m4d((Context) qdcVar2.C(I2));
                            case 7:
                                l13Var20.getClass();
                                return new eoq();
                            case 8:
                                l13Var20.getClass();
                                return new foq(l13Var20);
                            case 9:
                                l13Var20.getClass();
                                return new vg6();
                            case 10:
                                l13Var20.getClass();
                                bdt I3 = hag.I(Context.class);
                                qdc qdcVar3 = l13Var20.a;
                                Set set2 = l13Var20.b;
                                File cacheDir = ((Context) qdcVar3.D(I3, l13Var20, set2)).getCacheDir();
                                cacheDir.getClass();
                                kpm kpmVar = new kpm(cacheDir);
                                jyr jyrVar = tpq.e;
                                jyr jyrVar2 = dvu.e;
                                boolean d = kwl.d();
                                spq w = t7g.w();
                                return new upq(kpmVar, w != null ? spq.a(w, d, null, 123) : null, (i0j) qdcVar3.D(hag.I(i0j.class), l13Var20, set2), (uyt) qdcVar3.D(hag.I(uyt.class), l13Var20, set2), (z66) qdcVar3.D(hag.I(z66.class), l13Var20, set2), (t70) qdcVar3.D(hag.I(t70.class), l13Var20, set2));
                            case 11:
                                l13Var20.getClass();
                                return new goq(l13Var20);
                            case 12:
                                l13Var20.getClass();
                                return new hoq(l13Var20);
                            case 13:
                                l13Var20.getClass();
                                return new ioq(l13Var20);
                            case 14:
                                l13Var20.getClass();
                                return new jqq();
                            case 15:
                                l13Var20.getClass();
                                return new r1b();
                            case 16:
                                l13Var20.getClass();
                                return new xdf();
                            case 17:
                                l13Var20.getClass();
                                return new uff();
                            case 18:
                                l13Var20.getClass();
                                return new tff();
                            case 19:
                                l13Var20.getClass();
                                return new joq();
                            case 20:
                                l13Var20.getClass();
                                return new koq();
                            case 21:
                                l13Var20.getClass();
                                return new ynq();
                            case 22:
                                l13Var20.getClass();
                                bdt I4 = hag.I(Context.class);
                                qdc qdcVar4 = l13Var20.a;
                                Set set3 = l13Var20.b;
                                return new jfr((Context) qdcVar4.D(I4, l13Var20, set3), (cpr) qdcVar4.D(hag.I(cpr.class), l13Var20, set3));
                            case 23:
                                l13Var20.getClass();
                                return new aw8((oy2) l13Var20.a.D(hag.I(oy2.class), l13Var20, l13Var20.b));
                            case 24:
                                l13Var20.getClass();
                                return new loq(l13Var20);
                            case 25:
                                l13Var20.getClass();
                                return new moq((qy2) l13Var20.a.D(hag.I(qy2.class), l13Var20, l13Var20.b), l13Var20);
                            case 26:
                                l13Var20.getClass();
                                return new b14();
                            case 27:
                                l13Var20.getClass();
                                return new ud(l13Var20.b(hag.I(oi5.class), true), l13Var20.b(hag.I(pi5.class), true));
                            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                                l13Var20.getClass();
                                return new yzp();
                            default:
                                l13Var20.getClass();
                                return new bg4((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                        }
                    }
                });
                o18Var.c = hag.I(kze.class);
                rp7Var.getClass();
                rp7Var.D(new xnq(2));
                o18Var.c = hag.I(u26.class);
                rp7Var.getClass();
                rp7Var.D(new xnq(5));
                o18Var.c = hag.I(aoq.class);
                rp7Var.getClass();
                rp7Var.D(new xnq(6));
                o18Var.c = hag.I(boq.class);
                rp7Var.getClass();
                rp7Var.D(new xnq(7));
                o18Var.c = hag.I(qtv.class);
                rp7Var.getClass();
                rp7Var.D(new xnq(8));
                o18Var.c = hag.I(coq.class);
                rp7Var.getClass();
                rp7Var.D(new xnq(9));
                o18Var.c = hag.I(jm2.class);
                rp7Var.getClass();
                rp7Var.D(new xnq(10));
                o18Var.c = hag.I(hsj.class);
                rp7Var.getClass();
                final int i8 = 0;
                rp7Var.D(new Function1() { // from class: wnq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        l13 l13Var20 = (l13) obj2;
                        switch (i8) {
                            case 0:
                                l13Var20.getClass();
                                return new hsj((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                            case 1:
                                l13Var20.getClass();
                                return new aaj();
                            case 2:
                                l13Var20.getClass();
                                bdt I = hag.I(frt.class);
                                qdc qdcVar = l13Var20.a;
                                Set set = l13Var20.b;
                                return new cmf((frt) qdcVar.D(I, l13Var20, set), (wst) qdcVar.D(hag.I(wst.class), l13Var20, set));
                            case 3:
                                l13Var20.getClass();
                                return new hta();
                            case 4:
                                l13Var20.getClass();
                                return new jck();
                            case 5:
                                l13Var20.getClass();
                                return new doq();
                            case 6:
                                l13Var20.getClass();
                                l18 l18Var = l18.b;
                                bdt I2 = hag.I(Context.class);
                                qdc qdcVar2 = l18Var.a;
                                qdcVar2.getClass();
                                return new m4d((Context) qdcVar2.C(I2));
                            case 7:
                                l13Var20.getClass();
                                return new eoq();
                            case 8:
                                l13Var20.getClass();
                                return new foq(l13Var20);
                            case 9:
                                l13Var20.getClass();
                                return new vg6();
                            case 10:
                                l13Var20.getClass();
                                bdt I3 = hag.I(Context.class);
                                qdc qdcVar3 = l13Var20.a;
                                Set set2 = l13Var20.b;
                                File cacheDir = ((Context) qdcVar3.D(I3, l13Var20, set2)).getCacheDir();
                                cacheDir.getClass();
                                kpm kpmVar = new kpm(cacheDir);
                                jyr jyrVar = tpq.e;
                                jyr jyrVar2 = dvu.e;
                                boolean d = kwl.d();
                                spq w = t7g.w();
                                return new upq(kpmVar, w != null ? spq.a(w, d, null, 123) : null, (i0j) qdcVar3.D(hag.I(i0j.class), l13Var20, set2), (uyt) qdcVar3.D(hag.I(uyt.class), l13Var20, set2), (z66) qdcVar3.D(hag.I(z66.class), l13Var20, set2), (t70) qdcVar3.D(hag.I(t70.class), l13Var20, set2));
                            case 11:
                                l13Var20.getClass();
                                return new goq(l13Var20);
                            case 12:
                                l13Var20.getClass();
                                return new hoq(l13Var20);
                            case 13:
                                l13Var20.getClass();
                                return new ioq(l13Var20);
                            case 14:
                                l13Var20.getClass();
                                return new jqq();
                            case 15:
                                l13Var20.getClass();
                                return new r1b();
                            case 16:
                                l13Var20.getClass();
                                return new xdf();
                            case 17:
                                l13Var20.getClass();
                                return new uff();
                            case 18:
                                l13Var20.getClass();
                                return new tff();
                            case 19:
                                l13Var20.getClass();
                                return new joq();
                            case 20:
                                l13Var20.getClass();
                                return new koq();
                            case 21:
                                l13Var20.getClass();
                                return new ynq();
                            case 22:
                                l13Var20.getClass();
                                bdt I4 = hag.I(Context.class);
                                qdc qdcVar4 = l13Var20.a;
                                Set set3 = l13Var20.b;
                                return new jfr((Context) qdcVar4.D(I4, l13Var20, set3), (cpr) qdcVar4.D(hag.I(cpr.class), l13Var20, set3));
                            case 23:
                                l13Var20.getClass();
                                return new aw8((oy2) l13Var20.a.D(hag.I(oy2.class), l13Var20, l13Var20.b));
                            case 24:
                                l13Var20.getClass();
                                return new loq(l13Var20);
                            case 25:
                                l13Var20.getClass();
                                return new moq((qy2) l13Var20.a.D(hag.I(qy2.class), l13Var20, l13Var20.b), l13Var20);
                            case 26:
                                l13Var20.getClass();
                                return new b14();
                            case 27:
                                l13Var20.getClass();
                                return new ud(l13Var20.b(hag.I(oi5.class), true), l13Var20.b(hag.I(pi5.class), true));
                            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                                l13Var20.getClass();
                                return new yzp();
                            default:
                                l13Var20.getClass();
                                return new bg4((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                        }
                    }
                });
                o18Var.c = hag.I(aaj.class);
                rp7Var.getClass();
                final int i9 = 1;
                rp7Var.D(new Function1() { // from class: wnq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        l13 l13Var20 = (l13) obj2;
                        switch (i9) {
                            case 0:
                                l13Var20.getClass();
                                return new hsj((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                            case 1:
                                l13Var20.getClass();
                                return new aaj();
                            case 2:
                                l13Var20.getClass();
                                bdt I = hag.I(frt.class);
                                qdc qdcVar = l13Var20.a;
                                Set set = l13Var20.b;
                                return new cmf((frt) qdcVar.D(I, l13Var20, set), (wst) qdcVar.D(hag.I(wst.class), l13Var20, set));
                            case 3:
                                l13Var20.getClass();
                                return new hta();
                            case 4:
                                l13Var20.getClass();
                                return new jck();
                            case 5:
                                l13Var20.getClass();
                                return new doq();
                            case 6:
                                l13Var20.getClass();
                                l18 l18Var = l18.b;
                                bdt I2 = hag.I(Context.class);
                                qdc qdcVar2 = l18Var.a;
                                qdcVar2.getClass();
                                return new m4d((Context) qdcVar2.C(I2));
                            case 7:
                                l13Var20.getClass();
                                return new eoq();
                            case 8:
                                l13Var20.getClass();
                                return new foq(l13Var20);
                            case 9:
                                l13Var20.getClass();
                                return new vg6();
                            case 10:
                                l13Var20.getClass();
                                bdt I3 = hag.I(Context.class);
                                qdc qdcVar3 = l13Var20.a;
                                Set set2 = l13Var20.b;
                                File cacheDir = ((Context) qdcVar3.D(I3, l13Var20, set2)).getCacheDir();
                                cacheDir.getClass();
                                kpm kpmVar = new kpm(cacheDir);
                                jyr jyrVar = tpq.e;
                                jyr jyrVar2 = dvu.e;
                                boolean d = kwl.d();
                                spq w = t7g.w();
                                return new upq(kpmVar, w != null ? spq.a(w, d, null, 123) : null, (i0j) qdcVar3.D(hag.I(i0j.class), l13Var20, set2), (uyt) qdcVar3.D(hag.I(uyt.class), l13Var20, set2), (z66) qdcVar3.D(hag.I(z66.class), l13Var20, set2), (t70) qdcVar3.D(hag.I(t70.class), l13Var20, set2));
                            case 11:
                                l13Var20.getClass();
                                return new goq(l13Var20);
                            case 12:
                                l13Var20.getClass();
                                return new hoq(l13Var20);
                            case 13:
                                l13Var20.getClass();
                                return new ioq(l13Var20);
                            case 14:
                                l13Var20.getClass();
                                return new jqq();
                            case 15:
                                l13Var20.getClass();
                                return new r1b();
                            case 16:
                                l13Var20.getClass();
                                return new xdf();
                            case 17:
                                l13Var20.getClass();
                                return new uff();
                            case 18:
                                l13Var20.getClass();
                                return new tff();
                            case 19:
                                l13Var20.getClass();
                                return new joq();
                            case 20:
                                l13Var20.getClass();
                                return new koq();
                            case 21:
                                l13Var20.getClass();
                                return new ynq();
                            case 22:
                                l13Var20.getClass();
                                bdt I4 = hag.I(Context.class);
                                qdc qdcVar4 = l13Var20.a;
                                Set set3 = l13Var20.b;
                                return new jfr((Context) qdcVar4.D(I4, l13Var20, set3), (cpr) qdcVar4.D(hag.I(cpr.class), l13Var20, set3));
                            case 23:
                                l13Var20.getClass();
                                return new aw8((oy2) l13Var20.a.D(hag.I(oy2.class), l13Var20, l13Var20.b));
                            case 24:
                                l13Var20.getClass();
                                return new loq(l13Var20);
                            case 25:
                                l13Var20.getClass();
                                return new moq((qy2) l13Var20.a.D(hag.I(qy2.class), l13Var20, l13Var20.b), l13Var20);
                            case 26:
                                l13Var20.getClass();
                                return new b14();
                            case 27:
                                l13Var20.getClass();
                                return new ud(l13Var20.b(hag.I(oi5.class), true), l13Var20.b(hag.I(pi5.class), true));
                            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                                l13Var20.getClass();
                                return new yzp();
                            default:
                                l13Var20.getClass();
                                return new bg4((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                        }
                    }
                });
                o18Var.c = hag.I(hta.class);
                rp7Var.getClass();
                final int i10 = 3;
                rp7Var.D(new Function1() { // from class: wnq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        l13 l13Var20 = (l13) obj2;
                        switch (i10) {
                            case 0:
                                l13Var20.getClass();
                                return new hsj((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                            case 1:
                                l13Var20.getClass();
                                return new aaj();
                            case 2:
                                l13Var20.getClass();
                                bdt I = hag.I(frt.class);
                                qdc qdcVar = l13Var20.a;
                                Set set = l13Var20.b;
                                return new cmf((frt) qdcVar.D(I, l13Var20, set), (wst) qdcVar.D(hag.I(wst.class), l13Var20, set));
                            case 3:
                                l13Var20.getClass();
                                return new hta();
                            case 4:
                                l13Var20.getClass();
                                return new jck();
                            case 5:
                                l13Var20.getClass();
                                return new doq();
                            case 6:
                                l13Var20.getClass();
                                l18 l18Var = l18.b;
                                bdt I2 = hag.I(Context.class);
                                qdc qdcVar2 = l18Var.a;
                                qdcVar2.getClass();
                                return new m4d((Context) qdcVar2.C(I2));
                            case 7:
                                l13Var20.getClass();
                                return new eoq();
                            case 8:
                                l13Var20.getClass();
                                return new foq(l13Var20);
                            case 9:
                                l13Var20.getClass();
                                return new vg6();
                            case 10:
                                l13Var20.getClass();
                                bdt I3 = hag.I(Context.class);
                                qdc qdcVar3 = l13Var20.a;
                                Set set2 = l13Var20.b;
                                File cacheDir = ((Context) qdcVar3.D(I3, l13Var20, set2)).getCacheDir();
                                cacheDir.getClass();
                                kpm kpmVar = new kpm(cacheDir);
                                jyr jyrVar = tpq.e;
                                jyr jyrVar2 = dvu.e;
                                boolean d = kwl.d();
                                spq w = t7g.w();
                                return new upq(kpmVar, w != null ? spq.a(w, d, null, 123) : null, (i0j) qdcVar3.D(hag.I(i0j.class), l13Var20, set2), (uyt) qdcVar3.D(hag.I(uyt.class), l13Var20, set2), (z66) qdcVar3.D(hag.I(z66.class), l13Var20, set2), (t70) qdcVar3.D(hag.I(t70.class), l13Var20, set2));
                            case 11:
                                l13Var20.getClass();
                                return new goq(l13Var20);
                            case 12:
                                l13Var20.getClass();
                                return new hoq(l13Var20);
                            case 13:
                                l13Var20.getClass();
                                return new ioq(l13Var20);
                            case 14:
                                l13Var20.getClass();
                                return new jqq();
                            case 15:
                                l13Var20.getClass();
                                return new r1b();
                            case 16:
                                l13Var20.getClass();
                                return new xdf();
                            case 17:
                                l13Var20.getClass();
                                return new uff();
                            case 18:
                                l13Var20.getClass();
                                return new tff();
                            case 19:
                                l13Var20.getClass();
                                return new joq();
                            case 20:
                                l13Var20.getClass();
                                return new koq();
                            case 21:
                                l13Var20.getClass();
                                return new ynq();
                            case 22:
                                l13Var20.getClass();
                                bdt I4 = hag.I(Context.class);
                                qdc qdcVar4 = l13Var20.a;
                                Set set3 = l13Var20.b;
                                return new jfr((Context) qdcVar4.D(I4, l13Var20, set3), (cpr) qdcVar4.D(hag.I(cpr.class), l13Var20, set3));
                            case 23:
                                l13Var20.getClass();
                                return new aw8((oy2) l13Var20.a.D(hag.I(oy2.class), l13Var20, l13Var20.b));
                            case 24:
                                l13Var20.getClass();
                                return new loq(l13Var20);
                            case 25:
                                l13Var20.getClass();
                                return new moq((qy2) l13Var20.a.D(hag.I(qy2.class), l13Var20, l13Var20.b), l13Var20);
                            case 26:
                                l13Var20.getClass();
                                return new b14();
                            case 27:
                                l13Var20.getClass();
                                return new ud(l13Var20.b(hag.I(oi5.class), true), l13Var20.b(hag.I(pi5.class), true));
                            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                                l13Var20.getClass();
                                return new yzp();
                            default:
                                l13Var20.getClass();
                                return new bg4((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                        }
                    }
                });
                o18Var.c = hag.I(jck.class);
                rp7Var.getClass();
                final int i11 = 4;
                rp7Var.D(new Function1() { // from class: wnq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        l13 l13Var20 = (l13) obj2;
                        switch (i11) {
                            case 0:
                                l13Var20.getClass();
                                return new hsj((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                            case 1:
                                l13Var20.getClass();
                                return new aaj();
                            case 2:
                                l13Var20.getClass();
                                bdt I = hag.I(frt.class);
                                qdc qdcVar = l13Var20.a;
                                Set set = l13Var20.b;
                                return new cmf((frt) qdcVar.D(I, l13Var20, set), (wst) qdcVar.D(hag.I(wst.class), l13Var20, set));
                            case 3:
                                l13Var20.getClass();
                                return new hta();
                            case 4:
                                l13Var20.getClass();
                                return new jck();
                            case 5:
                                l13Var20.getClass();
                                return new doq();
                            case 6:
                                l13Var20.getClass();
                                l18 l18Var = l18.b;
                                bdt I2 = hag.I(Context.class);
                                qdc qdcVar2 = l18Var.a;
                                qdcVar2.getClass();
                                return new m4d((Context) qdcVar2.C(I2));
                            case 7:
                                l13Var20.getClass();
                                return new eoq();
                            case 8:
                                l13Var20.getClass();
                                return new foq(l13Var20);
                            case 9:
                                l13Var20.getClass();
                                return new vg6();
                            case 10:
                                l13Var20.getClass();
                                bdt I3 = hag.I(Context.class);
                                qdc qdcVar3 = l13Var20.a;
                                Set set2 = l13Var20.b;
                                File cacheDir = ((Context) qdcVar3.D(I3, l13Var20, set2)).getCacheDir();
                                cacheDir.getClass();
                                kpm kpmVar = new kpm(cacheDir);
                                jyr jyrVar = tpq.e;
                                jyr jyrVar2 = dvu.e;
                                boolean d = kwl.d();
                                spq w = t7g.w();
                                return new upq(kpmVar, w != null ? spq.a(w, d, null, 123) : null, (i0j) qdcVar3.D(hag.I(i0j.class), l13Var20, set2), (uyt) qdcVar3.D(hag.I(uyt.class), l13Var20, set2), (z66) qdcVar3.D(hag.I(z66.class), l13Var20, set2), (t70) qdcVar3.D(hag.I(t70.class), l13Var20, set2));
                            case 11:
                                l13Var20.getClass();
                                return new goq(l13Var20);
                            case 12:
                                l13Var20.getClass();
                                return new hoq(l13Var20);
                            case 13:
                                l13Var20.getClass();
                                return new ioq(l13Var20);
                            case 14:
                                l13Var20.getClass();
                                return new jqq();
                            case 15:
                                l13Var20.getClass();
                                return new r1b();
                            case 16:
                                l13Var20.getClass();
                                return new xdf();
                            case 17:
                                l13Var20.getClass();
                                return new uff();
                            case 18:
                                l13Var20.getClass();
                                return new tff();
                            case 19:
                                l13Var20.getClass();
                                return new joq();
                            case 20:
                                l13Var20.getClass();
                                return new koq();
                            case 21:
                                l13Var20.getClass();
                                return new ynq();
                            case 22:
                                l13Var20.getClass();
                                bdt I4 = hag.I(Context.class);
                                qdc qdcVar4 = l13Var20.a;
                                Set set3 = l13Var20.b;
                                return new jfr((Context) qdcVar4.D(I4, l13Var20, set3), (cpr) qdcVar4.D(hag.I(cpr.class), l13Var20, set3));
                            case 23:
                                l13Var20.getClass();
                                return new aw8((oy2) l13Var20.a.D(hag.I(oy2.class), l13Var20, l13Var20.b));
                            case 24:
                                l13Var20.getClass();
                                return new loq(l13Var20);
                            case 25:
                                l13Var20.getClass();
                                return new moq((qy2) l13Var20.a.D(hag.I(qy2.class), l13Var20, l13Var20.b), l13Var20);
                            case 26:
                                l13Var20.getClass();
                                return new b14();
                            case 27:
                                l13Var20.getClass();
                                return new ud(l13Var20.b(hag.I(oi5.class), true), l13Var20.b(hag.I(pi5.class), true));
                            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                                l13Var20.getClass();
                                return new yzp();
                            default:
                                l13Var20.getClass();
                                return new bg4((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                        }
                    }
                });
                o18Var.c = hag.I(doq.class);
                rp7Var.getClass();
                final int i12 = 5;
                rp7Var.D(new Function1() { // from class: wnq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        l13 l13Var20 = (l13) obj2;
                        switch (i12) {
                            case 0:
                                l13Var20.getClass();
                                return new hsj((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                            case 1:
                                l13Var20.getClass();
                                return new aaj();
                            case 2:
                                l13Var20.getClass();
                                bdt I = hag.I(frt.class);
                                qdc qdcVar = l13Var20.a;
                                Set set = l13Var20.b;
                                return new cmf((frt) qdcVar.D(I, l13Var20, set), (wst) qdcVar.D(hag.I(wst.class), l13Var20, set));
                            case 3:
                                l13Var20.getClass();
                                return new hta();
                            case 4:
                                l13Var20.getClass();
                                return new jck();
                            case 5:
                                l13Var20.getClass();
                                return new doq();
                            case 6:
                                l13Var20.getClass();
                                l18 l18Var = l18.b;
                                bdt I2 = hag.I(Context.class);
                                qdc qdcVar2 = l18Var.a;
                                qdcVar2.getClass();
                                return new m4d((Context) qdcVar2.C(I2));
                            case 7:
                                l13Var20.getClass();
                                return new eoq();
                            case 8:
                                l13Var20.getClass();
                                return new foq(l13Var20);
                            case 9:
                                l13Var20.getClass();
                                return new vg6();
                            case 10:
                                l13Var20.getClass();
                                bdt I3 = hag.I(Context.class);
                                qdc qdcVar3 = l13Var20.a;
                                Set set2 = l13Var20.b;
                                File cacheDir = ((Context) qdcVar3.D(I3, l13Var20, set2)).getCacheDir();
                                cacheDir.getClass();
                                kpm kpmVar = new kpm(cacheDir);
                                jyr jyrVar = tpq.e;
                                jyr jyrVar2 = dvu.e;
                                boolean d = kwl.d();
                                spq w = t7g.w();
                                return new upq(kpmVar, w != null ? spq.a(w, d, null, 123) : null, (i0j) qdcVar3.D(hag.I(i0j.class), l13Var20, set2), (uyt) qdcVar3.D(hag.I(uyt.class), l13Var20, set2), (z66) qdcVar3.D(hag.I(z66.class), l13Var20, set2), (t70) qdcVar3.D(hag.I(t70.class), l13Var20, set2));
                            case 11:
                                l13Var20.getClass();
                                return new goq(l13Var20);
                            case 12:
                                l13Var20.getClass();
                                return new hoq(l13Var20);
                            case 13:
                                l13Var20.getClass();
                                return new ioq(l13Var20);
                            case 14:
                                l13Var20.getClass();
                                return new jqq();
                            case 15:
                                l13Var20.getClass();
                                return new r1b();
                            case 16:
                                l13Var20.getClass();
                                return new xdf();
                            case 17:
                                l13Var20.getClass();
                                return new uff();
                            case 18:
                                l13Var20.getClass();
                                return new tff();
                            case 19:
                                l13Var20.getClass();
                                return new joq();
                            case 20:
                                l13Var20.getClass();
                                return new koq();
                            case 21:
                                l13Var20.getClass();
                                return new ynq();
                            case 22:
                                l13Var20.getClass();
                                bdt I4 = hag.I(Context.class);
                                qdc qdcVar4 = l13Var20.a;
                                Set set3 = l13Var20.b;
                                return new jfr((Context) qdcVar4.D(I4, l13Var20, set3), (cpr) qdcVar4.D(hag.I(cpr.class), l13Var20, set3));
                            case 23:
                                l13Var20.getClass();
                                return new aw8((oy2) l13Var20.a.D(hag.I(oy2.class), l13Var20, l13Var20.b));
                            case 24:
                                l13Var20.getClass();
                                return new loq(l13Var20);
                            case 25:
                                l13Var20.getClass();
                                return new moq((qy2) l13Var20.a.D(hag.I(qy2.class), l13Var20, l13Var20.b), l13Var20);
                            case 26:
                                l13Var20.getClass();
                                return new b14();
                            case 27:
                                l13Var20.getClass();
                                return new ud(l13Var20.b(hag.I(oi5.class), true), l13Var20.b(hag.I(pi5.class), true));
                            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                                l13Var20.getClass();
                                return new yzp();
                            default:
                                l13Var20.getClass();
                                return new bg4((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                        }
                    }
                });
                o18Var.c = hag.I(m4d.class);
                rp7Var.getClass();
                final int i13 = 6;
                rp7Var.E(new Function1() { // from class: wnq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        l13 l13Var20 = (l13) obj2;
                        switch (i13) {
                            case 0:
                                l13Var20.getClass();
                                return new hsj((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                            case 1:
                                l13Var20.getClass();
                                return new aaj();
                            case 2:
                                l13Var20.getClass();
                                bdt I = hag.I(frt.class);
                                qdc qdcVar = l13Var20.a;
                                Set set = l13Var20.b;
                                return new cmf((frt) qdcVar.D(I, l13Var20, set), (wst) qdcVar.D(hag.I(wst.class), l13Var20, set));
                            case 3:
                                l13Var20.getClass();
                                return new hta();
                            case 4:
                                l13Var20.getClass();
                                return new jck();
                            case 5:
                                l13Var20.getClass();
                                return new doq();
                            case 6:
                                l13Var20.getClass();
                                l18 l18Var = l18.b;
                                bdt I2 = hag.I(Context.class);
                                qdc qdcVar2 = l18Var.a;
                                qdcVar2.getClass();
                                return new m4d((Context) qdcVar2.C(I2));
                            case 7:
                                l13Var20.getClass();
                                return new eoq();
                            case 8:
                                l13Var20.getClass();
                                return new foq(l13Var20);
                            case 9:
                                l13Var20.getClass();
                                return new vg6();
                            case 10:
                                l13Var20.getClass();
                                bdt I3 = hag.I(Context.class);
                                qdc qdcVar3 = l13Var20.a;
                                Set set2 = l13Var20.b;
                                File cacheDir = ((Context) qdcVar3.D(I3, l13Var20, set2)).getCacheDir();
                                cacheDir.getClass();
                                kpm kpmVar = new kpm(cacheDir);
                                jyr jyrVar = tpq.e;
                                jyr jyrVar2 = dvu.e;
                                boolean d = kwl.d();
                                spq w = t7g.w();
                                return new upq(kpmVar, w != null ? spq.a(w, d, null, 123) : null, (i0j) qdcVar3.D(hag.I(i0j.class), l13Var20, set2), (uyt) qdcVar3.D(hag.I(uyt.class), l13Var20, set2), (z66) qdcVar3.D(hag.I(z66.class), l13Var20, set2), (t70) qdcVar3.D(hag.I(t70.class), l13Var20, set2));
                            case 11:
                                l13Var20.getClass();
                                return new goq(l13Var20);
                            case 12:
                                l13Var20.getClass();
                                return new hoq(l13Var20);
                            case 13:
                                l13Var20.getClass();
                                return new ioq(l13Var20);
                            case 14:
                                l13Var20.getClass();
                                return new jqq();
                            case 15:
                                l13Var20.getClass();
                                return new r1b();
                            case 16:
                                l13Var20.getClass();
                                return new xdf();
                            case 17:
                                l13Var20.getClass();
                                return new uff();
                            case 18:
                                l13Var20.getClass();
                                return new tff();
                            case 19:
                                l13Var20.getClass();
                                return new joq();
                            case 20:
                                l13Var20.getClass();
                                return new koq();
                            case 21:
                                l13Var20.getClass();
                                return new ynq();
                            case 22:
                                l13Var20.getClass();
                                bdt I4 = hag.I(Context.class);
                                qdc qdcVar4 = l13Var20.a;
                                Set set3 = l13Var20.b;
                                return new jfr((Context) qdcVar4.D(I4, l13Var20, set3), (cpr) qdcVar4.D(hag.I(cpr.class), l13Var20, set3));
                            case 23:
                                l13Var20.getClass();
                                return new aw8((oy2) l13Var20.a.D(hag.I(oy2.class), l13Var20, l13Var20.b));
                            case 24:
                                l13Var20.getClass();
                                return new loq(l13Var20);
                            case 25:
                                l13Var20.getClass();
                                return new moq((qy2) l13Var20.a.D(hag.I(qy2.class), l13Var20, l13Var20.b), l13Var20);
                            case 26:
                                l13Var20.getClass();
                                return new b14();
                            case 27:
                                l13Var20.getClass();
                                return new ud(l13Var20.b(hag.I(oi5.class), true), l13Var20.b(hag.I(pi5.class), true));
                            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                                l13Var20.getClass();
                                return new yzp();
                            default:
                                l13Var20.getClass();
                                return new bg4((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                        }
                    }
                });
                o18Var.c = hag.I(eoq.class);
                rp7Var.getClass();
                final int i14 = 7;
                rp7Var.D(new Function1() { // from class: wnq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        l13 l13Var20 = (l13) obj2;
                        switch (i14) {
                            case 0:
                                l13Var20.getClass();
                                return new hsj((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                            case 1:
                                l13Var20.getClass();
                                return new aaj();
                            case 2:
                                l13Var20.getClass();
                                bdt I = hag.I(frt.class);
                                qdc qdcVar = l13Var20.a;
                                Set set = l13Var20.b;
                                return new cmf((frt) qdcVar.D(I, l13Var20, set), (wst) qdcVar.D(hag.I(wst.class), l13Var20, set));
                            case 3:
                                l13Var20.getClass();
                                return new hta();
                            case 4:
                                l13Var20.getClass();
                                return new jck();
                            case 5:
                                l13Var20.getClass();
                                return new doq();
                            case 6:
                                l13Var20.getClass();
                                l18 l18Var = l18.b;
                                bdt I2 = hag.I(Context.class);
                                qdc qdcVar2 = l18Var.a;
                                qdcVar2.getClass();
                                return new m4d((Context) qdcVar2.C(I2));
                            case 7:
                                l13Var20.getClass();
                                return new eoq();
                            case 8:
                                l13Var20.getClass();
                                return new foq(l13Var20);
                            case 9:
                                l13Var20.getClass();
                                return new vg6();
                            case 10:
                                l13Var20.getClass();
                                bdt I3 = hag.I(Context.class);
                                qdc qdcVar3 = l13Var20.a;
                                Set set2 = l13Var20.b;
                                File cacheDir = ((Context) qdcVar3.D(I3, l13Var20, set2)).getCacheDir();
                                cacheDir.getClass();
                                kpm kpmVar = new kpm(cacheDir);
                                jyr jyrVar = tpq.e;
                                jyr jyrVar2 = dvu.e;
                                boolean d = kwl.d();
                                spq w = t7g.w();
                                return new upq(kpmVar, w != null ? spq.a(w, d, null, 123) : null, (i0j) qdcVar3.D(hag.I(i0j.class), l13Var20, set2), (uyt) qdcVar3.D(hag.I(uyt.class), l13Var20, set2), (z66) qdcVar3.D(hag.I(z66.class), l13Var20, set2), (t70) qdcVar3.D(hag.I(t70.class), l13Var20, set2));
                            case 11:
                                l13Var20.getClass();
                                return new goq(l13Var20);
                            case 12:
                                l13Var20.getClass();
                                return new hoq(l13Var20);
                            case 13:
                                l13Var20.getClass();
                                return new ioq(l13Var20);
                            case 14:
                                l13Var20.getClass();
                                return new jqq();
                            case 15:
                                l13Var20.getClass();
                                return new r1b();
                            case 16:
                                l13Var20.getClass();
                                return new xdf();
                            case 17:
                                l13Var20.getClass();
                                return new uff();
                            case 18:
                                l13Var20.getClass();
                                return new tff();
                            case 19:
                                l13Var20.getClass();
                                return new joq();
                            case 20:
                                l13Var20.getClass();
                                return new koq();
                            case 21:
                                l13Var20.getClass();
                                return new ynq();
                            case 22:
                                l13Var20.getClass();
                                bdt I4 = hag.I(Context.class);
                                qdc qdcVar4 = l13Var20.a;
                                Set set3 = l13Var20.b;
                                return new jfr((Context) qdcVar4.D(I4, l13Var20, set3), (cpr) qdcVar4.D(hag.I(cpr.class), l13Var20, set3));
                            case 23:
                                l13Var20.getClass();
                                return new aw8((oy2) l13Var20.a.D(hag.I(oy2.class), l13Var20, l13Var20.b));
                            case 24:
                                l13Var20.getClass();
                                return new loq(l13Var20);
                            case 25:
                                l13Var20.getClass();
                                return new moq((qy2) l13Var20.a.D(hag.I(qy2.class), l13Var20, l13Var20.b), l13Var20);
                            case 26:
                                l13Var20.getClass();
                                return new b14();
                            case 27:
                                l13Var20.getClass();
                                return new ud(l13Var20.b(hag.I(oi5.class), true), l13Var20.b(hag.I(pi5.class), true));
                            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                                l13Var20.getClass();
                                return new yzp();
                            default:
                                l13Var20.getClass();
                                return new bg4((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                        }
                    }
                });
                o18Var.c = hag.I(foq.class);
                rp7Var.getClass();
                final int i15 = 8;
                rp7Var.D(new Function1() { // from class: wnq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        l13 l13Var20 = (l13) obj2;
                        switch (i15) {
                            case 0:
                                l13Var20.getClass();
                                return new hsj((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                            case 1:
                                l13Var20.getClass();
                                return new aaj();
                            case 2:
                                l13Var20.getClass();
                                bdt I = hag.I(frt.class);
                                qdc qdcVar = l13Var20.a;
                                Set set = l13Var20.b;
                                return new cmf((frt) qdcVar.D(I, l13Var20, set), (wst) qdcVar.D(hag.I(wst.class), l13Var20, set));
                            case 3:
                                l13Var20.getClass();
                                return new hta();
                            case 4:
                                l13Var20.getClass();
                                return new jck();
                            case 5:
                                l13Var20.getClass();
                                return new doq();
                            case 6:
                                l13Var20.getClass();
                                l18 l18Var = l18.b;
                                bdt I2 = hag.I(Context.class);
                                qdc qdcVar2 = l18Var.a;
                                qdcVar2.getClass();
                                return new m4d((Context) qdcVar2.C(I2));
                            case 7:
                                l13Var20.getClass();
                                return new eoq();
                            case 8:
                                l13Var20.getClass();
                                return new foq(l13Var20);
                            case 9:
                                l13Var20.getClass();
                                return new vg6();
                            case 10:
                                l13Var20.getClass();
                                bdt I3 = hag.I(Context.class);
                                qdc qdcVar3 = l13Var20.a;
                                Set set2 = l13Var20.b;
                                File cacheDir = ((Context) qdcVar3.D(I3, l13Var20, set2)).getCacheDir();
                                cacheDir.getClass();
                                kpm kpmVar = new kpm(cacheDir);
                                jyr jyrVar = tpq.e;
                                jyr jyrVar2 = dvu.e;
                                boolean d = kwl.d();
                                spq w = t7g.w();
                                return new upq(kpmVar, w != null ? spq.a(w, d, null, 123) : null, (i0j) qdcVar3.D(hag.I(i0j.class), l13Var20, set2), (uyt) qdcVar3.D(hag.I(uyt.class), l13Var20, set2), (z66) qdcVar3.D(hag.I(z66.class), l13Var20, set2), (t70) qdcVar3.D(hag.I(t70.class), l13Var20, set2));
                            case 11:
                                l13Var20.getClass();
                                return new goq(l13Var20);
                            case 12:
                                l13Var20.getClass();
                                return new hoq(l13Var20);
                            case 13:
                                l13Var20.getClass();
                                return new ioq(l13Var20);
                            case 14:
                                l13Var20.getClass();
                                return new jqq();
                            case 15:
                                l13Var20.getClass();
                                return new r1b();
                            case 16:
                                l13Var20.getClass();
                                return new xdf();
                            case 17:
                                l13Var20.getClass();
                                return new uff();
                            case 18:
                                l13Var20.getClass();
                                return new tff();
                            case 19:
                                l13Var20.getClass();
                                return new joq();
                            case 20:
                                l13Var20.getClass();
                                return new koq();
                            case 21:
                                l13Var20.getClass();
                                return new ynq();
                            case 22:
                                l13Var20.getClass();
                                bdt I4 = hag.I(Context.class);
                                qdc qdcVar4 = l13Var20.a;
                                Set set3 = l13Var20.b;
                                return new jfr((Context) qdcVar4.D(I4, l13Var20, set3), (cpr) qdcVar4.D(hag.I(cpr.class), l13Var20, set3));
                            case 23:
                                l13Var20.getClass();
                                return new aw8((oy2) l13Var20.a.D(hag.I(oy2.class), l13Var20, l13Var20.b));
                            case 24:
                                l13Var20.getClass();
                                return new loq(l13Var20);
                            case 25:
                                l13Var20.getClass();
                                return new moq((qy2) l13Var20.a.D(hag.I(qy2.class), l13Var20, l13Var20.b), l13Var20);
                            case 26:
                                l13Var20.getClass();
                                return new b14();
                            case 27:
                                l13Var20.getClass();
                                return new ud(l13Var20.b(hag.I(oi5.class), true), l13Var20.b(hag.I(pi5.class), true));
                            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                                l13Var20.getClass();
                                return new yzp();
                            default:
                                l13Var20.getClass();
                                return new bg4((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                        }
                    }
                });
                o18Var.c = hag.I(vg6.class);
                rp7Var.getClass();
                final int i16 = 9;
                rp7Var.D(new Function1() { // from class: wnq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        l13 l13Var20 = (l13) obj2;
                        switch (i16) {
                            case 0:
                                l13Var20.getClass();
                                return new hsj((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                            case 1:
                                l13Var20.getClass();
                                return new aaj();
                            case 2:
                                l13Var20.getClass();
                                bdt I = hag.I(frt.class);
                                qdc qdcVar = l13Var20.a;
                                Set set = l13Var20.b;
                                return new cmf((frt) qdcVar.D(I, l13Var20, set), (wst) qdcVar.D(hag.I(wst.class), l13Var20, set));
                            case 3:
                                l13Var20.getClass();
                                return new hta();
                            case 4:
                                l13Var20.getClass();
                                return new jck();
                            case 5:
                                l13Var20.getClass();
                                return new doq();
                            case 6:
                                l13Var20.getClass();
                                l18 l18Var = l18.b;
                                bdt I2 = hag.I(Context.class);
                                qdc qdcVar2 = l18Var.a;
                                qdcVar2.getClass();
                                return new m4d((Context) qdcVar2.C(I2));
                            case 7:
                                l13Var20.getClass();
                                return new eoq();
                            case 8:
                                l13Var20.getClass();
                                return new foq(l13Var20);
                            case 9:
                                l13Var20.getClass();
                                return new vg6();
                            case 10:
                                l13Var20.getClass();
                                bdt I3 = hag.I(Context.class);
                                qdc qdcVar3 = l13Var20.a;
                                Set set2 = l13Var20.b;
                                File cacheDir = ((Context) qdcVar3.D(I3, l13Var20, set2)).getCacheDir();
                                cacheDir.getClass();
                                kpm kpmVar = new kpm(cacheDir);
                                jyr jyrVar = tpq.e;
                                jyr jyrVar2 = dvu.e;
                                boolean d = kwl.d();
                                spq w = t7g.w();
                                return new upq(kpmVar, w != null ? spq.a(w, d, null, 123) : null, (i0j) qdcVar3.D(hag.I(i0j.class), l13Var20, set2), (uyt) qdcVar3.D(hag.I(uyt.class), l13Var20, set2), (z66) qdcVar3.D(hag.I(z66.class), l13Var20, set2), (t70) qdcVar3.D(hag.I(t70.class), l13Var20, set2));
                            case 11:
                                l13Var20.getClass();
                                return new goq(l13Var20);
                            case 12:
                                l13Var20.getClass();
                                return new hoq(l13Var20);
                            case 13:
                                l13Var20.getClass();
                                return new ioq(l13Var20);
                            case 14:
                                l13Var20.getClass();
                                return new jqq();
                            case 15:
                                l13Var20.getClass();
                                return new r1b();
                            case 16:
                                l13Var20.getClass();
                                return new xdf();
                            case 17:
                                l13Var20.getClass();
                                return new uff();
                            case 18:
                                l13Var20.getClass();
                                return new tff();
                            case 19:
                                l13Var20.getClass();
                                return new joq();
                            case 20:
                                l13Var20.getClass();
                                return new koq();
                            case 21:
                                l13Var20.getClass();
                                return new ynq();
                            case 22:
                                l13Var20.getClass();
                                bdt I4 = hag.I(Context.class);
                                qdc qdcVar4 = l13Var20.a;
                                Set set3 = l13Var20.b;
                                return new jfr((Context) qdcVar4.D(I4, l13Var20, set3), (cpr) qdcVar4.D(hag.I(cpr.class), l13Var20, set3));
                            case 23:
                                l13Var20.getClass();
                                return new aw8((oy2) l13Var20.a.D(hag.I(oy2.class), l13Var20, l13Var20.b));
                            case 24:
                                l13Var20.getClass();
                                return new loq(l13Var20);
                            case 25:
                                l13Var20.getClass();
                                return new moq((qy2) l13Var20.a.D(hag.I(qy2.class), l13Var20, l13Var20.b), l13Var20);
                            case 26:
                                l13Var20.getClass();
                                return new b14();
                            case 27:
                                l13Var20.getClass();
                                return new ud(l13Var20.b(hag.I(oi5.class), true), l13Var20.b(hag.I(pi5.class), true));
                            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                                l13Var20.getClass();
                                return new yzp();
                            default:
                                l13Var20.getClass();
                                return new bg4((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                        }
                    }
                });
                o18Var.c = hag.I(goq.class);
                rp7Var.getClass();
                final int i17 = 11;
                rp7Var.D(new Function1() { // from class: wnq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        l13 l13Var20 = (l13) obj2;
                        switch (i17) {
                            case 0:
                                l13Var20.getClass();
                                return new hsj((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                            case 1:
                                l13Var20.getClass();
                                return new aaj();
                            case 2:
                                l13Var20.getClass();
                                bdt I = hag.I(frt.class);
                                qdc qdcVar = l13Var20.a;
                                Set set = l13Var20.b;
                                return new cmf((frt) qdcVar.D(I, l13Var20, set), (wst) qdcVar.D(hag.I(wst.class), l13Var20, set));
                            case 3:
                                l13Var20.getClass();
                                return new hta();
                            case 4:
                                l13Var20.getClass();
                                return new jck();
                            case 5:
                                l13Var20.getClass();
                                return new doq();
                            case 6:
                                l13Var20.getClass();
                                l18 l18Var = l18.b;
                                bdt I2 = hag.I(Context.class);
                                qdc qdcVar2 = l18Var.a;
                                qdcVar2.getClass();
                                return new m4d((Context) qdcVar2.C(I2));
                            case 7:
                                l13Var20.getClass();
                                return new eoq();
                            case 8:
                                l13Var20.getClass();
                                return new foq(l13Var20);
                            case 9:
                                l13Var20.getClass();
                                return new vg6();
                            case 10:
                                l13Var20.getClass();
                                bdt I3 = hag.I(Context.class);
                                qdc qdcVar3 = l13Var20.a;
                                Set set2 = l13Var20.b;
                                File cacheDir = ((Context) qdcVar3.D(I3, l13Var20, set2)).getCacheDir();
                                cacheDir.getClass();
                                kpm kpmVar = new kpm(cacheDir);
                                jyr jyrVar = tpq.e;
                                jyr jyrVar2 = dvu.e;
                                boolean d = kwl.d();
                                spq w = t7g.w();
                                return new upq(kpmVar, w != null ? spq.a(w, d, null, 123) : null, (i0j) qdcVar3.D(hag.I(i0j.class), l13Var20, set2), (uyt) qdcVar3.D(hag.I(uyt.class), l13Var20, set2), (z66) qdcVar3.D(hag.I(z66.class), l13Var20, set2), (t70) qdcVar3.D(hag.I(t70.class), l13Var20, set2));
                            case 11:
                                l13Var20.getClass();
                                return new goq(l13Var20);
                            case 12:
                                l13Var20.getClass();
                                return new hoq(l13Var20);
                            case 13:
                                l13Var20.getClass();
                                return new ioq(l13Var20);
                            case 14:
                                l13Var20.getClass();
                                return new jqq();
                            case 15:
                                l13Var20.getClass();
                                return new r1b();
                            case 16:
                                l13Var20.getClass();
                                return new xdf();
                            case 17:
                                l13Var20.getClass();
                                return new uff();
                            case 18:
                                l13Var20.getClass();
                                return new tff();
                            case 19:
                                l13Var20.getClass();
                                return new joq();
                            case 20:
                                l13Var20.getClass();
                                return new koq();
                            case 21:
                                l13Var20.getClass();
                                return new ynq();
                            case 22:
                                l13Var20.getClass();
                                bdt I4 = hag.I(Context.class);
                                qdc qdcVar4 = l13Var20.a;
                                Set set3 = l13Var20.b;
                                return new jfr((Context) qdcVar4.D(I4, l13Var20, set3), (cpr) qdcVar4.D(hag.I(cpr.class), l13Var20, set3));
                            case 23:
                                l13Var20.getClass();
                                return new aw8((oy2) l13Var20.a.D(hag.I(oy2.class), l13Var20, l13Var20.b));
                            case 24:
                                l13Var20.getClass();
                                return new loq(l13Var20);
                            case 25:
                                l13Var20.getClass();
                                return new moq((qy2) l13Var20.a.D(hag.I(qy2.class), l13Var20, l13Var20.b), l13Var20);
                            case 26:
                                l13Var20.getClass();
                                return new b14();
                            case 27:
                                l13Var20.getClass();
                                return new ud(l13Var20.b(hag.I(oi5.class), true), l13Var20.b(hag.I(pi5.class), true));
                            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                                l13Var20.getClass();
                                return new yzp();
                            default:
                                l13Var20.getClass();
                                return new bg4((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                        }
                    }
                });
                o18Var.c = hag.I(hoq.class);
                rp7Var.getClass();
                final int i18 = 12;
                rp7Var.D(new Function1() { // from class: wnq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        l13 l13Var20 = (l13) obj2;
                        switch (i18) {
                            case 0:
                                l13Var20.getClass();
                                return new hsj((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                            case 1:
                                l13Var20.getClass();
                                return new aaj();
                            case 2:
                                l13Var20.getClass();
                                bdt I = hag.I(frt.class);
                                qdc qdcVar = l13Var20.a;
                                Set set = l13Var20.b;
                                return new cmf((frt) qdcVar.D(I, l13Var20, set), (wst) qdcVar.D(hag.I(wst.class), l13Var20, set));
                            case 3:
                                l13Var20.getClass();
                                return new hta();
                            case 4:
                                l13Var20.getClass();
                                return new jck();
                            case 5:
                                l13Var20.getClass();
                                return new doq();
                            case 6:
                                l13Var20.getClass();
                                l18 l18Var = l18.b;
                                bdt I2 = hag.I(Context.class);
                                qdc qdcVar2 = l18Var.a;
                                qdcVar2.getClass();
                                return new m4d((Context) qdcVar2.C(I2));
                            case 7:
                                l13Var20.getClass();
                                return new eoq();
                            case 8:
                                l13Var20.getClass();
                                return new foq(l13Var20);
                            case 9:
                                l13Var20.getClass();
                                return new vg6();
                            case 10:
                                l13Var20.getClass();
                                bdt I3 = hag.I(Context.class);
                                qdc qdcVar3 = l13Var20.a;
                                Set set2 = l13Var20.b;
                                File cacheDir = ((Context) qdcVar3.D(I3, l13Var20, set2)).getCacheDir();
                                cacheDir.getClass();
                                kpm kpmVar = new kpm(cacheDir);
                                jyr jyrVar = tpq.e;
                                jyr jyrVar2 = dvu.e;
                                boolean d = kwl.d();
                                spq w = t7g.w();
                                return new upq(kpmVar, w != null ? spq.a(w, d, null, 123) : null, (i0j) qdcVar3.D(hag.I(i0j.class), l13Var20, set2), (uyt) qdcVar3.D(hag.I(uyt.class), l13Var20, set2), (z66) qdcVar3.D(hag.I(z66.class), l13Var20, set2), (t70) qdcVar3.D(hag.I(t70.class), l13Var20, set2));
                            case 11:
                                l13Var20.getClass();
                                return new goq(l13Var20);
                            case 12:
                                l13Var20.getClass();
                                return new hoq(l13Var20);
                            case 13:
                                l13Var20.getClass();
                                return new ioq(l13Var20);
                            case 14:
                                l13Var20.getClass();
                                return new jqq();
                            case 15:
                                l13Var20.getClass();
                                return new r1b();
                            case 16:
                                l13Var20.getClass();
                                return new xdf();
                            case 17:
                                l13Var20.getClass();
                                return new uff();
                            case 18:
                                l13Var20.getClass();
                                return new tff();
                            case 19:
                                l13Var20.getClass();
                                return new joq();
                            case 20:
                                l13Var20.getClass();
                                return new koq();
                            case 21:
                                l13Var20.getClass();
                                return new ynq();
                            case 22:
                                l13Var20.getClass();
                                bdt I4 = hag.I(Context.class);
                                qdc qdcVar4 = l13Var20.a;
                                Set set3 = l13Var20.b;
                                return new jfr((Context) qdcVar4.D(I4, l13Var20, set3), (cpr) qdcVar4.D(hag.I(cpr.class), l13Var20, set3));
                            case 23:
                                l13Var20.getClass();
                                return new aw8((oy2) l13Var20.a.D(hag.I(oy2.class), l13Var20, l13Var20.b));
                            case 24:
                                l13Var20.getClass();
                                return new loq(l13Var20);
                            case 25:
                                l13Var20.getClass();
                                return new moq((qy2) l13Var20.a.D(hag.I(qy2.class), l13Var20, l13Var20.b), l13Var20);
                            case 26:
                                l13Var20.getClass();
                                return new b14();
                            case 27:
                                l13Var20.getClass();
                                return new ud(l13Var20.b(hag.I(oi5.class), true), l13Var20.b(hag.I(pi5.class), true));
                            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                                l13Var20.getClass();
                                return new yzp();
                            default:
                                l13Var20.getClass();
                                return new bg4((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                        }
                    }
                });
                o18Var.c = hag.I(ioq.class);
                rp7Var.getClass();
                final int i19 = 13;
                rp7Var.D(new Function1() { // from class: wnq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        l13 l13Var20 = (l13) obj2;
                        switch (i19) {
                            case 0:
                                l13Var20.getClass();
                                return new hsj((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                            case 1:
                                l13Var20.getClass();
                                return new aaj();
                            case 2:
                                l13Var20.getClass();
                                bdt I = hag.I(frt.class);
                                qdc qdcVar = l13Var20.a;
                                Set set = l13Var20.b;
                                return new cmf((frt) qdcVar.D(I, l13Var20, set), (wst) qdcVar.D(hag.I(wst.class), l13Var20, set));
                            case 3:
                                l13Var20.getClass();
                                return new hta();
                            case 4:
                                l13Var20.getClass();
                                return new jck();
                            case 5:
                                l13Var20.getClass();
                                return new doq();
                            case 6:
                                l13Var20.getClass();
                                l18 l18Var = l18.b;
                                bdt I2 = hag.I(Context.class);
                                qdc qdcVar2 = l18Var.a;
                                qdcVar2.getClass();
                                return new m4d((Context) qdcVar2.C(I2));
                            case 7:
                                l13Var20.getClass();
                                return new eoq();
                            case 8:
                                l13Var20.getClass();
                                return new foq(l13Var20);
                            case 9:
                                l13Var20.getClass();
                                return new vg6();
                            case 10:
                                l13Var20.getClass();
                                bdt I3 = hag.I(Context.class);
                                qdc qdcVar3 = l13Var20.a;
                                Set set2 = l13Var20.b;
                                File cacheDir = ((Context) qdcVar3.D(I3, l13Var20, set2)).getCacheDir();
                                cacheDir.getClass();
                                kpm kpmVar = new kpm(cacheDir);
                                jyr jyrVar = tpq.e;
                                jyr jyrVar2 = dvu.e;
                                boolean d = kwl.d();
                                spq w = t7g.w();
                                return new upq(kpmVar, w != null ? spq.a(w, d, null, 123) : null, (i0j) qdcVar3.D(hag.I(i0j.class), l13Var20, set2), (uyt) qdcVar3.D(hag.I(uyt.class), l13Var20, set2), (z66) qdcVar3.D(hag.I(z66.class), l13Var20, set2), (t70) qdcVar3.D(hag.I(t70.class), l13Var20, set2));
                            case 11:
                                l13Var20.getClass();
                                return new goq(l13Var20);
                            case 12:
                                l13Var20.getClass();
                                return new hoq(l13Var20);
                            case 13:
                                l13Var20.getClass();
                                return new ioq(l13Var20);
                            case 14:
                                l13Var20.getClass();
                                return new jqq();
                            case 15:
                                l13Var20.getClass();
                                return new r1b();
                            case 16:
                                l13Var20.getClass();
                                return new xdf();
                            case 17:
                                l13Var20.getClass();
                                return new uff();
                            case 18:
                                l13Var20.getClass();
                                return new tff();
                            case 19:
                                l13Var20.getClass();
                                return new joq();
                            case 20:
                                l13Var20.getClass();
                                return new koq();
                            case 21:
                                l13Var20.getClass();
                                return new ynq();
                            case 22:
                                l13Var20.getClass();
                                bdt I4 = hag.I(Context.class);
                                qdc qdcVar4 = l13Var20.a;
                                Set set3 = l13Var20.b;
                                return new jfr((Context) qdcVar4.D(I4, l13Var20, set3), (cpr) qdcVar4.D(hag.I(cpr.class), l13Var20, set3));
                            case 23:
                                l13Var20.getClass();
                                return new aw8((oy2) l13Var20.a.D(hag.I(oy2.class), l13Var20, l13Var20.b));
                            case 24:
                                l13Var20.getClass();
                                return new loq(l13Var20);
                            case 25:
                                l13Var20.getClass();
                                return new moq((qy2) l13Var20.a.D(hag.I(qy2.class), l13Var20, l13Var20.b), l13Var20);
                            case 26:
                                l13Var20.getClass();
                                return new b14();
                            case 27:
                                l13Var20.getClass();
                                return new ud(l13Var20.b(hag.I(oi5.class), true), l13Var20.b(hag.I(pi5.class), true));
                            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                                l13Var20.getClass();
                                return new yzp();
                            default:
                                l13Var20.getClass();
                                return new bg4((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                        }
                    }
                });
                o18Var.c = hag.I(r1b.class);
                rp7Var.getClass();
                final int i20 = 15;
                rp7Var.D(new Function1() { // from class: wnq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        l13 l13Var20 = (l13) obj2;
                        switch (i20) {
                            case 0:
                                l13Var20.getClass();
                                return new hsj((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                            case 1:
                                l13Var20.getClass();
                                return new aaj();
                            case 2:
                                l13Var20.getClass();
                                bdt I = hag.I(frt.class);
                                qdc qdcVar = l13Var20.a;
                                Set set = l13Var20.b;
                                return new cmf((frt) qdcVar.D(I, l13Var20, set), (wst) qdcVar.D(hag.I(wst.class), l13Var20, set));
                            case 3:
                                l13Var20.getClass();
                                return new hta();
                            case 4:
                                l13Var20.getClass();
                                return new jck();
                            case 5:
                                l13Var20.getClass();
                                return new doq();
                            case 6:
                                l13Var20.getClass();
                                l18 l18Var = l18.b;
                                bdt I2 = hag.I(Context.class);
                                qdc qdcVar2 = l18Var.a;
                                qdcVar2.getClass();
                                return new m4d((Context) qdcVar2.C(I2));
                            case 7:
                                l13Var20.getClass();
                                return new eoq();
                            case 8:
                                l13Var20.getClass();
                                return new foq(l13Var20);
                            case 9:
                                l13Var20.getClass();
                                return new vg6();
                            case 10:
                                l13Var20.getClass();
                                bdt I3 = hag.I(Context.class);
                                qdc qdcVar3 = l13Var20.a;
                                Set set2 = l13Var20.b;
                                File cacheDir = ((Context) qdcVar3.D(I3, l13Var20, set2)).getCacheDir();
                                cacheDir.getClass();
                                kpm kpmVar = new kpm(cacheDir);
                                jyr jyrVar = tpq.e;
                                jyr jyrVar2 = dvu.e;
                                boolean d = kwl.d();
                                spq w = t7g.w();
                                return new upq(kpmVar, w != null ? spq.a(w, d, null, 123) : null, (i0j) qdcVar3.D(hag.I(i0j.class), l13Var20, set2), (uyt) qdcVar3.D(hag.I(uyt.class), l13Var20, set2), (z66) qdcVar3.D(hag.I(z66.class), l13Var20, set2), (t70) qdcVar3.D(hag.I(t70.class), l13Var20, set2));
                            case 11:
                                l13Var20.getClass();
                                return new goq(l13Var20);
                            case 12:
                                l13Var20.getClass();
                                return new hoq(l13Var20);
                            case 13:
                                l13Var20.getClass();
                                return new ioq(l13Var20);
                            case 14:
                                l13Var20.getClass();
                                return new jqq();
                            case 15:
                                l13Var20.getClass();
                                return new r1b();
                            case 16:
                                l13Var20.getClass();
                                return new xdf();
                            case 17:
                                l13Var20.getClass();
                                return new uff();
                            case 18:
                                l13Var20.getClass();
                                return new tff();
                            case 19:
                                l13Var20.getClass();
                                return new joq();
                            case 20:
                                l13Var20.getClass();
                                return new koq();
                            case 21:
                                l13Var20.getClass();
                                return new ynq();
                            case 22:
                                l13Var20.getClass();
                                bdt I4 = hag.I(Context.class);
                                qdc qdcVar4 = l13Var20.a;
                                Set set3 = l13Var20.b;
                                return new jfr((Context) qdcVar4.D(I4, l13Var20, set3), (cpr) qdcVar4.D(hag.I(cpr.class), l13Var20, set3));
                            case 23:
                                l13Var20.getClass();
                                return new aw8((oy2) l13Var20.a.D(hag.I(oy2.class), l13Var20, l13Var20.b));
                            case 24:
                                l13Var20.getClass();
                                return new loq(l13Var20);
                            case 25:
                                l13Var20.getClass();
                                return new moq((qy2) l13Var20.a.D(hag.I(qy2.class), l13Var20, l13Var20.b), l13Var20);
                            case 26:
                                l13Var20.getClass();
                                return new b14();
                            case 27:
                                l13Var20.getClass();
                                return new ud(l13Var20.b(hag.I(oi5.class), true), l13Var20.b(hag.I(pi5.class), true));
                            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                                l13Var20.getClass();
                                return new yzp();
                            default:
                                l13Var20.getClass();
                                return new bg4((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                        }
                    }
                });
                o18Var.c = hag.I(xdf.class);
                rp7Var.getClass();
                final int i21 = 16;
                rp7Var.D(new Function1() { // from class: wnq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        l13 l13Var20 = (l13) obj2;
                        switch (i21) {
                            case 0:
                                l13Var20.getClass();
                                return new hsj((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                            case 1:
                                l13Var20.getClass();
                                return new aaj();
                            case 2:
                                l13Var20.getClass();
                                bdt I = hag.I(frt.class);
                                qdc qdcVar = l13Var20.a;
                                Set set = l13Var20.b;
                                return new cmf((frt) qdcVar.D(I, l13Var20, set), (wst) qdcVar.D(hag.I(wst.class), l13Var20, set));
                            case 3:
                                l13Var20.getClass();
                                return new hta();
                            case 4:
                                l13Var20.getClass();
                                return new jck();
                            case 5:
                                l13Var20.getClass();
                                return new doq();
                            case 6:
                                l13Var20.getClass();
                                l18 l18Var = l18.b;
                                bdt I2 = hag.I(Context.class);
                                qdc qdcVar2 = l18Var.a;
                                qdcVar2.getClass();
                                return new m4d((Context) qdcVar2.C(I2));
                            case 7:
                                l13Var20.getClass();
                                return new eoq();
                            case 8:
                                l13Var20.getClass();
                                return new foq(l13Var20);
                            case 9:
                                l13Var20.getClass();
                                return new vg6();
                            case 10:
                                l13Var20.getClass();
                                bdt I3 = hag.I(Context.class);
                                qdc qdcVar3 = l13Var20.a;
                                Set set2 = l13Var20.b;
                                File cacheDir = ((Context) qdcVar3.D(I3, l13Var20, set2)).getCacheDir();
                                cacheDir.getClass();
                                kpm kpmVar = new kpm(cacheDir);
                                jyr jyrVar = tpq.e;
                                jyr jyrVar2 = dvu.e;
                                boolean d = kwl.d();
                                spq w = t7g.w();
                                return new upq(kpmVar, w != null ? spq.a(w, d, null, 123) : null, (i0j) qdcVar3.D(hag.I(i0j.class), l13Var20, set2), (uyt) qdcVar3.D(hag.I(uyt.class), l13Var20, set2), (z66) qdcVar3.D(hag.I(z66.class), l13Var20, set2), (t70) qdcVar3.D(hag.I(t70.class), l13Var20, set2));
                            case 11:
                                l13Var20.getClass();
                                return new goq(l13Var20);
                            case 12:
                                l13Var20.getClass();
                                return new hoq(l13Var20);
                            case 13:
                                l13Var20.getClass();
                                return new ioq(l13Var20);
                            case 14:
                                l13Var20.getClass();
                                return new jqq();
                            case 15:
                                l13Var20.getClass();
                                return new r1b();
                            case 16:
                                l13Var20.getClass();
                                return new xdf();
                            case 17:
                                l13Var20.getClass();
                                return new uff();
                            case 18:
                                l13Var20.getClass();
                                return new tff();
                            case 19:
                                l13Var20.getClass();
                                return new joq();
                            case 20:
                                l13Var20.getClass();
                                return new koq();
                            case 21:
                                l13Var20.getClass();
                                return new ynq();
                            case 22:
                                l13Var20.getClass();
                                bdt I4 = hag.I(Context.class);
                                qdc qdcVar4 = l13Var20.a;
                                Set set3 = l13Var20.b;
                                return new jfr((Context) qdcVar4.D(I4, l13Var20, set3), (cpr) qdcVar4.D(hag.I(cpr.class), l13Var20, set3));
                            case 23:
                                l13Var20.getClass();
                                return new aw8((oy2) l13Var20.a.D(hag.I(oy2.class), l13Var20, l13Var20.b));
                            case 24:
                                l13Var20.getClass();
                                return new loq(l13Var20);
                            case 25:
                                l13Var20.getClass();
                                return new moq((qy2) l13Var20.a.D(hag.I(qy2.class), l13Var20, l13Var20.b), l13Var20);
                            case 26:
                                l13Var20.getClass();
                                return new b14();
                            case 27:
                                l13Var20.getClass();
                                return new ud(l13Var20.b(hag.I(oi5.class), true), l13Var20.b(hag.I(pi5.class), true));
                            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                                l13Var20.getClass();
                                return new yzp();
                            default:
                                l13Var20.getClass();
                                return new bg4((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                        }
                    }
                });
                o18Var.c = hag.I(uff.class);
                rp7Var.getClass();
                final int i22 = 17;
                rp7Var.D(new Function1() { // from class: wnq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        l13 l13Var20 = (l13) obj2;
                        switch (i22) {
                            case 0:
                                l13Var20.getClass();
                                return new hsj((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                            case 1:
                                l13Var20.getClass();
                                return new aaj();
                            case 2:
                                l13Var20.getClass();
                                bdt I = hag.I(frt.class);
                                qdc qdcVar = l13Var20.a;
                                Set set = l13Var20.b;
                                return new cmf((frt) qdcVar.D(I, l13Var20, set), (wst) qdcVar.D(hag.I(wst.class), l13Var20, set));
                            case 3:
                                l13Var20.getClass();
                                return new hta();
                            case 4:
                                l13Var20.getClass();
                                return new jck();
                            case 5:
                                l13Var20.getClass();
                                return new doq();
                            case 6:
                                l13Var20.getClass();
                                l18 l18Var = l18.b;
                                bdt I2 = hag.I(Context.class);
                                qdc qdcVar2 = l18Var.a;
                                qdcVar2.getClass();
                                return new m4d((Context) qdcVar2.C(I2));
                            case 7:
                                l13Var20.getClass();
                                return new eoq();
                            case 8:
                                l13Var20.getClass();
                                return new foq(l13Var20);
                            case 9:
                                l13Var20.getClass();
                                return new vg6();
                            case 10:
                                l13Var20.getClass();
                                bdt I3 = hag.I(Context.class);
                                qdc qdcVar3 = l13Var20.a;
                                Set set2 = l13Var20.b;
                                File cacheDir = ((Context) qdcVar3.D(I3, l13Var20, set2)).getCacheDir();
                                cacheDir.getClass();
                                kpm kpmVar = new kpm(cacheDir);
                                jyr jyrVar = tpq.e;
                                jyr jyrVar2 = dvu.e;
                                boolean d = kwl.d();
                                spq w = t7g.w();
                                return new upq(kpmVar, w != null ? spq.a(w, d, null, 123) : null, (i0j) qdcVar3.D(hag.I(i0j.class), l13Var20, set2), (uyt) qdcVar3.D(hag.I(uyt.class), l13Var20, set2), (z66) qdcVar3.D(hag.I(z66.class), l13Var20, set2), (t70) qdcVar3.D(hag.I(t70.class), l13Var20, set2));
                            case 11:
                                l13Var20.getClass();
                                return new goq(l13Var20);
                            case 12:
                                l13Var20.getClass();
                                return new hoq(l13Var20);
                            case 13:
                                l13Var20.getClass();
                                return new ioq(l13Var20);
                            case 14:
                                l13Var20.getClass();
                                return new jqq();
                            case 15:
                                l13Var20.getClass();
                                return new r1b();
                            case 16:
                                l13Var20.getClass();
                                return new xdf();
                            case 17:
                                l13Var20.getClass();
                                return new uff();
                            case 18:
                                l13Var20.getClass();
                                return new tff();
                            case 19:
                                l13Var20.getClass();
                                return new joq();
                            case 20:
                                l13Var20.getClass();
                                return new koq();
                            case 21:
                                l13Var20.getClass();
                                return new ynq();
                            case 22:
                                l13Var20.getClass();
                                bdt I4 = hag.I(Context.class);
                                qdc qdcVar4 = l13Var20.a;
                                Set set3 = l13Var20.b;
                                return new jfr((Context) qdcVar4.D(I4, l13Var20, set3), (cpr) qdcVar4.D(hag.I(cpr.class), l13Var20, set3));
                            case 23:
                                l13Var20.getClass();
                                return new aw8((oy2) l13Var20.a.D(hag.I(oy2.class), l13Var20, l13Var20.b));
                            case 24:
                                l13Var20.getClass();
                                return new loq(l13Var20);
                            case 25:
                                l13Var20.getClass();
                                return new moq((qy2) l13Var20.a.D(hag.I(qy2.class), l13Var20, l13Var20.b), l13Var20);
                            case 26:
                                l13Var20.getClass();
                                return new b14();
                            case 27:
                                l13Var20.getClass();
                                return new ud(l13Var20.b(hag.I(oi5.class), true), l13Var20.b(hag.I(pi5.class), true));
                            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                                l13Var20.getClass();
                                return new yzp();
                            default:
                                l13Var20.getClass();
                                return new bg4((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                        }
                    }
                });
                o18Var.c = hag.I(tff.class);
                rp7Var.getClass();
                final int i23 = 18;
                rp7Var.D(new Function1() { // from class: wnq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        l13 l13Var20 = (l13) obj2;
                        switch (i23) {
                            case 0:
                                l13Var20.getClass();
                                return new hsj((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                            case 1:
                                l13Var20.getClass();
                                return new aaj();
                            case 2:
                                l13Var20.getClass();
                                bdt I = hag.I(frt.class);
                                qdc qdcVar = l13Var20.a;
                                Set set = l13Var20.b;
                                return new cmf((frt) qdcVar.D(I, l13Var20, set), (wst) qdcVar.D(hag.I(wst.class), l13Var20, set));
                            case 3:
                                l13Var20.getClass();
                                return new hta();
                            case 4:
                                l13Var20.getClass();
                                return new jck();
                            case 5:
                                l13Var20.getClass();
                                return new doq();
                            case 6:
                                l13Var20.getClass();
                                l18 l18Var = l18.b;
                                bdt I2 = hag.I(Context.class);
                                qdc qdcVar2 = l18Var.a;
                                qdcVar2.getClass();
                                return new m4d((Context) qdcVar2.C(I2));
                            case 7:
                                l13Var20.getClass();
                                return new eoq();
                            case 8:
                                l13Var20.getClass();
                                return new foq(l13Var20);
                            case 9:
                                l13Var20.getClass();
                                return new vg6();
                            case 10:
                                l13Var20.getClass();
                                bdt I3 = hag.I(Context.class);
                                qdc qdcVar3 = l13Var20.a;
                                Set set2 = l13Var20.b;
                                File cacheDir = ((Context) qdcVar3.D(I3, l13Var20, set2)).getCacheDir();
                                cacheDir.getClass();
                                kpm kpmVar = new kpm(cacheDir);
                                jyr jyrVar = tpq.e;
                                jyr jyrVar2 = dvu.e;
                                boolean d = kwl.d();
                                spq w = t7g.w();
                                return new upq(kpmVar, w != null ? spq.a(w, d, null, 123) : null, (i0j) qdcVar3.D(hag.I(i0j.class), l13Var20, set2), (uyt) qdcVar3.D(hag.I(uyt.class), l13Var20, set2), (z66) qdcVar3.D(hag.I(z66.class), l13Var20, set2), (t70) qdcVar3.D(hag.I(t70.class), l13Var20, set2));
                            case 11:
                                l13Var20.getClass();
                                return new goq(l13Var20);
                            case 12:
                                l13Var20.getClass();
                                return new hoq(l13Var20);
                            case 13:
                                l13Var20.getClass();
                                return new ioq(l13Var20);
                            case 14:
                                l13Var20.getClass();
                                return new jqq();
                            case 15:
                                l13Var20.getClass();
                                return new r1b();
                            case 16:
                                l13Var20.getClass();
                                return new xdf();
                            case 17:
                                l13Var20.getClass();
                                return new uff();
                            case 18:
                                l13Var20.getClass();
                                return new tff();
                            case 19:
                                l13Var20.getClass();
                                return new joq();
                            case 20:
                                l13Var20.getClass();
                                return new koq();
                            case 21:
                                l13Var20.getClass();
                                return new ynq();
                            case 22:
                                l13Var20.getClass();
                                bdt I4 = hag.I(Context.class);
                                qdc qdcVar4 = l13Var20.a;
                                Set set3 = l13Var20.b;
                                return new jfr((Context) qdcVar4.D(I4, l13Var20, set3), (cpr) qdcVar4.D(hag.I(cpr.class), l13Var20, set3));
                            case 23:
                                l13Var20.getClass();
                                return new aw8((oy2) l13Var20.a.D(hag.I(oy2.class), l13Var20, l13Var20.b));
                            case 24:
                                l13Var20.getClass();
                                return new loq(l13Var20);
                            case 25:
                                l13Var20.getClass();
                                return new moq((qy2) l13Var20.a.D(hag.I(qy2.class), l13Var20, l13Var20.b), l13Var20);
                            case 26:
                                l13Var20.getClass();
                                return new b14();
                            case 27:
                                l13Var20.getClass();
                                return new ud(l13Var20.b(hag.I(oi5.class), true), l13Var20.b(hag.I(pi5.class), true));
                            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                                l13Var20.getClass();
                                return new yzp();
                            default:
                                l13Var20.getClass();
                                return new bg4((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                        }
                    }
                });
                o18Var.c = hag.I(joq.class);
                rp7Var.getClass();
                final int i24 = 19;
                rp7Var.D(new Function1() { // from class: wnq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        l13 l13Var20 = (l13) obj2;
                        switch (i24) {
                            case 0:
                                l13Var20.getClass();
                                return new hsj((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                            case 1:
                                l13Var20.getClass();
                                return new aaj();
                            case 2:
                                l13Var20.getClass();
                                bdt I = hag.I(frt.class);
                                qdc qdcVar = l13Var20.a;
                                Set set = l13Var20.b;
                                return new cmf((frt) qdcVar.D(I, l13Var20, set), (wst) qdcVar.D(hag.I(wst.class), l13Var20, set));
                            case 3:
                                l13Var20.getClass();
                                return new hta();
                            case 4:
                                l13Var20.getClass();
                                return new jck();
                            case 5:
                                l13Var20.getClass();
                                return new doq();
                            case 6:
                                l13Var20.getClass();
                                l18 l18Var = l18.b;
                                bdt I2 = hag.I(Context.class);
                                qdc qdcVar2 = l18Var.a;
                                qdcVar2.getClass();
                                return new m4d((Context) qdcVar2.C(I2));
                            case 7:
                                l13Var20.getClass();
                                return new eoq();
                            case 8:
                                l13Var20.getClass();
                                return new foq(l13Var20);
                            case 9:
                                l13Var20.getClass();
                                return new vg6();
                            case 10:
                                l13Var20.getClass();
                                bdt I3 = hag.I(Context.class);
                                qdc qdcVar3 = l13Var20.a;
                                Set set2 = l13Var20.b;
                                File cacheDir = ((Context) qdcVar3.D(I3, l13Var20, set2)).getCacheDir();
                                cacheDir.getClass();
                                kpm kpmVar = new kpm(cacheDir);
                                jyr jyrVar = tpq.e;
                                jyr jyrVar2 = dvu.e;
                                boolean d = kwl.d();
                                spq w = t7g.w();
                                return new upq(kpmVar, w != null ? spq.a(w, d, null, 123) : null, (i0j) qdcVar3.D(hag.I(i0j.class), l13Var20, set2), (uyt) qdcVar3.D(hag.I(uyt.class), l13Var20, set2), (z66) qdcVar3.D(hag.I(z66.class), l13Var20, set2), (t70) qdcVar3.D(hag.I(t70.class), l13Var20, set2));
                            case 11:
                                l13Var20.getClass();
                                return new goq(l13Var20);
                            case 12:
                                l13Var20.getClass();
                                return new hoq(l13Var20);
                            case 13:
                                l13Var20.getClass();
                                return new ioq(l13Var20);
                            case 14:
                                l13Var20.getClass();
                                return new jqq();
                            case 15:
                                l13Var20.getClass();
                                return new r1b();
                            case 16:
                                l13Var20.getClass();
                                return new xdf();
                            case 17:
                                l13Var20.getClass();
                                return new uff();
                            case 18:
                                l13Var20.getClass();
                                return new tff();
                            case 19:
                                l13Var20.getClass();
                                return new joq();
                            case 20:
                                l13Var20.getClass();
                                return new koq();
                            case 21:
                                l13Var20.getClass();
                                return new ynq();
                            case 22:
                                l13Var20.getClass();
                                bdt I4 = hag.I(Context.class);
                                qdc qdcVar4 = l13Var20.a;
                                Set set3 = l13Var20.b;
                                return new jfr((Context) qdcVar4.D(I4, l13Var20, set3), (cpr) qdcVar4.D(hag.I(cpr.class), l13Var20, set3));
                            case 23:
                                l13Var20.getClass();
                                return new aw8((oy2) l13Var20.a.D(hag.I(oy2.class), l13Var20, l13Var20.b));
                            case 24:
                                l13Var20.getClass();
                                return new loq(l13Var20);
                            case 25:
                                l13Var20.getClass();
                                return new moq((qy2) l13Var20.a.D(hag.I(qy2.class), l13Var20, l13Var20.b), l13Var20);
                            case 26:
                                l13Var20.getClass();
                                return new b14();
                            case 27:
                                l13Var20.getClass();
                                return new ud(l13Var20.b(hag.I(oi5.class), true), l13Var20.b(hag.I(pi5.class), true));
                            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                                l13Var20.getClass();
                                return new yzp();
                            default:
                                l13Var20.getClass();
                                return new bg4((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                        }
                    }
                });
                o18Var.c = hag.I(koq.class);
                rp7Var.getClass();
                final int i25 = 20;
                rp7Var.D(new Function1() { // from class: wnq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        l13 l13Var20 = (l13) obj2;
                        switch (i25) {
                            case 0:
                                l13Var20.getClass();
                                return new hsj((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                            case 1:
                                l13Var20.getClass();
                                return new aaj();
                            case 2:
                                l13Var20.getClass();
                                bdt I = hag.I(frt.class);
                                qdc qdcVar = l13Var20.a;
                                Set set = l13Var20.b;
                                return new cmf((frt) qdcVar.D(I, l13Var20, set), (wst) qdcVar.D(hag.I(wst.class), l13Var20, set));
                            case 3:
                                l13Var20.getClass();
                                return new hta();
                            case 4:
                                l13Var20.getClass();
                                return new jck();
                            case 5:
                                l13Var20.getClass();
                                return new doq();
                            case 6:
                                l13Var20.getClass();
                                l18 l18Var = l18.b;
                                bdt I2 = hag.I(Context.class);
                                qdc qdcVar2 = l18Var.a;
                                qdcVar2.getClass();
                                return new m4d((Context) qdcVar2.C(I2));
                            case 7:
                                l13Var20.getClass();
                                return new eoq();
                            case 8:
                                l13Var20.getClass();
                                return new foq(l13Var20);
                            case 9:
                                l13Var20.getClass();
                                return new vg6();
                            case 10:
                                l13Var20.getClass();
                                bdt I3 = hag.I(Context.class);
                                qdc qdcVar3 = l13Var20.a;
                                Set set2 = l13Var20.b;
                                File cacheDir = ((Context) qdcVar3.D(I3, l13Var20, set2)).getCacheDir();
                                cacheDir.getClass();
                                kpm kpmVar = new kpm(cacheDir);
                                jyr jyrVar = tpq.e;
                                jyr jyrVar2 = dvu.e;
                                boolean d = kwl.d();
                                spq w = t7g.w();
                                return new upq(kpmVar, w != null ? spq.a(w, d, null, 123) : null, (i0j) qdcVar3.D(hag.I(i0j.class), l13Var20, set2), (uyt) qdcVar3.D(hag.I(uyt.class), l13Var20, set2), (z66) qdcVar3.D(hag.I(z66.class), l13Var20, set2), (t70) qdcVar3.D(hag.I(t70.class), l13Var20, set2));
                            case 11:
                                l13Var20.getClass();
                                return new goq(l13Var20);
                            case 12:
                                l13Var20.getClass();
                                return new hoq(l13Var20);
                            case 13:
                                l13Var20.getClass();
                                return new ioq(l13Var20);
                            case 14:
                                l13Var20.getClass();
                                return new jqq();
                            case 15:
                                l13Var20.getClass();
                                return new r1b();
                            case 16:
                                l13Var20.getClass();
                                return new xdf();
                            case 17:
                                l13Var20.getClass();
                                return new uff();
                            case 18:
                                l13Var20.getClass();
                                return new tff();
                            case 19:
                                l13Var20.getClass();
                                return new joq();
                            case 20:
                                l13Var20.getClass();
                                return new koq();
                            case 21:
                                l13Var20.getClass();
                                return new ynq();
                            case 22:
                                l13Var20.getClass();
                                bdt I4 = hag.I(Context.class);
                                qdc qdcVar4 = l13Var20.a;
                                Set set3 = l13Var20.b;
                                return new jfr((Context) qdcVar4.D(I4, l13Var20, set3), (cpr) qdcVar4.D(hag.I(cpr.class), l13Var20, set3));
                            case 23:
                                l13Var20.getClass();
                                return new aw8((oy2) l13Var20.a.D(hag.I(oy2.class), l13Var20, l13Var20.b));
                            case 24:
                                l13Var20.getClass();
                                return new loq(l13Var20);
                            case 25:
                                l13Var20.getClass();
                                return new moq((qy2) l13Var20.a.D(hag.I(qy2.class), l13Var20, l13Var20.b), l13Var20);
                            case 26:
                                l13Var20.getClass();
                                return new b14();
                            case 27:
                                l13Var20.getClass();
                                return new ud(l13Var20.b(hag.I(oi5.class), true), l13Var20.b(hag.I(pi5.class), true));
                            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                                l13Var20.getClass();
                                return new yzp();
                            default:
                                l13Var20.getClass();
                                return new bg4((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                        }
                    }
                });
                o18Var.c = hag.I(ifr.class);
                rp7Var.getClass();
                final int i26 = 22;
                rp7Var.D(new Function1() { // from class: wnq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        l13 l13Var20 = (l13) obj2;
                        switch (i26) {
                            case 0:
                                l13Var20.getClass();
                                return new hsj((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                            case 1:
                                l13Var20.getClass();
                                return new aaj();
                            case 2:
                                l13Var20.getClass();
                                bdt I = hag.I(frt.class);
                                qdc qdcVar = l13Var20.a;
                                Set set = l13Var20.b;
                                return new cmf((frt) qdcVar.D(I, l13Var20, set), (wst) qdcVar.D(hag.I(wst.class), l13Var20, set));
                            case 3:
                                l13Var20.getClass();
                                return new hta();
                            case 4:
                                l13Var20.getClass();
                                return new jck();
                            case 5:
                                l13Var20.getClass();
                                return new doq();
                            case 6:
                                l13Var20.getClass();
                                l18 l18Var = l18.b;
                                bdt I2 = hag.I(Context.class);
                                qdc qdcVar2 = l18Var.a;
                                qdcVar2.getClass();
                                return new m4d((Context) qdcVar2.C(I2));
                            case 7:
                                l13Var20.getClass();
                                return new eoq();
                            case 8:
                                l13Var20.getClass();
                                return new foq(l13Var20);
                            case 9:
                                l13Var20.getClass();
                                return new vg6();
                            case 10:
                                l13Var20.getClass();
                                bdt I3 = hag.I(Context.class);
                                qdc qdcVar3 = l13Var20.a;
                                Set set2 = l13Var20.b;
                                File cacheDir = ((Context) qdcVar3.D(I3, l13Var20, set2)).getCacheDir();
                                cacheDir.getClass();
                                kpm kpmVar = new kpm(cacheDir);
                                jyr jyrVar = tpq.e;
                                jyr jyrVar2 = dvu.e;
                                boolean d = kwl.d();
                                spq w = t7g.w();
                                return new upq(kpmVar, w != null ? spq.a(w, d, null, 123) : null, (i0j) qdcVar3.D(hag.I(i0j.class), l13Var20, set2), (uyt) qdcVar3.D(hag.I(uyt.class), l13Var20, set2), (z66) qdcVar3.D(hag.I(z66.class), l13Var20, set2), (t70) qdcVar3.D(hag.I(t70.class), l13Var20, set2));
                            case 11:
                                l13Var20.getClass();
                                return new goq(l13Var20);
                            case 12:
                                l13Var20.getClass();
                                return new hoq(l13Var20);
                            case 13:
                                l13Var20.getClass();
                                return new ioq(l13Var20);
                            case 14:
                                l13Var20.getClass();
                                return new jqq();
                            case 15:
                                l13Var20.getClass();
                                return new r1b();
                            case 16:
                                l13Var20.getClass();
                                return new xdf();
                            case 17:
                                l13Var20.getClass();
                                return new uff();
                            case 18:
                                l13Var20.getClass();
                                return new tff();
                            case 19:
                                l13Var20.getClass();
                                return new joq();
                            case 20:
                                l13Var20.getClass();
                                return new koq();
                            case 21:
                                l13Var20.getClass();
                                return new ynq();
                            case 22:
                                l13Var20.getClass();
                                bdt I4 = hag.I(Context.class);
                                qdc qdcVar4 = l13Var20.a;
                                Set set3 = l13Var20.b;
                                return new jfr((Context) qdcVar4.D(I4, l13Var20, set3), (cpr) qdcVar4.D(hag.I(cpr.class), l13Var20, set3));
                            case 23:
                                l13Var20.getClass();
                                return new aw8((oy2) l13Var20.a.D(hag.I(oy2.class), l13Var20, l13Var20.b));
                            case 24:
                                l13Var20.getClass();
                                return new loq(l13Var20);
                            case 25:
                                l13Var20.getClass();
                                return new moq((qy2) l13Var20.a.D(hag.I(qy2.class), l13Var20, l13Var20.b), l13Var20);
                            case 26:
                                l13Var20.getClass();
                                return new b14();
                            case 27:
                                l13Var20.getClass();
                                return new ud(l13Var20.b(hag.I(oi5.class), true), l13Var20.b(hag.I(pi5.class), true));
                            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                                l13Var20.getClass();
                                return new yzp();
                            default:
                                l13Var20.getClass();
                                return new bg4((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                        }
                    }
                });
                o18Var.c = hag.I(aw8.class);
                rp7Var.getClass();
                final int i27 = 23;
                rp7Var.D(new Function1() { // from class: wnq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        l13 l13Var20 = (l13) obj2;
                        switch (i27) {
                            case 0:
                                l13Var20.getClass();
                                return new hsj((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                            case 1:
                                l13Var20.getClass();
                                return new aaj();
                            case 2:
                                l13Var20.getClass();
                                bdt I = hag.I(frt.class);
                                qdc qdcVar = l13Var20.a;
                                Set set = l13Var20.b;
                                return new cmf((frt) qdcVar.D(I, l13Var20, set), (wst) qdcVar.D(hag.I(wst.class), l13Var20, set));
                            case 3:
                                l13Var20.getClass();
                                return new hta();
                            case 4:
                                l13Var20.getClass();
                                return new jck();
                            case 5:
                                l13Var20.getClass();
                                return new doq();
                            case 6:
                                l13Var20.getClass();
                                l18 l18Var = l18.b;
                                bdt I2 = hag.I(Context.class);
                                qdc qdcVar2 = l18Var.a;
                                qdcVar2.getClass();
                                return new m4d((Context) qdcVar2.C(I2));
                            case 7:
                                l13Var20.getClass();
                                return new eoq();
                            case 8:
                                l13Var20.getClass();
                                return new foq(l13Var20);
                            case 9:
                                l13Var20.getClass();
                                return new vg6();
                            case 10:
                                l13Var20.getClass();
                                bdt I3 = hag.I(Context.class);
                                qdc qdcVar3 = l13Var20.a;
                                Set set2 = l13Var20.b;
                                File cacheDir = ((Context) qdcVar3.D(I3, l13Var20, set2)).getCacheDir();
                                cacheDir.getClass();
                                kpm kpmVar = new kpm(cacheDir);
                                jyr jyrVar = tpq.e;
                                jyr jyrVar2 = dvu.e;
                                boolean d = kwl.d();
                                spq w = t7g.w();
                                return new upq(kpmVar, w != null ? spq.a(w, d, null, 123) : null, (i0j) qdcVar3.D(hag.I(i0j.class), l13Var20, set2), (uyt) qdcVar3.D(hag.I(uyt.class), l13Var20, set2), (z66) qdcVar3.D(hag.I(z66.class), l13Var20, set2), (t70) qdcVar3.D(hag.I(t70.class), l13Var20, set2));
                            case 11:
                                l13Var20.getClass();
                                return new goq(l13Var20);
                            case 12:
                                l13Var20.getClass();
                                return new hoq(l13Var20);
                            case 13:
                                l13Var20.getClass();
                                return new ioq(l13Var20);
                            case 14:
                                l13Var20.getClass();
                                return new jqq();
                            case 15:
                                l13Var20.getClass();
                                return new r1b();
                            case 16:
                                l13Var20.getClass();
                                return new xdf();
                            case 17:
                                l13Var20.getClass();
                                return new uff();
                            case 18:
                                l13Var20.getClass();
                                return new tff();
                            case 19:
                                l13Var20.getClass();
                                return new joq();
                            case 20:
                                l13Var20.getClass();
                                return new koq();
                            case 21:
                                l13Var20.getClass();
                                return new ynq();
                            case 22:
                                l13Var20.getClass();
                                bdt I4 = hag.I(Context.class);
                                qdc qdcVar4 = l13Var20.a;
                                Set set3 = l13Var20.b;
                                return new jfr((Context) qdcVar4.D(I4, l13Var20, set3), (cpr) qdcVar4.D(hag.I(cpr.class), l13Var20, set3));
                            case 23:
                                l13Var20.getClass();
                                return new aw8((oy2) l13Var20.a.D(hag.I(oy2.class), l13Var20, l13Var20.b));
                            case 24:
                                l13Var20.getClass();
                                return new loq(l13Var20);
                            case 25:
                                l13Var20.getClass();
                                return new moq((qy2) l13Var20.a.D(hag.I(qy2.class), l13Var20, l13Var20.b), l13Var20);
                            case 26:
                                l13Var20.getClass();
                                return new b14();
                            case 27:
                                l13Var20.getClass();
                                return new ud(l13Var20.b(hag.I(oi5.class), true), l13Var20.b(hag.I(pi5.class), true));
                            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                                l13Var20.getClass();
                                return new yzp();
                            default:
                                l13Var20.getClass();
                                return new bg4((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                        }
                    }
                });
                o18Var.c = hag.I(loq.class);
                rp7Var.getClass();
                final int i28 = 24;
                rp7Var.D(new Function1() { // from class: wnq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        l13 l13Var20 = (l13) obj2;
                        switch (i28) {
                            case 0:
                                l13Var20.getClass();
                                return new hsj((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                            case 1:
                                l13Var20.getClass();
                                return new aaj();
                            case 2:
                                l13Var20.getClass();
                                bdt I = hag.I(frt.class);
                                qdc qdcVar = l13Var20.a;
                                Set set = l13Var20.b;
                                return new cmf((frt) qdcVar.D(I, l13Var20, set), (wst) qdcVar.D(hag.I(wst.class), l13Var20, set));
                            case 3:
                                l13Var20.getClass();
                                return new hta();
                            case 4:
                                l13Var20.getClass();
                                return new jck();
                            case 5:
                                l13Var20.getClass();
                                return new doq();
                            case 6:
                                l13Var20.getClass();
                                l18 l18Var = l18.b;
                                bdt I2 = hag.I(Context.class);
                                qdc qdcVar2 = l18Var.a;
                                qdcVar2.getClass();
                                return new m4d((Context) qdcVar2.C(I2));
                            case 7:
                                l13Var20.getClass();
                                return new eoq();
                            case 8:
                                l13Var20.getClass();
                                return new foq(l13Var20);
                            case 9:
                                l13Var20.getClass();
                                return new vg6();
                            case 10:
                                l13Var20.getClass();
                                bdt I3 = hag.I(Context.class);
                                qdc qdcVar3 = l13Var20.a;
                                Set set2 = l13Var20.b;
                                File cacheDir = ((Context) qdcVar3.D(I3, l13Var20, set2)).getCacheDir();
                                cacheDir.getClass();
                                kpm kpmVar = new kpm(cacheDir);
                                jyr jyrVar = tpq.e;
                                jyr jyrVar2 = dvu.e;
                                boolean d = kwl.d();
                                spq w = t7g.w();
                                return new upq(kpmVar, w != null ? spq.a(w, d, null, 123) : null, (i0j) qdcVar3.D(hag.I(i0j.class), l13Var20, set2), (uyt) qdcVar3.D(hag.I(uyt.class), l13Var20, set2), (z66) qdcVar3.D(hag.I(z66.class), l13Var20, set2), (t70) qdcVar3.D(hag.I(t70.class), l13Var20, set2));
                            case 11:
                                l13Var20.getClass();
                                return new goq(l13Var20);
                            case 12:
                                l13Var20.getClass();
                                return new hoq(l13Var20);
                            case 13:
                                l13Var20.getClass();
                                return new ioq(l13Var20);
                            case 14:
                                l13Var20.getClass();
                                return new jqq();
                            case 15:
                                l13Var20.getClass();
                                return new r1b();
                            case 16:
                                l13Var20.getClass();
                                return new xdf();
                            case 17:
                                l13Var20.getClass();
                                return new uff();
                            case 18:
                                l13Var20.getClass();
                                return new tff();
                            case 19:
                                l13Var20.getClass();
                                return new joq();
                            case 20:
                                l13Var20.getClass();
                                return new koq();
                            case 21:
                                l13Var20.getClass();
                                return new ynq();
                            case 22:
                                l13Var20.getClass();
                                bdt I4 = hag.I(Context.class);
                                qdc qdcVar4 = l13Var20.a;
                                Set set3 = l13Var20.b;
                                return new jfr((Context) qdcVar4.D(I4, l13Var20, set3), (cpr) qdcVar4.D(hag.I(cpr.class), l13Var20, set3));
                            case 23:
                                l13Var20.getClass();
                                return new aw8((oy2) l13Var20.a.D(hag.I(oy2.class), l13Var20, l13Var20.b));
                            case 24:
                                l13Var20.getClass();
                                return new loq(l13Var20);
                            case 25:
                                l13Var20.getClass();
                                return new moq((qy2) l13Var20.a.D(hag.I(qy2.class), l13Var20, l13Var20.b), l13Var20);
                            case 26:
                                l13Var20.getClass();
                                return new b14();
                            case 27:
                                l13Var20.getClass();
                                return new ud(l13Var20.b(hag.I(oi5.class), true), l13Var20.b(hag.I(pi5.class), true));
                            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                                l13Var20.getClass();
                                return new yzp();
                            default:
                                l13Var20.getClass();
                                return new bg4((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                        }
                    }
                });
                o18Var.c = hag.I(moq.class);
                rp7Var.getClass();
                final int i29 = 25;
                rp7Var.D(new Function1() { // from class: wnq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        l13 l13Var20 = (l13) obj2;
                        switch (i29) {
                            case 0:
                                l13Var20.getClass();
                                return new hsj((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                            case 1:
                                l13Var20.getClass();
                                return new aaj();
                            case 2:
                                l13Var20.getClass();
                                bdt I = hag.I(frt.class);
                                qdc qdcVar = l13Var20.a;
                                Set set = l13Var20.b;
                                return new cmf((frt) qdcVar.D(I, l13Var20, set), (wst) qdcVar.D(hag.I(wst.class), l13Var20, set));
                            case 3:
                                l13Var20.getClass();
                                return new hta();
                            case 4:
                                l13Var20.getClass();
                                return new jck();
                            case 5:
                                l13Var20.getClass();
                                return new doq();
                            case 6:
                                l13Var20.getClass();
                                l18 l18Var = l18.b;
                                bdt I2 = hag.I(Context.class);
                                qdc qdcVar2 = l18Var.a;
                                qdcVar2.getClass();
                                return new m4d((Context) qdcVar2.C(I2));
                            case 7:
                                l13Var20.getClass();
                                return new eoq();
                            case 8:
                                l13Var20.getClass();
                                return new foq(l13Var20);
                            case 9:
                                l13Var20.getClass();
                                return new vg6();
                            case 10:
                                l13Var20.getClass();
                                bdt I3 = hag.I(Context.class);
                                qdc qdcVar3 = l13Var20.a;
                                Set set2 = l13Var20.b;
                                File cacheDir = ((Context) qdcVar3.D(I3, l13Var20, set2)).getCacheDir();
                                cacheDir.getClass();
                                kpm kpmVar = new kpm(cacheDir);
                                jyr jyrVar = tpq.e;
                                jyr jyrVar2 = dvu.e;
                                boolean d = kwl.d();
                                spq w = t7g.w();
                                return new upq(kpmVar, w != null ? spq.a(w, d, null, 123) : null, (i0j) qdcVar3.D(hag.I(i0j.class), l13Var20, set2), (uyt) qdcVar3.D(hag.I(uyt.class), l13Var20, set2), (z66) qdcVar3.D(hag.I(z66.class), l13Var20, set2), (t70) qdcVar3.D(hag.I(t70.class), l13Var20, set2));
                            case 11:
                                l13Var20.getClass();
                                return new goq(l13Var20);
                            case 12:
                                l13Var20.getClass();
                                return new hoq(l13Var20);
                            case 13:
                                l13Var20.getClass();
                                return new ioq(l13Var20);
                            case 14:
                                l13Var20.getClass();
                                return new jqq();
                            case 15:
                                l13Var20.getClass();
                                return new r1b();
                            case 16:
                                l13Var20.getClass();
                                return new xdf();
                            case 17:
                                l13Var20.getClass();
                                return new uff();
                            case 18:
                                l13Var20.getClass();
                                return new tff();
                            case 19:
                                l13Var20.getClass();
                                return new joq();
                            case 20:
                                l13Var20.getClass();
                                return new koq();
                            case 21:
                                l13Var20.getClass();
                                return new ynq();
                            case 22:
                                l13Var20.getClass();
                                bdt I4 = hag.I(Context.class);
                                qdc qdcVar4 = l13Var20.a;
                                Set set3 = l13Var20.b;
                                return new jfr((Context) qdcVar4.D(I4, l13Var20, set3), (cpr) qdcVar4.D(hag.I(cpr.class), l13Var20, set3));
                            case 23:
                                l13Var20.getClass();
                                return new aw8((oy2) l13Var20.a.D(hag.I(oy2.class), l13Var20, l13Var20.b));
                            case 24:
                                l13Var20.getClass();
                                return new loq(l13Var20);
                            case 25:
                                l13Var20.getClass();
                                return new moq((qy2) l13Var20.a.D(hag.I(qy2.class), l13Var20, l13Var20.b), l13Var20);
                            case 26:
                                l13Var20.getClass();
                                return new b14();
                            case 27:
                                l13Var20.getClass();
                                return new ud(l13Var20.b(hag.I(oi5.class), true), l13Var20.b(hag.I(pi5.class), true));
                            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                                l13Var20.getClass();
                                return new yzp();
                            default:
                                l13Var20.getClass();
                                return new bg4((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                        }
                    }
                });
                o18Var.c = hag.I(ud.class);
                rp7Var.getClass();
                final int i30 = 27;
                rp7Var.D(new Function1() { // from class: wnq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        l13 l13Var20 = (l13) obj2;
                        switch (i30) {
                            case 0:
                                l13Var20.getClass();
                                return new hsj((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                            case 1:
                                l13Var20.getClass();
                                return new aaj();
                            case 2:
                                l13Var20.getClass();
                                bdt I = hag.I(frt.class);
                                qdc qdcVar = l13Var20.a;
                                Set set = l13Var20.b;
                                return new cmf((frt) qdcVar.D(I, l13Var20, set), (wst) qdcVar.D(hag.I(wst.class), l13Var20, set));
                            case 3:
                                l13Var20.getClass();
                                return new hta();
                            case 4:
                                l13Var20.getClass();
                                return new jck();
                            case 5:
                                l13Var20.getClass();
                                return new doq();
                            case 6:
                                l13Var20.getClass();
                                l18 l18Var = l18.b;
                                bdt I2 = hag.I(Context.class);
                                qdc qdcVar2 = l18Var.a;
                                qdcVar2.getClass();
                                return new m4d((Context) qdcVar2.C(I2));
                            case 7:
                                l13Var20.getClass();
                                return new eoq();
                            case 8:
                                l13Var20.getClass();
                                return new foq(l13Var20);
                            case 9:
                                l13Var20.getClass();
                                return new vg6();
                            case 10:
                                l13Var20.getClass();
                                bdt I3 = hag.I(Context.class);
                                qdc qdcVar3 = l13Var20.a;
                                Set set2 = l13Var20.b;
                                File cacheDir = ((Context) qdcVar3.D(I3, l13Var20, set2)).getCacheDir();
                                cacheDir.getClass();
                                kpm kpmVar = new kpm(cacheDir);
                                jyr jyrVar = tpq.e;
                                jyr jyrVar2 = dvu.e;
                                boolean d = kwl.d();
                                spq w = t7g.w();
                                return new upq(kpmVar, w != null ? spq.a(w, d, null, 123) : null, (i0j) qdcVar3.D(hag.I(i0j.class), l13Var20, set2), (uyt) qdcVar3.D(hag.I(uyt.class), l13Var20, set2), (z66) qdcVar3.D(hag.I(z66.class), l13Var20, set2), (t70) qdcVar3.D(hag.I(t70.class), l13Var20, set2));
                            case 11:
                                l13Var20.getClass();
                                return new goq(l13Var20);
                            case 12:
                                l13Var20.getClass();
                                return new hoq(l13Var20);
                            case 13:
                                l13Var20.getClass();
                                return new ioq(l13Var20);
                            case 14:
                                l13Var20.getClass();
                                return new jqq();
                            case 15:
                                l13Var20.getClass();
                                return new r1b();
                            case 16:
                                l13Var20.getClass();
                                return new xdf();
                            case 17:
                                l13Var20.getClass();
                                return new uff();
                            case 18:
                                l13Var20.getClass();
                                return new tff();
                            case 19:
                                l13Var20.getClass();
                                return new joq();
                            case 20:
                                l13Var20.getClass();
                                return new koq();
                            case 21:
                                l13Var20.getClass();
                                return new ynq();
                            case 22:
                                l13Var20.getClass();
                                bdt I4 = hag.I(Context.class);
                                qdc qdcVar4 = l13Var20.a;
                                Set set3 = l13Var20.b;
                                return new jfr((Context) qdcVar4.D(I4, l13Var20, set3), (cpr) qdcVar4.D(hag.I(cpr.class), l13Var20, set3));
                            case 23:
                                l13Var20.getClass();
                                return new aw8((oy2) l13Var20.a.D(hag.I(oy2.class), l13Var20, l13Var20.b));
                            case 24:
                                l13Var20.getClass();
                                return new loq(l13Var20);
                            case 25:
                                l13Var20.getClass();
                                return new moq((qy2) l13Var20.a.D(hag.I(qy2.class), l13Var20, l13Var20.b), l13Var20);
                            case 26:
                                l13Var20.getClass();
                                return new b14();
                            case 27:
                                l13Var20.getClass();
                                return new ud(l13Var20.b(hag.I(oi5.class), true), l13Var20.b(hag.I(pi5.class), true));
                            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                                l13Var20.getClass();
                                return new yzp();
                            default:
                                l13Var20.getClass();
                                return new bg4((Context) l13Var20.a.D(hag.I(Context.class), l13Var20, l13Var20.b));
                        }
                    }
                });
                return Unit.a;
        }
    }
}
