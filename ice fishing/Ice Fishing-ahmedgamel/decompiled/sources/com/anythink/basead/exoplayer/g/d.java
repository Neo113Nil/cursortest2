package com.anythink.basead.exoplayer.g;

import com.anythink.basead.exoplayer.k.o;
import com.anythink.basead.exoplayer.m;

/* loaded from: classes.dex */
public interface d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f8165a = new d() { // from class: com.anythink.basead.exoplayer.g.d.1
        @Override // com.anythink.basead.exoplayer.g.d
        public final boolean a(m mVar) {
            String str = mVar.f9451h;
            return o.f9226V.equals(str) || o.ai.equals(str) || o.ag.equals(str);
        }

        @Override // com.anythink.basead.exoplayer.g.d
        public final b b(m mVar) {
            String str = mVar.f9451h;
            str.getClass();
            switch (str) {
                case "application/id3":
                    return new com.anythink.basead.exoplayer.g.b.g();
                case "application/x-emsg":
                    return new com.anythink.basead.exoplayer.g.a.b();
                case "application/x-scte35":
                    return new com.anythink.basead.exoplayer.g.c.c();
                default:
                    throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
            }
        }
    };

    boolean a(m mVar);

    b b(m mVar);
}
