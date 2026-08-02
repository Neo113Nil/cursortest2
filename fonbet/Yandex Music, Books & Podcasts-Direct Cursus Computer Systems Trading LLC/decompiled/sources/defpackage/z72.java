package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class z72 {
    public final e12 a;
    public final m82 b;
    public final md0 c;
    public final jyr d;
    public final jyr e;
    public final jyr f;
    public final jyr g;

    public z72(e12 e12Var, m82 m82Var, md0 md0Var) {
        this.a = e12Var;
        this.b = m82Var;
        this.c = md0Var;
        final int i = 0;
        this.d = btf.b(new Function0(this) { // from class: v72
            public final /* synthetic */ z72 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return this.b.c.a();
                    case 1:
                        return (dc0) this.b.c.o.getValue();
                    case 2:
                        return this.b.c.a;
                    default:
                        return (cce) this.b.c.s.getValue();
                }
            }
        });
        final int i2 = 1;
        this.e = btf.b(new Function0(this) { // from class: v72
            public final /* synthetic */ z72 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return this.b.c.a();
                    case 1:
                        return (dc0) this.b.c.o.getValue();
                    case 2:
                        return this.b.c.a;
                    default:
                        return (cce) this.b.c.s.getValue();
                }
            }
        });
        final int i3 = 2;
        this.f = btf.b(new Function0(this) { // from class: v72
            public final /* synthetic */ z72 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return this.b.c.a();
                    case 1:
                        return (dc0) this.b.c.o.getValue();
                    case 2:
                        return this.b.c.a;
                    default:
                        return (cce) this.b.c.s.getValue();
                }
            }
        });
        final int i4 = 3;
        this.g = btf.b(new Function0(this) { // from class: v72
            public final /* synthetic */ z72 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return this.b.c.a();
                    case 1:
                        return (dc0) this.b.c.o.getValue();
                    case 2:
                        return this.b.c.a;
                    default:
                        return (cce) this.b.c.s.getValue();
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cg6 cg6Var) {
        w72 w72Var;
        int i;
        String str2;
        String str3;
        e12 e12Var;
        if (cg6Var instanceof w72) {
            w72Var = (w72) cg6Var;
            int i2 = w72Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w72Var.o = i2 - Integer.MIN_VALUE;
                Object obj = w72Var.m;
                nm6 nm6Var = nm6.a;
                i = w72Var.o;
                if (i != 0) {
                    qgg.h0(obj);
                    String string = e().a.getString(R.string.android_auto_downloaded_albums);
                    string.getClass();
                    Uri a = dc0.a(d().a, R.drawable.ic_car_albums_200);
                    w72Var.j = str;
                    e12 e12Var2 = this.a;
                    w72Var.k = e12Var2;
                    w72Var.l = string;
                    w72Var.o = 1;
                    a.getClass();
                    d62 d62Var = new d62(a);
                    if (d62Var == nm6Var) {
                        return nm6Var;
                    }
                    str2 = str;
                    str3 = string;
                    obj = d62Var;
                    e12Var = e12Var2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str4 = w72Var.l;
                    e12 e12Var3 = w72Var.k;
                    String str5 = w72Var.j;
                    qgg.h0(obj);
                    str3 = str4;
                    str2 = str5;
                    e12Var = e12Var3;
                }
                return e12.a(e12Var, str2, str3, y02.a, y02.b, (d62) obj, null, 96);
            }
        }
        w72Var = new w72(this, cg6Var);
        Object obj2 = w72Var.m;
        nm6 nm6Var2 = nm6.a;
        i = w72Var.o;
        if (i != 0) {
        }
        return e12.a(e12Var, str2, str3, y02.a, y02.b, (d62) obj2, null, 96);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, cg6 cg6Var) {
        x72 x72Var;
        int i;
        String str2;
        String str3;
        e12 e12Var;
        if (cg6Var instanceof x72) {
            x72Var = (x72) cg6Var;
            int i2 = x72Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x72Var.o = i2 - Integer.MIN_VALUE;
                Object obj = x72Var.m;
                nm6 nm6Var = nm6.a;
                i = x72Var.o;
                if (i != 0) {
                    qgg.h0(obj);
                    String string = e().a.getString(R.string.android_auto_downloaded_playlists);
                    string.getClass();
                    Uri a = dc0.a(d().a, R.drawable.ic_car_playlists_200);
                    x72Var.j = str;
                    e12 e12Var2 = this.a;
                    x72Var.k = e12Var2;
                    x72Var.l = string;
                    x72Var.o = 1;
                    a.getClass();
                    d62 d62Var = new d62(a);
                    if (d62Var == nm6Var) {
                        return nm6Var;
                    }
                    str2 = str;
                    str3 = string;
                    obj = d62Var;
                    e12Var = e12Var2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str4 = x72Var.l;
                    e12 e12Var3 = x72Var.k;
                    String str5 = x72Var.j;
                    qgg.h0(obj);
                    str3 = str4;
                    str2 = str5;
                    e12Var = e12Var3;
                }
                return e12.a(e12Var, str2, str3, y02.a, y02.b, (d62) obj, null, 96);
            }
        }
        x72Var = new x72(this, cg6Var);
        Object obj2 = x72Var.m;
        nm6 nm6Var2 = nm6.a;
        i = x72Var.o;
        if (i != 0) {
        }
        return e12.a(e12Var, str2, str3, y02.a, y02.b, (d62) obj2, null, 96);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, cg6 cg6Var) {
        y72 y72Var;
        int i;
        String str3;
        m82 m82Var;
        String str4;
        String str5;
        d62 d62Var;
        if (cg6Var instanceof y72) {
            y72Var = (y72) cg6Var;
            int i2 = y72Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y72Var.p = i2 - Integer.MIN_VALUE;
                Object obj = y72Var.n;
                nm6 nm6Var = nm6.a;
                i = y72Var.p;
                Uri uri = null;
                if (i != 0) {
                    qgg.h0(obj);
                    String string = e().a.getString(R.string.android_auto_downloaded_tracks_title);
                    string.getClass();
                    Uri a = dc0.a(d().a, R.drawable.ic_car_downloads_200);
                    y72Var.j = str;
                    y72Var.k = str2;
                    m82 m82Var2 = this.b;
                    y72Var.l = m82Var2;
                    y72Var.m = string;
                    y72Var.p = 1;
                    a.getClass();
                    d62 d62Var2 = new d62(a);
                    if (d62Var2 == nm6Var) {
                        return nm6Var;
                    }
                    str3 = str2;
                    m82Var = m82Var2;
                    str4 = string;
                    obj = d62Var2;
                    str5 = str;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str6 = y72Var.m;
                    m82Var = y72Var.l;
                    str3 = y72Var.k;
                    str5 = y72Var.j;
                    qgg.h0(obj);
                    str4 = str6;
                }
                d62Var = (d62) obj;
                y02 y02Var = y02.a;
                m82Var.getClass();
                str5.getClass();
                str3.getClass();
                str4.getClass();
                ((Set) umh.a.getValue()).contains(str3);
                String str7 = "track_playable_base_prefix_" + str5 + " track_playable_content_id_" + str3;
                if (d62Var != null) {
                    if (!(d62Var instanceof d62)) {
                        b6e.s();
                        return null;
                    }
                    uri = d62Var.a;
                }
                Uri uri2 = uri;
                Bundle J = cxb.J();
                J.putInt("android.media.browse.CONTENT_STYLE_SINGLE_ITEM_HINT", y02Var.a());
                return new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(str7, str4, null, null, null, uri2, J, null), 2);
            }
        }
        y72Var = new y72(this, cg6Var);
        Object obj2 = y72Var.n;
        nm6 nm6Var2 = nm6.a;
        i = y72Var.p;
        Uri uri3 = null;
        if (i != 0) {
        }
        d62Var = (d62) obj2;
        y02 y02Var2 = y02.a;
        m82Var.getClass();
        str5.getClass();
        str3.getClass();
        str4.getClass();
        ((Set) umh.a.getValue()).contains(str3);
        String str72 = "track_playable_base_prefix_" + str5 + " track_playable_content_id_" + str3;
        if (d62Var != null) {
        }
        Uri uri22 = uri3;
        Bundle J2 = cxb.J();
        J2.putInt("android.media.browse.CONTENT_STYLE_SINGLE_ITEM_HINT", y02Var2.a());
        return new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(str72, str4, null, null, null, uri22, J2, null), 2);
    }

    public final dc0 d() {
        return (dc0) this.e.getValue();
    }

    public final dd0 e() {
        return (dd0) this.d.getValue();
    }
}
