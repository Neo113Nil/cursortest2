package defpackage;

import android.content.Context;
import android.view.View;
import com.google.gson.GsonBuilder;
import com.yandex.music.shared.skeleton.data.core.api.skeleton.SkeletonJsonAdapter;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.common.media.context.e;
import ru.yandex.music.data.stores.WebPath$Storage;
import ru.yandex.music.gallery.GalleryWidgetActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class at5 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ at5(y76 y76Var, v56 v56Var) {
        this.a = 29;
        this.b = v56Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v12, types: [c5b] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v16, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list;
        mhp descriptor;
        final int i = 3;
        boolean z = false;
        z = false;
        final int i2 = 1;
        r5 = null;
        List list2 = null;
        switch (this.a) {
            case 0:
                ct5 ct5Var = (ct5) this.b;
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.k(jfpVar, ct5Var.m);
                return Unit.a;
            case 1:
                cx5 cx5Var = (cx5) this.b;
                ((is6) obj).getClass();
                return new nx5((rw5) cx5Var.a.b.getValue(), cx5Var.b);
            case 2:
                ((ty5) ((eps) this.b).d).J((us5) obj);
                return Unit.a;
            case 3:
                tz5 tz5Var = (tz5) this.b;
                int intValue = ((Integer) obj).intValue();
                pv5 pv5Var = tz5Var.c.v;
                if (pv5Var != null) {
                    np2 np2Var = ((bz5) tz5Var.d.a).c;
                    ?? r13 = pv5Var.c;
                    r5 = ((Collection) r13).isEmpty() ? null : r13;
                    if (r5 != null) {
                        Iterable iterable = (Iterable) r5;
                        list = new ArrayList(v75.o(iterable, 10));
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            list.add(kg5.M((u9b) it.next(), WebPath$Storage.AFISHA));
                        }
                    } else {
                        list = c5b.a;
                    }
                    g1d g1dVar = new g1d(intValue, null, list, false, true);
                    int i3 = GalleryWidgetActivity.y;
                    np2Var.startActivity(bow.o(np2Var, g1dVar));
                }
                return Unit.a;
            case 4:
                g06 g06Var = (g06) this.b;
                GsonBuilder gsonBuilder = (GsonBuilder) obj;
                gsonBuilder.getClass();
                gsonBuilder.b(inq.class, new SkeletonJsonAdapter((gnq) g06Var.d));
                return Unit.a;
            case 5:
                e00 e00Var = (e00) this.b;
                ((l13) obj).getClass();
                return (e56) ((l56) e00Var.b).a.getValue();
            case 6:
                z66 z66Var = (z66) this.b;
                x66 x66Var = (x66) obj;
                x66Var.getClass();
                if (!x66Var.a && z66Var.g.getValue() == null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
                zf6 zf6Var = (zf6) this.b;
                mm4 mm4Var = (mm4) obj;
                mm4Var.getClass();
                t9f t9fVar = zf6Var.b;
                if (t9fVar != null && (descriptor = t9fVar.getDescriptor()) != null) {
                    list2 = descriptor.getAnnotations();
                }
                if (list2 == null) {
                    list2 = c5b.a;
                }
                list2.getClass();
                mm4Var.b = list2;
                return Unit.a;
            case 8:
                i61 i61Var = (i61) this.b;
                mm6 mm6Var = (mm6) obj;
                mm6Var.getClass();
                kxi kxiVar = (kxi) i61Var.d;
                l18 l18Var = l18.b;
                bdt I = hag.I(e.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                e eVar = (e) qdcVar.C(I);
                bdt I2 = hag.I(z5l.class);
                qdc qdcVar2 = l18Var.a;
                qdcVar2.getClass();
                dn9 dn9Var = new dn9(mm6Var, eVar, (z5l) qdcVar2.C(I2), kxiVar);
                bdt I3 = hag.I(oq7.class);
                qdc qdcVar3 = l18Var.a;
                qdcVar3.getClass();
                oq7 oq7Var = (oq7) qdcVar3.C(I3);
                bdt I4 = hag.I(k1l.class);
                qdc qdcVar4 = l18Var.a;
                qdcVar4.getClass();
                k1l k1lVar = (k1l) qdcVar4.C(I4);
                bdt I5 = hag.I(fdj.class);
                qdc qdcVar5 = l18Var.a;
                qdcVar5.getClass();
                fdj fdjVar = (fdj) qdcVar5.C(I5);
                bdt I6 = hag.I(r1l.class);
                qdc qdcVar6 = l18Var.a;
                qdcVar6.getClass();
                return new xzi(new zri(mm6Var, dn9Var, oq7Var, k1lVar, fdjVar, (r1l) qdcVar6.C(I6)));
            case 9:
                uo6 uo6Var = (uo6) this.b;
                jpa jpaVar = (jpa) obj;
                jpaVar.getClass();
                jpa.B(jpaVar, uo6Var.a(), 0L, 0L, 0.0f, null, 0, 126);
                return Unit.a;
            case 10:
                sk6 sk6Var = (sk6) this.b;
                Integer num = (Integer) obj;
                num.intValue();
                return (geh) uah.c(num, sk6Var.b);
            case 11:
                g6d g6dVar = (g6d) this.b;
                long j = ((hqe) obj).a;
                g6dVar.getClass();
                g6dVar.c = swf.i(((int) (j >> 32)) / 2.0f, ((int) (j & 4294967295L)) / 2.0f);
                return Unit.a;
            case 12:
                er6 er6Var = (er6) this.b;
                cvl cvlVar = (cvl) obj;
                cvlVar.getClass();
                Function1 function1 = er6Var.i;
                if (function1 != null) {
                    function1.invoke(cvlVar);
                }
                er6Var.dismissAllowingStateLoss();
                return Unit.a;
            case 13:
                return Boolean.valueOf(!Intrinsics.d(obj, ((d8t) this.b).d.getValue()));
            case 14:
                kv6 kv6Var = (kv6) this.b;
                if (((Throwable) obj) != null) {
                    f1d.s(1.0f, kv6Var.t, null);
                }
                return Unit.a;
            case 15:
                r88 r88Var = (r88) this.b;
                mm6 mm6Var2 = (mm6) obj;
                mm6Var2.getClass();
                x97.y(mm6Var2, null, null, new g68(r88Var, r5, i2), 3);
                return Unit.a;
            case 16:
                g06 g06Var2 = (g06) this.b;
                ((Context) obj).getClass();
                return (gc8) g06Var2.d;
            case 17:
                final hla hlaVar = (hla) this.b;
                pvf pvfVar = (pvf) obj;
                pvfVar.getClass();
                mw4 mw4Var = mw4.DOWNLOADED_ARTISTS;
                final int i4 = z ? 1 : 0;
                pvfVar.a(new String[]{"COLLECTION_DOWNLOADED_TRACKS"}, new Function0() { // from class: gla
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                hla hlaVar2 = hlaVar;
                                ow4 ow4Var = (ow4) ((jyr) hlaVar2.c).getValue();
                                tmb tmbVar = (tmb) hlaVar2.b;
                                ow4Var.getClass();
                                return new nw4(ow4Var, tmbVar, 2);
                            case 1:
                                hla hlaVar3 = hlaVar;
                                return ((ow4) ((jyr) hlaVar3.c).getValue()).a((tmb) hlaVar3.b);
                            case 2:
                                hla hlaVar4 = hlaVar;
                                ow4 ow4Var2 = (ow4) ((jyr) hlaVar4.c).getValue();
                                tmb tmbVar2 = (tmb) hlaVar4.b;
                                ow4Var2.getClass();
                                return new nw4(ow4Var2, tmbVar2, 1);
                            default:
                                hla hlaVar5 = hlaVar;
                                ow4 ow4Var3 = (ow4) ((jyr) hlaVar5.c).getValue();
                                tmb tmbVar3 = (tmb) hlaVar5.b;
                                ow4Var3.getClass();
                                return new nw4(ow4Var3, tmbVar3, 0);
                        }
                    }
                });
                pvfVar.a(new String[]{"COLLECTION_DOWNLOADED_ARTISTS"}, new Function0() { // from class: gla
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                hla hlaVar2 = hlaVar;
                                ow4 ow4Var = (ow4) ((jyr) hlaVar2.c).getValue();
                                tmb tmbVar = (tmb) hlaVar2.b;
                                ow4Var.getClass();
                                return new nw4(ow4Var, tmbVar, 2);
                            case 1:
                                hla hlaVar3 = hlaVar;
                                return ((ow4) ((jyr) hlaVar3.c).getValue()).a((tmb) hlaVar3.b);
                            case 2:
                                hla hlaVar4 = hlaVar;
                                ow4 ow4Var2 = (ow4) ((jyr) hlaVar4.c).getValue();
                                tmb tmbVar2 = (tmb) hlaVar4.b;
                                ow4Var2.getClass();
                                return new nw4(ow4Var2, tmbVar2, 1);
                            default:
                                hla hlaVar5 = hlaVar;
                                ow4 ow4Var3 = (ow4) ((jyr) hlaVar5.c).getValue();
                                tmb tmbVar3 = (tmb) hlaVar5.b;
                                ow4Var3.getClass();
                                return new nw4(ow4Var3, tmbVar3, 0);
                        }
                    }
                });
                final int i5 = 2;
                pvfVar.a(new String[]{"COLLECTION_DOWNLOADED_SECTIONS"}, new Function0() { // from class: gla
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i5) {
                            case 0:
                                hla hlaVar2 = hlaVar;
                                ow4 ow4Var = (ow4) ((jyr) hlaVar2.c).getValue();
                                tmb tmbVar = (tmb) hlaVar2.b;
                                ow4Var.getClass();
                                return new nw4(ow4Var, tmbVar, 2);
                            case 1:
                                hla hlaVar3 = hlaVar;
                                return ((ow4) ((jyr) hlaVar3.c).getValue()).a((tmb) hlaVar3.b);
                            case 2:
                                hla hlaVar4 = hlaVar;
                                ow4 ow4Var2 = (ow4) ((jyr) hlaVar4.c).getValue();
                                tmb tmbVar2 = (tmb) hlaVar4.b;
                                ow4Var2.getClass();
                                return new nw4(ow4Var2, tmbVar2, 1);
                            default:
                                hla hlaVar5 = hlaVar;
                                ow4 ow4Var3 = (ow4) ((jyr) hlaVar5.c).getValue();
                                tmb tmbVar3 = (tmb) hlaVar5.b;
                                ow4Var3.getClass();
                                return new nw4(ow4Var3, tmbVar3, 0);
                        }
                    }
                });
                pvfVar.a(new String[]{"COLLECTION_AUTO_CACHE_ONBOARDING"}, new Function0() { // from class: gla
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i) {
                            case 0:
                                hla hlaVar2 = hlaVar;
                                ow4 ow4Var = (ow4) ((jyr) hlaVar2.c).getValue();
                                tmb tmbVar = (tmb) hlaVar2.b;
                                ow4Var.getClass();
                                return new nw4(ow4Var, tmbVar, 2);
                            case 1:
                                hla hlaVar3 = hlaVar;
                                return ((ow4) ((jyr) hlaVar3.c).getValue()).a((tmb) hlaVar3.b);
                            case 2:
                                hla hlaVar4 = hlaVar;
                                ow4 ow4Var2 = (ow4) ((jyr) hlaVar4.c).getValue();
                                tmb tmbVar2 = (tmb) hlaVar4.b;
                                ow4Var2.getClass();
                                return new nw4(ow4Var2, tmbVar2, 1);
                            default:
                                hla hlaVar5 = hlaVar;
                                ow4 ow4Var3 = (ow4) ((jyr) hlaVar5.c).getValue();
                                tmb tmbVar3 = (tmb) hlaVar5.b;
                                ow4Var3.getClass();
                                return new nw4(ow4Var3, tmbVar3, 0);
                        }
                    }
                });
                return Unit.a;
            case 18:
                View[] viewArr = (View[]) this.b;
                ((Float) obj).getClass();
                for (View view : viewArr) {
                    view.invalidate();
                }
                return Unit.a;
            case 19:
                jva jvaVar = (jva) this.b;
                ((l13) obj).getClass();
                return new uva(jvaVar);
            case 20:
                ((l13) obj).getClass();
                return new rxa();
            case 21:
                lxa lxaVar = (lxa) this.b;
                ((is6) obj).getClass();
                return new xxa(lxaVar);
            case 22:
                cjc cjcVar = (cjc) this.b;
                zco zcoVar = (zco) obj;
                zcoVar.getClass();
                zcoVar.a(cjcVar.e());
                return Unit.a;
            case 23:
                y6c y6cVar = (y6c) this.b;
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                StringBuilder sb = new StringBuilder();
                String str = y6cVar.b;
                if (str != null) {
                    sb.append(str);
                    sb.append('\n');
                }
                String str2 = y6cVar.c;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('\n');
                }
                String str3 = y6cVar.d;
                if (str3 != null) {
                    sb.append(str3);
                    sb.append('\n');
                }
                String sb2 = sb.toString();
                String str4 = sb2.length() > 0 ? sb2 : null;
                if (str4 != null) {
                    wfp.k(jfpVar2, str4);
                }
                return Unit.a;
            case 24:
                fic ficVar = (fic) this.b;
                if (((eh7) obj) == eh7.a) {
                    ficVar.a(false);
                }
                return Unit.a;
            case 25:
                ai3 ai3Var = (ai3) this.b;
                opf opfVar = (opf) obj;
                opfVar.getClass();
                opfVar.a();
                if (ai3Var != null) {
                    jpa.A0(opfVar, ai3Var, 0L, 0L, 0.0f, null, null, 0, 126);
                }
                return Unit.a;
            case 26:
                iz7 iz7Var = (iz7) this.b;
                x66 x66Var2 = (x66) obj;
                x66Var2.getClass();
                yjd yjdVar = (yjd) ((jyr) iz7Var.h).getValue();
                yjdVar.getClass();
                return Boolean.valueOf(yjdVar.d(x66Var2));
            case 27:
                oq oqVar = (oq) this.b;
                qe5 qe5Var = (qe5) obj;
                qe5Var.getClass();
                qe5Var.a(oqVar);
                return qe5Var;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                chd chdVar = (chd) this.b;
                ((zgd) obj).getClass();
                long a = (chdVar.e.get() + 1000) - ((zzp) chdVar.b.getValue()).a();
                if (a < 0) {
                    a = 0;
                }
                return Long.valueOf(a);
            default:
                v56 v56Var = (v56) this.b;
                try {
                    r7o r7oVar = z7o.b;
                    v56Var.close();
                } catch (Throwable unused) {
                    r7o r7oVar2 = z7o.b;
                }
                return Unit.a;
        }
    }

    public /* synthetic */ at5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
