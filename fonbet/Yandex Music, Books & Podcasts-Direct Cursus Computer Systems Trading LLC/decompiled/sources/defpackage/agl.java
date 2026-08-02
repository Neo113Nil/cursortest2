package defpackage;

import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;

/* loaded from: classes4.dex */
public final class agl {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r1v1, types: [arf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(vbn vbnVar, cg6 cg6Var) {
        zfl zflVar;
        int i;
        int A;
        Object tdlVar;
        Object obj;
        if (cg6Var instanceof zfl) {
            zflVar = (zfl) cg6Var;
            int i2 = zflVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zflVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = zflVar.k;
                nm6 nm6Var = nm6.a;
                i = zflVar.m;
                if (i != 0) {
                    qgg.h0(obj2);
                    zflVar.j = vbnVar;
                    zflVar.m = 1;
                    if (y2x.o(200L, zflVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vbnVar = zflVar.j;
                    qgg.h0(obj2);
                }
                wbn wbnVar = vbnVar.b;
                vdl vdlVar = new vdl((rr5) wbnVar.c.getValue());
                mqs mqsVar = wbnVar.b;
                String str = mqsVar.a;
                List list = mqsVar.f;
                String str2 = mqsVar.c;
                int hashCode = str.hashCode();
                A = ldg.A(new d7w(hashCode, hashCode >> 31), new IntRange(0, 2, 1));
                if (A != 0) {
                    tdlVar = new tdl(x2i.W(12, String.valueOf(UUID.randomUUID()), "Концерт по " + str2), ((zp2) CollectionsKt.Q(list)).a, new vdl(mqsVar.d()), "dev-debug-tests");
                } else {
                    if (A != 1) {
                        String g = f1d.g("Общее про ", str2);
                        String g2 = f1d.g("yandexmusic://album/", mqsVar.d.a);
                        int hashCode2 = str.hashCode();
                        obj = new sdl(new ydl(g2, new d7w(hashCode2, hashCode2 >> 31).b() ? "https://music-divkit.s3.yandex.net/iOS/for_test/book_informer.png" : null, g, true), new vdl(mqsVar.d()), "dev-debug-tests");
                        return new qj6(tah.b(new Pair(vdlVar, t75.c(obj))));
                    }
                    phn.a.getClass();
                    tdlVar = new udl(new zdl(dfi.c(phn.b.e(1000000, 5000000), "https://tips.yandex.ru/guest/payment/", "?wl=yandex_music"), f1d.g("Донат по ", str2)), ((zp2) CollectionsKt.Q(list)).a, new vdl(mqsVar.d()), "dev-debug-tests");
                }
                obj = tdlVar;
                return new qj6(tah.b(new Pair(vdlVar, t75.c(obj))));
            }
        }
        zflVar = new zfl(this, cg6Var);
        Object obj22 = zflVar.k;
        nm6 nm6Var2 = nm6.a;
        i = zflVar.m;
        if (i != 0) {
        }
        wbn wbnVar2 = vbnVar.b;
        vdl vdlVar2 = new vdl((rr5) wbnVar2.c.getValue());
        mqs mqsVar2 = wbnVar2.b;
        String str3 = mqsVar2.a;
        List list2 = mqsVar2.f;
        String str22 = mqsVar2.c;
        int hashCode3 = str3.hashCode();
        A = ldg.A(new d7w(hashCode3, hashCode3 >> 31), new IntRange(0, 2, 1));
        if (A != 0) {
        }
        obj = tdlVar;
        return new qj6(tah.b(new Pair(vdlVar2, t75.c(obj))));
    }
}
