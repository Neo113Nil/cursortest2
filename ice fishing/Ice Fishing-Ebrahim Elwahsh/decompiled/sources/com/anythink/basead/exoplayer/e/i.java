package com.anythink.basead.exoplayer.e;

import com.anythink.basead.exoplayer.g.a;
import com.anythink.basead.exoplayer.g.b.g;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    private static final String f7327d = "com.apple.iTunes";

    /* renamed from: e, reason: collision with root package name */
    private static final String f7328e = "iTunSMPB";

    /* renamed from: b, reason: collision with root package name */
    public int f7330b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f7331c = -1;

    /* renamed from: a, reason: collision with root package name */
    public static final g.a f7326a = new g.a() { // from class: com.anythink.basead.exoplayer.e.i.1
        @Override // com.anythink.basead.exoplayer.g.b.g.a
        public final boolean a(int i, int i4, int i9, int i10, int i11) {
            if (i4 == 67 && i9 == 79 && i10 == 77) {
                return i11 == 77 || i == 2;
            }
            return false;
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f7329f = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    private boolean a(int i) {
        int i4 = i >> 12;
        int i9 = i & 4095;
        if (i4 <= 0 && i9 <= 0) {
            return false;
        }
        this.f7330b = i4;
        this.f7331c = i9;
        return true;
    }

    public final boolean a(com.anythink.basead.exoplayer.g.a aVar) {
        for (int i = 0; i < aVar.a(); i++) {
            a.InterfaceC0024a a9 = aVar.a(i);
            if (a9 instanceof com.anythink.basead.exoplayer.g.b.e) {
                com.anythink.basead.exoplayer.g.b.e eVar = (com.anythink.basead.exoplayer.g.b.e) a9;
                if (f7328e.equals(eVar.f7457c) && a(eVar.f7458d)) {
                    return true;
                }
            } else if (a9 instanceof com.anythink.basead.exoplayer.g.b.i) {
                com.anythink.basead.exoplayer.g.b.i iVar = (com.anythink.basead.exoplayer.g.b.i) a9;
                if (f7327d.equals(iVar.f7485b) && f7328e.equals(iVar.f7486c) && a(iVar.f7487d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private boolean a(String str) {
        Matcher matcher = f7329f.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt(matcher.group(1), 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f7330b = parseInt;
            this.f7331c = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean a() {
        return (this.f7330b == -1 || this.f7331c == -1) ? false : true;
    }
}
