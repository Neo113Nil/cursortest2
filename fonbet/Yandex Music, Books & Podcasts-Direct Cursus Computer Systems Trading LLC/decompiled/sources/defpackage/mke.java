package defpackage;

import android.content.Context;
import com.google.gson.GsonBuilder;
import com.yandex.music.skeleton.blocks.itemlist.data.ItemJsonAdapter;
import com.yandex.music.skeleton.blocks.itemlist.data.dto.ItemListEntityDto;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class mke implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ mke(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = 15;
        int i2 = 25;
        int i3 = 22;
        int i4 = 21;
        int i5 = 20;
        int i6 = 3;
        int i7 = 6;
        int i8 = 2;
        int i9 = 27;
        int i10 = 4;
        int i11 = 26;
        int i12 = 28;
        int i13 = 0;
        int i14 = 1;
        switch (this.a) {
            case 0:
                ((Integer) obj).intValue();
                return Unit.a;
            case 1:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, tke.class).E(new mke(i8));
                o18Var.b(hag.I(rke.class)).E(new mke(i6));
                o18Var.b(hag.I(mle.class)).E(new mke(i10));
                o18Var.b(hag.I(nke.class)).E(new mke(5));
                o18Var.b(hag.I(nle.class)).E(new mke(i7));
                o18Var.b(hag.I(qfl.class)).E(new mke(7));
                o18Var.b(hag.I(yfl.class)).E(new mke(8));
                o18Var.b(hag.I(ofl.class)).E(new mke(9));
                return Unit.a;
            case 2:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                nke nkeVar = (nke) l13Var.a.D(hag.I(nke.class), l13Var, l13Var.b);
                tke tkeVar = new tke();
                e00 e00Var = ((kgf) l13Var.a.D(hag.I(kgf.class), l13Var, l13Var.b)).a;
                e00Var.getClass();
                bdt I = hag.I(yff.class);
                qdc qdcVar = e00Var.a;
                qdcVar.getClass();
                tkeVar.b(new bgf((yff) qdcVar.C(I)));
                jyr jyrVar = hle.a;
                tkeVar.b(new a2j((ile) jyrVar.getValue(), nkeVar));
                tkeVar.b(new dpr(nkeVar));
                jyr jyrVar2 = dvu.e;
                if (kwl.d()) {
                    ile ileVar = (ile) jyrVar.getValue();
                    ileVar.getClass();
                    tkeVar.b(new fvu(ileVar, nkeVar));
                }
                tkeVar.b(new x21((yfl) l13Var.a.D(hag.I(yfl.class), l13Var, l13Var.b), nkeVar));
                tkeVar.b(new z51((yfl) l13Var.a.D(hag.I(yfl.class), l13Var, l13Var.b), nkeVar));
                Context context = (Context) l13Var.a.D(hag.I(Context.class), l13Var, l13Var.b);
                hke a = nkeVar.a();
                a.getClass();
                rw2 a2 = px2.a();
                a2.getClass();
                lx2 lx2Var = a2.b;
                tkeVar.b(new kkq(R.string.informers_battery_restrictions_text, lg3.u0(zsd.u0(new u21(i10, new cz(lx2Var.f().getData(), lx2Var, i), a2, context), a2.d), a2.c, Boolean.FALSE), "lowbattery", a, new j3(27), new j3(28), 1));
                tkeVar.b(new od5((yfl) l13Var.a.D(hag.I(yfl.class), l13Var, l13Var.b), nkeVar));
                l18 l18Var = l18.b;
                bdt I2 = hag.I(byb.class);
                qdc qdcVar2 = l18Var.a;
                qdcVar2.getClass();
                if (((r78) ((byb) qdcVar2.C(I2)).b(r78.class)).e.getValue() != null) {
                    hke a3 = nkeVar.a();
                    c88 c88Var = (c88) l13Var.a.D(hag.I(c88.class), l13Var, l13Var.b);
                    a3.getClass();
                    tkeVar.b(new kkq(R.string.storage_warning_informer_text, c88Var.d, "DiskSpaceInformerEntity", a3, new kv4(19, c88Var), null, 65));
                }
                if (kwl.d()) {
                    iyq iyqVar = (iyq) l13Var.a.D(hag.I(iyq.class), l13Var, l13Var.b);
                    tkeVar.b(new fyq((zxq) iyqVar.a.getValue(), iyqVar.b()));
                }
                return tkeVar;
            case 3:
                ((l13) obj).getClass();
                return new rke();
            case 4:
                ((l13) obj).getClass();
                return new mle(1);
            case 5:
                ((l13) obj).getClass();
                return new nke(new gle());
            case 6:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                return new nle((nke) l13Var2.a.D(hag.I(nke.class), l13Var2, l13Var2.b));
            case 7:
                ((l13) obj).getClass();
                return new qfl(new rnk(1));
            case 8:
                ((l13) obj).getClass();
                return new yfl(new ffl(new fgl()), new gs4(28));
            case 9:
                ((l13) obj).getClass();
                return new ofl();
            case 10:
                List list = (List) obj;
                list.getClass();
                List<lke> list2 = list;
                ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                for (lke lkeVar : list2) {
                    arrayList.add(new qdr(lkeVar.getTag(), ((Boolean) lkeVar.getVisibility().getValue()).booleanValue()));
                }
                return arrayList;
            case 11:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 12:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 13:
                char charValue = ((Character) obj).charValue();
                return Boolean.valueOf(charValue == 'T' || charValue == 't');
            case 14:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 15:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 16:
                char charValue2 = ((Character) obj).charValue();
                return Boolean.valueOf('0' <= charValue2 && charValue2 < ':');
            case 17:
                o18 o18Var2 = (o18) obj;
                o18Var2.getClass();
                jyr b = btf.b(new sxd(12));
                o18Var2.c = hag.I(ani.class);
                rp7 rp7Var = o18Var2.b;
                rp7Var.getClass();
                int i15 = 18;
                rp7Var.E(new mke(i15));
                jyr b2 = btf.b(new c76(b, i10));
                o18Var2.c = hag.I(i0j.class);
                rp7Var.getClass();
                rp7Var.E(new dx(b2, 14));
                o18Var2.c = hag.I(uyt.class);
                rp7Var.getClass();
                rp7Var.E(new dx(b2, i));
                o18Var2.c = hag.I(hwd.class);
                rp7Var.getClass();
                rp7Var.E(new dx(b2, 16));
                o18Var2.c = hag.I(fos.class);
                rp7Var.getClass();
                rp7Var.E(new dx(b2, 17));
                o18Var2.c = hag.I(hfb.class);
                rp7Var.getClass();
                rp7Var.E(new dx(b2, i15));
                jyr b3 = btf.b(new c76(b, 5));
                o18Var2.c = hag.I(i5h.class);
                rp7Var.getClass();
                rp7Var.E(new dx(b3, i14));
                o18Var2.c = hag.I(dst.class);
                rp7Var.getClass();
                rp7Var.E(new dx(b3, 8));
                o18Var2.c = hag.I(z2b.class);
                rp7Var.getClass();
                rp7Var.E(new dx(b3, 9));
                o18Var2.c = hag.I(f5g.class);
                rp7Var.getClass();
                rp7Var.E(new dx(b3, 10));
                o18Var2.c = hag.I(k68.class);
                rp7Var.getClass();
                rp7Var.E(new dx(b3, 11));
                o18Var2.c = hag.I(p5l.class);
                rp7Var.getClass();
                rp7Var.E(new dx(b3, 12));
                o18Var2.c = hag.I(o3t.class);
                rp7Var.getClass();
                rp7Var.E(new dx(b3, 13));
                o18Var2.c = hag.I(a20.class);
                rp7Var.getClass();
                rp7Var.E(new dx(b3, i8));
                o18Var2.c = hag.I(d2l.class);
                rp7Var.getClass();
                rp7Var.E(new dx(b3, i6));
                o18Var2.c = hag.I(uou.class);
                rp7Var.getClass();
                rp7Var.E(new dx(b3, i10));
                o18Var2.c = hag.I(cst.class);
                rp7Var.getClass();
                rp7Var.E(new dx(b3, 5));
                o18Var2.c = hag.I(nc7.class);
                rp7Var.getClass();
                rp7Var.E(new dx(b3, i7));
                o18Var2.c = hag.I(w62.class);
                rp7Var.getClass();
                rp7Var.E(new dx(b3, 7));
                jyr b4 = btf.b(new c76(b, i7));
                o18Var2.c = hag.I(l0t.class);
                rp7Var.getClass();
                rp7Var.E(new k0l(b4, 17));
                o18Var2.c = hag.I(b8u.class);
                rp7Var.getClass();
                rp7Var.E(new k0l(b4, i15));
                o18Var2.c = hag.I(cut.class);
                rp7Var.getClass();
                rp7Var.E(new k0l(b4, 19));
                o18Var2.c = hag.I(yr.class);
                rp7Var.getClass();
                rp7Var.E(new k0l(b4, i5));
                o18Var2.c = hag.I(k21.class);
                rp7Var.getClass();
                rp7Var.E(new k0l(b4, i4));
                o18Var2.c = hag.I(b5d.class);
                rp7Var.getClass();
                rp7Var.E(new k0l(b4, 22));
                jyr b5 = btf.b(new c76(b, 7));
                o18Var2.c = hag.I(k1l.class);
                rp7Var.getClass();
                rp7Var.E(new dx(b5, 19));
                o18Var2.c = hag.I(k1l.class);
                rp7Var.getClass();
                rp7Var.E(new dx(b5, i4));
                o18Var2.c = hag.I(oq7.class);
                rp7Var.getClass();
                rp7Var.E(new dx(b5, 26));
                o18Var2.c = hag.I(q8b.class);
                rp7Var.getClass();
                rp7Var.E(new dx(b5, 27));
                o18Var2.c = hag.I(f7l.class);
                rp7Var.getClass();
                rp7Var.E(new e0l(17));
                o18Var2.c = hag.I(g4l.class);
                rp7Var.getClass();
                rp7Var.E(new e0l(i15));
                o18Var2.c = hag.I(qqs.class);
                rp7Var.getClass();
                rp7Var.E(new dx(b5, 29));
                o18Var2.c = hag.I(y3l.class);
                rp7Var.getClass();
                rp7Var.E(new k0l(b5, 0));
                o18Var2.c = hag.I(q7l.class);
                rp7Var.getClass();
                rp7Var.E(new k0l(b5, i14));
                o18Var2.c = hag.I(q3t.class);
                rp7Var.getClass();
                rp7Var.E(new k0l(b5, i8));
                o18Var2.c = hag.I(j6q.class);
                rp7Var.getClass();
                rp7Var.E(new dx(b5, 28));
                o18Var2.c = hag.I(m0t.class);
                rp7Var.getClass();
                rp7Var.E(new k0l(b5, i6));
                o18Var2.c = hag.I(hvs.class);
                rp7Var.getClass();
                rp7Var.E(new k0l(b5, i10));
                o18Var2.c = hag.I(cur.class);
                rp7Var.getClass();
                rp7Var.E(new k0l(b5, 5));
                o18Var2.c = hag.I(luu.class);
                rp7Var.getClass();
                rp7Var.E(new k0l(b5, i7));
                o18Var2.c = hag.I(q4d.class);
                rp7Var.getClass();
                rp7Var.E(new k0l(b5, 7));
                o18Var2.c = hag.I(y3d.class);
                rp7Var.getClass();
                rp7Var.E(new k0l(b5, 8));
                o18Var2.c = hag.I(uoh.class);
                rp7Var.getClass();
                rp7Var.E(new k0l(b5, 9));
                o18Var2.c = hag.I(a72.class);
                rp7Var.getClass();
                rp7Var.E(new k0l(b5, 10));
                o18Var2.c = hag.I(mzs.class);
                rp7Var.getClass();
                rp7Var.E(new dx(b5, i5));
                o18Var2.c = hag.I(djm.class);
                rp7Var.getClass();
                rp7Var.E(new dx(b5, 22));
                o18Var2.c = hag.I(udp.class);
                rp7Var.getClass();
                rp7Var.E(new dx(b5, 23));
                o18Var2.c = hag.I(u5q.class);
                rp7Var.getClass();
                rp7Var.E(new dx(b5, 24));
                o18Var2.c = hag.I(hy1.class);
                rp7Var.getClass();
                rp7Var.E(new dx(b5, 25));
                jyr b6 = btf.b(new c76(b, 8));
                o18Var2.c = hag.I(sfn.class);
                rp7Var.getClass();
                rp7Var.E(new k0l(b6, 11));
                o18Var2.c = hag.I(ofo.class);
                rp7Var.getClass();
                rp7Var.E(new k0l(b6, 12));
                jyr b7 = btf.b(new c76(b, 9));
                o18Var2.c = hag.I(wlw.class);
                rp7Var.getClass();
                rp7Var.E(new k0l(b7, 25));
                o18Var2.c = hag.I(rlw.class);
                rp7Var.getClass();
                rp7Var.E(new k0l(b7, 26));
                o18Var2.c = hag.I(bfw.class);
                rp7Var.getClass();
                rp7Var.E(new k0l(b7, 27));
                o18Var2.c = hag.I(zhw.class);
                rp7Var.getClass();
                rp7Var.E(new k0l(b7, 28));
                return Unit.a;
            case 18:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                Context context2 = (Context) l13Var3.a.D(hag.I(Context.class), l13Var3, l13Var3.b);
                l18 l18Var2 = l18.b;
                bdt I3 = hag.I(l7b.class);
                qdc qdcVar3 = l18Var2.a;
                qdcVar3.getClass();
                String str = ((l7b) qdcVar3.C(I3)).a;
                b4e b4eVar = new b4e();
                oii[] oiiVarArr = oii.a;
                bdt I4 = hag.I(le7.class);
                qdc qdcVar4 = l18Var2.a;
                qdcVar4.getClass();
                boolean z = zni.a;
                ozi oziVar = new ozi(str, !m7b.a.contains(str), new nxv(i2), new p9w(i), new dkn((xpi) jxf.e.getValue()), new vw1(context2, i11));
                lal lalVar = new lal(new sgl(new kme(Boolean.TRUE)), new p9w(i13), new p9w(i14), btf.b(new p9w(i8)), new kme(Boolean.FALSE), btf.b(new p9w(i6)), new p9w(i10), btf.b(new p9w(i7)), new p9w(7), new p9w(5), new p9w(8));
                lyk lykVar = new lyk(new x6s(i11), new p9w(9), new ae(), new q9w(), new p9w(10), new x6s(i11), new p9w(11));
                avk avkVar = new avk(new p9w(12), new p9w(13), new p9w(14), new nxv(i11), new nxv(27), btf.b(new nxv(28)));
                gtr.b.getClass();
                List list3 = gtr.c;
                String string = context2.getString(R.string.favorite_playlist_title);
                string.getClass();
                ani aniVar = new ani(context2, new fni(b4eVar, oziVar, lalVar, lykVar, avkVar, new gqg(list3, string, btf.b(new nxv(29)))), new faw(context2));
                ((sst) aniVar.i.getValue()).getClass();
                return aniVar;
            case 19:
                o18 o18Var3 = (o18) obj;
                vz1.e(o18Var3, fmg.class).E(new mke(i5));
                o18Var3.b(hag.I(rve.class)).E(new mke(i4));
                o18Var3.b(hag.I(nst.class)).D(new mke(i3));
                return Unit.a;
            case 20:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                l18 l18Var3 = l18.b;
                bdt I5 = hag.I(Context.class);
                qdc qdcVar5 = l18Var3.a;
                qdcVar5.getClass();
                return new fmg((Context) qdcVar5.C(I5), (frt) l13Var4.a.D(hag.I(frt.class), l13Var4, l13Var4.b), (pfj) l13Var4.a.D(hag.I(pfj.class), l13Var4, l13Var4.b));
            case 21:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                return new rve(l13Var5);
            case 22:
                l13 l13Var6 = (l13) obj;
                l13Var6.getClass();
                bdt I6 = hag.I(Context.class);
                qdc qdcVar6 = l13Var6.a;
                Set set = l13Var6.b;
                return new nst((Context) qdcVar6.D(I6, l13Var6, set), (fmg) qdcVar6.D(hag.I(fmg.class), l13Var6, set), (av0) qdcVar6.D(hag.I(av0.class), l13Var6, set));
            case 23:
                GsonBuilder gsonBuilder = (GsonBuilder) obj;
                gsonBuilder.getClass();
                gsonBuilder.b(ItemListEntityDto.class, new ItemJsonAdapter());
                return Unit.a;
            case 24:
                String str2 = (String) obj;
                str2.getClass();
                return str2;
            case 25:
                ((f0f) obj).getClass();
                return vci.a;
            case 26:
                o18 o18Var4 = (o18) obj;
                vz1.e(o18Var4, u2f.class).E(new mke(i9));
                o18Var4.b(hag.I(k3f.class)).E(new mke(i12));
                return Unit.a;
            case 27:
                l13 l13Var7 = (l13) obj;
                l13Var7.getClass();
                return new u2f((Context) l13Var7.a.D(hag.I(Context.class), l13Var7, l13Var7.b));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return ((u2f) vz1.l((l13) obj, u2f.class)).c;
            default:
                ((cds) obj).getClass();
                return Unit.a;
        }
    }
}
