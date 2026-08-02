package com.anythink.basead.exoplayer.e;

import com.anythink.basead.exoplayer.g.a;
import com.anythink.basead.exoplayer.g.b.g;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    private static final String f7956d = "com.apple.iTunes";

    /* renamed from: e, reason: collision with root package name */
    private static final String f7957e = "iTunSMPB";

    /* renamed from: b, reason: collision with root package name */
    public int f7959b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f7960c = -1;

    /* renamed from: a, reason: collision with root package name */
    public static final g.a f7955a = new g.a() { // from class: com.anythink.basead.exoplayer.e.i.1
        @Override // com.anythink.basead.exoplayer.g.b.g.a
        public final boolean a(int i, int i4, int i6, int i9, int i10) {
            if (i4 == 67 && i6 == 79 && i9 == 77) {
                return i10 == 77 || i == 2;
            }
            return false;
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f7958f = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    private boolean a(int i) {
        int i4 = i >> 12;
        int i6 = i & 4095;
        if (i4 <= 0 && i6 <= 0) {
            return false;
        }
        this.f7959b = i4;
        this.f7960c = i6;
        return true;
    }

    public final boolean a(com.anythink.basead.exoplayer.g.a aVar) {
        for (int i = 0; i < aVar.a(); i++) {
            a.InterfaceC0025a a9 = aVar.a(i);
            if (a9 instanceof com.anythink.basead.exoplayer.g.b.e) {
                com.anythink.basead.exoplayer.g.b.e eVar = (com.anythink.basead.exoplayer.g.b.e) a9;
                if (f7957e.equals(eVar.f8086c) && a(eVar.f8087d)) {
                    return true;
                }
            } else if (a9 instanceof com.anythink.basead.exoplayer.g.b.i) {
                com.anythink.basead.exoplayer.g.b.i iVar = (com.anythink.basead.exoplayer.g.b.i) a9;
                if (f7956d.equals(iVar.f8114b) && f7957e.equals(iVar.f8115c) && a(iVar.f8116d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private boolean a(String str) {
        Matcher matcher = f7958f.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt(matcher.group(1), 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f7959b = parseInt;
            this.f7960c = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean a() {
        return (this.f7959b == -1 || this.f7960c == -1) ? false : true;
    }
}
