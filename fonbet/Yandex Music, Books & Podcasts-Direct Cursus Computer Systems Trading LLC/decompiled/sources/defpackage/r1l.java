package defpackage;

import ru.yandex.music.utils.Assertions;

/* loaded from: classes5.dex */
public final class r1l {
    public final d5l a = new d5l();
    public final jyr b = l18.b.b(hag.I(zzp.class), true);
    public final x0q c = y0q.b(0, 1, oi3.b, 1);

    public r1l() {
        new kz3(this);
    }

    public static boolean c(long j, long j2) {
        return Math.abs(j - j2) < 2100;
    }

    public final Long a(String str) {
        str.getClass();
        d5l d5lVar = this.a;
        d5lVar.getClass();
        d5lVar.f.await();
        l1l l1lVar = (l1l) d5lVar.d.get(str);
        if (l1lVar != null) {
            return Long.valueOf(l1lVar.b);
        }
        return null;
    }

    public final void b(mqs mqsVar, boolean z) {
        Assertions.assertTrue(mqsVar.l, "check logic saved progress when rememberPosition is false");
        this.a.a(new l1l(mqsVar.a, 0L, z, ((zzp) this.b.getValue()).b(), mqsVar.e));
    }

    public final Boolean d(String str) {
        d5l d5lVar = this.a;
        d5lVar.getClass();
        str.getClass();
        d5lVar.f.await();
        l1l l1lVar = (l1l) d5lVar.d.get(str);
        if (l1lVar != null) {
            return Boolean.valueOf(l1lVar.c);
        }
        return null;
    }
}
