package defpackage;

import java.util.Arrays;
import java.util.Locale;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes4.dex */
public final class hwl {
    public final o8q a;
    public final sy7 b;
    public final bv7 c;

    public hwl(jwl jwlVar, o8q o8qVar, sy7 sy7Var, bv7 bv7Var) {
        this.a = o8qVar;
        this.b = sy7Var;
        this.c = bv7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lwl a(eul eulVar, int i, boolean z, Integer num) {
        String str;
        w3g w3gVar;
        eulVar.getClass();
        u9b u9bVar = eulVar.d;
        if (u9bVar == null || (str = u9bVar.e(wct.s(), WebPath$Storage.AVATARS)) == null) {
            str = "";
        }
        String str2 = str;
        String str3 = eulVar.c;
        bv7 bv7Var = this.c;
        o8q o8qVar = this.a;
        if (num != null) {
            if (num.intValue() <= 0) {
                num = null;
            }
            if (num != null) {
                int intValue = num.intValue();
                Locale locale = (Locale) bv7Var.invoke();
                locale.getClass();
                w3gVar = new w3g(ot0.B(intValue, locale), lsq.C(intValue, o8qVar, R.string.add_to_phonoteka_description, z), z);
                Locale locale2 = (Locale) bv7Var.invoke();
                locale2.getClass();
                String B = ot0.B(i, locale2);
                skr skrVar = o8qVar.a;
                return new lwl(str2, str3, z, w3gVar, i > 0 ? skrVar.c(R.string.play_list_empty_text) : skrVar.b(R.plurals.contest_playlist_min_tracks_quantity, i, Arrays.copyOf(new Object[]{B}, 1)));
            }
        }
        w3gVar = null;
        Locale locale22 = (Locale) bv7Var.invoke();
        locale22.getClass();
        String B2 = ot0.B(i, locale22);
        skr skrVar2 = o8qVar.a;
        return new lwl(str2, str3, z, w3gVar, i > 0 ? skrVar2.c(R.string.play_list_empty_text) : skrVar2.b(R.plurals.contest_playlist_min_tracks_quantity, i, Arrays.copyOf(new Object[]{B2}, 1)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(eul eulVar, int i, Integer num, cg6 cg6Var) {
        gwl gwlVar;
        int i2;
        Integer num2;
        hwl hwlVar;
        if (cg6Var instanceof gwl) {
            gwlVar = (gwl) cg6Var;
            int i3 = gwlVar.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gwlVar.p = i3 - Integer.MIN_VALUE;
                Object obj = gwlVar.n;
                nm6 nm6Var = nm6.a;
                i2 = gwlVar.p;
                if (i2 != 0) {
                    qgg.h0(obj);
                    nvl d = eulVar.d();
                    gwlVar.j = num;
                    gwlVar.k = this;
                    gwlVar.l = eulVar;
                    gwlVar.m = i;
                    gwlVar.p = 1;
                    obj = ((t3g) ((u3g) this.b.a.getValue())).o(d, gwlVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    num2 = num;
                    hwlVar = this;
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = gwlVar.m;
                    eulVar = gwlVar.l;
                    hwlVar = gwlVar.k;
                    num2 = gwlVar.j;
                    qgg.h0(obj);
                }
                return hwlVar.a(eulVar, i, ((Boolean) obj).booleanValue(), num2);
            }
        }
        gwlVar = new gwl(this, cg6Var);
        Object obj2 = gwlVar.n;
        nm6 nm6Var2 = nm6.a;
        i2 = gwlVar.p;
        if (i2 != 0) {
        }
        return hwlVar.a(eulVar, i, ((Boolean) obj2).booleanValue(), num2);
    }
}
