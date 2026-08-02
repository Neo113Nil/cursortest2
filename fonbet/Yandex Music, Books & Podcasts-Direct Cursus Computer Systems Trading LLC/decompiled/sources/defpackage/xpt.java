package defpackage;

import android.os.Bundle;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class xpt {
    public static final xpt i = new xpt(false, null, null, 0, null, false, null, 3);
    public final boolean a;
    public final Integer b;
    public final String c;
    public final int d;
    public final hyn e;
    public final boolean f;
    public final String g;
    public final int h;

    public xpt(boolean z, Integer num, String str, int i2, hyn hynVar, boolean z2, String str2, int i3) {
        this.a = z;
        this.b = num;
        this.c = str;
        this.d = i2;
        this.e = hynVar;
        this.f = z2;
        this.g = str2;
        this.h = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d8, code lost:
    
        if (java.lang.Integer.parseInt(r11) != 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0073, code lost:
    
        if (java.lang.Integer.parseInt(r0) != 0) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa A[EDGE_INSN: B:42:0x00aa->B:40:0x00aa BREAK  A[LOOP:0: B:34:0x0094->B:41:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static xpt a(ypt yptVar) {
        hyn hynVar;
        Integer num;
        int i2;
        String Q;
        String Q2;
        int i3;
        Iterator it;
        String Q3 = yptVar.Q("play");
        String Q4 = yptVar.Q("playTrack");
        int i4 = 1;
        int i5 = -1;
        if (Q3 != null && !Q3.isEmpty()) {
            if (Boolean.parseBoolean(Q3)) {
                i5 = 1;
            } else {
                try {
                    i5 = Integer.parseInt(Q3);
                } catch (NumberFormatException unused) {
                }
            }
        }
        if (i5 < 1 && Q4 == null) {
            return i;
        }
        String Q5 = yptVar.Q("trackpos");
        hynVar = null;
        if (i5 > 1) {
            num = Integer.valueOf(i5);
        } else {
            if (Q5 != null && !Q5.isEmpty()) {
                try {
                    num = Integer.valueOf(Integer.parseInt(Q5));
                } catch (NumberFormatException unused2) {
                }
            }
            num = null;
        }
        if (num != null) {
            num = Integer.valueOf(num.intValue() - 1);
        }
        Integer num2 = num;
        String Q6 = yptVar.Q("shuffle");
        if (Q6 == null || Q6.isEmpty()) {
            i2 = 0;
        } else {
            if (!Boolean.parseBoolean(Q6)) {
            }
            i2 = 1;
        }
        Q = yptVar.Q("repeat");
        if (Q != null && !Q.isEmpty()) {
            hyn.c.getClass();
            it = hyn.h.iterator();
            while (true) {
                if (it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((hyn) next).b.equals(Q)) {
                    hynVar = next;
                    break;
                }
            }
            hynVar = hynVar;
        }
        hyn hynVar2 = hynVar;
        boolean parseBoolean = Boolean.parseBoolean(yptVar.Q("openPlayer"));
        String Q7 = yptVar.Q("aliceSessionId");
        Q2 = yptVar.Q("lyricsMode");
        if (Q2 != null || Q2.isEmpty()) {
            i4 = 3;
        } else if (!Boolean.parseBoolean(Q2)) {
        }
        i3 = i4;
        return new xpt(true, num2, Q4, i2, hynVar2, parseBoolean, Q7, i3);
        i2 = 2;
        Q = yptVar.Q("repeat");
        if (Q != null) {
            hyn.c.getClass();
            it = hyn.h.iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            hynVar = hynVar;
        }
        hyn hynVar22 = hynVar;
        boolean parseBoolean2 = Boolean.parseBoolean(yptVar.Q("openPlayer"));
        String Q72 = yptVar.Q("aliceSessionId");
        Q2 = yptVar.Q("lyricsMode");
        if (Q2 != null) {
        }
        i4 = 3;
        i3 = i4;
        return new xpt(true, num2, Q4, i2, hynVar22, parseBoolean2, Q72, i3);
        i3 = 2;
        return new xpt(true, num2, Q4, i2, hynVar22, parseBoolean2, Q72, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static xpt b(Bundle bundle) {
        int i2;
        String string;
        hyn valueOf;
        String string2;
        int i3;
        if (bundle != null) {
            boolean z = bundle.getBoolean("url.play.play");
            int i4 = bundle.getInt("url.play.play.track.position");
            Integer valueOf2 = i4 < 0 ? null : Integer.valueOf(i4);
            String string3 = bundle.getString("url.play.play.track.id", null);
            String string4 = bundle.getString("url.play.play.shuffle");
            if (string4 != null) {
                if (string4 != null) {
                    if (string4.equals("ON")) {
                        i2 = 1;
                    } else if (string4.equals("OFF")) {
                        i2 = 2;
                    } else {
                        xq0.x("No enum constant ru.yandex.music.common.media.queue.Shuffle.".concat(string4));
                    }
                    int i5 = i2;
                    string = bundle.getString("url.play.play.repeat.mode");
                    if (string != null) {
                        try {
                            valueOf = hyn.valueOf(string);
                        } catch (IllegalArgumentException unused) {
                        }
                        String string5 = bundle.getString("url.play.play.alice.session.id", null);
                        boolean z2 = bundle.getBoolean("url.play.play.open.player");
                        string2 = bundle.getString("url.play.play.lyrics.mode");
                        if (string2 != null) {
                            if (string2 != null) {
                                if (string2.equals("ON")) {
                                    i3 = 1;
                                } else if (string2.equals("OFF")) {
                                    i3 = 2;
                                } else if (!string2.equals("NOT_SPECIFIED")) {
                                    xq0.x("No enum constant ru.yandex.music.url.schemes.UrlPlay.DeeplinkLyricsMode.".concat(string2));
                                }
                                int i6 = i3;
                                if (z) {
                                    return new xpt(true, valueOf2, string3, i5, valueOf, z2, string5, i6);
                                }
                            } else {
                                jj4.j("Name is null");
                            }
                            i3 = 0;
                            int i62 = i3;
                            if (z) {
                            }
                        }
                        i3 = 3;
                        int i622 = i3;
                        if (z) {
                        }
                    }
                    valueOf = null;
                    String string52 = bundle.getString("url.play.play.alice.session.id", null);
                    boolean z22 = bundle.getBoolean("url.play.play.open.player");
                    string2 = bundle.getString("url.play.play.lyrics.mode");
                    if (string2 != null) {
                    }
                    i3 = 3;
                    int i6222 = i3;
                    if (z) {
                    }
                } else {
                    jj4.j("Name is null");
                }
            }
            i2 = 0;
            int i52 = i2;
            string = bundle.getString("url.play.play.repeat.mode");
            if (string != null) {
            }
            valueOf = null;
            String string522 = bundle.getString("url.play.play.alice.session.id", null);
            boolean z222 = bundle.getBoolean("url.play.play.open.player");
            string2 = bundle.getString("url.play.play.lyrics.mode");
            if (string2 != null) {
            }
            i3 = 3;
            int i62222 = i3;
            if (z) {
            }
        }
        return i;
    }
}
